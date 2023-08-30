// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package guardduty

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a resource to manage a GuardDuty PublishingDestination. Requires an existing GuardDuty Detector.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"fmt"
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws"
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/guardduty"
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/iam"
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/kms"
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/s3"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			currentCallerIdentity, err := aws.GetCallerIdentity(ctx, nil, nil)
//			if err != nil {
//				return err
//			}
//			currentRegion, err := aws.GetRegion(ctx, nil, nil)
//			if err != nil {
//				return err
//			}
//			gdBucket, err := s3.NewBucketV2(ctx, "gdBucket", &s3.BucketV2Args{
//				ForceDestroy: pulumi.Bool(true),
//			})
//			if err != nil {
//				return err
//			}
//			bucketPol := iam.GetPolicyDocumentOutput(ctx, iam.GetPolicyDocumentOutputArgs{
//				Statements: iam.GetPolicyDocumentStatementArray{
//					&iam.GetPolicyDocumentStatementArgs{
//						Sid: pulumi.String("Allow PutObject"),
//						Actions: pulumi.StringArray{
//							pulumi.String("s3:PutObject"),
//						},
//						Resources: pulumi.StringArray{
//							gdBucket.Arn.ApplyT(func(arn string) (string, error) {
//								return fmt.Sprintf("%v/*", arn), nil
//							}).(pulumi.StringOutput),
//						},
//						Principals: iam.GetPolicyDocumentStatementPrincipalArray{
//							&iam.GetPolicyDocumentStatementPrincipalArgs{
//								Type: pulumi.String("Service"),
//								Identifiers: pulumi.StringArray{
//									pulumi.String("guardduty.amazonaws.com"),
//								},
//							},
//						},
//					},
//					&iam.GetPolicyDocumentStatementArgs{
//						Sid: pulumi.String("Allow GetBucketLocation"),
//						Actions: pulumi.StringArray{
//							pulumi.String("s3:GetBucketLocation"),
//						},
//						Resources: pulumi.StringArray{
//							gdBucket.Arn,
//						},
//						Principals: iam.GetPolicyDocumentStatementPrincipalArray{
//							&iam.GetPolicyDocumentStatementPrincipalArgs{
//								Type: pulumi.String("Service"),
//								Identifiers: pulumi.StringArray{
//									pulumi.String("guardduty.amazonaws.com"),
//								},
//							},
//						},
//					},
//				},
//			}, nil)
//			kmsPol, err := iam.GetPolicyDocument(ctx, &iam.GetPolicyDocumentArgs{
//				Statements: []iam.GetPolicyDocumentStatement{
//					{
//						Sid: pulumi.StringRef("Allow GuardDuty to encrypt findings"),
//						Actions: []string{
//							"kms:GenerateDataKey",
//						},
//						Resources: []string{
//							fmt.Sprintf("arn:aws:kms:%v:%v:key/*", currentRegion.Name, currentCallerIdentity.AccountId),
//						},
//						Principals: []iam.GetPolicyDocumentStatementPrincipal{
//							{
//								Type: "Service",
//								Identifiers: []string{
//									"guardduty.amazonaws.com",
//								},
//							},
//						},
//					},
//					{
//						Sid: pulumi.StringRef("Allow all users to modify/delete key (test only)"),
//						Actions: []string{
//							"kms:*",
//						},
//						Resources: []string{
//							fmt.Sprintf("arn:aws:kms:%v:%v:key/*", currentRegion.Name, currentCallerIdentity.AccountId),
//						},
//						Principals: []iam.GetPolicyDocumentStatementPrincipal{
//							{
//								Type: "AWS",
//								Identifiers: []string{
//									fmt.Sprintf("arn:aws:iam::%v:root", currentCallerIdentity.AccountId),
//								},
//							},
//						},
//					},
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			testGd, err := guardduty.NewDetector(ctx, "testGd", &guardduty.DetectorArgs{
//				Enable: pulumi.Bool(true),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = s3.NewBucketAclV2(ctx, "gdBucketAcl", &s3.BucketAclV2Args{
//				Bucket: gdBucket.ID(),
//				Acl:    pulumi.String("private"),
//			})
//			if err != nil {
//				return err
//			}
//			gdBucketPolicy, err := s3.NewBucketPolicy(ctx, "gdBucketPolicy", &s3.BucketPolicyArgs{
//				Bucket: gdBucket.ID(),
//				Policy: bucketPol.ApplyT(func(bucketPol iam.GetPolicyDocumentResult) (*string, error) {
//					return &bucketPol.Json, nil
//				}).(pulumi.StringPtrOutput),
//			})
//			if err != nil {
//				return err
//			}
//			gdKey, err := kms.NewKey(ctx, "gdKey", &kms.KeyArgs{
//				Description:          pulumi.String("Temporary key for AccTest of TF"),
//				DeletionWindowInDays: pulumi.Int(7),
//				Policy:               *pulumi.String(kmsPol.Json),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = guardduty.NewPublishingDestination(ctx, "test", &guardduty.PublishingDestinationArgs{
//				DetectorId:     testGd.ID(),
//				DestinationArn: gdBucket.Arn,
//				KmsKeyArn:      gdKey.Arn,
//			}, pulumi.DependsOn([]pulumi.Resource{
//				gdBucketPolicy,
//			}))
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// > **Note:** Please do not use this simple example for Bucket-Policy and KMS Key Policy in a production environment. It is much too open for such a use-case. Refer to the AWS documentation here: https://docs.aws.amazon.com/guardduty/latest/ug/guardduty_exportfindings.html
//
// ## Import
//
// Using `pulumi import`, import GuardDuty PublishingDestination using the master GuardDuty detector ID and PublishingDestinationID. For example:
//
// ```sh
//
//	$ pulumi import aws:guardduty/publishingDestination:PublishingDestination test a4b86f26fa42e7e7cf0d1c333ea77777:a4b86f27a0e464e4a7e0516d242f1234
//
// ```
type PublishingDestination struct {
	pulumi.CustomResourceState

	// The bucket arn and prefix under which the findings get exported. Bucket-ARN is required, the prefix is optional and will be `AWSLogs/[Account-ID]/GuardDuty/[Region]/` if not provided
	DestinationArn pulumi.StringOutput `pulumi:"destinationArn"`
	// Currently there is only "S3" available as destination type which is also the default value
	//
	// > **Note:** In case of missing permissions (S3 Bucket Policy _or_ KMS Key permissions) the resource will fail to create. If the permissions are changed after resource creation, this can be asked from the AWS API via the "DescribePublishingDestination" call (https://docs.aws.amazon.com/cli/latest/reference/guardduty/describe-publishing-destination.html).
	DestinationType pulumi.StringPtrOutput `pulumi:"destinationType"`
	// The detector ID of the GuardDuty.
	DetectorId pulumi.StringOutput `pulumi:"detectorId"`
	// The ARN of the KMS key used to encrypt GuardDuty findings. GuardDuty enforces this to be encrypted.
	KmsKeyArn pulumi.StringOutput `pulumi:"kmsKeyArn"`
}

// NewPublishingDestination registers a new resource with the given unique name, arguments, and options.
func NewPublishingDestination(ctx *pulumi.Context,
	name string, args *PublishingDestinationArgs, opts ...pulumi.ResourceOption) (*PublishingDestination, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.DestinationArn == nil {
		return nil, errors.New("invalid value for required argument 'DestinationArn'")
	}
	if args.DetectorId == nil {
		return nil, errors.New("invalid value for required argument 'DetectorId'")
	}
	if args.KmsKeyArn == nil {
		return nil, errors.New("invalid value for required argument 'KmsKeyArn'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource PublishingDestination
	err := ctx.RegisterResource("aws:guardduty/publishingDestination:PublishingDestination", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetPublishingDestination gets an existing PublishingDestination resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetPublishingDestination(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *PublishingDestinationState, opts ...pulumi.ResourceOption) (*PublishingDestination, error) {
	var resource PublishingDestination
	err := ctx.ReadResource("aws:guardduty/publishingDestination:PublishingDestination", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering PublishingDestination resources.
type publishingDestinationState struct {
	// The bucket arn and prefix under which the findings get exported. Bucket-ARN is required, the prefix is optional and will be `AWSLogs/[Account-ID]/GuardDuty/[Region]/` if not provided
	DestinationArn *string `pulumi:"destinationArn"`
	// Currently there is only "S3" available as destination type which is also the default value
	//
	// > **Note:** In case of missing permissions (S3 Bucket Policy _or_ KMS Key permissions) the resource will fail to create. If the permissions are changed after resource creation, this can be asked from the AWS API via the "DescribePublishingDestination" call (https://docs.aws.amazon.com/cli/latest/reference/guardduty/describe-publishing-destination.html).
	DestinationType *string `pulumi:"destinationType"`
	// The detector ID of the GuardDuty.
	DetectorId *string `pulumi:"detectorId"`
	// The ARN of the KMS key used to encrypt GuardDuty findings. GuardDuty enforces this to be encrypted.
	KmsKeyArn *string `pulumi:"kmsKeyArn"`
}

type PublishingDestinationState struct {
	// The bucket arn and prefix under which the findings get exported. Bucket-ARN is required, the prefix is optional and will be `AWSLogs/[Account-ID]/GuardDuty/[Region]/` if not provided
	DestinationArn pulumi.StringPtrInput
	// Currently there is only "S3" available as destination type which is also the default value
	//
	// > **Note:** In case of missing permissions (S3 Bucket Policy _or_ KMS Key permissions) the resource will fail to create. If the permissions are changed after resource creation, this can be asked from the AWS API via the "DescribePublishingDestination" call (https://docs.aws.amazon.com/cli/latest/reference/guardduty/describe-publishing-destination.html).
	DestinationType pulumi.StringPtrInput
	// The detector ID of the GuardDuty.
	DetectorId pulumi.StringPtrInput
	// The ARN of the KMS key used to encrypt GuardDuty findings. GuardDuty enforces this to be encrypted.
	KmsKeyArn pulumi.StringPtrInput
}

func (PublishingDestinationState) ElementType() reflect.Type {
	return reflect.TypeOf((*publishingDestinationState)(nil)).Elem()
}

type publishingDestinationArgs struct {
	// The bucket arn and prefix under which the findings get exported. Bucket-ARN is required, the prefix is optional and will be `AWSLogs/[Account-ID]/GuardDuty/[Region]/` if not provided
	DestinationArn string `pulumi:"destinationArn"`
	// Currently there is only "S3" available as destination type which is also the default value
	//
	// > **Note:** In case of missing permissions (S3 Bucket Policy _or_ KMS Key permissions) the resource will fail to create. If the permissions are changed after resource creation, this can be asked from the AWS API via the "DescribePublishingDestination" call (https://docs.aws.amazon.com/cli/latest/reference/guardduty/describe-publishing-destination.html).
	DestinationType *string `pulumi:"destinationType"`
	// The detector ID of the GuardDuty.
	DetectorId string `pulumi:"detectorId"`
	// The ARN of the KMS key used to encrypt GuardDuty findings. GuardDuty enforces this to be encrypted.
	KmsKeyArn string `pulumi:"kmsKeyArn"`
}

// The set of arguments for constructing a PublishingDestination resource.
type PublishingDestinationArgs struct {
	// The bucket arn and prefix under which the findings get exported. Bucket-ARN is required, the prefix is optional and will be `AWSLogs/[Account-ID]/GuardDuty/[Region]/` if not provided
	DestinationArn pulumi.StringInput
	// Currently there is only "S3" available as destination type which is also the default value
	//
	// > **Note:** In case of missing permissions (S3 Bucket Policy _or_ KMS Key permissions) the resource will fail to create. If the permissions are changed after resource creation, this can be asked from the AWS API via the "DescribePublishingDestination" call (https://docs.aws.amazon.com/cli/latest/reference/guardduty/describe-publishing-destination.html).
	DestinationType pulumi.StringPtrInput
	// The detector ID of the GuardDuty.
	DetectorId pulumi.StringInput
	// The ARN of the KMS key used to encrypt GuardDuty findings. GuardDuty enforces this to be encrypted.
	KmsKeyArn pulumi.StringInput
}

func (PublishingDestinationArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*publishingDestinationArgs)(nil)).Elem()
}

type PublishingDestinationInput interface {
	pulumi.Input

	ToPublishingDestinationOutput() PublishingDestinationOutput
	ToPublishingDestinationOutputWithContext(ctx context.Context) PublishingDestinationOutput
}

func (*PublishingDestination) ElementType() reflect.Type {
	return reflect.TypeOf((**PublishingDestination)(nil)).Elem()
}

func (i *PublishingDestination) ToPublishingDestinationOutput() PublishingDestinationOutput {
	return i.ToPublishingDestinationOutputWithContext(context.Background())
}

func (i *PublishingDestination) ToPublishingDestinationOutputWithContext(ctx context.Context) PublishingDestinationOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PublishingDestinationOutput)
}

// PublishingDestinationArrayInput is an input type that accepts PublishingDestinationArray and PublishingDestinationArrayOutput values.
// You can construct a concrete instance of `PublishingDestinationArrayInput` via:
//
//	PublishingDestinationArray{ PublishingDestinationArgs{...} }
type PublishingDestinationArrayInput interface {
	pulumi.Input

	ToPublishingDestinationArrayOutput() PublishingDestinationArrayOutput
	ToPublishingDestinationArrayOutputWithContext(context.Context) PublishingDestinationArrayOutput
}

type PublishingDestinationArray []PublishingDestinationInput

func (PublishingDestinationArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*PublishingDestination)(nil)).Elem()
}

func (i PublishingDestinationArray) ToPublishingDestinationArrayOutput() PublishingDestinationArrayOutput {
	return i.ToPublishingDestinationArrayOutputWithContext(context.Background())
}

func (i PublishingDestinationArray) ToPublishingDestinationArrayOutputWithContext(ctx context.Context) PublishingDestinationArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PublishingDestinationArrayOutput)
}

// PublishingDestinationMapInput is an input type that accepts PublishingDestinationMap and PublishingDestinationMapOutput values.
// You can construct a concrete instance of `PublishingDestinationMapInput` via:
//
//	PublishingDestinationMap{ "key": PublishingDestinationArgs{...} }
type PublishingDestinationMapInput interface {
	pulumi.Input

	ToPublishingDestinationMapOutput() PublishingDestinationMapOutput
	ToPublishingDestinationMapOutputWithContext(context.Context) PublishingDestinationMapOutput
}

type PublishingDestinationMap map[string]PublishingDestinationInput

func (PublishingDestinationMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*PublishingDestination)(nil)).Elem()
}

func (i PublishingDestinationMap) ToPublishingDestinationMapOutput() PublishingDestinationMapOutput {
	return i.ToPublishingDestinationMapOutputWithContext(context.Background())
}

func (i PublishingDestinationMap) ToPublishingDestinationMapOutputWithContext(ctx context.Context) PublishingDestinationMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PublishingDestinationMapOutput)
}

type PublishingDestinationOutput struct{ *pulumi.OutputState }

func (PublishingDestinationOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**PublishingDestination)(nil)).Elem()
}

func (o PublishingDestinationOutput) ToPublishingDestinationOutput() PublishingDestinationOutput {
	return o
}

func (o PublishingDestinationOutput) ToPublishingDestinationOutputWithContext(ctx context.Context) PublishingDestinationOutput {
	return o
}

// The bucket arn and prefix under which the findings get exported. Bucket-ARN is required, the prefix is optional and will be `AWSLogs/[Account-ID]/GuardDuty/[Region]/` if not provided
func (o PublishingDestinationOutput) DestinationArn() pulumi.StringOutput {
	return o.ApplyT(func(v *PublishingDestination) pulumi.StringOutput { return v.DestinationArn }).(pulumi.StringOutput)
}

// Currently there is only "S3" available as destination type which is also the default value
//
// > **Note:** In case of missing permissions (S3 Bucket Policy _or_ KMS Key permissions) the resource will fail to create. If the permissions are changed after resource creation, this can be asked from the AWS API via the "DescribePublishingDestination" call (https://docs.aws.amazon.com/cli/latest/reference/guardduty/describe-publishing-destination.html).
func (o PublishingDestinationOutput) DestinationType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *PublishingDestination) pulumi.StringPtrOutput { return v.DestinationType }).(pulumi.StringPtrOutput)
}

// The detector ID of the GuardDuty.
func (o PublishingDestinationOutput) DetectorId() pulumi.StringOutput {
	return o.ApplyT(func(v *PublishingDestination) pulumi.StringOutput { return v.DetectorId }).(pulumi.StringOutput)
}

// The ARN of the KMS key used to encrypt GuardDuty findings. GuardDuty enforces this to be encrypted.
func (o PublishingDestinationOutput) KmsKeyArn() pulumi.StringOutput {
	return o.ApplyT(func(v *PublishingDestination) pulumi.StringOutput { return v.KmsKeyArn }).(pulumi.StringOutput)
}

type PublishingDestinationArrayOutput struct{ *pulumi.OutputState }

func (PublishingDestinationArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*PublishingDestination)(nil)).Elem()
}

func (o PublishingDestinationArrayOutput) ToPublishingDestinationArrayOutput() PublishingDestinationArrayOutput {
	return o
}

func (o PublishingDestinationArrayOutput) ToPublishingDestinationArrayOutputWithContext(ctx context.Context) PublishingDestinationArrayOutput {
	return o
}

func (o PublishingDestinationArrayOutput) Index(i pulumi.IntInput) PublishingDestinationOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *PublishingDestination {
		return vs[0].([]*PublishingDestination)[vs[1].(int)]
	}).(PublishingDestinationOutput)
}

type PublishingDestinationMapOutput struct{ *pulumi.OutputState }

func (PublishingDestinationMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*PublishingDestination)(nil)).Elem()
}

func (o PublishingDestinationMapOutput) ToPublishingDestinationMapOutput() PublishingDestinationMapOutput {
	return o
}

func (o PublishingDestinationMapOutput) ToPublishingDestinationMapOutputWithContext(ctx context.Context) PublishingDestinationMapOutput {
	return o
}

func (o PublishingDestinationMapOutput) MapIndex(k pulumi.StringInput) PublishingDestinationOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *PublishingDestination {
		return vs[0].(map[string]*PublishingDestination)[vs[1].(string)]
	}).(PublishingDestinationOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*PublishingDestinationInput)(nil)).Elem(), &PublishingDestination{})
	pulumi.RegisterInputType(reflect.TypeOf((*PublishingDestinationArrayInput)(nil)).Elem(), PublishingDestinationArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*PublishingDestinationMapInput)(nil)).Elem(), PublishingDestinationMap{})
	pulumi.RegisterOutputType(PublishingDestinationOutput{})
	pulumi.RegisterOutputType(PublishingDestinationArrayOutput{})
	pulumi.RegisterOutputType(PublishingDestinationMapOutput{})
}

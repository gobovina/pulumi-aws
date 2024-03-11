// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package s3

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides an independent configuration resource for S3 bucket [replication configuration](http://docs.aws.amazon.com/AmazonS3/latest/dev/crr.html).
//
// > **NOTE:** S3 Buckets only support a single replication configuration. Declaring multiple `s3.BucketReplicationConfig` resources to the same S3 Bucket will cause a perpetual difference in configuration.
//
// > This resource cannot be used with S3 directory buckets.
//
// ## Example Usage
//
// ### Using replication configuration
//
// <!--Start PulumiCodeChooser -->
// ```go
// package main
//
// import (
//
//	"fmt"
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/iam"
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/s3"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			assumeRole, err := iam.GetPolicyDocument(ctx, &iam.GetPolicyDocumentArgs{
//				Statements: []iam.GetPolicyDocumentStatement{
//					{
//						Effect: pulumi.StringRef("Allow"),
//						Principals: []iam.GetPolicyDocumentStatementPrincipal{
//							{
//								Type: "Service",
//								Identifiers: []string{
//									"s3.amazonaws.com",
//								},
//							},
//						},
//						Actions: []string{
//							"sts:AssumeRole",
//						},
//					},
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			replicationRole, err := iam.NewRole(ctx, "replication", &iam.RoleArgs{
//				Name:             pulumi.String("tf-iam-role-replication-12345"),
//				AssumeRolePolicy: *pulumi.String(assumeRole.Json),
//			})
//			if err != nil {
//				return err
//			}
//			destination, err := s3.NewBucketV2(ctx, "destination", &s3.BucketV2Args{
//				Bucket: pulumi.String("tf-test-bucket-destination-12345"),
//			})
//			if err != nil {
//				return err
//			}
//			source, err := s3.NewBucketV2(ctx, "source", &s3.BucketV2Args{
//				Bucket: pulumi.String("tf-test-bucket-source-12345"),
//			})
//			if err != nil {
//				return err
//			}
//			replication := iam.GetPolicyDocumentOutput(ctx, iam.GetPolicyDocumentOutputArgs{
//				Statements: iam.GetPolicyDocumentStatementArray{
//					&iam.GetPolicyDocumentStatementArgs{
//						Effect: pulumi.String("Allow"),
//						Actions: pulumi.StringArray{
//							pulumi.String("s3:GetReplicationConfiguration"),
//							pulumi.String("s3:ListBucket"),
//						},
//						Resources: pulumi.StringArray{
//							source.Arn,
//						},
//					},
//					&iam.GetPolicyDocumentStatementArgs{
//						Effect: pulumi.String("Allow"),
//						Actions: pulumi.StringArray{
//							pulumi.String("s3:GetObjectVersionForReplication"),
//							pulumi.String("s3:GetObjectVersionAcl"),
//							pulumi.String("s3:GetObjectVersionTagging"),
//						},
//						Resources: pulumi.StringArray{
//							source.Arn.ApplyT(func(arn string) (string, error) {
//								return fmt.Sprintf("%v/*", arn), nil
//							}).(pulumi.StringOutput),
//						},
//					},
//					&iam.GetPolicyDocumentStatementArgs{
//						Effect: pulumi.String("Allow"),
//						Actions: pulumi.StringArray{
//							pulumi.String("s3:ReplicateObject"),
//							pulumi.String("s3:ReplicateDelete"),
//							pulumi.String("s3:ReplicateTags"),
//						},
//						Resources: pulumi.StringArray{
//							destination.Arn.ApplyT(func(arn string) (string, error) {
//								return fmt.Sprintf("%v/*", arn), nil
//							}).(pulumi.StringOutput),
//						},
//					},
//				},
//			}, nil)
//			replicationPolicy, err := iam.NewPolicy(ctx, "replication", &iam.PolicyArgs{
//				Name: pulumi.String("tf-iam-role-policy-replication-12345"),
//				Policy: replication.ApplyT(func(replication iam.GetPolicyDocumentResult) (*string, error) {
//					return &replication.Json, nil
//				}).(pulumi.StringPtrOutput),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = iam.NewRolePolicyAttachment(ctx, "replication", &iam.RolePolicyAttachmentArgs{
//				Role:      replicationRole.Name,
//				PolicyArn: replicationPolicy.Arn,
//			})
//			if err != nil {
//				return err
//			}
//			_, err = s3.NewBucketVersioningV2(ctx, "destination", &s3.BucketVersioningV2Args{
//				Bucket: destination.ID(),
//				VersioningConfiguration: &s3.BucketVersioningV2VersioningConfigurationArgs{
//					Status: pulumi.String("Enabled"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = s3.NewBucketAclV2(ctx, "source_bucket_acl", &s3.BucketAclV2Args{
//				Bucket: source.ID(),
//				Acl:    pulumi.String("private"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = s3.NewBucketVersioningV2(ctx, "source", &s3.BucketVersioningV2Args{
//				Bucket: source.ID(),
//				VersioningConfiguration: &s3.BucketVersioningV2VersioningConfigurationArgs{
//					Status: pulumi.String("Enabled"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = s3.NewBucketReplicationConfig(ctx, "replication", &s3.BucketReplicationConfigArgs{
//				Role:   replicationRole.Arn,
//				Bucket: source.ID(),
//				Rules: s3.BucketReplicationConfigRuleArray{
//					&s3.BucketReplicationConfigRuleArgs{
//						Id: pulumi.String("foobar"),
//						Filter: &s3.BucketReplicationConfigRuleFilterArgs{
//							Prefix: pulumi.String("foo"),
//						},
//						Status: pulumi.String("Enabled"),
//						Destination: &s3.BucketReplicationConfigRuleDestinationArgs{
//							Bucket:       destination.Arn,
//							StorageClass: pulumi.String("STANDARD"),
//						},
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// <!--End PulumiCodeChooser -->
//
// ### Bi-Directional Replication
//
// <!--Start PulumiCodeChooser -->
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/s3"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			// ... other configuration ...
//			east, err := s3.NewBucketV2(ctx, "east", &s3.BucketV2Args{
//				Bucket: pulumi.String("tf-test-bucket-east-12345"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = s3.NewBucketVersioningV2(ctx, "east", &s3.BucketVersioningV2Args{
//				Bucket: east.ID(),
//				VersioningConfiguration: &s3.BucketVersioningV2VersioningConfigurationArgs{
//					Status: pulumi.String("Enabled"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			west, err := s3.NewBucketV2(ctx, "west", &s3.BucketV2Args{
//				Bucket: pulumi.String("tf-test-bucket-west-12345"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = s3.NewBucketVersioningV2(ctx, "west", &s3.BucketVersioningV2Args{
//				Bucket: west.ID(),
//				VersioningConfiguration: &s3.BucketVersioningV2VersioningConfigurationArgs{
//					Status: pulumi.String("Enabled"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = s3.NewBucketReplicationConfig(ctx, "east_to_west", &s3.BucketReplicationConfigArgs{
//				Role:   pulumi.Any(eastReplication.Arn),
//				Bucket: east.ID(),
//				Rules: s3.BucketReplicationConfigRuleArray{
//					&s3.BucketReplicationConfigRuleArgs{
//						Id: pulumi.String("foobar"),
//						Filter: &s3.BucketReplicationConfigRuleFilterArgs{
//							Prefix: pulumi.String("foo"),
//						},
//						Status: pulumi.String("Enabled"),
//						Destination: &s3.BucketReplicationConfigRuleDestinationArgs{
//							Bucket:       west.Arn,
//							StorageClass: pulumi.String("STANDARD"),
//						},
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = s3.NewBucketReplicationConfig(ctx, "west_to_east", &s3.BucketReplicationConfigArgs{
//				Role:   pulumi.Any(westReplication.Arn),
//				Bucket: west.ID(),
//				Rules: s3.BucketReplicationConfigRuleArray{
//					&s3.BucketReplicationConfigRuleArgs{
//						Id: pulumi.String("foobar"),
//						Filter: &s3.BucketReplicationConfigRuleFilterArgs{
//							Prefix: pulumi.String("foo"),
//						},
//						Status: pulumi.String("Enabled"),
//						Destination: &s3.BucketReplicationConfigRuleDestinationArgs{
//							Bucket:       east.Arn,
//							StorageClass: pulumi.String("STANDARD"),
//						},
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// <!--End PulumiCodeChooser -->
//
// ## Import
//
// Using `pulumi import`, import S3 bucket replication configuration using the `bucket`. For example:
//
// ```sh
// $ pulumi import aws:s3/bucketReplicationConfig:BucketReplicationConfig replication bucket-name
// ```
type BucketReplicationConfig struct {
	pulumi.CustomResourceState

	// Name of the source S3 bucket you want Amazon S3 to monitor.
	Bucket pulumi.StringOutput `pulumi:"bucket"`
	// ARN of the IAM role for Amazon S3 to assume when replicating the objects.
	Role pulumi.StringOutput `pulumi:"role"`
	// List of configuration blocks describing the rules managing the replication. See below.
	Rules BucketReplicationConfigRuleArrayOutput `pulumi:"rules"`
	// Token to allow replication to be enabled on an Object Lock-enabled bucket. You must contact AWS support for the bucket's "Object Lock token".
	// For more details, see [Using S3 Object Lock with replication](https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-lock-managing.html#object-lock-managing-replication).
	Token pulumi.StringPtrOutput `pulumi:"token"`
}

// NewBucketReplicationConfig registers a new resource with the given unique name, arguments, and options.
func NewBucketReplicationConfig(ctx *pulumi.Context,
	name string, args *BucketReplicationConfigArgs, opts ...pulumi.ResourceOption) (*BucketReplicationConfig, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Bucket == nil {
		return nil, errors.New("invalid value for required argument 'Bucket'")
	}
	if args.Role == nil {
		return nil, errors.New("invalid value for required argument 'Role'")
	}
	if args.Rules == nil {
		return nil, errors.New("invalid value for required argument 'Rules'")
	}
	if args.Token != nil {
		args.Token = pulumi.ToSecret(args.Token).(pulumi.StringPtrInput)
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"token",
	})
	opts = append(opts, secrets)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource BucketReplicationConfig
	err := ctx.RegisterResource("aws:s3/bucketReplicationConfig:BucketReplicationConfig", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetBucketReplicationConfig gets an existing BucketReplicationConfig resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetBucketReplicationConfig(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *BucketReplicationConfigState, opts ...pulumi.ResourceOption) (*BucketReplicationConfig, error) {
	var resource BucketReplicationConfig
	err := ctx.ReadResource("aws:s3/bucketReplicationConfig:BucketReplicationConfig", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering BucketReplicationConfig resources.
type bucketReplicationConfigState struct {
	// Name of the source S3 bucket you want Amazon S3 to monitor.
	Bucket *string `pulumi:"bucket"`
	// ARN of the IAM role for Amazon S3 to assume when replicating the objects.
	Role *string `pulumi:"role"`
	// List of configuration blocks describing the rules managing the replication. See below.
	Rules []BucketReplicationConfigRule `pulumi:"rules"`
	// Token to allow replication to be enabled on an Object Lock-enabled bucket. You must contact AWS support for the bucket's "Object Lock token".
	// For more details, see [Using S3 Object Lock with replication](https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-lock-managing.html#object-lock-managing-replication).
	Token *string `pulumi:"token"`
}

type BucketReplicationConfigState struct {
	// Name of the source S3 bucket you want Amazon S3 to monitor.
	Bucket pulumi.StringPtrInput
	// ARN of the IAM role for Amazon S3 to assume when replicating the objects.
	Role pulumi.StringPtrInput
	// List of configuration blocks describing the rules managing the replication. See below.
	Rules BucketReplicationConfigRuleArrayInput
	// Token to allow replication to be enabled on an Object Lock-enabled bucket. You must contact AWS support for the bucket's "Object Lock token".
	// For more details, see [Using S3 Object Lock with replication](https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-lock-managing.html#object-lock-managing-replication).
	Token pulumi.StringPtrInput
}

func (BucketReplicationConfigState) ElementType() reflect.Type {
	return reflect.TypeOf((*bucketReplicationConfigState)(nil)).Elem()
}

type bucketReplicationConfigArgs struct {
	// Name of the source S3 bucket you want Amazon S3 to monitor.
	Bucket string `pulumi:"bucket"`
	// ARN of the IAM role for Amazon S3 to assume when replicating the objects.
	Role string `pulumi:"role"`
	// List of configuration blocks describing the rules managing the replication. See below.
	Rules []BucketReplicationConfigRule `pulumi:"rules"`
	// Token to allow replication to be enabled on an Object Lock-enabled bucket. You must contact AWS support for the bucket's "Object Lock token".
	// For more details, see [Using S3 Object Lock with replication](https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-lock-managing.html#object-lock-managing-replication).
	Token *string `pulumi:"token"`
}

// The set of arguments for constructing a BucketReplicationConfig resource.
type BucketReplicationConfigArgs struct {
	// Name of the source S3 bucket you want Amazon S3 to monitor.
	Bucket pulumi.StringInput
	// ARN of the IAM role for Amazon S3 to assume when replicating the objects.
	Role pulumi.StringInput
	// List of configuration blocks describing the rules managing the replication. See below.
	Rules BucketReplicationConfigRuleArrayInput
	// Token to allow replication to be enabled on an Object Lock-enabled bucket. You must contact AWS support for the bucket's "Object Lock token".
	// For more details, see [Using S3 Object Lock with replication](https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-lock-managing.html#object-lock-managing-replication).
	Token pulumi.StringPtrInput
}

func (BucketReplicationConfigArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*bucketReplicationConfigArgs)(nil)).Elem()
}

type BucketReplicationConfigInput interface {
	pulumi.Input

	ToBucketReplicationConfigOutput() BucketReplicationConfigOutput
	ToBucketReplicationConfigOutputWithContext(ctx context.Context) BucketReplicationConfigOutput
}

func (*BucketReplicationConfig) ElementType() reflect.Type {
	return reflect.TypeOf((**BucketReplicationConfig)(nil)).Elem()
}

func (i *BucketReplicationConfig) ToBucketReplicationConfigOutput() BucketReplicationConfigOutput {
	return i.ToBucketReplicationConfigOutputWithContext(context.Background())
}

func (i *BucketReplicationConfig) ToBucketReplicationConfigOutputWithContext(ctx context.Context) BucketReplicationConfigOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BucketReplicationConfigOutput)
}

// BucketReplicationConfigArrayInput is an input type that accepts BucketReplicationConfigArray and BucketReplicationConfigArrayOutput values.
// You can construct a concrete instance of `BucketReplicationConfigArrayInput` via:
//
//	BucketReplicationConfigArray{ BucketReplicationConfigArgs{...} }
type BucketReplicationConfigArrayInput interface {
	pulumi.Input

	ToBucketReplicationConfigArrayOutput() BucketReplicationConfigArrayOutput
	ToBucketReplicationConfigArrayOutputWithContext(context.Context) BucketReplicationConfigArrayOutput
}

type BucketReplicationConfigArray []BucketReplicationConfigInput

func (BucketReplicationConfigArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*BucketReplicationConfig)(nil)).Elem()
}

func (i BucketReplicationConfigArray) ToBucketReplicationConfigArrayOutput() BucketReplicationConfigArrayOutput {
	return i.ToBucketReplicationConfigArrayOutputWithContext(context.Background())
}

func (i BucketReplicationConfigArray) ToBucketReplicationConfigArrayOutputWithContext(ctx context.Context) BucketReplicationConfigArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BucketReplicationConfigArrayOutput)
}

// BucketReplicationConfigMapInput is an input type that accepts BucketReplicationConfigMap and BucketReplicationConfigMapOutput values.
// You can construct a concrete instance of `BucketReplicationConfigMapInput` via:
//
//	BucketReplicationConfigMap{ "key": BucketReplicationConfigArgs{...} }
type BucketReplicationConfigMapInput interface {
	pulumi.Input

	ToBucketReplicationConfigMapOutput() BucketReplicationConfigMapOutput
	ToBucketReplicationConfigMapOutputWithContext(context.Context) BucketReplicationConfigMapOutput
}

type BucketReplicationConfigMap map[string]BucketReplicationConfigInput

func (BucketReplicationConfigMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*BucketReplicationConfig)(nil)).Elem()
}

func (i BucketReplicationConfigMap) ToBucketReplicationConfigMapOutput() BucketReplicationConfigMapOutput {
	return i.ToBucketReplicationConfigMapOutputWithContext(context.Background())
}

func (i BucketReplicationConfigMap) ToBucketReplicationConfigMapOutputWithContext(ctx context.Context) BucketReplicationConfigMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BucketReplicationConfigMapOutput)
}

type BucketReplicationConfigOutput struct{ *pulumi.OutputState }

func (BucketReplicationConfigOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**BucketReplicationConfig)(nil)).Elem()
}

func (o BucketReplicationConfigOutput) ToBucketReplicationConfigOutput() BucketReplicationConfigOutput {
	return o
}

func (o BucketReplicationConfigOutput) ToBucketReplicationConfigOutputWithContext(ctx context.Context) BucketReplicationConfigOutput {
	return o
}

// Name of the source S3 bucket you want Amazon S3 to monitor.
func (o BucketReplicationConfigOutput) Bucket() pulumi.StringOutput {
	return o.ApplyT(func(v *BucketReplicationConfig) pulumi.StringOutput { return v.Bucket }).(pulumi.StringOutput)
}

// ARN of the IAM role for Amazon S3 to assume when replicating the objects.
func (o BucketReplicationConfigOutput) Role() pulumi.StringOutput {
	return o.ApplyT(func(v *BucketReplicationConfig) pulumi.StringOutput { return v.Role }).(pulumi.StringOutput)
}

// List of configuration blocks describing the rules managing the replication. See below.
func (o BucketReplicationConfigOutput) Rules() BucketReplicationConfigRuleArrayOutput {
	return o.ApplyT(func(v *BucketReplicationConfig) BucketReplicationConfigRuleArrayOutput { return v.Rules }).(BucketReplicationConfigRuleArrayOutput)
}

// Token to allow replication to be enabled on an Object Lock-enabled bucket. You must contact AWS support for the bucket's "Object Lock token".
// For more details, see [Using S3 Object Lock with replication](https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-lock-managing.html#object-lock-managing-replication).
func (o BucketReplicationConfigOutput) Token() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *BucketReplicationConfig) pulumi.StringPtrOutput { return v.Token }).(pulumi.StringPtrOutput)
}

type BucketReplicationConfigArrayOutput struct{ *pulumi.OutputState }

func (BucketReplicationConfigArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*BucketReplicationConfig)(nil)).Elem()
}

func (o BucketReplicationConfigArrayOutput) ToBucketReplicationConfigArrayOutput() BucketReplicationConfigArrayOutput {
	return o
}

func (o BucketReplicationConfigArrayOutput) ToBucketReplicationConfigArrayOutputWithContext(ctx context.Context) BucketReplicationConfigArrayOutput {
	return o
}

func (o BucketReplicationConfigArrayOutput) Index(i pulumi.IntInput) BucketReplicationConfigOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *BucketReplicationConfig {
		return vs[0].([]*BucketReplicationConfig)[vs[1].(int)]
	}).(BucketReplicationConfigOutput)
}

type BucketReplicationConfigMapOutput struct{ *pulumi.OutputState }

func (BucketReplicationConfigMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*BucketReplicationConfig)(nil)).Elem()
}

func (o BucketReplicationConfigMapOutput) ToBucketReplicationConfigMapOutput() BucketReplicationConfigMapOutput {
	return o
}

func (o BucketReplicationConfigMapOutput) ToBucketReplicationConfigMapOutputWithContext(ctx context.Context) BucketReplicationConfigMapOutput {
	return o
}

func (o BucketReplicationConfigMapOutput) MapIndex(k pulumi.StringInput) BucketReplicationConfigOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *BucketReplicationConfig {
		return vs[0].(map[string]*BucketReplicationConfig)[vs[1].(string)]
	}).(BucketReplicationConfigOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*BucketReplicationConfigInput)(nil)).Elem(), &BucketReplicationConfig{})
	pulumi.RegisterInputType(reflect.TypeOf((*BucketReplicationConfigArrayInput)(nil)).Elem(), BucketReplicationConfigArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*BucketReplicationConfigMapInput)(nil)).Elem(), BucketReplicationConfigMap{})
	pulumi.RegisterOutputType(BucketReplicationConfigOutput{})
	pulumi.RegisterOutputType(BucketReplicationConfigArrayOutput{})
	pulumi.RegisterOutputType(BucketReplicationConfigMapOutput{})
}

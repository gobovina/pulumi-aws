// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cloudwatch

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Generates a CloudWatch Log Group Data Protection Policy document in JSON format for use with the `cloudwatch.LogDataProtectionPolicy` resource.
//
// > For more information about data protection policies, see the [Help protect sensitive log data with masking](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/mask-sensitive-log-data.html).
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/cloudwatch"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			example, err := cloudwatch.GetLogDataProtectionPolicyDocument(ctx, &cloudwatch.GetLogDataProtectionPolicyDocumentArgs{
//				Name: "Example",
//				Statements: []cloudwatch.GetLogDataProtectionPolicyDocumentStatement{
//					{
//						Sid: pulumi.StringRef("Audit"),
//						DataIdentifiers: []string{
//							"arn:aws:dataprotection::aws:data-identifier/EmailAddress",
//							"arn:aws:dataprotection::aws:data-identifier/DriversLicense-US",
//						},
//						Operation: {
//							Audit: {
//								FindingsDestination: {
//									CloudwatchLogs: {
//										LogGroup: audit.Name,
//									},
//									Firehose: {
//										DeliveryStream: auditAwsKinesisFirehoseDeliveryStream.Name,
//									},
//									S3: {
//										Bucket: auditAwsS3Bucket.Bucket,
//									},
//								},
//							},
//						},
//					},
//					{
//						Sid: pulumi.StringRef("Deidentify"),
//						DataIdentifiers: []string{
//							"arn:aws:dataprotection::aws:data-identifier/EmailAddress",
//							"arn:aws:dataprotection::aws:data-identifier/DriversLicense-US",
//						},
//						Operation: {
//							Deidentify: {
//								MaskConfig: nil,
//							},
//						},
//					},
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = cloudwatch.NewLogDataProtectionPolicy(ctx, "example", &cloudwatch.LogDataProtectionPolicyArgs{
//				LogGroupName:   pulumi.Any(exampleAwsCloudwatchLogGroup.Name),
//				PolicyDocument: *pulumi.String(example.Json),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func GetLogDataProtectionPolicyDocument(ctx *pulumi.Context, args *GetLogDataProtectionPolicyDocumentArgs, opts ...pulumi.InvokeOption) (*GetLogDataProtectionPolicyDocumentResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetLogDataProtectionPolicyDocumentResult
	err := ctx.Invoke("aws:cloudwatch/getLogDataProtectionPolicyDocument:getLogDataProtectionPolicyDocument", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getLogDataProtectionPolicyDocument.
type GetLogDataProtectionPolicyDocumentArgs struct {
	Description *string `pulumi:"description"`
	// The name of the data protection policy document.
	Name string `pulumi:"name"`
	// Configures the data protection policy.
	//
	// > There must be exactly two statements: the first with an `audit` operation, and the second with a `deidentify` operation.
	//
	// The following arguments are optional:
	Statements []GetLogDataProtectionPolicyDocumentStatement `pulumi:"statements"`
	Version    *string                                       `pulumi:"version"`
}

// A collection of values returned by getLogDataProtectionPolicyDocument.
type GetLogDataProtectionPolicyDocumentResult struct {
	Description *string `pulumi:"description"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Standard JSON policy document rendered based on the arguments above.
	Json       string                                        `pulumi:"json"`
	Name       string                                        `pulumi:"name"`
	Statements []GetLogDataProtectionPolicyDocumentStatement `pulumi:"statements"`
	Version    *string                                       `pulumi:"version"`
}

func GetLogDataProtectionPolicyDocumentOutput(ctx *pulumi.Context, args GetLogDataProtectionPolicyDocumentOutputArgs, opts ...pulumi.InvokeOption) GetLogDataProtectionPolicyDocumentResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetLogDataProtectionPolicyDocumentResult, error) {
			args := v.(GetLogDataProtectionPolicyDocumentArgs)
			r, err := GetLogDataProtectionPolicyDocument(ctx, &args, opts...)
			var s GetLogDataProtectionPolicyDocumentResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetLogDataProtectionPolicyDocumentResultOutput)
}

// A collection of arguments for invoking getLogDataProtectionPolicyDocument.
type GetLogDataProtectionPolicyDocumentOutputArgs struct {
	Description pulumi.StringPtrInput `pulumi:"description"`
	// The name of the data protection policy document.
	Name pulumi.StringInput `pulumi:"name"`
	// Configures the data protection policy.
	//
	// > There must be exactly two statements: the first with an `audit` operation, and the second with a `deidentify` operation.
	//
	// The following arguments are optional:
	Statements GetLogDataProtectionPolicyDocumentStatementArrayInput `pulumi:"statements"`
	Version    pulumi.StringPtrInput                                 `pulumi:"version"`
}

func (GetLogDataProtectionPolicyDocumentOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetLogDataProtectionPolicyDocumentArgs)(nil)).Elem()
}

// A collection of values returned by getLogDataProtectionPolicyDocument.
type GetLogDataProtectionPolicyDocumentResultOutput struct{ *pulumi.OutputState }

func (GetLogDataProtectionPolicyDocumentResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetLogDataProtectionPolicyDocumentResult)(nil)).Elem()
}

func (o GetLogDataProtectionPolicyDocumentResultOutput) ToGetLogDataProtectionPolicyDocumentResultOutput() GetLogDataProtectionPolicyDocumentResultOutput {
	return o
}

func (o GetLogDataProtectionPolicyDocumentResultOutput) ToGetLogDataProtectionPolicyDocumentResultOutputWithContext(ctx context.Context) GetLogDataProtectionPolicyDocumentResultOutput {
	return o
}

func (o GetLogDataProtectionPolicyDocumentResultOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetLogDataProtectionPolicyDocumentResult) *string { return v.Description }).(pulumi.StringPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetLogDataProtectionPolicyDocumentResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetLogDataProtectionPolicyDocumentResult) string { return v.Id }).(pulumi.StringOutput)
}

// Standard JSON policy document rendered based on the arguments above.
func (o GetLogDataProtectionPolicyDocumentResultOutput) Json() pulumi.StringOutput {
	return o.ApplyT(func(v GetLogDataProtectionPolicyDocumentResult) string { return v.Json }).(pulumi.StringOutput)
}

func (o GetLogDataProtectionPolicyDocumentResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v GetLogDataProtectionPolicyDocumentResult) string { return v.Name }).(pulumi.StringOutput)
}

func (o GetLogDataProtectionPolicyDocumentResultOutput) Statements() GetLogDataProtectionPolicyDocumentStatementArrayOutput {
	return o.ApplyT(func(v GetLogDataProtectionPolicyDocumentResult) []GetLogDataProtectionPolicyDocumentStatement {
		return v.Statements
	}).(GetLogDataProtectionPolicyDocumentStatementArrayOutput)
}

func (o GetLogDataProtectionPolicyDocumentResultOutput) Version() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetLogDataProtectionPolicyDocumentResult) *string { return v.Version }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetLogDataProtectionPolicyDocumentResultOutput{})
}

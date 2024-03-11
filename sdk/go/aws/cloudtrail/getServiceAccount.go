// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cloudtrail

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to get the Account ID of the [AWS CloudTrail Service Account](http://docs.aws.amazon.com/awscloudtrail/latest/userguide/cloudtrail-supported-regions.html)
// in a given region for the purpose of allowing CloudTrail to store trail data in S3.
//
// > **Note:** AWS documentation [states that](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/create-s3-bucket-policy-for-cloudtrail.html#troubleshooting-s3-bucket-policy) a [service principal name](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_principal.html#principal-services) should be used instead of an AWS account ID in any relevant IAM policy.
//
// ## Example Usage
//
// <!--Start PulumiCodeChooser -->
// ```go
// package main
//
// import (
//
//	"fmt"
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/cloudtrail"
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/iam"
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/s3"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
// func main() {
// pulumi.Run(func(ctx *pulumi.Context) error {
// main, err := cloudtrail.GetServiceAccount(ctx, nil, nil);
// if err != nil {
// return err
// }
// bucket, err := s3.NewBucketV2(ctx, "bucket", &s3.BucketV2Args{
// Bucket: pulumi.String("tf-cloudtrail-logging-test-bucket"),
// ForceDestroy: pulumi.Bool(true),
// })
// if err != nil {
// return err
// }
// allowCloudtrailLogging := pulumi.All(bucket.Arn,bucket.Arn).ApplyT(func(_args []interface{}) (iam.GetPolicyDocumentResult, error) {
// bucketArn := _args[0].(string)
// bucketArn1 := _args[1].(string)
// return iam.GetPolicyDocumentOutput(ctx, iam.GetPolicyDocumentOutputArgs{
// Statements: []iam.GetPolicyDocumentStatement{
// {
// Sid: "Put bucket policy needed for trails",
// Effect: "Allow",
// Principals: []iam.GetPolicyDocumentStatementPrincipal{
// {
// Type: "AWS",
// Identifiers: interface{}{
// main.Arn,
// },
// },
// },
// Actions: []string{
// "s3:PutObject",
// },
// Resources: []string{
// fmt.Sprintf("%v/*", bucketArn),
// },
// },
// {
// Sid: "Get bucket policy needed for trails",
// Effect: "Allow",
// Principals: []iam.GetPolicyDocumentStatementPrincipal{
// {
// Type: "AWS",
// Identifiers: interface{}{
// main.Arn,
// },
// },
// },
// Actions: []string{
// "s3:GetBucketAcl",
// },
// Resources: []string{
// bucketArn1,
// },
// },
// },
// }, nil), nil
// }).(iam.GetPolicyDocumentResultOutput)
// _, err = s3.NewBucketPolicy(ctx, "allow_cloudtrail_logging", &s3.BucketPolicyArgs{
// Bucket: bucket.ID(),
// Policy: allowCloudtrailLogging.ApplyT(func(allowCloudtrailLogging iam.GetPolicyDocumentResult) (*string, error) {
// return &allowCloudtrailLogging.Json, nil
// }).(pulumi.StringPtrOutput),
// })
// if err != nil {
// return err
// }
// return nil
// })
// }
// ```
// <!--End PulumiCodeChooser -->
func GetServiceAccount(ctx *pulumi.Context, args *GetServiceAccountArgs, opts ...pulumi.InvokeOption) (*GetServiceAccountResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetServiceAccountResult
	err := ctx.Invoke("aws:cloudtrail/getServiceAccount:getServiceAccount", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getServiceAccount.
type GetServiceAccountArgs struct {
	// Name of the region whose AWS CloudTrail account ID is desired.
	// Defaults to the region from the AWS provider configuration.
	Region *string `pulumi:"region"`
}

// A collection of values returned by getServiceAccount.
type GetServiceAccountResult struct {
	// ARN of the AWS CloudTrail service account in the selected region.
	Arn string `pulumi:"arn"`
	// The provider-assigned unique ID for this managed resource.
	Id     string  `pulumi:"id"`
	Region *string `pulumi:"region"`
}

func GetServiceAccountOutput(ctx *pulumi.Context, args GetServiceAccountOutputArgs, opts ...pulumi.InvokeOption) GetServiceAccountResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetServiceAccountResult, error) {
			args := v.(GetServiceAccountArgs)
			r, err := GetServiceAccount(ctx, &args, opts...)
			var s GetServiceAccountResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetServiceAccountResultOutput)
}

// A collection of arguments for invoking getServiceAccount.
type GetServiceAccountOutputArgs struct {
	// Name of the region whose AWS CloudTrail account ID is desired.
	// Defaults to the region from the AWS provider configuration.
	Region pulumi.StringPtrInput `pulumi:"region"`
}

func (GetServiceAccountOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetServiceAccountArgs)(nil)).Elem()
}

// A collection of values returned by getServiceAccount.
type GetServiceAccountResultOutput struct{ *pulumi.OutputState }

func (GetServiceAccountResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetServiceAccountResult)(nil)).Elem()
}

func (o GetServiceAccountResultOutput) ToGetServiceAccountResultOutput() GetServiceAccountResultOutput {
	return o
}

func (o GetServiceAccountResultOutput) ToGetServiceAccountResultOutputWithContext(ctx context.Context) GetServiceAccountResultOutput {
	return o
}

// ARN of the AWS CloudTrail service account in the selected region.
func (o GetServiceAccountResultOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v GetServiceAccountResult) string { return v.Arn }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetServiceAccountResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetServiceAccountResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetServiceAccountResultOutput) Region() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetServiceAccountResult) *string { return v.Region }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetServiceAccountResultOutput{})
}

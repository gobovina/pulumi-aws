// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package aws

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to get the Account ID of the [AWS Billing and Cost Management Service Account](http://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/billing-getting-started.html#step-2) for the purpose of permitting in S3 bucket policy.
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
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws"
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/iam"
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/s3"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
// func main() {
// pulumi.Run(func(ctx *pulumi.Context) error {
// main, err := aws.GetBillingServiceAccount(ctx, nil, nil);
// if err != nil {
// return err
// }
// billingLogs, err := s3.NewBucketV2(ctx, "billing_logs", &s3.BucketV2Args{
// Bucket: pulumi.String("my-billing-tf-test-bucket"),
// })
// if err != nil {
// return err
// }
// _, err = s3.NewBucketAclV2(ctx, "billing_logs_acl", &s3.BucketAclV2Args{
// Bucket: billingLogs.ID(),
// Acl: pulumi.String("private"),
// })
// if err != nil {
// return err
// }
// allowBillingLogging := pulumi.All(billingLogs.Arn,billingLogs.Arn).ApplyT(func(_args []interface{}) (iam.GetPolicyDocumentResult, error) {
// billingLogsArn := _args[0].(string)
// billingLogsArn1 := _args[1].(string)
// return iam.GetPolicyDocumentOutput(ctx, iam.GetPolicyDocumentOutputArgs{
// Statements: []iam.GetPolicyDocumentStatement{
// {
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
// "s3:GetBucketPolicy",
// },
// Resources: []string{
// billingLogsArn,
// },
// },
// {
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
// fmt.Sprintf("%v/*", billingLogsArn1),
// },
// },
// },
// }, nil), nil
// }).(iam.GetPolicyDocumentResultOutput)
// _, err = s3.NewBucketPolicy(ctx, "allow_billing_logging", &s3.BucketPolicyArgs{
// Bucket: billingLogs.ID(),
// Policy: allowBillingLogging.ApplyT(func(allowBillingLogging iam.GetPolicyDocumentResult) (*string, error) {
// return &allowBillingLogging.Json, nil
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
func GetBillingServiceAccount(ctx *pulumi.Context, args *GetBillingServiceAccountArgs, opts ...pulumi.InvokeOption) (*GetBillingServiceAccountResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetBillingServiceAccountResult
	err := ctx.Invoke("aws:index/getBillingServiceAccount:getBillingServiceAccount", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getBillingServiceAccount.
type GetBillingServiceAccountArgs struct {
	// ID of the AWS billing service account.
	Id *string `pulumi:"id"`
}

// A collection of values returned by getBillingServiceAccount.
type GetBillingServiceAccountResult struct {
	// ARN of the AWS billing service account.
	Arn string `pulumi:"arn"`
	// ID of the AWS billing service account.
	Id string `pulumi:"id"`
}

func GetBillingServiceAccountOutput(ctx *pulumi.Context, args GetBillingServiceAccountOutputArgs, opts ...pulumi.InvokeOption) GetBillingServiceAccountResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetBillingServiceAccountResult, error) {
			args := v.(GetBillingServiceAccountArgs)
			r, err := GetBillingServiceAccount(ctx, &args, opts...)
			var s GetBillingServiceAccountResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetBillingServiceAccountResultOutput)
}

// A collection of arguments for invoking getBillingServiceAccount.
type GetBillingServiceAccountOutputArgs struct {
	// ID of the AWS billing service account.
	Id pulumi.StringPtrInput `pulumi:"id"`
}

func (GetBillingServiceAccountOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetBillingServiceAccountArgs)(nil)).Elem()
}

// A collection of values returned by getBillingServiceAccount.
type GetBillingServiceAccountResultOutput struct{ *pulumi.OutputState }

func (GetBillingServiceAccountResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetBillingServiceAccountResult)(nil)).Elem()
}

func (o GetBillingServiceAccountResultOutput) ToGetBillingServiceAccountResultOutput() GetBillingServiceAccountResultOutput {
	return o
}

func (o GetBillingServiceAccountResultOutput) ToGetBillingServiceAccountResultOutputWithContext(ctx context.Context) GetBillingServiceAccountResultOutput {
	return o
}

// ARN of the AWS billing service account.
func (o GetBillingServiceAccountResultOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v GetBillingServiceAccountResult) string { return v.Arn }).(pulumi.StringOutput)
}

// ID of the AWS billing service account.
func (o GetBillingServiceAccountResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetBillingServiceAccountResult) string { return v.Id }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetBillingServiceAccountResultOutput{})
}

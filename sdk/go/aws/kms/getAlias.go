// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package kms

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to get the ARN of a KMS key alias.
// By using this data source, you can reference key alias
// without having to hard code the ARN as input.
//
// ## Example Usage
//
// <!--Start PulumiCodeChooser -->
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/kms"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := kms.LookupAlias(ctx, &kms.LookupAliasArgs{
//				Name: "alias/aws/s3",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// <!--End PulumiCodeChooser -->
func LookupAlias(ctx *pulumi.Context, args *LookupAliasArgs, opts ...pulumi.InvokeOption) (*LookupAliasResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupAliasResult
	err := ctx.Invoke("aws:kms/getAlias:getAlias", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getAlias.
type LookupAliasArgs struct {
	// Display name of the alias. The name must start with the word "alias" followed by a forward slash (alias/)
	Name string `pulumi:"name"`
}

// A collection of values returned by getAlias.
type LookupAliasResult struct {
	// Amazon Resource Name(ARN) of the key alias.
	Arn string `pulumi:"arn"`
	// The provider-assigned unique ID for this managed resource.
	Id   string `pulumi:"id"`
	Name string `pulumi:"name"`
	// ARN pointed to by the alias.
	TargetKeyArn string `pulumi:"targetKeyArn"`
	// Key identifier pointed to by the alias.
	TargetKeyId string `pulumi:"targetKeyId"`
}

func LookupAliasOutput(ctx *pulumi.Context, args LookupAliasOutputArgs, opts ...pulumi.InvokeOption) LookupAliasResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupAliasResult, error) {
			args := v.(LookupAliasArgs)
			r, err := LookupAlias(ctx, &args, opts...)
			var s LookupAliasResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupAliasResultOutput)
}

// A collection of arguments for invoking getAlias.
type LookupAliasOutputArgs struct {
	// Display name of the alias. The name must start with the word "alias" followed by a forward slash (alias/)
	Name pulumi.StringInput `pulumi:"name"`
}

func (LookupAliasOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupAliasArgs)(nil)).Elem()
}

// A collection of values returned by getAlias.
type LookupAliasResultOutput struct{ *pulumi.OutputState }

func (LookupAliasResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupAliasResult)(nil)).Elem()
}

func (o LookupAliasResultOutput) ToLookupAliasResultOutput() LookupAliasResultOutput {
	return o
}

func (o LookupAliasResultOutput) ToLookupAliasResultOutputWithContext(ctx context.Context) LookupAliasResultOutput {
	return o
}

// Amazon Resource Name(ARN) of the key alias.
func (o LookupAliasResultOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAliasResult) string { return v.Arn }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupAliasResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAliasResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupAliasResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAliasResult) string { return v.Name }).(pulumi.StringOutput)
}

// ARN pointed to by the alias.
func (o LookupAliasResultOutput) TargetKeyArn() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAliasResult) string { return v.TargetKeyArn }).(pulumi.StringOutput)
}

// Key identifier pointed to by the alias.
func (o LookupAliasResultOutput) TargetKeyId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAliasResult) string { return v.TargetKeyId }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupAliasResultOutput{})
}

// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package wafv2

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Retrieves the summary of a WAFv2 Regex Pattern Set.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v5/go/aws/wafv2"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := wafv2.LookupRegexPatternSet(ctx, &wafv2.LookupRegexPatternSetArgs{
//				Name:  "some-regex-pattern-set",
//				Scope: "REGIONAL",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupRegexPatternSet(ctx *pulumi.Context, args *LookupRegexPatternSetArgs, opts ...pulumi.InvokeOption) (*LookupRegexPatternSetResult, error) {
	var rv LookupRegexPatternSetResult
	err := ctx.Invoke("aws:wafv2/getRegexPatternSet:getRegexPatternSet", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getRegexPatternSet.
type LookupRegexPatternSetArgs struct {
	// Name of the WAFv2 Regex Pattern Set.
	Name string `pulumi:"name"`
	// Specifies whether this is for an AWS CloudFront distribution or for a regional application. Valid values are `CLOUDFRONT` or `REGIONAL`. To work with CloudFront, you must also specify the region `us-east-1` (N. Virginia) on the AWS provider.
	Scope string `pulumi:"scope"`
}

// A collection of values returned by getRegexPatternSet.
type LookupRegexPatternSetResult struct {
	// ARN of the entity.
	Arn string `pulumi:"arn"`
	// Description of the set that helps with identification.
	Description string `pulumi:"description"`
	// The provider-assigned unique ID for this managed resource.
	Id   string `pulumi:"id"`
	Name string `pulumi:"name"`
	// One or more blocks of regular expression patterns that AWS WAF is searching for. See Regular Expression below for details.
	RegularExpressions []GetRegexPatternSetRegularExpression `pulumi:"regularExpressions"`
	Scope              string                                `pulumi:"scope"`
}

func LookupRegexPatternSetOutput(ctx *pulumi.Context, args LookupRegexPatternSetOutputArgs, opts ...pulumi.InvokeOption) LookupRegexPatternSetResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupRegexPatternSetResult, error) {
			args := v.(LookupRegexPatternSetArgs)
			r, err := LookupRegexPatternSet(ctx, &args, opts...)
			var s LookupRegexPatternSetResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupRegexPatternSetResultOutput)
}

// A collection of arguments for invoking getRegexPatternSet.
type LookupRegexPatternSetOutputArgs struct {
	// Name of the WAFv2 Regex Pattern Set.
	Name pulumi.StringInput `pulumi:"name"`
	// Specifies whether this is for an AWS CloudFront distribution or for a regional application. Valid values are `CLOUDFRONT` or `REGIONAL`. To work with CloudFront, you must also specify the region `us-east-1` (N. Virginia) on the AWS provider.
	Scope pulumi.StringInput `pulumi:"scope"`
}

func (LookupRegexPatternSetOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupRegexPatternSetArgs)(nil)).Elem()
}

// A collection of values returned by getRegexPatternSet.
type LookupRegexPatternSetResultOutput struct{ *pulumi.OutputState }

func (LookupRegexPatternSetResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupRegexPatternSetResult)(nil)).Elem()
}

func (o LookupRegexPatternSetResultOutput) ToLookupRegexPatternSetResultOutput() LookupRegexPatternSetResultOutput {
	return o
}

func (o LookupRegexPatternSetResultOutput) ToLookupRegexPatternSetResultOutputWithContext(ctx context.Context) LookupRegexPatternSetResultOutput {
	return o
}

// ARN of the entity.
func (o LookupRegexPatternSetResultOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v LookupRegexPatternSetResult) string { return v.Arn }).(pulumi.StringOutput)
}

// Description of the set that helps with identification.
func (o LookupRegexPatternSetResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupRegexPatternSetResult) string { return v.Description }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupRegexPatternSetResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupRegexPatternSetResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupRegexPatternSetResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupRegexPatternSetResult) string { return v.Name }).(pulumi.StringOutput)
}

// One or more blocks of regular expression patterns that AWS WAF is searching for. See Regular Expression below for details.
func (o LookupRegexPatternSetResultOutput) RegularExpressions() GetRegexPatternSetRegularExpressionArrayOutput {
	return o.ApplyT(func(v LookupRegexPatternSetResult) []GetRegexPatternSetRegularExpression { return v.RegularExpressions }).(GetRegexPatternSetRegularExpressionArrayOutput)
}

func (o LookupRegexPatternSetResultOutput) Scope() pulumi.StringOutput {
	return o.ApplyT(func(v LookupRegexPatternSetResult) string { return v.Scope }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupRegexPatternSetResultOutput{})
}

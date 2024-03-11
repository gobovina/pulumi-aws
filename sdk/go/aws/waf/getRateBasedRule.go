// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package waf

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// `waf.RateBasedRule` Retrieves a WAF Rate Based Rule Resource Id.
//
// ## Example Usage
//
// <!--Start PulumiCodeChooser -->
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/waf"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := waf.LookupRateBasedRule(ctx, &waf.LookupRateBasedRuleArgs{
//				Name: "tfWAFRateBasedRule",
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
func LookupRateBasedRule(ctx *pulumi.Context, args *LookupRateBasedRuleArgs, opts ...pulumi.InvokeOption) (*LookupRateBasedRuleResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupRateBasedRuleResult
	err := ctx.Invoke("aws:waf/getRateBasedRule:getRateBasedRule", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getRateBasedRule.
type LookupRateBasedRuleArgs struct {
	// Name of the WAF rate based rule.
	Name string `pulumi:"name"`
}

// A collection of values returned by getRateBasedRule.
type LookupRateBasedRuleResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id   string `pulumi:"id"`
	Name string `pulumi:"name"`
}

func LookupRateBasedRuleOutput(ctx *pulumi.Context, args LookupRateBasedRuleOutputArgs, opts ...pulumi.InvokeOption) LookupRateBasedRuleResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupRateBasedRuleResult, error) {
			args := v.(LookupRateBasedRuleArgs)
			r, err := LookupRateBasedRule(ctx, &args, opts...)
			var s LookupRateBasedRuleResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupRateBasedRuleResultOutput)
}

// A collection of arguments for invoking getRateBasedRule.
type LookupRateBasedRuleOutputArgs struct {
	// Name of the WAF rate based rule.
	Name pulumi.StringInput `pulumi:"name"`
}

func (LookupRateBasedRuleOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupRateBasedRuleArgs)(nil)).Elem()
}

// A collection of values returned by getRateBasedRule.
type LookupRateBasedRuleResultOutput struct{ *pulumi.OutputState }

func (LookupRateBasedRuleResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupRateBasedRuleResult)(nil)).Elem()
}

func (o LookupRateBasedRuleResultOutput) ToLookupRateBasedRuleResultOutput() LookupRateBasedRuleResultOutput {
	return o
}

func (o LookupRateBasedRuleResultOutput) ToLookupRateBasedRuleResultOutputWithContext(ctx context.Context) LookupRateBasedRuleResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o LookupRateBasedRuleResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupRateBasedRuleResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupRateBasedRuleResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupRateBasedRuleResult) string { return v.Name }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupRateBasedRuleResultOutput{})
}

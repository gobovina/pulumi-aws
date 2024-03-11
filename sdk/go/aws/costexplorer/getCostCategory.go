// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package costexplorer

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides details about a specific CostExplorer Cost Category.
//
// ## Example Usage
//
// <!--Start PulumiCodeChooser -->
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/costexplorer"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := costexplorer.LookupCostCategory(ctx, &costexplorer.LookupCostCategoryArgs{
//				CostCategoryArn: "costCategoryARN",
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
func LookupCostCategory(ctx *pulumi.Context, args *LookupCostCategoryArgs, opts ...pulumi.InvokeOption) (*LookupCostCategoryResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupCostCategoryResult
	err := ctx.Invoke("aws:costexplorer/getCostCategory:getCostCategory", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getCostCategory.
type LookupCostCategoryArgs struct {
	// Unique name for the Cost Category.
	CostCategoryArn string `pulumi:"costCategoryArn"`
	// Configuration block for the specific `Tag` to use for `Expression`. See below.
	Tags map[string]string `pulumi:"tags"`
}

// A collection of values returned by getCostCategory.
type LookupCostCategoryResult struct {
	CostCategoryArn string `pulumi:"costCategoryArn"`
	// Default value for the cost category.
	DefaultValue string `pulumi:"defaultValue"`
	// Effective end data of your Cost Category.
	EffectiveEnd string `pulumi:"effectiveEnd"`
	// Effective state data of your Cost Category.
	EffectiveStart string `pulumi:"effectiveStart"`
	// The provider-assigned unique ID for this managed resource.
	Id   string `pulumi:"id"`
	Name string `pulumi:"name"`
	// Rule schema version in this particular Cost Category.
	RuleVersion string `pulumi:"ruleVersion"`
	// Configuration block for the `Expression` object used to categorize costs. See below.
	Rules []GetCostCategoryRule `pulumi:"rules"`
	// Configuration block for the split charge rules used to allocate your charges between your Cost Category values. See below.
	SplitChargeRules []GetCostCategorySplitChargeRule `pulumi:"splitChargeRules"`
	// Configuration block for the specific `Tag` to use for `Expression`. See below.
	Tags map[string]string `pulumi:"tags"`
}

func LookupCostCategoryOutput(ctx *pulumi.Context, args LookupCostCategoryOutputArgs, opts ...pulumi.InvokeOption) LookupCostCategoryResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupCostCategoryResult, error) {
			args := v.(LookupCostCategoryArgs)
			r, err := LookupCostCategory(ctx, &args, opts...)
			var s LookupCostCategoryResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupCostCategoryResultOutput)
}

// A collection of arguments for invoking getCostCategory.
type LookupCostCategoryOutputArgs struct {
	// Unique name for the Cost Category.
	CostCategoryArn pulumi.StringInput `pulumi:"costCategoryArn"`
	// Configuration block for the specific `Tag` to use for `Expression`. See below.
	Tags pulumi.StringMapInput `pulumi:"tags"`
}

func (LookupCostCategoryOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupCostCategoryArgs)(nil)).Elem()
}

// A collection of values returned by getCostCategory.
type LookupCostCategoryResultOutput struct{ *pulumi.OutputState }

func (LookupCostCategoryResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupCostCategoryResult)(nil)).Elem()
}

func (o LookupCostCategoryResultOutput) ToLookupCostCategoryResultOutput() LookupCostCategoryResultOutput {
	return o
}

func (o LookupCostCategoryResultOutput) ToLookupCostCategoryResultOutputWithContext(ctx context.Context) LookupCostCategoryResultOutput {
	return o
}

func (o LookupCostCategoryResultOutput) CostCategoryArn() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCostCategoryResult) string { return v.CostCategoryArn }).(pulumi.StringOutput)
}

// Default value for the cost category.
func (o LookupCostCategoryResultOutput) DefaultValue() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCostCategoryResult) string { return v.DefaultValue }).(pulumi.StringOutput)
}

// Effective end data of your Cost Category.
func (o LookupCostCategoryResultOutput) EffectiveEnd() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCostCategoryResult) string { return v.EffectiveEnd }).(pulumi.StringOutput)
}

// Effective state data of your Cost Category.
func (o LookupCostCategoryResultOutput) EffectiveStart() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCostCategoryResult) string { return v.EffectiveStart }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupCostCategoryResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCostCategoryResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupCostCategoryResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCostCategoryResult) string { return v.Name }).(pulumi.StringOutput)
}

// Rule schema version in this particular Cost Category.
func (o LookupCostCategoryResultOutput) RuleVersion() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCostCategoryResult) string { return v.RuleVersion }).(pulumi.StringOutput)
}

// Configuration block for the `Expression` object used to categorize costs. See below.
func (o LookupCostCategoryResultOutput) Rules() GetCostCategoryRuleArrayOutput {
	return o.ApplyT(func(v LookupCostCategoryResult) []GetCostCategoryRule { return v.Rules }).(GetCostCategoryRuleArrayOutput)
}

// Configuration block for the split charge rules used to allocate your charges between your Cost Category values. See below.
func (o LookupCostCategoryResultOutput) SplitChargeRules() GetCostCategorySplitChargeRuleArrayOutput {
	return o.ApplyT(func(v LookupCostCategoryResult) []GetCostCategorySplitChargeRule { return v.SplitChargeRules }).(GetCostCategorySplitChargeRuleArrayOutput)
}

// Configuration block for the specific `Tag` to use for `Expression`. See below.
func (o LookupCostCategoryResultOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v LookupCostCategoryResult) map[string]string { return v.Tags }).(pulumi.StringMapOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupCostCategoryResultOutput{})
}

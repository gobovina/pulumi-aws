// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package costexplorer

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a CE Cost Category.
//
// ## Example Usage
//
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
//			_, err := costexplorer.NewCostCategory(ctx, "test", &costexplorer.CostCategoryArgs{
//				Name:        pulumi.String("NAME"),
//				RuleVersion: pulumi.String("CostCategoryExpression.v1"),
//				Rules: costexplorer.CostCategoryRuleArray{
//					&costexplorer.CostCategoryRuleArgs{
//						Value: pulumi.String("production"),
//						Rule: &costexplorer.CostCategoryRuleRuleArgs{
//							Dimension: &costexplorer.CostCategoryRuleRuleDimensionArgs{
//								Key: pulumi.String("LINKED_ACCOUNT_NAME"),
//								Values: pulumi.StringArray{
//									pulumi.String("-prod"),
//								},
//								MatchOptions: pulumi.StringArray{
//									pulumi.String("ENDS_WITH"),
//								},
//							},
//						},
//					},
//					&costexplorer.CostCategoryRuleArgs{
//						Value: pulumi.String("staging"),
//						Rule: &costexplorer.CostCategoryRuleRuleArgs{
//							Dimension: &costexplorer.CostCategoryRuleRuleDimensionArgs{
//								Key: pulumi.String("LINKED_ACCOUNT_NAME"),
//								Values: pulumi.StringArray{
//									pulumi.String("-stg"),
//								},
//								MatchOptions: pulumi.StringArray{
//									pulumi.String("ENDS_WITH"),
//								},
//							},
//						},
//					},
//					&costexplorer.CostCategoryRuleArgs{
//						Value: pulumi.String("testing"),
//						Rule: &costexplorer.CostCategoryRuleRuleArgs{
//							Dimension: &costexplorer.CostCategoryRuleRuleDimensionArgs{
//								Key: pulumi.String("LINKED_ACCOUNT_NAME"),
//								Values: pulumi.StringArray{
//									pulumi.String("-dev"),
//								},
//								MatchOptions: pulumi.StringArray{
//									pulumi.String("ENDS_WITH"),
//								},
//							},
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
//
// ## Import
//
// Using `pulumi import`, import `aws_ce_cost_category` using the id. For example:
//
// ```sh
//
//	$ pulumi import aws:costexplorer/costCategory:CostCategory example costCategoryARN
//
// ```
type CostCategory struct {
	pulumi.CustomResourceState

	// ARN of the cost category.
	Arn pulumi.StringOutput `pulumi:"arn"`
	// Default value for the cost category.
	DefaultValue pulumi.StringPtrOutput `pulumi:"defaultValue"`
	// Effective end data of your Cost Category.
	EffectiveEnd pulumi.StringOutput `pulumi:"effectiveEnd"`
	// The Cost Category's effective start date. It can only be a billing start date (first day of the month). If the date isn't provided, it's the first day of the current month. Dates can't be before the previous twelve months, or in the future. For example `2022-11-01T00:00:00Z`.
	//
	// The following arguments are optional:
	EffectiveStart pulumi.StringOutput `pulumi:"effectiveStart"`
	// Unique name for the Cost Category.
	Name pulumi.StringOutput `pulumi:"name"`
	// Rule schema version in this particular Cost Category.
	RuleVersion pulumi.StringOutput `pulumi:"ruleVersion"`
	// Configuration block for the Cost Category rules used to categorize costs. See below.
	Rules CostCategoryRuleArrayOutput `pulumi:"rules"`
	// Configuration block for the split charge rules used to allocate your charges between your Cost Category values. See below.
	SplitChargeRules CostCategorySplitChargeRuleArrayOutput `pulumi:"splitChargeRules"`
	// Key-value mapping of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapOutput `pulumi:"tagsAll"`
}

// NewCostCategory registers a new resource with the given unique name, arguments, and options.
func NewCostCategory(ctx *pulumi.Context,
	name string, args *CostCategoryArgs, opts ...pulumi.ResourceOption) (*CostCategory, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.RuleVersion == nil {
		return nil, errors.New("invalid value for required argument 'RuleVersion'")
	}
	if args.Rules == nil {
		return nil, errors.New("invalid value for required argument 'Rules'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource CostCategory
	err := ctx.RegisterResource("aws:costexplorer/costCategory:CostCategory", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetCostCategory gets an existing CostCategory resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetCostCategory(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *CostCategoryState, opts ...pulumi.ResourceOption) (*CostCategory, error) {
	var resource CostCategory
	err := ctx.ReadResource("aws:costexplorer/costCategory:CostCategory", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering CostCategory resources.
type costCategoryState struct {
	// ARN of the cost category.
	Arn *string `pulumi:"arn"`
	// Default value for the cost category.
	DefaultValue *string `pulumi:"defaultValue"`
	// Effective end data of your Cost Category.
	EffectiveEnd *string `pulumi:"effectiveEnd"`
	// The Cost Category's effective start date. It can only be a billing start date (first day of the month). If the date isn't provided, it's the first day of the current month. Dates can't be before the previous twelve months, or in the future. For example `2022-11-01T00:00:00Z`.
	//
	// The following arguments are optional:
	EffectiveStart *string `pulumi:"effectiveStart"`
	// Unique name for the Cost Category.
	Name *string `pulumi:"name"`
	// Rule schema version in this particular Cost Category.
	RuleVersion *string `pulumi:"ruleVersion"`
	// Configuration block for the Cost Category rules used to categorize costs. See below.
	Rules []CostCategoryRule `pulumi:"rules"`
	// Configuration block for the split charge rules used to allocate your charges between your Cost Category values. See below.
	SplitChargeRules []CostCategorySplitChargeRule `pulumi:"splitChargeRules"`
	// Key-value mapping of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll map[string]string `pulumi:"tagsAll"`
}

type CostCategoryState struct {
	// ARN of the cost category.
	Arn pulumi.StringPtrInput
	// Default value for the cost category.
	DefaultValue pulumi.StringPtrInput
	// Effective end data of your Cost Category.
	EffectiveEnd pulumi.StringPtrInput
	// The Cost Category's effective start date. It can only be a billing start date (first day of the month). If the date isn't provided, it's the first day of the current month. Dates can't be before the previous twelve months, or in the future. For example `2022-11-01T00:00:00Z`.
	//
	// The following arguments are optional:
	EffectiveStart pulumi.StringPtrInput
	// Unique name for the Cost Category.
	Name pulumi.StringPtrInput
	// Rule schema version in this particular Cost Category.
	RuleVersion pulumi.StringPtrInput
	// Configuration block for the Cost Category rules used to categorize costs. See below.
	Rules CostCategoryRuleArrayInput
	// Configuration block for the split charge rules used to allocate your charges between your Cost Category values. See below.
	SplitChargeRules CostCategorySplitChargeRuleArrayInput
	// Key-value mapping of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapInput
}

func (CostCategoryState) ElementType() reflect.Type {
	return reflect.TypeOf((*costCategoryState)(nil)).Elem()
}

type costCategoryArgs struct {
	// Default value for the cost category.
	DefaultValue *string `pulumi:"defaultValue"`
	// The Cost Category's effective start date. It can only be a billing start date (first day of the month). If the date isn't provided, it's the first day of the current month. Dates can't be before the previous twelve months, or in the future. For example `2022-11-01T00:00:00Z`.
	//
	// The following arguments are optional:
	EffectiveStart *string `pulumi:"effectiveStart"`
	// Unique name for the Cost Category.
	Name *string `pulumi:"name"`
	// Rule schema version in this particular Cost Category.
	RuleVersion string `pulumi:"ruleVersion"`
	// Configuration block for the Cost Category rules used to categorize costs. See below.
	Rules []CostCategoryRule `pulumi:"rules"`
	// Configuration block for the split charge rules used to allocate your charges between your Cost Category values. See below.
	SplitChargeRules []CostCategorySplitChargeRule `pulumi:"splitChargeRules"`
	// Key-value mapping of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
}

// The set of arguments for constructing a CostCategory resource.
type CostCategoryArgs struct {
	// Default value for the cost category.
	DefaultValue pulumi.StringPtrInput
	// The Cost Category's effective start date. It can only be a billing start date (first day of the month). If the date isn't provided, it's the first day of the current month. Dates can't be before the previous twelve months, or in the future. For example `2022-11-01T00:00:00Z`.
	//
	// The following arguments are optional:
	EffectiveStart pulumi.StringPtrInput
	// Unique name for the Cost Category.
	Name pulumi.StringPtrInput
	// Rule schema version in this particular Cost Category.
	RuleVersion pulumi.StringInput
	// Configuration block for the Cost Category rules used to categorize costs. See below.
	Rules CostCategoryRuleArrayInput
	// Configuration block for the split charge rules used to allocate your charges between your Cost Category values. See below.
	SplitChargeRules CostCategorySplitChargeRuleArrayInput
	// Key-value mapping of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
}

func (CostCategoryArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*costCategoryArgs)(nil)).Elem()
}

type CostCategoryInput interface {
	pulumi.Input

	ToCostCategoryOutput() CostCategoryOutput
	ToCostCategoryOutputWithContext(ctx context.Context) CostCategoryOutput
}

func (*CostCategory) ElementType() reflect.Type {
	return reflect.TypeOf((**CostCategory)(nil)).Elem()
}

func (i *CostCategory) ToCostCategoryOutput() CostCategoryOutput {
	return i.ToCostCategoryOutputWithContext(context.Background())
}

func (i *CostCategory) ToCostCategoryOutputWithContext(ctx context.Context) CostCategoryOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CostCategoryOutput)
}

// CostCategoryArrayInput is an input type that accepts CostCategoryArray and CostCategoryArrayOutput values.
// You can construct a concrete instance of `CostCategoryArrayInput` via:
//
//	CostCategoryArray{ CostCategoryArgs{...} }
type CostCategoryArrayInput interface {
	pulumi.Input

	ToCostCategoryArrayOutput() CostCategoryArrayOutput
	ToCostCategoryArrayOutputWithContext(context.Context) CostCategoryArrayOutput
}

type CostCategoryArray []CostCategoryInput

func (CostCategoryArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*CostCategory)(nil)).Elem()
}

func (i CostCategoryArray) ToCostCategoryArrayOutput() CostCategoryArrayOutput {
	return i.ToCostCategoryArrayOutputWithContext(context.Background())
}

func (i CostCategoryArray) ToCostCategoryArrayOutputWithContext(ctx context.Context) CostCategoryArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CostCategoryArrayOutput)
}

// CostCategoryMapInput is an input type that accepts CostCategoryMap and CostCategoryMapOutput values.
// You can construct a concrete instance of `CostCategoryMapInput` via:
//
//	CostCategoryMap{ "key": CostCategoryArgs{...} }
type CostCategoryMapInput interface {
	pulumi.Input

	ToCostCategoryMapOutput() CostCategoryMapOutput
	ToCostCategoryMapOutputWithContext(context.Context) CostCategoryMapOutput
}

type CostCategoryMap map[string]CostCategoryInput

func (CostCategoryMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*CostCategory)(nil)).Elem()
}

func (i CostCategoryMap) ToCostCategoryMapOutput() CostCategoryMapOutput {
	return i.ToCostCategoryMapOutputWithContext(context.Background())
}

func (i CostCategoryMap) ToCostCategoryMapOutputWithContext(ctx context.Context) CostCategoryMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CostCategoryMapOutput)
}

type CostCategoryOutput struct{ *pulumi.OutputState }

func (CostCategoryOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**CostCategory)(nil)).Elem()
}

func (o CostCategoryOutput) ToCostCategoryOutput() CostCategoryOutput {
	return o
}

func (o CostCategoryOutput) ToCostCategoryOutputWithContext(ctx context.Context) CostCategoryOutput {
	return o
}

// ARN of the cost category.
func (o CostCategoryOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v *CostCategory) pulumi.StringOutput { return v.Arn }).(pulumi.StringOutput)
}

// Default value for the cost category.
func (o CostCategoryOutput) DefaultValue() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *CostCategory) pulumi.StringPtrOutput { return v.DefaultValue }).(pulumi.StringPtrOutput)
}

// Effective end data of your Cost Category.
func (o CostCategoryOutput) EffectiveEnd() pulumi.StringOutput {
	return o.ApplyT(func(v *CostCategory) pulumi.StringOutput { return v.EffectiveEnd }).(pulumi.StringOutput)
}

// The Cost Category's effective start date. It can only be a billing start date (first day of the month). If the date isn't provided, it's the first day of the current month. Dates can't be before the previous twelve months, or in the future. For example `2022-11-01T00:00:00Z`.
//
// The following arguments are optional:
func (o CostCategoryOutput) EffectiveStart() pulumi.StringOutput {
	return o.ApplyT(func(v *CostCategory) pulumi.StringOutput { return v.EffectiveStart }).(pulumi.StringOutput)
}

// Unique name for the Cost Category.
func (o CostCategoryOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *CostCategory) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Rule schema version in this particular Cost Category.
func (o CostCategoryOutput) RuleVersion() pulumi.StringOutput {
	return o.ApplyT(func(v *CostCategory) pulumi.StringOutput { return v.RuleVersion }).(pulumi.StringOutput)
}

// Configuration block for the Cost Category rules used to categorize costs. See below.
func (o CostCategoryOutput) Rules() CostCategoryRuleArrayOutput {
	return o.ApplyT(func(v *CostCategory) CostCategoryRuleArrayOutput { return v.Rules }).(CostCategoryRuleArrayOutput)
}

// Configuration block for the split charge rules used to allocate your charges between your Cost Category values. See below.
func (o CostCategoryOutput) SplitChargeRules() CostCategorySplitChargeRuleArrayOutput {
	return o.ApplyT(func(v *CostCategory) CostCategorySplitChargeRuleArrayOutput { return v.SplitChargeRules }).(CostCategorySplitChargeRuleArrayOutput)
}

// Key-value mapping of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
func (o CostCategoryOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *CostCategory) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
//
// Deprecated: Please use `tags` instead.
func (o CostCategoryOutput) TagsAll() pulumi.StringMapOutput {
	return o.ApplyT(func(v *CostCategory) pulumi.StringMapOutput { return v.TagsAll }).(pulumi.StringMapOutput)
}

type CostCategoryArrayOutput struct{ *pulumi.OutputState }

func (CostCategoryArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*CostCategory)(nil)).Elem()
}

func (o CostCategoryArrayOutput) ToCostCategoryArrayOutput() CostCategoryArrayOutput {
	return o
}

func (o CostCategoryArrayOutput) ToCostCategoryArrayOutputWithContext(ctx context.Context) CostCategoryArrayOutput {
	return o
}

func (o CostCategoryArrayOutput) Index(i pulumi.IntInput) CostCategoryOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *CostCategory {
		return vs[0].([]*CostCategory)[vs[1].(int)]
	}).(CostCategoryOutput)
}

type CostCategoryMapOutput struct{ *pulumi.OutputState }

func (CostCategoryMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*CostCategory)(nil)).Elem()
}

func (o CostCategoryMapOutput) ToCostCategoryMapOutput() CostCategoryMapOutput {
	return o
}

func (o CostCategoryMapOutput) ToCostCategoryMapOutputWithContext(ctx context.Context) CostCategoryMapOutput {
	return o
}

func (o CostCategoryMapOutput) MapIndex(k pulumi.StringInput) CostCategoryOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *CostCategory {
		return vs[0].(map[string]*CostCategory)[vs[1].(string)]
	}).(CostCategoryOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*CostCategoryInput)(nil)).Elem(), &CostCategory{})
	pulumi.RegisterInputType(reflect.TypeOf((*CostCategoryArrayInput)(nil)).Elem(), CostCategoryArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*CostCategoryMapInput)(nil)).Elem(), CostCategoryMap{})
	pulumi.RegisterOutputType(CostCategoryOutput{})
	pulumi.RegisterOutputType(CostCategoryArrayOutput{})
	pulumi.RegisterOutputType(CostCategoryMapOutput{})
}

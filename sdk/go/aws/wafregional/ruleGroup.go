// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package wafregional

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a WAF Regional Rule Group Resource
//
// ## Example Usage
//
// <!--Start PulumiCodeChooser -->
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/wafregional"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			example, err := wafregional.NewRule(ctx, "example", &wafregional.RuleArgs{
//				Name:       pulumi.String("example"),
//				MetricName: pulumi.String("example"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = wafregional.NewRuleGroup(ctx, "example", &wafregional.RuleGroupArgs{
//				Name:       pulumi.String("example"),
//				MetricName: pulumi.String("example"),
//				ActivatedRules: wafregional.RuleGroupActivatedRuleArray{
//					&wafregional.RuleGroupActivatedRuleArgs{
//						Action: &wafregional.RuleGroupActivatedRuleActionArgs{
//							Type: pulumi.String("COUNT"),
//						},
//						Priority: pulumi.Int(50),
//						RuleId:   example.ID(),
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
// Using `pulumi import`, import WAF Regional Rule Group using the id. For example:
//
// ```sh
// $ pulumi import aws:wafregional/ruleGroup:RuleGroup example a1b2c3d4-d5f6-7777-8888-9999aaaabbbbcccc
// ```
type RuleGroup struct {
	pulumi.CustomResourceState

	// A list of activated rules, see below
	ActivatedRules RuleGroupActivatedRuleArrayOutput `pulumi:"activatedRules"`
	// The ARN of the WAF Regional Rule Group.
	Arn pulumi.StringOutput `pulumi:"arn"`
	// A friendly name for the metrics from the rule group
	MetricName pulumi.StringOutput `pulumi:"metricName"`
	// A friendly name of the rule group
	Name pulumi.StringOutput `pulumi:"name"`
	// Key-value map of resource tags. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapOutput `pulumi:"tagsAll"`
}

// NewRuleGroup registers a new resource with the given unique name, arguments, and options.
func NewRuleGroup(ctx *pulumi.Context,
	name string, args *RuleGroupArgs, opts ...pulumi.ResourceOption) (*RuleGroup, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.MetricName == nil {
		return nil, errors.New("invalid value for required argument 'MetricName'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource RuleGroup
	err := ctx.RegisterResource("aws:wafregional/ruleGroup:RuleGroup", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetRuleGroup gets an existing RuleGroup resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetRuleGroup(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *RuleGroupState, opts ...pulumi.ResourceOption) (*RuleGroup, error) {
	var resource RuleGroup
	err := ctx.ReadResource("aws:wafregional/ruleGroup:RuleGroup", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering RuleGroup resources.
type ruleGroupState struct {
	// A list of activated rules, see below
	ActivatedRules []RuleGroupActivatedRule `pulumi:"activatedRules"`
	// The ARN of the WAF Regional Rule Group.
	Arn *string `pulumi:"arn"`
	// A friendly name for the metrics from the rule group
	MetricName *string `pulumi:"metricName"`
	// A friendly name of the rule group
	Name *string `pulumi:"name"`
	// Key-value map of resource tags. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll map[string]string `pulumi:"tagsAll"`
}

type RuleGroupState struct {
	// A list of activated rules, see below
	ActivatedRules RuleGroupActivatedRuleArrayInput
	// The ARN of the WAF Regional Rule Group.
	Arn pulumi.StringPtrInput
	// A friendly name for the metrics from the rule group
	MetricName pulumi.StringPtrInput
	// A friendly name of the rule group
	Name pulumi.StringPtrInput
	// Key-value map of resource tags. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapInput
}

func (RuleGroupState) ElementType() reflect.Type {
	return reflect.TypeOf((*ruleGroupState)(nil)).Elem()
}

type ruleGroupArgs struct {
	// A list of activated rules, see below
	ActivatedRules []RuleGroupActivatedRule `pulumi:"activatedRules"`
	// A friendly name for the metrics from the rule group
	MetricName string `pulumi:"metricName"`
	// A friendly name of the rule group
	Name *string `pulumi:"name"`
	// Key-value map of resource tags. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
}

// The set of arguments for constructing a RuleGroup resource.
type RuleGroupArgs struct {
	// A list of activated rules, see below
	ActivatedRules RuleGroupActivatedRuleArrayInput
	// A friendly name for the metrics from the rule group
	MetricName pulumi.StringInput
	// A friendly name of the rule group
	Name pulumi.StringPtrInput
	// Key-value map of resource tags. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
}

func (RuleGroupArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*ruleGroupArgs)(nil)).Elem()
}

type RuleGroupInput interface {
	pulumi.Input

	ToRuleGroupOutput() RuleGroupOutput
	ToRuleGroupOutputWithContext(ctx context.Context) RuleGroupOutput
}

func (*RuleGroup) ElementType() reflect.Type {
	return reflect.TypeOf((**RuleGroup)(nil)).Elem()
}

func (i *RuleGroup) ToRuleGroupOutput() RuleGroupOutput {
	return i.ToRuleGroupOutputWithContext(context.Background())
}

func (i *RuleGroup) ToRuleGroupOutputWithContext(ctx context.Context) RuleGroupOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RuleGroupOutput)
}

// RuleGroupArrayInput is an input type that accepts RuleGroupArray and RuleGroupArrayOutput values.
// You can construct a concrete instance of `RuleGroupArrayInput` via:
//
//	RuleGroupArray{ RuleGroupArgs{...} }
type RuleGroupArrayInput interface {
	pulumi.Input

	ToRuleGroupArrayOutput() RuleGroupArrayOutput
	ToRuleGroupArrayOutputWithContext(context.Context) RuleGroupArrayOutput
}

type RuleGroupArray []RuleGroupInput

func (RuleGroupArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*RuleGroup)(nil)).Elem()
}

func (i RuleGroupArray) ToRuleGroupArrayOutput() RuleGroupArrayOutput {
	return i.ToRuleGroupArrayOutputWithContext(context.Background())
}

func (i RuleGroupArray) ToRuleGroupArrayOutputWithContext(ctx context.Context) RuleGroupArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RuleGroupArrayOutput)
}

// RuleGroupMapInput is an input type that accepts RuleGroupMap and RuleGroupMapOutput values.
// You can construct a concrete instance of `RuleGroupMapInput` via:
//
//	RuleGroupMap{ "key": RuleGroupArgs{...} }
type RuleGroupMapInput interface {
	pulumi.Input

	ToRuleGroupMapOutput() RuleGroupMapOutput
	ToRuleGroupMapOutputWithContext(context.Context) RuleGroupMapOutput
}

type RuleGroupMap map[string]RuleGroupInput

func (RuleGroupMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*RuleGroup)(nil)).Elem()
}

func (i RuleGroupMap) ToRuleGroupMapOutput() RuleGroupMapOutput {
	return i.ToRuleGroupMapOutputWithContext(context.Background())
}

func (i RuleGroupMap) ToRuleGroupMapOutputWithContext(ctx context.Context) RuleGroupMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RuleGroupMapOutput)
}

type RuleGroupOutput struct{ *pulumi.OutputState }

func (RuleGroupOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**RuleGroup)(nil)).Elem()
}

func (o RuleGroupOutput) ToRuleGroupOutput() RuleGroupOutput {
	return o
}

func (o RuleGroupOutput) ToRuleGroupOutputWithContext(ctx context.Context) RuleGroupOutput {
	return o
}

// A list of activated rules, see below
func (o RuleGroupOutput) ActivatedRules() RuleGroupActivatedRuleArrayOutput {
	return o.ApplyT(func(v *RuleGroup) RuleGroupActivatedRuleArrayOutput { return v.ActivatedRules }).(RuleGroupActivatedRuleArrayOutput)
}

// The ARN of the WAF Regional Rule Group.
func (o RuleGroupOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v *RuleGroup) pulumi.StringOutput { return v.Arn }).(pulumi.StringOutput)
}

// A friendly name for the metrics from the rule group
func (o RuleGroupOutput) MetricName() pulumi.StringOutput {
	return o.ApplyT(func(v *RuleGroup) pulumi.StringOutput { return v.MetricName }).(pulumi.StringOutput)
}

// A friendly name of the rule group
func (o RuleGroupOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *RuleGroup) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Key-value map of resource tags. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
func (o RuleGroupOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *RuleGroup) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
//
// Deprecated: Please use `tags` instead.
func (o RuleGroupOutput) TagsAll() pulumi.StringMapOutput {
	return o.ApplyT(func(v *RuleGroup) pulumi.StringMapOutput { return v.TagsAll }).(pulumi.StringMapOutput)
}

type RuleGroupArrayOutput struct{ *pulumi.OutputState }

func (RuleGroupArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*RuleGroup)(nil)).Elem()
}

func (o RuleGroupArrayOutput) ToRuleGroupArrayOutput() RuleGroupArrayOutput {
	return o
}

func (o RuleGroupArrayOutput) ToRuleGroupArrayOutputWithContext(ctx context.Context) RuleGroupArrayOutput {
	return o
}

func (o RuleGroupArrayOutput) Index(i pulumi.IntInput) RuleGroupOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *RuleGroup {
		return vs[0].([]*RuleGroup)[vs[1].(int)]
	}).(RuleGroupOutput)
}

type RuleGroupMapOutput struct{ *pulumi.OutputState }

func (RuleGroupMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*RuleGroup)(nil)).Elem()
}

func (o RuleGroupMapOutput) ToRuleGroupMapOutput() RuleGroupMapOutput {
	return o
}

func (o RuleGroupMapOutput) ToRuleGroupMapOutputWithContext(ctx context.Context) RuleGroupMapOutput {
	return o
}

func (o RuleGroupMapOutput) MapIndex(k pulumi.StringInput) RuleGroupOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *RuleGroup {
		return vs[0].(map[string]*RuleGroup)[vs[1].(string)]
	}).(RuleGroupOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*RuleGroupInput)(nil)).Elem(), &RuleGroup{})
	pulumi.RegisterInputType(reflect.TypeOf((*RuleGroupArrayInput)(nil)).Elem(), RuleGroupArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*RuleGroupMapInput)(nil)).Elem(), RuleGroupMap{})
	pulumi.RegisterOutputType(RuleGroupOutput{})
	pulumi.RegisterOutputType(RuleGroupArrayOutput{})
	pulumi.RegisterOutputType(RuleGroupMapOutput{})
}

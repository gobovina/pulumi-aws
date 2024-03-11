// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package route53recoverycontrol

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides an AWS Route 53 Recovery Control Config Safety Rule
//
// ## Example Usage
//
// <!--Start PulumiCodeChooser -->
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/route53recoverycontrol"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := route53recoverycontrol.NewSafetyRule(ctx, "example", &route53recoverycontrol.SafetyRuleArgs{
//				AssertedControls: pulumi.StringArray{
//					exampleAwsRoute53recoverycontrolconfigRoutingControl.Arn,
//				},
//				ControlPanelArn: pulumi.String("arn:aws:route53-recovery-control::313517334327:controlpanel/abd5fbfc052d4844a082dbf400f61da8"),
//				Name:            pulumi.String("daisyguttridge"),
//				WaitPeriodMs:    pulumi.Int(5000),
//				RuleConfig: &route53recoverycontrol.SafetyRuleRuleConfigArgs{
//					Inverted:  pulumi.Bool(false),
//					Threshold: pulumi.Int(1),
//					Type:      pulumi.String("ATLEAST"),
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
// <!--Start PulumiCodeChooser -->
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/route53recoverycontrol"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := route53recoverycontrol.NewSafetyRule(ctx, "example", &route53recoverycontrol.SafetyRuleArgs{
//				Name:            pulumi.String("i_o"),
//				ControlPanelArn: pulumi.String("arn:aws:route53-recovery-control::313517334327:controlpanel/abd5fbfc052d4844a082dbf400f61da8"),
//				WaitPeriodMs:    pulumi.Int(5000),
//				GatingControls: pulumi.StringArray{
//					exampleAwsRoute53recoverycontrolconfigRoutingControl.Arn,
//				},
//				TargetControls: pulumi.StringArray{
//					exampleAwsRoute53recoverycontrolconfigRoutingControl.Arn,
//				},
//				RuleConfig: &route53recoverycontrol.SafetyRuleRuleConfigArgs{
//					Inverted:  pulumi.Bool(false),
//					Threshold: pulumi.Int(1),
//					Type:      pulumi.String("ATLEAST"),
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
// Using `pulumi import`, import Route53 Recovery Control Config Safety Rule using the safety rule ARN. For example:
//
// ```sh
// $ pulumi import aws:route53recoverycontrol/safetyRule:SafetyRule myrule arn:aws:route53-recovery-control::313517334327:controlpanel/1bfba17df8684f5dab0467b71424f7e8/safetyrule/3bacc77003364c0f
// ```
type SafetyRule struct {
	pulumi.CustomResourceState

	// ARN of the safety rule.
	Arn pulumi.StringOutput `pulumi:"arn"`
	// Routing controls that are part of transactions that are evaluated to determine if a request to change a routing control state is allowed.
	AssertedControls pulumi.StringArrayOutput `pulumi:"assertedControls"`
	// ARN of the control panel in which this safety rule will reside.
	ControlPanelArn pulumi.StringOutput `pulumi:"controlPanelArn"`
	// Gating controls for the new gating rule. That is, routing controls that are evaluated by the rule configuration that you specify.
	GatingControls pulumi.StringArrayOutput `pulumi:"gatingControls"`
	// Name describing the safety rule.
	Name pulumi.StringOutput `pulumi:"name"`
	// Configuration block for safety rule criteria. See below.
	RuleConfig SafetyRuleRuleConfigOutput `pulumi:"ruleConfig"`
	// Status of the safety rule. `PENDING` when it is being created/updated, `PENDING_DELETION` when it is being deleted, and `DEPLOYED` otherwise.
	Status pulumi.StringOutput `pulumi:"status"`
	// Routing controls that can only be set or unset if the specified `ruleConfig` evaluates to true for the specified `gatingControls`.
	TargetControls pulumi.StringArrayOutput `pulumi:"targetControls"`
	// Evaluation period, in milliseconds (ms), during which any request against the target routing controls will fail.
	//
	// The following arguments are optional:
	WaitPeriodMs pulumi.IntOutput `pulumi:"waitPeriodMs"`
}

// NewSafetyRule registers a new resource with the given unique name, arguments, and options.
func NewSafetyRule(ctx *pulumi.Context,
	name string, args *SafetyRuleArgs, opts ...pulumi.ResourceOption) (*SafetyRule, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ControlPanelArn == nil {
		return nil, errors.New("invalid value for required argument 'ControlPanelArn'")
	}
	if args.RuleConfig == nil {
		return nil, errors.New("invalid value for required argument 'RuleConfig'")
	}
	if args.WaitPeriodMs == nil {
		return nil, errors.New("invalid value for required argument 'WaitPeriodMs'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource SafetyRule
	err := ctx.RegisterResource("aws:route53recoverycontrol/safetyRule:SafetyRule", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSafetyRule gets an existing SafetyRule resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSafetyRule(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SafetyRuleState, opts ...pulumi.ResourceOption) (*SafetyRule, error) {
	var resource SafetyRule
	err := ctx.ReadResource("aws:route53recoverycontrol/safetyRule:SafetyRule", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering SafetyRule resources.
type safetyRuleState struct {
	// ARN of the safety rule.
	Arn *string `pulumi:"arn"`
	// Routing controls that are part of transactions that are evaluated to determine if a request to change a routing control state is allowed.
	AssertedControls []string `pulumi:"assertedControls"`
	// ARN of the control panel in which this safety rule will reside.
	ControlPanelArn *string `pulumi:"controlPanelArn"`
	// Gating controls for the new gating rule. That is, routing controls that are evaluated by the rule configuration that you specify.
	GatingControls []string `pulumi:"gatingControls"`
	// Name describing the safety rule.
	Name *string `pulumi:"name"`
	// Configuration block for safety rule criteria. See below.
	RuleConfig *SafetyRuleRuleConfig `pulumi:"ruleConfig"`
	// Status of the safety rule. `PENDING` when it is being created/updated, `PENDING_DELETION` when it is being deleted, and `DEPLOYED` otherwise.
	Status *string `pulumi:"status"`
	// Routing controls that can only be set or unset if the specified `ruleConfig` evaluates to true for the specified `gatingControls`.
	TargetControls []string `pulumi:"targetControls"`
	// Evaluation period, in milliseconds (ms), during which any request against the target routing controls will fail.
	//
	// The following arguments are optional:
	WaitPeriodMs *int `pulumi:"waitPeriodMs"`
}

type SafetyRuleState struct {
	// ARN of the safety rule.
	Arn pulumi.StringPtrInput
	// Routing controls that are part of transactions that are evaluated to determine if a request to change a routing control state is allowed.
	AssertedControls pulumi.StringArrayInput
	// ARN of the control panel in which this safety rule will reside.
	ControlPanelArn pulumi.StringPtrInput
	// Gating controls for the new gating rule. That is, routing controls that are evaluated by the rule configuration that you specify.
	GatingControls pulumi.StringArrayInput
	// Name describing the safety rule.
	Name pulumi.StringPtrInput
	// Configuration block for safety rule criteria. See below.
	RuleConfig SafetyRuleRuleConfigPtrInput
	// Status of the safety rule. `PENDING` when it is being created/updated, `PENDING_DELETION` when it is being deleted, and `DEPLOYED` otherwise.
	Status pulumi.StringPtrInput
	// Routing controls that can only be set or unset if the specified `ruleConfig` evaluates to true for the specified `gatingControls`.
	TargetControls pulumi.StringArrayInput
	// Evaluation period, in milliseconds (ms), during which any request against the target routing controls will fail.
	//
	// The following arguments are optional:
	WaitPeriodMs pulumi.IntPtrInput
}

func (SafetyRuleState) ElementType() reflect.Type {
	return reflect.TypeOf((*safetyRuleState)(nil)).Elem()
}

type safetyRuleArgs struct {
	// Routing controls that are part of transactions that are evaluated to determine if a request to change a routing control state is allowed.
	AssertedControls []string `pulumi:"assertedControls"`
	// ARN of the control panel in which this safety rule will reside.
	ControlPanelArn string `pulumi:"controlPanelArn"`
	// Gating controls for the new gating rule. That is, routing controls that are evaluated by the rule configuration that you specify.
	GatingControls []string `pulumi:"gatingControls"`
	// Name describing the safety rule.
	Name *string `pulumi:"name"`
	// Configuration block for safety rule criteria. See below.
	RuleConfig SafetyRuleRuleConfig `pulumi:"ruleConfig"`
	// Routing controls that can only be set or unset if the specified `ruleConfig` evaluates to true for the specified `gatingControls`.
	TargetControls []string `pulumi:"targetControls"`
	// Evaluation period, in milliseconds (ms), during which any request against the target routing controls will fail.
	//
	// The following arguments are optional:
	WaitPeriodMs int `pulumi:"waitPeriodMs"`
}

// The set of arguments for constructing a SafetyRule resource.
type SafetyRuleArgs struct {
	// Routing controls that are part of transactions that are evaluated to determine if a request to change a routing control state is allowed.
	AssertedControls pulumi.StringArrayInput
	// ARN of the control panel in which this safety rule will reside.
	ControlPanelArn pulumi.StringInput
	// Gating controls for the new gating rule. That is, routing controls that are evaluated by the rule configuration that you specify.
	GatingControls pulumi.StringArrayInput
	// Name describing the safety rule.
	Name pulumi.StringPtrInput
	// Configuration block for safety rule criteria. See below.
	RuleConfig SafetyRuleRuleConfigInput
	// Routing controls that can only be set or unset if the specified `ruleConfig` evaluates to true for the specified `gatingControls`.
	TargetControls pulumi.StringArrayInput
	// Evaluation period, in milliseconds (ms), during which any request against the target routing controls will fail.
	//
	// The following arguments are optional:
	WaitPeriodMs pulumi.IntInput
}

func (SafetyRuleArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*safetyRuleArgs)(nil)).Elem()
}

type SafetyRuleInput interface {
	pulumi.Input

	ToSafetyRuleOutput() SafetyRuleOutput
	ToSafetyRuleOutputWithContext(ctx context.Context) SafetyRuleOutput
}

func (*SafetyRule) ElementType() reflect.Type {
	return reflect.TypeOf((**SafetyRule)(nil)).Elem()
}

func (i *SafetyRule) ToSafetyRuleOutput() SafetyRuleOutput {
	return i.ToSafetyRuleOutputWithContext(context.Background())
}

func (i *SafetyRule) ToSafetyRuleOutputWithContext(ctx context.Context) SafetyRuleOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SafetyRuleOutput)
}

// SafetyRuleArrayInput is an input type that accepts SafetyRuleArray and SafetyRuleArrayOutput values.
// You can construct a concrete instance of `SafetyRuleArrayInput` via:
//
//	SafetyRuleArray{ SafetyRuleArgs{...} }
type SafetyRuleArrayInput interface {
	pulumi.Input

	ToSafetyRuleArrayOutput() SafetyRuleArrayOutput
	ToSafetyRuleArrayOutputWithContext(context.Context) SafetyRuleArrayOutput
}

type SafetyRuleArray []SafetyRuleInput

func (SafetyRuleArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SafetyRule)(nil)).Elem()
}

func (i SafetyRuleArray) ToSafetyRuleArrayOutput() SafetyRuleArrayOutput {
	return i.ToSafetyRuleArrayOutputWithContext(context.Background())
}

func (i SafetyRuleArray) ToSafetyRuleArrayOutputWithContext(ctx context.Context) SafetyRuleArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SafetyRuleArrayOutput)
}

// SafetyRuleMapInput is an input type that accepts SafetyRuleMap and SafetyRuleMapOutput values.
// You can construct a concrete instance of `SafetyRuleMapInput` via:
//
//	SafetyRuleMap{ "key": SafetyRuleArgs{...} }
type SafetyRuleMapInput interface {
	pulumi.Input

	ToSafetyRuleMapOutput() SafetyRuleMapOutput
	ToSafetyRuleMapOutputWithContext(context.Context) SafetyRuleMapOutput
}

type SafetyRuleMap map[string]SafetyRuleInput

func (SafetyRuleMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SafetyRule)(nil)).Elem()
}

func (i SafetyRuleMap) ToSafetyRuleMapOutput() SafetyRuleMapOutput {
	return i.ToSafetyRuleMapOutputWithContext(context.Background())
}

func (i SafetyRuleMap) ToSafetyRuleMapOutputWithContext(ctx context.Context) SafetyRuleMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SafetyRuleMapOutput)
}

type SafetyRuleOutput struct{ *pulumi.OutputState }

func (SafetyRuleOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**SafetyRule)(nil)).Elem()
}

func (o SafetyRuleOutput) ToSafetyRuleOutput() SafetyRuleOutput {
	return o
}

func (o SafetyRuleOutput) ToSafetyRuleOutputWithContext(ctx context.Context) SafetyRuleOutput {
	return o
}

// ARN of the safety rule.
func (o SafetyRuleOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v *SafetyRule) pulumi.StringOutput { return v.Arn }).(pulumi.StringOutput)
}

// Routing controls that are part of transactions that are evaluated to determine if a request to change a routing control state is allowed.
func (o SafetyRuleOutput) AssertedControls() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *SafetyRule) pulumi.StringArrayOutput { return v.AssertedControls }).(pulumi.StringArrayOutput)
}

// ARN of the control panel in which this safety rule will reside.
func (o SafetyRuleOutput) ControlPanelArn() pulumi.StringOutput {
	return o.ApplyT(func(v *SafetyRule) pulumi.StringOutput { return v.ControlPanelArn }).(pulumi.StringOutput)
}

// Gating controls for the new gating rule. That is, routing controls that are evaluated by the rule configuration that you specify.
func (o SafetyRuleOutput) GatingControls() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *SafetyRule) pulumi.StringArrayOutput { return v.GatingControls }).(pulumi.StringArrayOutput)
}

// Name describing the safety rule.
func (o SafetyRuleOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *SafetyRule) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Configuration block for safety rule criteria. See below.
func (o SafetyRuleOutput) RuleConfig() SafetyRuleRuleConfigOutput {
	return o.ApplyT(func(v *SafetyRule) SafetyRuleRuleConfigOutput { return v.RuleConfig }).(SafetyRuleRuleConfigOutput)
}

// Status of the safety rule. `PENDING` when it is being created/updated, `PENDING_DELETION` when it is being deleted, and `DEPLOYED` otherwise.
func (o SafetyRuleOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *SafetyRule) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

// Routing controls that can only be set or unset if the specified `ruleConfig` evaluates to true for the specified `gatingControls`.
func (o SafetyRuleOutput) TargetControls() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *SafetyRule) pulumi.StringArrayOutput { return v.TargetControls }).(pulumi.StringArrayOutput)
}

// Evaluation period, in milliseconds (ms), during which any request against the target routing controls will fail.
//
// The following arguments are optional:
func (o SafetyRuleOutput) WaitPeriodMs() pulumi.IntOutput {
	return o.ApplyT(func(v *SafetyRule) pulumi.IntOutput { return v.WaitPeriodMs }).(pulumi.IntOutput)
}

type SafetyRuleArrayOutput struct{ *pulumi.OutputState }

func (SafetyRuleArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SafetyRule)(nil)).Elem()
}

func (o SafetyRuleArrayOutput) ToSafetyRuleArrayOutput() SafetyRuleArrayOutput {
	return o
}

func (o SafetyRuleArrayOutput) ToSafetyRuleArrayOutputWithContext(ctx context.Context) SafetyRuleArrayOutput {
	return o
}

func (o SafetyRuleArrayOutput) Index(i pulumi.IntInput) SafetyRuleOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *SafetyRule {
		return vs[0].([]*SafetyRule)[vs[1].(int)]
	}).(SafetyRuleOutput)
}

type SafetyRuleMapOutput struct{ *pulumi.OutputState }

func (SafetyRuleMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SafetyRule)(nil)).Elem()
}

func (o SafetyRuleMapOutput) ToSafetyRuleMapOutput() SafetyRuleMapOutput {
	return o
}

func (o SafetyRuleMapOutput) ToSafetyRuleMapOutputWithContext(ctx context.Context) SafetyRuleMapOutput {
	return o
}

func (o SafetyRuleMapOutput) MapIndex(k pulumi.StringInput) SafetyRuleOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *SafetyRule {
		return vs[0].(map[string]*SafetyRule)[vs[1].(string)]
	}).(SafetyRuleOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*SafetyRuleInput)(nil)).Elem(), &SafetyRule{})
	pulumi.RegisterInputType(reflect.TypeOf((*SafetyRuleArrayInput)(nil)).Elem(), SafetyRuleArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*SafetyRuleMapInput)(nil)).Elem(), SafetyRuleMap{})
	pulumi.RegisterOutputType(SafetyRuleOutput{})
	pulumi.RegisterOutputType(SafetyRuleArrayOutput{})
	pulumi.RegisterOutputType(SafetyRuleMapOutput{})
}

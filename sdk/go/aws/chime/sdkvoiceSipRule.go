// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package chime

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// A SIP rule associates your SIP media application with a phone number or a Request URI hostname. You can associate a SIP rule with more than one SIP media application. Each application then runs only that rule.
//
// ## Example Usage
// ### Basic Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/chime"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := chime.NewSdkvoiceSipRule(ctx, "example", &chime.SdkvoiceSipRuleArgs{
//				Name:         pulumi.String("example-sip-rule"),
//				TriggerType:  pulumi.String("RequestUriHostname"),
//				TriggerValue: pulumi.Any(example_voice_connector.OutboundHostName),
//				TargetApplications: chime.SdkvoiceSipRuleTargetApplicationArray{
//					&chime.SdkvoiceSipRuleTargetApplicationArgs{
//						Priority:              pulumi.Int(1),
//						SipMediaApplicationId: pulumi.Any(example_sma.Id),
//						AwsRegion:             pulumi.String("us-east-1"),
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
// Using `pulumi import`, import a ChimeSDKVoice SIP Rule using the `id`. For example:
//
// ```sh
//
//	$ pulumi import aws:chime/sdkvoiceSipRule:SdkvoiceSipRule example abcdef123456
//
// ```
type SdkvoiceSipRule struct {
	pulumi.CustomResourceState

	// Enables or disables a rule. You must disable rules before you can delete them.
	Disabled pulumi.BoolPtrOutput `pulumi:"disabled"`
	// The name of the SIP rule.
	Name pulumi.StringOutput `pulumi:"name"`
	// List of SIP media applications with priority and AWS Region. Only one SIP application per AWS Region can be used. See `targetApplications`.
	TargetApplications SdkvoiceSipRuleTargetApplicationArrayOutput `pulumi:"targetApplications"`
	// The type of trigger assigned to the SIP rule in `triggerValue`. Valid values are `RequestUriHostname` or `ToPhoneNumber`.
	TriggerType pulumi.StringOutput `pulumi:"triggerType"`
	// If `triggerType` is `RequestUriHostname`, the value can be the outbound host name of an Amazon Chime Voice Connector. If `triggerType` is `ToPhoneNumber`, the value can be a customer-owned phone number in the E164 format. The Sip Media Application specified in the Sip Rule is triggered if the request URI in an incoming SIP request matches the `RequestUriHostname`, or if the "To" header in the incoming SIP request matches the `ToPhoneNumber` value.
	//
	// The following arguments are optional:
	TriggerValue pulumi.StringOutput `pulumi:"triggerValue"`
}

// NewSdkvoiceSipRule registers a new resource with the given unique name, arguments, and options.
func NewSdkvoiceSipRule(ctx *pulumi.Context,
	name string, args *SdkvoiceSipRuleArgs, opts ...pulumi.ResourceOption) (*SdkvoiceSipRule, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.TargetApplications == nil {
		return nil, errors.New("invalid value for required argument 'TargetApplications'")
	}
	if args.TriggerType == nil {
		return nil, errors.New("invalid value for required argument 'TriggerType'")
	}
	if args.TriggerValue == nil {
		return nil, errors.New("invalid value for required argument 'TriggerValue'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource SdkvoiceSipRule
	err := ctx.RegisterResource("aws:chime/sdkvoiceSipRule:SdkvoiceSipRule", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSdkvoiceSipRule gets an existing SdkvoiceSipRule resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSdkvoiceSipRule(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SdkvoiceSipRuleState, opts ...pulumi.ResourceOption) (*SdkvoiceSipRule, error) {
	var resource SdkvoiceSipRule
	err := ctx.ReadResource("aws:chime/sdkvoiceSipRule:SdkvoiceSipRule", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering SdkvoiceSipRule resources.
type sdkvoiceSipRuleState struct {
	// Enables or disables a rule. You must disable rules before you can delete them.
	Disabled *bool `pulumi:"disabled"`
	// The name of the SIP rule.
	Name *string `pulumi:"name"`
	// List of SIP media applications with priority and AWS Region. Only one SIP application per AWS Region can be used. See `targetApplications`.
	TargetApplications []SdkvoiceSipRuleTargetApplication `pulumi:"targetApplications"`
	// The type of trigger assigned to the SIP rule in `triggerValue`. Valid values are `RequestUriHostname` or `ToPhoneNumber`.
	TriggerType *string `pulumi:"triggerType"`
	// If `triggerType` is `RequestUriHostname`, the value can be the outbound host name of an Amazon Chime Voice Connector. If `triggerType` is `ToPhoneNumber`, the value can be a customer-owned phone number in the E164 format. The Sip Media Application specified in the Sip Rule is triggered if the request URI in an incoming SIP request matches the `RequestUriHostname`, or if the "To" header in the incoming SIP request matches the `ToPhoneNumber` value.
	//
	// The following arguments are optional:
	TriggerValue *string `pulumi:"triggerValue"`
}

type SdkvoiceSipRuleState struct {
	// Enables or disables a rule. You must disable rules before you can delete them.
	Disabled pulumi.BoolPtrInput
	// The name of the SIP rule.
	Name pulumi.StringPtrInput
	// List of SIP media applications with priority and AWS Region. Only one SIP application per AWS Region can be used. See `targetApplications`.
	TargetApplications SdkvoiceSipRuleTargetApplicationArrayInput
	// The type of trigger assigned to the SIP rule in `triggerValue`. Valid values are `RequestUriHostname` or `ToPhoneNumber`.
	TriggerType pulumi.StringPtrInput
	// If `triggerType` is `RequestUriHostname`, the value can be the outbound host name of an Amazon Chime Voice Connector. If `triggerType` is `ToPhoneNumber`, the value can be a customer-owned phone number in the E164 format. The Sip Media Application specified in the Sip Rule is triggered if the request URI in an incoming SIP request matches the `RequestUriHostname`, or if the "To" header in the incoming SIP request matches the `ToPhoneNumber` value.
	//
	// The following arguments are optional:
	TriggerValue pulumi.StringPtrInput
}

func (SdkvoiceSipRuleState) ElementType() reflect.Type {
	return reflect.TypeOf((*sdkvoiceSipRuleState)(nil)).Elem()
}

type sdkvoiceSipRuleArgs struct {
	// Enables or disables a rule. You must disable rules before you can delete them.
	Disabled *bool `pulumi:"disabled"`
	// The name of the SIP rule.
	Name *string `pulumi:"name"`
	// List of SIP media applications with priority and AWS Region. Only one SIP application per AWS Region can be used. See `targetApplications`.
	TargetApplications []SdkvoiceSipRuleTargetApplication `pulumi:"targetApplications"`
	// The type of trigger assigned to the SIP rule in `triggerValue`. Valid values are `RequestUriHostname` or `ToPhoneNumber`.
	TriggerType string `pulumi:"triggerType"`
	// If `triggerType` is `RequestUriHostname`, the value can be the outbound host name of an Amazon Chime Voice Connector. If `triggerType` is `ToPhoneNumber`, the value can be a customer-owned phone number in the E164 format. The Sip Media Application specified in the Sip Rule is triggered if the request URI in an incoming SIP request matches the `RequestUriHostname`, or if the "To" header in the incoming SIP request matches the `ToPhoneNumber` value.
	//
	// The following arguments are optional:
	TriggerValue string `pulumi:"triggerValue"`
}

// The set of arguments for constructing a SdkvoiceSipRule resource.
type SdkvoiceSipRuleArgs struct {
	// Enables or disables a rule. You must disable rules before you can delete them.
	Disabled pulumi.BoolPtrInput
	// The name of the SIP rule.
	Name pulumi.StringPtrInput
	// List of SIP media applications with priority and AWS Region. Only one SIP application per AWS Region can be used. See `targetApplications`.
	TargetApplications SdkvoiceSipRuleTargetApplicationArrayInput
	// The type of trigger assigned to the SIP rule in `triggerValue`. Valid values are `RequestUriHostname` or `ToPhoneNumber`.
	TriggerType pulumi.StringInput
	// If `triggerType` is `RequestUriHostname`, the value can be the outbound host name of an Amazon Chime Voice Connector. If `triggerType` is `ToPhoneNumber`, the value can be a customer-owned phone number in the E164 format. The Sip Media Application specified in the Sip Rule is triggered if the request URI in an incoming SIP request matches the `RequestUriHostname`, or if the "To" header in the incoming SIP request matches the `ToPhoneNumber` value.
	//
	// The following arguments are optional:
	TriggerValue pulumi.StringInput
}

func (SdkvoiceSipRuleArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*sdkvoiceSipRuleArgs)(nil)).Elem()
}

type SdkvoiceSipRuleInput interface {
	pulumi.Input

	ToSdkvoiceSipRuleOutput() SdkvoiceSipRuleOutput
	ToSdkvoiceSipRuleOutputWithContext(ctx context.Context) SdkvoiceSipRuleOutput
}

func (*SdkvoiceSipRule) ElementType() reflect.Type {
	return reflect.TypeOf((**SdkvoiceSipRule)(nil)).Elem()
}

func (i *SdkvoiceSipRule) ToSdkvoiceSipRuleOutput() SdkvoiceSipRuleOutput {
	return i.ToSdkvoiceSipRuleOutputWithContext(context.Background())
}

func (i *SdkvoiceSipRule) ToSdkvoiceSipRuleOutputWithContext(ctx context.Context) SdkvoiceSipRuleOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SdkvoiceSipRuleOutput)
}

// SdkvoiceSipRuleArrayInput is an input type that accepts SdkvoiceSipRuleArray and SdkvoiceSipRuleArrayOutput values.
// You can construct a concrete instance of `SdkvoiceSipRuleArrayInput` via:
//
//	SdkvoiceSipRuleArray{ SdkvoiceSipRuleArgs{...} }
type SdkvoiceSipRuleArrayInput interface {
	pulumi.Input

	ToSdkvoiceSipRuleArrayOutput() SdkvoiceSipRuleArrayOutput
	ToSdkvoiceSipRuleArrayOutputWithContext(context.Context) SdkvoiceSipRuleArrayOutput
}

type SdkvoiceSipRuleArray []SdkvoiceSipRuleInput

func (SdkvoiceSipRuleArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SdkvoiceSipRule)(nil)).Elem()
}

func (i SdkvoiceSipRuleArray) ToSdkvoiceSipRuleArrayOutput() SdkvoiceSipRuleArrayOutput {
	return i.ToSdkvoiceSipRuleArrayOutputWithContext(context.Background())
}

func (i SdkvoiceSipRuleArray) ToSdkvoiceSipRuleArrayOutputWithContext(ctx context.Context) SdkvoiceSipRuleArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SdkvoiceSipRuleArrayOutput)
}

// SdkvoiceSipRuleMapInput is an input type that accepts SdkvoiceSipRuleMap and SdkvoiceSipRuleMapOutput values.
// You can construct a concrete instance of `SdkvoiceSipRuleMapInput` via:
//
//	SdkvoiceSipRuleMap{ "key": SdkvoiceSipRuleArgs{...} }
type SdkvoiceSipRuleMapInput interface {
	pulumi.Input

	ToSdkvoiceSipRuleMapOutput() SdkvoiceSipRuleMapOutput
	ToSdkvoiceSipRuleMapOutputWithContext(context.Context) SdkvoiceSipRuleMapOutput
}

type SdkvoiceSipRuleMap map[string]SdkvoiceSipRuleInput

func (SdkvoiceSipRuleMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SdkvoiceSipRule)(nil)).Elem()
}

func (i SdkvoiceSipRuleMap) ToSdkvoiceSipRuleMapOutput() SdkvoiceSipRuleMapOutput {
	return i.ToSdkvoiceSipRuleMapOutputWithContext(context.Background())
}

func (i SdkvoiceSipRuleMap) ToSdkvoiceSipRuleMapOutputWithContext(ctx context.Context) SdkvoiceSipRuleMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SdkvoiceSipRuleMapOutput)
}

type SdkvoiceSipRuleOutput struct{ *pulumi.OutputState }

func (SdkvoiceSipRuleOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**SdkvoiceSipRule)(nil)).Elem()
}

func (o SdkvoiceSipRuleOutput) ToSdkvoiceSipRuleOutput() SdkvoiceSipRuleOutput {
	return o
}

func (o SdkvoiceSipRuleOutput) ToSdkvoiceSipRuleOutputWithContext(ctx context.Context) SdkvoiceSipRuleOutput {
	return o
}

// Enables or disables a rule. You must disable rules before you can delete them.
func (o SdkvoiceSipRuleOutput) Disabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *SdkvoiceSipRule) pulumi.BoolPtrOutput { return v.Disabled }).(pulumi.BoolPtrOutput)
}

// The name of the SIP rule.
func (o SdkvoiceSipRuleOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *SdkvoiceSipRule) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// List of SIP media applications with priority and AWS Region. Only one SIP application per AWS Region can be used. See `targetApplications`.
func (o SdkvoiceSipRuleOutput) TargetApplications() SdkvoiceSipRuleTargetApplicationArrayOutput {
	return o.ApplyT(func(v *SdkvoiceSipRule) SdkvoiceSipRuleTargetApplicationArrayOutput { return v.TargetApplications }).(SdkvoiceSipRuleTargetApplicationArrayOutput)
}

// The type of trigger assigned to the SIP rule in `triggerValue`. Valid values are `RequestUriHostname` or `ToPhoneNumber`.
func (o SdkvoiceSipRuleOutput) TriggerType() pulumi.StringOutput {
	return o.ApplyT(func(v *SdkvoiceSipRule) pulumi.StringOutput { return v.TriggerType }).(pulumi.StringOutput)
}

// If `triggerType` is `RequestUriHostname`, the value can be the outbound host name of an Amazon Chime Voice Connector. If `triggerType` is `ToPhoneNumber`, the value can be a customer-owned phone number in the E164 format. The Sip Media Application specified in the Sip Rule is triggered if the request URI in an incoming SIP request matches the `RequestUriHostname`, or if the "To" header in the incoming SIP request matches the `ToPhoneNumber` value.
//
// The following arguments are optional:
func (o SdkvoiceSipRuleOutput) TriggerValue() pulumi.StringOutput {
	return o.ApplyT(func(v *SdkvoiceSipRule) pulumi.StringOutput { return v.TriggerValue }).(pulumi.StringOutput)
}

type SdkvoiceSipRuleArrayOutput struct{ *pulumi.OutputState }

func (SdkvoiceSipRuleArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SdkvoiceSipRule)(nil)).Elem()
}

func (o SdkvoiceSipRuleArrayOutput) ToSdkvoiceSipRuleArrayOutput() SdkvoiceSipRuleArrayOutput {
	return o
}

func (o SdkvoiceSipRuleArrayOutput) ToSdkvoiceSipRuleArrayOutputWithContext(ctx context.Context) SdkvoiceSipRuleArrayOutput {
	return o
}

func (o SdkvoiceSipRuleArrayOutput) Index(i pulumi.IntInput) SdkvoiceSipRuleOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *SdkvoiceSipRule {
		return vs[0].([]*SdkvoiceSipRule)[vs[1].(int)]
	}).(SdkvoiceSipRuleOutput)
}

type SdkvoiceSipRuleMapOutput struct{ *pulumi.OutputState }

func (SdkvoiceSipRuleMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SdkvoiceSipRule)(nil)).Elem()
}

func (o SdkvoiceSipRuleMapOutput) ToSdkvoiceSipRuleMapOutput() SdkvoiceSipRuleMapOutput {
	return o
}

func (o SdkvoiceSipRuleMapOutput) ToSdkvoiceSipRuleMapOutputWithContext(ctx context.Context) SdkvoiceSipRuleMapOutput {
	return o
}

func (o SdkvoiceSipRuleMapOutput) MapIndex(k pulumi.StringInput) SdkvoiceSipRuleOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *SdkvoiceSipRule {
		return vs[0].(map[string]*SdkvoiceSipRule)[vs[1].(string)]
	}).(SdkvoiceSipRuleOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*SdkvoiceSipRuleInput)(nil)).Elem(), &SdkvoiceSipRule{})
	pulumi.RegisterInputType(reflect.TypeOf((*SdkvoiceSipRuleArrayInput)(nil)).Elem(), SdkvoiceSipRuleArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*SdkvoiceSipRuleMapInput)(nil)).Elem(), SdkvoiceSipRuleMap{})
	pulumi.RegisterOutputType(SdkvoiceSipRuleOutput{})
	pulumi.RegisterOutputType(SdkvoiceSipRuleArrayOutput{})
	pulumi.RegisterOutputType(SdkvoiceSipRuleMapOutput{})
}

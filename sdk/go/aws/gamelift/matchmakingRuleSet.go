// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package gamelift

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a GameLift Matchmaking Rule Set resources.
//
// ## Import
//
// GameLift Matchmaking Rule Sets  can be imported using the ID, e.g.,
//
// ```sh
// $ pulumi import aws:gamelift/matchmakingRuleSet:MatchmakingRuleSet example <ruleset-id>
// ```
type MatchmakingRuleSet struct {
	pulumi.CustomResourceState

	// Rule Set ARN.
	Arn pulumi.StringOutput `pulumi:"arn"`
	// Name of the matchmaking rule set.
	Name pulumi.StringOutput `pulumi:"name"`
	// JSON encoded string containing rule set data.
	RuleSetBody pulumi.StringOutput    `pulumi:"ruleSetBody"`
	Tags        pulumi.StringMapOutput `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapOutput `pulumi:"tagsAll"`
}

// NewMatchmakingRuleSet registers a new resource with the given unique name, arguments, and options.
func NewMatchmakingRuleSet(ctx *pulumi.Context,
	name string, args *MatchmakingRuleSetArgs, opts ...pulumi.ResourceOption) (*MatchmakingRuleSet, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.RuleSetBody == nil {
		return nil, errors.New("invalid value for required argument 'RuleSetBody'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource MatchmakingRuleSet
	err := ctx.RegisterResource("aws:gamelift/matchmakingRuleSet:MatchmakingRuleSet", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetMatchmakingRuleSet gets an existing MatchmakingRuleSet resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetMatchmakingRuleSet(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *MatchmakingRuleSetState, opts ...pulumi.ResourceOption) (*MatchmakingRuleSet, error) {
	var resource MatchmakingRuleSet
	err := ctx.ReadResource("aws:gamelift/matchmakingRuleSet:MatchmakingRuleSet", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering MatchmakingRuleSet resources.
type matchmakingRuleSetState struct {
	// Rule Set ARN.
	Arn *string `pulumi:"arn"`
	// Name of the matchmaking rule set.
	Name *string `pulumi:"name"`
	// JSON encoded string containing rule set data.
	RuleSetBody *string           `pulumi:"ruleSetBody"`
	Tags        map[string]string `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll map[string]string `pulumi:"tagsAll"`
}

type MatchmakingRuleSetState struct {
	// Rule Set ARN.
	Arn pulumi.StringPtrInput
	// Name of the matchmaking rule set.
	Name pulumi.StringPtrInput
	// JSON encoded string containing rule set data.
	RuleSetBody pulumi.StringPtrInput
	Tags        pulumi.StringMapInput
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapInput
}

func (MatchmakingRuleSetState) ElementType() reflect.Type {
	return reflect.TypeOf((*matchmakingRuleSetState)(nil)).Elem()
}

type matchmakingRuleSetArgs struct {
	// Name of the matchmaking rule set.
	Name *string `pulumi:"name"`
	// JSON encoded string containing rule set data.
	RuleSetBody string            `pulumi:"ruleSetBody"`
	Tags        map[string]string `pulumi:"tags"`
}

// The set of arguments for constructing a MatchmakingRuleSet resource.
type MatchmakingRuleSetArgs struct {
	// Name of the matchmaking rule set.
	Name pulumi.StringPtrInput
	// JSON encoded string containing rule set data.
	RuleSetBody pulumi.StringInput
	Tags        pulumi.StringMapInput
}

func (MatchmakingRuleSetArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*matchmakingRuleSetArgs)(nil)).Elem()
}

type MatchmakingRuleSetInput interface {
	pulumi.Input

	ToMatchmakingRuleSetOutput() MatchmakingRuleSetOutput
	ToMatchmakingRuleSetOutputWithContext(ctx context.Context) MatchmakingRuleSetOutput
}

func (*MatchmakingRuleSet) ElementType() reflect.Type {
	return reflect.TypeOf((**MatchmakingRuleSet)(nil)).Elem()
}

func (i *MatchmakingRuleSet) ToMatchmakingRuleSetOutput() MatchmakingRuleSetOutput {
	return i.ToMatchmakingRuleSetOutputWithContext(context.Background())
}

func (i *MatchmakingRuleSet) ToMatchmakingRuleSetOutputWithContext(ctx context.Context) MatchmakingRuleSetOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MatchmakingRuleSetOutput)
}

// MatchmakingRuleSetArrayInput is an input type that accepts MatchmakingRuleSetArray and MatchmakingRuleSetArrayOutput values.
// You can construct a concrete instance of `MatchmakingRuleSetArrayInput` via:
//
//	MatchmakingRuleSetArray{ MatchmakingRuleSetArgs{...} }
type MatchmakingRuleSetArrayInput interface {
	pulumi.Input

	ToMatchmakingRuleSetArrayOutput() MatchmakingRuleSetArrayOutput
	ToMatchmakingRuleSetArrayOutputWithContext(context.Context) MatchmakingRuleSetArrayOutput
}

type MatchmakingRuleSetArray []MatchmakingRuleSetInput

func (MatchmakingRuleSetArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*MatchmakingRuleSet)(nil)).Elem()
}

func (i MatchmakingRuleSetArray) ToMatchmakingRuleSetArrayOutput() MatchmakingRuleSetArrayOutput {
	return i.ToMatchmakingRuleSetArrayOutputWithContext(context.Background())
}

func (i MatchmakingRuleSetArray) ToMatchmakingRuleSetArrayOutputWithContext(ctx context.Context) MatchmakingRuleSetArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MatchmakingRuleSetArrayOutput)
}

// MatchmakingRuleSetMapInput is an input type that accepts MatchmakingRuleSetMap and MatchmakingRuleSetMapOutput values.
// You can construct a concrete instance of `MatchmakingRuleSetMapInput` via:
//
//	MatchmakingRuleSetMap{ "key": MatchmakingRuleSetArgs{...} }
type MatchmakingRuleSetMapInput interface {
	pulumi.Input

	ToMatchmakingRuleSetMapOutput() MatchmakingRuleSetMapOutput
	ToMatchmakingRuleSetMapOutputWithContext(context.Context) MatchmakingRuleSetMapOutput
}

type MatchmakingRuleSetMap map[string]MatchmakingRuleSetInput

func (MatchmakingRuleSetMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*MatchmakingRuleSet)(nil)).Elem()
}

func (i MatchmakingRuleSetMap) ToMatchmakingRuleSetMapOutput() MatchmakingRuleSetMapOutput {
	return i.ToMatchmakingRuleSetMapOutputWithContext(context.Background())
}

func (i MatchmakingRuleSetMap) ToMatchmakingRuleSetMapOutputWithContext(ctx context.Context) MatchmakingRuleSetMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MatchmakingRuleSetMapOutput)
}

type MatchmakingRuleSetOutput struct{ *pulumi.OutputState }

func (MatchmakingRuleSetOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**MatchmakingRuleSet)(nil)).Elem()
}

func (o MatchmakingRuleSetOutput) ToMatchmakingRuleSetOutput() MatchmakingRuleSetOutput {
	return o
}

func (o MatchmakingRuleSetOutput) ToMatchmakingRuleSetOutputWithContext(ctx context.Context) MatchmakingRuleSetOutput {
	return o
}

// Rule Set ARN.
func (o MatchmakingRuleSetOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v *MatchmakingRuleSet) pulumi.StringOutput { return v.Arn }).(pulumi.StringOutput)
}

// Name of the matchmaking rule set.
func (o MatchmakingRuleSetOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *MatchmakingRuleSet) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// JSON encoded string containing rule set data.
func (o MatchmakingRuleSetOutput) RuleSetBody() pulumi.StringOutput {
	return o.ApplyT(func(v *MatchmakingRuleSet) pulumi.StringOutput { return v.RuleSetBody }).(pulumi.StringOutput)
}

func (o MatchmakingRuleSetOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *MatchmakingRuleSet) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
//
// Deprecated: Please use `tags` instead.
func (o MatchmakingRuleSetOutput) TagsAll() pulumi.StringMapOutput {
	return o.ApplyT(func(v *MatchmakingRuleSet) pulumi.StringMapOutput { return v.TagsAll }).(pulumi.StringMapOutput)
}

type MatchmakingRuleSetArrayOutput struct{ *pulumi.OutputState }

func (MatchmakingRuleSetArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*MatchmakingRuleSet)(nil)).Elem()
}

func (o MatchmakingRuleSetArrayOutput) ToMatchmakingRuleSetArrayOutput() MatchmakingRuleSetArrayOutput {
	return o
}

func (o MatchmakingRuleSetArrayOutput) ToMatchmakingRuleSetArrayOutputWithContext(ctx context.Context) MatchmakingRuleSetArrayOutput {
	return o
}

func (o MatchmakingRuleSetArrayOutput) Index(i pulumi.IntInput) MatchmakingRuleSetOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *MatchmakingRuleSet {
		return vs[0].([]*MatchmakingRuleSet)[vs[1].(int)]
	}).(MatchmakingRuleSetOutput)
}

type MatchmakingRuleSetMapOutput struct{ *pulumi.OutputState }

func (MatchmakingRuleSetMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*MatchmakingRuleSet)(nil)).Elem()
}

func (o MatchmakingRuleSetMapOutput) ToMatchmakingRuleSetMapOutput() MatchmakingRuleSetMapOutput {
	return o
}

func (o MatchmakingRuleSetMapOutput) ToMatchmakingRuleSetMapOutputWithContext(ctx context.Context) MatchmakingRuleSetMapOutput {
	return o
}

func (o MatchmakingRuleSetMapOutput) MapIndex(k pulumi.StringInput) MatchmakingRuleSetOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *MatchmakingRuleSet {
		return vs[0].(map[string]*MatchmakingRuleSet)[vs[1].(string)]
	}).(MatchmakingRuleSetOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*MatchmakingRuleSetInput)(nil)).Elem(), &MatchmakingRuleSet{})
	pulumi.RegisterInputType(reflect.TypeOf((*MatchmakingRuleSetArrayInput)(nil)).Elem(), MatchmakingRuleSetArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*MatchmakingRuleSetMapInput)(nil)).Elem(), MatchmakingRuleSetMap{})
	pulumi.RegisterOutputType(MatchmakingRuleSetOutput{})
	pulumi.RegisterOutputType(MatchmakingRuleSetArrayOutput{})
	pulumi.RegisterOutputType(MatchmakingRuleSetMapOutput{})
}

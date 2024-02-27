// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package workspaces

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides an IP access control group in AWS WorkSpaces Service
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/workspaces"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := workspaces.NewIpGroup(ctx, "contractors", &workspaces.IpGroupArgs{
//				Description: pulumi.String("Contractors IP access control group"),
//				Rules: workspaces.IpGroupRuleArray{
//					&workspaces.IpGroupRuleArgs{
//						Description: pulumi.String("NY"),
//						Source:      pulumi.String("150.24.14.0/24"),
//					},
//					&workspaces.IpGroupRuleArgs{
//						Description: pulumi.String("LA"),
//						Source:      pulumi.String("125.191.14.85/32"),
//					},
//					&workspaces.IpGroupRuleArgs{
//						Description: pulumi.String("STL"),
//						Source:      pulumi.String("44.98.100.0/24"),
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
// Using `pulumi import`, import WorkSpaces IP groups using their GroupID. For example:
//
// ```sh
//
//	$ pulumi import aws:workspaces/ipGroup:IpGroup example wsipg-488lrtl3k
//
// ```
type IpGroup struct {
	pulumi.CustomResourceState

	// The description of the IP group.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// The name of the IP group.
	Name pulumi.StringOutput `pulumi:"name"`
	// One or more pairs specifying the IP group rule (in CIDR format) from which web requests originate.
	Rules IpGroupRuleArrayOutput `pulumi:"rules"`
	// A map of tags assigned to the WorkSpaces directory. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapOutput `pulumi:"tagsAll"`
}

// NewIpGroup registers a new resource with the given unique name, arguments, and options.
func NewIpGroup(ctx *pulumi.Context,
	name string, args *IpGroupArgs, opts ...pulumi.ResourceOption) (*IpGroup, error) {
	if args == nil {
		args = &IpGroupArgs{}
	}

	opts = internal.PkgResourceDefaultOpts(opts)
	var resource IpGroup
	err := ctx.RegisterResource("aws:workspaces/ipGroup:IpGroup", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetIpGroup gets an existing IpGroup resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetIpGroup(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *IpGroupState, opts ...pulumi.ResourceOption) (*IpGroup, error) {
	var resource IpGroup
	err := ctx.ReadResource("aws:workspaces/ipGroup:IpGroup", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering IpGroup resources.
type ipGroupState struct {
	// The description of the IP group.
	Description *string `pulumi:"description"`
	// The name of the IP group.
	Name *string `pulumi:"name"`
	// One or more pairs specifying the IP group rule (in CIDR format) from which web requests originate.
	Rules []IpGroupRule `pulumi:"rules"`
	// A map of tags assigned to the WorkSpaces directory. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll map[string]string `pulumi:"tagsAll"`
}

type IpGroupState struct {
	// The description of the IP group.
	Description pulumi.StringPtrInput
	// The name of the IP group.
	Name pulumi.StringPtrInput
	// One or more pairs specifying the IP group rule (in CIDR format) from which web requests originate.
	Rules IpGroupRuleArrayInput
	// A map of tags assigned to the WorkSpaces directory. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapInput
}

func (IpGroupState) ElementType() reflect.Type {
	return reflect.TypeOf((*ipGroupState)(nil)).Elem()
}

type ipGroupArgs struct {
	// The description of the IP group.
	Description *string `pulumi:"description"`
	// The name of the IP group.
	Name *string `pulumi:"name"`
	// One or more pairs specifying the IP group rule (in CIDR format) from which web requests originate.
	Rules []IpGroupRule `pulumi:"rules"`
	// A map of tags assigned to the WorkSpaces directory. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
}

// The set of arguments for constructing a IpGroup resource.
type IpGroupArgs struct {
	// The description of the IP group.
	Description pulumi.StringPtrInput
	// The name of the IP group.
	Name pulumi.StringPtrInput
	// One or more pairs specifying the IP group rule (in CIDR format) from which web requests originate.
	Rules IpGroupRuleArrayInput
	// A map of tags assigned to the WorkSpaces directory. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
}

func (IpGroupArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*ipGroupArgs)(nil)).Elem()
}

type IpGroupInput interface {
	pulumi.Input

	ToIpGroupOutput() IpGroupOutput
	ToIpGroupOutputWithContext(ctx context.Context) IpGroupOutput
}

func (*IpGroup) ElementType() reflect.Type {
	return reflect.TypeOf((**IpGroup)(nil)).Elem()
}

func (i *IpGroup) ToIpGroupOutput() IpGroupOutput {
	return i.ToIpGroupOutputWithContext(context.Background())
}

func (i *IpGroup) ToIpGroupOutputWithContext(ctx context.Context) IpGroupOutput {
	return pulumi.ToOutputWithContext(ctx, i).(IpGroupOutput)
}

// IpGroupArrayInput is an input type that accepts IpGroupArray and IpGroupArrayOutput values.
// You can construct a concrete instance of `IpGroupArrayInput` via:
//
//	IpGroupArray{ IpGroupArgs{...} }
type IpGroupArrayInput interface {
	pulumi.Input

	ToIpGroupArrayOutput() IpGroupArrayOutput
	ToIpGroupArrayOutputWithContext(context.Context) IpGroupArrayOutput
}

type IpGroupArray []IpGroupInput

func (IpGroupArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*IpGroup)(nil)).Elem()
}

func (i IpGroupArray) ToIpGroupArrayOutput() IpGroupArrayOutput {
	return i.ToIpGroupArrayOutputWithContext(context.Background())
}

func (i IpGroupArray) ToIpGroupArrayOutputWithContext(ctx context.Context) IpGroupArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(IpGroupArrayOutput)
}

// IpGroupMapInput is an input type that accepts IpGroupMap and IpGroupMapOutput values.
// You can construct a concrete instance of `IpGroupMapInput` via:
//
//	IpGroupMap{ "key": IpGroupArgs{...} }
type IpGroupMapInput interface {
	pulumi.Input

	ToIpGroupMapOutput() IpGroupMapOutput
	ToIpGroupMapOutputWithContext(context.Context) IpGroupMapOutput
}

type IpGroupMap map[string]IpGroupInput

func (IpGroupMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*IpGroup)(nil)).Elem()
}

func (i IpGroupMap) ToIpGroupMapOutput() IpGroupMapOutput {
	return i.ToIpGroupMapOutputWithContext(context.Background())
}

func (i IpGroupMap) ToIpGroupMapOutputWithContext(ctx context.Context) IpGroupMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(IpGroupMapOutput)
}

type IpGroupOutput struct{ *pulumi.OutputState }

func (IpGroupOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**IpGroup)(nil)).Elem()
}

func (o IpGroupOutput) ToIpGroupOutput() IpGroupOutput {
	return o
}

func (o IpGroupOutput) ToIpGroupOutputWithContext(ctx context.Context) IpGroupOutput {
	return o
}

// The description of the IP group.
func (o IpGroupOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *IpGroup) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// The name of the IP group.
func (o IpGroupOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *IpGroup) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// One or more pairs specifying the IP group rule (in CIDR format) from which web requests originate.
func (o IpGroupOutput) Rules() IpGroupRuleArrayOutput {
	return o.ApplyT(func(v *IpGroup) IpGroupRuleArrayOutput { return v.Rules }).(IpGroupRuleArrayOutput)
}

// A map of tags assigned to the WorkSpaces directory. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
func (o IpGroupOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *IpGroup) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
//
// Deprecated: Please use `tags` instead.
func (o IpGroupOutput) TagsAll() pulumi.StringMapOutput {
	return o.ApplyT(func(v *IpGroup) pulumi.StringMapOutput { return v.TagsAll }).(pulumi.StringMapOutput)
}

type IpGroupArrayOutput struct{ *pulumi.OutputState }

func (IpGroupArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*IpGroup)(nil)).Elem()
}

func (o IpGroupArrayOutput) ToIpGroupArrayOutput() IpGroupArrayOutput {
	return o
}

func (o IpGroupArrayOutput) ToIpGroupArrayOutputWithContext(ctx context.Context) IpGroupArrayOutput {
	return o
}

func (o IpGroupArrayOutput) Index(i pulumi.IntInput) IpGroupOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *IpGroup {
		return vs[0].([]*IpGroup)[vs[1].(int)]
	}).(IpGroupOutput)
}

type IpGroupMapOutput struct{ *pulumi.OutputState }

func (IpGroupMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*IpGroup)(nil)).Elem()
}

func (o IpGroupMapOutput) ToIpGroupMapOutput() IpGroupMapOutput {
	return o
}

func (o IpGroupMapOutput) ToIpGroupMapOutputWithContext(ctx context.Context) IpGroupMapOutput {
	return o
}

func (o IpGroupMapOutput) MapIndex(k pulumi.StringInput) IpGroupOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *IpGroup {
		return vs[0].(map[string]*IpGroup)[vs[1].(string)]
	}).(IpGroupOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*IpGroupInput)(nil)).Elem(), &IpGroup{})
	pulumi.RegisterInputType(reflect.TypeOf((*IpGroupArrayInput)(nil)).Elem(), IpGroupArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*IpGroupMapInput)(nil)).Elem(), IpGroupMap{})
	pulumi.RegisterOutputType(IpGroupOutput{})
	pulumi.RegisterOutputType(IpGroupArrayOutput{})
	pulumi.RegisterOutputType(IpGroupMapOutput{})
}

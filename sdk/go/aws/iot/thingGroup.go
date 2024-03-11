// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package iot

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages an AWS IoT Thing Group.
//
// ## Example Usage
//
// <!--Start PulumiCodeChooser -->
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/iot"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			parent, err := iot.NewThingGroup(ctx, "parent", &iot.ThingGroupArgs{
//				Name: pulumi.String("parent"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = iot.NewThingGroup(ctx, "example", &iot.ThingGroupArgs{
//				Name:            pulumi.String("example"),
//				ParentGroupName: parent.Name,
//				Properties: &iot.ThingGroupPropertiesArgs{
//					AttributePayload: &iot.ThingGroupPropertiesAttributePayloadArgs{
//						Attributes: pulumi.StringMap{
//							"One": pulumi.String("11111"),
//							"Two": pulumi.String("TwoTwo"),
//						},
//					},
//					Description: pulumi.String("This is my thing group"),
//				},
//				Tags: pulumi.StringMap{
//					"managed": pulumi.String("true"),
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
// Using `pulumi import`, import IoT Things Groups using the name. For example:
//
// ```sh
// $ pulumi import aws:iot/thingGroup:ThingGroup example example
// ```
type ThingGroup struct {
	pulumi.CustomResourceState

	// The ARN of the Thing Group.
	Arn       pulumi.StringOutput           `pulumi:"arn"`
	Metadatas ThingGroupMetadataArrayOutput `pulumi:"metadatas"`
	// The name of the Thing Group.
	Name pulumi.StringOutput `pulumi:"name"`
	// The name of the parent Thing Group.
	ParentGroupName pulumi.StringPtrOutput `pulumi:"parentGroupName"`
	// The Thing Group properties. Defined below.
	Properties ThingGroupPropertiesPtrOutput `pulumi:"properties"`
	// Key-value mapping of resource tags
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapOutput `pulumi:"tagsAll"`
	// The current version of the Thing Group record in the registry.
	Version pulumi.IntOutput `pulumi:"version"`
}

// NewThingGroup registers a new resource with the given unique name, arguments, and options.
func NewThingGroup(ctx *pulumi.Context,
	name string, args *ThingGroupArgs, opts ...pulumi.ResourceOption) (*ThingGroup, error) {
	if args == nil {
		args = &ThingGroupArgs{}
	}

	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ThingGroup
	err := ctx.RegisterResource("aws:iot/thingGroup:ThingGroup", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetThingGroup gets an existing ThingGroup resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetThingGroup(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ThingGroupState, opts ...pulumi.ResourceOption) (*ThingGroup, error) {
	var resource ThingGroup
	err := ctx.ReadResource("aws:iot/thingGroup:ThingGroup", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ThingGroup resources.
type thingGroupState struct {
	// The ARN of the Thing Group.
	Arn       *string              `pulumi:"arn"`
	Metadatas []ThingGroupMetadata `pulumi:"metadatas"`
	// The name of the Thing Group.
	Name *string `pulumi:"name"`
	// The name of the parent Thing Group.
	ParentGroupName *string `pulumi:"parentGroupName"`
	// The Thing Group properties. Defined below.
	Properties *ThingGroupProperties `pulumi:"properties"`
	// Key-value mapping of resource tags
	Tags map[string]string `pulumi:"tags"`
	// Deprecated: Please use `tags` instead.
	TagsAll map[string]string `pulumi:"tagsAll"`
	// The current version of the Thing Group record in the registry.
	Version *int `pulumi:"version"`
}

type ThingGroupState struct {
	// The ARN of the Thing Group.
	Arn       pulumi.StringPtrInput
	Metadatas ThingGroupMetadataArrayInput
	// The name of the Thing Group.
	Name pulumi.StringPtrInput
	// The name of the parent Thing Group.
	ParentGroupName pulumi.StringPtrInput
	// The Thing Group properties. Defined below.
	Properties ThingGroupPropertiesPtrInput
	// Key-value mapping of resource tags
	Tags pulumi.StringMapInput
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapInput
	// The current version of the Thing Group record in the registry.
	Version pulumi.IntPtrInput
}

func (ThingGroupState) ElementType() reflect.Type {
	return reflect.TypeOf((*thingGroupState)(nil)).Elem()
}

type thingGroupArgs struct {
	// The name of the Thing Group.
	Name *string `pulumi:"name"`
	// The name of the parent Thing Group.
	ParentGroupName *string `pulumi:"parentGroupName"`
	// The Thing Group properties. Defined below.
	Properties *ThingGroupProperties `pulumi:"properties"`
	// Key-value mapping of resource tags
	Tags map[string]string `pulumi:"tags"`
}

// The set of arguments for constructing a ThingGroup resource.
type ThingGroupArgs struct {
	// The name of the Thing Group.
	Name pulumi.StringPtrInput
	// The name of the parent Thing Group.
	ParentGroupName pulumi.StringPtrInput
	// The Thing Group properties. Defined below.
	Properties ThingGroupPropertiesPtrInput
	// Key-value mapping of resource tags
	Tags pulumi.StringMapInput
}

func (ThingGroupArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*thingGroupArgs)(nil)).Elem()
}

type ThingGroupInput interface {
	pulumi.Input

	ToThingGroupOutput() ThingGroupOutput
	ToThingGroupOutputWithContext(ctx context.Context) ThingGroupOutput
}

func (*ThingGroup) ElementType() reflect.Type {
	return reflect.TypeOf((**ThingGroup)(nil)).Elem()
}

func (i *ThingGroup) ToThingGroupOutput() ThingGroupOutput {
	return i.ToThingGroupOutputWithContext(context.Background())
}

func (i *ThingGroup) ToThingGroupOutputWithContext(ctx context.Context) ThingGroupOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ThingGroupOutput)
}

// ThingGroupArrayInput is an input type that accepts ThingGroupArray and ThingGroupArrayOutput values.
// You can construct a concrete instance of `ThingGroupArrayInput` via:
//
//	ThingGroupArray{ ThingGroupArgs{...} }
type ThingGroupArrayInput interface {
	pulumi.Input

	ToThingGroupArrayOutput() ThingGroupArrayOutput
	ToThingGroupArrayOutputWithContext(context.Context) ThingGroupArrayOutput
}

type ThingGroupArray []ThingGroupInput

func (ThingGroupArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ThingGroup)(nil)).Elem()
}

func (i ThingGroupArray) ToThingGroupArrayOutput() ThingGroupArrayOutput {
	return i.ToThingGroupArrayOutputWithContext(context.Background())
}

func (i ThingGroupArray) ToThingGroupArrayOutputWithContext(ctx context.Context) ThingGroupArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ThingGroupArrayOutput)
}

// ThingGroupMapInput is an input type that accepts ThingGroupMap and ThingGroupMapOutput values.
// You can construct a concrete instance of `ThingGroupMapInput` via:
//
//	ThingGroupMap{ "key": ThingGroupArgs{...} }
type ThingGroupMapInput interface {
	pulumi.Input

	ToThingGroupMapOutput() ThingGroupMapOutput
	ToThingGroupMapOutputWithContext(context.Context) ThingGroupMapOutput
}

type ThingGroupMap map[string]ThingGroupInput

func (ThingGroupMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ThingGroup)(nil)).Elem()
}

func (i ThingGroupMap) ToThingGroupMapOutput() ThingGroupMapOutput {
	return i.ToThingGroupMapOutputWithContext(context.Background())
}

func (i ThingGroupMap) ToThingGroupMapOutputWithContext(ctx context.Context) ThingGroupMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ThingGroupMapOutput)
}

type ThingGroupOutput struct{ *pulumi.OutputState }

func (ThingGroupOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ThingGroup)(nil)).Elem()
}

func (o ThingGroupOutput) ToThingGroupOutput() ThingGroupOutput {
	return o
}

func (o ThingGroupOutput) ToThingGroupOutputWithContext(ctx context.Context) ThingGroupOutput {
	return o
}

// The ARN of the Thing Group.
func (o ThingGroupOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v *ThingGroup) pulumi.StringOutput { return v.Arn }).(pulumi.StringOutput)
}

func (o ThingGroupOutput) Metadatas() ThingGroupMetadataArrayOutput {
	return o.ApplyT(func(v *ThingGroup) ThingGroupMetadataArrayOutput { return v.Metadatas }).(ThingGroupMetadataArrayOutput)
}

// The name of the Thing Group.
func (o ThingGroupOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *ThingGroup) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The name of the parent Thing Group.
func (o ThingGroupOutput) ParentGroupName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ThingGroup) pulumi.StringPtrOutput { return v.ParentGroupName }).(pulumi.StringPtrOutput)
}

// The Thing Group properties. Defined below.
func (o ThingGroupOutput) Properties() ThingGroupPropertiesPtrOutput {
	return o.ApplyT(func(v *ThingGroup) ThingGroupPropertiesPtrOutput { return v.Properties }).(ThingGroupPropertiesPtrOutput)
}

// Key-value mapping of resource tags
func (o ThingGroupOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *ThingGroup) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// Deprecated: Please use `tags` instead.
func (o ThingGroupOutput) TagsAll() pulumi.StringMapOutput {
	return o.ApplyT(func(v *ThingGroup) pulumi.StringMapOutput { return v.TagsAll }).(pulumi.StringMapOutput)
}

// The current version of the Thing Group record in the registry.
func (o ThingGroupOutput) Version() pulumi.IntOutput {
	return o.ApplyT(func(v *ThingGroup) pulumi.IntOutput { return v.Version }).(pulumi.IntOutput)
}

type ThingGroupArrayOutput struct{ *pulumi.OutputState }

func (ThingGroupArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ThingGroup)(nil)).Elem()
}

func (o ThingGroupArrayOutput) ToThingGroupArrayOutput() ThingGroupArrayOutput {
	return o
}

func (o ThingGroupArrayOutput) ToThingGroupArrayOutputWithContext(ctx context.Context) ThingGroupArrayOutput {
	return o
}

func (o ThingGroupArrayOutput) Index(i pulumi.IntInput) ThingGroupOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ThingGroup {
		return vs[0].([]*ThingGroup)[vs[1].(int)]
	}).(ThingGroupOutput)
}

type ThingGroupMapOutput struct{ *pulumi.OutputState }

func (ThingGroupMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ThingGroup)(nil)).Elem()
}

func (o ThingGroupMapOutput) ToThingGroupMapOutput() ThingGroupMapOutput {
	return o
}

func (o ThingGroupMapOutput) ToThingGroupMapOutputWithContext(ctx context.Context) ThingGroupMapOutput {
	return o
}

func (o ThingGroupMapOutput) MapIndex(k pulumi.StringInput) ThingGroupOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ThingGroup {
		return vs[0].(map[string]*ThingGroup)[vs[1].(string)]
	}).(ThingGroupOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ThingGroupInput)(nil)).Elem(), &ThingGroup{})
	pulumi.RegisterInputType(reflect.TypeOf((*ThingGroupArrayInput)(nil)).Elem(), ThingGroupArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ThingGroupMapInput)(nil)).Elem(), ThingGroupMap{})
	pulumi.RegisterOutputType(ThingGroupOutput{})
	pulumi.RegisterOutputType(ThingGroupArrayOutput{})
	pulumi.RegisterOutputType(ThingGroupMapOutput{})
}

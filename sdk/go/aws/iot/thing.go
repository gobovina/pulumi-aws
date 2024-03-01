// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package iot

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Creates and manages an AWS IoT Thing.
//
// ## Example Usage
//
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
//			_, err := iot.NewThing(ctx, "example", &iot.ThingArgs{
//				Name: pulumi.String("example"),
//				Attributes: pulumi.StringMap{
//					"First": pulumi.String("examplevalue"),
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
// Using `pulumi import`, import IOT Things using the name. For example:
//
// ```sh
//
//	$ pulumi import aws:iot/thing:Thing example example
//
// ```
type Thing struct {
	pulumi.CustomResourceState

	// The ARN of the thing.
	Arn pulumi.StringOutput `pulumi:"arn"`
	// Map of attributes of the thing.
	Attributes pulumi.StringMapOutput `pulumi:"attributes"`
	// The default client ID.
	DefaultClientId pulumi.StringOutput `pulumi:"defaultClientId"`
	// The name of the thing.
	Name pulumi.StringOutput `pulumi:"name"`
	// The thing type name.
	ThingTypeName pulumi.StringPtrOutput `pulumi:"thingTypeName"`
	// The current version of the thing record in the registry.
	Version pulumi.IntOutput `pulumi:"version"`
}

// NewThing registers a new resource with the given unique name, arguments, and options.
func NewThing(ctx *pulumi.Context,
	name string, args *ThingArgs, opts ...pulumi.ResourceOption) (*Thing, error) {
	if args == nil {
		args = &ThingArgs{}
	}

	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Thing
	err := ctx.RegisterResource("aws:iot/thing:Thing", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetThing gets an existing Thing resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetThing(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ThingState, opts ...pulumi.ResourceOption) (*Thing, error) {
	var resource Thing
	err := ctx.ReadResource("aws:iot/thing:Thing", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Thing resources.
type thingState struct {
	// The ARN of the thing.
	Arn *string `pulumi:"arn"`
	// Map of attributes of the thing.
	Attributes map[string]string `pulumi:"attributes"`
	// The default client ID.
	DefaultClientId *string `pulumi:"defaultClientId"`
	// The name of the thing.
	Name *string `pulumi:"name"`
	// The thing type name.
	ThingTypeName *string `pulumi:"thingTypeName"`
	// The current version of the thing record in the registry.
	Version *int `pulumi:"version"`
}

type ThingState struct {
	// The ARN of the thing.
	Arn pulumi.StringPtrInput
	// Map of attributes of the thing.
	Attributes pulumi.StringMapInput
	// The default client ID.
	DefaultClientId pulumi.StringPtrInput
	// The name of the thing.
	Name pulumi.StringPtrInput
	// The thing type name.
	ThingTypeName pulumi.StringPtrInput
	// The current version of the thing record in the registry.
	Version pulumi.IntPtrInput
}

func (ThingState) ElementType() reflect.Type {
	return reflect.TypeOf((*thingState)(nil)).Elem()
}

type thingArgs struct {
	// Map of attributes of the thing.
	Attributes map[string]string `pulumi:"attributes"`
	// The name of the thing.
	Name *string `pulumi:"name"`
	// The thing type name.
	ThingTypeName *string `pulumi:"thingTypeName"`
}

// The set of arguments for constructing a Thing resource.
type ThingArgs struct {
	// Map of attributes of the thing.
	Attributes pulumi.StringMapInput
	// The name of the thing.
	Name pulumi.StringPtrInput
	// The thing type name.
	ThingTypeName pulumi.StringPtrInput
}

func (ThingArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*thingArgs)(nil)).Elem()
}

type ThingInput interface {
	pulumi.Input

	ToThingOutput() ThingOutput
	ToThingOutputWithContext(ctx context.Context) ThingOutput
}

func (*Thing) ElementType() reflect.Type {
	return reflect.TypeOf((**Thing)(nil)).Elem()
}

func (i *Thing) ToThingOutput() ThingOutput {
	return i.ToThingOutputWithContext(context.Background())
}

func (i *Thing) ToThingOutputWithContext(ctx context.Context) ThingOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ThingOutput)
}

// ThingArrayInput is an input type that accepts ThingArray and ThingArrayOutput values.
// You can construct a concrete instance of `ThingArrayInput` via:
//
//	ThingArray{ ThingArgs{...} }
type ThingArrayInput interface {
	pulumi.Input

	ToThingArrayOutput() ThingArrayOutput
	ToThingArrayOutputWithContext(context.Context) ThingArrayOutput
}

type ThingArray []ThingInput

func (ThingArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Thing)(nil)).Elem()
}

func (i ThingArray) ToThingArrayOutput() ThingArrayOutput {
	return i.ToThingArrayOutputWithContext(context.Background())
}

func (i ThingArray) ToThingArrayOutputWithContext(ctx context.Context) ThingArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ThingArrayOutput)
}

// ThingMapInput is an input type that accepts ThingMap and ThingMapOutput values.
// You can construct a concrete instance of `ThingMapInput` via:
//
//	ThingMap{ "key": ThingArgs{...} }
type ThingMapInput interface {
	pulumi.Input

	ToThingMapOutput() ThingMapOutput
	ToThingMapOutputWithContext(context.Context) ThingMapOutput
}

type ThingMap map[string]ThingInput

func (ThingMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Thing)(nil)).Elem()
}

func (i ThingMap) ToThingMapOutput() ThingMapOutput {
	return i.ToThingMapOutputWithContext(context.Background())
}

func (i ThingMap) ToThingMapOutputWithContext(ctx context.Context) ThingMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ThingMapOutput)
}

type ThingOutput struct{ *pulumi.OutputState }

func (ThingOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Thing)(nil)).Elem()
}

func (o ThingOutput) ToThingOutput() ThingOutput {
	return o
}

func (o ThingOutput) ToThingOutputWithContext(ctx context.Context) ThingOutput {
	return o
}

// The ARN of the thing.
func (o ThingOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v *Thing) pulumi.StringOutput { return v.Arn }).(pulumi.StringOutput)
}

// Map of attributes of the thing.
func (o ThingOutput) Attributes() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Thing) pulumi.StringMapOutput { return v.Attributes }).(pulumi.StringMapOutput)
}

// The default client ID.
func (o ThingOutput) DefaultClientId() pulumi.StringOutput {
	return o.ApplyT(func(v *Thing) pulumi.StringOutput { return v.DefaultClientId }).(pulumi.StringOutput)
}

// The name of the thing.
func (o ThingOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Thing) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The thing type name.
func (o ThingOutput) ThingTypeName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Thing) pulumi.StringPtrOutput { return v.ThingTypeName }).(pulumi.StringPtrOutput)
}

// The current version of the thing record in the registry.
func (o ThingOutput) Version() pulumi.IntOutput {
	return o.ApplyT(func(v *Thing) pulumi.IntOutput { return v.Version }).(pulumi.IntOutput)
}

type ThingArrayOutput struct{ *pulumi.OutputState }

func (ThingArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Thing)(nil)).Elem()
}

func (o ThingArrayOutput) ToThingArrayOutput() ThingArrayOutput {
	return o
}

func (o ThingArrayOutput) ToThingArrayOutputWithContext(ctx context.Context) ThingArrayOutput {
	return o
}

func (o ThingArrayOutput) Index(i pulumi.IntInput) ThingOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Thing {
		return vs[0].([]*Thing)[vs[1].(int)]
	}).(ThingOutput)
}

type ThingMapOutput struct{ *pulumi.OutputState }

func (ThingMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Thing)(nil)).Elem()
}

func (o ThingMapOutput) ToThingMapOutput() ThingMapOutput {
	return o
}

func (o ThingMapOutput) ToThingMapOutputWithContext(ctx context.Context) ThingMapOutput {
	return o
}

func (o ThingMapOutput) MapIndex(k pulumi.StringInput) ThingOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Thing {
		return vs[0].(map[string]*Thing)[vs[1].(string)]
	}).(ThingOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ThingInput)(nil)).Elem(), &Thing{})
	pulumi.RegisterInputType(reflect.TypeOf((*ThingArrayInput)(nil)).Elem(), ThingArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ThingMapInput)(nil)).Elem(), ThingMap{})
	pulumi.RegisterOutputType(ThingOutput{})
	pulumi.RegisterOutputType(ThingArrayOutput{})
	pulumi.RegisterOutputType(ThingMapOutput{})
}

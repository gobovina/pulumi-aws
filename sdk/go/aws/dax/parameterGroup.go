// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package dax

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a DAX Parameter Group resource.
//
// ## Example Usage
//
// <!--Start PulumiCodeChooser -->
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/dax"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := dax.NewParameterGroup(ctx, "example", &dax.ParameterGroupArgs{
//				Name: pulumi.String("example"),
//				Parameters: dax.ParameterGroupParameterArray{
//					&dax.ParameterGroupParameterArgs{
//						Name:  pulumi.String("query-ttl-millis"),
//						Value: pulumi.String("100000"),
//					},
//					&dax.ParameterGroupParameterArgs{
//						Name:  pulumi.String("record-ttl-millis"),
//						Value: pulumi.String("100000"),
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
// Using `pulumi import`, import DAX Parameter Group using the `name`. For example:
//
// ```sh
// $ pulumi import aws:dax/parameterGroup:ParameterGroup example my_dax_pg
// ```
type ParameterGroup struct {
	pulumi.CustomResourceState

	// A description of the parameter group.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// The name of the parameter group.
	Name pulumi.StringOutput `pulumi:"name"`
	// The parameters of the parameter group.
	Parameters ParameterGroupParameterArrayOutput `pulumi:"parameters"`
}

// NewParameterGroup registers a new resource with the given unique name, arguments, and options.
func NewParameterGroup(ctx *pulumi.Context,
	name string, args *ParameterGroupArgs, opts ...pulumi.ResourceOption) (*ParameterGroup, error) {
	if args == nil {
		args = &ParameterGroupArgs{}
	}

	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ParameterGroup
	err := ctx.RegisterResource("aws:dax/parameterGroup:ParameterGroup", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetParameterGroup gets an existing ParameterGroup resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetParameterGroup(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ParameterGroupState, opts ...pulumi.ResourceOption) (*ParameterGroup, error) {
	var resource ParameterGroup
	err := ctx.ReadResource("aws:dax/parameterGroup:ParameterGroup", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ParameterGroup resources.
type parameterGroupState struct {
	// A description of the parameter group.
	Description *string `pulumi:"description"`
	// The name of the parameter group.
	Name *string `pulumi:"name"`
	// The parameters of the parameter group.
	Parameters []ParameterGroupParameter `pulumi:"parameters"`
}

type ParameterGroupState struct {
	// A description of the parameter group.
	Description pulumi.StringPtrInput
	// The name of the parameter group.
	Name pulumi.StringPtrInput
	// The parameters of the parameter group.
	Parameters ParameterGroupParameterArrayInput
}

func (ParameterGroupState) ElementType() reflect.Type {
	return reflect.TypeOf((*parameterGroupState)(nil)).Elem()
}

type parameterGroupArgs struct {
	// A description of the parameter group.
	Description *string `pulumi:"description"`
	// The name of the parameter group.
	Name *string `pulumi:"name"`
	// The parameters of the parameter group.
	Parameters []ParameterGroupParameter `pulumi:"parameters"`
}

// The set of arguments for constructing a ParameterGroup resource.
type ParameterGroupArgs struct {
	// A description of the parameter group.
	Description pulumi.StringPtrInput
	// The name of the parameter group.
	Name pulumi.StringPtrInput
	// The parameters of the parameter group.
	Parameters ParameterGroupParameterArrayInput
}

func (ParameterGroupArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*parameterGroupArgs)(nil)).Elem()
}

type ParameterGroupInput interface {
	pulumi.Input

	ToParameterGroupOutput() ParameterGroupOutput
	ToParameterGroupOutputWithContext(ctx context.Context) ParameterGroupOutput
}

func (*ParameterGroup) ElementType() reflect.Type {
	return reflect.TypeOf((**ParameterGroup)(nil)).Elem()
}

func (i *ParameterGroup) ToParameterGroupOutput() ParameterGroupOutput {
	return i.ToParameterGroupOutputWithContext(context.Background())
}

func (i *ParameterGroup) ToParameterGroupOutputWithContext(ctx context.Context) ParameterGroupOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ParameterGroupOutput)
}

// ParameterGroupArrayInput is an input type that accepts ParameterGroupArray and ParameterGroupArrayOutput values.
// You can construct a concrete instance of `ParameterGroupArrayInput` via:
//
//	ParameterGroupArray{ ParameterGroupArgs{...} }
type ParameterGroupArrayInput interface {
	pulumi.Input

	ToParameterGroupArrayOutput() ParameterGroupArrayOutput
	ToParameterGroupArrayOutputWithContext(context.Context) ParameterGroupArrayOutput
}

type ParameterGroupArray []ParameterGroupInput

func (ParameterGroupArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ParameterGroup)(nil)).Elem()
}

func (i ParameterGroupArray) ToParameterGroupArrayOutput() ParameterGroupArrayOutput {
	return i.ToParameterGroupArrayOutputWithContext(context.Background())
}

func (i ParameterGroupArray) ToParameterGroupArrayOutputWithContext(ctx context.Context) ParameterGroupArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ParameterGroupArrayOutput)
}

// ParameterGroupMapInput is an input type that accepts ParameterGroupMap and ParameterGroupMapOutput values.
// You can construct a concrete instance of `ParameterGroupMapInput` via:
//
//	ParameterGroupMap{ "key": ParameterGroupArgs{...} }
type ParameterGroupMapInput interface {
	pulumi.Input

	ToParameterGroupMapOutput() ParameterGroupMapOutput
	ToParameterGroupMapOutputWithContext(context.Context) ParameterGroupMapOutput
}

type ParameterGroupMap map[string]ParameterGroupInput

func (ParameterGroupMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ParameterGroup)(nil)).Elem()
}

func (i ParameterGroupMap) ToParameterGroupMapOutput() ParameterGroupMapOutput {
	return i.ToParameterGroupMapOutputWithContext(context.Background())
}

func (i ParameterGroupMap) ToParameterGroupMapOutputWithContext(ctx context.Context) ParameterGroupMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ParameterGroupMapOutput)
}

type ParameterGroupOutput struct{ *pulumi.OutputState }

func (ParameterGroupOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ParameterGroup)(nil)).Elem()
}

func (o ParameterGroupOutput) ToParameterGroupOutput() ParameterGroupOutput {
	return o
}

func (o ParameterGroupOutput) ToParameterGroupOutputWithContext(ctx context.Context) ParameterGroupOutput {
	return o
}

// A description of the parameter group.
func (o ParameterGroupOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ParameterGroup) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// The name of the parameter group.
func (o ParameterGroupOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *ParameterGroup) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The parameters of the parameter group.
func (o ParameterGroupOutput) Parameters() ParameterGroupParameterArrayOutput {
	return o.ApplyT(func(v *ParameterGroup) ParameterGroupParameterArrayOutput { return v.Parameters }).(ParameterGroupParameterArrayOutput)
}

type ParameterGroupArrayOutput struct{ *pulumi.OutputState }

func (ParameterGroupArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ParameterGroup)(nil)).Elem()
}

func (o ParameterGroupArrayOutput) ToParameterGroupArrayOutput() ParameterGroupArrayOutput {
	return o
}

func (o ParameterGroupArrayOutput) ToParameterGroupArrayOutputWithContext(ctx context.Context) ParameterGroupArrayOutput {
	return o
}

func (o ParameterGroupArrayOutput) Index(i pulumi.IntInput) ParameterGroupOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ParameterGroup {
		return vs[0].([]*ParameterGroup)[vs[1].(int)]
	}).(ParameterGroupOutput)
}

type ParameterGroupMapOutput struct{ *pulumi.OutputState }

func (ParameterGroupMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ParameterGroup)(nil)).Elem()
}

func (o ParameterGroupMapOutput) ToParameterGroupMapOutput() ParameterGroupMapOutput {
	return o
}

func (o ParameterGroupMapOutput) ToParameterGroupMapOutputWithContext(ctx context.Context) ParameterGroupMapOutput {
	return o
}

func (o ParameterGroupMapOutput) MapIndex(k pulumi.StringInput) ParameterGroupOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ParameterGroup {
		return vs[0].(map[string]*ParameterGroup)[vs[1].(string)]
	}).(ParameterGroupOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ParameterGroupInput)(nil)).Elem(), &ParameterGroup{})
	pulumi.RegisterInputType(reflect.TypeOf((*ParameterGroupArrayInput)(nil)).Elem(), ParameterGroupArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ParameterGroupMapInput)(nil)).Elem(), ParameterGroupMap{})
	pulumi.RegisterOutputType(ParameterGroupOutput{})
	pulumi.RegisterOutputType(ParameterGroupArrayOutput{})
	pulumi.RegisterOutputType(ParameterGroupMapOutput{})
}

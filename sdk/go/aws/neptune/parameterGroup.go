// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package neptune

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages a Neptune Parameter Group
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/neptune"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := neptune.NewParameterGroup(ctx, "example", &neptune.ParameterGroupArgs{
//				Family: pulumi.String("neptune1"),
//				Parameters: neptune.ParameterGroupParameterArray{
//					&neptune.ParameterGroupParameterArgs{
//						Name:  pulumi.String("neptune_query_timeout"),
//						Value: pulumi.String("25"),
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
// Using `pulumi import`, import Neptune Parameter Groups using the `name`. For example:
//
// ```sh
//
//	$ pulumi import aws:neptune/parameterGroup:ParameterGroup some_pg some-pg
//
// ```
type ParameterGroup struct {
	pulumi.CustomResourceState

	// The Neptune parameter group Amazon Resource Name (ARN).
	Arn pulumi.StringOutput `pulumi:"arn"`
	// The description of the Neptune parameter group. Defaults to "Managed by Pulumi".
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// The family of the Neptune parameter group.
	Family pulumi.StringOutput `pulumi:"family"`
	// The name of the Neptune parameter.
	Name pulumi.StringOutput `pulumi:"name"`
	// A list of Neptune parameters to apply.
	Parameters ParameterGroupParameterArrayOutput `pulumi:"parameters"`
	// A map of tags to assign to the resource. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	TagsAll pulumi.StringMapOutput `pulumi:"tagsAll"`
}

// NewParameterGroup registers a new resource with the given unique name, arguments, and options.
func NewParameterGroup(ctx *pulumi.Context,
	name string, args *ParameterGroupArgs, opts ...pulumi.ResourceOption) (*ParameterGroup, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Family == nil {
		return nil, errors.New("invalid value for required argument 'Family'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ParameterGroup
	err := ctx.RegisterResource("aws:neptune/parameterGroup:ParameterGroup", name, args, &resource, opts...)
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
	err := ctx.ReadResource("aws:neptune/parameterGroup:ParameterGroup", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ParameterGroup resources.
type parameterGroupState struct {
	// The Neptune parameter group Amazon Resource Name (ARN).
	Arn *string `pulumi:"arn"`
	// The description of the Neptune parameter group. Defaults to "Managed by Pulumi".
	Description *string `pulumi:"description"`
	// The family of the Neptune parameter group.
	Family *string `pulumi:"family"`
	// The name of the Neptune parameter.
	Name *string `pulumi:"name"`
	// A list of Neptune parameters to apply.
	Parameters []ParameterGroupParameter `pulumi:"parameters"`
	// A map of tags to assign to the resource. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	TagsAll map[string]string `pulumi:"tagsAll"`
}

type ParameterGroupState struct {
	// The Neptune parameter group Amazon Resource Name (ARN).
	Arn pulumi.StringPtrInput
	// The description of the Neptune parameter group. Defaults to "Managed by Pulumi".
	Description pulumi.StringPtrInput
	// The family of the Neptune parameter group.
	Family pulumi.StringPtrInput
	// The name of the Neptune parameter.
	Name pulumi.StringPtrInput
	// A list of Neptune parameters to apply.
	Parameters ParameterGroupParameterArrayInput
	// A map of tags to assign to the resource. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	TagsAll pulumi.StringMapInput
}

func (ParameterGroupState) ElementType() reflect.Type {
	return reflect.TypeOf((*parameterGroupState)(nil)).Elem()
}

type parameterGroupArgs struct {
	// The description of the Neptune parameter group. Defaults to "Managed by Pulumi".
	Description *string `pulumi:"description"`
	// The family of the Neptune parameter group.
	Family string `pulumi:"family"`
	// The name of the Neptune parameter.
	Name *string `pulumi:"name"`
	// A list of Neptune parameters to apply.
	Parameters []ParameterGroupParameter `pulumi:"parameters"`
	// A map of tags to assign to the resource. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
}

// The set of arguments for constructing a ParameterGroup resource.
type ParameterGroupArgs struct {
	// The description of the Neptune parameter group. Defaults to "Managed by Pulumi".
	Description pulumi.StringPtrInput
	// The family of the Neptune parameter group.
	Family pulumi.StringInput
	// The name of the Neptune parameter.
	Name pulumi.StringPtrInput
	// A list of Neptune parameters to apply.
	Parameters ParameterGroupParameterArrayInput
	// A map of tags to assign to the resource. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
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

// The Neptune parameter group Amazon Resource Name (ARN).
func (o ParameterGroupOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v *ParameterGroup) pulumi.StringOutput { return v.Arn }).(pulumi.StringOutput)
}

// The description of the Neptune parameter group. Defaults to "Managed by Pulumi".
func (o ParameterGroupOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ParameterGroup) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// The family of the Neptune parameter group.
func (o ParameterGroupOutput) Family() pulumi.StringOutput {
	return o.ApplyT(func(v *ParameterGroup) pulumi.StringOutput { return v.Family }).(pulumi.StringOutput)
}

// The name of the Neptune parameter.
func (o ParameterGroupOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *ParameterGroup) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// A list of Neptune parameters to apply.
func (o ParameterGroupOutput) Parameters() ParameterGroupParameterArrayOutput {
	return o.ApplyT(func(v *ParameterGroup) ParameterGroupParameterArrayOutput { return v.Parameters }).(ParameterGroupParameterArrayOutput)
}

// A map of tags to assign to the resource. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
func (o ParameterGroupOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *ParameterGroup) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
func (o ParameterGroupOutput) TagsAll() pulumi.StringMapOutput {
	return o.ApplyT(func(v *ParameterGroup) pulumi.StringMapOutput { return v.TagsAll }).(pulumi.StringMapOutput)
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

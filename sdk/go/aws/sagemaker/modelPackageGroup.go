// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package sagemaker

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a SageMaker Model Package Group resource.
//
// ## Example Usage
// ### Basic usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/sagemaker"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := sagemaker.NewModelPackageGroup(ctx, "example", &sagemaker.ModelPackageGroupArgs{
//				ModelPackageGroupName: pulumi.String("example"),
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
// Using `pulumi import`, import SageMaker Model Package Groups using the `name`. For example:
//
// ```sh
//
//	$ pulumi import aws:sagemaker/modelPackageGroup:ModelPackageGroup test_model_package_group my-code-repo
//
// ```
type ModelPackageGroup struct {
	pulumi.CustomResourceState

	// The Amazon Resource Name (ARN) assigned by AWS to this Model Package Group.
	Arn pulumi.StringOutput `pulumi:"arn"`
	// A description for the model group.
	ModelPackageGroupDescription pulumi.StringPtrOutput `pulumi:"modelPackageGroupDescription"`
	// The name of the model group.
	ModelPackageGroupName pulumi.StringOutput `pulumi:"modelPackageGroupName"`
	// A map of tags to assign to the resource. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapOutput `pulumi:"tagsAll"`
}

// NewModelPackageGroup registers a new resource with the given unique name, arguments, and options.
func NewModelPackageGroup(ctx *pulumi.Context,
	name string, args *ModelPackageGroupArgs, opts ...pulumi.ResourceOption) (*ModelPackageGroup, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ModelPackageGroupName == nil {
		return nil, errors.New("invalid value for required argument 'ModelPackageGroupName'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ModelPackageGroup
	err := ctx.RegisterResource("aws:sagemaker/modelPackageGroup:ModelPackageGroup", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetModelPackageGroup gets an existing ModelPackageGroup resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetModelPackageGroup(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ModelPackageGroupState, opts ...pulumi.ResourceOption) (*ModelPackageGroup, error) {
	var resource ModelPackageGroup
	err := ctx.ReadResource("aws:sagemaker/modelPackageGroup:ModelPackageGroup", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ModelPackageGroup resources.
type modelPackageGroupState struct {
	// The Amazon Resource Name (ARN) assigned by AWS to this Model Package Group.
	Arn *string `pulumi:"arn"`
	// A description for the model group.
	ModelPackageGroupDescription *string `pulumi:"modelPackageGroupDescription"`
	// The name of the model group.
	ModelPackageGroupName *string `pulumi:"modelPackageGroupName"`
	// A map of tags to assign to the resource. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll map[string]string `pulumi:"tagsAll"`
}

type ModelPackageGroupState struct {
	// The Amazon Resource Name (ARN) assigned by AWS to this Model Package Group.
	Arn pulumi.StringPtrInput
	// A description for the model group.
	ModelPackageGroupDescription pulumi.StringPtrInput
	// The name of the model group.
	ModelPackageGroupName pulumi.StringPtrInput
	// A map of tags to assign to the resource. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapInput
}

func (ModelPackageGroupState) ElementType() reflect.Type {
	return reflect.TypeOf((*modelPackageGroupState)(nil)).Elem()
}

type modelPackageGroupArgs struct {
	// A description for the model group.
	ModelPackageGroupDescription *string `pulumi:"modelPackageGroupDescription"`
	// The name of the model group.
	ModelPackageGroupName string `pulumi:"modelPackageGroupName"`
	// A map of tags to assign to the resource. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
}

// The set of arguments for constructing a ModelPackageGroup resource.
type ModelPackageGroupArgs struct {
	// A description for the model group.
	ModelPackageGroupDescription pulumi.StringPtrInput
	// The name of the model group.
	ModelPackageGroupName pulumi.StringInput
	// A map of tags to assign to the resource. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
}

func (ModelPackageGroupArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*modelPackageGroupArgs)(nil)).Elem()
}

type ModelPackageGroupInput interface {
	pulumi.Input

	ToModelPackageGroupOutput() ModelPackageGroupOutput
	ToModelPackageGroupOutputWithContext(ctx context.Context) ModelPackageGroupOutput
}

func (*ModelPackageGroup) ElementType() reflect.Type {
	return reflect.TypeOf((**ModelPackageGroup)(nil)).Elem()
}

func (i *ModelPackageGroup) ToModelPackageGroupOutput() ModelPackageGroupOutput {
	return i.ToModelPackageGroupOutputWithContext(context.Background())
}

func (i *ModelPackageGroup) ToModelPackageGroupOutputWithContext(ctx context.Context) ModelPackageGroupOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ModelPackageGroupOutput)
}

// ModelPackageGroupArrayInput is an input type that accepts ModelPackageGroupArray and ModelPackageGroupArrayOutput values.
// You can construct a concrete instance of `ModelPackageGroupArrayInput` via:
//
//	ModelPackageGroupArray{ ModelPackageGroupArgs{...} }
type ModelPackageGroupArrayInput interface {
	pulumi.Input

	ToModelPackageGroupArrayOutput() ModelPackageGroupArrayOutput
	ToModelPackageGroupArrayOutputWithContext(context.Context) ModelPackageGroupArrayOutput
}

type ModelPackageGroupArray []ModelPackageGroupInput

func (ModelPackageGroupArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ModelPackageGroup)(nil)).Elem()
}

func (i ModelPackageGroupArray) ToModelPackageGroupArrayOutput() ModelPackageGroupArrayOutput {
	return i.ToModelPackageGroupArrayOutputWithContext(context.Background())
}

func (i ModelPackageGroupArray) ToModelPackageGroupArrayOutputWithContext(ctx context.Context) ModelPackageGroupArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ModelPackageGroupArrayOutput)
}

// ModelPackageGroupMapInput is an input type that accepts ModelPackageGroupMap and ModelPackageGroupMapOutput values.
// You can construct a concrete instance of `ModelPackageGroupMapInput` via:
//
//	ModelPackageGroupMap{ "key": ModelPackageGroupArgs{...} }
type ModelPackageGroupMapInput interface {
	pulumi.Input

	ToModelPackageGroupMapOutput() ModelPackageGroupMapOutput
	ToModelPackageGroupMapOutputWithContext(context.Context) ModelPackageGroupMapOutput
}

type ModelPackageGroupMap map[string]ModelPackageGroupInput

func (ModelPackageGroupMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ModelPackageGroup)(nil)).Elem()
}

func (i ModelPackageGroupMap) ToModelPackageGroupMapOutput() ModelPackageGroupMapOutput {
	return i.ToModelPackageGroupMapOutputWithContext(context.Background())
}

func (i ModelPackageGroupMap) ToModelPackageGroupMapOutputWithContext(ctx context.Context) ModelPackageGroupMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ModelPackageGroupMapOutput)
}

type ModelPackageGroupOutput struct{ *pulumi.OutputState }

func (ModelPackageGroupOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ModelPackageGroup)(nil)).Elem()
}

func (o ModelPackageGroupOutput) ToModelPackageGroupOutput() ModelPackageGroupOutput {
	return o
}

func (o ModelPackageGroupOutput) ToModelPackageGroupOutputWithContext(ctx context.Context) ModelPackageGroupOutput {
	return o
}

// The Amazon Resource Name (ARN) assigned by AWS to this Model Package Group.
func (o ModelPackageGroupOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v *ModelPackageGroup) pulumi.StringOutput { return v.Arn }).(pulumi.StringOutput)
}

// A description for the model group.
func (o ModelPackageGroupOutput) ModelPackageGroupDescription() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ModelPackageGroup) pulumi.StringPtrOutput { return v.ModelPackageGroupDescription }).(pulumi.StringPtrOutput)
}

// The name of the model group.
func (o ModelPackageGroupOutput) ModelPackageGroupName() pulumi.StringOutput {
	return o.ApplyT(func(v *ModelPackageGroup) pulumi.StringOutput { return v.ModelPackageGroupName }).(pulumi.StringOutput)
}

// A map of tags to assign to the resource. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
func (o ModelPackageGroupOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *ModelPackageGroup) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
//
// Deprecated: Please use `tags` instead.
func (o ModelPackageGroupOutput) TagsAll() pulumi.StringMapOutput {
	return o.ApplyT(func(v *ModelPackageGroup) pulumi.StringMapOutput { return v.TagsAll }).(pulumi.StringMapOutput)
}

type ModelPackageGroupArrayOutput struct{ *pulumi.OutputState }

func (ModelPackageGroupArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ModelPackageGroup)(nil)).Elem()
}

func (o ModelPackageGroupArrayOutput) ToModelPackageGroupArrayOutput() ModelPackageGroupArrayOutput {
	return o
}

func (o ModelPackageGroupArrayOutput) ToModelPackageGroupArrayOutputWithContext(ctx context.Context) ModelPackageGroupArrayOutput {
	return o
}

func (o ModelPackageGroupArrayOutput) Index(i pulumi.IntInput) ModelPackageGroupOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ModelPackageGroup {
		return vs[0].([]*ModelPackageGroup)[vs[1].(int)]
	}).(ModelPackageGroupOutput)
}

type ModelPackageGroupMapOutput struct{ *pulumi.OutputState }

func (ModelPackageGroupMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ModelPackageGroup)(nil)).Elem()
}

func (o ModelPackageGroupMapOutput) ToModelPackageGroupMapOutput() ModelPackageGroupMapOutput {
	return o
}

func (o ModelPackageGroupMapOutput) ToModelPackageGroupMapOutputWithContext(ctx context.Context) ModelPackageGroupMapOutput {
	return o
}

func (o ModelPackageGroupMapOutput) MapIndex(k pulumi.StringInput) ModelPackageGroupOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ModelPackageGroup {
		return vs[0].(map[string]*ModelPackageGroup)[vs[1].(string)]
	}).(ModelPackageGroupOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ModelPackageGroupInput)(nil)).Elem(), &ModelPackageGroup{})
	pulumi.RegisterInputType(reflect.TypeOf((*ModelPackageGroupArrayInput)(nil)).Elem(), ModelPackageGroupArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ModelPackageGroupMapInput)(nil)).Elem(), ModelPackageGroupMap{})
	pulumi.RegisterOutputType(ModelPackageGroupOutput{})
	pulumi.RegisterOutputType(ModelPackageGroupArrayOutput{})
	pulumi.RegisterOutputType(ModelPackageGroupMapOutput{})
}

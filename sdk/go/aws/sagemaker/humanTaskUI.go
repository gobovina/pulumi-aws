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

// Provides a SageMaker Human Task UI resource.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/sagemaker"
//	"github.com/pulumi/pulumi-std/sdk/go/std"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			invokeFile, err := std.File(ctx, &std.FileArgs{
//				Input: "sagemaker-human-task-ui-template.html",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = sagemaker.NewHumanTaskUI(ctx, "example", &sagemaker.HumanTaskUIArgs{
//				HumanTaskUiName: pulumi.String("example"),
//				UiTemplate: &sagemaker.HumanTaskUIUiTemplateArgs{
//					Content: invokeFile.Result,
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
// Using `pulumi import`, import SageMaker Human Task UIs using the `human_task_ui_name`. For example:
//
// ```sh
//
//	$ pulumi import aws:sagemaker/humanTaskUI:HumanTaskUI example example
//
// ```
type HumanTaskUI struct {
	pulumi.CustomResourceState

	// The Amazon Resource Name (ARN) assigned by AWS to this Human Task UI.
	Arn pulumi.StringOutput `pulumi:"arn"`
	// The name of the Human Task UI.
	HumanTaskUiName pulumi.StringOutput `pulumi:"humanTaskUiName"`
	// A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapOutput `pulumi:"tagsAll"`
	// The Liquid template for the worker user interface. See UI Template below.
	UiTemplate HumanTaskUIUiTemplateOutput `pulumi:"uiTemplate"`
}

// NewHumanTaskUI registers a new resource with the given unique name, arguments, and options.
func NewHumanTaskUI(ctx *pulumi.Context,
	name string, args *HumanTaskUIArgs, opts ...pulumi.ResourceOption) (*HumanTaskUI, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.HumanTaskUiName == nil {
		return nil, errors.New("invalid value for required argument 'HumanTaskUiName'")
	}
	if args.UiTemplate == nil {
		return nil, errors.New("invalid value for required argument 'UiTemplate'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource HumanTaskUI
	err := ctx.RegisterResource("aws:sagemaker/humanTaskUI:HumanTaskUI", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetHumanTaskUI gets an existing HumanTaskUI resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetHumanTaskUI(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *HumanTaskUIState, opts ...pulumi.ResourceOption) (*HumanTaskUI, error) {
	var resource HumanTaskUI
	err := ctx.ReadResource("aws:sagemaker/humanTaskUI:HumanTaskUI", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering HumanTaskUI resources.
type humanTaskUIState struct {
	// The Amazon Resource Name (ARN) assigned by AWS to this Human Task UI.
	Arn *string `pulumi:"arn"`
	// The name of the Human Task UI.
	HumanTaskUiName *string `pulumi:"humanTaskUiName"`
	// A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll map[string]string `pulumi:"tagsAll"`
	// The Liquid template for the worker user interface. See UI Template below.
	UiTemplate *HumanTaskUIUiTemplate `pulumi:"uiTemplate"`
}

type HumanTaskUIState struct {
	// The Amazon Resource Name (ARN) assigned by AWS to this Human Task UI.
	Arn pulumi.StringPtrInput
	// The name of the Human Task UI.
	HumanTaskUiName pulumi.StringPtrInput
	// A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapInput
	// The Liquid template for the worker user interface. See UI Template below.
	UiTemplate HumanTaskUIUiTemplatePtrInput
}

func (HumanTaskUIState) ElementType() reflect.Type {
	return reflect.TypeOf((*humanTaskUIState)(nil)).Elem()
}

type humanTaskUIArgs struct {
	// The name of the Human Task UI.
	HumanTaskUiName string `pulumi:"humanTaskUiName"`
	// A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// The Liquid template for the worker user interface. See UI Template below.
	UiTemplate HumanTaskUIUiTemplate `pulumi:"uiTemplate"`
}

// The set of arguments for constructing a HumanTaskUI resource.
type HumanTaskUIArgs struct {
	// The name of the Human Task UI.
	HumanTaskUiName pulumi.StringInput
	// A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// The Liquid template for the worker user interface. See UI Template below.
	UiTemplate HumanTaskUIUiTemplateInput
}

func (HumanTaskUIArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*humanTaskUIArgs)(nil)).Elem()
}

type HumanTaskUIInput interface {
	pulumi.Input

	ToHumanTaskUIOutput() HumanTaskUIOutput
	ToHumanTaskUIOutputWithContext(ctx context.Context) HumanTaskUIOutput
}

func (*HumanTaskUI) ElementType() reflect.Type {
	return reflect.TypeOf((**HumanTaskUI)(nil)).Elem()
}

func (i *HumanTaskUI) ToHumanTaskUIOutput() HumanTaskUIOutput {
	return i.ToHumanTaskUIOutputWithContext(context.Background())
}

func (i *HumanTaskUI) ToHumanTaskUIOutputWithContext(ctx context.Context) HumanTaskUIOutput {
	return pulumi.ToOutputWithContext(ctx, i).(HumanTaskUIOutput)
}

// HumanTaskUIArrayInput is an input type that accepts HumanTaskUIArray and HumanTaskUIArrayOutput values.
// You can construct a concrete instance of `HumanTaskUIArrayInput` via:
//
//	HumanTaskUIArray{ HumanTaskUIArgs{...} }
type HumanTaskUIArrayInput interface {
	pulumi.Input

	ToHumanTaskUIArrayOutput() HumanTaskUIArrayOutput
	ToHumanTaskUIArrayOutputWithContext(context.Context) HumanTaskUIArrayOutput
}

type HumanTaskUIArray []HumanTaskUIInput

func (HumanTaskUIArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*HumanTaskUI)(nil)).Elem()
}

func (i HumanTaskUIArray) ToHumanTaskUIArrayOutput() HumanTaskUIArrayOutput {
	return i.ToHumanTaskUIArrayOutputWithContext(context.Background())
}

func (i HumanTaskUIArray) ToHumanTaskUIArrayOutputWithContext(ctx context.Context) HumanTaskUIArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(HumanTaskUIArrayOutput)
}

// HumanTaskUIMapInput is an input type that accepts HumanTaskUIMap and HumanTaskUIMapOutput values.
// You can construct a concrete instance of `HumanTaskUIMapInput` via:
//
//	HumanTaskUIMap{ "key": HumanTaskUIArgs{...} }
type HumanTaskUIMapInput interface {
	pulumi.Input

	ToHumanTaskUIMapOutput() HumanTaskUIMapOutput
	ToHumanTaskUIMapOutputWithContext(context.Context) HumanTaskUIMapOutput
}

type HumanTaskUIMap map[string]HumanTaskUIInput

func (HumanTaskUIMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*HumanTaskUI)(nil)).Elem()
}

func (i HumanTaskUIMap) ToHumanTaskUIMapOutput() HumanTaskUIMapOutput {
	return i.ToHumanTaskUIMapOutputWithContext(context.Background())
}

func (i HumanTaskUIMap) ToHumanTaskUIMapOutputWithContext(ctx context.Context) HumanTaskUIMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(HumanTaskUIMapOutput)
}

type HumanTaskUIOutput struct{ *pulumi.OutputState }

func (HumanTaskUIOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**HumanTaskUI)(nil)).Elem()
}

func (o HumanTaskUIOutput) ToHumanTaskUIOutput() HumanTaskUIOutput {
	return o
}

func (o HumanTaskUIOutput) ToHumanTaskUIOutputWithContext(ctx context.Context) HumanTaskUIOutput {
	return o
}

// The Amazon Resource Name (ARN) assigned by AWS to this Human Task UI.
func (o HumanTaskUIOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v *HumanTaskUI) pulumi.StringOutput { return v.Arn }).(pulumi.StringOutput)
}

// The name of the Human Task UI.
func (o HumanTaskUIOutput) HumanTaskUiName() pulumi.StringOutput {
	return o.ApplyT(func(v *HumanTaskUI) pulumi.StringOutput { return v.HumanTaskUiName }).(pulumi.StringOutput)
}

// A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
func (o HumanTaskUIOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *HumanTaskUI) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
//
// Deprecated: Please use `tags` instead.
func (o HumanTaskUIOutput) TagsAll() pulumi.StringMapOutput {
	return o.ApplyT(func(v *HumanTaskUI) pulumi.StringMapOutput { return v.TagsAll }).(pulumi.StringMapOutput)
}

// The Liquid template for the worker user interface. See UI Template below.
func (o HumanTaskUIOutput) UiTemplate() HumanTaskUIUiTemplateOutput {
	return o.ApplyT(func(v *HumanTaskUI) HumanTaskUIUiTemplateOutput { return v.UiTemplate }).(HumanTaskUIUiTemplateOutput)
}

type HumanTaskUIArrayOutput struct{ *pulumi.OutputState }

func (HumanTaskUIArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*HumanTaskUI)(nil)).Elem()
}

func (o HumanTaskUIArrayOutput) ToHumanTaskUIArrayOutput() HumanTaskUIArrayOutput {
	return o
}

func (o HumanTaskUIArrayOutput) ToHumanTaskUIArrayOutputWithContext(ctx context.Context) HumanTaskUIArrayOutput {
	return o
}

func (o HumanTaskUIArrayOutput) Index(i pulumi.IntInput) HumanTaskUIOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *HumanTaskUI {
		return vs[0].([]*HumanTaskUI)[vs[1].(int)]
	}).(HumanTaskUIOutput)
}

type HumanTaskUIMapOutput struct{ *pulumi.OutputState }

func (HumanTaskUIMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*HumanTaskUI)(nil)).Elem()
}

func (o HumanTaskUIMapOutput) ToHumanTaskUIMapOutput() HumanTaskUIMapOutput {
	return o
}

func (o HumanTaskUIMapOutput) ToHumanTaskUIMapOutputWithContext(ctx context.Context) HumanTaskUIMapOutput {
	return o
}

func (o HumanTaskUIMapOutput) MapIndex(k pulumi.StringInput) HumanTaskUIOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *HumanTaskUI {
		return vs[0].(map[string]*HumanTaskUI)[vs[1].(string)]
	}).(HumanTaskUIOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*HumanTaskUIInput)(nil)).Elem(), &HumanTaskUI{})
	pulumi.RegisterInputType(reflect.TypeOf((*HumanTaskUIArrayInput)(nil)).Elem(), HumanTaskUIArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*HumanTaskUIMapInput)(nil)).Elem(), HumanTaskUIMap{})
	pulumi.RegisterOutputType(HumanTaskUIOutput{})
	pulumi.RegisterOutputType(HumanTaskUIArrayOutput{})
	pulumi.RegisterOutputType(HumanTaskUIMapOutput{})
}

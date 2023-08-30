// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package apprunner

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages an App Runner AutoScaling Configuration Version.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/apprunner"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := apprunner.NewAutoScalingConfigurationVersion(ctx, "example", &apprunner.AutoScalingConfigurationVersionArgs{
//				AutoScalingConfigurationName: pulumi.String("example"),
//				MaxConcurrency:               pulumi.Int(50),
//				MaxSize:                      pulumi.Int(10),
//				MinSize:                      pulumi.Int(2),
//				Tags: pulumi.StringMap{
//					"Name": pulumi.String("example-apprunner-autoscaling"),
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
// Using `pulumi import`, import App Runner AutoScaling Configuration Versions using the `arn`. For example:
//
// ```sh
//
//	$ pulumi import aws:apprunner/autoScalingConfigurationVersion:AutoScalingConfigurationVersion example "arn:aws:apprunner:us-east-1:1234567890:autoscalingconfiguration/example/1/69bdfe0115224b0db49398b7beb68e0f
//
// ```
type AutoScalingConfigurationVersion struct {
	pulumi.CustomResourceState

	// ARN of this auto scaling configuration version.
	Arn pulumi.StringOutput `pulumi:"arn"`
	// Name of the auto scaling configuration.
	AutoScalingConfigurationName pulumi.StringOutput `pulumi:"autoScalingConfigurationName"`
	// The revision of this auto scaling configuration.
	AutoScalingConfigurationRevision pulumi.IntOutput `pulumi:"autoScalingConfigurationRevision"`
	// Whether the auto scaling configuration has the highest `autoScalingConfigurationRevision` among all configurations that share the same `autoScalingConfigurationName`.
	Latest pulumi.BoolOutput `pulumi:"latest"`
	// Maximal number of concurrent requests that you want an instance to process. When the number of concurrent requests goes over this limit, App Runner scales up your service.
	MaxConcurrency pulumi.IntPtrOutput `pulumi:"maxConcurrency"`
	// Maximal number of instances that App Runner provisions for your service.
	MaxSize pulumi.IntPtrOutput `pulumi:"maxSize"`
	// Minimal number of instances that App Runner provisions for your service.
	MinSize pulumi.IntPtrOutput `pulumi:"minSize"`
	// Current state of the auto scaling configuration. An INACTIVE configuration revision has been deleted and can't be used. It is permanently removed some time after deletion.
	Status pulumi.StringOutput `pulumi:"status"`
	// Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	TagsAll pulumi.StringMapOutput `pulumi:"tagsAll"`
}

// NewAutoScalingConfigurationVersion registers a new resource with the given unique name, arguments, and options.
func NewAutoScalingConfigurationVersion(ctx *pulumi.Context,
	name string, args *AutoScalingConfigurationVersionArgs, opts ...pulumi.ResourceOption) (*AutoScalingConfigurationVersion, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AutoScalingConfigurationName == nil {
		return nil, errors.New("invalid value for required argument 'AutoScalingConfigurationName'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource AutoScalingConfigurationVersion
	err := ctx.RegisterResource("aws:apprunner/autoScalingConfigurationVersion:AutoScalingConfigurationVersion", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAutoScalingConfigurationVersion gets an existing AutoScalingConfigurationVersion resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAutoScalingConfigurationVersion(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AutoScalingConfigurationVersionState, opts ...pulumi.ResourceOption) (*AutoScalingConfigurationVersion, error) {
	var resource AutoScalingConfigurationVersion
	err := ctx.ReadResource("aws:apprunner/autoScalingConfigurationVersion:AutoScalingConfigurationVersion", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AutoScalingConfigurationVersion resources.
type autoScalingConfigurationVersionState struct {
	// ARN of this auto scaling configuration version.
	Arn *string `pulumi:"arn"`
	// Name of the auto scaling configuration.
	AutoScalingConfigurationName *string `pulumi:"autoScalingConfigurationName"`
	// The revision of this auto scaling configuration.
	AutoScalingConfigurationRevision *int `pulumi:"autoScalingConfigurationRevision"`
	// Whether the auto scaling configuration has the highest `autoScalingConfigurationRevision` among all configurations that share the same `autoScalingConfigurationName`.
	Latest *bool `pulumi:"latest"`
	// Maximal number of concurrent requests that you want an instance to process. When the number of concurrent requests goes over this limit, App Runner scales up your service.
	MaxConcurrency *int `pulumi:"maxConcurrency"`
	// Maximal number of instances that App Runner provisions for your service.
	MaxSize *int `pulumi:"maxSize"`
	// Minimal number of instances that App Runner provisions for your service.
	MinSize *int `pulumi:"minSize"`
	// Current state of the auto scaling configuration. An INACTIVE configuration revision has been deleted and can't be used. It is permanently removed some time after deletion.
	Status *string `pulumi:"status"`
	// Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	TagsAll map[string]string `pulumi:"tagsAll"`
}

type AutoScalingConfigurationVersionState struct {
	// ARN of this auto scaling configuration version.
	Arn pulumi.StringPtrInput
	// Name of the auto scaling configuration.
	AutoScalingConfigurationName pulumi.StringPtrInput
	// The revision of this auto scaling configuration.
	AutoScalingConfigurationRevision pulumi.IntPtrInput
	// Whether the auto scaling configuration has the highest `autoScalingConfigurationRevision` among all configurations that share the same `autoScalingConfigurationName`.
	Latest pulumi.BoolPtrInput
	// Maximal number of concurrent requests that you want an instance to process. When the number of concurrent requests goes over this limit, App Runner scales up your service.
	MaxConcurrency pulumi.IntPtrInput
	// Maximal number of instances that App Runner provisions for your service.
	MaxSize pulumi.IntPtrInput
	// Minimal number of instances that App Runner provisions for your service.
	MinSize pulumi.IntPtrInput
	// Current state of the auto scaling configuration. An INACTIVE configuration revision has been deleted and can't be used. It is permanently removed some time after deletion.
	Status pulumi.StringPtrInput
	// Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	TagsAll pulumi.StringMapInput
}

func (AutoScalingConfigurationVersionState) ElementType() reflect.Type {
	return reflect.TypeOf((*autoScalingConfigurationVersionState)(nil)).Elem()
}

type autoScalingConfigurationVersionArgs struct {
	// Name of the auto scaling configuration.
	AutoScalingConfigurationName string `pulumi:"autoScalingConfigurationName"`
	// Maximal number of concurrent requests that you want an instance to process. When the number of concurrent requests goes over this limit, App Runner scales up your service.
	MaxConcurrency *int `pulumi:"maxConcurrency"`
	// Maximal number of instances that App Runner provisions for your service.
	MaxSize *int `pulumi:"maxSize"`
	// Minimal number of instances that App Runner provisions for your service.
	MinSize *int `pulumi:"minSize"`
	// Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
}

// The set of arguments for constructing a AutoScalingConfigurationVersion resource.
type AutoScalingConfigurationVersionArgs struct {
	// Name of the auto scaling configuration.
	AutoScalingConfigurationName pulumi.StringInput
	// Maximal number of concurrent requests that you want an instance to process. When the number of concurrent requests goes over this limit, App Runner scales up your service.
	MaxConcurrency pulumi.IntPtrInput
	// Maximal number of instances that App Runner provisions for your service.
	MaxSize pulumi.IntPtrInput
	// Minimal number of instances that App Runner provisions for your service.
	MinSize pulumi.IntPtrInput
	// Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
}

func (AutoScalingConfigurationVersionArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*autoScalingConfigurationVersionArgs)(nil)).Elem()
}

type AutoScalingConfigurationVersionInput interface {
	pulumi.Input

	ToAutoScalingConfigurationVersionOutput() AutoScalingConfigurationVersionOutput
	ToAutoScalingConfigurationVersionOutputWithContext(ctx context.Context) AutoScalingConfigurationVersionOutput
}

func (*AutoScalingConfigurationVersion) ElementType() reflect.Type {
	return reflect.TypeOf((**AutoScalingConfigurationVersion)(nil)).Elem()
}

func (i *AutoScalingConfigurationVersion) ToAutoScalingConfigurationVersionOutput() AutoScalingConfigurationVersionOutput {
	return i.ToAutoScalingConfigurationVersionOutputWithContext(context.Background())
}

func (i *AutoScalingConfigurationVersion) ToAutoScalingConfigurationVersionOutputWithContext(ctx context.Context) AutoScalingConfigurationVersionOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AutoScalingConfigurationVersionOutput)
}

// AutoScalingConfigurationVersionArrayInput is an input type that accepts AutoScalingConfigurationVersionArray and AutoScalingConfigurationVersionArrayOutput values.
// You can construct a concrete instance of `AutoScalingConfigurationVersionArrayInput` via:
//
//	AutoScalingConfigurationVersionArray{ AutoScalingConfigurationVersionArgs{...} }
type AutoScalingConfigurationVersionArrayInput interface {
	pulumi.Input

	ToAutoScalingConfigurationVersionArrayOutput() AutoScalingConfigurationVersionArrayOutput
	ToAutoScalingConfigurationVersionArrayOutputWithContext(context.Context) AutoScalingConfigurationVersionArrayOutput
}

type AutoScalingConfigurationVersionArray []AutoScalingConfigurationVersionInput

func (AutoScalingConfigurationVersionArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AutoScalingConfigurationVersion)(nil)).Elem()
}

func (i AutoScalingConfigurationVersionArray) ToAutoScalingConfigurationVersionArrayOutput() AutoScalingConfigurationVersionArrayOutput {
	return i.ToAutoScalingConfigurationVersionArrayOutputWithContext(context.Background())
}

func (i AutoScalingConfigurationVersionArray) ToAutoScalingConfigurationVersionArrayOutputWithContext(ctx context.Context) AutoScalingConfigurationVersionArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AutoScalingConfigurationVersionArrayOutput)
}

// AutoScalingConfigurationVersionMapInput is an input type that accepts AutoScalingConfigurationVersionMap and AutoScalingConfigurationVersionMapOutput values.
// You can construct a concrete instance of `AutoScalingConfigurationVersionMapInput` via:
//
//	AutoScalingConfigurationVersionMap{ "key": AutoScalingConfigurationVersionArgs{...} }
type AutoScalingConfigurationVersionMapInput interface {
	pulumi.Input

	ToAutoScalingConfigurationVersionMapOutput() AutoScalingConfigurationVersionMapOutput
	ToAutoScalingConfigurationVersionMapOutputWithContext(context.Context) AutoScalingConfigurationVersionMapOutput
}

type AutoScalingConfigurationVersionMap map[string]AutoScalingConfigurationVersionInput

func (AutoScalingConfigurationVersionMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AutoScalingConfigurationVersion)(nil)).Elem()
}

func (i AutoScalingConfigurationVersionMap) ToAutoScalingConfigurationVersionMapOutput() AutoScalingConfigurationVersionMapOutput {
	return i.ToAutoScalingConfigurationVersionMapOutputWithContext(context.Background())
}

func (i AutoScalingConfigurationVersionMap) ToAutoScalingConfigurationVersionMapOutputWithContext(ctx context.Context) AutoScalingConfigurationVersionMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AutoScalingConfigurationVersionMapOutput)
}

type AutoScalingConfigurationVersionOutput struct{ *pulumi.OutputState }

func (AutoScalingConfigurationVersionOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**AutoScalingConfigurationVersion)(nil)).Elem()
}

func (o AutoScalingConfigurationVersionOutput) ToAutoScalingConfigurationVersionOutput() AutoScalingConfigurationVersionOutput {
	return o
}

func (o AutoScalingConfigurationVersionOutput) ToAutoScalingConfigurationVersionOutputWithContext(ctx context.Context) AutoScalingConfigurationVersionOutput {
	return o
}

// ARN of this auto scaling configuration version.
func (o AutoScalingConfigurationVersionOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v *AutoScalingConfigurationVersion) pulumi.StringOutput { return v.Arn }).(pulumi.StringOutput)
}

// Name of the auto scaling configuration.
func (o AutoScalingConfigurationVersionOutput) AutoScalingConfigurationName() pulumi.StringOutput {
	return o.ApplyT(func(v *AutoScalingConfigurationVersion) pulumi.StringOutput { return v.AutoScalingConfigurationName }).(pulumi.StringOutput)
}

// The revision of this auto scaling configuration.
func (o AutoScalingConfigurationVersionOutput) AutoScalingConfigurationRevision() pulumi.IntOutput {
	return o.ApplyT(func(v *AutoScalingConfigurationVersion) pulumi.IntOutput { return v.AutoScalingConfigurationRevision }).(pulumi.IntOutput)
}

// Whether the auto scaling configuration has the highest `autoScalingConfigurationRevision` among all configurations that share the same `autoScalingConfigurationName`.
func (o AutoScalingConfigurationVersionOutput) Latest() pulumi.BoolOutput {
	return o.ApplyT(func(v *AutoScalingConfigurationVersion) pulumi.BoolOutput { return v.Latest }).(pulumi.BoolOutput)
}

// Maximal number of concurrent requests that you want an instance to process. When the number of concurrent requests goes over this limit, App Runner scales up your service.
func (o AutoScalingConfigurationVersionOutput) MaxConcurrency() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *AutoScalingConfigurationVersion) pulumi.IntPtrOutput { return v.MaxConcurrency }).(pulumi.IntPtrOutput)
}

// Maximal number of instances that App Runner provisions for your service.
func (o AutoScalingConfigurationVersionOutput) MaxSize() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *AutoScalingConfigurationVersion) pulumi.IntPtrOutput { return v.MaxSize }).(pulumi.IntPtrOutput)
}

// Minimal number of instances that App Runner provisions for your service.
func (o AutoScalingConfigurationVersionOutput) MinSize() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *AutoScalingConfigurationVersion) pulumi.IntPtrOutput { return v.MinSize }).(pulumi.IntPtrOutput)
}

// Current state of the auto scaling configuration. An INACTIVE configuration revision has been deleted and can't be used. It is permanently removed some time after deletion.
func (o AutoScalingConfigurationVersionOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *AutoScalingConfigurationVersion) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

// Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
func (o AutoScalingConfigurationVersionOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *AutoScalingConfigurationVersion) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
func (o AutoScalingConfigurationVersionOutput) TagsAll() pulumi.StringMapOutput {
	return o.ApplyT(func(v *AutoScalingConfigurationVersion) pulumi.StringMapOutput { return v.TagsAll }).(pulumi.StringMapOutput)
}

type AutoScalingConfigurationVersionArrayOutput struct{ *pulumi.OutputState }

func (AutoScalingConfigurationVersionArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AutoScalingConfigurationVersion)(nil)).Elem()
}

func (o AutoScalingConfigurationVersionArrayOutput) ToAutoScalingConfigurationVersionArrayOutput() AutoScalingConfigurationVersionArrayOutput {
	return o
}

func (o AutoScalingConfigurationVersionArrayOutput) ToAutoScalingConfigurationVersionArrayOutputWithContext(ctx context.Context) AutoScalingConfigurationVersionArrayOutput {
	return o
}

func (o AutoScalingConfigurationVersionArrayOutput) Index(i pulumi.IntInput) AutoScalingConfigurationVersionOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *AutoScalingConfigurationVersion {
		return vs[0].([]*AutoScalingConfigurationVersion)[vs[1].(int)]
	}).(AutoScalingConfigurationVersionOutput)
}

type AutoScalingConfigurationVersionMapOutput struct{ *pulumi.OutputState }

func (AutoScalingConfigurationVersionMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AutoScalingConfigurationVersion)(nil)).Elem()
}

func (o AutoScalingConfigurationVersionMapOutput) ToAutoScalingConfigurationVersionMapOutput() AutoScalingConfigurationVersionMapOutput {
	return o
}

func (o AutoScalingConfigurationVersionMapOutput) ToAutoScalingConfigurationVersionMapOutputWithContext(ctx context.Context) AutoScalingConfigurationVersionMapOutput {
	return o
}

func (o AutoScalingConfigurationVersionMapOutput) MapIndex(k pulumi.StringInput) AutoScalingConfigurationVersionOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *AutoScalingConfigurationVersion {
		return vs[0].(map[string]*AutoScalingConfigurationVersion)[vs[1].(string)]
	}).(AutoScalingConfigurationVersionOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*AutoScalingConfigurationVersionInput)(nil)).Elem(), &AutoScalingConfigurationVersion{})
	pulumi.RegisterInputType(reflect.TypeOf((*AutoScalingConfigurationVersionArrayInput)(nil)).Elem(), AutoScalingConfigurationVersionArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*AutoScalingConfigurationVersionMapInput)(nil)).Elem(), AutoScalingConfigurationVersionMap{})
	pulumi.RegisterOutputType(AutoScalingConfigurationVersionOutput{})
	pulumi.RegisterOutputType(AutoScalingConfigurationVersionArrayOutput{})
	pulumi.RegisterOutputType(AutoScalingConfigurationVersionMapOutput{})
}

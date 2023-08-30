// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package oam

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Resource for managing an AWS CloudWatch Observability Access Manager Sink.
//
// ## Example Usage
// ### Basic Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/oam"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := oam.NewSink(ctx, "example", &oam.SinkArgs{
//				Tags: pulumi.StringMap{
//					"Env": pulumi.String("prod"),
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
// Using `pulumi import`, import CloudWatch Observability Access Manager Sink using the `arn`. For example:
//
// ```sh
//
//	$ pulumi import aws:oam/sink:Sink example arn:aws:oam:us-west-2:123456789012:sink/sink-id
//
// ```
type Sink struct {
	pulumi.CustomResourceState

	// ARN of the Sink.
	Arn pulumi.StringOutput `pulumi:"arn"`
	// Name for the sink.
	//
	// The following arguments are optional:
	Name pulumi.StringOutput `pulumi:"name"`
	// ID string that AWS generated as part of the sink ARN.
	SinkId pulumi.StringOutput `pulumi:"sinkId"`
	// A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags    pulumi.StringMapOutput `pulumi:"tags"`
	TagsAll pulumi.StringMapOutput `pulumi:"tagsAll"`
}

// NewSink registers a new resource with the given unique name, arguments, and options.
func NewSink(ctx *pulumi.Context,
	name string, args *SinkArgs, opts ...pulumi.ResourceOption) (*Sink, error) {
	if args == nil {
		args = &SinkArgs{}
	}

	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Sink
	err := ctx.RegisterResource("aws:oam/sink:Sink", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSink gets an existing Sink resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSink(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SinkState, opts ...pulumi.ResourceOption) (*Sink, error) {
	var resource Sink
	err := ctx.ReadResource("aws:oam/sink:Sink", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Sink resources.
type sinkState struct {
	// ARN of the Sink.
	Arn *string `pulumi:"arn"`
	// Name for the sink.
	//
	// The following arguments are optional:
	Name *string `pulumi:"name"`
	// ID string that AWS generated as part of the sink ARN.
	SinkId *string `pulumi:"sinkId"`
	// A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags    map[string]string `pulumi:"tags"`
	TagsAll map[string]string `pulumi:"tagsAll"`
}

type SinkState struct {
	// ARN of the Sink.
	Arn pulumi.StringPtrInput
	// Name for the sink.
	//
	// The following arguments are optional:
	Name pulumi.StringPtrInput
	// ID string that AWS generated as part of the sink ARN.
	SinkId pulumi.StringPtrInput
	// A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags    pulumi.StringMapInput
	TagsAll pulumi.StringMapInput
}

func (SinkState) ElementType() reflect.Type {
	return reflect.TypeOf((*sinkState)(nil)).Elem()
}

type sinkArgs struct {
	// Name for the sink.
	//
	// The following arguments are optional:
	Name *string `pulumi:"name"`
	// A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
}

// The set of arguments for constructing a Sink resource.
type SinkArgs struct {
	// Name for the sink.
	//
	// The following arguments are optional:
	Name pulumi.StringPtrInput
	// A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
}

func (SinkArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*sinkArgs)(nil)).Elem()
}

type SinkInput interface {
	pulumi.Input

	ToSinkOutput() SinkOutput
	ToSinkOutputWithContext(ctx context.Context) SinkOutput
}

func (*Sink) ElementType() reflect.Type {
	return reflect.TypeOf((**Sink)(nil)).Elem()
}

func (i *Sink) ToSinkOutput() SinkOutput {
	return i.ToSinkOutputWithContext(context.Background())
}

func (i *Sink) ToSinkOutputWithContext(ctx context.Context) SinkOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SinkOutput)
}

// SinkArrayInput is an input type that accepts SinkArray and SinkArrayOutput values.
// You can construct a concrete instance of `SinkArrayInput` via:
//
//	SinkArray{ SinkArgs{...} }
type SinkArrayInput interface {
	pulumi.Input

	ToSinkArrayOutput() SinkArrayOutput
	ToSinkArrayOutputWithContext(context.Context) SinkArrayOutput
}

type SinkArray []SinkInput

func (SinkArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Sink)(nil)).Elem()
}

func (i SinkArray) ToSinkArrayOutput() SinkArrayOutput {
	return i.ToSinkArrayOutputWithContext(context.Background())
}

func (i SinkArray) ToSinkArrayOutputWithContext(ctx context.Context) SinkArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SinkArrayOutput)
}

// SinkMapInput is an input type that accepts SinkMap and SinkMapOutput values.
// You can construct a concrete instance of `SinkMapInput` via:
//
//	SinkMap{ "key": SinkArgs{...} }
type SinkMapInput interface {
	pulumi.Input

	ToSinkMapOutput() SinkMapOutput
	ToSinkMapOutputWithContext(context.Context) SinkMapOutput
}

type SinkMap map[string]SinkInput

func (SinkMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Sink)(nil)).Elem()
}

func (i SinkMap) ToSinkMapOutput() SinkMapOutput {
	return i.ToSinkMapOutputWithContext(context.Background())
}

func (i SinkMap) ToSinkMapOutputWithContext(ctx context.Context) SinkMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SinkMapOutput)
}

type SinkOutput struct{ *pulumi.OutputState }

func (SinkOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Sink)(nil)).Elem()
}

func (o SinkOutput) ToSinkOutput() SinkOutput {
	return o
}

func (o SinkOutput) ToSinkOutputWithContext(ctx context.Context) SinkOutput {
	return o
}

// ARN of the Sink.
func (o SinkOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v *Sink) pulumi.StringOutput { return v.Arn }).(pulumi.StringOutput)
}

// Name for the sink.
//
// The following arguments are optional:
func (o SinkOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Sink) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// ID string that AWS generated as part of the sink ARN.
func (o SinkOutput) SinkId() pulumi.StringOutput {
	return o.ApplyT(func(v *Sink) pulumi.StringOutput { return v.SinkId }).(pulumi.StringOutput)
}

// A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
func (o SinkOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Sink) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

func (o SinkOutput) TagsAll() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Sink) pulumi.StringMapOutput { return v.TagsAll }).(pulumi.StringMapOutput)
}

type SinkArrayOutput struct{ *pulumi.OutputState }

func (SinkArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Sink)(nil)).Elem()
}

func (o SinkArrayOutput) ToSinkArrayOutput() SinkArrayOutput {
	return o
}

func (o SinkArrayOutput) ToSinkArrayOutputWithContext(ctx context.Context) SinkArrayOutput {
	return o
}

func (o SinkArrayOutput) Index(i pulumi.IntInput) SinkOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Sink {
		return vs[0].([]*Sink)[vs[1].(int)]
	}).(SinkOutput)
}

type SinkMapOutput struct{ *pulumi.OutputState }

func (SinkMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Sink)(nil)).Elem()
}

func (o SinkMapOutput) ToSinkMapOutput() SinkMapOutput {
	return o
}

func (o SinkMapOutput) ToSinkMapOutputWithContext(ctx context.Context) SinkMapOutput {
	return o
}

func (o SinkMapOutput) MapIndex(k pulumi.StringInput) SinkOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Sink {
		return vs[0].(map[string]*Sink)[vs[1].(string)]
	}).(SinkOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*SinkInput)(nil)).Elem(), &Sink{})
	pulumi.RegisterInputType(reflect.TypeOf((*SinkArrayInput)(nil)).Elem(), SinkArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*SinkMapInput)(nil)).Elem(), SinkMap{})
	pulumi.RegisterOutputType(SinkOutput{})
	pulumi.RegisterOutputType(SinkArrayOutput{})
	pulumi.RegisterOutputType(SinkMapOutput{})
}

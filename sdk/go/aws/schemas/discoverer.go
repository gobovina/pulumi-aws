// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package schemas

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides an EventBridge Schema Discoverer resource.
//
// > **Note:** EventBridge was formerly known as CloudWatch Events. The functionality is identical.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/cloudwatch"
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/schemas"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			messenger, err := cloudwatch.NewEventBus(ctx, "messenger", &cloudwatch.EventBusArgs{
//				Name: pulumi.String("chat-messages"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = schemas.NewDiscoverer(ctx, "test", &schemas.DiscovererArgs{
//				SourceArn:   messenger.Arn,
//				Description: pulumi.String("Auto discover event schemas"),
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
// Using `pulumi import`, import EventBridge discoverers using the `id`. For example:
//
// ```sh
//
//	$ pulumi import aws:schemas/discoverer:Discoverer test 123
//
// ```
type Discoverer struct {
	pulumi.CustomResourceState

	// The Amazon Resource Name (ARN) of the discoverer.
	Arn pulumi.StringOutput `pulumi:"arn"`
	// The description of the discoverer. Maximum of 256 characters.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// The ARN of the event bus to discover event schemas on.
	SourceArn pulumi.StringOutput `pulumi:"sourceArn"`
	// A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapOutput `pulumi:"tagsAll"`
}

// NewDiscoverer registers a new resource with the given unique name, arguments, and options.
func NewDiscoverer(ctx *pulumi.Context,
	name string, args *DiscovererArgs, opts ...pulumi.ResourceOption) (*Discoverer, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.SourceArn == nil {
		return nil, errors.New("invalid value for required argument 'SourceArn'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Discoverer
	err := ctx.RegisterResource("aws:schemas/discoverer:Discoverer", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetDiscoverer gets an existing Discoverer resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetDiscoverer(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *DiscovererState, opts ...pulumi.ResourceOption) (*Discoverer, error) {
	var resource Discoverer
	err := ctx.ReadResource("aws:schemas/discoverer:Discoverer", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Discoverer resources.
type discovererState struct {
	// The Amazon Resource Name (ARN) of the discoverer.
	Arn *string `pulumi:"arn"`
	// The description of the discoverer. Maximum of 256 characters.
	Description *string `pulumi:"description"`
	// The ARN of the event bus to discover event schemas on.
	SourceArn *string `pulumi:"sourceArn"`
	// A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll map[string]string `pulumi:"tagsAll"`
}

type DiscovererState struct {
	// The Amazon Resource Name (ARN) of the discoverer.
	Arn pulumi.StringPtrInput
	// The description of the discoverer. Maximum of 256 characters.
	Description pulumi.StringPtrInput
	// The ARN of the event bus to discover event schemas on.
	SourceArn pulumi.StringPtrInput
	// A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapInput
}

func (DiscovererState) ElementType() reflect.Type {
	return reflect.TypeOf((*discovererState)(nil)).Elem()
}

type discovererArgs struct {
	// The description of the discoverer. Maximum of 256 characters.
	Description *string `pulumi:"description"`
	// The ARN of the event bus to discover event schemas on.
	SourceArn string `pulumi:"sourceArn"`
	// A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
}

// The set of arguments for constructing a Discoverer resource.
type DiscovererArgs struct {
	// The description of the discoverer. Maximum of 256 characters.
	Description pulumi.StringPtrInput
	// The ARN of the event bus to discover event schemas on.
	SourceArn pulumi.StringInput
	// A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
}

func (DiscovererArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*discovererArgs)(nil)).Elem()
}

type DiscovererInput interface {
	pulumi.Input

	ToDiscovererOutput() DiscovererOutput
	ToDiscovererOutputWithContext(ctx context.Context) DiscovererOutput
}

func (*Discoverer) ElementType() reflect.Type {
	return reflect.TypeOf((**Discoverer)(nil)).Elem()
}

func (i *Discoverer) ToDiscovererOutput() DiscovererOutput {
	return i.ToDiscovererOutputWithContext(context.Background())
}

func (i *Discoverer) ToDiscovererOutputWithContext(ctx context.Context) DiscovererOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DiscovererOutput)
}

// DiscovererArrayInput is an input type that accepts DiscovererArray and DiscovererArrayOutput values.
// You can construct a concrete instance of `DiscovererArrayInput` via:
//
//	DiscovererArray{ DiscovererArgs{...} }
type DiscovererArrayInput interface {
	pulumi.Input

	ToDiscovererArrayOutput() DiscovererArrayOutput
	ToDiscovererArrayOutputWithContext(context.Context) DiscovererArrayOutput
}

type DiscovererArray []DiscovererInput

func (DiscovererArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Discoverer)(nil)).Elem()
}

func (i DiscovererArray) ToDiscovererArrayOutput() DiscovererArrayOutput {
	return i.ToDiscovererArrayOutputWithContext(context.Background())
}

func (i DiscovererArray) ToDiscovererArrayOutputWithContext(ctx context.Context) DiscovererArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DiscovererArrayOutput)
}

// DiscovererMapInput is an input type that accepts DiscovererMap and DiscovererMapOutput values.
// You can construct a concrete instance of `DiscovererMapInput` via:
//
//	DiscovererMap{ "key": DiscovererArgs{...} }
type DiscovererMapInput interface {
	pulumi.Input

	ToDiscovererMapOutput() DiscovererMapOutput
	ToDiscovererMapOutputWithContext(context.Context) DiscovererMapOutput
}

type DiscovererMap map[string]DiscovererInput

func (DiscovererMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Discoverer)(nil)).Elem()
}

func (i DiscovererMap) ToDiscovererMapOutput() DiscovererMapOutput {
	return i.ToDiscovererMapOutputWithContext(context.Background())
}

func (i DiscovererMap) ToDiscovererMapOutputWithContext(ctx context.Context) DiscovererMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DiscovererMapOutput)
}

type DiscovererOutput struct{ *pulumi.OutputState }

func (DiscovererOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Discoverer)(nil)).Elem()
}

func (o DiscovererOutput) ToDiscovererOutput() DiscovererOutput {
	return o
}

func (o DiscovererOutput) ToDiscovererOutputWithContext(ctx context.Context) DiscovererOutput {
	return o
}

// The Amazon Resource Name (ARN) of the discoverer.
func (o DiscovererOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v *Discoverer) pulumi.StringOutput { return v.Arn }).(pulumi.StringOutput)
}

// The description of the discoverer. Maximum of 256 characters.
func (o DiscovererOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Discoverer) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// The ARN of the event bus to discover event schemas on.
func (o DiscovererOutput) SourceArn() pulumi.StringOutput {
	return o.ApplyT(func(v *Discoverer) pulumi.StringOutput { return v.SourceArn }).(pulumi.StringOutput)
}

// A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
func (o DiscovererOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Discoverer) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
//
// Deprecated: Please use `tags` instead.
func (o DiscovererOutput) TagsAll() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Discoverer) pulumi.StringMapOutput { return v.TagsAll }).(pulumi.StringMapOutput)
}

type DiscovererArrayOutput struct{ *pulumi.OutputState }

func (DiscovererArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Discoverer)(nil)).Elem()
}

func (o DiscovererArrayOutput) ToDiscovererArrayOutput() DiscovererArrayOutput {
	return o
}

func (o DiscovererArrayOutput) ToDiscovererArrayOutputWithContext(ctx context.Context) DiscovererArrayOutput {
	return o
}

func (o DiscovererArrayOutput) Index(i pulumi.IntInput) DiscovererOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Discoverer {
		return vs[0].([]*Discoverer)[vs[1].(int)]
	}).(DiscovererOutput)
}

type DiscovererMapOutput struct{ *pulumi.OutputState }

func (DiscovererMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Discoverer)(nil)).Elem()
}

func (o DiscovererMapOutput) ToDiscovererMapOutput() DiscovererMapOutput {
	return o
}

func (o DiscovererMapOutput) ToDiscovererMapOutputWithContext(ctx context.Context) DiscovererMapOutput {
	return o
}

func (o DiscovererMapOutput) MapIndex(k pulumi.StringInput) DiscovererOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Discoverer {
		return vs[0].(map[string]*Discoverer)[vs[1].(string)]
	}).(DiscovererOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*DiscovererInput)(nil)).Elem(), &Discoverer{})
	pulumi.RegisterInputType(reflect.TypeOf((*DiscovererArrayInput)(nil)).Elem(), DiscovererArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*DiscovererMapInput)(nil)).Elem(), DiscovererMap{})
	pulumi.RegisterOutputType(DiscovererOutput{})
	pulumi.RegisterOutputType(DiscovererArrayOutput{})
	pulumi.RegisterOutputType(DiscovererMapOutput{})
}

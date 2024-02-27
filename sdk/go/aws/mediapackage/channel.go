// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package mediapackage

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides an AWS Elemental MediaPackage Channel.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/mediapackage"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := mediapackage.NewChannel(ctx, "kittens", &mediapackage.ChannelArgs{
//				ChannelId:   pulumi.String("kitten-channel"),
//				Description: pulumi.String("A channel dedicated to amusing videos of kittens."),
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
// Using `pulumi import`, import Media Package Channels using the channel ID. For example:
//
// ```sh
//
//	$ pulumi import aws:mediapackage/channel:Channel kittens kittens-channel
//
// ```
type Channel struct {
	pulumi.CustomResourceState

	// The ARN of the channel
	Arn pulumi.StringOutput `pulumi:"arn"`
	// A unique identifier describing the channel
	ChannelId pulumi.StringOutput `pulumi:"channelId"`
	// A description of the channel
	Description pulumi.StringOutput `pulumi:"description"`
	// A single item list of HLS ingest information
	HlsIngests ChannelHlsIngestArrayOutput `pulumi:"hlsIngests"`
	// A map of tags to assign to the resource. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapOutput `pulumi:"tagsAll"`
}

// NewChannel registers a new resource with the given unique name, arguments, and options.
func NewChannel(ctx *pulumi.Context,
	name string, args *ChannelArgs, opts ...pulumi.ResourceOption) (*Channel, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ChannelId == nil {
		return nil, errors.New("invalid value for required argument 'ChannelId'")
	}
	if args.Description == nil {
		args.Description = pulumi.StringPtr("Managed by Pulumi")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Channel
	err := ctx.RegisterResource("aws:mediapackage/channel:Channel", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetChannel gets an existing Channel resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetChannel(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ChannelState, opts ...pulumi.ResourceOption) (*Channel, error) {
	var resource Channel
	err := ctx.ReadResource("aws:mediapackage/channel:Channel", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Channel resources.
type channelState struct {
	// The ARN of the channel
	Arn *string `pulumi:"arn"`
	// A unique identifier describing the channel
	ChannelId *string `pulumi:"channelId"`
	// A description of the channel
	Description *string `pulumi:"description"`
	// A single item list of HLS ingest information
	HlsIngests []ChannelHlsIngest `pulumi:"hlsIngests"`
	// A map of tags to assign to the resource. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll map[string]string `pulumi:"tagsAll"`
}

type ChannelState struct {
	// The ARN of the channel
	Arn pulumi.StringPtrInput
	// A unique identifier describing the channel
	ChannelId pulumi.StringPtrInput
	// A description of the channel
	Description pulumi.StringPtrInput
	// A single item list of HLS ingest information
	HlsIngests ChannelHlsIngestArrayInput
	// A map of tags to assign to the resource. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapInput
}

func (ChannelState) ElementType() reflect.Type {
	return reflect.TypeOf((*channelState)(nil)).Elem()
}

type channelArgs struct {
	// A unique identifier describing the channel
	ChannelId string `pulumi:"channelId"`
	// A description of the channel
	Description *string `pulumi:"description"`
	// A map of tags to assign to the resource. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
}

// The set of arguments for constructing a Channel resource.
type ChannelArgs struct {
	// A unique identifier describing the channel
	ChannelId pulumi.StringInput
	// A description of the channel
	Description pulumi.StringPtrInput
	// A map of tags to assign to the resource. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
}

func (ChannelArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*channelArgs)(nil)).Elem()
}

type ChannelInput interface {
	pulumi.Input

	ToChannelOutput() ChannelOutput
	ToChannelOutputWithContext(ctx context.Context) ChannelOutput
}

func (*Channel) ElementType() reflect.Type {
	return reflect.TypeOf((**Channel)(nil)).Elem()
}

func (i *Channel) ToChannelOutput() ChannelOutput {
	return i.ToChannelOutputWithContext(context.Background())
}

func (i *Channel) ToChannelOutputWithContext(ctx context.Context) ChannelOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ChannelOutput)
}

// ChannelArrayInput is an input type that accepts ChannelArray and ChannelArrayOutput values.
// You can construct a concrete instance of `ChannelArrayInput` via:
//
//	ChannelArray{ ChannelArgs{...} }
type ChannelArrayInput interface {
	pulumi.Input

	ToChannelArrayOutput() ChannelArrayOutput
	ToChannelArrayOutputWithContext(context.Context) ChannelArrayOutput
}

type ChannelArray []ChannelInput

func (ChannelArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Channel)(nil)).Elem()
}

func (i ChannelArray) ToChannelArrayOutput() ChannelArrayOutput {
	return i.ToChannelArrayOutputWithContext(context.Background())
}

func (i ChannelArray) ToChannelArrayOutputWithContext(ctx context.Context) ChannelArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ChannelArrayOutput)
}

// ChannelMapInput is an input type that accepts ChannelMap and ChannelMapOutput values.
// You can construct a concrete instance of `ChannelMapInput` via:
//
//	ChannelMap{ "key": ChannelArgs{...} }
type ChannelMapInput interface {
	pulumi.Input

	ToChannelMapOutput() ChannelMapOutput
	ToChannelMapOutputWithContext(context.Context) ChannelMapOutput
}

type ChannelMap map[string]ChannelInput

func (ChannelMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Channel)(nil)).Elem()
}

func (i ChannelMap) ToChannelMapOutput() ChannelMapOutput {
	return i.ToChannelMapOutputWithContext(context.Background())
}

func (i ChannelMap) ToChannelMapOutputWithContext(ctx context.Context) ChannelMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ChannelMapOutput)
}

type ChannelOutput struct{ *pulumi.OutputState }

func (ChannelOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Channel)(nil)).Elem()
}

func (o ChannelOutput) ToChannelOutput() ChannelOutput {
	return o
}

func (o ChannelOutput) ToChannelOutputWithContext(ctx context.Context) ChannelOutput {
	return o
}

// The ARN of the channel
func (o ChannelOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v *Channel) pulumi.StringOutput { return v.Arn }).(pulumi.StringOutput)
}

// A unique identifier describing the channel
func (o ChannelOutput) ChannelId() pulumi.StringOutput {
	return o.ApplyT(func(v *Channel) pulumi.StringOutput { return v.ChannelId }).(pulumi.StringOutput)
}

// A description of the channel
func (o ChannelOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v *Channel) pulumi.StringOutput { return v.Description }).(pulumi.StringOutput)
}

// A single item list of HLS ingest information
func (o ChannelOutput) HlsIngests() ChannelHlsIngestArrayOutput {
	return o.ApplyT(func(v *Channel) ChannelHlsIngestArrayOutput { return v.HlsIngests }).(ChannelHlsIngestArrayOutput)
}

// A map of tags to assign to the resource. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
func (o ChannelOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Channel) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
//
// Deprecated: Please use `tags` instead.
func (o ChannelOutput) TagsAll() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Channel) pulumi.StringMapOutput { return v.TagsAll }).(pulumi.StringMapOutput)
}

type ChannelArrayOutput struct{ *pulumi.OutputState }

func (ChannelArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Channel)(nil)).Elem()
}

func (o ChannelArrayOutput) ToChannelArrayOutput() ChannelArrayOutput {
	return o
}

func (o ChannelArrayOutput) ToChannelArrayOutputWithContext(ctx context.Context) ChannelArrayOutput {
	return o
}

func (o ChannelArrayOutput) Index(i pulumi.IntInput) ChannelOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Channel {
		return vs[0].([]*Channel)[vs[1].(int)]
	}).(ChannelOutput)
}

type ChannelMapOutput struct{ *pulumi.OutputState }

func (ChannelMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Channel)(nil)).Elem()
}

func (o ChannelMapOutput) ToChannelMapOutput() ChannelMapOutput {
	return o
}

func (o ChannelMapOutput) ToChannelMapOutputWithContext(ctx context.Context) ChannelMapOutput {
	return o
}

func (o ChannelMapOutput) MapIndex(k pulumi.StringInput) ChannelOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Channel {
		return vs[0].(map[string]*Channel)[vs[1].(string)]
	}).(ChannelOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ChannelInput)(nil)).Elem(), &Channel{})
	pulumi.RegisterInputType(reflect.TypeOf((*ChannelArrayInput)(nil)).Elem(), ChannelArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ChannelMapInput)(nil)).Elem(), ChannelMap{})
	pulumi.RegisterOutputType(ChannelOutput{})
	pulumi.RegisterOutputType(ChannelArrayOutput{})
	pulumi.RegisterOutputType(ChannelMapOutput{})
}

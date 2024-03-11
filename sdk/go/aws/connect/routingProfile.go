// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package connect

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides an Amazon Connect Routing Profile resource. For more information see
// [Amazon Connect: Getting Started](https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-get-started.html)
//
// ## Example Usage
//
// <!--Start PulumiCodeChooser -->
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/connect"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := connect.NewRoutingProfile(ctx, "example", &connect.RoutingProfileArgs{
//				InstanceId:             pulumi.String("aaaaaaaa-bbbb-cccc-dddd-111111111111"),
//				Name:                   pulumi.String("example"),
//				DefaultOutboundQueueId: pulumi.String("12345678-1234-1234-1234-123456789012"),
//				Description:            pulumi.String("example description"),
//				MediaConcurrencies: connect.RoutingProfileMediaConcurrencyArray{
//					&connect.RoutingProfileMediaConcurrencyArgs{
//						Channel:     pulumi.String("VOICE"),
//						Concurrency: pulumi.Int(1),
//					},
//				},
//				QueueConfigs: connect.RoutingProfileQueueConfigArray{
//					&connect.RoutingProfileQueueConfigArgs{
//						Channel:  pulumi.String("VOICE"),
//						Delay:    pulumi.Int(2),
//						Priority: pulumi.Int(1),
//						QueueId:  pulumi.String("12345678-1234-1234-1234-123456789012"),
//					},
//				},
//				Tags: pulumi.StringMap{
//					"Name": pulumi.String("Example Routing Profile"),
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
// Using `pulumi import`, import Amazon Connect Routing Profiles using the `instance_id` and `routing_profile_id` separated by a colon (`:`). For example:
//
// ```sh
// $ pulumi import aws:connect/routingProfile:RoutingProfile example f1288a1f-6193-445a-b47e-af739b2:c1d4e5f6-1b3c-1b3c-1b3c-c1d4e5f6c1d4e5
// ```
type RoutingProfile struct {
	pulumi.CustomResourceState

	// The Amazon Resource Name (ARN) of the Routing Profile.
	Arn pulumi.StringOutput `pulumi:"arn"`
	// Specifies the default outbound queue for the Routing Profile.
	DefaultOutboundQueueId pulumi.StringOutput `pulumi:"defaultOutboundQueueId"`
	// Specifies the description of the Routing Profile.
	Description pulumi.StringOutput `pulumi:"description"`
	// Specifies the identifier of the hosting Amazon Connect Instance.
	InstanceId pulumi.StringOutput `pulumi:"instanceId"`
	// One or more `mediaConcurrencies` blocks that specify the channels that agents can handle in the Contact Control Panel (CCP) for this Routing Profile. The `mediaConcurrencies` block is documented below.
	MediaConcurrencies RoutingProfileMediaConcurrencyArrayOutput `pulumi:"mediaConcurrencies"`
	// Specifies the name of the Routing Profile.
	Name pulumi.StringOutput `pulumi:"name"`
	// One or more `queueConfigs` blocks that specify the inbound queues associated with the routing profile. If no queue is added, the agent only can make outbound calls. The `queueConfigs` block is documented below.
	QueueConfigs RoutingProfileQueueConfigArrayOutput `pulumi:"queueConfigs"`
	// The identifier for the Routing Profile.
	RoutingProfileId pulumi.StringOutput `pulumi:"routingProfileId"`
	// Tags to apply to the Routing Profile. If configured with a provider
	// `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapOutput `pulumi:"tagsAll"`
}

// NewRoutingProfile registers a new resource with the given unique name, arguments, and options.
func NewRoutingProfile(ctx *pulumi.Context,
	name string, args *RoutingProfileArgs, opts ...pulumi.ResourceOption) (*RoutingProfile, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.DefaultOutboundQueueId == nil {
		return nil, errors.New("invalid value for required argument 'DefaultOutboundQueueId'")
	}
	if args.Description == nil {
		return nil, errors.New("invalid value for required argument 'Description'")
	}
	if args.InstanceId == nil {
		return nil, errors.New("invalid value for required argument 'InstanceId'")
	}
	if args.MediaConcurrencies == nil {
		return nil, errors.New("invalid value for required argument 'MediaConcurrencies'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource RoutingProfile
	err := ctx.RegisterResource("aws:connect/routingProfile:RoutingProfile", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetRoutingProfile gets an existing RoutingProfile resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetRoutingProfile(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *RoutingProfileState, opts ...pulumi.ResourceOption) (*RoutingProfile, error) {
	var resource RoutingProfile
	err := ctx.ReadResource("aws:connect/routingProfile:RoutingProfile", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering RoutingProfile resources.
type routingProfileState struct {
	// The Amazon Resource Name (ARN) of the Routing Profile.
	Arn *string `pulumi:"arn"`
	// Specifies the default outbound queue for the Routing Profile.
	DefaultOutboundQueueId *string `pulumi:"defaultOutboundQueueId"`
	// Specifies the description of the Routing Profile.
	Description *string `pulumi:"description"`
	// Specifies the identifier of the hosting Amazon Connect Instance.
	InstanceId *string `pulumi:"instanceId"`
	// One or more `mediaConcurrencies` blocks that specify the channels that agents can handle in the Contact Control Panel (CCP) for this Routing Profile. The `mediaConcurrencies` block is documented below.
	MediaConcurrencies []RoutingProfileMediaConcurrency `pulumi:"mediaConcurrencies"`
	// Specifies the name of the Routing Profile.
	Name *string `pulumi:"name"`
	// One or more `queueConfigs` blocks that specify the inbound queues associated with the routing profile. If no queue is added, the agent only can make outbound calls. The `queueConfigs` block is documented below.
	QueueConfigs []RoutingProfileQueueConfig `pulumi:"queueConfigs"`
	// The identifier for the Routing Profile.
	RoutingProfileId *string `pulumi:"routingProfileId"`
	// Tags to apply to the Routing Profile. If configured with a provider
	// `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll map[string]string `pulumi:"tagsAll"`
}

type RoutingProfileState struct {
	// The Amazon Resource Name (ARN) of the Routing Profile.
	Arn pulumi.StringPtrInput
	// Specifies the default outbound queue for the Routing Profile.
	DefaultOutboundQueueId pulumi.StringPtrInput
	// Specifies the description of the Routing Profile.
	Description pulumi.StringPtrInput
	// Specifies the identifier of the hosting Amazon Connect Instance.
	InstanceId pulumi.StringPtrInput
	// One or more `mediaConcurrencies` blocks that specify the channels that agents can handle in the Contact Control Panel (CCP) for this Routing Profile. The `mediaConcurrencies` block is documented below.
	MediaConcurrencies RoutingProfileMediaConcurrencyArrayInput
	// Specifies the name of the Routing Profile.
	Name pulumi.StringPtrInput
	// One or more `queueConfigs` blocks that specify the inbound queues associated with the routing profile. If no queue is added, the agent only can make outbound calls. The `queueConfigs` block is documented below.
	QueueConfigs RoutingProfileQueueConfigArrayInput
	// The identifier for the Routing Profile.
	RoutingProfileId pulumi.StringPtrInput
	// Tags to apply to the Routing Profile. If configured with a provider
	// `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapInput
}

func (RoutingProfileState) ElementType() reflect.Type {
	return reflect.TypeOf((*routingProfileState)(nil)).Elem()
}

type routingProfileArgs struct {
	// Specifies the default outbound queue for the Routing Profile.
	DefaultOutboundQueueId string `pulumi:"defaultOutboundQueueId"`
	// Specifies the description of the Routing Profile.
	Description string `pulumi:"description"`
	// Specifies the identifier of the hosting Amazon Connect Instance.
	InstanceId string `pulumi:"instanceId"`
	// One or more `mediaConcurrencies` blocks that specify the channels that agents can handle in the Contact Control Panel (CCP) for this Routing Profile. The `mediaConcurrencies` block is documented below.
	MediaConcurrencies []RoutingProfileMediaConcurrency `pulumi:"mediaConcurrencies"`
	// Specifies the name of the Routing Profile.
	Name *string `pulumi:"name"`
	// One or more `queueConfigs` blocks that specify the inbound queues associated with the routing profile. If no queue is added, the agent only can make outbound calls. The `queueConfigs` block is documented below.
	QueueConfigs []RoutingProfileQueueConfig `pulumi:"queueConfigs"`
	// Tags to apply to the Routing Profile. If configured with a provider
	// `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
}

// The set of arguments for constructing a RoutingProfile resource.
type RoutingProfileArgs struct {
	// Specifies the default outbound queue for the Routing Profile.
	DefaultOutboundQueueId pulumi.StringInput
	// Specifies the description of the Routing Profile.
	Description pulumi.StringInput
	// Specifies the identifier of the hosting Amazon Connect Instance.
	InstanceId pulumi.StringInput
	// One or more `mediaConcurrencies` blocks that specify the channels that agents can handle in the Contact Control Panel (CCP) for this Routing Profile. The `mediaConcurrencies` block is documented below.
	MediaConcurrencies RoutingProfileMediaConcurrencyArrayInput
	// Specifies the name of the Routing Profile.
	Name pulumi.StringPtrInput
	// One or more `queueConfigs` blocks that specify the inbound queues associated with the routing profile. If no queue is added, the agent only can make outbound calls. The `queueConfigs` block is documented below.
	QueueConfigs RoutingProfileQueueConfigArrayInput
	// Tags to apply to the Routing Profile. If configured with a provider
	// `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
}

func (RoutingProfileArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*routingProfileArgs)(nil)).Elem()
}

type RoutingProfileInput interface {
	pulumi.Input

	ToRoutingProfileOutput() RoutingProfileOutput
	ToRoutingProfileOutputWithContext(ctx context.Context) RoutingProfileOutput
}

func (*RoutingProfile) ElementType() reflect.Type {
	return reflect.TypeOf((**RoutingProfile)(nil)).Elem()
}

func (i *RoutingProfile) ToRoutingProfileOutput() RoutingProfileOutput {
	return i.ToRoutingProfileOutputWithContext(context.Background())
}

func (i *RoutingProfile) ToRoutingProfileOutputWithContext(ctx context.Context) RoutingProfileOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RoutingProfileOutput)
}

// RoutingProfileArrayInput is an input type that accepts RoutingProfileArray and RoutingProfileArrayOutput values.
// You can construct a concrete instance of `RoutingProfileArrayInput` via:
//
//	RoutingProfileArray{ RoutingProfileArgs{...} }
type RoutingProfileArrayInput interface {
	pulumi.Input

	ToRoutingProfileArrayOutput() RoutingProfileArrayOutput
	ToRoutingProfileArrayOutputWithContext(context.Context) RoutingProfileArrayOutput
}

type RoutingProfileArray []RoutingProfileInput

func (RoutingProfileArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*RoutingProfile)(nil)).Elem()
}

func (i RoutingProfileArray) ToRoutingProfileArrayOutput() RoutingProfileArrayOutput {
	return i.ToRoutingProfileArrayOutputWithContext(context.Background())
}

func (i RoutingProfileArray) ToRoutingProfileArrayOutputWithContext(ctx context.Context) RoutingProfileArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RoutingProfileArrayOutput)
}

// RoutingProfileMapInput is an input type that accepts RoutingProfileMap and RoutingProfileMapOutput values.
// You can construct a concrete instance of `RoutingProfileMapInput` via:
//
//	RoutingProfileMap{ "key": RoutingProfileArgs{...} }
type RoutingProfileMapInput interface {
	pulumi.Input

	ToRoutingProfileMapOutput() RoutingProfileMapOutput
	ToRoutingProfileMapOutputWithContext(context.Context) RoutingProfileMapOutput
}

type RoutingProfileMap map[string]RoutingProfileInput

func (RoutingProfileMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*RoutingProfile)(nil)).Elem()
}

func (i RoutingProfileMap) ToRoutingProfileMapOutput() RoutingProfileMapOutput {
	return i.ToRoutingProfileMapOutputWithContext(context.Background())
}

func (i RoutingProfileMap) ToRoutingProfileMapOutputWithContext(ctx context.Context) RoutingProfileMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RoutingProfileMapOutput)
}

type RoutingProfileOutput struct{ *pulumi.OutputState }

func (RoutingProfileOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**RoutingProfile)(nil)).Elem()
}

func (o RoutingProfileOutput) ToRoutingProfileOutput() RoutingProfileOutput {
	return o
}

func (o RoutingProfileOutput) ToRoutingProfileOutputWithContext(ctx context.Context) RoutingProfileOutput {
	return o
}

// The Amazon Resource Name (ARN) of the Routing Profile.
func (o RoutingProfileOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v *RoutingProfile) pulumi.StringOutput { return v.Arn }).(pulumi.StringOutput)
}

// Specifies the default outbound queue for the Routing Profile.
func (o RoutingProfileOutput) DefaultOutboundQueueId() pulumi.StringOutput {
	return o.ApplyT(func(v *RoutingProfile) pulumi.StringOutput { return v.DefaultOutboundQueueId }).(pulumi.StringOutput)
}

// Specifies the description of the Routing Profile.
func (o RoutingProfileOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v *RoutingProfile) pulumi.StringOutput { return v.Description }).(pulumi.StringOutput)
}

// Specifies the identifier of the hosting Amazon Connect Instance.
func (o RoutingProfileOutput) InstanceId() pulumi.StringOutput {
	return o.ApplyT(func(v *RoutingProfile) pulumi.StringOutput { return v.InstanceId }).(pulumi.StringOutput)
}

// One or more `mediaConcurrencies` blocks that specify the channels that agents can handle in the Contact Control Panel (CCP) for this Routing Profile. The `mediaConcurrencies` block is documented below.
func (o RoutingProfileOutput) MediaConcurrencies() RoutingProfileMediaConcurrencyArrayOutput {
	return o.ApplyT(func(v *RoutingProfile) RoutingProfileMediaConcurrencyArrayOutput { return v.MediaConcurrencies }).(RoutingProfileMediaConcurrencyArrayOutput)
}

// Specifies the name of the Routing Profile.
func (o RoutingProfileOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *RoutingProfile) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// One or more `queueConfigs` blocks that specify the inbound queues associated with the routing profile. If no queue is added, the agent only can make outbound calls. The `queueConfigs` block is documented below.
func (o RoutingProfileOutput) QueueConfigs() RoutingProfileQueueConfigArrayOutput {
	return o.ApplyT(func(v *RoutingProfile) RoutingProfileQueueConfigArrayOutput { return v.QueueConfigs }).(RoutingProfileQueueConfigArrayOutput)
}

// The identifier for the Routing Profile.
func (o RoutingProfileOutput) RoutingProfileId() pulumi.StringOutput {
	return o.ApplyT(func(v *RoutingProfile) pulumi.StringOutput { return v.RoutingProfileId }).(pulumi.StringOutput)
}

// Tags to apply to the Routing Profile. If configured with a provider
// `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
func (o RoutingProfileOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *RoutingProfile) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
//
// Deprecated: Please use `tags` instead.
func (o RoutingProfileOutput) TagsAll() pulumi.StringMapOutput {
	return o.ApplyT(func(v *RoutingProfile) pulumi.StringMapOutput { return v.TagsAll }).(pulumi.StringMapOutput)
}

type RoutingProfileArrayOutput struct{ *pulumi.OutputState }

func (RoutingProfileArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*RoutingProfile)(nil)).Elem()
}

func (o RoutingProfileArrayOutput) ToRoutingProfileArrayOutput() RoutingProfileArrayOutput {
	return o
}

func (o RoutingProfileArrayOutput) ToRoutingProfileArrayOutputWithContext(ctx context.Context) RoutingProfileArrayOutput {
	return o
}

func (o RoutingProfileArrayOutput) Index(i pulumi.IntInput) RoutingProfileOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *RoutingProfile {
		return vs[0].([]*RoutingProfile)[vs[1].(int)]
	}).(RoutingProfileOutput)
}

type RoutingProfileMapOutput struct{ *pulumi.OutputState }

func (RoutingProfileMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*RoutingProfile)(nil)).Elem()
}

func (o RoutingProfileMapOutput) ToRoutingProfileMapOutput() RoutingProfileMapOutput {
	return o
}

func (o RoutingProfileMapOutput) ToRoutingProfileMapOutputWithContext(ctx context.Context) RoutingProfileMapOutput {
	return o
}

func (o RoutingProfileMapOutput) MapIndex(k pulumi.StringInput) RoutingProfileOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *RoutingProfile {
		return vs[0].(map[string]*RoutingProfile)[vs[1].(string)]
	}).(RoutingProfileOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*RoutingProfileInput)(nil)).Elem(), &RoutingProfile{})
	pulumi.RegisterInputType(reflect.TypeOf((*RoutingProfileArrayInput)(nil)).Elem(), RoutingProfileArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*RoutingProfileMapInput)(nil)).Elem(), RoutingProfileMap{})
	pulumi.RegisterOutputType(RoutingProfileOutput{})
	pulumi.RegisterOutputType(RoutingProfileArrayOutput{})
	pulumi.RegisterOutputType(RoutingProfileMapOutput{})
}

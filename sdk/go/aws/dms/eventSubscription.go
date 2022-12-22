// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package dms

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a DMS (Data Migration Service) event subscription resource.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v5/go/aws/dms"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := dms.NewEventSubscription(ctx, "example", &dms.EventSubscriptionArgs{
//				Enabled: pulumi.Bool(true),
//				EventCategories: pulumi.StringArray{
//					pulumi.String("creation"),
//					pulumi.String("failure"),
//				},
//				SnsTopicArn: pulumi.Any(aws_sns_topic.Example.Arn),
//				SourceIds: pulumi.StringArray{
//					aws_dms_replication_task.Example.Replication_task_id,
//				},
//				SourceType: pulumi.String("replication-task"),
//				Tags: pulumi.StringMap{
//					"Name": pulumi.String("example"),
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
// Event subscriptions can be imported using the `name`, e.g.,
//
// ```sh
//
//	$ pulumi import aws:dms/eventSubscription:EventSubscription test my-awesome-event-subscription
//
// ```
type EventSubscription struct {
	pulumi.CustomResourceState

	// Amazon Resource Name (ARN) of the DMS Event Subscription.
	Arn pulumi.StringOutput `pulumi:"arn"`
	// Whether the event subscription should be enabled.
	Enabled pulumi.BoolPtrOutput `pulumi:"enabled"`
	// List of event categories to listen for, see `DescribeEventCategories` for a canonical list.
	EventCategories pulumi.StringArrayOutput `pulumi:"eventCategories"`
	// Name of event subscription.
	Name pulumi.StringOutput `pulumi:"name"`
	// SNS topic arn to send events on.
	SnsTopicArn pulumi.StringOutput `pulumi:"snsTopicArn"`
	// Ids of sources to listen to.
	SourceIds pulumi.StringArrayOutput `pulumi:"sourceIds"`
	// Type of source for events. Valid values: `replication-instance` or `replication-task`
	SourceType pulumi.StringPtrOutput `pulumi:"sourceType"`
	// Map of resource tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	TagsAll pulumi.StringMapOutput `pulumi:"tagsAll"`
}

// NewEventSubscription registers a new resource with the given unique name, arguments, and options.
func NewEventSubscription(ctx *pulumi.Context,
	name string, args *EventSubscriptionArgs, opts ...pulumi.ResourceOption) (*EventSubscription, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.EventCategories == nil {
		return nil, errors.New("invalid value for required argument 'EventCategories'")
	}
	if args.SnsTopicArn == nil {
		return nil, errors.New("invalid value for required argument 'SnsTopicArn'")
	}
	var resource EventSubscription
	err := ctx.RegisterResource("aws:dms/eventSubscription:EventSubscription", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetEventSubscription gets an existing EventSubscription resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetEventSubscription(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *EventSubscriptionState, opts ...pulumi.ResourceOption) (*EventSubscription, error) {
	var resource EventSubscription
	err := ctx.ReadResource("aws:dms/eventSubscription:EventSubscription", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering EventSubscription resources.
type eventSubscriptionState struct {
	// Amazon Resource Name (ARN) of the DMS Event Subscription.
	Arn *string `pulumi:"arn"`
	// Whether the event subscription should be enabled.
	Enabled *bool `pulumi:"enabled"`
	// List of event categories to listen for, see `DescribeEventCategories` for a canonical list.
	EventCategories []string `pulumi:"eventCategories"`
	// Name of event subscription.
	Name *string `pulumi:"name"`
	// SNS topic arn to send events on.
	SnsTopicArn *string `pulumi:"snsTopicArn"`
	// Ids of sources to listen to.
	SourceIds []string `pulumi:"sourceIds"`
	// Type of source for events. Valid values: `replication-instance` or `replication-task`
	SourceType *string `pulumi:"sourceType"`
	// Map of resource tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	TagsAll map[string]string `pulumi:"tagsAll"`
}

type EventSubscriptionState struct {
	// Amazon Resource Name (ARN) of the DMS Event Subscription.
	Arn pulumi.StringPtrInput
	// Whether the event subscription should be enabled.
	Enabled pulumi.BoolPtrInput
	// List of event categories to listen for, see `DescribeEventCategories` for a canonical list.
	EventCategories pulumi.StringArrayInput
	// Name of event subscription.
	Name pulumi.StringPtrInput
	// SNS topic arn to send events on.
	SnsTopicArn pulumi.StringPtrInput
	// Ids of sources to listen to.
	SourceIds pulumi.StringArrayInput
	// Type of source for events. Valid values: `replication-instance` or `replication-task`
	SourceType pulumi.StringPtrInput
	// Map of resource tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	TagsAll pulumi.StringMapInput
}

func (EventSubscriptionState) ElementType() reflect.Type {
	return reflect.TypeOf((*eventSubscriptionState)(nil)).Elem()
}

type eventSubscriptionArgs struct {
	// Whether the event subscription should be enabled.
	Enabled *bool `pulumi:"enabled"`
	// List of event categories to listen for, see `DescribeEventCategories` for a canonical list.
	EventCategories []string `pulumi:"eventCategories"`
	// Name of event subscription.
	Name *string `pulumi:"name"`
	// SNS topic arn to send events on.
	SnsTopicArn string `pulumi:"snsTopicArn"`
	// Ids of sources to listen to.
	SourceIds []string `pulumi:"sourceIds"`
	// Type of source for events. Valid values: `replication-instance` or `replication-task`
	SourceType *string `pulumi:"sourceType"`
	// Map of resource tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
}

// The set of arguments for constructing a EventSubscription resource.
type EventSubscriptionArgs struct {
	// Whether the event subscription should be enabled.
	Enabled pulumi.BoolPtrInput
	// List of event categories to listen for, see `DescribeEventCategories` for a canonical list.
	EventCategories pulumi.StringArrayInput
	// Name of event subscription.
	Name pulumi.StringPtrInput
	// SNS topic arn to send events on.
	SnsTopicArn pulumi.StringInput
	// Ids of sources to listen to.
	SourceIds pulumi.StringArrayInput
	// Type of source for events. Valid values: `replication-instance` or `replication-task`
	SourceType pulumi.StringPtrInput
	// Map of resource tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
}

func (EventSubscriptionArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*eventSubscriptionArgs)(nil)).Elem()
}

type EventSubscriptionInput interface {
	pulumi.Input

	ToEventSubscriptionOutput() EventSubscriptionOutput
	ToEventSubscriptionOutputWithContext(ctx context.Context) EventSubscriptionOutput
}

func (*EventSubscription) ElementType() reflect.Type {
	return reflect.TypeOf((**EventSubscription)(nil)).Elem()
}

func (i *EventSubscription) ToEventSubscriptionOutput() EventSubscriptionOutput {
	return i.ToEventSubscriptionOutputWithContext(context.Background())
}

func (i *EventSubscription) ToEventSubscriptionOutputWithContext(ctx context.Context) EventSubscriptionOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EventSubscriptionOutput)
}

// EventSubscriptionArrayInput is an input type that accepts EventSubscriptionArray and EventSubscriptionArrayOutput values.
// You can construct a concrete instance of `EventSubscriptionArrayInput` via:
//
//	EventSubscriptionArray{ EventSubscriptionArgs{...} }
type EventSubscriptionArrayInput interface {
	pulumi.Input

	ToEventSubscriptionArrayOutput() EventSubscriptionArrayOutput
	ToEventSubscriptionArrayOutputWithContext(context.Context) EventSubscriptionArrayOutput
}

type EventSubscriptionArray []EventSubscriptionInput

func (EventSubscriptionArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*EventSubscription)(nil)).Elem()
}

func (i EventSubscriptionArray) ToEventSubscriptionArrayOutput() EventSubscriptionArrayOutput {
	return i.ToEventSubscriptionArrayOutputWithContext(context.Background())
}

func (i EventSubscriptionArray) ToEventSubscriptionArrayOutputWithContext(ctx context.Context) EventSubscriptionArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EventSubscriptionArrayOutput)
}

// EventSubscriptionMapInput is an input type that accepts EventSubscriptionMap and EventSubscriptionMapOutput values.
// You can construct a concrete instance of `EventSubscriptionMapInput` via:
//
//	EventSubscriptionMap{ "key": EventSubscriptionArgs{...} }
type EventSubscriptionMapInput interface {
	pulumi.Input

	ToEventSubscriptionMapOutput() EventSubscriptionMapOutput
	ToEventSubscriptionMapOutputWithContext(context.Context) EventSubscriptionMapOutput
}

type EventSubscriptionMap map[string]EventSubscriptionInput

func (EventSubscriptionMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*EventSubscription)(nil)).Elem()
}

func (i EventSubscriptionMap) ToEventSubscriptionMapOutput() EventSubscriptionMapOutput {
	return i.ToEventSubscriptionMapOutputWithContext(context.Background())
}

func (i EventSubscriptionMap) ToEventSubscriptionMapOutputWithContext(ctx context.Context) EventSubscriptionMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EventSubscriptionMapOutput)
}

type EventSubscriptionOutput struct{ *pulumi.OutputState }

func (EventSubscriptionOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**EventSubscription)(nil)).Elem()
}

func (o EventSubscriptionOutput) ToEventSubscriptionOutput() EventSubscriptionOutput {
	return o
}

func (o EventSubscriptionOutput) ToEventSubscriptionOutputWithContext(ctx context.Context) EventSubscriptionOutput {
	return o
}

// Amazon Resource Name (ARN) of the DMS Event Subscription.
func (o EventSubscriptionOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v *EventSubscription) pulumi.StringOutput { return v.Arn }).(pulumi.StringOutput)
}

// Whether the event subscription should be enabled.
func (o EventSubscriptionOutput) Enabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *EventSubscription) pulumi.BoolPtrOutput { return v.Enabled }).(pulumi.BoolPtrOutput)
}

// List of event categories to listen for, see `DescribeEventCategories` for a canonical list.
func (o EventSubscriptionOutput) EventCategories() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *EventSubscription) pulumi.StringArrayOutput { return v.EventCategories }).(pulumi.StringArrayOutput)
}

// Name of event subscription.
func (o EventSubscriptionOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *EventSubscription) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// SNS topic arn to send events on.
func (o EventSubscriptionOutput) SnsTopicArn() pulumi.StringOutput {
	return o.ApplyT(func(v *EventSubscription) pulumi.StringOutput { return v.SnsTopicArn }).(pulumi.StringOutput)
}

// Ids of sources to listen to.
func (o EventSubscriptionOutput) SourceIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *EventSubscription) pulumi.StringArrayOutput { return v.SourceIds }).(pulumi.StringArrayOutput)
}

// Type of source for events. Valid values: `replication-instance` or `replication-task`
func (o EventSubscriptionOutput) SourceType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *EventSubscription) pulumi.StringPtrOutput { return v.SourceType }).(pulumi.StringPtrOutput)
}

// Map of resource tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
func (o EventSubscriptionOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *EventSubscription) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
func (o EventSubscriptionOutput) TagsAll() pulumi.StringMapOutput {
	return o.ApplyT(func(v *EventSubscription) pulumi.StringMapOutput { return v.TagsAll }).(pulumi.StringMapOutput)
}

type EventSubscriptionArrayOutput struct{ *pulumi.OutputState }

func (EventSubscriptionArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*EventSubscription)(nil)).Elem()
}

func (o EventSubscriptionArrayOutput) ToEventSubscriptionArrayOutput() EventSubscriptionArrayOutput {
	return o
}

func (o EventSubscriptionArrayOutput) ToEventSubscriptionArrayOutputWithContext(ctx context.Context) EventSubscriptionArrayOutput {
	return o
}

func (o EventSubscriptionArrayOutput) Index(i pulumi.IntInput) EventSubscriptionOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *EventSubscription {
		return vs[0].([]*EventSubscription)[vs[1].(int)]
	}).(EventSubscriptionOutput)
}

type EventSubscriptionMapOutput struct{ *pulumi.OutputState }

func (EventSubscriptionMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*EventSubscription)(nil)).Elem()
}

func (o EventSubscriptionMapOutput) ToEventSubscriptionMapOutput() EventSubscriptionMapOutput {
	return o
}

func (o EventSubscriptionMapOutput) ToEventSubscriptionMapOutputWithContext(ctx context.Context) EventSubscriptionMapOutput {
	return o
}

func (o EventSubscriptionMapOutput) MapIndex(k pulumi.StringInput) EventSubscriptionOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *EventSubscription {
		return vs[0].(map[string]*EventSubscription)[vs[1].(string)]
	}).(EventSubscriptionOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*EventSubscriptionInput)(nil)).Elem(), &EventSubscription{})
	pulumi.RegisterInputType(reflect.TypeOf((*EventSubscriptionArrayInput)(nil)).Elem(), EventSubscriptionArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*EventSubscriptionMapInput)(nil)).Elem(), EventSubscriptionMap{})
	pulumi.RegisterOutputType(EventSubscriptionOutput{})
	pulumi.RegisterOutputType(EventSubscriptionArrayOutput{})
	pulumi.RegisterOutputType(EventSubscriptionMapOutput{})
}

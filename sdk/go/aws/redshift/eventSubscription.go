// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package redshift

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Redshift event subscription resource.
//
// ## Example Usage
//
// <!--Start PulumiCodeChooser -->
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/redshift"
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/sns"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := redshift.NewCluster(ctx, "default", &redshift.ClusterArgs{
//				ClusterIdentifier: pulumi.String("default"),
//				DatabaseName:      pulumi.String("default"),
//			})
//			if err != nil {
//				return err
//			}
//			defaultTopic, err := sns.NewTopic(ctx, "default", &sns.TopicArgs{
//				Name: pulumi.String("redshift-events"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = redshift.NewEventSubscription(ctx, "default", &redshift.EventSubscriptionArgs{
//				Name:        pulumi.String("redshift-event-sub"),
//				SnsTopicArn: defaultTopic.Arn,
//				SourceType:  pulumi.String("cluster"),
//				SourceIds: pulumi.StringArray{
//					_default.ID(),
//				},
//				Severity: pulumi.String("INFO"),
//				EventCategories: pulumi.StringArray{
//					pulumi.String("configuration"),
//					pulumi.String("management"),
//					pulumi.String("monitoring"),
//					pulumi.String("security"),
//				},
//				Tags: pulumi.StringMap{
//					"Name": pulumi.String("default"),
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
// Using `pulumi import`, import Redshift Event Subscriptions using the `name`. For example:
//
// ```sh
// $ pulumi import aws:redshift/eventSubscription:EventSubscription default redshift-event-sub
// ```
type EventSubscription struct {
	pulumi.CustomResourceState

	// Amazon Resource Name (ARN) of the Redshift event notification subscription
	Arn pulumi.StringOutput `pulumi:"arn"`
	// The AWS customer account associated with the Redshift event notification subscription
	CustomerAwsId pulumi.StringOutput `pulumi:"customerAwsId"`
	// A boolean flag to enable/disable the subscription. Defaults to `true`.
	Enabled pulumi.BoolPtrOutput `pulumi:"enabled"`
	// A list of event categories for a SourceType that you want to subscribe to. See https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-event-notifications.html or run `aws redshift describe-event-categories`.
	EventCategories pulumi.StringArrayOutput `pulumi:"eventCategories"`
	// The name of the Redshift event subscription.
	Name pulumi.StringOutput `pulumi:"name"`
	// The event severity to be published by the notification subscription. Valid options are `INFO` or `ERROR`. Default value of `INFO`.
	Severity pulumi.StringPtrOutput `pulumi:"severity"`
	// The ARN of the SNS topic to send events to.
	SnsTopicArn pulumi.StringOutput `pulumi:"snsTopicArn"`
	// A list of identifiers of the event sources for which events will be returned. If not specified, then all sources are included in the response. If specified, a `sourceType` must also be specified.
	SourceIds pulumi.StringArrayOutput `pulumi:"sourceIds"`
	// The type of source that will be generating the events. Valid options are `cluster`, `cluster-parameter-group`, `cluster-security-group`, `cluster-snapshot`, or `scheduled-action`. If not set, all sources will be subscribed to.
	SourceType pulumi.StringPtrOutput `pulumi:"sourceType"`
	Status     pulumi.StringOutput    `pulumi:"status"`
	// A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapOutput `pulumi:"tagsAll"`
}

// NewEventSubscription registers a new resource with the given unique name, arguments, and options.
func NewEventSubscription(ctx *pulumi.Context,
	name string, args *EventSubscriptionArgs, opts ...pulumi.ResourceOption) (*EventSubscription, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.SnsTopicArn == nil {
		return nil, errors.New("invalid value for required argument 'SnsTopicArn'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource EventSubscription
	err := ctx.RegisterResource("aws:redshift/eventSubscription:EventSubscription", name, args, &resource, opts...)
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
	err := ctx.ReadResource("aws:redshift/eventSubscription:EventSubscription", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering EventSubscription resources.
type eventSubscriptionState struct {
	// Amazon Resource Name (ARN) of the Redshift event notification subscription
	Arn *string `pulumi:"arn"`
	// The AWS customer account associated with the Redshift event notification subscription
	CustomerAwsId *string `pulumi:"customerAwsId"`
	// A boolean flag to enable/disable the subscription. Defaults to `true`.
	Enabled *bool `pulumi:"enabled"`
	// A list of event categories for a SourceType that you want to subscribe to. See https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-event-notifications.html or run `aws redshift describe-event-categories`.
	EventCategories []string `pulumi:"eventCategories"`
	// The name of the Redshift event subscription.
	Name *string `pulumi:"name"`
	// The event severity to be published by the notification subscription. Valid options are `INFO` or `ERROR`. Default value of `INFO`.
	Severity *string `pulumi:"severity"`
	// The ARN of the SNS topic to send events to.
	SnsTopicArn *string `pulumi:"snsTopicArn"`
	// A list of identifiers of the event sources for which events will be returned. If not specified, then all sources are included in the response. If specified, a `sourceType` must also be specified.
	SourceIds []string `pulumi:"sourceIds"`
	// The type of source that will be generating the events. Valid options are `cluster`, `cluster-parameter-group`, `cluster-security-group`, `cluster-snapshot`, or `scheduled-action`. If not set, all sources will be subscribed to.
	SourceType *string `pulumi:"sourceType"`
	Status     *string `pulumi:"status"`
	// A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll map[string]string `pulumi:"tagsAll"`
}

type EventSubscriptionState struct {
	// Amazon Resource Name (ARN) of the Redshift event notification subscription
	Arn pulumi.StringPtrInput
	// The AWS customer account associated with the Redshift event notification subscription
	CustomerAwsId pulumi.StringPtrInput
	// A boolean flag to enable/disable the subscription. Defaults to `true`.
	Enabled pulumi.BoolPtrInput
	// A list of event categories for a SourceType that you want to subscribe to. See https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-event-notifications.html or run `aws redshift describe-event-categories`.
	EventCategories pulumi.StringArrayInput
	// The name of the Redshift event subscription.
	Name pulumi.StringPtrInput
	// The event severity to be published by the notification subscription. Valid options are `INFO` or `ERROR`. Default value of `INFO`.
	Severity pulumi.StringPtrInput
	// The ARN of the SNS topic to send events to.
	SnsTopicArn pulumi.StringPtrInput
	// A list of identifiers of the event sources for which events will be returned. If not specified, then all sources are included in the response. If specified, a `sourceType` must also be specified.
	SourceIds pulumi.StringArrayInput
	// The type of source that will be generating the events. Valid options are `cluster`, `cluster-parameter-group`, `cluster-security-group`, `cluster-snapshot`, or `scheduled-action`. If not set, all sources will be subscribed to.
	SourceType pulumi.StringPtrInput
	Status     pulumi.StringPtrInput
	// A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapInput
}

func (EventSubscriptionState) ElementType() reflect.Type {
	return reflect.TypeOf((*eventSubscriptionState)(nil)).Elem()
}

type eventSubscriptionArgs struct {
	// A boolean flag to enable/disable the subscription. Defaults to `true`.
	Enabled *bool `pulumi:"enabled"`
	// A list of event categories for a SourceType that you want to subscribe to. See https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-event-notifications.html or run `aws redshift describe-event-categories`.
	EventCategories []string `pulumi:"eventCategories"`
	// The name of the Redshift event subscription.
	Name *string `pulumi:"name"`
	// The event severity to be published by the notification subscription. Valid options are `INFO` or `ERROR`. Default value of `INFO`.
	Severity *string `pulumi:"severity"`
	// The ARN of the SNS topic to send events to.
	SnsTopicArn string `pulumi:"snsTopicArn"`
	// A list of identifiers of the event sources for which events will be returned. If not specified, then all sources are included in the response. If specified, a `sourceType` must also be specified.
	SourceIds []string `pulumi:"sourceIds"`
	// The type of source that will be generating the events. Valid options are `cluster`, `cluster-parameter-group`, `cluster-security-group`, `cluster-snapshot`, or `scheduled-action`. If not set, all sources will be subscribed to.
	SourceType *string `pulumi:"sourceType"`
	// A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
}

// The set of arguments for constructing a EventSubscription resource.
type EventSubscriptionArgs struct {
	// A boolean flag to enable/disable the subscription. Defaults to `true`.
	Enabled pulumi.BoolPtrInput
	// A list of event categories for a SourceType that you want to subscribe to. See https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-event-notifications.html or run `aws redshift describe-event-categories`.
	EventCategories pulumi.StringArrayInput
	// The name of the Redshift event subscription.
	Name pulumi.StringPtrInput
	// The event severity to be published by the notification subscription. Valid options are `INFO` or `ERROR`. Default value of `INFO`.
	Severity pulumi.StringPtrInput
	// The ARN of the SNS topic to send events to.
	SnsTopicArn pulumi.StringInput
	// A list of identifiers of the event sources for which events will be returned. If not specified, then all sources are included in the response. If specified, a `sourceType` must also be specified.
	SourceIds pulumi.StringArrayInput
	// The type of source that will be generating the events. Valid options are `cluster`, `cluster-parameter-group`, `cluster-security-group`, `cluster-snapshot`, or `scheduled-action`. If not set, all sources will be subscribed to.
	SourceType pulumi.StringPtrInput
	// A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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

// Amazon Resource Name (ARN) of the Redshift event notification subscription
func (o EventSubscriptionOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v *EventSubscription) pulumi.StringOutput { return v.Arn }).(pulumi.StringOutput)
}

// The AWS customer account associated with the Redshift event notification subscription
func (o EventSubscriptionOutput) CustomerAwsId() pulumi.StringOutput {
	return o.ApplyT(func(v *EventSubscription) pulumi.StringOutput { return v.CustomerAwsId }).(pulumi.StringOutput)
}

// A boolean flag to enable/disable the subscription. Defaults to `true`.
func (o EventSubscriptionOutput) Enabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *EventSubscription) pulumi.BoolPtrOutput { return v.Enabled }).(pulumi.BoolPtrOutput)
}

// A list of event categories for a SourceType that you want to subscribe to. See https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-event-notifications.html or run `aws redshift describe-event-categories`.
func (o EventSubscriptionOutput) EventCategories() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *EventSubscription) pulumi.StringArrayOutput { return v.EventCategories }).(pulumi.StringArrayOutput)
}

// The name of the Redshift event subscription.
func (o EventSubscriptionOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *EventSubscription) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The event severity to be published by the notification subscription. Valid options are `INFO` or `ERROR`. Default value of `INFO`.
func (o EventSubscriptionOutput) Severity() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *EventSubscription) pulumi.StringPtrOutput { return v.Severity }).(pulumi.StringPtrOutput)
}

// The ARN of the SNS topic to send events to.
func (o EventSubscriptionOutput) SnsTopicArn() pulumi.StringOutput {
	return o.ApplyT(func(v *EventSubscription) pulumi.StringOutput { return v.SnsTopicArn }).(pulumi.StringOutput)
}

// A list of identifiers of the event sources for which events will be returned. If not specified, then all sources are included in the response. If specified, a `sourceType` must also be specified.
func (o EventSubscriptionOutput) SourceIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *EventSubscription) pulumi.StringArrayOutput { return v.SourceIds }).(pulumi.StringArrayOutput)
}

// The type of source that will be generating the events. Valid options are `cluster`, `cluster-parameter-group`, `cluster-security-group`, `cluster-snapshot`, or `scheduled-action`. If not set, all sources will be subscribed to.
func (o EventSubscriptionOutput) SourceType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *EventSubscription) pulumi.StringPtrOutput { return v.SourceType }).(pulumi.StringPtrOutput)
}

func (o EventSubscriptionOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *EventSubscription) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

// A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
func (o EventSubscriptionOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *EventSubscription) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
//
// Deprecated: Please use `tags` instead.
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

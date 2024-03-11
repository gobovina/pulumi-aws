// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package ses

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides an SES event destination
//
// ## Example Usage
//
// ### CloudWatch Destination
//
// <!--Start PulumiCodeChooser -->
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/ses"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := ses.NewEventDestination(ctx, "cloudwatch", &ses.EventDestinationArgs{
//				Name:                 pulumi.String("event-destination-cloudwatch"),
//				ConfigurationSetName: pulumi.Any(example.Name),
//				Enabled:              pulumi.Bool(true),
//				MatchingTypes: pulumi.StringArray{
//					pulumi.String("bounce"),
//					pulumi.String("send"),
//				},
//				CloudwatchDestinations: ses.EventDestinationCloudwatchDestinationArray{
//					&ses.EventDestinationCloudwatchDestinationArgs{
//						DefaultValue:  pulumi.String("default"),
//						DimensionName: pulumi.String("dimension"),
//						ValueSource:   pulumi.String("emailHeader"),
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
// <!--End PulumiCodeChooser -->
//
// ### Kinesis Destination
//
// <!--Start PulumiCodeChooser -->
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/ses"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := ses.NewEventDestination(ctx, "kinesis", &ses.EventDestinationArgs{
//				Name:                 pulumi.String("event-destination-kinesis"),
//				ConfigurationSetName: pulumi.Any(exampleAwsSesConfigurationSet.Name),
//				Enabled:              pulumi.Bool(true),
//				MatchingTypes: pulumi.StringArray{
//					pulumi.String("bounce"),
//					pulumi.String("send"),
//				},
//				KinesisDestination: &ses.EventDestinationKinesisDestinationArgs{
//					StreamArn: pulumi.Any(exampleAwsKinesisFirehoseDeliveryStream.Arn),
//					RoleArn:   pulumi.Any(example.Arn),
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
// ### SNS Destination
//
// <!--Start PulumiCodeChooser -->
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/ses"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := ses.NewEventDestination(ctx, "sns", &ses.EventDestinationArgs{
//				Name:                 pulumi.String("event-destination-sns"),
//				ConfigurationSetName: pulumi.Any(exampleAwsSesConfigurationSet.Name),
//				Enabled:              pulumi.Bool(true),
//				MatchingTypes: pulumi.StringArray{
//					pulumi.String("bounce"),
//					pulumi.String("send"),
//				},
//				SnsDestination: &ses.EventDestinationSnsDestinationArgs{
//					TopicArn: pulumi.Any(example.Arn),
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
// Using `pulumi import`, import SES event destinations using `configuration_set_name` together with the event destination's `name`. For example:
//
// ```sh
// $ pulumi import aws:ses/eventDestination:EventDestination sns some-configuration-set-test/event-destination-sns
// ```
type EventDestination struct {
	pulumi.CustomResourceState

	// The SES event destination ARN.
	Arn pulumi.StringOutput `pulumi:"arn"`
	// CloudWatch destination for the events
	CloudwatchDestinations EventDestinationCloudwatchDestinationArrayOutput `pulumi:"cloudwatchDestinations"`
	// The name of the configuration set
	ConfigurationSetName pulumi.StringOutput `pulumi:"configurationSetName"`
	// If true, the event destination will be enabled
	Enabled pulumi.BoolPtrOutput `pulumi:"enabled"`
	// Send the events to a kinesis firehose destination
	KinesisDestination EventDestinationKinesisDestinationPtrOutput `pulumi:"kinesisDestination"`
	// A list of matching types. May be any of `"send"`, `"reject"`, `"bounce"`, `"complaint"`, `"delivery"`, `"open"`, `"click"`, or `"renderingFailure"`.
	MatchingTypes pulumi.StringArrayOutput `pulumi:"matchingTypes"`
	// The name of the event destination
	Name pulumi.StringOutput `pulumi:"name"`
	// Send the events to an SNS Topic destination
	//
	// > **NOTE:** You can specify `"cloudwatchDestination"` or `"kinesisDestination"` but not both
	SnsDestination EventDestinationSnsDestinationPtrOutput `pulumi:"snsDestination"`
}

// NewEventDestination registers a new resource with the given unique name, arguments, and options.
func NewEventDestination(ctx *pulumi.Context,
	name string, args *EventDestinationArgs, opts ...pulumi.ResourceOption) (*EventDestination, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ConfigurationSetName == nil {
		return nil, errors.New("invalid value for required argument 'ConfigurationSetName'")
	}
	if args.MatchingTypes == nil {
		return nil, errors.New("invalid value for required argument 'MatchingTypes'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource EventDestination
	err := ctx.RegisterResource("aws:ses/eventDestination:EventDestination", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetEventDestination gets an existing EventDestination resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetEventDestination(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *EventDestinationState, opts ...pulumi.ResourceOption) (*EventDestination, error) {
	var resource EventDestination
	err := ctx.ReadResource("aws:ses/eventDestination:EventDestination", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering EventDestination resources.
type eventDestinationState struct {
	// The SES event destination ARN.
	Arn *string `pulumi:"arn"`
	// CloudWatch destination for the events
	CloudwatchDestinations []EventDestinationCloudwatchDestination `pulumi:"cloudwatchDestinations"`
	// The name of the configuration set
	ConfigurationSetName *string `pulumi:"configurationSetName"`
	// If true, the event destination will be enabled
	Enabled *bool `pulumi:"enabled"`
	// Send the events to a kinesis firehose destination
	KinesisDestination *EventDestinationKinesisDestination `pulumi:"kinesisDestination"`
	// A list of matching types. May be any of `"send"`, `"reject"`, `"bounce"`, `"complaint"`, `"delivery"`, `"open"`, `"click"`, or `"renderingFailure"`.
	MatchingTypes []string `pulumi:"matchingTypes"`
	// The name of the event destination
	Name *string `pulumi:"name"`
	// Send the events to an SNS Topic destination
	//
	// > **NOTE:** You can specify `"cloudwatchDestination"` or `"kinesisDestination"` but not both
	SnsDestination *EventDestinationSnsDestination `pulumi:"snsDestination"`
}

type EventDestinationState struct {
	// The SES event destination ARN.
	Arn pulumi.StringPtrInput
	// CloudWatch destination for the events
	CloudwatchDestinations EventDestinationCloudwatchDestinationArrayInput
	// The name of the configuration set
	ConfigurationSetName pulumi.StringPtrInput
	// If true, the event destination will be enabled
	Enabled pulumi.BoolPtrInput
	// Send the events to a kinesis firehose destination
	KinesisDestination EventDestinationKinesisDestinationPtrInput
	// A list of matching types. May be any of `"send"`, `"reject"`, `"bounce"`, `"complaint"`, `"delivery"`, `"open"`, `"click"`, or `"renderingFailure"`.
	MatchingTypes pulumi.StringArrayInput
	// The name of the event destination
	Name pulumi.StringPtrInput
	// Send the events to an SNS Topic destination
	//
	// > **NOTE:** You can specify `"cloudwatchDestination"` or `"kinesisDestination"` but not both
	SnsDestination EventDestinationSnsDestinationPtrInput
}

func (EventDestinationState) ElementType() reflect.Type {
	return reflect.TypeOf((*eventDestinationState)(nil)).Elem()
}

type eventDestinationArgs struct {
	// CloudWatch destination for the events
	CloudwatchDestinations []EventDestinationCloudwatchDestination `pulumi:"cloudwatchDestinations"`
	// The name of the configuration set
	ConfigurationSetName string `pulumi:"configurationSetName"`
	// If true, the event destination will be enabled
	Enabled *bool `pulumi:"enabled"`
	// Send the events to a kinesis firehose destination
	KinesisDestination *EventDestinationKinesisDestination `pulumi:"kinesisDestination"`
	// A list of matching types. May be any of `"send"`, `"reject"`, `"bounce"`, `"complaint"`, `"delivery"`, `"open"`, `"click"`, or `"renderingFailure"`.
	MatchingTypes []string `pulumi:"matchingTypes"`
	// The name of the event destination
	Name *string `pulumi:"name"`
	// Send the events to an SNS Topic destination
	//
	// > **NOTE:** You can specify `"cloudwatchDestination"` or `"kinesisDestination"` but not both
	SnsDestination *EventDestinationSnsDestination `pulumi:"snsDestination"`
}

// The set of arguments for constructing a EventDestination resource.
type EventDestinationArgs struct {
	// CloudWatch destination for the events
	CloudwatchDestinations EventDestinationCloudwatchDestinationArrayInput
	// The name of the configuration set
	ConfigurationSetName pulumi.StringInput
	// If true, the event destination will be enabled
	Enabled pulumi.BoolPtrInput
	// Send the events to a kinesis firehose destination
	KinesisDestination EventDestinationKinesisDestinationPtrInput
	// A list of matching types. May be any of `"send"`, `"reject"`, `"bounce"`, `"complaint"`, `"delivery"`, `"open"`, `"click"`, or `"renderingFailure"`.
	MatchingTypes pulumi.StringArrayInput
	// The name of the event destination
	Name pulumi.StringPtrInput
	// Send the events to an SNS Topic destination
	//
	// > **NOTE:** You can specify `"cloudwatchDestination"` or `"kinesisDestination"` but not both
	SnsDestination EventDestinationSnsDestinationPtrInput
}

func (EventDestinationArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*eventDestinationArgs)(nil)).Elem()
}

type EventDestinationInput interface {
	pulumi.Input

	ToEventDestinationOutput() EventDestinationOutput
	ToEventDestinationOutputWithContext(ctx context.Context) EventDestinationOutput
}

func (*EventDestination) ElementType() reflect.Type {
	return reflect.TypeOf((**EventDestination)(nil)).Elem()
}

func (i *EventDestination) ToEventDestinationOutput() EventDestinationOutput {
	return i.ToEventDestinationOutputWithContext(context.Background())
}

func (i *EventDestination) ToEventDestinationOutputWithContext(ctx context.Context) EventDestinationOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EventDestinationOutput)
}

// EventDestinationArrayInput is an input type that accepts EventDestinationArray and EventDestinationArrayOutput values.
// You can construct a concrete instance of `EventDestinationArrayInput` via:
//
//	EventDestinationArray{ EventDestinationArgs{...} }
type EventDestinationArrayInput interface {
	pulumi.Input

	ToEventDestinationArrayOutput() EventDestinationArrayOutput
	ToEventDestinationArrayOutputWithContext(context.Context) EventDestinationArrayOutput
}

type EventDestinationArray []EventDestinationInput

func (EventDestinationArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*EventDestination)(nil)).Elem()
}

func (i EventDestinationArray) ToEventDestinationArrayOutput() EventDestinationArrayOutput {
	return i.ToEventDestinationArrayOutputWithContext(context.Background())
}

func (i EventDestinationArray) ToEventDestinationArrayOutputWithContext(ctx context.Context) EventDestinationArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EventDestinationArrayOutput)
}

// EventDestinationMapInput is an input type that accepts EventDestinationMap and EventDestinationMapOutput values.
// You can construct a concrete instance of `EventDestinationMapInput` via:
//
//	EventDestinationMap{ "key": EventDestinationArgs{...} }
type EventDestinationMapInput interface {
	pulumi.Input

	ToEventDestinationMapOutput() EventDestinationMapOutput
	ToEventDestinationMapOutputWithContext(context.Context) EventDestinationMapOutput
}

type EventDestinationMap map[string]EventDestinationInput

func (EventDestinationMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*EventDestination)(nil)).Elem()
}

func (i EventDestinationMap) ToEventDestinationMapOutput() EventDestinationMapOutput {
	return i.ToEventDestinationMapOutputWithContext(context.Background())
}

func (i EventDestinationMap) ToEventDestinationMapOutputWithContext(ctx context.Context) EventDestinationMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EventDestinationMapOutput)
}

type EventDestinationOutput struct{ *pulumi.OutputState }

func (EventDestinationOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**EventDestination)(nil)).Elem()
}

func (o EventDestinationOutput) ToEventDestinationOutput() EventDestinationOutput {
	return o
}

func (o EventDestinationOutput) ToEventDestinationOutputWithContext(ctx context.Context) EventDestinationOutput {
	return o
}

// The SES event destination ARN.
func (o EventDestinationOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v *EventDestination) pulumi.StringOutput { return v.Arn }).(pulumi.StringOutput)
}

// CloudWatch destination for the events
func (o EventDestinationOutput) CloudwatchDestinations() EventDestinationCloudwatchDestinationArrayOutput {
	return o.ApplyT(func(v *EventDestination) EventDestinationCloudwatchDestinationArrayOutput {
		return v.CloudwatchDestinations
	}).(EventDestinationCloudwatchDestinationArrayOutput)
}

// The name of the configuration set
func (o EventDestinationOutput) ConfigurationSetName() pulumi.StringOutput {
	return o.ApplyT(func(v *EventDestination) pulumi.StringOutput { return v.ConfigurationSetName }).(pulumi.StringOutput)
}

// If true, the event destination will be enabled
func (o EventDestinationOutput) Enabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *EventDestination) pulumi.BoolPtrOutput { return v.Enabled }).(pulumi.BoolPtrOutput)
}

// Send the events to a kinesis firehose destination
func (o EventDestinationOutput) KinesisDestination() EventDestinationKinesisDestinationPtrOutput {
	return o.ApplyT(func(v *EventDestination) EventDestinationKinesisDestinationPtrOutput { return v.KinesisDestination }).(EventDestinationKinesisDestinationPtrOutput)
}

// A list of matching types. May be any of `"send"`, `"reject"`, `"bounce"`, `"complaint"`, `"delivery"`, `"open"`, `"click"`, or `"renderingFailure"`.
func (o EventDestinationOutput) MatchingTypes() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *EventDestination) pulumi.StringArrayOutput { return v.MatchingTypes }).(pulumi.StringArrayOutput)
}

// The name of the event destination
func (o EventDestinationOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *EventDestination) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Send the events to an SNS Topic destination
//
// > **NOTE:** You can specify `"cloudwatchDestination"` or `"kinesisDestination"` but not both
func (o EventDestinationOutput) SnsDestination() EventDestinationSnsDestinationPtrOutput {
	return o.ApplyT(func(v *EventDestination) EventDestinationSnsDestinationPtrOutput { return v.SnsDestination }).(EventDestinationSnsDestinationPtrOutput)
}

type EventDestinationArrayOutput struct{ *pulumi.OutputState }

func (EventDestinationArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*EventDestination)(nil)).Elem()
}

func (o EventDestinationArrayOutput) ToEventDestinationArrayOutput() EventDestinationArrayOutput {
	return o
}

func (o EventDestinationArrayOutput) ToEventDestinationArrayOutputWithContext(ctx context.Context) EventDestinationArrayOutput {
	return o
}

func (o EventDestinationArrayOutput) Index(i pulumi.IntInput) EventDestinationOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *EventDestination {
		return vs[0].([]*EventDestination)[vs[1].(int)]
	}).(EventDestinationOutput)
}

type EventDestinationMapOutput struct{ *pulumi.OutputState }

func (EventDestinationMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*EventDestination)(nil)).Elem()
}

func (o EventDestinationMapOutput) ToEventDestinationMapOutput() EventDestinationMapOutput {
	return o
}

func (o EventDestinationMapOutput) ToEventDestinationMapOutputWithContext(ctx context.Context) EventDestinationMapOutput {
	return o
}

func (o EventDestinationMapOutput) MapIndex(k pulumi.StringInput) EventDestinationOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *EventDestination {
		return vs[0].(map[string]*EventDestination)[vs[1].(string)]
	}).(EventDestinationOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*EventDestinationInput)(nil)).Elem(), &EventDestination{})
	pulumi.RegisterInputType(reflect.TypeOf((*EventDestinationArrayInput)(nil)).Elem(), EventDestinationArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*EventDestinationMapInput)(nil)).Elem(), EventDestinationMap{})
	pulumi.RegisterOutputType(EventDestinationOutput{})
	pulumi.RegisterOutputType(EventDestinationArrayOutput{})
	pulumi.RegisterOutputType(EventDestinationMapOutput{})
}

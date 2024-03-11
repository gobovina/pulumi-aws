// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package iot

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages IoT event configurations.
//
// > **NOTE:** Deleting this resource does not disable the event configurations, the resource in simply removed from state instead.
//
// ## Example Usage
//
// <!--Start PulumiCodeChooser -->
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/iot"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := iot.NewEventConfigurations(ctx, "example", &iot.EventConfigurationsArgs{
//				EventConfigurations: pulumi.BoolMap{
//					"THING":                  pulumi.Bool(true),
//					"THING_GROUP":            pulumi.Bool(false),
//					"THING_TYPE":             pulumi.Bool(false),
//					"THING_GROUP_MEMBERSHIP": pulumi.Bool(false),
//					"THING_GROUP_HIERARCHY":  pulumi.Bool(false),
//					"THING_TYPE_ASSOCIATION": pulumi.Bool(false),
//					"JOB":                    pulumi.Bool(false),
//					"JOB_EXECUTION":          pulumi.Bool(false),
//					"POLICY":                 pulumi.Bool(false),
//					"CERTIFICATE":            pulumi.Bool(true),
//					"CA_CERTIFICATE":         pulumi.Bool(false),
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
// Using `pulumi import`, import IoT Event Configurations using the AWS Region. For example:
//
// ```sh
// $ pulumi import aws:iot/eventConfigurations:EventConfigurations example us-west-2
// ```
type EventConfigurations struct {
	pulumi.CustomResourceState

	// Map. The new event configuration values. You can use only these strings as keys: `THING_GROUP_HIERARCHY`, `THING_GROUP_MEMBERSHIP`, `THING_TYPE`, `THING_TYPE_ASSOCIATION`, `THING_GROUP`, `THING`, `POLICY`, `CA_CERTIFICATE`, `JOB_EXECUTION`, `CERTIFICATE`, `JOB`. Use boolean for values of mapping.
	EventConfigurations pulumi.BoolMapOutput `pulumi:"eventConfigurations"`
}

// NewEventConfigurations registers a new resource with the given unique name, arguments, and options.
func NewEventConfigurations(ctx *pulumi.Context,
	name string, args *EventConfigurationsArgs, opts ...pulumi.ResourceOption) (*EventConfigurations, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.EventConfigurations == nil {
		return nil, errors.New("invalid value for required argument 'EventConfigurations'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource EventConfigurations
	err := ctx.RegisterResource("aws:iot/eventConfigurations:EventConfigurations", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetEventConfigurations gets an existing EventConfigurations resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetEventConfigurations(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *EventConfigurationsState, opts ...pulumi.ResourceOption) (*EventConfigurations, error) {
	var resource EventConfigurations
	err := ctx.ReadResource("aws:iot/eventConfigurations:EventConfigurations", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering EventConfigurations resources.
type eventConfigurationsState struct {
	// Map. The new event configuration values. You can use only these strings as keys: `THING_GROUP_HIERARCHY`, `THING_GROUP_MEMBERSHIP`, `THING_TYPE`, `THING_TYPE_ASSOCIATION`, `THING_GROUP`, `THING`, `POLICY`, `CA_CERTIFICATE`, `JOB_EXECUTION`, `CERTIFICATE`, `JOB`. Use boolean for values of mapping.
	EventConfigurations map[string]bool `pulumi:"eventConfigurations"`
}

type EventConfigurationsState struct {
	// Map. The new event configuration values. You can use only these strings as keys: `THING_GROUP_HIERARCHY`, `THING_GROUP_MEMBERSHIP`, `THING_TYPE`, `THING_TYPE_ASSOCIATION`, `THING_GROUP`, `THING`, `POLICY`, `CA_CERTIFICATE`, `JOB_EXECUTION`, `CERTIFICATE`, `JOB`. Use boolean for values of mapping.
	EventConfigurations pulumi.BoolMapInput
}

func (EventConfigurationsState) ElementType() reflect.Type {
	return reflect.TypeOf((*eventConfigurationsState)(nil)).Elem()
}

type eventConfigurationsArgs struct {
	// Map. The new event configuration values. You can use only these strings as keys: `THING_GROUP_HIERARCHY`, `THING_GROUP_MEMBERSHIP`, `THING_TYPE`, `THING_TYPE_ASSOCIATION`, `THING_GROUP`, `THING`, `POLICY`, `CA_CERTIFICATE`, `JOB_EXECUTION`, `CERTIFICATE`, `JOB`. Use boolean for values of mapping.
	EventConfigurations map[string]bool `pulumi:"eventConfigurations"`
}

// The set of arguments for constructing a EventConfigurations resource.
type EventConfigurationsArgs struct {
	// Map. The new event configuration values. You can use only these strings as keys: `THING_GROUP_HIERARCHY`, `THING_GROUP_MEMBERSHIP`, `THING_TYPE`, `THING_TYPE_ASSOCIATION`, `THING_GROUP`, `THING`, `POLICY`, `CA_CERTIFICATE`, `JOB_EXECUTION`, `CERTIFICATE`, `JOB`. Use boolean for values of mapping.
	EventConfigurations pulumi.BoolMapInput
}

func (EventConfigurationsArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*eventConfigurationsArgs)(nil)).Elem()
}

type EventConfigurationsInput interface {
	pulumi.Input

	ToEventConfigurationsOutput() EventConfigurationsOutput
	ToEventConfigurationsOutputWithContext(ctx context.Context) EventConfigurationsOutput
}

func (*EventConfigurations) ElementType() reflect.Type {
	return reflect.TypeOf((**EventConfigurations)(nil)).Elem()
}

func (i *EventConfigurations) ToEventConfigurationsOutput() EventConfigurationsOutput {
	return i.ToEventConfigurationsOutputWithContext(context.Background())
}

func (i *EventConfigurations) ToEventConfigurationsOutputWithContext(ctx context.Context) EventConfigurationsOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EventConfigurationsOutput)
}

// EventConfigurationsArrayInput is an input type that accepts EventConfigurationsArray and EventConfigurationsArrayOutput values.
// You can construct a concrete instance of `EventConfigurationsArrayInput` via:
//
//	EventConfigurationsArray{ EventConfigurationsArgs{...} }
type EventConfigurationsArrayInput interface {
	pulumi.Input

	ToEventConfigurationsArrayOutput() EventConfigurationsArrayOutput
	ToEventConfigurationsArrayOutputWithContext(context.Context) EventConfigurationsArrayOutput
}

type EventConfigurationsArray []EventConfigurationsInput

func (EventConfigurationsArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*EventConfigurations)(nil)).Elem()
}

func (i EventConfigurationsArray) ToEventConfigurationsArrayOutput() EventConfigurationsArrayOutput {
	return i.ToEventConfigurationsArrayOutputWithContext(context.Background())
}

func (i EventConfigurationsArray) ToEventConfigurationsArrayOutputWithContext(ctx context.Context) EventConfigurationsArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EventConfigurationsArrayOutput)
}

// EventConfigurationsMapInput is an input type that accepts EventConfigurationsMap and EventConfigurationsMapOutput values.
// You can construct a concrete instance of `EventConfigurationsMapInput` via:
//
//	EventConfigurationsMap{ "key": EventConfigurationsArgs{...} }
type EventConfigurationsMapInput interface {
	pulumi.Input

	ToEventConfigurationsMapOutput() EventConfigurationsMapOutput
	ToEventConfigurationsMapOutputWithContext(context.Context) EventConfigurationsMapOutput
}

type EventConfigurationsMap map[string]EventConfigurationsInput

func (EventConfigurationsMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*EventConfigurations)(nil)).Elem()
}

func (i EventConfigurationsMap) ToEventConfigurationsMapOutput() EventConfigurationsMapOutput {
	return i.ToEventConfigurationsMapOutputWithContext(context.Background())
}

func (i EventConfigurationsMap) ToEventConfigurationsMapOutputWithContext(ctx context.Context) EventConfigurationsMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EventConfigurationsMapOutput)
}

type EventConfigurationsOutput struct{ *pulumi.OutputState }

func (EventConfigurationsOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**EventConfigurations)(nil)).Elem()
}

func (o EventConfigurationsOutput) ToEventConfigurationsOutput() EventConfigurationsOutput {
	return o
}

func (o EventConfigurationsOutput) ToEventConfigurationsOutputWithContext(ctx context.Context) EventConfigurationsOutput {
	return o
}

// Map. The new event configuration values. You can use only these strings as keys: `THING_GROUP_HIERARCHY`, `THING_GROUP_MEMBERSHIP`, `THING_TYPE`, `THING_TYPE_ASSOCIATION`, `THING_GROUP`, `THING`, `POLICY`, `CA_CERTIFICATE`, `JOB_EXECUTION`, `CERTIFICATE`, `JOB`. Use boolean for values of mapping.
func (o EventConfigurationsOutput) EventConfigurations() pulumi.BoolMapOutput {
	return o.ApplyT(func(v *EventConfigurations) pulumi.BoolMapOutput { return v.EventConfigurations }).(pulumi.BoolMapOutput)
}

type EventConfigurationsArrayOutput struct{ *pulumi.OutputState }

func (EventConfigurationsArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*EventConfigurations)(nil)).Elem()
}

func (o EventConfigurationsArrayOutput) ToEventConfigurationsArrayOutput() EventConfigurationsArrayOutput {
	return o
}

func (o EventConfigurationsArrayOutput) ToEventConfigurationsArrayOutputWithContext(ctx context.Context) EventConfigurationsArrayOutput {
	return o
}

func (o EventConfigurationsArrayOutput) Index(i pulumi.IntInput) EventConfigurationsOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *EventConfigurations {
		return vs[0].([]*EventConfigurations)[vs[1].(int)]
	}).(EventConfigurationsOutput)
}

type EventConfigurationsMapOutput struct{ *pulumi.OutputState }

func (EventConfigurationsMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*EventConfigurations)(nil)).Elem()
}

func (o EventConfigurationsMapOutput) ToEventConfigurationsMapOutput() EventConfigurationsMapOutput {
	return o
}

func (o EventConfigurationsMapOutput) ToEventConfigurationsMapOutputWithContext(ctx context.Context) EventConfigurationsMapOutput {
	return o
}

func (o EventConfigurationsMapOutput) MapIndex(k pulumi.StringInput) EventConfigurationsOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *EventConfigurations {
		return vs[0].(map[string]*EventConfigurations)[vs[1].(string)]
	}).(EventConfigurationsOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*EventConfigurationsInput)(nil)).Elem(), &EventConfigurations{})
	pulumi.RegisterInputType(reflect.TypeOf((*EventConfigurationsArrayInput)(nil)).Elem(), EventConfigurationsArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*EventConfigurationsMapInput)(nil)).Elem(), EventConfigurationsMap{})
	pulumi.RegisterOutputType(EventConfigurationsOutput{})
	pulumi.RegisterOutputType(EventConfigurationsArrayOutput{})
	pulumi.RegisterOutputType(EventConfigurationsMapOutput{})
}

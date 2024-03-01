// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cloudwatch

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a resource to create an EventBridge permission to support cross-account events in the current account default event bus.
//
// > **Note:** EventBridge was formerly known as CloudWatch Events. The functionality is identical.
//
// > **Note:** The EventBridge bus policy resource  (`cloudwatch.EventBusPolicy`) is incompatible with the EventBridge permission resource (`cloudwatch.EventPermission`) and will overwrite permissions.
//
// ## Example Usage
// ### Account Access
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/cloudwatch"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := cloudwatch.NewEventPermission(ctx, "DevAccountAccess", &cloudwatch.EventPermissionArgs{
//				Principal:   pulumi.String("123456789012"),
//				StatementId: pulumi.String("DevAccountAccess"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// ### Organization Access
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/cloudwatch"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := cloudwatch.NewEventPermission(ctx, "OrganizationAccess", &cloudwatch.EventPermissionArgs{
//				Principal:   pulumi.String("*"),
//				StatementId: pulumi.String("OrganizationAccess"),
//				Condition: &cloudwatch.EventPermissionConditionArgs{
//					Key:   pulumi.String("aws:PrincipalOrgID"),
//					Type:  pulumi.String("StringEquals"),
//					Value: pulumi.Any(example.Id),
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
// Using `pulumi import`, import EventBridge permissions using the `event_bus_name/statement_id` (if you omit `event_bus_name`, the `default` event bus will be used). For example:
//
// ```sh
//
//	$ pulumi import aws:cloudwatch/eventPermission:EventPermission DevAccountAccess example-event-bus/DevAccountAccess
//
// ```
type EventPermission struct {
	pulumi.CustomResourceState

	// The action that you are enabling the other account to perform. Defaults to `events:PutEvents`.
	Action pulumi.StringPtrOutput `pulumi:"action"`
	// Configuration block to limit the event bus permissions you are granting to only accounts that fulfill the condition. Specified below.
	Condition EventPermissionConditionPtrOutput `pulumi:"condition"`
	// The name of the event bus to set the permissions on.
	// If you omit this, the permissions are set on the `default` event bus.
	EventBusName pulumi.StringPtrOutput `pulumi:"eventBusName"`
	// The 12-digit AWS account ID that you are permitting to put events to your default event bus. Specify `*` to permit any account to put events to your default event bus, optionally limited by `condition`.
	Principal pulumi.StringOutput `pulumi:"principal"`
	// An identifier string for the external account that you are granting permissions to.
	StatementId pulumi.StringOutput `pulumi:"statementId"`
}

// NewEventPermission registers a new resource with the given unique name, arguments, and options.
func NewEventPermission(ctx *pulumi.Context,
	name string, args *EventPermissionArgs, opts ...pulumi.ResourceOption) (*EventPermission, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Principal == nil {
		return nil, errors.New("invalid value for required argument 'Principal'")
	}
	if args.StatementId == nil {
		return nil, errors.New("invalid value for required argument 'StatementId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource EventPermission
	err := ctx.RegisterResource("aws:cloudwatch/eventPermission:EventPermission", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetEventPermission gets an existing EventPermission resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetEventPermission(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *EventPermissionState, opts ...pulumi.ResourceOption) (*EventPermission, error) {
	var resource EventPermission
	err := ctx.ReadResource("aws:cloudwatch/eventPermission:EventPermission", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering EventPermission resources.
type eventPermissionState struct {
	// The action that you are enabling the other account to perform. Defaults to `events:PutEvents`.
	Action *string `pulumi:"action"`
	// Configuration block to limit the event bus permissions you are granting to only accounts that fulfill the condition. Specified below.
	Condition *EventPermissionCondition `pulumi:"condition"`
	// The name of the event bus to set the permissions on.
	// If you omit this, the permissions are set on the `default` event bus.
	EventBusName *string `pulumi:"eventBusName"`
	// The 12-digit AWS account ID that you are permitting to put events to your default event bus. Specify `*` to permit any account to put events to your default event bus, optionally limited by `condition`.
	Principal *string `pulumi:"principal"`
	// An identifier string for the external account that you are granting permissions to.
	StatementId *string `pulumi:"statementId"`
}

type EventPermissionState struct {
	// The action that you are enabling the other account to perform. Defaults to `events:PutEvents`.
	Action pulumi.StringPtrInput
	// Configuration block to limit the event bus permissions you are granting to only accounts that fulfill the condition. Specified below.
	Condition EventPermissionConditionPtrInput
	// The name of the event bus to set the permissions on.
	// If you omit this, the permissions are set on the `default` event bus.
	EventBusName pulumi.StringPtrInput
	// The 12-digit AWS account ID that you are permitting to put events to your default event bus. Specify `*` to permit any account to put events to your default event bus, optionally limited by `condition`.
	Principal pulumi.StringPtrInput
	// An identifier string for the external account that you are granting permissions to.
	StatementId pulumi.StringPtrInput
}

func (EventPermissionState) ElementType() reflect.Type {
	return reflect.TypeOf((*eventPermissionState)(nil)).Elem()
}

type eventPermissionArgs struct {
	// The action that you are enabling the other account to perform. Defaults to `events:PutEvents`.
	Action *string `pulumi:"action"`
	// Configuration block to limit the event bus permissions you are granting to only accounts that fulfill the condition. Specified below.
	Condition *EventPermissionCondition `pulumi:"condition"`
	// The name of the event bus to set the permissions on.
	// If you omit this, the permissions are set on the `default` event bus.
	EventBusName *string `pulumi:"eventBusName"`
	// The 12-digit AWS account ID that you are permitting to put events to your default event bus. Specify `*` to permit any account to put events to your default event bus, optionally limited by `condition`.
	Principal string `pulumi:"principal"`
	// An identifier string for the external account that you are granting permissions to.
	StatementId string `pulumi:"statementId"`
}

// The set of arguments for constructing a EventPermission resource.
type EventPermissionArgs struct {
	// The action that you are enabling the other account to perform. Defaults to `events:PutEvents`.
	Action pulumi.StringPtrInput
	// Configuration block to limit the event bus permissions you are granting to only accounts that fulfill the condition. Specified below.
	Condition EventPermissionConditionPtrInput
	// The name of the event bus to set the permissions on.
	// If you omit this, the permissions are set on the `default` event bus.
	EventBusName pulumi.StringPtrInput
	// The 12-digit AWS account ID that you are permitting to put events to your default event bus. Specify `*` to permit any account to put events to your default event bus, optionally limited by `condition`.
	Principal pulumi.StringInput
	// An identifier string for the external account that you are granting permissions to.
	StatementId pulumi.StringInput
}

func (EventPermissionArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*eventPermissionArgs)(nil)).Elem()
}

type EventPermissionInput interface {
	pulumi.Input

	ToEventPermissionOutput() EventPermissionOutput
	ToEventPermissionOutputWithContext(ctx context.Context) EventPermissionOutput
}

func (*EventPermission) ElementType() reflect.Type {
	return reflect.TypeOf((**EventPermission)(nil)).Elem()
}

func (i *EventPermission) ToEventPermissionOutput() EventPermissionOutput {
	return i.ToEventPermissionOutputWithContext(context.Background())
}

func (i *EventPermission) ToEventPermissionOutputWithContext(ctx context.Context) EventPermissionOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EventPermissionOutput)
}

// EventPermissionArrayInput is an input type that accepts EventPermissionArray and EventPermissionArrayOutput values.
// You can construct a concrete instance of `EventPermissionArrayInput` via:
//
//	EventPermissionArray{ EventPermissionArgs{...} }
type EventPermissionArrayInput interface {
	pulumi.Input

	ToEventPermissionArrayOutput() EventPermissionArrayOutput
	ToEventPermissionArrayOutputWithContext(context.Context) EventPermissionArrayOutput
}

type EventPermissionArray []EventPermissionInput

func (EventPermissionArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*EventPermission)(nil)).Elem()
}

func (i EventPermissionArray) ToEventPermissionArrayOutput() EventPermissionArrayOutput {
	return i.ToEventPermissionArrayOutputWithContext(context.Background())
}

func (i EventPermissionArray) ToEventPermissionArrayOutputWithContext(ctx context.Context) EventPermissionArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EventPermissionArrayOutput)
}

// EventPermissionMapInput is an input type that accepts EventPermissionMap and EventPermissionMapOutput values.
// You can construct a concrete instance of `EventPermissionMapInput` via:
//
//	EventPermissionMap{ "key": EventPermissionArgs{...} }
type EventPermissionMapInput interface {
	pulumi.Input

	ToEventPermissionMapOutput() EventPermissionMapOutput
	ToEventPermissionMapOutputWithContext(context.Context) EventPermissionMapOutput
}

type EventPermissionMap map[string]EventPermissionInput

func (EventPermissionMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*EventPermission)(nil)).Elem()
}

func (i EventPermissionMap) ToEventPermissionMapOutput() EventPermissionMapOutput {
	return i.ToEventPermissionMapOutputWithContext(context.Background())
}

func (i EventPermissionMap) ToEventPermissionMapOutputWithContext(ctx context.Context) EventPermissionMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EventPermissionMapOutput)
}

type EventPermissionOutput struct{ *pulumi.OutputState }

func (EventPermissionOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**EventPermission)(nil)).Elem()
}

func (o EventPermissionOutput) ToEventPermissionOutput() EventPermissionOutput {
	return o
}

func (o EventPermissionOutput) ToEventPermissionOutputWithContext(ctx context.Context) EventPermissionOutput {
	return o
}

// The action that you are enabling the other account to perform. Defaults to `events:PutEvents`.
func (o EventPermissionOutput) Action() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *EventPermission) pulumi.StringPtrOutput { return v.Action }).(pulumi.StringPtrOutput)
}

// Configuration block to limit the event bus permissions you are granting to only accounts that fulfill the condition. Specified below.
func (o EventPermissionOutput) Condition() EventPermissionConditionPtrOutput {
	return o.ApplyT(func(v *EventPermission) EventPermissionConditionPtrOutput { return v.Condition }).(EventPermissionConditionPtrOutput)
}

// The name of the event bus to set the permissions on.
// If you omit this, the permissions are set on the `default` event bus.
func (o EventPermissionOutput) EventBusName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *EventPermission) pulumi.StringPtrOutput { return v.EventBusName }).(pulumi.StringPtrOutput)
}

// The 12-digit AWS account ID that you are permitting to put events to your default event bus. Specify `*` to permit any account to put events to your default event bus, optionally limited by `condition`.
func (o EventPermissionOutput) Principal() pulumi.StringOutput {
	return o.ApplyT(func(v *EventPermission) pulumi.StringOutput { return v.Principal }).(pulumi.StringOutput)
}

// An identifier string for the external account that you are granting permissions to.
func (o EventPermissionOutput) StatementId() pulumi.StringOutput {
	return o.ApplyT(func(v *EventPermission) pulumi.StringOutput { return v.StatementId }).(pulumi.StringOutput)
}

type EventPermissionArrayOutput struct{ *pulumi.OutputState }

func (EventPermissionArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*EventPermission)(nil)).Elem()
}

func (o EventPermissionArrayOutput) ToEventPermissionArrayOutput() EventPermissionArrayOutput {
	return o
}

func (o EventPermissionArrayOutput) ToEventPermissionArrayOutputWithContext(ctx context.Context) EventPermissionArrayOutput {
	return o
}

func (o EventPermissionArrayOutput) Index(i pulumi.IntInput) EventPermissionOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *EventPermission {
		return vs[0].([]*EventPermission)[vs[1].(int)]
	}).(EventPermissionOutput)
}

type EventPermissionMapOutput struct{ *pulumi.OutputState }

func (EventPermissionMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*EventPermission)(nil)).Elem()
}

func (o EventPermissionMapOutput) ToEventPermissionMapOutput() EventPermissionMapOutput {
	return o
}

func (o EventPermissionMapOutput) ToEventPermissionMapOutputWithContext(ctx context.Context) EventPermissionMapOutput {
	return o
}

func (o EventPermissionMapOutput) MapIndex(k pulumi.StringInput) EventPermissionOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *EventPermission {
		return vs[0].(map[string]*EventPermission)[vs[1].(string)]
	}).(EventPermissionOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*EventPermissionInput)(nil)).Elem(), &EventPermission{})
	pulumi.RegisterInputType(reflect.TypeOf((*EventPermissionArrayInput)(nil)).Elem(), EventPermissionArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*EventPermissionMapInput)(nil)).Elem(), EventPermissionMap{})
	pulumi.RegisterOutputType(EventPermissionOutput{})
	pulumi.RegisterOutputType(EventPermissionArrayOutput{})
	pulumi.RegisterOutputType(EventPermissionMapOutput{})
}

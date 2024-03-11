// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package globalaccelerator

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Global Accelerator custom routing endpoint group.
//
// ## Example Usage
//
// <!--Start PulumiCodeChooser -->
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/globalaccelerator"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := globalaccelerator.NewCustomRoutingEndpointGroup(ctx, "example", &globalaccelerator.CustomRoutingEndpointGroupArgs{
//				ListenerArn: pulumi.Any(exampleAwsGlobalacceleratorCustomRoutingListener.Id),
//				DestinationConfigurations: globalaccelerator.CustomRoutingEndpointGroupDestinationConfigurationArray{
//					&globalaccelerator.CustomRoutingEndpointGroupDestinationConfigurationArgs{
//						FromPort: pulumi.Int(80),
//						ToPort:   pulumi.Int(8080),
//						Protocols: pulumi.StringArray{
//							pulumi.String("TCP"),
//						},
//					},
//				},
//				EndpointConfigurations: globalaccelerator.CustomRoutingEndpointGroupEndpointConfigurationArray{
//					&globalaccelerator.CustomRoutingEndpointGroupEndpointConfigurationArgs{
//						EndpointId: pulumi.Any(exampleAwsSubnet.Id),
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
// ## Import
//
// Using `pulumi import`, import Global Accelerator custom routing endpoint groups using the `id`. For example:
//
// ```sh
// $ pulumi import aws:globalaccelerator/customRoutingEndpointGroup:CustomRoutingEndpointGroup example arn:aws:globalaccelerator::111111111111:accelerator/xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx/listener/xxxxxxx/endpoint-group/xxxxxxxx
// ```
type CustomRoutingEndpointGroup struct {
	pulumi.CustomResourceState

	// The Amazon Resource Name (ARN) of the custom routing endpoint group.
	Arn pulumi.StringOutput `pulumi:"arn"`
	// The port ranges and protocols for all endpoints in a custom routing endpoint group to accept client traffic on. Fields documented below.
	DestinationConfigurations CustomRoutingEndpointGroupDestinationConfigurationArrayOutput `pulumi:"destinationConfigurations"`
	// The list of endpoint objects. Fields documented below.
	EndpointConfigurations CustomRoutingEndpointGroupEndpointConfigurationArrayOutput `pulumi:"endpointConfigurations"`
	// The name of the AWS Region where the custom routing endpoint group is located.
	EndpointGroupRegion pulumi.StringOutput `pulumi:"endpointGroupRegion"`
	// The Amazon Resource Name (ARN) of the custom routing listener.
	ListenerArn pulumi.StringOutput `pulumi:"listenerArn"`
}

// NewCustomRoutingEndpointGroup registers a new resource with the given unique name, arguments, and options.
func NewCustomRoutingEndpointGroup(ctx *pulumi.Context,
	name string, args *CustomRoutingEndpointGroupArgs, opts ...pulumi.ResourceOption) (*CustomRoutingEndpointGroup, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.DestinationConfigurations == nil {
		return nil, errors.New("invalid value for required argument 'DestinationConfigurations'")
	}
	if args.ListenerArn == nil {
		return nil, errors.New("invalid value for required argument 'ListenerArn'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource CustomRoutingEndpointGroup
	err := ctx.RegisterResource("aws:globalaccelerator/customRoutingEndpointGroup:CustomRoutingEndpointGroup", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetCustomRoutingEndpointGroup gets an existing CustomRoutingEndpointGroup resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetCustomRoutingEndpointGroup(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *CustomRoutingEndpointGroupState, opts ...pulumi.ResourceOption) (*CustomRoutingEndpointGroup, error) {
	var resource CustomRoutingEndpointGroup
	err := ctx.ReadResource("aws:globalaccelerator/customRoutingEndpointGroup:CustomRoutingEndpointGroup", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering CustomRoutingEndpointGroup resources.
type customRoutingEndpointGroupState struct {
	// The Amazon Resource Name (ARN) of the custom routing endpoint group.
	Arn *string `pulumi:"arn"`
	// The port ranges and protocols for all endpoints in a custom routing endpoint group to accept client traffic on. Fields documented below.
	DestinationConfigurations []CustomRoutingEndpointGroupDestinationConfiguration `pulumi:"destinationConfigurations"`
	// The list of endpoint objects. Fields documented below.
	EndpointConfigurations []CustomRoutingEndpointGroupEndpointConfiguration `pulumi:"endpointConfigurations"`
	// The name of the AWS Region where the custom routing endpoint group is located.
	EndpointGroupRegion *string `pulumi:"endpointGroupRegion"`
	// The Amazon Resource Name (ARN) of the custom routing listener.
	ListenerArn *string `pulumi:"listenerArn"`
}

type CustomRoutingEndpointGroupState struct {
	// The Amazon Resource Name (ARN) of the custom routing endpoint group.
	Arn pulumi.StringPtrInput
	// The port ranges and protocols for all endpoints in a custom routing endpoint group to accept client traffic on. Fields documented below.
	DestinationConfigurations CustomRoutingEndpointGroupDestinationConfigurationArrayInput
	// The list of endpoint objects. Fields documented below.
	EndpointConfigurations CustomRoutingEndpointGroupEndpointConfigurationArrayInput
	// The name of the AWS Region where the custom routing endpoint group is located.
	EndpointGroupRegion pulumi.StringPtrInput
	// The Amazon Resource Name (ARN) of the custom routing listener.
	ListenerArn pulumi.StringPtrInput
}

func (CustomRoutingEndpointGroupState) ElementType() reflect.Type {
	return reflect.TypeOf((*customRoutingEndpointGroupState)(nil)).Elem()
}

type customRoutingEndpointGroupArgs struct {
	// The port ranges and protocols for all endpoints in a custom routing endpoint group to accept client traffic on. Fields documented below.
	DestinationConfigurations []CustomRoutingEndpointGroupDestinationConfiguration `pulumi:"destinationConfigurations"`
	// The list of endpoint objects. Fields documented below.
	EndpointConfigurations []CustomRoutingEndpointGroupEndpointConfiguration `pulumi:"endpointConfigurations"`
	// The name of the AWS Region where the custom routing endpoint group is located.
	EndpointGroupRegion *string `pulumi:"endpointGroupRegion"`
	// The Amazon Resource Name (ARN) of the custom routing listener.
	ListenerArn string `pulumi:"listenerArn"`
}

// The set of arguments for constructing a CustomRoutingEndpointGroup resource.
type CustomRoutingEndpointGroupArgs struct {
	// The port ranges and protocols for all endpoints in a custom routing endpoint group to accept client traffic on. Fields documented below.
	DestinationConfigurations CustomRoutingEndpointGroupDestinationConfigurationArrayInput
	// The list of endpoint objects. Fields documented below.
	EndpointConfigurations CustomRoutingEndpointGroupEndpointConfigurationArrayInput
	// The name of the AWS Region where the custom routing endpoint group is located.
	EndpointGroupRegion pulumi.StringPtrInput
	// The Amazon Resource Name (ARN) of the custom routing listener.
	ListenerArn pulumi.StringInput
}

func (CustomRoutingEndpointGroupArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*customRoutingEndpointGroupArgs)(nil)).Elem()
}

type CustomRoutingEndpointGroupInput interface {
	pulumi.Input

	ToCustomRoutingEndpointGroupOutput() CustomRoutingEndpointGroupOutput
	ToCustomRoutingEndpointGroupOutputWithContext(ctx context.Context) CustomRoutingEndpointGroupOutput
}

func (*CustomRoutingEndpointGroup) ElementType() reflect.Type {
	return reflect.TypeOf((**CustomRoutingEndpointGroup)(nil)).Elem()
}

func (i *CustomRoutingEndpointGroup) ToCustomRoutingEndpointGroupOutput() CustomRoutingEndpointGroupOutput {
	return i.ToCustomRoutingEndpointGroupOutputWithContext(context.Background())
}

func (i *CustomRoutingEndpointGroup) ToCustomRoutingEndpointGroupOutputWithContext(ctx context.Context) CustomRoutingEndpointGroupOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CustomRoutingEndpointGroupOutput)
}

// CustomRoutingEndpointGroupArrayInput is an input type that accepts CustomRoutingEndpointGroupArray and CustomRoutingEndpointGroupArrayOutput values.
// You can construct a concrete instance of `CustomRoutingEndpointGroupArrayInput` via:
//
//	CustomRoutingEndpointGroupArray{ CustomRoutingEndpointGroupArgs{...} }
type CustomRoutingEndpointGroupArrayInput interface {
	pulumi.Input

	ToCustomRoutingEndpointGroupArrayOutput() CustomRoutingEndpointGroupArrayOutput
	ToCustomRoutingEndpointGroupArrayOutputWithContext(context.Context) CustomRoutingEndpointGroupArrayOutput
}

type CustomRoutingEndpointGroupArray []CustomRoutingEndpointGroupInput

func (CustomRoutingEndpointGroupArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*CustomRoutingEndpointGroup)(nil)).Elem()
}

func (i CustomRoutingEndpointGroupArray) ToCustomRoutingEndpointGroupArrayOutput() CustomRoutingEndpointGroupArrayOutput {
	return i.ToCustomRoutingEndpointGroupArrayOutputWithContext(context.Background())
}

func (i CustomRoutingEndpointGroupArray) ToCustomRoutingEndpointGroupArrayOutputWithContext(ctx context.Context) CustomRoutingEndpointGroupArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CustomRoutingEndpointGroupArrayOutput)
}

// CustomRoutingEndpointGroupMapInput is an input type that accepts CustomRoutingEndpointGroupMap and CustomRoutingEndpointGroupMapOutput values.
// You can construct a concrete instance of `CustomRoutingEndpointGroupMapInput` via:
//
//	CustomRoutingEndpointGroupMap{ "key": CustomRoutingEndpointGroupArgs{...} }
type CustomRoutingEndpointGroupMapInput interface {
	pulumi.Input

	ToCustomRoutingEndpointGroupMapOutput() CustomRoutingEndpointGroupMapOutput
	ToCustomRoutingEndpointGroupMapOutputWithContext(context.Context) CustomRoutingEndpointGroupMapOutput
}

type CustomRoutingEndpointGroupMap map[string]CustomRoutingEndpointGroupInput

func (CustomRoutingEndpointGroupMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*CustomRoutingEndpointGroup)(nil)).Elem()
}

func (i CustomRoutingEndpointGroupMap) ToCustomRoutingEndpointGroupMapOutput() CustomRoutingEndpointGroupMapOutput {
	return i.ToCustomRoutingEndpointGroupMapOutputWithContext(context.Background())
}

func (i CustomRoutingEndpointGroupMap) ToCustomRoutingEndpointGroupMapOutputWithContext(ctx context.Context) CustomRoutingEndpointGroupMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CustomRoutingEndpointGroupMapOutput)
}

type CustomRoutingEndpointGroupOutput struct{ *pulumi.OutputState }

func (CustomRoutingEndpointGroupOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**CustomRoutingEndpointGroup)(nil)).Elem()
}

func (o CustomRoutingEndpointGroupOutput) ToCustomRoutingEndpointGroupOutput() CustomRoutingEndpointGroupOutput {
	return o
}

func (o CustomRoutingEndpointGroupOutput) ToCustomRoutingEndpointGroupOutputWithContext(ctx context.Context) CustomRoutingEndpointGroupOutput {
	return o
}

// The Amazon Resource Name (ARN) of the custom routing endpoint group.
func (o CustomRoutingEndpointGroupOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v *CustomRoutingEndpointGroup) pulumi.StringOutput { return v.Arn }).(pulumi.StringOutput)
}

// The port ranges and protocols for all endpoints in a custom routing endpoint group to accept client traffic on. Fields documented below.
func (o CustomRoutingEndpointGroupOutput) DestinationConfigurations() CustomRoutingEndpointGroupDestinationConfigurationArrayOutput {
	return o.ApplyT(func(v *CustomRoutingEndpointGroup) CustomRoutingEndpointGroupDestinationConfigurationArrayOutput {
		return v.DestinationConfigurations
	}).(CustomRoutingEndpointGroupDestinationConfigurationArrayOutput)
}

// The list of endpoint objects. Fields documented below.
func (o CustomRoutingEndpointGroupOutput) EndpointConfigurations() CustomRoutingEndpointGroupEndpointConfigurationArrayOutput {
	return o.ApplyT(func(v *CustomRoutingEndpointGroup) CustomRoutingEndpointGroupEndpointConfigurationArrayOutput {
		return v.EndpointConfigurations
	}).(CustomRoutingEndpointGroupEndpointConfigurationArrayOutput)
}

// The name of the AWS Region where the custom routing endpoint group is located.
func (o CustomRoutingEndpointGroupOutput) EndpointGroupRegion() pulumi.StringOutput {
	return o.ApplyT(func(v *CustomRoutingEndpointGroup) pulumi.StringOutput { return v.EndpointGroupRegion }).(pulumi.StringOutput)
}

// The Amazon Resource Name (ARN) of the custom routing listener.
func (o CustomRoutingEndpointGroupOutput) ListenerArn() pulumi.StringOutput {
	return o.ApplyT(func(v *CustomRoutingEndpointGroup) pulumi.StringOutput { return v.ListenerArn }).(pulumi.StringOutput)
}

type CustomRoutingEndpointGroupArrayOutput struct{ *pulumi.OutputState }

func (CustomRoutingEndpointGroupArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*CustomRoutingEndpointGroup)(nil)).Elem()
}

func (o CustomRoutingEndpointGroupArrayOutput) ToCustomRoutingEndpointGroupArrayOutput() CustomRoutingEndpointGroupArrayOutput {
	return o
}

func (o CustomRoutingEndpointGroupArrayOutput) ToCustomRoutingEndpointGroupArrayOutputWithContext(ctx context.Context) CustomRoutingEndpointGroupArrayOutput {
	return o
}

func (o CustomRoutingEndpointGroupArrayOutput) Index(i pulumi.IntInput) CustomRoutingEndpointGroupOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *CustomRoutingEndpointGroup {
		return vs[0].([]*CustomRoutingEndpointGroup)[vs[1].(int)]
	}).(CustomRoutingEndpointGroupOutput)
}

type CustomRoutingEndpointGroupMapOutput struct{ *pulumi.OutputState }

func (CustomRoutingEndpointGroupMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*CustomRoutingEndpointGroup)(nil)).Elem()
}

func (o CustomRoutingEndpointGroupMapOutput) ToCustomRoutingEndpointGroupMapOutput() CustomRoutingEndpointGroupMapOutput {
	return o
}

func (o CustomRoutingEndpointGroupMapOutput) ToCustomRoutingEndpointGroupMapOutputWithContext(ctx context.Context) CustomRoutingEndpointGroupMapOutput {
	return o
}

func (o CustomRoutingEndpointGroupMapOutput) MapIndex(k pulumi.StringInput) CustomRoutingEndpointGroupOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *CustomRoutingEndpointGroup {
		return vs[0].(map[string]*CustomRoutingEndpointGroup)[vs[1].(string)]
	}).(CustomRoutingEndpointGroupOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*CustomRoutingEndpointGroupInput)(nil)).Elem(), &CustomRoutingEndpointGroup{})
	pulumi.RegisterInputType(reflect.TypeOf((*CustomRoutingEndpointGroupArrayInput)(nil)).Elem(), CustomRoutingEndpointGroupArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*CustomRoutingEndpointGroupMapInput)(nil)).Elem(), CustomRoutingEndpointGroupMap{})
	pulumi.RegisterOutputType(CustomRoutingEndpointGroupOutput{})
	pulumi.RegisterOutputType(CustomRoutingEndpointGroupArrayOutput{})
	pulumi.RegisterOutputType(CustomRoutingEndpointGroupMapOutput{})
}

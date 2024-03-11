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

// Provides a Global Accelerator custom routing listener.
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
//			example, err := globalaccelerator.NewCustomRoutingAccelerator(ctx, "example", &globalaccelerator.CustomRoutingAcceleratorArgs{
//				Name:          pulumi.String("Example"),
//				IpAddressType: pulumi.String("IPV4"),
//				Enabled:       pulumi.Bool(true),
//				Attributes: &globalaccelerator.CustomRoutingAcceleratorAttributesArgs{
//					FlowLogsEnabled:  pulumi.Bool(true),
//					FlowLogsS3Bucket: pulumi.String("example-bucket"),
//					FlowLogsS3Prefix: pulumi.String("flow-logs/"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = globalaccelerator.NewCustomRoutingListener(ctx, "example", &globalaccelerator.CustomRoutingListenerArgs{
//				AcceleratorArn: example.ID(),
//				PortRanges: globalaccelerator.CustomRoutingListenerPortRangeArray{
//					&globalaccelerator.CustomRoutingListenerPortRangeArgs{
//						FromPort: pulumi.Int(80),
//						ToPort:   pulumi.Int(80),
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
// Using `pulumi import`, import Global Accelerator custom routing listeners using the `id`. For example:
//
// ```sh
// $ pulumi import aws:globalaccelerator/customRoutingListener:CustomRoutingListener example arn:aws:globalaccelerator::111111111111:accelerator/xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx/listener/xxxxxxxx
// ```
type CustomRoutingListener struct {
	pulumi.CustomResourceState

	// The Amazon Resource Name (ARN) of a custom routing accelerator.
	AcceleratorArn pulumi.StringOutput `pulumi:"acceleratorArn"`
	// The list of port ranges for the connections from clients to the accelerator. Fields documented below.
	PortRanges CustomRoutingListenerPortRangeArrayOutput `pulumi:"portRanges"`
}

// NewCustomRoutingListener registers a new resource with the given unique name, arguments, and options.
func NewCustomRoutingListener(ctx *pulumi.Context,
	name string, args *CustomRoutingListenerArgs, opts ...pulumi.ResourceOption) (*CustomRoutingListener, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AcceleratorArn == nil {
		return nil, errors.New("invalid value for required argument 'AcceleratorArn'")
	}
	if args.PortRanges == nil {
		return nil, errors.New("invalid value for required argument 'PortRanges'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource CustomRoutingListener
	err := ctx.RegisterResource("aws:globalaccelerator/customRoutingListener:CustomRoutingListener", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetCustomRoutingListener gets an existing CustomRoutingListener resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetCustomRoutingListener(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *CustomRoutingListenerState, opts ...pulumi.ResourceOption) (*CustomRoutingListener, error) {
	var resource CustomRoutingListener
	err := ctx.ReadResource("aws:globalaccelerator/customRoutingListener:CustomRoutingListener", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering CustomRoutingListener resources.
type customRoutingListenerState struct {
	// The Amazon Resource Name (ARN) of a custom routing accelerator.
	AcceleratorArn *string `pulumi:"acceleratorArn"`
	// The list of port ranges for the connections from clients to the accelerator. Fields documented below.
	PortRanges []CustomRoutingListenerPortRange `pulumi:"portRanges"`
}

type CustomRoutingListenerState struct {
	// The Amazon Resource Name (ARN) of a custom routing accelerator.
	AcceleratorArn pulumi.StringPtrInput
	// The list of port ranges for the connections from clients to the accelerator. Fields documented below.
	PortRanges CustomRoutingListenerPortRangeArrayInput
}

func (CustomRoutingListenerState) ElementType() reflect.Type {
	return reflect.TypeOf((*customRoutingListenerState)(nil)).Elem()
}

type customRoutingListenerArgs struct {
	// The Amazon Resource Name (ARN) of a custom routing accelerator.
	AcceleratorArn string `pulumi:"acceleratorArn"`
	// The list of port ranges for the connections from clients to the accelerator. Fields documented below.
	PortRanges []CustomRoutingListenerPortRange `pulumi:"portRanges"`
}

// The set of arguments for constructing a CustomRoutingListener resource.
type CustomRoutingListenerArgs struct {
	// The Amazon Resource Name (ARN) of a custom routing accelerator.
	AcceleratorArn pulumi.StringInput
	// The list of port ranges for the connections from clients to the accelerator. Fields documented below.
	PortRanges CustomRoutingListenerPortRangeArrayInput
}

func (CustomRoutingListenerArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*customRoutingListenerArgs)(nil)).Elem()
}

type CustomRoutingListenerInput interface {
	pulumi.Input

	ToCustomRoutingListenerOutput() CustomRoutingListenerOutput
	ToCustomRoutingListenerOutputWithContext(ctx context.Context) CustomRoutingListenerOutput
}

func (*CustomRoutingListener) ElementType() reflect.Type {
	return reflect.TypeOf((**CustomRoutingListener)(nil)).Elem()
}

func (i *CustomRoutingListener) ToCustomRoutingListenerOutput() CustomRoutingListenerOutput {
	return i.ToCustomRoutingListenerOutputWithContext(context.Background())
}

func (i *CustomRoutingListener) ToCustomRoutingListenerOutputWithContext(ctx context.Context) CustomRoutingListenerOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CustomRoutingListenerOutput)
}

// CustomRoutingListenerArrayInput is an input type that accepts CustomRoutingListenerArray and CustomRoutingListenerArrayOutput values.
// You can construct a concrete instance of `CustomRoutingListenerArrayInput` via:
//
//	CustomRoutingListenerArray{ CustomRoutingListenerArgs{...} }
type CustomRoutingListenerArrayInput interface {
	pulumi.Input

	ToCustomRoutingListenerArrayOutput() CustomRoutingListenerArrayOutput
	ToCustomRoutingListenerArrayOutputWithContext(context.Context) CustomRoutingListenerArrayOutput
}

type CustomRoutingListenerArray []CustomRoutingListenerInput

func (CustomRoutingListenerArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*CustomRoutingListener)(nil)).Elem()
}

func (i CustomRoutingListenerArray) ToCustomRoutingListenerArrayOutput() CustomRoutingListenerArrayOutput {
	return i.ToCustomRoutingListenerArrayOutputWithContext(context.Background())
}

func (i CustomRoutingListenerArray) ToCustomRoutingListenerArrayOutputWithContext(ctx context.Context) CustomRoutingListenerArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CustomRoutingListenerArrayOutput)
}

// CustomRoutingListenerMapInput is an input type that accepts CustomRoutingListenerMap and CustomRoutingListenerMapOutput values.
// You can construct a concrete instance of `CustomRoutingListenerMapInput` via:
//
//	CustomRoutingListenerMap{ "key": CustomRoutingListenerArgs{...} }
type CustomRoutingListenerMapInput interface {
	pulumi.Input

	ToCustomRoutingListenerMapOutput() CustomRoutingListenerMapOutput
	ToCustomRoutingListenerMapOutputWithContext(context.Context) CustomRoutingListenerMapOutput
}

type CustomRoutingListenerMap map[string]CustomRoutingListenerInput

func (CustomRoutingListenerMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*CustomRoutingListener)(nil)).Elem()
}

func (i CustomRoutingListenerMap) ToCustomRoutingListenerMapOutput() CustomRoutingListenerMapOutput {
	return i.ToCustomRoutingListenerMapOutputWithContext(context.Background())
}

func (i CustomRoutingListenerMap) ToCustomRoutingListenerMapOutputWithContext(ctx context.Context) CustomRoutingListenerMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CustomRoutingListenerMapOutput)
}

type CustomRoutingListenerOutput struct{ *pulumi.OutputState }

func (CustomRoutingListenerOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**CustomRoutingListener)(nil)).Elem()
}

func (o CustomRoutingListenerOutput) ToCustomRoutingListenerOutput() CustomRoutingListenerOutput {
	return o
}

func (o CustomRoutingListenerOutput) ToCustomRoutingListenerOutputWithContext(ctx context.Context) CustomRoutingListenerOutput {
	return o
}

// The Amazon Resource Name (ARN) of a custom routing accelerator.
func (o CustomRoutingListenerOutput) AcceleratorArn() pulumi.StringOutput {
	return o.ApplyT(func(v *CustomRoutingListener) pulumi.StringOutput { return v.AcceleratorArn }).(pulumi.StringOutput)
}

// The list of port ranges for the connections from clients to the accelerator. Fields documented below.
func (o CustomRoutingListenerOutput) PortRanges() CustomRoutingListenerPortRangeArrayOutput {
	return o.ApplyT(func(v *CustomRoutingListener) CustomRoutingListenerPortRangeArrayOutput { return v.PortRanges }).(CustomRoutingListenerPortRangeArrayOutput)
}

type CustomRoutingListenerArrayOutput struct{ *pulumi.OutputState }

func (CustomRoutingListenerArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*CustomRoutingListener)(nil)).Elem()
}

func (o CustomRoutingListenerArrayOutput) ToCustomRoutingListenerArrayOutput() CustomRoutingListenerArrayOutput {
	return o
}

func (o CustomRoutingListenerArrayOutput) ToCustomRoutingListenerArrayOutputWithContext(ctx context.Context) CustomRoutingListenerArrayOutput {
	return o
}

func (o CustomRoutingListenerArrayOutput) Index(i pulumi.IntInput) CustomRoutingListenerOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *CustomRoutingListener {
		return vs[0].([]*CustomRoutingListener)[vs[1].(int)]
	}).(CustomRoutingListenerOutput)
}

type CustomRoutingListenerMapOutput struct{ *pulumi.OutputState }

func (CustomRoutingListenerMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*CustomRoutingListener)(nil)).Elem()
}

func (o CustomRoutingListenerMapOutput) ToCustomRoutingListenerMapOutput() CustomRoutingListenerMapOutput {
	return o
}

func (o CustomRoutingListenerMapOutput) ToCustomRoutingListenerMapOutputWithContext(ctx context.Context) CustomRoutingListenerMapOutput {
	return o
}

func (o CustomRoutingListenerMapOutput) MapIndex(k pulumi.StringInput) CustomRoutingListenerOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *CustomRoutingListener {
		return vs[0].(map[string]*CustomRoutingListener)[vs[1].(string)]
	}).(CustomRoutingListenerOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*CustomRoutingListenerInput)(nil)).Elem(), &CustomRoutingListener{})
	pulumi.RegisterInputType(reflect.TypeOf((*CustomRoutingListenerArrayInput)(nil)).Elem(), CustomRoutingListenerArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*CustomRoutingListenerMapInput)(nil)).Elem(), CustomRoutingListenerMap{})
	pulumi.RegisterOutputType(CustomRoutingListenerOutput{})
	pulumi.RegisterOutputType(CustomRoutingListenerArrayOutput{})
	pulumi.RegisterOutputType(CustomRoutingListenerMapOutput{})
}

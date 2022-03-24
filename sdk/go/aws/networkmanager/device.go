// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package networkmanager

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Creates a device in a global network. If you specify both a site ID and a location,
// the location of the site is used for visualization in the Network Manager console.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-aws/sdk/v5/go/aws/networkmanager"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := networkmanager.NewDevice(ctx, "example", &networkmanager.DeviceArgs{
// 			GlobalNetworkId: pulumi.Any(aws_networkmanager_global_network.Example.Id),
// 			SiteId:          pulumi.Any(aws_networkmanager_site.Example.Id),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
//
// ## Import
//
// `aws_networkmanager_device` can be imported using the device ARN, e.g.
//
// ```sh
//  $ pulumi import aws:networkmanager/device:Device example arn:aws:networkmanager::123456789012:device/global-network-0d47f6t230mz46dy4/device-07f6fd08867abc123
// ```
type Device struct {
	pulumi.CustomResourceState

	// The Amazon Resource Name (ARN) of the device.
	Arn pulumi.StringOutput `pulumi:"arn"`
	// The AWS location of the device. Documented below.
	AwsLocation DeviceAwsLocationPtrOutput `pulumi:"awsLocation"`
	// A description of the device.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// The ID of the global network.
	GlobalNetworkId pulumi.StringOutput `pulumi:"globalNetworkId"`
	// The location of the device. Documented below.
	Location DeviceLocationPtrOutput `pulumi:"location"`
	// The model of device.
	Model pulumi.StringPtrOutput `pulumi:"model"`
	// The serial number of the device.
	SerialNumber pulumi.StringPtrOutput `pulumi:"serialNumber"`
	// The ID of the site.
	SiteId  pulumi.StringPtrOutput `pulumi:"siteId"`
	Tags    pulumi.StringMapOutput `pulumi:"tags"`
	TagsAll pulumi.StringMapOutput `pulumi:"tagsAll"`
	// The type of device.
	Type pulumi.StringPtrOutput `pulumi:"type"`
	// The vendor of the device.
	Vendor pulumi.StringPtrOutput `pulumi:"vendor"`
}

// NewDevice registers a new resource with the given unique name, arguments, and options.
func NewDevice(ctx *pulumi.Context,
	name string, args *DeviceArgs, opts ...pulumi.ResourceOption) (*Device, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.GlobalNetworkId == nil {
		return nil, errors.New("invalid value for required argument 'GlobalNetworkId'")
	}
	var resource Device
	err := ctx.RegisterResource("aws:networkmanager/device:Device", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetDevice gets an existing Device resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetDevice(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *DeviceState, opts ...pulumi.ResourceOption) (*Device, error) {
	var resource Device
	err := ctx.ReadResource("aws:networkmanager/device:Device", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Device resources.
type deviceState struct {
	// The Amazon Resource Name (ARN) of the device.
	Arn *string `pulumi:"arn"`
	// The AWS location of the device. Documented below.
	AwsLocation *DeviceAwsLocation `pulumi:"awsLocation"`
	// A description of the device.
	Description *string `pulumi:"description"`
	// The ID of the global network.
	GlobalNetworkId *string `pulumi:"globalNetworkId"`
	// The location of the device. Documented below.
	Location *DeviceLocation `pulumi:"location"`
	// The model of device.
	Model *string `pulumi:"model"`
	// The serial number of the device.
	SerialNumber *string `pulumi:"serialNumber"`
	// The ID of the site.
	SiteId  *string           `pulumi:"siteId"`
	Tags    map[string]string `pulumi:"tags"`
	TagsAll map[string]string `pulumi:"tagsAll"`
	// The type of device.
	Type *string `pulumi:"type"`
	// The vendor of the device.
	Vendor *string `pulumi:"vendor"`
}

type DeviceState struct {
	// The Amazon Resource Name (ARN) of the device.
	Arn pulumi.StringPtrInput
	// The AWS location of the device. Documented below.
	AwsLocation DeviceAwsLocationPtrInput
	// A description of the device.
	Description pulumi.StringPtrInput
	// The ID of the global network.
	GlobalNetworkId pulumi.StringPtrInput
	// The location of the device. Documented below.
	Location DeviceLocationPtrInput
	// The model of device.
	Model pulumi.StringPtrInput
	// The serial number of the device.
	SerialNumber pulumi.StringPtrInput
	// The ID of the site.
	SiteId  pulumi.StringPtrInput
	Tags    pulumi.StringMapInput
	TagsAll pulumi.StringMapInput
	// The type of device.
	Type pulumi.StringPtrInput
	// The vendor of the device.
	Vendor pulumi.StringPtrInput
}

func (DeviceState) ElementType() reflect.Type {
	return reflect.TypeOf((*deviceState)(nil)).Elem()
}

type deviceArgs struct {
	// The AWS location of the device. Documented below.
	AwsLocation *DeviceAwsLocation `pulumi:"awsLocation"`
	// A description of the device.
	Description *string `pulumi:"description"`
	// The ID of the global network.
	GlobalNetworkId string `pulumi:"globalNetworkId"`
	// The location of the device. Documented below.
	Location *DeviceLocation `pulumi:"location"`
	// The model of device.
	Model *string `pulumi:"model"`
	// The serial number of the device.
	SerialNumber *string `pulumi:"serialNumber"`
	// The ID of the site.
	SiteId  *string           `pulumi:"siteId"`
	Tags    map[string]string `pulumi:"tags"`
	TagsAll map[string]string `pulumi:"tagsAll"`
	// The type of device.
	Type *string `pulumi:"type"`
	// The vendor of the device.
	Vendor *string `pulumi:"vendor"`
}

// The set of arguments for constructing a Device resource.
type DeviceArgs struct {
	// The AWS location of the device. Documented below.
	AwsLocation DeviceAwsLocationPtrInput
	// A description of the device.
	Description pulumi.StringPtrInput
	// The ID of the global network.
	GlobalNetworkId pulumi.StringInput
	// The location of the device. Documented below.
	Location DeviceLocationPtrInput
	// The model of device.
	Model pulumi.StringPtrInput
	// The serial number of the device.
	SerialNumber pulumi.StringPtrInput
	// The ID of the site.
	SiteId  pulumi.StringPtrInput
	Tags    pulumi.StringMapInput
	TagsAll pulumi.StringMapInput
	// The type of device.
	Type pulumi.StringPtrInput
	// The vendor of the device.
	Vendor pulumi.StringPtrInput
}

func (DeviceArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*deviceArgs)(nil)).Elem()
}

type DeviceInput interface {
	pulumi.Input

	ToDeviceOutput() DeviceOutput
	ToDeviceOutputWithContext(ctx context.Context) DeviceOutput
}

func (*Device) ElementType() reflect.Type {
	return reflect.TypeOf((**Device)(nil)).Elem()
}

func (i *Device) ToDeviceOutput() DeviceOutput {
	return i.ToDeviceOutputWithContext(context.Background())
}

func (i *Device) ToDeviceOutputWithContext(ctx context.Context) DeviceOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DeviceOutput)
}

// DeviceArrayInput is an input type that accepts DeviceArray and DeviceArrayOutput values.
// You can construct a concrete instance of `DeviceArrayInput` via:
//
//          DeviceArray{ DeviceArgs{...} }
type DeviceArrayInput interface {
	pulumi.Input

	ToDeviceArrayOutput() DeviceArrayOutput
	ToDeviceArrayOutputWithContext(context.Context) DeviceArrayOutput
}

type DeviceArray []DeviceInput

func (DeviceArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Device)(nil)).Elem()
}

func (i DeviceArray) ToDeviceArrayOutput() DeviceArrayOutput {
	return i.ToDeviceArrayOutputWithContext(context.Background())
}

func (i DeviceArray) ToDeviceArrayOutputWithContext(ctx context.Context) DeviceArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DeviceArrayOutput)
}

// DeviceMapInput is an input type that accepts DeviceMap and DeviceMapOutput values.
// You can construct a concrete instance of `DeviceMapInput` via:
//
//          DeviceMap{ "key": DeviceArgs{...} }
type DeviceMapInput interface {
	pulumi.Input

	ToDeviceMapOutput() DeviceMapOutput
	ToDeviceMapOutputWithContext(context.Context) DeviceMapOutput
}

type DeviceMap map[string]DeviceInput

func (DeviceMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Device)(nil)).Elem()
}

func (i DeviceMap) ToDeviceMapOutput() DeviceMapOutput {
	return i.ToDeviceMapOutputWithContext(context.Background())
}

func (i DeviceMap) ToDeviceMapOutputWithContext(ctx context.Context) DeviceMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DeviceMapOutput)
}

type DeviceOutput struct{ *pulumi.OutputState }

func (DeviceOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Device)(nil)).Elem()
}

func (o DeviceOutput) ToDeviceOutput() DeviceOutput {
	return o
}

func (o DeviceOutput) ToDeviceOutputWithContext(ctx context.Context) DeviceOutput {
	return o
}

type DeviceArrayOutput struct{ *pulumi.OutputState }

func (DeviceArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Device)(nil)).Elem()
}

func (o DeviceArrayOutput) ToDeviceArrayOutput() DeviceArrayOutput {
	return o
}

func (o DeviceArrayOutput) ToDeviceArrayOutputWithContext(ctx context.Context) DeviceArrayOutput {
	return o
}

func (o DeviceArrayOutput) Index(i pulumi.IntInput) DeviceOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Device {
		return vs[0].([]*Device)[vs[1].(int)]
	}).(DeviceOutput)
}

type DeviceMapOutput struct{ *pulumi.OutputState }

func (DeviceMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Device)(nil)).Elem()
}

func (o DeviceMapOutput) ToDeviceMapOutput() DeviceMapOutput {
	return o
}

func (o DeviceMapOutput) ToDeviceMapOutputWithContext(ctx context.Context) DeviceMapOutput {
	return o
}

func (o DeviceMapOutput) MapIndex(k pulumi.StringInput) DeviceOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Device {
		return vs[0].(map[string]*Device)[vs[1].(string)]
	}).(DeviceOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*DeviceInput)(nil)).Elem(), &Device{})
	pulumi.RegisterInputType(reflect.TypeOf((*DeviceArrayInput)(nil)).Elem(), DeviceArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*DeviceMapInput)(nil)).Elem(), DeviceMap{})
	pulumi.RegisterOutputType(DeviceOutput{})
	pulumi.RegisterOutputType(DeviceArrayOutput{})
	pulumi.RegisterOutputType(DeviceMapOutput{})
}

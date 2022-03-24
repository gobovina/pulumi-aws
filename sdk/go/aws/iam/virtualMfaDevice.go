// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package iam

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Example Usage
//
// **Using certs on file:**
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-aws/sdk/v5/go/aws/iam"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := iam.NewVirtualMfaDevice(ctx, "example", &iam.VirtualMfaDeviceArgs{
// 			VirtualMfaDeviceName: pulumi.String("example"),
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
// IAM Virtual MFA Devices can be imported using the `arn`, e.g.,
//
// ```sh
//  $ pulumi import aws:iam/virtualMfaDevice:VirtualMfaDevice example arn:aws:iam::123456789012:mfa/example
// ```
type VirtualMfaDevice struct {
	pulumi.CustomResourceState

	// The Amazon Resource Name (ARN) specifying the virtual mfa device.
	Arn pulumi.StringOutput `pulumi:"arn"`
	// The base32 seed defined as specified in [RFC3548](https://tools.ietf.org/html/rfc3548.txt). The `base32StringSeed` is base64-encoded.
	Base32StringSeed pulumi.StringOutput `pulumi:"base32StringSeed"`
	// The path for the virtual MFA device.
	Path pulumi.StringPtrOutput `pulumi:"path"`
	// A QR code PNG image that encodes `otpauth://totp/$virtualMFADeviceName@$AccountName?secret=$Base32String` where `$virtualMFADeviceName` is one of the create call arguments. AccountName is the user name if set (otherwise, the account ID otherwise), and Base32String is the seed in base32 format.
	QrCodePng pulumi.StringOutput `pulumi:"qrCodePng"`
	// Map of resource tags for the virtual mfa device. If configured with a provider [`defaultTags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider [`defaultTags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
	TagsAll pulumi.StringMapOutput `pulumi:"tagsAll"`
	// The name of the virtual MFA device. Use with path to uniquely identify a virtual MFA device.
	VirtualMfaDeviceName pulumi.StringOutput `pulumi:"virtualMfaDeviceName"`
}

// NewVirtualMfaDevice registers a new resource with the given unique name, arguments, and options.
func NewVirtualMfaDevice(ctx *pulumi.Context,
	name string, args *VirtualMfaDeviceArgs, opts ...pulumi.ResourceOption) (*VirtualMfaDevice, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.VirtualMfaDeviceName == nil {
		return nil, errors.New("invalid value for required argument 'VirtualMfaDeviceName'")
	}
	var resource VirtualMfaDevice
	err := ctx.RegisterResource("aws:iam/virtualMfaDevice:VirtualMfaDevice", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetVirtualMfaDevice gets an existing VirtualMfaDevice resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetVirtualMfaDevice(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *VirtualMfaDeviceState, opts ...pulumi.ResourceOption) (*VirtualMfaDevice, error) {
	var resource VirtualMfaDevice
	err := ctx.ReadResource("aws:iam/virtualMfaDevice:VirtualMfaDevice", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering VirtualMfaDevice resources.
type virtualMfaDeviceState struct {
	// The Amazon Resource Name (ARN) specifying the virtual mfa device.
	Arn *string `pulumi:"arn"`
	// The base32 seed defined as specified in [RFC3548](https://tools.ietf.org/html/rfc3548.txt). The `base32StringSeed` is base64-encoded.
	Base32StringSeed *string `pulumi:"base32StringSeed"`
	// The path for the virtual MFA device.
	Path *string `pulumi:"path"`
	// A QR code PNG image that encodes `otpauth://totp/$virtualMFADeviceName@$AccountName?secret=$Base32String` where `$virtualMFADeviceName` is one of the create call arguments. AccountName is the user name if set (otherwise, the account ID otherwise), and Base32String is the seed in base32 format.
	QrCodePng *string `pulumi:"qrCodePng"`
	// Map of resource tags for the virtual mfa device. If configured with a provider [`defaultTags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider [`defaultTags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
	TagsAll map[string]string `pulumi:"tagsAll"`
	// The name of the virtual MFA device. Use with path to uniquely identify a virtual MFA device.
	VirtualMfaDeviceName *string `pulumi:"virtualMfaDeviceName"`
}

type VirtualMfaDeviceState struct {
	// The Amazon Resource Name (ARN) specifying the virtual mfa device.
	Arn pulumi.StringPtrInput
	// The base32 seed defined as specified in [RFC3548](https://tools.ietf.org/html/rfc3548.txt). The `base32StringSeed` is base64-encoded.
	Base32StringSeed pulumi.StringPtrInput
	// The path for the virtual MFA device.
	Path pulumi.StringPtrInput
	// A QR code PNG image that encodes `otpauth://totp/$virtualMFADeviceName@$AccountName?secret=$Base32String` where `$virtualMFADeviceName` is one of the create call arguments. AccountName is the user name if set (otherwise, the account ID otherwise), and Base32String is the seed in base32 format.
	QrCodePng pulumi.StringPtrInput
	// Map of resource tags for the virtual mfa device. If configured with a provider [`defaultTags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// A map of tags assigned to the resource, including those inherited from the provider [`defaultTags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
	TagsAll pulumi.StringMapInput
	// The name of the virtual MFA device. Use with path to uniquely identify a virtual MFA device.
	VirtualMfaDeviceName pulumi.StringPtrInput
}

func (VirtualMfaDeviceState) ElementType() reflect.Type {
	return reflect.TypeOf((*virtualMfaDeviceState)(nil)).Elem()
}

type virtualMfaDeviceArgs struct {
	// The path for the virtual MFA device.
	Path *string `pulumi:"path"`
	// Map of resource tags for the virtual mfa device. If configured with a provider [`defaultTags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// The name of the virtual MFA device. Use with path to uniquely identify a virtual MFA device.
	VirtualMfaDeviceName string `pulumi:"virtualMfaDeviceName"`
}

// The set of arguments for constructing a VirtualMfaDevice resource.
type VirtualMfaDeviceArgs struct {
	// The path for the virtual MFA device.
	Path pulumi.StringPtrInput
	// Map of resource tags for the virtual mfa device. If configured with a provider [`defaultTags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// The name of the virtual MFA device. Use with path to uniquely identify a virtual MFA device.
	VirtualMfaDeviceName pulumi.StringInput
}

func (VirtualMfaDeviceArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*virtualMfaDeviceArgs)(nil)).Elem()
}

type VirtualMfaDeviceInput interface {
	pulumi.Input

	ToVirtualMfaDeviceOutput() VirtualMfaDeviceOutput
	ToVirtualMfaDeviceOutputWithContext(ctx context.Context) VirtualMfaDeviceOutput
}

func (*VirtualMfaDevice) ElementType() reflect.Type {
	return reflect.TypeOf((**VirtualMfaDevice)(nil)).Elem()
}

func (i *VirtualMfaDevice) ToVirtualMfaDeviceOutput() VirtualMfaDeviceOutput {
	return i.ToVirtualMfaDeviceOutputWithContext(context.Background())
}

func (i *VirtualMfaDevice) ToVirtualMfaDeviceOutputWithContext(ctx context.Context) VirtualMfaDeviceOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VirtualMfaDeviceOutput)
}

// VirtualMfaDeviceArrayInput is an input type that accepts VirtualMfaDeviceArray and VirtualMfaDeviceArrayOutput values.
// You can construct a concrete instance of `VirtualMfaDeviceArrayInput` via:
//
//          VirtualMfaDeviceArray{ VirtualMfaDeviceArgs{...} }
type VirtualMfaDeviceArrayInput interface {
	pulumi.Input

	ToVirtualMfaDeviceArrayOutput() VirtualMfaDeviceArrayOutput
	ToVirtualMfaDeviceArrayOutputWithContext(context.Context) VirtualMfaDeviceArrayOutput
}

type VirtualMfaDeviceArray []VirtualMfaDeviceInput

func (VirtualMfaDeviceArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*VirtualMfaDevice)(nil)).Elem()
}

func (i VirtualMfaDeviceArray) ToVirtualMfaDeviceArrayOutput() VirtualMfaDeviceArrayOutput {
	return i.ToVirtualMfaDeviceArrayOutputWithContext(context.Background())
}

func (i VirtualMfaDeviceArray) ToVirtualMfaDeviceArrayOutputWithContext(ctx context.Context) VirtualMfaDeviceArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VirtualMfaDeviceArrayOutput)
}

// VirtualMfaDeviceMapInput is an input type that accepts VirtualMfaDeviceMap and VirtualMfaDeviceMapOutput values.
// You can construct a concrete instance of `VirtualMfaDeviceMapInput` via:
//
//          VirtualMfaDeviceMap{ "key": VirtualMfaDeviceArgs{...} }
type VirtualMfaDeviceMapInput interface {
	pulumi.Input

	ToVirtualMfaDeviceMapOutput() VirtualMfaDeviceMapOutput
	ToVirtualMfaDeviceMapOutputWithContext(context.Context) VirtualMfaDeviceMapOutput
}

type VirtualMfaDeviceMap map[string]VirtualMfaDeviceInput

func (VirtualMfaDeviceMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*VirtualMfaDevice)(nil)).Elem()
}

func (i VirtualMfaDeviceMap) ToVirtualMfaDeviceMapOutput() VirtualMfaDeviceMapOutput {
	return i.ToVirtualMfaDeviceMapOutputWithContext(context.Background())
}

func (i VirtualMfaDeviceMap) ToVirtualMfaDeviceMapOutputWithContext(ctx context.Context) VirtualMfaDeviceMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VirtualMfaDeviceMapOutput)
}

type VirtualMfaDeviceOutput struct{ *pulumi.OutputState }

func (VirtualMfaDeviceOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**VirtualMfaDevice)(nil)).Elem()
}

func (o VirtualMfaDeviceOutput) ToVirtualMfaDeviceOutput() VirtualMfaDeviceOutput {
	return o
}

func (o VirtualMfaDeviceOutput) ToVirtualMfaDeviceOutputWithContext(ctx context.Context) VirtualMfaDeviceOutput {
	return o
}

type VirtualMfaDeviceArrayOutput struct{ *pulumi.OutputState }

func (VirtualMfaDeviceArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*VirtualMfaDevice)(nil)).Elem()
}

func (o VirtualMfaDeviceArrayOutput) ToVirtualMfaDeviceArrayOutput() VirtualMfaDeviceArrayOutput {
	return o
}

func (o VirtualMfaDeviceArrayOutput) ToVirtualMfaDeviceArrayOutputWithContext(ctx context.Context) VirtualMfaDeviceArrayOutput {
	return o
}

func (o VirtualMfaDeviceArrayOutput) Index(i pulumi.IntInput) VirtualMfaDeviceOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *VirtualMfaDevice {
		return vs[0].([]*VirtualMfaDevice)[vs[1].(int)]
	}).(VirtualMfaDeviceOutput)
}

type VirtualMfaDeviceMapOutput struct{ *pulumi.OutputState }

func (VirtualMfaDeviceMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*VirtualMfaDevice)(nil)).Elem()
}

func (o VirtualMfaDeviceMapOutput) ToVirtualMfaDeviceMapOutput() VirtualMfaDeviceMapOutput {
	return o
}

func (o VirtualMfaDeviceMapOutput) ToVirtualMfaDeviceMapOutputWithContext(ctx context.Context) VirtualMfaDeviceMapOutput {
	return o
}

func (o VirtualMfaDeviceMapOutput) MapIndex(k pulumi.StringInput) VirtualMfaDeviceOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *VirtualMfaDevice {
		return vs[0].(map[string]*VirtualMfaDevice)[vs[1].(string)]
	}).(VirtualMfaDeviceOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*VirtualMfaDeviceInput)(nil)).Elem(), &VirtualMfaDevice{})
	pulumi.RegisterInputType(reflect.TypeOf((*VirtualMfaDeviceArrayInput)(nil)).Elem(), VirtualMfaDeviceArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*VirtualMfaDeviceMapInput)(nil)).Elem(), VirtualMfaDeviceMap{})
	pulumi.RegisterOutputType(VirtualMfaDeviceOutput{})
	pulumi.RegisterOutputType(VirtualMfaDeviceArrayOutput{})
	pulumi.RegisterOutputType(VirtualMfaDeviceMapOutput{})
}

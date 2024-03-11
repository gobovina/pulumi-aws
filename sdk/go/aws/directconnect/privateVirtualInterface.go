// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package directconnect

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Direct Connect private virtual interface resource.
//
// ## Example Usage
//
// <!--Start PulumiCodeChooser -->
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/directconnect"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := directconnect.NewPrivateVirtualInterface(ctx, "foo", &directconnect.PrivateVirtualInterfaceArgs{
//				ConnectionId:  pulumi.String("dxcon-zzzzzzzz"),
//				Name:          pulumi.String("vif-foo"),
//				Vlan:          pulumi.Int(4094),
//				AddressFamily: pulumi.String("ipv4"),
//				BgpAsn:        pulumi.Int(65352),
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
// Using `pulumi import`, import Direct Connect private virtual interfaces using the VIF `id`. For example:
//
// ```sh
// $ pulumi import aws:directconnect/privateVirtualInterface:PrivateVirtualInterface test dxvif-33cc44dd
// ```
type PrivateVirtualInterface struct {
	pulumi.CustomResourceState

	// The address family for the BGP peer. ` ipv4  ` or `ipv6`.
	AddressFamily pulumi.StringOutput `pulumi:"addressFamily"`
	// The IPv4 CIDR address to use to send traffic to Amazon. Required for IPv4 BGP peers.
	AmazonAddress pulumi.StringOutput `pulumi:"amazonAddress"`
	AmazonSideAsn pulumi.StringOutput `pulumi:"amazonSideAsn"`
	// The ARN of the virtual interface.
	Arn pulumi.StringOutput `pulumi:"arn"`
	// The Direct Connect endpoint on which the virtual interface terminates.
	AwsDevice pulumi.StringOutput `pulumi:"awsDevice"`
	// The autonomous system (AS) number for Border Gateway Protocol (BGP) configuration.
	BgpAsn pulumi.IntOutput `pulumi:"bgpAsn"`
	// The authentication key for BGP configuration.
	BgpAuthKey pulumi.StringOutput `pulumi:"bgpAuthKey"`
	// The ID of the Direct Connect connection (or LAG) on which to create the virtual interface.
	ConnectionId pulumi.StringOutput `pulumi:"connectionId"`
	// The IPv4 CIDR destination address to which Amazon should send traffic. Required for IPv4 BGP peers.
	CustomerAddress pulumi.StringOutput `pulumi:"customerAddress"`
	// The ID of the Direct Connect gateway to which to connect the virtual interface.
	DxGatewayId pulumi.StringPtrOutput `pulumi:"dxGatewayId"`
	// Indicates whether jumbo frames (9001 MTU) are supported.
	JumboFrameCapable pulumi.BoolOutput `pulumi:"jumboFrameCapable"`
	// The maximum transmission unit (MTU) is the size, in bytes, of the largest permissible packet that can be passed over the connection.
	// The MTU of a virtual private interface can be either `1500` or `9001` (jumbo frames). Default is `1500`.
	Mtu pulumi.IntPtrOutput `pulumi:"mtu"`
	// The name for the virtual interface.
	Name pulumi.StringOutput `pulumi:"name"`
	// Indicates whether to enable or disable SiteLink.
	SitelinkEnabled pulumi.BoolPtrOutput `pulumi:"sitelinkEnabled"`
	// A map of tags to assign to the resource. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapOutput `pulumi:"tagsAll"`
	// The VLAN ID.
	Vlan pulumi.IntOutput `pulumi:"vlan"`
	// The ID of the virtual private gateway to which to connect the virtual interface.
	VpnGatewayId pulumi.StringPtrOutput `pulumi:"vpnGatewayId"`
}

// NewPrivateVirtualInterface registers a new resource with the given unique name, arguments, and options.
func NewPrivateVirtualInterface(ctx *pulumi.Context,
	name string, args *PrivateVirtualInterfaceArgs, opts ...pulumi.ResourceOption) (*PrivateVirtualInterface, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AddressFamily == nil {
		return nil, errors.New("invalid value for required argument 'AddressFamily'")
	}
	if args.BgpAsn == nil {
		return nil, errors.New("invalid value for required argument 'BgpAsn'")
	}
	if args.ConnectionId == nil {
		return nil, errors.New("invalid value for required argument 'ConnectionId'")
	}
	if args.Vlan == nil {
		return nil, errors.New("invalid value for required argument 'Vlan'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource PrivateVirtualInterface
	err := ctx.RegisterResource("aws:directconnect/privateVirtualInterface:PrivateVirtualInterface", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetPrivateVirtualInterface gets an existing PrivateVirtualInterface resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetPrivateVirtualInterface(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *PrivateVirtualInterfaceState, opts ...pulumi.ResourceOption) (*PrivateVirtualInterface, error) {
	var resource PrivateVirtualInterface
	err := ctx.ReadResource("aws:directconnect/privateVirtualInterface:PrivateVirtualInterface", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering PrivateVirtualInterface resources.
type privateVirtualInterfaceState struct {
	// The address family for the BGP peer. ` ipv4  ` or `ipv6`.
	AddressFamily *string `pulumi:"addressFamily"`
	// The IPv4 CIDR address to use to send traffic to Amazon. Required for IPv4 BGP peers.
	AmazonAddress *string `pulumi:"amazonAddress"`
	AmazonSideAsn *string `pulumi:"amazonSideAsn"`
	// The ARN of the virtual interface.
	Arn *string `pulumi:"arn"`
	// The Direct Connect endpoint on which the virtual interface terminates.
	AwsDevice *string `pulumi:"awsDevice"`
	// The autonomous system (AS) number for Border Gateway Protocol (BGP) configuration.
	BgpAsn *int `pulumi:"bgpAsn"`
	// The authentication key for BGP configuration.
	BgpAuthKey *string `pulumi:"bgpAuthKey"`
	// The ID of the Direct Connect connection (or LAG) on which to create the virtual interface.
	ConnectionId *string `pulumi:"connectionId"`
	// The IPv4 CIDR destination address to which Amazon should send traffic. Required for IPv4 BGP peers.
	CustomerAddress *string `pulumi:"customerAddress"`
	// The ID of the Direct Connect gateway to which to connect the virtual interface.
	DxGatewayId *string `pulumi:"dxGatewayId"`
	// Indicates whether jumbo frames (9001 MTU) are supported.
	JumboFrameCapable *bool `pulumi:"jumboFrameCapable"`
	// The maximum transmission unit (MTU) is the size, in bytes, of the largest permissible packet that can be passed over the connection.
	// The MTU of a virtual private interface can be either `1500` or `9001` (jumbo frames). Default is `1500`.
	Mtu *int `pulumi:"mtu"`
	// The name for the virtual interface.
	Name *string `pulumi:"name"`
	// Indicates whether to enable or disable SiteLink.
	SitelinkEnabled *bool `pulumi:"sitelinkEnabled"`
	// A map of tags to assign to the resource. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll map[string]string `pulumi:"tagsAll"`
	// The VLAN ID.
	Vlan *int `pulumi:"vlan"`
	// The ID of the virtual private gateway to which to connect the virtual interface.
	VpnGatewayId *string `pulumi:"vpnGatewayId"`
}

type PrivateVirtualInterfaceState struct {
	// The address family for the BGP peer. ` ipv4  ` or `ipv6`.
	AddressFamily pulumi.StringPtrInput
	// The IPv4 CIDR address to use to send traffic to Amazon. Required for IPv4 BGP peers.
	AmazonAddress pulumi.StringPtrInput
	AmazonSideAsn pulumi.StringPtrInput
	// The ARN of the virtual interface.
	Arn pulumi.StringPtrInput
	// The Direct Connect endpoint on which the virtual interface terminates.
	AwsDevice pulumi.StringPtrInput
	// The autonomous system (AS) number for Border Gateway Protocol (BGP) configuration.
	BgpAsn pulumi.IntPtrInput
	// The authentication key for BGP configuration.
	BgpAuthKey pulumi.StringPtrInput
	// The ID of the Direct Connect connection (or LAG) on which to create the virtual interface.
	ConnectionId pulumi.StringPtrInput
	// The IPv4 CIDR destination address to which Amazon should send traffic. Required for IPv4 BGP peers.
	CustomerAddress pulumi.StringPtrInput
	// The ID of the Direct Connect gateway to which to connect the virtual interface.
	DxGatewayId pulumi.StringPtrInput
	// Indicates whether jumbo frames (9001 MTU) are supported.
	JumboFrameCapable pulumi.BoolPtrInput
	// The maximum transmission unit (MTU) is the size, in bytes, of the largest permissible packet that can be passed over the connection.
	// The MTU of a virtual private interface can be either `1500` or `9001` (jumbo frames). Default is `1500`.
	Mtu pulumi.IntPtrInput
	// The name for the virtual interface.
	Name pulumi.StringPtrInput
	// Indicates whether to enable or disable SiteLink.
	SitelinkEnabled pulumi.BoolPtrInput
	// A map of tags to assign to the resource. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapInput
	// The VLAN ID.
	Vlan pulumi.IntPtrInput
	// The ID of the virtual private gateway to which to connect the virtual interface.
	VpnGatewayId pulumi.StringPtrInput
}

func (PrivateVirtualInterfaceState) ElementType() reflect.Type {
	return reflect.TypeOf((*privateVirtualInterfaceState)(nil)).Elem()
}

type privateVirtualInterfaceArgs struct {
	// The address family for the BGP peer. ` ipv4  ` or `ipv6`.
	AddressFamily string `pulumi:"addressFamily"`
	// The IPv4 CIDR address to use to send traffic to Amazon. Required for IPv4 BGP peers.
	AmazonAddress *string `pulumi:"amazonAddress"`
	// The autonomous system (AS) number for Border Gateway Protocol (BGP) configuration.
	BgpAsn int `pulumi:"bgpAsn"`
	// The authentication key for BGP configuration.
	BgpAuthKey *string `pulumi:"bgpAuthKey"`
	// The ID of the Direct Connect connection (or LAG) on which to create the virtual interface.
	ConnectionId string `pulumi:"connectionId"`
	// The IPv4 CIDR destination address to which Amazon should send traffic. Required for IPv4 BGP peers.
	CustomerAddress *string `pulumi:"customerAddress"`
	// The ID of the Direct Connect gateway to which to connect the virtual interface.
	DxGatewayId *string `pulumi:"dxGatewayId"`
	// The maximum transmission unit (MTU) is the size, in bytes, of the largest permissible packet that can be passed over the connection.
	// The MTU of a virtual private interface can be either `1500` or `9001` (jumbo frames). Default is `1500`.
	Mtu *int `pulumi:"mtu"`
	// The name for the virtual interface.
	Name *string `pulumi:"name"`
	// Indicates whether to enable or disable SiteLink.
	SitelinkEnabled *bool `pulumi:"sitelinkEnabled"`
	// A map of tags to assign to the resource. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// The VLAN ID.
	Vlan int `pulumi:"vlan"`
	// The ID of the virtual private gateway to which to connect the virtual interface.
	VpnGatewayId *string `pulumi:"vpnGatewayId"`
}

// The set of arguments for constructing a PrivateVirtualInterface resource.
type PrivateVirtualInterfaceArgs struct {
	// The address family for the BGP peer. ` ipv4  ` or `ipv6`.
	AddressFamily pulumi.StringInput
	// The IPv4 CIDR address to use to send traffic to Amazon. Required for IPv4 BGP peers.
	AmazonAddress pulumi.StringPtrInput
	// The autonomous system (AS) number for Border Gateway Protocol (BGP) configuration.
	BgpAsn pulumi.IntInput
	// The authentication key for BGP configuration.
	BgpAuthKey pulumi.StringPtrInput
	// The ID of the Direct Connect connection (or LAG) on which to create the virtual interface.
	ConnectionId pulumi.StringInput
	// The IPv4 CIDR destination address to which Amazon should send traffic. Required for IPv4 BGP peers.
	CustomerAddress pulumi.StringPtrInput
	// The ID of the Direct Connect gateway to which to connect the virtual interface.
	DxGatewayId pulumi.StringPtrInput
	// The maximum transmission unit (MTU) is the size, in bytes, of the largest permissible packet that can be passed over the connection.
	// The MTU of a virtual private interface can be either `1500` or `9001` (jumbo frames). Default is `1500`.
	Mtu pulumi.IntPtrInput
	// The name for the virtual interface.
	Name pulumi.StringPtrInput
	// Indicates whether to enable or disable SiteLink.
	SitelinkEnabled pulumi.BoolPtrInput
	// A map of tags to assign to the resource. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// The VLAN ID.
	Vlan pulumi.IntInput
	// The ID of the virtual private gateway to which to connect the virtual interface.
	VpnGatewayId pulumi.StringPtrInput
}

func (PrivateVirtualInterfaceArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*privateVirtualInterfaceArgs)(nil)).Elem()
}

type PrivateVirtualInterfaceInput interface {
	pulumi.Input

	ToPrivateVirtualInterfaceOutput() PrivateVirtualInterfaceOutput
	ToPrivateVirtualInterfaceOutputWithContext(ctx context.Context) PrivateVirtualInterfaceOutput
}

func (*PrivateVirtualInterface) ElementType() reflect.Type {
	return reflect.TypeOf((**PrivateVirtualInterface)(nil)).Elem()
}

func (i *PrivateVirtualInterface) ToPrivateVirtualInterfaceOutput() PrivateVirtualInterfaceOutput {
	return i.ToPrivateVirtualInterfaceOutputWithContext(context.Background())
}

func (i *PrivateVirtualInterface) ToPrivateVirtualInterfaceOutputWithContext(ctx context.Context) PrivateVirtualInterfaceOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PrivateVirtualInterfaceOutput)
}

// PrivateVirtualInterfaceArrayInput is an input type that accepts PrivateVirtualInterfaceArray and PrivateVirtualInterfaceArrayOutput values.
// You can construct a concrete instance of `PrivateVirtualInterfaceArrayInput` via:
//
//	PrivateVirtualInterfaceArray{ PrivateVirtualInterfaceArgs{...} }
type PrivateVirtualInterfaceArrayInput interface {
	pulumi.Input

	ToPrivateVirtualInterfaceArrayOutput() PrivateVirtualInterfaceArrayOutput
	ToPrivateVirtualInterfaceArrayOutputWithContext(context.Context) PrivateVirtualInterfaceArrayOutput
}

type PrivateVirtualInterfaceArray []PrivateVirtualInterfaceInput

func (PrivateVirtualInterfaceArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*PrivateVirtualInterface)(nil)).Elem()
}

func (i PrivateVirtualInterfaceArray) ToPrivateVirtualInterfaceArrayOutput() PrivateVirtualInterfaceArrayOutput {
	return i.ToPrivateVirtualInterfaceArrayOutputWithContext(context.Background())
}

func (i PrivateVirtualInterfaceArray) ToPrivateVirtualInterfaceArrayOutputWithContext(ctx context.Context) PrivateVirtualInterfaceArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PrivateVirtualInterfaceArrayOutput)
}

// PrivateVirtualInterfaceMapInput is an input type that accepts PrivateVirtualInterfaceMap and PrivateVirtualInterfaceMapOutput values.
// You can construct a concrete instance of `PrivateVirtualInterfaceMapInput` via:
//
//	PrivateVirtualInterfaceMap{ "key": PrivateVirtualInterfaceArgs{...} }
type PrivateVirtualInterfaceMapInput interface {
	pulumi.Input

	ToPrivateVirtualInterfaceMapOutput() PrivateVirtualInterfaceMapOutput
	ToPrivateVirtualInterfaceMapOutputWithContext(context.Context) PrivateVirtualInterfaceMapOutput
}

type PrivateVirtualInterfaceMap map[string]PrivateVirtualInterfaceInput

func (PrivateVirtualInterfaceMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*PrivateVirtualInterface)(nil)).Elem()
}

func (i PrivateVirtualInterfaceMap) ToPrivateVirtualInterfaceMapOutput() PrivateVirtualInterfaceMapOutput {
	return i.ToPrivateVirtualInterfaceMapOutputWithContext(context.Background())
}

func (i PrivateVirtualInterfaceMap) ToPrivateVirtualInterfaceMapOutputWithContext(ctx context.Context) PrivateVirtualInterfaceMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PrivateVirtualInterfaceMapOutput)
}

type PrivateVirtualInterfaceOutput struct{ *pulumi.OutputState }

func (PrivateVirtualInterfaceOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**PrivateVirtualInterface)(nil)).Elem()
}

func (o PrivateVirtualInterfaceOutput) ToPrivateVirtualInterfaceOutput() PrivateVirtualInterfaceOutput {
	return o
}

func (o PrivateVirtualInterfaceOutput) ToPrivateVirtualInterfaceOutputWithContext(ctx context.Context) PrivateVirtualInterfaceOutput {
	return o
}

// The address family for the BGP peer. ` ipv4  ` or `ipv6`.
func (o PrivateVirtualInterfaceOutput) AddressFamily() pulumi.StringOutput {
	return o.ApplyT(func(v *PrivateVirtualInterface) pulumi.StringOutput { return v.AddressFamily }).(pulumi.StringOutput)
}

// The IPv4 CIDR address to use to send traffic to Amazon. Required for IPv4 BGP peers.
func (o PrivateVirtualInterfaceOutput) AmazonAddress() pulumi.StringOutput {
	return o.ApplyT(func(v *PrivateVirtualInterface) pulumi.StringOutput { return v.AmazonAddress }).(pulumi.StringOutput)
}

func (o PrivateVirtualInterfaceOutput) AmazonSideAsn() pulumi.StringOutput {
	return o.ApplyT(func(v *PrivateVirtualInterface) pulumi.StringOutput { return v.AmazonSideAsn }).(pulumi.StringOutput)
}

// The ARN of the virtual interface.
func (o PrivateVirtualInterfaceOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v *PrivateVirtualInterface) pulumi.StringOutput { return v.Arn }).(pulumi.StringOutput)
}

// The Direct Connect endpoint on which the virtual interface terminates.
func (o PrivateVirtualInterfaceOutput) AwsDevice() pulumi.StringOutput {
	return o.ApplyT(func(v *PrivateVirtualInterface) pulumi.StringOutput { return v.AwsDevice }).(pulumi.StringOutput)
}

// The autonomous system (AS) number for Border Gateway Protocol (BGP) configuration.
func (o PrivateVirtualInterfaceOutput) BgpAsn() pulumi.IntOutput {
	return o.ApplyT(func(v *PrivateVirtualInterface) pulumi.IntOutput { return v.BgpAsn }).(pulumi.IntOutput)
}

// The authentication key for BGP configuration.
func (o PrivateVirtualInterfaceOutput) BgpAuthKey() pulumi.StringOutput {
	return o.ApplyT(func(v *PrivateVirtualInterface) pulumi.StringOutput { return v.BgpAuthKey }).(pulumi.StringOutput)
}

// The ID of the Direct Connect connection (or LAG) on which to create the virtual interface.
func (o PrivateVirtualInterfaceOutput) ConnectionId() pulumi.StringOutput {
	return o.ApplyT(func(v *PrivateVirtualInterface) pulumi.StringOutput { return v.ConnectionId }).(pulumi.StringOutput)
}

// The IPv4 CIDR destination address to which Amazon should send traffic. Required for IPv4 BGP peers.
func (o PrivateVirtualInterfaceOutput) CustomerAddress() pulumi.StringOutput {
	return o.ApplyT(func(v *PrivateVirtualInterface) pulumi.StringOutput { return v.CustomerAddress }).(pulumi.StringOutput)
}

// The ID of the Direct Connect gateway to which to connect the virtual interface.
func (o PrivateVirtualInterfaceOutput) DxGatewayId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *PrivateVirtualInterface) pulumi.StringPtrOutput { return v.DxGatewayId }).(pulumi.StringPtrOutput)
}

// Indicates whether jumbo frames (9001 MTU) are supported.
func (o PrivateVirtualInterfaceOutput) JumboFrameCapable() pulumi.BoolOutput {
	return o.ApplyT(func(v *PrivateVirtualInterface) pulumi.BoolOutput { return v.JumboFrameCapable }).(pulumi.BoolOutput)
}

// The maximum transmission unit (MTU) is the size, in bytes, of the largest permissible packet that can be passed over the connection.
// The MTU of a virtual private interface can be either `1500` or `9001` (jumbo frames). Default is `1500`.
func (o PrivateVirtualInterfaceOutput) Mtu() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *PrivateVirtualInterface) pulumi.IntPtrOutput { return v.Mtu }).(pulumi.IntPtrOutput)
}

// The name for the virtual interface.
func (o PrivateVirtualInterfaceOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *PrivateVirtualInterface) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Indicates whether to enable or disable SiteLink.
func (o PrivateVirtualInterfaceOutput) SitelinkEnabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *PrivateVirtualInterface) pulumi.BoolPtrOutput { return v.SitelinkEnabled }).(pulumi.BoolPtrOutput)
}

// A map of tags to assign to the resource. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
func (o PrivateVirtualInterfaceOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *PrivateVirtualInterface) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
//
// Deprecated: Please use `tags` instead.
func (o PrivateVirtualInterfaceOutput) TagsAll() pulumi.StringMapOutput {
	return o.ApplyT(func(v *PrivateVirtualInterface) pulumi.StringMapOutput { return v.TagsAll }).(pulumi.StringMapOutput)
}

// The VLAN ID.
func (o PrivateVirtualInterfaceOutput) Vlan() pulumi.IntOutput {
	return o.ApplyT(func(v *PrivateVirtualInterface) pulumi.IntOutput { return v.Vlan }).(pulumi.IntOutput)
}

// The ID of the virtual private gateway to which to connect the virtual interface.
func (o PrivateVirtualInterfaceOutput) VpnGatewayId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *PrivateVirtualInterface) pulumi.StringPtrOutput { return v.VpnGatewayId }).(pulumi.StringPtrOutput)
}

type PrivateVirtualInterfaceArrayOutput struct{ *pulumi.OutputState }

func (PrivateVirtualInterfaceArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*PrivateVirtualInterface)(nil)).Elem()
}

func (o PrivateVirtualInterfaceArrayOutput) ToPrivateVirtualInterfaceArrayOutput() PrivateVirtualInterfaceArrayOutput {
	return o
}

func (o PrivateVirtualInterfaceArrayOutput) ToPrivateVirtualInterfaceArrayOutputWithContext(ctx context.Context) PrivateVirtualInterfaceArrayOutput {
	return o
}

func (o PrivateVirtualInterfaceArrayOutput) Index(i pulumi.IntInput) PrivateVirtualInterfaceOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *PrivateVirtualInterface {
		return vs[0].([]*PrivateVirtualInterface)[vs[1].(int)]
	}).(PrivateVirtualInterfaceOutput)
}

type PrivateVirtualInterfaceMapOutput struct{ *pulumi.OutputState }

func (PrivateVirtualInterfaceMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*PrivateVirtualInterface)(nil)).Elem()
}

func (o PrivateVirtualInterfaceMapOutput) ToPrivateVirtualInterfaceMapOutput() PrivateVirtualInterfaceMapOutput {
	return o
}

func (o PrivateVirtualInterfaceMapOutput) ToPrivateVirtualInterfaceMapOutputWithContext(ctx context.Context) PrivateVirtualInterfaceMapOutput {
	return o
}

func (o PrivateVirtualInterfaceMapOutput) MapIndex(k pulumi.StringInput) PrivateVirtualInterfaceOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *PrivateVirtualInterface {
		return vs[0].(map[string]*PrivateVirtualInterface)[vs[1].(string)]
	}).(PrivateVirtualInterfaceOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*PrivateVirtualInterfaceInput)(nil)).Elem(), &PrivateVirtualInterface{})
	pulumi.RegisterInputType(reflect.TypeOf((*PrivateVirtualInterfaceArrayInput)(nil)).Elem(), PrivateVirtualInterfaceArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*PrivateVirtualInterfaceMapInput)(nil)).Elem(), PrivateVirtualInterfaceMap{})
	pulumi.RegisterOutputType(PrivateVirtualInterfaceOutput{})
	pulumi.RegisterOutputType(PrivateVirtualInterfaceArrayOutput{})
	pulumi.RegisterOutputType(PrivateVirtualInterfaceMapOutput{})
}

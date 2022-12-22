// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package directconnect

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a resource to manage the accepter's side of a Direct Connect hosted private virtual interface.
// This resource accepts ownership of a private virtual interface created by another AWS account.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v5/go/aws"
//	"github.com/pulumi/pulumi-aws/sdk/v5/go/aws/directconnect"
//	"github.com/pulumi/pulumi-aws/sdk/v5/go/aws/ec2"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := aws.NewProvider(ctx, "accepter", nil)
//			if err != nil {
//				return err
//			}
//			accepterCallerIdentity, err := aws.GetCallerIdentity(ctx, nil, nil)
//			if err != nil {
//				return err
//			}
//			vpnGw, err := ec2.NewVpnGateway(ctx, "vpnGw", nil, pulumi.Provider(aws.Accepter))
//			if err != nil {
//				return err
//			}
//			creator, err := directconnect.NewHostedPrivateVirtualInterface(ctx, "creator", &directconnect.HostedPrivateVirtualInterfaceArgs{
//				ConnectionId:   pulumi.String("dxcon-zzzzzzzz"),
//				OwnerAccountId: *pulumi.String(accepterCallerIdentity.AccountId),
//				Vlan:           pulumi.Int(4094),
//				AddressFamily:  pulumi.String("ipv4"),
//				BgpAsn:         pulumi.Int(65352),
//			}, pulumi.DependsOn([]pulumi.Resource{
//				vpnGw,
//			}))
//			if err != nil {
//				return err
//			}
//			_, err = directconnect.NewHostedPrivateVirtualInterfaceAccepter(ctx, "accepterHostedPrivateVirtualInterfaceAccepter", &directconnect.HostedPrivateVirtualInterfaceAccepterArgs{
//				VirtualInterfaceId: creator.ID(),
//				VpnGatewayId:       vpnGw.ID(),
//				Tags: pulumi.StringMap{
//					"Side": pulumi.String("Accepter"),
//				},
//			}, pulumi.Provider(aws.Accepter))
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
// Direct Connect hosted private virtual interfaces can be imported using the `vif id`, e.g.,
//
// ```sh
//
//	$ pulumi import aws:directconnect/hostedPrivateVirtualInterfaceAccepter:HostedPrivateVirtualInterfaceAccepter test dxvif-33cc44dd
//
// ```
type HostedPrivateVirtualInterfaceAccepter struct {
	pulumi.CustomResourceState

	// The ARN of the virtual interface.
	Arn pulumi.StringOutput `pulumi:"arn"`
	// The ID of the Direct Connect gateway to which to connect the virtual interface.
	DxGatewayId pulumi.StringPtrOutput `pulumi:"dxGatewayId"`
	// A map of tags to assign to the resource. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	TagsAll pulumi.StringMapOutput `pulumi:"tagsAll"`
	// The ID of the Direct Connect virtual interface to accept.
	VirtualInterfaceId pulumi.StringOutput `pulumi:"virtualInterfaceId"`
	// The ID of the virtual private gateway to which to connect the virtual interface.
	VpnGatewayId pulumi.StringPtrOutput `pulumi:"vpnGatewayId"`
}

// NewHostedPrivateVirtualInterfaceAccepter registers a new resource with the given unique name, arguments, and options.
func NewHostedPrivateVirtualInterfaceAccepter(ctx *pulumi.Context,
	name string, args *HostedPrivateVirtualInterfaceAccepterArgs, opts ...pulumi.ResourceOption) (*HostedPrivateVirtualInterfaceAccepter, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.VirtualInterfaceId == nil {
		return nil, errors.New("invalid value for required argument 'VirtualInterfaceId'")
	}
	var resource HostedPrivateVirtualInterfaceAccepter
	err := ctx.RegisterResource("aws:directconnect/hostedPrivateVirtualInterfaceAccepter:HostedPrivateVirtualInterfaceAccepter", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetHostedPrivateVirtualInterfaceAccepter gets an existing HostedPrivateVirtualInterfaceAccepter resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetHostedPrivateVirtualInterfaceAccepter(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *HostedPrivateVirtualInterfaceAccepterState, opts ...pulumi.ResourceOption) (*HostedPrivateVirtualInterfaceAccepter, error) {
	var resource HostedPrivateVirtualInterfaceAccepter
	err := ctx.ReadResource("aws:directconnect/hostedPrivateVirtualInterfaceAccepter:HostedPrivateVirtualInterfaceAccepter", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering HostedPrivateVirtualInterfaceAccepter resources.
type hostedPrivateVirtualInterfaceAccepterState struct {
	// The ARN of the virtual interface.
	Arn *string `pulumi:"arn"`
	// The ID of the Direct Connect gateway to which to connect the virtual interface.
	DxGatewayId *string `pulumi:"dxGatewayId"`
	// A map of tags to assign to the resource. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	TagsAll map[string]string `pulumi:"tagsAll"`
	// The ID of the Direct Connect virtual interface to accept.
	VirtualInterfaceId *string `pulumi:"virtualInterfaceId"`
	// The ID of the virtual private gateway to which to connect the virtual interface.
	VpnGatewayId *string `pulumi:"vpnGatewayId"`
}

type HostedPrivateVirtualInterfaceAccepterState struct {
	// The ARN of the virtual interface.
	Arn pulumi.StringPtrInput
	// The ID of the Direct Connect gateway to which to connect the virtual interface.
	DxGatewayId pulumi.StringPtrInput
	// A map of tags to assign to the resource. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	TagsAll pulumi.StringMapInput
	// The ID of the Direct Connect virtual interface to accept.
	VirtualInterfaceId pulumi.StringPtrInput
	// The ID of the virtual private gateway to which to connect the virtual interface.
	VpnGatewayId pulumi.StringPtrInput
}

func (HostedPrivateVirtualInterfaceAccepterState) ElementType() reflect.Type {
	return reflect.TypeOf((*hostedPrivateVirtualInterfaceAccepterState)(nil)).Elem()
}

type hostedPrivateVirtualInterfaceAccepterArgs struct {
	// The ID of the Direct Connect gateway to which to connect the virtual interface.
	DxGatewayId *string `pulumi:"dxGatewayId"`
	// A map of tags to assign to the resource. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// The ID of the Direct Connect virtual interface to accept.
	VirtualInterfaceId string `pulumi:"virtualInterfaceId"`
	// The ID of the virtual private gateway to which to connect the virtual interface.
	VpnGatewayId *string `pulumi:"vpnGatewayId"`
}

// The set of arguments for constructing a HostedPrivateVirtualInterfaceAccepter resource.
type HostedPrivateVirtualInterfaceAccepterArgs struct {
	// The ID of the Direct Connect gateway to which to connect the virtual interface.
	DxGatewayId pulumi.StringPtrInput
	// A map of tags to assign to the resource. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// The ID of the Direct Connect virtual interface to accept.
	VirtualInterfaceId pulumi.StringInput
	// The ID of the virtual private gateway to which to connect the virtual interface.
	VpnGatewayId pulumi.StringPtrInput
}

func (HostedPrivateVirtualInterfaceAccepterArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*hostedPrivateVirtualInterfaceAccepterArgs)(nil)).Elem()
}

type HostedPrivateVirtualInterfaceAccepterInput interface {
	pulumi.Input

	ToHostedPrivateVirtualInterfaceAccepterOutput() HostedPrivateVirtualInterfaceAccepterOutput
	ToHostedPrivateVirtualInterfaceAccepterOutputWithContext(ctx context.Context) HostedPrivateVirtualInterfaceAccepterOutput
}

func (*HostedPrivateVirtualInterfaceAccepter) ElementType() reflect.Type {
	return reflect.TypeOf((**HostedPrivateVirtualInterfaceAccepter)(nil)).Elem()
}

func (i *HostedPrivateVirtualInterfaceAccepter) ToHostedPrivateVirtualInterfaceAccepterOutput() HostedPrivateVirtualInterfaceAccepterOutput {
	return i.ToHostedPrivateVirtualInterfaceAccepterOutputWithContext(context.Background())
}

func (i *HostedPrivateVirtualInterfaceAccepter) ToHostedPrivateVirtualInterfaceAccepterOutputWithContext(ctx context.Context) HostedPrivateVirtualInterfaceAccepterOutput {
	return pulumi.ToOutputWithContext(ctx, i).(HostedPrivateVirtualInterfaceAccepterOutput)
}

// HostedPrivateVirtualInterfaceAccepterArrayInput is an input type that accepts HostedPrivateVirtualInterfaceAccepterArray and HostedPrivateVirtualInterfaceAccepterArrayOutput values.
// You can construct a concrete instance of `HostedPrivateVirtualInterfaceAccepterArrayInput` via:
//
//	HostedPrivateVirtualInterfaceAccepterArray{ HostedPrivateVirtualInterfaceAccepterArgs{...} }
type HostedPrivateVirtualInterfaceAccepterArrayInput interface {
	pulumi.Input

	ToHostedPrivateVirtualInterfaceAccepterArrayOutput() HostedPrivateVirtualInterfaceAccepterArrayOutput
	ToHostedPrivateVirtualInterfaceAccepterArrayOutputWithContext(context.Context) HostedPrivateVirtualInterfaceAccepterArrayOutput
}

type HostedPrivateVirtualInterfaceAccepterArray []HostedPrivateVirtualInterfaceAccepterInput

func (HostedPrivateVirtualInterfaceAccepterArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*HostedPrivateVirtualInterfaceAccepter)(nil)).Elem()
}

func (i HostedPrivateVirtualInterfaceAccepterArray) ToHostedPrivateVirtualInterfaceAccepterArrayOutput() HostedPrivateVirtualInterfaceAccepterArrayOutput {
	return i.ToHostedPrivateVirtualInterfaceAccepterArrayOutputWithContext(context.Background())
}

func (i HostedPrivateVirtualInterfaceAccepterArray) ToHostedPrivateVirtualInterfaceAccepterArrayOutputWithContext(ctx context.Context) HostedPrivateVirtualInterfaceAccepterArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(HostedPrivateVirtualInterfaceAccepterArrayOutput)
}

// HostedPrivateVirtualInterfaceAccepterMapInput is an input type that accepts HostedPrivateVirtualInterfaceAccepterMap and HostedPrivateVirtualInterfaceAccepterMapOutput values.
// You can construct a concrete instance of `HostedPrivateVirtualInterfaceAccepterMapInput` via:
//
//	HostedPrivateVirtualInterfaceAccepterMap{ "key": HostedPrivateVirtualInterfaceAccepterArgs{...} }
type HostedPrivateVirtualInterfaceAccepterMapInput interface {
	pulumi.Input

	ToHostedPrivateVirtualInterfaceAccepterMapOutput() HostedPrivateVirtualInterfaceAccepterMapOutput
	ToHostedPrivateVirtualInterfaceAccepterMapOutputWithContext(context.Context) HostedPrivateVirtualInterfaceAccepterMapOutput
}

type HostedPrivateVirtualInterfaceAccepterMap map[string]HostedPrivateVirtualInterfaceAccepterInput

func (HostedPrivateVirtualInterfaceAccepterMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*HostedPrivateVirtualInterfaceAccepter)(nil)).Elem()
}

func (i HostedPrivateVirtualInterfaceAccepterMap) ToHostedPrivateVirtualInterfaceAccepterMapOutput() HostedPrivateVirtualInterfaceAccepterMapOutput {
	return i.ToHostedPrivateVirtualInterfaceAccepterMapOutputWithContext(context.Background())
}

func (i HostedPrivateVirtualInterfaceAccepterMap) ToHostedPrivateVirtualInterfaceAccepterMapOutputWithContext(ctx context.Context) HostedPrivateVirtualInterfaceAccepterMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(HostedPrivateVirtualInterfaceAccepterMapOutput)
}

type HostedPrivateVirtualInterfaceAccepterOutput struct{ *pulumi.OutputState }

func (HostedPrivateVirtualInterfaceAccepterOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**HostedPrivateVirtualInterfaceAccepter)(nil)).Elem()
}

func (o HostedPrivateVirtualInterfaceAccepterOutput) ToHostedPrivateVirtualInterfaceAccepterOutput() HostedPrivateVirtualInterfaceAccepterOutput {
	return o
}

func (o HostedPrivateVirtualInterfaceAccepterOutput) ToHostedPrivateVirtualInterfaceAccepterOutputWithContext(ctx context.Context) HostedPrivateVirtualInterfaceAccepterOutput {
	return o
}

// The ARN of the virtual interface.
func (o HostedPrivateVirtualInterfaceAccepterOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v *HostedPrivateVirtualInterfaceAccepter) pulumi.StringOutput { return v.Arn }).(pulumi.StringOutput)
}

// The ID of the Direct Connect gateway to which to connect the virtual interface.
func (o HostedPrivateVirtualInterfaceAccepterOutput) DxGatewayId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *HostedPrivateVirtualInterfaceAccepter) pulumi.StringPtrOutput { return v.DxGatewayId }).(pulumi.StringPtrOutput)
}

// A map of tags to assign to the resource. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
func (o HostedPrivateVirtualInterfaceAccepterOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *HostedPrivateVirtualInterfaceAccepter) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
func (o HostedPrivateVirtualInterfaceAccepterOutput) TagsAll() pulumi.StringMapOutput {
	return o.ApplyT(func(v *HostedPrivateVirtualInterfaceAccepter) pulumi.StringMapOutput { return v.TagsAll }).(pulumi.StringMapOutput)
}

// The ID of the Direct Connect virtual interface to accept.
func (o HostedPrivateVirtualInterfaceAccepterOutput) VirtualInterfaceId() pulumi.StringOutput {
	return o.ApplyT(func(v *HostedPrivateVirtualInterfaceAccepter) pulumi.StringOutput { return v.VirtualInterfaceId }).(pulumi.StringOutput)
}

// The ID of the virtual private gateway to which to connect the virtual interface.
func (o HostedPrivateVirtualInterfaceAccepterOutput) VpnGatewayId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *HostedPrivateVirtualInterfaceAccepter) pulumi.StringPtrOutput { return v.VpnGatewayId }).(pulumi.StringPtrOutput)
}

type HostedPrivateVirtualInterfaceAccepterArrayOutput struct{ *pulumi.OutputState }

func (HostedPrivateVirtualInterfaceAccepterArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*HostedPrivateVirtualInterfaceAccepter)(nil)).Elem()
}

func (o HostedPrivateVirtualInterfaceAccepterArrayOutput) ToHostedPrivateVirtualInterfaceAccepterArrayOutput() HostedPrivateVirtualInterfaceAccepterArrayOutput {
	return o
}

func (o HostedPrivateVirtualInterfaceAccepterArrayOutput) ToHostedPrivateVirtualInterfaceAccepterArrayOutputWithContext(ctx context.Context) HostedPrivateVirtualInterfaceAccepterArrayOutput {
	return o
}

func (o HostedPrivateVirtualInterfaceAccepterArrayOutput) Index(i pulumi.IntInput) HostedPrivateVirtualInterfaceAccepterOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *HostedPrivateVirtualInterfaceAccepter {
		return vs[0].([]*HostedPrivateVirtualInterfaceAccepter)[vs[1].(int)]
	}).(HostedPrivateVirtualInterfaceAccepterOutput)
}

type HostedPrivateVirtualInterfaceAccepterMapOutput struct{ *pulumi.OutputState }

func (HostedPrivateVirtualInterfaceAccepterMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*HostedPrivateVirtualInterfaceAccepter)(nil)).Elem()
}

func (o HostedPrivateVirtualInterfaceAccepterMapOutput) ToHostedPrivateVirtualInterfaceAccepterMapOutput() HostedPrivateVirtualInterfaceAccepterMapOutput {
	return o
}

func (o HostedPrivateVirtualInterfaceAccepterMapOutput) ToHostedPrivateVirtualInterfaceAccepterMapOutputWithContext(ctx context.Context) HostedPrivateVirtualInterfaceAccepterMapOutput {
	return o
}

func (o HostedPrivateVirtualInterfaceAccepterMapOutput) MapIndex(k pulumi.StringInput) HostedPrivateVirtualInterfaceAccepterOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *HostedPrivateVirtualInterfaceAccepter {
		return vs[0].(map[string]*HostedPrivateVirtualInterfaceAccepter)[vs[1].(string)]
	}).(HostedPrivateVirtualInterfaceAccepterOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*HostedPrivateVirtualInterfaceAccepterInput)(nil)).Elem(), &HostedPrivateVirtualInterfaceAccepter{})
	pulumi.RegisterInputType(reflect.TypeOf((*HostedPrivateVirtualInterfaceAccepterArrayInput)(nil)).Elem(), HostedPrivateVirtualInterfaceAccepterArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*HostedPrivateVirtualInterfaceAccepterMapInput)(nil)).Elem(), HostedPrivateVirtualInterfaceAccepterMap{})
	pulumi.RegisterOutputType(HostedPrivateVirtualInterfaceAccepterOutput{})
	pulumi.RegisterOutputType(HostedPrivateVirtualInterfaceAccepterArrayOutput{})
	pulumi.RegisterOutputType(HostedPrivateVirtualInterfaceAccepterMapOutput{})
}

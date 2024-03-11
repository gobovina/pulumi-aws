// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package ec2transitgateway

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Registers members (network interfaces) with the transit gateway multicast group.
// A member is a network interface associated with a supported EC2 instance that receives multicast traffic.
//
// ## Example Usage
//
// <!--Start PulumiCodeChooser -->
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/ec2transitgateway"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := ec2transitgateway.NewMulticastGroupMember(ctx, "example", &ec2transitgateway.MulticastGroupMemberArgs{
//				GroupIpAddress:                  pulumi.String("224.0.0.1"),
//				NetworkInterfaceId:              pulumi.Any(exampleAwsNetworkInterface.Id),
//				TransitGatewayMulticastDomainId: pulumi.Any(exampleAwsEc2TransitGatewayMulticastDomain.Id),
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
type MulticastGroupMember struct {
	pulumi.CustomResourceState

	// The IP address assigned to the transit gateway multicast group.
	GroupIpAddress pulumi.StringOutput `pulumi:"groupIpAddress"`
	// The group members' network interface ID to register with the transit gateway multicast group.
	NetworkInterfaceId pulumi.StringOutput `pulumi:"networkInterfaceId"`
	// The ID of the transit gateway multicast domain.
	TransitGatewayMulticastDomainId pulumi.StringOutput `pulumi:"transitGatewayMulticastDomainId"`
}

// NewMulticastGroupMember registers a new resource with the given unique name, arguments, and options.
func NewMulticastGroupMember(ctx *pulumi.Context,
	name string, args *MulticastGroupMemberArgs, opts ...pulumi.ResourceOption) (*MulticastGroupMember, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.GroupIpAddress == nil {
		return nil, errors.New("invalid value for required argument 'GroupIpAddress'")
	}
	if args.NetworkInterfaceId == nil {
		return nil, errors.New("invalid value for required argument 'NetworkInterfaceId'")
	}
	if args.TransitGatewayMulticastDomainId == nil {
		return nil, errors.New("invalid value for required argument 'TransitGatewayMulticastDomainId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource MulticastGroupMember
	err := ctx.RegisterResource("aws:ec2transitgateway/multicastGroupMember:MulticastGroupMember", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetMulticastGroupMember gets an existing MulticastGroupMember resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetMulticastGroupMember(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *MulticastGroupMemberState, opts ...pulumi.ResourceOption) (*MulticastGroupMember, error) {
	var resource MulticastGroupMember
	err := ctx.ReadResource("aws:ec2transitgateway/multicastGroupMember:MulticastGroupMember", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering MulticastGroupMember resources.
type multicastGroupMemberState struct {
	// The IP address assigned to the transit gateway multicast group.
	GroupIpAddress *string `pulumi:"groupIpAddress"`
	// The group members' network interface ID to register with the transit gateway multicast group.
	NetworkInterfaceId *string `pulumi:"networkInterfaceId"`
	// The ID of the transit gateway multicast domain.
	TransitGatewayMulticastDomainId *string `pulumi:"transitGatewayMulticastDomainId"`
}

type MulticastGroupMemberState struct {
	// The IP address assigned to the transit gateway multicast group.
	GroupIpAddress pulumi.StringPtrInput
	// The group members' network interface ID to register with the transit gateway multicast group.
	NetworkInterfaceId pulumi.StringPtrInput
	// The ID of the transit gateway multicast domain.
	TransitGatewayMulticastDomainId pulumi.StringPtrInput
}

func (MulticastGroupMemberState) ElementType() reflect.Type {
	return reflect.TypeOf((*multicastGroupMemberState)(nil)).Elem()
}

type multicastGroupMemberArgs struct {
	// The IP address assigned to the transit gateway multicast group.
	GroupIpAddress string `pulumi:"groupIpAddress"`
	// The group members' network interface ID to register with the transit gateway multicast group.
	NetworkInterfaceId string `pulumi:"networkInterfaceId"`
	// The ID of the transit gateway multicast domain.
	TransitGatewayMulticastDomainId string `pulumi:"transitGatewayMulticastDomainId"`
}

// The set of arguments for constructing a MulticastGroupMember resource.
type MulticastGroupMemberArgs struct {
	// The IP address assigned to the transit gateway multicast group.
	GroupIpAddress pulumi.StringInput
	// The group members' network interface ID to register with the transit gateway multicast group.
	NetworkInterfaceId pulumi.StringInput
	// The ID of the transit gateway multicast domain.
	TransitGatewayMulticastDomainId pulumi.StringInput
}

func (MulticastGroupMemberArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*multicastGroupMemberArgs)(nil)).Elem()
}

type MulticastGroupMemberInput interface {
	pulumi.Input

	ToMulticastGroupMemberOutput() MulticastGroupMemberOutput
	ToMulticastGroupMemberOutputWithContext(ctx context.Context) MulticastGroupMemberOutput
}

func (*MulticastGroupMember) ElementType() reflect.Type {
	return reflect.TypeOf((**MulticastGroupMember)(nil)).Elem()
}

func (i *MulticastGroupMember) ToMulticastGroupMemberOutput() MulticastGroupMemberOutput {
	return i.ToMulticastGroupMemberOutputWithContext(context.Background())
}

func (i *MulticastGroupMember) ToMulticastGroupMemberOutputWithContext(ctx context.Context) MulticastGroupMemberOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MulticastGroupMemberOutput)
}

// MulticastGroupMemberArrayInput is an input type that accepts MulticastGroupMemberArray and MulticastGroupMemberArrayOutput values.
// You can construct a concrete instance of `MulticastGroupMemberArrayInput` via:
//
//	MulticastGroupMemberArray{ MulticastGroupMemberArgs{...} }
type MulticastGroupMemberArrayInput interface {
	pulumi.Input

	ToMulticastGroupMemberArrayOutput() MulticastGroupMemberArrayOutput
	ToMulticastGroupMemberArrayOutputWithContext(context.Context) MulticastGroupMemberArrayOutput
}

type MulticastGroupMemberArray []MulticastGroupMemberInput

func (MulticastGroupMemberArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*MulticastGroupMember)(nil)).Elem()
}

func (i MulticastGroupMemberArray) ToMulticastGroupMemberArrayOutput() MulticastGroupMemberArrayOutput {
	return i.ToMulticastGroupMemberArrayOutputWithContext(context.Background())
}

func (i MulticastGroupMemberArray) ToMulticastGroupMemberArrayOutputWithContext(ctx context.Context) MulticastGroupMemberArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MulticastGroupMemberArrayOutput)
}

// MulticastGroupMemberMapInput is an input type that accepts MulticastGroupMemberMap and MulticastGroupMemberMapOutput values.
// You can construct a concrete instance of `MulticastGroupMemberMapInput` via:
//
//	MulticastGroupMemberMap{ "key": MulticastGroupMemberArgs{...} }
type MulticastGroupMemberMapInput interface {
	pulumi.Input

	ToMulticastGroupMemberMapOutput() MulticastGroupMemberMapOutput
	ToMulticastGroupMemberMapOutputWithContext(context.Context) MulticastGroupMemberMapOutput
}

type MulticastGroupMemberMap map[string]MulticastGroupMemberInput

func (MulticastGroupMemberMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*MulticastGroupMember)(nil)).Elem()
}

func (i MulticastGroupMemberMap) ToMulticastGroupMemberMapOutput() MulticastGroupMemberMapOutput {
	return i.ToMulticastGroupMemberMapOutputWithContext(context.Background())
}

func (i MulticastGroupMemberMap) ToMulticastGroupMemberMapOutputWithContext(ctx context.Context) MulticastGroupMemberMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MulticastGroupMemberMapOutput)
}

type MulticastGroupMemberOutput struct{ *pulumi.OutputState }

func (MulticastGroupMemberOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**MulticastGroupMember)(nil)).Elem()
}

func (o MulticastGroupMemberOutput) ToMulticastGroupMemberOutput() MulticastGroupMemberOutput {
	return o
}

func (o MulticastGroupMemberOutput) ToMulticastGroupMemberOutputWithContext(ctx context.Context) MulticastGroupMemberOutput {
	return o
}

// The IP address assigned to the transit gateway multicast group.
func (o MulticastGroupMemberOutput) GroupIpAddress() pulumi.StringOutput {
	return o.ApplyT(func(v *MulticastGroupMember) pulumi.StringOutput { return v.GroupIpAddress }).(pulumi.StringOutput)
}

// The group members' network interface ID to register with the transit gateway multicast group.
func (o MulticastGroupMemberOutput) NetworkInterfaceId() pulumi.StringOutput {
	return o.ApplyT(func(v *MulticastGroupMember) pulumi.StringOutput { return v.NetworkInterfaceId }).(pulumi.StringOutput)
}

// The ID of the transit gateway multicast domain.
func (o MulticastGroupMemberOutput) TransitGatewayMulticastDomainId() pulumi.StringOutput {
	return o.ApplyT(func(v *MulticastGroupMember) pulumi.StringOutput { return v.TransitGatewayMulticastDomainId }).(pulumi.StringOutput)
}

type MulticastGroupMemberArrayOutput struct{ *pulumi.OutputState }

func (MulticastGroupMemberArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*MulticastGroupMember)(nil)).Elem()
}

func (o MulticastGroupMemberArrayOutput) ToMulticastGroupMemberArrayOutput() MulticastGroupMemberArrayOutput {
	return o
}

func (o MulticastGroupMemberArrayOutput) ToMulticastGroupMemberArrayOutputWithContext(ctx context.Context) MulticastGroupMemberArrayOutput {
	return o
}

func (o MulticastGroupMemberArrayOutput) Index(i pulumi.IntInput) MulticastGroupMemberOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *MulticastGroupMember {
		return vs[0].([]*MulticastGroupMember)[vs[1].(int)]
	}).(MulticastGroupMemberOutput)
}

type MulticastGroupMemberMapOutput struct{ *pulumi.OutputState }

func (MulticastGroupMemberMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*MulticastGroupMember)(nil)).Elem()
}

func (o MulticastGroupMemberMapOutput) ToMulticastGroupMemberMapOutput() MulticastGroupMemberMapOutput {
	return o
}

func (o MulticastGroupMemberMapOutput) ToMulticastGroupMemberMapOutputWithContext(ctx context.Context) MulticastGroupMemberMapOutput {
	return o
}

func (o MulticastGroupMemberMapOutput) MapIndex(k pulumi.StringInput) MulticastGroupMemberOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *MulticastGroupMember {
		return vs[0].(map[string]*MulticastGroupMember)[vs[1].(string)]
	}).(MulticastGroupMemberOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*MulticastGroupMemberInput)(nil)).Elem(), &MulticastGroupMember{})
	pulumi.RegisterInputType(reflect.TypeOf((*MulticastGroupMemberArrayInput)(nil)).Elem(), MulticastGroupMemberArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*MulticastGroupMemberMapInput)(nil)).Elem(), MulticastGroupMemberMap{})
	pulumi.RegisterOutputType(MulticastGroupMemberOutput{})
	pulumi.RegisterOutputType(MulticastGroupMemberArrayOutput{})
	pulumi.RegisterOutputType(MulticastGroupMemberMapOutput{})
}

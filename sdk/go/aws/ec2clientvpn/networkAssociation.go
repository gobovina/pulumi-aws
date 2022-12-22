// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package ec2clientvpn

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides network associations for AWS Client VPN endpoints. For more information on usage, please see the
// [AWS Client VPN Administrator's Guide](https://docs.aws.amazon.com/vpn/latest/clientvpn-admin/what-is.html).
//
// > **NOTE on Client VPN endpoint target network security groups:** The provider provides both a standalone Client VPN endpoint network association resource with a (deprecated) `securityGroups` argument and a Client VPN endpoint resource with a `securityGroupIds` argument. Do not specify security groups in both resources. Doing so will cause a conflict and will overwrite the target network security group association.
//
// ## Example Usage
// ### Using default security group
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v5/go/aws/ec2clientvpn"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := ec2clientvpn.NewNetworkAssociation(ctx, "example", &ec2clientvpn.NetworkAssociationArgs{
//				ClientVpnEndpointId: pulumi.Any(aws_ec2_client_vpn_endpoint.Example.Id),
//				SubnetId:            pulumi.Any(aws_subnet.Example.Id),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// ### Using custom security groups
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v5/go/aws/ec2clientvpn"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := ec2clientvpn.NewNetworkAssociation(ctx, "example", &ec2clientvpn.NetworkAssociationArgs{
//				ClientVpnEndpointId: pulumi.Any(aws_ec2_client_vpn_endpoint.Example.Id),
//				SubnetId:            pulumi.Any(aws_subnet.Example.Id),
//				SecurityGroups: pulumi.StringArray{
//					aws_security_group.Example1.Id,
//					aws_security_group.Example2.Id,
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
// AWS Client VPN network associations can be imported using the endpoint ID and the association ID. Values are separated by a `,`.
//
// ```sh
//
//	$ pulumi import aws:ec2clientvpn/networkAssociation:NetworkAssociation example cvpn-endpoint-0ac3a1abbccddd666,vpn-assoc-0b8db902465d069ad
//
// ```
type NetworkAssociation struct {
	pulumi.CustomResourceState

	// The unique ID of the target network association.
	AssociationId pulumi.StringOutput `pulumi:"associationId"`
	// The ID of the Client VPN endpoint.
	ClientVpnEndpointId pulumi.StringOutput `pulumi:"clientVpnEndpointId"`
	// A list of up to five custom security groups to apply to the target network. If not specified, the VPC's default security group is assigned.
	//
	// Deprecated: Use the `security_group_ids` attribute of the `aws_ec2_client_vpn_endpoint` resource instead.
	SecurityGroups pulumi.StringArrayOutput `pulumi:"securityGroups"`
	// **Deprecated** The current state of the target network association.
	//
	// Deprecated: This attribute has been deprecated.
	Status pulumi.StringOutput `pulumi:"status"`
	// The ID of the subnet to associate with the Client VPN endpoint.
	SubnetId pulumi.StringOutput `pulumi:"subnetId"`
	// The ID of the VPC in which the target subnet is located.
	VpcId pulumi.StringOutput `pulumi:"vpcId"`
}

// NewNetworkAssociation registers a new resource with the given unique name, arguments, and options.
func NewNetworkAssociation(ctx *pulumi.Context,
	name string, args *NetworkAssociationArgs, opts ...pulumi.ResourceOption) (*NetworkAssociation, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ClientVpnEndpointId == nil {
		return nil, errors.New("invalid value for required argument 'ClientVpnEndpointId'")
	}
	if args.SubnetId == nil {
		return nil, errors.New("invalid value for required argument 'SubnetId'")
	}
	var resource NetworkAssociation
	err := ctx.RegisterResource("aws:ec2clientvpn/networkAssociation:NetworkAssociation", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetNetworkAssociation gets an existing NetworkAssociation resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetNetworkAssociation(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *NetworkAssociationState, opts ...pulumi.ResourceOption) (*NetworkAssociation, error) {
	var resource NetworkAssociation
	err := ctx.ReadResource("aws:ec2clientvpn/networkAssociation:NetworkAssociation", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering NetworkAssociation resources.
type networkAssociationState struct {
	// The unique ID of the target network association.
	AssociationId *string `pulumi:"associationId"`
	// The ID of the Client VPN endpoint.
	ClientVpnEndpointId *string `pulumi:"clientVpnEndpointId"`
	// A list of up to five custom security groups to apply to the target network. If not specified, the VPC's default security group is assigned.
	//
	// Deprecated: Use the `security_group_ids` attribute of the `aws_ec2_client_vpn_endpoint` resource instead.
	SecurityGroups []string `pulumi:"securityGroups"`
	// **Deprecated** The current state of the target network association.
	//
	// Deprecated: This attribute has been deprecated.
	Status *string `pulumi:"status"`
	// The ID of the subnet to associate with the Client VPN endpoint.
	SubnetId *string `pulumi:"subnetId"`
	// The ID of the VPC in which the target subnet is located.
	VpcId *string `pulumi:"vpcId"`
}

type NetworkAssociationState struct {
	// The unique ID of the target network association.
	AssociationId pulumi.StringPtrInput
	// The ID of the Client VPN endpoint.
	ClientVpnEndpointId pulumi.StringPtrInput
	// A list of up to five custom security groups to apply to the target network. If not specified, the VPC's default security group is assigned.
	//
	// Deprecated: Use the `security_group_ids` attribute of the `aws_ec2_client_vpn_endpoint` resource instead.
	SecurityGroups pulumi.StringArrayInput
	// **Deprecated** The current state of the target network association.
	//
	// Deprecated: This attribute has been deprecated.
	Status pulumi.StringPtrInput
	// The ID of the subnet to associate with the Client VPN endpoint.
	SubnetId pulumi.StringPtrInput
	// The ID of the VPC in which the target subnet is located.
	VpcId pulumi.StringPtrInput
}

func (NetworkAssociationState) ElementType() reflect.Type {
	return reflect.TypeOf((*networkAssociationState)(nil)).Elem()
}

type networkAssociationArgs struct {
	// The ID of the Client VPN endpoint.
	ClientVpnEndpointId string `pulumi:"clientVpnEndpointId"`
	// A list of up to five custom security groups to apply to the target network. If not specified, the VPC's default security group is assigned.
	//
	// Deprecated: Use the `security_group_ids` attribute of the `aws_ec2_client_vpn_endpoint` resource instead.
	SecurityGroups []string `pulumi:"securityGroups"`
	// The ID of the subnet to associate with the Client VPN endpoint.
	SubnetId string `pulumi:"subnetId"`
}

// The set of arguments for constructing a NetworkAssociation resource.
type NetworkAssociationArgs struct {
	// The ID of the Client VPN endpoint.
	ClientVpnEndpointId pulumi.StringInput
	// A list of up to five custom security groups to apply to the target network. If not specified, the VPC's default security group is assigned.
	//
	// Deprecated: Use the `security_group_ids` attribute of the `aws_ec2_client_vpn_endpoint` resource instead.
	SecurityGroups pulumi.StringArrayInput
	// The ID of the subnet to associate with the Client VPN endpoint.
	SubnetId pulumi.StringInput
}

func (NetworkAssociationArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*networkAssociationArgs)(nil)).Elem()
}

type NetworkAssociationInput interface {
	pulumi.Input

	ToNetworkAssociationOutput() NetworkAssociationOutput
	ToNetworkAssociationOutputWithContext(ctx context.Context) NetworkAssociationOutput
}

func (*NetworkAssociation) ElementType() reflect.Type {
	return reflect.TypeOf((**NetworkAssociation)(nil)).Elem()
}

func (i *NetworkAssociation) ToNetworkAssociationOutput() NetworkAssociationOutput {
	return i.ToNetworkAssociationOutputWithContext(context.Background())
}

func (i *NetworkAssociation) ToNetworkAssociationOutputWithContext(ctx context.Context) NetworkAssociationOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NetworkAssociationOutput)
}

// NetworkAssociationArrayInput is an input type that accepts NetworkAssociationArray and NetworkAssociationArrayOutput values.
// You can construct a concrete instance of `NetworkAssociationArrayInput` via:
//
//	NetworkAssociationArray{ NetworkAssociationArgs{...} }
type NetworkAssociationArrayInput interface {
	pulumi.Input

	ToNetworkAssociationArrayOutput() NetworkAssociationArrayOutput
	ToNetworkAssociationArrayOutputWithContext(context.Context) NetworkAssociationArrayOutput
}

type NetworkAssociationArray []NetworkAssociationInput

func (NetworkAssociationArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*NetworkAssociation)(nil)).Elem()
}

func (i NetworkAssociationArray) ToNetworkAssociationArrayOutput() NetworkAssociationArrayOutput {
	return i.ToNetworkAssociationArrayOutputWithContext(context.Background())
}

func (i NetworkAssociationArray) ToNetworkAssociationArrayOutputWithContext(ctx context.Context) NetworkAssociationArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NetworkAssociationArrayOutput)
}

// NetworkAssociationMapInput is an input type that accepts NetworkAssociationMap and NetworkAssociationMapOutput values.
// You can construct a concrete instance of `NetworkAssociationMapInput` via:
//
//	NetworkAssociationMap{ "key": NetworkAssociationArgs{...} }
type NetworkAssociationMapInput interface {
	pulumi.Input

	ToNetworkAssociationMapOutput() NetworkAssociationMapOutput
	ToNetworkAssociationMapOutputWithContext(context.Context) NetworkAssociationMapOutput
}

type NetworkAssociationMap map[string]NetworkAssociationInput

func (NetworkAssociationMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*NetworkAssociation)(nil)).Elem()
}

func (i NetworkAssociationMap) ToNetworkAssociationMapOutput() NetworkAssociationMapOutput {
	return i.ToNetworkAssociationMapOutputWithContext(context.Background())
}

func (i NetworkAssociationMap) ToNetworkAssociationMapOutputWithContext(ctx context.Context) NetworkAssociationMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NetworkAssociationMapOutput)
}

type NetworkAssociationOutput struct{ *pulumi.OutputState }

func (NetworkAssociationOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**NetworkAssociation)(nil)).Elem()
}

func (o NetworkAssociationOutput) ToNetworkAssociationOutput() NetworkAssociationOutput {
	return o
}

func (o NetworkAssociationOutput) ToNetworkAssociationOutputWithContext(ctx context.Context) NetworkAssociationOutput {
	return o
}

// The unique ID of the target network association.
func (o NetworkAssociationOutput) AssociationId() pulumi.StringOutput {
	return o.ApplyT(func(v *NetworkAssociation) pulumi.StringOutput { return v.AssociationId }).(pulumi.StringOutput)
}

// The ID of the Client VPN endpoint.
func (o NetworkAssociationOutput) ClientVpnEndpointId() pulumi.StringOutput {
	return o.ApplyT(func(v *NetworkAssociation) pulumi.StringOutput { return v.ClientVpnEndpointId }).(pulumi.StringOutput)
}

// A list of up to five custom security groups to apply to the target network. If not specified, the VPC's default security group is assigned.
//
// Deprecated: Use the `security_group_ids` attribute of the `aws_ec2_client_vpn_endpoint` resource instead.
func (o NetworkAssociationOutput) SecurityGroups() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *NetworkAssociation) pulumi.StringArrayOutput { return v.SecurityGroups }).(pulumi.StringArrayOutput)
}

// **Deprecated** The current state of the target network association.
//
// Deprecated: This attribute has been deprecated.
func (o NetworkAssociationOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *NetworkAssociation) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

// The ID of the subnet to associate with the Client VPN endpoint.
func (o NetworkAssociationOutput) SubnetId() pulumi.StringOutput {
	return o.ApplyT(func(v *NetworkAssociation) pulumi.StringOutput { return v.SubnetId }).(pulumi.StringOutput)
}

// The ID of the VPC in which the target subnet is located.
func (o NetworkAssociationOutput) VpcId() pulumi.StringOutput {
	return o.ApplyT(func(v *NetworkAssociation) pulumi.StringOutput { return v.VpcId }).(pulumi.StringOutput)
}

type NetworkAssociationArrayOutput struct{ *pulumi.OutputState }

func (NetworkAssociationArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*NetworkAssociation)(nil)).Elem()
}

func (o NetworkAssociationArrayOutput) ToNetworkAssociationArrayOutput() NetworkAssociationArrayOutput {
	return o
}

func (o NetworkAssociationArrayOutput) ToNetworkAssociationArrayOutputWithContext(ctx context.Context) NetworkAssociationArrayOutput {
	return o
}

func (o NetworkAssociationArrayOutput) Index(i pulumi.IntInput) NetworkAssociationOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *NetworkAssociation {
		return vs[0].([]*NetworkAssociation)[vs[1].(int)]
	}).(NetworkAssociationOutput)
}

type NetworkAssociationMapOutput struct{ *pulumi.OutputState }

func (NetworkAssociationMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*NetworkAssociation)(nil)).Elem()
}

func (o NetworkAssociationMapOutput) ToNetworkAssociationMapOutput() NetworkAssociationMapOutput {
	return o
}

func (o NetworkAssociationMapOutput) ToNetworkAssociationMapOutputWithContext(ctx context.Context) NetworkAssociationMapOutput {
	return o
}

func (o NetworkAssociationMapOutput) MapIndex(k pulumi.StringInput) NetworkAssociationOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *NetworkAssociation {
		return vs[0].(map[string]*NetworkAssociation)[vs[1].(string)]
	}).(NetworkAssociationOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*NetworkAssociationInput)(nil)).Elem(), &NetworkAssociation{})
	pulumi.RegisterInputType(reflect.TypeOf((*NetworkAssociationArrayInput)(nil)).Elem(), NetworkAssociationArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*NetworkAssociationMapInput)(nil)).Elem(), NetworkAssociationMap{})
	pulumi.RegisterOutputType(NetworkAssociationOutput{})
	pulumi.RegisterOutputType(NetworkAssociationArrayOutput{})
	pulumi.RegisterOutputType(NetworkAssociationMapOutput{})
}

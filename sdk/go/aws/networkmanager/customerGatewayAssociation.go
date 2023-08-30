// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package networkmanager

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Associates a customer gateway with a device and optionally, with a link.
// If you specify a link, it must be associated with the specified device.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/ec2"
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/ec2transitgateway"
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/networkmanager"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			exampleGlobalNetwork, err := networkmanager.NewGlobalNetwork(ctx, "exampleGlobalNetwork", &networkmanager.GlobalNetworkArgs{
//				Description: pulumi.String("example"),
//			})
//			if err != nil {
//				return err
//			}
//			exampleSite, err := networkmanager.NewSite(ctx, "exampleSite", &networkmanager.SiteArgs{
//				GlobalNetworkId: exampleGlobalNetwork.ID(),
//			})
//			if err != nil {
//				return err
//			}
//			exampleDevice, err := networkmanager.NewDevice(ctx, "exampleDevice", &networkmanager.DeviceArgs{
//				GlobalNetworkId: exampleGlobalNetwork.ID(),
//				SiteId:          exampleSite.ID(),
//			})
//			if err != nil {
//				return err
//			}
//			exampleCustomerGateway, err := ec2.NewCustomerGateway(ctx, "exampleCustomerGateway", &ec2.CustomerGatewayArgs{
//				BgpAsn:    pulumi.String("65000"),
//				IpAddress: pulumi.String("172.83.124.10"),
//				Type:      pulumi.String("ipsec.1"),
//			})
//			if err != nil {
//				return err
//			}
//			exampleTransitGateway, err := ec2transitgateway.NewTransitGateway(ctx, "exampleTransitGateway", nil)
//			if err != nil {
//				return err
//			}
//			exampleVpnConnection, err := ec2.NewVpnConnection(ctx, "exampleVpnConnection", &ec2.VpnConnectionArgs{
//				CustomerGatewayId: exampleCustomerGateway.ID(),
//				TransitGatewayId:  exampleTransitGateway.ID(),
//				Type:              exampleCustomerGateway.Type,
//				StaticRoutesOnly:  pulumi.Bool(true),
//			})
//			if err != nil {
//				return err
//			}
//			exampleTransitGatewayRegistration, err := networkmanager.NewTransitGatewayRegistration(ctx, "exampleTransitGatewayRegistration", &networkmanager.TransitGatewayRegistrationArgs{
//				GlobalNetworkId:   exampleGlobalNetwork.ID(),
//				TransitGatewayArn: exampleTransitGateway.Arn,
//			}, pulumi.DependsOn([]pulumi.Resource{
//				exampleVpnConnection,
//			}))
//			if err != nil {
//				return err
//			}
//			_, err = networkmanager.NewCustomerGatewayAssociation(ctx, "exampleCustomerGatewayAssociation", &networkmanager.CustomerGatewayAssociationArgs{
//				GlobalNetworkId:    exampleGlobalNetwork.ID(),
//				CustomerGatewayArn: exampleCustomerGateway.Arn,
//				DeviceId:           exampleDevice.ID(),
//			}, pulumi.DependsOn([]pulumi.Resource{
//				exampleTransitGatewayRegistration,
//			}))
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
// Using `pulumi import`, import `aws_networkmanager_customer_gateway_association` using the global network ID and customer gateway ARN. For example:
//
// ```sh
//
//	$ pulumi import aws:networkmanager/customerGatewayAssociation:CustomerGatewayAssociation example global-network-0d47f6t230mz46dy4,arn:aws:ec2:us-west-2:123456789012:customer-gateway/cgw-123abc05e04123abc
//
// ```
type CustomerGatewayAssociation struct {
	pulumi.CustomResourceState

	// The Amazon Resource Name (ARN) of the customer gateway.
	CustomerGatewayArn pulumi.StringOutput `pulumi:"customerGatewayArn"`
	// The ID of the device.
	DeviceId pulumi.StringOutput `pulumi:"deviceId"`
	// The ID of the global network.
	GlobalNetworkId pulumi.StringOutput `pulumi:"globalNetworkId"`
	// The ID of the link.
	LinkId pulumi.StringPtrOutput `pulumi:"linkId"`
}

// NewCustomerGatewayAssociation registers a new resource with the given unique name, arguments, and options.
func NewCustomerGatewayAssociation(ctx *pulumi.Context,
	name string, args *CustomerGatewayAssociationArgs, opts ...pulumi.ResourceOption) (*CustomerGatewayAssociation, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.CustomerGatewayArn == nil {
		return nil, errors.New("invalid value for required argument 'CustomerGatewayArn'")
	}
	if args.DeviceId == nil {
		return nil, errors.New("invalid value for required argument 'DeviceId'")
	}
	if args.GlobalNetworkId == nil {
		return nil, errors.New("invalid value for required argument 'GlobalNetworkId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource CustomerGatewayAssociation
	err := ctx.RegisterResource("aws:networkmanager/customerGatewayAssociation:CustomerGatewayAssociation", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetCustomerGatewayAssociation gets an existing CustomerGatewayAssociation resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetCustomerGatewayAssociation(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *CustomerGatewayAssociationState, opts ...pulumi.ResourceOption) (*CustomerGatewayAssociation, error) {
	var resource CustomerGatewayAssociation
	err := ctx.ReadResource("aws:networkmanager/customerGatewayAssociation:CustomerGatewayAssociation", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering CustomerGatewayAssociation resources.
type customerGatewayAssociationState struct {
	// The Amazon Resource Name (ARN) of the customer gateway.
	CustomerGatewayArn *string `pulumi:"customerGatewayArn"`
	// The ID of the device.
	DeviceId *string `pulumi:"deviceId"`
	// The ID of the global network.
	GlobalNetworkId *string `pulumi:"globalNetworkId"`
	// The ID of the link.
	LinkId *string `pulumi:"linkId"`
}

type CustomerGatewayAssociationState struct {
	// The Amazon Resource Name (ARN) of the customer gateway.
	CustomerGatewayArn pulumi.StringPtrInput
	// The ID of the device.
	DeviceId pulumi.StringPtrInput
	// The ID of the global network.
	GlobalNetworkId pulumi.StringPtrInput
	// The ID of the link.
	LinkId pulumi.StringPtrInput
}

func (CustomerGatewayAssociationState) ElementType() reflect.Type {
	return reflect.TypeOf((*customerGatewayAssociationState)(nil)).Elem()
}

type customerGatewayAssociationArgs struct {
	// The Amazon Resource Name (ARN) of the customer gateway.
	CustomerGatewayArn string `pulumi:"customerGatewayArn"`
	// The ID of the device.
	DeviceId string `pulumi:"deviceId"`
	// The ID of the global network.
	GlobalNetworkId string `pulumi:"globalNetworkId"`
	// The ID of the link.
	LinkId *string `pulumi:"linkId"`
}

// The set of arguments for constructing a CustomerGatewayAssociation resource.
type CustomerGatewayAssociationArgs struct {
	// The Amazon Resource Name (ARN) of the customer gateway.
	CustomerGatewayArn pulumi.StringInput
	// The ID of the device.
	DeviceId pulumi.StringInput
	// The ID of the global network.
	GlobalNetworkId pulumi.StringInput
	// The ID of the link.
	LinkId pulumi.StringPtrInput
}

func (CustomerGatewayAssociationArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*customerGatewayAssociationArgs)(nil)).Elem()
}

type CustomerGatewayAssociationInput interface {
	pulumi.Input

	ToCustomerGatewayAssociationOutput() CustomerGatewayAssociationOutput
	ToCustomerGatewayAssociationOutputWithContext(ctx context.Context) CustomerGatewayAssociationOutput
}

func (*CustomerGatewayAssociation) ElementType() reflect.Type {
	return reflect.TypeOf((**CustomerGatewayAssociation)(nil)).Elem()
}

func (i *CustomerGatewayAssociation) ToCustomerGatewayAssociationOutput() CustomerGatewayAssociationOutput {
	return i.ToCustomerGatewayAssociationOutputWithContext(context.Background())
}

func (i *CustomerGatewayAssociation) ToCustomerGatewayAssociationOutputWithContext(ctx context.Context) CustomerGatewayAssociationOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CustomerGatewayAssociationOutput)
}

// CustomerGatewayAssociationArrayInput is an input type that accepts CustomerGatewayAssociationArray and CustomerGatewayAssociationArrayOutput values.
// You can construct a concrete instance of `CustomerGatewayAssociationArrayInput` via:
//
//	CustomerGatewayAssociationArray{ CustomerGatewayAssociationArgs{...} }
type CustomerGatewayAssociationArrayInput interface {
	pulumi.Input

	ToCustomerGatewayAssociationArrayOutput() CustomerGatewayAssociationArrayOutput
	ToCustomerGatewayAssociationArrayOutputWithContext(context.Context) CustomerGatewayAssociationArrayOutput
}

type CustomerGatewayAssociationArray []CustomerGatewayAssociationInput

func (CustomerGatewayAssociationArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*CustomerGatewayAssociation)(nil)).Elem()
}

func (i CustomerGatewayAssociationArray) ToCustomerGatewayAssociationArrayOutput() CustomerGatewayAssociationArrayOutput {
	return i.ToCustomerGatewayAssociationArrayOutputWithContext(context.Background())
}

func (i CustomerGatewayAssociationArray) ToCustomerGatewayAssociationArrayOutputWithContext(ctx context.Context) CustomerGatewayAssociationArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CustomerGatewayAssociationArrayOutput)
}

// CustomerGatewayAssociationMapInput is an input type that accepts CustomerGatewayAssociationMap and CustomerGatewayAssociationMapOutput values.
// You can construct a concrete instance of `CustomerGatewayAssociationMapInput` via:
//
//	CustomerGatewayAssociationMap{ "key": CustomerGatewayAssociationArgs{...} }
type CustomerGatewayAssociationMapInput interface {
	pulumi.Input

	ToCustomerGatewayAssociationMapOutput() CustomerGatewayAssociationMapOutput
	ToCustomerGatewayAssociationMapOutputWithContext(context.Context) CustomerGatewayAssociationMapOutput
}

type CustomerGatewayAssociationMap map[string]CustomerGatewayAssociationInput

func (CustomerGatewayAssociationMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*CustomerGatewayAssociation)(nil)).Elem()
}

func (i CustomerGatewayAssociationMap) ToCustomerGatewayAssociationMapOutput() CustomerGatewayAssociationMapOutput {
	return i.ToCustomerGatewayAssociationMapOutputWithContext(context.Background())
}

func (i CustomerGatewayAssociationMap) ToCustomerGatewayAssociationMapOutputWithContext(ctx context.Context) CustomerGatewayAssociationMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CustomerGatewayAssociationMapOutput)
}

type CustomerGatewayAssociationOutput struct{ *pulumi.OutputState }

func (CustomerGatewayAssociationOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**CustomerGatewayAssociation)(nil)).Elem()
}

func (o CustomerGatewayAssociationOutput) ToCustomerGatewayAssociationOutput() CustomerGatewayAssociationOutput {
	return o
}

func (o CustomerGatewayAssociationOutput) ToCustomerGatewayAssociationOutputWithContext(ctx context.Context) CustomerGatewayAssociationOutput {
	return o
}

// The Amazon Resource Name (ARN) of the customer gateway.
func (o CustomerGatewayAssociationOutput) CustomerGatewayArn() pulumi.StringOutput {
	return o.ApplyT(func(v *CustomerGatewayAssociation) pulumi.StringOutput { return v.CustomerGatewayArn }).(pulumi.StringOutput)
}

// The ID of the device.
func (o CustomerGatewayAssociationOutput) DeviceId() pulumi.StringOutput {
	return o.ApplyT(func(v *CustomerGatewayAssociation) pulumi.StringOutput { return v.DeviceId }).(pulumi.StringOutput)
}

// The ID of the global network.
func (o CustomerGatewayAssociationOutput) GlobalNetworkId() pulumi.StringOutput {
	return o.ApplyT(func(v *CustomerGatewayAssociation) pulumi.StringOutput { return v.GlobalNetworkId }).(pulumi.StringOutput)
}

// The ID of the link.
func (o CustomerGatewayAssociationOutput) LinkId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *CustomerGatewayAssociation) pulumi.StringPtrOutput { return v.LinkId }).(pulumi.StringPtrOutput)
}

type CustomerGatewayAssociationArrayOutput struct{ *pulumi.OutputState }

func (CustomerGatewayAssociationArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*CustomerGatewayAssociation)(nil)).Elem()
}

func (o CustomerGatewayAssociationArrayOutput) ToCustomerGatewayAssociationArrayOutput() CustomerGatewayAssociationArrayOutput {
	return o
}

func (o CustomerGatewayAssociationArrayOutput) ToCustomerGatewayAssociationArrayOutputWithContext(ctx context.Context) CustomerGatewayAssociationArrayOutput {
	return o
}

func (o CustomerGatewayAssociationArrayOutput) Index(i pulumi.IntInput) CustomerGatewayAssociationOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *CustomerGatewayAssociation {
		return vs[0].([]*CustomerGatewayAssociation)[vs[1].(int)]
	}).(CustomerGatewayAssociationOutput)
}

type CustomerGatewayAssociationMapOutput struct{ *pulumi.OutputState }

func (CustomerGatewayAssociationMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*CustomerGatewayAssociation)(nil)).Elem()
}

func (o CustomerGatewayAssociationMapOutput) ToCustomerGatewayAssociationMapOutput() CustomerGatewayAssociationMapOutput {
	return o
}

func (o CustomerGatewayAssociationMapOutput) ToCustomerGatewayAssociationMapOutputWithContext(ctx context.Context) CustomerGatewayAssociationMapOutput {
	return o
}

func (o CustomerGatewayAssociationMapOutput) MapIndex(k pulumi.StringInput) CustomerGatewayAssociationOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *CustomerGatewayAssociation {
		return vs[0].(map[string]*CustomerGatewayAssociation)[vs[1].(string)]
	}).(CustomerGatewayAssociationOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*CustomerGatewayAssociationInput)(nil)).Elem(), &CustomerGatewayAssociation{})
	pulumi.RegisterInputType(reflect.TypeOf((*CustomerGatewayAssociationArrayInput)(nil)).Elem(), CustomerGatewayAssociationArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*CustomerGatewayAssociationMapInput)(nil)).Elem(), CustomerGatewayAssociationMap{})
	pulumi.RegisterOutputType(CustomerGatewayAssociationOutput{})
	pulumi.RegisterOutputType(CustomerGatewayAssociationArrayOutput{})
	pulumi.RegisterOutputType(CustomerGatewayAssociationMapOutput{})
}

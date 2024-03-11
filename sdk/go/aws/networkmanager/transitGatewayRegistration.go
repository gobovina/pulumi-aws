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

// Registers a transit gateway to a global network. The transit gateway can be in any AWS Region,
// but it must be owned by the same AWS account that owns the global network.
// You cannot register a transit gateway in more than one global network.
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
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/networkmanager"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			example, err := networkmanager.NewGlobalNetwork(ctx, "example", &networkmanager.GlobalNetworkArgs{
//				Description: pulumi.String("example"),
//			})
//			if err != nil {
//				return err
//			}
//			exampleTransitGateway, err := ec2transitgateway.NewTransitGateway(ctx, "example", nil)
//			if err != nil {
//				return err
//			}
//			_, err = networkmanager.NewTransitGatewayRegistration(ctx, "example", &networkmanager.TransitGatewayRegistrationArgs{
//				GlobalNetworkId:   example.ID(),
//				TransitGatewayArn: exampleTransitGateway.Arn,
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
// Using `pulumi import`, import `aws_networkmanager_transit_gateway_registration` using the global network ID and transit gateway ARN. For example:
//
// ```sh
// $ pulumi import aws:networkmanager/transitGatewayRegistration:TransitGatewayRegistration example global-network-0d47f6t230mz46dy4,arn:aws:ec2:us-west-2:123456789012:transit-gateway/tgw-123abc05e04123abc
// ```
type TransitGatewayRegistration struct {
	pulumi.CustomResourceState

	// The ID of the Global Network to register to.
	GlobalNetworkId pulumi.StringOutput `pulumi:"globalNetworkId"`
	// The ARN of the Transit Gateway to register.
	TransitGatewayArn pulumi.StringOutput `pulumi:"transitGatewayArn"`
}

// NewTransitGatewayRegistration registers a new resource with the given unique name, arguments, and options.
func NewTransitGatewayRegistration(ctx *pulumi.Context,
	name string, args *TransitGatewayRegistrationArgs, opts ...pulumi.ResourceOption) (*TransitGatewayRegistration, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.GlobalNetworkId == nil {
		return nil, errors.New("invalid value for required argument 'GlobalNetworkId'")
	}
	if args.TransitGatewayArn == nil {
		return nil, errors.New("invalid value for required argument 'TransitGatewayArn'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource TransitGatewayRegistration
	err := ctx.RegisterResource("aws:networkmanager/transitGatewayRegistration:TransitGatewayRegistration", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetTransitGatewayRegistration gets an existing TransitGatewayRegistration resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetTransitGatewayRegistration(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *TransitGatewayRegistrationState, opts ...pulumi.ResourceOption) (*TransitGatewayRegistration, error) {
	var resource TransitGatewayRegistration
	err := ctx.ReadResource("aws:networkmanager/transitGatewayRegistration:TransitGatewayRegistration", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering TransitGatewayRegistration resources.
type transitGatewayRegistrationState struct {
	// The ID of the Global Network to register to.
	GlobalNetworkId *string `pulumi:"globalNetworkId"`
	// The ARN of the Transit Gateway to register.
	TransitGatewayArn *string `pulumi:"transitGatewayArn"`
}

type TransitGatewayRegistrationState struct {
	// The ID of the Global Network to register to.
	GlobalNetworkId pulumi.StringPtrInput
	// The ARN of the Transit Gateway to register.
	TransitGatewayArn pulumi.StringPtrInput
}

func (TransitGatewayRegistrationState) ElementType() reflect.Type {
	return reflect.TypeOf((*transitGatewayRegistrationState)(nil)).Elem()
}

type transitGatewayRegistrationArgs struct {
	// The ID of the Global Network to register to.
	GlobalNetworkId string `pulumi:"globalNetworkId"`
	// The ARN of the Transit Gateway to register.
	TransitGatewayArn string `pulumi:"transitGatewayArn"`
}

// The set of arguments for constructing a TransitGatewayRegistration resource.
type TransitGatewayRegistrationArgs struct {
	// The ID of the Global Network to register to.
	GlobalNetworkId pulumi.StringInput
	// The ARN of the Transit Gateway to register.
	TransitGatewayArn pulumi.StringInput
}

func (TransitGatewayRegistrationArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*transitGatewayRegistrationArgs)(nil)).Elem()
}

type TransitGatewayRegistrationInput interface {
	pulumi.Input

	ToTransitGatewayRegistrationOutput() TransitGatewayRegistrationOutput
	ToTransitGatewayRegistrationOutputWithContext(ctx context.Context) TransitGatewayRegistrationOutput
}

func (*TransitGatewayRegistration) ElementType() reflect.Type {
	return reflect.TypeOf((**TransitGatewayRegistration)(nil)).Elem()
}

func (i *TransitGatewayRegistration) ToTransitGatewayRegistrationOutput() TransitGatewayRegistrationOutput {
	return i.ToTransitGatewayRegistrationOutputWithContext(context.Background())
}

func (i *TransitGatewayRegistration) ToTransitGatewayRegistrationOutputWithContext(ctx context.Context) TransitGatewayRegistrationOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TransitGatewayRegistrationOutput)
}

// TransitGatewayRegistrationArrayInput is an input type that accepts TransitGatewayRegistrationArray and TransitGatewayRegistrationArrayOutput values.
// You can construct a concrete instance of `TransitGatewayRegistrationArrayInput` via:
//
//	TransitGatewayRegistrationArray{ TransitGatewayRegistrationArgs{...} }
type TransitGatewayRegistrationArrayInput interface {
	pulumi.Input

	ToTransitGatewayRegistrationArrayOutput() TransitGatewayRegistrationArrayOutput
	ToTransitGatewayRegistrationArrayOutputWithContext(context.Context) TransitGatewayRegistrationArrayOutput
}

type TransitGatewayRegistrationArray []TransitGatewayRegistrationInput

func (TransitGatewayRegistrationArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*TransitGatewayRegistration)(nil)).Elem()
}

func (i TransitGatewayRegistrationArray) ToTransitGatewayRegistrationArrayOutput() TransitGatewayRegistrationArrayOutput {
	return i.ToTransitGatewayRegistrationArrayOutputWithContext(context.Background())
}

func (i TransitGatewayRegistrationArray) ToTransitGatewayRegistrationArrayOutputWithContext(ctx context.Context) TransitGatewayRegistrationArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TransitGatewayRegistrationArrayOutput)
}

// TransitGatewayRegistrationMapInput is an input type that accepts TransitGatewayRegistrationMap and TransitGatewayRegistrationMapOutput values.
// You can construct a concrete instance of `TransitGatewayRegistrationMapInput` via:
//
//	TransitGatewayRegistrationMap{ "key": TransitGatewayRegistrationArgs{...} }
type TransitGatewayRegistrationMapInput interface {
	pulumi.Input

	ToTransitGatewayRegistrationMapOutput() TransitGatewayRegistrationMapOutput
	ToTransitGatewayRegistrationMapOutputWithContext(context.Context) TransitGatewayRegistrationMapOutput
}

type TransitGatewayRegistrationMap map[string]TransitGatewayRegistrationInput

func (TransitGatewayRegistrationMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*TransitGatewayRegistration)(nil)).Elem()
}

func (i TransitGatewayRegistrationMap) ToTransitGatewayRegistrationMapOutput() TransitGatewayRegistrationMapOutput {
	return i.ToTransitGatewayRegistrationMapOutputWithContext(context.Background())
}

func (i TransitGatewayRegistrationMap) ToTransitGatewayRegistrationMapOutputWithContext(ctx context.Context) TransitGatewayRegistrationMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TransitGatewayRegistrationMapOutput)
}

type TransitGatewayRegistrationOutput struct{ *pulumi.OutputState }

func (TransitGatewayRegistrationOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**TransitGatewayRegistration)(nil)).Elem()
}

func (o TransitGatewayRegistrationOutput) ToTransitGatewayRegistrationOutput() TransitGatewayRegistrationOutput {
	return o
}

func (o TransitGatewayRegistrationOutput) ToTransitGatewayRegistrationOutputWithContext(ctx context.Context) TransitGatewayRegistrationOutput {
	return o
}

// The ID of the Global Network to register to.
func (o TransitGatewayRegistrationOutput) GlobalNetworkId() pulumi.StringOutput {
	return o.ApplyT(func(v *TransitGatewayRegistration) pulumi.StringOutput { return v.GlobalNetworkId }).(pulumi.StringOutput)
}

// The ARN of the Transit Gateway to register.
func (o TransitGatewayRegistrationOutput) TransitGatewayArn() pulumi.StringOutput {
	return o.ApplyT(func(v *TransitGatewayRegistration) pulumi.StringOutput { return v.TransitGatewayArn }).(pulumi.StringOutput)
}

type TransitGatewayRegistrationArrayOutput struct{ *pulumi.OutputState }

func (TransitGatewayRegistrationArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*TransitGatewayRegistration)(nil)).Elem()
}

func (o TransitGatewayRegistrationArrayOutput) ToTransitGatewayRegistrationArrayOutput() TransitGatewayRegistrationArrayOutput {
	return o
}

func (o TransitGatewayRegistrationArrayOutput) ToTransitGatewayRegistrationArrayOutputWithContext(ctx context.Context) TransitGatewayRegistrationArrayOutput {
	return o
}

func (o TransitGatewayRegistrationArrayOutput) Index(i pulumi.IntInput) TransitGatewayRegistrationOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *TransitGatewayRegistration {
		return vs[0].([]*TransitGatewayRegistration)[vs[1].(int)]
	}).(TransitGatewayRegistrationOutput)
}

type TransitGatewayRegistrationMapOutput struct{ *pulumi.OutputState }

func (TransitGatewayRegistrationMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*TransitGatewayRegistration)(nil)).Elem()
}

func (o TransitGatewayRegistrationMapOutput) ToTransitGatewayRegistrationMapOutput() TransitGatewayRegistrationMapOutput {
	return o
}

func (o TransitGatewayRegistrationMapOutput) ToTransitGatewayRegistrationMapOutputWithContext(ctx context.Context) TransitGatewayRegistrationMapOutput {
	return o
}

func (o TransitGatewayRegistrationMapOutput) MapIndex(k pulumi.StringInput) TransitGatewayRegistrationOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *TransitGatewayRegistration {
		return vs[0].(map[string]*TransitGatewayRegistration)[vs[1].(string)]
	}).(TransitGatewayRegistrationOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*TransitGatewayRegistrationInput)(nil)).Elem(), &TransitGatewayRegistration{})
	pulumi.RegisterInputType(reflect.TypeOf((*TransitGatewayRegistrationArrayInput)(nil)).Elem(), TransitGatewayRegistrationArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*TransitGatewayRegistrationMapInput)(nil)).Elem(), TransitGatewayRegistrationMap{})
	pulumi.RegisterOutputType(TransitGatewayRegistrationOutput{})
	pulumi.RegisterOutputType(TransitGatewayRegistrationArrayOutput{})
	pulumi.RegisterOutputType(TransitGatewayRegistrationMapOutput{})
}

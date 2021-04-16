// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package ec2transitgateway

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages an EC2 Transit Gateway Route Table.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-aws/sdk/v4/go/aws/ec2transitgateway"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := ec2transitgateway.NewRouteTable(ctx, "example", &ec2transitgateway.RouteTableArgs{
// 			TransitGatewayId: pulumi.Any(aws_ec2_transit_gateway.Example.Id),
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
// `aws_ec2_transit_gateway_route_table` can be imported by using the EC2 Transit Gateway Route Table identifier, e.g.
//
// ```sh
//  $ pulumi import aws:ec2transitgateway/routeTable:RouteTable example tgw-rtb-12345678
// ```
type RouteTable struct {
	pulumi.CustomResourceState

	// EC2 Transit Gateway Route Table Amazon Resource Name (ARN).
	Arn pulumi.StringOutput `pulumi:"arn"`
	// Boolean whether this is the default association route table for the EC2 Transit Gateway.
	DefaultAssociationRouteTable pulumi.BoolOutput `pulumi:"defaultAssociationRouteTable"`
	// Boolean whether this is the default propagation route table for the EC2 Transit Gateway.
	DefaultPropagationRouteTable pulumi.BoolOutput `pulumi:"defaultPropagationRouteTable"`
	// Key-value tags for the EC2 Transit Gateway Route Table.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// Identifier of EC2 Transit Gateway.
	TransitGatewayId pulumi.StringOutput `pulumi:"transitGatewayId"`
}

// NewRouteTable registers a new resource with the given unique name, arguments, and options.
func NewRouteTable(ctx *pulumi.Context,
	name string, args *RouteTableArgs, opts ...pulumi.ResourceOption) (*RouteTable, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.TransitGatewayId == nil {
		return nil, errors.New("invalid value for required argument 'TransitGatewayId'")
	}
	var resource RouteTable
	err := ctx.RegisterResource("aws:ec2transitgateway/routeTable:RouteTable", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetRouteTable gets an existing RouteTable resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetRouteTable(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *RouteTableState, opts ...pulumi.ResourceOption) (*RouteTable, error) {
	var resource RouteTable
	err := ctx.ReadResource("aws:ec2transitgateway/routeTable:RouteTable", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering RouteTable resources.
type routeTableState struct {
	// EC2 Transit Gateway Route Table Amazon Resource Name (ARN).
	Arn *string `pulumi:"arn"`
	// Boolean whether this is the default association route table for the EC2 Transit Gateway.
	DefaultAssociationRouteTable *bool `pulumi:"defaultAssociationRouteTable"`
	// Boolean whether this is the default propagation route table for the EC2 Transit Gateway.
	DefaultPropagationRouteTable *bool `pulumi:"defaultPropagationRouteTable"`
	// Key-value tags for the EC2 Transit Gateway Route Table.
	Tags map[string]string `pulumi:"tags"`
	// Identifier of EC2 Transit Gateway.
	TransitGatewayId *string `pulumi:"transitGatewayId"`
}

type RouteTableState struct {
	// EC2 Transit Gateway Route Table Amazon Resource Name (ARN).
	Arn pulumi.StringPtrInput
	// Boolean whether this is the default association route table for the EC2 Transit Gateway.
	DefaultAssociationRouteTable pulumi.BoolPtrInput
	// Boolean whether this is the default propagation route table for the EC2 Transit Gateway.
	DefaultPropagationRouteTable pulumi.BoolPtrInput
	// Key-value tags for the EC2 Transit Gateway Route Table.
	Tags pulumi.StringMapInput
	// Identifier of EC2 Transit Gateway.
	TransitGatewayId pulumi.StringPtrInput
}

func (RouteTableState) ElementType() reflect.Type {
	return reflect.TypeOf((*routeTableState)(nil)).Elem()
}

type routeTableArgs struct {
	// Key-value tags for the EC2 Transit Gateway Route Table.
	Tags map[string]string `pulumi:"tags"`
	// Identifier of EC2 Transit Gateway.
	TransitGatewayId string `pulumi:"transitGatewayId"`
}

// The set of arguments for constructing a RouteTable resource.
type RouteTableArgs struct {
	// Key-value tags for the EC2 Transit Gateway Route Table.
	Tags pulumi.StringMapInput
	// Identifier of EC2 Transit Gateway.
	TransitGatewayId pulumi.StringInput
}

func (RouteTableArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*routeTableArgs)(nil)).Elem()
}

type RouteTableInput interface {
	pulumi.Input

	ToRouteTableOutput() RouteTableOutput
	ToRouteTableOutputWithContext(ctx context.Context) RouteTableOutput
}

func (*RouteTable) ElementType() reflect.Type {
	return reflect.TypeOf((*RouteTable)(nil))
}

func (i *RouteTable) ToRouteTableOutput() RouteTableOutput {
	return i.ToRouteTableOutputWithContext(context.Background())
}

func (i *RouteTable) ToRouteTableOutputWithContext(ctx context.Context) RouteTableOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RouteTableOutput)
}

func (i *RouteTable) ToRouteTablePtrOutput() RouteTablePtrOutput {
	return i.ToRouteTablePtrOutputWithContext(context.Background())
}

func (i *RouteTable) ToRouteTablePtrOutputWithContext(ctx context.Context) RouteTablePtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RouteTablePtrOutput)
}

type RouteTablePtrInput interface {
	pulumi.Input

	ToRouteTablePtrOutput() RouteTablePtrOutput
	ToRouteTablePtrOutputWithContext(ctx context.Context) RouteTablePtrOutput
}

type routeTablePtrType RouteTableArgs

func (*routeTablePtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**RouteTable)(nil))
}

func (i *routeTablePtrType) ToRouteTablePtrOutput() RouteTablePtrOutput {
	return i.ToRouteTablePtrOutputWithContext(context.Background())
}

func (i *routeTablePtrType) ToRouteTablePtrOutputWithContext(ctx context.Context) RouteTablePtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RouteTablePtrOutput)
}

// RouteTableArrayInput is an input type that accepts RouteTableArray and RouteTableArrayOutput values.
// You can construct a concrete instance of `RouteTableArrayInput` via:
//
//          RouteTableArray{ RouteTableArgs{...} }
type RouteTableArrayInput interface {
	pulumi.Input

	ToRouteTableArrayOutput() RouteTableArrayOutput
	ToRouteTableArrayOutputWithContext(context.Context) RouteTableArrayOutput
}

type RouteTableArray []RouteTableInput

func (RouteTableArray) ElementType() reflect.Type {
	return reflect.TypeOf(([]*RouteTable)(nil))
}

func (i RouteTableArray) ToRouteTableArrayOutput() RouteTableArrayOutput {
	return i.ToRouteTableArrayOutputWithContext(context.Background())
}

func (i RouteTableArray) ToRouteTableArrayOutputWithContext(ctx context.Context) RouteTableArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RouteTableArrayOutput)
}

// RouteTableMapInput is an input type that accepts RouteTableMap and RouteTableMapOutput values.
// You can construct a concrete instance of `RouteTableMapInput` via:
//
//          RouteTableMap{ "key": RouteTableArgs{...} }
type RouteTableMapInput interface {
	pulumi.Input

	ToRouteTableMapOutput() RouteTableMapOutput
	ToRouteTableMapOutputWithContext(context.Context) RouteTableMapOutput
}

type RouteTableMap map[string]RouteTableInput

func (RouteTableMap) ElementType() reflect.Type {
	return reflect.TypeOf((map[string]*RouteTable)(nil))
}

func (i RouteTableMap) ToRouteTableMapOutput() RouteTableMapOutput {
	return i.ToRouteTableMapOutputWithContext(context.Background())
}

func (i RouteTableMap) ToRouteTableMapOutputWithContext(ctx context.Context) RouteTableMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RouteTableMapOutput)
}

type RouteTableOutput struct {
	*pulumi.OutputState
}

func (RouteTableOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*RouteTable)(nil))
}

func (o RouteTableOutput) ToRouteTableOutput() RouteTableOutput {
	return o
}

func (o RouteTableOutput) ToRouteTableOutputWithContext(ctx context.Context) RouteTableOutput {
	return o
}

func (o RouteTableOutput) ToRouteTablePtrOutput() RouteTablePtrOutput {
	return o.ToRouteTablePtrOutputWithContext(context.Background())
}

func (o RouteTableOutput) ToRouteTablePtrOutputWithContext(ctx context.Context) RouteTablePtrOutput {
	return o.ApplyT(func(v RouteTable) *RouteTable {
		return &v
	}).(RouteTablePtrOutput)
}

type RouteTablePtrOutput struct {
	*pulumi.OutputState
}

func (RouteTablePtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**RouteTable)(nil))
}

func (o RouteTablePtrOutput) ToRouteTablePtrOutput() RouteTablePtrOutput {
	return o
}

func (o RouteTablePtrOutput) ToRouteTablePtrOutputWithContext(ctx context.Context) RouteTablePtrOutput {
	return o
}

type RouteTableArrayOutput struct{ *pulumi.OutputState }

func (RouteTableArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]RouteTable)(nil))
}

func (o RouteTableArrayOutput) ToRouteTableArrayOutput() RouteTableArrayOutput {
	return o
}

func (o RouteTableArrayOutput) ToRouteTableArrayOutputWithContext(ctx context.Context) RouteTableArrayOutput {
	return o
}

func (o RouteTableArrayOutput) Index(i pulumi.IntInput) RouteTableOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) RouteTable {
		return vs[0].([]RouteTable)[vs[1].(int)]
	}).(RouteTableOutput)
}

type RouteTableMapOutput struct{ *pulumi.OutputState }

func (RouteTableMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]RouteTable)(nil))
}

func (o RouteTableMapOutput) ToRouteTableMapOutput() RouteTableMapOutput {
	return o
}

func (o RouteTableMapOutput) ToRouteTableMapOutputWithContext(ctx context.Context) RouteTableMapOutput {
	return o
}

func (o RouteTableMapOutput) MapIndex(k pulumi.StringInput) RouteTableOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) RouteTable {
		return vs[0].(map[string]RouteTable)[vs[1].(string)]
	}).(RouteTableOutput)
}

func init() {
	pulumi.RegisterOutputType(RouteTableOutput{})
	pulumi.RegisterOutputType(RouteTablePtrOutput{})
	pulumi.RegisterOutputType(RouteTableArrayOutput{})
	pulumi.RegisterOutputType(RouteTableMapOutput{})
}

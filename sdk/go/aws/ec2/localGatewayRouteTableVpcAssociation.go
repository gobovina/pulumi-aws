// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package ec2

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages an EC2 Local Gateway Route Table VPC Association. More information can be found in the [Outposts User Guide](https://docs.aws.amazon.com/outposts/latest/userguide/outposts-local-gateways.html#vpc-associations).
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-aws/sdk/v4/go/aws/ec2"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		opt0 := "arn:aws:outposts:us-west-2:123456789012:outpost/op-1234567890abcdef"
// 		exampleLocalGatewayRouteTable, err := ec2.GetLocalGatewayRouteTable(ctx, &ec2.GetLocalGatewayRouteTableArgs{
// 			OutpostArn: &opt0,
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		exampleVpc, err := ec2.NewVpc(ctx, "exampleVpc", &ec2.VpcArgs{
// 			CidrBlock: pulumi.String("10.0.0.0/16"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = ec2.NewLocalGatewayRouteTableVpcAssociation(ctx, "exampleLocalGatewayRouteTableVpcAssociation", &ec2.LocalGatewayRouteTableVpcAssociationArgs{
// 			LocalGatewayRouteTableId: pulumi.String(exampleLocalGatewayRouteTable.Id),
// 			VpcId:                    exampleVpc.ID(),
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
// `aws_ec2_local_gateway_route_table_vpc_association` can be imported by using the Local Gateway Route Table VPC Association identifier, e.g.
//
// ```sh
//  $ pulumi import aws:ec2/localGatewayRouteTableVpcAssociation:LocalGatewayRouteTableVpcAssociation example lgw-vpc-assoc-1234567890abcdef
// ```
type LocalGatewayRouteTableVpcAssociation struct {
	pulumi.CustomResourceState

	LocalGatewayId pulumi.StringOutput `pulumi:"localGatewayId"`
	// Identifier of EC2 Local Gateway Route Table.
	LocalGatewayRouteTableId pulumi.StringOutput `pulumi:"localGatewayRouteTableId"`
	// Key-value map of resource tags.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// Identifier of EC2 VPC.
	VpcId pulumi.StringOutput `pulumi:"vpcId"`
}

// NewLocalGatewayRouteTableVpcAssociation registers a new resource with the given unique name, arguments, and options.
func NewLocalGatewayRouteTableVpcAssociation(ctx *pulumi.Context,
	name string, args *LocalGatewayRouteTableVpcAssociationArgs, opts ...pulumi.ResourceOption) (*LocalGatewayRouteTableVpcAssociation, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.LocalGatewayRouteTableId == nil {
		return nil, errors.New("invalid value for required argument 'LocalGatewayRouteTableId'")
	}
	if args.VpcId == nil {
		return nil, errors.New("invalid value for required argument 'VpcId'")
	}
	var resource LocalGatewayRouteTableVpcAssociation
	err := ctx.RegisterResource("aws:ec2/localGatewayRouteTableVpcAssociation:LocalGatewayRouteTableVpcAssociation", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetLocalGatewayRouteTableVpcAssociation gets an existing LocalGatewayRouteTableVpcAssociation resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetLocalGatewayRouteTableVpcAssociation(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *LocalGatewayRouteTableVpcAssociationState, opts ...pulumi.ResourceOption) (*LocalGatewayRouteTableVpcAssociation, error) {
	var resource LocalGatewayRouteTableVpcAssociation
	err := ctx.ReadResource("aws:ec2/localGatewayRouteTableVpcAssociation:LocalGatewayRouteTableVpcAssociation", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering LocalGatewayRouteTableVpcAssociation resources.
type localGatewayRouteTableVpcAssociationState struct {
	LocalGatewayId *string `pulumi:"localGatewayId"`
	// Identifier of EC2 Local Gateway Route Table.
	LocalGatewayRouteTableId *string `pulumi:"localGatewayRouteTableId"`
	// Key-value map of resource tags.
	Tags map[string]string `pulumi:"tags"`
	// Identifier of EC2 VPC.
	VpcId *string `pulumi:"vpcId"`
}

type LocalGatewayRouteTableVpcAssociationState struct {
	LocalGatewayId pulumi.StringPtrInput
	// Identifier of EC2 Local Gateway Route Table.
	LocalGatewayRouteTableId pulumi.StringPtrInput
	// Key-value map of resource tags.
	Tags pulumi.StringMapInput
	// Identifier of EC2 VPC.
	VpcId pulumi.StringPtrInput
}

func (LocalGatewayRouteTableVpcAssociationState) ElementType() reflect.Type {
	return reflect.TypeOf((*localGatewayRouteTableVpcAssociationState)(nil)).Elem()
}

type localGatewayRouteTableVpcAssociationArgs struct {
	// Identifier of EC2 Local Gateway Route Table.
	LocalGatewayRouteTableId string `pulumi:"localGatewayRouteTableId"`
	// Key-value map of resource tags.
	Tags map[string]string `pulumi:"tags"`
	// Identifier of EC2 VPC.
	VpcId string `pulumi:"vpcId"`
}

// The set of arguments for constructing a LocalGatewayRouteTableVpcAssociation resource.
type LocalGatewayRouteTableVpcAssociationArgs struct {
	// Identifier of EC2 Local Gateway Route Table.
	LocalGatewayRouteTableId pulumi.StringInput
	// Key-value map of resource tags.
	Tags pulumi.StringMapInput
	// Identifier of EC2 VPC.
	VpcId pulumi.StringInput
}

func (LocalGatewayRouteTableVpcAssociationArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*localGatewayRouteTableVpcAssociationArgs)(nil)).Elem()
}

type LocalGatewayRouteTableVpcAssociationInput interface {
	pulumi.Input

	ToLocalGatewayRouteTableVpcAssociationOutput() LocalGatewayRouteTableVpcAssociationOutput
	ToLocalGatewayRouteTableVpcAssociationOutputWithContext(ctx context.Context) LocalGatewayRouteTableVpcAssociationOutput
}

func (*LocalGatewayRouteTableVpcAssociation) ElementType() reflect.Type {
	return reflect.TypeOf((*LocalGatewayRouteTableVpcAssociation)(nil))
}

func (i *LocalGatewayRouteTableVpcAssociation) ToLocalGatewayRouteTableVpcAssociationOutput() LocalGatewayRouteTableVpcAssociationOutput {
	return i.ToLocalGatewayRouteTableVpcAssociationOutputWithContext(context.Background())
}

func (i *LocalGatewayRouteTableVpcAssociation) ToLocalGatewayRouteTableVpcAssociationOutputWithContext(ctx context.Context) LocalGatewayRouteTableVpcAssociationOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LocalGatewayRouteTableVpcAssociationOutput)
}

func (i *LocalGatewayRouteTableVpcAssociation) ToLocalGatewayRouteTableVpcAssociationPtrOutput() LocalGatewayRouteTableVpcAssociationPtrOutput {
	return i.ToLocalGatewayRouteTableVpcAssociationPtrOutputWithContext(context.Background())
}

func (i *LocalGatewayRouteTableVpcAssociation) ToLocalGatewayRouteTableVpcAssociationPtrOutputWithContext(ctx context.Context) LocalGatewayRouteTableVpcAssociationPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LocalGatewayRouteTableVpcAssociationPtrOutput)
}

type LocalGatewayRouteTableVpcAssociationPtrInput interface {
	pulumi.Input

	ToLocalGatewayRouteTableVpcAssociationPtrOutput() LocalGatewayRouteTableVpcAssociationPtrOutput
	ToLocalGatewayRouteTableVpcAssociationPtrOutputWithContext(ctx context.Context) LocalGatewayRouteTableVpcAssociationPtrOutput
}

type localGatewayRouteTableVpcAssociationPtrType LocalGatewayRouteTableVpcAssociationArgs

func (*localGatewayRouteTableVpcAssociationPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**LocalGatewayRouteTableVpcAssociation)(nil))
}

func (i *localGatewayRouteTableVpcAssociationPtrType) ToLocalGatewayRouteTableVpcAssociationPtrOutput() LocalGatewayRouteTableVpcAssociationPtrOutput {
	return i.ToLocalGatewayRouteTableVpcAssociationPtrOutputWithContext(context.Background())
}

func (i *localGatewayRouteTableVpcAssociationPtrType) ToLocalGatewayRouteTableVpcAssociationPtrOutputWithContext(ctx context.Context) LocalGatewayRouteTableVpcAssociationPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LocalGatewayRouteTableVpcAssociationPtrOutput)
}

// LocalGatewayRouteTableVpcAssociationArrayInput is an input type that accepts LocalGatewayRouteTableVpcAssociationArray and LocalGatewayRouteTableVpcAssociationArrayOutput values.
// You can construct a concrete instance of `LocalGatewayRouteTableVpcAssociationArrayInput` via:
//
//          LocalGatewayRouteTableVpcAssociationArray{ LocalGatewayRouteTableVpcAssociationArgs{...} }
type LocalGatewayRouteTableVpcAssociationArrayInput interface {
	pulumi.Input

	ToLocalGatewayRouteTableVpcAssociationArrayOutput() LocalGatewayRouteTableVpcAssociationArrayOutput
	ToLocalGatewayRouteTableVpcAssociationArrayOutputWithContext(context.Context) LocalGatewayRouteTableVpcAssociationArrayOutput
}

type LocalGatewayRouteTableVpcAssociationArray []LocalGatewayRouteTableVpcAssociationInput

func (LocalGatewayRouteTableVpcAssociationArray) ElementType() reflect.Type {
	return reflect.TypeOf(([]*LocalGatewayRouteTableVpcAssociation)(nil))
}

func (i LocalGatewayRouteTableVpcAssociationArray) ToLocalGatewayRouteTableVpcAssociationArrayOutput() LocalGatewayRouteTableVpcAssociationArrayOutput {
	return i.ToLocalGatewayRouteTableVpcAssociationArrayOutputWithContext(context.Background())
}

func (i LocalGatewayRouteTableVpcAssociationArray) ToLocalGatewayRouteTableVpcAssociationArrayOutputWithContext(ctx context.Context) LocalGatewayRouteTableVpcAssociationArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LocalGatewayRouteTableVpcAssociationArrayOutput)
}

// LocalGatewayRouteTableVpcAssociationMapInput is an input type that accepts LocalGatewayRouteTableVpcAssociationMap and LocalGatewayRouteTableVpcAssociationMapOutput values.
// You can construct a concrete instance of `LocalGatewayRouteTableVpcAssociationMapInput` via:
//
//          LocalGatewayRouteTableVpcAssociationMap{ "key": LocalGatewayRouteTableVpcAssociationArgs{...} }
type LocalGatewayRouteTableVpcAssociationMapInput interface {
	pulumi.Input

	ToLocalGatewayRouteTableVpcAssociationMapOutput() LocalGatewayRouteTableVpcAssociationMapOutput
	ToLocalGatewayRouteTableVpcAssociationMapOutputWithContext(context.Context) LocalGatewayRouteTableVpcAssociationMapOutput
}

type LocalGatewayRouteTableVpcAssociationMap map[string]LocalGatewayRouteTableVpcAssociationInput

func (LocalGatewayRouteTableVpcAssociationMap) ElementType() reflect.Type {
	return reflect.TypeOf((map[string]*LocalGatewayRouteTableVpcAssociation)(nil))
}

func (i LocalGatewayRouteTableVpcAssociationMap) ToLocalGatewayRouteTableVpcAssociationMapOutput() LocalGatewayRouteTableVpcAssociationMapOutput {
	return i.ToLocalGatewayRouteTableVpcAssociationMapOutputWithContext(context.Background())
}

func (i LocalGatewayRouteTableVpcAssociationMap) ToLocalGatewayRouteTableVpcAssociationMapOutputWithContext(ctx context.Context) LocalGatewayRouteTableVpcAssociationMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LocalGatewayRouteTableVpcAssociationMapOutput)
}

type LocalGatewayRouteTableVpcAssociationOutput struct {
	*pulumi.OutputState
}

func (LocalGatewayRouteTableVpcAssociationOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LocalGatewayRouteTableVpcAssociation)(nil))
}

func (o LocalGatewayRouteTableVpcAssociationOutput) ToLocalGatewayRouteTableVpcAssociationOutput() LocalGatewayRouteTableVpcAssociationOutput {
	return o
}

func (o LocalGatewayRouteTableVpcAssociationOutput) ToLocalGatewayRouteTableVpcAssociationOutputWithContext(ctx context.Context) LocalGatewayRouteTableVpcAssociationOutput {
	return o
}

func (o LocalGatewayRouteTableVpcAssociationOutput) ToLocalGatewayRouteTableVpcAssociationPtrOutput() LocalGatewayRouteTableVpcAssociationPtrOutput {
	return o.ToLocalGatewayRouteTableVpcAssociationPtrOutputWithContext(context.Background())
}

func (o LocalGatewayRouteTableVpcAssociationOutput) ToLocalGatewayRouteTableVpcAssociationPtrOutputWithContext(ctx context.Context) LocalGatewayRouteTableVpcAssociationPtrOutput {
	return o.ApplyT(func(v LocalGatewayRouteTableVpcAssociation) *LocalGatewayRouteTableVpcAssociation {
		return &v
	}).(LocalGatewayRouteTableVpcAssociationPtrOutput)
}

type LocalGatewayRouteTableVpcAssociationPtrOutput struct {
	*pulumi.OutputState
}

func (LocalGatewayRouteTableVpcAssociationPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**LocalGatewayRouteTableVpcAssociation)(nil))
}

func (o LocalGatewayRouteTableVpcAssociationPtrOutput) ToLocalGatewayRouteTableVpcAssociationPtrOutput() LocalGatewayRouteTableVpcAssociationPtrOutput {
	return o
}

func (o LocalGatewayRouteTableVpcAssociationPtrOutput) ToLocalGatewayRouteTableVpcAssociationPtrOutputWithContext(ctx context.Context) LocalGatewayRouteTableVpcAssociationPtrOutput {
	return o
}

type LocalGatewayRouteTableVpcAssociationArrayOutput struct{ *pulumi.OutputState }

func (LocalGatewayRouteTableVpcAssociationArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]LocalGatewayRouteTableVpcAssociation)(nil))
}

func (o LocalGatewayRouteTableVpcAssociationArrayOutput) ToLocalGatewayRouteTableVpcAssociationArrayOutput() LocalGatewayRouteTableVpcAssociationArrayOutput {
	return o
}

func (o LocalGatewayRouteTableVpcAssociationArrayOutput) ToLocalGatewayRouteTableVpcAssociationArrayOutputWithContext(ctx context.Context) LocalGatewayRouteTableVpcAssociationArrayOutput {
	return o
}

func (o LocalGatewayRouteTableVpcAssociationArrayOutput) Index(i pulumi.IntInput) LocalGatewayRouteTableVpcAssociationOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) LocalGatewayRouteTableVpcAssociation {
		return vs[0].([]LocalGatewayRouteTableVpcAssociation)[vs[1].(int)]
	}).(LocalGatewayRouteTableVpcAssociationOutput)
}

type LocalGatewayRouteTableVpcAssociationMapOutput struct{ *pulumi.OutputState }

func (LocalGatewayRouteTableVpcAssociationMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]LocalGatewayRouteTableVpcAssociation)(nil))
}

func (o LocalGatewayRouteTableVpcAssociationMapOutput) ToLocalGatewayRouteTableVpcAssociationMapOutput() LocalGatewayRouteTableVpcAssociationMapOutput {
	return o
}

func (o LocalGatewayRouteTableVpcAssociationMapOutput) ToLocalGatewayRouteTableVpcAssociationMapOutputWithContext(ctx context.Context) LocalGatewayRouteTableVpcAssociationMapOutput {
	return o
}

func (o LocalGatewayRouteTableVpcAssociationMapOutput) MapIndex(k pulumi.StringInput) LocalGatewayRouteTableVpcAssociationOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) LocalGatewayRouteTableVpcAssociation {
		return vs[0].(map[string]LocalGatewayRouteTableVpcAssociation)[vs[1].(string)]
	}).(LocalGatewayRouteTableVpcAssociationOutput)
}

func init() {
	pulumi.RegisterOutputType(LocalGatewayRouteTableVpcAssociationOutput{})
	pulumi.RegisterOutputType(LocalGatewayRouteTableVpcAssociationPtrOutput{})
	pulumi.RegisterOutputType(LocalGatewayRouteTableVpcAssociationArrayOutput{})
	pulumi.RegisterOutputType(LocalGatewayRouteTableVpcAssociationMapOutput{})
}

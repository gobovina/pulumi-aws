// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package ec2transitgateway

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides information for multiple EC2 Transit Gateway Route Table Associations, such as their identifiers.
//
// ## Example Usage
//
// ### By Transit Gateway Identifier
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
//			_, err := ec2transitgateway.GetRouteTableAssociations(ctx, &ec2transitgateway.GetRouteTableAssociationsArgs{
//				TransitGatewayRouteTableId: exampleAwsEc2TransitGatewayRouteTable.Id,
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// <!--End PulumiCodeChooser -->
func GetRouteTableAssociations(ctx *pulumi.Context, args *GetRouteTableAssociationsArgs, opts ...pulumi.InvokeOption) (*GetRouteTableAssociationsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetRouteTableAssociationsResult
	err := ctx.Invoke("aws:ec2transitgateway/getRouteTableAssociations:getRouteTableAssociations", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getRouteTableAssociations.
type GetRouteTableAssociationsArgs struct {
	// Custom filter block as described below.
	//
	// More complex filters can be expressed using one or more `filter` sub-blocks,
	// which take the following arguments:
	Filters []GetRouteTableAssociationsFilter `pulumi:"filters"`
	// Identifier of EC2 Transit Gateway Route Table.
	//
	// The following arguments are optional:
	TransitGatewayRouteTableId string `pulumi:"transitGatewayRouteTableId"`
}

// A collection of values returned by getRouteTableAssociations.
type GetRouteTableAssociationsResult struct {
	Filters []GetRouteTableAssociationsFilter `pulumi:"filters"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Set of Transit Gateway Route Table Association identifiers.
	Ids                        []string `pulumi:"ids"`
	TransitGatewayRouteTableId string   `pulumi:"transitGatewayRouteTableId"`
}

func GetRouteTableAssociationsOutput(ctx *pulumi.Context, args GetRouteTableAssociationsOutputArgs, opts ...pulumi.InvokeOption) GetRouteTableAssociationsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetRouteTableAssociationsResult, error) {
			args := v.(GetRouteTableAssociationsArgs)
			r, err := GetRouteTableAssociations(ctx, &args, opts...)
			var s GetRouteTableAssociationsResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetRouteTableAssociationsResultOutput)
}

// A collection of arguments for invoking getRouteTableAssociations.
type GetRouteTableAssociationsOutputArgs struct {
	// Custom filter block as described below.
	//
	// More complex filters can be expressed using one or more `filter` sub-blocks,
	// which take the following arguments:
	Filters GetRouteTableAssociationsFilterArrayInput `pulumi:"filters"`
	// Identifier of EC2 Transit Gateway Route Table.
	//
	// The following arguments are optional:
	TransitGatewayRouteTableId pulumi.StringInput `pulumi:"transitGatewayRouteTableId"`
}

func (GetRouteTableAssociationsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetRouteTableAssociationsArgs)(nil)).Elem()
}

// A collection of values returned by getRouteTableAssociations.
type GetRouteTableAssociationsResultOutput struct{ *pulumi.OutputState }

func (GetRouteTableAssociationsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetRouteTableAssociationsResult)(nil)).Elem()
}

func (o GetRouteTableAssociationsResultOutput) ToGetRouteTableAssociationsResultOutput() GetRouteTableAssociationsResultOutput {
	return o
}

func (o GetRouteTableAssociationsResultOutput) ToGetRouteTableAssociationsResultOutputWithContext(ctx context.Context) GetRouteTableAssociationsResultOutput {
	return o
}

func (o GetRouteTableAssociationsResultOutput) Filters() GetRouteTableAssociationsFilterArrayOutput {
	return o.ApplyT(func(v GetRouteTableAssociationsResult) []GetRouteTableAssociationsFilter { return v.Filters }).(GetRouteTableAssociationsFilterArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetRouteTableAssociationsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetRouteTableAssociationsResult) string { return v.Id }).(pulumi.StringOutput)
}

// Set of Transit Gateway Route Table Association identifiers.
func (o GetRouteTableAssociationsResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetRouteTableAssociationsResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetRouteTableAssociationsResultOutput) TransitGatewayRouteTableId() pulumi.StringOutput {
	return o.ApplyT(func(v GetRouteTableAssociationsResult) string { return v.TransitGatewayRouteTableId }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetRouteTableAssociationsResultOutput{})
}

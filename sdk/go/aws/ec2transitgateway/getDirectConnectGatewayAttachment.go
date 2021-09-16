// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package ec2transitgateway

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Get information on an EC2 Transit Gateway's attachment to a Direct Connect Gateway.
//
// ## Example Usage
// ### By Transit Gateway and Direct Connect Gateway Identifiers
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
// 		opt0 := aws_ec2_transit_gateway.Example.Id
// 		opt1 := aws_dx_gateway.Example.Id
// 		_, err := ec2transitgateway.GetDirectConnectGatewayAttachment(ctx, &ec2transitgateway.GetDirectConnectGatewayAttachmentArgs{
// 			TransitGatewayId: &opt0,
// 			DxGatewayId:      &opt1,
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
func GetDirectConnectGatewayAttachment(ctx *pulumi.Context, args *GetDirectConnectGatewayAttachmentArgs, opts ...pulumi.InvokeOption) (*GetDirectConnectGatewayAttachmentResult, error) {
	var rv GetDirectConnectGatewayAttachmentResult
	err := ctx.Invoke("aws:ec2transitgateway/getDirectConnectGatewayAttachment:getDirectConnectGatewayAttachment", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getDirectConnectGatewayAttachment.
type GetDirectConnectGatewayAttachmentArgs struct {
	// Identifier of the Direct Connect Gateway.
	DxGatewayId *string `pulumi:"dxGatewayId"`
	// Configuration block(s) for filtering. Detailed below.
	Filters []GetDirectConnectGatewayAttachmentFilter `pulumi:"filters"`
	// A map of tags, each pair of which must exactly match a pair on the desired Transit Gateway Direct Connect Gateway Attachment.
	Tags map[string]string `pulumi:"tags"`
	// Identifier of the EC2 Transit Gateway.
	TransitGatewayId *string `pulumi:"transitGatewayId"`
}

// A collection of values returned by getDirectConnectGatewayAttachment.
type GetDirectConnectGatewayAttachmentResult struct {
	DxGatewayId *string                                   `pulumi:"dxGatewayId"`
	Filters     []GetDirectConnectGatewayAttachmentFilter `pulumi:"filters"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Key-value tags for the EC2 Transit Gateway Attachment
	Tags             map[string]string `pulumi:"tags"`
	TransitGatewayId *string           `pulumi:"transitGatewayId"`
}

func GetDirectConnectGatewayAttachmentOutput(ctx *pulumi.Context, args GetDirectConnectGatewayAttachmentOutputArgs, opts ...pulumi.InvokeOption) GetDirectConnectGatewayAttachmentResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetDirectConnectGatewayAttachmentResult, error) {
			args := v.(GetDirectConnectGatewayAttachmentArgs)
			r, err := GetDirectConnectGatewayAttachment(ctx, &args, opts...)
			return *r, err
		}).(GetDirectConnectGatewayAttachmentResultOutput)
}

// A collection of arguments for invoking getDirectConnectGatewayAttachment.
type GetDirectConnectGatewayAttachmentOutputArgs struct {
	// Identifier of the Direct Connect Gateway.
	DxGatewayId pulumi.StringPtrInput `pulumi:"dxGatewayId"`
	// Configuration block(s) for filtering. Detailed below.
	Filters GetDirectConnectGatewayAttachmentFilterArrayInput `pulumi:"filters"`
	// A map of tags, each pair of which must exactly match a pair on the desired Transit Gateway Direct Connect Gateway Attachment.
	Tags pulumi.StringMapInput `pulumi:"tags"`
	// Identifier of the EC2 Transit Gateway.
	TransitGatewayId pulumi.StringPtrInput `pulumi:"transitGatewayId"`
}

func (GetDirectConnectGatewayAttachmentOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetDirectConnectGatewayAttachmentArgs)(nil)).Elem()
}

// A collection of values returned by getDirectConnectGatewayAttachment.
type GetDirectConnectGatewayAttachmentResultOutput struct{ *pulumi.OutputState }

func (GetDirectConnectGatewayAttachmentResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetDirectConnectGatewayAttachmentResult)(nil)).Elem()
}

func (o GetDirectConnectGatewayAttachmentResultOutput) ToGetDirectConnectGatewayAttachmentResultOutput() GetDirectConnectGatewayAttachmentResultOutput {
	return o
}

func (o GetDirectConnectGatewayAttachmentResultOutput) ToGetDirectConnectGatewayAttachmentResultOutputWithContext(ctx context.Context) GetDirectConnectGatewayAttachmentResultOutput {
	return o
}

func (o GetDirectConnectGatewayAttachmentResultOutput) DxGatewayId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetDirectConnectGatewayAttachmentResult) *string { return v.DxGatewayId }).(pulumi.StringPtrOutput)
}

func (o GetDirectConnectGatewayAttachmentResultOutput) Filters() GetDirectConnectGatewayAttachmentFilterArrayOutput {
	return o.ApplyT(func(v GetDirectConnectGatewayAttachmentResult) []GetDirectConnectGatewayAttachmentFilter {
		return v.Filters
	}).(GetDirectConnectGatewayAttachmentFilterArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetDirectConnectGatewayAttachmentResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetDirectConnectGatewayAttachmentResult) string { return v.Id }).(pulumi.StringOutput)
}

// Key-value tags for the EC2 Transit Gateway Attachment
func (o GetDirectConnectGatewayAttachmentResultOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v GetDirectConnectGatewayAttachmentResult) map[string]string { return v.Tags }).(pulumi.StringMapOutput)
}

func (o GetDirectConnectGatewayAttachmentResultOutput) TransitGatewayId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetDirectConnectGatewayAttachmentResult) *string { return v.TransitGatewayId }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetDirectConnectGatewayAttachmentResultOutput{})
}

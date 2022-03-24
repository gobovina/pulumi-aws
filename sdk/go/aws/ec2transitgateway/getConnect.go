// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package ec2transitgateway

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Get information on an EC2 Transit Gateway Connect.
//
// ## Example Usage
// ### By Filter
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-aws/sdk/v5/go/aws/ec2transitgateway"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := ec2transitgateway.LookupConnect(ctx, &ec2transitgateway.LookupConnectArgs{
// 			Filters: []ec2transitgateway.GetConnectFilter{
// 				ec2transitgateway.GetConnectFilter{
// 					Name: "transport-transit-gateway-attachment-id",
// 					Values: []string{
// 						"tgw-attach-12345678",
// 					},
// 				},
// 			},
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
// ### By Identifier
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-aws/sdk/v5/go/aws/ec2transitgateway"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := ec2transitgateway.LookupConnect(ctx, &ec2transitgateway.LookupConnectArgs{
// 			TransitGatewayConnectId: pulumi.StringRef("tgw-attach-12345678"),
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
func LookupConnect(ctx *pulumi.Context, args *LookupConnectArgs, opts ...pulumi.InvokeOption) (*LookupConnectResult, error) {
	var rv LookupConnectResult
	err := ctx.Invoke("aws:ec2transitgateway/getConnect:getConnect", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getConnect.
type LookupConnectArgs struct {
	// One or more configuration blocks containing name-values filters. Detailed below.
	Filters []GetConnectFilter `pulumi:"filters"`
	// Key-value tags for the EC2 Transit Gateway Connect
	Tags map[string]string `pulumi:"tags"`
	// Identifier of the EC2 Transit Gateway Connect.
	TransitGatewayConnectId *string `pulumi:"transitGatewayConnectId"`
}

// A collection of values returned by getConnect.
type LookupConnectResult struct {
	Filters []GetConnectFilter `pulumi:"filters"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// The tunnel protocol
	Protocol string `pulumi:"protocol"`
	// Key-value tags for the EC2 Transit Gateway Connect
	Tags                    map[string]string `pulumi:"tags"`
	TransitGatewayConnectId string            `pulumi:"transitGatewayConnectId"`
	// EC2 Transit Gateway identifier
	TransitGatewayId string `pulumi:"transitGatewayId"`
	// The underlaying VPC attachment
	TransportAttachmentId string `pulumi:"transportAttachmentId"`
}

func LookupConnectOutput(ctx *pulumi.Context, args LookupConnectOutputArgs, opts ...pulumi.InvokeOption) LookupConnectResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupConnectResult, error) {
			args := v.(LookupConnectArgs)
			r, err := LookupConnect(ctx, &args, opts...)
			return *r, err
		}).(LookupConnectResultOutput)
}

// A collection of arguments for invoking getConnect.
type LookupConnectOutputArgs struct {
	// One or more configuration blocks containing name-values filters. Detailed below.
	Filters GetConnectFilterArrayInput `pulumi:"filters"`
	// Key-value tags for the EC2 Transit Gateway Connect
	Tags pulumi.StringMapInput `pulumi:"tags"`
	// Identifier of the EC2 Transit Gateway Connect.
	TransitGatewayConnectId pulumi.StringPtrInput `pulumi:"transitGatewayConnectId"`
}

func (LookupConnectOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupConnectArgs)(nil)).Elem()
}

// A collection of values returned by getConnect.
type LookupConnectResultOutput struct{ *pulumi.OutputState }

func (LookupConnectResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupConnectResult)(nil)).Elem()
}

func (o LookupConnectResultOutput) ToLookupConnectResultOutput() LookupConnectResultOutput {
	return o
}

func (o LookupConnectResultOutput) ToLookupConnectResultOutputWithContext(ctx context.Context) LookupConnectResultOutput {
	return o
}

func (o LookupConnectResultOutput) Filters() GetConnectFilterArrayOutput {
	return o.ApplyT(func(v LookupConnectResult) []GetConnectFilter { return v.Filters }).(GetConnectFilterArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupConnectResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupConnectResult) string { return v.Id }).(pulumi.StringOutput)
}

// The tunnel protocol
func (o LookupConnectResultOutput) Protocol() pulumi.StringOutput {
	return o.ApplyT(func(v LookupConnectResult) string { return v.Protocol }).(pulumi.StringOutput)
}

// Key-value tags for the EC2 Transit Gateway Connect
func (o LookupConnectResultOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v LookupConnectResult) map[string]string { return v.Tags }).(pulumi.StringMapOutput)
}

func (o LookupConnectResultOutput) TransitGatewayConnectId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupConnectResult) string { return v.TransitGatewayConnectId }).(pulumi.StringOutput)
}

// EC2 Transit Gateway identifier
func (o LookupConnectResultOutput) TransitGatewayId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupConnectResult) string { return v.TransitGatewayId }).(pulumi.StringOutput)
}

// The underlaying VPC attachment
func (o LookupConnectResultOutput) TransportAttachmentId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupConnectResult) string { return v.TransportAttachmentId }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupConnectResultOutput{})
}

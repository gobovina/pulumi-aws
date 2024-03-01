// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package ec2

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Get an existing AWS Customer Gateway.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/ec2"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			foo, err := ec2.LookupCustomerGateway(ctx, &ec2.LookupCustomerGatewayArgs{
//				Filters: []ec2.GetCustomerGatewayFilter{
//					{
//						Name: "tag:Name",
//						Values: []string{
//							"foo-prod",
//						},
//					},
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			main, err := ec2.NewVpnGateway(ctx, "main", &ec2.VpnGatewayArgs{
//				VpcId:         pulumi.Any(mainAwsVpc.Id),
//				AmazonSideAsn: pulumi.String("7224"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = ec2.NewVpnConnection(ctx, "transit", &ec2.VpnConnectionArgs{
//				VpnGatewayId:      main.ID(),
//				CustomerGatewayId: *pulumi.String(foo.Id),
//				Type:              *pulumi.String(foo.Type),
//				StaticRoutesOnly:  pulumi.Bool(false),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupCustomerGateway(ctx *pulumi.Context, args *LookupCustomerGatewayArgs, opts ...pulumi.InvokeOption) (*LookupCustomerGatewayResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupCustomerGatewayResult
	err := ctx.Invoke("aws:ec2/getCustomerGateway:getCustomerGateway", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getCustomerGateway.
type LookupCustomerGatewayArgs struct {
	// One or more [name-value pairs][dcg-filters] to filter by.
	//
	// [dcg-filters]: https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeCustomerGateways.html
	Filters []GetCustomerGatewayFilter `pulumi:"filters"`
	// ID of the gateway.
	Id *string `pulumi:"id"`
	// Map of key-value pairs assigned to the gateway.
	Tags map[string]string `pulumi:"tags"`
}

// A collection of values returned by getCustomerGateway.
type LookupCustomerGatewayResult struct {
	// ARN of the customer gateway.
	Arn string `pulumi:"arn"`
	// Gateway's Border Gateway Protocol (BGP) Autonomous System Number (ASN).
	BgpAsn int `pulumi:"bgpAsn"`
	// ARN for the customer gateway certificate.
	CertificateArn string `pulumi:"certificateArn"`
	// Name for the customer gateway device.
	DeviceName string                     `pulumi:"deviceName"`
	Filters    []GetCustomerGatewayFilter `pulumi:"filters"`
	Id         string                     `pulumi:"id"`
	// IP address of the gateway's Internet-routable external interface.
	IpAddress string `pulumi:"ipAddress"`
	// Map of key-value pairs assigned to the gateway.
	Tags map[string]string `pulumi:"tags"`
	// Type of customer gateway. The only type AWS supports at this time is "ipsec.1".
	Type string `pulumi:"type"`
}

func LookupCustomerGatewayOutput(ctx *pulumi.Context, args LookupCustomerGatewayOutputArgs, opts ...pulumi.InvokeOption) LookupCustomerGatewayResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupCustomerGatewayResult, error) {
			args := v.(LookupCustomerGatewayArgs)
			r, err := LookupCustomerGateway(ctx, &args, opts...)
			var s LookupCustomerGatewayResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupCustomerGatewayResultOutput)
}

// A collection of arguments for invoking getCustomerGateway.
type LookupCustomerGatewayOutputArgs struct {
	// One or more [name-value pairs][dcg-filters] to filter by.
	//
	// [dcg-filters]: https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeCustomerGateways.html
	Filters GetCustomerGatewayFilterArrayInput `pulumi:"filters"`
	// ID of the gateway.
	Id pulumi.StringPtrInput `pulumi:"id"`
	// Map of key-value pairs assigned to the gateway.
	Tags pulumi.StringMapInput `pulumi:"tags"`
}

func (LookupCustomerGatewayOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupCustomerGatewayArgs)(nil)).Elem()
}

// A collection of values returned by getCustomerGateway.
type LookupCustomerGatewayResultOutput struct{ *pulumi.OutputState }

func (LookupCustomerGatewayResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupCustomerGatewayResult)(nil)).Elem()
}

func (o LookupCustomerGatewayResultOutput) ToLookupCustomerGatewayResultOutput() LookupCustomerGatewayResultOutput {
	return o
}

func (o LookupCustomerGatewayResultOutput) ToLookupCustomerGatewayResultOutputWithContext(ctx context.Context) LookupCustomerGatewayResultOutput {
	return o
}

// ARN of the customer gateway.
func (o LookupCustomerGatewayResultOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCustomerGatewayResult) string { return v.Arn }).(pulumi.StringOutput)
}

// Gateway's Border Gateway Protocol (BGP) Autonomous System Number (ASN).
func (o LookupCustomerGatewayResultOutput) BgpAsn() pulumi.IntOutput {
	return o.ApplyT(func(v LookupCustomerGatewayResult) int { return v.BgpAsn }).(pulumi.IntOutput)
}

// ARN for the customer gateway certificate.
func (o LookupCustomerGatewayResultOutput) CertificateArn() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCustomerGatewayResult) string { return v.CertificateArn }).(pulumi.StringOutput)
}

// Name for the customer gateway device.
func (o LookupCustomerGatewayResultOutput) DeviceName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCustomerGatewayResult) string { return v.DeviceName }).(pulumi.StringOutput)
}

func (o LookupCustomerGatewayResultOutput) Filters() GetCustomerGatewayFilterArrayOutput {
	return o.ApplyT(func(v LookupCustomerGatewayResult) []GetCustomerGatewayFilter { return v.Filters }).(GetCustomerGatewayFilterArrayOutput)
}

func (o LookupCustomerGatewayResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCustomerGatewayResult) string { return v.Id }).(pulumi.StringOutput)
}

// IP address of the gateway's Internet-routable external interface.
func (o LookupCustomerGatewayResultOutput) IpAddress() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCustomerGatewayResult) string { return v.IpAddress }).(pulumi.StringOutput)
}

// Map of key-value pairs assigned to the gateway.
func (o LookupCustomerGatewayResultOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v LookupCustomerGatewayResult) map[string]string { return v.Tags }).(pulumi.StringMapOutput)
}

// Type of customer gateway. The only type AWS supports at this time is "ipsec.1".
func (o LookupCustomerGatewayResultOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCustomerGatewayResult) string { return v.Type }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupCustomerGatewayResultOutput{})
}

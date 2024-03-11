// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package opensearch

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Data source for managing an AWS OpenSearch Serverless VPC Endpoint.
//
// ## Example Usage
//
// <!--Start PulumiCodeChooser -->
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/opensearch"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := opensearch.LookupServerlessVpcEndpoint(ctx, &opensearch.LookupServerlessVpcEndpointArgs{
//				VpcEndpointId: "vpce-829a4487959e2a839",
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
func LookupServerlessVpcEndpoint(ctx *pulumi.Context, args *LookupServerlessVpcEndpointArgs, opts ...pulumi.InvokeOption) (*LookupServerlessVpcEndpointResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupServerlessVpcEndpointResult
	err := ctx.Invoke("aws:opensearch/getServerlessVpcEndpoint:getServerlessVpcEndpoint", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getServerlessVpcEndpoint.
type LookupServerlessVpcEndpointArgs struct {
	// The unique identifier of the endpoint.
	VpcEndpointId string `pulumi:"vpcEndpointId"`
}

// A collection of values returned by getServerlessVpcEndpoint.
type LookupServerlessVpcEndpointResult struct {
	// The date the endpoint was created.
	CreatedDate string `pulumi:"createdDate"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// The name of the endpoint.
	Name string `pulumi:"name"`
	// The IDs of the security groups that define the ports, protocols, and sources for inbound traffic that you are authorizing into your endpoint.
	SecurityGroupIds []string `pulumi:"securityGroupIds"`
	// The IDs of the subnets from which you access OpenSearch Serverless.
	SubnetIds     []string `pulumi:"subnetIds"`
	VpcEndpointId string   `pulumi:"vpcEndpointId"`
	// The ID of the VPC from which you access OpenSearch Serverless.
	VpcId string `pulumi:"vpcId"`
}

func LookupServerlessVpcEndpointOutput(ctx *pulumi.Context, args LookupServerlessVpcEndpointOutputArgs, opts ...pulumi.InvokeOption) LookupServerlessVpcEndpointResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupServerlessVpcEndpointResult, error) {
			args := v.(LookupServerlessVpcEndpointArgs)
			r, err := LookupServerlessVpcEndpoint(ctx, &args, opts...)
			var s LookupServerlessVpcEndpointResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupServerlessVpcEndpointResultOutput)
}

// A collection of arguments for invoking getServerlessVpcEndpoint.
type LookupServerlessVpcEndpointOutputArgs struct {
	// The unique identifier of the endpoint.
	VpcEndpointId pulumi.StringInput `pulumi:"vpcEndpointId"`
}

func (LookupServerlessVpcEndpointOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupServerlessVpcEndpointArgs)(nil)).Elem()
}

// A collection of values returned by getServerlessVpcEndpoint.
type LookupServerlessVpcEndpointResultOutput struct{ *pulumi.OutputState }

func (LookupServerlessVpcEndpointResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupServerlessVpcEndpointResult)(nil)).Elem()
}

func (o LookupServerlessVpcEndpointResultOutput) ToLookupServerlessVpcEndpointResultOutput() LookupServerlessVpcEndpointResultOutput {
	return o
}

func (o LookupServerlessVpcEndpointResultOutput) ToLookupServerlessVpcEndpointResultOutputWithContext(ctx context.Context) LookupServerlessVpcEndpointResultOutput {
	return o
}

// The date the endpoint was created.
func (o LookupServerlessVpcEndpointResultOutput) CreatedDate() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServerlessVpcEndpointResult) string { return v.CreatedDate }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupServerlessVpcEndpointResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServerlessVpcEndpointResult) string { return v.Id }).(pulumi.StringOutput)
}

// The name of the endpoint.
func (o LookupServerlessVpcEndpointResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServerlessVpcEndpointResult) string { return v.Name }).(pulumi.StringOutput)
}

// The IDs of the security groups that define the ports, protocols, and sources for inbound traffic that you are authorizing into your endpoint.
func (o LookupServerlessVpcEndpointResultOutput) SecurityGroupIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupServerlessVpcEndpointResult) []string { return v.SecurityGroupIds }).(pulumi.StringArrayOutput)
}

// The IDs of the subnets from which you access OpenSearch Serverless.
func (o LookupServerlessVpcEndpointResultOutput) SubnetIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupServerlessVpcEndpointResult) []string { return v.SubnetIds }).(pulumi.StringArrayOutput)
}

func (o LookupServerlessVpcEndpointResultOutput) VpcEndpointId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServerlessVpcEndpointResult) string { return v.VpcEndpointId }).(pulumi.StringOutput)
}

// The ID of the VPC from which you access OpenSearch Serverless.
func (o LookupServerlessVpcEndpointResultOutput) VpcId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServerlessVpcEndpointResult) string { return v.VpcId }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupServerlessVpcEndpointResultOutput{})
}

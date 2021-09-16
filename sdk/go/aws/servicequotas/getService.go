// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package servicequotas

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Retrieve information about a Service Quotas Service.
//
// > **NOTE:** Global quotas apply to all AWS regions, but can only be accessed in `us-east-1` in the Commercial partition or `us-gov-west-1` in the GovCloud partition. In other regions, the AWS API will return the error `The request failed because the specified service does not exist.`
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-aws/sdk/v4/go/aws/servicequotas"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := servicequotas.GetService(ctx, &servicequotas.GetServiceArgs{
// 			ServiceName: "Amazon Virtual Private Cloud (Amazon VPC)",
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
func GetService(ctx *pulumi.Context, args *GetServiceArgs, opts ...pulumi.InvokeOption) (*GetServiceResult, error) {
	var rv GetServiceResult
	err := ctx.Invoke("aws:servicequotas/getService:getService", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getService.
type GetServiceArgs struct {
	// Service name to lookup within Service Quotas. Available values can be found with the [AWS CLI service-quotas list-services command](https://docs.aws.amazon.com/cli/latest/reference/service-quotas/list-services.html).
	ServiceName string `pulumi:"serviceName"`
}

// A collection of values returned by getService.
type GetServiceResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Code of the service.
	ServiceCode string `pulumi:"serviceCode"`
	ServiceName string `pulumi:"serviceName"`
}

func GetServiceOutput(ctx *pulumi.Context, args GetServiceOutputArgs, opts ...pulumi.InvokeOption) GetServiceResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetServiceResult, error) {
			args := v.(GetServiceArgs)
			r, err := GetService(ctx, &args, opts...)
			return *r, err
		}).(GetServiceResultOutput)
}

// A collection of arguments for invoking getService.
type GetServiceOutputArgs struct {
	// Service name to lookup within Service Quotas. Available values can be found with the [AWS CLI service-quotas list-services command](https://docs.aws.amazon.com/cli/latest/reference/service-quotas/list-services.html).
	ServiceName pulumi.StringInput `pulumi:"serviceName"`
}

func (GetServiceOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetServiceArgs)(nil)).Elem()
}

// A collection of values returned by getService.
type GetServiceResultOutput struct{ *pulumi.OutputState }

func (GetServiceResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetServiceResult)(nil)).Elem()
}

func (o GetServiceResultOutput) ToGetServiceResultOutput() GetServiceResultOutput {
	return o
}

func (o GetServiceResultOutput) ToGetServiceResultOutputWithContext(ctx context.Context) GetServiceResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o GetServiceResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetServiceResult) string { return v.Id }).(pulumi.StringOutput)
}

// Code of the service.
func (o GetServiceResultOutput) ServiceCode() pulumi.StringOutput {
	return o.ApplyT(func(v GetServiceResult) string { return v.ServiceCode }).(pulumi.StringOutput)
}

func (o GetServiceResultOutput) ServiceName() pulumi.StringOutput {
	return o.ApplyT(func(v GetServiceResult) string { return v.ServiceName }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetServiceResultOutput{})
}

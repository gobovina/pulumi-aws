// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package iot

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Returns a unique endpoint specific to the AWS account making the call.
func GetEndpoint(ctx *pulumi.Context, args *GetEndpointArgs, opts ...pulumi.InvokeOption) (*GetEndpointResult, error) {
	var rv GetEndpointResult
	err := ctx.Invoke("aws:iot/getEndpoint:getEndpoint", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getEndpoint.
type GetEndpointArgs struct {
	// Endpoint type. Valid values: `iot:CredentialProvider`, `iot:Data`, `iot:Data-ATS`, `iot:Job`.
	EndpointType *string `pulumi:"endpointType"`
}

// A collection of values returned by getEndpoint.
type GetEndpointResult struct {
	// The endpoint based on `endpointType`:
	// * No `endpointType`: Either `iot:Data` or `iot:Data-ATS` [depending on region](https://aws.amazon.com/blogs/iot/aws-iot-core-ats-endpoints/)
	// * `iot:CredentialsProvider`: `IDENTIFIER.credentials.iot.REGION.amazonaws.com`
	// * `iot:Data`: `IDENTIFIER.iot.REGION.amazonaws.com`
	// * `iot:Data-ATS`: `IDENTIFIER-ats.iot.REGION.amazonaws.com`
	// * `iot:Job`: `IDENTIFIER.jobs.iot.REGION.amazonaws.com`
	EndpointAddress string  `pulumi:"endpointAddress"`
	EndpointType    *string `pulumi:"endpointType"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
}

func GetEndpointOutput(ctx *pulumi.Context, args GetEndpointOutputArgs, opts ...pulumi.InvokeOption) GetEndpointResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetEndpointResult, error) {
			args := v.(GetEndpointArgs)
			r, err := GetEndpoint(ctx, &args, opts...)
			return *r, err
		}).(GetEndpointResultOutput)
}

// A collection of arguments for invoking getEndpoint.
type GetEndpointOutputArgs struct {
	// Endpoint type. Valid values: `iot:CredentialProvider`, `iot:Data`, `iot:Data-ATS`, `iot:Job`.
	EndpointType pulumi.StringPtrInput `pulumi:"endpointType"`
}

func (GetEndpointOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetEndpointArgs)(nil)).Elem()
}

// A collection of values returned by getEndpoint.
type GetEndpointResultOutput struct{ *pulumi.OutputState }

func (GetEndpointResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetEndpointResult)(nil)).Elem()
}

func (o GetEndpointResultOutput) ToGetEndpointResultOutput() GetEndpointResultOutput {
	return o
}

func (o GetEndpointResultOutput) ToGetEndpointResultOutputWithContext(ctx context.Context) GetEndpointResultOutput {
	return o
}

// The endpoint based on `endpointType`:
// * No `endpointType`: Either `iot:Data` or `iot:Data-ATS` [depending on region](https://aws.amazon.com/blogs/iot/aws-iot-core-ats-endpoints/)
// * `iot:CredentialsProvider`: `IDENTIFIER.credentials.iot.REGION.amazonaws.com`
// * `iot:Data`: `IDENTIFIER.iot.REGION.amazonaws.com`
// * `iot:Data-ATS`: `IDENTIFIER-ats.iot.REGION.amazonaws.com`
// * `iot:Job`: `IDENTIFIER.jobs.iot.REGION.amazonaws.com`
func (o GetEndpointResultOutput) EndpointAddress() pulumi.StringOutput {
	return o.ApplyT(func(v GetEndpointResult) string { return v.EndpointAddress }).(pulumi.StringOutput)
}

func (o GetEndpointResultOutput) EndpointType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetEndpointResult) *string { return v.EndpointType }).(pulumi.StringPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetEndpointResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetEndpointResult) string { return v.Id }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetEndpointResultOutput{})
}

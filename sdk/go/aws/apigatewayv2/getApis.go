// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package apigatewayv2

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides details about multiple Amazon API Gateway Version 2 APIs.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v5/go/aws/apigatewayv2"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := apigatewayv2.GetApis(ctx, &apigatewayv2.GetApisArgs{
//				ProtocolType: pulumi.StringRef("HTTP"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func GetApis(ctx *pulumi.Context, args *GetApisArgs, opts ...pulumi.InvokeOption) (*GetApisResult, error) {
	var rv GetApisResult
	err := ctx.Invoke("aws:apigatewayv2/getApis:getApis", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getApis.
type GetApisArgs struct {
	// API name.
	Name *string `pulumi:"name"`
	// API protocol.
	ProtocolType *string `pulumi:"protocolType"`
	// Map of tags, each pair of which must exactly match
	// a pair on the desired APIs.
	Tags map[string]string `pulumi:"tags"`
}

// A collection of values returned by getApis.
type GetApisResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Set of API identifiers.
	Ids          []string          `pulumi:"ids"`
	Name         *string           `pulumi:"name"`
	ProtocolType *string           `pulumi:"protocolType"`
	Tags         map[string]string `pulumi:"tags"`
}

func GetApisOutput(ctx *pulumi.Context, args GetApisOutputArgs, opts ...pulumi.InvokeOption) GetApisResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetApisResult, error) {
			args := v.(GetApisArgs)
			r, err := GetApis(ctx, &args, opts...)
			var s GetApisResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetApisResultOutput)
}

// A collection of arguments for invoking getApis.
type GetApisOutputArgs struct {
	// API name.
	Name pulumi.StringPtrInput `pulumi:"name"`
	// API protocol.
	ProtocolType pulumi.StringPtrInput `pulumi:"protocolType"`
	// Map of tags, each pair of which must exactly match
	// a pair on the desired APIs.
	Tags pulumi.StringMapInput `pulumi:"tags"`
}

func (GetApisOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetApisArgs)(nil)).Elem()
}

// A collection of values returned by getApis.
type GetApisResultOutput struct{ *pulumi.OutputState }

func (GetApisResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetApisResult)(nil)).Elem()
}

func (o GetApisResultOutput) ToGetApisResultOutput() GetApisResultOutput {
	return o
}

func (o GetApisResultOutput) ToGetApisResultOutputWithContext(ctx context.Context) GetApisResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o GetApisResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetApisResult) string { return v.Id }).(pulumi.StringOutput)
}

// Set of API identifiers.
func (o GetApisResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetApisResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetApisResultOutput) Name() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetApisResult) *string { return v.Name }).(pulumi.StringPtrOutput)
}

func (o GetApisResultOutput) ProtocolType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetApisResult) *string { return v.ProtocolType }).(pulumi.StringPtrOutput)
}

func (o GetApisResultOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v GetApisResult) map[string]string { return v.Tags }).(pulumi.StringMapOutput)
}

func init() {
	pulumi.RegisterOutputType(GetApisResultOutput{})
}

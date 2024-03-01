// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cognito

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to get a list of cognito user pools.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/apigateway"
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/cognito"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			selected, err := apigateway.LookupRestApi(ctx, &apigateway.LookupRestApiArgs{
//				Name: apiGatewayName,
//			}, nil)
//			if err != nil {
//				return err
//			}
//			selectedGetUserPools, err := cognito.GetUserPools(ctx, &cognito.GetUserPoolsArgs{
//				Name: cognitoUserPoolName,
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = apigateway.NewAuthorizer(ctx, "cognito", &apigateway.AuthorizerArgs{
//				Name:         pulumi.String("cognito"),
//				Type:         pulumi.String("COGNITO_USER_POOLS"),
//				RestApi:      *pulumi.String(selected.Id),
//				ProviderArns: interface{}(selectedGetUserPools.Arns),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func GetUserPools(ctx *pulumi.Context, args *GetUserPoolsArgs, opts ...pulumi.InvokeOption) (*GetUserPoolsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetUserPoolsResult
	err := ctx.Invoke("aws:cognito/getUserPools:getUserPools", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getUserPools.
type GetUserPoolsArgs struct {
	// Name of the cognito user pools. Name is not a unique attribute for cognito user pool, so multiple pools might be returned with given name. If the pool name is expected to be unique, you can reference the pool id via ```tolist(data.aws_cognito_user_pools.selected.ids)[0]```
	Name string `pulumi:"name"`
}

// A collection of values returned by getUserPools.
type GetUserPoolsResult struct {
	// Set of cognito user pool Amazon Resource Names (ARNs).
	Arns []string `pulumi:"arns"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Set of cognito user pool ids.
	Ids  []string `pulumi:"ids"`
	Name string   `pulumi:"name"`
}

func GetUserPoolsOutput(ctx *pulumi.Context, args GetUserPoolsOutputArgs, opts ...pulumi.InvokeOption) GetUserPoolsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetUserPoolsResult, error) {
			args := v.(GetUserPoolsArgs)
			r, err := GetUserPools(ctx, &args, opts...)
			var s GetUserPoolsResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetUserPoolsResultOutput)
}

// A collection of arguments for invoking getUserPools.
type GetUserPoolsOutputArgs struct {
	// Name of the cognito user pools. Name is not a unique attribute for cognito user pool, so multiple pools might be returned with given name. If the pool name is expected to be unique, you can reference the pool id via ```tolist(data.aws_cognito_user_pools.selected.ids)[0]```
	Name pulumi.StringInput `pulumi:"name"`
}

func (GetUserPoolsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetUserPoolsArgs)(nil)).Elem()
}

// A collection of values returned by getUserPools.
type GetUserPoolsResultOutput struct{ *pulumi.OutputState }

func (GetUserPoolsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetUserPoolsResult)(nil)).Elem()
}

func (o GetUserPoolsResultOutput) ToGetUserPoolsResultOutput() GetUserPoolsResultOutput {
	return o
}

func (o GetUserPoolsResultOutput) ToGetUserPoolsResultOutputWithContext(ctx context.Context) GetUserPoolsResultOutput {
	return o
}

// Set of cognito user pool Amazon Resource Names (ARNs).
func (o GetUserPoolsResultOutput) Arns() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetUserPoolsResult) []string { return v.Arns }).(pulumi.StringArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetUserPoolsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetUserPoolsResult) string { return v.Id }).(pulumi.StringOutput)
}

// Set of cognito user pool ids.
func (o GetUserPoolsResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetUserPoolsResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetUserPoolsResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v GetUserPoolsResult) string { return v.Name }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetUserPoolsResultOutput{})
}

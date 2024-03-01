// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cognito

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to get a list of Cognito user pools clients for a Cognito IdP user pool.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/cognito"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := cognito.GetUserPoolClients(ctx, &cognito.GetUserPoolClientsArgs{
//				UserPoolId: mainAwsCognitoUserPool.Id,
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func GetUserPoolClients(ctx *pulumi.Context, args *GetUserPoolClientsArgs, opts ...pulumi.InvokeOption) (*GetUserPoolClientsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetUserPoolClientsResult
	err := ctx.Invoke("aws:cognito/getUserPoolClients:getUserPoolClients", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getUserPoolClients.
type GetUserPoolClientsArgs struct {
	// Cognito user pool ID.
	UserPoolId string `pulumi:"userPoolId"`
}

// A collection of values returned by getUserPoolClients.
type GetUserPoolClientsResult struct {
	// List of Cognito user pool client IDs.
	ClientIds []string `pulumi:"clientIds"`
	// List of Cognito user pool client names.
	ClientNames []string `pulumi:"clientNames"`
	// The provider-assigned unique ID for this managed resource.
	Id         string `pulumi:"id"`
	UserPoolId string `pulumi:"userPoolId"`
}

func GetUserPoolClientsOutput(ctx *pulumi.Context, args GetUserPoolClientsOutputArgs, opts ...pulumi.InvokeOption) GetUserPoolClientsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetUserPoolClientsResult, error) {
			args := v.(GetUserPoolClientsArgs)
			r, err := GetUserPoolClients(ctx, &args, opts...)
			var s GetUserPoolClientsResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetUserPoolClientsResultOutput)
}

// A collection of arguments for invoking getUserPoolClients.
type GetUserPoolClientsOutputArgs struct {
	// Cognito user pool ID.
	UserPoolId pulumi.StringInput `pulumi:"userPoolId"`
}

func (GetUserPoolClientsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetUserPoolClientsArgs)(nil)).Elem()
}

// A collection of values returned by getUserPoolClients.
type GetUserPoolClientsResultOutput struct{ *pulumi.OutputState }

func (GetUserPoolClientsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetUserPoolClientsResult)(nil)).Elem()
}

func (o GetUserPoolClientsResultOutput) ToGetUserPoolClientsResultOutput() GetUserPoolClientsResultOutput {
	return o
}

func (o GetUserPoolClientsResultOutput) ToGetUserPoolClientsResultOutputWithContext(ctx context.Context) GetUserPoolClientsResultOutput {
	return o
}

// List of Cognito user pool client IDs.
func (o GetUserPoolClientsResultOutput) ClientIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetUserPoolClientsResult) []string { return v.ClientIds }).(pulumi.StringArrayOutput)
}

// List of Cognito user pool client names.
func (o GetUserPoolClientsResultOutput) ClientNames() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetUserPoolClientsResult) []string { return v.ClientNames }).(pulumi.StringArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetUserPoolClientsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetUserPoolClientsResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetUserPoolClientsResultOutput) UserPoolId() pulumi.StringOutput {
	return o.ApplyT(func(v GetUserPoolClientsResult) string { return v.UserPoolId }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetUserPoolClientsResultOutput{})
}

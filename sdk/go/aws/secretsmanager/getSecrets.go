// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package secretsmanager

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to get the ARNs and names of Secrets Manager secrets matching the specified criteria.
//
// ## Example Usage
//
// <!--Start PulumiCodeChooser -->
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/secretsmanager"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := secretsmanager.GetSecrets(ctx, &secretsmanager.GetSecretsArgs{
//				Filters: []secretsmanager.GetSecretsFilter{
//					{
//						Name: "name",
//						Values: []string{
//							"example",
//						},
//					},
//				},
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
func GetSecrets(ctx *pulumi.Context, args *GetSecretsArgs, opts ...pulumi.InvokeOption) (*GetSecretsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetSecretsResult
	err := ctx.Invoke("aws:secretsmanager/getSecrets:getSecrets", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getSecrets.
type GetSecretsArgs struct {
	// Configuration block(s) for filtering. Detailed below.
	Filters []GetSecretsFilter `pulumi:"filters"`
}

// A collection of values returned by getSecrets.
type GetSecretsResult struct {
	// Set of ARNs of the matched Secrets Manager secrets.
	Arns    []string           `pulumi:"arns"`
	Filters []GetSecretsFilter `pulumi:"filters"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Set of names of the matched Secrets Manager secrets.
	Names []string `pulumi:"names"`
}

func GetSecretsOutput(ctx *pulumi.Context, args GetSecretsOutputArgs, opts ...pulumi.InvokeOption) GetSecretsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetSecretsResult, error) {
			args := v.(GetSecretsArgs)
			r, err := GetSecrets(ctx, &args, opts...)
			var s GetSecretsResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetSecretsResultOutput)
}

// A collection of arguments for invoking getSecrets.
type GetSecretsOutputArgs struct {
	// Configuration block(s) for filtering. Detailed below.
	Filters GetSecretsFilterArrayInput `pulumi:"filters"`
}

func (GetSecretsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetSecretsArgs)(nil)).Elem()
}

// A collection of values returned by getSecrets.
type GetSecretsResultOutput struct{ *pulumi.OutputState }

func (GetSecretsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetSecretsResult)(nil)).Elem()
}

func (o GetSecretsResultOutput) ToGetSecretsResultOutput() GetSecretsResultOutput {
	return o
}

func (o GetSecretsResultOutput) ToGetSecretsResultOutputWithContext(ctx context.Context) GetSecretsResultOutput {
	return o
}

// Set of ARNs of the matched Secrets Manager secrets.
func (o GetSecretsResultOutput) Arns() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetSecretsResult) []string { return v.Arns }).(pulumi.StringArrayOutput)
}

func (o GetSecretsResultOutput) Filters() GetSecretsFilterArrayOutput {
	return o.ApplyT(func(v GetSecretsResult) []GetSecretsFilter { return v.Filters }).(GetSecretsFilterArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetSecretsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetSecretsResult) string { return v.Id }).(pulumi.StringOutput)
}

// Set of names of the matched Secrets Manager secrets.
func (o GetSecretsResultOutput) Names() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetSecretsResult) []string { return v.Names }).(pulumi.StringArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetSecretsResultOutput{})
}

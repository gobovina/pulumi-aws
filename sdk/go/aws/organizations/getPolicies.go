// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package organizations

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Data source for managing an AWS Organizations Policies.
//
// ## Example Usage
// ### Basic Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/organizations"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func notImplemented(message string) pulumi.AnyOutput {
//		panic(message)
//	}
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := organizations.GetPolicies(ctx, &organizations.GetPoliciesArgs{
//				Filter: "SERVICE_CONTROL_POLICY",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_ := "TODO: For expression"
//			return nil
//		})
//	}
//
// ```
func GetPolicies(ctx *pulumi.Context, args *GetPoliciesArgs, opts ...pulumi.InvokeOption) (*GetPoliciesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetPoliciesResult
	err := ctx.Invoke("aws:organizations/getPolicies:getPolicies", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getPolicies.
type GetPoliciesArgs struct {
	// The type of policies to be returned in the response. Valid values are `SERVICE_CONTROL_POLICY | TAG_POLICY | BACKUP_POLICY | AISERVICES_OPT_OUT_POLICY`
	Filter string `pulumi:"filter"`
}

// A collection of values returned by getPolicies.
type GetPoliciesResult struct {
	Filter string `pulumi:"filter"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// List of all the policy ids found.
	Ids []string `pulumi:"ids"`
}

func GetPoliciesOutput(ctx *pulumi.Context, args GetPoliciesOutputArgs, opts ...pulumi.InvokeOption) GetPoliciesResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetPoliciesResult, error) {
			args := v.(GetPoliciesArgs)
			r, err := GetPolicies(ctx, &args, opts...)
			var s GetPoliciesResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetPoliciesResultOutput)
}

// A collection of arguments for invoking getPolicies.
type GetPoliciesOutputArgs struct {
	// The type of policies to be returned in the response. Valid values are `SERVICE_CONTROL_POLICY | TAG_POLICY | BACKUP_POLICY | AISERVICES_OPT_OUT_POLICY`
	Filter pulumi.StringInput `pulumi:"filter"`
}

func (GetPoliciesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetPoliciesArgs)(nil)).Elem()
}

// A collection of values returned by getPolicies.
type GetPoliciesResultOutput struct{ *pulumi.OutputState }

func (GetPoliciesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetPoliciesResult)(nil)).Elem()
}

func (o GetPoliciesResultOutput) ToGetPoliciesResultOutput() GetPoliciesResultOutput {
	return o
}

func (o GetPoliciesResultOutput) ToGetPoliciesResultOutputWithContext(ctx context.Context) GetPoliciesResultOutput {
	return o
}

func (o GetPoliciesResultOutput) Filter() pulumi.StringOutput {
	return o.ApplyT(func(v GetPoliciesResult) string { return v.Filter }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetPoliciesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetPoliciesResult) string { return v.Id }).(pulumi.StringOutput)
}

// List of all the policy ids found.
func (o GetPoliciesResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetPoliciesResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetPoliciesResultOutput{})
}

// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package batch

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// The Batch Scheduling Policy data source allows access to details of a specific Scheduling Policy within AWS Batch.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v5/go/aws/batch"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := batch.LookupSchedulingPolicy(ctx, &batch.LookupSchedulingPolicyArgs{
//				Arn: "arn:aws:batch:us-east-1:012345678910:scheduling-policy/example",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupSchedulingPolicy(ctx *pulumi.Context, args *LookupSchedulingPolicyArgs, opts ...pulumi.InvokeOption) (*LookupSchedulingPolicyResult, error) {
	var rv LookupSchedulingPolicyResult
	err := ctx.Invoke("aws:batch/getSchedulingPolicy:getSchedulingPolicy", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getSchedulingPolicy.
type LookupSchedulingPolicyArgs struct {
	// ARN of the scheduling policy.
	Arn string `pulumi:"arn"`
	// Key-value map of resource tags
	Tags map[string]string `pulumi:"tags"`
}

// A collection of values returned by getSchedulingPolicy.
type LookupSchedulingPolicyResult struct {
	Arn               string                               `pulumi:"arn"`
	FairSharePolicies []GetSchedulingPolicyFairSharePolicy `pulumi:"fairSharePolicies"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Name of the scheduling policy.
	Name string `pulumi:"name"`
	// Key-value map of resource tags
	Tags map[string]string `pulumi:"tags"`
}

func LookupSchedulingPolicyOutput(ctx *pulumi.Context, args LookupSchedulingPolicyOutputArgs, opts ...pulumi.InvokeOption) LookupSchedulingPolicyResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupSchedulingPolicyResult, error) {
			args := v.(LookupSchedulingPolicyArgs)
			r, err := LookupSchedulingPolicy(ctx, &args, opts...)
			var s LookupSchedulingPolicyResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupSchedulingPolicyResultOutput)
}

// A collection of arguments for invoking getSchedulingPolicy.
type LookupSchedulingPolicyOutputArgs struct {
	// ARN of the scheduling policy.
	Arn pulumi.StringInput `pulumi:"arn"`
	// Key-value map of resource tags
	Tags pulumi.StringMapInput `pulumi:"tags"`
}

func (LookupSchedulingPolicyOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupSchedulingPolicyArgs)(nil)).Elem()
}

// A collection of values returned by getSchedulingPolicy.
type LookupSchedulingPolicyResultOutput struct{ *pulumi.OutputState }

func (LookupSchedulingPolicyResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupSchedulingPolicyResult)(nil)).Elem()
}

func (o LookupSchedulingPolicyResultOutput) ToLookupSchedulingPolicyResultOutput() LookupSchedulingPolicyResultOutput {
	return o
}

func (o LookupSchedulingPolicyResultOutput) ToLookupSchedulingPolicyResultOutputWithContext(ctx context.Context) LookupSchedulingPolicyResultOutput {
	return o
}

func (o LookupSchedulingPolicyResultOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSchedulingPolicyResult) string { return v.Arn }).(pulumi.StringOutput)
}

func (o LookupSchedulingPolicyResultOutput) FairSharePolicies() GetSchedulingPolicyFairSharePolicyArrayOutput {
	return o.ApplyT(func(v LookupSchedulingPolicyResult) []GetSchedulingPolicyFairSharePolicy { return v.FairSharePolicies }).(GetSchedulingPolicyFairSharePolicyArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupSchedulingPolicyResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSchedulingPolicyResult) string { return v.Id }).(pulumi.StringOutput)
}

// Name of the scheduling policy.
func (o LookupSchedulingPolicyResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSchedulingPolicyResult) string { return v.Name }).(pulumi.StringOutput)
}

// Key-value map of resource tags
func (o LookupSchedulingPolicyResultOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v LookupSchedulingPolicyResult) map[string]string { return v.Tags }).(pulumi.StringMapOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupSchedulingPolicyResultOutput{})
}

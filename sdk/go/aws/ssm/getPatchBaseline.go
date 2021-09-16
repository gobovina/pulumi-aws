// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package ssm

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides an SSM Patch Baseline data source. Useful if you wish to reuse the default baselines provided.
//
// ## Example Usage
//
// To retrieve a baseline provided by AWS:
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-aws/sdk/v4/go/aws/ssm"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		opt0 := "AWS-"
// 		opt1 := "CENTOS"
// 		_, err := ssm.LookupPatchBaseline(ctx, &ssm.LookupPatchBaselineArgs{
// 			NamePrefix:      &opt0,
// 			OperatingSystem: &opt1,
// 			Owner:           "AWS",
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
//
// To retrieve a baseline on your account:
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-aws/sdk/v4/go/aws/ssm"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		opt0 := true
// 		opt1 := "MyCustomBaseline"
// 		opt2 := "WINDOWS"
// 		_, err := ssm.LookupPatchBaseline(ctx, &ssm.LookupPatchBaselineArgs{
// 			DefaultBaseline: &opt0,
// 			NamePrefix:      &opt1,
// 			OperatingSystem: &opt2,
// 			Owner:           "Self",
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
func LookupPatchBaseline(ctx *pulumi.Context, args *LookupPatchBaselineArgs, opts ...pulumi.InvokeOption) (*LookupPatchBaselineResult, error) {
	var rv LookupPatchBaselineResult
	err := ctx.Invoke("aws:ssm/getPatchBaseline:getPatchBaseline", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getPatchBaseline.
type LookupPatchBaselineArgs struct {
	// Filters the results against the baselines defaultBaseline field.
	DefaultBaseline *bool `pulumi:"defaultBaseline"`
	// Filter results by the baseline name prefix.
	NamePrefix *string `pulumi:"namePrefix"`
	// The specified OS for the baseline.
	OperatingSystem *string `pulumi:"operatingSystem"`
	// The owner of the baseline. Valid values: `All`, `AWS`, `Self` (the current account).
	Owner string `pulumi:"owner"`
}

// A collection of values returned by getPatchBaseline.
type LookupPatchBaselineResult struct {
	DefaultBaseline *bool `pulumi:"defaultBaseline"`
	// The description of the baseline.
	Description string `pulumi:"description"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// The name of the baseline.
	Name            string  `pulumi:"name"`
	NamePrefix      *string `pulumi:"namePrefix"`
	OperatingSystem *string `pulumi:"operatingSystem"`
	Owner           string  `pulumi:"owner"`
}

func LookupPatchBaselineOutput(ctx *pulumi.Context, args LookupPatchBaselineOutputArgs, opts ...pulumi.InvokeOption) LookupPatchBaselineResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupPatchBaselineResult, error) {
			args := v.(LookupPatchBaselineArgs)
			r, err := LookupPatchBaseline(ctx, &args, opts...)
			return *r, err
		}).(LookupPatchBaselineResultOutput)
}

// A collection of arguments for invoking getPatchBaseline.
type LookupPatchBaselineOutputArgs struct {
	// Filters the results against the baselines defaultBaseline field.
	DefaultBaseline pulumi.BoolPtrInput `pulumi:"defaultBaseline"`
	// Filter results by the baseline name prefix.
	NamePrefix pulumi.StringPtrInput `pulumi:"namePrefix"`
	// The specified OS for the baseline.
	OperatingSystem pulumi.StringPtrInput `pulumi:"operatingSystem"`
	// The owner of the baseline. Valid values: `All`, `AWS`, `Self` (the current account).
	Owner pulumi.StringInput `pulumi:"owner"`
}

func (LookupPatchBaselineOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupPatchBaselineArgs)(nil)).Elem()
}

// A collection of values returned by getPatchBaseline.
type LookupPatchBaselineResultOutput struct{ *pulumi.OutputState }

func (LookupPatchBaselineResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupPatchBaselineResult)(nil)).Elem()
}

func (o LookupPatchBaselineResultOutput) ToLookupPatchBaselineResultOutput() LookupPatchBaselineResultOutput {
	return o
}

func (o LookupPatchBaselineResultOutput) ToLookupPatchBaselineResultOutputWithContext(ctx context.Context) LookupPatchBaselineResultOutput {
	return o
}

func (o LookupPatchBaselineResultOutput) DefaultBaseline() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v LookupPatchBaselineResult) *bool { return v.DefaultBaseline }).(pulumi.BoolPtrOutput)
}

// The description of the baseline.
func (o LookupPatchBaselineResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupPatchBaselineResult) string { return v.Description }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupPatchBaselineResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupPatchBaselineResult) string { return v.Id }).(pulumi.StringOutput)
}

// The name of the baseline.
func (o LookupPatchBaselineResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupPatchBaselineResult) string { return v.Name }).(pulumi.StringOutput)
}

func (o LookupPatchBaselineResultOutput) NamePrefix() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupPatchBaselineResult) *string { return v.NamePrefix }).(pulumi.StringPtrOutput)
}

func (o LookupPatchBaselineResultOutput) OperatingSystem() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupPatchBaselineResult) *string { return v.OperatingSystem }).(pulumi.StringPtrOutput)
}

func (o LookupPatchBaselineResultOutput) Owner() pulumi.StringOutput {
	return o.ApplyT(func(v LookupPatchBaselineResult) string { return v.Owner }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupPatchBaselineResultOutput{})
}

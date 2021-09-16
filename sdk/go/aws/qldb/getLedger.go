// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package qldb

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to fetch information about a Quantum Ledger Database.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-aws/sdk/v4/go/aws/qldb"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := qldb.LookupLedger(ctx, &qldb.LookupLedgerArgs{
// 			Name: "an_example_ledger",
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
func LookupLedger(ctx *pulumi.Context, args *LookupLedgerArgs, opts ...pulumi.InvokeOption) (*LookupLedgerResult, error) {
	var rv LookupLedgerResult
	err := ctx.Invoke("aws:qldb/getLedger:getLedger", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getLedger.
type LookupLedgerArgs struct {
	// The friendly name of the ledger to match.
	Name string `pulumi:"name"`
}

// A collection of values returned by getLedger.
type LookupLedgerResult struct {
	Arn                string `pulumi:"arn"`
	DeletionProtection bool   `pulumi:"deletionProtection"`
	// The provider-assigned unique ID for this managed resource.
	Id              string `pulumi:"id"`
	Name            string `pulumi:"name"`
	PermissionsMode string `pulumi:"permissionsMode"`
}

func LookupLedgerOutput(ctx *pulumi.Context, args LookupLedgerOutputArgs, opts ...pulumi.InvokeOption) LookupLedgerResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupLedgerResult, error) {
			args := v.(LookupLedgerArgs)
			r, err := LookupLedger(ctx, &args, opts...)
			return *r, err
		}).(LookupLedgerResultOutput)
}

// A collection of arguments for invoking getLedger.
type LookupLedgerOutputArgs struct {
	// The friendly name of the ledger to match.
	Name pulumi.StringInput `pulumi:"name"`
}

func (LookupLedgerOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupLedgerArgs)(nil)).Elem()
}

// A collection of values returned by getLedger.
type LookupLedgerResultOutput struct{ *pulumi.OutputState }

func (LookupLedgerResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupLedgerResult)(nil)).Elem()
}

func (o LookupLedgerResultOutput) ToLookupLedgerResultOutput() LookupLedgerResultOutput {
	return o
}

func (o LookupLedgerResultOutput) ToLookupLedgerResultOutputWithContext(ctx context.Context) LookupLedgerResultOutput {
	return o
}

func (o LookupLedgerResultOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v LookupLedgerResult) string { return v.Arn }).(pulumi.StringOutput)
}

func (o LookupLedgerResultOutput) DeletionProtection() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupLedgerResult) bool { return v.DeletionProtection }).(pulumi.BoolOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupLedgerResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupLedgerResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupLedgerResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupLedgerResult) string { return v.Name }).(pulumi.StringOutput)
}

func (o LookupLedgerResultOutput) PermissionsMode() pulumi.StringOutput {
	return o.ApplyT(func(v LookupLedgerResult) string { return v.PermissionsMode }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupLedgerResultOutput{})
}

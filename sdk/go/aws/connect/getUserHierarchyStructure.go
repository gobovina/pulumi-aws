// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package connect

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides details about a specific Amazon Connect User Hierarchy Structure
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/connect"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := connect.LookupUserHierarchyStructure(ctx, &connect.LookupUserHierarchyStructureArgs{
//				InstanceId: testAwsConnectInstance.Id,
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupUserHierarchyStructure(ctx *pulumi.Context, args *LookupUserHierarchyStructureArgs, opts ...pulumi.InvokeOption) (*LookupUserHierarchyStructureResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupUserHierarchyStructureResult
	err := ctx.Invoke("aws:connect/getUserHierarchyStructure:getUserHierarchyStructure", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getUserHierarchyStructure.
type LookupUserHierarchyStructureArgs struct {
	// Reference to the hosting Amazon Connect Instance
	InstanceId string `pulumi:"instanceId"`
}

// A collection of values returned by getUserHierarchyStructure.
type LookupUserHierarchyStructureResult struct {
	// Block that defines the hierarchy structure's levels. The `hierarchyStructure` block is documented below.
	HierarchyStructures []GetUserHierarchyStructureHierarchyStructure `pulumi:"hierarchyStructures"`
	// The provider-assigned unique ID for this managed resource.
	Id         string `pulumi:"id"`
	InstanceId string `pulumi:"instanceId"`
}

func LookupUserHierarchyStructureOutput(ctx *pulumi.Context, args LookupUserHierarchyStructureOutputArgs, opts ...pulumi.InvokeOption) LookupUserHierarchyStructureResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupUserHierarchyStructureResult, error) {
			args := v.(LookupUserHierarchyStructureArgs)
			r, err := LookupUserHierarchyStructure(ctx, &args, opts...)
			var s LookupUserHierarchyStructureResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupUserHierarchyStructureResultOutput)
}

// A collection of arguments for invoking getUserHierarchyStructure.
type LookupUserHierarchyStructureOutputArgs struct {
	// Reference to the hosting Amazon Connect Instance
	InstanceId pulumi.StringInput `pulumi:"instanceId"`
}

func (LookupUserHierarchyStructureOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupUserHierarchyStructureArgs)(nil)).Elem()
}

// A collection of values returned by getUserHierarchyStructure.
type LookupUserHierarchyStructureResultOutput struct{ *pulumi.OutputState }

func (LookupUserHierarchyStructureResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupUserHierarchyStructureResult)(nil)).Elem()
}

func (o LookupUserHierarchyStructureResultOutput) ToLookupUserHierarchyStructureResultOutput() LookupUserHierarchyStructureResultOutput {
	return o
}

func (o LookupUserHierarchyStructureResultOutput) ToLookupUserHierarchyStructureResultOutputWithContext(ctx context.Context) LookupUserHierarchyStructureResultOutput {
	return o
}

// Block that defines the hierarchy structure's levels. The `hierarchyStructure` block is documented below.
func (o LookupUserHierarchyStructureResultOutput) HierarchyStructures() GetUserHierarchyStructureHierarchyStructureArrayOutput {
	return o.ApplyT(func(v LookupUserHierarchyStructureResult) []GetUserHierarchyStructureHierarchyStructure {
		return v.HierarchyStructures
	}).(GetUserHierarchyStructureHierarchyStructureArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupUserHierarchyStructureResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupUserHierarchyStructureResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupUserHierarchyStructureResultOutput) InstanceId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupUserHierarchyStructureResult) string { return v.InstanceId }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupUserHierarchyStructureResultOutput{})
}

// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package ebs

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to get a list of EBS Snapshot IDs matching the specified
// criteria.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/ebs"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := ebs.GetSnapshotIds(ctx, &ebs.GetSnapshotIdsArgs{
//				Owners: []string{
//					"self",
//				},
//				Filters: []ebs.GetSnapshotIdsFilter{
//					{
//						Name: "volume-size",
//						Values: []string{
//							"40",
//						},
//					},
//					{
//						Name: "tag:Name",
//						Values: []string{
//							"Example",
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
func GetSnapshotIds(ctx *pulumi.Context, args *GetSnapshotIdsArgs, opts ...pulumi.InvokeOption) (*GetSnapshotIdsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetSnapshotIdsResult
	err := ctx.Invoke("aws:ebs/getSnapshotIds:getSnapshotIds", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getSnapshotIds.
type GetSnapshotIdsArgs struct {
	// One or more name/value pairs to filter off of. There are
	// several valid keys, for a full reference, check out
	// [describe-volumes in the AWS CLI reference][1].
	Filters []GetSnapshotIdsFilter `pulumi:"filters"`
	// Returns the snapshots owned by the specified owner id. Multiple owners can be specified.
	Owners []string `pulumi:"owners"`
	// One or more AWS accounts IDs that can create volumes from the snapshot.
	RestorableByUserIds []string `pulumi:"restorableByUserIds"`
}

// A collection of values returned by getSnapshotIds.
type GetSnapshotIdsResult struct {
	Filters []GetSnapshotIdsFilter `pulumi:"filters"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Set of EBS snapshot IDs, sorted by creation time in descending order.
	Ids                 []string `pulumi:"ids"`
	Owners              []string `pulumi:"owners"`
	RestorableByUserIds []string `pulumi:"restorableByUserIds"`
}

func GetSnapshotIdsOutput(ctx *pulumi.Context, args GetSnapshotIdsOutputArgs, opts ...pulumi.InvokeOption) GetSnapshotIdsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetSnapshotIdsResult, error) {
			args := v.(GetSnapshotIdsArgs)
			r, err := GetSnapshotIds(ctx, &args, opts...)
			var s GetSnapshotIdsResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetSnapshotIdsResultOutput)
}

// A collection of arguments for invoking getSnapshotIds.
type GetSnapshotIdsOutputArgs struct {
	// One or more name/value pairs to filter off of. There are
	// several valid keys, for a full reference, check out
	// [describe-volumes in the AWS CLI reference][1].
	Filters GetSnapshotIdsFilterArrayInput `pulumi:"filters"`
	// Returns the snapshots owned by the specified owner id. Multiple owners can be specified.
	Owners pulumi.StringArrayInput `pulumi:"owners"`
	// One or more AWS accounts IDs that can create volumes from the snapshot.
	RestorableByUserIds pulumi.StringArrayInput `pulumi:"restorableByUserIds"`
}

func (GetSnapshotIdsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetSnapshotIdsArgs)(nil)).Elem()
}

// A collection of values returned by getSnapshotIds.
type GetSnapshotIdsResultOutput struct{ *pulumi.OutputState }

func (GetSnapshotIdsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetSnapshotIdsResult)(nil)).Elem()
}

func (o GetSnapshotIdsResultOutput) ToGetSnapshotIdsResultOutput() GetSnapshotIdsResultOutput {
	return o
}

func (o GetSnapshotIdsResultOutput) ToGetSnapshotIdsResultOutputWithContext(ctx context.Context) GetSnapshotIdsResultOutput {
	return o
}

func (o GetSnapshotIdsResultOutput) Filters() GetSnapshotIdsFilterArrayOutput {
	return o.ApplyT(func(v GetSnapshotIdsResult) []GetSnapshotIdsFilter { return v.Filters }).(GetSnapshotIdsFilterArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetSnapshotIdsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetSnapshotIdsResult) string { return v.Id }).(pulumi.StringOutput)
}

// Set of EBS snapshot IDs, sorted by creation time in descending order.
func (o GetSnapshotIdsResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetSnapshotIdsResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetSnapshotIdsResultOutput) Owners() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetSnapshotIdsResult) []string { return v.Owners }).(pulumi.StringArrayOutput)
}

func (o GetSnapshotIdsResultOutput) RestorableByUserIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetSnapshotIdsResult) []string { return v.RestorableByUserIds }).(pulumi.StringArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetSnapshotIdsResultOutput{})
}

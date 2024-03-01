// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package guardduty

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Data source for managing an AWS GuardDuty Finding Ids.
//
// ## Example Usage
// ### Basic Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/guardduty"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := guardduty.GetFindingIds(ctx, &guardduty.GetFindingIdsArgs{
//				DetectorId: exampleAwsGuarddutyDetector.Id,
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func GetFindingIds(ctx *pulumi.Context, args *GetFindingIdsArgs, opts ...pulumi.InvokeOption) (*GetFindingIdsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetFindingIdsResult
	err := ctx.Invoke("aws:guardduty/getFindingIds:getFindingIds", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getFindingIds.
type GetFindingIdsArgs struct {
	// ID of the GuardDuty detector.
	DetectorId string `pulumi:"detectorId"`
}

// A collection of values returned by getFindingIds.
type GetFindingIdsResult struct {
	DetectorId string `pulumi:"detectorId"`
	// A list of finding IDs for the specified detector.
	FindingIds []string `pulumi:"findingIds"`
	// Indicates whether findings are present for the specified detector.
	HasFindings bool   `pulumi:"hasFindings"`
	Id          string `pulumi:"id"`
}

func GetFindingIdsOutput(ctx *pulumi.Context, args GetFindingIdsOutputArgs, opts ...pulumi.InvokeOption) GetFindingIdsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetFindingIdsResult, error) {
			args := v.(GetFindingIdsArgs)
			r, err := GetFindingIds(ctx, &args, opts...)
			var s GetFindingIdsResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetFindingIdsResultOutput)
}

// A collection of arguments for invoking getFindingIds.
type GetFindingIdsOutputArgs struct {
	// ID of the GuardDuty detector.
	DetectorId pulumi.StringInput `pulumi:"detectorId"`
}

func (GetFindingIdsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetFindingIdsArgs)(nil)).Elem()
}

// A collection of values returned by getFindingIds.
type GetFindingIdsResultOutput struct{ *pulumi.OutputState }

func (GetFindingIdsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetFindingIdsResult)(nil)).Elem()
}

func (o GetFindingIdsResultOutput) ToGetFindingIdsResultOutput() GetFindingIdsResultOutput {
	return o
}

func (o GetFindingIdsResultOutput) ToGetFindingIdsResultOutputWithContext(ctx context.Context) GetFindingIdsResultOutput {
	return o
}

func (o GetFindingIdsResultOutput) DetectorId() pulumi.StringOutput {
	return o.ApplyT(func(v GetFindingIdsResult) string { return v.DetectorId }).(pulumi.StringOutput)
}

// A list of finding IDs for the specified detector.
func (o GetFindingIdsResultOutput) FindingIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetFindingIdsResult) []string { return v.FindingIds }).(pulumi.StringArrayOutput)
}

// Indicates whether findings are present for the specified detector.
func (o GetFindingIdsResultOutput) HasFindings() pulumi.BoolOutput {
	return o.ApplyT(func(v GetFindingIdsResult) bool { return v.HasFindings }).(pulumi.BoolOutput)
}

func (o GetFindingIdsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetFindingIdsResult) string { return v.Id }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetFindingIdsResultOutput{})
}

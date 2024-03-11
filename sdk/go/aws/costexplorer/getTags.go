// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package costexplorer

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides details about a specific CE Tags.
//
// ## Example Usage
//
// <!--Start PulumiCodeChooser -->
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/costexplorer"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := costexplorer.GetTags(ctx, &costexplorer.GetTagsArgs{
//				TimePeriod: costexplorer.GetTagsTimePeriod{
//					Start: "2021-01-01",
//					End:   "2022-12-01",
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
func GetTags(ctx *pulumi.Context, args *GetTagsArgs, opts ...pulumi.InvokeOption) (*GetTagsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetTagsResult
	err := ctx.Invoke("aws:costexplorer/getTags:getTags", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getTags.
type GetTagsArgs struct {
	// Configuration block for the `Expression` object used to categorize costs. See below.
	Filter *GetTagsFilter `pulumi:"filter"`
	// Value that you want to search for.
	SearchString *string `pulumi:"searchString"`
	// Configuration block for the value by which you want to sort the data. See below.
	SortBies []GetTagsSortBy `pulumi:"sortBies"`
	// Key of the tag that you want to return values for.
	TagKey *string `pulumi:"tagKey"`
	// Configuration block for the start and end dates for retrieving the dimension values.
	//
	// The following arguments are optional:
	TimePeriod GetTagsTimePeriod `pulumi:"timePeriod"`
}

// A collection of values returned by getTags.
type GetTagsResult struct {
	Filter *GetTagsFilter `pulumi:"filter"`
	// The provider-assigned unique ID for this managed resource.
	Id           string          `pulumi:"id"`
	SearchString *string         `pulumi:"searchString"`
	SortBies     []GetTagsSortBy `pulumi:"sortBies"`
	TagKey       *string         `pulumi:"tagKey"`
	// Tags that match your request.
	Tags       []string          `pulumi:"tags"`
	TimePeriod GetTagsTimePeriod `pulumi:"timePeriod"`
}

func GetTagsOutput(ctx *pulumi.Context, args GetTagsOutputArgs, opts ...pulumi.InvokeOption) GetTagsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetTagsResult, error) {
			args := v.(GetTagsArgs)
			r, err := GetTags(ctx, &args, opts...)
			var s GetTagsResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetTagsResultOutput)
}

// A collection of arguments for invoking getTags.
type GetTagsOutputArgs struct {
	// Configuration block for the `Expression` object used to categorize costs. See below.
	Filter GetTagsFilterPtrInput `pulumi:"filter"`
	// Value that you want to search for.
	SearchString pulumi.StringPtrInput `pulumi:"searchString"`
	// Configuration block for the value by which you want to sort the data. See below.
	SortBies GetTagsSortByArrayInput `pulumi:"sortBies"`
	// Key of the tag that you want to return values for.
	TagKey pulumi.StringPtrInput `pulumi:"tagKey"`
	// Configuration block for the start and end dates for retrieving the dimension values.
	//
	// The following arguments are optional:
	TimePeriod GetTagsTimePeriodInput `pulumi:"timePeriod"`
}

func (GetTagsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetTagsArgs)(nil)).Elem()
}

// A collection of values returned by getTags.
type GetTagsResultOutput struct{ *pulumi.OutputState }

func (GetTagsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetTagsResult)(nil)).Elem()
}

func (o GetTagsResultOutput) ToGetTagsResultOutput() GetTagsResultOutput {
	return o
}

func (o GetTagsResultOutput) ToGetTagsResultOutputWithContext(ctx context.Context) GetTagsResultOutput {
	return o
}

func (o GetTagsResultOutput) Filter() GetTagsFilterPtrOutput {
	return o.ApplyT(func(v GetTagsResult) *GetTagsFilter { return v.Filter }).(GetTagsFilterPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetTagsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetTagsResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetTagsResultOutput) SearchString() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetTagsResult) *string { return v.SearchString }).(pulumi.StringPtrOutput)
}

func (o GetTagsResultOutput) SortBies() GetTagsSortByArrayOutput {
	return o.ApplyT(func(v GetTagsResult) []GetTagsSortBy { return v.SortBies }).(GetTagsSortByArrayOutput)
}

func (o GetTagsResultOutput) TagKey() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetTagsResult) *string { return v.TagKey }).(pulumi.StringPtrOutput)
}

// Tags that match your request.
func (o GetTagsResultOutput) Tags() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetTagsResult) []string { return v.Tags }).(pulumi.StringArrayOutput)
}

func (o GetTagsResultOutput) TimePeriod() GetTagsTimePeriodOutput {
	return o.ApplyT(func(v GetTagsResult) GetTagsTimePeriod { return v.TimePeriod }).(GetTagsTimePeriodOutput)
}

func init() {
	pulumi.RegisterOutputType(GetTagsResultOutput{})
}

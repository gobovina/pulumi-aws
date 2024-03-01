// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package ec2

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// `ec2.NetworkInsightsAnalysis` provides details about a specific Network Insights Analysis.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/ec2"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := ec2.LookupNetworkInsightsAnalysis(ctx, &ec2.LookupNetworkInsightsAnalysisArgs{
//				NetworkInsightsAnalysisId: pulumi.StringRef(exampleAwsEc2NetworkInsightsAnalysis.Id),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupNetworkInsightsAnalysis(ctx *pulumi.Context, args *LookupNetworkInsightsAnalysisArgs, opts ...pulumi.InvokeOption) (*LookupNetworkInsightsAnalysisResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupNetworkInsightsAnalysisResult
	err := ctx.Invoke("aws:ec2/getNetworkInsightsAnalysis:getNetworkInsightsAnalysis", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getNetworkInsightsAnalysis.
type LookupNetworkInsightsAnalysisArgs struct {
	// Configuration block(s) for filtering. Detailed below.
	Filters []GetNetworkInsightsAnalysisFilter `pulumi:"filters"`
	// ID of the Network Insights Analysis to select.
	NetworkInsightsAnalysisId *string           `pulumi:"networkInsightsAnalysisId"`
	Tags                      map[string]string `pulumi:"tags"`
}

// A collection of values returned by getNetworkInsightsAnalysis.
type LookupNetworkInsightsAnalysisResult struct {
	// Potential intermediate components of a feasible path.
	AlternatePathHints []GetNetworkInsightsAnalysisAlternatePathHint `pulumi:"alternatePathHints"`
	// ARN of the selected Network Insights Analysis.
	Arn string `pulumi:"arn"`
	// Explanation codes for an unreachable path.
	Explanations []GetNetworkInsightsAnalysisExplanation `pulumi:"explanations"`
	// ARNs of the AWS resources that the path must traverse.
	FilterInArns []string                           `pulumi:"filterInArns"`
	Filters      []GetNetworkInsightsAnalysisFilter `pulumi:"filters"`
	// The components in the path from source to destination.
	ForwardPathComponents []GetNetworkInsightsAnalysisForwardPathComponent `pulumi:"forwardPathComponents"`
	// The provider-assigned unique ID for this managed resource.
	Id                        string `pulumi:"id"`
	NetworkInsightsAnalysisId string `pulumi:"networkInsightsAnalysisId"`
	// The ID of the path.
	NetworkInsightsPathId string `pulumi:"networkInsightsPathId"`
	// Set to `true` if the destination was reachable.
	PathFound bool `pulumi:"pathFound"`
	// The components in the path from destination to source.
	ReturnPathComponents []GetNetworkInsightsAnalysisReturnPathComponent `pulumi:"returnPathComponents"`
	// Date/time the analysis was started.
	StartDate string `pulumi:"startDate"`
	// Status of the analysis. `succeeded` means the analysis was completed, not that a path was found, for that see `pathFound`.
	Status string `pulumi:"status"`
	// Message to provide more context when the `status` is `failed`.
	StatusMessage string            `pulumi:"statusMessage"`
	Tags          map[string]string `pulumi:"tags"`
	// Warning message.
	WarningMessage string `pulumi:"warningMessage"`
}

func LookupNetworkInsightsAnalysisOutput(ctx *pulumi.Context, args LookupNetworkInsightsAnalysisOutputArgs, opts ...pulumi.InvokeOption) LookupNetworkInsightsAnalysisResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupNetworkInsightsAnalysisResult, error) {
			args := v.(LookupNetworkInsightsAnalysisArgs)
			r, err := LookupNetworkInsightsAnalysis(ctx, &args, opts...)
			var s LookupNetworkInsightsAnalysisResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupNetworkInsightsAnalysisResultOutput)
}

// A collection of arguments for invoking getNetworkInsightsAnalysis.
type LookupNetworkInsightsAnalysisOutputArgs struct {
	// Configuration block(s) for filtering. Detailed below.
	Filters GetNetworkInsightsAnalysisFilterArrayInput `pulumi:"filters"`
	// ID of the Network Insights Analysis to select.
	NetworkInsightsAnalysisId pulumi.StringPtrInput `pulumi:"networkInsightsAnalysisId"`
	Tags                      pulumi.StringMapInput `pulumi:"tags"`
}

func (LookupNetworkInsightsAnalysisOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupNetworkInsightsAnalysisArgs)(nil)).Elem()
}

// A collection of values returned by getNetworkInsightsAnalysis.
type LookupNetworkInsightsAnalysisResultOutput struct{ *pulumi.OutputState }

func (LookupNetworkInsightsAnalysisResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupNetworkInsightsAnalysisResult)(nil)).Elem()
}

func (o LookupNetworkInsightsAnalysisResultOutput) ToLookupNetworkInsightsAnalysisResultOutput() LookupNetworkInsightsAnalysisResultOutput {
	return o
}

func (o LookupNetworkInsightsAnalysisResultOutput) ToLookupNetworkInsightsAnalysisResultOutputWithContext(ctx context.Context) LookupNetworkInsightsAnalysisResultOutput {
	return o
}

// Potential intermediate components of a feasible path.
func (o LookupNetworkInsightsAnalysisResultOutput) AlternatePathHints() GetNetworkInsightsAnalysisAlternatePathHintArrayOutput {
	return o.ApplyT(func(v LookupNetworkInsightsAnalysisResult) []GetNetworkInsightsAnalysisAlternatePathHint {
		return v.AlternatePathHints
	}).(GetNetworkInsightsAnalysisAlternatePathHintArrayOutput)
}

// ARN of the selected Network Insights Analysis.
func (o LookupNetworkInsightsAnalysisResultOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNetworkInsightsAnalysisResult) string { return v.Arn }).(pulumi.StringOutput)
}

// Explanation codes for an unreachable path.
func (o LookupNetworkInsightsAnalysisResultOutput) Explanations() GetNetworkInsightsAnalysisExplanationArrayOutput {
	return o.ApplyT(func(v LookupNetworkInsightsAnalysisResult) []GetNetworkInsightsAnalysisExplanation {
		return v.Explanations
	}).(GetNetworkInsightsAnalysisExplanationArrayOutput)
}

// ARNs of the AWS resources that the path must traverse.
func (o LookupNetworkInsightsAnalysisResultOutput) FilterInArns() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupNetworkInsightsAnalysisResult) []string { return v.FilterInArns }).(pulumi.StringArrayOutput)
}

func (o LookupNetworkInsightsAnalysisResultOutput) Filters() GetNetworkInsightsAnalysisFilterArrayOutput {
	return o.ApplyT(func(v LookupNetworkInsightsAnalysisResult) []GetNetworkInsightsAnalysisFilter { return v.Filters }).(GetNetworkInsightsAnalysisFilterArrayOutput)
}

// The components in the path from source to destination.
func (o LookupNetworkInsightsAnalysisResultOutput) ForwardPathComponents() GetNetworkInsightsAnalysisForwardPathComponentArrayOutput {
	return o.ApplyT(func(v LookupNetworkInsightsAnalysisResult) []GetNetworkInsightsAnalysisForwardPathComponent {
		return v.ForwardPathComponents
	}).(GetNetworkInsightsAnalysisForwardPathComponentArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupNetworkInsightsAnalysisResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNetworkInsightsAnalysisResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupNetworkInsightsAnalysisResultOutput) NetworkInsightsAnalysisId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNetworkInsightsAnalysisResult) string { return v.NetworkInsightsAnalysisId }).(pulumi.StringOutput)
}

// The ID of the path.
func (o LookupNetworkInsightsAnalysisResultOutput) NetworkInsightsPathId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNetworkInsightsAnalysisResult) string { return v.NetworkInsightsPathId }).(pulumi.StringOutput)
}

// Set to `true` if the destination was reachable.
func (o LookupNetworkInsightsAnalysisResultOutput) PathFound() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupNetworkInsightsAnalysisResult) bool { return v.PathFound }).(pulumi.BoolOutput)
}

// The components in the path from destination to source.
func (o LookupNetworkInsightsAnalysisResultOutput) ReturnPathComponents() GetNetworkInsightsAnalysisReturnPathComponentArrayOutput {
	return o.ApplyT(func(v LookupNetworkInsightsAnalysisResult) []GetNetworkInsightsAnalysisReturnPathComponent {
		return v.ReturnPathComponents
	}).(GetNetworkInsightsAnalysisReturnPathComponentArrayOutput)
}

// Date/time the analysis was started.
func (o LookupNetworkInsightsAnalysisResultOutput) StartDate() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNetworkInsightsAnalysisResult) string { return v.StartDate }).(pulumi.StringOutput)
}

// Status of the analysis. `succeeded` means the analysis was completed, not that a path was found, for that see `pathFound`.
func (o LookupNetworkInsightsAnalysisResultOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNetworkInsightsAnalysisResult) string { return v.Status }).(pulumi.StringOutput)
}

// Message to provide more context when the `status` is `failed`.
func (o LookupNetworkInsightsAnalysisResultOutput) StatusMessage() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNetworkInsightsAnalysisResult) string { return v.StatusMessage }).(pulumi.StringOutput)
}

func (o LookupNetworkInsightsAnalysisResultOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v LookupNetworkInsightsAnalysisResult) map[string]string { return v.Tags }).(pulumi.StringMapOutput)
}

// Warning message.
func (o LookupNetworkInsightsAnalysisResultOutput) WarningMessage() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNetworkInsightsAnalysisResult) string { return v.WarningMessage }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupNetworkInsightsAnalysisResultOutput{})
}

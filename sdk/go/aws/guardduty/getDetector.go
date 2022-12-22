// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package guardduty

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Retrieve information about a GuardDuty detector.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v5/go/aws/guardduty"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := guardduty.LookupDetector(ctx, nil, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupDetector(ctx *pulumi.Context, args *LookupDetectorArgs, opts ...pulumi.InvokeOption) (*LookupDetectorResult, error) {
	var rv LookupDetectorResult
	err := ctx.Invoke("aws:guardduty/getDetector:getDetector", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getDetector.
type LookupDetectorArgs struct {
	// ID of the detector.
	Id *string `pulumi:"id"`
}

// A collection of values returned by getDetector.
type LookupDetectorResult struct {
	// The frequency of notifications sent about subsequent finding occurrences.
	FindingPublishingFrequency string `pulumi:"findingPublishingFrequency"`
	Id                         string `pulumi:"id"`
	// Service-linked role that grants GuardDuty access to the resources in the AWS account.
	ServiceRoleArn string `pulumi:"serviceRoleArn"`
	// Current status of the detector.
	Status string `pulumi:"status"`
}

func LookupDetectorOutput(ctx *pulumi.Context, args LookupDetectorOutputArgs, opts ...pulumi.InvokeOption) LookupDetectorResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupDetectorResult, error) {
			args := v.(LookupDetectorArgs)
			r, err := LookupDetector(ctx, &args, opts...)
			var s LookupDetectorResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupDetectorResultOutput)
}

// A collection of arguments for invoking getDetector.
type LookupDetectorOutputArgs struct {
	// ID of the detector.
	Id pulumi.StringPtrInput `pulumi:"id"`
}

func (LookupDetectorOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupDetectorArgs)(nil)).Elem()
}

// A collection of values returned by getDetector.
type LookupDetectorResultOutput struct{ *pulumi.OutputState }

func (LookupDetectorResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupDetectorResult)(nil)).Elem()
}

func (o LookupDetectorResultOutput) ToLookupDetectorResultOutput() LookupDetectorResultOutput {
	return o
}

func (o LookupDetectorResultOutput) ToLookupDetectorResultOutputWithContext(ctx context.Context) LookupDetectorResultOutput {
	return o
}

// The frequency of notifications sent about subsequent finding occurrences.
func (o LookupDetectorResultOutput) FindingPublishingFrequency() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDetectorResult) string { return v.FindingPublishingFrequency }).(pulumi.StringOutput)
}

func (o LookupDetectorResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDetectorResult) string { return v.Id }).(pulumi.StringOutput)
}

// Service-linked role that grants GuardDuty access to the resources in the AWS account.
func (o LookupDetectorResultOutput) ServiceRoleArn() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDetectorResult) string { return v.ServiceRoleArn }).(pulumi.StringOutput)
}

// Current status of the detector.
func (o LookupDetectorResultOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDetectorResult) string { return v.Status }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupDetectorResultOutput{})
}

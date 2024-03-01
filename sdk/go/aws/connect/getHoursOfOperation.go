// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package connect

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides details about a specific Amazon Connect Hours of Operation.
//
// ## Example Usage
//
// By `name`
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
//			_, err := connect.LookupHoursOfOperation(ctx, &connect.LookupHoursOfOperationArgs{
//				InstanceId: "aaaaaaaa-bbbb-cccc-dddd-111111111111",
//				Name:       pulumi.StringRef("Test"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// By `hoursOfOperationId`
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
//			_, err := connect.LookupHoursOfOperation(ctx, &connect.LookupHoursOfOperationArgs{
//				InstanceId:         "aaaaaaaa-bbbb-cccc-dddd-111111111111",
//				HoursOfOperationId: pulumi.StringRef("cccccccc-bbbb-cccc-dddd-111111111111"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupHoursOfOperation(ctx *pulumi.Context, args *LookupHoursOfOperationArgs, opts ...pulumi.InvokeOption) (*LookupHoursOfOperationResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupHoursOfOperationResult
	err := ctx.Invoke("aws:connect/getHoursOfOperation:getHoursOfOperation", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getHoursOfOperation.
type LookupHoursOfOperationArgs struct {
	// Returns information on a specific Hours of Operation by hours of operation id
	HoursOfOperationId *string `pulumi:"hoursOfOperationId"`
	// Reference to the hosting Amazon Connect Instance
	InstanceId string `pulumi:"instanceId"`
	// Returns information on a specific Hours of Operation by name
	Name *string `pulumi:"name"`
	// Map of tags to assign to the Hours of Operation.
	Tags map[string]string `pulumi:"tags"`
}

// A collection of values returned by getHoursOfOperation.
type LookupHoursOfOperationResult struct {
	// ARN of the Hours of Operation.
	Arn string `pulumi:"arn"`
	// Configuration information for the hours of operation: day, start time, and end time . Config blocks are documented below. Config blocks are documented below.
	Configs []GetHoursOfOperationConfig `pulumi:"configs"`
	// Description of the Hours of Operation.
	Description string `pulumi:"description"`
	// The identifier for the hours of operation.
	HoursOfOperationId string `pulumi:"hoursOfOperationId"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Identifier of the hosting Amazon Connect Instance.
	InstanceId string `pulumi:"instanceId"`
	// Name of the Hours of Operation.
	Name string `pulumi:"name"`
	// Map of tags to assign to the Hours of Operation.
	Tags map[string]string `pulumi:"tags"`
	// Time zone of the Hours of Operation.
	TimeZone string `pulumi:"timeZone"`
}

func LookupHoursOfOperationOutput(ctx *pulumi.Context, args LookupHoursOfOperationOutputArgs, opts ...pulumi.InvokeOption) LookupHoursOfOperationResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupHoursOfOperationResult, error) {
			args := v.(LookupHoursOfOperationArgs)
			r, err := LookupHoursOfOperation(ctx, &args, opts...)
			var s LookupHoursOfOperationResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupHoursOfOperationResultOutput)
}

// A collection of arguments for invoking getHoursOfOperation.
type LookupHoursOfOperationOutputArgs struct {
	// Returns information on a specific Hours of Operation by hours of operation id
	HoursOfOperationId pulumi.StringPtrInput `pulumi:"hoursOfOperationId"`
	// Reference to the hosting Amazon Connect Instance
	InstanceId pulumi.StringInput `pulumi:"instanceId"`
	// Returns information on a specific Hours of Operation by name
	Name pulumi.StringPtrInput `pulumi:"name"`
	// Map of tags to assign to the Hours of Operation.
	Tags pulumi.StringMapInput `pulumi:"tags"`
}

func (LookupHoursOfOperationOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupHoursOfOperationArgs)(nil)).Elem()
}

// A collection of values returned by getHoursOfOperation.
type LookupHoursOfOperationResultOutput struct{ *pulumi.OutputState }

func (LookupHoursOfOperationResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupHoursOfOperationResult)(nil)).Elem()
}

func (o LookupHoursOfOperationResultOutput) ToLookupHoursOfOperationResultOutput() LookupHoursOfOperationResultOutput {
	return o
}

func (o LookupHoursOfOperationResultOutput) ToLookupHoursOfOperationResultOutputWithContext(ctx context.Context) LookupHoursOfOperationResultOutput {
	return o
}

// ARN of the Hours of Operation.
func (o LookupHoursOfOperationResultOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v LookupHoursOfOperationResult) string { return v.Arn }).(pulumi.StringOutput)
}

// Configuration information for the hours of operation: day, start time, and end time . Config blocks are documented below. Config blocks are documented below.
func (o LookupHoursOfOperationResultOutput) Configs() GetHoursOfOperationConfigArrayOutput {
	return o.ApplyT(func(v LookupHoursOfOperationResult) []GetHoursOfOperationConfig { return v.Configs }).(GetHoursOfOperationConfigArrayOutput)
}

// Description of the Hours of Operation.
func (o LookupHoursOfOperationResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupHoursOfOperationResult) string { return v.Description }).(pulumi.StringOutput)
}

// The identifier for the hours of operation.
func (o LookupHoursOfOperationResultOutput) HoursOfOperationId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupHoursOfOperationResult) string { return v.HoursOfOperationId }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupHoursOfOperationResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupHoursOfOperationResult) string { return v.Id }).(pulumi.StringOutput)
}

// Identifier of the hosting Amazon Connect Instance.
func (o LookupHoursOfOperationResultOutput) InstanceId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupHoursOfOperationResult) string { return v.InstanceId }).(pulumi.StringOutput)
}

// Name of the Hours of Operation.
func (o LookupHoursOfOperationResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupHoursOfOperationResult) string { return v.Name }).(pulumi.StringOutput)
}

// Map of tags to assign to the Hours of Operation.
func (o LookupHoursOfOperationResultOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v LookupHoursOfOperationResult) map[string]string { return v.Tags }).(pulumi.StringMapOutput)
}

// Time zone of the Hours of Operation.
func (o LookupHoursOfOperationResultOutput) TimeZone() pulumi.StringOutput {
	return o.ApplyT(func(v LookupHoursOfOperationResult) string { return v.TimeZone }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupHoursOfOperationResultOutput{})
}

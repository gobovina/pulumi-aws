// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cloudwatch

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to get information about an EventBridge Partner Event Source. This data source will only return one partner event source. An error will be returned if multiple sources match the same name prefix.
//
// > **Note:** EventBridge was formerly known as CloudWatch Events. The functionality is identical.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v5/go/aws/cloudwatch"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := cloudwatch.GetEventSource(ctx, &cloudwatch.GetEventSourceArgs{
//				NamePrefix: pulumi.StringRef("aws.partner/examplepartner.com"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func GetEventSource(ctx *pulumi.Context, args *GetEventSourceArgs, opts ...pulumi.InvokeOption) (*GetEventSourceResult, error) {
	var rv GetEventSourceResult
	err := ctx.Invoke("aws:cloudwatch/getEventSource:getEventSource", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getEventSource.
type GetEventSourceArgs struct {
	// Specifying this limits the results to only those partner event sources with names that start with the specified prefix
	NamePrefix *string `pulumi:"namePrefix"`
}

// A collection of values returned by getEventSource.
type GetEventSourceResult struct {
	// ARN of the partner event source
	Arn string `pulumi:"arn"`
	// Name of the SaaS partner that created the event source
	CreatedBy string `pulumi:"createdBy"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Name of the event source
	Name       string  `pulumi:"name"`
	NamePrefix *string `pulumi:"namePrefix"`
	// State of the event source (`ACTIVE` or `PENDING`)
	State string `pulumi:"state"`
}

func GetEventSourceOutput(ctx *pulumi.Context, args GetEventSourceOutputArgs, opts ...pulumi.InvokeOption) GetEventSourceResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetEventSourceResult, error) {
			args := v.(GetEventSourceArgs)
			r, err := GetEventSource(ctx, &args, opts...)
			var s GetEventSourceResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetEventSourceResultOutput)
}

// A collection of arguments for invoking getEventSource.
type GetEventSourceOutputArgs struct {
	// Specifying this limits the results to only those partner event sources with names that start with the specified prefix
	NamePrefix pulumi.StringPtrInput `pulumi:"namePrefix"`
}

func (GetEventSourceOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetEventSourceArgs)(nil)).Elem()
}

// A collection of values returned by getEventSource.
type GetEventSourceResultOutput struct{ *pulumi.OutputState }

func (GetEventSourceResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetEventSourceResult)(nil)).Elem()
}

func (o GetEventSourceResultOutput) ToGetEventSourceResultOutput() GetEventSourceResultOutput {
	return o
}

func (o GetEventSourceResultOutput) ToGetEventSourceResultOutputWithContext(ctx context.Context) GetEventSourceResultOutput {
	return o
}

// ARN of the partner event source
func (o GetEventSourceResultOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v GetEventSourceResult) string { return v.Arn }).(pulumi.StringOutput)
}

// Name of the SaaS partner that created the event source
func (o GetEventSourceResultOutput) CreatedBy() pulumi.StringOutput {
	return o.ApplyT(func(v GetEventSourceResult) string { return v.CreatedBy }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetEventSourceResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetEventSourceResult) string { return v.Id }).(pulumi.StringOutput)
}

// Name of the event source
func (o GetEventSourceResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v GetEventSourceResult) string { return v.Name }).(pulumi.StringOutput)
}

func (o GetEventSourceResultOutput) NamePrefix() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetEventSourceResult) *string { return v.NamePrefix }).(pulumi.StringPtrOutput)
}

// State of the event source (`ACTIVE` or `PENDING`)
func (o GetEventSourceResultOutput) State() pulumi.StringOutput {
	return o.ApplyT(func(v GetEventSourceResult) string { return v.State }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetEventSourceResultOutput{})
}

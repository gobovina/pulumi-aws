// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package outposts

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Information about Outposts Instance Types.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v5/go/aws/outposts"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := outposts.GetOutpostInstanceTypes(ctx, &outposts.GetOutpostInstanceTypesArgs{
//				Arn: data.Aws_outposts_outpost.Example.Arn,
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func GetOutpostInstanceTypes(ctx *pulumi.Context, args *GetOutpostInstanceTypesArgs, opts ...pulumi.InvokeOption) (*GetOutpostInstanceTypesResult, error) {
	var rv GetOutpostInstanceTypesResult
	err := ctx.Invoke("aws:outposts/getOutpostInstanceTypes:getOutpostInstanceTypes", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getOutpostInstanceTypes.
type GetOutpostInstanceTypesArgs struct {
	// Outpost ARN.
	Arn string `pulumi:"arn"`
}

// A collection of values returned by getOutpostInstanceTypes.
type GetOutpostInstanceTypesResult struct {
	Arn string `pulumi:"arn"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Set of instance types.
	InstanceTypes []string `pulumi:"instanceTypes"`
}

func GetOutpostInstanceTypesOutput(ctx *pulumi.Context, args GetOutpostInstanceTypesOutputArgs, opts ...pulumi.InvokeOption) GetOutpostInstanceTypesResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetOutpostInstanceTypesResult, error) {
			args := v.(GetOutpostInstanceTypesArgs)
			r, err := GetOutpostInstanceTypes(ctx, &args, opts...)
			var s GetOutpostInstanceTypesResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetOutpostInstanceTypesResultOutput)
}

// A collection of arguments for invoking getOutpostInstanceTypes.
type GetOutpostInstanceTypesOutputArgs struct {
	// Outpost ARN.
	Arn pulumi.StringInput `pulumi:"arn"`
}

func (GetOutpostInstanceTypesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetOutpostInstanceTypesArgs)(nil)).Elem()
}

// A collection of values returned by getOutpostInstanceTypes.
type GetOutpostInstanceTypesResultOutput struct{ *pulumi.OutputState }

func (GetOutpostInstanceTypesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetOutpostInstanceTypesResult)(nil)).Elem()
}

func (o GetOutpostInstanceTypesResultOutput) ToGetOutpostInstanceTypesResultOutput() GetOutpostInstanceTypesResultOutput {
	return o
}

func (o GetOutpostInstanceTypesResultOutput) ToGetOutpostInstanceTypesResultOutputWithContext(ctx context.Context) GetOutpostInstanceTypesResultOutput {
	return o
}

func (o GetOutpostInstanceTypesResultOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v GetOutpostInstanceTypesResult) string { return v.Arn }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetOutpostInstanceTypesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetOutpostInstanceTypesResult) string { return v.Id }).(pulumi.StringOutput)
}

// Set of instance types.
func (o GetOutpostInstanceTypesResultOutput) InstanceTypes() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetOutpostInstanceTypesResult) []string { return v.InstanceTypes }).(pulumi.StringArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetOutpostInstanceTypesResultOutput{})
}

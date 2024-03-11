// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package ec2

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a list of Elastic IPs in a region.
//
// ## Example Usage
//
// The following shows outputting all Elastic IPs with the a specific tag value.
//
// <!--Start PulumiCodeChooser -->
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
//			example, err := ec2.GetEips(ctx, &ec2.GetEipsArgs{
//				Tags: map[string]interface{}{
//					"Env": "dev",
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("allocationIds", example.AllocationIds)
//			ctx.Export("publicIps", example.PublicIps)
//			return nil
//		})
//	}
//
// ```
// <!--End PulumiCodeChooser -->
func GetEips(ctx *pulumi.Context, args *GetEipsArgs, opts ...pulumi.InvokeOption) (*GetEipsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetEipsResult
	err := ctx.Invoke("aws:ec2/getEips:getEips", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getEips.
type GetEipsArgs struct {
	// Custom filter block as described below.
	Filters []GetEipsFilter `pulumi:"filters"`
	// Map of tags, each pair of which must exactly match a pair on the desired Elastic IPs.
	Tags map[string]string `pulumi:"tags"`
}

// A collection of values returned by getEips.
type GetEipsResult struct {
	// List of all the allocation IDs for address for use with EC2-VPC.
	AllocationIds []string        `pulumi:"allocationIds"`
	Filters       []GetEipsFilter `pulumi:"filters"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// List of all the Elastic IP addresses.
	PublicIps []string          `pulumi:"publicIps"`
	Tags      map[string]string `pulumi:"tags"`
}

func GetEipsOutput(ctx *pulumi.Context, args GetEipsOutputArgs, opts ...pulumi.InvokeOption) GetEipsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetEipsResult, error) {
			args := v.(GetEipsArgs)
			r, err := GetEips(ctx, &args, opts...)
			var s GetEipsResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetEipsResultOutput)
}

// A collection of arguments for invoking getEips.
type GetEipsOutputArgs struct {
	// Custom filter block as described below.
	Filters GetEipsFilterArrayInput `pulumi:"filters"`
	// Map of tags, each pair of which must exactly match a pair on the desired Elastic IPs.
	Tags pulumi.StringMapInput `pulumi:"tags"`
}

func (GetEipsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetEipsArgs)(nil)).Elem()
}

// A collection of values returned by getEips.
type GetEipsResultOutput struct{ *pulumi.OutputState }

func (GetEipsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetEipsResult)(nil)).Elem()
}

func (o GetEipsResultOutput) ToGetEipsResultOutput() GetEipsResultOutput {
	return o
}

func (o GetEipsResultOutput) ToGetEipsResultOutputWithContext(ctx context.Context) GetEipsResultOutput {
	return o
}

// List of all the allocation IDs for address for use with EC2-VPC.
func (o GetEipsResultOutput) AllocationIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetEipsResult) []string { return v.AllocationIds }).(pulumi.StringArrayOutput)
}

func (o GetEipsResultOutput) Filters() GetEipsFilterArrayOutput {
	return o.ApplyT(func(v GetEipsResult) []GetEipsFilter { return v.Filters }).(GetEipsFilterArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetEipsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetEipsResult) string { return v.Id }).(pulumi.StringOutput)
}

// List of all the Elastic IP addresses.
func (o GetEipsResultOutput) PublicIps() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetEipsResult) []string { return v.PublicIps }).(pulumi.StringArrayOutput)
}

func (o GetEipsResultOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v GetEipsResult) map[string]string { return v.Tags }).(pulumi.StringMapOutput)
}

func init() {
	pulumi.RegisterOutputType(GetEipsResultOutput{})
}

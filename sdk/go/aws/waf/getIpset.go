// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package waf

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// `waf.IpSet` Retrieves a WAF IP Set Resource Id.
//
// ## Example Usage
//
// <!--Start PulumiCodeChooser -->
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/waf"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := waf.GetIpset(ctx, &waf.GetIpsetArgs{
//				Name: "tfWAFIPSet",
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
func GetIpset(ctx *pulumi.Context, args *GetIpsetArgs, opts ...pulumi.InvokeOption) (*GetIpsetResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetIpsetResult
	err := ctx.Invoke("aws:waf/getIpset:getIpset", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getIpset.
type GetIpsetArgs struct {
	// Name of the WAF IP set.
	Name string `pulumi:"name"`
}

// A collection of values returned by getIpset.
type GetIpsetResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id   string `pulumi:"id"`
	Name string `pulumi:"name"`
}

func GetIpsetOutput(ctx *pulumi.Context, args GetIpsetOutputArgs, opts ...pulumi.InvokeOption) GetIpsetResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetIpsetResult, error) {
			args := v.(GetIpsetArgs)
			r, err := GetIpset(ctx, &args, opts...)
			var s GetIpsetResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetIpsetResultOutput)
}

// A collection of arguments for invoking getIpset.
type GetIpsetOutputArgs struct {
	// Name of the WAF IP set.
	Name pulumi.StringInput `pulumi:"name"`
}

func (GetIpsetOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetIpsetArgs)(nil)).Elem()
}

// A collection of values returned by getIpset.
type GetIpsetResultOutput struct{ *pulumi.OutputState }

func (GetIpsetResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetIpsetResult)(nil)).Elem()
}

func (o GetIpsetResultOutput) ToGetIpsetResultOutput() GetIpsetResultOutput {
	return o
}

func (o GetIpsetResultOutput) ToGetIpsetResultOutputWithContext(ctx context.Context) GetIpsetResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o GetIpsetResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetIpsetResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetIpsetResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v GetIpsetResult) string { return v.Name }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetIpsetResultOutput{})
}

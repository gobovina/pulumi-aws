// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package networkmanager

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Retrieve information about a global network.
//
// ## Example Usage
//
// <!--Start PulumiCodeChooser -->
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/networkmanager"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := networkmanager.LookupGlobalNetwork(ctx, &networkmanager.LookupGlobalNetworkArgs{
//				GlobalNetworkId: globalNetworkId,
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
func LookupGlobalNetwork(ctx *pulumi.Context, args *LookupGlobalNetworkArgs, opts ...pulumi.InvokeOption) (*LookupGlobalNetworkResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupGlobalNetworkResult
	err := ctx.Invoke("aws:networkmanager/getGlobalNetwork:getGlobalNetwork", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getGlobalNetwork.
type LookupGlobalNetworkArgs struct {
	// ID of the specific global network to retrieve.
	GlobalNetworkId string `pulumi:"globalNetworkId"`
	// Map of resource tags.
	Tags map[string]string `pulumi:"tags"`
}

// A collection of values returned by getGlobalNetwork.
type LookupGlobalNetworkResult struct {
	// ARN of the global network.
	Arn string `pulumi:"arn"`
	// Description of the global network.
	Description     string `pulumi:"description"`
	GlobalNetworkId string `pulumi:"globalNetworkId"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Map of resource tags.
	Tags map[string]string `pulumi:"tags"`
}

func LookupGlobalNetworkOutput(ctx *pulumi.Context, args LookupGlobalNetworkOutputArgs, opts ...pulumi.InvokeOption) LookupGlobalNetworkResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupGlobalNetworkResult, error) {
			args := v.(LookupGlobalNetworkArgs)
			r, err := LookupGlobalNetwork(ctx, &args, opts...)
			var s LookupGlobalNetworkResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupGlobalNetworkResultOutput)
}

// A collection of arguments for invoking getGlobalNetwork.
type LookupGlobalNetworkOutputArgs struct {
	// ID of the specific global network to retrieve.
	GlobalNetworkId pulumi.StringInput `pulumi:"globalNetworkId"`
	// Map of resource tags.
	Tags pulumi.StringMapInput `pulumi:"tags"`
}

func (LookupGlobalNetworkOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupGlobalNetworkArgs)(nil)).Elem()
}

// A collection of values returned by getGlobalNetwork.
type LookupGlobalNetworkResultOutput struct{ *pulumi.OutputState }

func (LookupGlobalNetworkResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupGlobalNetworkResult)(nil)).Elem()
}

func (o LookupGlobalNetworkResultOutput) ToLookupGlobalNetworkResultOutput() LookupGlobalNetworkResultOutput {
	return o
}

func (o LookupGlobalNetworkResultOutput) ToLookupGlobalNetworkResultOutputWithContext(ctx context.Context) LookupGlobalNetworkResultOutput {
	return o
}

// ARN of the global network.
func (o LookupGlobalNetworkResultOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v LookupGlobalNetworkResult) string { return v.Arn }).(pulumi.StringOutput)
}

// Description of the global network.
func (o LookupGlobalNetworkResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupGlobalNetworkResult) string { return v.Description }).(pulumi.StringOutput)
}

func (o LookupGlobalNetworkResultOutput) GlobalNetworkId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupGlobalNetworkResult) string { return v.GlobalNetworkId }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupGlobalNetworkResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupGlobalNetworkResult) string { return v.Id }).(pulumi.StringOutput)
}

// Map of resource tags.
func (o LookupGlobalNetworkResultOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v LookupGlobalNetworkResult) map[string]string { return v.Tags }).(pulumi.StringMapOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupGlobalNetworkResultOutput{})
}

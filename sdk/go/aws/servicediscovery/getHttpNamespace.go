// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package servicediscovery

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Example Usage
//
// <!--Start PulumiCodeChooser -->
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/servicediscovery"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := servicediscovery.LookupHttpNamespace(ctx, &servicediscovery.LookupHttpNamespaceArgs{
//				Name: "development",
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
func LookupHttpNamespace(ctx *pulumi.Context, args *LookupHttpNamespaceArgs, opts ...pulumi.InvokeOption) (*LookupHttpNamespaceResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupHttpNamespaceResult
	err := ctx.Invoke("aws:servicediscovery/getHttpNamespace:getHttpNamespace", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getHttpNamespace.
type LookupHttpNamespaceArgs struct {
	// Name of the http namespace.
	Name string `pulumi:"name"`
	// Map of tags for the resource.
	Tags map[string]string `pulumi:"tags"`
}

// A collection of values returned by getHttpNamespace.
type LookupHttpNamespaceResult struct {
	// ARN that Amazon Route 53 assigns to the namespace when you create it.
	Arn string `pulumi:"arn"`
	// Description that you specify for the namespace when you create it.
	Description string `pulumi:"description"`
	// Name of an HTTP namespace.
	HttpName string `pulumi:"httpName"`
	// The provider-assigned unique ID for this managed resource.
	Id   string `pulumi:"id"`
	Name string `pulumi:"name"`
	// Map of tags for the resource.
	Tags map[string]string `pulumi:"tags"`
}

func LookupHttpNamespaceOutput(ctx *pulumi.Context, args LookupHttpNamespaceOutputArgs, opts ...pulumi.InvokeOption) LookupHttpNamespaceResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupHttpNamespaceResult, error) {
			args := v.(LookupHttpNamespaceArgs)
			r, err := LookupHttpNamespace(ctx, &args, opts...)
			var s LookupHttpNamespaceResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupHttpNamespaceResultOutput)
}

// A collection of arguments for invoking getHttpNamespace.
type LookupHttpNamespaceOutputArgs struct {
	// Name of the http namespace.
	Name pulumi.StringInput `pulumi:"name"`
	// Map of tags for the resource.
	Tags pulumi.StringMapInput `pulumi:"tags"`
}

func (LookupHttpNamespaceOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupHttpNamespaceArgs)(nil)).Elem()
}

// A collection of values returned by getHttpNamespace.
type LookupHttpNamespaceResultOutput struct{ *pulumi.OutputState }

func (LookupHttpNamespaceResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupHttpNamespaceResult)(nil)).Elem()
}

func (o LookupHttpNamespaceResultOutput) ToLookupHttpNamespaceResultOutput() LookupHttpNamespaceResultOutput {
	return o
}

func (o LookupHttpNamespaceResultOutput) ToLookupHttpNamespaceResultOutputWithContext(ctx context.Context) LookupHttpNamespaceResultOutput {
	return o
}

// ARN that Amazon Route 53 assigns to the namespace when you create it.
func (o LookupHttpNamespaceResultOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v LookupHttpNamespaceResult) string { return v.Arn }).(pulumi.StringOutput)
}

// Description that you specify for the namespace when you create it.
func (o LookupHttpNamespaceResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupHttpNamespaceResult) string { return v.Description }).(pulumi.StringOutput)
}

// Name of an HTTP namespace.
func (o LookupHttpNamespaceResultOutput) HttpName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupHttpNamespaceResult) string { return v.HttpName }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupHttpNamespaceResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupHttpNamespaceResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupHttpNamespaceResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupHttpNamespaceResult) string { return v.Name }).(pulumi.StringOutput)
}

// Map of tags for the resource.
func (o LookupHttpNamespaceResultOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v LookupHttpNamespaceResult) map[string]string { return v.Tags }).(pulumi.StringMapOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupHttpNamespaceResultOutput{})
}

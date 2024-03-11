// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package directconnect

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Retrieve information about a Direct Connect Connection.
//
// ## Example Usage
//
// <!--Start PulumiCodeChooser -->
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/directconnect"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := directconnect.LookupConnection(ctx, &directconnect.LookupConnectionArgs{
//				Name: "tf-dx-connection",
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
func LookupConnection(ctx *pulumi.Context, args *LookupConnectionArgs, opts ...pulumi.InvokeOption) (*LookupConnectionResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupConnectionResult
	err := ctx.Invoke("aws:directconnect/getConnection:getConnection", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getConnection.
type LookupConnectionArgs struct {
	// Name of the connection to retrieve.
	Name string `pulumi:"name"`
	// Map of tags for the resource.
	Tags map[string]string `pulumi:"tags"`
}

// A collection of values returned by getConnection.
type LookupConnectionResult struct {
	// ARN of the connection.
	Arn string `pulumi:"arn"`
	// Direct Connect endpoint on which the physical connection terminates.
	AwsDevice string `pulumi:"awsDevice"`
	// Bandwidth of the connection.
	Bandwidth string `pulumi:"bandwidth"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// AWS Direct Connect location where the connection is located.
	Location string `pulumi:"location"`
	Name     string `pulumi:"name"`
	// ID of the AWS account that owns the connection.
	OwnerAccountId string `pulumi:"ownerAccountId"`
	// The name of the AWS Direct Connect service provider associated with the connection.
	PartnerName string `pulumi:"partnerName"`
	// Name of the service provider associated with the connection.
	ProviderName string `pulumi:"providerName"`
	// Map of tags for the resource.
	Tags map[string]string `pulumi:"tags"`
	// The VLAN ID.
	VlanId int `pulumi:"vlanId"`
}

func LookupConnectionOutput(ctx *pulumi.Context, args LookupConnectionOutputArgs, opts ...pulumi.InvokeOption) LookupConnectionResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupConnectionResult, error) {
			args := v.(LookupConnectionArgs)
			r, err := LookupConnection(ctx, &args, opts...)
			var s LookupConnectionResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupConnectionResultOutput)
}

// A collection of arguments for invoking getConnection.
type LookupConnectionOutputArgs struct {
	// Name of the connection to retrieve.
	Name pulumi.StringInput `pulumi:"name"`
	// Map of tags for the resource.
	Tags pulumi.StringMapInput `pulumi:"tags"`
}

func (LookupConnectionOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupConnectionArgs)(nil)).Elem()
}

// A collection of values returned by getConnection.
type LookupConnectionResultOutput struct{ *pulumi.OutputState }

func (LookupConnectionResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupConnectionResult)(nil)).Elem()
}

func (o LookupConnectionResultOutput) ToLookupConnectionResultOutput() LookupConnectionResultOutput {
	return o
}

func (o LookupConnectionResultOutput) ToLookupConnectionResultOutputWithContext(ctx context.Context) LookupConnectionResultOutput {
	return o
}

// ARN of the connection.
func (o LookupConnectionResultOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v LookupConnectionResult) string { return v.Arn }).(pulumi.StringOutput)
}

// Direct Connect endpoint on which the physical connection terminates.
func (o LookupConnectionResultOutput) AwsDevice() pulumi.StringOutput {
	return o.ApplyT(func(v LookupConnectionResult) string { return v.AwsDevice }).(pulumi.StringOutput)
}

// Bandwidth of the connection.
func (o LookupConnectionResultOutput) Bandwidth() pulumi.StringOutput {
	return o.ApplyT(func(v LookupConnectionResult) string { return v.Bandwidth }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupConnectionResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupConnectionResult) string { return v.Id }).(pulumi.StringOutput)
}

// AWS Direct Connect location where the connection is located.
func (o LookupConnectionResultOutput) Location() pulumi.StringOutput {
	return o.ApplyT(func(v LookupConnectionResult) string { return v.Location }).(pulumi.StringOutput)
}

func (o LookupConnectionResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupConnectionResult) string { return v.Name }).(pulumi.StringOutput)
}

// ID of the AWS account that owns the connection.
func (o LookupConnectionResultOutput) OwnerAccountId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupConnectionResult) string { return v.OwnerAccountId }).(pulumi.StringOutput)
}

// The name of the AWS Direct Connect service provider associated with the connection.
func (o LookupConnectionResultOutput) PartnerName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupConnectionResult) string { return v.PartnerName }).(pulumi.StringOutput)
}

// Name of the service provider associated with the connection.
func (o LookupConnectionResultOutput) ProviderName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupConnectionResult) string { return v.ProviderName }).(pulumi.StringOutput)
}

// Map of tags for the resource.
func (o LookupConnectionResultOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v LookupConnectionResult) map[string]string { return v.Tags }).(pulumi.StringMapOutput)
}

// The VLAN ID.
func (o LookupConnectionResultOutput) VlanId() pulumi.IntOutput {
	return o.ApplyT(func(v LookupConnectionResult) int { return v.VlanId }).(pulumi.IntOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupConnectionResultOutput{})
}

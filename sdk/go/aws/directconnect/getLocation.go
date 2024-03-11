// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package directconnect

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Retrieve information about a specific AWS Direct Connect location in the current AWS Region.
// These are the locations that can be specified when configuring `directconnect.Connection` or `directconnect.LinkAggregationGroup` resources.
//
// > **Note:** This data source is different from the `directconnect.getLocations` data source which retrieves information about all the AWS Direct Connect locations in the current AWS Region.
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
//			_, err := directconnect.GetLocation(ctx, &directconnect.GetLocationArgs{
//				LocationCode: "CS32A-24FL",
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
func GetLocation(ctx *pulumi.Context, args *GetLocationArgs, opts ...pulumi.InvokeOption) (*GetLocationResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetLocationResult
	err := ctx.Invoke("aws:directconnect/getLocation:getLocation", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getLocation.
type GetLocationArgs struct {
	// Code for the location to retrieve.
	LocationCode string `pulumi:"locationCode"`
}

// A collection of values returned by getLocation.
type GetLocationResult struct {
	// The available MAC Security (MACsec) port speeds for the location.
	AvailableMacsecPortSpeeds []string `pulumi:"availableMacsecPortSpeeds"`
	// The available port speeds for the location.
	AvailablePortSpeeds []string `pulumi:"availablePortSpeeds"`
	// Names of the service providers for the location.
	AvailableProviders []string `pulumi:"availableProviders"`
	// The provider-assigned unique ID for this managed resource.
	Id           string `pulumi:"id"`
	LocationCode string `pulumi:"locationCode"`
	// Name of the location. This includes the name of the colocation partner and the physical site of the building.
	LocationName string `pulumi:"locationName"`
}

func GetLocationOutput(ctx *pulumi.Context, args GetLocationOutputArgs, opts ...pulumi.InvokeOption) GetLocationResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetLocationResult, error) {
			args := v.(GetLocationArgs)
			r, err := GetLocation(ctx, &args, opts...)
			var s GetLocationResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetLocationResultOutput)
}

// A collection of arguments for invoking getLocation.
type GetLocationOutputArgs struct {
	// Code for the location to retrieve.
	LocationCode pulumi.StringInput `pulumi:"locationCode"`
}

func (GetLocationOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetLocationArgs)(nil)).Elem()
}

// A collection of values returned by getLocation.
type GetLocationResultOutput struct{ *pulumi.OutputState }

func (GetLocationResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetLocationResult)(nil)).Elem()
}

func (o GetLocationResultOutput) ToGetLocationResultOutput() GetLocationResultOutput {
	return o
}

func (o GetLocationResultOutput) ToGetLocationResultOutputWithContext(ctx context.Context) GetLocationResultOutput {
	return o
}

// The available MAC Security (MACsec) port speeds for the location.
func (o GetLocationResultOutput) AvailableMacsecPortSpeeds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetLocationResult) []string { return v.AvailableMacsecPortSpeeds }).(pulumi.StringArrayOutput)
}

// The available port speeds for the location.
func (o GetLocationResultOutput) AvailablePortSpeeds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetLocationResult) []string { return v.AvailablePortSpeeds }).(pulumi.StringArrayOutput)
}

// Names of the service providers for the location.
func (o GetLocationResultOutput) AvailableProviders() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetLocationResult) []string { return v.AvailableProviders }).(pulumi.StringArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetLocationResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetLocationResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetLocationResultOutput) LocationCode() pulumi.StringOutput {
	return o.ApplyT(func(v GetLocationResult) string { return v.LocationCode }).(pulumi.StringOutput)
}

// Name of the location. This includes the name of the colocation partner and the physical site of the building.
func (o GetLocationResultOutput) LocationName() pulumi.StringOutput {
	return o.ApplyT(func(v GetLocationResult) string { return v.LocationName }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetLocationResultOutput{})
}

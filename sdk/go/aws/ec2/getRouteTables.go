// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package ec2

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This resource can be useful for getting back a list of route table ids to be referenced elsewhere.
func GetRouteTables(ctx *pulumi.Context, args *GetRouteTablesArgs, opts ...pulumi.InvokeOption) (*GetRouteTablesResult, error) {
	var rv GetRouteTablesResult
	err := ctx.Invoke("aws:ec2/getRouteTables:getRouteTables", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getRouteTables.
type GetRouteTablesArgs struct {
	// Custom filter block as described below.
	Filters []GetRouteTablesFilter `pulumi:"filters"`
	// A map of tags, each pair of which must exactly match
	// a pair on the desired route tables.
	Tags map[string]string `pulumi:"tags"`
	// The VPC ID that you want to filter from.
	VpcId *string `pulumi:"vpcId"`
}

// A collection of values returned by getRouteTables.
type GetRouteTablesResult struct {
	Filters []GetRouteTablesFilter `pulumi:"filters"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// A set of all the route table ids found. This data source will fail if none are found.
	Ids   []string          `pulumi:"ids"`
	Tags  map[string]string `pulumi:"tags"`
	VpcId *string           `pulumi:"vpcId"`
}

func GetRouteTablesOutput(ctx *pulumi.Context, args GetRouteTablesOutputArgs, opts ...pulumi.InvokeOption) GetRouteTablesResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetRouteTablesResult, error) {
			args := v.(GetRouteTablesArgs)
			r, err := GetRouteTables(ctx, &args, opts...)
			return *r, err
		}).(GetRouteTablesResultOutput)
}

// A collection of arguments for invoking getRouteTables.
type GetRouteTablesOutputArgs struct {
	// Custom filter block as described below.
	Filters GetRouteTablesFilterArrayInput `pulumi:"filters"`
	// A map of tags, each pair of which must exactly match
	// a pair on the desired route tables.
	Tags pulumi.StringMapInput `pulumi:"tags"`
	// The VPC ID that you want to filter from.
	VpcId pulumi.StringPtrInput `pulumi:"vpcId"`
}

func (GetRouteTablesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetRouteTablesArgs)(nil)).Elem()
}

// A collection of values returned by getRouteTables.
type GetRouteTablesResultOutput struct{ *pulumi.OutputState }

func (GetRouteTablesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetRouteTablesResult)(nil)).Elem()
}

func (o GetRouteTablesResultOutput) ToGetRouteTablesResultOutput() GetRouteTablesResultOutput {
	return o
}

func (o GetRouteTablesResultOutput) ToGetRouteTablesResultOutputWithContext(ctx context.Context) GetRouteTablesResultOutput {
	return o
}

func (o GetRouteTablesResultOutput) Filters() GetRouteTablesFilterArrayOutput {
	return o.ApplyT(func(v GetRouteTablesResult) []GetRouteTablesFilter { return v.Filters }).(GetRouteTablesFilterArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetRouteTablesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetRouteTablesResult) string { return v.Id }).(pulumi.StringOutput)
}

// A set of all the route table ids found. This data source will fail if none are found.
func (o GetRouteTablesResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetRouteTablesResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetRouteTablesResultOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v GetRouteTablesResult) map[string]string { return v.Tags }).(pulumi.StringMapOutput)
}

func (o GetRouteTablesResultOutput) VpcId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetRouteTablesResult) *string { return v.VpcId }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetRouteTablesResultOutput{})
}

// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package ec2

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides details about an EC2 Local Gateway Virtual Interface Group. More information can be found in the [Outposts User Guide](https://docs.aws.amazon.com/outposts/latest/userguide/outposts-networking-components.html#routing).
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-aws/sdk/v4/go/aws/ec2"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		opt0 := data.Aws_ec2_local_gateway.Example.Id
// 		_, err := ec2.GetLocalGatewayVirtualInterfaceGroup(ctx, &ec2.GetLocalGatewayVirtualInterfaceGroupArgs{
// 			LocalGatewayId: &opt0,
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
func GetLocalGatewayVirtualInterfaceGroup(ctx *pulumi.Context, args *GetLocalGatewayVirtualInterfaceGroupArgs, opts ...pulumi.InvokeOption) (*GetLocalGatewayVirtualInterfaceGroupResult, error) {
	var rv GetLocalGatewayVirtualInterfaceGroupResult
	err := ctx.Invoke("aws:ec2/getLocalGatewayVirtualInterfaceGroup:getLocalGatewayVirtualInterfaceGroup", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getLocalGatewayVirtualInterfaceGroup.
type GetLocalGatewayVirtualInterfaceGroupArgs struct {
	// One or more configuration blocks containing name-values filters. See the [EC2 API Reference](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeLocalGatewayVirtualInterfaceGroups.html) for supported filters. Detailed below.
	Filters []GetLocalGatewayVirtualInterfaceGroupFilter `pulumi:"filters"`
	// Identifier of EC2 Local Gateway Virtual Interface Group.
	Id *string `pulumi:"id"`
	// Identifier of EC2 Local Gateway.
	LocalGatewayId *string `pulumi:"localGatewayId"`
	// Key-value map of resource tags, each pair of which must exactly match a pair on the desired local gateway route table.
	Tags map[string]string `pulumi:"tags"`
}

// A collection of values returned by getLocalGatewayVirtualInterfaceGroup.
type GetLocalGatewayVirtualInterfaceGroupResult struct {
	Filters        []GetLocalGatewayVirtualInterfaceGroupFilter `pulumi:"filters"`
	Id             string                                       `pulumi:"id"`
	LocalGatewayId string                                       `pulumi:"localGatewayId"`
	// Set of EC2 Local Gateway Virtual Interface identifiers.
	LocalGatewayVirtualInterfaceIds []string          `pulumi:"localGatewayVirtualInterfaceIds"`
	Tags                            map[string]string `pulumi:"tags"`
}

func GetLocalGatewayVirtualInterfaceGroupOutput(ctx *pulumi.Context, args GetLocalGatewayVirtualInterfaceGroupOutputArgs, opts ...pulumi.InvokeOption) GetLocalGatewayVirtualInterfaceGroupResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetLocalGatewayVirtualInterfaceGroupResult, error) {
			args := v.(GetLocalGatewayVirtualInterfaceGroupArgs)
			r, err := GetLocalGatewayVirtualInterfaceGroup(ctx, &args, opts...)
			return *r, err
		}).(GetLocalGatewayVirtualInterfaceGroupResultOutput)
}

// A collection of arguments for invoking getLocalGatewayVirtualInterfaceGroup.
type GetLocalGatewayVirtualInterfaceGroupOutputArgs struct {
	// One or more configuration blocks containing name-values filters. See the [EC2 API Reference](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeLocalGatewayVirtualInterfaceGroups.html) for supported filters. Detailed below.
	Filters GetLocalGatewayVirtualInterfaceGroupFilterArrayInput `pulumi:"filters"`
	// Identifier of EC2 Local Gateway Virtual Interface Group.
	Id pulumi.StringPtrInput `pulumi:"id"`
	// Identifier of EC2 Local Gateway.
	LocalGatewayId pulumi.StringPtrInput `pulumi:"localGatewayId"`
	// Key-value map of resource tags, each pair of which must exactly match a pair on the desired local gateway route table.
	Tags pulumi.StringMapInput `pulumi:"tags"`
}

func (GetLocalGatewayVirtualInterfaceGroupOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetLocalGatewayVirtualInterfaceGroupArgs)(nil)).Elem()
}

// A collection of values returned by getLocalGatewayVirtualInterfaceGroup.
type GetLocalGatewayVirtualInterfaceGroupResultOutput struct{ *pulumi.OutputState }

func (GetLocalGatewayVirtualInterfaceGroupResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetLocalGatewayVirtualInterfaceGroupResult)(nil)).Elem()
}

func (o GetLocalGatewayVirtualInterfaceGroupResultOutput) ToGetLocalGatewayVirtualInterfaceGroupResultOutput() GetLocalGatewayVirtualInterfaceGroupResultOutput {
	return o
}

func (o GetLocalGatewayVirtualInterfaceGroupResultOutput) ToGetLocalGatewayVirtualInterfaceGroupResultOutputWithContext(ctx context.Context) GetLocalGatewayVirtualInterfaceGroupResultOutput {
	return o
}

func (o GetLocalGatewayVirtualInterfaceGroupResultOutput) Filters() GetLocalGatewayVirtualInterfaceGroupFilterArrayOutput {
	return o.ApplyT(func(v GetLocalGatewayVirtualInterfaceGroupResult) []GetLocalGatewayVirtualInterfaceGroupFilter {
		return v.Filters
	}).(GetLocalGatewayVirtualInterfaceGroupFilterArrayOutput)
}

func (o GetLocalGatewayVirtualInterfaceGroupResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetLocalGatewayVirtualInterfaceGroupResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetLocalGatewayVirtualInterfaceGroupResultOutput) LocalGatewayId() pulumi.StringOutput {
	return o.ApplyT(func(v GetLocalGatewayVirtualInterfaceGroupResult) string { return v.LocalGatewayId }).(pulumi.StringOutput)
}

// Set of EC2 Local Gateway Virtual Interface identifiers.
func (o GetLocalGatewayVirtualInterfaceGroupResultOutput) LocalGatewayVirtualInterfaceIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetLocalGatewayVirtualInterfaceGroupResult) []string { return v.LocalGatewayVirtualInterfaceIds }).(pulumi.StringArrayOutput)
}

func (o GetLocalGatewayVirtualInterfaceGroupResultOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v GetLocalGatewayVirtualInterfaceGroupResult) map[string]string { return v.Tags }).(pulumi.StringMapOutput)
}

func init() {
	pulumi.RegisterOutputType(GetLocalGatewayVirtualInterfaceGroupResultOutput{})
}

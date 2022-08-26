// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package rds

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to get information about an RDS subnet group.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v5/go/aws/rds"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := rds.LookupSubnetGroup(ctx, &rds.LookupSubnetGroupArgs{
//				Name: "my-test-database-subnet-group",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupSubnetGroup(ctx *pulumi.Context, args *LookupSubnetGroupArgs, opts ...pulumi.InvokeOption) (*LookupSubnetGroupResult, error) {
	var rv LookupSubnetGroupResult
	err := ctx.Invoke("aws:rds/getSubnetGroup:getSubnetGroup", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getSubnetGroup.
type LookupSubnetGroupArgs struct {
	// The name of the RDS database subnet group.
	Name string `pulumi:"name"`
}

// A collection of values returned by getSubnetGroup.
type LookupSubnetGroupResult struct {
	// The Amazon Resource Name (ARN) for the DB subnet group.
	Arn string `pulumi:"arn"`
	// Provides the description of the DB subnet group.
	Description string `pulumi:"description"`
	// The provider-assigned unique ID for this managed resource.
	Id   string `pulumi:"id"`
	Name string `pulumi:"name"`
	// Provides the status of the DB subnet group.
	Status string `pulumi:"status"`
	// Contains a list of subnet identifiers.
	SubnetIds []string `pulumi:"subnetIds"`
	// The network type of the DB subnet group.
	SupportedNetworkTypes []string `pulumi:"supportedNetworkTypes"`
	// Provides the VPC ID of the DB subnet group.
	VpcId string `pulumi:"vpcId"`
}

func LookupSubnetGroupOutput(ctx *pulumi.Context, args LookupSubnetGroupOutputArgs, opts ...pulumi.InvokeOption) LookupSubnetGroupResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupSubnetGroupResult, error) {
			args := v.(LookupSubnetGroupArgs)
			r, err := LookupSubnetGroup(ctx, &args, opts...)
			var s LookupSubnetGroupResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupSubnetGroupResultOutput)
}

// A collection of arguments for invoking getSubnetGroup.
type LookupSubnetGroupOutputArgs struct {
	// The name of the RDS database subnet group.
	Name pulumi.StringInput `pulumi:"name"`
}

func (LookupSubnetGroupOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupSubnetGroupArgs)(nil)).Elem()
}

// A collection of values returned by getSubnetGroup.
type LookupSubnetGroupResultOutput struct{ *pulumi.OutputState }

func (LookupSubnetGroupResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupSubnetGroupResult)(nil)).Elem()
}

func (o LookupSubnetGroupResultOutput) ToLookupSubnetGroupResultOutput() LookupSubnetGroupResultOutput {
	return o
}

func (o LookupSubnetGroupResultOutput) ToLookupSubnetGroupResultOutputWithContext(ctx context.Context) LookupSubnetGroupResultOutput {
	return o
}

// The Amazon Resource Name (ARN) for the DB subnet group.
func (o LookupSubnetGroupResultOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSubnetGroupResult) string { return v.Arn }).(pulumi.StringOutput)
}

// Provides the description of the DB subnet group.
func (o LookupSubnetGroupResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSubnetGroupResult) string { return v.Description }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupSubnetGroupResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSubnetGroupResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupSubnetGroupResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSubnetGroupResult) string { return v.Name }).(pulumi.StringOutput)
}

// Provides the status of the DB subnet group.
func (o LookupSubnetGroupResultOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSubnetGroupResult) string { return v.Status }).(pulumi.StringOutput)
}

// Contains a list of subnet identifiers.
func (o LookupSubnetGroupResultOutput) SubnetIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupSubnetGroupResult) []string { return v.SubnetIds }).(pulumi.StringArrayOutput)
}

// The network type of the DB subnet group.
func (o LookupSubnetGroupResultOutput) SupportedNetworkTypes() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupSubnetGroupResult) []string { return v.SupportedNetworkTypes }).(pulumi.StringArrayOutput)
}

// Provides the VPC ID of the DB subnet group.
func (o LookupSubnetGroupResultOutput) VpcId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSubnetGroupResult) string { return v.VpcId }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupSubnetGroupResultOutput{})
}

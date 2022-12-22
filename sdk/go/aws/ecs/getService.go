// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package ecs

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// The ECS Service data source allows access to details of a specific
// Service within a AWS ECS Cluster.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v5/go/aws/ecs"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := ecs.LookupService(ctx, &ecs.LookupServiceArgs{
//				ServiceName: "example",
//				ClusterArn:  data.Aws_ecs_cluster.Example.Arn,
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupService(ctx *pulumi.Context, args *LookupServiceArgs, opts ...pulumi.InvokeOption) (*LookupServiceResult, error) {
	var rv LookupServiceResult
	err := ctx.Invoke("aws:ecs/getService:getService", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getService.
type LookupServiceArgs struct {
	// ARN of the ECS Cluster
	ClusterArn string `pulumi:"clusterArn"`
	// Name of the ECS Service
	ServiceName string `pulumi:"serviceName"`
	// Resource tags.
	Tags map[string]string `pulumi:"tags"`
}

// A collection of values returned by getService.
type LookupServiceResult struct {
	// ARN of the ECS Service
	Arn        string `pulumi:"arn"`
	ClusterArn string `pulumi:"clusterArn"`
	// Number of tasks for the ECS Service
	DesiredCount int `pulumi:"desiredCount"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Launch type for the ECS Service
	LaunchType string `pulumi:"launchType"`
	// Scheduling strategy for the ECS Service
	SchedulingStrategy string `pulumi:"schedulingStrategy"`
	ServiceName        string `pulumi:"serviceName"`
	// Resource tags.
	Tags map[string]string `pulumi:"tags"`
	// Family for the latest ACTIVE revision
	TaskDefinition string `pulumi:"taskDefinition"`
}

func LookupServiceOutput(ctx *pulumi.Context, args LookupServiceOutputArgs, opts ...pulumi.InvokeOption) LookupServiceResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupServiceResult, error) {
			args := v.(LookupServiceArgs)
			r, err := LookupService(ctx, &args, opts...)
			var s LookupServiceResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupServiceResultOutput)
}

// A collection of arguments for invoking getService.
type LookupServiceOutputArgs struct {
	// ARN of the ECS Cluster
	ClusterArn pulumi.StringInput `pulumi:"clusterArn"`
	// Name of the ECS Service
	ServiceName pulumi.StringInput `pulumi:"serviceName"`
	// Resource tags.
	Tags pulumi.StringMapInput `pulumi:"tags"`
}

func (LookupServiceOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupServiceArgs)(nil)).Elem()
}

// A collection of values returned by getService.
type LookupServiceResultOutput struct{ *pulumi.OutputState }

func (LookupServiceResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupServiceResult)(nil)).Elem()
}

func (o LookupServiceResultOutput) ToLookupServiceResultOutput() LookupServiceResultOutput {
	return o
}

func (o LookupServiceResultOutput) ToLookupServiceResultOutputWithContext(ctx context.Context) LookupServiceResultOutput {
	return o
}

// ARN of the ECS Service
func (o LookupServiceResultOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceResult) string { return v.Arn }).(pulumi.StringOutput)
}

func (o LookupServiceResultOutput) ClusterArn() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceResult) string { return v.ClusterArn }).(pulumi.StringOutput)
}

// Number of tasks for the ECS Service
func (o LookupServiceResultOutput) DesiredCount() pulumi.IntOutput {
	return o.ApplyT(func(v LookupServiceResult) int { return v.DesiredCount }).(pulumi.IntOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupServiceResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceResult) string { return v.Id }).(pulumi.StringOutput)
}

// Launch type for the ECS Service
func (o LookupServiceResultOutput) LaunchType() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceResult) string { return v.LaunchType }).(pulumi.StringOutput)
}

// Scheduling strategy for the ECS Service
func (o LookupServiceResultOutput) SchedulingStrategy() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceResult) string { return v.SchedulingStrategy }).(pulumi.StringOutput)
}

func (o LookupServiceResultOutput) ServiceName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceResult) string { return v.ServiceName }).(pulumi.StringOutput)
}

// Resource tags.
func (o LookupServiceResultOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v LookupServiceResult) map[string]string { return v.Tags }).(pulumi.StringMapOutput)
}

// Family for the latest ACTIVE revision
func (o LookupServiceResultOutput) TaskDefinition() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceResult) string { return v.TaskDefinition }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupServiceResultOutput{})
}

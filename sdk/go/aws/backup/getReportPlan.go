// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package backup

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to get information on an existing backup report plan.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-aws/sdk/v5/go/aws/backup"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := backup.LookupReportPlan(ctx, &backup.LookupReportPlanArgs{
// 			Name: "tf_example_backup_report_plan_name",
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
func LookupReportPlan(ctx *pulumi.Context, args *LookupReportPlanArgs, opts ...pulumi.InvokeOption) (*LookupReportPlanResult, error) {
	var rv LookupReportPlanResult
	err := ctx.Invoke("aws:backup/getReportPlan:getReportPlan", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getReportPlan.
type LookupReportPlanArgs struct {
	// The backup report plan name.
	Name string `pulumi:"name"`
	// Metadata that you can assign to help organize the report plans you create.
	Tags map[string]string `pulumi:"tags"`
}

// A collection of values returned by getReportPlan.
type LookupReportPlanResult struct {
	// The ARN of the backup report plan.
	Arn string `pulumi:"arn"`
	// The date and time that a report plan is created, in Unix format and Coordinated Universal Time (UTC).
	CreationTime string `pulumi:"creationTime"`
	// The deployment status of a report plan. The statuses are: `CREATE_IN_PROGRESS` | `UPDATE_IN_PROGRESS` | `DELETE_IN_PROGRESS` | `COMPLETED`.
	DeploymentStatus string `pulumi:"deploymentStatus"`
	// The description of the report plan.
	Description string `pulumi:"description"`
	// The provider-assigned unique ID for this managed resource.
	Id   string `pulumi:"id"`
	Name string `pulumi:"name"`
	// An object that contains information about where and how to deliver your reports, specifically your Amazon S3 bucket name, S3 key prefix, and the formats of your reports. Detailed below.
	ReportDeliveryChannels []GetReportPlanReportDeliveryChannel `pulumi:"reportDeliveryChannels"`
	// An object that identifies the report template for the report. Reports are built using a report template. Detailed below.
	ReportSettings []GetReportPlanReportSetting `pulumi:"reportSettings"`
	// Metadata that you can assign to help organize the report plans you create.
	Tags map[string]string `pulumi:"tags"`
}

func LookupReportPlanOutput(ctx *pulumi.Context, args LookupReportPlanOutputArgs, opts ...pulumi.InvokeOption) LookupReportPlanResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupReportPlanResult, error) {
			args := v.(LookupReportPlanArgs)
			r, err := LookupReportPlan(ctx, &args, opts...)
			return *r, err
		}).(LookupReportPlanResultOutput)
}

// A collection of arguments for invoking getReportPlan.
type LookupReportPlanOutputArgs struct {
	// The backup report plan name.
	Name pulumi.StringInput `pulumi:"name"`
	// Metadata that you can assign to help organize the report plans you create.
	Tags pulumi.StringMapInput `pulumi:"tags"`
}

func (LookupReportPlanOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupReportPlanArgs)(nil)).Elem()
}

// A collection of values returned by getReportPlan.
type LookupReportPlanResultOutput struct{ *pulumi.OutputState }

func (LookupReportPlanResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupReportPlanResult)(nil)).Elem()
}

func (o LookupReportPlanResultOutput) ToLookupReportPlanResultOutput() LookupReportPlanResultOutput {
	return o
}

func (o LookupReportPlanResultOutput) ToLookupReportPlanResultOutputWithContext(ctx context.Context) LookupReportPlanResultOutput {
	return o
}

// The ARN of the backup report plan.
func (o LookupReportPlanResultOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v LookupReportPlanResult) string { return v.Arn }).(pulumi.StringOutput)
}

// The date and time that a report plan is created, in Unix format and Coordinated Universal Time (UTC).
func (o LookupReportPlanResultOutput) CreationTime() pulumi.StringOutput {
	return o.ApplyT(func(v LookupReportPlanResult) string { return v.CreationTime }).(pulumi.StringOutput)
}

// The deployment status of a report plan. The statuses are: `CREATE_IN_PROGRESS` | `UPDATE_IN_PROGRESS` | `DELETE_IN_PROGRESS` | `COMPLETED`.
func (o LookupReportPlanResultOutput) DeploymentStatus() pulumi.StringOutput {
	return o.ApplyT(func(v LookupReportPlanResult) string { return v.DeploymentStatus }).(pulumi.StringOutput)
}

// The description of the report plan.
func (o LookupReportPlanResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupReportPlanResult) string { return v.Description }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupReportPlanResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupReportPlanResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupReportPlanResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupReportPlanResult) string { return v.Name }).(pulumi.StringOutput)
}

// An object that contains information about where and how to deliver your reports, specifically your Amazon S3 bucket name, S3 key prefix, and the formats of your reports. Detailed below.
func (o LookupReportPlanResultOutput) ReportDeliveryChannels() GetReportPlanReportDeliveryChannelArrayOutput {
	return o.ApplyT(func(v LookupReportPlanResult) []GetReportPlanReportDeliveryChannel { return v.ReportDeliveryChannels }).(GetReportPlanReportDeliveryChannelArrayOutput)
}

// An object that identifies the report template for the report. Reports are built using a report template. Detailed below.
func (o LookupReportPlanResultOutput) ReportSettings() GetReportPlanReportSettingArrayOutput {
	return o.ApplyT(func(v LookupReportPlanResult) []GetReportPlanReportSetting { return v.ReportSettings }).(GetReportPlanReportSettingArrayOutput)
}

// Metadata that you can assign to help organize the report plans you create.
func (o LookupReportPlanResultOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v LookupReportPlanResult) map[string]string { return v.Tags }).(pulumi.StringMapOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupReportPlanResultOutput{})
}

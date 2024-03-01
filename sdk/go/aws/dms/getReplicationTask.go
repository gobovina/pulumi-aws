// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package dms

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Data source for managing an AWS DMS (Database Migration) Replication Task.
//
// ## Example Usage
// ### Basic Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/dms"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := dms.LookupReplicationTask(ctx, &dms.LookupReplicationTaskArgs{
//				ReplicationTaskId: testAwsDmsReplicationTask.ReplicationTaskId,
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupReplicationTask(ctx *pulumi.Context, args *LookupReplicationTaskArgs, opts ...pulumi.InvokeOption) (*LookupReplicationTaskResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupReplicationTaskResult
	err := ctx.Invoke("aws:dms/getReplicationTask:getReplicationTask", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getReplicationTask.
type LookupReplicationTaskArgs struct {
	// The replication task identifier.
	//
	// - Must contain from 1 to 255 alphanumeric characters or hyphens.
	// - First character must be a letter.
	// - Cannot end with a hyphen.
	// - Cannot contain two consecutive hyphens.
	ReplicationTaskId string            `pulumi:"replicationTaskId"`
	Tags              map[string]string `pulumi:"tags"`
}

// A collection of values returned by getReplicationTask.
type LookupReplicationTaskResult struct {
	// (Conflicts with `cdcStartTime`) Indicates when you want a change data capture (CDC) operation to start. The value can be in date, checkpoint, or LSN/SCN format depending on the source engine. For more information, see [Determining a CDC native start point](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Task.CDC.html#CHAP_Task.CDC.StartPoint.Native).
	CdcStartPosition string `pulumi:"cdcStartPosition"`
	// (Conflicts with `cdcStartPosition`) The Unix timestamp integer for the start of the Change Data Capture (CDC) operation.
	CdcStartTime string `pulumi:"cdcStartTime"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// The migration type. Can be one of `full-load | cdc | full-load-and-cdc`.
	MigrationType string `pulumi:"migrationType"`
	// The Amazon Resource Name (ARN) of the replication instance.
	ReplicationInstanceArn string `pulumi:"replicationInstanceArn"`
	// The Amazon Resource Name (ARN) for the replication task.
	ReplicationTaskArn string `pulumi:"replicationTaskArn"`
	ReplicationTaskId  string `pulumi:"replicationTaskId"`
	// An escaped JSON string that contains the task settings. For a complete list of task settings, see [Task Settings for AWS Database Migration Service Tasks](http://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.CustomizingTasks.TaskSettings.html).
	ReplicationTaskSettings string `pulumi:"replicationTaskSettings"`
	// The Amazon Resource Name (ARN) string that uniquely identifies the source endpoint.
	SourceEndpointArn string `pulumi:"sourceEndpointArn"`
	// Whether to run or stop the replication task.
	StartReplicationTask bool `pulumi:"startReplicationTask"`
	// Replication Task status.
	Status string `pulumi:"status"`
	// An escaped JSON string that contains the table mappings. For information on table mapping see [Using Table Mapping with an AWS Database Migration Service Task to Select and Filter Data](http://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.CustomizingTasks.TableMapping.html)
	TableMappings string            `pulumi:"tableMappings"`
	Tags          map[string]string `pulumi:"tags"`
	// The Amazon Resource Name (ARN) string that uniquely identifies the target endpoint.
	TargetEndpointArn string `pulumi:"targetEndpointArn"`
}

func LookupReplicationTaskOutput(ctx *pulumi.Context, args LookupReplicationTaskOutputArgs, opts ...pulumi.InvokeOption) LookupReplicationTaskResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupReplicationTaskResult, error) {
			args := v.(LookupReplicationTaskArgs)
			r, err := LookupReplicationTask(ctx, &args, opts...)
			var s LookupReplicationTaskResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupReplicationTaskResultOutput)
}

// A collection of arguments for invoking getReplicationTask.
type LookupReplicationTaskOutputArgs struct {
	// The replication task identifier.
	//
	// - Must contain from 1 to 255 alphanumeric characters or hyphens.
	// - First character must be a letter.
	// - Cannot end with a hyphen.
	// - Cannot contain two consecutive hyphens.
	ReplicationTaskId pulumi.StringInput    `pulumi:"replicationTaskId"`
	Tags              pulumi.StringMapInput `pulumi:"tags"`
}

func (LookupReplicationTaskOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupReplicationTaskArgs)(nil)).Elem()
}

// A collection of values returned by getReplicationTask.
type LookupReplicationTaskResultOutput struct{ *pulumi.OutputState }

func (LookupReplicationTaskResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupReplicationTaskResult)(nil)).Elem()
}

func (o LookupReplicationTaskResultOutput) ToLookupReplicationTaskResultOutput() LookupReplicationTaskResultOutput {
	return o
}

func (o LookupReplicationTaskResultOutput) ToLookupReplicationTaskResultOutputWithContext(ctx context.Context) LookupReplicationTaskResultOutput {
	return o
}

// (Conflicts with `cdcStartTime`) Indicates when you want a change data capture (CDC) operation to start. The value can be in date, checkpoint, or LSN/SCN format depending on the source engine. For more information, see [Determining a CDC native start point](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Task.CDC.html#CHAP_Task.CDC.StartPoint.Native).
func (o LookupReplicationTaskResultOutput) CdcStartPosition() pulumi.StringOutput {
	return o.ApplyT(func(v LookupReplicationTaskResult) string { return v.CdcStartPosition }).(pulumi.StringOutput)
}

// (Conflicts with `cdcStartPosition`) The Unix timestamp integer for the start of the Change Data Capture (CDC) operation.
func (o LookupReplicationTaskResultOutput) CdcStartTime() pulumi.StringOutput {
	return o.ApplyT(func(v LookupReplicationTaskResult) string { return v.CdcStartTime }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupReplicationTaskResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupReplicationTaskResult) string { return v.Id }).(pulumi.StringOutput)
}

// The migration type. Can be one of `full-load | cdc | full-load-and-cdc`.
func (o LookupReplicationTaskResultOutput) MigrationType() pulumi.StringOutput {
	return o.ApplyT(func(v LookupReplicationTaskResult) string { return v.MigrationType }).(pulumi.StringOutput)
}

// The Amazon Resource Name (ARN) of the replication instance.
func (o LookupReplicationTaskResultOutput) ReplicationInstanceArn() pulumi.StringOutput {
	return o.ApplyT(func(v LookupReplicationTaskResult) string { return v.ReplicationInstanceArn }).(pulumi.StringOutput)
}

// The Amazon Resource Name (ARN) for the replication task.
func (o LookupReplicationTaskResultOutput) ReplicationTaskArn() pulumi.StringOutput {
	return o.ApplyT(func(v LookupReplicationTaskResult) string { return v.ReplicationTaskArn }).(pulumi.StringOutput)
}

func (o LookupReplicationTaskResultOutput) ReplicationTaskId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupReplicationTaskResult) string { return v.ReplicationTaskId }).(pulumi.StringOutput)
}

// An escaped JSON string that contains the task settings. For a complete list of task settings, see [Task Settings for AWS Database Migration Service Tasks](http://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.CustomizingTasks.TaskSettings.html).
func (o LookupReplicationTaskResultOutput) ReplicationTaskSettings() pulumi.StringOutput {
	return o.ApplyT(func(v LookupReplicationTaskResult) string { return v.ReplicationTaskSettings }).(pulumi.StringOutput)
}

// The Amazon Resource Name (ARN) string that uniquely identifies the source endpoint.
func (o LookupReplicationTaskResultOutput) SourceEndpointArn() pulumi.StringOutput {
	return o.ApplyT(func(v LookupReplicationTaskResult) string { return v.SourceEndpointArn }).(pulumi.StringOutput)
}

// Whether to run or stop the replication task.
func (o LookupReplicationTaskResultOutput) StartReplicationTask() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupReplicationTaskResult) bool { return v.StartReplicationTask }).(pulumi.BoolOutput)
}

// Replication Task status.
func (o LookupReplicationTaskResultOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v LookupReplicationTaskResult) string { return v.Status }).(pulumi.StringOutput)
}

// An escaped JSON string that contains the table mappings. For information on table mapping see [Using Table Mapping with an AWS Database Migration Service Task to Select and Filter Data](http://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.CustomizingTasks.TableMapping.html)
func (o LookupReplicationTaskResultOutput) TableMappings() pulumi.StringOutput {
	return o.ApplyT(func(v LookupReplicationTaskResult) string { return v.TableMappings }).(pulumi.StringOutput)
}

func (o LookupReplicationTaskResultOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v LookupReplicationTaskResult) map[string]string { return v.Tags }).(pulumi.StringMapOutput)
}

// The Amazon Resource Name (ARN) string that uniquely identifies the target endpoint.
func (o LookupReplicationTaskResultOutput) TargetEndpointArn() pulumi.StringOutput {
	return o.ApplyT(func(v LookupReplicationTaskResult) string { return v.TargetEndpointArn }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupReplicationTaskResultOutput{})
}

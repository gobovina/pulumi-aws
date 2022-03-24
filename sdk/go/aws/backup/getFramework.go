// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package backup

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to get information on an existing backup framework.
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
// 		_, err := backup.LookupFramework(ctx, &backup.LookupFrameworkArgs{
// 			Name: "tf_example_backup_framework_name",
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
func LookupFramework(ctx *pulumi.Context, args *LookupFrameworkArgs, opts ...pulumi.InvokeOption) (*LookupFrameworkResult, error) {
	var rv LookupFrameworkResult
	err := ctx.Invoke("aws:backup/getFramework:getFramework", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getFramework.
type LookupFrameworkArgs struct {
	// The backup framework name.
	Name string `pulumi:"name"`
	// The tag key-value pair applied to those AWS resources that you want to trigger an evaluation for a rule. A maximum of one key-value pair can be provided.
	Tags map[string]string `pulumi:"tags"`
}

// A collection of values returned by getFramework.
type LookupFrameworkResult struct {
	// The ARN of the backup framework.
	Arn string `pulumi:"arn"`
	// One or more control blocks that make up the framework. Each control in the list has a name, input parameters, and scope. Detailed below.
	Controls []GetFrameworkControl `pulumi:"controls"`
	// The date and time that a framework is created, in Unix format and Coordinated Universal Time (UTC).
	CreationTime string `pulumi:"creationTime"`
	// The deployment status of a framework. The statuses are: `CREATE_IN_PROGRESS` | `UPDATE_IN_PROGRESS` | `DELETE_IN_PROGRESS` | `COMPLETED`| `FAILED`.
	DeploymentStatus string `pulumi:"deploymentStatus"`
	// The description of the framework.
	Description string `pulumi:"description"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// The name of a parameter, for example, BackupPlanFrequency.
	Name string `pulumi:"name"`
	// A framework consists of one or more controls. Each control governs a resource, such as backup plans, backup selections, backup vaults, or recovery points. You can also turn AWS Config recording on or off for each resource. The statuses are: `ACTIVE`, `PARTIALLY_ACTIVE`, `INACTIVE`, `UNAVAILABLE`. For more information refer to the [AWS documentation for Framework Status](https://docs.aws.amazon.com/aws-backup/latest/devguide/API_DescribeFramework.html#Backup-DescribeFramework-response-FrameworkStatus)
	Status string `pulumi:"status"`
	// The tag key-value pair applied to those AWS resources that you want to trigger an evaluation for a rule. A maximum of one key-value pair can be provided.
	Tags map[string]string `pulumi:"tags"`
}

func LookupFrameworkOutput(ctx *pulumi.Context, args LookupFrameworkOutputArgs, opts ...pulumi.InvokeOption) LookupFrameworkResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupFrameworkResult, error) {
			args := v.(LookupFrameworkArgs)
			r, err := LookupFramework(ctx, &args, opts...)
			return *r, err
		}).(LookupFrameworkResultOutput)
}

// A collection of arguments for invoking getFramework.
type LookupFrameworkOutputArgs struct {
	// The backup framework name.
	Name pulumi.StringInput `pulumi:"name"`
	// The tag key-value pair applied to those AWS resources that you want to trigger an evaluation for a rule. A maximum of one key-value pair can be provided.
	Tags pulumi.StringMapInput `pulumi:"tags"`
}

func (LookupFrameworkOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupFrameworkArgs)(nil)).Elem()
}

// A collection of values returned by getFramework.
type LookupFrameworkResultOutput struct{ *pulumi.OutputState }

func (LookupFrameworkResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupFrameworkResult)(nil)).Elem()
}

func (o LookupFrameworkResultOutput) ToLookupFrameworkResultOutput() LookupFrameworkResultOutput {
	return o
}

func (o LookupFrameworkResultOutput) ToLookupFrameworkResultOutputWithContext(ctx context.Context) LookupFrameworkResultOutput {
	return o
}

// The ARN of the backup framework.
func (o LookupFrameworkResultOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v LookupFrameworkResult) string { return v.Arn }).(pulumi.StringOutput)
}

// One or more control blocks that make up the framework. Each control in the list has a name, input parameters, and scope. Detailed below.
func (o LookupFrameworkResultOutput) Controls() GetFrameworkControlArrayOutput {
	return o.ApplyT(func(v LookupFrameworkResult) []GetFrameworkControl { return v.Controls }).(GetFrameworkControlArrayOutput)
}

// The date and time that a framework is created, in Unix format and Coordinated Universal Time (UTC).
func (o LookupFrameworkResultOutput) CreationTime() pulumi.StringOutput {
	return o.ApplyT(func(v LookupFrameworkResult) string { return v.CreationTime }).(pulumi.StringOutput)
}

// The deployment status of a framework. The statuses are: `CREATE_IN_PROGRESS` | `UPDATE_IN_PROGRESS` | `DELETE_IN_PROGRESS` | `COMPLETED`| `FAILED`.
func (o LookupFrameworkResultOutput) DeploymentStatus() pulumi.StringOutput {
	return o.ApplyT(func(v LookupFrameworkResult) string { return v.DeploymentStatus }).(pulumi.StringOutput)
}

// The description of the framework.
func (o LookupFrameworkResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupFrameworkResult) string { return v.Description }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupFrameworkResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupFrameworkResult) string { return v.Id }).(pulumi.StringOutput)
}

// The name of a parameter, for example, BackupPlanFrequency.
func (o LookupFrameworkResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupFrameworkResult) string { return v.Name }).(pulumi.StringOutput)
}

// A framework consists of one or more controls. Each control governs a resource, such as backup plans, backup selections, backup vaults, or recovery points. You can also turn AWS Config recording on or off for each resource. The statuses are: `ACTIVE`, `PARTIALLY_ACTIVE`, `INACTIVE`, `UNAVAILABLE`. For more information refer to the [AWS documentation for Framework Status](https://docs.aws.amazon.com/aws-backup/latest/devguide/API_DescribeFramework.html#Backup-DescribeFramework-response-FrameworkStatus)
func (o LookupFrameworkResultOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v LookupFrameworkResult) string { return v.Status }).(pulumi.StringOutput)
}

// The tag key-value pair applied to those AWS resources that you want to trigger an evaluation for a rule. A maximum of one key-value pair can be provided.
func (o LookupFrameworkResultOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v LookupFrameworkResult) map[string]string { return v.Tags }).(pulumi.StringMapOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupFrameworkResultOutput{})
}

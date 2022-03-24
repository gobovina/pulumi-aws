// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package grafana

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides an Amazon Managed Grafana workspace data source.
//
// ## Example Usage
// ### Basic configuration
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-aws/sdk/v5/go/aws/grafana"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := grafana.LookupWorkspace(ctx, &grafana.LookupWorkspaceArgs{
// 			WorkspaceId: "g-2054c75a02",
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
func LookupWorkspace(ctx *pulumi.Context, args *LookupWorkspaceArgs, opts ...pulumi.InvokeOption) (*LookupWorkspaceResult, error) {
	var rv LookupWorkspaceResult
	err := ctx.Invoke("aws:grafana/getWorkspace:getWorkspace", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getWorkspace.
type LookupWorkspaceArgs struct {
	// The Grafana workspace ID.
	WorkspaceId string `pulumi:"workspaceId"`
}

// A collection of values returned by getWorkspace.
type LookupWorkspaceResult struct {
	// (Required) The type of account access for the workspace. Valid values are `CURRENT_ACCOUNT` and `ORGANIZATION`. If `ORGANIZATION` is specified, then `organizationalUnits` must also be present.
	AccountAccessType string `pulumi:"accountAccessType"`
	// The Amazon Resource Name (ARN) of the Grafana workspace.
	Arn string `pulumi:"arn"`
	// (Required) The authentication providers for the workspace. Valid values are `AWS_SSO`, `SAML`, or both.
	AuthenticationProviders []string `pulumi:"authenticationProviders"`
	// The creation date of the Grafana workspace.
	CreatedDate string `pulumi:"createdDate"`
	// The data sources for the workspace.
	DataSources []string `pulumi:"dataSources"`
	// The workspace description.
	Description string `pulumi:"description"`
	// The endpoint of the Grafana workspace.
	Endpoint string `pulumi:"endpoint"`
	// The version of Grafana running on the workspace.
	GrafanaVersion string `pulumi:"grafanaVersion"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// The last updated date of the Grafana workspace.
	LastUpdatedDate string `pulumi:"lastUpdatedDate"`
	// The Grafana workspace name.
	Name string `pulumi:"name"`
	// The notification destinations.
	NotificationDestinations []string `pulumi:"notificationDestinations"`
	// The role name that the workspace uses to access resources through Amazon Organizations.
	OrganizationRoleName string `pulumi:"organizationRoleName"`
	// The Amazon Organizations organizational units that the workspace is authorized to use data sources from.
	OrganizationalUnits []string `pulumi:"organizationalUnits"`
	// The permission type of the workspace.
	PermissionType string `pulumi:"permissionType"`
	// The IAM role ARN that the workspace assumes.
	RoleArn                 string `pulumi:"roleArn"`
	SamlConfigurationStatus string `pulumi:"samlConfigurationStatus"`
	// The AWS CloudFormation stack set name that provisions IAM roles to be used by the workspace.
	StackSetName string `pulumi:"stackSetName"`
	// The status of the Grafana workspace.
	Status      string `pulumi:"status"`
	WorkspaceId string `pulumi:"workspaceId"`
}

func LookupWorkspaceOutput(ctx *pulumi.Context, args LookupWorkspaceOutputArgs, opts ...pulumi.InvokeOption) LookupWorkspaceResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupWorkspaceResult, error) {
			args := v.(LookupWorkspaceArgs)
			r, err := LookupWorkspace(ctx, &args, opts...)
			return *r, err
		}).(LookupWorkspaceResultOutput)
}

// A collection of arguments for invoking getWorkspace.
type LookupWorkspaceOutputArgs struct {
	// The Grafana workspace ID.
	WorkspaceId pulumi.StringInput `pulumi:"workspaceId"`
}

func (LookupWorkspaceOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupWorkspaceArgs)(nil)).Elem()
}

// A collection of values returned by getWorkspace.
type LookupWorkspaceResultOutput struct{ *pulumi.OutputState }

func (LookupWorkspaceResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupWorkspaceResult)(nil)).Elem()
}

func (o LookupWorkspaceResultOutput) ToLookupWorkspaceResultOutput() LookupWorkspaceResultOutput {
	return o
}

func (o LookupWorkspaceResultOutput) ToLookupWorkspaceResultOutputWithContext(ctx context.Context) LookupWorkspaceResultOutput {
	return o
}

// (Required) The type of account access for the workspace. Valid values are `CURRENT_ACCOUNT` and `ORGANIZATION`. If `ORGANIZATION` is specified, then `organizationalUnits` must also be present.
func (o LookupWorkspaceResultOutput) AccountAccessType() pulumi.StringOutput {
	return o.ApplyT(func(v LookupWorkspaceResult) string { return v.AccountAccessType }).(pulumi.StringOutput)
}

// The Amazon Resource Name (ARN) of the Grafana workspace.
func (o LookupWorkspaceResultOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v LookupWorkspaceResult) string { return v.Arn }).(pulumi.StringOutput)
}

// (Required) The authentication providers for the workspace. Valid values are `AWS_SSO`, `SAML`, or both.
func (o LookupWorkspaceResultOutput) AuthenticationProviders() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupWorkspaceResult) []string { return v.AuthenticationProviders }).(pulumi.StringArrayOutput)
}

// The creation date of the Grafana workspace.
func (o LookupWorkspaceResultOutput) CreatedDate() pulumi.StringOutput {
	return o.ApplyT(func(v LookupWorkspaceResult) string { return v.CreatedDate }).(pulumi.StringOutput)
}

// The data sources for the workspace.
func (o LookupWorkspaceResultOutput) DataSources() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupWorkspaceResult) []string { return v.DataSources }).(pulumi.StringArrayOutput)
}

// The workspace description.
func (o LookupWorkspaceResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupWorkspaceResult) string { return v.Description }).(pulumi.StringOutput)
}

// The endpoint of the Grafana workspace.
func (o LookupWorkspaceResultOutput) Endpoint() pulumi.StringOutput {
	return o.ApplyT(func(v LookupWorkspaceResult) string { return v.Endpoint }).(pulumi.StringOutput)
}

// The version of Grafana running on the workspace.
func (o LookupWorkspaceResultOutput) GrafanaVersion() pulumi.StringOutput {
	return o.ApplyT(func(v LookupWorkspaceResult) string { return v.GrafanaVersion }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupWorkspaceResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupWorkspaceResult) string { return v.Id }).(pulumi.StringOutput)
}

// The last updated date of the Grafana workspace.
func (o LookupWorkspaceResultOutput) LastUpdatedDate() pulumi.StringOutput {
	return o.ApplyT(func(v LookupWorkspaceResult) string { return v.LastUpdatedDate }).(pulumi.StringOutput)
}

// The Grafana workspace name.
func (o LookupWorkspaceResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupWorkspaceResult) string { return v.Name }).(pulumi.StringOutput)
}

// The notification destinations.
func (o LookupWorkspaceResultOutput) NotificationDestinations() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupWorkspaceResult) []string { return v.NotificationDestinations }).(pulumi.StringArrayOutput)
}

// The role name that the workspace uses to access resources through Amazon Organizations.
func (o LookupWorkspaceResultOutput) OrganizationRoleName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupWorkspaceResult) string { return v.OrganizationRoleName }).(pulumi.StringOutput)
}

// The Amazon Organizations organizational units that the workspace is authorized to use data sources from.
func (o LookupWorkspaceResultOutput) OrganizationalUnits() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupWorkspaceResult) []string { return v.OrganizationalUnits }).(pulumi.StringArrayOutput)
}

// The permission type of the workspace.
func (o LookupWorkspaceResultOutput) PermissionType() pulumi.StringOutput {
	return o.ApplyT(func(v LookupWorkspaceResult) string { return v.PermissionType }).(pulumi.StringOutput)
}

// The IAM role ARN that the workspace assumes.
func (o LookupWorkspaceResultOutput) RoleArn() pulumi.StringOutput {
	return o.ApplyT(func(v LookupWorkspaceResult) string { return v.RoleArn }).(pulumi.StringOutput)
}

func (o LookupWorkspaceResultOutput) SamlConfigurationStatus() pulumi.StringOutput {
	return o.ApplyT(func(v LookupWorkspaceResult) string { return v.SamlConfigurationStatus }).(pulumi.StringOutput)
}

// The AWS CloudFormation stack set name that provisions IAM roles to be used by the workspace.
func (o LookupWorkspaceResultOutput) StackSetName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupWorkspaceResult) string { return v.StackSetName }).(pulumi.StringOutput)
}

// The status of the Grafana workspace.
func (o LookupWorkspaceResultOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v LookupWorkspaceResult) string { return v.Status }).(pulumi.StringOutput)
}

func (o LookupWorkspaceResultOutput) WorkspaceId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupWorkspaceResult) string { return v.WorkspaceId }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupWorkspaceResultOutput{})
}

// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package workspaces

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to get information about a workspace in [AWS Workspaces](https://docs.aws.amazon.com/workspaces/latest/adminguide/amazon-workspaces.html) Service.
//
// ## Example Usage
// ### Filter By Workspace ID
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v5/go/aws/workspaces"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := workspaces.LookupWorkspace(ctx, &workspaces.LookupWorkspaceArgs{
//				WorkspaceId: pulumi.StringRef("ws-cj5xcxsz5"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// ### Filter By Directory ID & User Name
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v5/go/aws/workspaces"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := workspaces.LookupWorkspace(ctx, &workspaces.LookupWorkspaceArgs{
//				DirectoryId: pulumi.StringRef("d-9967252f57"),
//				UserName:    pulumi.StringRef("Example"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupWorkspace(ctx *pulumi.Context, args *LookupWorkspaceArgs, opts ...pulumi.InvokeOption) (*LookupWorkspaceResult, error) {
	var rv LookupWorkspaceResult
	err := ctx.Invoke("aws:workspaces/getWorkspace:getWorkspace", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getWorkspace.
type LookupWorkspaceArgs struct {
	// ID of the directory for the WorkSpace. You have to specify `userName` along with `directoryId`. You cannot combine this parameter with `workspaceId`.
	DirectoryId *string `pulumi:"directoryId"`
	// Tags for the WorkSpace.
	Tags map[string]string `pulumi:"tags"`
	// User name of the user for the WorkSpace. This user name must exist in the directory for the WorkSpace. You cannot combine this parameter with `workspaceId`.
	UserName *string `pulumi:"userName"`
	// ID of the WorkSpace. You cannot combine this parameter with `directoryId`.
	WorkspaceId *string `pulumi:"workspaceId"`
}

// A collection of values returned by getWorkspace.
type LookupWorkspaceResult struct {
	BundleId string `pulumi:"bundleId"`
	// Name of the WorkSpace, as seen by the operating system.
	ComputerName string `pulumi:"computerName"`
	DirectoryId  string `pulumi:"directoryId"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// IP address of the WorkSpace.
	IpAddress                   string `pulumi:"ipAddress"`
	RootVolumeEncryptionEnabled bool   `pulumi:"rootVolumeEncryptionEnabled"`
	// Operational state of the WorkSpace.
	State                       string                          `pulumi:"state"`
	Tags                        map[string]string               `pulumi:"tags"`
	UserName                    string                          `pulumi:"userName"`
	UserVolumeEncryptionEnabled bool                            `pulumi:"userVolumeEncryptionEnabled"`
	VolumeEncryptionKey         string                          `pulumi:"volumeEncryptionKey"`
	WorkspaceId                 string                          `pulumi:"workspaceId"`
	WorkspaceProperties         []GetWorkspaceWorkspaceProperty `pulumi:"workspaceProperties"`
}

func LookupWorkspaceOutput(ctx *pulumi.Context, args LookupWorkspaceOutputArgs, opts ...pulumi.InvokeOption) LookupWorkspaceResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupWorkspaceResult, error) {
			args := v.(LookupWorkspaceArgs)
			r, err := LookupWorkspace(ctx, &args, opts...)
			var s LookupWorkspaceResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupWorkspaceResultOutput)
}

// A collection of arguments for invoking getWorkspace.
type LookupWorkspaceOutputArgs struct {
	// ID of the directory for the WorkSpace. You have to specify `userName` along with `directoryId`. You cannot combine this parameter with `workspaceId`.
	DirectoryId pulumi.StringPtrInput `pulumi:"directoryId"`
	// Tags for the WorkSpace.
	Tags pulumi.StringMapInput `pulumi:"tags"`
	// User name of the user for the WorkSpace. This user name must exist in the directory for the WorkSpace. You cannot combine this parameter with `workspaceId`.
	UserName pulumi.StringPtrInput `pulumi:"userName"`
	// ID of the WorkSpace. You cannot combine this parameter with `directoryId`.
	WorkspaceId pulumi.StringPtrInput `pulumi:"workspaceId"`
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

func (o LookupWorkspaceResultOutput) BundleId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupWorkspaceResult) string { return v.BundleId }).(pulumi.StringOutput)
}

// Name of the WorkSpace, as seen by the operating system.
func (o LookupWorkspaceResultOutput) ComputerName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupWorkspaceResult) string { return v.ComputerName }).(pulumi.StringOutput)
}

func (o LookupWorkspaceResultOutput) DirectoryId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupWorkspaceResult) string { return v.DirectoryId }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupWorkspaceResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupWorkspaceResult) string { return v.Id }).(pulumi.StringOutput)
}

// IP address of the WorkSpace.
func (o LookupWorkspaceResultOutput) IpAddress() pulumi.StringOutput {
	return o.ApplyT(func(v LookupWorkspaceResult) string { return v.IpAddress }).(pulumi.StringOutput)
}

func (o LookupWorkspaceResultOutput) RootVolumeEncryptionEnabled() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupWorkspaceResult) bool { return v.RootVolumeEncryptionEnabled }).(pulumi.BoolOutput)
}

// Operational state of the WorkSpace.
func (o LookupWorkspaceResultOutput) State() pulumi.StringOutput {
	return o.ApplyT(func(v LookupWorkspaceResult) string { return v.State }).(pulumi.StringOutput)
}

func (o LookupWorkspaceResultOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v LookupWorkspaceResult) map[string]string { return v.Tags }).(pulumi.StringMapOutput)
}

func (o LookupWorkspaceResultOutput) UserName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupWorkspaceResult) string { return v.UserName }).(pulumi.StringOutput)
}

func (o LookupWorkspaceResultOutput) UserVolumeEncryptionEnabled() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupWorkspaceResult) bool { return v.UserVolumeEncryptionEnabled }).(pulumi.BoolOutput)
}

func (o LookupWorkspaceResultOutput) VolumeEncryptionKey() pulumi.StringOutput {
	return o.ApplyT(func(v LookupWorkspaceResult) string { return v.VolumeEncryptionKey }).(pulumi.StringOutput)
}

func (o LookupWorkspaceResultOutput) WorkspaceId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupWorkspaceResult) string { return v.WorkspaceId }).(pulumi.StringOutput)
}

func (o LookupWorkspaceResultOutput) WorkspaceProperties() GetWorkspaceWorkspacePropertyArrayOutput {
	return o.ApplyT(func(v LookupWorkspaceResult) []GetWorkspaceWorkspaceProperty { return v.WorkspaceProperties }).(GetWorkspaceWorkspacePropertyArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupWorkspaceResultOutput{})
}

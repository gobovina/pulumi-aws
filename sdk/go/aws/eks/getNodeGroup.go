// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package eks

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Retrieve information about an EKS Node Group.
//
// ## Example Usage
//
// <!--Start PulumiCodeChooser -->
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/eks"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := eks.LookupNodeGroup(ctx, &eks.LookupNodeGroupArgs{
//				ClusterName:   "example",
//				NodeGroupName: "example",
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
func LookupNodeGroup(ctx *pulumi.Context, args *LookupNodeGroupArgs, opts ...pulumi.InvokeOption) (*LookupNodeGroupResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupNodeGroupResult
	err := ctx.Invoke("aws:eks/getNodeGroup:getNodeGroup", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getNodeGroup.
type LookupNodeGroupArgs struct {
	// Name of the cluster.
	ClusterName string `pulumi:"clusterName"`
	// Name of the node group.
	NodeGroupName string `pulumi:"nodeGroupName"`
	// Key-value map of resource tags.
	Tags map[string]string `pulumi:"tags"`
}

// A collection of values returned by getNodeGroup.
type LookupNodeGroupResult struct {
	// Type of Amazon Machine Image (AMI) associated with the EKS Node Group.
	AmiType string `pulumi:"amiType"`
	// ARN of the EKS Node Group.
	Arn string `pulumi:"arn"`
	// Type of capacity associated with the EKS Node Group. Valid values: `ON_DEMAND`, `SPOT`.
	CapacityType string `pulumi:"capacityType"`
	ClusterName  string `pulumi:"clusterName"`
	// Disk size in GiB for worker nodes.
	DiskSize int `pulumi:"diskSize"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Set of instance types associated with the EKS Node Group.
	InstanceTypes []string `pulumi:"instanceTypes"`
	// Key-value map of Kubernetes labels. Only labels that are applied with the EKS API are managed by this argument. Other Kubernetes labels applied to the EKS Node Group will not be managed.
	Labels map[string]string `pulumi:"labels"`
	// Nested attribute containing information about the launch template used to create the EKS Node Group.
	LaunchTemplates []GetNodeGroupLaunchTemplate `pulumi:"launchTemplates"`
	NodeGroupName   string                       `pulumi:"nodeGroupName"`
	// ARN of the IAM Role that provides permissions for the EKS Node Group.
	NodeRoleArn string `pulumi:"nodeRoleArn"`
	// AMI version of the EKS Node Group.
	ReleaseVersion string `pulumi:"releaseVersion"`
	// Configuration block with remote access settings.
	RemoteAccesses []GetNodeGroupRemoteAccess `pulumi:"remoteAccesses"`
	// List of objects containing information about underlying resources.
	Resources []GetNodeGroupResource `pulumi:"resources"`
	// Configuration block with scaling settings.
	ScalingConfigs []GetNodeGroupScalingConfig `pulumi:"scalingConfigs"`
	// Status of the EKS Node Group.
	Status string `pulumi:"status"`
	// Identifiers of EC2 Subnets to associate with the EKS Node Group.
	SubnetIds []string `pulumi:"subnetIds"`
	// Key-value map of resource tags.
	Tags map[string]string `pulumi:"tags"`
	// List of objects containing information about taints applied to the nodes in the EKS Node Group.
	Taints []GetNodeGroupTaint `pulumi:"taints"`
	// Kubernetes version.
	Version string `pulumi:"version"`
}

func LookupNodeGroupOutput(ctx *pulumi.Context, args LookupNodeGroupOutputArgs, opts ...pulumi.InvokeOption) LookupNodeGroupResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupNodeGroupResult, error) {
			args := v.(LookupNodeGroupArgs)
			r, err := LookupNodeGroup(ctx, &args, opts...)
			var s LookupNodeGroupResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupNodeGroupResultOutput)
}

// A collection of arguments for invoking getNodeGroup.
type LookupNodeGroupOutputArgs struct {
	// Name of the cluster.
	ClusterName pulumi.StringInput `pulumi:"clusterName"`
	// Name of the node group.
	NodeGroupName pulumi.StringInput `pulumi:"nodeGroupName"`
	// Key-value map of resource tags.
	Tags pulumi.StringMapInput `pulumi:"tags"`
}

func (LookupNodeGroupOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupNodeGroupArgs)(nil)).Elem()
}

// A collection of values returned by getNodeGroup.
type LookupNodeGroupResultOutput struct{ *pulumi.OutputState }

func (LookupNodeGroupResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupNodeGroupResult)(nil)).Elem()
}

func (o LookupNodeGroupResultOutput) ToLookupNodeGroupResultOutput() LookupNodeGroupResultOutput {
	return o
}

func (o LookupNodeGroupResultOutput) ToLookupNodeGroupResultOutputWithContext(ctx context.Context) LookupNodeGroupResultOutput {
	return o
}

// Type of Amazon Machine Image (AMI) associated with the EKS Node Group.
func (o LookupNodeGroupResultOutput) AmiType() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNodeGroupResult) string { return v.AmiType }).(pulumi.StringOutput)
}

// ARN of the EKS Node Group.
func (o LookupNodeGroupResultOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNodeGroupResult) string { return v.Arn }).(pulumi.StringOutput)
}

// Type of capacity associated with the EKS Node Group. Valid values: `ON_DEMAND`, `SPOT`.
func (o LookupNodeGroupResultOutput) CapacityType() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNodeGroupResult) string { return v.CapacityType }).(pulumi.StringOutput)
}

func (o LookupNodeGroupResultOutput) ClusterName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNodeGroupResult) string { return v.ClusterName }).(pulumi.StringOutput)
}

// Disk size in GiB for worker nodes.
func (o LookupNodeGroupResultOutput) DiskSize() pulumi.IntOutput {
	return o.ApplyT(func(v LookupNodeGroupResult) int { return v.DiskSize }).(pulumi.IntOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupNodeGroupResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNodeGroupResult) string { return v.Id }).(pulumi.StringOutput)
}

// Set of instance types associated with the EKS Node Group.
func (o LookupNodeGroupResultOutput) InstanceTypes() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupNodeGroupResult) []string { return v.InstanceTypes }).(pulumi.StringArrayOutput)
}

// Key-value map of Kubernetes labels. Only labels that are applied with the EKS API are managed by this argument. Other Kubernetes labels applied to the EKS Node Group will not be managed.
func (o LookupNodeGroupResultOutput) Labels() pulumi.StringMapOutput {
	return o.ApplyT(func(v LookupNodeGroupResult) map[string]string { return v.Labels }).(pulumi.StringMapOutput)
}

// Nested attribute containing information about the launch template used to create the EKS Node Group.
func (o LookupNodeGroupResultOutput) LaunchTemplates() GetNodeGroupLaunchTemplateArrayOutput {
	return o.ApplyT(func(v LookupNodeGroupResult) []GetNodeGroupLaunchTemplate { return v.LaunchTemplates }).(GetNodeGroupLaunchTemplateArrayOutput)
}

func (o LookupNodeGroupResultOutput) NodeGroupName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNodeGroupResult) string { return v.NodeGroupName }).(pulumi.StringOutput)
}

// ARN of the IAM Role that provides permissions for the EKS Node Group.
func (o LookupNodeGroupResultOutput) NodeRoleArn() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNodeGroupResult) string { return v.NodeRoleArn }).(pulumi.StringOutput)
}

// AMI version of the EKS Node Group.
func (o LookupNodeGroupResultOutput) ReleaseVersion() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNodeGroupResult) string { return v.ReleaseVersion }).(pulumi.StringOutput)
}

// Configuration block with remote access settings.
func (o LookupNodeGroupResultOutput) RemoteAccesses() GetNodeGroupRemoteAccessArrayOutput {
	return o.ApplyT(func(v LookupNodeGroupResult) []GetNodeGroupRemoteAccess { return v.RemoteAccesses }).(GetNodeGroupRemoteAccessArrayOutput)
}

// List of objects containing information about underlying resources.
func (o LookupNodeGroupResultOutput) Resources() GetNodeGroupResourceArrayOutput {
	return o.ApplyT(func(v LookupNodeGroupResult) []GetNodeGroupResource { return v.Resources }).(GetNodeGroupResourceArrayOutput)
}

// Configuration block with scaling settings.
func (o LookupNodeGroupResultOutput) ScalingConfigs() GetNodeGroupScalingConfigArrayOutput {
	return o.ApplyT(func(v LookupNodeGroupResult) []GetNodeGroupScalingConfig { return v.ScalingConfigs }).(GetNodeGroupScalingConfigArrayOutput)
}

// Status of the EKS Node Group.
func (o LookupNodeGroupResultOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNodeGroupResult) string { return v.Status }).(pulumi.StringOutput)
}

// Identifiers of EC2 Subnets to associate with the EKS Node Group.
func (o LookupNodeGroupResultOutput) SubnetIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupNodeGroupResult) []string { return v.SubnetIds }).(pulumi.StringArrayOutput)
}

// Key-value map of resource tags.
func (o LookupNodeGroupResultOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v LookupNodeGroupResult) map[string]string { return v.Tags }).(pulumi.StringMapOutput)
}

// List of objects containing information about taints applied to the nodes in the EKS Node Group.
func (o LookupNodeGroupResultOutput) Taints() GetNodeGroupTaintArrayOutput {
	return o.ApplyT(func(v LookupNodeGroupResult) []GetNodeGroupTaint { return v.Taints }).(GetNodeGroupTaintArrayOutput)
}

// Kubernetes version.
func (o LookupNodeGroupResultOutput) Version() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNodeGroupResult) string { return v.Version }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupNodeGroupResultOutput{})
}

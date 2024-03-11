// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package eks

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Access Entry Configurations for an EKS Cluster.
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
//			_, err := eks.LookupAccessEntry(ctx, &eks.LookupAccessEntryArgs{
//				ClusterName:  exampleAwsEksCluster.Name,
//				PrincipalArn: exampleAwsIamRole.Arn,
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("eksAccessEntryOutputs", exampleAwsEksAccessEntry)
//			return nil
//		})
//	}
//
// ```
// <!--End PulumiCodeChooser -->
func LookupAccessEntry(ctx *pulumi.Context, args *LookupAccessEntryArgs, opts ...pulumi.InvokeOption) (*LookupAccessEntryResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupAccessEntryResult
	err := ctx.Invoke("aws:eks/getAccessEntry:getAccessEntry", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getAccessEntry.
type LookupAccessEntryArgs struct {
	// Name of the EKS Cluster.
	ClusterName string `pulumi:"clusterName"`
	// The IAM Principal ARN which requires Authentication access to the EKS cluster.
	PrincipalArn string            `pulumi:"principalArn"`
	Tags         map[string]string `pulumi:"tags"`
}

// A collection of values returned by getAccessEntry.
type LookupAccessEntryResult struct {
	// Amazon Resource Name (ARN) of the Access Entry.
	AccessEntryArn string `pulumi:"accessEntryArn"`
	ClusterName    string `pulumi:"clusterName"`
	// Date and time in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) that the EKS add-on was created.
	CreatedAt string `pulumi:"createdAt"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// List of string which can optionally specify the Kubernetes groups the user would belong to when creating an access entry.
	KubernetesGroups []string `pulumi:"kubernetesGroups"`
	// Date and time in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) that the EKS add-on was updated.
	ModifiedAt   string            `pulumi:"modifiedAt"`
	PrincipalArn string            `pulumi:"principalArn"`
	Tags         map[string]string `pulumi:"tags"`
	// (Optional) Key-value map of resource tags, including those inherited from the provider `defaultTags` configuration block.
	TagsAll map[string]string `pulumi:"tagsAll"`
	// Defaults to STANDARD which provides the standard workflow. EC2_LINUX, EC2_WINDOWS, FARGATE_LINUX types disallow users to input a username or groups, and prevent associations.
	Type string `pulumi:"type"`
	// Defaults to principal ARN if user is principal else defaults to assume-role/session-name is role is used.
	UserName string `pulumi:"userName"`
}

func LookupAccessEntryOutput(ctx *pulumi.Context, args LookupAccessEntryOutputArgs, opts ...pulumi.InvokeOption) LookupAccessEntryResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupAccessEntryResult, error) {
			args := v.(LookupAccessEntryArgs)
			r, err := LookupAccessEntry(ctx, &args, opts...)
			var s LookupAccessEntryResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupAccessEntryResultOutput)
}

// A collection of arguments for invoking getAccessEntry.
type LookupAccessEntryOutputArgs struct {
	// Name of the EKS Cluster.
	ClusterName pulumi.StringInput `pulumi:"clusterName"`
	// The IAM Principal ARN which requires Authentication access to the EKS cluster.
	PrincipalArn pulumi.StringInput    `pulumi:"principalArn"`
	Tags         pulumi.StringMapInput `pulumi:"tags"`
}

func (LookupAccessEntryOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupAccessEntryArgs)(nil)).Elem()
}

// A collection of values returned by getAccessEntry.
type LookupAccessEntryResultOutput struct{ *pulumi.OutputState }

func (LookupAccessEntryResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupAccessEntryResult)(nil)).Elem()
}

func (o LookupAccessEntryResultOutput) ToLookupAccessEntryResultOutput() LookupAccessEntryResultOutput {
	return o
}

func (o LookupAccessEntryResultOutput) ToLookupAccessEntryResultOutputWithContext(ctx context.Context) LookupAccessEntryResultOutput {
	return o
}

// Amazon Resource Name (ARN) of the Access Entry.
func (o LookupAccessEntryResultOutput) AccessEntryArn() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAccessEntryResult) string { return v.AccessEntryArn }).(pulumi.StringOutput)
}

func (o LookupAccessEntryResultOutput) ClusterName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAccessEntryResult) string { return v.ClusterName }).(pulumi.StringOutput)
}

// Date and time in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) that the EKS add-on was created.
func (o LookupAccessEntryResultOutput) CreatedAt() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAccessEntryResult) string { return v.CreatedAt }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupAccessEntryResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAccessEntryResult) string { return v.Id }).(pulumi.StringOutput)
}

// List of string which can optionally specify the Kubernetes groups the user would belong to when creating an access entry.
func (o LookupAccessEntryResultOutput) KubernetesGroups() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupAccessEntryResult) []string { return v.KubernetesGroups }).(pulumi.StringArrayOutput)
}

// Date and time in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) that the EKS add-on was updated.
func (o LookupAccessEntryResultOutput) ModifiedAt() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAccessEntryResult) string { return v.ModifiedAt }).(pulumi.StringOutput)
}

func (o LookupAccessEntryResultOutput) PrincipalArn() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAccessEntryResult) string { return v.PrincipalArn }).(pulumi.StringOutput)
}

func (o LookupAccessEntryResultOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v LookupAccessEntryResult) map[string]string { return v.Tags }).(pulumi.StringMapOutput)
}

// (Optional) Key-value map of resource tags, including those inherited from the provider `defaultTags` configuration block.
func (o LookupAccessEntryResultOutput) TagsAll() pulumi.StringMapOutput {
	return o.ApplyT(func(v LookupAccessEntryResult) map[string]string { return v.TagsAll }).(pulumi.StringMapOutput)
}

// Defaults to STANDARD which provides the standard workflow. EC2_LINUX, EC2_WINDOWS, FARGATE_LINUX types disallow users to input a username or groups, and prevent associations.
func (o LookupAccessEntryResultOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAccessEntryResult) string { return v.Type }).(pulumi.StringOutput)
}

// Defaults to principal ARN if user is principal else defaults to assume-role/session-name is role is used.
func (o LookupAccessEntryResultOutput) UserName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAccessEntryResult) string { return v.UserName }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupAccessEntryResultOutput{})
}

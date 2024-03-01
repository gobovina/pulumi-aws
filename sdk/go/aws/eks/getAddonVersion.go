// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package eks

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Retrieve information about a specific EKS add-on version compatible with an EKS cluster version.
//
// ## Example Usage
//
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
//			_default, err := eks.GetAddonVersion(ctx, &eks.GetAddonVersionArgs{
//				AddonName:         "vpc-cni",
//				KubernetesVersion: example.Version,
//			}, nil)
//			if err != nil {
//				return err
//			}
//			latest, err := eks.GetAddonVersion(ctx, &eks.GetAddonVersionArgs{
//				AddonName:         "vpc-cni",
//				KubernetesVersion: example.Version,
//				MostRecent:        pulumi.BoolRef(true),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = eks.NewAddon(ctx, "vpc_cni", &eks.AddonArgs{
//				ClusterName:  pulumi.Any(example.Name),
//				AddonName:    pulumi.String("vpc-cni"),
//				AddonVersion: *pulumi.String(latest.Version),
//			})
//			if err != nil {
//				return err
//			}
//			ctx.Export("default", _default.Version)
//			ctx.Export("latest", latest.Version)
//			return nil
//		})
//	}
//
// ```
func GetAddonVersion(ctx *pulumi.Context, args *GetAddonVersionArgs, opts ...pulumi.InvokeOption) (*GetAddonVersionResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetAddonVersionResult
	err := ctx.Invoke("aws:eks/getAddonVersion:getAddonVersion", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getAddonVersion.
type GetAddonVersionArgs struct {
	// Name of the EKS add-on. The name must match one of
	// the names returned by [list-addon](https://docs.aws.amazon.com/cli/latest/reference/eks/list-addons.html).
	AddonName string `pulumi:"addonName"`
	// Version of the EKS Cluster. Must be between 1-100 characters in length. Must begin with an alphanumeric character, and must only contain alphanumeric characters, dashes and underscores (`^[0-9A-Za-z][A-Za-z0-9\-_]+$`).
	KubernetesVersion string `pulumi:"kubernetesVersion"`
	// Determines if the most recent or default version of the addon should be returned.
	MostRecent *bool `pulumi:"mostRecent"`
}

// A collection of values returned by getAddonVersion.
type GetAddonVersionResult struct {
	AddonName string `pulumi:"addonName"`
	// The provider-assigned unique ID for this managed resource.
	Id                string `pulumi:"id"`
	KubernetesVersion string `pulumi:"kubernetesVersion"`
	MostRecent        *bool  `pulumi:"mostRecent"`
	// Version of the EKS add-on.
	Version string `pulumi:"version"`
}

func GetAddonVersionOutput(ctx *pulumi.Context, args GetAddonVersionOutputArgs, opts ...pulumi.InvokeOption) GetAddonVersionResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetAddonVersionResult, error) {
			args := v.(GetAddonVersionArgs)
			r, err := GetAddonVersion(ctx, &args, opts...)
			var s GetAddonVersionResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetAddonVersionResultOutput)
}

// A collection of arguments for invoking getAddonVersion.
type GetAddonVersionOutputArgs struct {
	// Name of the EKS add-on. The name must match one of
	// the names returned by [list-addon](https://docs.aws.amazon.com/cli/latest/reference/eks/list-addons.html).
	AddonName pulumi.StringInput `pulumi:"addonName"`
	// Version of the EKS Cluster. Must be between 1-100 characters in length. Must begin with an alphanumeric character, and must only contain alphanumeric characters, dashes and underscores (`^[0-9A-Za-z][A-Za-z0-9\-_]+$`).
	KubernetesVersion pulumi.StringInput `pulumi:"kubernetesVersion"`
	// Determines if the most recent or default version of the addon should be returned.
	MostRecent pulumi.BoolPtrInput `pulumi:"mostRecent"`
}

func (GetAddonVersionOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetAddonVersionArgs)(nil)).Elem()
}

// A collection of values returned by getAddonVersion.
type GetAddonVersionResultOutput struct{ *pulumi.OutputState }

func (GetAddonVersionResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetAddonVersionResult)(nil)).Elem()
}

func (o GetAddonVersionResultOutput) ToGetAddonVersionResultOutput() GetAddonVersionResultOutput {
	return o
}

func (o GetAddonVersionResultOutput) ToGetAddonVersionResultOutputWithContext(ctx context.Context) GetAddonVersionResultOutput {
	return o
}

func (o GetAddonVersionResultOutput) AddonName() pulumi.StringOutput {
	return o.ApplyT(func(v GetAddonVersionResult) string { return v.AddonName }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetAddonVersionResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetAddonVersionResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetAddonVersionResultOutput) KubernetesVersion() pulumi.StringOutput {
	return o.ApplyT(func(v GetAddonVersionResult) string { return v.KubernetesVersion }).(pulumi.StringOutput)
}

func (o GetAddonVersionResultOutput) MostRecent() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v GetAddonVersionResult) *bool { return v.MostRecent }).(pulumi.BoolPtrOutput)
}

// Version of the EKS add-on.
func (o GetAddonVersionResultOutput) Version() pulumi.StringOutput {
	return o.ApplyT(func(v GetAddonVersionResult) string { return v.Version }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetAddonVersionResultOutput{})
}

// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package appmesh

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// The App Mesh Virtual Service data source allows details of an App Mesh Virtual Service to be retrieved by its name, mesh_name, and optionally the mesh_owner.
//
// ## Example Usage
//
// <!--Start PulumiCodeChooser -->
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/appmesh"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := appmesh.LookupVirtualService(ctx, &appmesh.LookupVirtualServiceArgs{
//				Name:     "example.mesh.local",
//				MeshName: "example-mesh",
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
//
// <!--Start PulumiCodeChooser -->
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws"
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/appmesh"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			current, err := aws.GetCallerIdentity(ctx, nil, nil)
//			if err != nil {
//				return err
//			}
//			_, err = appmesh.LookupVirtualService(ctx, &appmesh.LookupVirtualServiceArgs{
//				Name:      "example.mesh.local",
//				MeshName:  "example-mesh",
//				MeshOwner: pulumi.StringRef(current.AccountId),
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
func LookupVirtualService(ctx *pulumi.Context, args *LookupVirtualServiceArgs, opts ...pulumi.InvokeOption) (*LookupVirtualServiceResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupVirtualServiceResult
	err := ctx.Invoke("aws:appmesh/getVirtualService:getVirtualService", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getVirtualService.
type LookupVirtualServiceArgs struct {
	// Name of the service mesh in which the virtual service exists.
	MeshName string `pulumi:"meshName"`
	// AWS account ID of the service mesh's owner.
	MeshOwner *string `pulumi:"meshOwner"`
	// Name of the virtual service.
	Name string `pulumi:"name"`
	// Map of tags.
	Tags map[string]string `pulumi:"tags"`
}

// A collection of values returned by getVirtualService.
type LookupVirtualServiceResult struct {
	// ARN of the virtual service.
	Arn string `pulumi:"arn"`
	// Creation date of the virtual service.
	CreatedDate string `pulumi:"createdDate"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Last update date of the virtual service.
	LastUpdatedDate string `pulumi:"lastUpdatedDate"`
	MeshName        string `pulumi:"meshName"`
	MeshOwner       string `pulumi:"meshOwner"`
	Name            string `pulumi:"name"`
	// Resource owner's AWS account ID.
	ResourceOwner string `pulumi:"resourceOwner"`
	// Virtual service specification. See the `appmesh.VirtualService` resource for details.
	Specs []GetVirtualServiceSpec `pulumi:"specs"`
	// Map of tags.
	Tags map[string]string `pulumi:"tags"`
}

func LookupVirtualServiceOutput(ctx *pulumi.Context, args LookupVirtualServiceOutputArgs, opts ...pulumi.InvokeOption) LookupVirtualServiceResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupVirtualServiceResult, error) {
			args := v.(LookupVirtualServiceArgs)
			r, err := LookupVirtualService(ctx, &args, opts...)
			var s LookupVirtualServiceResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupVirtualServiceResultOutput)
}

// A collection of arguments for invoking getVirtualService.
type LookupVirtualServiceOutputArgs struct {
	// Name of the service mesh in which the virtual service exists.
	MeshName pulumi.StringInput `pulumi:"meshName"`
	// AWS account ID of the service mesh's owner.
	MeshOwner pulumi.StringPtrInput `pulumi:"meshOwner"`
	// Name of the virtual service.
	Name pulumi.StringInput `pulumi:"name"`
	// Map of tags.
	Tags pulumi.StringMapInput `pulumi:"tags"`
}

func (LookupVirtualServiceOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupVirtualServiceArgs)(nil)).Elem()
}

// A collection of values returned by getVirtualService.
type LookupVirtualServiceResultOutput struct{ *pulumi.OutputState }

func (LookupVirtualServiceResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupVirtualServiceResult)(nil)).Elem()
}

func (o LookupVirtualServiceResultOutput) ToLookupVirtualServiceResultOutput() LookupVirtualServiceResultOutput {
	return o
}

func (o LookupVirtualServiceResultOutput) ToLookupVirtualServiceResultOutputWithContext(ctx context.Context) LookupVirtualServiceResultOutput {
	return o
}

// ARN of the virtual service.
func (o LookupVirtualServiceResultOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v LookupVirtualServiceResult) string { return v.Arn }).(pulumi.StringOutput)
}

// Creation date of the virtual service.
func (o LookupVirtualServiceResultOutput) CreatedDate() pulumi.StringOutput {
	return o.ApplyT(func(v LookupVirtualServiceResult) string { return v.CreatedDate }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupVirtualServiceResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupVirtualServiceResult) string { return v.Id }).(pulumi.StringOutput)
}

// Last update date of the virtual service.
func (o LookupVirtualServiceResultOutput) LastUpdatedDate() pulumi.StringOutput {
	return o.ApplyT(func(v LookupVirtualServiceResult) string { return v.LastUpdatedDate }).(pulumi.StringOutput)
}

func (o LookupVirtualServiceResultOutput) MeshName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupVirtualServiceResult) string { return v.MeshName }).(pulumi.StringOutput)
}

func (o LookupVirtualServiceResultOutput) MeshOwner() pulumi.StringOutput {
	return o.ApplyT(func(v LookupVirtualServiceResult) string { return v.MeshOwner }).(pulumi.StringOutput)
}

func (o LookupVirtualServiceResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupVirtualServiceResult) string { return v.Name }).(pulumi.StringOutput)
}

// Resource owner's AWS account ID.
func (o LookupVirtualServiceResultOutput) ResourceOwner() pulumi.StringOutput {
	return o.ApplyT(func(v LookupVirtualServiceResult) string { return v.ResourceOwner }).(pulumi.StringOutput)
}

// Virtual service specification. See the `appmesh.VirtualService` resource for details.
func (o LookupVirtualServiceResultOutput) Specs() GetVirtualServiceSpecArrayOutput {
	return o.ApplyT(func(v LookupVirtualServiceResult) []GetVirtualServiceSpec { return v.Specs }).(GetVirtualServiceSpecArrayOutput)
}

// Map of tags.
func (o LookupVirtualServiceResultOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v LookupVirtualServiceResult) map[string]string { return v.Tags }).(pulumi.StringMapOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupVirtualServiceResultOutput{})
}

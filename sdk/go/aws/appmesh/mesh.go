// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package appmesh

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides an AWS App Mesh service mesh resource.
//
// ## Example Usage
// ### Basic
//
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
//			_, err := appmesh.NewMesh(ctx, "simple", nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// ### Egress Filter
//
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
//			_, err := appmesh.NewMesh(ctx, "simple", &appmesh.MeshArgs{
//				Spec: &appmesh.MeshSpecArgs{
//					EgressFilter: &appmesh.MeshSpecEgressFilterArgs{
//						Type: pulumi.String("ALLOW_ALL"),
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// Using `pulumi import`, import App Mesh service meshes using the `name`. For example:
//
// ```sh
//
//	$ pulumi import aws:appmesh/mesh:Mesh simple simpleapp
//
// ```
type Mesh struct {
	pulumi.CustomResourceState

	// ARN of the service mesh.
	Arn pulumi.StringOutput `pulumi:"arn"`
	// Creation date of the service mesh.
	CreatedDate pulumi.StringOutput `pulumi:"createdDate"`
	// Last update date of the service mesh.
	LastUpdatedDate pulumi.StringOutput `pulumi:"lastUpdatedDate"`
	// AWS account ID of the service mesh's owner.
	MeshOwner pulumi.StringOutput `pulumi:"meshOwner"`
	// Name to use for the service mesh. Must be between 1 and 255 characters in length.
	Name pulumi.StringOutput `pulumi:"name"`
	// Resource owner's AWS account ID.
	ResourceOwner pulumi.StringOutput `pulumi:"resourceOwner"`
	// Service mesh specification to apply.
	Spec MeshSpecPtrOutput `pulumi:"spec"`
	// Map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapOutput `pulumi:"tagsAll"`
}

// NewMesh registers a new resource with the given unique name, arguments, and options.
func NewMesh(ctx *pulumi.Context,
	name string, args *MeshArgs, opts ...pulumi.ResourceOption) (*Mesh, error) {
	if args == nil {
		args = &MeshArgs{}
	}

	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Mesh
	err := ctx.RegisterResource("aws:appmesh/mesh:Mesh", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetMesh gets an existing Mesh resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetMesh(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *MeshState, opts ...pulumi.ResourceOption) (*Mesh, error) {
	var resource Mesh
	err := ctx.ReadResource("aws:appmesh/mesh:Mesh", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Mesh resources.
type meshState struct {
	// ARN of the service mesh.
	Arn *string `pulumi:"arn"`
	// Creation date of the service mesh.
	CreatedDate *string `pulumi:"createdDate"`
	// Last update date of the service mesh.
	LastUpdatedDate *string `pulumi:"lastUpdatedDate"`
	// AWS account ID of the service mesh's owner.
	MeshOwner *string `pulumi:"meshOwner"`
	// Name to use for the service mesh. Must be between 1 and 255 characters in length.
	Name *string `pulumi:"name"`
	// Resource owner's AWS account ID.
	ResourceOwner *string `pulumi:"resourceOwner"`
	// Service mesh specification to apply.
	Spec *MeshSpec `pulumi:"spec"`
	// Map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll map[string]string `pulumi:"tagsAll"`
}

type MeshState struct {
	// ARN of the service mesh.
	Arn pulumi.StringPtrInput
	// Creation date of the service mesh.
	CreatedDate pulumi.StringPtrInput
	// Last update date of the service mesh.
	LastUpdatedDate pulumi.StringPtrInput
	// AWS account ID of the service mesh's owner.
	MeshOwner pulumi.StringPtrInput
	// Name to use for the service mesh. Must be between 1 and 255 characters in length.
	Name pulumi.StringPtrInput
	// Resource owner's AWS account ID.
	ResourceOwner pulumi.StringPtrInput
	// Service mesh specification to apply.
	Spec MeshSpecPtrInput
	// Map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapInput
}

func (MeshState) ElementType() reflect.Type {
	return reflect.TypeOf((*meshState)(nil)).Elem()
}

type meshArgs struct {
	// Name to use for the service mesh. Must be between 1 and 255 characters in length.
	Name *string `pulumi:"name"`
	// Service mesh specification to apply.
	Spec *MeshSpec `pulumi:"spec"`
	// Map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
}

// The set of arguments for constructing a Mesh resource.
type MeshArgs struct {
	// Name to use for the service mesh. Must be between 1 and 255 characters in length.
	Name pulumi.StringPtrInput
	// Service mesh specification to apply.
	Spec MeshSpecPtrInput
	// Map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
}

func (MeshArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*meshArgs)(nil)).Elem()
}

type MeshInput interface {
	pulumi.Input

	ToMeshOutput() MeshOutput
	ToMeshOutputWithContext(ctx context.Context) MeshOutput
}

func (*Mesh) ElementType() reflect.Type {
	return reflect.TypeOf((**Mesh)(nil)).Elem()
}

func (i *Mesh) ToMeshOutput() MeshOutput {
	return i.ToMeshOutputWithContext(context.Background())
}

func (i *Mesh) ToMeshOutputWithContext(ctx context.Context) MeshOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MeshOutput)
}

// MeshArrayInput is an input type that accepts MeshArray and MeshArrayOutput values.
// You can construct a concrete instance of `MeshArrayInput` via:
//
//	MeshArray{ MeshArgs{...} }
type MeshArrayInput interface {
	pulumi.Input

	ToMeshArrayOutput() MeshArrayOutput
	ToMeshArrayOutputWithContext(context.Context) MeshArrayOutput
}

type MeshArray []MeshInput

func (MeshArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Mesh)(nil)).Elem()
}

func (i MeshArray) ToMeshArrayOutput() MeshArrayOutput {
	return i.ToMeshArrayOutputWithContext(context.Background())
}

func (i MeshArray) ToMeshArrayOutputWithContext(ctx context.Context) MeshArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MeshArrayOutput)
}

// MeshMapInput is an input type that accepts MeshMap and MeshMapOutput values.
// You can construct a concrete instance of `MeshMapInput` via:
//
//	MeshMap{ "key": MeshArgs{...} }
type MeshMapInput interface {
	pulumi.Input

	ToMeshMapOutput() MeshMapOutput
	ToMeshMapOutputWithContext(context.Context) MeshMapOutput
}

type MeshMap map[string]MeshInput

func (MeshMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Mesh)(nil)).Elem()
}

func (i MeshMap) ToMeshMapOutput() MeshMapOutput {
	return i.ToMeshMapOutputWithContext(context.Background())
}

func (i MeshMap) ToMeshMapOutputWithContext(ctx context.Context) MeshMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MeshMapOutput)
}

type MeshOutput struct{ *pulumi.OutputState }

func (MeshOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Mesh)(nil)).Elem()
}

func (o MeshOutput) ToMeshOutput() MeshOutput {
	return o
}

func (o MeshOutput) ToMeshOutputWithContext(ctx context.Context) MeshOutput {
	return o
}

// ARN of the service mesh.
func (o MeshOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v *Mesh) pulumi.StringOutput { return v.Arn }).(pulumi.StringOutput)
}

// Creation date of the service mesh.
func (o MeshOutput) CreatedDate() pulumi.StringOutput {
	return o.ApplyT(func(v *Mesh) pulumi.StringOutput { return v.CreatedDate }).(pulumi.StringOutput)
}

// Last update date of the service mesh.
func (o MeshOutput) LastUpdatedDate() pulumi.StringOutput {
	return o.ApplyT(func(v *Mesh) pulumi.StringOutput { return v.LastUpdatedDate }).(pulumi.StringOutput)
}

// AWS account ID of the service mesh's owner.
func (o MeshOutput) MeshOwner() pulumi.StringOutput {
	return o.ApplyT(func(v *Mesh) pulumi.StringOutput { return v.MeshOwner }).(pulumi.StringOutput)
}

// Name to use for the service mesh. Must be between 1 and 255 characters in length.
func (o MeshOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Mesh) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Resource owner's AWS account ID.
func (o MeshOutput) ResourceOwner() pulumi.StringOutput {
	return o.ApplyT(func(v *Mesh) pulumi.StringOutput { return v.ResourceOwner }).(pulumi.StringOutput)
}

// Service mesh specification to apply.
func (o MeshOutput) Spec() MeshSpecPtrOutput {
	return o.ApplyT(func(v *Mesh) MeshSpecPtrOutput { return v.Spec }).(MeshSpecPtrOutput)
}

// Map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
func (o MeshOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Mesh) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
//
// Deprecated: Please use `tags` instead.
func (o MeshOutput) TagsAll() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Mesh) pulumi.StringMapOutput { return v.TagsAll }).(pulumi.StringMapOutput)
}

type MeshArrayOutput struct{ *pulumi.OutputState }

func (MeshArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Mesh)(nil)).Elem()
}

func (o MeshArrayOutput) ToMeshArrayOutput() MeshArrayOutput {
	return o
}

func (o MeshArrayOutput) ToMeshArrayOutputWithContext(ctx context.Context) MeshArrayOutput {
	return o
}

func (o MeshArrayOutput) Index(i pulumi.IntInput) MeshOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Mesh {
		return vs[0].([]*Mesh)[vs[1].(int)]
	}).(MeshOutput)
}

type MeshMapOutput struct{ *pulumi.OutputState }

func (MeshMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Mesh)(nil)).Elem()
}

func (o MeshMapOutput) ToMeshMapOutput() MeshMapOutput {
	return o
}

func (o MeshMapOutput) ToMeshMapOutputWithContext(ctx context.Context) MeshMapOutput {
	return o
}

func (o MeshMapOutput) MapIndex(k pulumi.StringInput) MeshOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Mesh {
		return vs[0].(map[string]*Mesh)[vs[1].(string)]
	}).(MeshOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*MeshInput)(nil)).Elem(), &Mesh{})
	pulumi.RegisterInputType(reflect.TypeOf((*MeshArrayInput)(nil)).Elem(), MeshArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*MeshMapInput)(nil)).Elem(), MeshMap{})
	pulumi.RegisterOutputType(MeshOutput{})
	pulumi.RegisterOutputType(MeshArrayOutput{})
	pulumi.RegisterOutputType(MeshMapOutput{})
}

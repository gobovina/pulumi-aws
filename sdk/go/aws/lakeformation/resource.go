// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package lakeformation

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Registers a Lake Formation resource (e.g., S3 bucket) as managed by the Data Catalog. In other words, the S3 path is added to the data lake.
//
// Choose a role that has read/write access to the chosen Amazon S3 path or use the service-linked role.
// When you register the S3 path, the service-linked role and a new inline policy are created on your behalf.
// Lake Formation adds the first path to the inline policy and attaches it to the service-linked role.
// When you register subsequent paths, Lake Formation adds the path to the existing policy.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/lakeformation"
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/s3"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			example, err := s3.LookupBucket(ctx, &s3.LookupBucketArgs{
//				Bucket: "an-example-bucket",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = lakeformation.NewResource(ctx, "example", &lakeformation.ResourceArgs{
//				Arn: *pulumi.String(example.Arn),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
type Resource struct {
	pulumi.CustomResourceState

	// Amazon Resource Name (ARN) of the resource.
	//
	// The following arguments are optional:
	Arn pulumi.StringOutput `pulumi:"arn"`
	// Flag to enable AWS LakeFormation hybrid access permission mode.
	//
	// > **NOTE:** AWS does not support registering an S3 location with an IAM role and subsequently updating the S3 location registration to a service-linked role.
	HybridAccessEnabled pulumi.BoolOutput `pulumi:"hybridAccessEnabled"`
	// Date and time the resource was last modified in [RFC 3339 format](https://tools.ietf.org/html/rfc3339#section-5.8).
	LastModified pulumi.StringOutput `pulumi:"lastModified"`
	// Role that has read/write access to the resource.
	RoleArn pulumi.StringOutput `pulumi:"roleArn"`
	// Designates an AWS Identity and Access Management (IAM) service-linked role by registering this role with the Data Catalog.
	UseServiceLinkedRole pulumi.BoolPtrOutput `pulumi:"useServiceLinkedRole"`
	WithFederation       pulumi.BoolOutput    `pulumi:"withFederation"`
}

// NewResource registers a new resource with the given unique name, arguments, and options.
func NewResource(ctx *pulumi.Context,
	name string, args *ResourceArgs, opts ...pulumi.ResourceOption) (*Resource, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Arn == nil {
		return nil, errors.New("invalid value for required argument 'Arn'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Resource
	err := ctx.RegisterResource("aws:lakeformation/resource:Resource", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetResource gets an existing Resource resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetResource(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ResourceState, opts ...pulumi.ResourceOption) (*Resource, error) {
	var resource Resource
	err := ctx.ReadResource("aws:lakeformation/resource:Resource", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Resource resources.
type resourceState struct {
	// Amazon Resource Name (ARN) of the resource.
	//
	// The following arguments are optional:
	Arn *string `pulumi:"arn"`
	// Flag to enable AWS LakeFormation hybrid access permission mode.
	//
	// > **NOTE:** AWS does not support registering an S3 location with an IAM role and subsequently updating the S3 location registration to a service-linked role.
	HybridAccessEnabled *bool `pulumi:"hybridAccessEnabled"`
	// Date and time the resource was last modified in [RFC 3339 format](https://tools.ietf.org/html/rfc3339#section-5.8).
	LastModified *string `pulumi:"lastModified"`
	// Role that has read/write access to the resource.
	RoleArn *string `pulumi:"roleArn"`
	// Designates an AWS Identity and Access Management (IAM) service-linked role by registering this role with the Data Catalog.
	UseServiceLinkedRole *bool `pulumi:"useServiceLinkedRole"`
	WithFederation       *bool `pulumi:"withFederation"`
}

type ResourceState struct {
	// Amazon Resource Name (ARN) of the resource.
	//
	// The following arguments are optional:
	Arn pulumi.StringPtrInput
	// Flag to enable AWS LakeFormation hybrid access permission mode.
	//
	// > **NOTE:** AWS does not support registering an S3 location with an IAM role and subsequently updating the S3 location registration to a service-linked role.
	HybridAccessEnabled pulumi.BoolPtrInput
	// Date and time the resource was last modified in [RFC 3339 format](https://tools.ietf.org/html/rfc3339#section-5.8).
	LastModified pulumi.StringPtrInput
	// Role that has read/write access to the resource.
	RoleArn pulumi.StringPtrInput
	// Designates an AWS Identity and Access Management (IAM) service-linked role by registering this role with the Data Catalog.
	UseServiceLinkedRole pulumi.BoolPtrInput
	WithFederation       pulumi.BoolPtrInput
}

func (ResourceState) ElementType() reflect.Type {
	return reflect.TypeOf((*resourceState)(nil)).Elem()
}

type resourceArgs struct {
	// Amazon Resource Name (ARN) of the resource.
	//
	// The following arguments are optional:
	Arn string `pulumi:"arn"`
	// Flag to enable AWS LakeFormation hybrid access permission mode.
	//
	// > **NOTE:** AWS does not support registering an S3 location with an IAM role and subsequently updating the S3 location registration to a service-linked role.
	HybridAccessEnabled *bool `pulumi:"hybridAccessEnabled"`
	// Role that has read/write access to the resource.
	RoleArn *string `pulumi:"roleArn"`
	// Designates an AWS Identity and Access Management (IAM) service-linked role by registering this role with the Data Catalog.
	UseServiceLinkedRole *bool `pulumi:"useServiceLinkedRole"`
	WithFederation       *bool `pulumi:"withFederation"`
}

// The set of arguments for constructing a Resource resource.
type ResourceArgs struct {
	// Amazon Resource Name (ARN) of the resource.
	//
	// The following arguments are optional:
	Arn pulumi.StringInput
	// Flag to enable AWS LakeFormation hybrid access permission mode.
	//
	// > **NOTE:** AWS does not support registering an S3 location with an IAM role and subsequently updating the S3 location registration to a service-linked role.
	HybridAccessEnabled pulumi.BoolPtrInput
	// Role that has read/write access to the resource.
	RoleArn pulumi.StringPtrInput
	// Designates an AWS Identity and Access Management (IAM) service-linked role by registering this role with the Data Catalog.
	UseServiceLinkedRole pulumi.BoolPtrInput
	WithFederation       pulumi.BoolPtrInput
}

func (ResourceArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*resourceArgs)(nil)).Elem()
}

type ResourceInput interface {
	pulumi.Input

	ToResourceOutput() ResourceOutput
	ToResourceOutputWithContext(ctx context.Context) ResourceOutput
}

func (*Resource) ElementType() reflect.Type {
	return reflect.TypeOf((**Resource)(nil)).Elem()
}

func (i *Resource) ToResourceOutput() ResourceOutput {
	return i.ToResourceOutputWithContext(context.Background())
}

func (i *Resource) ToResourceOutputWithContext(ctx context.Context) ResourceOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ResourceOutput)
}

// ResourceArrayInput is an input type that accepts ResourceArray and ResourceArrayOutput values.
// You can construct a concrete instance of `ResourceArrayInput` via:
//
//	ResourceArray{ ResourceArgs{...} }
type ResourceArrayInput interface {
	pulumi.Input

	ToResourceArrayOutput() ResourceArrayOutput
	ToResourceArrayOutputWithContext(context.Context) ResourceArrayOutput
}

type ResourceArray []ResourceInput

func (ResourceArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Resource)(nil)).Elem()
}

func (i ResourceArray) ToResourceArrayOutput() ResourceArrayOutput {
	return i.ToResourceArrayOutputWithContext(context.Background())
}

func (i ResourceArray) ToResourceArrayOutputWithContext(ctx context.Context) ResourceArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ResourceArrayOutput)
}

// ResourceMapInput is an input type that accepts ResourceMap and ResourceMapOutput values.
// You can construct a concrete instance of `ResourceMapInput` via:
//
//	ResourceMap{ "key": ResourceArgs{...} }
type ResourceMapInput interface {
	pulumi.Input

	ToResourceMapOutput() ResourceMapOutput
	ToResourceMapOutputWithContext(context.Context) ResourceMapOutput
}

type ResourceMap map[string]ResourceInput

func (ResourceMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Resource)(nil)).Elem()
}

func (i ResourceMap) ToResourceMapOutput() ResourceMapOutput {
	return i.ToResourceMapOutputWithContext(context.Background())
}

func (i ResourceMap) ToResourceMapOutputWithContext(ctx context.Context) ResourceMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ResourceMapOutput)
}

type ResourceOutput struct{ *pulumi.OutputState }

func (ResourceOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Resource)(nil)).Elem()
}

func (o ResourceOutput) ToResourceOutput() ResourceOutput {
	return o
}

func (o ResourceOutput) ToResourceOutputWithContext(ctx context.Context) ResourceOutput {
	return o
}

// Amazon Resource Name (ARN) of the resource.
//
// The following arguments are optional:
func (o ResourceOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v *Resource) pulumi.StringOutput { return v.Arn }).(pulumi.StringOutput)
}

// Flag to enable AWS LakeFormation hybrid access permission mode.
//
// > **NOTE:** AWS does not support registering an S3 location with an IAM role and subsequently updating the S3 location registration to a service-linked role.
func (o ResourceOutput) HybridAccessEnabled() pulumi.BoolOutput {
	return o.ApplyT(func(v *Resource) pulumi.BoolOutput { return v.HybridAccessEnabled }).(pulumi.BoolOutput)
}

// Date and time the resource was last modified in [RFC 3339 format](https://tools.ietf.org/html/rfc3339#section-5.8).
func (o ResourceOutput) LastModified() pulumi.StringOutput {
	return o.ApplyT(func(v *Resource) pulumi.StringOutput { return v.LastModified }).(pulumi.StringOutput)
}

// Role that has read/write access to the resource.
func (o ResourceOutput) RoleArn() pulumi.StringOutput {
	return o.ApplyT(func(v *Resource) pulumi.StringOutput { return v.RoleArn }).(pulumi.StringOutput)
}

// Designates an AWS Identity and Access Management (IAM) service-linked role by registering this role with the Data Catalog.
func (o ResourceOutput) UseServiceLinkedRole() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Resource) pulumi.BoolPtrOutput { return v.UseServiceLinkedRole }).(pulumi.BoolPtrOutput)
}

func (o ResourceOutput) WithFederation() pulumi.BoolOutput {
	return o.ApplyT(func(v *Resource) pulumi.BoolOutput { return v.WithFederation }).(pulumi.BoolOutput)
}

type ResourceArrayOutput struct{ *pulumi.OutputState }

func (ResourceArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Resource)(nil)).Elem()
}

func (o ResourceArrayOutput) ToResourceArrayOutput() ResourceArrayOutput {
	return o
}

func (o ResourceArrayOutput) ToResourceArrayOutputWithContext(ctx context.Context) ResourceArrayOutput {
	return o
}

func (o ResourceArrayOutput) Index(i pulumi.IntInput) ResourceOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Resource {
		return vs[0].([]*Resource)[vs[1].(int)]
	}).(ResourceOutput)
}

type ResourceMapOutput struct{ *pulumi.OutputState }

func (ResourceMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Resource)(nil)).Elem()
}

func (o ResourceMapOutput) ToResourceMapOutput() ResourceMapOutput {
	return o
}

func (o ResourceMapOutput) ToResourceMapOutputWithContext(ctx context.Context) ResourceMapOutput {
	return o
}

func (o ResourceMapOutput) MapIndex(k pulumi.StringInput) ResourceOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Resource {
		return vs[0].(map[string]*Resource)[vs[1].(string)]
	}).(ResourceOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ResourceInput)(nil)).Elem(), &Resource{})
	pulumi.RegisterInputType(reflect.TypeOf((*ResourceArrayInput)(nil)).Elem(), ResourceArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ResourceMapInput)(nil)).Elem(), ResourceMap{})
	pulumi.RegisterOutputType(ResourceOutput{})
	pulumi.RegisterOutputType(ResourceArrayOutput{})
	pulumi.RegisterOutputType(ResourceMapOutput{})
}

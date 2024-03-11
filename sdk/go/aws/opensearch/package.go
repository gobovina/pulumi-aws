// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package opensearch

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages an AWS Opensearch Package.
//
// ## Example Usage
//
// ### Basic Usage
//
// <!--Start PulumiCodeChooser -->
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/opensearch"
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/s3"
//	"github.com/pulumi/pulumi-std/sdk/go/std"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			myOpensearchPackages, err := s3.NewBucketV2(ctx, "my_opensearch_packages", &s3.BucketV2Args{
//				Bucket: pulumi.String("my-opensearch-packages"),
//			})
//			if err != nil {
//				return err
//			}
//			invokeFilemd5, err := std.Filemd5(ctx, &std.Filemd5Args{
//				Input: "./example.txt",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			example, err := s3.NewBucketObjectv2(ctx, "example", &s3.BucketObjectv2Args{
//				Bucket: myOpensearchPackages.Bucket,
//				Key:    pulumi.String("example.txt"),
//				Source: pulumi.NewFileAsset("./example.txt"),
//				Etag:   invokeFilemd5.Result,
//			})
//			if err != nil {
//				return err
//			}
//			_, err = opensearch.NewPackage(ctx, "example", &opensearch.PackageArgs{
//				PackageName: pulumi.String("example-txt"),
//				PackageSource: &opensearch.PackagePackageSourceArgs{
//					S3BucketName: myOpensearchPackages.Bucket,
//					S3Key:        example.Key,
//				},
//				PackageType: pulumi.String("TXT-DICTIONARY"),
//			})
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
// ## Import
//
// Using `pulumi import`, import AWS Opensearch Packages using the Package ID. For example:
//
// ```sh
// $ pulumi import aws:opensearch/package:Package example package-id
// ```
type Package struct {
	pulumi.CustomResourceState

	// The current version of the package.
	AvailablePackageVersion pulumi.StringOutput `pulumi:"availablePackageVersion"`
	// Description of the package.
	PackageDescription pulumi.StringPtrOutput `pulumi:"packageDescription"`
	PackageId          pulumi.StringOutput    `pulumi:"packageId"`
	// Unique name for the package.
	PackageName pulumi.StringOutput `pulumi:"packageName"`
	// Configuration block for the package source options.
	PackageSource PackagePackageSourceOutput `pulumi:"packageSource"`
	// The type of package.
	PackageType pulumi.StringOutput `pulumi:"packageType"`
}

// NewPackage registers a new resource with the given unique name, arguments, and options.
func NewPackage(ctx *pulumi.Context,
	name string, args *PackageArgs, opts ...pulumi.ResourceOption) (*Package, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.PackageName == nil {
		return nil, errors.New("invalid value for required argument 'PackageName'")
	}
	if args.PackageSource == nil {
		return nil, errors.New("invalid value for required argument 'PackageSource'")
	}
	if args.PackageType == nil {
		return nil, errors.New("invalid value for required argument 'PackageType'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Package
	err := ctx.RegisterResource("aws:opensearch/package:Package", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetPackage gets an existing Package resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetPackage(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *PackageState, opts ...pulumi.ResourceOption) (*Package, error) {
	var resource Package
	err := ctx.ReadResource("aws:opensearch/package:Package", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Package resources.
type packageState struct {
	// The current version of the package.
	AvailablePackageVersion *string `pulumi:"availablePackageVersion"`
	// Description of the package.
	PackageDescription *string `pulumi:"packageDescription"`
	PackageId          *string `pulumi:"packageId"`
	// Unique name for the package.
	PackageName *string `pulumi:"packageName"`
	// Configuration block for the package source options.
	PackageSource *PackagePackageSource `pulumi:"packageSource"`
	// The type of package.
	PackageType *string `pulumi:"packageType"`
}

type PackageState struct {
	// The current version of the package.
	AvailablePackageVersion pulumi.StringPtrInput
	// Description of the package.
	PackageDescription pulumi.StringPtrInput
	PackageId          pulumi.StringPtrInput
	// Unique name for the package.
	PackageName pulumi.StringPtrInput
	// Configuration block for the package source options.
	PackageSource PackagePackageSourcePtrInput
	// The type of package.
	PackageType pulumi.StringPtrInput
}

func (PackageState) ElementType() reflect.Type {
	return reflect.TypeOf((*packageState)(nil)).Elem()
}

type packageArgs struct {
	// Description of the package.
	PackageDescription *string `pulumi:"packageDescription"`
	// Unique name for the package.
	PackageName string `pulumi:"packageName"`
	// Configuration block for the package source options.
	PackageSource PackagePackageSource `pulumi:"packageSource"`
	// The type of package.
	PackageType string `pulumi:"packageType"`
}

// The set of arguments for constructing a Package resource.
type PackageArgs struct {
	// Description of the package.
	PackageDescription pulumi.StringPtrInput
	// Unique name for the package.
	PackageName pulumi.StringInput
	// Configuration block for the package source options.
	PackageSource PackagePackageSourceInput
	// The type of package.
	PackageType pulumi.StringInput
}

func (PackageArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*packageArgs)(nil)).Elem()
}

type PackageInput interface {
	pulumi.Input

	ToPackageOutput() PackageOutput
	ToPackageOutputWithContext(ctx context.Context) PackageOutput
}

func (*Package) ElementType() reflect.Type {
	return reflect.TypeOf((**Package)(nil)).Elem()
}

func (i *Package) ToPackageOutput() PackageOutput {
	return i.ToPackageOutputWithContext(context.Background())
}

func (i *Package) ToPackageOutputWithContext(ctx context.Context) PackageOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PackageOutput)
}

// PackageArrayInput is an input type that accepts PackageArray and PackageArrayOutput values.
// You can construct a concrete instance of `PackageArrayInput` via:
//
//	PackageArray{ PackageArgs{...} }
type PackageArrayInput interface {
	pulumi.Input

	ToPackageArrayOutput() PackageArrayOutput
	ToPackageArrayOutputWithContext(context.Context) PackageArrayOutput
}

type PackageArray []PackageInput

func (PackageArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Package)(nil)).Elem()
}

func (i PackageArray) ToPackageArrayOutput() PackageArrayOutput {
	return i.ToPackageArrayOutputWithContext(context.Background())
}

func (i PackageArray) ToPackageArrayOutputWithContext(ctx context.Context) PackageArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PackageArrayOutput)
}

// PackageMapInput is an input type that accepts PackageMap and PackageMapOutput values.
// You can construct a concrete instance of `PackageMapInput` via:
//
//	PackageMap{ "key": PackageArgs{...} }
type PackageMapInput interface {
	pulumi.Input

	ToPackageMapOutput() PackageMapOutput
	ToPackageMapOutputWithContext(context.Context) PackageMapOutput
}

type PackageMap map[string]PackageInput

func (PackageMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Package)(nil)).Elem()
}

func (i PackageMap) ToPackageMapOutput() PackageMapOutput {
	return i.ToPackageMapOutputWithContext(context.Background())
}

func (i PackageMap) ToPackageMapOutputWithContext(ctx context.Context) PackageMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PackageMapOutput)
}

type PackageOutput struct{ *pulumi.OutputState }

func (PackageOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Package)(nil)).Elem()
}

func (o PackageOutput) ToPackageOutput() PackageOutput {
	return o
}

func (o PackageOutput) ToPackageOutputWithContext(ctx context.Context) PackageOutput {
	return o
}

// The current version of the package.
func (o PackageOutput) AvailablePackageVersion() pulumi.StringOutput {
	return o.ApplyT(func(v *Package) pulumi.StringOutput { return v.AvailablePackageVersion }).(pulumi.StringOutput)
}

// Description of the package.
func (o PackageOutput) PackageDescription() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Package) pulumi.StringPtrOutput { return v.PackageDescription }).(pulumi.StringPtrOutput)
}

func (o PackageOutput) PackageId() pulumi.StringOutput {
	return o.ApplyT(func(v *Package) pulumi.StringOutput { return v.PackageId }).(pulumi.StringOutput)
}

// Unique name for the package.
func (o PackageOutput) PackageName() pulumi.StringOutput {
	return o.ApplyT(func(v *Package) pulumi.StringOutput { return v.PackageName }).(pulumi.StringOutput)
}

// Configuration block for the package source options.
func (o PackageOutput) PackageSource() PackagePackageSourceOutput {
	return o.ApplyT(func(v *Package) PackagePackageSourceOutput { return v.PackageSource }).(PackagePackageSourceOutput)
}

// The type of package.
func (o PackageOutput) PackageType() pulumi.StringOutput {
	return o.ApplyT(func(v *Package) pulumi.StringOutput { return v.PackageType }).(pulumi.StringOutput)
}

type PackageArrayOutput struct{ *pulumi.OutputState }

func (PackageArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Package)(nil)).Elem()
}

func (o PackageArrayOutput) ToPackageArrayOutput() PackageArrayOutput {
	return o
}

func (o PackageArrayOutput) ToPackageArrayOutputWithContext(ctx context.Context) PackageArrayOutput {
	return o
}

func (o PackageArrayOutput) Index(i pulumi.IntInput) PackageOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Package {
		return vs[0].([]*Package)[vs[1].(int)]
	}).(PackageOutput)
}

type PackageMapOutput struct{ *pulumi.OutputState }

func (PackageMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Package)(nil)).Elem()
}

func (o PackageMapOutput) ToPackageMapOutput() PackageMapOutput {
	return o
}

func (o PackageMapOutput) ToPackageMapOutputWithContext(ctx context.Context) PackageMapOutput {
	return o
}

func (o PackageMapOutput) MapIndex(k pulumi.StringInput) PackageOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Package {
		return vs[0].(map[string]*Package)[vs[1].(string)]
	}).(PackageOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*PackageInput)(nil)).Elem(), &Package{})
	pulumi.RegisterInputType(reflect.TypeOf((*PackageArrayInput)(nil)).Elem(), PackageArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*PackageMapInput)(nil)).Elem(), PackageMap{})
	pulumi.RegisterOutputType(PackageOutput{})
	pulumi.RegisterOutputType(PackageArrayOutput{})
	pulumi.RegisterOutputType(PackageMapOutput{})
}

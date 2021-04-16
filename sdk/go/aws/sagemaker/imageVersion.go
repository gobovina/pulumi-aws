// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package sagemaker

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Sagemaker Image Version resource.
//
// ## Example Usage
// ### Basic usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-aws/sdk/v4/go/aws/sagemaker"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := sagemaker.NewImageVersion(ctx, "test", &sagemaker.ImageVersionArgs{
// 			ImageName: pulumi.Any(aws_sagemaker_image.Test.Id),
// 			BaseImage: pulumi.String("012345678912.dkr.ecr.us-west-2.amazonaws.com/image:latest"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
//
// ## Import
//
// Sagemaker Image Versions can be imported using the `name`, e.g.
//
// ```sh
//  $ pulumi import aws:sagemaker/imageVersion:ImageVersion test_image my-code-repo
// ```
type ImageVersion struct {
	pulumi.CustomResourceState

	// The Amazon Resource Name (ARN) assigned by AWS to this Image Version.
	// * `imageArn`- The Amazon Resource Name (ARN) of the image the version is based on.
	Arn pulumi.StringOutput `pulumi:"arn"`
	// The registry path of the container image on which this image version is based.
	BaseImage pulumi.StringOutput `pulumi:"baseImage"`
	// The registry path of the container image that contains this image version.
	ContainerImage pulumi.StringOutput `pulumi:"containerImage"`
	ImageArn       pulumi.StringOutput `pulumi:"imageArn"`
	// The name of the image. Must be unique to your account.
	ImageName pulumi.StringOutput `pulumi:"imageName"`
	Version   pulumi.IntOutput    `pulumi:"version"`
}

// NewImageVersion registers a new resource with the given unique name, arguments, and options.
func NewImageVersion(ctx *pulumi.Context,
	name string, args *ImageVersionArgs, opts ...pulumi.ResourceOption) (*ImageVersion, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.BaseImage == nil {
		return nil, errors.New("invalid value for required argument 'BaseImage'")
	}
	if args.ImageName == nil {
		return nil, errors.New("invalid value for required argument 'ImageName'")
	}
	var resource ImageVersion
	err := ctx.RegisterResource("aws:sagemaker/imageVersion:ImageVersion", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetImageVersion gets an existing ImageVersion resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetImageVersion(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ImageVersionState, opts ...pulumi.ResourceOption) (*ImageVersion, error) {
	var resource ImageVersion
	err := ctx.ReadResource("aws:sagemaker/imageVersion:ImageVersion", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ImageVersion resources.
type imageVersionState struct {
	// The Amazon Resource Name (ARN) assigned by AWS to this Image Version.
	// * `imageArn`- The Amazon Resource Name (ARN) of the image the version is based on.
	Arn *string `pulumi:"arn"`
	// The registry path of the container image on which this image version is based.
	BaseImage *string `pulumi:"baseImage"`
	// The registry path of the container image that contains this image version.
	ContainerImage *string `pulumi:"containerImage"`
	ImageArn       *string `pulumi:"imageArn"`
	// The name of the image. Must be unique to your account.
	ImageName *string `pulumi:"imageName"`
	Version   *int    `pulumi:"version"`
}

type ImageVersionState struct {
	// The Amazon Resource Name (ARN) assigned by AWS to this Image Version.
	// * `imageArn`- The Amazon Resource Name (ARN) of the image the version is based on.
	Arn pulumi.StringPtrInput
	// The registry path of the container image on which this image version is based.
	BaseImage pulumi.StringPtrInput
	// The registry path of the container image that contains this image version.
	ContainerImage pulumi.StringPtrInput
	ImageArn       pulumi.StringPtrInput
	// The name of the image. Must be unique to your account.
	ImageName pulumi.StringPtrInput
	Version   pulumi.IntPtrInput
}

func (ImageVersionState) ElementType() reflect.Type {
	return reflect.TypeOf((*imageVersionState)(nil)).Elem()
}

type imageVersionArgs struct {
	// The registry path of the container image on which this image version is based.
	BaseImage string `pulumi:"baseImage"`
	// The name of the image. Must be unique to your account.
	ImageName string `pulumi:"imageName"`
}

// The set of arguments for constructing a ImageVersion resource.
type ImageVersionArgs struct {
	// The registry path of the container image on which this image version is based.
	BaseImage pulumi.StringInput
	// The name of the image. Must be unique to your account.
	ImageName pulumi.StringInput
}

func (ImageVersionArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*imageVersionArgs)(nil)).Elem()
}

type ImageVersionInput interface {
	pulumi.Input

	ToImageVersionOutput() ImageVersionOutput
	ToImageVersionOutputWithContext(ctx context.Context) ImageVersionOutput
}

func (*ImageVersion) ElementType() reflect.Type {
	return reflect.TypeOf((*ImageVersion)(nil))
}

func (i *ImageVersion) ToImageVersionOutput() ImageVersionOutput {
	return i.ToImageVersionOutputWithContext(context.Background())
}

func (i *ImageVersion) ToImageVersionOutputWithContext(ctx context.Context) ImageVersionOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ImageVersionOutput)
}

func (i *ImageVersion) ToImageVersionPtrOutput() ImageVersionPtrOutput {
	return i.ToImageVersionPtrOutputWithContext(context.Background())
}

func (i *ImageVersion) ToImageVersionPtrOutputWithContext(ctx context.Context) ImageVersionPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ImageVersionPtrOutput)
}

type ImageVersionPtrInput interface {
	pulumi.Input

	ToImageVersionPtrOutput() ImageVersionPtrOutput
	ToImageVersionPtrOutputWithContext(ctx context.Context) ImageVersionPtrOutput
}

type imageVersionPtrType ImageVersionArgs

func (*imageVersionPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**ImageVersion)(nil))
}

func (i *imageVersionPtrType) ToImageVersionPtrOutput() ImageVersionPtrOutput {
	return i.ToImageVersionPtrOutputWithContext(context.Background())
}

func (i *imageVersionPtrType) ToImageVersionPtrOutputWithContext(ctx context.Context) ImageVersionPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ImageVersionPtrOutput)
}

// ImageVersionArrayInput is an input type that accepts ImageVersionArray and ImageVersionArrayOutput values.
// You can construct a concrete instance of `ImageVersionArrayInput` via:
//
//          ImageVersionArray{ ImageVersionArgs{...} }
type ImageVersionArrayInput interface {
	pulumi.Input

	ToImageVersionArrayOutput() ImageVersionArrayOutput
	ToImageVersionArrayOutputWithContext(context.Context) ImageVersionArrayOutput
}

type ImageVersionArray []ImageVersionInput

func (ImageVersionArray) ElementType() reflect.Type {
	return reflect.TypeOf(([]*ImageVersion)(nil))
}

func (i ImageVersionArray) ToImageVersionArrayOutput() ImageVersionArrayOutput {
	return i.ToImageVersionArrayOutputWithContext(context.Background())
}

func (i ImageVersionArray) ToImageVersionArrayOutputWithContext(ctx context.Context) ImageVersionArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ImageVersionArrayOutput)
}

// ImageVersionMapInput is an input type that accepts ImageVersionMap and ImageVersionMapOutput values.
// You can construct a concrete instance of `ImageVersionMapInput` via:
//
//          ImageVersionMap{ "key": ImageVersionArgs{...} }
type ImageVersionMapInput interface {
	pulumi.Input

	ToImageVersionMapOutput() ImageVersionMapOutput
	ToImageVersionMapOutputWithContext(context.Context) ImageVersionMapOutput
}

type ImageVersionMap map[string]ImageVersionInput

func (ImageVersionMap) ElementType() reflect.Type {
	return reflect.TypeOf((map[string]*ImageVersion)(nil))
}

func (i ImageVersionMap) ToImageVersionMapOutput() ImageVersionMapOutput {
	return i.ToImageVersionMapOutputWithContext(context.Background())
}

func (i ImageVersionMap) ToImageVersionMapOutputWithContext(ctx context.Context) ImageVersionMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ImageVersionMapOutput)
}

type ImageVersionOutput struct {
	*pulumi.OutputState
}

func (ImageVersionOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*ImageVersion)(nil))
}

func (o ImageVersionOutput) ToImageVersionOutput() ImageVersionOutput {
	return o
}

func (o ImageVersionOutput) ToImageVersionOutputWithContext(ctx context.Context) ImageVersionOutput {
	return o
}

func (o ImageVersionOutput) ToImageVersionPtrOutput() ImageVersionPtrOutput {
	return o.ToImageVersionPtrOutputWithContext(context.Background())
}

func (o ImageVersionOutput) ToImageVersionPtrOutputWithContext(ctx context.Context) ImageVersionPtrOutput {
	return o.ApplyT(func(v ImageVersion) *ImageVersion {
		return &v
	}).(ImageVersionPtrOutput)
}

type ImageVersionPtrOutput struct {
	*pulumi.OutputState
}

func (ImageVersionPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ImageVersion)(nil))
}

func (o ImageVersionPtrOutput) ToImageVersionPtrOutput() ImageVersionPtrOutput {
	return o
}

func (o ImageVersionPtrOutput) ToImageVersionPtrOutputWithContext(ctx context.Context) ImageVersionPtrOutput {
	return o
}

type ImageVersionArrayOutput struct{ *pulumi.OutputState }

func (ImageVersionArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]ImageVersion)(nil))
}

func (o ImageVersionArrayOutput) ToImageVersionArrayOutput() ImageVersionArrayOutput {
	return o
}

func (o ImageVersionArrayOutput) ToImageVersionArrayOutputWithContext(ctx context.Context) ImageVersionArrayOutput {
	return o
}

func (o ImageVersionArrayOutput) Index(i pulumi.IntInput) ImageVersionOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) ImageVersion {
		return vs[0].([]ImageVersion)[vs[1].(int)]
	}).(ImageVersionOutput)
}

type ImageVersionMapOutput struct{ *pulumi.OutputState }

func (ImageVersionMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]ImageVersion)(nil))
}

func (o ImageVersionMapOutput) ToImageVersionMapOutput() ImageVersionMapOutput {
	return o
}

func (o ImageVersionMapOutput) ToImageVersionMapOutputWithContext(ctx context.Context) ImageVersionMapOutput {
	return o
}

func (o ImageVersionMapOutput) MapIndex(k pulumi.StringInput) ImageVersionOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) ImageVersion {
		return vs[0].(map[string]ImageVersion)[vs[1].(string)]
	}).(ImageVersionOutput)
}

func init() {
	pulumi.RegisterOutputType(ImageVersionOutput{})
	pulumi.RegisterOutputType(ImageVersionPtrOutput{})
	pulumi.RegisterOutputType(ImageVersionArrayOutput{})
	pulumi.RegisterOutputType(ImageVersionMapOutput{})
}

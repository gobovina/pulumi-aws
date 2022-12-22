// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package ecr

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// The ECR Image data source allows the details of an image with a particular tag or digest to be retrieved.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v5/go/aws/ecr"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := ecr.GetImage(ctx, &ecr.GetImageArgs{
//				ImageTag:       pulumi.StringRef("latest"),
//				RepositoryName: "my/service",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func GetImage(ctx *pulumi.Context, args *GetImageArgs, opts ...pulumi.InvokeOption) (*GetImageResult, error) {
	var rv GetImageResult
	err := ctx.Invoke("aws:ecr/getImage:getImage", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getImage.
type GetImageArgs struct {
	// Sha256 digest of the image manifest. At least one of `imageDigest` or `imageTag` must be specified.
	ImageDigest *string `pulumi:"imageDigest"`
	// Tag associated with this image. At least one of `imageDigest` or `imageTag` must be specified.
	ImageTag *string `pulumi:"imageTag"`
	// ID of the Registry where the repository resides.
	RegistryId *string `pulumi:"registryId"`
	// Name of the ECR Repository.
	RepositoryName string `pulumi:"repositoryName"`
}

// A collection of values returned by getImage.
type GetImageResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id          string `pulumi:"id"`
	ImageDigest string `pulumi:"imageDigest"`
	// Date and time, expressed as a unix timestamp, at which the current image was pushed to the repository.
	ImagePushedAt int `pulumi:"imagePushedAt"`
	// Size, in bytes, of the image in the repository.
	ImageSizeInBytes int     `pulumi:"imageSizeInBytes"`
	ImageTag         *string `pulumi:"imageTag"`
	// List of tags associated with this image.
	ImageTags      []string `pulumi:"imageTags"`
	RegistryId     string   `pulumi:"registryId"`
	RepositoryName string   `pulumi:"repositoryName"`
}

func GetImageOutput(ctx *pulumi.Context, args GetImageOutputArgs, opts ...pulumi.InvokeOption) GetImageResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetImageResult, error) {
			args := v.(GetImageArgs)
			r, err := GetImage(ctx, &args, opts...)
			var s GetImageResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetImageResultOutput)
}

// A collection of arguments for invoking getImage.
type GetImageOutputArgs struct {
	// Sha256 digest of the image manifest. At least one of `imageDigest` or `imageTag` must be specified.
	ImageDigest pulumi.StringPtrInput `pulumi:"imageDigest"`
	// Tag associated with this image. At least one of `imageDigest` or `imageTag` must be specified.
	ImageTag pulumi.StringPtrInput `pulumi:"imageTag"`
	// ID of the Registry where the repository resides.
	RegistryId pulumi.StringPtrInput `pulumi:"registryId"`
	// Name of the ECR Repository.
	RepositoryName pulumi.StringInput `pulumi:"repositoryName"`
}

func (GetImageOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetImageArgs)(nil)).Elem()
}

// A collection of values returned by getImage.
type GetImageResultOutput struct{ *pulumi.OutputState }

func (GetImageResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetImageResult)(nil)).Elem()
}

func (o GetImageResultOutput) ToGetImageResultOutput() GetImageResultOutput {
	return o
}

func (o GetImageResultOutput) ToGetImageResultOutputWithContext(ctx context.Context) GetImageResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o GetImageResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetImageResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetImageResultOutput) ImageDigest() pulumi.StringOutput {
	return o.ApplyT(func(v GetImageResult) string { return v.ImageDigest }).(pulumi.StringOutput)
}

// Date and time, expressed as a unix timestamp, at which the current image was pushed to the repository.
func (o GetImageResultOutput) ImagePushedAt() pulumi.IntOutput {
	return o.ApplyT(func(v GetImageResult) int { return v.ImagePushedAt }).(pulumi.IntOutput)
}

// Size, in bytes, of the image in the repository.
func (o GetImageResultOutput) ImageSizeInBytes() pulumi.IntOutput {
	return o.ApplyT(func(v GetImageResult) int { return v.ImageSizeInBytes }).(pulumi.IntOutput)
}

func (o GetImageResultOutput) ImageTag() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetImageResult) *string { return v.ImageTag }).(pulumi.StringPtrOutput)
}

// List of tags associated with this image.
func (o GetImageResultOutput) ImageTags() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetImageResult) []string { return v.ImageTags }).(pulumi.StringArrayOutput)
}

func (o GetImageResultOutput) RegistryId() pulumi.StringOutput {
	return o.ApplyT(func(v GetImageResult) string { return v.RegistryId }).(pulumi.StringOutput)
}

func (o GetImageResultOutput) RepositoryName() pulumi.StringOutput {
	return o.ApplyT(func(v GetImageResult) string { return v.RepositoryName }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetImageResultOutput{})
}

// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package sagemaker

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a SageMaker Code Repository resource.
//
// ## Example Usage
// ### Basic usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/sagemaker"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := sagemaker.NewCodeRepository(ctx, "example", &sagemaker.CodeRepositoryArgs{
//				CodeRepositoryName: pulumi.String("example"),
//				GitConfig: &sagemaker.CodeRepositoryGitConfigArgs{
//					RepositoryUrl: pulumi.String("https://github.com/github/docs.git"),
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
// ### Example with Secret
//
// ```go
// package main
//
// import (
//
//	"encoding/json"
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/sagemaker"
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/secretsmanager"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			example, err := secretsmanager.NewSecret(ctx, "example", &secretsmanager.SecretArgs{
//				Name: pulumi.String("example"),
//			})
//			if err != nil {
//				return err
//			}
//			tmpJSON0, err := json.Marshal(map[string]interface{}{
//				"username": "example",
//				"password": "example",
//			})
//			if err != nil {
//				return err
//			}
//			json0 := string(tmpJSON0)
//			_, err = secretsmanager.NewSecretVersion(ctx, "example", &secretsmanager.SecretVersionArgs{
//				SecretId:     example.ID(),
//				SecretString: pulumi.String(json0),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = sagemaker.NewCodeRepository(ctx, "example", &sagemaker.CodeRepositoryArgs{
//				CodeRepositoryName: pulumi.String("example"),
//				GitConfig: &sagemaker.CodeRepositoryGitConfigArgs{
//					RepositoryUrl: pulumi.String("https://github.com/github/docs.git"),
//					SecretArn:     example.Arn,
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
// Using `pulumi import`, import SageMaker Code Repositories using the `name`. For example:
//
// ```sh
//
//	$ pulumi import aws:sagemaker/codeRepository:CodeRepository test_code_repository my-code-repo
//
// ```
type CodeRepository struct {
	pulumi.CustomResourceState

	// The Amazon Resource Name (ARN) assigned by AWS to this Code Repository.
	Arn pulumi.StringOutput `pulumi:"arn"`
	// The name of the Code Repository (must be unique).
	CodeRepositoryName pulumi.StringOutput `pulumi:"codeRepositoryName"`
	// Specifies details about the repository. see Git Config details below.
	GitConfig CodeRepositoryGitConfigOutput `pulumi:"gitConfig"`
	// A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapOutput `pulumi:"tagsAll"`
}

// NewCodeRepository registers a new resource with the given unique name, arguments, and options.
func NewCodeRepository(ctx *pulumi.Context,
	name string, args *CodeRepositoryArgs, opts ...pulumi.ResourceOption) (*CodeRepository, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.CodeRepositoryName == nil {
		return nil, errors.New("invalid value for required argument 'CodeRepositoryName'")
	}
	if args.GitConfig == nil {
		return nil, errors.New("invalid value for required argument 'GitConfig'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource CodeRepository
	err := ctx.RegisterResource("aws:sagemaker/codeRepository:CodeRepository", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetCodeRepository gets an existing CodeRepository resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetCodeRepository(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *CodeRepositoryState, opts ...pulumi.ResourceOption) (*CodeRepository, error) {
	var resource CodeRepository
	err := ctx.ReadResource("aws:sagemaker/codeRepository:CodeRepository", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering CodeRepository resources.
type codeRepositoryState struct {
	// The Amazon Resource Name (ARN) assigned by AWS to this Code Repository.
	Arn *string `pulumi:"arn"`
	// The name of the Code Repository (must be unique).
	CodeRepositoryName *string `pulumi:"codeRepositoryName"`
	// Specifies details about the repository. see Git Config details below.
	GitConfig *CodeRepositoryGitConfig `pulumi:"gitConfig"`
	// A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll map[string]string `pulumi:"tagsAll"`
}

type CodeRepositoryState struct {
	// The Amazon Resource Name (ARN) assigned by AWS to this Code Repository.
	Arn pulumi.StringPtrInput
	// The name of the Code Repository (must be unique).
	CodeRepositoryName pulumi.StringPtrInput
	// Specifies details about the repository. see Git Config details below.
	GitConfig CodeRepositoryGitConfigPtrInput
	// A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapInput
}

func (CodeRepositoryState) ElementType() reflect.Type {
	return reflect.TypeOf((*codeRepositoryState)(nil)).Elem()
}

type codeRepositoryArgs struct {
	// The name of the Code Repository (must be unique).
	CodeRepositoryName string `pulumi:"codeRepositoryName"`
	// Specifies details about the repository. see Git Config details below.
	GitConfig CodeRepositoryGitConfig `pulumi:"gitConfig"`
	// A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
}

// The set of arguments for constructing a CodeRepository resource.
type CodeRepositoryArgs struct {
	// The name of the Code Repository (must be unique).
	CodeRepositoryName pulumi.StringInput
	// Specifies details about the repository. see Git Config details below.
	GitConfig CodeRepositoryGitConfigInput
	// A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
}

func (CodeRepositoryArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*codeRepositoryArgs)(nil)).Elem()
}

type CodeRepositoryInput interface {
	pulumi.Input

	ToCodeRepositoryOutput() CodeRepositoryOutput
	ToCodeRepositoryOutputWithContext(ctx context.Context) CodeRepositoryOutput
}

func (*CodeRepository) ElementType() reflect.Type {
	return reflect.TypeOf((**CodeRepository)(nil)).Elem()
}

func (i *CodeRepository) ToCodeRepositoryOutput() CodeRepositoryOutput {
	return i.ToCodeRepositoryOutputWithContext(context.Background())
}

func (i *CodeRepository) ToCodeRepositoryOutputWithContext(ctx context.Context) CodeRepositoryOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CodeRepositoryOutput)
}

// CodeRepositoryArrayInput is an input type that accepts CodeRepositoryArray and CodeRepositoryArrayOutput values.
// You can construct a concrete instance of `CodeRepositoryArrayInput` via:
//
//	CodeRepositoryArray{ CodeRepositoryArgs{...} }
type CodeRepositoryArrayInput interface {
	pulumi.Input

	ToCodeRepositoryArrayOutput() CodeRepositoryArrayOutput
	ToCodeRepositoryArrayOutputWithContext(context.Context) CodeRepositoryArrayOutput
}

type CodeRepositoryArray []CodeRepositoryInput

func (CodeRepositoryArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*CodeRepository)(nil)).Elem()
}

func (i CodeRepositoryArray) ToCodeRepositoryArrayOutput() CodeRepositoryArrayOutput {
	return i.ToCodeRepositoryArrayOutputWithContext(context.Background())
}

func (i CodeRepositoryArray) ToCodeRepositoryArrayOutputWithContext(ctx context.Context) CodeRepositoryArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CodeRepositoryArrayOutput)
}

// CodeRepositoryMapInput is an input type that accepts CodeRepositoryMap and CodeRepositoryMapOutput values.
// You can construct a concrete instance of `CodeRepositoryMapInput` via:
//
//	CodeRepositoryMap{ "key": CodeRepositoryArgs{...} }
type CodeRepositoryMapInput interface {
	pulumi.Input

	ToCodeRepositoryMapOutput() CodeRepositoryMapOutput
	ToCodeRepositoryMapOutputWithContext(context.Context) CodeRepositoryMapOutput
}

type CodeRepositoryMap map[string]CodeRepositoryInput

func (CodeRepositoryMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*CodeRepository)(nil)).Elem()
}

func (i CodeRepositoryMap) ToCodeRepositoryMapOutput() CodeRepositoryMapOutput {
	return i.ToCodeRepositoryMapOutputWithContext(context.Background())
}

func (i CodeRepositoryMap) ToCodeRepositoryMapOutputWithContext(ctx context.Context) CodeRepositoryMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CodeRepositoryMapOutput)
}

type CodeRepositoryOutput struct{ *pulumi.OutputState }

func (CodeRepositoryOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**CodeRepository)(nil)).Elem()
}

func (o CodeRepositoryOutput) ToCodeRepositoryOutput() CodeRepositoryOutput {
	return o
}

func (o CodeRepositoryOutput) ToCodeRepositoryOutputWithContext(ctx context.Context) CodeRepositoryOutput {
	return o
}

// The Amazon Resource Name (ARN) assigned by AWS to this Code Repository.
func (o CodeRepositoryOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v *CodeRepository) pulumi.StringOutput { return v.Arn }).(pulumi.StringOutput)
}

// The name of the Code Repository (must be unique).
func (o CodeRepositoryOutput) CodeRepositoryName() pulumi.StringOutput {
	return o.ApplyT(func(v *CodeRepository) pulumi.StringOutput { return v.CodeRepositoryName }).(pulumi.StringOutput)
}

// Specifies details about the repository. see Git Config details below.
func (o CodeRepositoryOutput) GitConfig() CodeRepositoryGitConfigOutput {
	return o.ApplyT(func(v *CodeRepository) CodeRepositoryGitConfigOutput { return v.GitConfig }).(CodeRepositoryGitConfigOutput)
}

// A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
func (o CodeRepositoryOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *CodeRepository) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
//
// Deprecated: Please use `tags` instead.
func (o CodeRepositoryOutput) TagsAll() pulumi.StringMapOutput {
	return o.ApplyT(func(v *CodeRepository) pulumi.StringMapOutput { return v.TagsAll }).(pulumi.StringMapOutput)
}

type CodeRepositoryArrayOutput struct{ *pulumi.OutputState }

func (CodeRepositoryArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*CodeRepository)(nil)).Elem()
}

func (o CodeRepositoryArrayOutput) ToCodeRepositoryArrayOutput() CodeRepositoryArrayOutput {
	return o
}

func (o CodeRepositoryArrayOutput) ToCodeRepositoryArrayOutputWithContext(ctx context.Context) CodeRepositoryArrayOutput {
	return o
}

func (o CodeRepositoryArrayOutput) Index(i pulumi.IntInput) CodeRepositoryOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *CodeRepository {
		return vs[0].([]*CodeRepository)[vs[1].(int)]
	}).(CodeRepositoryOutput)
}

type CodeRepositoryMapOutput struct{ *pulumi.OutputState }

func (CodeRepositoryMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*CodeRepository)(nil)).Elem()
}

func (o CodeRepositoryMapOutput) ToCodeRepositoryMapOutput() CodeRepositoryMapOutput {
	return o
}

func (o CodeRepositoryMapOutput) ToCodeRepositoryMapOutputWithContext(ctx context.Context) CodeRepositoryMapOutput {
	return o
}

func (o CodeRepositoryMapOutput) MapIndex(k pulumi.StringInput) CodeRepositoryOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *CodeRepository {
		return vs[0].(map[string]*CodeRepository)[vs[1].(string)]
	}).(CodeRepositoryOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*CodeRepositoryInput)(nil)).Elem(), &CodeRepository{})
	pulumi.RegisterInputType(reflect.TypeOf((*CodeRepositoryArrayInput)(nil)).Elem(), CodeRepositoryArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*CodeRepositoryMapInput)(nil)).Elem(), CodeRepositoryMap{})
	pulumi.RegisterOutputType(CodeRepositoryOutput{})
	pulumi.RegisterOutputType(CodeRepositoryArrayOutput{})
	pulumi.RegisterOutputType(CodeRepositoryMapOutput{})
}

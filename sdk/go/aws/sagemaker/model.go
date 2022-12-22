// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package sagemaker

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a SageMaker model resource.
//
// ## Example Usage
//
// Basic usage:
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v5/go/aws/iam"
//	"github.com/pulumi/pulumi-aws/sdk/v5/go/aws/sagemaker"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			assumeRole, err := iam.GetPolicyDocument(ctx, &iam.GetPolicyDocumentArgs{
//				Statements: []iam.GetPolicyDocumentStatement{
//					{
//						Actions: []string{
//							"sts:AssumeRole",
//						},
//						Principals: []iam.GetPolicyDocumentStatementPrincipal{
//							{
//								Type: "Service",
//								Identifiers: []string{
//									"sagemaker.amazonaws.com",
//								},
//							},
//						},
//					},
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			exampleRole, err := iam.NewRole(ctx, "exampleRole", &iam.RoleArgs{
//				AssumeRolePolicy: *pulumi.String(assumeRole.Json),
//			})
//			if err != nil {
//				return err
//			}
//			test, err := sagemaker.GetPrebuiltEcrImage(ctx, &sagemaker.GetPrebuiltEcrImageArgs{
//				RepositoryName: "kmeans",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = sagemaker.NewModel(ctx, "exampleModel", &sagemaker.ModelArgs{
//				ExecutionRoleArn: exampleRole.Arn,
//				PrimaryContainer: &sagemaker.ModelPrimaryContainerArgs{
//					Image: *pulumi.String(test.RegistryPath),
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
// ## Inference Execution Config
//
// * `mode` - (Required) How containers in a multi-container are run. The following values are valid `Serial` and `Direct`.
//
// ## Import
//
// Models can be imported using the `name`, e.g.,
//
// ```sh
//
//	$ pulumi import aws:sagemaker/model:Model test_model model-foo
//
// ```
type Model struct {
	pulumi.CustomResourceState

	// The Amazon Resource Name (ARN) assigned by AWS to this model.
	Arn pulumi.StringOutput `pulumi:"arn"`
	// Specifies containers in the inference pipeline. If not specified, the `primaryContainer` argument is required. Fields are documented below.
	Containers ModelContainerArrayOutput `pulumi:"containers"`
	// Isolates the model container. No inbound or outbound network calls can be made to or from the model container.
	EnableNetworkIsolation pulumi.BoolPtrOutput `pulumi:"enableNetworkIsolation"`
	// A role that SageMaker can assume to access model artifacts and docker images for deployment.
	ExecutionRoleArn pulumi.StringOutput `pulumi:"executionRoleArn"`
	// Specifies details of how containers in a multi-container endpoint are called. see Inference Execution Config.
	InferenceExecutionConfig ModelInferenceExecutionConfigOutput `pulumi:"inferenceExecutionConfig"`
	// The name of the model (must be unique). If omitted, this provider will assign a random, unique name.
	Name pulumi.StringOutput `pulumi:"name"`
	// The primary docker image containing inference code that is used when the model is deployed for predictions.  If not specified, the `container` argument is required. Fields are documented below.
	PrimaryContainer ModelPrimaryContainerPtrOutput `pulumi:"primaryContainer"`
	// A map of tags to assign to the resource. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	TagsAll pulumi.StringMapOutput `pulumi:"tagsAll"`
	// Specifies the VPC that you want your model to connect to. VpcConfig is used in hosting services and in batch transform.
	VpcConfig ModelVpcConfigPtrOutput `pulumi:"vpcConfig"`
}

// NewModel registers a new resource with the given unique name, arguments, and options.
func NewModel(ctx *pulumi.Context,
	name string, args *ModelArgs, opts ...pulumi.ResourceOption) (*Model, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ExecutionRoleArn == nil {
		return nil, errors.New("invalid value for required argument 'ExecutionRoleArn'")
	}
	var resource Model
	err := ctx.RegisterResource("aws:sagemaker/model:Model", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetModel gets an existing Model resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetModel(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ModelState, opts ...pulumi.ResourceOption) (*Model, error) {
	var resource Model
	err := ctx.ReadResource("aws:sagemaker/model:Model", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Model resources.
type modelState struct {
	// The Amazon Resource Name (ARN) assigned by AWS to this model.
	Arn *string `pulumi:"arn"`
	// Specifies containers in the inference pipeline. If not specified, the `primaryContainer` argument is required. Fields are documented below.
	Containers []ModelContainer `pulumi:"containers"`
	// Isolates the model container. No inbound or outbound network calls can be made to or from the model container.
	EnableNetworkIsolation *bool `pulumi:"enableNetworkIsolation"`
	// A role that SageMaker can assume to access model artifacts and docker images for deployment.
	ExecutionRoleArn *string `pulumi:"executionRoleArn"`
	// Specifies details of how containers in a multi-container endpoint are called. see Inference Execution Config.
	InferenceExecutionConfig *ModelInferenceExecutionConfig `pulumi:"inferenceExecutionConfig"`
	// The name of the model (must be unique). If omitted, this provider will assign a random, unique name.
	Name *string `pulumi:"name"`
	// The primary docker image containing inference code that is used when the model is deployed for predictions.  If not specified, the `container` argument is required. Fields are documented below.
	PrimaryContainer *ModelPrimaryContainer `pulumi:"primaryContainer"`
	// A map of tags to assign to the resource. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	TagsAll map[string]string `pulumi:"tagsAll"`
	// Specifies the VPC that you want your model to connect to. VpcConfig is used in hosting services and in batch transform.
	VpcConfig *ModelVpcConfig `pulumi:"vpcConfig"`
}

type ModelState struct {
	// The Amazon Resource Name (ARN) assigned by AWS to this model.
	Arn pulumi.StringPtrInput
	// Specifies containers in the inference pipeline. If not specified, the `primaryContainer` argument is required. Fields are documented below.
	Containers ModelContainerArrayInput
	// Isolates the model container. No inbound or outbound network calls can be made to or from the model container.
	EnableNetworkIsolation pulumi.BoolPtrInput
	// A role that SageMaker can assume to access model artifacts and docker images for deployment.
	ExecutionRoleArn pulumi.StringPtrInput
	// Specifies details of how containers in a multi-container endpoint are called. see Inference Execution Config.
	InferenceExecutionConfig ModelInferenceExecutionConfigPtrInput
	// The name of the model (must be unique). If omitted, this provider will assign a random, unique name.
	Name pulumi.StringPtrInput
	// The primary docker image containing inference code that is used when the model is deployed for predictions.  If not specified, the `container` argument is required. Fields are documented below.
	PrimaryContainer ModelPrimaryContainerPtrInput
	// A map of tags to assign to the resource. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	TagsAll pulumi.StringMapInput
	// Specifies the VPC that you want your model to connect to. VpcConfig is used in hosting services and in batch transform.
	VpcConfig ModelVpcConfigPtrInput
}

func (ModelState) ElementType() reflect.Type {
	return reflect.TypeOf((*modelState)(nil)).Elem()
}

type modelArgs struct {
	// Specifies containers in the inference pipeline. If not specified, the `primaryContainer` argument is required. Fields are documented below.
	Containers []ModelContainer `pulumi:"containers"`
	// Isolates the model container. No inbound or outbound network calls can be made to or from the model container.
	EnableNetworkIsolation *bool `pulumi:"enableNetworkIsolation"`
	// A role that SageMaker can assume to access model artifacts and docker images for deployment.
	ExecutionRoleArn string `pulumi:"executionRoleArn"`
	// Specifies details of how containers in a multi-container endpoint are called. see Inference Execution Config.
	InferenceExecutionConfig *ModelInferenceExecutionConfig `pulumi:"inferenceExecutionConfig"`
	// The name of the model (must be unique). If omitted, this provider will assign a random, unique name.
	Name *string `pulumi:"name"`
	// The primary docker image containing inference code that is used when the model is deployed for predictions.  If not specified, the `container` argument is required. Fields are documented below.
	PrimaryContainer *ModelPrimaryContainer `pulumi:"primaryContainer"`
	// A map of tags to assign to the resource. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// Specifies the VPC that you want your model to connect to. VpcConfig is used in hosting services and in batch transform.
	VpcConfig *ModelVpcConfig `pulumi:"vpcConfig"`
}

// The set of arguments for constructing a Model resource.
type ModelArgs struct {
	// Specifies containers in the inference pipeline. If not specified, the `primaryContainer` argument is required. Fields are documented below.
	Containers ModelContainerArrayInput
	// Isolates the model container. No inbound or outbound network calls can be made to or from the model container.
	EnableNetworkIsolation pulumi.BoolPtrInput
	// A role that SageMaker can assume to access model artifacts and docker images for deployment.
	ExecutionRoleArn pulumi.StringInput
	// Specifies details of how containers in a multi-container endpoint are called. see Inference Execution Config.
	InferenceExecutionConfig ModelInferenceExecutionConfigPtrInput
	// The name of the model (must be unique). If omitted, this provider will assign a random, unique name.
	Name pulumi.StringPtrInput
	// The primary docker image containing inference code that is used when the model is deployed for predictions.  If not specified, the `container` argument is required. Fields are documented below.
	PrimaryContainer ModelPrimaryContainerPtrInput
	// A map of tags to assign to the resource. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// Specifies the VPC that you want your model to connect to. VpcConfig is used in hosting services and in batch transform.
	VpcConfig ModelVpcConfigPtrInput
}

func (ModelArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*modelArgs)(nil)).Elem()
}

type ModelInput interface {
	pulumi.Input

	ToModelOutput() ModelOutput
	ToModelOutputWithContext(ctx context.Context) ModelOutput
}

func (*Model) ElementType() reflect.Type {
	return reflect.TypeOf((**Model)(nil)).Elem()
}

func (i *Model) ToModelOutput() ModelOutput {
	return i.ToModelOutputWithContext(context.Background())
}

func (i *Model) ToModelOutputWithContext(ctx context.Context) ModelOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ModelOutput)
}

// ModelArrayInput is an input type that accepts ModelArray and ModelArrayOutput values.
// You can construct a concrete instance of `ModelArrayInput` via:
//
//	ModelArray{ ModelArgs{...} }
type ModelArrayInput interface {
	pulumi.Input

	ToModelArrayOutput() ModelArrayOutput
	ToModelArrayOutputWithContext(context.Context) ModelArrayOutput
}

type ModelArray []ModelInput

func (ModelArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Model)(nil)).Elem()
}

func (i ModelArray) ToModelArrayOutput() ModelArrayOutput {
	return i.ToModelArrayOutputWithContext(context.Background())
}

func (i ModelArray) ToModelArrayOutputWithContext(ctx context.Context) ModelArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ModelArrayOutput)
}

// ModelMapInput is an input type that accepts ModelMap and ModelMapOutput values.
// You can construct a concrete instance of `ModelMapInput` via:
//
//	ModelMap{ "key": ModelArgs{...} }
type ModelMapInput interface {
	pulumi.Input

	ToModelMapOutput() ModelMapOutput
	ToModelMapOutputWithContext(context.Context) ModelMapOutput
}

type ModelMap map[string]ModelInput

func (ModelMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Model)(nil)).Elem()
}

func (i ModelMap) ToModelMapOutput() ModelMapOutput {
	return i.ToModelMapOutputWithContext(context.Background())
}

func (i ModelMap) ToModelMapOutputWithContext(ctx context.Context) ModelMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ModelMapOutput)
}

type ModelOutput struct{ *pulumi.OutputState }

func (ModelOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Model)(nil)).Elem()
}

func (o ModelOutput) ToModelOutput() ModelOutput {
	return o
}

func (o ModelOutput) ToModelOutputWithContext(ctx context.Context) ModelOutput {
	return o
}

// The Amazon Resource Name (ARN) assigned by AWS to this model.
func (o ModelOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v *Model) pulumi.StringOutput { return v.Arn }).(pulumi.StringOutput)
}

// Specifies containers in the inference pipeline. If not specified, the `primaryContainer` argument is required. Fields are documented below.
func (o ModelOutput) Containers() ModelContainerArrayOutput {
	return o.ApplyT(func(v *Model) ModelContainerArrayOutput { return v.Containers }).(ModelContainerArrayOutput)
}

// Isolates the model container. No inbound or outbound network calls can be made to or from the model container.
func (o ModelOutput) EnableNetworkIsolation() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Model) pulumi.BoolPtrOutput { return v.EnableNetworkIsolation }).(pulumi.BoolPtrOutput)
}

// A role that SageMaker can assume to access model artifacts and docker images for deployment.
func (o ModelOutput) ExecutionRoleArn() pulumi.StringOutput {
	return o.ApplyT(func(v *Model) pulumi.StringOutput { return v.ExecutionRoleArn }).(pulumi.StringOutput)
}

// Specifies details of how containers in a multi-container endpoint are called. see Inference Execution Config.
func (o ModelOutput) InferenceExecutionConfig() ModelInferenceExecutionConfigOutput {
	return o.ApplyT(func(v *Model) ModelInferenceExecutionConfigOutput { return v.InferenceExecutionConfig }).(ModelInferenceExecutionConfigOutput)
}

// The name of the model (must be unique). If omitted, this provider will assign a random, unique name.
func (o ModelOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Model) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The primary docker image containing inference code that is used when the model is deployed for predictions.  If not specified, the `container` argument is required. Fields are documented below.
func (o ModelOutput) PrimaryContainer() ModelPrimaryContainerPtrOutput {
	return o.ApplyT(func(v *Model) ModelPrimaryContainerPtrOutput { return v.PrimaryContainer }).(ModelPrimaryContainerPtrOutput)
}

// A map of tags to assign to the resource. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
func (o ModelOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Model) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
func (o ModelOutput) TagsAll() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Model) pulumi.StringMapOutput { return v.TagsAll }).(pulumi.StringMapOutput)
}

// Specifies the VPC that you want your model to connect to. VpcConfig is used in hosting services and in batch transform.
func (o ModelOutput) VpcConfig() ModelVpcConfigPtrOutput {
	return o.ApplyT(func(v *Model) ModelVpcConfigPtrOutput { return v.VpcConfig }).(ModelVpcConfigPtrOutput)
}

type ModelArrayOutput struct{ *pulumi.OutputState }

func (ModelArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Model)(nil)).Elem()
}

func (o ModelArrayOutput) ToModelArrayOutput() ModelArrayOutput {
	return o
}

func (o ModelArrayOutput) ToModelArrayOutputWithContext(ctx context.Context) ModelArrayOutput {
	return o
}

func (o ModelArrayOutput) Index(i pulumi.IntInput) ModelOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Model {
		return vs[0].([]*Model)[vs[1].(int)]
	}).(ModelOutput)
}

type ModelMapOutput struct{ *pulumi.OutputState }

func (ModelMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Model)(nil)).Elem()
}

func (o ModelMapOutput) ToModelMapOutput() ModelMapOutput {
	return o
}

func (o ModelMapOutput) ToModelMapOutputWithContext(ctx context.Context) ModelMapOutput {
	return o
}

func (o ModelMapOutput) MapIndex(k pulumi.StringInput) ModelOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Model {
		return vs[0].(map[string]*Model)[vs[1].(string)]
	}).(ModelOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ModelInput)(nil)).Elem(), &Model{})
	pulumi.RegisterInputType(reflect.TypeOf((*ModelArrayInput)(nil)).Elem(), ModelArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ModelMapInput)(nil)).Elem(), ModelMap{})
	pulumi.RegisterOutputType(ModelOutput{})
	pulumi.RegisterOutputType(ModelArrayOutput{})
	pulumi.RegisterOutputType(ModelMapOutput{})
}

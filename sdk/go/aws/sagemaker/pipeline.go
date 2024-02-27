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

// Provides a SageMaker Pipeline resource.
//
// ## Example Usage
// ### Basic usage
//
// ```go
// package main
//
// import (
//
//	"encoding/json"
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/sagemaker"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			tmpJSON0, err := json.Marshal(map[string]interface{}{
//				"Version": "2020-12-01",
//				"Steps": []map[string]interface{}{
//					map[string]interface{}{
//						"Name": "Test",
//						"Type": "Fail",
//						"Arguments": map[string]interface{}{
//							"ErrorMessage": "test",
//						},
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			json0 := string(tmpJSON0)
//			_, err = sagemaker.NewPipeline(ctx, "example", &sagemaker.PipelineArgs{
//				PipelineName:        pulumi.String("example"),
//				PipelineDisplayName: pulumi.String("example"),
//				RoleArn:             pulumi.Any(aws_iam_role.Example.Arn),
//				PipelineDefinition:  pulumi.String(json0),
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
// Using `pulumi import`, import pipelines using the `pipeline_name`. For example:
//
// ```sh
//
//	$ pulumi import aws:sagemaker/pipeline:Pipeline test_pipeline pipeline
//
// ```
type Pipeline struct {
	pulumi.CustomResourceState

	// The Amazon Resource Name (ARN) assigned by AWS to this Pipeline.
	Arn pulumi.StringOutput `pulumi:"arn"`
	// This is the configuration that controls the parallelism of the pipeline. If specified, it applies to all runs of this pipeline by default. see Parallelism Configuration details below.
	ParallelismConfiguration PipelineParallelismConfigurationPtrOutput `pulumi:"parallelismConfiguration"`
	// The [JSON pipeline definition](https://aws-sagemaker-mlops.github.io/sagemaker-model-building-pipeline-definition-JSON-schema/) of the pipeline.
	PipelineDefinition pulumi.StringPtrOutput `pulumi:"pipelineDefinition"`
	// The location of the pipeline definition stored in Amazon S3. If specified, SageMaker will retrieve the pipeline definition from this location. see Pipeline Definition S3 Location details below.
	PipelineDefinitionS3Location PipelinePipelineDefinitionS3LocationPtrOutput `pulumi:"pipelineDefinitionS3Location"`
	// A description of the pipeline.
	PipelineDescription pulumi.StringPtrOutput `pulumi:"pipelineDescription"`
	// The display name of the pipeline.
	PipelineDisplayName pulumi.StringOutput `pulumi:"pipelineDisplayName"`
	// The name of the pipeline.
	PipelineName pulumi.StringOutput `pulumi:"pipelineName"`
	// The name of the Pipeline (must be unique).
	RoleArn pulumi.StringPtrOutput `pulumi:"roleArn"`
	// A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapOutput `pulumi:"tagsAll"`
}

// NewPipeline registers a new resource with the given unique name, arguments, and options.
func NewPipeline(ctx *pulumi.Context,
	name string, args *PipelineArgs, opts ...pulumi.ResourceOption) (*Pipeline, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.PipelineDisplayName == nil {
		return nil, errors.New("invalid value for required argument 'PipelineDisplayName'")
	}
	if args.PipelineName == nil {
		return nil, errors.New("invalid value for required argument 'PipelineName'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Pipeline
	err := ctx.RegisterResource("aws:sagemaker/pipeline:Pipeline", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetPipeline gets an existing Pipeline resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetPipeline(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *PipelineState, opts ...pulumi.ResourceOption) (*Pipeline, error) {
	var resource Pipeline
	err := ctx.ReadResource("aws:sagemaker/pipeline:Pipeline", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Pipeline resources.
type pipelineState struct {
	// The Amazon Resource Name (ARN) assigned by AWS to this Pipeline.
	Arn *string `pulumi:"arn"`
	// This is the configuration that controls the parallelism of the pipeline. If specified, it applies to all runs of this pipeline by default. see Parallelism Configuration details below.
	ParallelismConfiguration *PipelineParallelismConfiguration `pulumi:"parallelismConfiguration"`
	// The [JSON pipeline definition](https://aws-sagemaker-mlops.github.io/sagemaker-model-building-pipeline-definition-JSON-schema/) of the pipeline.
	PipelineDefinition *string `pulumi:"pipelineDefinition"`
	// The location of the pipeline definition stored in Amazon S3. If specified, SageMaker will retrieve the pipeline definition from this location. see Pipeline Definition S3 Location details below.
	PipelineDefinitionS3Location *PipelinePipelineDefinitionS3Location `pulumi:"pipelineDefinitionS3Location"`
	// A description of the pipeline.
	PipelineDescription *string `pulumi:"pipelineDescription"`
	// The display name of the pipeline.
	PipelineDisplayName *string `pulumi:"pipelineDisplayName"`
	// The name of the pipeline.
	PipelineName *string `pulumi:"pipelineName"`
	// The name of the Pipeline (must be unique).
	RoleArn *string `pulumi:"roleArn"`
	// A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll map[string]string `pulumi:"tagsAll"`
}

type PipelineState struct {
	// The Amazon Resource Name (ARN) assigned by AWS to this Pipeline.
	Arn pulumi.StringPtrInput
	// This is the configuration that controls the parallelism of the pipeline. If specified, it applies to all runs of this pipeline by default. see Parallelism Configuration details below.
	ParallelismConfiguration PipelineParallelismConfigurationPtrInput
	// The [JSON pipeline definition](https://aws-sagemaker-mlops.github.io/sagemaker-model-building-pipeline-definition-JSON-schema/) of the pipeline.
	PipelineDefinition pulumi.StringPtrInput
	// The location of the pipeline definition stored in Amazon S3. If specified, SageMaker will retrieve the pipeline definition from this location. see Pipeline Definition S3 Location details below.
	PipelineDefinitionS3Location PipelinePipelineDefinitionS3LocationPtrInput
	// A description of the pipeline.
	PipelineDescription pulumi.StringPtrInput
	// The display name of the pipeline.
	PipelineDisplayName pulumi.StringPtrInput
	// The name of the pipeline.
	PipelineName pulumi.StringPtrInput
	// The name of the Pipeline (must be unique).
	RoleArn pulumi.StringPtrInput
	// A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapInput
}

func (PipelineState) ElementType() reflect.Type {
	return reflect.TypeOf((*pipelineState)(nil)).Elem()
}

type pipelineArgs struct {
	// This is the configuration that controls the parallelism of the pipeline. If specified, it applies to all runs of this pipeline by default. see Parallelism Configuration details below.
	ParallelismConfiguration *PipelineParallelismConfiguration `pulumi:"parallelismConfiguration"`
	// The [JSON pipeline definition](https://aws-sagemaker-mlops.github.io/sagemaker-model-building-pipeline-definition-JSON-schema/) of the pipeline.
	PipelineDefinition *string `pulumi:"pipelineDefinition"`
	// The location of the pipeline definition stored in Amazon S3. If specified, SageMaker will retrieve the pipeline definition from this location. see Pipeline Definition S3 Location details below.
	PipelineDefinitionS3Location *PipelinePipelineDefinitionS3Location `pulumi:"pipelineDefinitionS3Location"`
	// A description of the pipeline.
	PipelineDescription *string `pulumi:"pipelineDescription"`
	// The display name of the pipeline.
	PipelineDisplayName string `pulumi:"pipelineDisplayName"`
	// The name of the pipeline.
	PipelineName string `pulumi:"pipelineName"`
	// The name of the Pipeline (must be unique).
	RoleArn *string `pulumi:"roleArn"`
	// A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
}

// The set of arguments for constructing a Pipeline resource.
type PipelineArgs struct {
	// This is the configuration that controls the parallelism of the pipeline. If specified, it applies to all runs of this pipeline by default. see Parallelism Configuration details below.
	ParallelismConfiguration PipelineParallelismConfigurationPtrInput
	// The [JSON pipeline definition](https://aws-sagemaker-mlops.github.io/sagemaker-model-building-pipeline-definition-JSON-schema/) of the pipeline.
	PipelineDefinition pulumi.StringPtrInput
	// The location of the pipeline definition stored in Amazon S3. If specified, SageMaker will retrieve the pipeline definition from this location. see Pipeline Definition S3 Location details below.
	PipelineDefinitionS3Location PipelinePipelineDefinitionS3LocationPtrInput
	// A description of the pipeline.
	PipelineDescription pulumi.StringPtrInput
	// The display name of the pipeline.
	PipelineDisplayName pulumi.StringInput
	// The name of the pipeline.
	PipelineName pulumi.StringInput
	// The name of the Pipeline (must be unique).
	RoleArn pulumi.StringPtrInput
	// A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
}

func (PipelineArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*pipelineArgs)(nil)).Elem()
}

type PipelineInput interface {
	pulumi.Input

	ToPipelineOutput() PipelineOutput
	ToPipelineOutputWithContext(ctx context.Context) PipelineOutput
}

func (*Pipeline) ElementType() reflect.Type {
	return reflect.TypeOf((**Pipeline)(nil)).Elem()
}

func (i *Pipeline) ToPipelineOutput() PipelineOutput {
	return i.ToPipelineOutputWithContext(context.Background())
}

func (i *Pipeline) ToPipelineOutputWithContext(ctx context.Context) PipelineOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PipelineOutput)
}

// PipelineArrayInput is an input type that accepts PipelineArray and PipelineArrayOutput values.
// You can construct a concrete instance of `PipelineArrayInput` via:
//
//	PipelineArray{ PipelineArgs{...} }
type PipelineArrayInput interface {
	pulumi.Input

	ToPipelineArrayOutput() PipelineArrayOutput
	ToPipelineArrayOutputWithContext(context.Context) PipelineArrayOutput
}

type PipelineArray []PipelineInput

func (PipelineArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Pipeline)(nil)).Elem()
}

func (i PipelineArray) ToPipelineArrayOutput() PipelineArrayOutput {
	return i.ToPipelineArrayOutputWithContext(context.Background())
}

func (i PipelineArray) ToPipelineArrayOutputWithContext(ctx context.Context) PipelineArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PipelineArrayOutput)
}

// PipelineMapInput is an input type that accepts PipelineMap and PipelineMapOutput values.
// You can construct a concrete instance of `PipelineMapInput` via:
//
//	PipelineMap{ "key": PipelineArgs{...} }
type PipelineMapInput interface {
	pulumi.Input

	ToPipelineMapOutput() PipelineMapOutput
	ToPipelineMapOutputWithContext(context.Context) PipelineMapOutput
}

type PipelineMap map[string]PipelineInput

func (PipelineMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Pipeline)(nil)).Elem()
}

func (i PipelineMap) ToPipelineMapOutput() PipelineMapOutput {
	return i.ToPipelineMapOutputWithContext(context.Background())
}

func (i PipelineMap) ToPipelineMapOutputWithContext(ctx context.Context) PipelineMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PipelineMapOutput)
}

type PipelineOutput struct{ *pulumi.OutputState }

func (PipelineOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Pipeline)(nil)).Elem()
}

func (o PipelineOutput) ToPipelineOutput() PipelineOutput {
	return o
}

func (o PipelineOutput) ToPipelineOutputWithContext(ctx context.Context) PipelineOutput {
	return o
}

// The Amazon Resource Name (ARN) assigned by AWS to this Pipeline.
func (o PipelineOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v *Pipeline) pulumi.StringOutput { return v.Arn }).(pulumi.StringOutput)
}

// This is the configuration that controls the parallelism of the pipeline. If specified, it applies to all runs of this pipeline by default. see Parallelism Configuration details below.
func (o PipelineOutput) ParallelismConfiguration() PipelineParallelismConfigurationPtrOutput {
	return o.ApplyT(func(v *Pipeline) PipelineParallelismConfigurationPtrOutput { return v.ParallelismConfiguration }).(PipelineParallelismConfigurationPtrOutput)
}

// The [JSON pipeline definition](https://aws-sagemaker-mlops.github.io/sagemaker-model-building-pipeline-definition-JSON-schema/) of the pipeline.
func (o PipelineOutput) PipelineDefinition() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Pipeline) pulumi.StringPtrOutput { return v.PipelineDefinition }).(pulumi.StringPtrOutput)
}

// The location of the pipeline definition stored in Amazon S3. If specified, SageMaker will retrieve the pipeline definition from this location. see Pipeline Definition S3 Location details below.
func (o PipelineOutput) PipelineDefinitionS3Location() PipelinePipelineDefinitionS3LocationPtrOutput {
	return o.ApplyT(func(v *Pipeline) PipelinePipelineDefinitionS3LocationPtrOutput { return v.PipelineDefinitionS3Location }).(PipelinePipelineDefinitionS3LocationPtrOutput)
}

// A description of the pipeline.
func (o PipelineOutput) PipelineDescription() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Pipeline) pulumi.StringPtrOutput { return v.PipelineDescription }).(pulumi.StringPtrOutput)
}

// The display name of the pipeline.
func (o PipelineOutput) PipelineDisplayName() pulumi.StringOutput {
	return o.ApplyT(func(v *Pipeline) pulumi.StringOutput { return v.PipelineDisplayName }).(pulumi.StringOutput)
}

// The name of the pipeline.
func (o PipelineOutput) PipelineName() pulumi.StringOutput {
	return o.ApplyT(func(v *Pipeline) pulumi.StringOutput { return v.PipelineName }).(pulumi.StringOutput)
}

// The name of the Pipeline (must be unique).
func (o PipelineOutput) RoleArn() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Pipeline) pulumi.StringPtrOutput { return v.RoleArn }).(pulumi.StringPtrOutput)
}

// A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
func (o PipelineOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Pipeline) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
//
// Deprecated: Please use `tags` instead.
func (o PipelineOutput) TagsAll() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Pipeline) pulumi.StringMapOutput { return v.TagsAll }).(pulumi.StringMapOutput)
}

type PipelineArrayOutput struct{ *pulumi.OutputState }

func (PipelineArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Pipeline)(nil)).Elem()
}

func (o PipelineArrayOutput) ToPipelineArrayOutput() PipelineArrayOutput {
	return o
}

func (o PipelineArrayOutput) ToPipelineArrayOutputWithContext(ctx context.Context) PipelineArrayOutput {
	return o
}

func (o PipelineArrayOutput) Index(i pulumi.IntInput) PipelineOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Pipeline {
		return vs[0].([]*Pipeline)[vs[1].(int)]
	}).(PipelineOutput)
}

type PipelineMapOutput struct{ *pulumi.OutputState }

func (PipelineMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Pipeline)(nil)).Elem()
}

func (o PipelineMapOutput) ToPipelineMapOutput() PipelineMapOutput {
	return o
}

func (o PipelineMapOutput) ToPipelineMapOutputWithContext(ctx context.Context) PipelineMapOutput {
	return o
}

func (o PipelineMapOutput) MapIndex(k pulumi.StringInput) PipelineOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Pipeline {
		return vs[0].(map[string]*Pipeline)[vs[1].(string)]
	}).(PipelineOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*PipelineInput)(nil)).Elem(), &Pipeline{})
	pulumi.RegisterInputType(reflect.TypeOf((*PipelineArrayInput)(nil)).Elem(), PipelineArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*PipelineMapInput)(nil)).Elem(), PipelineMap{})
	pulumi.RegisterOutputType(PipelineOutput{})
	pulumi.RegisterOutputType(PipelineArrayOutput{})
	pulumi.RegisterOutputType(PipelineMapOutput{})
}

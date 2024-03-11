// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package bedrock

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Example Usage
//
// <!--Start PulumiCodeChooser -->
// ```go
// package main
//
// import (
//
//	"fmt"
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/bedrock"
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/bedrockfoundation"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			example, err := bedrockfoundation.GetModel(ctx, &bedrockfoundation.GetModelArgs{
//				ModelId: "amazon.titan-text-express-v1",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = bedrock.NewCustomModel(ctx, "example", &bedrock.CustomModelArgs{
//				CustomModelName:     pulumi.String("example-model"),
//				JobName:             pulumi.String("example-job-1"),
//				BaseModelIdentifier: *pulumi.String(example.ModelArn),
//				RoleArn:             pulumi.Any(exampleAwsIamRole.Arn),
//				Hyperparameters: pulumi.StringMap{
//					"epochCount":              pulumi.String("1"),
//					"batchSize":               pulumi.String("1"),
//					"learningRate":            pulumi.String("0.005"),
//					"learningRateWarmupSteps": pulumi.String("0"),
//				},
//				OutputDataConfig: &bedrock.CustomModelOutputDataConfigArgs{
//					S3Uri: pulumi.String(fmt.Sprintf("s3://%v/data/", output.Id)),
//				},
//				TrainingDataConfig: &bedrock.CustomModelTrainingDataConfigArgs{
//					S3Uri: pulumi.String(fmt.Sprintf("s3://%v/data/train.jsonl", training.Id)),
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
// <!--End PulumiCodeChooser -->
//
// ## Import
//
// Using `pulumi import`, import Bedrock custom model using the `job_arn`. For example:
//
// ```sh
// $ pulumi import aws:bedrock/customModel:CustomModel example arn:aws:bedrock:us-west-2:123456789012:model-customization-job/amazon.titan-text-express-v1:0:8k/1y5n57gh5y2e
// ```
type CustomModel struct {
	pulumi.CustomResourceState

	// The Amazon Resource Name (ARN) of the base model.
	BaseModelIdentifier pulumi.StringOutput `pulumi:"baseModelIdentifier"`
	// The ARN of the output model.
	CustomModelArn pulumi.StringOutput `pulumi:"customModelArn"`
	// The custom model is encrypted at rest using this key. Specify the key ARN.
	CustomModelKmsKeyId pulumi.StringPtrOutput `pulumi:"customModelKmsKeyId"`
	// Name for the custom model.
	CustomModelName pulumi.StringOutput `pulumi:"customModelName"`
	// The customization type. Valid values: `FINE_TUNING`, `CONTINUED_PRE_TRAINING`.
	CustomizationType pulumi.StringOutput `pulumi:"customizationType"`
	// [Parameters](https://docs.aws.amazon.com/bedrock/latest/userguide/custom-models-hp.html) related to tuning the model.
	Hyperparameters pulumi.StringMapOutput `pulumi:"hyperparameters"`
	// The ARN of the customization job.
	JobArn pulumi.StringOutput `pulumi:"jobArn"`
	// A name for the customization job.
	JobName pulumi.StringOutput `pulumi:"jobName"`
	// The status of the customization job. A successful job transitions from `InProgress` to `Completed` when the output model is ready to use.
	JobStatus pulumi.StringOutput `pulumi:"jobStatus"`
	// S3 location for the output data.
	OutputDataConfig CustomModelOutputDataConfigPtrOutput `pulumi:"outputDataConfig"`
	// The Amazon Resource Name (ARN) of an IAM role that Bedrock can assume to perform tasks on your behalf.
	RoleArn pulumi.StringOutput `pulumi:"roleArn"`
	// A map of tags to assign to the customization job and custom model. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll  pulumi.StringMapOutput       `pulumi:"tagsAll"`
	Timeouts CustomModelTimeoutsPtrOutput `pulumi:"timeouts"`
	// Information about the training dataset.
	TrainingDataConfig CustomModelTrainingDataConfigPtrOutput `pulumi:"trainingDataConfig"`
	// Metrics associated with the customization job.
	TrainingMetrics CustomModelTrainingMetricArrayOutput `pulumi:"trainingMetrics"`
	// Information about the validation dataset.
	ValidationDataConfig CustomModelValidationDataConfigPtrOutput `pulumi:"validationDataConfig"`
	// The loss metric for each validator that you provided.
	ValidationMetrics CustomModelValidationMetricArrayOutput `pulumi:"validationMetrics"`
	// Configuration parameters for the private Virtual Private Cloud (VPC) that contains the resources you are using for this job.
	VpcConfig CustomModelVpcConfigPtrOutput `pulumi:"vpcConfig"`
}

// NewCustomModel registers a new resource with the given unique name, arguments, and options.
func NewCustomModel(ctx *pulumi.Context,
	name string, args *CustomModelArgs, opts ...pulumi.ResourceOption) (*CustomModel, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.BaseModelIdentifier == nil {
		return nil, errors.New("invalid value for required argument 'BaseModelIdentifier'")
	}
	if args.CustomModelName == nil {
		return nil, errors.New("invalid value for required argument 'CustomModelName'")
	}
	if args.Hyperparameters == nil {
		return nil, errors.New("invalid value for required argument 'Hyperparameters'")
	}
	if args.JobName == nil {
		return nil, errors.New("invalid value for required argument 'JobName'")
	}
	if args.RoleArn == nil {
		return nil, errors.New("invalid value for required argument 'RoleArn'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource CustomModel
	err := ctx.RegisterResource("aws:bedrock/customModel:CustomModel", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetCustomModel gets an existing CustomModel resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetCustomModel(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *CustomModelState, opts ...pulumi.ResourceOption) (*CustomModel, error) {
	var resource CustomModel
	err := ctx.ReadResource("aws:bedrock/customModel:CustomModel", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering CustomModel resources.
type customModelState struct {
	// The Amazon Resource Name (ARN) of the base model.
	BaseModelIdentifier *string `pulumi:"baseModelIdentifier"`
	// The ARN of the output model.
	CustomModelArn *string `pulumi:"customModelArn"`
	// The custom model is encrypted at rest using this key. Specify the key ARN.
	CustomModelKmsKeyId *string `pulumi:"customModelKmsKeyId"`
	// Name for the custom model.
	CustomModelName *string `pulumi:"customModelName"`
	// The customization type. Valid values: `FINE_TUNING`, `CONTINUED_PRE_TRAINING`.
	CustomizationType *string `pulumi:"customizationType"`
	// [Parameters](https://docs.aws.amazon.com/bedrock/latest/userguide/custom-models-hp.html) related to tuning the model.
	Hyperparameters map[string]string `pulumi:"hyperparameters"`
	// The ARN of the customization job.
	JobArn *string `pulumi:"jobArn"`
	// A name for the customization job.
	JobName *string `pulumi:"jobName"`
	// The status of the customization job. A successful job transitions from `InProgress` to `Completed` when the output model is ready to use.
	JobStatus *string `pulumi:"jobStatus"`
	// S3 location for the output data.
	OutputDataConfig *CustomModelOutputDataConfig `pulumi:"outputDataConfig"`
	// The Amazon Resource Name (ARN) of an IAM role that Bedrock can assume to perform tasks on your behalf.
	RoleArn *string `pulumi:"roleArn"`
	// A map of tags to assign to the customization job and custom model. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll  map[string]string    `pulumi:"tagsAll"`
	Timeouts *CustomModelTimeouts `pulumi:"timeouts"`
	// Information about the training dataset.
	TrainingDataConfig *CustomModelTrainingDataConfig `pulumi:"trainingDataConfig"`
	// Metrics associated with the customization job.
	TrainingMetrics []CustomModelTrainingMetric `pulumi:"trainingMetrics"`
	// Information about the validation dataset.
	ValidationDataConfig *CustomModelValidationDataConfig `pulumi:"validationDataConfig"`
	// The loss metric for each validator that you provided.
	ValidationMetrics []CustomModelValidationMetric `pulumi:"validationMetrics"`
	// Configuration parameters for the private Virtual Private Cloud (VPC) that contains the resources you are using for this job.
	VpcConfig *CustomModelVpcConfig `pulumi:"vpcConfig"`
}

type CustomModelState struct {
	// The Amazon Resource Name (ARN) of the base model.
	BaseModelIdentifier pulumi.StringPtrInput
	// The ARN of the output model.
	CustomModelArn pulumi.StringPtrInput
	// The custom model is encrypted at rest using this key. Specify the key ARN.
	CustomModelKmsKeyId pulumi.StringPtrInput
	// Name for the custom model.
	CustomModelName pulumi.StringPtrInput
	// The customization type. Valid values: `FINE_TUNING`, `CONTINUED_PRE_TRAINING`.
	CustomizationType pulumi.StringPtrInput
	// [Parameters](https://docs.aws.amazon.com/bedrock/latest/userguide/custom-models-hp.html) related to tuning the model.
	Hyperparameters pulumi.StringMapInput
	// The ARN of the customization job.
	JobArn pulumi.StringPtrInput
	// A name for the customization job.
	JobName pulumi.StringPtrInput
	// The status of the customization job. A successful job transitions from `InProgress` to `Completed` when the output model is ready to use.
	JobStatus pulumi.StringPtrInput
	// S3 location for the output data.
	OutputDataConfig CustomModelOutputDataConfigPtrInput
	// The Amazon Resource Name (ARN) of an IAM role that Bedrock can assume to perform tasks on your behalf.
	RoleArn pulumi.StringPtrInput
	// A map of tags to assign to the customization job and custom model. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll  pulumi.StringMapInput
	Timeouts CustomModelTimeoutsPtrInput
	// Information about the training dataset.
	TrainingDataConfig CustomModelTrainingDataConfigPtrInput
	// Metrics associated with the customization job.
	TrainingMetrics CustomModelTrainingMetricArrayInput
	// Information about the validation dataset.
	ValidationDataConfig CustomModelValidationDataConfigPtrInput
	// The loss metric for each validator that you provided.
	ValidationMetrics CustomModelValidationMetricArrayInput
	// Configuration parameters for the private Virtual Private Cloud (VPC) that contains the resources you are using for this job.
	VpcConfig CustomModelVpcConfigPtrInput
}

func (CustomModelState) ElementType() reflect.Type {
	return reflect.TypeOf((*customModelState)(nil)).Elem()
}

type customModelArgs struct {
	// The Amazon Resource Name (ARN) of the base model.
	BaseModelIdentifier string `pulumi:"baseModelIdentifier"`
	// The custom model is encrypted at rest using this key. Specify the key ARN.
	CustomModelKmsKeyId *string `pulumi:"customModelKmsKeyId"`
	// Name for the custom model.
	CustomModelName string `pulumi:"customModelName"`
	// The customization type. Valid values: `FINE_TUNING`, `CONTINUED_PRE_TRAINING`.
	CustomizationType *string `pulumi:"customizationType"`
	// [Parameters](https://docs.aws.amazon.com/bedrock/latest/userguide/custom-models-hp.html) related to tuning the model.
	Hyperparameters map[string]string `pulumi:"hyperparameters"`
	// A name for the customization job.
	JobName string `pulumi:"jobName"`
	// S3 location for the output data.
	OutputDataConfig *CustomModelOutputDataConfig `pulumi:"outputDataConfig"`
	// The Amazon Resource Name (ARN) of an IAM role that Bedrock can assume to perform tasks on your behalf.
	RoleArn string `pulumi:"roleArn"`
	// A map of tags to assign to the customization job and custom model. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags     map[string]string    `pulumi:"tags"`
	Timeouts *CustomModelTimeouts `pulumi:"timeouts"`
	// Information about the training dataset.
	TrainingDataConfig *CustomModelTrainingDataConfig `pulumi:"trainingDataConfig"`
	// Information about the validation dataset.
	ValidationDataConfig *CustomModelValidationDataConfig `pulumi:"validationDataConfig"`
	// Configuration parameters for the private Virtual Private Cloud (VPC) that contains the resources you are using for this job.
	VpcConfig *CustomModelVpcConfig `pulumi:"vpcConfig"`
}

// The set of arguments for constructing a CustomModel resource.
type CustomModelArgs struct {
	// The Amazon Resource Name (ARN) of the base model.
	BaseModelIdentifier pulumi.StringInput
	// The custom model is encrypted at rest using this key. Specify the key ARN.
	CustomModelKmsKeyId pulumi.StringPtrInput
	// Name for the custom model.
	CustomModelName pulumi.StringInput
	// The customization type. Valid values: `FINE_TUNING`, `CONTINUED_PRE_TRAINING`.
	CustomizationType pulumi.StringPtrInput
	// [Parameters](https://docs.aws.amazon.com/bedrock/latest/userguide/custom-models-hp.html) related to tuning the model.
	Hyperparameters pulumi.StringMapInput
	// A name for the customization job.
	JobName pulumi.StringInput
	// S3 location for the output data.
	OutputDataConfig CustomModelOutputDataConfigPtrInput
	// The Amazon Resource Name (ARN) of an IAM role that Bedrock can assume to perform tasks on your behalf.
	RoleArn pulumi.StringInput
	// A map of tags to assign to the customization job and custom model. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags     pulumi.StringMapInput
	Timeouts CustomModelTimeoutsPtrInput
	// Information about the training dataset.
	TrainingDataConfig CustomModelTrainingDataConfigPtrInput
	// Information about the validation dataset.
	ValidationDataConfig CustomModelValidationDataConfigPtrInput
	// Configuration parameters for the private Virtual Private Cloud (VPC) that contains the resources you are using for this job.
	VpcConfig CustomModelVpcConfigPtrInput
}

func (CustomModelArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*customModelArgs)(nil)).Elem()
}

type CustomModelInput interface {
	pulumi.Input

	ToCustomModelOutput() CustomModelOutput
	ToCustomModelOutputWithContext(ctx context.Context) CustomModelOutput
}

func (*CustomModel) ElementType() reflect.Type {
	return reflect.TypeOf((**CustomModel)(nil)).Elem()
}

func (i *CustomModel) ToCustomModelOutput() CustomModelOutput {
	return i.ToCustomModelOutputWithContext(context.Background())
}

func (i *CustomModel) ToCustomModelOutputWithContext(ctx context.Context) CustomModelOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CustomModelOutput)
}

// CustomModelArrayInput is an input type that accepts CustomModelArray and CustomModelArrayOutput values.
// You can construct a concrete instance of `CustomModelArrayInput` via:
//
//	CustomModelArray{ CustomModelArgs{...} }
type CustomModelArrayInput interface {
	pulumi.Input

	ToCustomModelArrayOutput() CustomModelArrayOutput
	ToCustomModelArrayOutputWithContext(context.Context) CustomModelArrayOutput
}

type CustomModelArray []CustomModelInput

func (CustomModelArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*CustomModel)(nil)).Elem()
}

func (i CustomModelArray) ToCustomModelArrayOutput() CustomModelArrayOutput {
	return i.ToCustomModelArrayOutputWithContext(context.Background())
}

func (i CustomModelArray) ToCustomModelArrayOutputWithContext(ctx context.Context) CustomModelArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CustomModelArrayOutput)
}

// CustomModelMapInput is an input type that accepts CustomModelMap and CustomModelMapOutput values.
// You can construct a concrete instance of `CustomModelMapInput` via:
//
//	CustomModelMap{ "key": CustomModelArgs{...} }
type CustomModelMapInput interface {
	pulumi.Input

	ToCustomModelMapOutput() CustomModelMapOutput
	ToCustomModelMapOutputWithContext(context.Context) CustomModelMapOutput
}

type CustomModelMap map[string]CustomModelInput

func (CustomModelMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*CustomModel)(nil)).Elem()
}

func (i CustomModelMap) ToCustomModelMapOutput() CustomModelMapOutput {
	return i.ToCustomModelMapOutputWithContext(context.Background())
}

func (i CustomModelMap) ToCustomModelMapOutputWithContext(ctx context.Context) CustomModelMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CustomModelMapOutput)
}

type CustomModelOutput struct{ *pulumi.OutputState }

func (CustomModelOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**CustomModel)(nil)).Elem()
}

func (o CustomModelOutput) ToCustomModelOutput() CustomModelOutput {
	return o
}

func (o CustomModelOutput) ToCustomModelOutputWithContext(ctx context.Context) CustomModelOutput {
	return o
}

// The Amazon Resource Name (ARN) of the base model.
func (o CustomModelOutput) BaseModelIdentifier() pulumi.StringOutput {
	return o.ApplyT(func(v *CustomModel) pulumi.StringOutput { return v.BaseModelIdentifier }).(pulumi.StringOutput)
}

// The ARN of the output model.
func (o CustomModelOutput) CustomModelArn() pulumi.StringOutput {
	return o.ApplyT(func(v *CustomModel) pulumi.StringOutput { return v.CustomModelArn }).(pulumi.StringOutput)
}

// The custom model is encrypted at rest using this key. Specify the key ARN.
func (o CustomModelOutput) CustomModelKmsKeyId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *CustomModel) pulumi.StringPtrOutput { return v.CustomModelKmsKeyId }).(pulumi.StringPtrOutput)
}

// Name for the custom model.
func (o CustomModelOutput) CustomModelName() pulumi.StringOutput {
	return o.ApplyT(func(v *CustomModel) pulumi.StringOutput { return v.CustomModelName }).(pulumi.StringOutput)
}

// The customization type. Valid values: `FINE_TUNING`, `CONTINUED_PRE_TRAINING`.
func (o CustomModelOutput) CustomizationType() pulumi.StringOutput {
	return o.ApplyT(func(v *CustomModel) pulumi.StringOutput { return v.CustomizationType }).(pulumi.StringOutput)
}

// [Parameters](https://docs.aws.amazon.com/bedrock/latest/userguide/custom-models-hp.html) related to tuning the model.
func (o CustomModelOutput) Hyperparameters() pulumi.StringMapOutput {
	return o.ApplyT(func(v *CustomModel) pulumi.StringMapOutput { return v.Hyperparameters }).(pulumi.StringMapOutput)
}

// The ARN of the customization job.
func (o CustomModelOutput) JobArn() pulumi.StringOutput {
	return o.ApplyT(func(v *CustomModel) pulumi.StringOutput { return v.JobArn }).(pulumi.StringOutput)
}

// A name for the customization job.
func (o CustomModelOutput) JobName() pulumi.StringOutput {
	return o.ApplyT(func(v *CustomModel) pulumi.StringOutput { return v.JobName }).(pulumi.StringOutput)
}

// The status of the customization job. A successful job transitions from `InProgress` to `Completed` when the output model is ready to use.
func (o CustomModelOutput) JobStatus() pulumi.StringOutput {
	return o.ApplyT(func(v *CustomModel) pulumi.StringOutput { return v.JobStatus }).(pulumi.StringOutput)
}

// S3 location for the output data.
func (o CustomModelOutput) OutputDataConfig() CustomModelOutputDataConfigPtrOutput {
	return o.ApplyT(func(v *CustomModel) CustomModelOutputDataConfigPtrOutput { return v.OutputDataConfig }).(CustomModelOutputDataConfigPtrOutput)
}

// The Amazon Resource Name (ARN) of an IAM role that Bedrock can assume to perform tasks on your behalf.
func (o CustomModelOutput) RoleArn() pulumi.StringOutput {
	return o.ApplyT(func(v *CustomModel) pulumi.StringOutput { return v.RoleArn }).(pulumi.StringOutput)
}

// A map of tags to assign to the customization job and custom model. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
func (o CustomModelOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *CustomModel) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
//
// Deprecated: Please use `tags` instead.
func (o CustomModelOutput) TagsAll() pulumi.StringMapOutput {
	return o.ApplyT(func(v *CustomModel) pulumi.StringMapOutput { return v.TagsAll }).(pulumi.StringMapOutput)
}

func (o CustomModelOutput) Timeouts() CustomModelTimeoutsPtrOutput {
	return o.ApplyT(func(v *CustomModel) CustomModelTimeoutsPtrOutput { return v.Timeouts }).(CustomModelTimeoutsPtrOutput)
}

// Information about the training dataset.
func (o CustomModelOutput) TrainingDataConfig() CustomModelTrainingDataConfigPtrOutput {
	return o.ApplyT(func(v *CustomModel) CustomModelTrainingDataConfigPtrOutput { return v.TrainingDataConfig }).(CustomModelTrainingDataConfigPtrOutput)
}

// Metrics associated with the customization job.
func (o CustomModelOutput) TrainingMetrics() CustomModelTrainingMetricArrayOutput {
	return o.ApplyT(func(v *CustomModel) CustomModelTrainingMetricArrayOutput { return v.TrainingMetrics }).(CustomModelTrainingMetricArrayOutput)
}

// Information about the validation dataset.
func (o CustomModelOutput) ValidationDataConfig() CustomModelValidationDataConfigPtrOutput {
	return o.ApplyT(func(v *CustomModel) CustomModelValidationDataConfigPtrOutput { return v.ValidationDataConfig }).(CustomModelValidationDataConfigPtrOutput)
}

// The loss metric for each validator that you provided.
func (o CustomModelOutput) ValidationMetrics() CustomModelValidationMetricArrayOutput {
	return o.ApplyT(func(v *CustomModel) CustomModelValidationMetricArrayOutput { return v.ValidationMetrics }).(CustomModelValidationMetricArrayOutput)
}

// Configuration parameters for the private Virtual Private Cloud (VPC) that contains the resources you are using for this job.
func (o CustomModelOutput) VpcConfig() CustomModelVpcConfigPtrOutput {
	return o.ApplyT(func(v *CustomModel) CustomModelVpcConfigPtrOutput { return v.VpcConfig }).(CustomModelVpcConfigPtrOutput)
}

type CustomModelArrayOutput struct{ *pulumi.OutputState }

func (CustomModelArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*CustomModel)(nil)).Elem()
}

func (o CustomModelArrayOutput) ToCustomModelArrayOutput() CustomModelArrayOutput {
	return o
}

func (o CustomModelArrayOutput) ToCustomModelArrayOutputWithContext(ctx context.Context) CustomModelArrayOutput {
	return o
}

func (o CustomModelArrayOutput) Index(i pulumi.IntInput) CustomModelOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *CustomModel {
		return vs[0].([]*CustomModel)[vs[1].(int)]
	}).(CustomModelOutput)
}

type CustomModelMapOutput struct{ *pulumi.OutputState }

func (CustomModelMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*CustomModel)(nil)).Elem()
}

func (o CustomModelMapOutput) ToCustomModelMapOutput() CustomModelMapOutput {
	return o
}

func (o CustomModelMapOutput) ToCustomModelMapOutputWithContext(ctx context.Context) CustomModelMapOutput {
	return o
}

func (o CustomModelMapOutput) MapIndex(k pulumi.StringInput) CustomModelOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *CustomModel {
		return vs[0].(map[string]*CustomModel)[vs[1].(string)]
	}).(CustomModelOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*CustomModelInput)(nil)).Elem(), &CustomModel{})
	pulumi.RegisterInputType(reflect.TypeOf((*CustomModelArrayInput)(nil)).Elem(), CustomModelArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*CustomModelMapInput)(nil)).Elem(), CustomModelMap{})
	pulumi.RegisterOutputType(CustomModelOutput{})
	pulumi.RegisterOutputType(CustomModelArrayOutput{})
	pulumi.RegisterOutputType(CustomModelMapOutput{})
}

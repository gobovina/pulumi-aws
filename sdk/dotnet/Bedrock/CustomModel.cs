// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Bedrock
{
    /// <summary>
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var exampleModel = Aws.BedrockFoundation.GetModel.Invoke(new()
    ///     {
    ///         ModelId = "amazon.titan-text-express-v1",
    ///     });
    /// 
    ///     var exampleCustomModel = new Aws.Bedrock.CustomModel("exampleCustomModel", new()
    ///     {
    ///         CustomModelName = "example-model",
    ///         JobName = "example-job-1",
    ///         BaseModelIdentifier = exampleModel.Apply(getModelResult =&gt; getModelResult.ModelArn),
    ///         RoleArn = aws_iam_role.Example.Arn,
    ///         Hyperparameters = 
    ///         {
    ///             { "epochCount", "1" },
    ///             { "batchSize", "1" },
    ///             { "learningRate", "0.005" },
    ///             { "learningRateWarmupSteps", "0" },
    ///         },
    ///         OutputDataConfig = new Aws.Bedrock.Inputs.CustomModelOutputDataConfigArgs
    ///         {
    ///             S3Uri = $"s3://{aws_s3_bucket.Output.Id}/data/",
    ///         },
    ///         TrainingDataConfig = new Aws.Bedrock.Inputs.CustomModelTrainingDataConfigArgs
    ///         {
    ///             S3Uri = $"s3://{aws_s3_bucket.Training.Id}/data/train.jsonl",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import Bedrock custom model using the `job_arn`. For example:
    /// 
    /// ```sh
    ///  $ pulumi import aws:bedrock/customModel:CustomModel example arn:aws:bedrock:us-west-2:123456789012:model-customization-job/amazon.titan-text-express-v1:0:8k/1y5n57gh5y2e
    /// ```
    /// </summary>
    [AwsResourceType("aws:bedrock/customModel:CustomModel")]
    public partial class CustomModel : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The Amazon Resource Name (ARN) of the base model.
        /// </summary>
        [Output("baseModelIdentifier")]
        public Output<string> BaseModelIdentifier { get; private set; } = null!;

        /// <summary>
        /// The ARN of the output model.
        /// </summary>
        [Output("customModelArn")]
        public Output<string> CustomModelArn { get; private set; } = null!;

        /// <summary>
        /// The custom model is encrypted at rest using this key. Specify the key ARN.
        /// </summary>
        [Output("customModelKmsKeyId")]
        public Output<string?> CustomModelKmsKeyId { get; private set; } = null!;

        /// <summary>
        /// Name for the custom model.
        /// </summary>
        [Output("customModelName")]
        public Output<string> CustomModelName { get; private set; } = null!;

        /// <summary>
        /// The customization type. Valid values: `FINE_TUNING`, `CONTINUED_PRE_TRAINING`.
        /// </summary>
        [Output("customizationType")]
        public Output<string> CustomizationType { get; private set; } = null!;

        /// <summary>
        /// [Parameters](https://docs.aws.amazon.com/bedrock/latest/userguide/custom-models-hp.html) related to tuning the model.
        /// </summary>
        [Output("hyperparameters")]
        public Output<ImmutableDictionary<string, string>> Hyperparameters { get; private set; } = null!;

        /// <summary>
        /// The ARN of the customization job.
        /// </summary>
        [Output("jobArn")]
        public Output<string> JobArn { get; private set; } = null!;

        /// <summary>
        /// A name for the customization job.
        /// </summary>
        [Output("jobName")]
        public Output<string> JobName { get; private set; } = null!;

        /// <summary>
        /// The status of the customization job. A successful job transitions from `InProgress` to `Completed` when the output model is ready to use.
        /// </summary>
        [Output("jobStatus")]
        public Output<string> JobStatus { get; private set; } = null!;

        /// <summary>
        /// S3 location for the output data.
        /// </summary>
        [Output("outputDataConfig")]
        public Output<Outputs.CustomModelOutputDataConfig?> OutputDataConfig { get; private set; } = null!;

        /// <summary>
        /// The Amazon Resource Name (ARN) of an IAM role that Bedrock can assume to perform tasks on your behalf.
        /// </summary>
        [Output("roleArn")]
        public Output<string> RoleArn { get; private set; } = null!;

        /// <summary>
        /// A map of tags to assign to the customization job and custom model. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;

        /// <summary>
        /// Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        /// </summary>
        [Output("tagsAll")]
        public Output<ImmutableDictionary<string, string>> TagsAll { get; private set; } = null!;

        [Output("timeouts")]
        public Output<Outputs.CustomModelTimeouts?> Timeouts { get; private set; } = null!;

        /// <summary>
        /// Information about the training dataset.
        /// </summary>
        [Output("trainingDataConfig")]
        public Output<Outputs.CustomModelTrainingDataConfig?> TrainingDataConfig { get; private set; } = null!;

        /// <summary>
        /// Metrics associated with the customization job.
        /// </summary>
        [Output("trainingMetrics")]
        public Output<ImmutableArray<Outputs.CustomModelTrainingMetric>> TrainingMetrics { get; private set; } = null!;

        /// <summary>
        /// Information about the validation dataset.
        /// </summary>
        [Output("validationDataConfig")]
        public Output<Outputs.CustomModelValidationDataConfig?> ValidationDataConfig { get; private set; } = null!;

        /// <summary>
        /// The loss metric for each validator that you provided.
        /// </summary>
        [Output("validationMetrics")]
        public Output<ImmutableArray<Outputs.CustomModelValidationMetric>> ValidationMetrics { get; private set; } = null!;

        /// <summary>
        /// Configuration parameters for the private Virtual Private Cloud (VPC) that contains the resources you are using for this job.
        /// </summary>
        [Output("vpcConfig")]
        public Output<Outputs.CustomModelVpcConfig?> VpcConfig { get; private set; } = null!;


        /// <summary>
        /// Create a CustomModel resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public CustomModel(string name, CustomModelArgs args, CustomResourceOptions? options = null)
            : base("aws:bedrock/customModel:CustomModel", name, args ?? new CustomModelArgs(), MakeResourceOptions(options, ""))
        {
        }

        private CustomModel(string name, Input<string> id, CustomModelState? state = null, CustomResourceOptions? options = null)
            : base("aws:bedrock/customModel:CustomModel", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing CustomModel resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static CustomModel Get(string name, Input<string> id, CustomModelState? state = null, CustomResourceOptions? options = null)
        {
            return new CustomModel(name, id, state, options);
        }
    }

    public sealed class CustomModelArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Amazon Resource Name (ARN) of the base model.
        /// </summary>
        [Input("baseModelIdentifier", required: true)]
        public Input<string> BaseModelIdentifier { get; set; } = null!;

        /// <summary>
        /// The custom model is encrypted at rest using this key. Specify the key ARN.
        /// </summary>
        [Input("customModelKmsKeyId")]
        public Input<string>? CustomModelKmsKeyId { get; set; }

        /// <summary>
        /// Name for the custom model.
        /// </summary>
        [Input("customModelName", required: true)]
        public Input<string> CustomModelName { get; set; } = null!;

        /// <summary>
        /// The customization type. Valid values: `FINE_TUNING`, `CONTINUED_PRE_TRAINING`.
        /// </summary>
        [Input("customizationType")]
        public Input<string>? CustomizationType { get; set; }

        [Input("hyperparameters", required: true)]
        private InputMap<string>? _hyperparameters;

        /// <summary>
        /// [Parameters](https://docs.aws.amazon.com/bedrock/latest/userguide/custom-models-hp.html) related to tuning the model.
        /// </summary>
        public InputMap<string> Hyperparameters
        {
            get => _hyperparameters ?? (_hyperparameters = new InputMap<string>());
            set => _hyperparameters = value;
        }

        /// <summary>
        /// A name for the customization job.
        /// </summary>
        [Input("jobName", required: true)]
        public Input<string> JobName { get; set; } = null!;

        /// <summary>
        /// S3 location for the output data.
        /// </summary>
        [Input("outputDataConfig")]
        public Input<Inputs.CustomModelOutputDataConfigArgs>? OutputDataConfig { get; set; }

        /// <summary>
        /// The Amazon Resource Name (ARN) of an IAM role that Bedrock can assume to perform tasks on your behalf.
        /// </summary>
        [Input("roleArn", required: true)]
        public Input<string> RoleArn { get; set; } = null!;

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A map of tags to assign to the customization job and custom model. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        [Input("timeouts")]
        public Input<Inputs.CustomModelTimeoutsArgs>? Timeouts { get; set; }

        /// <summary>
        /// Information about the training dataset.
        /// </summary>
        [Input("trainingDataConfig")]
        public Input<Inputs.CustomModelTrainingDataConfigArgs>? TrainingDataConfig { get; set; }

        /// <summary>
        /// Information about the validation dataset.
        /// </summary>
        [Input("validationDataConfig")]
        public Input<Inputs.CustomModelValidationDataConfigArgs>? ValidationDataConfig { get; set; }

        /// <summary>
        /// Configuration parameters for the private Virtual Private Cloud (VPC) that contains the resources you are using for this job.
        /// </summary>
        [Input("vpcConfig")]
        public Input<Inputs.CustomModelVpcConfigArgs>? VpcConfig { get; set; }

        public CustomModelArgs()
        {
        }
        public static new CustomModelArgs Empty => new CustomModelArgs();
    }

    public sealed class CustomModelState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Amazon Resource Name (ARN) of the base model.
        /// </summary>
        [Input("baseModelIdentifier")]
        public Input<string>? BaseModelIdentifier { get; set; }

        /// <summary>
        /// The ARN of the output model.
        /// </summary>
        [Input("customModelArn")]
        public Input<string>? CustomModelArn { get; set; }

        /// <summary>
        /// The custom model is encrypted at rest using this key. Specify the key ARN.
        /// </summary>
        [Input("customModelKmsKeyId")]
        public Input<string>? CustomModelKmsKeyId { get; set; }

        /// <summary>
        /// Name for the custom model.
        /// </summary>
        [Input("customModelName")]
        public Input<string>? CustomModelName { get; set; }

        /// <summary>
        /// The customization type. Valid values: `FINE_TUNING`, `CONTINUED_PRE_TRAINING`.
        /// </summary>
        [Input("customizationType")]
        public Input<string>? CustomizationType { get; set; }

        [Input("hyperparameters")]
        private InputMap<string>? _hyperparameters;

        /// <summary>
        /// [Parameters](https://docs.aws.amazon.com/bedrock/latest/userguide/custom-models-hp.html) related to tuning the model.
        /// </summary>
        public InputMap<string> Hyperparameters
        {
            get => _hyperparameters ?? (_hyperparameters = new InputMap<string>());
            set => _hyperparameters = value;
        }

        /// <summary>
        /// The ARN of the customization job.
        /// </summary>
        [Input("jobArn")]
        public Input<string>? JobArn { get; set; }

        /// <summary>
        /// A name for the customization job.
        /// </summary>
        [Input("jobName")]
        public Input<string>? JobName { get; set; }

        /// <summary>
        /// The status of the customization job. A successful job transitions from `InProgress` to `Completed` when the output model is ready to use.
        /// </summary>
        [Input("jobStatus")]
        public Input<string>? JobStatus { get; set; }

        /// <summary>
        /// S3 location for the output data.
        /// </summary>
        [Input("outputDataConfig")]
        public Input<Inputs.CustomModelOutputDataConfigGetArgs>? OutputDataConfig { get; set; }

        /// <summary>
        /// The Amazon Resource Name (ARN) of an IAM role that Bedrock can assume to perform tasks on your behalf.
        /// </summary>
        [Input("roleArn")]
        public Input<string>? RoleArn { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A map of tags to assign to the customization job and custom model. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        [Input("tagsAll")]
        private InputMap<string>? _tagsAll;

        /// <summary>
        /// Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        /// </summary>
        [Obsolete(@"Please use `tags` instead.")]
        public InputMap<string> TagsAll
        {
            get => _tagsAll ?? (_tagsAll = new InputMap<string>());
            set => _tagsAll = value;
        }

        [Input("timeouts")]
        public Input<Inputs.CustomModelTimeoutsGetArgs>? Timeouts { get; set; }

        /// <summary>
        /// Information about the training dataset.
        /// </summary>
        [Input("trainingDataConfig")]
        public Input<Inputs.CustomModelTrainingDataConfigGetArgs>? TrainingDataConfig { get; set; }

        [Input("trainingMetrics")]
        private InputList<Inputs.CustomModelTrainingMetricGetArgs>? _trainingMetrics;

        /// <summary>
        /// Metrics associated with the customization job.
        /// </summary>
        public InputList<Inputs.CustomModelTrainingMetricGetArgs> TrainingMetrics
        {
            get => _trainingMetrics ?? (_trainingMetrics = new InputList<Inputs.CustomModelTrainingMetricGetArgs>());
            set => _trainingMetrics = value;
        }

        /// <summary>
        /// Information about the validation dataset.
        /// </summary>
        [Input("validationDataConfig")]
        public Input<Inputs.CustomModelValidationDataConfigGetArgs>? ValidationDataConfig { get; set; }

        [Input("validationMetrics")]
        private InputList<Inputs.CustomModelValidationMetricGetArgs>? _validationMetrics;

        /// <summary>
        /// The loss metric for each validator that you provided.
        /// </summary>
        public InputList<Inputs.CustomModelValidationMetricGetArgs> ValidationMetrics
        {
            get => _validationMetrics ?? (_validationMetrics = new InputList<Inputs.CustomModelValidationMetricGetArgs>());
            set => _validationMetrics = value;
        }

        /// <summary>
        /// Configuration parameters for the private Virtual Private Cloud (VPC) that contains the resources you are using for this job.
        /// </summary>
        [Input("vpcConfig")]
        public Input<Inputs.CustomModelVpcConfigGetArgs>? VpcConfig { get; set; }

        public CustomModelState()
        {
        }
        public static new CustomModelState Empty => new CustomModelState();
    }
}

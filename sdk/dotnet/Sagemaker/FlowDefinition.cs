// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Sagemaker
{
    /// <summary>
    /// Provides a SageMaker Flow Definition resource.
    /// 
    /// ## Example Usage
    /// ### Basic Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Aws.Sagemaker.FlowDefinition("example", new()
    ///     {
    ///         FlowDefinitionName = "example",
    ///         RoleArn = aws_iam_role.Example.Arn,
    ///         HumanLoopConfig = new Aws.Sagemaker.Inputs.FlowDefinitionHumanLoopConfigArgs
    ///         {
    ///             HumanTaskUiArn = aws_sagemaker_human_task_ui.Example.Arn,
    ///             TaskAvailabilityLifetimeInSeconds = 1,
    ///             TaskCount = 1,
    ///             TaskDescription = "example",
    ///             TaskTitle = "example",
    ///             WorkteamArn = aws_sagemaker_workteam.Example.Arn,
    ///         },
    ///         OutputConfig = new Aws.Sagemaker.Inputs.FlowDefinitionOutputConfigArgs
    ///         {
    ///             S3OutputPath = $"s3://{aws_s3_bucket.Example.Bucket}/",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// ### Public Workteam Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Aws.Sagemaker.FlowDefinition("example", new()
    ///     {
    ///         FlowDefinitionName = "example",
    ///         RoleArn = aws_iam_role.Example.Arn,
    ///         HumanLoopConfig = new Aws.Sagemaker.Inputs.FlowDefinitionHumanLoopConfigArgs
    ///         {
    ///             HumanTaskUiArn = aws_sagemaker_human_task_ui.Example.Arn,
    ///             TaskAvailabilityLifetimeInSeconds = 1,
    ///             TaskCount = 1,
    ///             TaskDescription = "example",
    ///             TaskTitle = "example",
    ///             WorkteamArn = $"arn:aws:sagemaker:{data.Aws_region.Current.Name}:394669845002:workteam/public-crowd/default",
    ///             PublicWorkforceTaskPrice = new Aws.Sagemaker.Inputs.FlowDefinitionHumanLoopConfigPublicWorkforceTaskPriceArgs
    ///             {
    ///                 AmountInUsd = new Aws.Sagemaker.Inputs.FlowDefinitionHumanLoopConfigPublicWorkforceTaskPriceAmountInUsdArgs
    ///                 {
    ///                     Cents = 1,
    ///                     TenthFractionsOfACent = 2,
    ///                 },
    ///             },
    ///         },
    ///         OutputConfig = new Aws.Sagemaker.Inputs.FlowDefinitionOutputConfigArgs
    ///         {
    ///             S3OutputPath = $"s3://{aws_s3_bucket.Example.Bucket}/",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// ### Human Loop Activation Config Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Aws.Sagemaker.FlowDefinition("example", new()
    ///     {
    ///         FlowDefinitionName = "example",
    ///         RoleArn = aws_iam_role.Example.Arn,
    ///         HumanLoopConfig = new Aws.Sagemaker.Inputs.FlowDefinitionHumanLoopConfigArgs
    ///         {
    ///             HumanTaskUiArn = aws_sagemaker_human_task_ui.Example.Arn,
    ///             TaskAvailabilityLifetimeInSeconds = 1,
    ///             TaskCount = 1,
    ///             TaskDescription = "example",
    ///             TaskTitle = "example",
    ///             WorkteamArn = aws_sagemaker_workteam.Example.Arn,
    ///         },
    ///         HumanLoopRequestSource = new Aws.Sagemaker.Inputs.FlowDefinitionHumanLoopRequestSourceArgs
    ///         {
    ///             AwsManagedHumanLoopRequestSource = "AWS/Textract/AnalyzeDocument/Forms/V1",
    ///         },
    ///         HumanLoopActivationConfig = new Aws.Sagemaker.Inputs.FlowDefinitionHumanLoopActivationConfigArgs
    ///         {
    ///             HumanLoopActivationConditionsConfig = new Aws.Sagemaker.Inputs.FlowDefinitionHumanLoopActivationConfigHumanLoopActivationConditionsConfigArgs
    ///             {
    ///                 HumanLoopActivationConditions = @"        {
    /// 			""Conditions"": [
    /// 			  {
    /// 				""ConditionType"": ""Sampling"",
    /// 				""ConditionParameters"": {
    /// 				  ""RandomSamplingPercentage"": 5
    /// 				}
    /// 			  }
    /// 			]
    /// 		}
    /// ",
    ///             },
    ///         },
    ///         OutputConfig = new Aws.Sagemaker.Inputs.FlowDefinitionOutputConfigArgs
    ///         {
    ///             S3OutputPath = $"s3://{aws_s3_bucket.Example.Bucket}/",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import SageMaker Flow Definitions using the `flow_definition_name`. For example:
    /// 
    /// ```sh
    ///  $ pulumi import aws:sagemaker/flowDefinition:FlowDefinition example example
    /// ```
    /// </summary>
    [AwsResourceType("aws:sagemaker/flowDefinition:FlowDefinition")]
    public partial class FlowDefinition : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The Amazon Resource Name (ARN) assigned by AWS to this Flow Definition.
        /// </summary>
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

        /// <summary>
        /// The name of your flow definition.
        /// </summary>
        [Output("flowDefinitionName")]
        public Output<string> FlowDefinitionName { get; private set; } = null!;

        /// <summary>
        /// An object containing information about the events that trigger a human workflow. See Human Loop Activation Config details below.
        /// </summary>
        [Output("humanLoopActivationConfig")]
        public Output<Outputs.FlowDefinitionHumanLoopActivationConfig?> HumanLoopActivationConfig { get; private set; } = null!;

        /// <summary>
        /// An object containing information about the tasks the human reviewers will perform. See Human Loop Config details below.
        /// </summary>
        [Output("humanLoopConfig")]
        public Output<Outputs.FlowDefinitionHumanLoopConfig> HumanLoopConfig { get; private set; } = null!;

        /// <summary>
        /// Container for configuring the source of human task requests. Use to specify if Amazon Rekognition or Amazon Textract is used as an integration source. See Human Loop Request Source details below.
        /// </summary>
        [Output("humanLoopRequestSource")]
        public Output<Outputs.FlowDefinitionHumanLoopRequestSource?> HumanLoopRequestSource { get; private set; } = null!;

        /// <summary>
        /// An object containing information about where the human review results will be uploaded. See Output Config details below.
        /// </summary>
        [Output("outputConfig")]
        public Output<Outputs.FlowDefinitionOutputConfig> OutputConfig { get; private set; } = null!;

        /// <summary>
        /// The Amazon Resource Name (ARN) of the role needed to call other services on your behalf.
        /// </summary>
        [Output("roleArn")]
        public Output<string> RoleArn { get; private set; } = null!;

        /// <summary>
        /// A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;

        /// <summary>
        /// A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        /// </summary>
        [Output("tagsAll")]
        public Output<ImmutableDictionary<string, string>> TagsAll { get; private set; } = null!;


        /// <summary>
        /// Create a FlowDefinition resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public FlowDefinition(string name, FlowDefinitionArgs args, CustomResourceOptions? options = null)
            : base("aws:sagemaker/flowDefinition:FlowDefinition", name, args ?? new FlowDefinitionArgs(), MakeResourceOptions(options, ""))
        {
        }

        private FlowDefinition(string name, Input<string> id, FlowDefinitionState? state = null, CustomResourceOptions? options = null)
            : base("aws:sagemaker/flowDefinition:FlowDefinition", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing FlowDefinition resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static FlowDefinition Get(string name, Input<string> id, FlowDefinitionState? state = null, CustomResourceOptions? options = null)
        {
            return new FlowDefinition(name, id, state, options);
        }
    }

    public sealed class FlowDefinitionArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of your flow definition.
        /// </summary>
        [Input("flowDefinitionName", required: true)]
        public Input<string> FlowDefinitionName { get; set; } = null!;

        /// <summary>
        /// An object containing information about the events that trigger a human workflow. See Human Loop Activation Config details below.
        /// </summary>
        [Input("humanLoopActivationConfig")]
        public Input<Inputs.FlowDefinitionHumanLoopActivationConfigArgs>? HumanLoopActivationConfig { get; set; }

        /// <summary>
        /// An object containing information about the tasks the human reviewers will perform. See Human Loop Config details below.
        /// </summary>
        [Input("humanLoopConfig", required: true)]
        public Input<Inputs.FlowDefinitionHumanLoopConfigArgs> HumanLoopConfig { get; set; } = null!;

        /// <summary>
        /// Container for configuring the source of human task requests. Use to specify if Amazon Rekognition or Amazon Textract is used as an integration source. See Human Loop Request Source details below.
        /// </summary>
        [Input("humanLoopRequestSource")]
        public Input<Inputs.FlowDefinitionHumanLoopRequestSourceArgs>? HumanLoopRequestSource { get; set; }

        /// <summary>
        /// An object containing information about where the human review results will be uploaded. See Output Config details below.
        /// </summary>
        [Input("outputConfig", required: true)]
        public Input<Inputs.FlowDefinitionOutputConfigArgs> OutputConfig { get; set; } = null!;

        /// <summary>
        /// The Amazon Resource Name (ARN) of the role needed to call other services on your behalf.
        /// </summary>
        [Input("roleArn", required: true)]
        public Input<string> RoleArn { get; set; } = null!;

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public FlowDefinitionArgs()
        {
        }
        public static new FlowDefinitionArgs Empty => new FlowDefinitionArgs();
    }

    public sealed class FlowDefinitionState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Amazon Resource Name (ARN) assigned by AWS to this Flow Definition.
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        /// <summary>
        /// The name of your flow definition.
        /// </summary>
        [Input("flowDefinitionName")]
        public Input<string>? FlowDefinitionName { get; set; }

        /// <summary>
        /// An object containing information about the events that trigger a human workflow. See Human Loop Activation Config details below.
        /// </summary>
        [Input("humanLoopActivationConfig")]
        public Input<Inputs.FlowDefinitionHumanLoopActivationConfigGetArgs>? HumanLoopActivationConfig { get; set; }

        /// <summary>
        /// An object containing information about the tasks the human reviewers will perform. See Human Loop Config details below.
        /// </summary>
        [Input("humanLoopConfig")]
        public Input<Inputs.FlowDefinitionHumanLoopConfigGetArgs>? HumanLoopConfig { get; set; }

        /// <summary>
        /// Container for configuring the source of human task requests. Use to specify if Amazon Rekognition or Amazon Textract is used as an integration source. See Human Loop Request Source details below.
        /// </summary>
        [Input("humanLoopRequestSource")]
        public Input<Inputs.FlowDefinitionHumanLoopRequestSourceGetArgs>? HumanLoopRequestSource { get; set; }

        /// <summary>
        /// An object containing information about where the human review results will be uploaded. See Output Config details below.
        /// </summary>
        [Input("outputConfig")]
        public Input<Inputs.FlowDefinitionOutputConfigGetArgs>? OutputConfig { get; set; }

        /// <summary>
        /// The Amazon Resource Name (ARN) of the role needed to call other services on your behalf.
        /// </summary>
        [Input("roleArn")]
        public Input<string>? RoleArn { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        [Input("tagsAll")]
        private InputMap<string>? _tagsAll;

        /// <summary>
        /// A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        /// </summary>
        [Obsolete(@"Please use `tags` instead.")]
        public InputMap<string> TagsAll
        {
            get => _tagsAll ?? (_tagsAll = new InputMap<string>());
            set => _tagsAll = value;
        }

        public FlowDefinitionState()
        {
        }
        public static new FlowDefinitionState Empty => new FlowDefinitionState();
    }
}

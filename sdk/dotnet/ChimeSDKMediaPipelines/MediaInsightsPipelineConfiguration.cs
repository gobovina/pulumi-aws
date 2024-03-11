// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.ChimeSDKMediaPipelines
{
    /// <summary>
    /// Resource for managing an AWS Chime SDK Media Pipelines Media Insights Pipeline Configuration.
    /// Consult the [Call analytics developer guide](https://docs.aws.amazon.com/chime-sdk/latest/dg/call-analytics.html) for more detailed information about usage.
    /// 
    /// ## Example Usage
    /// 
    /// ### Basic Usage
    /// 
    /// &lt;!--Start PulumiCodeChooser --&gt;
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Aws.Kinesis.Stream("example", new()
    ///     {
    ///         Name = "example",
    ///         ShardCount = 2,
    ///     });
    /// 
    ///     var mediaPipelinesAssumeRole = Aws.Iam.GetPolicyDocument.Invoke(new()
    ///     {
    ///         Statements = new[]
    ///         {
    ///             new Aws.Iam.Inputs.GetPolicyDocumentStatementInputArgs
    ///             {
    ///                 Effect = "Allow",
    ///                 Principals = new[]
    ///                 {
    ///                     new Aws.Iam.Inputs.GetPolicyDocumentStatementPrincipalInputArgs
    ///                     {
    ///                         Type = "Service",
    ///                         Identifiers = new[]
    ///                         {
    ///                             "mediapipelines.chime.amazonaws.com",
    ///                         },
    ///                     },
    ///                 },
    ///                 Actions = new[]
    ///                 {
    ///                     "sts:AssumeRole",
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    ///     var callAnalyticsRole = new Aws.Iam.Role("call_analytics_role", new()
    ///     {
    ///         Name = "CallAnalyticsRole",
    ///         AssumeRolePolicy = mediaPipelinesAssumeRole.Apply(getPolicyDocumentResult =&gt; getPolicyDocumentResult.Json),
    ///     });
    /// 
    ///     var myConfiguration = new Aws.ChimeSDKMediaPipelines.MediaInsightsPipelineConfiguration("my_configuration", new()
    ///     {
    ///         Name = "MyBasicConfiguration",
    ///         ResourceAccessRoleArn = callAnalyticsRole.Arn,
    ///         Elements = new[]
    ///         {
    ///             new Aws.ChimeSDKMediaPipelines.Inputs.MediaInsightsPipelineConfigurationElementArgs
    ///             {
    ///                 Type = "AmazonTranscribeCallAnalyticsProcessor",
    ///                 AmazonTranscribeCallAnalyticsProcessorConfiguration = new Aws.ChimeSDKMediaPipelines.Inputs.MediaInsightsPipelineConfigurationElementAmazonTranscribeCallAnalyticsProcessorConfigurationArgs
    ///                 {
    ///                     LanguageCode = "en-US",
    ///                 },
    ///             },
    ///             new Aws.ChimeSDKMediaPipelines.Inputs.MediaInsightsPipelineConfigurationElementArgs
    ///             {
    ///                 Type = "KinesisDataStreamSink",
    ///                 KinesisDataStreamSinkConfiguration = new Aws.ChimeSDKMediaPipelines.Inputs.MediaInsightsPipelineConfigurationElementKinesisDataStreamSinkConfigurationArgs
    ///                 {
    ///                     InsightsTarget = example.Arn,
    ///                 },
    ///             },
    ///         },
    ///         Tags = 
    ///         {
    ///             { "Key1", "Value1" },
    ///             { "Key2", "Value2" },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// - The required policies on `call_analytics_role` will vary based on the selected processors. See [Call analytics resource access role](https://docs.aws.amazon.com/chime-sdk/latest/dg/ca-resource-access-role.html) for directions on choosing appropriate policies.
    /// 
    /// ### Transcribe Call Analytics processor usage
    /// 
    /// &lt;!--Start PulumiCodeChooser --&gt;
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var transcribeAssumeRole = Aws.Iam.GetPolicyDocument.Invoke(new()
    ///     {
    ///         Statements = new[]
    ///         {
    ///             new Aws.Iam.Inputs.GetPolicyDocumentStatementInputArgs
    ///             {
    ///                 Effect = "Allow",
    ///                 Principals = new[]
    ///                 {
    ///                     new Aws.Iam.Inputs.GetPolicyDocumentStatementPrincipalInputArgs
    ///                     {
    ///                         Type = "Service",
    ///                         Identifiers = new[]
    ///                         {
    ///                             "transcribe.amazonaws.com",
    ///                         },
    ///                     },
    ///                 },
    ///                 Actions = new[]
    ///                 {
    ///                     "sts:AssumeRole",
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    ///     var postCallRole = new Aws.Iam.Role("post_call_role", new()
    ///     {
    ///         Name = "PostCallAccessRole",
    ///         AssumeRolePolicy = transcribeAssumeRole.Apply(getPolicyDocumentResult =&gt; getPolicyDocumentResult.Json),
    ///     });
    /// 
    ///     var myConfiguration = new Aws.ChimeSDKMediaPipelines.MediaInsightsPipelineConfiguration("my_configuration", new()
    ///     {
    ///         Name = "MyCallAnalyticsConfiguration",
    ///         ResourceAccessRoleArn = exampleAwsIamRole.Arn,
    ///         Elements = new[]
    ///         {
    ///             new Aws.ChimeSDKMediaPipelines.Inputs.MediaInsightsPipelineConfigurationElementArgs
    ///             {
    ///                 Type = "AmazonTranscribeCallAnalyticsProcessor",
    ///                 AmazonTranscribeCallAnalyticsProcessorConfiguration = new Aws.ChimeSDKMediaPipelines.Inputs.MediaInsightsPipelineConfigurationElementAmazonTranscribeCallAnalyticsProcessorConfigurationArgs
    ///                 {
    ///                     CallAnalyticsStreamCategories = new[]
    ///                     {
    ///                         "category_1",
    ///                         "category_2",
    ///                     },
    ///                     ContentRedactionType = "PII",
    ///                     EnablePartialResultsStabilization = true,
    ///                     FilterPartialResults = true,
    ///                     LanguageCode = "en-US",
    ///                     LanguageModelName = "MyLanguageModel",
    ///                     PartialResultsStability = "high",
    ///                     PiiEntityTypes = "ADDRESS,BANK_ACCOUNT_NUMBER",
    ///                     PostCallAnalyticsSettings = new Aws.ChimeSDKMediaPipelines.Inputs.MediaInsightsPipelineConfigurationElementAmazonTranscribeCallAnalyticsProcessorConfigurationPostCallAnalyticsSettingsArgs
    ///                     {
    ///                         ContentRedactionOutput = "redacted",
    ///                         DataAccessRoleArn = postCallRole.Arn,
    ///                         OutputEncryptionKmsKeyId = "MyKmsKeyId",
    ///                         OutputLocation = "s3://MyBucket",
    ///                     },
    ///                     VocabularyFilterMethod = "mask",
    ///                     VocabularyFilterName = "MyVocabularyFilter",
    ///                     VocabularyName = "MyVocabulary",
    ///                 },
    ///             },
    ///             new Aws.ChimeSDKMediaPipelines.Inputs.MediaInsightsPipelineConfigurationElementArgs
    ///             {
    ///                 Type = "KinesisDataStreamSink",
    ///                 KinesisDataStreamSinkConfiguration = new Aws.ChimeSDKMediaPipelines.Inputs.MediaInsightsPipelineConfigurationElementKinesisDataStreamSinkConfigurationArgs
    ///                 {
    ///                     InsightsTarget = example.Arn,
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ### Real time alerts usage
    /// 
    /// &lt;!--Start PulumiCodeChooser --&gt;
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var myConfiguration = new Aws.ChimeSDKMediaPipelines.MediaInsightsPipelineConfiguration("my_configuration", new()
    ///     {
    ///         Name = "MyRealTimeAlertConfiguration",
    ///         ResourceAccessRoleArn = callAnalyticsRole.Arn,
    ///         Elements = new[]
    ///         {
    ///             new Aws.ChimeSDKMediaPipelines.Inputs.MediaInsightsPipelineConfigurationElementArgs
    ///             {
    ///                 Type = "AmazonTranscribeCallAnalyticsProcessor",
    ///                 AmazonTranscribeCallAnalyticsProcessorConfiguration = new Aws.ChimeSDKMediaPipelines.Inputs.MediaInsightsPipelineConfigurationElementAmazonTranscribeCallAnalyticsProcessorConfigurationArgs
    ///                 {
    ///                     LanguageCode = "en-US",
    ///                 },
    ///             },
    ///             new Aws.ChimeSDKMediaPipelines.Inputs.MediaInsightsPipelineConfigurationElementArgs
    ///             {
    ///                 Type = "KinesisDataStreamSink",
    ///                 KinesisDataStreamSinkConfiguration = new Aws.ChimeSDKMediaPipelines.Inputs.MediaInsightsPipelineConfigurationElementKinesisDataStreamSinkConfigurationArgs
    ///                 {
    ///                     InsightsTarget = example.Arn,
    ///                 },
    ///             },
    ///         },
    ///         RealTimeAlertConfiguration = new Aws.ChimeSDKMediaPipelines.Inputs.MediaInsightsPipelineConfigurationRealTimeAlertConfigurationArgs
    ///         {
    ///             Disabled = false,
    ///             Rules = new[]
    ///             {
    ///                 new Aws.ChimeSDKMediaPipelines.Inputs.MediaInsightsPipelineConfigurationRealTimeAlertConfigurationRuleArgs
    ///                 {
    ///                     Type = "IssueDetection",
    ///                     IssueDetectionConfiguration = new Aws.ChimeSDKMediaPipelines.Inputs.MediaInsightsPipelineConfigurationRealTimeAlertConfigurationRuleIssueDetectionConfigurationArgs
    ///                     {
    ///                         RuleName = "MyIssueDetectionRule",
    ///                     },
    ///                 },
    ///                 new Aws.ChimeSDKMediaPipelines.Inputs.MediaInsightsPipelineConfigurationRealTimeAlertConfigurationRuleArgs
    ///                 {
    ///                     Type = "KeywordMatch",
    ///                     KeywordMatchConfiguration = new Aws.ChimeSDKMediaPipelines.Inputs.MediaInsightsPipelineConfigurationRealTimeAlertConfigurationRuleKeywordMatchConfigurationArgs
    ///                     {
    ///                         Keywords = new[]
    ///                         {
    ///                             "keyword1",
    ///                             "keyword2",
    ///                         },
    ///                         Negate = false,
    ///                         RuleName = "MyKeywordMatchRule",
    ///                     },
    ///                 },
    ///                 new Aws.ChimeSDKMediaPipelines.Inputs.MediaInsightsPipelineConfigurationRealTimeAlertConfigurationRuleArgs
    ///                 {
    ///                     Type = "Sentiment",
    ///                     SentimentConfiguration = new Aws.ChimeSDKMediaPipelines.Inputs.MediaInsightsPipelineConfigurationRealTimeAlertConfigurationRuleSentimentConfigurationArgs
    ///                     {
    ///                         RuleName = "MySentimentRule",
    ///                         SentimentType = "NEGATIVE",
    ///                         TimePeriod = 60,
    ///                     },
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ### Transcribe processor usage
    /// 
    /// &lt;!--Start PulumiCodeChooser --&gt;
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var myConfiguration = new Aws.ChimeSDKMediaPipelines.MediaInsightsPipelineConfiguration("my_configuration", new()
    ///     {
    ///         Name = "MyTranscribeConfiguration",
    ///         ResourceAccessRoleArn = exampleAwsIamRole.Arn,
    ///         Elements = new[]
    ///         {
    ///             new Aws.ChimeSDKMediaPipelines.Inputs.MediaInsightsPipelineConfigurationElementArgs
    ///             {
    ///                 Type = "AmazonTranscribeProcessor",
    ///                 AmazonTranscribeProcessorConfiguration = new Aws.ChimeSDKMediaPipelines.Inputs.MediaInsightsPipelineConfigurationElementAmazonTranscribeProcessorConfigurationArgs
    ///                 {
    ///                     ContentIdentificationType = "PII",
    ///                     EnablePartialResultsStabilization = true,
    ///                     FilterPartialResults = true,
    ///                     LanguageCode = "en-US",
    ///                     LanguageModelName = "MyLanguageModel",
    ///                     PartialResultsStability = "high",
    ///                     PiiEntityTypes = "ADDRESS,BANK_ACCOUNT_NUMBER",
    ///                     ShowSpeakerLabel = true,
    ///                     VocabularyFilterMethod = "mask",
    ///                     VocabularyFilterName = "MyVocabularyFilter",
    ///                     VocabularyName = "MyVocabulary",
    ///                 },
    ///             },
    ///             new Aws.ChimeSDKMediaPipelines.Inputs.MediaInsightsPipelineConfigurationElementArgs
    ///             {
    ///                 Type = "KinesisDataStreamSink",
    ///                 KinesisDataStreamSinkConfiguration = new Aws.ChimeSDKMediaPipelines.Inputs.MediaInsightsPipelineConfigurationElementKinesisDataStreamSinkConfigurationArgs
    ///                 {
    ///                     InsightsTarget = example.Arn,
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ### Voice analytics processor usage
    /// 
    /// &lt;!--Start PulumiCodeChooser --&gt;
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var myConfiguration = new Aws.ChimeSDKMediaPipelines.MediaInsightsPipelineConfiguration("my_configuration", new()
    ///     {
    ///         Name = "MyVoiceAnalyticsConfiguration",
    ///         ResourceAccessRoleArn = example.Arn,
    ///         Elements = new[]
    ///         {
    ///             new Aws.ChimeSDKMediaPipelines.Inputs.MediaInsightsPipelineConfigurationElementArgs
    ///             {
    ///                 Type = "VoiceAnalyticsProcessor",
    ///                 VoiceAnalyticsProcessorConfiguration = new Aws.ChimeSDKMediaPipelines.Inputs.MediaInsightsPipelineConfigurationElementVoiceAnalyticsProcessorConfigurationArgs
    ///                 {
    ///                     SpeakerSearchStatus = "Enabled",
    ///                     VoiceToneAnalysisStatus = "Enabled",
    ///                 },
    ///             },
    ///             new Aws.ChimeSDKMediaPipelines.Inputs.MediaInsightsPipelineConfigurationElementArgs
    ///             {
    ///                 Type = "LambdaFunctionSink",
    ///                 LambdaFunctionSinkConfiguration = new Aws.ChimeSDKMediaPipelines.Inputs.MediaInsightsPipelineConfigurationElementLambdaFunctionSinkConfigurationArgs
    ///                 {
    ///                     InsightsTarget = "arn:aws:lambda:us-west-2:1111111111:function:MyFunction",
    ///                 },
    ///             },
    ///             new Aws.ChimeSDKMediaPipelines.Inputs.MediaInsightsPipelineConfigurationElementArgs
    ///             {
    ///                 Type = "SnsTopicSink",
    ///                 SnsTopicSinkConfiguration = new Aws.ChimeSDKMediaPipelines.Inputs.MediaInsightsPipelineConfigurationElementSnsTopicSinkConfigurationArgs
    ///                 {
    ///                     InsightsTarget = "arn:aws:sns:us-west-2:1111111111:topic/MyTopic",
    ///                 },
    ///             },
    ///             new Aws.ChimeSDKMediaPipelines.Inputs.MediaInsightsPipelineConfigurationElementArgs
    ///             {
    ///                 Type = "SqsQueueSink",
    ///                 SqsQueueSinkConfiguration = new Aws.ChimeSDKMediaPipelines.Inputs.MediaInsightsPipelineConfigurationElementSqsQueueSinkConfigurationArgs
    ///                 {
    ///                     InsightsTarget = "arn:aws:sqs:us-west-2:1111111111:queue/MyQueue",
    ///                 },
    ///             },
    ///             new Aws.ChimeSDKMediaPipelines.Inputs.MediaInsightsPipelineConfigurationElementArgs
    ///             {
    ///                 Type = "KinesisDataStreamSink",
    ///                 KinesisDataStreamSinkConfiguration = new Aws.ChimeSDKMediaPipelines.Inputs.MediaInsightsPipelineConfigurationElementKinesisDataStreamSinkConfigurationArgs
    ///                 {
    ///                     InsightsTarget = test.Arn,
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ### S3 Recording sink usage
    /// 
    /// &lt;!--Start PulumiCodeChooser --&gt;
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var myConfiguration = new Aws.ChimeSDKMediaPipelines.MediaInsightsPipelineConfiguration("my_configuration", new()
    ///     {
    ///         Name = "MyS3RecordingConfiguration",
    ///         ResourceAccessRoleArn = example.Arn,
    ///         Elements = new[]
    ///         {
    ///             new Aws.ChimeSDKMediaPipelines.Inputs.MediaInsightsPipelineConfigurationElementArgs
    ///             {
    ///                 Type = "S3RecordingSink",
    ///                 S3RecordingSinkConfiguration = new Aws.ChimeSDKMediaPipelines.Inputs.MediaInsightsPipelineConfigurationElementS3RecordingSinkConfigurationArgs
    ///                 {
    ///                     Destination = "arn:aws:s3:::MyBucket",
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import Chime SDK Media Pipelines Media Insights Pipeline Configuration using the `id`. For example:
    /// 
    /// ```sh
    /// $ pulumi import aws:chimesdkmediapipelines/mediaInsightsPipelineConfiguration:MediaInsightsPipelineConfiguration example abcdef123456
    /// ```
    /// </summary>
    [AwsResourceType("aws:chimesdkmediapipelines/mediaInsightsPipelineConfiguration:MediaInsightsPipelineConfiguration")]
    public partial class MediaInsightsPipelineConfiguration : global::Pulumi.CustomResource
    {
        /// <summary>
        /// ARN of the Media Insights Pipeline Configuration.
        /// </summary>
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

        /// <summary>
        /// Collection of processors and sinks to transform media and deliver data.
        /// </summary>
        [Output("elements")]
        public Output<ImmutableArray<Outputs.MediaInsightsPipelineConfigurationElement>> Elements { get; private set; } = null!;

        /// <summary>
        /// Configuration name.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Configuration for real-time alert rules to send EventBridge notifications when certain conditions are met.
        /// </summary>
        [Output("realTimeAlertConfiguration")]
        public Output<Outputs.MediaInsightsPipelineConfigurationRealTimeAlertConfiguration?> RealTimeAlertConfiguration { get; private set; } = null!;

        /// <summary>
        /// ARN of IAM Role used by service to invoke processors and sinks specified by configuration elements.
        /// </summary>
        [Output("resourceAccessRoleArn")]
        public Output<string> ResourceAccessRoleArn { get; private set; } = null!;

        /// <summary>
        /// Key-value map of tags for the resource.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;

        [Output("tagsAll")]
        public Output<ImmutableDictionary<string, string>> TagsAll { get; private set; } = null!;


        /// <summary>
        /// Create a MediaInsightsPipelineConfiguration resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public MediaInsightsPipelineConfiguration(string name, MediaInsightsPipelineConfigurationArgs args, CustomResourceOptions? options = null)
            : base("aws:chimesdkmediapipelines/mediaInsightsPipelineConfiguration:MediaInsightsPipelineConfiguration", name, args ?? new MediaInsightsPipelineConfigurationArgs(), MakeResourceOptions(options, ""))
        {
        }

        private MediaInsightsPipelineConfiguration(string name, Input<string> id, MediaInsightsPipelineConfigurationState? state = null, CustomResourceOptions? options = null)
            : base("aws:chimesdkmediapipelines/mediaInsightsPipelineConfiguration:MediaInsightsPipelineConfiguration", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing MediaInsightsPipelineConfiguration resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static MediaInsightsPipelineConfiguration Get(string name, Input<string> id, MediaInsightsPipelineConfigurationState? state = null, CustomResourceOptions? options = null)
        {
            return new MediaInsightsPipelineConfiguration(name, id, state, options);
        }
    }

    public sealed class MediaInsightsPipelineConfigurationArgs : global::Pulumi.ResourceArgs
    {
        [Input("elements", required: true)]
        private InputList<Inputs.MediaInsightsPipelineConfigurationElementArgs>? _elements;

        /// <summary>
        /// Collection of processors and sinks to transform media and deliver data.
        /// </summary>
        public InputList<Inputs.MediaInsightsPipelineConfigurationElementArgs> Elements
        {
            get => _elements ?? (_elements = new InputList<Inputs.MediaInsightsPipelineConfigurationElementArgs>());
            set => _elements = value;
        }

        /// <summary>
        /// Configuration name.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Configuration for real-time alert rules to send EventBridge notifications when certain conditions are met.
        /// </summary>
        [Input("realTimeAlertConfiguration")]
        public Input<Inputs.MediaInsightsPipelineConfigurationRealTimeAlertConfigurationArgs>? RealTimeAlertConfiguration { get; set; }

        /// <summary>
        /// ARN of IAM Role used by service to invoke processors and sinks specified by configuration elements.
        /// </summary>
        [Input("resourceAccessRoleArn", required: true)]
        public Input<string> ResourceAccessRoleArn { get; set; } = null!;

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Key-value map of tags for the resource.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public MediaInsightsPipelineConfigurationArgs()
        {
        }
        public static new MediaInsightsPipelineConfigurationArgs Empty => new MediaInsightsPipelineConfigurationArgs();
    }

    public sealed class MediaInsightsPipelineConfigurationState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// ARN of the Media Insights Pipeline Configuration.
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        [Input("elements")]
        private InputList<Inputs.MediaInsightsPipelineConfigurationElementGetArgs>? _elements;

        /// <summary>
        /// Collection of processors and sinks to transform media and deliver data.
        /// </summary>
        public InputList<Inputs.MediaInsightsPipelineConfigurationElementGetArgs> Elements
        {
            get => _elements ?? (_elements = new InputList<Inputs.MediaInsightsPipelineConfigurationElementGetArgs>());
            set => _elements = value;
        }

        /// <summary>
        /// Configuration name.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Configuration for real-time alert rules to send EventBridge notifications when certain conditions are met.
        /// </summary>
        [Input("realTimeAlertConfiguration")]
        public Input<Inputs.MediaInsightsPipelineConfigurationRealTimeAlertConfigurationGetArgs>? RealTimeAlertConfiguration { get; set; }

        /// <summary>
        /// ARN of IAM Role used by service to invoke processors and sinks specified by configuration elements.
        /// </summary>
        [Input("resourceAccessRoleArn")]
        public Input<string>? ResourceAccessRoleArn { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Key-value map of tags for the resource.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        [Input("tagsAll")]
        private InputMap<string>? _tagsAll;
        [Obsolete(@"Please use `tags` instead.")]
        public InputMap<string> TagsAll
        {
            get => _tagsAll ?? (_tagsAll = new InputMap<string>());
            set => _tagsAll = value;
        }

        public MediaInsightsPipelineConfigurationState()
        {
        }
        public static new MediaInsightsPipelineConfigurationState Empty => new MediaInsightsPipelineConfigurationState();
    }
}

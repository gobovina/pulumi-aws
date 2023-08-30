// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.AppFlow
{
    /// <summary>
    /// Provides an AppFlow flow resource.
    /// 
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
    ///     var exampleSourceBucketV2 = new Aws.S3.BucketV2("exampleSourceBucketV2");
    /// 
    ///     var exampleSourcePolicyDocument = Aws.Iam.GetPolicyDocument.Invoke(new()
    ///     {
    ///         Statements = new[]
    ///         {
    ///             new Aws.Iam.Inputs.GetPolicyDocumentStatementInputArgs
    ///             {
    ///                 Sid = "AllowAppFlowSourceActions",
    ///                 Effect = "Allow",
    ///                 Principals = new[]
    ///                 {
    ///                     new Aws.Iam.Inputs.GetPolicyDocumentStatementPrincipalInputArgs
    ///                     {
    ///                         Type = "Service",
    ///                         Identifiers = new[]
    ///                         {
    ///                             "appflow.amazonaws.com",
    ///                         },
    ///                     },
    ///                 },
    ///                 Actions = new[]
    ///                 {
    ///                     "s3:ListBucket",
    ///                     "s3:GetObject",
    ///                 },
    ///                 Resources = new[]
    ///                 {
    ///                     "arn:aws:s3:::example_source",
    ///                     "arn:aws:s3:::example_source/*",
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    ///     var exampleSourceBucketPolicy = new Aws.S3.BucketPolicy("exampleSourceBucketPolicy", new()
    ///     {
    ///         Bucket = exampleSourceBucketV2.Id,
    ///         Policy = exampleSourcePolicyDocument.Apply(getPolicyDocumentResult =&gt; getPolicyDocumentResult.Json),
    ///     });
    /// 
    ///     var exampleBucketObjectv2 = new Aws.S3.BucketObjectv2("exampleBucketObjectv2", new()
    ///     {
    ///         Bucket = exampleSourceBucketV2.Id,
    ///         Key = "example_source.csv",
    ///         Source = new FileAsset("example_source.csv"),
    ///     });
    /// 
    ///     var exampleDestinationBucketV2 = new Aws.S3.BucketV2("exampleDestinationBucketV2");
    /// 
    ///     var exampleDestinationPolicyDocument = Aws.Iam.GetPolicyDocument.Invoke(new()
    ///     {
    ///         Statements = new[]
    ///         {
    ///             new Aws.Iam.Inputs.GetPolicyDocumentStatementInputArgs
    ///             {
    ///                 Sid = "AllowAppFlowDestinationActions",
    ///                 Effect = "Allow",
    ///                 Principals = new[]
    ///                 {
    ///                     new Aws.Iam.Inputs.GetPolicyDocumentStatementPrincipalInputArgs
    ///                     {
    ///                         Type = "Service",
    ///                         Identifiers = new[]
    ///                         {
    ///                             "appflow.amazonaws.com",
    ///                         },
    ///                     },
    ///                 },
    ///                 Actions = new[]
    ///                 {
    ///                     "s3:PutObject",
    ///                     "s3:AbortMultipartUpload",
    ///                     "s3:ListMultipartUploadParts",
    ///                     "s3:ListBucketMultipartUploads",
    ///                     "s3:GetBucketAcl",
    ///                     "s3:PutObjectAcl",
    ///                 },
    ///                 Resources = new[]
    ///                 {
    ///                     "arn:aws:s3:::example_destination",
    ///                     "arn:aws:s3:::example_destination/*",
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    ///     var exampleDestinationBucketPolicy = new Aws.S3.BucketPolicy("exampleDestinationBucketPolicy", new()
    ///     {
    ///         Bucket = exampleDestinationBucketV2.Id,
    ///         Policy = exampleDestinationPolicyDocument.Apply(getPolicyDocumentResult =&gt; getPolicyDocumentResult.Json),
    ///     });
    /// 
    ///     var exampleFlow = new Aws.AppFlow.Flow("exampleFlow", new()
    ///     {
    ///         SourceFlowConfig = new Aws.AppFlow.Inputs.FlowSourceFlowConfigArgs
    ///         {
    ///             ConnectorType = "S3",
    ///             SourceConnectorProperties = new Aws.AppFlow.Inputs.FlowSourceFlowConfigSourceConnectorPropertiesArgs
    ///             {
    ///                 S3 = new Aws.AppFlow.Inputs.FlowSourceFlowConfigSourceConnectorPropertiesS3Args
    ///                 {
    ///                     BucketName = exampleSourceBucketPolicy.Bucket,
    ///                     BucketPrefix = "example",
    ///                 },
    ///             },
    ///         },
    ///         DestinationFlowConfigs = new[]
    ///         {
    ///             new Aws.AppFlow.Inputs.FlowDestinationFlowConfigArgs
    ///             {
    ///                 ConnectorType = "S3",
    ///                 DestinationConnectorProperties = new Aws.AppFlow.Inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesArgs
    ///                 {
    ///                     S3 = new Aws.AppFlow.Inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesS3Args
    ///                     {
    ///                         BucketName = exampleDestinationBucketPolicy.Bucket,
    ///                         S3OutputFormatConfig = new Aws.AppFlow.Inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesS3S3OutputFormatConfigArgs
    ///                         {
    ///                             PrefixConfig = new Aws.AppFlow.Inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesS3S3OutputFormatConfigPrefixConfigArgs
    ///                             {
    ///                                 PrefixType = "PATH",
    ///                             },
    ///                         },
    ///                     },
    ///                 },
    ///             },
    ///         },
    ///         Tasks = new[]
    ///         {
    ///             new Aws.AppFlow.Inputs.FlowTaskArgs
    ///             {
    ///                 SourceFields = new[]
    ///                 {
    ///                     "exampleField",
    ///                 },
    ///                 DestinationField = "exampleField",
    ///                 TaskType = "Map",
    ///                 ConnectorOperators = new[]
    ///                 {
    ///                     new Aws.AppFlow.Inputs.FlowTaskConnectorOperatorArgs
    ///                     {
    ///                         S3 = "NO_OP",
    ///                     },
    ///                 },
    ///             },
    ///         },
    ///         TriggerConfig = new Aws.AppFlow.Inputs.FlowTriggerConfigArgs
    ///         {
    ///             TriggerType = "OnDemand",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import AppFlow flows using the `arn`. For example:
    /// 
    /// ```sh
    ///  $ pulumi import aws:appflow/flow:Flow example arn:aws:appflow:us-west-2:123456789012:flow/example-flow
    /// ```
    /// </summary>
    [AwsResourceType("aws:appflow/flow:Flow")]
    public partial class Flow : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Flow's ARN.
        /// </summary>
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

        /// <summary>
        /// Description of the flow you want to create.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// A Destination Flow Config that controls how Amazon AppFlow places data in the destination connector.
        /// </summary>
        [Output("destinationFlowConfigs")]
        public Output<ImmutableArray<Outputs.FlowDestinationFlowConfig>> DestinationFlowConfigs { get; private set; } = null!;

        /// <summary>
        /// ARN (Amazon Resource Name) of the Key Management Service (KMS) key you provide for encryption. This is required if you do not want to use the Amazon AppFlow-managed KMS key. If you don't provide anything here, Amazon AppFlow uses the Amazon AppFlow-managed KMS key.
        /// </summary>
        [Output("kmsArn")]
        public Output<string> KmsArn { get; private set; } = null!;

        /// <summary>
        /// Name of the flow.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The Source Flow Config that controls how Amazon AppFlow retrieves data from the source connector.
        /// </summary>
        [Output("sourceFlowConfig")]
        public Output<Outputs.FlowSourceFlowConfig> SourceFlowConfig { get; private set; } = null!;

        /// <summary>
        /// Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;

        /// <summary>
        /// Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        /// </summary>
        [Output("tagsAll")]
        public Output<ImmutableDictionary<string, string>> TagsAll { get; private set; } = null!;

        /// <summary>
        /// A Task that Amazon AppFlow performs while transferring the data in the flow run.
        /// </summary>
        [Output("tasks")]
        public Output<ImmutableArray<Outputs.FlowTask>> Tasks { get; private set; } = null!;

        /// <summary>
        /// A Trigger that determine how and when the flow runs.
        /// </summary>
        [Output("triggerConfig")]
        public Output<Outputs.FlowTriggerConfig> TriggerConfig { get; private set; } = null!;


        /// <summary>
        /// Create a Flow resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Flow(string name, FlowArgs args, CustomResourceOptions? options = null)
            : base("aws:appflow/flow:Flow", name, args ?? new FlowArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Flow(string name, Input<string> id, FlowState? state = null, CustomResourceOptions? options = null)
            : base("aws:appflow/flow:Flow", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Flow resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Flow Get(string name, Input<string> id, FlowState? state = null, CustomResourceOptions? options = null)
        {
            return new Flow(name, id, state, options);
        }
    }

    public sealed class FlowArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Description of the flow you want to create.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("destinationFlowConfigs", required: true)]
        private InputList<Inputs.FlowDestinationFlowConfigArgs>? _destinationFlowConfigs;

        /// <summary>
        /// A Destination Flow Config that controls how Amazon AppFlow places data in the destination connector.
        /// </summary>
        public InputList<Inputs.FlowDestinationFlowConfigArgs> DestinationFlowConfigs
        {
            get => _destinationFlowConfigs ?? (_destinationFlowConfigs = new InputList<Inputs.FlowDestinationFlowConfigArgs>());
            set => _destinationFlowConfigs = value;
        }

        /// <summary>
        /// ARN (Amazon Resource Name) of the Key Management Service (KMS) key you provide for encryption. This is required if you do not want to use the Amazon AppFlow-managed KMS key. If you don't provide anything here, Amazon AppFlow uses the Amazon AppFlow-managed KMS key.
        /// </summary>
        [Input("kmsArn")]
        public Input<string>? KmsArn { get; set; }

        /// <summary>
        /// Name of the flow.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The Source Flow Config that controls how Amazon AppFlow retrieves data from the source connector.
        /// </summary>
        [Input("sourceFlowConfig", required: true)]
        public Input<Inputs.FlowSourceFlowConfigArgs> SourceFlowConfig { get; set; } = null!;

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        [Input("tasks", required: true)]
        private InputList<Inputs.FlowTaskArgs>? _tasks;

        /// <summary>
        /// A Task that Amazon AppFlow performs while transferring the data in the flow run.
        /// </summary>
        public InputList<Inputs.FlowTaskArgs> Tasks
        {
            get => _tasks ?? (_tasks = new InputList<Inputs.FlowTaskArgs>());
            set => _tasks = value;
        }

        /// <summary>
        /// A Trigger that determine how and when the flow runs.
        /// </summary>
        [Input("triggerConfig", required: true)]
        public Input<Inputs.FlowTriggerConfigArgs> TriggerConfig { get; set; } = null!;

        public FlowArgs()
        {
        }
        public static new FlowArgs Empty => new FlowArgs();
    }

    public sealed class FlowState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Flow's ARN.
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        /// <summary>
        /// Description of the flow you want to create.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("destinationFlowConfigs")]
        private InputList<Inputs.FlowDestinationFlowConfigGetArgs>? _destinationFlowConfigs;

        /// <summary>
        /// A Destination Flow Config that controls how Amazon AppFlow places data in the destination connector.
        /// </summary>
        public InputList<Inputs.FlowDestinationFlowConfigGetArgs> DestinationFlowConfigs
        {
            get => _destinationFlowConfigs ?? (_destinationFlowConfigs = new InputList<Inputs.FlowDestinationFlowConfigGetArgs>());
            set => _destinationFlowConfigs = value;
        }

        /// <summary>
        /// ARN (Amazon Resource Name) of the Key Management Service (KMS) key you provide for encryption. This is required if you do not want to use the Amazon AppFlow-managed KMS key. If you don't provide anything here, Amazon AppFlow uses the Amazon AppFlow-managed KMS key.
        /// </summary>
        [Input("kmsArn")]
        public Input<string>? KmsArn { get; set; }

        /// <summary>
        /// Name of the flow.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The Source Flow Config that controls how Amazon AppFlow retrieves data from the source connector.
        /// </summary>
        [Input("sourceFlowConfig")]
        public Input<Inputs.FlowSourceFlowConfigGetArgs>? SourceFlowConfig { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
        public InputMap<string> TagsAll
        {
            get => _tagsAll ?? (_tagsAll = new InputMap<string>());
            set => _tagsAll = value;
        }

        [Input("tasks")]
        private InputList<Inputs.FlowTaskGetArgs>? _tasks;

        /// <summary>
        /// A Task that Amazon AppFlow performs while transferring the data in the flow run.
        /// </summary>
        public InputList<Inputs.FlowTaskGetArgs> Tasks
        {
            get => _tasks ?? (_tasks = new InputList<Inputs.FlowTaskGetArgs>());
            set => _tasks = value;
        }

        /// <summary>
        /// A Trigger that determine how and when the flow runs.
        /// </summary>
        [Input("triggerConfig")]
        public Input<Inputs.FlowTriggerConfigGetArgs>? TriggerConfig { get; set; }

        public FlowState()
        {
        }
        public static new FlowState Empty => new FlowState();
    }
}

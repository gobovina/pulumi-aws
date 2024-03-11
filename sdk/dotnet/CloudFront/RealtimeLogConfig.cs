// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.CloudFront
{
    /// <summary>
    /// Provides a CloudFront real-time log configuration resource.
    /// 
    /// ## Example Usage
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
    ///     var assumeRole = Aws.Iam.GetPolicyDocument.Invoke(new()
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
    ///                             "cloudfront.amazonaws.com",
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
    ///     var exampleRole = new Aws.Iam.Role("example", new()
    ///     {
    ///         Name = "cloudfront-realtime-log-config-example",
    ///         AssumeRolePolicy = assumeRole.Apply(getPolicyDocumentResult =&gt; getPolicyDocumentResult.Json),
    ///     });
    /// 
    ///     var example = Aws.Iam.GetPolicyDocument.Invoke(new()
    ///     {
    ///         Statements = new[]
    ///         {
    ///             new Aws.Iam.Inputs.GetPolicyDocumentStatementInputArgs
    ///             {
    ///                 Effect = "Allow",
    ///                 Actions = new[]
    ///                 {
    ///                     "kinesis:DescribeStreamSummary",
    ///                     "kinesis:DescribeStream",
    ///                     "kinesis:PutRecord",
    ///                     "kinesis:PutRecords",
    ///                 },
    ///                 Resources = new[]
    ///                 {
    ///                     exampleAwsKinesisStream.Arn,
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    ///     var exampleRolePolicy = new Aws.Iam.RolePolicy("example", new()
    ///     {
    ///         Name = "cloudfront-realtime-log-config-example",
    ///         Role = exampleRole.Id,
    ///         Policy = example.Apply(getPolicyDocumentResult =&gt; getPolicyDocumentResult.Json),
    ///     });
    /// 
    ///     var exampleRealtimeLogConfig = new Aws.CloudFront.RealtimeLogConfig("example", new()
    ///     {
    ///         Name = "example",
    ///         SamplingRate = 75,
    ///         Fields = new[]
    ///         {
    ///             "timestamp",
    ///             "c-ip",
    ///         },
    ///         Endpoint = new Aws.CloudFront.Inputs.RealtimeLogConfigEndpointArgs
    ///         {
    ///             StreamType = "Kinesis",
    ///             KinesisStreamConfig = new Aws.CloudFront.Inputs.RealtimeLogConfigEndpointKinesisStreamConfigArgs
    ///             {
    ///                 RoleArn = exampleRole.Arn,
    ///                 StreamArn = exampleAwsKinesisStream.Arn,
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
    /// Using `pulumi import`, import CloudFront real-time log configurations using the ARN. For example:
    /// 
    /// ```sh
    /// $ pulumi import aws:cloudfront/realtimeLogConfig:RealtimeLogConfig example arn:aws:cloudfront::111122223333:realtime-log-config/ExampleNameForRealtimeLogConfig
    /// ```
    /// </summary>
    [AwsResourceType("aws:cloudfront/realtimeLogConfig:RealtimeLogConfig")]
    public partial class RealtimeLogConfig : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The ARN (Amazon Resource Name) of the CloudFront real-time log configuration.
        /// </summary>
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

        /// <summary>
        /// The Amazon Kinesis data streams where real-time log data is sent.
        /// </summary>
        [Output("endpoint")]
        public Output<Outputs.RealtimeLogConfigEndpoint> Endpoint { get; private set; } = null!;

        /// <summary>
        /// The fields that are included in each real-time log record. See the [AWS documentation](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/real-time-logs.html#understand-real-time-log-config-fields) for supported values.
        /// </summary>
        [Output("fields")]
        public Output<ImmutableArray<string>> Fields { get; private set; } = null!;

        /// <summary>
        /// The unique name to identify this real-time log configuration.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The sampling rate for this real-time log configuration. The sampling rate determines the percentage of viewer requests that are represented in the real-time log data. An integer between `1` and `100`, inclusive.
        /// </summary>
        [Output("samplingRate")]
        public Output<int> SamplingRate { get; private set; } = null!;


        /// <summary>
        /// Create a RealtimeLogConfig resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public RealtimeLogConfig(string name, RealtimeLogConfigArgs args, CustomResourceOptions? options = null)
            : base("aws:cloudfront/realtimeLogConfig:RealtimeLogConfig", name, args ?? new RealtimeLogConfigArgs(), MakeResourceOptions(options, ""))
        {
        }

        private RealtimeLogConfig(string name, Input<string> id, RealtimeLogConfigState? state = null, CustomResourceOptions? options = null)
            : base("aws:cloudfront/realtimeLogConfig:RealtimeLogConfig", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing RealtimeLogConfig resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static RealtimeLogConfig Get(string name, Input<string> id, RealtimeLogConfigState? state = null, CustomResourceOptions? options = null)
        {
            return new RealtimeLogConfig(name, id, state, options);
        }
    }

    public sealed class RealtimeLogConfigArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Amazon Kinesis data streams where real-time log data is sent.
        /// </summary>
        [Input("endpoint", required: true)]
        public Input<Inputs.RealtimeLogConfigEndpointArgs> Endpoint { get; set; } = null!;

        [Input("fields", required: true)]
        private InputList<string>? _fields;

        /// <summary>
        /// The fields that are included in each real-time log record. See the [AWS documentation](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/real-time-logs.html#understand-real-time-log-config-fields) for supported values.
        /// </summary>
        public InputList<string> Fields
        {
            get => _fields ?? (_fields = new InputList<string>());
            set => _fields = value;
        }

        /// <summary>
        /// The unique name to identify this real-time log configuration.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The sampling rate for this real-time log configuration. The sampling rate determines the percentage of viewer requests that are represented in the real-time log data. An integer between `1` and `100`, inclusive.
        /// </summary>
        [Input("samplingRate", required: true)]
        public Input<int> SamplingRate { get; set; } = null!;

        public RealtimeLogConfigArgs()
        {
        }
        public static new RealtimeLogConfigArgs Empty => new RealtimeLogConfigArgs();
    }

    public sealed class RealtimeLogConfigState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ARN (Amazon Resource Name) of the CloudFront real-time log configuration.
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        /// <summary>
        /// The Amazon Kinesis data streams where real-time log data is sent.
        /// </summary>
        [Input("endpoint")]
        public Input<Inputs.RealtimeLogConfigEndpointGetArgs>? Endpoint { get; set; }

        [Input("fields")]
        private InputList<string>? _fields;

        /// <summary>
        /// The fields that are included in each real-time log record. See the [AWS documentation](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/real-time-logs.html#understand-real-time-log-config-fields) for supported values.
        /// </summary>
        public InputList<string> Fields
        {
            get => _fields ?? (_fields = new InputList<string>());
            set => _fields = value;
        }

        /// <summary>
        /// The unique name to identify this real-time log configuration.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The sampling rate for this real-time log configuration. The sampling rate determines the percentage of viewer requests that are represented in the real-time log data. An integer between `1` and `100`, inclusive.
        /// </summary>
        [Input("samplingRate")]
        public Input<int>? SamplingRate { get; set; }

        public RealtimeLogConfigState()
        {
        }
        public static new RealtimeLogConfigState Empty => new RealtimeLogConfigState();
    }
}

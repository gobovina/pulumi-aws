// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.VerifiedAccess
{
    /// <summary>
    /// Resource for managing a Verified Access Logging Configuration.
    /// 
    /// ## Example Usage
    /// ### With CloudWatch Logging
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Aws.VerifiedAccess.InstanceLoggingConfiguration("example", new()
    ///     {
    ///         AccessLogs = new Aws.VerifiedAccess.Inputs.InstanceLoggingConfigurationAccessLogsArgs
    ///         {
    ///             CloudwatchLogs = new Aws.VerifiedAccess.Inputs.InstanceLoggingConfigurationAccessLogsCloudwatchLogsArgs
    ///             {
    ///                 Enabled = true,
    ///                 LogGroup = exampleAwsCloudwatchLogGroup.Id,
    ///             },
    ///         },
    ///         VerifiedaccessInstanceId = exampleAwsVerifiedaccessInstance.Id,
    ///     });
    /// 
    /// });
    /// ```
    /// ### With Kinesis Data Firehose Logging
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Aws.VerifiedAccess.InstanceLoggingConfiguration("example", new()
    ///     {
    ///         AccessLogs = new Aws.VerifiedAccess.Inputs.InstanceLoggingConfigurationAccessLogsArgs
    ///         {
    ///             KinesisDataFirehose = new Aws.VerifiedAccess.Inputs.InstanceLoggingConfigurationAccessLogsKinesisDataFirehoseArgs
    ///             {
    ///                 DeliveryStream = exampleAwsKinesisFirehoseDeliveryStream.Name,
    ///                 Enabled = true,
    ///             },
    ///         },
    ///         VerifiedaccessInstanceId = exampleAwsVerifiedaccessInstance.Id,
    ///     });
    /// 
    /// });
    /// ```
    /// ### With S3 logging
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Aws.VerifiedAccess.InstanceLoggingConfiguration("example", new()
    ///     {
    ///         AccessLogs = new Aws.VerifiedAccess.Inputs.InstanceLoggingConfigurationAccessLogsArgs
    ///         {
    ///             S3 = new Aws.VerifiedAccess.Inputs.InstanceLoggingConfigurationAccessLogsS3Args
    ///             {
    ///                 BucketName = exampleAwsS3Bucket.Id,
    ///                 Enabled = true,
    ///                 Prefix = "example",
    ///             },
    ///         },
    ///         VerifiedaccessInstanceId = exampleAwsVerifiedaccessInstance.Id,
    ///     });
    /// 
    /// });
    /// ```
    /// ### With all three logging options
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Aws.VerifiedAccess.InstanceLoggingConfiguration("example", new()
    ///     {
    ///         AccessLogs = new Aws.VerifiedAccess.Inputs.InstanceLoggingConfigurationAccessLogsArgs
    ///         {
    ///             CloudwatchLogs = new Aws.VerifiedAccess.Inputs.InstanceLoggingConfigurationAccessLogsCloudwatchLogsArgs
    ///             {
    ///                 Enabled = true,
    ///                 LogGroup = exampleAwsCloudwatchLogGroup.Id,
    ///             },
    ///             KinesisDataFirehose = new Aws.VerifiedAccess.Inputs.InstanceLoggingConfigurationAccessLogsKinesisDataFirehoseArgs
    ///             {
    ///                 DeliveryStream = exampleAwsKinesisFirehoseDeliveryStream.Name,
    ///                 Enabled = true,
    ///             },
    ///             S3 = new Aws.VerifiedAccess.Inputs.InstanceLoggingConfigurationAccessLogsS3Args
    ///             {
    ///                 BucketName = exampleAwsS3Bucket.Id,
    ///                 Enabled = true,
    ///             },
    ///         },
    ///         VerifiedaccessInstanceId = exampleAwsVerifiedaccessInstance.Id,
    ///     });
    /// 
    /// });
    /// ```
    /// ### With `include_trust_context`
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Aws.VerifiedAccess.InstanceLoggingConfiguration("example", new()
    ///     {
    ///         AccessLogs = new Aws.VerifiedAccess.Inputs.InstanceLoggingConfigurationAccessLogsArgs
    ///         {
    ///             IncludeTrustContext = true,
    ///         },
    ///         VerifiedaccessInstanceId = exampleAwsVerifiedaccessInstance.Id,
    ///     });
    /// 
    /// });
    /// ```
    /// ### With `log_version`
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Aws.VerifiedAccess.InstanceLoggingConfiguration("example", new()
    ///     {
    ///         AccessLogs = new Aws.VerifiedAccess.Inputs.InstanceLoggingConfigurationAccessLogsArgs
    ///         {
    ///             LogVersion = "ocsf-1.0.0-rc.2",
    ///         },
    ///         VerifiedaccessInstanceId = exampleAwsVerifiedaccessInstance.Id,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import Verified Access Logging Configuration using the Verified Access Instance `id`. For example:
    /// 
    /// ```sh
    ///  $ pulumi import aws:verifiedaccess/instanceLoggingConfiguration:InstanceLoggingConfiguration example vai-1234567890abcdef0
    /// ```
    /// </summary>
    [AwsResourceType("aws:verifiedaccess/instanceLoggingConfiguration:InstanceLoggingConfiguration")]
    public partial class InstanceLoggingConfiguration : global::Pulumi.CustomResource
    {
        /// <summary>
        /// A block that specifies the configuration options for Verified Access instances. Detailed below.
        /// </summary>
        [Output("accessLogs")]
        public Output<Outputs.InstanceLoggingConfigurationAccessLogs> AccessLogs { get; private set; } = null!;

        /// <summary>
        /// The ID of the Verified Access instance.
        /// </summary>
        [Output("verifiedaccessInstanceId")]
        public Output<string> VerifiedaccessInstanceId { get; private set; } = null!;


        /// <summary>
        /// Create a InstanceLoggingConfiguration resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public InstanceLoggingConfiguration(string name, InstanceLoggingConfigurationArgs args, CustomResourceOptions? options = null)
            : base("aws:verifiedaccess/instanceLoggingConfiguration:InstanceLoggingConfiguration", name, args ?? new InstanceLoggingConfigurationArgs(), MakeResourceOptions(options, ""))
        {
        }

        private InstanceLoggingConfiguration(string name, Input<string> id, InstanceLoggingConfigurationState? state = null, CustomResourceOptions? options = null)
            : base("aws:verifiedaccess/instanceLoggingConfiguration:InstanceLoggingConfiguration", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing InstanceLoggingConfiguration resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static InstanceLoggingConfiguration Get(string name, Input<string> id, InstanceLoggingConfigurationState? state = null, CustomResourceOptions? options = null)
        {
            return new InstanceLoggingConfiguration(name, id, state, options);
        }
    }

    public sealed class InstanceLoggingConfigurationArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A block that specifies the configuration options for Verified Access instances. Detailed below.
        /// </summary>
        [Input("accessLogs", required: true)]
        public Input<Inputs.InstanceLoggingConfigurationAccessLogsArgs> AccessLogs { get; set; } = null!;

        /// <summary>
        /// The ID of the Verified Access instance.
        /// </summary>
        [Input("verifiedaccessInstanceId", required: true)]
        public Input<string> VerifiedaccessInstanceId { get; set; } = null!;

        public InstanceLoggingConfigurationArgs()
        {
        }
        public static new InstanceLoggingConfigurationArgs Empty => new InstanceLoggingConfigurationArgs();
    }

    public sealed class InstanceLoggingConfigurationState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A block that specifies the configuration options for Verified Access instances. Detailed below.
        /// </summary>
        [Input("accessLogs")]
        public Input<Inputs.InstanceLoggingConfigurationAccessLogsGetArgs>? AccessLogs { get; set; }

        /// <summary>
        /// The ID of the Verified Access instance.
        /// </summary>
        [Input("verifiedaccessInstanceId")]
        public Input<string>? VerifiedaccessInstanceId { get; set; }

        public InstanceLoggingConfigurationState()
        {
        }
        public static new InstanceLoggingConfigurationState Empty => new InstanceLoggingConfigurationState();
    }
}

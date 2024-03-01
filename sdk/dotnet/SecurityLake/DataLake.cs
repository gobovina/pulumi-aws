// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.SecurityLake
{
    /// <summary>
    /// Resource for managing an AWS Security Lake Data Lake.
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
    ///     var example = new Aws.SecurityLake.DataLake("example", new()
    ///     {
    ///         MetaStoreManagerRoleArn = metaStoreManager.Arn,
    ///         Configuration = new Aws.SecurityLake.Inputs.DataLakeConfigurationArgs
    ///         {
    ///             Region = "eu-west-1",
    ///             EncryptionConfigurations = new[]
    ///             {
    ///                 new Aws.SecurityLake.Inputs.DataLakeConfigurationEncryptionConfigurationArgs
    ///                 {
    ///                     KmsKeyId = "S3_MANAGED_KEY",
    ///                 },
    ///             },
    ///             LifecycleConfiguration = new Aws.SecurityLake.Inputs.DataLakeConfigurationLifecycleConfigurationArgs
    ///             {
    ///                 Transitions = new[]
    ///                 {
    ///                     new Aws.SecurityLake.Inputs.DataLakeConfigurationLifecycleConfigurationTransitionArgs
    ///                     {
    ///                         Days = 31,
    ///                         StorageClass = "STANDARD_IA",
    ///                     },
    ///                     new Aws.SecurityLake.Inputs.DataLakeConfigurationLifecycleConfigurationTransitionArgs
    ///                     {
    ///                         Days = 80,
    ///                         StorageClass = "ONEZONE_IA",
    ///                     },
    ///                 },
    ///                 Expiration = new Aws.SecurityLake.Inputs.DataLakeConfigurationLifecycleConfigurationExpirationArgs
    ///                 {
    ///                     Days = 300,
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
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
    ///     var example = new Aws.SecurityLake.DataLake("example", new()
    ///     {
    ///         MetaStoreManagerRoleArn = metaStoreManager.Arn,
    ///         Configuration = new Aws.SecurityLake.Inputs.DataLakeConfigurationArgs
    ///         {
    ///             Region = "eu-west-1",
    ///             EncryptionConfigurations = new[]
    ///             {
    ///                 new Aws.SecurityLake.Inputs.DataLakeConfigurationEncryptionConfigurationArgs
    ///                 {
    ///                     KmsKeyId = "S3_MANAGED_KEY",
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import Security Hub standards subscriptions using the standards subscription ARN. For example:
    /// 
    /// ```sh
    ///  $ pulumi import aws:securitylake/dataLake:DataLake example arn:aws:securitylake:eu-west-1:123456789012:data-lake/default
    /// ```
    /// </summary>
    [AwsResourceType("aws:securitylake/dataLake:DataLake")]
    public partial class DataLake : global::Pulumi.CustomResource
    {
        /// <summary>
        /// ARN of the Data Lake.
        /// </summary>
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

        /// <summary>
        /// Specify the Region or Regions that will contribute data to the rollup region.
        /// </summary>
        [Output("configuration")]
        public Output<Outputs.DataLakeConfiguration?> Configuration { get; private set; } = null!;

        /// <summary>
        /// The Amazon Resource Name (ARN) used to create and update the AWS Glue table. This table contains partitions generated by the ingestion and normalization of AWS log sources and custom sources.
        /// </summary>
        [Output("metaStoreManagerRoleArn")]
        public Output<string> MetaStoreManagerRoleArn { get; private set; } = null!;

        /// <summary>
        /// The ARN for the Amazon Security Lake Amazon S3 bucket.
        /// </summary>
        [Output("s3BucketArn")]
        public Output<string> S3BucketArn { get; private set; } = null!;

        /// <summary>
        /// Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;

        /// <summary>
        /// A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        /// </summary>
        [Output("tagsAll")]
        public Output<ImmutableDictionary<string, string>> TagsAll { get; private set; } = null!;

        [Output("timeouts")]
        public Output<Outputs.DataLakeTimeouts?> Timeouts { get; private set; } = null!;


        /// <summary>
        /// Create a DataLake resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public DataLake(string name, DataLakeArgs args, CustomResourceOptions? options = null)
            : base("aws:securitylake/dataLake:DataLake", name, args ?? new DataLakeArgs(), MakeResourceOptions(options, ""))
        {
        }

        private DataLake(string name, Input<string> id, DataLakeState? state = null, CustomResourceOptions? options = null)
            : base("aws:securitylake/dataLake:DataLake", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing DataLake resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static DataLake Get(string name, Input<string> id, DataLakeState? state = null, CustomResourceOptions? options = null)
        {
            return new DataLake(name, id, state, options);
        }
    }

    public sealed class DataLakeArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specify the Region or Regions that will contribute data to the rollup region.
        /// </summary>
        [Input("configuration")]
        public Input<Inputs.DataLakeConfigurationArgs>? Configuration { get; set; }

        /// <summary>
        /// The Amazon Resource Name (ARN) used to create and update the AWS Glue table. This table contains partitions generated by the ingestion and normalization of AWS log sources and custom sources.
        /// </summary>
        [Input("metaStoreManagerRoleArn", required: true)]
        public Input<string> MetaStoreManagerRoleArn { get; set; } = null!;

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        [Input("timeouts")]
        public Input<Inputs.DataLakeTimeoutsArgs>? Timeouts { get; set; }

        public DataLakeArgs()
        {
        }
        public static new DataLakeArgs Empty => new DataLakeArgs();
    }

    public sealed class DataLakeState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// ARN of the Data Lake.
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        /// <summary>
        /// Specify the Region or Regions that will contribute data to the rollup region.
        /// </summary>
        [Input("configuration")]
        public Input<Inputs.DataLakeConfigurationGetArgs>? Configuration { get; set; }

        /// <summary>
        /// The Amazon Resource Name (ARN) used to create and update the AWS Glue table. This table contains partitions generated by the ingestion and normalization of AWS log sources and custom sources.
        /// </summary>
        [Input("metaStoreManagerRoleArn")]
        public Input<string>? MetaStoreManagerRoleArn { get; set; }

        /// <summary>
        /// The ARN for the Amazon Security Lake Amazon S3 bucket.
        /// </summary>
        [Input("s3BucketArn")]
        public Input<string>? S3BucketArn { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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

        [Input("timeouts")]
        public Input<Inputs.DataLakeTimeoutsGetArgs>? Timeouts { get; set; }

        public DataLakeState()
        {
        }
        public static new DataLakeState Empty => new DataLakeState();
    }
}

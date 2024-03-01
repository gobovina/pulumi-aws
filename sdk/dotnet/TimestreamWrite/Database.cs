// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.TimestreamWrite
{
    /// <summary>
    /// Provides a Timestream database resource.
    /// 
    /// ## Example Usage
    /// ### Basic usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Aws.TimestreamWrite.Database("example", new()
    ///     {
    ///         DatabaseName = "database-example",
    ///     });
    /// 
    /// });
    /// ```
    /// ### Full usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Aws.TimestreamWrite.Database("example", new()
    ///     {
    ///         DatabaseName = "database-example",
    ///         KmsKeyId = exampleAwsKmsKey.Arn,
    ///         Tags = 
    ///         {
    ///             { "Name", "value" },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import Timestream databases using the `database_name`. For example:
    /// 
    /// ```sh
    ///  $ pulumi import aws:timestreamwrite/database:Database example example
    /// ```
    /// </summary>
    [AwsResourceType("aws:timestreamwrite/database:Database")]
    public partial class Database : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The ARN that uniquely identifies this database.
        /// </summary>
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

        /// <summary>
        /// The name of the Timestream database. Minimum length of 3. Maximum length of 64.
        /// </summary>
        [Output("databaseName")]
        public Output<string> DatabaseName { get; private set; } = null!;

        /// <summary>
        /// The ARN (not Alias ARN) of the KMS key to be used to encrypt the data stored in the database. If the KMS key is not specified, the database will be encrypted with a Timestream managed KMS key located in your account. Refer to [AWS managed KMS keys](https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#aws-managed-cmk) for more info.
        /// </summary>
        [Output("kmsKeyId")]
        public Output<string> KmsKeyId { get; private set; } = null!;

        /// <summary>
        /// The total number of tables found within the Timestream database.
        /// </summary>
        [Output("tableCount")]
        public Output<int> TableCount { get; private set; } = null!;

        /// <summary>
        /// Map of tags to assign to this resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;

        /// <summary>
        /// A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        /// </summary>
        [Output("tagsAll")]
        public Output<ImmutableDictionary<string, string>> TagsAll { get; private set; } = null!;


        /// <summary>
        /// Create a Database resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Database(string name, DatabaseArgs args, CustomResourceOptions? options = null)
            : base("aws:timestreamwrite/database:Database", name, args ?? new DatabaseArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Database(string name, Input<string> id, DatabaseState? state = null, CustomResourceOptions? options = null)
            : base("aws:timestreamwrite/database:Database", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Database resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Database Get(string name, Input<string> id, DatabaseState? state = null, CustomResourceOptions? options = null)
        {
            return new Database(name, id, state, options);
        }
    }

    public sealed class DatabaseArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the Timestream database. Minimum length of 3. Maximum length of 64.
        /// </summary>
        [Input("databaseName", required: true)]
        public Input<string> DatabaseName { get; set; } = null!;

        /// <summary>
        /// The ARN (not Alias ARN) of the KMS key to be used to encrypt the data stored in the database. If the KMS key is not specified, the database will be encrypted with a Timestream managed KMS key located in your account. Refer to [AWS managed KMS keys](https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#aws-managed-cmk) for more info.
        /// </summary>
        [Input("kmsKeyId")]
        public Input<string>? KmsKeyId { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Map of tags to assign to this resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public DatabaseArgs()
        {
        }
        public static new DatabaseArgs Empty => new DatabaseArgs();
    }

    public sealed class DatabaseState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ARN that uniquely identifies this database.
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        /// <summary>
        /// The name of the Timestream database. Minimum length of 3. Maximum length of 64.
        /// </summary>
        [Input("databaseName")]
        public Input<string>? DatabaseName { get; set; }

        /// <summary>
        /// The ARN (not Alias ARN) of the KMS key to be used to encrypt the data stored in the database. If the KMS key is not specified, the database will be encrypted with a Timestream managed KMS key located in your account. Refer to [AWS managed KMS keys](https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#aws-managed-cmk) for more info.
        /// </summary>
        [Input("kmsKeyId")]
        public Input<string>? KmsKeyId { get; set; }

        /// <summary>
        /// The total number of tables found within the Timestream database.
        /// </summary>
        [Input("tableCount")]
        public Input<int>? TableCount { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Map of tags to assign to this resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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

        public DatabaseState()
        {
        }
        public static new DatabaseState Empty => new DatabaseState();
    }
}

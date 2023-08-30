// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.FinSpace
{
    /// <summary>
    /// Resource for managing an AWS FinSpace Kx Database.
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
    ///     var exampleKey = new Aws.Kms.Key("exampleKey", new()
    ///     {
    ///         Description = "Example KMS Key",
    ///         DeletionWindowInDays = 7,
    ///     });
    /// 
    ///     var exampleKxEnvironment = new Aws.FinSpace.KxEnvironment("exampleKxEnvironment", new()
    ///     {
    ///         KmsKeyId = exampleKey.Arn,
    ///     });
    /// 
    ///     var exampleKxDatabase = new Aws.FinSpace.KxDatabase("exampleKxDatabase", new()
    ///     {
    ///         EnvironmentId = exampleKxEnvironment.Id,
    ///         Description = "Example database description",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import an AWS FinSpace Kx Database using the `id` (environment ID and database name, comma-delimited). For example:
    /// 
    /// ```sh
    ///  $ pulumi import aws:finspace/kxDatabase:KxDatabase example n3ceo7wqxoxcti5tujqwzs,my-tf-kx-database
    /// ```
    /// </summary>
    [AwsResourceType("aws:finspace/kxDatabase:KxDatabase")]
    public partial class KxDatabase : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Amazon Resource Name (ARN) identifier of the KX database.
        /// </summary>
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

        /// <summary>
        /// Timestamp at which the databse is created in FinSpace. Value determined as epoch time in seconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000.
        /// </summary>
        [Output("createdTimestamp")]
        public Output<string> CreatedTimestamp { get; private set; } = null!;

        /// <summary>
        /// Description of the KX database.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// Unique identifier for the KX environment.
        /// </summary>
        [Output("environmentId")]
        public Output<string> EnvironmentId { get; private set; } = null!;

        /// <summary>
        /// Last timestamp at which the database was updated in FinSpace. Value determined as epoch time in seconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000.
        /// </summary>
        [Output("lastModifiedTimestamp")]
        public Output<string> LastModifiedTimestamp { get; private set; } = null!;

        /// <summary>
        /// Name of the KX database.
        /// 
        /// The following arguments are optional:
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

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
        /// Create a KxDatabase resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public KxDatabase(string name, KxDatabaseArgs args, CustomResourceOptions? options = null)
            : base("aws:finspace/kxDatabase:KxDatabase", name, args ?? new KxDatabaseArgs(), MakeResourceOptions(options, ""))
        {
        }

        private KxDatabase(string name, Input<string> id, KxDatabaseState? state = null, CustomResourceOptions? options = null)
            : base("aws:finspace/kxDatabase:KxDatabase", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing KxDatabase resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static KxDatabase Get(string name, Input<string> id, KxDatabaseState? state = null, CustomResourceOptions? options = null)
        {
            return new KxDatabase(name, id, state, options);
        }
    }

    public sealed class KxDatabaseArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Description of the KX database.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Unique identifier for the KX environment.
        /// </summary>
        [Input("environmentId", required: true)]
        public Input<string> EnvironmentId { get; set; } = null!;

        /// <summary>
        /// Name of the KX database.
        /// 
        /// The following arguments are optional:
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

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

        public KxDatabaseArgs()
        {
        }
        public static new KxDatabaseArgs Empty => new KxDatabaseArgs();
    }

    public sealed class KxDatabaseState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Amazon Resource Name (ARN) identifier of the KX database.
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        /// <summary>
        /// Timestamp at which the databse is created in FinSpace. Value determined as epoch time in seconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000.
        /// </summary>
        [Input("createdTimestamp")]
        public Input<string>? CreatedTimestamp { get; set; }

        /// <summary>
        /// Description of the KX database.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Unique identifier for the KX environment.
        /// </summary>
        [Input("environmentId")]
        public Input<string>? EnvironmentId { get; set; }

        /// <summary>
        /// Last timestamp at which the database was updated in FinSpace. Value determined as epoch time in seconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000.
        /// </summary>
        [Input("lastModifiedTimestamp")]
        public Input<string>? LastModifiedTimestamp { get; set; }

        /// <summary>
        /// Name of the KX database.
        /// 
        /// The following arguments are optional:
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

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

        public KxDatabaseState()
        {
        }
        public static new KxDatabaseState Empty => new KxDatabaseState();
    }
}

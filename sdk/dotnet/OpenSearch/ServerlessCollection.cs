// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.OpenSearch
{
    /// <summary>
    /// Resource for managing an AWS OpenSearch Serverless Collection.
    /// 
    /// &gt; **NOTE:** An `aws.opensearch.ServerlessCollection` cannot be created without having an applicable encryption security policy. Use the `depends_on` meta-argument to define this dependency.
    /// 
    /// &gt; **NOTE:** An `aws.opensearch.ServerlessCollection` is not accessible without configuring an applicable network security policy. Data cannot be accessed without configuring an applicable data access policy.
    /// 
    /// ## Example Usage
    /// 
    /// ### Basic Usage
    /// 
    /// &lt;!--Start PulumiCodeChooser --&gt;
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using System.Text.Json;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Aws.OpenSearch.ServerlessSecurityPolicy("example", new()
    ///     {
    ///         Name = "example",
    ///         Type = "encryption",
    ///         Policy = JsonSerializer.Serialize(new Dictionary&lt;string, object?&gt;
    ///         {
    ///             ["Rules"] = new[]
    ///             {
    ///                 new Dictionary&lt;string, object?&gt;
    ///                 {
    ///                     ["Resource"] = new[]
    ///                     {
    ///                         "collection/example",
    ///                     },
    ///                     ["ResourceType"] = "collection",
    ///                 },
    ///             },
    ///             ["AWSOwnedKey"] = true,
    ///         }),
    ///     });
    /// 
    ///     var exampleServerlessCollection = new Aws.OpenSearch.ServerlessCollection("example", new()
    ///     {
    ///         Name = "example",
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import OpenSearchServerless Collection using the `id`. For example:
    /// 
    /// ```sh
    /// $ pulumi import aws:opensearch/serverlessCollection:ServerlessCollection example example
    /// ```
    /// </summary>
    [AwsResourceType("aws:opensearch/serverlessCollection:ServerlessCollection")]
    public partial class ServerlessCollection : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Amazon Resource Name (ARN) of the collection.
        /// </summary>
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

        /// <summary>
        /// Collection-specific endpoint used to submit index, search, and data upload requests to an OpenSearch Serverless collection.
        /// </summary>
        [Output("collectionEndpoint")]
        public Output<string> CollectionEndpoint { get; private set; } = null!;

        /// <summary>
        /// Collection-specific endpoint used to access OpenSearch Dashboards.
        /// </summary>
        [Output("dashboardEndpoint")]
        public Output<string> DashboardEndpoint { get; private set; } = null!;

        /// <summary>
        /// Description of the collection.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// The ARN of the Amazon Web Services KMS key used to encrypt the collection.
        /// </summary>
        [Output("kmsKeyArn")]
        public Output<string> KmsKeyArn { get; private set; } = null!;

        /// <summary>
        /// Name of the collection.
        /// 
        /// The following arguments are optional:
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Indicates whether standby replicas should be used for a collection. One of `ENABLED` or `DISABLED`. Defaults to `ENABLED`.
        /// </summary>
        [Output("standbyReplicas")]
        public Output<string> StandbyReplicas { get; private set; } = null!;

        /// <summary>
        /// A map of tags to assign to the collection. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;

        [Output("tagsAll")]
        public Output<ImmutableDictionary<string, string>> TagsAll { get; private set; } = null!;

        [Output("timeouts")]
        public Output<Outputs.ServerlessCollectionTimeouts?> Timeouts { get; private set; } = null!;

        /// <summary>
        /// Type of collection. One of `SEARCH`, `TIMESERIES`, or `VECTORSEARCH`. Defaults to `TIMESERIES`.
        /// </summary>
        [Output("type")]
        public Output<string> Type { get; private set; } = null!;


        /// <summary>
        /// Create a ServerlessCollection resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ServerlessCollection(string name, ServerlessCollectionArgs? args = null, CustomResourceOptions? options = null)
            : base("aws:opensearch/serverlessCollection:ServerlessCollection", name, args ?? new ServerlessCollectionArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ServerlessCollection(string name, Input<string> id, ServerlessCollectionState? state = null, CustomResourceOptions? options = null)
            : base("aws:opensearch/serverlessCollection:ServerlessCollection", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ServerlessCollection resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ServerlessCollection Get(string name, Input<string> id, ServerlessCollectionState? state = null, CustomResourceOptions? options = null)
        {
            return new ServerlessCollection(name, id, state, options);
        }
    }

    public sealed class ServerlessCollectionArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Description of the collection.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Name of the collection.
        /// 
        /// The following arguments are optional:
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Indicates whether standby replicas should be used for a collection. One of `ENABLED` or `DISABLED`. Defaults to `ENABLED`.
        /// </summary>
        [Input("standbyReplicas")]
        public Input<string>? StandbyReplicas { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A map of tags to assign to the collection. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        [Input("timeouts")]
        public Input<Inputs.ServerlessCollectionTimeoutsArgs>? Timeouts { get; set; }

        /// <summary>
        /// Type of collection. One of `SEARCH`, `TIMESERIES`, or `VECTORSEARCH`. Defaults to `TIMESERIES`.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public ServerlessCollectionArgs()
        {
        }
        public static new ServerlessCollectionArgs Empty => new ServerlessCollectionArgs();
    }

    public sealed class ServerlessCollectionState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Amazon Resource Name (ARN) of the collection.
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        /// <summary>
        /// Collection-specific endpoint used to submit index, search, and data upload requests to an OpenSearch Serverless collection.
        /// </summary>
        [Input("collectionEndpoint")]
        public Input<string>? CollectionEndpoint { get; set; }

        /// <summary>
        /// Collection-specific endpoint used to access OpenSearch Dashboards.
        /// </summary>
        [Input("dashboardEndpoint")]
        public Input<string>? DashboardEndpoint { get; set; }

        /// <summary>
        /// Description of the collection.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The ARN of the Amazon Web Services KMS key used to encrypt the collection.
        /// </summary>
        [Input("kmsKeyArn")]
        public Input<string>? KmsKeyArn { get; set; }

        /// <summary>
        /// Name of the collection.
        /// 
        /// The following arguments are optional:
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Indicates whether standby replicas should be used for a collection. One of `ENABLED` or `DISABLED`. Defaults to `ENABLED`.
        /// </summary>
        [Input("standbyReplicas")]
        public Input<string>? StandbyReplicas { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A map of tags to assign to the collection. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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

        [Input("timeouts")]
        public Input<Inputs.ServerlessCollectionTimeoutsGetArgs>? Timeouts { get; set; }

        /// <summary>
        /// Type of collection. One of `SEARCH`, `TIMESERIES`, or `VECTORSEARCH`. Defaults to `TIMESERIES`.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public ServerlessCollectionState()
        {
        }
        public static new ServerlessCollectionState Empty => new ServerlessCollectionState();
    }
}

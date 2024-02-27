// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Athena
{
    /// <summary>
    /// Provides an Athena data catalog.
    /// 
    /// More information about Athena and Athena data catalogs can be found in the [Athena User Guide](https://docs.aws.amazon.com/athena/latest/ug/what-is.html).
    /// 
    /// &gt; **Tip:** for a more detailed explanation on the usage of `parameters`, see the [DataCatalog API documentation](https://docs.aws.amazon.com/athena/latest/APIReference/API_DataCatalog.html)
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
    ///     var example = new Aws.Athena.DataCatalog("example", new()
    ///     {
    ///         Description = "Example Athena data catalog",
    ///         Parameters = 
    ///         {
    ///             { "function", "arn:aws:lambda:eu-central-1:123456789012:function:not-important-lambda-function" },
    ///         },
    ///         Tags = 
    ///         {
    ///             { "Name", "example-athena-data-catalog" },
    ///         },
    ///         Type = "LAMBDA",
    ///     });
    /// 
    /// });
    /// ```
    /// ### Hive based Data Catalog
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Aws.Athena.DataCatalog("example", new()
    ///     {
    ///         Description = "Hive based Data Catalog",
    ///         Parameters = 
    ///         {
    ///             { "metadata-function", "arn:aws:lambda:eu-central-1:123456789012:function:not-important-lambda-function" },
    ///         },
    ///         Type = "HIVE",
    ///     });
    /// 
    /// });
    /// ```
    /// ### Glue based Data Catalog
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Aws.Athena.DataCatalog("example", new()
    ///     {
    ///         Description = "Glue based Data Catalog",
    ///         Parameters = 
    ///         {
    ///             { "catalog-id", "123456789012" },
    ///         },
    ///         Type = "GLUE",
    ///     });
    /// 
    /// });
    /// ```
    /// ### Lambda based Data Catalog
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Aws.Athena.DataCatalog("example", new()
    ///     {
    ///         Description = "Lambda based Data Catalog",
    ///         Parameters = 
    ///         {
    ///             { "metadata-function", "arn:aws:lambda:eu-central-1:123456789012:function:not-important-lambda-function-1" },
    ///             { "record-function", "arn:aws:lambda:eu-central-1:123456789012:function:not-important-lambda-function-2" },
    ///         },
    ///         Type = "LAMBDA",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import data catalogs using their `name`. For example:
    /// 
    /// ```sh
    ///  $ pulumi import aws:athena/dataCatalog:DataCatalog example example-data-catalog
    /// ```
    /// </summary>
    [AwsResourceType("aws:athena/dataCatalog:DataCatalog")]
    public partial class DataCatalog : global::Pulumi.CustomResource
    {
        /// <summary>
        /// ARN of the data catalog.
        /// </summary>
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

        /// <summary>
        /// Description of the data catalog.
        /// </summary>
        [Output("description")]
        public Output<string> Description { get; private set; } = null!;

        /// <summary>
        /// Name of the data catalog. The catalog name must be unique for the AWS account and can use a maximum of 128 alphanumeric, underscore, at sign, or hyphen characters.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Key value pairs that specifies the Lambda function or functions to use for the data catalog. The mapping used depends on the catalog type.
        /// </summary>
        [Output("parameters")]
        public Output<ImmutableDictionary<string, string>> Parameters { get; private set; } = null!;

        /// <summary>
        /// Map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;

        /// <summary>
        /// Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        /// </summary>
        [Output("tagsAll")]
        public Output<ImmutableDictionary<string, string>> TagsAll { get; private set; } = null!;

        /// <summary>
        /// Type of data catalog: `LAMBDA` for a federated catalog, `GLUE` for AWS Glue Catalog, or `HIVE` for an external hive metastore.
        /// </summary>
        [Output("type")]
        public Output<string> Type { get; private set; } = null!;


        /// <summary>
        /// Create a DataCatalog resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public DataCatalog(string name, DataCatalogArgs args, CustomResourceOptions? options = null)
            : base("aws:athena/dataCatalog:DataCatalog", name, args ?? new DataCatalogArgs(), MakeResourceOptions(options, ""))
        {
        }

        private DataCatalog(string name, Input<string> id, DataCatalogState? state = null, CustomResourceOptions? options = null)
            : base("aws:athena/dataCatalog:DataCatalog", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing DataCatalog resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static DataCatalog Get(string name, Input<string> id, DataCatalogState? state = null, CustomResourceOptions? options = null)
        {
            return new DataCatalog(name, id, state, options);
        }
    }

    public sealed class DataCatalogArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Description of the data catalog.
        /// </summary>
        [Input("description", required: true)]
        public Input<string> Description { get; set; } = null!;

        /// <summary>
        /// Name of the data catalog. The catalog name must be unique for the AWS account and can use a maximum of 128 alphanumeric, underscore, at sign, or hyphen characters.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("parameters", required: true)]
        private InputMap<string>? _parameters;

        /// <summary>
        /// Key value pairs that specifies the Lambda function or functions to use for the data catalog. The mapping used depends on the catalog type.
        /// </summary>
        public InputMap<string> Parameters
        {
            get => _parameters ?? (_parameters = new InputMap<string>());
            set => _parameters = value;
        }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        /// <summary>
        /// Type of data catalog: `LAMBDA` for a federated catalog, `GLUE` for AWS Glue Catalog, or `HIVE` for an external hive metastore.
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public DataCatalogArgs()
        {
        }
        public static new DataCatalogArgs Empty => new DataCatalogArgs();
    }

    public sealed class DataCatalogState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// ARN of the data catalog.
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        /// <summary>
        /// Description of the data catalog.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Name of the data catalog. The catalog name must be unique for the AWS account and can use a maximum of 128 alphanumeric, underscore, at sign, or hyphen characters.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("parameters")]
        private InputMap<string>? _parameters;

        /// <summary>
        /// Key value pairs that specifies the Lambda function or functions to use for the data catalog. The mapping used depends on the catalog type.
        /// </summary>
        public InputMap<string> Parameters
        {
            get => _parameters ?? (_parameters = new InputMap<string>());
            set => _parameters = value;
        }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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

        /// <summary>
        /// Type of data catalog: `LAMBDA` for a federated catalog, `GLUE` for AWS Glue Catalog, or `HIVE` for an external hive metastore.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public DataCatalogState()
        {
        }
        public static new DataCatalogState Empty => new DataCatalogState();
    }
}

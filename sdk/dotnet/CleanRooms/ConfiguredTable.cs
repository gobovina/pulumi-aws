// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.CleanRooms
{
    /// <summary>
    /// Provides a AWS Clean Rooms configured table. Configured tables are used to represent references to existing tables in the AWS Glue Data Catalog.
    /// 
    /// ## Example Usage
    /// ### Configured table with tags
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var testConfiguredTable = new Aws.CleanRooms.ConfiguredTable("test_configured_table", new()
    ///     {
    ///         Name = "pulumi-example-table",
    ///         Description = "I made this table with Pulumi!",
    ///         AnalysisMethod = "DIRECT_QUERY",
    ///         AllowedColumns = new[]
    ///         {
    ///             "column1",
    ///             "column2",
    ///             "column3",
    ///         },
    ///         TableReference = new Aws.CleanRooms.Inputs.ConfiguredTableTableReferenceArgs
    ///         {
    ///             DatabaseName = "example_database",
    ///             TableName = "example_table",
    ///         },
    ///         Tags = 
    ///         {
    ///             { "Project", "Pulumi" },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import `aws_cleanrooms_configured_table` using the `id`. For example:
    /// 
    /// ```sh
    ///  $ pulumi import aws:cleanrooms/configuredTable:ConfiguredTable table 1234abcd-12ab-34cd-56ef-1234567890ab
    /// ```
    /// </summary>
    [AwsResourceType("aws:cleanrooms/configuredTable:ConfiguredTable")]
    public partial class ConfiguredTable : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The columns of the references table which will be included in the configured table.
        /// </summary>
        [Output("allowedColumns")]
        public Output<ImmutableArray<string>> AllowedColumns { get; private set; } = null!;

        /// <summary>
        /// The analysis method for the configured table. The only valid value is currently `DIRECT_QUERY`.
        /// </summary>
        [Output("analysisMethod")]
        public Output<string> AnalysisMethod { get; private set; } = null!;

        /// <summary>
        /// The ARN of the configured table.
        /// </summary>
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

        /// <summary>
        /// The date and time the configured table was created.
        /// </summary>
        [Output("createTime")]
        public Output<string> CreateTime { get; private set; } = null!;

        /// <summary>
        /// A description for the configured table.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// The name of the configured table.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// A reference to the AWS Glue table which will be used to create the configured table.
        /// * `table_reference.database_name` - (Required - Forces new resource) - The name of the AWS Glue database which contains the table.
        /// * `table_reference.table_name` - (Required - Forces new resource) - The name of the AWS Glue table which will be used to create the configured table.
        /// </summary>
        [Output("tableReference")]
        public Output<Outputs.ConfiguredTableTableReference> TableReference { get; private set; } = null!;

        /// <summary>
        /// Key value pairs which tag the configured table.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;

        [Output("tagsAll")]
        public Output<ImmutableDictionary<string, string>> TagsAll { get; private set; } = null!;

        /// <summary>
        /// The date and time the configured table was last updated.
        /// </summary>
        [Output("updateTime")]
        public Output<string> UpdateTime { get; private set; } = null!;


        /// <summary>
        /// Create a ConfiguredTable resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ConfiguredTable(string name, ConfiguredTableArgs args, CustomResourceOptions? options = null)
            : base("aws:cleanrooms/configuredTable:ConfiguredTable", name, args ?? new ConfiguredTableArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ConfiguredTable(string name, Input<string> id, ConfiguredTableState? state = null, CustomResourceOptions? options = null)
            : base("aws:cleanrooms/configuredTable:ConfiguredTable", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ConfiguredTable resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ConfiguredTable Get(string name, Input<string> id, ConfiguredTableState? state = null, CustomResourceOptions? options = null)
        {
            return new ConfiguredTable(name, id, state, options);
        }
    }

    public sealed class ConfiguredTableArgs : global::Pulumi.ResourceArgs
    {
        [Input("allowedColumns", required: true)]
        private InputList<string>? _allowedColumns;

        /// <summary>
        /// The columns of the references table which will be included in the configured table.
        /// </summary>
        public InputList<string> AllowedColumns
        {
            get => _allowedColumns ?? (_allowedColumns = new InputList<string>());
            set => _allowedColumns = value;
        }

        /// <summary>
        /// The analysis method for the configured table. The only valid value is currently `DIRECT_QUERY`.
        /// </summary>
        [Input("analysisMethod", required: true)]
        public Input<string> AnalysisMethod { get; set; } = null!;

        /// <summary>
        /// A description for the configured table.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The name of the configured table.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// A reference to the AWS Glue table which will be used to create the configured table.
        /// * `table_reference.database_name` - (Required - Forces new resource) - The name of the AWS Glue database which contains the table.
        /// * `table_reference.table_name` - (Required - Forces new resource) - The name of the AWS Glue table which will be used to create the configured table.
        /// </summary>
        [Input("tableReference", required: true)]
        public Input<Inputs.ConfiguredTableTableReferenceArgs> TableReference { get; set; } = null!;

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Key value pairs which tag the configured table.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public ConfiguredTableArgs()
        {
        }
        public static new ConfiguredTableArgs Empty => new ConfiguredTableArgs();
    }

    public sealed class ConfiguredTableState : global::Pulumi.ResourceArgs
    {
        [Input("allowedColumns")]
        private InputList<string>? _allowedColumns;

        /// <summary>
        /// The columns of the references table which will be included in the configured table.
        /// </summary>
        public InputList<string> AllowedColumns
        {
            get => _allowedColumns ?? (_allowedColumns = new InputList<string>());
            set => _allowedColumns = value;
        }

        /// <summary>
        /// The analysis method for the configured table. The only valid value is currently `DIRECT_QUERY`.
        /// </summary>
        [Input("analysisMethod")]
        public Input<string>? AnalysisMethod { get; set; }

        /// <summary>
        /// The ARN of the configured table.
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        /// <summary>
        /// The date and time the configured table was created.
        /// </summary>
        [Input("createTime")]
        public Input<string>? CreateTime { get; set; }

        /// <summary>
        /// A description for the configured table.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The name of the configured table.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// A reference to the AWS Glue table which will be used to create the configured table.
        /// * `table_reference.database_name` - (Required - Forces new resource) - The name of the AWS Glue database which contains the table.
        /// * `table_reference.table_name` - (Required - Forces new resource) - The name of the AWS Glue table which will be used to create the configured table.
        /// </summary>
        [Input("tableReference")]
        public Input<Inputs.ConfiguredTableTableReferenceGetArgs>? TableReference { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Key value pairs which tag the configured table.
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

        /// <summary>
        /// The date and time the configured table was last updated.
        /// </summary>
        [Input("updateTime")]
        public Input<string>? UpdateTime { get; set; }

        public ConfiguredTableState()
        {
        }
        public static new ConfiguredTableState Empty => new ConfiguredTableState();
    }
}

// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Keyspaces
{
    /// <summary>
    /// Provides a Keyspaces Table.
    /// 
    /// More information about Keyspaces tables can be found in the [Keyspaces Developer Guide](https://docs.aws.amazon.com/keyspaces/latest/devguide/working-with-tables.html).
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
    ///     var example = new Aws.Keyspaces.Table("example", new()
    ///     {
    ///         KeyspaceName = exampleAwsKeyspacesKeyspace.Name,
    ///         TableName = "my_table",
    ///         SchemaDefinition = new Aws.Keyspaces.Inputs.TableSchemaDefinitionArgs
    ///         {
    ///             Columns = new[]
    ///             {
    ///                 new Aws.Keyspaces.Inputs.TableSchemaDefinitionColumnArgs
    ///                 {
    ///                     Name = "Message",
    ///                     Type = "ASCII",
    ///                 },
    ///             },
    ///             PartitionKeys = new[]
    ///             {
    ///                 new Aws.Keyspaces.Inputs.TableSchemaDefinitionPartitionKeyArgs
    ///                 {
    ///                     Name = "Message",
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
    /// Using `pulumi import`, import a table using the `keyspace_name` and `table_name` separated by `/`. For example:
    /// 
    /// ```sh
    /// $ pulumi import aws:keyspaces/table:Table example my_keyspace/my_table
    /// ```
    /// </summary>
    [AwsResourceType("aws:keyspaces/table:Table")]
    public partial class Table : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The ARN of the table.
        /// </summary>
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

        /// <summary>
        /// Specifies the read/write throughput capacity mode for the table.
        /// </summary>
        [Output("capacitySpecification")]
        public Output<Outputs.TableCapacitySpecification> CapacitySpecification { get; private set; } = null!;

        /// <summary>
        /// Enables client-side timestamps for the table. By default, the setting is disabled.
        /// </summary>
        [Output("clientSideTimestamps")]
        public Output<Outputs.TableClientSideTimestamps?> ClientSideTimestamps { get; private set; } = null!;

        /// <summary>
        /// A description of the table.
        /// </summary>
        [Output("comment")]
        public Output<Outputs.TableComment> Comment { get; private set; } = null!;

        /// <summary>
        /// The default Time to Live setting in seconds for the table. More information can be found in the [Developer Guide](https://docs.aws.amazon.com/keyspaces/latest/devguide/TTL-how-it-works.html#ttl-howitworks_default_ttl).
        /// </summary>
        [Output("defaultTimeToLive")]
        public Output<int?> DefaultTimeToLive { get; private set; } = null!;

        /// <summary>
        /// Specifies how the encryption key for encryption at rest is managed for the table. More information can be found in the [Developer Guide](https://docs.aws.amazon.com/keyspaces/latest/devguide/EncryptionAtRest.html).
        /// </summary>
        [Output("encryptionSpecification")]
        public Output<Outputs.TableEncryptionSpecification> EncryptionSpecification { get; private set; } = null!;

        /// <summary>
        /// The name of the keyspace that the table is going to be created in.
        /// </summary>
        [Output("keyspaceName")]
        public Output<string> KeyspaceName { get; private set; } = null!;

        /// <summary>
        /// Specifies if point-in-time recovery is enabled or disabled for the table. More information can be found in the [Developer Guide](https://docs.aws.amazon.com/keyspaces/latest/devguide/PointInTimeRecovery.html).
        /// </summary>
        [Output("pointInTimeRecovery")]
        public Output<Outputs.TablePointInTimeRecovery> PointInTimeRecovery { get; private set; } = null!;

        /// <summary>
        /// Describes the schema of the table.
        /// </summary>
        [Output("schemaDefinition")]
        public Output<Outputs.TableSchemaDefinition> SchemaDefinition { get; private set; } = null!;

        /// <summary>
        /// The name of the table.
        /// 
        /// The following arguments are optional:
        /// </summary>
        [Output("tableName")]
        public Output<string> TableName { get; private set; } = null!;

        /// <summary>
        /// A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;

        /// <summary>
        /// A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        /// </summary>
        [Output("tagsAll")]
        public Output<ImmutableDictionary<string, string>> TagsAll { get; private set; } = null!;

        /// <summary>
        /// Enables Time to Live custom settings for the table. More information can be found in the [Developer Guide](https://docs.aws.amazon.com/keyspaces/latest/devguide/TTL.html).
        /// </summary>
        [Output("ttl")]
        public Output<Outputs.TableTtl?> Ttl { get; private set; } = null!;


        /// <summary>
        /// Create a Table resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Table(string name, TableArgs args, CustomResourceOptions? options = null)
            : base("aws:keyspaces/table:Table", name, args ?? new TableArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Table(string name, Input<string> id, TableState? state = null, CustomResourceOptions? options = null)
            : base("aws:keyspaces/table:Table", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Table resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Table Get(string name, Input<string> id, TableState? state = null, CustomResourceOptions? options = null)
        {
            return new Table(name, id, state, options);
        }
    }

    public sealed class TableArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies the read/write throughput capacity mode for the table.
        /// </summary>
        [Input("capacitySpecification")]
        public Input<Inputs.TableCapacitySpecificationArgs>? CapacitySpecification { get; set; }

        /// <summary>
        /// Enables client-side timestamps for the table. By default, the setting is disabled.
        /// </summary>
        [Input("clientSideTimestamps")]
        public Input<Inputs.TableClientSideTimestampsArgs>? ClientSideTimestamps { get; set; }

        /// <summary>
        /// A description of the table.
        /// </summary>
        [Input("comment")]
        public Input<Inputs.TableCommentArgs>? Comment { get; set; }

        /// <summary>
        /// The default Time to Live setting in seconds for the table. More information can be found in the [Developer Guide](https://docs.aws.amazon.com/keyspaces/latest/devguide/TTL-how-it-works.html#ttl-howitworks_default_ttl).
        /// </summary>
        [Input("defaultTimeToLive")]
        public Input<int>? DefaultTimeToLive { get; set; }

        /// <summary>
        /// Specifies how the encryption key for encryption at rest is managed for the table. More information can be found in the [Developer Guide](https://docs.aws.amazon.com/keyspaces/latest/devguide/EncryptionAtRest.html).
        /// </summary>
        [Input("encryptionSpecification")]
        public Input<Inputs.TableEncryptionSpecificationArgs>? EncryptionSpecification { get; set; }

        /// <summary>
        /// The name of the keyspace that the table is going to be created in.
        /// </summary>
        [Input("keyspaceName", required: true)]
        public Input<string> KeyspaceName { get; set; } = null!;

        /// <summary>
        /// Specifies if point-in-time recovery is enabled or disabled for the table. More information can be found in the [Developer Guide](https://docs.aws.amazon.com/keyspaces/latest/devguide/PointInTimeRecovery.html).
        /// </summary>
        [Input("pointInTimeRecovery")]
        public Input<Inputs.TablePointInTimeRecoveryArgs>? PointInTimeRecovery { get; set; }

        /// <summary>
        /// Describes the schema of the table.
        /// </summary>
        [Input("schemaDefinition", required: true)]
        public Input<Inputs.TableSchemaDefinitionArgs> SchemaDefinition { get; set; } = null!;

        /// <summary>
        /// The name of the table.
        /// 
        /// The following arguments are optional:
        /// </summary>
        [Input("tableName", required: true)]
        public Input<string> TableName { get; set; } = null!;

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        /// <summary>
        /// Enables Time to Live custom settings for the table. More information can be found in the [Developer Guide](https://docs.aws.amazon.com/keyspaces/latest/devguide/TTL.html).
        /// </summary>
        [Input("ttl")]
        public Input<Inputs.TableTtlArgs>? Ttl { get; set; }

        public TableArgs()
        {
        }
        public static new TableArgs Empty => new TableArgs();
    }

    public sealed class TableState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ARN of the table.
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        /// <summary>
        /// Specifies the read/write throughput capacity mode for the table.
        /// </summary>
        [Input("capacitySpecification")]
        public Input<Inputs.TableCapacitySpecificationGetArgs>? CapacitySpecification { get; set; }

        /// <summary>
        /// Enables client-side timestamps for the table. By default, the setting is disabled.
        /// </summary>
        [Input("clientSideTimestamps")]
        public Input<Inputs.TableClientSideTimestampsGetArgs>? ClientSideTimestamps { get; set; }

        /// <summary>
        /// A description of the table.
        /// </summary>
        [Input("comment")]
        public Input<Inputs.TableCommentGetArgs>? Comment { get; set; }

        /// <summary>
        /// The default Time to Live setting in seconds for the table. More information can be found in the [Developer Guide](https://docs.aws.amazon.com/keyspaces/latest/devguide/TTL-how-it-works.html#ttl-howitworks_default_ttl).
        /// </summary>
        [Input("defaultTimeToLive")]
        public Input<int>? DefaultTimeToLive { get; set; }

        /// <summary>
        /// Specifies how the encryption key for encryption at rest is managed for the table. More information can be found in the [Developer Guide](https://docs.aws.amazon.com/keyspaces/latest/devguide/EncryptionAtRest.html).
        /// </summary>
        [Input("encryptionSpecification")]
        public Input<Inputs.TableEncryptionSpecificationGetArgs>? EncryptionSpecification { get; set; }

        /// <summary>
        /// The name of the keyspace that the table is going to be created in.
        /// </summary>
        [Input("keyspaceName")]
        public Input<string>? KeyspaceName { get; set; }

        /// <summary>
        /// Specifies if point-in-time recovery is enabled or disabled for the table. More information can be found in the [Developer Guide](https://docs.aws.amazon.com/keyspaces/latest/devguide/PointInTimeRecovery.html).
        /// </summary>
        [Input("pointInTimeRecovery")]
        public Input<Inputs.TablePointInTimeRecoveryGetArgs>? PointInTimeRecovery { get; set; }

        /// <summary>
        /// Describes the schema of the table.
        /// </summary>
        [Input("schemaDefinition")]
        public Input<Inputs.TableSchemaDefinitionGetArgs>? SchemaDefinition { get; set; }

        /// <summary>
        /// The name of the table.
        /// 
        /// The following arguments are optional:
        /// </summary>
        [Input("tableName")]
        public Input<string>? TableName { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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

        /// <summary>
        /// Enables Time to Live custom settings for the table. More information can be found in the [Developer Guide](https://docs.aws.amazon.com/keyspaces/latest/devguide/TTL.html).
        /// </summary>
        [Input("ttl")]
        public Input<Inputs.TableTtlGetArgs>? Ttl { get; set; }

        public TableState()
        {
        }
        public static new TableState Empty => new TableState();
    }
}

// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Quicksight
{
    /// <summary>
    /// Resource for managing a QuickSight Data Set.
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
    ///     var example = new Aws.Quicksight.DataSet("example", new()
    ///     {
    ///         DataSetId = "example-id",
    ///         Name = "example-name",
    ///         ImportMode = "SPICE",
    ///         PhysicalTableMaps = new[]
    ///         {
    ///             new Aws.Quicksight.Inputs.DataSetPhysicalTableMapArgs
    ///             {
    ///                 PhysicalTableMapId = "example-id",
    ///                 S3Source = new Aws.Quicksight.Inputs.DataSetPhysicalTableMapS3SourceArgs
    ///                 {
    ///                     DataSourceArn = exampleAwsQuicksightDataSource.Arn,
    ///                     InputColumns = new[]
    ///                     {
    ///                         new Aws.Quicksight.Inputs.DataSetPhysicalTableMapS3SourceInputColumnArgs
    ///                         {
    ///                             Name = "Column1",
    ///                             Type = "STRING",
    ///                         },
    ///                     },
    ///                     UploadSettings = new Aws.Quicksight.Inputs.DataSetPhysicalTableMapS3SourceUploadSettingsArgs
    ///                     {
    ///                         Format = "JSON",
    ///                     },
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// ### With Column Level Permission Rules
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Aws.Quicksight.DataSet("example", new()
    ///     {
    ///         DataSetId = "example-id",
    ///         Name = "example-name",
    ///         ImportMode = "SPICE",
    ///         PhysicalTableMaps = new[]
    ///         {
    ///             new Aws.Quicksight.Inputs.DataSetPhysicalTableMapArgs
    ///             {
    ///                 PhysicalTableMapId = "example-id",
    ///                 S3Source = new Aws.Quicksight.Inputs.DataSetPhysicalTableMapS3SourceArgs
    ///                 {
    ///                     DataSourceArn = exampleAwsQuicksightDataSource.Arn,
    ///                     InputColumns = new[]
    ///                     {
    ///                         new Aws.Quicksight.Inputs.DataSetPhysicalTableMapS3SourceInputColumnArgs
    ///                         {
    ///                             Name = "Column1",
    ///                             Type = "STRING",
    ///                         },
    ///                     },
    ///                     UploadSettings = new Aws.Quicksight.Inputs.DataSetPhysicalTableMapS3SourceUploadSettingsArgs
    ///                     {
    ///                         Format = "JSON",
    ///                     },
    ///                 },
    ///             },
    ///         },
    ///         ColumnLevelPermissionRules = new[]
    ///         {
    ///             new Aws.Quicksight.Inputs.DataSetColumnLevelPermissionRuleArgs
    ///             {
    ///                 ColumnNames = new[]
    ///                 {
    ///                     "Column1",
    ///                 },
    ///                 Principals = new[]
    ///                 {
    ///                     exampleAwsQuicksightUser.Arn,
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// ### With Field Folders
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Aws.Quicksight.DataSet("example", new()
    ///     {
    ///         DataSetId = "example-id",
    ///         Name = "example-name",
    ///         ImportMode = "SPICE",
    ///         PhysicalTableMaps = new[]
    ///         {
    ///             new Aws.Quicksight.Inputs.DataSetPhysicalTableMapArgs
    ///             {
    ///                 PhysicalTableMapId = "example-id",
    ///                 S3Source = new Aws.Quicksight.Inputs.DataSetPhysicalTableMapS3SourceArgs
    ///                 {
    ///                     DataSourceArn = exampleAwsQuicksightDataSource.Arn,
    ///                     InputColumns = new[]
    ///                     {
    ///                         new Aws.Quicksight.Inputs.DataSetPhysicalTableMapS3SourceInputColumnArgs
    ///                         {
    ///                             Name = "Column1",
    ///                             Type = "STRING",
    ///                         },
    ///                     },
    ///                     UploadSettings = new Aws.Quicksight.Inputs.DataSetPhysicalTableMapS3SourceUploadSettingsArgs
    ///                     {
    ///                         Format = "JSON",
    ///                     },
    ///                 },
    ///             },
    ///         },
    ///         FieldFolders = new[]
    ///         {
    ///             new Aws.Quicksight.Inputs.DataSetFieldFolderArgs
    ///             {
    ///                 FieldFoldersId = "example-id",
    ///                 Columns = new[]
    ///                 {
    ///                     "Column1",
    ///                 },
    ///                 Description = "example description",
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// ### With Permissions
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Aws.Quicksight.DataSet("example", new()
    ///     {
    ///         DataSetId = "example-id",
    ///         Name = "example-name",
    ///         ImportMode = "SPICE",
    ///         PhysicalTableMaps = new[]
    ///         {
    ///             new Aws.Quicksight.Inputs.DataSetPhysicalTableMapArgs
    ///             {
    ///                 PhysicalTableMapId = "example-id",
    ///                 S3Source = new Aws.Quicksight.Inputs.DataSetPhysicalTableMapS3SourceArgs
    ///                 {
    ///                     DataSourceArn = exampleAwsQuicksightDataSource.Arn,
    ///                     InputColumns = new[]
    ///                     {
    ///                         new Aws.Quicksight.Inputs.DataSetPhysicalTableMapS3SourceInputColumnArgs
    ///                         {
    ///                             Name = "Column1",
    ///                             Type = "STRING",
    ///                         },
    ///                     },
    ///                     UploadSettings = new Aws.Quicksight.Inputs.DataSetPhysicalTableMapS3SourceUploadSettingsArgs
    ///                     {
    ///                         Format = "JSON",
    ///                     },
    ///                 },
    ///             },
    ///         },
    ///         Permissions = new[]
    ///         {
    ///             new Aws.Quicksight.Inputs.DataSetPermissionArgs
    ///             {
    ///                 Actions = new[]
    ///                 {
    ///                     "quicksight:DescribeDataSet",
    ///                     "quicksight:DescribeDataSetPermissions",
    ///                     "quicksight:PassDataSet",
    ///                     "quicksight:DescribeIngestion",
    ///                     "quicksight:ListIngestions",
    ///                 },
    ///                 Principal = exampleAwsQuicksightUser.Arn,
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// ### With Row Level Permission Tag Configuration
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Aws.Quicksight.DataSet("example", new()
    ///     {
    ///         DataSetId = "example-id",
    ///         Name = "example-name",
    ///         ImportMode = "SPICE",
    ///         PhysicalTableMaps = new[]
    ///         {
    ///             new Aws.Quicksight.Inputs.DataSetPhysicalTableMapArgs
    ///             {
    ///                 PhysicalTableMapId = "example-id",
    ///                 S3Source = new Aws.Quicksight.Inputs.DataSetPhysicalTableMapS3SourceArgs
    ///                 {
    ///                     DataSourceArn = exampleAwsQuicksightDataSource.Arn,
    ///                     InputColumns = new[]
    ///                     {
    ///                         new Aws.Quicksight.Inputs.DataSetPhysicalTableMapS3SourceInputColumnArgs
    ///                         {
    ///                             Name = "Column1",
    ///                             Type = "STRING",
    ///                         },
    ///                     },
    ///                     UploadSettings = new Aws.Quicksight.Inputs.DataSetPhysicalTableMapS3SourceUploadSettingsArgs
    ///                     {
    ///                         Format = "JSON",
    ///                     },
    ///                 },
    ///             },
    ///         },
    ///         RowLevelPermissionTagConfiguration = new Aws.Quicksight.Inputs.DataSetRowLevelPermissionTagConfigurationArgs
    ///         {
    ///             Status = "ENABLED",
    ///             TagRules = new[]
    ///             {
    ///                 new Aws.Quicksight.Inputs.DataSetRowLevelPermissionTagConfigurationTagRuleArgs
    ///                 {
    ///                     ColumnName = "Column1",
    ///                     TagKey = "tagkey",
    ///                     MatchAllValue = "*",
    ///                     TagMultiValueDelimiter = ",",
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
    /// Using `pulumi import`, import a QuickSight Data Set using the AWS account ID and data set ID separated by a comma (`,`). For example:
    /// 
    /// ```sh
    ///  $ pulumi import aws:quicksight/dataSet:DataSet example 123456789012,example-id
    /// ```
    /// </summary>
    [AwsResourceType("aws:quicksight/dataSet:DataSet")]
    public partial class DataSet : global::Pulumi.CustomResource
    {
        /// <summary>
        /// ARN of the dataset that contains permissions for RLS.
        /// </summary>
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

        /// <summary>
        /// AWS account ID.
        /// </summary>
        [Output("awsAccountId")]
        public Output<string> AwsAccountId { get; private set; } = null!;

        /// <summary>
        /// Groupings of columns that work together in certain Amazon QuickSight features. Currently, only geospatial hierarchy is supported. See column_groups.
        /// </summary>
        [Output("columnGroups")]
        public Output<ImmutableArray<Outputs.DataSetColumnGroup>> ColumnGroups { get; private set; } = null!;

        /// <summary>
        /// A set of 1 or more definitions of a [ColumnLevelPermissionRule](https://docs.aws.amazon.com/quicksight/latest/APIReference/API_ColumnLevelPermissionRule.html). See column_level_permission_rules.
        /// </summary>
        [Output("columnLevelPermissionRules")]
        public Output<ImmutableArray<Outputs.DataSetColumnLevelPermissionRule>> ColumnLevelPermissionRules { get; private set; } = null!;

        /// <summary>
        /// Identifier for the data set.
        /// </summary>
        [Output("dataSetId")]
        public Output<string> DataSetId { get; private set; } = null!;

        /// <summary>
        /// The usage configuration to apply to child datasets that reference this dataset as a source. See data_set_usage_configuration.
        /// </summary>
        [Output("dataSetUsageConfiguration")]
        public Output<Outputs.DataSetDataSetUsageConfiguration> DataSetUsageConfiguration { get; private set; } = null!;

        /// <summary>
        /// The folder that contains fields and nested subfolders for your dataset. See field_folders.
        /// </summary>
        [Output("fieldFolders")]
        public Output<ImmutableArray<Outputs.DataSetFieldFolder>> FieldFolders { get; private set; } = null!;

        /// <summary>
        /// Indicates whether you want to import the data into SPICE. Valid values are `SPICE` and `DIRECT_QUERY`.
        /// </summary>
        [Output("importMode")]
        public Output<string> ImportMode { get; private set; } = null!;

        /// <summary>
        /// Configures the combination and transformation of the data from the physical tables. Maximum of 1 entry. See logical_table_map.
        /// </summary>
        [Output("logicalTableMaps")]
        public Output<ImmutableArray<Outputs.DataSetLogicalTableMap>> LogicalTableMaps { get; private set; } = null!;

        /// <summary>
        /// Display name for the dataset.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        [Output("outputColumns")]
        public Output<ImmutableArray<Outputs.DataSetOutputColumn>> OutputColumns { get; private set; } = null!;

        /// <summary>
        /// A set of resource permissions on the data source. Maximum of 64 items. See permissions.
        /// </summary>
        [Output("permissions")]
        public Output<ImmutableArray<Outputs.DataSetPermission>> Permissions { get; private set; } = null!;

        /// <summary>
        /// Declares the physical tables that are available in the underlying data sources. See physical_table_map.
        /// 
        /// The following arguments are optional:
        /// </summary>
        [Output("physicalTableMaps")]
        public Output<ImmutableArray<Outputs.DataSetPhysicalTableMap>> PhysicalTableMaps { get; private set; } = null!;

        /// <summary>
        /// The refresh properties for the data set. **NOTE**: Only valid when `import_mode` is set to `SPICE`. See refresh_properties.
        /// </summary>
        [Output("refreshProperties")]
        public Output<Outputs.DataSetRefreshProperties?> RefreshProperties { get; private set; } = null!;

        /// <summary>
        /// The row-level security configuration for the data that you want to create. See row_level_permission_data_set.
        /// </summary>
        [Output("rowLevelPermissionDataSet")]
        public Output<Outputs.DataSetRowLevelPermissionDataSet?> RowLevelPermissionDataSet { get; private set; } = null!;

        /// <summary>
        /// The configuration of tags on a dataset to set row-level security. Row-level security tags are currently supported for anonymous embedding only. See row_level_permission_tag_configuration.
        /// </summary>
        [Output("rowLevelPermissionTagConfiguration")]
        public Output<Outputs.DataSetRowLevelPermissionTagConfiguration?> RowLevelPermissionTagConfiguration { get; private set; } = null!;

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


        /// <summary>
        /// Create a DataSet resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public DataSet(string name, DataSetArgs args, CustomResourceOptions? options = null)
            : base("aws:quicksight/dataSet:DataSet", name, args ?? new DataSetArgs(), MakeResourceOptions(options, ""))
        {
        }

        private DataSet(string name, Input<string> id, DataSetState? state = null, CustomResourceOptions? options = null)
            : base("aws:quicksight/dataSet:DataSet", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing DataSet resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static DataSet Get(string name, Input<string> id, DataSetState? state = null, CustomResourceOptions? options = null)
        {
            return new DataSet(name, id, state, options);
        }
    }

    public sealed class DataSetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// AWS account ID.
        /// </summary>
        [Input("awsAccountId")]
        public Input<string>? AwsAccountId { get; set; }

        [Input("columnGroups")]
        private InputList<Inputs.DataSetColumnGroupArgs>? _columnGroups;

        /// <summary>
        /// Groupings of columns that work together in certain Amazon QuickSight features. Currently, only geospatial hierarchy is supported. See column_groups.
        /// </summary>
        public InputList<Inputs.DataSetColumnGroupArgs> ColumnGroups
        {
            get => _columnGroups ?? (_columnGroups = new InputList<Inputs.DataSetColumnGroupArgs>());
            set => _columnGroups = value;
        }

        [Input("columnLevelPermissionRules")]
        private InputList<Inputs.DataSetColumnLevelPermissionRuleArgs>? _columnLevelPermissionRules;

        /// <summary>
        /// A set of 1 or more definitions of a [ColumnLevelPermissionRule](https://docs.aws.amazon.com/quicksight/latest/APIReference/API_ColumnLevelPermissionRule.html). See column_level_permission_rules.
        /// </summary>
        public InputList<Inputs.DataSetColumnLevelPermissionRuleArgs> ColumnLevelPermissionRules
        {
            get => _columnLevelPermissionRules ?? (_columnLevelPermissionRules = new InputList<Inputs.DataSetColumnLevelPermissionRuleArgs>());
            set => _columnLevelPermissionRules = value;
        }

        /// <summary>
        /// Identifier for the data set.
        /// </summary>
        [Input("dataSetId", required: true)]
        public Input<string> DataSetId { get; set; } = null!;

        /// <summary>
        /// The usage configuration to apply to child datasets that reference this dataset as a source. See data_set_usage_configuration.
        /// </summary>
        [Input("dataSetUsageConfiguration")]
        public Input<Inputs.DataSetDataSetUsageConfigurationArgs>? DataSetUsageConfiguration { get; set; }

        [Input("fieldFolders")]
        private InputList<Inputs.DataSetFieldFolderArgs>? _fieldFolders;

        /// <summary>
        /// The folder that contains fields and nested subfolders for your dataset. See field_folders.
        /// </summary>
        public InputList<Inputs.DataSetFieldFolderArgs> FieldFolders
        {
            get => _fieldFolders ?? (_fieldFolders = new InputList<Inputs.DataSetFieldFolderArgs>());
            set => _fieldFolders = value;
        }

        /// <summary>
        /// Indicates whether you want to import the data into SPICE. Valid values are `SPICE` and `DIRECT_QUERY`.
        /// </summary>
        [Input("importMode", required: true)]
        public Input<string> ImportMode { get; set; } = null!;

        [Input("logicalTableMaps")]
        private InputList<Inputs.DataSetLogicalTableMapArgs>? _logicalTableMaps;

        /// <summary>
        /// Configures the combination and transformation of the data from the physical tables. Maximum of 1 entry. See logical_table_map.
        /// </summary>
        public InputList<Inputs.DataSetLogicalTableMapArgs> LogicalTableMaps
        {
            get => _logicalTableMaps ?? (_logicalTableMaps = new InputList<Inputs.DataSetLogicalTableMapArgs>());
            set => _logicalTableMaps = value;
        }

        /// <summary>
        /// Display name for the dataset.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("permissions")]
        private InputList<Inputs.DataSetPermissionArgs>? _permissions;

        /// <summary>
        /// A set of resource permissions on the data source. Maximum of 64 items. See permissions.
        /// </summary>
        public InputList<Inputs.DataSetPermissionArgs> Permissions
        {
            get => _permissions ?? (_permissions = new InputList<Inputs.DataSetPermissionArgs>());
            set => _permissions = value;
        }

        [Input("physicalTableMaps")]
        private InputList<Inputs.DataSetPhysicalTableMapArgs>? _physicalTableMaps;

        /// <summary>
        /// Declares the physical tables that are available in the underlying data sources. See physical_table_map.
        /// 
        /// The following arguments are optional:
        /// </summary>
        public InputList<Inputs.DataSetPhysicalTableMapArgs> PhysicalTableMaps
        {
            get => _physicalTableMaps ?? (_physicalTableMaps = new InputList<Inputs.DataSetPhysicalTableMapArgs>());
            set => _physicalTableMaps = value;
        }

        /// <summary>
        /// The refresh properties for the data set. **NOTE**: Only valid when `import_mode` is set to `SPICE`. See refresh_properties.
        /// </summary>
        [Input("refreshProperties")]
        public Input<Inputs.DataSetRefreshPropertiesArgs>? RefreshProperties { get; set; }

        /// <summary>
        /// The row-level security configuration for the data that you want to create. See row_level_permission_data_set.
        /// </summary>
        [Input("rowLevelPermissionDataSet")]
        public Input<Inputs.DataSetRowLevelPermissionDataSetArgs>? RowLevelPermissionDataSet { get; set; }

        /// <summary>
        /// The configuration of tags on a dataset to set row-level security. Row-level security tags are currently supported for anonymous embedding only. See row_level_permission_tag_configuration.
        /// </summary>
        [Input("rowLevelPermissionTagConfiguration")]
        public Input<Inputs.DataSetRowLevelPermissionTagConfigurationArgs>? RowLevelPermissionTagConfiguration { get; set; }

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

        public DataSetArgs()
        {
        }
        public static new DataSetArgs Empty => new DataSetArgs();
    }

    public sealed class DataSetState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// ARN of the dataset that contains permissions for RLS.
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        /// <summary>
        /// AWS account ID.
        /// </summary>
        [Input("awsAccountId")]
        public Input<string>? AwsAccountId { get; set; }

        [Input("columnGroups")]
        private InputList<Inputs.DataSetColumnGroupGetArgs>? _columnGroups;

        /// <summary>
        /// Groupings of columns that work together in certain Amazon QuickSight features. Currently, only geospatial hierarchy is supported. See column_groups.
        /// </summary>
        public InputList<Inputs.DataSetColumnGroupGetArgs> ColumnGroups
        {
            get => _columnGroups ?? (_columnGroups = new InputList<Inputs.DataSetColumnGroupGetArgs>());
            set => _columnGroups = value;
        }

        [Input("columnLevelPermissionRules")]
        private InputList<Inputs.DataSetColumnLevelPermissionRuleGetArgs>? _columnLevelPermissionRules;

        /// <summary>
        /// A set of 1 or more definitions of a [ColumnLevelPermissionRule](https://docs.aws.amazon.com/quicksight/latest/APIReference/API_ColumnLevelPermissionRule.html). See column_level_permission_rules.
        /// </summary>
        public InputList<Inputs.DataSetColumnLevelPermissionRuleGetArgs> ColumnLevelPermissionRules
        {
            get => _columnLevelPermissionRules ?? (_columnLevelPermissionRules = new InputList<Inputs.DataSetColumnLevelPermissionRuleGetArgs>());
            set => _columnLevelPermissionRules = value;
        }

        /// <summary>
        /// Identifier for the data set.
        /// </summary>
        [Input("dataSetId")]
        public Input<string>? DataSetId { get; set; }

        /// <summary>
        /// The usage configuration to apply to child datasets that reference this dataset as a source. See data_set_usage_configuration.
        /// </summary>
        [Input("dataSetUsageConfiguration")]
        public Input<Inputs.DataSetDataSetUsageConfigurationGetArgs>? DataSetUsageConfiguration { get; set; }

        [Input("fieldFolders")]
        private InputList<Inputs.DataSetFieldFolderGetArgs>? _fieldFolders;

        /// <summary>
        /// The folder that contains fields and nested subfolders for your dataset. See field_folders.
        /// </summary>
        public InputList<Inputs.DataSetFieldFolderGetArgs> FieldFolders
        {
            get => _fieldFolders ?? (_fieldFolders = new InputList<Inputs.DataSetFieldFolderGetArgs>());
            set => _fieldFolders = value;
        }

        /// <summary>
        /// Indicates whether you want to import the data into SPICE. Valid values are `SPICE` and `DIRECT_QUERY`.
        /// </summary>
        [Input("importMode")]
        public Input<string>? ImportMode { get; set; }

        [Input("logicalTableMaps")]
        private InputList<Inputs.DataSetLogicalTableMapGetArgs>? _logicalTableMaps;

        /// <summary>
        /// Configures the combination and transformation of the data from the physical tables. Maximum of 1 entry. See logical_table_map.
        /// </summary>
        public InputList<Inputs.DataSetLogicalTableMapGetArgs> LogicalTableMaps
        {
            get => _logicalTableMaps ?? (_logicalTableMaps = new InputList<Inputs.DataSetLogicalTableMapGetArgs>());
            set => _logicalTableMaps = value;
        }

        /// <summary>
        /// Display name for the dataset.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("outputColumns")]
        private InputList<Inputs.DataSetOutputColumnGetArgs>? _outputColumns;
        public InputList<Inputs.DataSetOutputColumnGetArgs> OutputColumns
        {
            get => _outputColumns ?? (_outputColumns = new InputList<Inputs.DataSetOutputColumnGetArgs>());
            set => _outputColumns = value;
        }

        [Input("permissions")]
        private InputList<Inputs.DataSetPermissionGetArgs>? _permissions;

        /// <summary>
        /// A set of resource permissions on the data source. Maximum of 64 items. See permissions.
        /// </summary>
        public InputList<Inputs.DataSetPermissionGetArgs> Permissions
        {
            get => _permissions ?? (_permissions = new InputList<Inputs.DataSetPermissionGetArgs>());
            set => _permissions = value;
        }

        [Input("physicalTableMaps")]
        private InputList<Inputs.DataSetPhysicalTableMapGetArgs>? _physicalTableMaps;

        /// <summary>
        /// Declares the physical tables that are available in the underlying data sources. See physical_table_map.
        /// 
        /// The following arguments are optional:
        /// </summary>
        public InputList<Inputs.DataSetPhysicalTableMapGetArgs> PhysicalTableMaps
        {
            get => _physicalTableMaps ?? (_physicalTableMaps = new InputList<Inputs.DataSetPhysicalTableMapGetArgs>());
            set => _physicalTableMaps = value;
        }

        /// <summary>
        /// The refresh properties for the data set. **NOTE**: Only valid when `import_mode` is set to `SPICE`. See refresh_properties.
        /// </summary>
        [Input("refreshProperties")]
        public Input<Inputs.DataSetRefreshPropertiesGetArgs>? RefreshProperties { get; set; }

        /// <summary>
        /// The row-level security configuration for the data that you want to create. See row_level_permission_data_set.
        /// </summary>
        [Input("rowLevelPermissionDataSet")]
        public Input<Inputs.DataSetRowLevelPermissionDataSetGetArgs>? RowLevelPermissionDataSet { get; set; }

        /// <summary>
        /// The configuration of tags on a dataset to set row-level security. Row-level security tags are currently supported for anonymous embedding only. See row_level_permission_tag_configuration.
        /// </summary>
        [Input("rowLevelPermissionTagConfiguration")]
        public Input<Inputs.DataSetRowLevelPermissionTagConfigurationGetArgs>? RowLevelPermissionTagConfiguration { get; set; }

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

        public DataSetState()
        {
        }
        public static new DataSetState Empty => new DataSetState();
    }
}

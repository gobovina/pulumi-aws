// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Resource for managing a QuickSight Data Set.
 *
 * ## Example Usage
 * ### Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.quicksight.DataSet("example", {
 *     dataSetId: "example-id",
 *     importMode: "SPICE",
 *     physicalTableMaps: [{
 *         physicalTableMapId: "example-id",
 *         s3Source: {
 *             dataSourceArn: aws_quicksight_data_source.example.arn,
 *             inputColumns: [{
 *                 name: "Column1",
 *                 type: "STRING",
 *             }],
 *             uploadSettings: {
 *                 format: "JSON",
 *             },
 *         },
 *     }],
 * });
 * ```
 * ### With Column Level Permission Rules
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.quicksight.DataSet("example", {
 *     dataSetId: "example-id",
 *     importMode: "SPICE",
 *     physicalTableMaps: [{
 *         physicalTableMapId: "example-id",
 *         s3Source: {
 *             dataSourceArn: aws_quicksight_data_source.example.arn,
 *             inputColumns: [{
 *                 name: "Column1",
 *                 type: "STRING",
 *             }],
 *             uploadSettings: {
 *                 format: "JSON",
 *             },
 *         },
 *     }],
 *     columnLevelPermissionRules: [{
 *         columnNames: ["Column1"],
 *         principals: [aws_quicksight_user.example.arn],
 *     }],
 * });
 * ```
 * ### With Field Folders
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.quicksight.DataSet("example", {
 *     dataSetId: "example-id",
 *     importMode: "SPICE",
 *     physicalTableMaps: [{
 *         physicalTableMapId: "example-id",
 *         s3Source: {
 *             dataSourceArn: aws_quicksight_data_source.example.arn,
 *             inputColumns: [{
 *                 name: "Column1",
 *                 type: "STRING",
 *             }],
 *             uploadSettings: {
 *                 format: "JSON",
 *             },
 *         },
 *     }],
 *     fieldFolders: [{
 *         fieldFoldersId: "example-id",
 *         columns: ["Column1"],
 *         description: "example description",
 *     }],
 * });
 * ```
 * ### With Permissions
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.quicksight.DataSet("example", {
 *     dataSetId: "example-id",
 *     importMode: "SPICE",
 *     physicalTableMaps: [{
 *         physicalTableMapId: "example-id",
 *         s3Source: {
 *             dataSourceArn: aws_quicksight_data_source.example.arn,
 *             inputColumns: [{
 *                 name: "Column1",
 *                 type: "STRING",
 *             }],
 *             uploadSettings: {
 *                 format: "JSON",
 *             },
 *         },
 *     }],
 *     permissions: [{
 *         actions: [
 *             "quicksight:DescribeDataSet",
 *             "quicksight:DescribeDataSetPermissions",
 *             "quicksight:PassDataSet",
 *             "quicksight:DescribeIngestion",
 *             "quicksight:ListIngestions",
 *         ],
 *         principal: aws_quicksight_user.example.arn,
 *     }],
 * });
 * ```
 * ### With Row Level Permission Tag Configuration
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.quicksight.DataSet("example", {
 *     dataSetId: "example-id",
 *     importMode: "SPICE",
 *     physicalTableMaps: [{
 *         physicalTableMapId: "example-id",
 *         s3Source: {
 *             dataSourceArn: aws_quicksight_data_source.example.arn,
 *             inputColumns: [{
 *                 name: "Column1",
 *                 type: "STRING",
 *             }],
 *             uploadSettings: {
 *                 format: "JSON",
 *             },
 *         },
 *     }],
 *     rowLevelPermissionTagConfiguration: {
 *         status: "ENABLED",
 *         tagRules: [{
 *             columnName: "Column1",
 *             tagKey: "tagkey",
 *             matchAllValue: "*",
 *             tagMultiValueDelimiter: ",",
 *         }],
 *     },
 * });
 * ```
 *
 * ## Import
 *
 * Using `pulumi import`, import a QuickSight Data Set using the AWS account ID and data set ID separated by a comma (`,`). For example:
 *
 * ```sh
 *  $ pulumi import aws:quicksight/dataSet:DataSet example 123456789012,example-id
 * ```
 */
export class DataSet extends pulumi.CustomResource {
    /**
     * Get an existing DataSet resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: DataSetState, opts?: pulumi.CustomResourceOptions): DataSet {
        return new DataSet(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:quicksight/dataSet:DataSet';

    /**
     * Returns true if the given object is an instance of DataSet.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is DataSet {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === DataSet.__pulumiType;
    }

    /**
     * ARN of the dataset that contains permissions for RLS.
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * AWS account ID.
     */
    public readonly awsAccountId!: pulumi.Output<string>;
    /**
     * Groupings of columns that work together in certain Amazon QuickSight features. Currently, only geospatial hierarchy is supported. See column_groups.
     */
    public readonly columnGroups!: pulumi.Output<outputs.quicksight.DataSetColumnGroup[] | undefined>;
    /**
     * A set of 1 or more definitions of a [ColumnLevelPermissionRule](https://docs.aws.amazon.com/quicksight/latest/APIReference/API_ColumnLevelPermissionRule.html). See column_level_permission_rules.
     */
    public readonly columnLevelPermissionRules!: pulumi.Output<outputs.quicksight.DataSetColumnLevelPermissionRule[] | undefined>;
    /**
     * Identifier for the data set.
     */
    public readonly dataSetId!: pulumi.Output<string>;
    /**
     * The usage configuration to apply to child datasets that reference this dataset as a source. See data_set_usage_configuration.
     */
    public readonly dataSetUsageConfiguration!: pulumi.Output<outputs.quicksight.DataSetDataSetUsageConfiguration>;
    /**
     * The folder that contains fields and nested subfolders for your dataset. See field_folders.
     */
    public readonly fieldFolders!: pulumi.Output<outputs.quicksight.DataSetFieldFolder[] | undefined>;
    /**
     * Indicates whether you want to import the data into SPICE. Valid values are `SPICE` and `DIRECT_QUERY`.
     */
    public readonly importMode!: pulumi.Output<string>;
    /**
     * Configures the combination and transformation of the data from the physical tables. Maximum of 1 entry. See logical_table_map.
     */
    public readonly logicalTableMaps!: pulumi.Output<outputs.quicksight.DataSetLogicalTableMap[]>;
    /**
     * Display name for the dataset.
     */
    public readonly name!: pulumi.Output<string>;
    public /*out*/ readonly outputColumns!: pulumi.Output<outputs.quicksight.DataSetOutputColumn[]>;
    /**
     * A set of resource permissions on the data source. Maximum of 64 items. See permissions.
     */
    public readonly permissions!: pulumi.Output<outputs.quicksight.DataSetPermission[] | undefined>;
    /**
     * Declares the physical tables that are available in the underlying data sources. See physical_table_map.
     *
     * The following arguments are optional:
     */
    public readonly physicalTableMaps!: pulumi.Output<outputs.quicksight.DataSetPhysicalTableMap[] | undefined>;
    /**
     * The refresh properties for the data set. **NOTE**: Only valid when `importMode` is set to `SPICE`. See refresh_properties.
     */
    public readonly refreshProperties!: pulumi.Output<outputs.quicksight.DataSetRefreshProperties | undefined>;
    /**
     * The row-level security configuration for the data that you want to create. See row_level_permission_data_set.
     */
    public readonly rowLevelPermissionDataSet!: pulumi.Output<outputs.quicksight.DataSetRowLevelPermissionDataSet | undefined>;
    /**
     * The configuration of tags on a dataset to set row-level security. Row-level security tags are currently supported for anonymous embedding only. See row_level_permission_tag_configuration.
     */
    public readonly rowLevelPermissionTagConfiguration!: pulumi.Output<outputs.quicksight.DataSetRowLevelPermissionTagConfiguration | undefined>;
    /**
     * Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     */
    public /*out*/ readonly tagsAll!: pulumi.Output<{[key: string]: string}>;

    /**
     * Create a DataSet resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: DataSetArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: DataSetArgs | DataSetState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as DataSetState | undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["awsAccountId"] = state ? state.awsAccountId : undefined;
            resourceInputs["columnGroups"] = state ? state.columnGroups : undefined;
            resourceInputs["columnLevelPermissionRules"] = state ? state.columnLevelPermissionRules : undefined;
            resourceInputs["dataSetId"] = state ? state.dataSetId : undefined;
            resourceInputs["dataSetUsageConfiguration"] = state ? state.dataSetUsageConfiguration : undefined;
            resourceInputs["fieldFolders"] = state ? state.fieldFolders : undefined;
            resourceInputs["importMode"] = state ? state.importMode : undefined;
            resourceInputs["logicalTableMaps"] = state ? state.logicalTableMaps : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["outputColumns"] = state ? state.outputColumns : undefined;
            resourceInputs["permissions"] = state ? state.permissions : undefined;
            resourceInputs["physicalTableMaps"] = state ? state.physicalTableMaps : undefined;
            resourceInputs["refreshProperties"] = state ? state.refreshProperties : undefined;
            resourceInputs["rowLevelPermissionDataSet"] = state ? state.rowLevelPermissionDataSet : undefined;
            resourceInputs["rowLevelPermissionTagConfiguration"] = state ? state.rowLevelPermissionTagConfiguration : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tagsAll"] = state ? state.tagsAll : undefined;
        } else {
            const args = argsOrState as DataSetArgs | undefined;
            if ((!args || args.dataSetId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'dataSetId'");
            }
            if ((!args || args.importMode === undefined) && !opts.urn) {
                throw new Error("Missing required property 'importMode'");
            }
            resourceInputs["awsAccountId"] = args ? args.awsAccountId : undefined;
            resourceInputs["columnGroups"] = args ? args.columnGroups : undefined;
            resourceInputs["columnLevelPermissionRules"] = args ? args.columnLevelPermissionRules : undefined;
            resourceInputs["dataSetId"] = args ? args.dataSetId : undefined;
            resourceInputs["dataSetUsageConfiguration"] = args ? args.dataSetUsageConfiguration : undefined;
            resourceInputs["fieldFolders"] = args ? args.fieldFolders : undefined;
            resourceInputs["importMode"] = args ? args.importMode : undefined;
            resourceInputs["logicalTableMaps"] = args ? args.logicalTableMaps : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["permissions"] = args ? args.permissions : undefined;
            resourceInputs["physicalTableMaps"] = args ? args.physicalTableMaps : undefined;
            resourceInputs["refreshProperties"] = args ? args.refreshProperties : undefined;
            resourceInputs["rowLevelPermissionDataSet"] = args ? args.rowLevelPermissionDataSet : undefined;
            resourceInputs["rowLevelPermissionTagConfiguration"] = args ? args.rowLevelPermissionTagConfiguration : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["arn"] = undefined /*out*/;
            resourceInputs["outputColumns"] = undefined /*out*/;
            resourceInputs["tagsAll"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(DataSet.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering DataSet resources.
 */
export interface DataSetState {
    /**
     * ARN of the dataset that contains permissions for RLS.
     */
    arn?: pulumi.Input<string>;
    /**
     * AWS account ID.
     */
    awsAccountId?: pulumi.Input<string>;
    /**
     * Groupings of columns that work together in certain Amazon QuickSight features. Currently, only geospatial hierarchy is supported. See column_groups.
     */
    columnGroups?: pulumi.Input<pulumi.Input<inputs.quicksight.DataSetColumnGroup>[]>;
    /**
     * A set of 1 or more definitions of a [ColumnLevelPermissionRule](https://docs.aws.amazon.com/quicksight/latest/APIReference/API_ColumnLevelPermissionRule.html). See column_level_permission_rules.
     */
    columnLevelPermissionRules?: pulumi.Input<pulumi.Input<inputs.quicksight.DataSetColumnLevelPermissionRule>[]>;
    /**
     * Identifier for the data set.
     */
    dataSetId?: pulumi.Input<string>;
    /**
     * The usage configuration to apply to child datasets that reference this dataset as a source. See data_set_usage_configuration.
     */
    dataSetUsageConfiguration?: pulumi.Input<inputs.quicksight.DataSetDataSetUsageConfiguration>;
    /**
     * The folder that contains fields and nested subfolders for your dataset. See field_folders.
     */
    fieldFolders?: pulumi.Input<pulumi.Input<inputs.quicksight.DataSetFieldFolder>[]>;
    /**
     * Indicates whether you want to import the data into SPICE. Valid values are `SPICE` and `DIRECT_QUERY`.
     */
    importMode?: pulumi.Input<string>;
    /**
     * Configures the combination and transformation of the data from the physical tables. Maximum of 1 entry. See logical_table_map.
     */
    logicalTableMaps?: pulumi.Input<pulumi.Input<inputs.quicksight.DataSetLogicalTableMap>[]>;
    /**
     * Display name for the dataset.
     */
    name?: pulumi.Input<string>;
    outputColumns?: pulumi.Input<pulumi.Input<inputs.quicksight.DataSetOutputColumn>[]>;
    /**
     * A set of resource permissions on the data source. Maximum of 64 items. See permissions.
     */
    permissions?: pulumi.Input<pulumi.Input<inputs.quicksight.DataSetPermission>[]>;
    /**
     * Declares the physical tables that are available in the underlying data sources. See physical_table_map.
     *
     * The following arguments are optional:
     */
    physicalTableMaps?: pulumi.Input<pulumi.Input<inputs.quicksight.DataSetPhysicalTableMap>[]>;
    /**
     * The refresh properties for the data set. **NOTE**: Only valid when `importMode` is set to `SPICE`. See refresh_properties.
     */
    refreshProperties?: pulumi.Input<inputs.quicksight.DataSetRefreshProperties>;
    /**
     * The row-level security configuration for the data that you want to create. See row_level_permission_data_set.
     */
    rowLevelPermissionDataSet?: pulumi.Input<inputs.quicksight.DataSetRowLevelPermissionDataSet>;
    /**
     * The configuration of tags on a dataset to set row-level security. Row-level security tags are currently supported for anonymous embedding only. See row_level_permission_tag_configuration.
     */
    rowLevelPermissionTagConfiguration?: pulumi.Input<inputs.quicksight.DataSetRowLevelPermissionTagConfiguration>;
    /**
     * Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     */
    tagsAll?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}

/**
 * The set of arguments for constructing a DataSet resource.
 */
export interface DataSetArgs {
    /**
     * AWS account ID.
     */
    awsAccountId?: pulumi.Input<string>;
    /**
     * Groupings of columns that work together in certain Amazon QuickSight features. Currently, only geospatial hierarchy is supported. See column_groups.
     */
    columnGroups?: pulumi.Input<pulumi.Input<inputs.quicksight.DataSetColumnGroup>[]>;
    /**
     * A set of 1 or more definitions of a [ColumnLevelPermissionRule](https://docs.aws.amazon.com/quicksight/latest/APIReference/API_ColumnLevelPermissionRule.html). See column_level_permission_rules.
     */
    columnLevelPermissionRules?: pulumi.Input<pulumi.Input<inputs.quicksight.DataSetColumnLevelPermissionRule>[]>;
    /**
     * Identifier for the data set.
     */
    dataSetId: pulumi.Input<string>;
    /**
     * The usage configuration to apply to child datasets that reference this dataset as a source. See data_set_usage_configuration.
     */
    dataSetUsageConfiguration?: pulumi.Input<inputs.quicksight.DataSetDataSetUsageConfiguration>;
    /**
     * The folder that contains fields and nested subfolders for your dataset. See field_folders.
     */
    fieldFolders?: pulumi.Input<pulumi.Input<inputs.quicksight.DataSetFieldFolder>[]>;
    /**
     * Indicates whether you want to import the data into SPICE. Valid values are `SPICE` and `DIRECT_QUERY`.
     */
    importMode: pulumi.Input<string>;
    /**
     * Configures the combination and transformation of the data from the physical tables. Maximum of 1 entry. See logical_table_map.
     */
    logicalTableMaps?: pulumi.Input<pulumi.Input<inputs.quicksight.DataSetLogicalTableMap>[]>;
    /**
     * Display name for the dataset.
     */
    name?: pulumi.Input<string>;
    /**
     * A set of resource permissions on the data source. Maximum of 64 items. See permissions.
     */
    permissions?: pulumi.Input<pulumi.Input<inputs.quicksight.DataSetPermission>[]>;
    /**
     * Declares the physical tables that are available in the underlying data sources. See physical_table_map.
     *
     * The following arguments are optional:
     */
    physicalTableMaps?: pulumi.Input<pulumi.Input<inputs.quicksight.DataSetPhysicalTableMap>[]>;
    /**
     * The refresh properties for the data set. **NOTE**: Only valid when `importMode` is set to `SPICE`. See refresh_properties.
     */
    refreshProperties?: pulumi.Input<inputs.quicksight.DataSetRefreshProperties>;
    /**
     * The row-level security configuration for the data that you want to create. See row_level_permission_data_set.
     */
    rowLevelPermissionDataSet?: pulumi.Input<inputs.quicksight.DataSetRowLevelPermissionDataSet>;
    /**
     * The configuration of tags on a dataset to set row-level security. Row-level security tags are currently supported for anonymous embedding only. See row_level_permission_tag_configuration.
     */
    rowLevelPermissionTagConfiguration?: pulumi.Input<inputs.quicksight.DataSetRowLevelPermissionTagConfiguration>;
    /**
     * Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}

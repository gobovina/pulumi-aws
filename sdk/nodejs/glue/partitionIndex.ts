// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const exampleCatalogDatabase = new aws.glue.CatalogDatabase("exampleCatalogDatabase", {name: "example"});
 * const exampleCatalogTable = new aws.glue.CatalogTable("exampleCatalogTable", {
 *     name: "example",
 *     databaseName: exampleCatalogDatabase.name,
 *     owner: "my_owner",
 *     retention: 1,
 *     tableType: "VIRTUAL_VIEW",
 *     viewExpandedText: "view_expanded_text_1",
 *     viewOriginalText: "view_original_text_1",
 *     storageDescriptor: {
 *         bucketColumns: ["bucket_column_1"],
 *         compressed: false,
 *         inputFormat: "SequenceFileInputFormat",
 *         location: "my_location",
 *         numberOfBuckets: 1,
 *         outputFormat: "SequenceFileInputFormat",
 *         storedAsSubDirectories: false,
 *         parameters: {
 *             param1: "param1_val",
 *         },
 *         columns: [
 *             {
 *                 name: "my_column_1",
 *                 type: "int",
 *                 comment: "my_column1_comment",
 *             },
 *             {
 *                 name: "my_column_2",
 *                 type: "string",
 *                 comment: "my_column2_comment",
 *             },
 *         ],
 *         serDeInfo: {
 *             name: "ser_de_name",
 *             parameters: {
 *                 param1: "param_val_1",
 *             },
 *             serializationLibrary: "org.apache.hadoop.hive.serde2.columnar.ColumnarSerDe",
 *         },
 *         sortColumns: [{
 *             column: "my_column_1",
 *             sortOrder: 1,
 *         }],
 *         skewedInfo: {
 *             skewedColumnNames: ["my_column_1"],
 *             skewedColumnValueLocationMaps: {
 *                 my_column_1: "my_column_1_val_loc_map",
 *             },
 *             skewedColumnValues: ["skewed_val_1"],
 *         },
 *     },
 *     partitionKeys: [
 *         {
 *             name: "my_column_1",
 *             type: "int",
 *             comment: "my_column_1_comment",
 *         },
 *         {
 *             name: "my_column_2",
 *             type: "string",
 *             comment: "my_column_2_comment",
 *         },
 *     ],
 *     parameters: {
 *         param1: "param1_val",
 *     },
 * });
 * const examplePartitionIndex = new aws.glue.PartitionIndex("examplePartitionIndex", {
 *     databaseName: exampleCatalogDatabase.name,
 *     tableName: exampleCatalogTable.name,
 *     partitionIndex: {
 *         indexName: "example",
 *         keys: [
 *             "my_column_1",
 *             "my_column_2",
 *         ],
 *     },
 * });
 * ```
 *
 * ## Import
 *
 * Using `pulumi import`, import Glue Partition Indexes using the catalog ID (usually AWS account ID), database name, table name, and index name. For example:
 *
 * ```sh
 *  $ pulumi import aws:glue/partitionIndex:PartitionIndex example 123456789012:MyDatabase:MyTable:index-name
 * ```
 */
export class PartitionIndex extends pulumi.CustomResource {
    /**
     * Get an existing PartitionIndex resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: PartitionIndexState, opts?: pulumi.CustomResourceOptions): PartitionIndex {
        return new PartitionIndex(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:glue/partitionIndex:PartitionIndex';

    /**
     * Returns true if the given object is an instance of PartitionIndex.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is PartitionIndex {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === PartitionIndex.__pulumiType;
    }

    /**
     * The catalog ID where the table resides.
     */
    public readonly catalogId!: pulumi.Output<string>;
    /**
     * Name of the metadata database where the table metadata resides. For Hive compatibility, this must be all lowercase.
     */
    public readonly databaseName!: pulumi.Output<string>;
    /**
     * Configuration block for a partition index. See `partitionIndex` below.
     */
    public readonly partitionIndex!: pulumi.Output<outputs.glue.PartitionIndexPartitionIndex>;
    /**
     * Name of the table. For Hive compatibility, this must be entirely lowercase.
     */
    public readonly tableName!: pulumi.Output<string>;

    /**
     * Create a PartitionIndex resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: PartitionIndexArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: PartitionIndexArgs | PartitionIndexState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as PartitionIndexState | undefined;
            resourceInputs["catalogId"] = state ? state.catalogId : undefined;
            resourceInputs["databaseName"] = state ? state.databaseName : undefined;
            resourceInputs["partitionIndex"] = state ? state.partitionIndex : undefined;
            resourceInputs["tableName"] = state ? state.tableName : undefined;
        } else {
            const args = argsOrState as PartitionIndexArgs | undefined;
            if ((!args || args.databaseName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'databaseName'");
            }
            if ((!args || args.partitionIndex === undefined) && !opts.urn) {
                throw new Error("Missing required property 'partitionIndex'");
            }
            if ((!args || args.tableName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'tableName'");
            }
            resourceInputs["catalogId"] = args ? args.catalogId : undefined;
            resourceInputs["databaseName"] = args ? args.databaseName : undefined;
            resourceInputs["partitionIndex"] = args ? args.partitionIndex : undefined;
            resourceInputs["tableName"] = args ? args.tableName : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(PartitionIndex.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering PartitionIndex resources.
 */
export interface PartitionIndexState {
    /**
     * The catalog ID where the table resides.
     */
    catalogId?: pulumi.Input<string>;
    /**
     * Name of the metadata database where the table metadata resides. For Hive compatibility, this must be all lowercase.
     */
    databaseName?: pulumi.Input<string>;
    /**
     * Configuration block for a partition index. See `partitionIndex` below.
     */
    partitionIndex?: pulumi.Input<inputs.glue.PartitionIndexPartitionIndex>;
    /**
     * Name of the table. For Hive compatibility, this must be entirely lowercase.
     */
    tableName?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a PartitionIndex resource.
 */
export interface PartitionIndexArgs {
    /**
     * The catalog ID where the table resides.
     */
    catalogId?: pulumi.Input<string>;
    /**
     * Name of the metadata database where the table metadata resides. For Hive compatibility, this must be all lowercase.
     */
    databaseName: pulumi.Input<string>;
    /**
     * Configuration block for a partition index. See `partitionIndex` below.
     */
    partitionIndex: pulumi.Input<inputs.glue.PartitionIndexPartitionIndex>;
    /**
     * Name of the table. For Hive compatibility, this must be entirely lowercase.
     */
    tableName: pulumi.Input<string>;
}

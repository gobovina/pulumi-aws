// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * This data source can be used to fetch information about an AWS Glue Data Catalog Table.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = aws.glue.getCatalogTable({
 *     name: "MyCatalogTable",
 *     databaseName: "MyCatalogDatabase",
 * });
 * ```
 */
export function getCatalogTable(args: GetCatalogTableArgs, opts?: pulumi.InvokeOptions): Promise<GetCatalogTableResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("aws:glue/getCatalogTable:getCatalogTable", {
        "catalogId": args.catalogId,
        "databaseName": args.databaseName,
        "name": args.name,
        "queryAsOfTime": args.queryAsOfTime,
        "transactionId": args.transactionId,
    }, opts);
}

/**
 * A collection of arguments for invoking getCatalogTable.
 */
export interface GetCatalogTableArgs {
    /**
     * ID of the Glue Catalog and database where the table metadata resides. If omitted, this defaults to the current AWS Account ID.
     */
    catalogId?: string;
    /**
     * Name of the metadata database where the table metadata resides.
     */
    databaseName: string;
    /**
     * Name of the table.
     */
    name: string;
    /**
     * The time as of when to read the table contents. If not set, the most recent transaction commit time will be used. Cannot be specified along with `transactionId`. Specified in RFC 3339 format, e.g. `2006-01-02T15:04:05Z07:00`.
     */
    queryAsOfTime?: string;
    /**
     * The transaction ID at which to read the table contents.
     */
    transactionId?: number;
}

/**
 * A collection of values returned by getCatalogTable.
 */
export interface GetCatalogTableResult {
    /**
     * The ARN of the Glue Table.
     */
    readonly arn: string;
    /**
     * ID of the Data Catalog in which the table resides.
     */
    readonly catalogId: string;
    /**
     * Name of the catalog database that contains the target table.
     */
    readonly databaseName: string;
    /**
     * Description of the table.
     */
    readonly description: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Name of the target table.
     */
    readonly name: string;
    /**
     * Owner of the table.
     */
    readonly owner: string;
    /**
     * Map of initialization parameters for the SerDe, in key-value form.
     */
    readonly parameters: {[key: string]: string};
    /**
     * Configuration block for a maximum of 3 partition indexes. See `partitionIndex` below.
     */
    readonly partitionIndices: outputs.glue.GetCatalogTablePartitionIndex[];
    /**
     * Configuration block of columns by which the table is partitioned. Only primitive types are supported as partition keys. See `partitionKeys` below.
     */
    readonly partitionKeys: outputs.glue.GetCatalogTablePartitionKey[];
    readonly queryAsOfTime?: string;
    /**
     * Retention time for this table.
     */
    readonly retention: number;
    /**
     * Configuration block for information about the physical storage of this table. For more information, refer to the [Glue Developer Guide](https://docs.aws.amazon.com/glue/latest/dg/aws-glue-api-catalog-tables.html#aws-glue-api-catalog-tables-StorageDescriptor). See `storageDescriptor` below.
     */
    readonly storageDescriptors: outputs.glue.GetCatalogTableStorageDescriptor[];
    /**
     * Type of this table (EXTERNAL_TABLE, VIRTUAL_VIEW, etc.). While optional, some Athena DDL queries such as `ALTER TABLE` and `SHOW CREATE TABLE` will fail if this argument is empty.
     */
    readonly tableType: string;
    /**
     * Configuration block of a target table for resource linking. See `targetTable` below.
     */
    readonly targetTables: outputs.glue.GetCatalogTableTargetTable[];
    readonly transactionId?: number;
    /**
     * If the table is a view, the expanded text of the view; otherwise null.
     */
    readonly viewExpandedText: string;
    /**
     * If the table is a view, the original text of the view; otherwise null.
     */
    readonly viewOriginalText: string;
}
/**
 * This data source can be used to fetch information about an AWS Glue Data Catalog Table.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = aws.glue.getCatalogTable({
 *     name: "MyCatalogTable",
 *     databaseName: "MyCatalogDatabase",
 * });
 * ```
 */
export function getCatalogTableOutput(args: GetCatalogTableOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetCatalogTableResult> {
    return pulumi.output(args).apply((a: any) => getCatalogTable(a, opts))
}

/**
 * A collection of arguments for invoking getCatalogTable.
 */
export interface GetCatalogTableOutputArgs {
    /**
     * ID of the Glue Catalog and database where the table metadata resides. If omitted, this defaults to the current AWS Account ID.
     */
    catalogId?: pulumi.Input<string>;
    /**
     * Name of the metadata database where the table metadata resides.
     */
    databaseName: pulumi.Input<string>;
    /**
     * Name of the table.
     */
    name: pulumi.Input<string>;
    /**
     * The time as of when to read the table contents. If not set, the most recent transaction commit time will be used. Cannot be specified along with `transactionId`. Specified in RFC 3339 format, e.g. `2006-01-02T15:04:05Z07:00`.
     */
    queryAsOfTime?: pulumi.Input<string>;
    /**
     * The transaction ID at which to read the table contents.
     */
    transactionId?: pulumi.Input<number>;
}

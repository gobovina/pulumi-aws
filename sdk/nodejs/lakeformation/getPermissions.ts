// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Get permissions for a principal to access metadata in the Data Catalog and data organized in underlying data storage such as Amazon S3. Permissions are granted to a principal, in a Data Catalog, relative to a Lake Formation resource, which includes the Data Catalog, databases, tables, LF-tags, and LF-tag policies. For more information, see [Security and Access Control to Metadata and Data in Lake Formation](https://docs.aws.amazon.com/lake-formation/latest/dg/security-data-access.html).
 *
 * > **NOTE:** This data source deals with explicitly granted permissions. Lake Formation grants implicit permissions to data lake administrators, database creators, and table creators. For more information, see [Implicit Lake Formation Permissions](https://docs.aws.amazon.com/lake-formation/latest/dg/implicit-permissions.html).
 *
 * ## Example Usage
 *
 * ### Permissions For A Lake Formation S3 Resource
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const test = aws.lakeformation.getPermissions({
 *     principal: workflowRole.arn,
 *     dataLocation: {
 *         arn: testAwsLakeformationResource.arn,
 *     },
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ### Permissions For A Glue Catalog Database
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const test = aws.lakeformation.getPermissions({
 *     principal: workflowRole.arn,
 *     database: {
 *         name: testAwsGlueCatalogDatabase.name,
 *         catalogId: "110376042874",
 *     },
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ### Permissions For Tag-Based Access Control
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const test = aws.lakeformation.getPermissions({
 *     principal: workflowRole.arn,
 *     lfTagPolicy: {
 *         resourceType: "DATABASE",
 *         expressions: [
 *             {
 *                 key: "Team",
 *                 values: ["Sales"],
 *             },
 *             {
 *                 key: "Environment",
 *                 values: [
 *                     "Dev",
 *                     "Production",
 *                 ],
 *             },
 *         ],
 *     },
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getPermissions(args: GetPermissionsArgs, opts?: pulumi.InvokeOptions): Promise<GetPermissionsResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("aws:lakeformation/getPermissions:getPermissions", {
        "catalogId": args.catalogId,
        "catalogResource": args.catalogResource,
        "dataLocation": args.dataLocation,
        "database": args.database,
        "lfTag": args.lfTag,
        "lfTagPolicy": args.lfTagPolicy,
        "principal": args.principal,
        "table": args.table,
        "tableWithColumns": args.tableWithColumns,
    }, opts);
}

/**
 * A collection of arguments for invoking getPermissions.
 */
export interface GetPermissionsArgs {
    /**
     * Identifier for the Data Catalog. By default, the account ID. The Data Catalog is the persistent metadata store. It contains database definitions, table definitions, and other control information to manage your Lake Formation environment.
     */
    catalogId?: string;
    /**
     * Whether the permissions are to be granted for the Data Catalog. Defaults to `false`.
     */
    catalogResource?: boolean;
    /**
     * Configuration block for a data location resource. Detailed below.
     */
    dataLocation?: inputs.lakeformation.GetPermissionsDataLocation;
    /**
     * Configuration block for a database resource. Detailed below.
     */
    database?: inputs.lakeformation.GetPermissionsDatabase;
    /**
     * Configuration block for an LF-tag resource. Detailed below.
     */
    lfTag?: inputs.lakeformation.GetPermissionsLfTag;
    /**
     * Configuration block for an LF-tag policy resource. Detailed below.
     */
    lfTagPolicy?: inputs.lakeformation.GetPermissionsLfTagPolicy;
    /**
     * Principal to be granted the permissions on the resource. Supported principals are IAM users or IAM roles.
     *
     * One of the following is required:
     */
    principal: string;
    /**
     * Configuration block for a table resource. Detailed below.
     */
    table?: inputs.lakeformation.GetPermissionsTable;
    /**
     * Configuration block for a table with columns resource. Detailed below.
     *
     * The following arguments are optional:
     */
    tableWithColumns?: inputs.lakeformation.GetPermissionsTableWithColumns;
}

/**
 * A collection of values returned by getPermissions.
 */
export interface GetPermissionsResult {
    readonly catalogId?: string;
    readonly catalogResource?: boolean;
    readonly dataLocation: outputs.lakeformation.GetPermissionsDataLocation;
    readonly database: outputs.lakeformation.GetPermissionsDatabase;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly lfTag: outputs.lakeformation.GetPermissionsLfTag;
    readonly lfTagPolicy: outputs.lakeformation.GetPermissionsLfTagPolicy;
    /**
     * List of permissions granted to the principal. For details on permissions, see [Lake Formation Permissions Reference](https://docs.aws.amazon.com/lake-formation/latest/dg/lf-permissions-reference.html).
     */
    readonly permissions: string[];
    /**
     * Subset of `permissions` which the principal can pass.
     */
    readonly permissionsWithGrantOptions: string[];
    readonly principal: string;
    readonly table: outputs.lakeformation.GetPermissionsTable;
    readonly tableWithColumns: outputs.lakeformation.GetPermissionsTableWithColumns;
}
/**
 * Get permissions for a principal to access metadata in the Data Catalog and data organized in underlying data storage such as Amazon S3. Permissions are granted to a principal, in a Data Catalog, relative to a Lake Formation resource, which includes the Data Catalog, databases, tables, LF-tags, and LF-tag policies. For more information, see [Security and Access Control to Metadata and Data in Lake Formation](https://docs.aws.amazon.com/lake-formation/latest/dg/security-data-access.html).
 *
 * > **NOTE:** This data source deals with explicitly granted permissions. Lake Formation grants implicit permissions to data lake administrators, database creators, and table creators. For more information, see [Implicit Lake Formation Permissions](https://docs.aws.amazon.com/lake-formation/latest/dg/implicit-permissions.html).
 *
 * ## Example Usage
 *
 * ### Permissions For A Lake Formation S3 Resource
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const test = aws.lakeformation.getPermissions({
 *     principal: workflowRole.arn,
 *     dataLocation: {
 *         arn: testAwsLakeformationResource.arn,
 *     },
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ### Permissions For A Glue Catalog Database
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const test = aws.lakeformation.getPermissions({
 *     principal: workflowRole.arn,
 *     database: {
 *         name: testAwsGlueCatalogDatabase.name,
 *         catalogId: "110376042874",
 *     },
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ### Permissions For Tag-Based Access Control
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const test = aws.lakeformation.getPermissions({
 *     principal: workflowRole.arn,
 *     lfTagPolicy: {
 *         resourceType: "DATABASE",
 *         expressions: [
 *             {
 *                 key: "Team",
 *                 values: ["Sales"],
 *             },
 *             {
 *                 key: "Environment",
 *                 values: [
 *                     "Dev",
 *                     "Production",
 *                 ],
 *             },
 *         ],
 *     },
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getPermissionsOutput(args: GetPermissionsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetPermissionsResult> {
    return pulumi.output(args).apply((a: any) => getPermissions(a, opts))
}

/**
 * A collection of arguments for invoking getPermissions.
 */
export interface GetPermissionsOutputArgs {
    /**
     * Identifier for the Data Catalog. By default, the account ID. The Data Catalog is the persistent metadata store. It contains database definitions, table definitions, and other control information to manage your Lake Formation environment.
     */
    catalogId?: pulumi.Input<string>;
    /**
     * Whether the permissions are to be granted for the Data Catalog. Defaults to `false`.
     */
    catalogResource?: pulumi.Input<boolean>;
    /**
     * Configuration block for a data location resource. Detailed below.
     */
    dataLocation?: pulumi.Input<inputs.lakeformation.GetPermissionsDataLocationArgs>;
    /**
     * Configuration block for a database resource. Detailed below.
     */
    database?: pulumi.Input<inputs.lakeformation.GetPermissionsDatabaseArgs>;
    /**
     * Configuration block for an LF-tag resource. Detailed below.
     */
    lfTag?: pulumi.Input<inputs.lakeformation.GetPermissionsLfTagArgs>;
    /**
     * Configuration block for an LF-tag policy resource. Detailed below.
     */
    lfTagPolicy?: pulumi.Input<inputs.lakeformation.GetPermissionsLfTagPolicyArgs>;
    /**
     * Principal to be granted the permissions on the resource. Supported principals are IAM users or IAM roles.
     *
     * One of the following is required:
     */
    principal: pulumi.Input<string>;
    /**
     * Configuration block for a table resource. Detailed below.
     */
    table?: pulumi.Input<inputs.lakeformation.GetPermissionsTableArgs>;
    /**
     * Configuration block for a table with columns resource. Detailed below.
     *
     * The following arguments are optional:
     */
    tableWithColumns?: pulumi.Input<inputs.lakeformation.GetPermissionsTableWithColumnsArgs>;
}

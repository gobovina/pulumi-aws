// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * ## Example Usage
 *
 * List the event categories of all the RDS resources.
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * export = async () => {
 *     const example = await aws.rds.getEventCategories({});
 *     return {
 *         example: example.eventCategories,
 *     };
 * }
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * List the event categories specific to the RDS resource `db-snapshot`.
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * export = async () => {
 *     const example = await aws.rds.getEventCategories({
 *         sourceType: "db-snapshot",
 *     });
 *     return {
 *         example: example.eventCategories,
 *     };
 * }
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getEventCategories(args?: GetEventCategoriesArgs, opts?: pulumi.InvokeOptions): Promise<GetEventCategoriesResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("aws:rds/getEventCategories:getEventCategories", {
        "sourceType": args.sourceType,
    }, opts);
}

/**
 * A collection of arguments for invoking getEventCategories.
 */
export interface GetEventCategoriesArgs {
    /**
     * Type of source that will be generating the events. Valid options are db-instance, db-security-group, db-parameter-group, db-snapshot, db-cluster or db-cluster-snapshot.
     */
    sourceType?: string;
}

/**
 * A collection of values returned by getEventCategories.
 */
export interface GetEventCategoriesResult {
    /**
     * List of the event categories.
     */
    readonly eventCategories: string[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly sourceType?: string;
}
/**
 * ## Example Usage
 *
 * List the event categories of all the RDS resources.
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * export = async () => {
 *     const example = await aws.rds.getEventCategories({});
 *     return {
 *         example: example.eventCategories,
 *     };
 * }
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * List the event categories specific to the RDS resource `db-snapshot`.
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * export = async () => {
 *     const example = await aws.rds.getEventCategories({
 *         sourceType: "db-snapshot",
 *     });
 *     return {
 *         example: example.eventCategories,
 *     };
 * }
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getEventCategoriesOutput(args?: GetEventCategoriesOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetEventCategoriesResult> {
    return pulumi.output(args).apply((a: any) => getEventCategories(a, opts))
}

/**
 * A collection of arguments for invoking getEventCategories.
 */
export interface GetEventCategoriesOutputArgs {
    /**
     * Type of source that will be generating the events. Valid options are db-instance, db-security-group, db-parameter-group, db-snapshot, db-cluster or db-cluster-snapshot.
     */
    sourceType?: pulumi.Input<string>;
}

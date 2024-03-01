// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Provides details about a specific Amazon Connect User Hierarchy Structure
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const test = aws.connect.getUserHierarchyStructure({
 *     instanceId: testAwsConnectInstance.id,
 * });
 * ```
 */
export function getUserHierarchyStructure(args: GetUserHierarchyStructureArgs, opts?: pulumi.InvokeOptions): Promise<GetUserHierarchyStructureResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("aws:connect/getUserHierarchyStructure:getUserHierarchyStructure", {
        "instanceId": args.instanceId,
    }, opts);
}

/**
 * A collection of arguments for invoking getUserHierarchyStructure.
 */
export interface GetUserHierarchyStructureArgs {
    /**
     * Reference to the hosting Amazon Connect Instance
     */
    instanceId: string;
}

/**
 * A collection of values returned by getUserHierarchyStructure.
 */
export interface GetUserHierarchyStructureResult {
    /**
     * Block that defines the hierarchy structure's levels. The `hierarchyStructure` block is documented below.
     */
    readonly hierarchyStructures: outputs.connect.GetUserHierarchyStructureHierarchyStructure[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly instanceId: string;
}
/**
 * Provides details about a specific Amazon Connect User Hierarchy Structure
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const test = aws.connect.getUserHierarchyStructure({
 *     instanceId: testAwsConnectInstance.id,
 * });
 * ```
 */
export function getUserHierarchyStructureOutput(args: GetUserHierarchyStructureOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetUserHierarchyStructureResult> {
    return pulumi.output(args).apply((a: any) => getUserHierarchyStructure(a, opts))
}

/**
 * A collection of arguments for invoking getUserHierarchyStructure.
 */
export interface GetUserHierarchyStructureOutputArgs {
    /**
     * Reference to the hosting Amazon Connect Instance
     */
    instanceId: pulumi.Input<string>;
}

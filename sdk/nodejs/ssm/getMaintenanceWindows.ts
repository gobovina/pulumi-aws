// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Use this data source to get the window IDs of SSM maintenance windows.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = aws.ssm.getMaintenanceWindows({
 *     filters: [{
 *         name: "Enabled",
 *         values: ["true"],
 *     }],
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getMaintenanceWindows(args?: GetMaintenanceWindowsArgs, opts?: pulumi.InvokeOptions): Promise<GetMaintenanceWindowsResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("aws:ssm/getMaintenanceWindows:getMaintenanceWindows", {
        "filters": args.filters,
    }, opts);
}

/**
 * A collection of arguments for invoking getMaintenanceWindows.
 */
export interface GetMaintenanceWindowsArgs {
    /**
     * Configuration block(s) for filtering. Detailed below.
     */
    filters?: inputs.ssm.GetMaintenanceWindowsFilter[];
}

/**
 * A collection of values returned by getMaintenanceWindows.
 */
export interface GetMaintenanceWindowsResult {
    readonly filters?: outputs.ssm.GetMaintenanceWindowsFilter[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * List of window IDs of the matched SSM maintenance windows.
     */
    readonly ids: string[];
}
/**
 * Use this data source to get the window IDs of SSM maintenance windows.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = aws.ssm.getMaintenanceWindows({
 *     filters: [{
 *         name: "Enabled",
 *         values: ["true"],
 *     }],
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getMaintenanceWindowsOutput(args?: GetMaintenanceWindowsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetMaintenanceWindowsResult> {
    return pulumi.output(args).apply((a: any) => getMaintenanceWindows(a, opts))
}

/**
 * A collection of arguments for invoking getMaintenanceWindows.
 */
export interface GetMaintenanceWindowsOutputArgs {
    /**
     * Configuration block(s) for filtering. Detailed below.
     */
    filters?: pulumi.Input<pulumi.Input<inputs.ssm.GetMaintenanceWindowsFilterArgs>[]>;
}

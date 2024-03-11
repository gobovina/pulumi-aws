// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Retrieve information about an AWS WorkSpaces bundle.
 *
 * ## Example Usage
 *
 * ### By ID
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = aws.workspaces.getBundle({
 *     bundleId: "wsb-b0s22j3d7",
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ### By Owner & Name
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = aws.workspaces.getBundle({
 *     owner: "AMAZON",
 *     name: "Value with Windows 10 and Office 2016",
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getBundle(args?: GetBundleArgs, opts?: pulumi.InvokeOptions): Promise<GetBundleResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("aws:workspaces/getBundle:getBundle", {
        "bundleId": args.bundleId,
        "name": args.name,
        "owner": args.owner,
    }, opts);
}

/**
 * A collection of arguments for invoking getBundle.
 */
export interface GetBundleArgs {
    /**
     * ID of the bundle.
     */
    bundleId?: string;
    /**
     * Name of the bundle. You cannot combine this parameter with `bundleId`.
     */
    name?: string;
    /**
     * Owner of the bundles. You have to leave it blank for own bundles. You cannot combine this parameter with `bundleId`.
     */
    owner?: string;
}

/**
 * A collection of values returned by getBundle.
 */
export interface GetBundleResult {
    /**
     * The ID of the bundle.
     */
    readonly bundleId?: string;
    /**
     * The compute type. See supported fields below.
     */
    readonly computeTypes: outputs.workspaces.GetBundleComputeType[];
    /**
     * The description of the bundle.
     */
    readonly description: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Name of the compute type.
     */
    readonly name?: string;
    /**
     * The owner of the bundle.
     */
    readonly owner?: string;
    /**
     * The root volume. See supported fields below.
     */
    readonly rootStorages: outputs.workspaces.GetBundleRootStorage[];
    /**
     * The user storage. See supported fields below.
     */
    readonly userStorages: outputs.workspaces.GetBundleUserStorage[];
}
/**
 * Retrieve information about an AWS WorkSpaces bundle.
 *
 * ## Example Usage
 *
 * ### By ID
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = aws.workspaces.getBundle({
 *     bundleId: "wsb-b0s22j3d7",
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ### By Owner & Name
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = aws.workspaces.getBundle({
 *     owner: "AMAZON",
 *     name: "Value with Windows 10 and Office 2016",
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getBundleOutput(args?: GetBundleOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetBundleResult> {
    return pulumi.output(args).apply((a: any) => getBundle(a, opts))
}

/**
 * A collection of arguments for invoking getBundle.
 */
export interface GetBundleOutputArgs {
    /**
     * ID of the bundle.
     */
    bundleId?: pulumi.Input<string>;
    /**
     * Name of the bundle. You cannot combine this parameter with `bundleId`.
     */
    name?: pulumi.Input<string>;
    /**
     * Owner of the bundles. You have to leave it blank for own bundles. You cannot combine this parameter with `bundleId`.
     */
    owner?: pulumi.Input<string>;
}

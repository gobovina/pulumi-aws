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
 * The following shows outputting all network interface ids in a region.
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * export = async () => {
 *     const example = await aws.ec2.getNetworkInterfaces({});
 *     return {
 *         example: example.ids,
 *     };
 * }
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * The following example retrieves a list of all network interface ids with a custom tag of `Name` set to a value of `test`.
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = aws.ec2.getNetworkInterfaces({
 *     tags: {
 *         Name: "test",
 *     },
 * });
 * export const example1 = example.then(example => example.ids);
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * The following example retrieves a network interface ids which associated
 * with specific subnet.
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * export = async () => {
 *     const example = await aws.ec2.getNetworkInterfaces({
 *         filters: [{
 *             name: "subnet-id",
 *             values: [test.id],
 *         }],
 *     });
 *     return {
 *         example: example.ids,
 *     };
 * }
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getNetworkInterfaces(args?: GetNetworkInterfacesArgs, opts?: pulumi.InvokeOptions): Promise<GetNetworkInterfacesResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("aws:ec2/getNetworkInterfaces:getNetworkInterfaces", {
        "filters": args.filters,
        "tags": args.tags,
    }, opts);
}

/**
 * A collection of arguments for invoking getNetworkInterfaces.
 */
export interface GetNetworkInterfacesArgs {
    /**
     * Custom filter block as described below.
     *
     * More complex filters can be expressed using one or more `filter` sub-blocks,
     * which take the following arguments:
     */
    filters?: inputs.ec2.GetNetworkInterfacesFilter[];
    /**
     * Map of tags, each pair of which must exactly match
     * a pair on the desired network interfaces.
     */
    tags?: {[key: string]: string};
}

/**
 * A collection of values returned by getNetworkInterfaces.
 */
export interface GetNetworkInterfacesResult {
    readonly filters?: outputs.ec2.GetNetworkInterfacesFilter[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * List of all the network interface ids found.
     */
    readonly ids: string[];
    readonly tags: {[key: string]: string};
}
/**
 * ## Example Usage
 *
 * The following shows outputting all network interface ids in a region.
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * export = async () => {
 *     const example = await aws.ec2.getNetworkInterfaces({});
 *     return {
 *         example: example.ids,
 *     };
 * }
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * The following example retrieves a list of all network interface ids with a custom tag of `Name` set to a value of `test`.
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = aws.ec2.getNetworkInterfaces({
 *     tags: {
 *         Name: "test",
 *     },
 * });
 * export const example1 = example.then(example => example.ids);
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * The following example retrieves a network interface ids which associated
 * with specific subnet.
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * export = async () => {
 *     const example = await aws.ec2.getNetworkInterfaces({
 *         filters: [{
 *             name: "subnet-id",
 *             values: [test.id],
 *         }],
 *     });
 *     return {
 *         example: example.ids,
 *     };
 * }
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getNetworkInterfacesOutput(args?: GetNetworkInterfacesOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetNetworkInterfacesResult> {
    return pulumi.output(args).apply((a: any) => getNetworkInterfaces(a, opts))
}

/**
 * A collection of arguments for invoking getNetworkInterfaces.
 */
export interface GetNetworkInterfacesOutputArgs {
    /**
     * Custom filter block as described below.
     *
     * More complex filters can be expressed using one or more `filter` sub-blocks,
     * which take the following arguments:
     */
    filters?: pulumi.Input<pulumi.Input<inputs.ec2.GetNetworkInterfacesFilterArgs>[]>;
    /**
     * Map of tags, each pair of which must exactly match
     * a pair on the desired network interfaces.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}

// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Data source for getting information about AWS EC2 Public IPv4 Pools.
 *
 * ## Example Usage
 *
 * ### Basic Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * // Returns all public IPv4 pools.
 * const example = aws.ec2.getPublicIpv4Pools({});
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ### Usage with Filter
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = aws.ec2.getPublicIpv4Pools({
 *     filters: [{
 *         name: "tag-key",
 *         values: ["ExampleTagKey"],
 *     }],
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getPublicIpv4Pools(args?: GetPublicIpv4PoolsArgs, opts?: pulumi.InvokeOptions): Promise<GetPublicIpv4PoolsResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("aws:ec2/getPublicIpv4Pools:getPublicIpv4Pools", {
        "filters": args.filters,
        "tags": args.tags,
    }, opts);
}

/**
 * A collection of arguments for invoking getPublicIpv4Pools.
 */
export interface GetPublicIpv4PoolsArgs {
    /**
     * Custom filter block as described below.
     */
    filters?: inputs.ec2.GetPublicIpv4PoolsFilter[];
    /**
     * Map of tags, each pair of which must exactly match a pair on the desired pools.
     *
     * More complex filters can be expressed using one or more `filter` sub-blocks,
     * which take the following arguments:
     */
    tags?: {[key: string]: string};
}

/**
 * A collection of values returned by getPublicIpv4Pools.
 */
export interface GetPublicIpv4PoolsResult {
    readonly filters?: outputs.ec2.GetPublicIpv4PoolsFilter[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * List of all the pool IDs found.
     */
    readonly poolIds: string[];
    readonly tags: {[key: string]: string};
}
/**
 * Data source for getting information about AWS EC2 Public IPv4 Pools.
 *
 * ## Example Usage
 *
 * ### Basic Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * // Returns all public IPv4 pools.
 * const example = aws.ec2.getPublicIpv4Pools({});
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ### Usage with Filter
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = aws.ec2.getPublicIpv4Pools({
 *     filters: [{
 *         name: "tag-key",
 *         values: ["ExampleTagKey"],
 *     }],
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getPublicIpv4PoolsOutput(args?: GetPublicIpv4PoolsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetPublicIpv4PoolsResult> {
    return pulumi.output(args).apply((a: any) => getPublicIpv4Pools(a, opts))
}

/**
 * A collection of arguments for invoking getPublicIpv4Pools.
 */
export interface GetPublicIpv4PoolsOutputArgs {
    /**
     * Custom filter block as described below.
     */
    filters?: pulumi.Input<pulumi.Input<inputs.ec2.GetPublicIpv4PoolsFilterArgs>[]>;
    /**
     * Map of tags, each pair of which must exactly match a pair on the desired pools.
     *
     * More complex filters can be expressed using one or more `filter` sub-blocks,
     * which take the following arguments:
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}

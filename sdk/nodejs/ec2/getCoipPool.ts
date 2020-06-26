// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Provides details about a specific EC2 Customer-Owned IP Pool.
 *
 * This data source can prove useful when a module accepts a coip pool id as
 * an input variable and needs to, for example, determine the CIDR block of that
 * COIP Pool.
 *
 * ## Example Usage
 *
 * The following example returns a specific coip pool ID
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const config = new pulumi.Config();
 * const coipPoolId = config.require("coipPoolId");
 *
 * const selected = pulumi.output(aws.ec2.getCoipPool({
 *     id: coipPoolId,
 * }, { async: true }));
 * ```
 */
export function getCoipPool(args?: GetCoipPoolArgs, opts?: pulumi.InvokeOptions): Promise<GetCoipPoolResult> {
    args = args || {};
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    return pulumi.runtime.invoke("aws:ec2/getCoipPool:getCoipPool", {
        "filters": args.filters,
        "localGatewayRouteTableId": args.localGatewayRouteTableId,
        "poolId": args.poolId,
        "tags": args.tags,
    }, opts);
}

/**
 * A collection of arguments for invoking getCoipPool.
 */
export interface GetCoipPoolArgs {
    readonly filters?: inputs.ec2.GetCoipPoolFilter[];
    /**
     * Local Gateway Route Table Id assigned to desired COIP Pool
     */
    readonly localGatewayRouteTableId?: string;
    /**
     * The id of the specific COIP Pool to retrieve.
     */
    readonly poolId?: string;
    /**
     * A mapping of tags, each pair of which must exactly match
     * a pair on the desired COIP Pool.
     */
    readonly tags?: {[key: string]: string};
}

/**
 * A collection of values returned by getCoipPool.
 */
export interface GetCoipPoolResult {
    readonly filters?: outputs.ec2.GetCoipPoolFilter[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly localGatewayRouteTableId: string;
    /**
     * Set of CIDR blocks in pool
     */
    readonly poolCidrs: string[];
    readonly poolId: string;
    readonly tags: {[key: string]: string};
}

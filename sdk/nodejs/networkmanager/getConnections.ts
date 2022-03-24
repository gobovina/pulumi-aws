// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Retrieve information about connections.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = aws.networkmanager.getConnections({
 *     globalNetworkId: _var.global_network_id,
 *     tags: {
 *         Env: "test",
 *     },
 * });
 * ```
 */
export function getConnections(args: GetConnectionsArgs, opts?: pulumi.InvokeOptions): Promise<GetConnectionsResult> {
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("aws:networkmanager/getConnections:getConnections", {
        "deviceId": args.deviceId,
        "globalNetworkId": args.globalNetworkId,
        "tags": args.tags,
    }, opts);
}

/**
 * A collection of arguments for invoking getConnections.
 */
export interface GetConnectionsArgs {
    /**
     * The ID of the device of the connections to retrieve.
     */
    deviceId?: string;
    /**
     * The ID of the Global Network of the connections to retrieve.
     */
    globalNetworkId: string;
    /**
     * Restricts the list to the connections with these tags.
     */
    tags?: {[key: string]: string};
}

/**
 * A collection of values returned by getConnections.
 */
export interface GetConnectionsResult {
    readonly deviceId?: string;
    readonly globalNetworkId: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * The IDs of the connections.
     */
    readonly ids: string[];
    readonly tags?: {[key: string]: string};
}

export function getConnectionsOutput(args: GetConnectionsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetConnectionsResult> {
    return pulumi.output(args).apply(a => getConnections(a, opts))
}

/**
 * A collection of arguments for invoking getConnections.
 */
export interface GetConnectionsOutputArgs {
    /**
     * The ID of the device of the connections to retrieve.
     */
    deviceId?: pulumi.Input<string>;
    /**
     * The ID of the Global Network of the connections to retrieve.
     */
    globalNetworkId: pulumi.Input<string>;
    /**
     * Restricts the list to the connections with these tags.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}

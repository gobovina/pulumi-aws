// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Retrieve information about a connection.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = aws.networkmanager.getConnection({
 *     globalNetworkId: globalNetworkId,
 *     connectionId: connectionId,
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getConnection(args: GetConnectionArgs, opts?: pulumi.InvokeOptions): Promise<GetConnectionResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("aws:networkmanager/getConnection:getConnection", {
        "connectionId": args.connectionId,
        "globalNetworkId": args.globalNetworkId,
        "tags": args.tags,
    }, opts);
}

/**
 * A collection of arguments for invoking getConnection.
 */
export interface GetConnectionArgs {
    /**
     * ID of the specific connection to retrieve.
     */
    connectionId: string;
    /**
     * ID of the Global Network of the connection to retrieve.
     */
    globalNetworkId: string;
    /**
     * Key-value tags for the connection.
     */
    tags?: {[key: string]: string};
}

/**
 * A collection of values returned by getConnection.
 */
export interface GetConnectionResult {
    /**
     * ARN of the connection.
     */
    readonly arn: string;
    /**
     * ID of the second device in the connection.
     */
    readonly connectedDeviceId: string;
    /**
     * ID of the link for the second device.
     */
    readonly connectedLinkId: string;
    readonly connectionId: string;
    /**
     * Description of the connection.
     */
    readonly description: string;
    /**
     * ID of the first device in the connection.
     */
    readonly deviceId: string;
    readonly globalNetworkId: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * ID of the link for the first device.
     */
    readonly linkId: string;
    /**
     * Key-value tags for the connection.
     */
    readonly tags: {[key: string]: string};
}
/**
 * Retrieve information about a connection.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = aws.networkmanager.getConnection({
 *     globalNetworkId: globalNetworkId,
 *     connectionId: connectionId,
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getConnectionOutput(args: GetConnectionOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetConnectionResult> {
    return pulumi.output(args).apply((a: any) => getConnection(a, opts))
}

/**
 * A collection of arguments for invoking getConnection.
 */
export interface GetConnectionOutputArgs {
    /**
     * ID of the specific connection to retrieve.
     */
    connectionId: pulumi.Input<string>;
    /**
     * ID of the Global Network of the connection to retrieve.
     */
    globalNetworkId: pulumi.Input<string>;
    /**
     * Key-value tags for the connection.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}

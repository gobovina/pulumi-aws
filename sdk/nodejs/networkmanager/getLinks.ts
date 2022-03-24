// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Retrieve information about link.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = aws.networkmanager.getLinks({
 *     globalNetworkId: _var.global_network_id,
 *     tags: {
 *         Env: "test",
 *     },
 * });
 * ```
 */
export function getLinks(args: GetLinksArgs, opts?: pulumi.InvokeOptions): Promise<GetLinksResult> {
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("aws:networkmanager/getLinks:getLinks", {
        "globalNetworkId": args.globalNetworkId,
        "providerName": args.providerName,
        "siteId": args.siteId,
        "tags": args.tags,
        "type": args.type,
    }, opts);
}

/**
 * A collection of arguments for invoking getLinks.
 */
export interface GetLinksArgs {
    /**
     * The ID of the Global Network of the links to retrieve.
     */
    globalNetworkId: string;
    /**
     * The link provider to retrieve.
     */
    providerName?: string;
    /**
     * The ID of the site of the links to retrieve.
     */
    siteId?: string;
    /**
     * Restricts the list to the links with these tags.
     */
    tags?: {[key: string]: string};
    /**
     * The link type to retrieve.
     */
    type?: string;
}

/**
 * A collection of values returned by getLinks.
 */
export interface GetLinksResult {
    readonly globalNetworkId: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * The IDs of the links.
     */
    readonly ids: string[];
    readonly providerName?: string;
    readonly siteId?: string;
    readonly tags?: {[key: string]: string};
    readonly type?: string;
}

export function getLinksOutput(args: GetLinksOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetLinksResult> {
    return pulumi.output(args).apply(a => getLinks(a, opts))
}

/**
 * A collection of arguments for invoking getLinks.
 */
export interface GetLinksOutputArgs {
    /**
     * The ID of the Global Network of the links to retrieve.
     */
    globalNetworkId: pulumi.Input<string>;
    /**
     * The link provider to retrieve.
     */
    providerName?: pulumi.Input<string>;
    /**
     * The ID of the site of the links to retrieve.
     */
    siteId?: pulumi.Input<string>;
    /**
     * Restricts the list to the links with these tags.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The link type to retrieve.
     */
    type?: pulumi.Input<string>;
}

// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Retrieves information about a Service Discovery private or public DNS namespace.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const test = aws.servicediscovery.getDnsNamespace({
 *     name: "example.service.local",
 *     type: "DNS_PRIVATE",
 * });
 * ```
 */
export function getDnsNamespace(args: GetDnsNamespaceArgs, opts?: pulumi.InvokeOptions): Promise<GetDnsNamespaceResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("aws:servicediscovery/getDnsNamespace:getDnsNamespace", {
        "name": args.name,
        "tags": args.tags,
        "type": args.type,
    }, opts);
}

/**
 * A collection of arguments for invoking getDnsNamespace.
 */
export interface GetDnsNamespaceArgs {
    /**
     * Name of the namespace.
     */
    name: string;
    /**
     * Map of tags for the resource.
     */
    tags?: {[key: string]: string};
    /**
     * Type of the namespace. Allowed values are `DNS_PUBLIC` or `DNS_PRIVATE`.
     */
    type: string;
}

/**
 * A collection of values returned by getDnsNamespace.
 */
export interface GetDnsNamespaceResult {
    /**
     * ARN of the namespace.
     */
    readonly arn: string;
    /**
     * Description of the namespace.
     */
    readonly description: string;
    /**
     * ID for the hosted zone that Amazon Route 53 creates when you create a namespace.
     */
    readonly hostedZone: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly name: string;
    /**
     * Map of tags for the resource.
     */
    readonly tags: {[key: string]: string};
    readonly type: string;
}
/**
 * Retrieves information about a Service Discovery private or public DNS namespace.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const test = aws.servicediscovery.getDnsNamespace({
 *     name: "example.service.local",
 *     type: "DNS_PRIVATE",
 * });
 * ```
 */
export function getDnsNamespaceOutput(args: GetDnsNamespaceOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetDnsNamespaceResult> {
    return pulumi.output(args).apply((a: any) => getDnsNamespace(a, opts))
}

/**
 * A collection of arguments for invoking getDnsNamespace.
 */
export interface GetDnsNamespaceOutputArgs {
    /**
     * Name of the namespace.
     */
    name: pulumi.Input<string>;
    /**
     * Map of tags for the resource.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Type of the namespace. Allowed values are `DNS_PUBLIC` or `DNS_PRIVATE`.
     */
    type: pulumi.Input<string>;
}

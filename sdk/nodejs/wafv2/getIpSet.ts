// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Retrieves the summary of a WAFv2 IP Set.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = aws.wafv2.getIpSet({
 *     name: "some-ip-set",
 *     scope: "REGIONAL",
 * });
 * ```
 */
export function getIpSet(args: GetIpSetArgs, opts?: pulumi.InvokeOptions): Promise<GetIpSetResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("aws:wafv2/getIpSet:getIpSet", {
        "name": args.name,
        "scope": args.scope,
    }, opts);
}

/**
 * A collection of arguments for invoking getIpSet.
 */
export interface GetIpSetArgs {
    /**
     * Name of the WAFv2 IP Set.
     */
    name: string;
    /**
     * Specifies whether this is for an AWS CloudFront distribution or for a regional application. Valid values are `CLOUDFRONT` or `REGIONAL`. To work with CloudFront, you must also specify the region `us-east-1` (N. Virginia) on the AWS provider.
     */
    scope: string;
}

/**
 * A collection of values returned by getIpSet.
 */
export interface GetIpSetResult {
    /**
     * An array of strings that specify one or more IP addresses or blocks of IP addresses in Classless Inter-Domain Routing (CIDR) notation.
     */
    readonly addresses: string[];
    /**
     * ARN of the entity.
     */
    readonly arn: string;
    /**
     * Description of the set that helps with identification.
     */
    readonly description: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * IP address version of the set.
     */
    readonly ipAddressVersion: string;
    readonly name: string;
    readonly scope: string;
}
/**
 * Retrieves the summary of a WAFv2 IP Set.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = aws.wafv2.getIpSet({
 *     name: "some-ip-set",
 *     scope: "REGIONAL",
 * });
 * ```
 */
export function getIpSetOutput(args: GetIpSetOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetIpSetResult> {
    return pulumi.output(args).apply((a: any) => getIpSet(a, opts))
}

/**
 * A collection of arguments for invoking getIpSet.
 */
export interface GetIpSetOutputArgs {
    /**
     * Name of the WAFv2 IP Set.
     */
    name: pulumi.Input<string>;
    /**
     * Specifies whether this is for an AWS CloudFront distribution or for a regional application. Valid values are `CLOUDFRONT` or `REGIONAL`. To work with CloudFront, you must also specify the region `us-east-1` (N. Virginia) on the AWS provider.
     */
    scope: pulumi.Input<string>;
}

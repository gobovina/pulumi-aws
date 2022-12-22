// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * `aws.getRegion` provides details about a specific AWS region.
 *
 * As well as validating a given region name this resource can be used to
 * discover the name of the region configured within the provider. The latter
 * can be useful in a child module which is inheriting an AWS provider
 * configuration from its parent module.
 *
 * ## Example Usage
 *
 * The following example shows how the resource might be used to obtain
 * the name of the AWS region configured on the provider.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const current = aws.getRegion({});
 * ```
 */
export function getRegion(args?: GetRegionArgs, opts?: pulumi.InvokeOptions): Promise<GetRegionResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("aws:index/getRegion:getRegion", {
        "endpoint": args.endpoint,
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getRegion.
 */
export interface GetRegionArgs {
    /**
     * EC2 endpoint of the region to select.
     */
    endpoint?: string;
    /**
     * Full name of the region to select.
     */
    name?: string;
}

/**
 * A collection of values returned by getRegion.
 */
export interface GetRegionResult {
    /**
     * Region's description in this format: "Location (Region name)".
     */
    readonly description: string;
    /**
     * EC2 endpoint for the selected region.
     */
    readonly endpoint: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Name of the selected region.
     */
    readonly name: string;
}
/**
 * `aws.getRegion` provides details about a specific AWS region.
 *
 * As well as validating a given region name this resource can be used to
 * discover the name of the region configured within the provider. The latter
 * can be useful in a child module which is inheriting an AWS provider
 * configuration from its parent module.
 *
 * ## Example Usage
 *
 * The following example shows how the resource might be used to obtain
 * the name of the AWS region configured on the provider.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const current = aws.getRegion({});
 * ```
 */
export function getRegionOutput(args?: GetRegionOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetRegionResult> {
    return pulumi.output(args).apply((a: any) => getRegion(a, opts))
}

/**
 * A collection of arguments for invoking getRegion.
 */
export interface GetRegionOutputArgs {
    /**
     * EC2 endpoint of the region to select.
     */
    endpoint?: pulumi.Input<string>;
    /**
     * Full name of the region to select.
     */
    name?: pulumi.Input<string>;
}

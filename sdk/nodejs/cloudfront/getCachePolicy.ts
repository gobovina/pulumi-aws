// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Use this data source to retrieve information about a CloudFront cache policy.
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
 * const example = aws.cloudfront.getCachePolicy({
 *     name: "example-policy",
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ### AWS-Managed Policies
 *
 * AWS managed cache policy names are prefixed with `Managed-`:
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = aws.cloudfront.getCachePolicy({
 *     name: "Managed-CachingOptimized",
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getCachePolicy(args?: GetCachePolicyArgs, opts?: pulumi.InvokeOptions): Promise<GetCachePolicyResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("aws:cloudfront/getCachePolicy:getCachePolicy", {
        "id": args.id,
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getCachePolicy.
 */
export interface GetCachePolicyArgs {
    /**
     * Identifier for the cache policy.
     */
    id?: string;
    /**
     * Unique name to identify the cache policy.
     */
    name?: string;
}

/**
 * A collection of values returned by getCachePolicy.
 */
export interface GetCachePolicyResult {
    /**
     * Comment to describe the cache policy.
     */
    readonly comment: string;
    /**
     * Default amount of time, in seconds, that you want objects to stay in the CloudFront cache before CloudFront sends another request to the origin to see if the object has been updated.
     */
    readonly defaultTtl: number;
    /**
     * Current version of the cache policy.
     */
    readonly etag: string;
    readonly id?: string;
    /**
     * Maximum amount of time, in seconds, that objects stay in the CloudFront cache before CloudFront sends another request to the origin to see if the object has been updated.
     */
    readonly maxTtl: number;
    /**
     * Minimum amount of time, in seconds, that you want objects to stay in the CloudFront cache before CloudFront sends another request to the origin to see if the object has been updated.
     */
    readonly minTtl: number;
    readonly name?: string;
    /**
     * The HTTP headers, cookies, and URL query strings to include in the cache key. See Parameters In Cache Key And Forwarded To Origin for more information.
     */
    readonly parametersInCacheKeyAndForwardedToOrigins: outputs.cloudfront.GetCachePolicyParametersInCacheKeyAndForwardedToOrigin[];
}
/**
 * Use this data source to retrieve information about a CloudFront cache policy.
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
 * const example = aws.cloudfront.getCachePolicy({
 *     name: "example-policy",
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ### AWS-Managed Policies
 *
 * AWS managed cache policy names are prefixed with `Managed-`:
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = aws.cloudfront.getCachePolicy({
 *     name: "Managed-CachingOptimized",
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getCachePolicyOutput(args?: GetCachePolicyOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetCachePolicyResult> {
    return pulumi.output(args).apply((a: any) => getCachePolicy(a, opts))
}

/**
 * A collection of arguments for invoking getCachePolicy.
 */
export interface GetCachePolicyOutputArgs {
    /**
     * Identifier for the cache policy.
     */
    id?: pulumi.Input<string>;
    /**
     * Unique name to identify the cache policy.
     */
    name?: pulumi.Input<string>;
}

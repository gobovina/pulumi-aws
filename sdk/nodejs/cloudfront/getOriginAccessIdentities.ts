// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Use this data source to get ARNs, ids and S3 canonical user IDs of Amazon CloudFront origin access identities.
 *
 * ## Example Usage
 * ### All origin access identities in the account
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = aws.cloudfront.getOriginAccessIdentities({});
 * ```
 * ### Origin access identities filtered by comment/name
 *
 * Origin access identities whose comments are `example-comment1`, `example-comment2`
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = aws.cloudfront.getOriginAccessIdentities({
 *     comments: [
 *         "example-comment1",
 *         "example-comment2",
 *     ],
 * });
 * ```
 */
export function getOriginAccessIdentities(args?: GetOriginAccessIdentitiesArgs, opts?: pulumi.InvokeOptions): Promise<GetOriginAccessIdentitiesResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("aws:cloudfront/getOriginAccessIdentities:getOriginAccessIdentities", {
        "comments": args.comments,
    }, opts);
}

/**
 * A collection of arguments for invoking getOriginAccessIdentities.
 */
export interface GetOriginAccessIdentitiesArgs {
    /**
     * Filter origin access identities by comment.
     */
    comments?: string[];
}

/**
 * A collection of values returned by getOriginAccessIdentities.
 */
export interface GetOriginAccessIdentitiesResult {
    readonly comments?: string[];
    /**
     * Set of ARNs of the matched origin access identities.
     */
    readonly iamArns: string[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Set of ids of the matched origin access identities.
     */
    readonly ids: string[];
    /**
     * Set of S3 canonical user IDs of the matched origin access identities.
     */
    readonly s3CanonicalUserIds: string[];
}
/**
 * Use this data source to get ARNs, ids and S3 canonical user IDs of Amazon CloudFront origin access identities.
 *
 * ## Example Usage
 * ### All origin access identities in the account
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = aws.cloudfront.getOriginAccessIdentities({});
 * ```
 * ### Origin access identities filtered by comment/name
 *
 * Origin access identities whose comments are `example-comment1`, `example-comment2`
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = aws.cloudfront.getOriginAccessIdentities({
 *     comments: [
 *         "example-comment1",
 *         "example-comment2",
 *     ],
 * });
 * ```
 */
export function getOriginAccessIdentitiesOutput(args?: GetOriginAccessIdentitiesOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetOriginAccessIdentitiesResult> {
    return pulumi.output(args).apply((a: any) => getOriginAccessIdentities(a, opts))
}

/**
 * A collection of arguments for invoking getOriginAccessIdentities.
 */
export interface GetOriginAccessIdentitiesOutputArgs {
    /**
     * Filter origin access identities by comment.
     */
    comments?: pulumi.Input<pulumi.Input<string>[]>;
}

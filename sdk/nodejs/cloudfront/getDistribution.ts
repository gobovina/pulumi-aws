// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Use this data source to retrieve information about a CloudFront distribution.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const test = pulumi.output(aws.cloudfront.getDistribution({
 *     id: "EDFDVBD632BHDS5",
 * }));
 * ```
 */
export function getDistribution(args: GetDistributionArgs, opts?: pulumi.InvokeOptions): Promise<GetDistributionResult> {
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    return pulumi.runtime.invoke("aws:cloudfront/getDistribution:getDistribution", {
        "id": args.id,
        "tags": args.tags,
    }, opts);
}

/**
 * A collection of arguments for invoking getDistribution.
 */
export interface GetDistributionArgs {
    /**
     * The identifier for the distribution. For example: `EDFDVBD632BHDS5`.
     */
    id: string;
    tags?: {[key: string]: string};
}

/**
 * A collection of values returned by getDistribution.
 */
export interface GetDistributionResult {
    /**
     * A list that contains information about CNAMEs (alternate domain names), if any, for this distribution.
     */
    readonly aliases: string[];
    /**
     * The ARN (Amazon Resource Name) for the distribution. For example: arn:aws:cloudfront::123456789012:distribution/EDFDVBD632BHDS5, where 123456789012 is your AWS account ID.
     */
    readonly arn: string;
    /**
     * The domain name corresponding to the distribution. For
     * example: `d604721fxaaqy9.cloudfront.net`.
     */
    readonly domainName: string;
    readonly enabled: boolean;
    /**
     * The current version of the distribution's information. For example:
     * `E2QWRUHAPOMQZL`.
     */
    readonly etag: string;
    /**
     * The CloudFront Route 53 zone ID that can be used to
     * route an [Alias Resource Record Set][7] to. This attribute is simply an
     * alias for the zone ID `Z2FDTNDATAQYW2`.
     */
    readonly hostedZoneId: string;
    /**
     * The identifier for the distribution. For example: `EDFDVBD632BHDS5`.
     */
    readonly id: string;
    /**
     * The number of invalidation batches
     * currently in progress.
     */
    readonly inProgressValidationBatches: number;
    /**
     * The date and time the distribution was last modified.
     */
    readonly lastModifiedTime: string;
    /**
     * The current status of the distribution. `Deployed` if the
     * distribution's information is fully propagated throughout the Amazon
     * CloudFront system.
     */
    readonly status: string;
    readonly tags?: {[key: string]: string};
}

export function getDistributionOutput(args: GetDistributionOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetDistributionResult> {
    return pulumi.output(args).apply(a => getDistribution(a, opts))
}

/**
 * A collection of arguments for invoking getDistribution.
 */
export interface GetDistributionOutputArgs {
    /**
     * The identifier for the distribution. For example: `EDFDVBD632BHDS5`.
     */
    id: pulumi.Input<string>;
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}

// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Use this data source to get the Account ID of the [AWS CloudTrail Service Account](http://docs.aws.amazon.com/awscloudtrail/latest/userguide/cloudtrail-supported-regions.html)
 * in a given region for the purpose of allowing CloudTrail to store trail data in S3.
 *
 * > **Note:** AWS documentation [states that](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/create-s3-bucket-policy-for-cloudtrail.html#troubleshooting-s3-bucket-policy) a [service principal name](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_principal.html#principal-services) should be used instead of an AWS account ID in any relevant IAM policy.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const main = aws.cloudtrail.getServiceAccount({});
 * const bucket = new aws.s3.BucketV2("bucket", {
 *     bucket: "tf-cloudtrail-logging-test-bucket",
 *     forceDestroy: true,
 * });
 * const allowCloudtrailLogging = pulumi.all([main, bucket.arn, main, bucket.arn]).apply(([main, bucketArn, main1, bucketArn1]) => aws.iam.getPolicyDocumentOutput({
 *     statements: [
 *         {
 *             sid: "Put bucket policy needed for trails",
 *             effect: "Allow",
 *             principals: [{
 *                 type: "AWS",
 *                 identifiers: [main.arn],
 *             }],
 *             actions: ["s3:PutObject"],
 *             resources: [`${bucketArn}/*`],
 *         },
 *         {
 *             sid: "Get bucket policy needed for trails",
 *             effect: "Allow",
 *             principals: [{
 *                 type: "AWS",
 *                 identifiers: [main1.arn],
 *             }],
 *             actions: ["s3:GetBucketAcl"],
 *             resources: [bucketArn1],
 *         },
 *     ],
 * }));
 * const allowCloudtrailLoggingBucketPolicy = new aws.s3.BucketPolicy("allow_cloudtrail_logging", {
 *     bucket: bucket.id,
 *     policy: allowCloudtrailLogging.apply(allowCloudtrailLogging => allowCloudtrailLogging.json),
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getServiceAccount(args?: GetServiceAccountArgs, opts?: pulumi.InvokeOptions): Promise<GetServiceAccountResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("aws:cloudtrail/getServiceAccount:getServiceAccount", {
        "region": args.region,
    }, opts);
}

/**
 * A collection of arguments for invoking getServiceAccount.
 */
export interface GetServiceAccountArgs {
    /**
     * Name of the region whose AWS CloudTrail account ID is desired.
     * Defaults to the region from the AWS provider configuration.
     */
    region?: string;
}

/**
 * A collection of values returned by getServiceAccount.
 */
export interface GetServiceAccountResult {
    /**
     * ARN of the AWS CloudTrail service account in the selected region.
     */
    readonly arn: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly region?: string;
}
/**
 * Use this data source to get the Account ID of the [AWS CloudTrail Service Account](http://docs.aws.amazon.com/awscloudtrail/latest/userguide/cloudtrail-supported-regions.html)
 * in a given region for the purpose of allowing CloudTrail to store trail data in S3.
 *
 * > **Note:** AWS documentation [states that](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/create-s3-bucket-policy-for-cloudtrail.html#troubleshooting-s3-bucket-policy) a [service principal name](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_principal.html#principal-services) should be used instead of an AWS account ID in any relevant IAM policy.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const main = aws.cloudtrail.getServiceAccount({});
 * const bucket = new aws.s3.BucketV2("bucket", {
 *     bucket: "tf-cloudtrail-logging-test-bucket",
 *     forceDestroy: true,
 * });
 * const allowCloudtrailLogging = pulumi.all([main, bucket.arn, main, bucket.arn]).apply(([main, bucketArn, main1, bucketArn1]) => aws.iam.getPolicyDocumentOutput({
 *     statements: [
 *         {
 *             sid: "Put bucket policy needed for trails",
 *             effect: "Allow",
 *             principals: [{
 *                 type: "AWS",
 *                 identifiers: [main.arn],
 *             }],
 *             actions: ["s3:PutObject"],
 *             resources: [`${bucketArn}/*`],
 *         },
 *         {
 *             sid: "Get bucket policy needed for trails",
 *             effect: "Allow",
 *             principals: [{
 *                 type: "AWS",
 *                 identifiers: [main1.arn],
 *             }],
 *             actions: ["s3:GetBucketAcl"],
 *             resources: [bucketArn1],
 *         },
 *     ],
 * }));
 * const allowCloudtrailLoggingBucketPolicy = new aws.s3.BucketPolicy("allow_cloudtrail_logging", {
 *     bucket: bucket.id,
 *     policy: allowCloudtrailLogging.apply(allowCloudtrailLogging => allowCloudtrailLogging.json),
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getServiceAccountOutput(args?: GetServiceAccountOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetServiceAccountResult> {
    return pulumi.output(args).apply((a: any) => getServiceAccount(a, opts))
}

/**
 * A collection of arguments for invoking getServiceAccount.
 */
export interface GetServiceAccountOutputArgs {
    /**
     * Name of the region whose AWS CloudTrail account ID is desired.
     * Defaults to the region from the AWS provider configuration.
     */
    region?: pulumi.Input<string>;
}

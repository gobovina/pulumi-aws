// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Creates an Amazon CloudFront web distribution.
 *
 * For information about CloudFront distributions, see the [Amazon CloudFront Developer Guide](http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Introduction.html). For specific information about creating CloudFront web distributions, see the [POST Distribution](https://docs.aws.amazon.com/cloudfront/latest/APIReference/API_CreateDistribution.html) page in the Amazon CloudFront API Reference.
 *
 * > **NOTE:** CloudFront distributions take about 15 minutes to reach a deployed state after creation or modification. During this time, deletes to resources will be blocked. If you need to delete a distribution that is enabled and you do not want to wait, you need to use the `retainOnDelete` flag.
 *
 * ## Example Usage
 * ### S3 Origin
 *
 * The example below creates a CloudFront distribution with an S3 origin.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const bucketV2 = new aws.s3.BucketV2("bucketV2", {tags: {
 *     Name: "My bucket",
 * }});
 * const bAcl = new aws.s3.BucketAclV2("bAcl", {
 *     bucket: bucketV2.id,
 *     acl: "private",
 * });
 * const s3OriginId = "myS3Origin";
 * const s3Distribution = new aws.cloudfront.Distribution("s3Distribution", {
 *     origins: [{
 *         domainName: bucketV2.bucketRegionalDomainName,
 *         originAccessControlId: aws_cloudfront_origin_access_control["default"].id,
 *         originId: s3OriginId,
 *     }],
 *     enabled: true,
 *     isIpv6Enabled: true,
 *     comment: "Some comment",
 *     defaultRootObject: "index.html",
 *     loggingConfig: {
 *         includeCookies: false,
 *         bucket: "mylogs.s3.amazonaws.com",
 *         prefix: "myprefix",
 *     },
 *     aliases: [
 *         "mysite.example.com",
 *         "yoursite.example.com",
 *     ],
 *     defaultCacheBehavior: {
 *         allowedMethods: [
 *             "DELETE",
 *             "GET",
 *             "HEAD",
 *             "OPTIONS",
 *             "PATCH",
 *             "POST",
 *             "PUT",
 *         ],
 *         cachedMethods: [
 *             "GET",
 *             "HEAD",
 *         ],
 *         targetOriginId: s3OriginId,
 *         forwardedValues: {
 *             queryString: false,
 *             cookies: {
 *                 forward: "none",
 *             },
 *         },
 *         viewerProtocolPolicy: "allow-all",
 *         minTtl: 0,
 *         defaultTtl: 3600,
 *         maxTtl: 86400,
 *     },
 *     orderedCacheBehaviors: [
 *         {
 *             pathPattern: "/content/immutable/*",
 *             allowedMethods: [
 *                 "GET",
 *                 "HEAD",
 *                 "OPTIONS",
 *             ],
 *             cachedMethods: [
 *                 "GET",
 *                 "HEAD",
 *                 "OPTIONS",
 *             ],
 *             targetOriginId: s3OriginId,
 *             forwardedValues: {
 *                 queryString: false,
 *                 headers: ["Origin"],
 *                 cookies: {
 *                     forward: "none",
 *                 },
 *             },
 *             minTtl: 0,
 *             defaultTtl: 86400,
 *             maxTtl: 31536000,
 *             compress: true,
 *             viewerProtocolPolicy: "redirect-to-https",
 *         },
 *         {
 *             pathPattern: "/content/*",
 *             allowedMethods: [
 *                 "GET",
 *                 "HEAD",
 *                 "OPTIONS",
 *             ],
 *             cachedMethods: [
 *                 "GET",
 *                 "HEAD",
 *             ],
 *             targetOriginId: s3OriginId,
 *             forwardedValues: {
 *                 queryString: false,
 *                 cookies: {
 *                     forward: "none",
 *                 },
 *             },
 *             minTtl: 0,
 *             defaultTtl: 3600,
 *             maxTtl: 86400,
 *             compress: true,
 *             viewerProtocolPolicy: "redirect-to-https",
 *         },
 *     ],
 *     priceClass: "PriceClass_200",
 *     restrictions: {
 *         geoRestriction: {
 *             restrictionType: "whitelist",
 *             locations: [
 *                 "US",
 *                 "CA",
 *                 "GB",
 *                 "DE",
 *             ],
 *         },
 *     },
 *     tags: {
 *         Environment: "production",
 *     },
 *     viewerCertificate: {
 *         cloudfrontDefaultCertificate: true,
 *     },
 * });
 * ```
 * ### With Failover Routing
 *
 * The example below creates a CloudFront distribution with an origin group for failover routing.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const s3Distribution = new aws.cloudfront.Distribution("s3Distribution", {
 *     originGroups: [{
 *         originId: "groupS3",
 *         failoverCriteria: {
 *             statusCodes: [
 *                 403,
 *                 404,
 *                 500,
 *                 502,
 *             ],
 *         },
 *         members: [
 *             {
 *                 originId: "primaryS3",
 *             },
 *             {
 *                 originId: "failoverS3",
 *             },
 *         ],
 *     }],
 *     origins: [
 *         {
 *             domainName: aws_s3_bucket.primary.bucket_regional_domain_name,
 *             originId: "primaryS3",
 *             s3OriginConfig: {
 *                 originAccessIdentity: aws_cloudfront_origin_access_identity["default"].cloudfront_access_identity_path,
 *             },
 *         },
 *         {
 *             domainName: aws_s3_bucket.failover.bucket_regional_domain_name,
 *             originId: "failoverS3",
 *             s3OriginConfig: {
 *                 originAccessIdentity: aws_cloudfront_origin_access_identity["default"].cloudfront_access_identity_path,
 *             },
 *         },
 *     ],
 *     defaultCacheBehavior: {
 *         targetOriginId: "groupS3",
 *     },
 * });
 * // ... other configuration ...
 * ```
 * ### With Managed Caching Policy
 *
 * The example below creates a CloudFront distribution with an [AWS managed caching policy](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-managed-cache-policies.html).
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const s3OriginId = "myS3Origin";
 * const s3Distribution = new aws.cloudfront.Distribution("s3Distribution", {
 *     origins: [{
 *         domainName: aws_s3_bucket.primary.bucket_regional_domain_name,
 *         originId: "myS3Origin",
 *         s3OriginConfig: {
 *             originAccessIdentity: aws_cloudfront_origin_access_identity["default"].cloudfront_access_identity_path,
 *         },
 *     }],
 *     enabled: true,
 *     isIpv6Enabled: true,
 *     comment: "Some comment",
 *     defaultRootObject: "index.html",
 *     defaultCacheBehavior: {
 *         cachePolicyId: "4135ea2d-6df8-44a3-9df3-4b5a84be39ad",
 *         allowedMethods: [
 *             "GET",
 *             "HEAD",
 *             "OPTIONS",
 *         ],
 *         targetOriginId: s3OriginId,
 *     },
 *     restrictions: {
 *         geoRestriction: {
 *             restrictionType: "whitelist",
 *             locations: [
 *                 "US",
 *                 "CA",
 *                 "GB",
 *                 "DE",
 *             ],
 *         },
 *     },
 *     viewerCertificate: {
 *         cloudfrontDefaultCertificate: true,
 *     },
 * });
 * // ... other configuration ...
 * ```
 *
 * ## Import
 *
 * Using `pulumi import`, import CloudFront Distributions using the `id`. For example:
 *
 * ```sh
 *  $ pulumi import aws:cloudfront/distribution:Distribution distribution E74FTE3EXAMPLE
 * ```
 */
export class Distribution extends pulumi.CustomResource {
    /**
     * Get an existing Distribution resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: DistributionState, opts?: pulumi.CustomResourceOptions): Distribution {
        return new Distribution(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:cloudfront/distribution:Distribution';

    /**
     * Returns true if the given object is an instance of Distribution.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Distribution {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Distribution.__pulumiType;
    }

    /**
     * Extra CNAMEs (alternate domain names), if any, for this distribution.
     */
    public readonly aliases!: pulumi.Output<string[] | undefined>;
    /**
     * ARN for the distribution. For example: `arn:aws:cloudfront::123456789012:distribution/EDFDVBD632BHDS5`, where `123456789012` is your AWS account ID.
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * Internal value used by CloudFront to allow future updates to the distribution configuration.
     */
    public /*out*/ readonly callerReference!: pulumi.Output<string>;
    /**
     * Any comments you want to include about the distribution.
     */
    public readonly comment!: pulumi.Output<string | undefined>;
    /**
     * Identifier of a continuous deployment policy. This argument should only be set on a production distribution. See the `aws.cloudfront.ContinuousDeploymentPolicy` resource for additional details.
     */
    public readonly continuousDeploymentPolicyId!: pulumi.Output<string>;
    /**
     * One or more custom error response elements (multiples allowed).
     */
    public readonly customErrorResponses!: pulumi.Output<outputs.cloudfront.DistributionCustomErrorResponse[] | undefined>;
    /**
     * Default cache behavior for this distribution (maximum one). Requires either `cachePolicyId` (preferred) or `forwardedValues` (deprecated) be set.
     */
    public readonly defaultCacheBehavior!: pulumi.Output<outputs.cloudfront.DistributionDefaultCacheBehavior>;
    /**
     * Object that you want CloudFront to return (for example, index.html) when an end user requests the root URL.
     */
    public readonly defaultRootObject!: pulumi.Output<string | undefined>;
    /**
     * DNS domain name of either the S3 bucket, or web site of your custom origin.
     */
    public /*out*/ readonly domainName!: pulumi.Output<string>;
    /**
     * Whether Origin Shield is enabled.
     */
    public readonly enabled!: pulumi.Output<boolean>;
    /**
     * Current version of the distribution's information. For example: `E2QWRUHAPOMQZL`.
     */
    public /*out*/ readonly etag!: pulumi.Output<string>;
    /**
     * CloudFront Route 53 zone ID that can be used to route an [Alias Resource Record Set](http://docs.aws.amazon.com/Route53/latest/APIReference/CreateAliasRRSAPI.html) to. This attribute is simply an alias for the zone ID `Z2FDTNDATAQYW2`.
     */
    public /*out*/ readonly hostedZoneId!: pulumi.Output<string>;
    /**
     * Maximum HTTP version to support on the distribution. Allowed values are `http1.1`, `http2`, `http2and3` and `http3`. The default is `http2`.
     */
    public readonly httpVersion!: pulumi.Output<string | undefined>;
    /**
     * Number of invalidation batches currently in progress.
     */
    public /*out*/ readonly inProgressValidationBatches!: pulumi.Output<number>;
    /**
     * Whether the IPv6 is enabled for the distribution.
     */
    public readonly isIpv6Enabled!: pulumi.Output<boolean | undefined>;
    /**
     * Date and time the distribution was last modified.
     */
    public /*out*/ readonly lastModifiedTime!: pulumi.Output<string>;
    /**
     * The logging configuration that controls how logs are written to your distribution (maximum one).
     */
    public readonly loggingConfig!: pulumi.Output<outputs.cloudfront.DistributionLoggingConfig | undefined>;
    /**
     * Ordered list of cache behaviors resource for this distribution. List from top to bottom in order of precedence. The topmost cache behavior will have precedence 0.
     */
    public readonly orderedCacheBehaviors!: pulumi.Output<outputs.cloudfront.DistributionOrderedCacheBehavior[] | undefined>;
    /**
     * One or more originGroup for this distribution (multiples allowed).
     */
    public readonly originGroups!: pulumi.Output<outputs.cloudfront.DistributionOriginGroup[] | undefined>;
    /**
     * One or more origins for this distribution (multiples allowed).
     */
    public readonly origins!: pulumi.Output<outputs.cloudfront.DistributionOrigin[]>;
    /**
     * Price class for this distribution. One of `PriceClass_All`, `PriceClass_200`, `PriceClass_100`.
     */
    public readonly priceClass!: pulumi.Output<string | undefined>;
    /**
     * The restriction configuration for this distribution (maximum one).
     */
    public readonly restrictions!: pulumi.Output<outputs.cloudfront.DistributionRestrictions>;
    /**
     * Disables the distribution instead of deleting it when destroying the resource through the provider. If this is set, the distribution needs to be deleted manually afterwards. Default: `false`.
     */
    public readonly retainOnDelete!: pulumi.Output<boolean | undefined>;
    /**
     * A Boolean that indicates whether this is a staging distribution. Defaults to `false`.
     */
    public readonly staging!: pulumi.Output<boolean | undefined>;
    /**
     * Current status of the distribution. `Deployed` if the distribution's information is fully propagated throughout the Amazon CloudFront system.
     */
    public /*out*/ readonly status!: pulumi.Output<string>;
    /**
     * A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     *
     * @deprecated Please use `tags` instead.
     */
    public /*out*/ readonly tagsAll!: pulumi.Output<{[key: string]: string}>;
    /**
     * List of key group IDs that CloudFront can use to validate signed URLs or signed cookies. See the [CloudFront User Guide](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/private-content-trusted-signers.html) for more information about this feature.
     */
    public /*out*/ readonly trustedKeyGroups!: pulumi.Output<outputs.cloudfront.DistributionTrustedKeyGroup[]>;
    /**
     * List of AWS account IDs (or `self`) that you want to allow to create signed URLs for private content. See the [CloudFront User Guide](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/private-content-trusted-signers.html) for more information about this feature.
     */
    public /*out*/ readonly trustedSigners!: pulumi.Output<outputs.cloudfront.DistributionTrustedSigner[]>;
    /**
     * The SSL configuration for this distribution (maximum one).
     */
    public readonly viewerCertificate!: pulumi.Output<outputs.cloudfront.DistributionViewerCertificate>;
    /**
     * If enabled, the resource will wait for the distribution status to change from `InProgress` to `Deployed`. Setting this to`false` will skip the process. Default: `true`.
     */
    public readonly waitForDeployment!: pulumi.Output<boolean | undefined>;
    /**
     * Unique identifier that specifies the AWS WAF web ACL, if any, to associate with this distribution. To specify a web ACL created using the latest version of AWS WAF (WAFv2), use the ACL ARN, for example `aws_wafv2_web_acl.example.arn`. To specify a web ACL created using AWS WAF Classic, use the ACL ID, for example `aws_waf_web_acl.example.id`. The WAF Web ACL must exist in the WAF Global (CloudFront) region and the credentials configuring this argument must have `waf:GetWebACL` permissions assigned.
     */
    public readonly webAclId!: pulumi.Output<string | undefined>;

    /**
     * Create a Distribution resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: DistributionArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: DistributionArgs | DistributionState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as DistributionState | undefined;
            resourceInputs["aliases"] = state ? state.aliases : undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["callerReference"] = state ? state.callerReference : undefined;
            resourceInputs["comment"] = state ? state.comment : undefined;
            resourceInputs["continuousDeploymentPolicyId"] = state ? state.continuousDeploymentPolicyId : undefined;
            resourceInputs["customErrorResponses"] = state ? state.customErrorResponses : undefined;
            resourceInputs["defaultCacheBehavior"] = state ? state.defaultCacheBehavior : undefined;
            resourceInputs["defaultRootObject"] = state ? state.defaultRootObject : undefined;
            resourceInputs["domainName"] = state ? state.domainName : undefined;
            resourceInputs["enabled"] = state ? state.enabled : undefined;
            resourceInputs["etag"] = state ? state.etag : undefined;
            resourceInputs["hostedZoneId"] = state ? state.hostedZoneId : undefined;
            resourceInputs["httpVersion"] = state ? state.httpVersion : undefined;
            resourceInputs["inProgressValidationBatches"] = state ? state.inProgressValidationBatches : undefined;
            resourceInputs["isIpv6Enabled"] = state ? state.isIpv6Enabled : undefined;
            resourceInputs["lastModifiedTime"] = state ? state.lastModifiedTime : undefined;
            resourceInputs["loggingConfig"] = state ? state.loggingConfig : undefined;
            resourceInputs["orderedCacheBehaviors"] = state ? state.orderedCacheBehaviors : undefined;
            resourceInputs["originGroups"] = state ? state.originGroups : undefined;
            resourceInputs["origins"] = state ? state.origins : undefined;
            resourceInputs["priceClass"] = state ? state.priceClass : undefined;
            resourceInputs["restrictions"] = state ? state.restrictions : undefined;
            resourceInputs["retainOnDelete"] = state ? state.retainOnDelete : undefined;
            resourceInputs["staging"] = state ? state.staging : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tagsAll"] = state ? state.tagsAll : undefined;
            resourceInputs["trustedKeyGroups"] = state ? state.trustedKeyGroups : undefined;
            resourceInputs["trustedSigners"] = state ? state.trustedSigners : undefined;
            resourceInputs["viewerCertificate"] = state ? state.viewerCertificate : undefined;
            resourceInputs["waitForDeployment"] = state ? state.waitForDeployment : undefined;
            resourceInputs["webAclId"] = state ? state.webAclId : undefined;
        } else {
            const args = argsOrState as DistributionArgs | undefined;
            if ((!args || args.defaultCacheBehavior === undefined) && !opts.urn) {
                throw new Error("Missing required property 'defaultCacheBehavior'");
            }
            if ((!args || args.enabled === undefined) && !opts.urn) {
                throw new Error("Missing required property 'enabled'");
            }
            if ((!args || args.origins === undefined) && !opts.urn) {
                throw new Error("Missing required property 'origins'");
            }
            if ((!args || args.restrictions === undefined) && !opts.urn) {
                throw new Error("Missing required property 'restrictions'");
            }
            if ((!args || args.viewerCertificate === undefined) && !opts.urn) {
                throw new Error("Missing required property 'viewerCertificate'");
            }
            resourceInputs["aliases"] = args ? args.aliases : undefined;
            resourceInputs["comment"] = args ? args.comment : undefined;
            resourceInputs["continuousDeploymentPolicyId"] = args ? args.continuousDeploymentPolicyId : undefined;
            resourceInputs["customErrorResponses"] = args ? args.customErrorResponses : undefined;
            resourceInputs["defaultCacheBehavior"] = args ? args.defaultCacheBehavior : undefined;
            resourceInputs["defaultRootObject"] = args ? args.defaultRootObject : undefined;
            resourceInputs["enabled"] = args ? args.enabled : undefined;
            resourceInputs["httpVersion"] = args ? args.httpVersion : undefined;
            resourceInputs["isIpv6Enabled"] = args ? args.isIpv6Enabled : undefined;
            resourceInputs["loggingConfig"] = args ? args.loggingConfig : undefined;
            resourceInputs["orderedCacheBehaviors"] = args ? args.orderedCacheBehaviors : undefined;
            resourceInputs["originGroups"] = args ? args.originGroups : undefined;
            resourceInputs["origins"] = args ? args.origins : undefined;
            resourceInputs["priceClass"] = args ? args.priceClass : undefined;
            resourceInputs["restrictions"] = args ? args.restrictions : undefined;
            resourceInputs["retainOnDelete"] = args ? args.retainOnDelete : undefined;
            resourceInputs["staging"] = args ? args.staging : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["viewerCertificate"] = args ? args.viewerCertificate : undefined;
            resourceInputs["waitForDeployment"] = args ? args.waitForDeployment : undefined;
            resourceInputs["webAclId"] = args ? args.webAclId : undefined;
            resourceInputs["arn"] = undefined /*out*/;
            resourceInputs["callerReference"] = undefined /*out*/;
            resourceInputs["domainName"] = undefined /*out*/;
            resourceInputs["etag"] = undefined /*out*/;
            resourceInputs["hostedZoneId"] = undefined /*out*/;
            resourceInputs["inProgressValidationBatches"] = undefined /*out*/;
            resourceInputs["lastModifiedTime"] = undefined /*out*/;
            resourceInputs["status"] = undefined /*out*/;
            resourceInputs["tagsAll"] = undefined /*out*/;
            resourceInputs["trustedKeyGroups"] = undefined /*out*/;
            resourceInputs["trustedSigners"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Distribution.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Distribution resources.
 */
export interface DistributionState {
    /**
     * Extra CNAMEs (alternate domain names), if any, for this distribution.
     */
    aliases?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * ARN for the distribution. For example: `arn:aws:cloudfront::123456789012:distribution/EDFDVBD632BHDS5`, where `123456789012` is your AWS account ID.
     */
    arn?: pulumi.Input<string>;
    /**
     * Internal value used by CloudFront to allow future updates to the distribution configuration.
     */
    callerReference?: pulumi.Input<string>;
    /**
     * Any comments you want to include about the distribution.
     */
    comment?: pulumi.Input<string>;
    /**
     * Identifier of a continuous deployment policy. This argument should only be set on a production distribution. See the `aws.cloudfront.ContinuousDeploymentPolicy` resource for additional details.
     */
    continuousDeploymentPolicyId?: pulumi.Input<string>;
    /**
     * One or more custom error response elements (multiples allowed).
     */
    customErrorResponses?: pulumi.Input<pulumi.Input<inputs.cloudfront.DistributionCustomErrorResponse>[]>;
    /**
     * Default cache behavior for this distribution (maximum one). Requires either `cachePolicyId` (preferred) or `forwardedValues` (deprecated) be set.
     */
    defaultCacheBehavior?: pulumi.Input<inputs.cloudfront.DistributionDefaultCacheBehavior>;
    /**
     * Object that you want CloudFront to return (for example, index.html) when an end user requests the root URL.
     */
    defaultRootObject?: pulumi.Input<string>;
    /**
     * DNS domain name of either the S3 bucket, or web site of your custom origin.
     */
    domainName?: pulumi.Input<string>;
    /**
     * Whether Origin Shield is enabled.
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * Current version of the distribution's information. For example: `E2QWRUHAPOMQZL`.
     */
    etag?: pulumi.Input<string>;
    /**
     * CloudFront Route 53 zone ID that can be used to route an [Alias Resource Record Set](http://docs.aws.amazon.com/Route53/latest/APIReference/CreateAliasRRSAPI.html) to. This attribute is simply an alias for the zone ID `Z2FDTNDATAQYW2`.
     */
    hostedZoneId?: pulumi.Input<string>;
    /**
     * Maximum HTTP version to support on the distribution. Allowed values are `http1.1`, `http2`, `http2and3` and `http3`. The default is `http2`.
     */
    httpVersion?: pulumi.Input<string>;
    /**
     * Number of invalidation batches currently in progress.
     */
    inProgressValidationBatches?: pulumi.Input<number>;
    /**
     * Whether the IPv6 is enabled for the distribution.
     */
    isIpv6Enabled?: pulumi.Input<boolean>;
    /**
     * Date and time the distribution was last modified.
     */
    lastModifiedTime?: pulumi.Input<string>;
    /**
     * The logging configuration that controls how logs are written to your distribution (maximum one).
     */
    loggingConfig?: pulumi.Input<inputs.cloudfront.DistributionLoggingConfig>;
    /**
     * Ordered list of cache behaviors resource for this distribution. List from top to bottom in order of precedence. The topmost cache behavior will have precedence 0.
     */
    orderedCacheBehaviors?: pulumi.Input<pulumi.Input<inputs.cloudfront.DistributionOrderedCacheBehavior>[]>;
    /**
     * One or more originGroup for this distribution (multiples allowed).
     */
    originGroups?: pulumi.Input<pulumi.Input<inputs.cloudfront.DistributionOriginGroup>[]>;
    /**
     * One or more origins for this distribution (multiples allowed).
     */
    origins?: pulumi.Input<pulumi.Input<inputs.cloudfront.DistributionOrigin>[]>;
    /**
     * Price class for this distribution. One of `PriceClass_All`, `PriceClass_200`, `PriceClass_100`.
     */
    priceClass?: pulumi.Input<string>;
    /**
     * The restriction configuration for this distribution (maximum one).
     */
    restrictions?: pulumi.Input<inputs.cloudfront.DistributionRestrictions>;
    /**
     * Disables the distribution instead of deleting it when destroying the resource through the provider. If this is set, the distribution needs to be deleted manually afterwards. Default: `false`.
     */
    retainOnDelete?: pulumi.Input<boolean>;
    /**
     * A Boolean that indicates whether this is a staging distribution. Defaults to `false`.
     */
    staging?: pulumi.Input<boolean>;
    /**
     * Current status of the distribution. `Deployed` if the distribution's information is fully propagated throughout the Amazon CloudFront system.
     */
    status?: pulumi.Input<string>;
    /**
     * A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     *
     * @deprecated Please use `tags` instead.
     */
    tagsAll?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * List of key group IDs that CloudFront can use to validate signed URLs or signed cookies. See the [CloudFront User Guide](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/private-content-trusted-signers.html) for more information about this feature.
     */
    trustedKeyGroups?: pulumi.Input<pulumi.Input<inputs.cloudfront.DistributionTrustedKeyGroup>[]>;
    /**
     * List of AWS account IDs (or `self`) that you want to allow to create signed URLs for private content. See the [CloudFront User Guide](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/private-content-trusted-signers.html) for more information about this feature.
     */
    trustedSigners?: pulumi.Input<pulumi.Input<inputs.cloudfront.DistributionTrustedSigner>[]>;
    /**
     * The SSL configuration for this distribution (maximum one).
     */
    viewerCertificate?: pulumi.Input<inputs.cloudfront.DistributionViewerCertificate>;
    /**
     * If enabled, the resource will wait for the distribution status to change from `InProgress` to `Deployed`. Setting this to`false` will skip the process. Default: `true`.
     */
    waitForDeployment?: pulumi.Input<boolean>;
    /**
     * Unique identifier that specifies the AWS WAF web ACL, if any, to associate with this distribution. To specify a web ACL created using the latest version of AWS WAF (WAFv2), use the ACL ARN, for example `aws_wafv2_web_acl.example.arn`. To specify a web ACL created using AWS WAF Classic, use the ACL ID, for example `aws_waf_web_acl.example.id`. The WAF Web ACL must exist in the WAF Global (CloudFront) region and the credentials configuring this argument must have `waf:GetWebACL` permissions assigned.
     */
    webAclId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Distribution resource.
 */
export interface DistributionArgs {
    /**
     * Extra CNAMEs (alternate domain names), if any, for this distribution.
     */
    aliases?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Any comments you want to include about the distribution.
     */
    comment?: pulumi.Input<string>;
    /**
     * Identifier of a continuous deployment policy. This argument should only be set on a production distribution. See the `aws.cloudfront.ContinuousDeploymentPolicy` resource for additional details.
     */
    continuousDeploymentPolicyId?: pulumi.Input<string>;
    /**
     * One or more custom error response elements (multiples allowed).
     */
    customErrorResponses?: pulumi.Input<pulumi.Input<inputs.cloudfront.DistributionCustomErrorResponse>[]>;
    /**
     * Default cache behavior for this distribution (maximum one). Requires either `cachePolicyId` (preferred) or `forwardedValues` (deprecated) be set.
     */
    defaultCacheBehavior: pulumi.Input<inputs.cloudfront.DistributionDefaultCacheBehavior>;
    /**
     * Object that you want CloudFront to return (for example, index.html) when an end user requests the root URL.
     */
    defaultRootObject?: pulumi.Input<string>;
    /**
     * Whether Origin Shield is enabled.
     */
    enabled: pulumi.Input<boolean>;
    /**
     * Maximum HTTP version to support on the distribution. Allowed values are `http1.1`, `http2`, `http2and3` and `http3`. The default is `http2`.
     */
    httpVersion?: pulumi.Input<string>;
    /**
     * Whether the IPv6 is enabled for the distribution.
     */
    isIpv6Enabled?: pulumi.Input<boolean>;
    /**
     * The logging configuration that controls how logs are written to your distribution (maximum one).
     */
    loggingConfig?: pulumi.Input<inputs.cloudfront.DistributionLoggingConfig>;
    /**
     * Ordered list of cache behaviors resource for this distribution. List from top to bottom in order of precedence. The topmost cache behavior will have precedence 0.
     */
    orderedCacheBehaviors?: pulumi.Input<pulumi.Input<inputs.cloudfront.DistributionOrderedCacheBehavior>[]>;
    /**
     * One or more originGroup for this distribution (multiples allowed).
     */
    originGroups?: pulumi.Input<pulumi.Input<inputs.cloudfront.DistributionOriginGroup>[]>;
    /**
     * One or more origins for this distribution (multiples allowed).
     */
    origins: pulumi.Input<pulumi.Input<inputs.cloudfront.DistributionOrigin>[]>;
    /**
     * Price class for this distribution. One of `PriceClass_All`, `PriceClass_200`, `PriceClass_100`.
     */
    priceClass?: pulumi.Input<string>;
    /**
     * The restriction configuration for this distribution (maximum one).
     */
    restrictions: pulumi.Input<inputs.cloudfront.DistributionRestrictions>;
    /**
     * Disables the distribution instead of deleting it when destroying the resource through the provider. If this is set, the distribution needs to be deleted manually afterwards. Default: `false`.
     */
    retainOnDelete?: pulumi.Input<boolean>;
    /**
     * A Boolean that indicates whether this is a staging distribution. Defaults to `false`.
     */
    staging?: pulumi.Input<boolean>;
    /**
     * A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The SSL configuration for this distribution (maximum one).
     */
    viewerCertificate: pulumi.Input<inputs.cloudfront.DistributionViewerCertificate>;
    /**
     * If enabled, the resource will wait for the distribution status to change from `InProgress` to `Deployed`. Setting this to`false` will skip the process. Default: `true`.
     */
    waitForDeployment?: pulumi.Input<boolean>;
    /**
     * Unique identifier that specifies the AWS WAF web ACL, if any, to associate with this distribution. To specify a web ACL created using the latest version of AWS WAF (WAFv2), use the ACL ARN, for example `aws_wafv2_web_acl.example.arn`. To specify a web ACL created using AWS WAF Classic, use the ACL ID, for example `aws_waf_web_acl.example.id`. The WAF Web ACL must exist in the WAF Global (CloudFront) region and the credentials configuring this argument must have `waf:GetWebACL` permissions assigned.
     */
    webAclId?: pulumi.Input<string>;
}

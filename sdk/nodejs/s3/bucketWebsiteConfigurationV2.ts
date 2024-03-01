// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Provides an S3 bucket website configuration resource. For more information, see [Hosting Websites on S3](https://docs.aws.amazon.com/AmazonS3/latest/dev/WebsiteHosting.html).
 *
 * > This resource cannot be used with S3 directory buckets.
 *
 * ## Example Usage
 * ### With `routingRule` configured
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.s3.BucketWebsiteConfigurationV2("example", {
 *     bucket: exampleAwsS3Bucket.id,
 *     indexDocument: {
 *         suffix: "index.html",
 *     },
 *     errorDocument: {
 *         key: "error.html",
 *     },
 *     routingRules: [{
 *         condition: {
 *             keyPrefixEquals: "docs/",
 *         },
 *         redirect: {
 *             replaceKeyPrefixWith: "documents/",
 *         },
 *     }],
 * });
 * ```
 * ### With `routingRules` configured
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.s3.BucketWebsiteConfigurationV2("example", {
 *     bucket: exampleAwsS3Bucket.id,
 *     indexDocument: {
 *         suffix: "index.html",
 *     },
 *     errorDocument: {
 *         key: "error.html",
 *     },
 *     routingRuleDetails: `[{
 *     "Condition": {
 *         "KeyPrefixEquals": "docs/"
 *     },
 *     "Redirect": {
 *         "ReplaceKeyPrefixWith": ""
 *     }
 * }]
 * `,
 * });
 * ```
 *
 * ## Import
 *
 * If the owner (account ID) of the source bucket differs from the account used to configure the AWS Provider, import using the `bucket` and `expected_bucket_owner` separated by a comma (`,`):
 *
 * __Using `pulumi import` to import__ S3 bucket website configuration using the `bucket` or using the `bucket` and `expected_bucket_owner` separated by a comma (`,`). For example:
 *
 * If the owner (account ID) of the source bucket is the same account used to configure the AWS Provider, import using the `bucket`:
 *
 * ```sh
 *  $ pulumi import aws:s3/bucketWebsiteConfigurationV2:BucketWebsiteConfigurationV2 example bucket-name
 * ```
 *  If the owner (account ID) of the source bucket differs from the account used to configure the AWS Provider, import using the `bucket` and `expected_bucket_owner` separated by a comma (`,`):
 *
 * ```sh
 *  $ pulumi import aws:s3/bucketWebsiteConfigurationV2:BucketWebsiteConfigurationV2 example bucket-name,123456789012
 * ```
 */
export class BucketWebsiteConfigurationV2 extends pulumi.CustomResource {
    /**
     * Get an existing BucketWebsiteConfigurationV2 resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: BucketWebsiteConfigurationV2State, opts?: pulumi.CustomResourceOptions): BucketWebsiteConfigurationV2 {
        return new BucketWebsiteConfigurationV2(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:s3/bucketWebsiteConfigurationV2:BucketWebsiteConfigurationV2';

    /**
     * Returns true if the given object is an instance of BucketWebsiteConfigurationV2.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is BucketWebsiteConfigurationV2 {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === BucketWebsiteConfigurationV2.__pulumiType;
    }

    /**
     * Name of the bucket.
     */
    public readonly bucket!: pulumi.Output<string>;
    /**
     * Name of the error document for the website. See below.
     */
    public readonly errorDocument!: pulumi.Output<outputs.s3.BucketWebsiteConfigurationV2ErrorDocument | undefined>;
    /**
     * Account ID of the expected bucket owner.
     */
    public readonly expectedBucketOwner!: pulumi.Output<string | undefined>;
    /**
     * Name of the index document for the website. See below.
     */
    public readonly indexDocument!: pulumi.Output<outputs.s3.BucketWebsiteConfigurationV2IndexDocument | undefined>;
    /**
     * Redirect behavior for every request to this bucket's website endpoint. See below. Conflicts with `errorDocument`, `indexDocument`, and `routingRule`.
     */
    public readonly redirectAllRequestsTo!: pulumi.Output<outputs.s3.BucketWebsiteConfigurationV2RedirectAllRequestsTo | undefined>;
    /**
     * JSON array containing [routing rules](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-routingrules.html)
     * describing redirect behavior and when redirects are applied. Use this parameter when your routing rules contain empty String values (`""`) as seen in the example above.
     */
    public readonly routingRuleDetails!: pulumi.Output<string>;
    /**
     * List of rules that define when a redirect is applied and the redirect behavior. See below.
     */
    public readonly routingRules!: pulumi.Output<outputs.s3.BucketWebsiteConfigurationV2RoutingRule[]>;
    /**
     * Domain of the website endpoint. This is used to create Route 53 alias records.
     */
    public /*out*/ readonly websiteDomain!: pulumi.Output<string>;
    /**
     * Website endpoint.
     */
    public /*out*/ readonly websiteEndpoint!: pulumi.Output<string>;

    /**
     * Create a BucketWebsiteConfigurationV2 resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: BucketWebsiteConfigurationV2Args, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: BucketWebsiteConfigurationV2Args | BucketWebsiteConfigurationV2State, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as BucketWebsiteConfigurationV2State | undefined;
            resourceInputs["bucket"] = state ? state.bucket : undefined;
            resourceInputs["errorDocument"] = state ? state.errorDocument : undefined;
            resourceInputs["expectedBucketOwner"] = state ? state.expectedBucketOwner : undefined;
            resourceInputs["indexDocument"] = state ? state.indexDocument : undefined;
            resourceInputs["redirectAllRequestsTo"] = state ? state.redirectAllRequestsTo : undefined;
            resourceInputs["routingRuleDetails"] = state ? state.routingRuleDetails : undefined;
            resourceInputs["routingRules"] = state ? state.routingRules : undefined;
            resourceInputs["websiteDomain"] = state ? state.websiteDomain : undefined;
            resourceInputs["websiteEndpoint"] = state ? state.websiteEndpoint : undefined;
        } else {
            const args = argsOrState as BucketWebsiteConfigurationV2Args | undefined;
            if ((!args || args.bucket === undefined) && !opts.urn) {
                throw new Error("Missing required property 'bucket'");
            }
            resourceInputs["bucket"] = args ? args.bucket : undefined;
            resourceInputs["errorDocument"] = args ? args.errorDocument : undefined;
            resourceInputs["expectedBucketOwner"] = args ? args.expectedBucketOwner : undefined;
            resourceInputs["indexDocument"] = args ? args.indexDocument : undefined;
            resourceInputs["redirectAllRequestsTo"] = args ? args.redirectAllRequestsTo : undefined;
            resourceInputs["routingRuleDetails"] = args ? args.routingRuleDetails : undefined;
            resourceInputs["routingRules"] = args ? args.routingRules : undefined;
            resourceInputs["websiteDomain"] = undefined /*out*/;
            resourceInputs["websiteEndpoint"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(BucketWebsiteConfigurationV2.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering BucketWebsiteConfigurationV2 resources.
 */
export interface BucketWebsiteConfigurationV2State {
    /**
     * Name of the bucket.
     */
    bucket?: pulumi.Input<string>;
    /**
     * Name of the error document for the website. See below.
     */
    errorDocument?: pulumi.Input<inputs.s3.BucketWebsiteConfigurationV2ErrorDocument>;
    /**
     * Account ID of the expected bucket owner.
     */
    expectedBucketOwner?: pulumi.Input<string>;
    /**
     * Name of the index document for the website. See below.
     */
    indexDocument?: pulumi.Input<inputs.s3.BucketWebsiteConfigurationV2IndexDocument>;
    /**
     * Redirect behavior for every request to this bucket's website endpoint. See below. Conflicts with `errorDocument`, `indexDocument`, and `routingRule`.
     */
    redirectAllRequestsTo?: pulumi.Input<inputs.s3.BucketWebsiteConfigurationV2RedirectAllRequestsTo>;
    /**
     * JSON array containing [routing rules](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-routingrules.html)
     * describing redirect behavior and when redirects are applied. Use this parameter when your routing rules contain empty String values (`""`) as seen in the example above.
     */
    routingRuleDetails?: pulumi.Input<string>;
    /**
     * List of rules that define when a redirect is applied and the redirect behavior. See below.
     */
    routingRules?: pulumi.Input<pulumi.Input<inputs.s3.BucketWebsiteConfigurationV2RoutingRule>[]>;
    /**
     * Domain of the website endpoint. This is used to create Route 53 alias records.
     */
    websiteDomain?: pulumi.Input<string>;
    /**
     * Website endpoint.
     */
    websiteEndpoint?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a BucketWebsiteConfigurationV2 resource.
 */
export interface BucketWebsiteConfigurationV2Args {
    /**
     * Name of the bucket.
     */
    bucket: pulumi.Input<string>;
    /**
     * Name of the error document for the website. See below.
     */
    errorDocument?: pulumi.Input<inputs.s3.BucketWebsiteConfigurationV2ErrorDocument>;
    /**
     * Account ID of the expected bucket owner.
     */
    expectedBucketOwner?: pulumi.Input<string>;
    /**
     * Name of the index document for the website. See below.
     */
    indexDocument?: pulumi.Input<inputs.s3.BucketWebsiteConfigurationV2IndexDocument>;
    /**
     * Redirect behavior for every request to this bucket's website endpoint. See below. Conflicts with `errorDocument`, `indexDocument`, and `routingRule`.
     */
    redirectAllRequestsTo?: pulumi.Input<inputs.s3.BucketWebsiteConfigurationV2RedirectAllRequestsTo>;
    /**
     * JSON array containing [routing rules](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-routingrules.html)
     * describing redirect behavior and when redirects are applied. Use this parameter when your routing rules contain empty String values (`""`) as seen in the example above.
     */
    routingRuleDetails?: pulumi.Input<string>;
    /**
     * List of rules that define when a redirect is applied and the redirect behavior. See below.
     */
    routingRules?: pulumi.Input<pulumi.Input<inputs.s3.BucketWebsiteConfigurationV2RoutingRule>[]>;
}

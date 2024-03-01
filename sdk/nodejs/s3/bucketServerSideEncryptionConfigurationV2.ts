// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Provides a S3 bucket server-side encryption configuration resource.
 *
 * > **NOTE:** Destroying an `aws.s3.BucketServerSideEncryptionConfigurationV2` resource resets the bucket to [Amazon S3 bucket default encryption](https://docs.aws.amazon.com/AmazonS3/latest/userguide/default-encryption-faq.html).
 *
 * > This resource cannot be used with S3 directory buckets.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const mykey = new aws.kms.Key("mykey", {
 *     description: "This key is used to encrypt bucket objects",
 *     deletionWindowInDays: 10,
 * });
 * const mybucket = new aws.s3.BucketV2("mybucket", {bucket: "mybucket"});
 * const example = new aws.s3.BucketServerSideEncryptionConfigurationV2("example", {
 *     bucket: mybucket.id,
 *     rules: [{
 *         applyServerSideEncryptionByDefault: {
 *             kmsMasterKeyId: mykey.arn,
 *             sseAlgorithm: "aws:kms",
 *         },
 *     }],
 * });
 * ```
 *
 * ## Import
 *
 * If the owner (account ID) of the source bucket differs from the account used to configure the AWS Provider, import using the `bucket` and `expected_bucket_owner` separated by a comma (`,`):
 *
 * __Using `pulumi import` to import__ S3 bucket server-side encryption configuration using the `bucket` or using the `bucket` and `expected_bucket_owner` separated by a comma (`,`). For example:
 *
 * If the owner (account ID) of the source bucket is the same account used to configure the AWS Provider, import using the `bucket`:
 *
 * ```sh
 *  $ pulumi import aws:s3/bucketServerSideEncryptionConfigurationV2:BucketServerSideEncryptionConfigurationV2 example bucket-name
 * ```
 *  If the owner (account ID) of the source bucket differs from the account used to configure the AWS Provider, import using the `bucket` and `expected_bucket_owner` separated by a comma (`,`):
 *
 * ```sh
 *  $ pulumi import aws:s3/bucketServerSideEncryptionConfigurationV2:BucketServerSideEncryptionConfigurationV2 example bucket-name,123456789012
 * ```
 */
export class BucketServerSideEncryptionConfigurationV2 extends pulumi.CustomResource {
    /**
     * Get an existing BucketServerSideEncryptionConfigurationV2 resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: BucketServerSideEncryptionConfigurationV2State, opts?: pulumi.CustomResourceOptions): BucketServerSideEncryptionConfigurationV2 {
        return new BucketServerSideEncryptionConfigurationV2(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:s3/bucketServerSideEncryptionConfigurationV2:BucketServerSideEncryptionConfigurationV2';

    /**
     * Returns true if the given object is an instance of BucketServerSideEncryptionConfigurationV2.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is BucketServerSideEncryptionConfigurationV2 {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === BucketServerSideEncryptionConfigurationV2.__pulumiType;
    }

    /**
     * ID (name) of the bucket.
     */
    public readonly bucket!: pulumi.Output<string>;
    /**
     * Account ID of the expected bucket owner.
     */
    public readonly expectedBucketOwner!: pulumi.Output<string | undefined>;
    /**
     * Set of server-side encryption configuration rules. See below. Currently, only a single rule is supported.
     */
    public readonly rules!: pulumi.Output<outputs.s3.BucketServerSideEncryptionConfigurationV2Rule[]>;

    /**
     * Create a BucketServerSideEncryptionConfigurationV2 resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: BucketServerSideEncryptionConfigurationV2Args, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: BucketServerSideEncryptionConfigurationV2Args | BucketServerSideEncryptionConfigurationV2State, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as BucketServerSideEncryptionConfigurationV2State | undefined;
            resourceInputs["bucket"] = state ? state.bucket : undefined;
            resourceInputs["expectedBucketOwner"] = state ? state.expectedBucketOwner : undefined;
            resourceInputs["rules"] = state ? state.rules : undefined;
        } else {
            const args = argsOrState as BucketServerSideEncryptionConfigurationV2Args | undefined;
            if ((!args || args.bucket === undefined) && !opts.urn) {
                throw new Error("Missing required property 'bucket'");
            }
            if ((!args || args.rules === undefined) && !opts.urn) {
                throw new Error("Missing required property 'rules'");
            }
            resourceInputs["bucket"] = args ? args.bucket : undefined;
            resourceInputs["expectedBucketOwner"] = args ? args.expectedBucketOwner : undefined;
            resourceInputs["rules"] = args ? args.rules : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(BucketServerSideEncryptionConfigurationV2.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering BucketServerSideEncryptionConfigurationV2 resources.
 */
export interface BucketServerSideEncryptionConfigurationV2State {
    /**
     * ID (name) of the bucket.
     */
    bucket?: pulumi.Input<string>;
    /**
     * Account ID of the expected bucket owner.
     */
    expectedBucketOwner?: pulumi.Input<string>;
    /**
     * Set of server-side encryption configuration rules. See below. Currently, only a single rule is supported.
     */
    rules?: pulumi.Input<pulumi.Input<inputs.s3.BucketServerSideEncryptionConfigurationV2Rule>[]>;
}

/**
 * The set of arguments for constructing a BucketServerSideEncryptionConfigurationV2 resource.
 */
export interface BucketServerSideEncryptionConfigurationV2Args {
    /**
     * ID (name) of the bucket.
     */
    bucket: pulumi.Input<string>;
    /**
     * Account ID of the expected bucket owner.
     */
    expectedBucketOwner?: pulumi.Input<string>;
    /**
     * Set of server-side encryption configuration rules. See below. Currently, only a single rule is supported.
     */
    rules: pulumi.Input<pulumi.Input<inputs.s3.BucketServerSideEncryptionConfigurationV2Rule>[]>;
}

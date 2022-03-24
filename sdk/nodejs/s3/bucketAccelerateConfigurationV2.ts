// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides an S3 bucket accelerate configuration resource. See the [Requirements for using Transfer Acceleration](https://docs.aws.amazon.com/AmazonS3/latest/userguide/transfer-acceleration.html#transfer-acceleration-requirements) for more details.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const mybucket = new aws.s3.BucketV2("mybucket", {});
 * const example = new aws.s3.BucketAccelerateConfigurationV2("example", {
 *     bucket: mybucket.bucket,
 *     status: "Enabled",
 * });
 * ```
 *
 * ## Import
 *
 * S3 bucket accelerate configuration can be imported in one of two ways. If the owner (account ID) of the source bucket is the same account used to configure the Terraform AWS Provider, the S3 bucket accelerate configuration resource should be imported using the `bucket` e.g.,
 *
 * ```sh
 *  $ pulumi import aws:s3/bucketAccelerateConfigurationV2:BucketAccelerateConfigurationV2 example bucket-name
 * ```
 *
 *  If the owner (account ID) of the source bucket differs from the account used to configure the Terraform AWS Provider, the S3 bucket accelerate configuration resource should be imported using the `bucket` and `expected_bucket_owner` separated by a comma (`,`) e.g.,
 *
 * ```sh
 *  $ pulumi import aws:s3/bucketAccelerateConfigurationV2:BucketAccelerateConfigurationV2 example bucket-name,123456789012
 * ```
 */
export class BucketAccelerateConfigurationV2 extends pulumi.CustomResource {
    /**
     * Get an existing BucketAccelerateConfigurationV2 resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: BucketAccelerateConfigurationV2State, opts?: pulumi.CustomResourceOptions): BucketAccelerateConfigurationV2 {
        return new BucketAccelerateConfigurationV2(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:s3/bucketAccelerateConfigurationV2:BucketAccelerateConfigurationV2';

    /**
     * Returns true if the given object is an instance of BucketAccelerateConfigurationV2.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is BucketAccelerateConfigurationV2 {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === BucketAccelerateConfigurationV2.__pulumiType;
    }

    /**
     * The name of the bucket.
     */
    public readonly bucket!: pulumi.Output<string>;
    /**
     * The account ID of the expected bucket owner.
     */
    public readonly expectedBucketOwner!: pulumi.Output<string | undefined>;
    /**
     * The transfer acceleration state of the bucket. Valid values: `Enabled`, `Suspended`.
     */
    public readonly status!: pulumi.Output<string>;

    /**
     * Create a BucketAccelerateConfigurationV2 resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: BucketAccelerateConfigurationV2Args, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: BucketAccelerateConfigurationV2Args | BucketAccelerateConfigurationV2State, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as BucketAccelerateConfigurationV2State | undefined;
            resourceInputs["bucket"] = state ? state.bucket : undefined;
            resourceInputs["expectedBucketOwner"] = state ? state.expectedBucketOwner : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
        } else {
            const args = argsOrState as BucketAccelerateConfigurationV2Args | undefined;
            if ((!args || args.bucket === undefined) && !opts.urn) {
                throw new Error("Missing required property 'bucket'");
            }
            if ((!args || args.status === undefined) && !opts.urn) {
                throw new Error("Missing required property 'status'");
            }
            resourceInputs["bucket"] = args ? args.bucket : undefined;
            resourceInputs["expectedBucketOwner"] = args ? args.expectedBucketOwner : undefined;
            resourceInputs["status"] = args ? args.status : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(BucketAccelerateConfigurationV2.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering BucketAccelerateConfigurationV2 resources.
 */
export interface BucketAccelerateConfigurationV2State {
    /**
     * The name of the bucket.
     */
    bucket?: pulumi.Input<string>;
    /**
     * The account ID of the expected bucket owner.
     */
    expectedBucketOwner?: pulumi.Input<string>;
    /**
     * The transfer acceleration state of the bucket. Valid values: `Enabled`, `Suspended`.
     */
    status?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a BucketAccelerateConfigurationV2 resource.
 */
export interface BucketAccelerateConfigurationV2Args {
    /**
     * The name of the bucket.
     */
    bucket: pulumi.Input<string>;
    /**
     * The account ID of the expected bucket owner.
     */
    expectedBucketOwner?: pulumi.Input<string>;
    /**
     * The transfer acceleration state of the bucket. Valid values: `Enabled`, `Suspended`.
     */
    status: pulumi.Input<string>;
}

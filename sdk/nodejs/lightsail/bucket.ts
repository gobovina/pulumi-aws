// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a lightsail bucket.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const test = new aws.lightsail.Bucket("test", {
 *     name: "mytestbucket",
 *     bundleId: "small_1_0",
 * });
 * ```
 *
 * ## Import
 *
 * Using `pulumi import`, import `aws_lightsail_bucket` using the `name` attribute. For example:
 *
 * ```sh
 *  $ pulumi import aws:lightsail/bucket:Bucket test example-bucket
 * ```
 */
export class Bucket extends pulumi.CustomResource {
    /**
     * Get an existing Bucket resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: BucketState, opts?: pulumi.CustomResourceOptions): Bucket {
        return new Bucket(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:lightsail/bucket:Bucket';

    /**
     * Returns true if the given object is an instance of Bucket.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Bucket {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Bucket.__pulumiType;
    }

    /**
     * The ARN of the lightsail bucket.
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * The resource Availability Zone. Follows the format us-east-2a (case-sensitive).
     */
    public /*out*/ readonly availabilityZone!: pulumi.Output<string>;
    /**
     * The ID of the bundle to use for the bucket. A bucket bundle specifies the monthly cost, storage space, and data transfer quota for a bucket. Use the [get-bucket-bundles](https://docs.aws.amazon.com/cli/latest/reference/lightsail/get-bucket-bundles.html) cli command to get a list of bundle IDs that you can specify.
     */
    public readonly bundleId!: pulumi.Output<string>;
    /**
     * The timestamp when the bucket was created.
     */
    public /*out*/ readonly createdAt!: pulumi.Output<string>;
    /**
     * Force Delete non-empty buckets using `pulumi destroy`. AWS by default will not delete an s3 bucket which is not empty, to prevent losing bucket data and affecting other resources in lightsail. If `forceDelete` is set to `true` the bucket will be deleted even when not empty.
     */
    public readonly forceDelete!: pulumi.Output<boolean | undefined>;
    /**
     * The name for the bucket.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The Amazon Web Services Region name.
     */
    public /*out*/ readonly region!: pulumi.Output<string>;
    /**
     * The support code for the resource. Include this code in your email to support when you have questions about a resource in Lightsail. This code enables our support team to look up your Lightsail information more easily.
     */
    public /*out*/ readonly supportCode!: pulumi.Output<string>;
    /**
     * A map of tags to assign to the resource. To create a key-only tag, use an empty string as the value. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     *
     * @deprecated Please use `tags` instead.
     */
    public /*out*/ readonly tagsAll!: pulumi.Output<{[key: string]: string}>;
    public /*out*/ readonly url!: pulumi.Output<string>;

    /**
     * Create a Bucket resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: BucketArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: BucketArgs | BucketState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as BucketState | undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["availabilityZone"] = state ? state.availabilityZone : undefined;
            resourceInputs["bundleId"] = state ? state.bundleId : undefined;
            resourceInputs["createdAt"] = state ? state.createdAt : undefined;
            resourceInputs["forceDelete"] = state ? state.forceDelete : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["region"] = state ? state.region : undefined;
            resourceInputs["supportCode"] = state ? state.supportCode : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tagsAll"] = state ? state.tagsAll : undefined;
            resourceInputs["url"] = state ? state.url : undefined;
        } else {
            const args = argsOrState as BucketArgs | undefined;
            if ((!args || args.bundleId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'bundleId'");
            }
            resourceInputs["bundleId"] = args ? args.bundleId : undefined;
            resourceInputs["forceDelete"] = args ? args.forceDelete : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["arn"] = undefined /*out*/;
            resourceInputs["availabilityZone"] = undefined /*out*/;
            resourceInputs["createdAt"] = undefined /*out*/;
            resourceInputs["region"] = undefined /*out*/;
            resourceInputs["supportCode"] = undefined /*out*/;
            resourceInputs["tagsAll"] = undefined /*out*/;
            resourceInputs["url"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Bucket.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Bucket resources.
 */
export interface BucketState {
    /**
     * The ARN of the lightsail bucket.
     */
    arn?: pulumi.Input<string>;
    /**
     * The resource Availability Zone. Follows the format us-east-2a (case-sensitive).
     */
    availabilityZone?: pulumi.Input<string>;
    /**
     * The ID of the bundle to use for the bucket. A bucket bundle specifies the monthly cost, storage space, and data transfer quota for a bucket. Use the [get-bucket-bundles](https://docs.aws.amazon.com/cli/latest/reference/lightsail/get-bucket-bundles.html) cli command to get a list of bundle IDs that you can specify.
     */
    bundleId?: pulumi.Input<string>;
    /**
     * The timestamp when the bucket was created.
     */
    createdAt?: pulumi.Input<string>;
    /**
     * Force Delete non-empty buckets using `pulumi destroy`. AWS by default will not delete an s3 bucket which is not empty, to prevent losing bucket data and affecting other resources in lightsail. If `forceDelete` is set to `true` the bucket will be deleted even when not empty.
     */
    forceDelete?: pulumi.Input<boolean>;
    /**
     * The name for the bucket.
     */
    name?: pulumi.Input<string>;
    /**
     * The Amazon Web Services Region name.
     */
    region?: pulumi.Input<string>;
    /**
     * The support code for the resource. Include this code in your email to support when you have questions about a resource in Lightsail. This code enables our support team to look up your Lightsail information more easily.
     */
    supportCode?: pulumi.Input<string>;
    /**
     * A map of tags to assign to the resource. To create a key-only tag, use an empty string as the value. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     *
     * @deprecated Please use `tags` instead.
     */
    tagsAll?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    url?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Bucket resource.
 */
export interface BucketArgs {
    /**
     * The ID of the bundle to use for the bucket. A bucket bundle specifies the monthly cost, storage space, and data transfer quota for a bucket. Use the [get-bucket-bundles](https://docs.aws.amazon.com/cli/latest/reference/lightsail/get-bucket-bundles.html) cli command to get a list of bundle IDs that you can specify.
     */
    bundleId: pulumi.Input<string>;
    /**
     * Force Delete non-empty buckets using `pulumi destroy`. AWS by default will not delete an s3 bucket which is not empty, to prevent losing bucket data and affecting other resources in lightsail. If `forceDelete` is set to `true` the bucket will be deleted even when not empty.
     */
    forceDelete?: pulumi.Input<boolean>;
    /**
     * The name for the bucket.
     */
    name?: pulumi.Input<string>;
    /**
     * A map of tags to assign to the resource. To create a key-only tag, use an empty string as the value. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}

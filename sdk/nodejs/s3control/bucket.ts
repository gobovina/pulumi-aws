// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a resource to manage an S3 Control Bucket.
 *
 * > This functionality is for managing [S3 on Outposts](https://docs.aws.amazon.com/AmazonS3/latest/dev/S3onOutposts.html). To manage S3 Buckets in an AWS Partition, see the `aws.s3.BucketV2` resource.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.s3control.Bucket("example", {
 *     bucket: "example",
 *     outpostId: exampleAwsOutpostsOutpost.id,
 * });
 * ```
 *
 * ## Import
 *
 * Using `pulumi import`, import S3 Control Buckets using Amazon Resource Name (ARN). For example:
 *
 * ```sh
 *  $ pulumi import aws:s3control/bucket:Bucket example arn:aws:s3-outposts:us-east-1:123456789012:outpost/op-12345678/bucket/example
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
    public static readonly __pulumiType = 'aws:s3control/bucket:Bucket';

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
     * Amazon Resource Name (ARN) of the bucket.
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * Name of the bucket.
     */
    public readonly bucket!: pulumi.Output<string>;
    /**
     * UTC creation date in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8).
     */
    public /*out*/ readonly creationDate!: pulumi.Output<string>;
    /**
     * Identifier of the Outpost to contain this bucket.
     */
    public readonly outpostId!: pulumi.Output<string>;
    /**
     * Boolean whether Public Access Block is enabled.
     */
    public /*out*/ readonly publicAccessBlockEnabled!: pulumi.Output<boolean>;
    /**
     * Key-value map of resource tags. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     *
     * @deprecated Please use `tags` instead.
     */
    public /*out*/ readonly tagsAll!: pulumi.Output<{[key: string]: string}>;

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
            resourceInputs["bucket"] = state ? state.bucket : undefined;
            resourceInputs["creationDate"] = state ? state.creationDate : undefined;
            resourceInputs["outpostId"] = state ? state.outpostId : undefined;
            resourceInputs["publicAccessBlockEnabled"] = state ? state.publicAccessBlockEnabled : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tagsAll"] = state ? state.tagsAll : undefined;
        } else {
            const args = argsOrState as BucketArgs | undefined;
            if ((!args || args.bucket === undefined) && !opts.urn) {
                throw new Error("Missing required property 'bucket'");
            }
            if ((!args || args.outpostId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'outpostId'");
            }
            resourceInputs["bucket"] = args ? args.bucket : undefined;
            resourceInputs["outpostId"] = args ? args.outpostId : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["arn"] = undefined /*out*/;
            resourceInputs["creationDate"] = undefined /*out*/;
            resourceInputs["publicAccessBlockEnabled"] = undefined /*out*/;
            resourceInputs["tagsAll"] = undefined /*out*/;
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
     * Amazon Resource Name (ARN) of the bucket.
     */
    arn?: pulumi.Input<string>;
    /**
     * Name of the bucket.
     */
    bucket?: pulumi.Input<string>;
    /**
     * UTC creation date in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8).
     */
    creationDate?: pulumi.Input<string>;
    /**
     * Identifier of the Outpost to contain this bucket.
     */
    outpostId?: pulumi.Input<string>;
    /**
     * Boolean whether Public Access Block is enabled.
     */
    publicAccessBlockEnabled?: pulumi.Input<boolean>;
    /**
     * Key-value map of resource tags. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     *
     * @deprecated Please use `tags` instead.
     */
    tagsAll?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}

/**
 * The set of arguments for constructing a Bucket resource.
 */
export interface BucketArgs {
    /**
     * Name of the bucket.
     */
    bucket: pulumi.Input<string>;
    /**
     * Identifier of the Outpost to contain this bucket.
     */
    outpostId: pulumi.Input<string>;
    /**
     * Key-value map of resource tags. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}

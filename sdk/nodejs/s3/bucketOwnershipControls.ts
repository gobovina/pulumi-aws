// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Provides a resource to manage S3 Bucket Ownership Controls. For more information, see the [S3 Developer Guide](https://docs.aws.amazon.com/AmazonS3/latest/dev/about-object-ownership.html).
 *
 * > This resource cannot be used with S3 directory buckets.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.s3.BucketV2("example", {bucket: "example"});
 * const exampleBucketOwnershipControls = new aws.s3.BucketOwnershipControls("example", {
 *     bucket: example.id,
 *     rule: {
 *         objectOwnership: "BucketOwnerPreferred",
 *     },
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ## Import
 *
 * Using `pulumi import`, import S3 Bucket Ownership Controls using S3 Bucket name. For example:
 *
 * ```sh
 * $ pulumi import aws:s3/bucketOwnershipControls:BucketOwnershipControls example my-bucket
 * ```
 */
export class BucketOwnershipControls extends pulumi.CustomResource {
    /**
     * Get an existing BucketOwnershipControls resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: BucketOwnershipControlsState, opts?: pulumi.CustomResourceOptions): BucketOwnershipControls {
        return new BucketOwnershipControls(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:s3/bucketOwnershipControls:BucketOwnershipControls';

    /**
     * Returns true if the given object is an instance of BucketOwnershipControls.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is BucketOwnershipControls {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === BucketOwnershipControls.__pulumiType;
    }

    /**
     * Name of the bucket that you want to associate this access point with.
     */
    public readonly bucket!: pulumi.Output<string>;
    /**
     * Configuration block(s) with Ownership Controls rules. Detailed below.
     */
    public readonly rule!: pulumi.Output<outputs.s3.BucketOwnershipControlsRule>;

    /**
     * Create a BucketOwnershipControls resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: BucketOwnershipControlsArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: BucketOwnershipControlsArgs | BucketOwnershipControlsState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as BucketOwnershipControlsState | undefined;
            resourceInputs["bucket"] = state ? state.bucket : undefined;
            resourceInputs["rule"] = state ? state.rule : undefined;
        } else {
            const args = argsOrState as BucketOwnershipControlsArgs | undefined;
            if ((!args || args.bucket === undefined) && !opts.urn) {
                throw new Error("Missing required property 'bucket'");
            }
            if ((!args || args.rule === undefined) && !opts.urn) {
                throw new Error("Missing required property 'rule'");
            }
            resourceInputs["bucket"] = args ? args.bucket : undefined;
            resourceInputs["rule"] = args ? args.rule : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(BucketOwnershipControls.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering BucketOwnershipControls resources.
 */
export interface BucketOwnershipControlsState {
    /**
     * Name of the bucket that you want to associate this access point with.
     */
    bucket?: pulumi.Input<string>;
    /**
     * Configuration block(s) with Ownership Controls rules. Detailed below.
     */
    rule?: pulumi.Input<inputs.s3.BucketOwnershipControlsRule>;
}

/**
 * The set of arguments for constructing a BucketOwnershipControls resource.
 */
export interface BucketOwnershipControlsArgs {
    /**
     * Name of the bucket that you want to associate this access point with.
     */
    bucket: pulumi.Input<string>;
    /**
     * Configuration block(s) with Ownership Controls rules. Detailed below.
     */
    rule: pulumi.Input<inputs.s3.BucketOwnershipControlsRule>;
}

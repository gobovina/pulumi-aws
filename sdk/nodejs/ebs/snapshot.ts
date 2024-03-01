// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Creates a Snapshot of an EBS Volume.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.ebs.Volume("example", {
 *     availabilityZone: "us-west-2a",
 *     size: 40,
 *     tags: {
 *         Name: "HelloWorld",
 *     },
 * });
 * const exampleSnapshot = new aws.ebs.Snapshot("example_snapshot", {
 *     volumeId: example.id,
 *     tags: {
 *         Name: "HelloWorld_snap",
 *     },
 * });
 * ```
 *
 * ## Import
 *
 * Using `pulumi import`, import EBS Snapshot using the `id`. For example:
 *
 * ```sh
 *  $ pulumi import aws:ebs/snapshot:Snapshot id snap-049df61146c4d7901
 * ```
 */
export class Snapshot extends pulumi.CustomResource {
    /**
     * Get an existing Snapshot resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SnapshotState, opts?: pulumi.CustomResourceOptions): Snapshot {
        return new Snapshot(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:ebs/snapshot:Snapshot';

    /**
     * Returns true if the given object is an instance of Snapshot.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Snapshot {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Snapshot.__pulumiType;
    }

    /**
     * Amazon Resource Name (ARN) of the EBS Snapshot.
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * The data encryption key identifier for the snapshot.
     */
    public /*out*/ readonly dataEncryptionKeyId!: pulumi.Output<string>;
    /**
     * A description of what the snapshot is.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Whether the snapshot is encrypted.
     */
    public /*out*/ readonly encrypted!: pulumi.Output<boolean>;
    /**
     * The ARN for the KMS encryption key.
     */
    public /*out*/ readonly kmsKeyId!: pulumi.Output<string>;
    /**
     * The Amazon Resource Name (ARN) of the Outpost on which to create a local snapshot.
     */
    public readonly outpostArn!: pulumi.Output<string | undefined>;
    /**
     * Value from an Amazon-maintained list (`amazon`, `aws-marketplace`, `microsoft`) of snapshot owners.
     */
    public /*out*/ readonly ownerAlias!: pulumi.Output<string>;
    /**
     * The AWS account ID of the EBS snapshot owner.
     */
    public /*out*/ readonly ownerId!: pulumi.Output<string>;
    /**
     * Indicates whether to permanently restore an archived snapshot.
     */
    public readonly permanentRestore!: pulumi.Output<boolean | undefined>;
    /**
     * The name of the storage tier. Valid values are `archive` and `standard`. Default value is `standard`.
     */
    public readonly storageTier!: pulumi.Output<string>;
    /**
     * A map of tags to assign to the snapshot. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     *
     * @deprecated Please use `tags` instead.
     */
    public /*out*/ readonly tagsAll!: pulumi.Output<{[key: string]: string}>;
    /**
     * Specifies the number of days for which to temporarily restore an archived snapshot. Required for temporary restores only. The snapshot will be automatically re-archived after this period.
     */
    public readonly temporaryRestoreDays!: pulumi.Output<number | undefined>;
    /**
     * The Volume ID of which to make a snapshot.
     */
    public readonly volumeId!: pulumi.Output<string>;
    /**
     * The size of the drive in GiBs.
     */
    public /*out*/ readonly volumeSize!: pulumi.Output<number>;

    /**
     * Create a Snapshot resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: SnapshotArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: SnapshotArgs | SnapshotState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as SnapshotState | undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["dataEncryptionKeyId"] = state ? state.dataEncryptionKeyId : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["encrypted"] = state ? state.encrypted : undefined;
            resourceInputs["kmsKeyId"] = state ? state.kmsKeyId : undefined;
            resourceInputs["outpostArn"] = state ? state.outpostArn : undefined;
            resourceInputs["ownerAlias"] = state ? state.ownerAlias : undefined;
            resourceInputs["ownerId"] = state ? state.ownerId : undefined;
            resourceInputs["permanentRestore"] = state ? state.permanentRestore : undefined;
            resourceInputs["storageTier"] = state ? state.storageTier : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tagsAll"] = state ? state.tagsAll : undefined;
            resourceInputs["temporaryRestoreDays"] = state ? state.temporaryRestoreDays : undefined;
            resourceInputs["volumeId"] = state ? state.volumeId : undefined;
            resourceInputs["volumeSize"] = state ? state.volumeSize : undefined;
        } else {
            const args = argsOrState as SnapshotArgs | undefined;
            if ((!args || args.volumeId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'volumeId'");
            }
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["outpostArn"] = args ? args.outpostArn : undefined;
            resourceInputs["permanentRestore"] = args ? args.permanentRestore : undefined;
            resourceInputs["storageTier"] = args ? args.storageTier : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["temporaryRestoreDays"] = args ? args.temporaryRestoreDays : undefined;
            resourceInputs["volumeId"] = args ? args.volumeId : undefined;
            resourceInputs["arn"] = undefined /*out*/;
            resourceInputs["dataEncryptionKeyId"] = undefined /*out*/;
            resourceInputs["encrypted"] = undefined /*out*/;
            resourceInputs["kmsKeyId"] = undefined /*out*/;
            resourceInputs["ownerAlias"] = undefined /*out*/;
            resourceInputs["ownerId"] = undefined /*out*/;
            resourceInputs["tagsAll"] = undefined /*out*/;
            resourceInputs["volumeSize"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Snapshot.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Snapshot resources.
 */
export interface SnapshotState {
    /**
     * Amazon Resource Name (ARN) of the EBS Snapshot.
     */
    arn?: pulumi.Input<string>;
    /**
     * The data encryption key identifier for the snapshot.
     */
    dataEncryptionKeyId?: pulumi.Input<string>;
    /**
     * A description of what the snapshot is.
     */
    description?: pulumi.Input<string>;
    /**
     * Whether the snapshot is encrypted.
     */
    encrypted?: pulumi.Input<boolean>;
    /**
     * The ARN for the KMS encryption key.
     */
    kmsKeyId?: pulumi.Input<string>;
    /**
     * The Amazon Resource Name (ARN) of the Outpost on which to create a local snapshot.
     */
    outpostArn?: pulumi.Input<string>;
    /**
     * Value from an Amazon-maintained list (`amazon`, `aws-marketplace`, `microsoft`) of snapshot owners.
     */
    ownerAlias?: pulumi.Input<string>;
    /**
     * The AWS account ID of the EBS snapshot owner.
     */
    ownerId?: pulumi.Input<string>;
    /**
     * Indicates whether to permanently restore an archived snapshot.
     */
    permanentRestore?: pulumi.Input<boolean>;
    /**
     * The name of the storage tier. Valid values are `archive` and `standard`. Default value is `standard`.
     */
    storageTier?: pulumi.Input<string>;
    /**
     * A map of tags to assign to the snapshot. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     *
     * @deprecated Please use `tags` instead.
     */
    tagsAll?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Specifies the number of days for which to temporarily restore an archived snapshot. Required for temporary restores only. The snapshot will be automatically re-archived after this period.
     */
    temporaryRestoreDays?: pulumi.Input<number>;
    /**
     * The Volume ID of which to make a snapshot.
     */
    volumeId?: pulumi.Input<string>;
    /**
     * The size of the drive in GiBs.
     */
    volumeSize?: pulumi.Input<number>;
}

/**
 * The set of arguments for constructing a Snapshot resource.
 */
export interface SnapshotArgs {
    /**
     * A description of what the snapshot is.
     */
    description?: pulumi.Input<string>;
    /**
     * The Amazon Resource Name (ARN) of the Outpost on which to create a local snapshot.
     */
    outpostArn?: pulumi.Input<string>;
    /**
     * Indicates whether to permanently restore an archived snapshot.
     */
    permanentRestore?: pulumi.Input<boolean>;
    /**
     * The name of the storage tier. Valid values are `archive` and `standard`. Default value is `standard`.
     */
    storageTier?: pulumi.Input<string>;
    /**
     * A map of tags to assign to the snapshot. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Specifies the number of days for which to temporarily restore an archived snapshot. Required for temporary restores only. The snapshot will be automatically re-archived after this period.
     */
    temporaryRestoreDays?: pulumi.Input<number>;
    /**
     * The Volume ID of which to make a snapshot.
     */
    volumeId: pulumi.Input<string>;
}

// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Creates a Snapshot of a snapshot.
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
 * const exampleCopy = new aws.ebs.SnapshotCopy("example_copy", {
 *     sourceSnapshotId: exampleSnapshot.id,
 *     sourceRegion: "us-west-2",
 *     tags: {
 *         Name: "HelloWorld_copy_snap",
 *     },
 * });
 * ```
 */
export class SnapshotCopy extends pulumi.CustomResource {
    /**
     * Get an existing SnapshotCopy resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SnapshotCopyState, opts?: pulumi.CustomResourceOptions): SnapshotCopy {
        return new SnapshotCopy(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:ebs/snapshotCopy:SnapshotCopy';

    /**
     * Returns true if the given object is an instance of SnapshotCopy.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is SnapshotCopy {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === SnapshotCopy.__pulumiType;
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
    public readonly encrypted!: pulumi.Output<boolean | undefined>;
    /**
     * The ARN for the KMS encryption key.
     */
    public readonly kmsKeyId!: pulumi.Output<string | undefined>;
    public /*out*/ readonly outpostArn!: pulumi.Output<string>;
    /**
     * Value from an Amazon-maintained list (`amazon`, `aws-marketplace`, `microsoft`) of snapshot owners.
     */
    public /*out*/ readonly ownerAlias!: pulumi.Output<string>;
    /**
     * The AWS account ID of the snapshot owner.
     */
    public /*out*/ readonly ownerId!: pulumi.Output<string>;
    /**
     * Indicates whether to permanently restore an archived snapshot.
     */
    public readonly permanentRestore!: pulumi.Output<boolean | undefined>;
    /**
     * The region of the source snapshot.
     */
    public readonly sourceRegion!: pulumi.Output<string>;
    /**
     * The ARN for the snapshot to be copied.
     */
    public readonly sourceSnapshotId!: pulumi.Output<string>;
    /**
     * The name of the storage tier. Valid values are `archive` and `standard`. Default value is `standard`.
     */
    public readonly storageTier!: pulumi.Output<string>;
    /**
     * A map of tags for the snapshot.
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
    public /*out*/ readonly volumeId!: pulumi.Output<string>;
    /**
     * The size of the drive in GiBs.
     */
    public /*out*/ readonly volumeSize!: pulumi.Output<number>;

    /**
     * Create a SnapshotCopy resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: SnapshotCopyArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: SnapshotCopyArgs | SnapshotCopyState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as SnapshotCopyState | undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["dataEncryptionKeyId"] = state ? state.dataEncryptionKeyId : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["encrypted"] = state ? state.encrypted : undefined;
            resourceInputs["kmsKeyId"] = state ? state.kmsKeyId : undefined;
            resourceInputs["outpostArn"] = state ? state.outpostArn : undefined;
            resourceInputs["ownerAlias"] = state ? state.ownerAlias : undefined;
            resourceInputs["ownerId"] = state ? state.ownerId : undefined;
            resourceInputs["permanentRestore"] = state ? state.permanentRestore : undefined;
            resourceInputs["sourceRegion"] = state ? state.sourceRegion : undefined;
            resourceInputs["sourceSnapshotId"] = state ? state.sourceSnapshotId : undefined;
            resourceInputs["storageTier"] = state ? state.storageTier : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tagsAll"] = state ? state.tagsAll : undefined;
            resourceInputs["temporaryRestoreDays"] = state ? state.temporaryRestoreDays : undefined;
            resourceInputs["volumeId"] = state ? state.volumeId : undefined;
            resourceInputs["volumeSize"] = state ? state.volumeSize : undefined;
        } else {
            const args = argsOrState as SnapshotCopyArgs | undefined;
            if ((!args || args.sourceRegion === undefined) && !opts.urn) {
                throw new Error("Missing required property 'sourceRegion'");
            }
            if ((!args || args.sourceSnapshotId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'sourceSnapshotId'");
            }
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["encrypted"] = args ? args.encrypted : undefined;
            resourceInputs["kmsKeyId"] = args ? args.kmsKeyId : undefined;
            resourceInputs["permanentRestore"] = args ? args.permanentRestore : undefined;
            resourceInputs["sourceRegion"] = args ? args.sourceRegion : undefined;
            resourceInputs["sourceSnapshotId"] = args ? args.sourceSnapshotId : undefined;
            resourceInputs["storageTier"] = args ? args.storageTier : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["temporaryRestoreDays"] = args ? args.temporaryRestoreDays : undefined;
            resourceInputs["arn"] = undefined /*out*/;
            resourceInputs["dataEncryptionKeyId"] = undefined /*out*/;
            resourceInputs["outpostArn"] = undefined /*out*/;
            resourceInputs["ownerAlias"] = undefined /*out*/;
            resourceInputs["ownerId"] = undefined /*out*/;
            resourceInputs["tagsAll"] = undefined /*out*/;
            resourceInputs["volumeId"] = undefined /*out*/;
            resourceInputs["volumeSize"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(SnapshotCopy.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering SnapshotCopy resources.
 */
export interface SnapshotCopyState {
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
    outpostArn?: pulumi.Input<string>;
    /**
     * Value from an Amazon-maintained list (`amazon`, `aws-marketplace`, `microsoft`) of snapshot owners.
     */
    ownerAlias?: pulumi.Input<string>;
    /**
     * The AWS account ID of the snapshot owner.
     */
    ownerId?: pulumi.Input<string>;
    /**
     * Indicates whether to permanently restore an archived snapshot.
     */
    permanentRestore?: pulumi.Input<boolean>;
    /**
     * The region of the source snapshot.
     */
    sourceRegion?: pulumi.Input<string>;
    /**
     * The ARN for the snapshot to be copied.
     */
    sourceSnapshotId?: pulumi.Input<string>;
    /**
     * The name of the storage tier. Valid values are `archive` and `standard`. Default value is `standard`.
     */
    storageTier?: pulumi.Input<string>;
    /**
     * A map of tags for the snapshot.
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
    volumeId?: pulumi.Input<string>;
    /**
     * The size of the drive in GiBs.
     */
    volumeSize?: pulumi.Input<number>;
}

/**
 * The set of arguments for constructing a SnapshotCopy resource.
 */
export interface SnapshotCopyArgs {
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
     * Indicates whether to permanently restore an archived snapshot.
     */
    permanentRestore?: pulumi.Input<boolean>;
    /**
     * The region of the source snapshot.
     */
    sourceRegion: pulumi.Input<string>;
    /**
     * The ARN for the snapshot to be copied.
     */
    sourceSnapshotId: pulumi.Input<string>;
    /**
     * The name of the storage tier. Valid values are `archive` and `standard`. Default value is `standard`.
     */
    storageTier?: pulumi.Input<string>;
    /**
     * A map of tags for the snapshot.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Specifies the number of days for which to temporarily restore an archived snapshot. Required for temporary restores only. The snapshot will be automatically re-archived after this period.
     */
    temporaryRestoreDays?: pulumi.Input<number>;
}

// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Adds permission to create volumes off of a given EBS Snapshot.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.ebs.Volume("example", {
 *     availabilityZone: "us-west-2a",
 *     size: 40,
 * });
 * const exampleSnapshot = new aws.ebs.Snapshot("example_snapshot", {volumeId: example.id});
 * const examplePerm = new aws.ec2.SnapshotCreateVolumePermission("example_perm", {
 *     snapshotId: exampleSnapshot.id,
 *     accountId: "12345678",
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 */
export class SnapshotCreateVolumePermission extends pulumi.CustomResource {
    /**
     * Get an existing SnapshotCreateVolumePermission resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SnapshotCreateVolumePermissionState, opts?: pulumi.CustomResourceOptions): SnapshotCreateVolumePermission {
        return new SnapshotCreateVolumePermission(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:ec2/snapshotCreateVolumePermission:SnapshotCreateVolumePermission';

    /**
     * Returns true if the given object is an instance of SnapshotCreateVolumePermission.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is SnapshotCreateVolumePermission {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === SnapshotCreateVolumePermission.__pulumiType;
    }

    /**
     * An AWS Account ID to add create volume permissions. The AWS Account cannot be the snapshot's owner
     */
    public readonly accountId!: pulumi.Output<string>;
    /**
     * A snapshot ID
     */
    public readonly snapshotId!: pulumi.Output<string>;

    /**
     * Create a SnapshotCreateVolumePermission resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: SnapshotCreateVolumePermissionArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: SnapshotCreateVolumePermissionArgs | SnapshotCreateVolumePermissionState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as SnapshotCreateVolumePermissionState | undefined;
            resourceInputs["accountId"] = state ? state.accountId : undefined;
            resourceInputs["snapshotId"] = state ? state.snapshotId : undefined;
        } else {
            const args = argsOrState as SnapshotCreateVolumePermissionArgs | undefined;
            if ((!args || args.accountId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'accountId'");
            }
            if ((!args || args.snapshotId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'snapshotId'");
            }
            resourceInputs["accountId"] = args ? args.accountId : undefined;
            resourceInputs["snapshotId"] = args ? args.snapshotId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(SnapshotCreateVolumePermission.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering SnapshotCreateVolumePermission resources.
 */
export interface SnapshotCreateVolumePermissionState {
    /**
     * An AWS Account ID to add create volume permissions. The AWS Account cannot be the snapshot's owner
     */
    accountId?: pulumi.Input<string>;
    /**
     * A snapshot ID
     */
    snapshotId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a SnapshotCreateVolumePermission resource.
 */
export interface SnapshotCreateVolumePermissionArgs {
    /**
     * An AWS Account ID to add create volume permissions. The AWS Account cannot be the snapshot's owner
     */
    accountId: pulumi.Input<string>;
    /**
     * A snapshot ID
     */
    snapshotId: pulumi.Input<string>;
}

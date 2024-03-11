// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Manages an AWS Storage Gateway stored iSCSI volume.
 *
 * > **NOTE:** The gateway must have a working storage added (e.g., via the `aws.storagegateway.WorkingStorage` resource) before the volume is operational to clients, however the Storage Gateway API will allow volume creation without error in that case and return volume status as `WORKING STORAGE NOT CONFIGURED`.
 *
 * ## Example Usage
 *
 * ### Create Empty Stored iSCSI Volume
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.storagegateway.StoredIscsiVolume("example", {
 *     gatewayArn: exampleAwsStoragegatewayCache.gatewayArn,
 *     networkInterfaceId: exampleAwsInstance.privateIp,
 *     targetName: "example",
 *     preserveExistingData: false,
 *     diskId: test.id,
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ### Create Stored iSCSI Volume From Snapshot
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.storagegateway.StoredIscsiVolume("example", {
 *     gatewayArn: exampleAwsStoragegatewayCache.gatewayArn,
 *     networkInterfaceId: exampleAwsInstance.privateIp,
 *     snapshotId: exampleAwsEbsSnapshot.id,
 *     targetName: "example",
 *     preserveExistingData: false,
 *     diskId: test.id,
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ## Import
 *
 * Using `pulumi import`, import `aws_storagegateway_stored_iscsi_volume` using the volume Amazon Resource Name (ARN). For example:
 *
 * ```sh
 * $ pulumi import aws:storagegateway/storedIscsiVolume:StoredIscsiVolume example arn:aws:storagegateway:us-east-1:123456789012:gateway/sgw-12345678/volume/vol-12345678
 * ```
 */
export class StoredIscsiVolume extends pulumi.CustomResource {
    /**
     * Get an existing StoredIscsiVolume resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: StoredIscsiVolumeState, opts?: pulumi.CustomResourceOptions): StoredIscsiVolume {
        return new StoredIscsiVolume(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:storagegateway/storedIscsiVolume:StoredIscsiVolume';

    /**
     * Returns true if the given object is an instance of StoredIscsiVolume.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is StoredIscsiVolume {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === StoredIscsiVolume.__pulumiType;
    }

    /**
     * Volume Amazon Resource Name (ARN), e.g., `arn:aws:storagegateway:us-east-1:123456789012:gateway/sgw-12345678/volume/vol-12345678`.
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * Whether mutual CHAP is enabled for the iSCSI target.
     */
    public /*out*/ readonly chapEnabled!: pulumi.Output<boolean>;
    /**
     * The unique identifier for the gateway local disk that is configured as a stored volume.
     */
    public readonly diskId!: pulumi.Output<string>;
    /**
     * The Amazon Resource Name (ARN) of the gateway.
     */
    public readonly gatewayArn!: pulumi.Output<string>;
    /**
     * `true` to use Amazon S3 server side encryption with your own AWS KMS key, or `false` to use a key managed by Amazon S3. Optional.
     */
    public readonly kmsEncrypted!: pulumi.Output<boolean | undefined>;
    /**
     * The Amazon Resource Name (ARN) of the AWS KMS key used for Amazon S3 server side encryption. This value can only be set when `kmsEncrypted` is `true`.
     */
    public readonly kmsKey!: pulumi.Output<string | undefined>;
    /**
     * Logical disk number.
     */
    public /*out*/ readonly lunNumber!: pulumi.Output<number>;
    /**
     * The network interface of the gateway on which to expose the iSCSI target. Only IPv4 addresses are accepted.
     */
    public readonly networkInterfaceId!: pulumi.Output<string>;
    /**
     * The port used to communicate with iSCSI targets.
     */
    public /*out*/ readonly networkInterfacePort!: pulumi.Output<number>;
    /**
     * Specify this field as `true` if you want to preserve the data on the local disk. Otherwise, specifying this field as false creates an empty volume.
     */
    public readonly preserveExistingData!: pulumi.Output<boolean>;
    /**
     * The snapshot ID of the snapshot to restore as the new stored volumeE.g., `snap-1122aabb`.
     */
    public readonly snapshotId!: pulumi.Output<string | undefined>;
    /**
     * Key-value mapping of resource tags. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     *
     * @deprecated Please use `tags` instead.
     */
    public /*out*/ readonly tagsAll!: pulumi.Output<{[key: string]: string}>;
    /**
     * Target Amazon Resource Name (ARN), e.g., `arn:aws:storagegateway:us-east-1:123456789012:gateway/sgw-12345678/target/iqn.1997-05.com.amazon:TargetName`.
     */
    public /*out*/ readonly targetArn!: pulumi.Output<string>;
    /**
     * The name of the iSCSI target used by initiators to connect to the target and as a suffix for the target ARN. The target name must be unique across all volumes of a gateway.
     */
    public readonly targetName!: pulumi.Output<string>;
    /**
     * A value that indicates whether a storage volume is attached to, detached from, or is in the process of detaching from a gateway.
     */
    public /*out*/ readonly volumeAttachmentStatus!: pulumi.Output<string>;
    /**
     * Volume ID, e.g., `vol-12345678`.
     */
    public /*out*/ readonly volumeId!: pulumi.Output<string>;
    /**
     * The size of the data stored on the volume in bytes.
     */
    public /*out*/ readonly volumeSizeInBytes!: pulumi.Output<number>;
    /**
     * indicates the state of the storage volume.
     */
    public /*out*/ readonly volumeStatus!: pulumi.Output<string>;
    /**
     * indicates the type of the volume.
     */
    public /*out*/ readonly volumeType!: pulumi.Output<string>;

    /**
     * Create a StoredIscsiVolume resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: StoredIscsiVolumeArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: StoredIscsiVolumeArgs | StoredIscsiVolumeState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as StoredIscsiVolumeState | undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["chapEnabled"] = state ? state.chapEnabled : undefined;
            resourceInputs["diskId"] = state ? state.diskId : undefined;
            resourceInputs["gatewayArn"] = state ? state.gatewayArn : undefined;
            resourceInputs["kmsEncrypted"] = state ? state.kmsEncrypted : undefined;
            resourceInputs["kmsKey"] = state ? state.kmsKey : undefined;
            resourceInputs["lunNumber"] = state ? state.lunNumber : undefined;
            resourceInputs["networkInterfaceId"] = state ? state.networkInterfaceId : undefined;
            resourceInputs["networkInterfacePort"] = state ? state.networkInterfacePort : undefined;
            resourceInputs["preserveExistingData"] = state ? state.preserveExistingData : undefined;
            resourceInputs["snapshotId"] = state ? state.snapshotId : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tagsAll"] = state ? state.tagsAll : undefined;
            resourceInputs["targetArn"] = state ? state.targetArn : undefined;
            resourceInputs["targetName"] = state ? state.targetName : undefined;
            resourceInputs["volumeAttachmentStatus"] = state ? state.volumeAttachmentStatus : undefined;
            resourceInputs["volumeId"] = state ? state.volumeId : undefined;
            resourceInputs["volumeSizeInBytes"] = state ? state.volumeSizeInBytes : undefined;
            resourceInputs["volumeStatus"] = state ? state.volumeStatus : undefined;
            resourceInputs["volumeType"] = state ? state.volumeType : undefined;
        } else {
            const args = argsOrState as StoredIscsiVolumeArgs | undefined;
            if ((!args || args.diskId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'diskId'");
            }
            if ((!args || args.gatewayArn === undefined) && !opts.urn) {
                throw new Error("Missing required property 'gatewayArn'");
            }
            if ((!args || args.networkInterfaceId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'networkInterfaceId'");
            }
            if ((!args || args.preserveExistingData === undefined) && !opts.urn) {
                throw new Error("Missing required property 'preserveExistingData'");
            }
            if ((!args || args.targetName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'targetName'");
            }
            resourceInputs["diskId"] = args ? args.diskId : undefined;
            resourceInputs["gatewayArn"] = args ? args.gatewayArn : undefined;
            resourceInputs["kmsEncrypted"] = args ? args.kmsEncrypted : undefined;
            resourceInputs["kmsKey"] = args ? args.kmsKey : undefined;
            resourceInputs["networkInterfaceId"] = args ? args.networkInterfaceId : undefined;
            resourceInputs["preserveExistingData"] = args ? args.preserveExistingData : undefined;
            resourceInputs["snapshotId"] = args ? args.snapshotId : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["targetName"] = args ? args.targetName : undefined;
            resourceInputs["arn"] = undefined /*out*/;
            resourceInputs["chapEnabled"] = undefined /*out*/;
            resourceInputs["lunNumber"] = undefined /*out*/;
            resourceInputs["networkInterfacePort"] = undefined /*out*/;
            resourceInputs["tagsAll"] = undefined /*out*/;
            resourceInputs["targetArn"] = undefined /*out*/;
            resourceInputs["volumeAttachmentStatus"] = undefined /*out*/;
            resourceInputs["volumeId"] = undefined /*out*/;
            resourceInputs["volumeSizeInBytes"] = undefined /*out*/;
            resourceInputs["volumeStatus"] = undefined /*out*/;
            resourceInputs["volumeType"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(StoredIscsiVolume.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering StoredIscsiVolume resources.
 */
export interface StoredIscsiVolumeState {
    /**
     * Volume Amazon Resource Name (ARN), e.g., `arn:aws:storagegateway:us-east-1:123456789012:gateway/sgw-12345678/volume/vol-12345678`.
     */
    arn?: pulumi.Input<string>;
    /**
     * Whether mutual CHAP is enabled for the iSCSI target.
     */
    chapEnabled?: pulumi.Input<boolean>;
    /**
     * The unique identifier for the gateway local disk that is configured as a stored volume.
     */
    diskId?: pulumi.Input<string>;
    /**
     * The Amazon Resource Name (ARN) of the gateway.
     */
    gatewayArn?: pulumi.Input<string>;
    /**
     * `true` to use Amazon S3 server side encryption with your own AWS KMS key, or `false` to use a key managed by Amazon S3. Optional.
     */
    kmsEncrypted?: pulumi.Input<boolean>;
    /**
     * The Amazon Resource Name (ARN) of the AWS KMS key used for Amazon S3 server side encryption. This value can only be set when `kmsEncrypted` is `true`.
     */
    kmsKey?: pulumi.Input<string>;
    /**
     * Logical disk number.
     */
    lunNumber?: pulumi.Input<number>;
    /**
     * The network interface of the gateway on which to expose the iSCSI target. Only IPv4 addresses are accepted.
     */
    networkInterfaceId?: pulumi.Input<string>;
    /**
     * The port used to communicate with iSCSI targets.
     */
    networkInterfacePort?: pulumi.Input<number>;
    /**
     * Specify this field as `true` if you want to preserve the data on the local disk. Otherwise, specifying this field as false creates an empty volume.
     */
    preserveExistingData?: pulumi.Input<boolean>;
    /**
     * The snapshot ID of the snapshot to restore as the new stored volumeE.g., `snap-1122aabb`.
     */
    snapshotId?: pulumi.Input<string>;
    /**
     * Key-value mapping of resource tags. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     *
     * @deprecated Please use `tags` instead.
     */
    tagsAll?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Target Amazon Resource Name (ARN), e.g., `arn:aws:storagegateway:us-east-1:123456789012:gateway/sgw-12345678/target/iqn.1997-05.com.amazon:TargetName`.
     */
    targetArn?: pulumi.Input<string>;
    /**
     * The name of the iSCSI target used by initiators to connect to the target and as a suffix for the target ARN. The target name must be unique across all volumes of a gateway.
     */
    targetName?: pulumi.Input<string>;
    /**
     * A value that indicates whether a storage volume is attached to, detached from, or is in the process of detaching from a gateway.
     */
    volumeAttachmentStatus?: pulumi.Input<string>;
    /**
     * Volume ID, e.g., `vol-12345678`.
     */
    volumeId?: pulumi.Input<string>;
    /**
     * The size of the data stored on the volume in bytes.
     */
    volumeSizeInBytes?: pulumi.Input<number>;
    /**
     * indicates the state of the storage volume.
     */
    volumeStatus?: pulumi.Input<string>;
    /**
     * indicates the type of the volume.
     */
    volumeType?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a StoredIscsiVolume resource.
 */
export interface StoredIscsiVolumeArgs {
    /**
     * The unique identifier for the gateway local disk that is configured as a stored volume.
     */
    diskId: pulumi.Input<string>;
    /**
     * The Amazon Resource Name (ARN) of the gateway.
     */
    gatewayArn: pulumi.Input<string>;
    /**
     * `true` to use Amazon S3 server side encryption with your own AWS KMS key, or `false` to use a key managed by Amazon S3. Optional.
     */
    kmsEncrypted?: pulumi.Input<boolean>;
    /**
     * The Amazon Resource Name (ARN) of the AWS KMS key used for Amazon S3 server side encryption. This value can only be set when `kmsEncrypted` is `true`.
     */
    kmsKey?: pulumi.Input<string>;
    /**
     * The network interface of the gateway on which to expose the iSCSI target. Only IPv4 addresses are accepted.
     */
    networkInterfaceId: pulumi.Input<string>;
    /**
     * Specify this field as `true` if you want to preserve the data on the local disk. Otherwise, specifying this field as false creates an empty volume.
     */
    preserveExistingData: pulumi.Input<boolean>;
    /**
     * The snapshot ID of the snapshot to restore as the new stored volumeE.g., `snap-1122aabb`.
     */
    snapshotId?: pulumi.Input<string>;
    /**
     * Key-value mapping of resource tags. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The name of the iSCSI target used by initiators to connect to the target and as a suffix for the target ARN. The target name must be unique across all volumes of a gateway.
     */
    targetName: pulumi.Input<string>;
}

// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Provides an Elastic File System (EFS) File System resource.
 *
 * ## Example Usage
 * ### EFS File System w/ tags
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const foo = new aws.efs.FileSystem("foo", {tags: {
 *     Name: "MyProduct",
 * }});
 * ```
 * ### Using lifecycle policy
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const fooWithLifecylePolicy = new aws.efs.FileSystem("fooWithLifecylePolicy", {lifecyclePolicies: [{
 *     transitionToIa: "AFTER_30_DAYS",
 * }]});
 * ```
 *
 * ## Import
 *
 * Using `pulumi import`, import the EFS file systems using the `id`. For example:
 *
 * ```sh
 *  $ pulumi import aws:efs/fileSystem:FileSystem foo fs-6fa144c6
 * ```
 */
export class FileSystem extends pulumi.CustomResource {
    /**
     * Get an existing FileSystem resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: FileSystemState, opts?: pulumi.CustomResourceOptions): FileSystem {
        return new FileSystem(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:efs/fileSystem:FileSystem';

    /**
     * Returns true if the given object is an instance of FileSystem.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is FileSystem {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === FileSystem.__pulumiType;
    }

    /**
     * Amazon Resource Name of the file system.
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * The identifier of the Availability Zone in which the file system's One Zone storage classes exist.
     */
    public /*out*/ readonly availabilityZoneId!: pulumi.Output<string>;
    /**
     * the AWS Availability Zone in which to create the file system. Used to create a file system that uses One Zone storage classes. See [user guide](https://docs.aws.amazon.com/efs/latest/ug/availability-durability.html) for more information.
     */
    public readonly availabilityZoneName!: pulumi.Output<string>;
    /**
     * A unique name (a maximum of 64 characters are allowed)
     * used as reference when creating the Elastic File System to ensure idempotent file
     * system creation. By default generated by this provider. See [Elastic File System]
     * user guide for more information.
     */
    public readonly creationToken!: pulumi.Output<string>;
    /**
     * The DNS name for the filesystem per [documented convention](http://docs.aws.amazon.com/efs/latest/ug/mounting-fs-mount-cmd-dns-name.html).
     */
    public /*out*/ readonly dnsName!: pulumi.Output<string>;
    /**
     * If true, the disk will be encrypted.
     */
    public readonly encrypted!: pulumi.Output<boolean>;
    /**
     * The ARN for the KMS encryption key. When specifying kms_key_id, encrypted needs to be set to true.
     */
    public readonly kmsKeyId!: pulumi.Output<string>;
    /**
     * A file system [lifecycle policy](https://docs.aws.amazon.com/efs/latest/ug/API_LifecyclePolicy.html) object. See `lifecyclePolicy` block below for details.
     */
    public readonly lifecyclePolicies!: pulumi.Output<outputs.efs.FileSystemLifecyclePolicy[] | undefined>;
    /**
     * The value of the file system's `Name` tag.
     */
    public /*out*/ readonly name!: pulumi.Output<string>;
    /**
     * The current number of mount targets that the file system has.
     */
    public /*out*/ readonly numberOfMountTargets!: pulumi.Output<number>;
    /**
     * The AWS account that created the file system. If the file system was createdby an IAM user, the parent account to which the user belongs is the owner.
     */
    public /*out*/ readonly ownerId!: pulumi.Output<string>;
    /**
     * The file system performance mode. Can be either `"generalPurpose"` or `"maxIO"` (Default: `"generalPurpose"`).
     */
    public readonly performanceMode!: pulumi.Output<string>;
    /**
     * A file system [protection](https://docs.aws.amazon.com/efs/latest/ug/API_FileSystemProtectionDescription.html) object. See `protection` block below for details.
     */
    public readonly protection!: pulumi.Output<outputs.efs.FileSystemProtection>;
    /**
     * The throughput, measured in MiB/s, that you want to provision for the file system. Only applicable with `throughputMode` set to `provisioned`.
     */
    public readonly provisionedThroughputInMibps!: pulumi.Output<number | undefined>;
    /**
     * The latest known metered size (in bytes) of data stored in the file system, the value is not the exact size that the file system was at any point in time. See Size In Bytes.
     */
    public /*out*/ readonly sizeInBytes!: pulumi.Output<outputs.efs.FileSystemSizeInByte[]>;
    /**
     * A map of tags to assign to the file system. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     *
     * @deprecated Please use `tags` instead.
     */
    public /*out*/ readonly tagsAll!: pulumi.Output<{[key: string]: string}>;
    /**
     * Throughput mode for the file system. Defaults to `bursting`. Valid values: `bursting`, `provisioned`, or `elastic`. When using `provisioned`, also set `provisionedThroughputInMibps`.
     */
    public readonly throughputMode!: pulumi.Output<string | undefined>;

    /**
     * Create a FileSystem resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: FileSystemArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: FileSystemArgs | FileSystemState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as FileSystemState | undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["availabilityZoneId"] = state ? state.availabilityZoneId : undefined;
            resourceInputs["availabilityZoneName"] = state ? state.availabilityZoneName : undefined;
            resourceInputs["creationToken"] = state ? state.creationToken : undefined;
            resourceInputs["dnsName"] = state ? state.dnsName : undefined;
            resourceInputs["encrypted"] = state ? state.encrypted : undefined;
            resourceInputs["kmsKeyId"] = state ? state.kmsKeyId : undefined;
            resourceInputs["lifecyclePolicies"] = state ? state.lifecyclePolicies : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["numberOfMountTargets"] = state ? state.numberOfMountTargets : undefined;
            resourceInputs["ownerId"] = state ? state.ownerId : undefined;
            resourceInputs["performanceMode"] = state ? state.performanceMode : undefined;
            resourceInputs["protection"] = state ? state.protection : undefined;
            resourceInputs["provisionedThroughputInMibps"] = state ? state.provisionedThroughputInMibps : undefined;
            resourceInputs["sizeInBytes"] = state ? state.sizeInBytes : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tagsAll"] = state ? state.tagsAll : undefined;
            resourceInputs["throughputMode"] = state ? state.throughputMode : undefined;
        } else {
            const args = argsOrState as FileSystemArgs | undefined;
            resourceInputs["availabilityZoneName"] = args ? args.availabilityZoneName : undefined;
            resourceInputs["creationToken"] = args ? args.creationToken : undefined;
            resourceInputs["encrypted"] = args ? args.encrypted : undefined;
            resourceInputs["kmsKeyId"] = args ? args.kmsKeyId : undefined;
            resourceInputs["lifecyclePolicies"] = args ? args.lifecyclePolicies : undefined;
            resourceInputs["performanceMode"] = args ? args.performanceMode : undefined;
            resourceInputs["protection"] = args ? args.protection : undefined;
            resourceInputs["provisionedThroughputInMibps"] = args ? args.provisionedThroughputInMibps : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["throughputMode"] = args ? args.throughputMode : undefined;
            resourceInputs["arn"] = undefined /*out*/;
            resourceInputs["availabilityZoneId"] = undefined /*out*/;
            resourceInputs["dnsName"] = undefined /*out*/;
            resourceInputs["name"] = undefined /*out*/;
            resourceInputs["numberOfMountTargets"] = undefined /*out*/;
            resourceInputs["ownerId"] = undefined /*out*/;
            resourceInputs["sizeInBytes"] = undefined /*out*/;
            resourceInputs["tagsAll"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(FileSystem.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering FileSystem resources.
 */
export interface FileSystemState {
    /**
     * Amazon Resource Name of the file system.
     */
    arn?: pulumi.Input<string>;
    /**
     * The identifier of the Availability Zone in which the file system's One Zone storage classes exist.
     */
    availabilityZoneId?: pulumi.Input<string>;
    /**
     * the AWS Availability Zone in which to create the file system. Used to create a file system that uses One Zone storage classes. See [user guide](https://docs.aws.amazon.com/efs/latest/ug/availability-durability.html) for more information.
     */
    availabilityZoneName?: pulumi.Input<string>;
    /**
     * A unique name (a maximum of 64 characters are allowed)
     * used as reference when creating the Elastic File System to ensure idempotent file
     * system creation. By default generated by this provider. See [Elastic File System]
     * user guide for more information.
     */
    creationToken?: pulumi.Input<string>;
    /**
     * The DNS name for the filesystem per [documented convention](http://docs.aws.amazon.com/efs/latest/ug/mounting-fs-mount-cmd-dns-name.html).
     */
    dnsName?: pulumi.Input<string>;
    /**
     * If true, the disk will be encrypted.
     */
    encrypted?: pulumi.Input<boolean>;
    /**
     * The ARN for the KMS encryption key. When specifying kms_key_id, encrypted needs to be set to true.
     */
    kmsKeyId?: pulumi.Input<string>;
    /**
     * A file system [lifecycle policy](https://docs.aws.amazon.com/efs/latest/ug/API_LifecyclePolicy.html) object. See `lifecyclePolicy` block below for details.
     */
    lifecyclePolicies?: pulumi.Input<pulumi.Input<inputs.efs.FileSystemLifecyclePolicy>[]>;
    /**
     * The value of the file system's `Name` tag.
     */
    name?: pulumi.Input<string>;
    /**
     * The current number of mount targets that the file system has.
     */
    numberOfMountTargets?: pulumi.Input<number>;
    /**
     * The AWS account that created the file system. If the file system was createdby an IAM user, the parent account to which the user belongs is the owner.
     */
    ownerId?: pulumi.Input<string>;
    /**
     * The file system performance mode. Can be either `"generalPurpose"` or `"maxIO"` (Default: `"generalPurpose"`).
     */
    performanceMode?: pulumi.Input<string>;
    /**
     * A file system [protection](https://docs.aws.amazon.com/efs/latest/ug/API_FileSystemProtectionDescription.html) object. See `protection` block below for details.
     */
    protection?: pulumi.Input<inputs.efs.FileSystemProtection>;
    /**
     * The throughput, measured in MiB/s, that you want to provision for the file system. Only applicable with `throughputMode` set to `provisioned`.
     */
    provisionedThroughputInMibps?: pulumi.Input<number>;
    /**
     * The latest known metered size (in bytes) of data stored in the file system, the value is not the exact size that the file system was at any point in time. See Size In Bytes.
     */
    sizeInBytes?: pulumi.Input<pulumi.Input<inputs.efs.FileSystemSizeInByte>[]>;
    /**
     * A map of tags to assign to the file system. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     *
     * @deprecated Please use `tags` instead.
     */
    tagsAll?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Throughput mode for the file system. Defaults to `bursting`. Valid values: `bursting`, `provisioned`, or `elastic`. When using `provisioned`, also set `provisionedThroughputInMibps`.
     */
    throughputMode?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a FileSystem resource.
 */
export interface FileSystemArgs {
    /**
     * the AWS Availability Zone in which to create the file system. Used to create a file system that uses One Zone storage classes. See [user guide](https://docs.aws.amazon.com/efs/latest/ug/availability-durability.html) for more information.
     */
    availabilityZoneName?: pulumi.Input<string>;
    /**
     * A unique name (a maximum of 64 characters are allowed)
     * used as reference when creating the Elastic File System to ensure idempotent file
     * system creation. By default generated by this provider. See [Elastic File System]
     * user guide for more information.
     */
    creationToken?: pulumi.Input<string>;
    /**
     * If true, the disk will be encrypted.
     */
    encrypted?: pulumi.Input<boolean>;
    /**
     * The ARN for the KMS encryption key. When specifying kms_key_id, encrypted needs to be set to true.
     */
    kmsKeyId?: pulumi.Input<string>;
    /**
     * A file system [lifecycle policy](https://docs.aws.amazon.com/efs/latest/ug/API_LifecyclePolicy.html) object. See `lifecyclePolicy` block below for details.
     */
    lifecyclePolicies?: pulumi.Input<pulumi.Input<inputs.efs.FileSystemLifecyclePolicy>[]>;
    /**
     * The file system performance mode. Can be either `"generalPurpose"` or `"maxIO"` (Default: `"generalPurpose"`).
     */
    performanceMode?: pulumi.Input<string>;
    /**
     * A file system [protection](https://docs.aws.amazon.com/efs/latest/ug/API_FileSystemProtectionDescription.html) object. See `protection` block below for details.
     */
    protection?: pulumi.Input<inputs.efs.FileSystemProtection>;
    /**
     * The throughput, measured in MiB/s, that you want to provision for the file system. Only applicable with `throughputMode` set to `provisioned`.
     */
    provisionedThroughputInMibps?: pulumi.Input<number>;
    /**
     * A map of tags to assign to the file system. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Throughput mode for the file system. Defaults to `bursting`. Valid values: `bursting`, `provisioned`, or `elastic`. When using `provisioned`, also set `provisionedThroughputInMibps`.
     */
    throughputMode?: pulumi.Input<string>;
}

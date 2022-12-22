// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a FSx Backup resource.
 *
 * ## Lustre Example
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const exampleLustreFileSystem = new aws.fsx.LustreFileSystem("exampleLustreFileSystem", {
 *     storageCapacity: 1200,
 *     subnetIds: [aws_subnet.example.id],
 *     deploymentType: "PERSISTENT_1",
 *     perUnitStorageThroughput: 50,
 * });
 * const exampleBackup = new aws.fsx.Backup("exampleBackup", {fileSystemId: exampleLustreFileSystem.id});
 * ```
 *
 * ## Windows Example
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const exampleWindowsFileSystem = new aws.fsx.WindowsFileSystem("exampleWindowsFileSystem", {
 *     activeDirectoryId: aws_directory_service_directory.eample.id,
 *     skipFinalBackup: true,
 *     storageCapacity: 32,
 *     subnetIds: [aws_subnet.example1.id],
 *     throughputCapacity: 8,
 * });
 * const exampleBackup = new aws.fsx.Backup("exampleBackup", {fileSystemId: exampleWindowsFileSystem.id});
 * ```
 *
 * ## ONTAP Example
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const exampleOntapVolume = new aws.fsx.OntapVolume("exampleOntapVolume", {
 *     junctionPath: "/example",
 *     sizeInMegabytes: 1024,
 *     storageEfficiencyEnabled: true,
 *     storageVirtualMachineId: aws_fsx_ontap_storage_virtual_machine.test.id,
 * });
 * const exampleBackup = new aws.fsx.Backup("exampleBackup", {volumeId: exampleOntapVolume.id});
 * ```
 *
 * ## OpenZFS Example
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const exampleOpenZfsFileSystem = new aws.fsx.OpenZfsFileSystem("exampleOpenZfsFileSystem", {
 *     storageCapacity: 64,
 *     subnetIds: [aws_subnet.example.id],
 *     deploymentType: "SINGLE_AZ_1",
 *     throughputCapacity: 64,
 * });
 * const exampleBackup = new aws.fsx.Backup("exampleBackup", {fileSystemId: exampleOpenZfsFileSystem.id});
 * ```
 *
 * ## Import
 *
 * FSx Backups can be imported using the `id`, e.g.,
 *
 * ```sh
 *  $ pulumi import aws:fsx/backup:Backup example fs-543ab12b1ca672f33
 * ```
 */
export class Backup extends pulumi.CustomResource {
    /**
     * Get an existing Backup resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: BackupState, opts?: pulumi.CustomResourceOptions): Backup {
        return new Backup(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:fsx/backup:Backup';

    /**
     * Returns true if the given object is an instance of Backup.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Backup {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Backup.__pulumiType;
    }

    /**
     * Amazon Resource Name of the backup.
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * The ID of the file system to back up. Required if backing up Lustre or Windows file systems.
     */
    public readonly fileSystemId!: pulumi.Output<string | undefined>;
    /**
     * The ID of the AWS Key Management Service (AWS KMS) key used to encrypt the backup of the Amazon FSx file system's data at rest.
     */
    public /*out*/ readonly kmsKeyId!: pulumi.Output<string>;
    /**
     * AWS account identifier that created the file system.
     */
    public /*out*/ readonly ownerId!: pulumi.Output<string>;
    /**
     * A map of tags to assign to the file system. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level. If you have set `copyTagsToBackups` to true, and you specify one or more tags, no existing file system tags are copied from the file system to the backup.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string}>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     */
    public /*out*/ readonly tagsAll!: pulumi.Output<{[key: string]: string}>;
    /**
     * The type of the file system backup.
     */
    public /*out*/ readonly type!: pulumi.Output<string>;
    /**
     * The ID of the volume to back up. Required if backing up a ONTAP Volume.
     */
    public readonly volumeId!: pulumi.Output<string | undefined>;

    /**
     * Create a Backup resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: BackupArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: BackupArgs | BackupState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as BackupState | undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["fileSystemId"] = state ? state.fileSystemId : undefined;
            resourceInputs["kmsKeyId"] = state ? state.kmsKeyId : undefined;
            resourceInputs["ownerId"] = state ? state.ownerId : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tagsAll"] = state ? state.tagsAll : undefined;
            resourceInputs["type"] = state ? state.type : undefined;
            resourceInputs["volumeId"] = state ? state.volumeId : undefined;
        } else {
            const args = argsOrState as BackupArgs | undefined;
            resourceInputs["fileSystemId"] = args ? args.fileSystemId : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["volumeId"] = args ? args.volumeId : undefined;
            resourceInputs["arn"] = undefined /*out*/;
            resourceInputs["kmsKeyId"] = undefined /*out*/;
            resourceInputs["ownerId"] = undefined /*out*/;
            resourceInputs["tagsAll"] = undefined /*out*/;
            resourceInputs["type"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Backup.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Backup resources.
 */
export interface BackupState {
    /**
     * Amazon Resource Name of the backup.
     */
    arn?: pulumi.Input<string>;
    /**
     * The ID of the file system to back up. Required if backing up Lustre or Windows file systems.
     */
    fileSystemId?: pulumi.Input<string>;
    /**
     * The ID of the AWS Key Management Service (AWS KMS) key used to encrypt the backup of the Amazon FSx file system's data at rest.
     */
    kmsKeyId?: pulumi.Input<string>;
    /**
     * AWS account identifier that created the file system.
     */
    ownerId?: pulumi.Input<string>;
    /**
     * A map of tags to assign to the file system. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level. If you have set `copyTagsToBackups` to true, and you specify one or more tags, no existing file system tags are copied from the file system to the backup.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     */
    tagsAll?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The type of the file system backup.
     */
    type?: pulumi.Input<string>;
    /**
     * The ID of the volume to back up. Required if backing up a ONTAP Volume.
     */
    volumeId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Backup resource.
 */
export interface BackupArgs {
    /**
     * The ID of the file system to back up. Required if backing up Lustre or Windows file systems.
     */
    fileSystemId?: pulumi.Input<string>;
    /**
     * A map of tags to assign to the file system. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level. If you have set `copyTagsToBackups` to true, and you specify one or more tags, no existing file system tags are copied from the file system to the backup.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The ID of the volume to back up. Required if backing up a ONTAP Volume.
     */
    volumeId?: pulumi.Input<string>;
}

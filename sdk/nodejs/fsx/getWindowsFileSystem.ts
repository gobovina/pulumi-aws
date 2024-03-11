// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Retrieve information on FSx Windows File System.
 *
 * ## Example Usage
 *
 * ### Root volume Example
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = aws.fsx.getWindowsFileSystem({
 *     id: "fs-12345678",
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getWindowsFileSystem(args: GetWindowsFileSystemArgs, opts?: pulumi.InvokeOptions): Promise<GetWindowsFileSystemResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("aws:fsx/getWindowsFileSystem:getWindowsFileSystem", {
        "id": args.id,
        "tags": args.tags,
    }, opts);
}

/**
 * A collection of arguments for invoking getWindowsFileSystem.
 */
export interface GetWindowsFileSystemArgs {
    /**
     * Identifier of the file system (e.g. `fs-12345678`).
     */
    id: string;
    /**
     * The tags to associate with the file system.
     */
    tags?: {[key: string]: string};
}

/**
 * A collection of values returned by getWindowsFileSystem.
 */
export interface GetWindowsFileSystemResult {
    /**
     * The ID for Microsoft Active Directory instance that the file system is join to.
     */
    readonly activeDirectoryId: string;
    /**
     * An array DNS alias names associated with the Amazon FSx file system.
     */
    readonly aliases: string[];
    /**
     * Amazon Resource Name of the file system.
     */
    readonly arn: string;
    /**
     * The configuration that Amazon FSx for Windows File Server uses to audit and log user accesses of files, folders, and file shares on the Amazon FSx for Windows File Server file system.
     */
    readonly auditLogConfigurations: outputs.fsx.GetWindowsFileSystemAuditLogConfiguration[];
    /**
     * The number of days to retain automatic backups.
     */
    readonly automaticBackupRetentionDays: number;
    readonly backupId: string;
    /**
     * A boolean flag indicating whether tags on the file system should be copied to backups.
     */
    readonly copyTagsToBackups: boolean;
    /**
     * The preferred time (in `HH:MM` format) to take daily automatic backups, in the UTC time zone.
     */
    readonly dailyAutomaticBackupStartTime: string;
    /**
     * The file system deployment type.
     */
    readonly deploymentType: string;
    /**
     * The SSD IOPS configuration for the file system.
     */
    readonly diskIopsConfigurations: outputs.fsx.GetWindowsFileSystemDiskIopsConfiguration[];
    /**
     * DNS name for the file system (e.g. `fs-12345678.corp.example.com`).
     */
    readonly dnsName: string;
    /**
     * Identifier of the file system (e.g. `fs-12345678`).
     */
    readonly id: string;
    /**
     * ARN for the KMS Key to encrypt the file system at rest.
     */
    readonly kmsKeyId: string;
    readonly networkInterfaceIds: string[];
    /**
     * AWS account identifier that created the file system.
     */
    readonly ownerId: string;
    /**
     * The IP address of the primary, or preferred, file server.
     */
    readonly preferredFileServerIp: string;
    /**
     * Specifies the subnet in which you want the preferred file server to be located.
     */
    readonly preferredSubnetId: string;
    readonly securityGroupIds: string[];
    readonly skipFinalBackup: boolean;
    /**
     * The storage capacity of the file system in gibibytes (GiB).
     */
    readonly storageCapacity: number;
    /**
     * The type of storage the file system is using. If set to `SSD`, the file system uses solid state drive storage. If set to `HDD`, the file system uses hard disk drive storage.
     */
    readonly storageType: string;
    /**
     * Specifies the IDs of the subnets that the file system is accessible from.
     */
    readonly subnetIds: string[];
    /**
     * The tags to associate with the file system.
     */
    readonly tags: {[key: string]: string};
    /**
     * Throughput (megabytes per second) of the file system in power of 2 increments. Minimum of `8` and maximum of `2048`.
     */
    readonly throughputCapacity: number;
    /**
     * The ID of the primary virtual private cloud (VPC) for the file system.
     */
    readonly vpcId: string;
    /**
     * The preferred start time (in `d:HH:MM` format) to perform weekly maintenance, in the UTC time zone.
     */
    readonly weeklyMaintenanceStartTime: string;
}
/**
 * Retrieve information on FSx Windows File System.
 *
 * ## Example Usage
 *
 * ### Root volume Example
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = aws.fsx.getWindowsFileSystem({
 *     id: "fs-12345678",
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getWindowsFileSystemOutput(args: GetWindowsFileSystemOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetWindowsFileSystemResult> {
    return pulumi.output(args).apply((a: any) => getWindowsFileSystem(a, opts))
}

/**
 * A collection of arguments for invoking getWindowsFileSystem.
 */
export interface GetWindowsFileSystemOutputArgs {
    /**
     * Identifier of the file system (e.g. `fs-12345678`).
     */
    id: pulumi.Input<string>;
    /**
     * The tags to associate with the file system.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}

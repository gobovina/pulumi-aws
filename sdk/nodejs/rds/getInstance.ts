// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Use this data source to get information about an RDS instance
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const database = aws.rds.getInstance({
 *     dbInstanceIdentifier: "my-test-database",
 * });
 * ```
 */
export function getInstance(args: GetInstanceArgs, opts?: pulumi.InvokeOptions): Promise<GetInstanceResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("aws:rds/getInstance:getInstance", {
        "dbInstanceIdentifier": args.dbInstanceIdentifier,
        "tags": args.tags,
    }, opts);
}

/**
 * A collection of arguments for invoking getInstance.
 */
export interface GetInstanceArgs {
    /**
     * Name of the RDS instance
     */
    dbInstanceIdentifier: string;
    tags?: {[key: string]: string};
}

/**
 * A collection of values returned by getInstance.
 */
export interface GetInstanceResult {
    /**
     * Hostname of the RDS instance. See also `endpoint` and `port`.
     */
    readonly address: string;
    /**
     * Allocated storage size specified in gigabytes.
     */
    readonly allocatedStorage: number;
    /**
     * Indicates that minor version patches are applied automatically.
     */
    readonly autoMinorVersionUpgrade: boolean;
    /**
     * Name of the Availability Zone the DB instance is located in.
     */
    readonly availabilityZone: string;
    /**
     * Specifies the number of days for which automatic DB snapshots are retained.
     */
    readonly backupRetentionPeriod: number;
    /**
     * Identifier of the CA certificate for the DB instance.
     */
    readonly caCertIdentifier: string;
    /**
     * If the DB instance is a member of a DB cluster, contains the name of the DB cluster that the DB instance is a member of.
     */
    readonly dbClusterIdentifier: string;
    /**
     * ARN for the DB instance.
     */
    readonly dbInstanceArn: string;
    /**
     * Contains the name of the compute and memory capacity class of the DB instance.
     */
    readonly dbInstanceClass: string;
    readonly dbInstanceIdentifier: string;
    /**
     * Port that the DB instance listens on.
     */
    readonly dbInstancePort: number;
    /**
     * Contains the name of the initial database of this instance that was provided at create time, if one was specified when the DB instance was created. This same name is returned for the life of the DB instance.
     */
    readonly dbName: string;
    /**
     * Provides the list of DB parameter groups applied to this DB instance.
     */
    readonly dbParameterGroups: string[];
    /**
     * Provides List of DB security groups associated to this DB instance.
     */
    readonly dbSecurityGroups: string[];
    /**
     * Name of the subnet group associated with the DB instance.
     */
    readonly dbSubnetGroup: string;
    /**
     * List of log types to export to cloudwatch.
     */
    readonly enabledCloudwatchLogsExports: string[];
    /**
     * Connection endpoint in `address:port` format.
     */
    readonly endpoint: string;
    /**
     * Provides the name of the database engine to be used for this DB instance.
     */
    readonly engine: string;
    /**
     * Database engine version.
     */
    readonly engineVersion: string;
    /**
     * Canonical hosted zone ID of the DB instance (to be used in a Route 53 Alias record).
     */
    readonly hostedZoneId: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Provisioned IOPS (I/O operations per second) value.
     */
    readonly iops: number;
    /**
     * The Amazon Web Services KMS key identifier that is used to encrypt the secret.
     */
    readonly kmsKeyId: string;
    /**
     * License model information for this DB instance.
     */
    readonly licenseModel: string;
    /**
     * Provides the master user secret. Only available when `manageMasterUserPassword` is set to true. Documented below.
     */
    readonly masterUserSecrets: outputs.rds.GetInstanceMasterUserSecret[];
    /**
     * Contains the master username for the DB instance.
     */
    readonly masterUsername: string;
    /**
     * Interval, in seconds, between points when Enhanced Monitoring metrics are collected for the DB instance.
     */
    readonly monitoringInterval: number;
    /**
     * ARN for the IAM role that permits RDS to send Enhanced Monitoring metrics to CloudWatch Logs.
     */
    readonly monitoringRoleArn: string;
    /**
     * If the DB instance is a Multi-AZ deployment.
     */
    readonly multiAz: boolean;
    /**
     * Network type of the DB instance.
     */
    readonly networkType: string;
    /**
     * Provides the list of option group memberships for this DB instance.
     */
    readonly optionGroupMemberships: string[];
    /**
     * Database port.
     */
    readonly port: number;
    /**
     * Specifies the daily time range during which automated backups are created.
     */
    readonly preferredBackupWindow: string;
    /**
     * Specifies the weekly time range during which system maintenance can occur in UTC.
     */
    readonly preferredMaintenanceWindow: string;
    /**
     * Accessibility options for the DB instance.
     */
    readonly publiclyAccessible: boolean;
    /**
     * Identifier of the source DB that this is a replica of.
     */
    readonly replicateSourceDb: string;
    /**
     * RDS Resource ID of this instance.
     */
    readonly resourceId: string;
    /**
     * Whether the DB instance is encrypted.
     */
    readonly storageEncrypted: boolean;
    /**
     * Storage throughput value for the DB instance.
     */
    readonly storageThroughput: number;
    /**
     * Storage type associated with DB instance.
     */
    readonly storageType: string;
    readonly tags: {[key: string]: string};
    /**
     * Time zone of the DB instance.
     */
    readonly timezone: string;
    /**
     * Provides a list of VPC security group elements that the DB instance belongs to.
     */
    readonly vpcSecurityGroups: string[];
}
/**
 * Use this data source to get information about an RDS instance
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const database = aws.rds.getInstance({
 *     dbInstanceIdentifier: "my-test-database",
 * });
 * ```
 */
export function getInstanceOutput(args: GetInstanceOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetInstanceResult> {
    return pulumi.output(args).apply((a: any) => getInstance(a, opts))
}

/**
 * A collection of arguments for invoking getInstance.
 */
export interface GetInstanceOutputArgs {
    /**
     * Name of the RDS instance
     */
    dbInstanceIdentifier: pulumi.Input<string>;
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}

// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Manages an RDS database instance snapshot. For managing RDS database cluster snapshots, see the `aws.rds.ClusterSnapshot` resource.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const bar = new aws.rds.Instance("bar", {
 *     allocatedStorage: 10,
 *     engine: "mysql",
 *     engineVersion: "5.6.21",
 *     instanceClass: "db.t2.micro",
 *     dbName: "baz",
 *     password: "barbarbarbar",
 *     username: "foo",
 *     maintenanceWindow: "Fri:09:00-Fri:09:30",
 *     backupRetentionPeriod: 0,
 *     parameterGroupName: "default.mysql5.6",
 * });
 * const test = new aws.rds.Snapshot("test", {
 *     dbInstanceIdentifier: bar.identifier,
 *     dbSnapshotIdentifier: "testsnapshot1234",
 * });
 * ```
 *
 * ## Import
 *
 * Using `pulumi import`, import `aws_db_snapshot` using the snapshot identifier. For example:
 *
 * ```sh
 *  $ pulumi import aws:rds/snapshot:Snapshot example my-snapshot
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
    public static readonly __pulumiType = 'aws:rds/snapshot:Snapshot';

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
     * Specifies the allocated storage size in gigabytes (GB).
     */
    public /*out*/ readonly allocatedStorage!: pulumi.Output<number>;
    /**
     * Specifies the name of the Availability Zone the DB instance was located in at the time of the DB snapshot.
     */
    public /*out*/ readonly availabilityZone!: pulumi.Output<string>;
    /**
     * The DB Instance Identifier from which to take the snapshot.
     */
    public readonly dbInstanceIdentifier!: pulumi.Output<string>;
    /**
     * The Amazon Resource Name (ARN) for the DB snapshot.
     */
    public /*out*/ readonly dbSnapshotArn!: pulumi.Output<string>;
    /**
     * The Identifier for the snapshot.
     */
    public readonly dbSnapshotIdentifier!: pulumi.Output<string>;
    /**
     * Specifies whether the DB snapshot is encrypted.
     */
    public /*out*/ readonly encrypted!: pulumi.Output<boolean>;
    /**
     * Specifies the name of the database engine.
     */
    public /*out*/ readonly engine!: pulumi.Output<string>;
    /**
     * Specifies the version of the database engine.
     */
    public /*out*/ readonly engineVersion!: pulumi.Output<string>;
    /**
     * Specifies the Provisioned IOPS (I/O operations per second) value of the DB instance at the time of the snapshot.
     */
    public /*out*/ readonly iops!: pulumi.Output<number>;
    /**
     * The ARN for the KMS encryption key.
     */
    public /*out*/ readonly kmsKeyId!: pulumi.Output<string>;
    /**
     * License model information for the restored DB instance.
     */
    public /*out*/ readonly licenseModel!: pulumi.Output<string>;
    /**
     * Provides the option group name for the DB snapshot.
     */
    public /*out*/ readonly optionGroupName!: pulumi.Output<string>;
    public /*out*/ readonly port!: pulumi.Output<number>;
    /**
     * List of AWS Account ids to share snapshot with, use `all` to make snaphot public.
     */
    public readonly sharedAccounts!: pulumi.Output<string[] | undefined>;
    public /*out*/ readonly snapshotType!: pulumi.Output<string>;
    /**
     * The DB snapshot Arn that the DB snapshot was copied from. It only has value in case of cross customer or cross region copy.
     */
    public /*out*/ readonly sourceDbSnapshotIdentifier!: pulumi.Output<string>;
    /**
     * The region that the DB snapshot was created in or copied from.
     */
    public /*out*/ readonly sourceRegion!: pulumi.Output<string>;
    /**
     * Specifies the status of this DB snapshot.
     */
    public /*out*/ readonly status!: pulumi.Output<string>;
    /**
     * Specifies the storage type associated with DB snapshot.
     */
    public /*out*/ readonly storageType!: pulumi.Output<string>;
    /**
     * Key-value map of resource tags. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     */
    public /*out*/ readonly tagsAll!: pulumi.Output<{[key: string]: string}>;
    /**
     * Provides the VPC ID associated with the DB snapshot.
     */
    public /*out*/ readonly vpcId!: pulumi.Output<string>;

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
            resourceInputs["allocatedStorage"] = state ? state.allocatedStorage : undefined;
            resourceInputs["availabilityZone"] = state ? state.availabilityZone : undefined;
            resourceInputs["dbInstanceIdentifier"] = state ? state.dbInstanceIdentifier : undefined;
            resourceInputs["dbSnapshotArn"] = state ? state.dbSnapshotArn : undefined;
            resourceInputs["dbSnapshotIdentifier"] = state ? state.dbSnapshotIdentifier : undefined;
            resourceInputs["encrypted"] = state ? state.encrypted : undefined;
            resourceInputs["engine"] = state ? state.engine : undefined;
            resourceInputs["engineVersion"] = state ? state.engineVersion : undefined;
            resourceInputs["iops"] = state ? state.iops : undefined;
            resourceInputs["kmsKeyId"] = state ? state.kmsKeyId : undefined;
            resourceInputs["licenseModel"] = state ? state.licenseModel : undefined;
            resourceInputs["optionGroupName"] = state ? state.optionGroupName : undefined;
            resourceInputs["port"] = state ? state.port : undefined;
            resourceInputs["sharedAccounts"] = state ? state.sharedAccounts : undefined;
            resourceInputs["snapshotType"] = state ? state.snapshotType : undefined;
            resourceInputs["sourceDbSnapshotIdentifier"] = state ? state.sourceDbSnapshotIdentifier : undefined;
            resourceInputs["sourceRegion"] = state ? state.sourceRegion : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
            resourceInputs["storageType"] = state ? state.storageType : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tagsAll"] = state ? state.tagsAll : undefined;
            resourceInputs["vpcId"] = state ? state.vpcId : undefined;
        } else {
            const args = argsOrState as SnapshotArgs | undefined;
            if ((!args || args.dbInstanceIdentifier === undefined) && !opts.urn) {
                throw new Error("Missing required property 'dbInstanceIdentifier'");
            }
            if ((!args || args.dbSnapshotIdentifier === undefined) && !opts.urn) {
                throw new Error("Missing required property 'dbSnapshotIdentifier'");
            }
            resourceInputs["dbInstanceIdentifier"] = args ? args.dbInstanceIdentifier : undefined;
            resourceInputs["dbSnapshotIdentifier"] = args ? args.dbSnapshotIdentifier : undefined;
            resourceInputs["sharedAccounts"] = args ? args.sharedAccounts : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["allocatedStorage"] = undefined /*out*/;
            resourceInputs["availabilityZone"] = undefined /*out*/;
            resourceInputs["dbSnapshotArn"] = undefined /*out*/;
            resourceInputs["encrypted"] = undefined /*out*/;
            resourceInputs["engine"] = undefined /*out*/;
            resourceInputs["engineVersion"] = undefined /*out*/;
            resourceInputs["iops"] = undefined /*out*/;
            resourceInputs["kmsKeyId"] = undefined /*out*/;
            resourceInputs["licenseModel"] = undefined /*out*/;
            resourceInputs["optionGroupName"] = undefined /*out*/;
            resourceInputs["port"] = undefined /*out*/;
            resourceInputs["snapshotType"] = undefined /*out*/;
            resourceInputs["sourceDbSnapshotIdentifier"] = undefined /*out*/;
            resourceInputs["sourceRegion"] = undefined /*out*/;
            resourceInputs["status"] = undefined /*out*/;
            resourceInputs["storageType"] = undefined /*out*/;
            resourceInputs["tagsAll"] = undefined /*out*/;
            resourceInputs["vpcId"] = undefined /*out*/;
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
     * Specifies the allocated storage size in gigabytes (GB).
     */
    allocatedStorage?: pulumi.Input<number>;
    /**
     * Specifies the name of the Availability Zone the DB instance was located in at the time of the DB snapshot.
     */
    availabilityZone?: pulumi.Input<string>;
    /**
     * The DB Instance Identifier from which to take the snapshot.
     */
    dbInstanceIdentifier?: pulumi.Input<string>;
    /**
     * The Amazon Resource Name (ARN) for the DB snapshot.
     */
    dbSnapshotArn?: pulumi.Input<string>;
    /**
     * The Identifier for the snapshot.
     */
    dbSnapshotIdentifier?: pulumi.Input<string>;
    /**
     * Specifies whether the DB snapshot is encrypted.
     */
    encrypted?: pulumi.Input<boolean>;
    /**
     * Specifies the name of the database engine.
     */
    engine?: pulumi.Input<string>;
    /**
     * Specifies the version of the database engine.
     */
    engineVersion?: pulumi.Input<string>;
    /**
     * Specifies the Provisioned IOPS (I/O operations per second) value of the DB instance at the time of the snapshot.
     */
    iops?: pulumi.Input<number>;
    /**
     * The ARN for the KMS encryption key.
     */
    kmsKeyId?: pulumi.Input<string>;
    /**
     * License model information for the restored DB instance.
     */
    licenseModel?: pulumi.Input<string>;
    /**
     * Provides the option group name for the DB snapshot.
     */
    optionGroupName?: pulumi.Input<string>;
    port?: pulumi.Input<number>;
    /**
     * List of AWS Account ids to share snapshot with, use `all` to make snaphot public.
     */
    sharedAccounts?: pulumi.Input<pulumi.Input<string>[]>;
    snapshotType?: pulumi.Input<string>;
    /**
     * The DB snapshot Arn that the DB snapshot was copied from. It only has value in case of cross customer or cross region copy.
     */
    sourceDbSnapshotIdentifier?: pulumi.Input<string>;
    /**
     * The region that the DB snapshot was created in or copied from.
     */
    sourceRegion?: pulumi.Input<string>;
    /**
     * Specifies the status of this DB snapshot.
     */
    status?: pulumi.Input<string>;
    /**
     * Specifies the storage type associated with DB snapshot.
     */
    storageType?: pulumi.Input<string>;
    /**
     * Key-value map of resource tags. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     */
    tagsAll?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Provides the VPC ID associated with the DB snapshot.
     */
    vpcId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Snapshot resource.
 */
export interface SnapshotArgs {
    /**
     * The DB Instance Identifier from which to take the snapshot.
     */
    dbInstanceIdentifier: pulumi.Input<string>;
    /**
     * The Identifier for the snapshot.
     */
    dbSnapshotIdentifier: pulumi.Input<string>;
    /**
     * List of AWS Account ids to share snapshot with, use `all` to make snaphot public.
     */
    sharedAccounts?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Key-value map of resource tags. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}

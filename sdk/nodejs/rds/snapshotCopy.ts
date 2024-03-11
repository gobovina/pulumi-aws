// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Manages an RDS database instance snapshot copy. For managing RDS database cluster snapshots, see the `aws.rds.ClusterSnapshot` resource.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.rds.Instance("example", {
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
 * const exampleSnapshot = new aws.rds.Snapshot("example", {
 *     dbInstanceIdentifier: example.identifier,
 *     dbSnapshotIdentifier: "testsnapshot1234",
 * });
 * const exampleSnapshotCopy = new aws.rds.SnapshotCopy("example", {
 *     sourceDbSnapshotIdentifier: exampleSnapshot.dbSnapshotArn,
 *     targetDbSnapshotIdentifier: "testsnapshot1234-copy",
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ## Import
 *
 * Using `pulumi import`, import `aws_db_snapshot_copy` using the snapshot identifier. For example:
 *
 * ```sh
 * $ pulumi import aws:rds/snapshotCopy:SnapshotCopy example my-snapshot
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
    public static readonly __pulumiType = 'aws:rds/snapshotCopy:SnapshotCopy';

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
     * Specifies the allocated storage size in gigabytes (GB).
     */
    public /*out*/ readonly allocatedStorage!: pulumi.Output<number>;
    /**
     * Specifies the name of the Availability Zone the DB instance was located in at the time of the DB snapshot.
     */
    public /*out*/ readonly availabilityZone!: pulumi.Output<string>;
    /**
     * Whether to copy existing tags. Defaults to `false`.
     */
    public readonly copyTags!: pulumi.Output<boolean | undefined>;
    /**
     * The Amazon Resource Name (ARN) for the DB snapshot.
     */
    public /*out*/ readonly dbSnapshotArn!: pulumi.Output<string>;
    /**
     * The Destination region to place snapshot copy.
     */
    public readonly destinationRegion!: pulumi.Output<string | undefined>;
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
     * KMS key ID.
     */
    public readonly kmsKeyId!: pulumi.Output<string | undefined>;
    /**
     * License model information for the restored DB instance.
     */
    public /*out*/ readonly licenseModel!: pulumi.Output<string>;
    /**
     * The name of an option group to associate with the copy of the snapshot.
     */
    public readonly optionGroupName!: pulumi.Output<string>;
    public /*out*/ readonly port!: pulumi.Output<number>;
    /**
     * he URL that contains a Signature Version 4 signed request.
     */
    public readonly presignedUrl!: pulumi.Output<string | undefined>;
    public /*out*/ readonly snapshotType!: pulumi.Output<string>;
    /**
     * Snapshot identifier of the source snapshot.
     */
    public readonly sourceDbSnapshotIdentifier!: pulumi.Output<string>;
    /**
     * The region that the DB snapshot was created in or copied from.
     */
    public /*out*/ readonly sourceRegion!: pulumi.Output<string>;
    /**
     * Specifies the storage type associated with DB snapshot.
     */
    public /*out*/ readonly storageType!: pulumi.Output<string>;
    /**
     * Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     *
     * @deprecated Please use `tags` instead.
     */
    public /*out*/ readonly tagsAll!: pulumi.Output<{[key: string]: string}>;
    /**
     * The external custom Availability Zone.
     */
    public readonly targetCustomAvailabilityZone!: pulumi.Output<string | undefined>;
    /**
     * The Identifier for the snapshot.
     */
    public readonly targetDbSnapshotIdentifier!: pulumi.Output<string>;
    /**
     * Provides the VPC ID associated with the DB snapshot.
     */
    public /*out*/ readonly vpcId!: pulumi.Output<string>;

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
            resourceInputs["allocatedStorage"] = state ? state.allocatedStorage : undefined;
            resourceInputs["availabilityZone"] = state ? state.availabilityZone : undefined;
            resourceInputs["copyTags"] = state ? state.copyTags : undefined;
            resourceInputs["dbSnapshotArn"] = state ? state.dbSnapshotArn : undefined;
            resourceInputs["destinationRegion"] = state ? state.destinationRegion : undefined;
            resourceInputs["encrypted"] = state ? state.encrypted : undefined;
            resourceInputs["engine"] = state ? state.engine : undefined;
            resourceInputs["engineVersion"] = state ? state.engineVersion : undefined;
            resourceInputs["iops"] = state ? state.iops : undefined;
            resourceInputs["kmsKeyId"] = state ? state.kmsKeyId : undefined;
            resourceInputs["licenseModel"] = state ? state.licenseModel : undefined;
            resourceInputs["optionGroupName"] = state ? state.optionGroupName : undefined;
            resourceInputs["port"] = state ? state.port : undefined;
            resourceInputs["presignedUrl"] = state ? state.presignedUrl : undefined;
            resourceInputs["snapshotType"] = state ? state.snapshotType : undefined;
            resourceInputs["sourceDbSnapshotIdentifier"] = state ? state.sourceDbSnapshotIdentifier : undefined;
            resourceInputs["sourceRegion"] = state ? state.sourceRegion : undefined;
            resourceInputs["storageType"] = state ? state.storageType : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tagsAll"] = state ? state.tagsAll : undefined;
            resourceInputs["targetCustomAvailabilityZone"] = state ? state.targetCustomAvailabilityZone : undefined;
            resourceInputs["targetDbSnapshotIdentifier"] = state ? state.targetDbSnapshotIdentifier : undefined;
            resourceInputs["vpcId"] = state ? state.vpcId : undefined;
        } else {
            const args = argsOrState as SnapshotCopyArgs | undefined;
            if ((!args || args.sourceDbSnapshotIdentifier === undefined) && !opts.urn) {
                throw new Error("Missing required property 'sourceDbSnapshotIdentifier'");
            }
            if ((!args || args.targetDbSnapshotIdentifier === undefined) && !opts.urn) {
                throw new Error("Missing required property 'targetDbSnapshotIdentifier'");
            }
            resourceInputs["copyTags"] = args ? args.copyTags : undefined;
            resourceInputs["destinationRegion"] = args ? args.destinationRegion : undefined;
            resourceInputs["kmsKeyId"] = args ? args.kmsKeyId : undefined;
            resourceInputs["optionGroupName"] = args ? args.optionGroupName : undefined;
            resourceInputs["presignedUrl"] = args ? args.presignedUrl : undefined;
            resourceInputs["sourceDbSnapshotIdentifier"] = args ? args.sourceDbSnapshotIdentifier : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["targetCustomAvailabilityZone"] = args ? args.targetCustomAvailabilityZone : undefined;
            resourceInputs["targetDbSnapshotIdentifier"] = args ? args.targetDbSnapshotIdentifier : undefined;
            resourceInputs["allocatedStorage"] = undefined /*out*/;
            resourceInputs["availabilityZone"] = undefined /*out*/;
            resourceInputs["dbSnapshotArn"] = undefined /*out*/;
            resourceInputs["encrypted"] = undefined /*out*/;
            resourceInputs["engine"] = undefined /*out*/;
            resourceInputs["engineVersion"] = undefined /*out*/;
            resourceInputs["iops"] = undefined /*out*/;
            resourceInputs["licenseModel"] = undefined /*out*/;
            resourceInputs["port"] = undefined /*out*/;
            resourceInputs["snapshotType"] = undefined /*out*/;
            resourceInputs["sourceRegion"] = undefined /*out*/;
            resourceInputs["storageType"] = undefined /*out*/;
            resourceInputs["tagsAll"] = undefined /*out*/;
            resourceInputs["vpcId"] = undefined /*out*/;
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
     * Specifies the allocated storage size in gigabytes (GB).
     */
    allocatedStorage?: pulumi.Input<number>;
    /**
     * Specifies the name of the Availability Zone the DB instance was located in at the time of the DB snapshot.
     */
    availabilityZone?: pulumi.Input<string>;
    /**
     * Whether to copy existing tags. Defaults to `false`.
     */
    copyTags?: pulumi.Input<boolean>;
    /**
     * The Amazon Resource Name (ARN) for the DB snapshot.
     */
    dbSnapshotArn?: pulumi.Input<string>;
    /**
     * The Destination region to place snapshot copy.
     */
    destinationRegion?: pulumi.Input<string>;
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
     * KMS key ID.
     */
    kmsKeyId?: pulumi.Input<string>;
    /**
     * License model information for the restored DB instance.
     */
    licenseModel?: pulumi.Input<string>;
    /**
     * The name of an option group to associate with the copy of the snapshot.
     */
    optionGroupName?: pulumi.Input<string>;
    port?: pulumi.Input<number>;
    /**
     * he URL that contains a Signature Version 4 signed request.
     */
    presignedUrl?: pulumi.Input<string>;
    snapshotType?: pulumi.Input<string>;
    /**
     * Snapshot identifier of the source snapshot.
     */
    sourceDbSnapshotIdentifier?: pulumi.Input<string>;
    /**
     * The region that the DB snapshot was created in or copied from.
     */
    sourceRegion?: pulumi.Input<string>;
    /**
     * Specifies the storage type associated with DB snapshot.
     */
    storageType?: pulumi.Input<string>;
    /**
     * Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     *
     * @deprecated Please use `tags` instead.
     */
    tagsAll?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The external custom Availability Zone.
     */
    targetCustomAvailabilityZone?: pulumi.Input<string>;
    /**
     * The Identifier for the snapshot.
     */
    targetDbSnapshotIdentifier?: pulumi.Input<string>;
    /**
     * Provides the VPC ID associated with the DB snapshot.
     */
    vpcId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a SnapshotCopy resource.
 */
export interface SnapshotCopyArgs {
    /**
     * Whether to copy existing tags. Defaults to `false`.
     */
    copyTags?: pulumi.Input<boolean>;
    /**
     * The Destination region to place snapshot copy.
     */
    destinationRegion?: pulumi.Input<string>;
    /**
     * KMS key ID.
     */
    kmsKeyId?: pulumi.Input<string>;
    /**
     * The name of an option group to associate with the copy of the snapshot.
     */
    optionGroupName?: pulumi.Input<string>;
    /**
     * he URL that contains a Signature Version 4 signed request.
     */
    presignedUrl?: pulumi.Input<string>;
    /**
     * Snapshot identifier of the source snapshot.
     */
    sourceDbSnapshotIdentifier: pulumi.Input<string>;
    /**
     * Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The external custom Availability Zone.
     */
    targetCustomAvailabilityZone?: pulumi.Input<string>;
    /**
     * The Identifier for the snapshot.
     */
    targetDbSnapshotIdentifier: pulumi.Input<string>;
}

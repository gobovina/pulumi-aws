// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Provides an Neptune Cluster Resource. A Cluster Resource defines attributes that are
 * applied to the entire cluster of Neptune Cluster Instances.
 *
 * Changes to a Neptune Cluster can occur when you manually change a
 * parameter, such as `backupRetentionPeriod`, and are reflected in the next maintenance
 * window. Because of this, this provider may report a difference in its planning
 * phase because a modification has not yet taken place. You can use the
 * `applyImmediately` flag to instruct the service to apply the change immediately
 * (see documentation below).
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const _default = new aws.neptune.Cluster("default", {
 *     applyImmediately: true,
 *     backupRetentionPeriod: 5,
 *     clusterIdentifier: "neptune-cluster-demo",
 *     engine: "neptune",
 *     iamDatabaseAuthenticationEnabled: true,
 *     preferredBackupWindow: "07:00-09:00",
 *     skipFinalSnapshot: true,
 * });
 * ```
 *
 * > **Note:** AWS Neptune does not support user name/password–based access control.
 * See the AWS [Docs](https://docs.aws.amazon.com/neptune/latest/userguide/limits.html) for more information.
 *
 * ## Import
 *
 * Using `pulumi import`, import `aws_neptune_cluster` using the cluster identifier. For example:
 *
 * ```sh
 *  $ pulumi import aws:neptune/cluster:Cluster example my-cluster
 * ```
 */
export class Cluster extends pulumi.CustomResource {
    /**
     * Get an existing Cluster resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ClusterState, opts?: pulumi.CustomResourceOptions): Cluster {
        return new Cluster(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:neptune/cluster:Cluster';

    /**
     * Returns true if the given object is an instance of Cluster.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Cluster {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Cluster.__pulumiType;
    }

    /**
     * Specifies whether upgrades between different major versions are allowed. You must set it to `true` when providing an `engineVersion` parameter that uses a different major version than the DB cluster's current version. Default is `false`.
     */
    public readonly allowMajorVersionUpgrade!: pulumi.Output<boolean>;
    /**
     * Specifies whether any cluster modifications are applied immediately, or during the next maintenance window. Default is `false`.
     */
    public readonly applyImmediately!: pulumi.Output<boolean>;
    /**
     * The Neptune Cluster Amazon Resource Name (ARN)
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * A list of EC2 Availability Zones that instances in the Neptune cluster can be created in.
     */
    public readonly availabilityZones!: pulumi.Output<string[]>;
    /**
     * The days to retain backups for. Default `1`
     */
    public readonly backupRetentionPeriod!: pulumi.Output<number | undefined>;
    /**
     * The cluster identifier. If omitted, this provider will assign a random, unique identifier.
     */
    public readonly clusterIdentifier!: pulumi.Output<string>;
    /**
     * Creates a unique cluster identifier beginning with the specified prefix. Conflicts with `clusterIdentifier`.
     */
    public readonly clusterIdentifierPrefix!: pulumi.Output<string>;
    /**
     * List of Neptune Instances that are a part of this cluster
     */
    public /*out*/ readonly clusterMembers!: pulumi.Output<string[]>;
    /**
     * The Neptune Cluster Resource ID
     */
    public /*out*/ readonly clusterResourceId!: pulumi.Output<string>;
    /**
     * If set to true, tags are copied to any snapshot of the DB cluster that is created.
     */
    public readonly copyTagsToSnapshot!: pulumi.Output<boolean | undefined>;
    /**
     * A value that indicates whether the DB cluster has deletion protection enabled.The database can't be deleted when deletion protection is enabled. By default, deletion protection is disabled.
     */
    public readonly deletionProtection!: pulumi.Output<boolean | undefined>;
    /**
     * A list of the log types this DB cluster is configured to export to Cloudwatch Logs. Currently only supports `audit` and `slowquery`.
     */
    public readonly enableCloudwatchLogsExports!: pulumi.Output<string[] | undefined>;
    /**
     * The DNS address of the Neptune instance
     */
    public /*out*/ readonly endpoint!: pulumi.Output<string>;
    /**
     * The name of the database engine to be used for this Neptune cluster. Defaults to `neptune`.
     */
    public readonly engine!: pulumi.Output<string | undefined>;
    /**
     * The database engine version.
     */
    public readonly engineVersion!: pulumi.Output<string>;
    /**
     * The name of your final Neptune snapshot when this Neptune cluster is deleted. If omitted, no final snapshot will be made.
     */
    public readonly finalSnapshotIdentifier!: pulumi.Output<string | undefined>;
    /**
     * The global cluster identifier specified on `aws.neptune.GlobalCluster`.
     */
    public readonly globalClusterIdentifier!: pulumi.Output<string | undefined>;
    /**
     * The Route53 Hosted Zone ID of the endpoint
     */
    public /*out*/ readonly hostedZoneId!: pulumi.Output<string>;
    /**
     * Specifies whether or not mappings of AWS Identity and Access Management (IAM) accounts to database accounts is enabled.
     */
    public readonly iamDatabaseAuthenticationEnabled!: pulumi.Output<boolean | undefined>;
    /**
     * A List of ARNs for the IAM roles to associate to the Neptune Cluster.
     */
    public readonly iamRoles!: pulumi.Output<string[] | undefined>;
    /**
     * The ARN for the KMS encryption key. When specifying `kmsKeyArn`, `storageEncrypted` needs to be set to true.
     */
    public readonly kmsKeyArn!: pulumi.Output<string>;
    /**
     * A cluster parameter group to associate with the cluster.
     */
    public readonly neptuneClusterParameterGroupName!: pulumi.Output<string | undefined>;
    /**
     * The name of the DB parameter group to apply to all instances of the DB cluster.
     */
    public readonly neptuneInstanceParameterGroupName!: pulumi.Output<string | undefined>;
    /**
     * A Neptune subnet group to associate with this Neptune instance.
     */
    public readonly neptuneSubnetGroupName!: pulumi.Output<string>;
    /**
     * The port on which the Neptune accepts connections. Default is `8182`.
     */
    public readonly port!: pulumi.Output<number | undefined>;
    /**
     * The daily time range during which automated backups are created if automated backups are enabled using the BackupRetentionPeriod parameter. Time in UTC. Default: A 30-minute window selected at random from an 8-hour block of time per regionE.g., 04:00-09:00
     */
    public readonly preferredBackupWindow!: pulumi.Output<string>;
    /**
     * The weekly time range during which system maintenance can occur, in (UTC) e.g., wed:04:00-wed:04:30
     */
    public readonly preferredMaintenanceWindow!: pulumi.Output<string>;
    /**
     * A read-only endpoint for the Neptune cluster, automatically load-balanced across replicas
     */
    public /*out*/ readonly readerEndpoint!: pulumi.Output<string>;
    /**
     * ARN of a source Neptune cluster or Neptune instance if this Neptune cluster is to be created as a Read Replica.
     */
    public readonly replicationSourceIdentifier!: pulumi.Output<string | undefined>;
    /**
     * If set, create the Neptune cluster as a serverless one. See Serverless for example block attributes.
     */
    public readonly serverlessV2ScalingConfiguration!: pulumi.Output<outputs.neptune.ClusterServerlessV2ScalingConfiguration | undefined>;
    /**
     * Determines whether a final Neptune snapshot is created before the Neptune cluster is deleted. If true is specified, no Neptune snapshot is created. If false is specified, a Neptune snapshot is created before the Neptune cluster is deleted, using the value from `finalSnapshotIdentifier`. Default is `false`.
     */
    public readonly skipFinalSnapshot!: pulumi.Output<boolean | undefined>;
    /**
     * Specifies whether or not to create this cluster from a snapshot. You can use either the name or ARN when specifying a Neptune cluster snapshot, or the ARN when specifying a Neptune snapshot. Automated snapshots **should not** be used for this attribute, unless from a different cluster. Automated snapshots are deleted as part of cluster destruction when the resource is replaced.
     */
    public readonly snapshotIdentifier!: pulumi.Output<string | undefined>;
    /**
     * Specifies whether the Neptune cluster is encrypted. The default is `false` if not specified.
     */
    public readonly storageEncrypted!: pulumi.Output<boolean | undefined>;
    /**
     * Storage type associated with the cluster `standard/iopt1`. Default: `standard`
     */
    public readonly storageType!: pulumi.Output<string>;
    /**
     * A map of tags to assign to the Neptune cluster. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     *
     * @deprecated Please use `tags` instead.
     */
    public /*out*/ readonly tagsAll!: pulumi.Output<{[key: string]: string}>;
    /**
     * List of VPC security groups to associate with the Cluster
     */
    public readonly vpcSecurityGroupIds!: pulumi.Output<string[]>;

    /**
     * Create a Cluster resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: ClusterArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ClusterArgs | ClusterState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ClusterState | undefined;
            resourceInputs["allowMajorVersionUpgrade"] = state ? state.allowMajorVersionUpgrade : undefined;
            resourceInputs["applyImmediately"] = state ? state.applyImmediately : undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["availabilityZones"] = state ? state.availabilityZones : undefined;
            resourceInputs["backupRetentionPeriod"] = state ? state.backupRetentionPeriod : undefined;
            resourceInputs["clusterIdentifier"] = state ? state.clusterIdentifier : undefined;
            resourceInputs["clusterIdentifierPrefix"] = state ? state.clusterIdentifierPrefix : undefined;
            resourceInputs["clusterMembers"] = state ? state.clusterMembers : undefined;
            resourceInputs["clusterResourceId"] = state ? state.clusterResourceId : undefined;
            resourceInputs["copyTagsToSnapshot"] = state ? state.copyTagsToSnapshot : undefined;
            resourceInputs["deletionProtection"] = state ? state.deletionProtection : undefined;
            resourceInputs["enableCloudwatchLogsExports"] = state ? state.enableCloudwatchLogsExports : undefined;
            resourceInputs["endpoint"] = state ? state.endpoint : undefined;
            resourceInputs["engine"] = state ? state.engine : undefined;
            resourceInputs["engineVersion"] = state ? state.engineVersion : undefined;
            resourceInputs["finalSnapshotIdentifier"] = state ? state.finalSnapshotIdentifier : undefined;
            resourceInputs["globalClusterIdentifier"] = state ? state.globalClusterIdentifier : undefined;
            resourceInputs["hostedZoneId"] = state ? state.hostedZoneId : undefined;
            resourceInputs["iamDatabaseAuthenticationEnabled"] = state ? state.iamDatabaseAuthenticationEnabled : undefined;
            resourceInputs["iamRoles"] = state ? state.iamRoles : undefined;
            resourceInputs["kmsKeyArn"] = state ? state.kmsKeyArn : undefined;
            resourceInputs["neptuneClusterParameterGroupName"] = state ? state.neptuneClusterParameterGroupName : undefined;
            resourceInputs["neptuneInstanceParameterGroupName"] = state ? state.neptuneInstanceParameterGroupName : undefined;
            resourceInputs["neptuneSubnetGroupName"] = state ? state.neptuneSubnetGroupName : undefined;
            resourceInputs["port"] = state ? state.port : undefined;
            resourceInputs["preferredBackupWindow"] = state ? state.preferredBackupWindow : undefined;
            resourceInputs["preferredMaintenanceWindow"] = state ? state.preferredMaintenanceWindow : undefined;
            resourceInputs["readerEndpoint"] = state ? state.readerEndpoint : undefined;
            resourceInputs["replicationSourceIdentifier"] = state ? state.replicationSourceIdentifier : undefined;
            resourceInputs["serverlessV2ScalingConfiguration"] = state ? state.serverlessV2ScalingConfiguration : undefined;
            resourceInputs["skipFinalSnapshot"] = state ? state.skipFinalSnapshot : undefined;
            resourceInputs["snapshotIdentifier"] = state ? state.snapshotIdentifier : undefined;
            resourceInputs["storageEncrypted"] = state ? state.storageEncrypted : undefined;
            resourceInputs["storageType"] = state ? state.storageType : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tagsAll"] = state ? state.tagsAll : undefined;
            resourceInputs["vpcSecurityGroupIds"] = state ? state.vpcSecurityGroupIds : undefined;
        } else {
            const args = argsOrState as ClusterArgs | undefined;
            resourceInputs["allowMajorVersionUpgrade"] = args ? args.allowMajorVersionUpgrade : undefined;
            resourceInputs["applyImmediately"] = args ? args.applyImmediately : undefined;
            resourceInputs["availabilityZones"] = args ? args.availabilityZones : undefined;
            resourceInputs["backupRetentionPeriod"] = args ? args.backupRetentionPeriod : undefined;
            resourceInputs["clusterIdentifier"] = args ? args.clusterIdentifier : undefined;
            resourceInputs["clusterIdentifierPrefix"] = args ? args.clusterIdentifierPrefix : undefined;
            resourceInputs["copyTagsToSnapshot"] = args ? args.copyTagsToSnapshot : undefined;
            resourceInputs["deletionProtection"] = args ? args.deletionProtection : undefined;
            resourceInputs["enableCloudwatchLogsExports"] = args ? args.enableCloudwatchLogsExports : undefined;
            resourceInputs["engine"] = args ? args.engine : undefined;
            resourceInputs["engineVersion"] = args ? args.engineVersion : undefined;
            resourceInputs["finalSnapshotIdentifier"] = args ? args.finalSnapshotIdentifier : undefined;
            resourceInputs["globalClusterIdentifier"] = args ? args.globalClusterIdentifier : undefined;
            resourceInputs["iamDatabaseAuthenticationEnabled"] = args ? args.iamDatabaseAuthenticationEnabled : undefined;
            resourceInputs["iamRoles"] = args ? args.iamRoles : undefined;
            resourceInputs["kmsKeyArn"] = args ? args.kmsKeyArn : undefined;
            resourceInputs["neptuneClusterParameterGroupName"] = args ? args.neptuneClusterParameterGroupName : undefined;
            resourceInputs["neptuneInstanceParameterGroupName"] = args ? args.neptuneInstanceParameterGroupName : undefined;
            resourceInputs["neptuneSubnetGroupName"] = args ? args.neptuneSubnetGroupName : undefined;
            resourceInputs["port"] = args ? args.port : undefined;
            resourceInputs["preferredBackupWindow"] = args ? args.preferredBackupWindow : undefined;
            resourceInputs["preferredMaintenanceWindow"] = args ? args.preferredMaintenanceWindow : undefined;
            resourceInputs["replicationSourceIdentifier"] = args ? args.replicationSourceIdentifier : undefined;
            resourceInputs["serverlessV2ScalingConfiguration"] = args ? args.serverlessV2ScalingConfiguration : undefined;
            resourceInputs["skipFinalSnapshot"] = args ? args.skipFinalSnapshot : undefined;
            resourceInputs["snapshotIdentifier"] = args ? args.snapshotIdentifier : undefined;
            resourceInputs["storageEncrypted"] = args ? args.storageEncrypted : undefined;
            resourceInputs["storageType"] = args ? args.storageType : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["vpcSecurityGroupIds"] = args ? args.vpcSecurityGroupIds : undefined;
            resourceInputs["arn"] = undefined /*out*/;
            resourceInputs["clusterMembers"] = undefined /*out*/;
            resourceInputs["clusterResourceId"] = undefined /*out*/;
            resourceInputs["endpoint"] = undefined /*out*/;
            resourceInputs["hostedZoneId"] = undefined /*out*/;
            resourceInputs["readerEndpoint"] = undefined /*out*/;
            resourceInputs["tagsAll"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Cluster.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Cluster resources.
 */
export interface ClusterState {
    /**
     * Specifies whether upgrades between different major versions are allowed. You must set it to `true` when providing an `engineVersion` parameter that uses a different major version than the DB cluster's current version. Default is `false`.
     */
    allowMajorVersionUpgrade?: pulumi.Input<boolean>;
    /**
     * Specifies whether any cluster modifications are applied immediately, or during the next maintenance window. Default is `false`.
     */
    applyImmediately?: pulumi.Input<boolean>;
    /**
     * The Neptune Cluster Amazon Resource Name (ARN)
     */
    arn?: pulumi.Input<string>;
    /**
     * A list of EC2 Availability Zones that instances in the Neptune cluster can be created in.
     */
    availabilityZones?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The days to retain backups for. Default `1`
     */
    backupRetentionPeriod?: pulumi.Input<number>;
    /**
     * The cluster identifier. If omitted, this provider will assign a random, unique identifier.
     */
    clusterIdentifier?: pulumi.Input<string>;
    /**
     * Creates a unique cluster identifier beginning with the specified prefix. Conflicts with `clusterIdentifier`.
     */
    clusterIdentifierPrefix?: pulumi.Input<string>;
    /**
     * List of Neptune Instances that are a part of this cluster
     */
    clusterMembers?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The Neptune Cluster Resource ID
     */
    clusterResourceId?: pulumi.Input<string>;
    /**
     * If set to true, tags are copied to any snapshot of the DB cluster that is created.
     */
    copyTagsToSnapshot?: pulumi.Input<boolean>;
    /**
     * A value that indicates whether the DB cluster has deletion protection enabled.The database can't be deleted when deletion protection is enabled. By default, deletion protection is disabled.
     */
    deletionProtection?: pulumi.Input<boolean>;
    /**
     * A list of the log types this DB cluster is configured to export to Cloudwatch Logs. Currently only supports `audit` and `slowquery`.
     */
    enableCloudwatchLogsExports?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The DNS address of the Neptune instance
     */
    endpoint?: pulumi.Input<string>;
    /**
     * The name of the database engine to be used for this Neptune cluster. Defaults to `neptune`.
     */
    engine?: pulumi.Input<string>;
    /**
     * The database engine version.
     */
    engineVersion?: pulumi.Input<string>;
    /**
     * The name of your final Neptune snapshot when this Neptune cluster is deleted. If omitted, no final snapshot will be made.
     */
    finalSnapshotIdentifier?: pulumi.Input<string>;
    /**
     * The global cluster identifier specified on `aws.neptune.GlobalCluster`.
     */
    globalClusterIdentifier?: pulumi.Input<string>;
    /**
     * The Route53 Hosted Zone ID of the endpoint
     */
    hostedZoneId?: pulumi.Input<string>;
    /**
     * Specifies whether or not mappings of AWS Identity and Access Management (IAM) accounts to database accounts is enabled.
     */
    iamDatabaseAuthenticationEnabled?: pulumi.Input<boolean>;
    /**
     * A List of ARNs for the IAM roles to associate to the Neptune Cluster.
     */
    iamRoles?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The ARN for the KMS encryption key. When specifying `kmsKeyArn`, `storageEncrypted` needs to be set to true.
     */
    kmsKeyArn?: pulumi.Input<string>;
    /**
     * A cluster parameter group to associate with the cluster.
     */
    neptuneClusterParameterGroupName?: pulumi.Input<string>;
    /**
     * The name of the DB parameter group to apply to all instances of the DB cluster.
     */
    neptuneInstanceParameterGroupName?: pulumi.Input<string>;
    /**
     * A Neptune subnet group to associate with this Neptune instance.
     */
    neptuneSubnetGroupName?: pulumi.Input<string>;
    /**
     * The port on which the Neptune accepts connections. Default is `8182`.
     */
    port?: pulumi.Input<number>;
    /**
     * The daily time range during which automated backups are created if automated backups are enabled using the BackupRetentionPeriod parameter. Time in UTC. Default: A 30-minute window selected at random from an 8-hour block of time per regionE.g., 04:00-09:00
     */
    preferredBackupWindow?: pulumi.Input<string>;
    /**
     * The weekly time range during which system maintenance can occur, in (UTC) e.g., wed:04:00-wed:04:30
     */
    preferredMaintenanceWindow?: pulumi.Input<string>;
    /**
     * A read-only endpoint for the Neptune cluster, automatically load-balanced across replicas
     */
    readerEndpoint?: pulumi.Input<string>;
    /**
     * ARN of a source Neptune cluster or Neptune instance if this Neptune cluster is to be created as a Read Replica.
     */
    replicationSourceIdentifier?: pulumi.Input<string>;
    /**
     * If set, create the Neptune cluster as a serverless one. See Serverless for example block attributes.
     */
    serverlessV2ScalingConfiguration?: pulumi.Input<inputs.neptune.ClusterServerlessV2ScalingConfiguration>;
    /**
     * Determines whether a final Neptune snapshot is created before the Neptune cluster is deleted. If true is specified, no Neptune snapshot is created. If false is specified, a Neptune snapshot is created before the Neptune cluster is deleted, using the value from `finalSnapshotIdentifier`. Default is `false`.
     */
    skipFinalSnapshot?: pulumi.Input<boolean>;
    /**
     * Specifies whether or not to create this cluster from a snapshot. You can use either the name or ARN when specifying a Neptune cluster snapshot, or the ARN when specifying a Neptune snapshot. Automated snapshots **should not** be used for this attribute, unless from a different cluster. Automated snapshots are deleted as part of cluster destruction when the resource is replaced.
     */
    snapshotIdentifier?: pulumi.Input<string>;
    /**
     * Specifies whether the Neptune cluster is encrypted. The default is `false` if not specified.
     */
    storageEncrypted?: pulumi.Input<boolean>;
    /**
     * Storage type associated with the cluster `standard/iopt1`. Default: `standard`
     */
    storageType?: pulumi.Input<string>;
    /**
     * A map of tags to assign to the Neptune cluster. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     *
     * @deprecated Please use `tags` instead.
     */
    tagsAll?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * List of VPC security groups to associate with the Cluster
     */
    vpcSecurityGroupIds?: pulumi.Input<pulumi.Input<string>[]>;
}

/**
 * The set of arguments for constructing a Cluster resource.
 */
export interface ClusterArgs {
    /**
     * Specifies whether upgrades between different major versions are allowed. You must set it to `true` when providing an `engineVersion` parameter that uses a different major version than the DB cluster's current version. Default is `false`.
     */
    allowMajorVersionUpgrade?: pulumi.Input<boolean>;
    /**
     * Specifies whether any cluster modifications are applied immediately, or during the next maintenance window. Default is `false`.
     */
    applyImmediately?: pulumi.Input<boolean>;
    /**
     * A list of EC2 Availability Zones that instances in the Neptune cluster can be created in.
     */
    availabilityZones?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The days to retain backups for. Default `1`
     */
    backupRetentionPeriod?: pulumi.Input<number>;
    /**
     * The cluster identifier. If omitted, this provider will assign a random, unique identifier.
     */
    clusterIdentifier?: pulumi.Input<string>;
    /**
     * Creates a unique cluster identifier beginning with the specified prefix. Conflicts with `clusterIdentifier`.
     */
    clusterIdentifierPrefix?: pulumi.Input<string>;
    /**
     * If set to true, tags are copied to any snapshot of the DB cluster that is created.
     */
    copyTagsToSnapshot?: pulumi.Input<boolean>;
    /**
     * A value that indicates whether the DB cluster has deletion protection enabled.The database can't be deleted when deletion protection is enabled. By default, deletion protection is disabled.
     */
    deletionProtection?: pulumi.Input<boolean>;
    /**
     * A list of the log types this DB cluster is configured to export to Cloudwatch Logs. Currently only supports `audit` and `slowquery`.
     */
    enableCloudwatchLogsExports?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The name of the database engine to be used for this Neptune cluster. Defaults to `neptune`.
     */
    engine?: pulumi.Input<string>;
    /**
     * The database engine version.
     */
    engineVersion?: pulumi.Input<string>;
    /**
     * The name of your final Neptune snapshot when this Neptune cluster is deleted. If omitted, no final snapshot will be made.
     */
    finalSnapshotIdentifier?: pulumi.Input<string>;
    /**
     * The global cluster identifier specified on `aws.neptune.GlobalCluster`.
     */
    globalClusterIdentifier?: pulumi.Input<string>;
    /**
     * Specifies whether or not mappings of AWS Identity and Access Management (IAM) accounts to database accounts is enabled.
     */
    iamDatabaseAuthenticationEnabled?: pulumi.Input<boolean>;
    /**
     * A List of ARNs for the IAM roles to associate to the Neptune Cluster.
     */
    iamRoles?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The ARN for the KMS encryption key. When specifying `kmsKeyArn`, `storageEncrypted` needs to be set to true.
     */
    kmsKeyArn?: pulumi.Input<string>;
    /**
     * A cluster parameter group to associate with the cluster.
     */
    neptuneClusterParameterGroupName?: pulumi.Input<string>;
    /**
     * The name of the DB parameter group to apply to all instances of the DB cluster.
     */
    neptuneInstanceParameterGroupName?: pulumi.Input<string>;
    /**
     * A Neptune subnet group to associate with this Neptune instance.
     */
    neptuneSubnetGroupName?: pulumi.Input<string>;
    /**
     * The port on which the Neptune accepts connections. Default is `8182`.
     */
    port?: pulumi.Input<number>;
    /**
     * The daily time range during which automated backups are created if automated backups are enabled using the BackupRetentionPeriod parameter. Time in UTC. Default: A 30-minute window selected at random from an 8-hour block of time per regionE.g., 04:00-09:00
     */
    preferredBackupWindow?: pulumi.Input<string>;
    /**
     * The weekly time range during which system maintenance can occur, in (UTC) e.g., wed:04:00-wed:04:30
     */
    preferredMaintenanceWindow?: pulumi.Input<string>;
    /**
     * ARN of a source Neptune cluster or Neptune instance if this Neptune cluster is to be created as a Read Replica.
     */
    replicationSourceIdentifier?: pulumi.Input<string>;
    /**
     * If set, create the Neptune cluster as a serverless one. See Serverless for example block attributes.
     */
    serverlessV2ScalingConfiguration?: pulumi.Input<inputs.neptune.ClusterServerlessV2ScalingConfiguration>;
    /**
     * Determines whether a final Neptune snapshot is created before the Neptune cluster is deleted. If true is specified, no Neptune snapshot is created. If false is specified, a Neptune snapshot is created before the Neptune cluster is deleted, using the value from `finalSnapshotIdentifier`. Default is `false`.
     */
    skipFinalSnapshot?: pulumi.Input<boolean>;
    /**
     * Specifies whether or not to create this cluster from a snapshot. You can use either the name or ARN when specifying a Neptune cluster snapshot, or the ARN when specifying a Neptune snapshot. Automated snapshots **should not** be used for this attribute, unless from a different cluster. Automated snapshots are deleted as part of cluster destruction when the resource is replaced.
     */
    snapshotIdentifier?: pulumi.Input<string>;
    /**
     * Specifies whether the Neptune cluster is encrypted. The default is `false` if not specified.
     */
    storageEncrypted?: pulumi.Input<boolean>;
    /**
     * Storage type associated with the cluster `standard/iopt1`. Default: `standard`
     */
    storageType?: pulumi.Input<string>;
    /**
     * A map of tags to assign to the Neptune cluster. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * List of VPC security groups to associate with the Cluster
     */
    vpcSecurityGroupIds?: pulumi.Input<pulumi.Input<string>[]>;
}

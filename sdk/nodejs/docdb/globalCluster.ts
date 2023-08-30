// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Manages an DocumentDB Global Cluster. A global cluster consists of one primary region and up to five read-only secondary regions. You issue write operations directly to the primary cluster in the primary region and Amazon DocumentDB automatically replicates the data to the secondary regions using dedicated infrastructure.
 *
 * More information about DocumentDB Global Clusters can be found in the [DocumentDB Developer Guide](https://docs.aws.amazon.com/documentdb/latest/developerguide/global-clusters.html).
 *
 * ## Example Usage
 * ### New DocumentDB Global Cluster
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const primary = new aws.Provider("primary", {region: "us-east-2"});
 * const secondary = new aws.Provider("secondary", {region: "us-east-1"});
 * const example = new aws.docdb.GlobalCluster("example", {
 *     globalClusterIdentifier: "global-test",
 *     engine: "docdb",
 *     engineVersion: "4.0.0",
 * });
 * const primaryCluster = new aws.docdb.Cluster("primaryCluster", {
 *     engine: example.engine,
 *     engineVersion: example.engineVersion,
 *     clusterIdentifier: "test-primary-cluster",
 *     masterUsername: "username",
 *     masterPassword: "somepass123",
 *     globalClusterIdentifier: example.id,
 *     dbSubnetGroupName: "default",
 * }, {
 *     provider: aws.primary,
 * });
 * const primaryClusterInstance = new aws.docdb.ClusterInstance("primaryClusterInstance", {
 *     engine: example.engine,
 *     identifier: "test-primary-cluster-instance",
 *     clusterIdentifier: primaryCluster.id,
 *     instanceClass: "db.r5.large",
 * }, {
 *     provider: aws.primary,
 * });
 * const secondaryCluster = new aws.docdb.Cluster("secondaryCluster", {
 *     engine: example.engine,
 *     engineVersion: example.engineVersion,
 *     clusterIdentifier: "test-secondary-cluster",
 *     globalClusterIdentifier: example.id,
 *     dbSubnetGroupName: "default",
 * }, {
 *     provider: aws.secondary,
 * });
 * const secondaryClusterInstance = new aws.docdb.ClusterInstance("secondaryClusterInstance", {
 *     engine: example.engine,
 *     identifier: "test-secondary-cluster-instance",
 *     clusterIdentifier: secondaryCluster.id,
 *     instanceClass: "db.r5.large",
 * }, {
 *     provider: aws.secondary,
 *     dependsOn: [primaryClusterInstance],
 * });
 * ```
 * ### New Global Cluster From Existing DB Cluster
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * // ... other configuration ...
 * const exampleCluster = new aws.docdb.Cluster("exampleCluster", {});
 * const exampleGlobalCluster = new aws.docdb.GlobalCluster("exampleGlobalCluster", {
 *     globalClusterIdentifier: "example",
 *     sourceDbClusterIdentifier: exampleCluster.arn,
 * });
 * ```
 *
 * ## Import
 *
 * Using `pulumi import`, import `aws_docdb_global_cluster` using the Global Cluster identifier. For example:
 *
 * ```sh
 *  $ pulumi import aws:docdb/globalCluster:GlobalCluster example example
 * ```
 *  Certain resource arguments, like `source_db_cluster_identifier`, do not have an API method for reading the information after creation. If the argument is set in the TODO configuration on an imported resource, TODO will always show a difference. To workaround this behavior, either omit the argument from the TODO configuration or use `ignore_changes` to hide the difference. For example:
 */
export class GlobalCluster extends pulumi.CustomResource {
    /**
     * Get an existing GlobalCluster resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: GlobalClusterState, opts?: pulumi.CustomResourceOptions): GlobalCluster {
        return new GlobalCluster(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:docdb/globalCluster:GlobalCluster';

    /**
     * Returns true if the given object is an instance of GlobalCluster.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is GlobalCluster {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === GlobalCluster.__pulumiType;
    }

    /**
     * Global Cluster Amazon Resource Name (ARN)
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * Name for an automatically created database on cluster creation.
     */
    public readonly databaseName!: pulumi.Output<string | undefined>;
    /**
     * If the Global Cluster should have deletion protection enabled. The database can't be deleted when this value is set to `true`. The default is `false`.
     */
    public readonly deletionProtection!: pulumi.Output<boolean | undefined>;
    /**
     * Name of the database engine to be used for this DB cluster. The provider will only perform drift detection if a configuration value is provided. Current Valid values: `docdb`. Defaults to `docdb`. Conflicts with `sourceDbClusterIdentifier`.
     */
    public readonly engine!: pulumi.Output<string>;
    /**
     * Engine version of the global database. Upgrading the engine version will result in all cluster members being immediately updated and will.
     * * **NOTE:** Upgrading major versions is not supported.
     */
    public readonly engineVersion!: pulumi.Output<string>;
    /**
     * The global cluster identifier.
     */
    public readonly globalClusterIdentifier!: pulumi.Output<string>;
    /**
     * Set of objects containing Global Cluster members.
     */
    public /*out*/ readonly globalClusterMembers!: pulumi.Output<outputs.docdb.GlobalClusterGlobalClusterMember[]>;
    /**
     * AWS Region-unique, immutable identifier for the global database cluster. This identifier is found in AWS CloudTrail log entries whenever the AWS KMS key for the DB cluster is accessed.
     */
    public /*out*/ readonly globalClusterResourceId!: pulumi.Output<string>;
    /**
     * Amazon Resource Name (ARN) to use as the primary DB Cluster of the Global Cluster on creation. The provider cannot perform drift detection of this value.
     */
    public readonly sourceDbClusterIdentifier!: pulumi.Output<string>;
    public /*out*/ readonly status!: pulumi.Output<string>;
    /**
     * Specifies whether the DB cluster is encrypted. The default is `false` unless `sourceDbClusterIdentifier` is specified and encrypted. The provider will only perform drift detection if a configuration value is provided.
     */
    public readonly storageEncrypted!: pulumi.Output<boolean>;

    /**
     * Create a GlobalCluster resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: GlobalClusterArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: GlobalClusterArgs | GlobalClusterState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as GlobalClusterState | undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["databaseName"] = state ? state.databaseName : undefined;
            resourceInputs["deletionProtection"] = state ? state.deletionProtection : undefined;
            resourceInputs["engine"] = state ? state.engine : undefined;
            resourceInputs["engineVersion"] = state ? state.engineVersion : undefined;
            resourceInputs["globalClusterIdentifier"] = state ? state.globalClusterIdentifier : undefined;
            resourceInputs["globalClusterMembers"] = state ? state.globalClusterMembers : undefined;
            resourceInputs["globalClusterResourceId"] = state ? state.globalClusterResourceId : undefined;
            resourceInputs["sourceDbClusterIdentifier"] = state ? state.sourceDbClusterIdentifier : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
            resourceInputs["storageEncrypted"] = state ? state.storageEncrypted : undefined;
        } else {
            const args = argsOrState as GlobalClusterArgs | undefined;
            if ((!args || args.globalClusterIdentifier === undefined) && !opts.urn) {
                throw new Error("Missing required property 'globalClusterIdentifier'");
            }
            resourceInputs["databaseName"] = args ? args.databaseName : undefined;
            resourceInputs["deletionProtection"] = args ? args.deletionProtection : undefined;
            resourceInputs["engine"] = args ? args.engine : undefined;
            resourceInputs["engineVersion"] = args ? args.engineVersion : undefined;
            resourceInputs["globalClusterIdentifier"] = args ? args.globalClusterIdentifier : undefined;
            resourceInputs["sourceDbClusterIdentifier"] = args ? args.sourceDbClusterIdentifier : undefined;
            resourceInputs["storageEncrypted"] = args ? args.storageEncrypted : undefined;
            resourceInputs["arn"] = undefined /*out*/;
            resourceInputs["globalClusterMembers"] = undefined /*out*/;
            resourceInputs["globalClusterResourceId"] = undefined /*out*/;
            resourceInputs["status"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(GlobalCluster.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering GlobalCluster resources.
 */
export interface GlobalClusterState {
    /**
     * Global Cluster Amazon Resource Name (ARN)
     */
    arn?: pulumi.Input<string>;
    /**
     * Name for an automatically created database on cluster creation.
     */
    databaseName?: pulumi.Input<string>;
    /**
     * If the Global Cluster should have deletion protection enabled. The database can't be deleted when this value is set to `true`. The default is `false`.
     */
    deletionProtection?: pulumi.Input<boolean>;
    /**
     * Name of the database engine to be used for this DB cluster. The provider will only perform drift detection if a configuration value is provided. Current Valid values: `docdb`. Defaults to `docdb`. Conflicts with `sourceDbClusterIdentifier`.
     */
    engine?: pulumi.Input<string>;
    /**
     * Engine version of the global database. Upgrading the engine version will result in all cluster members being immediately updated and will.
     * * **NOTE:** Upgrading major versions is not supported.
     */
    engineVersion?: pulumi.Input<string>;
    /**
     * The global cluster identifier.
     */
    globalClusterIdentifier?: pulumi.Input<string>;
    /**
     * Set of objects containing Global Cluster members.
     */
    globalClusterMembers?: pulumi.Input<pulumi.Input<inputs.docdb.GlobalClusterGlobalClusterMember>[]>;
    /**
     * AWS Region-unique, immutable identifier for the global database cluster. This identifier is found in AWS CloudTrail log entries whenever the AWS KMS key for the DB cluster is accessed.
     */
    globalClusterResourceId?: pulumi.Input<string>;
    /**
     * Amazon Resource Name (ARN) to use as the primary DB Cluster of the Global Cluster on creation. The provider cannot perform drift detection of this value.
     */
    sourceDbClusterIdentifier?: pulumi.Input<string>;
    status?: pulumi.Input<string>;
    /**
     * Specifies whether the DB cluster is encrypted. The default is `false` unless `sourceDbClusterIdentifier` is specified and encrypted. The provider will only perform drift detection if a configuration value is provided.
     */
    storageEncrypted?: pulumi.Input<boolean>;
}

/**
 * The set of arguments for constructing a GlobalCluster resource.
 */
export interface GlobalClusterArgs {
    /**
     * Name for an automatically created database on cluster creation.
     */
    databaseName?: pulumi.Input<string>;
    /**
     * If the Global Cluster should have deletion protection enabled. The database can't be deleted when this value is set to `true`. The default is `false`.
     */
    deletionProtection?: pulumi.Input<boolean>;
    /**
     * Name of the database engine to be used for this DB cluster. The provider will only perform drift detection if a configuration value is provided. Current Valid values: `docdb`. Defaults to `docdb`. Conflicts with `sourceDbClusterIdentifier`.
     */
    engine?: pulumi.Input<string>;
    /**
     * Engine version of the global database. Upgrading the engine version will result in all cluster members being immediately updated and will.
     * * **NOTE:** Upgrading major versions is not supported.
     */
    engineVersion?: pulumi.Input<string>;
    /**
     * The global cluster identifier.
     */
    globalClusterIdentifier: pulumi.Input<string>;
    /**
     * Amazon Resource Name (ARN) to use as the primary DB Cluster of the Global Cluster on creation. The provider cannot perform drift detection of this value.
     */
    sourceDbClusterIdentifier?: pulumi.Input<string>;
    /**
     * Specifies whether the DB cluster is encrypted. The default is `false` unless `sourceDbClusterIdentifier` is specified and encrypted. The provider will only perform drift detection if a configuration value is provided.
     */
    storageEncrypted?: pulumi.Input<boolean>;
}

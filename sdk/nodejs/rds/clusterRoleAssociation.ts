// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Manages a RDS DB Cluster association with an IAM Role. Example use cases:
 *
 * * [Creating an IAM Role to Allow Amazon Aurora to Access AWS Services](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/AuroraMySQL.Integrating.Authorizing.IAM.CreateRole.html)
 * * [Importing Amazon S3 Data into an RDS PostgreSQL DB Cluster](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_PostgreSQL.S3Import.html)
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.rds.ClusterRoleAssociation("example", {
 *     dbClusterIdentifier: exampleAwsRdsCluster.id,
 *     featureName: "S3_INTEGRATION",
 *     roleArn: exampleAwsIamRole.arn,
 * });
 * ```
 *
 * ## Import
 *
 * Using `pulumi import`, import `aws_rds_cluster_role_association` using the DB Cluster Identifier and IAM Role ARN separated by a comma (`,`). For example:
 *
 * ```sh
 *  $ pulumi import aws:rds/clusterRoleAssociation:ClusterRoleAssociation example my-db-cluster,arn:aws:iam::123456789012:role/my-role
 * ```
 */
export class ClusterRoleAssociation extends pulumi.CustomResource {
    /**
     * Get an existing ClusterRoleAssociation resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ClusterRoleAssociationState, opts?: pulumi.CustomResourceOptions): ClusterRoleAssociation {
        return new ClusterRoleAssociation(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:rds/clusterRoleAssociation:ClusterRoleAssociation';

    /**
     * Returns true if the given object is an instance of ClusterRoleAssociation.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ClusterRoleAssociation {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ClusterRoleAssociation.__pulumiType;
    }

    /**
     * DB Cluster Identifier to associate with the IAM Role.
     */
    public readonly dbClusterIdentifier!: pulumi.Output<string>;
    /**
     * Name of the feature for association. This can be found in the AWS documentation relevant to the integration or a full list is available in the `SupportedFeatureNames` list returned by [AWS CLI rds describe-db-engine-versions](https://docs.aws.amazon.com/cli/latest/reference/rds/describe-db-engine-versions.html).
     */
    public readonly featureName!: pulumi.Output<string>;
    /**
     * Amazon Resource Name (ARN) of the IAM Role to associate with the DB Cluster.
     */
    public readonly roleArn!: pulumi.Output<string>;

    /**
     * Create a ClusterRoleAssociation resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ClusterRoleAssociationArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ClusterRoleAssociationArgs | ClusterRoleAssociationState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ClusterRoleAssociationState | undefined;
            resourceInputs["dbClusterIdentifier"] = state ? state.dbClusterIdentifier : undefined;
            resourceInputs["featureName"] = state ? state.featureName : undefined;
            resourceInputs["roleArn"] = state ? state.roleArn : undefined;
        } else {
            const args = argsOrState as ClusterRoleAssociationArgs | undefined;
            if ((!args || args.dbClusterIdentifier === undefined) && !opts.urn) {
                throw new Error("Missing required property 'dbClusterIdentifier'");
            }
            if ((!args || args.featureName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'featureName'");
            }
            if ((!args || args.roleArn === undefined) && !opts.urn) {
                throw new Error("Missing required property 'roleArn'");
            }
            resourceInputs["dbClusterIdentifier"] = args ? args.dbClusterIdentifier : undefined;
            resourceInputs["featureName"] = args ? args.featureName : undefined;
            resourceInputs["roleArn"] = args ? args.roleArn : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ClusterRoleAssociation.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ClusterRoleAssociation resources.
 */
export interface ClusterRoleAssociationState {
    /**
     * DB Cluster Identifier to associate with the IAM Role.
     */
    dbClusterIdentifier?: pulumi.Input<string>;
    /**
     * Name of the feature for association. This can be found in the AWS documentation relevant to the integration or a full list is available in the `SupportedFeatureNames` list returned by [AWS CLI rds describe-db-engine-versions](https://docs.aws.amazon.com/cli/latest/reference/rds/describe-db-engine-versions.html).
     */
    featureName?: pulumi.Input<string>;
    /**
     * Amazon Resource Name (ARN) of the IAM Role to associate with the DB Cluster.
     */
    roleArn?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ClusterRoleAssociation resource.
 */
export interface ClusterRoleAssociationArgs {
    /**
     * DB Cluster Identifier to associate with the IAM Role.
     */
    dbClusterIdentifier: pulumi.Input<string>;
    /**
     * Name of the feature for association. This can be found in the AWS documentation relevant to the integration or a full list is available in the `SupportedFeatureNames` list returned by [AWS CLI rds describe-db-engine-versions](https://docs.aws.amazon.com/cli/latest/reference/rds/describe-db-engine-versions.html).
     */
    featureName: pulumi.Input<string>;
    /**
     * Amazon Resource Name (ARN) of the IAM Role to associate with the DB Cluster.
     */
    roleArn: pulumi.Input<string>;
}

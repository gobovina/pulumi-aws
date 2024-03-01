// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Provides a DAX Cluster resource.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const bar = new aws.dax.Cluster("bar", {
 *     clusterName: "cluster-example",
 *     iamRoleArn: example.arn,
 *     nodeType: "dax.r4.large",
 *     replicationFactor: 1,
 * });
 * ```
 *
 * ## Import
 *
 * Using `pulumi import`, import DAX Clusters using the `cluster_name`. For example:
 *
 * ```sh
 *  $ pulumi import aws:dax/cluster:Cluster my_cluster my_cluster
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
    public static readonly __pulumiType = 'aws:dax/cluster:Cluster';

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
     * The ARN of the DAX cluster
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * List of Availability Zones in which the
     * nodes will be created
     */
    public readonly availabilityZones!: pulumi.Output<string[] | undefined>;
    /**
     * The DNS name of the DAX cluster without the port appended
     */
    public /*out*/ readonly clusterAddress!: pulumi.Output<string>;
    /**
     * The type of encryption the
     * cluster's endpoint should support. Valid values are: `NONE` and `TLS`.
     * Default value is `NONE`.
     */
    public readonly clusterEndpointEncryptionType!: pulumi.Output<string | undefined>;
    /**
     * Group identifier. DAX converts this name to
     * lowercase
     */
    public readonly clusterName!: pulumi.Output<string>;
    /**
     * The configuration endpoint for this DAX cluster,
     * consisting of a DNS name and a port number
     */
    public /*out*/ readonly configurationEndpoint!: pulumi.Output<string>;
    /**
     * Description for the cluster
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * A valid Amazon Resource Name (ARN) that identifies
     * an IAM role. At runtime, DAX will assume this role and use the role's
     * permissions to access DynamoDB on your behalf
     */
    public readonly iamRoleArn!: pulumi.Output<string>;
    /**
     * Specifies the weekly time range for when
     * maintenance on the cluster is performed. The format is `ddd:hh24:mi-ddd:hh24:mi`
     * (24H Clock UTC). The minimum maintenance window is a 60 minute period. Example:
     * `sun:05:00-sun:09:00`
     */
    public readonly maintenanceWindow!: pulumi.Output<string>;
    /**
     * The compute and memory capacity of the nodes. See
     * [Nodes](http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DAX.concepts.cluster.html#DAX.concepts.nodes) for supported node types
     */
    public readonly nodeType!: pulumi.Output<string>;
    /**
     * List of node objects including `id`, `address`, `port` and
     * `availabilityZone`. Referenceable e.g., as
     * `${aws_dax_cluster.test.nodes.0.address}`
     */
    public /*out*/ readonly nodes!: pulumi.Output<outputs.dax.ClusterNode[]>;
    /**
     * An Amazon Resource Name (ARN) of an
     * SNS topic to send DAX notifications to. Example:
     * `arn:aws:sns:us-east-1:012345678999:my_sns_topic`
     */
    public readonly notificationTopicArn!: pulumi.Output<string | undefined>;
    /**
     * Name of the parameter group to associate
     * with this DAX cluster
     */
    public readonly parameterGroupName!: pulumi.Output<string>;
    /**
     * The port used by the configuration endpoint
     */
    public /*out*/ readonly port!: pulumi.Output<number>;
    /**
     * The number of nodes in the DAX cluster. A
     * replication factor of 1 will create a single-node cluster, without any read
     * replicas
     */
    public readonly replicationFactor!: pulumi.Output<number>;
    /**
     * One or more VPC security groups associated
     * with the cluster
     */
    public readonly securityGroupIds!: pulumi.Output<string[]>;
    /**
     * Encrypt at rest options
     */
    public readonly serverSideEncryption!: pulumi.Output<outputs.dax.ClusterServerSideEncryption | undefined>;
    /**
     * Name of the subnet group to be used for the
     * cluster
     */
    public readonly subnetGroupName!: pulumi.Output<string>;
    /**
     * A map of tags to assign to the resource. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     *
     * @deprecated Please use `tags` instead.
     */
    public /*out*/ readonly tagsAll!: pulumi.Output<{[key: string]: string}>;

    /**
     * Create a Cluster resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ClusterArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ClusterArgs | ClusterState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ClusterState | undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["availabilityZones"] = state ? state.availabilityZones : undefined;
            resourceInputs["clusterAddress"] = state ? state.clusterAddress : undefined;
            resourceInputs["clusterEndpointEncryptionType"] = state ? state.clusterEndpointEncryptionType : undefined;
            resourceInputs["clusterName"] = state ? state.clusterName : undefined;
            resourceInputs["configurationEndpoint"] = state ? state.configurationEndpoint : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["iamRoleArn"] = state ? state.iamRoleArn : undefined;
            resourceInputs["maintenanceWindow"] = state ? state.maintenanceWindow : undefined;
            resourceInputs["nodeType"] = state ? state.nodeType : undefined;
            resourceInputs["nodes"] = state ? state.nodes : undefined;
            resourceInputs["notificationTopicArn"] = state ? state.notificationTopicArn : undefined;
            resourceInputs["parameterGroupName"] = state ? state.parameterGroupName : undefined;
            resourceInputs["port"] = state ? state.port : undefined;
            resourceInputs["replicationFactor"] = state ? state.replicationFactor : undefined;
            resourceInputs["securityGroupIds"] = state ? state.securityGroupIds : undefined;
            resourceInputs["serverSideEncryption"] = state ? state.serverSideEncryption : undefined;
            resourceInputs["subnetGroupName"] = state ? state.subnetGroupName : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tagsAll"] = state ? state.tagsAll : undefined;
        } else {
            const args = argsOrState as ClusterArgs | undefined;
            if ((!args || args.clusterName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'clusterName'");
            }
            if ((!args || args.iamRoleArn === undefined) && !opts.urn) {
                throw new Error("Missing required property 'iamRoleArn'");
            }
            if ((!args || args.nodeType === undefined) && !opts.urn) {
                throw new Error("Missing required property 'nodeType'");
            }
            if ((!args || args.replicationFactor === undefined) && !opts.urn) {
                throw new Error("Missing required property 'replicationFactor'");
            }
            resourceInputs["availabilityZones"] = args ? args.availabilityZones : undefined;
            resourceInputs["clusterEndpointEncryptionType"] = args ? args.clusterEndpointEncryptionType : undefined;
            resourceInputs["clusterName"] = args ? args.clusterName : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["iamRoleArn"] = args ? args.iamRoleArn : undefined;
            resourceInputs["maintenanceWindow"] = args ? args.maintenanceWindow : undefined;
            resourceInputs["nodeType"] = args ? args.nodeType : undefined;
            resourceInputs["notificationTopicArn"] = args ? args.notificationTopicArn : undefined;
            resourceInputs["parameterGroupName"] = args ? args.parameterGroupName : undefined;
            resourceInputs["replicationFactor"] = args ? args.replicationFactor : undefined;
            resourceInputs["securityGroupIds"] = args ? args.securityGroupIds : undefined;
            resourceInputs["serverSideEncryption"] = args ? args.serverSideEncryption : undefined;
            resourceInputs["subnetGroupName"] = args ? args.subnetGroupName : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["arn"] = undefined /*out*/;
            resourceInputs["clusterAddress"] = undefined /*out*/;
            resourceInputs["configurationEndpoint"] = undefined /*out*/;
            resourceInputs["nodes"] = undefined /*out*/;
            resourceInputs["port"] = undefined /*out*/;
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
     * The ARN of the DAX cluster
     */
    arn?: pulumi.Input<string>;
    /**
     * List of Availability Zones in which the
     * nodes will be created
     */
    availabilityZones?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The DNS name of the DAX cluster without the port appended
     */
    clusterAddress?: pulumi.Input<string>;
    /**
     * The type of encryption the
     * cluster's endpoint should support. Valid values are: `NONE` and `TLS`.
     * Default value is `NONE`.
     */
    clusterEndpointEncryptionType?: pulumi.Input<string>;
    /**
     * Group identifier. DAX converts this name to
     * lowercase
     */
    clusterName?: pulumi.Input<string>;
    /**
     * The configuration endpoint for this DAX cluster,
     * consisting of a DNS name and a port number
     */
    configurationEndpoint?: pulumi.Input<string>;
    /**
     * Description for the cluster
     */
    description?: pulumi.Input<string>;
    /**
     * A valid Amazon Resource Name (ARN) that identifies
     * an IAM role. At runtime, DAX will assume this role and use the role's
     * permissions to access DynamoDB on your behalf
     */
    iamRoleArn?: pulumi.Input<string>;
    /**
     * Specifies the weekly time range for when
     * maintenance on the cluster is performed. The format is `ddd:hh24:mi-ddd:hh24:mi`
     * (24H Clock UTC). The minimum maintenance window is a 60 minute period. Example:
     * `sun:05:00-sun:09:00`
     */
    maintenanceWindow?: pulumi.Input<string>;
    /**
     * The compute and memory capacity of the nodes. See
     * [Nodes](http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DAX.concepts.cluster.html#DAX.concepts.nodes) for supported node types
     */
    nodeType?: pulumi.Input<string>;
    /**
     * List of node objects including `id`, `address`, `port` and
     * `availabilityZone`. Referenceable e.g., as
     * `${aws_dax_cluster.test.nodes.0.address}`
     */
    nodes?: pulumi.Input<pulumi.Input<inputs.dax.ClusterNode>[]>;
    /**
     * An Amazon Resource Name (ARN) of an
     * SNS topic to send DAX notifications to. Example:
     * `arn:aws:sns:us-east-1:012345678999:my_sns_topic`
     */
    notificationTopicArn?: pulumi.Input<string>;
    /**
     * Name of the parameter group to associate
     * with this DAX cluster
     */
    parameterGroupName?: pulumi.Input<string>;
    /**
     * The port used by the configuration endpoint
     */
    port?: pulumi.Input<number>;
    /**
     * The number of nodes in the DAX cluster. A
     * replication factor of 1 will create a single-node cluster, without any read
     * replicas
     */
    replicationFactor?: pulumi.Input<number>;
    /**
     * One or more VPC security groups associated
     * with the cluster
     */
    securityGroupIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Encrypt at rest options
     */
    serverSideEncryption?: pulumi.Input<inputs.dax.ClusterServerSideEncryption>;
    /**
     * Name of the subnet group to be used for the
     * cluster
     */
    subnetGroupName?: pulumi.Input<string>;
    /**
     * A map of tags to assign to the resource. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     *
     * @deprecated Please use `tags` instead.
     */
    tagsAll?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}

/**
 * The set of arguments for constructing a Cluster resource.
 */
export interface ClusterArgs {
    /**
     * List of Availability Zones in which the
     * nodes will be created
     */
    availabilityZones?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The type of encryption the
     * cluster's endpoint should support. Valid values are: `NONE` and `TLS`.
     * Default value is `NONE`.
     */
    clusterEndpointEncryptionType?: pulumi.Input<string>;
    /**
     * Group identifier. DAX converts this name to
     * lowercase
     */
    clusterName: pulumi.Input<string>;
    /**
     * Description for the cluster
     */
    description?: pulumi.Input<string>;
    /**
     * A valid Amazon Resource Name (ARN) that identifies
     * an IAM role. At runtime, DAX will assume this role and use the role's
     * permissions to access DynamoDB on your behalf
     */
    iamRoleArn: pulumi.Input<string>;
    /**
     * Specifies the weekly time range for when
     * maintenance on the cluster is performed. The format is `ddd:hh24:mi-ddd:hh24:mi`
     * (24H Clock UTC). The minimum maintenance window is a 60 minute period. Example:
     * `sun:05:00-sun:09:00`
     */
    maintenanceWindow?: pulumi.Input<string>;
    /**
     * The compute and memory capacity of the nodes. See
     * [Nodes](http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DAX.concepts.cluster.html#DAX.concepts.nodes) for supported node types
     */
    nodeType: pulumi.Input<string>;
    /**
     * An Amazon Resource Name (ARN) of an
     * SNS topic to send DAX notifications to. Example:
     * `arn:aws:sns:us-east-1:012345678999:my_sns_topic`
     */
    notificationTopicArn?: pulumi.Input<string>;
    /**
     * Name of the parameter group to associate
     * with this DAX cluster
     */
    parameterGroupName?: pulumi.Input<string>;
    /**
     * The number of nodes in the DAX cluster. A
     * replication factor of 1 will create a single-node cluster, without any read
     * replicas
     */
    replicationFactor: pulumi.Input<number>;
    /**
     * One or more VPC security groups associated
     * with the cluster
     */
    securityGroupIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Encrypt at rest options
     */
    serverSideEncryption?: pulumi.Input<inputs.dax.ClusterServerSideEncryption>;
    /**
     * Name of the subnet group to be used for the
     * cluster
     */
    subnetGroupName?: pulumi.Input<string>;
    /**
     * A map of tags to assign to the resource. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}

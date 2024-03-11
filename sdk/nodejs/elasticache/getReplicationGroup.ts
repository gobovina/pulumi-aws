// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Use this data source to get information about an ElastiCache Replication Group.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const bar = aws.elasticache.getReplicationGroup({
 *     replicationGroupId: "example",
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getReplicationGroup(args: GetReplicationGroupArgs, opts?: pulumi.InvokeOptions): Promise<GetReplicationGroupResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("aws:elasticache/getReplicationGroup:getReplicationGroup", {
        "replicationGroupId": args.replicationGroupId,
    }, opts);
}

/**
 * A collection of arguments for invoking getReplicationGroup.
 */
export interface GetReplicationGroupArgs {
    /**
     * Identifier for the replication group.
     */
    replicationGroupId: string;
}

/**
 * A collection of values returned by getReplicationGroup.
 */
export interface GetReplicationGroupResult {
    /**
     * ARN of the created ElastiCache Replication Group.
     */
    readonly arn: string;
    /**
     * Whether an AuthToken (password) is enabled.
     */
    readonly authTokenEnabled: boolean;
    /**
     * A flag whether a read-only replica will be automatically promoted to read/write primary if the existing primary fails.
     */
    readonly automaticFailoverEnabled: boolean;
    /**
     * The configuration endpoint address to allow host discovery.
     */
    readonly configurationEndpointAddress: string;
    /**
     * Description of the replication group.
     */
    readonly description: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Redis [SLOWLOG](https://redis.io/commands/slowlog) or Redis [Engine Log](https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/Log_Delivery.html#Log_contents-engine-log) delivery settings.
     */
    readonly logDeliveryConfigurations: outputs.elasticache.GetReplicationGroupLogDeliveryConfiguration[];
    /**
     * Identifiers of all the nodes that are part of this replication group.
     */
    readonly memberClusters: string[];
    /**
     * Whether Multi-AZ Support is enabled for the replication group.
     */
    readonly multiAzEnabled: boolean;
    /**
     * The cluster node type.
     */
    readonly nodeType: string;
    /**
     * The number of cache clusters that the replication group has.
     */
    readonly numCacheClusters: number;
    /**
     * Number of node groups (shards) for the replication group.
     */
    readonly numNodeGroups: number;
    /**
     * The port number on which the configuration endpoint will accept connections.
     */
    readonly port: number;
    /**
     * The endpoint of the primary node in this node group (shard).
     */
    readonly primaryEndpointAddress: string;
    /**
     * The endpoint of the reader node in this node group (shard).
     */
    readonly readerEndpointAddress: string;
    /**
     * Number of replica nodes in each node group.
     */
    readonly replicasPerNodeGroup: number;
    readonly replicationGroupId: string;
    /**
     * The number of days for which ElastiCache retains automatic cache cluster snapshots before deleting them.
     */
    readonly snapshotRetentionLimit: number;
    /**
     * Daily time range (in UTC) during which ElastiCache begins taking a daily snapshot of your node group (shard).
     */
    readonly snapshotWindow: string;
}
/**
 * Use this data source to get information about an ElastiCache Replication Group.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const bar = aws.elasticache.getReplicationGroup({
 *     replicationGroupId: "example",
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getReplicationGroupOutput(args: GetReplicationGroupOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetReplicationGroupResult> {
    return pulumi.output(args).apply((a: any) => getReplicationGroup(a, opts))
}

/**
 * A collection of arguments for invoking getReplicationGroup.
 */
export interface GetReplicationGroupOutputArgs {
    /**
     * Identifier for the replication group.
     */
    replicationGroupId: pulumi.Input<string>;
}

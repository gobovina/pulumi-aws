# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import sys
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
if sys.version_info >= (3, 11):
    from typing import NotRequired, TypedDict, TypeAlias
else:
    from typing_extensions import NotRequired, TypedDict, TypeAlias
from .. import _utilities
from . import outputs

__all__ = [
    'GetClusterResult',
    'AwaitableGetClusterResult',
    'get_cluster',
    'get_cluster_output',
]

@pulumi.output_type
class GetClusterResult:
    """
    A collection of values returned by getCluster.
    """
    def __init__(__self__, arn=None, availability_zone=None, cache_nodes=None, cluster_address=None, cluster_id=None, configuration_endpoint=None, engine=None, engine_version=None, id=None, ip_discovery=None, log_delivery_configurations=None, maintenance_window=None, network_type=None, node_type=None, notification_topic_arn=None, num_cache_nodes=None, parameter_group_name=None, port=None, preferred_outpost_arn=None, replication_group_id=None, security_group_ids=None, snapshot_retention_limit=None, snapshot_window=None, subnet_group_name=None, tags=None):
        if arn and not isinstance(arn, str):
            raise TypeError("Expected argument 'arn' to be a str")
        pulumi.set(__self__, "arn", arn)
        if availability_zone and not isinstance(availability_zone, str):
            raise TypeError("Expected argument 'availability_zone' to be a str")
        pulumi.set(__self__, "availability_zone", availability_zone)
        if cache_nodes and not isinstance(cache_nodes, list):
            raise TypeError("Expected argument 'cache_nodes' to be a list")
        pulumi.set(__self__, "cache_nodes", cache_nodes)
        if cluster_address and not isinstance(cluster_address, str):
            raise TypeError("Expected argument 'cluster_address' to be a str")
        pulumi.set(__self__, "cluster_address", cluster_address)
        if cluster_id and not isinstance(cluster_id, str):
            raise TypeError("Expected argument 'cluster_id' to be a str")
        pulumi.set(__self__, "cluster_id", cluster_id)
        if configuration_endpoint and not isinstance(configuration_endpoint, str):
            raise TypeError("Expected argument 'configuration_endpoint' to be a str")
        pulumi.set(__self__, "configuration_endpoint", configuration_endpoint)
        if engine and not isinstance(engine, str):
            raise TypeError("Expected argument 'engine' to be a str")
        pulumi.set(__self__, "engine", engine)
        if engine_version and not isinstance(engine_version, str):
            raise TypeError("Expected argument 'engine_version' to be a str")
        pulumi.set(__self__, "engine_version", engine_version)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ip_discovery and not isinstance(ip_discovery, str):
            raise TypeError("Expected argument 'ip_discovery' to be a str")
        pulumi.set(__self__, "ip_discovery", ip_discovery)
        if log_delivery_configurations and not isinstance(log_delivery_configurations, list):
            raise TypeError("Expected argument 'log_delivery_configurations' to be a list")
        pulumi.set(__self__, "log_delivery_configurations", log_delivery_configurations)
        if maintenance_window and not isinstance(maintenance_window, str):
            raise TypeError("Expected argument 'maintenance_window' to be a str")
        pulumi.set(__self__, "maintenance_window", maintenance_window)
        if network_type and not isinstance(network_type, str):
            raise TypeError("Expected argument 'network_type' to be a str")
        pulumi.set(__self__, "network_type", network_type)
        if node_type and not isinstance(node_type, str):
            raise TypeError("Expected argument 'node_type' to be a str")
        pulumi.set(__self__, "node_type", node_type)
        if notification_topic_arn and not isinstance(notification_topic_arn, str):
            raise TypeError("Expected argument 'notification_topic_arn' to be a str")
        pulumi.set(__self__, "notification_topic_arn", notification_topic_arn)
        if num_cache_nodes and not isinstance(num_cache_nodes, int):
            raise TypeError("Expected argument 'num_cache_nodes' to be a int")
        pulumi.set(__self__, "num_cache_nodes", num_cache_nodes)
        if parameter_group_name and not isinstance(parameter_group_name, str):
            raise TypeError("Expected argument 'parameter_group_name' to be a str")
        pulumi.set(__self__, "parameter_group_name", parameter_group_name)
        if port and not isinstance(port, int):
            raise TypeError("Expected argument 'port' to be a int")
        pulumi.set(__self__, "port", port)
        if preferred_outpost_arn and not isinstance(preferred_outpost_arn, str):
            raise TypeError("Expected argument 'preferred_outpost_arn' to be a str")
        pulumi.set(__self__, "preferred_outpost_arn", preferred_outpost_arn)
        if replication_group_id and not isinstance(replication_group_id, str):
            raise TypeError("Expected argument 'replication_group_id' to be a str")
        pulumi.set(__self__, "replication_group_id", replication_group_id)
        if security_group_ids and not isinstance(security_group_ids, list):
            raise TypeError("Expected argument 'security_group_ids' to be a list")
        pulumi.set(__self__, "security_group_ids", security_group_ids)
        if snapshot_retention_limit and not isinstance(snapshot_retention_limit, int):
            raise TypeError("Expected argument 'snapshot_retention_limit' to be a int")
        pulumi.set(__self__, "snapshot_retention_limit", snapshot_retention_limit)
        if snapshot_window and not isinstance(snapshot_window, str):
            raise TypeError("Expected argument 'snapshot_window' to be a str")
        pulumi.set(__self__, "snapshot_window", snapshot_window)
        if subnet_group_name and not isinstance(subnet_group_name, str):
            raise TypeError("Expected argument 'subnet_group_name' to be a str")
        pulumi.set(__self__, "subnet_group_name", subnet_group_name)
        if tags and not isinstance(tags, dict):
            raise TypeError("Expected argument 'tags' to be a dict")
        pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter
    def arn(self) -> str:
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter(name="availabilityZone")
    def availability_zone(self) -> str:
        """
        Availability Zone for the cache cluster.
        """
        return pulumi.get(self, "availability_zone")

    @property
    @pulumi.getter(name="cacheNodes")
    def cache_nodes(self) -> Sequence['outputs.GetClusterCacheNodeResult']:
        """
        List of node objects including `id`, `address`, `port`, `availability_zone` and `outpost_arn`.
        Referenceable e.g., as `${data.aws_elasticache_cluster.bar.cache_nodes.0.address}`
        """
        return pulumi.get(self, "cache_nodes")

    @property
    @pulumi.getter(name="clusterAddress")
    def cluster_address(self) -> str:
        """
        (Memcached only) DNS name of the cache cluster without the port appended.
        """
        return pulumi.get(self, "cluster_address")

    @property
    @pulumi.getter(name="clusterId")
    def cluster_id(self) -> str:
        return pulumi.get(self, "cluster_id")

    @property
    @pulumi.getter(name="configurationEndpoint")
    def configuration_endpoint(self) -> str:
        """
        (Memcached only) Configuration endpoint to allow host discovery.
        """
        return pulumi.get(self, "configuration_endpoint")

    @property
    @pulumi.getter
    def engine(self) -> str:
        """
        Name of the cache engine.
        """
        return pulumi.get(self, "engine")

    @property
    @pulumi.getter(name="engineVersion")
    def engine_version(self) -> str:
        """
        Version number of the cache engine.
        """
        return pulumi.get(self, "engine_version")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="ipDiscovery")
    def ip_discovery(self) -> str:
        """
        The IP version advertised in the discovery protocol.
        """
        return pulumi.get(self, "ip_discovery")

    @property
    @pulumi.getter(name="logDeliveryConfigurations")
    def log_delivery_configurations(self) -> Sequence['outputs.GetClusterLogDeliveryConfigurationResult']:
        """
        Redis [SLOWLOG](https://redis.io/commands/slowlog) or Redis [Engine Log](https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/Log_Delivery.html#Log_contents-engine-log) delivery settings.
        """
        return pulumi.get(self, "log_delivery_configurations")

    @property
    @pulumi.getter(name="maintenanceWindow")
    def maintenance_window(self) -> str:
        """
        Specifies the weekly time range for when maintenance
        on the cache cluster is performed.
        """
        return pulumi.get(self, "maintenance_window")

    @property
    @pulumi.getter(name="networkType")
    def network_type(self) -> str:
        """
        The IP versions for cache cluster connections.
        """
        return pulumi.get(self, "network_type")

    @property
    @pulumi.getter(name="nodeType")
    def node_type(self) -> str:
        """
        The cluster node type.
        """
        return pulumi.get(self, "node_type")

    @property
    @pulumi.getter(name="notificationTopicArn")
    def notification_topic_arn(self) -> str:
        """
        An ARN of an
        SNS topic that ElastiCache notifications get sent to.
        """
        return pulumi.get(self, "notification_topic_arn")

    @property
    @pulumi.getter(name="numCacheNodes")
    def num_cache_nodes(self) -> int:
        """
        The number of cache nodes that the cache cluster has.
        """
        return pulumi.get(self, "num_cache_nodes")

    @property
    @pulumi.getter(name="parameterGroupName")
    def parameter_group_name(self) -> str:
        """
        Name of the parameter group associated with this cache cluster.
        """
        return pulumi.get(self, "parameter_group_name")

    @property
    @pulumi.getter
    def port(self) -> int:
        """
        The port number on which each of the cache nodes will
        accept connections.
        """
        return pulumi.get(self, "port")

    @property
    @pulumi.getter(name="preferredOutpostArn")
    def preferred_outpost_arn(self) -> str:
        """
        The outpost ARN in which the cache cluster was created if created in outpost.
        """
        return pulumi.get(self, "preferred_outpost_arn")

    @property
    @pulumi.getter(name="replicationGroupId")
    def replication_group_id(self) -> str:
        """
        The replication group to which this cache cluster belongs.
        """
        return pulumi.get(self, "replication_group_id")

    @property
    @pulumi.getter(name="securityGroupIds")
    def security_group_ids(self) -> Sequence[str]:
        """
        List VPC security groups associated with the cache cluster.
        """
        return pulumi.get(self, "security_group_ids")

    @property
    @pulumi.getter(name="snapshotRetentionLimit")
    def snapshot_retention_limit(self) -> int:
        """
        The number of days for which ElastiCache will
        retain automatic cache cluster snapshots before deleting them.
        """
        return pulumi.get(self, "snapshot_retention_limit")

    @property
    @pulumi.getter(name="snapshotWindow")
    def snapshot_window(self) -> str:
        """
        Daily time range (in UTC) during which ElastiCache will
        begin taking a daily snapshot of the cache cluster.
        """
        return pulumi.get(self, "snapshot_window")

    @property
    @pulumi.getter(name="subnetGroupName")
    def subnet_group_name(self) -> str:
        """
        Name of the subnet group associated to the cache cluster.
        """
        return pulumi.get(self, "subnet_group_name")

    @property
    @pulumi.getter
    def tags(self) -> Mapping[str, str]:
        """
        Tags assigned to the resource
        """
        return pulumi.get(self, "tags")


class AwaitableGetClusterResult(GetClusterResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetClusterResult(
            arn=self.arn,
            availability_zone=self.availability_zone,
            cache_nodes=self.cache_nodes,
            cluster_address=self.cluster_address,
            cluster_id=self.cluster_id,
            configuration_endpoint=self.configuration_endpoint,
            engine=self.engine,
            engine_version=self.engine_version,
            id=self.id,
            ip_discovery=self.ip_discovery,
            log_delivery_configurations=self.log_delivery_configurations,
            maintenance_window=self.maintenance_window,
            network_type=self.network_type,
            node_type=self.node_type,
            notification_topic_arn=self.notification_topic_arn,
            num_cache_nodes=self.num_cache_nodes,
            parameter_group_name=self.parameter_group_name,
            port=self.port,
            preferred_outpost_arn=self.preferred_outpost_arn,
            replication_group_id=self.replication_group_id,
            security_group_ids=self.security_group_ids,
            snapshot_retention_limit=self.snapshot_retention_limit,
            snapshot_window=self.snapshot_window,
            subnet_group_name=self.subnet_group_name,
            tags=self.tags)


def get_cluster(cluster_id: Optional[str] = None,
                tags: Optional[Mapping[str, str]] = None,
                opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetClusterResult:
    """
    Use this data source to get information about an ElastiCache Cluster

    ## Example Usage

    ```python
    import pulumi
    import pulumi_aws as aws

    my_cluster = aws.elasticache.get_cluster(cluster_id="my-cluster-id")
    ```


    :param str cluster_id: Group identifier.
    :param Mapping[str, str] tags: Tags assigned to the resource
    """
    __args__ = dict()
    __args__['clusterId'] = cluster_id
    __args__['tags'] = tags
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('aws:elasticache/getCluster:getCluster', __args__, opts=opts, typ=GetClusterResult).value

    return AwaitableGetClusterResult(
        arn=pulumi.get(__ret__, 'arn'),
        availability_zone=pulumi.get(__ret__, 'availability_zone'),
        cache_nodes=pulumi.get(__ret__, 'cache_nodes'),
        cluster_address=pulumi.get(__ret__, 'cluster_address'),
        cluster_id=pulumi.get(__ret__, 'cluster_id'),
        configuration_endpoint=pulumi.get(__ret__, 'configuration_endpoint'),
        engine=pulumi.get(__ret__, 'engine'),
        engine_version=pulumi.get(__ret__, 'engine_version'),
        id=pulumi.get(__ret__, 'id'),
        ip_discovery=pulumi.get(__ret__, 'ip_discovery'),
        log_delivery_configurations=pulumi.get(__ret__, 'log_delivery_configurations'),
        maintenance_window=pulumi.get(__ret__, 'maintenance_window'),
        network_type=pulumi.get(__ret__, 'network_type'),
        node_type=pulumi.get(__ret__, 'node_type'),
        notification_topic_arn=pulumi.get(__ret__, 'notification_topic_arn'),
        num_cache_nodes=pulumi.get(__ret__, 'num_cache_nodes'),
        parameter_group_name=pulumi.get(__ret__, 'parameter_group_name'),
        port=pulumi.get(__ret__, 'port'),
        preferred_outpost_arn=pulumi.get(__ret__, 'preferred_outpost_arn'),
        replication_group_id=pulumi.get(__ret__, 'replication_group_id'),
        security_group_ids=pulumi.get(__ret__, 'security_group_ids'),
        snapshot_retention_limit=pulumi.get(__ret__, 'snapshot_retention_limit'),
        snapshot_window=pulumi.get(__ret__, 'snapshot_window'),
        subnet_group_name=pulumi.get(__ret__, 'subnet_group_name'),
        tags=pulumi.get(__ret__, 'tags'))


@_utilities.lift_output_func(get_cluster)
def get_cluster_output(cluster_id: Optional[pulumi.Input[str]] = None,
                       tags: Optional[pulumi.Input[Optional[Mapping[str, str]]]] = None,
                       opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetClusterResult]:
    """
    Use this data source to get information about an ElastiCache Cluster

    ## Example Usage

    ```python
    import pulumi
    import pulumi_aws as aws

    my_cluster = aws.elasticache.get_cluster(cluster_id="my-cluster-id")
    ```


    :param str cluster_id: Group identifier.
    :param Mapping[str, str] tags: Tags assigned to the resource
    """
    ...

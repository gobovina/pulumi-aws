# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities
from . import outputs

__all__ = [
    'ClusterClusterEndpoint',
    'ClusterShard',
    'ClusterShardNode',
    'ClusterShardNodeEndpoint',
    'ParameterGroupParameter',
    'SnapshotClusterConfiguration',
    'UserAuthenticationMode',
]

@pulumi.output_type
class ClusterClusterEndpoint(dict):
    def __init__(__self__, *,
                 address: Optional[str] = None,
                 port: Optional[int] = None):
        """
        :param str address: DNS hostname of the node.
        :param int port: The port number on which each of the nodes accepts connections. Defaults to `6379`.
        """
        if address is not None:
            pulumi.set(__self__, "address", address)
        if port is not None:
            pulumi.set(__self__, "port", port)

    @property
    @pulumi.getter
    def address(self) -> Optional[str]:
        """
        DNS hostname of the node.
        """
        return pulumi.get(self, "address")

    @property
    @pulumi.getter
    def port(self) -> Optional[int]:
        """
        The port number on which each of the nodes accepts connections. Defaults to `6379`.
        """
        return pulumi.get(self, "port")


@pulumi.output_type
class ClusterShard(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "numNodes":
            suggest = "num_nodes"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in ClusterShard. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        ClusterShard.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        ClusterShard.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 name: Optional[str] = None,
                 nodes: Optional[Sequence['outputs.ClusterShardNode']] = None,
                 num_nodes: Optional[int] = None,
                 slots: Optional[str] = None):
        """
        :param str name: Name of this node.
               * `endpoint`
        :param Sequence['ClusterShardNodeArgs'] nodes: Set of nodes in this shard.
        :param int num_nodes: Number of individual nodes in this shard.
        :param str slots: Keyspace for this shard. Example: `0-16383`.
        """
        if name is not None:
            pulumi.set(__self__, "name", name)
        if nodes is not None:
            pulumi.set(__self__, "nodes", nodes)
        if num_nodes is not None:
            pulumi.set(__self__, "num_nodes", num_nodes)
        if slots is not None:
            pulumi.set(__self__, "slots", slots)

    @property
    @pulumi.getter
    def name(self) -> Optional[str]:
        """
        Name of this node.
        * `endpoint`
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def nodes(self) -> Optional[Sequence['outputs.ClusterShardNode']]:
        """
        Set of nodes in this shard.
        """
        return pulumi.get(self, "nodes")

    @property
    @pulumi.getter(name="numNodes")
    def num_nodes(self) -> Optional[int]:
        """
        Number of individual nodes in this shard.
        """
        return pulumi.get(self, "num_nodes")

    @property
    @pulumi.getter
    def slots(self) -> Optional[str]:
        """
        Keyspace for this shard. Example: `0-16383`.
        """
        return pulumi.get(self, "slots")


@pulumi.output_type
class ClusterShardNode(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "availabilityZone":
            suggest = "availability_zone"
        elif key == "createTime":
            suggest = "create_time"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in ClusterShardNode. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        ClusterShardNode.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        ClusterShardNode.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 availability_zone: Optional[str] = None,
                 create_time: Optional[str] = None,
                 endpoints: Optional[Sequence['outputs.ClusterShardNodeEndpoint']] = None,
                 name: Optional[str] = None):
        """
        :param str availability_zone: The Availability Zone in which the node resides.
        :param str create_time: The date and time when the node was created. Example: `2022-01-01T21:00:00Z`.
        :param str name: Name of this node.
               * `endpoint`
        """
        if availability_zone is not None:
            pulumi.set(__self__, "availability_zone", availability_zone)
        if create_time is not None:
            pulumi.set(__self__, "create_time", create_time)
        if endpoints is not None:
            pulumi.set(__self__, "endpoints", endpoints)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter(name="availabilityZone")
    def availability_zone(self) -> Optional[str]:
        """
        The Availability Zone in which the node resides.
        """
        return pulumi.get(self, "availability_zone")

    @property
    @pulumi.getter(name="createTime")
    def create_time(self) -> Optional[str]:
        """
        The date and time when the node was created. Example: `2022-01-01T21:00:00Z`.
        """
        return pulumi.get(self, "create_time")

    @property
    @pulumi.getter
    def endpoints(self) -> Optional[Sequence['outputs.ClusterShardNodeEndpoint']]:
        return pulumi.get(self, "endpoints")

    @property
    @pulumi.getter
    def name(self) -> Optional[str]:
        """
        Name of this node.
        * `endpoint`
        """
        return pulumi.get(self, "name")


@pulumi.output_type
class ClusterShardNodeEndpoint(dict):
    def __init__(__self__, *,
                 address: Optional[str] = None,
                 port: Optional[int] = None):
        """
        :param str address: DNS hostname of the node.
        :param int port: The port number on which each of the nodes accepts connections. Defaults to `6379`.
        """
        if address is not None:
            pulumi.set(__self__, "address", address)
        if port is not None:
            pulumi.set(__self__, "port", port)

    @property
    @pulumi.getter
    def address(self) -> Optional[str]:
        """
        DNS hostname of the node.
        """
        return pulumi.get(self, "address")

    @property
    @pulumi.getter
    def port(self) -> Optional[int]:
        """
        The port number on which each of the nodes accepts connections. Defaults to `6379`.
        """
        return pulumi.get(self, "port")


@pulumi.output_type
class ParameterGroupParameter(dict):
    def __init__(__self__, *,
                 name: str,
                 value: str):
        """
        :param str name: The name of the parameter.
        :param str value: The value of the parameter.
        """
        pulumi.set(__self__, "name", name)
        pulumi.set(__self__, "value", value)

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        The name of the parameter.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def value(self) -> str:
        """
        The value of the parameter.
        """
        return pulumi.get(self, "value")


@pulumi.output_type
class SnapshotClusterConfiguration(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "engineVersion":
            suggest = "engine_version"
        elif key == "maintenanceWindow":
            suggest = "maintenance_window"
        elif key == "nodeType":
            suggest = "node_type"
        elif key == "numShards":
            suggest = "num_shards"
        elif key == "parameterGroupName":
            suggest = "parameter_group_name"
        elif key == "snapshotRetentionLimit":
            suggest = "snapshot_retention_limit"
        elif key == "snapshotWindow":
            suggest = "snapshot_window"
        elif key == "subnetGroupName":
            suggest = "subnet_group_name"
        elif key == "topicArn":
            suggest = "topic_arn"
        elif key == "vpcId":
            suggest = "vpc_id"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in SnapshotClusterConfiguration. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        SnapshotClusterConfiguration.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        SnapshotClusterConfiguration.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 description: Optional[str] = None,
                 engine_version: Optional[str] = None,
                 maintenance_window: Optional[str] = None,
                 name: Optional[str] = None,
                 node_type: Optional[str] = None,
                 num_shards: Optional[int] = None,
                 parameter_group_name: Optional[str] = None,
                 port: Optional[int] = None,
                 snapshot_retention_limit: Optional[int] = None,
                 snapshot_window: Optional[str] = None,
                 subnet_group_name: Optional[str] = None,
                 topic_arn: Optional[str] = None,
                 vpc_id: Optional[str] = None):
        """
        :param str description: Description for the cluster.
        :param str engine_version: Version number of the Redis engine used by the cluster.
        :param str maintenance_window: The weekly time range during which maintenance on the cluster is performed.
        :param str name: Name of the cluster.
        :param str node_type: Compute and memory capacity of the nodes in the cluster.
        :param int num_shards: Number of shards in the cluster.
        :param str parameter_group_name: Name of the parameter group associated with the cluster.
        :param int port: Port number on which the cluster accepts connections.
        :param int snapshot_retention_limit: Number of days for which MemoryDB retains automatic snapshots before deleting them.
        :param str snapshot_window: The daily time range (in UTC) during which MemoryDB begins taking a daily snapshot of the shard.
        :param str subnet_group_name: Name of the subnet group used by the cluster.
        :param str topic_arn: ARN of the SNS topic to which cluster notifications are sent.
        :param str vpc_id: The VPC in which the cluster exists.
        """
        if description is not None:
            pulumi.set(__self__, "description", description)
        if engine_version is not None:
            pulumi.set(__self__, "engine_version", engine_version)
        if maintenance_window is not None:
            pulumi.set(__self__, "maintenance_window", maintenance_window)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if node_type is not None:
            pulumi.set(__self__, "node_type", node_type)
        if num_shards is not None:
            pulumi.set(__self__, "num_shards", num_shards)
        if parameter_group_name is not None:
            pulumi.set(__self__, "parameter_group_name", parameter_group_name)
        if port is not None:
            pulumi.set(__self__, "port", port)
        if snapshot_retention_limit is not None:
            pulumi.set(__self__, "snapshot_retention_limit", snapshot_retention_limit)
        if snapshot_window is not None:
            pulumi.set(__self__, "snapshot_window", snapshot_window)
        if subnet_group_name is not None:
            pulumi.set(__self__, "subnet_group_name", subnet_group_name)
        if topic_arn is not None:
            pulumi.set(__self__, "topic_arn", topic_arn)
        if vpc_id is not None:
            pulumi.set(__self__, "vpc_id", vpc_id)

    @property
    @pulumi.getter
    def description(self) -> Optional[str]:
        """
        Description for the cluster.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="engineVersion")
    def engine_version(self) -> Optional[str]:
        """
        Version number of the Redis engine used by the cluster.
        """
        return pulumi.get(self, "engine_version")

    @property
    @pulumi.getter(name="maintenanceWindow")
    def maintenance_window(self) -> Optional[str]:
        """
        The weekly time range during which maintenance on the cluster is performed.
        """
        return pulumi.get(self, "maintenance_window")

    @property
    @pulumi.getter
    def name(self) -> Optional[str]:
        """
        Name of the cluster.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="nodeType")
    def node_type(self) -> Optional[str]:
        """
        Compute and memory capacity of the nodes in the cluster.
        """
        return pulumi.get(self, "node_type")

    @property
    @pulumi.getter(name="numShards")
    def num_shards(self) -> Optional[int]:
        """
        Number of shards in the cluster.
        """
        return pulumi.get(self, "num_shards")

    @property
    @pulumi.getter(name="parameterGroupName")
    def parameter_group_name(self) -> Optional[str]:
        """
        Name of the parameter group associated with the cluster.
        """
        return pulumi.get(self, "parameter_group_name")

    @property
    @pulumi.getter
    def port(self) -> Optional[int]:
        """
        Port number on which the cluster accepts connections.
        """
        return pulumi.get(self, "port")

    @property
    @pulumi.getter(name="snapshotRetentionLimit")
    def snapshot_retention_limit(self) -> Optional[int]:
        """
        Number of days for which MemoryDB retains automatic snapshots before deleting them.
        """
        return pulumi.get(self, "snapshot_retention_limit")

    @property
    @pulumi.getter(name="snapshotWindow")
    def snapshot_window(self) -> Optional[str]:
        """
        The daily time range (in UTC) during which MemoryDB begins taking a daily snapshot of the shard.
        """
        return pulumi.get(self, "snapshot_window")

    @property
    @pulumi.getter(name="subnetGroupName")
    def subnet_group_name(self) -> Optional[str]:
        """
        Name of the subnet group used by the cluster.
        """
        return pulumi.get(self, "subnet_group_name")

    @property
    @pulumi.getter(name="topicArn")
    def topic_arn(self) -> Optional[str]:
        """
        ARN of the SNS topic to which cluster notifications are sent.
        """
        return pulumi.get(self, "topic_arn")

    @property
    @pulumi.getter(name="vpcId")
    def vpc_id(self) -> Optional[str]:
        """
        The VPC in which the cluster exists.
        """
        return pulumi.get(self, "vpc_id")


@pulumi.output_type
class UserAuthenticationMode(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "passwordCount":
            suggest = "password_count"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in UserAuthenticationMode. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        UserAuthenticationMode.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        UserAuthenticationMode.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 passwords: Sequence[str],
                 type: str,
                 password_count: Optional[int] = None):
        """
        :param Sequence[str] passwords: The set of passwords used for authentication. You can create up to two passwords for each user.
        :param str type: Indicates whether the user requires a password to authenticate. Must be set to `password`.
        :param int password_count: The number of passwords belonging to the user.
        """
        pulumi.set(__self__, "passwords", passwords)
        pulumi.set(__self__, "type", type)
        if password_count is not None:
            pulumi.set(__self__, "password_count", password_count)

    @property
    @pulumi.getter
    def passwords(self) -> Sequence[str]:
        """
        The set of passwords used for authentication. You can create up to two passwords for each user.
        """
        return pulumi.get(self, "passwords")

    @property
    @pulumi.getter
    def type(self) -> str:
        """
        Indicates whether the user requires a password to authenticate. Must be set to `password`.
        """
        return pulumi.get(self, "type")

    @property
    @pulumi.getter(name="passwordCount")
    def password_count(self) -> Optional[int]:
        """
        The number of passwords belonging to the user.
        """
        return pulumi.get(self, "password_count")



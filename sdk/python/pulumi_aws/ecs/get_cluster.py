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
    def __init__(__self__, arn=None, cluster_name=None, id=None, pending_tasks_count=None, registered_container_instances_count=None, running_tasks_count=None, settings=None, status=None):
        if arn and not isinstance(arn, str):
            raise TypeError("Expected argument 'arn' to be a str")
        pulumi.set(__self__, "arn", arn)
        if cluster_name and not isinstance(cluster_name, str):
            raise TypeError("Expected argument 'cluster_name' to be a str")
        pulumi.set(__self__, "cluster_name", cluster_name)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if pending_tasks_count and not isinstance(pending_tasks_count, int):
            raise TypeError("Expected argument 'pending_tasks_count' to be a int")
        pulumi.set(__self__, "pending_tasks_count", pending_tasks_count)
        if registered_container_instances_count and not isinstance(registered_container_instances_count, int):
            raise TypeError("Expected argument 'registered_container_instances_count' to be a int")
        pulumi.set(__self__, "registered_container_instances_count", registered_container_instances_count)
        if running_tasks_count and not isinstance(running_tasks_count, int):
            raise TypeError("Expected argument 'running_tasks_count' to be a int")
        pulumi.set(__self__, "running_tasks_count", running_tasks_count)
        if settings and not isinstance(settings, list):
            raise TypeError("Expected argument 'settings' to be a list")
        pulumi.set(__self__, "settings", settings)
        if status and not isinstance(status, str):
            raise TypeError("Expected argument 'status' to be a str")
        pulumi.set(__self__, "status", status)

    @property
    @pulumi.getter
    def arn(self) -> str:
        """
        The ARN of the ECS Cluster
        """
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter(name="clusterName")
    def cluster_name(self) -> str:
        return pulumi.get(self, "cluster_name")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="pendingTasksCount")
    def pending_tasks_count(self) -> int:
        """
        The number of pending tasks for the ECS Cluster
        """
        return pulumi.get(self, "pending_tasks_count")

    @property
    @pulumi.getter(name="registeredContainerInstancesCount")
    def registered_container_instances_count(self) -> int:
        """
        The number of registered container instances for the ECS Cluster
        """
        return pulumi.get(self, "registered_container_instances_count")

    @property
    @pulumi.getter(name="runningTasksCount")
    def running_tasks_count(self) -> int:
        """
        The number of running tasks for the ECS Cluster
        """
        return pulumi.get(self, "running_tasks_count")

    @property
    @pulumi.getter
    def settings(self) -> Sequence['outputs.GetClusterSettingResult']:
        """
        The settings associated with the ECS Cluster.
        """
        return pulumi.get(self, "settings")

    @property
    @pulumi.getter
    def status(self) -> str:
        """
        The status of the ECS Cluster
        """
        return pulumi.get(self, "status")


class AwaitableGetClusterResult(GetClusterResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetClusterResult(
            arn=self.arn,
            cluster_name=self.cluster_name,
            id=self.id,
            pending_tasks_count=self.pending_tasks_count,
            registered_container_instances_count=self.registered_container_instances_count,
            running_tasks_count=self.running_tasks_count,
            settings=self.settings,
            status=self.status)


def get_cluster(cluster_name: Optional[str] = None,
                opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetClusterResult:
    """
    The ECS Cluster data source allows access to details of a specific
    cluster within an AWS ECS service.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_aws as aws

    ecs_mongo = aws.ecs.get_cluster(cluster_name="ecs-mongo-production")
    ```


    :param str cluster_name: The name of the ECS Cluster
    """
    __args__ = dict()
    __args__['clusterName'] = cluster_name
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = _utilities.get_version()
    __ret__ = pulumi.runtime.invoke('aws:ecs/getCluster:getCluster', __args__, opts=opts, typ=GetClusterResult).value

    return AwaitableGetClusterResult(
        arn=__ret__.arn,
        cluster_name=__ret__.cluster_name,
        id=__ret__.id,
        pending_tasks_count=__ret__.pending_tasks_count,
        registered_container_instances_count=__ret__.registered_container_instances_count,
        running_tasks_count=__ret__.running_tasks_count,
        settings=__ret__.settings,
        status=__ret__.status)


@_utilities.lift_output_func(get_cluster)
def get_cluster_output(cluster_name: Optional[pulumi.Input[str]] = None,
                       opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetClusterResult]:
    """
    The ECS Cluster data source allows access to details of a specific
    cluster within an AWS ECS service.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_aws as aws

    ecs_mongo = aws.ecs.get_cluster(cluster_name="ecs-mongo-production")
    ```


    :param str cluster_name: The name of the ECS Cluster
    """
    ...

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
    'GetVirtualClusterResult',
    'AwaitableGetVirtualClusterResult',
    'get_virtual_cluster',
    'get_virtual_cluster_output',
]

@pulumi.output_type
class GetVirtualClusterResult:
    """
    A collection of values returned by getVirtualCluster.
    """
    def __init__(__self__, arn=None, container_providers=None, created_at=None, id=None, name=None, state=None, tags=None, virtual_cluster_id=None):
        if arn and not isinstance(arn, str):
            raise TypeError("Expected argument 'arn' to be a str")
        pulumi.set(__self__, "arn", arn)
        if container_providers and not isinstance(container_providers, list):
            raise TypeError("Expected argument 'container_providers' to be a list")
        pulumi.set(__self__, "container_providers", container_providers)
        if created_at and not isinstance(created_at, str):
            raise TypeError("Expected argument 'created_at' to be a str")
        pulumi.set(__self__, "created_at", created_at)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if state and not isinstance(state, str):
            raise TypeError("Expected argument 'state' to be a str")
        pulumi.set(__self__, "state", state)
        if tags and not isinstance(tags, dict):
            raise TypeError("Expected argument 'tags' to be a dict")
        pulumi.set(__self__, "tags", tags)
        if virtual_cluster_id and not isinstance(virtual_cluster_id, str):
            raise TypeError("Expected argument 'virtual_cluster_id' to be a str")
        pulumi.set(__self__, "virtual_cluster_id", virtual_cluster_id)

    @property
    @pulumi.getter
    def arn(self) -> str:
        """
        ARN of the cluster.
        """
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter(name="containerProviders")
    def container_providers(self) -> Sequence['outputs.GetVirtualClusterContainerProviderResult']:
        """
        Nested attribute containing information about the underlying container provider (EKS cluster) for your EMR Containers cluster.
        """
        return pulumi.get(self, "container_providers")

    @property
    @pulumi.getter(name="createdAt")
    def created_at(self) -> str:
        """
        Unix epoch time stamp in seconds for when the cluster was created.
        """
        return pulumi.get(self, "created_at")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        Name of the cluster.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def state(self) -> str:
        """
        Status of the EKS cluster. One of `RUNNING`, `TERMINATING`, `TERMINATED`, `ARRESTED`.
        """
        return pulumi.get(self, "state")

    @property
    @pulumi.getter
    def tags(self) -> Mapping[str, str]:
        """
        Key-value mapping of resource tags.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter(name="virtualClusterId")
    def virtual_cluster_id(self) -> str:
        return pulumi.get(self, "virtual_cluster_id")


class AwaitableGetVirtualClusterResult(GetVirtualClusterResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetVirtualClusterResult(
            arn=self.arn,
            container_providers=self.container_providers,
            created_at=self.created_at,
            id=self.id,
            name=self.name,
            state=self.state,
            tags=self.tags,
            virtual_cluster_id=self.virtual_cluster_id)


def get_virtual_cluster(tags: Optional[Mapping[str, str]] = None,
                        virtual_cluster_id: Optional[str] = None,
                        opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetVirtualClusterResult:
    """
    Retrieve information about an EMR Containers (EMR on EKS) Virtual Cluster.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_aws as aws

    example = aws.emrcontainers.get_virtual_cluster(virtual_cluster_id="example id")
    pulumi.export("name", example.name)
    pulumi.export("arn", example.arn)
    ```


    :param Mapping[str, str] tags: Key-value mapping of resource tags.
    :param str virtual_cluster_id: ID of the cluster.
    """
    __args__ = dict()
    __args__['tags'] = tags
    __args__['virtualClusterId'] = virtual_cluster_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('aws:emrcontainers/getVirtualCluster:getVirtualCluster', __args__, opts=opts, typ=GetVirtualClusterResult).value

    return AwaitableGetVirtualClusterResult(
        arn=pulumi.get(__ret__, 'arn'),
        container_providers=pulumi.get(__ret__, 'container_providers'),
        created_at=pulumi.get(__ret__, 'created_at'),
        id=pulumi.get(__ret__, 'id'),
        name=pulumi.get(__ret__, 'name'),
        state=pulumi.get(__ret__, 'state'),
        tags=pulumi.get(__ret__, 'tags'),
        virtual_cluster_id=pulumi.get(__ret__, 'virtual_cluster_id'))


@_utilities.lift_output_func(get_virtual_cluster)
def get_virtual_cluster_output(tags: Optional[pulumi.Input[Optional[Mapping[str, str]]]] = None,
                               virtual_cluster_id: Optional[pulumi.Input[str]] = None,
                               opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetVirtualClusterResult]:
    """
    Retrieve information about an EMR Containers (EMR on EKS) Virtual Cluster.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_aws as aws

    example = aws.emrcontainers.get_virtual_cluster(virtual_cluster_id="example id")
    pulumi.export("name", example.name)
    pulumi.export("arn", example.arn)
    ```


    :param Mapping[str, str] tags: Key-value mapping of resource tags.
    :param str virtual_cluster_id: ID of the cluster.
    """
    ...

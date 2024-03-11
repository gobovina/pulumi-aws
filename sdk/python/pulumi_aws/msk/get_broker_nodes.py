# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities
from . import outputs

__all__ = [
    'GetBrokerNodesResult',
    'AwaitableGetBrokerNodesResult',
    'get_broker_nodes',
    'get_broker_nodes_output',
]

@pulumi.output_type
class GetBrokerNodesResult:
    """
    A collection of values returned by getBrokerNodes.
    """
    def __init__(__self__, cluster_arn=None, id=None, node_info_lists=None):
        if cluster_arn and not isinstance(cluster_arn, str):
            raise TypeError("Expected argument 'cluster_arn' to be a str")
        pulumi.set(__self__, "cluster_arn", cluster_arn)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if node_info_lists and not isinstance(node_info_lists, list):
            raise TypeError("Expected argument 'node_info_lists' to be a list")
        pulumi.set(__self__, "node_info_lists", node_info_lists)

    @property
    @pulumi.getter(name="clusterArn")
    def cluster_arn(self) -> str:
        return pulumi.get(self, "cluster_arn")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="nodeInfoLists")
    def node_info_lists(self) -> Sequence['outputs.GetBrokerNodesNodeInfoListResult']:
        return pulumi.get(self, "node_info_lists")


class AwaitableGetBrokerNodesResult(GetBrokerNodesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetBrokerNodesResult(
            cluster_arn=self.cluster_arn,
            id=self.id,
            node_info_lists=self.node_info_lists)


def get_broker_nodes(cluster_arn: Optional[str] = None,
                     opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetBrokerNodesResult:
    """
    Get information on an Amazon MSK Broker Nodes.

    ## Example Usage

    <!--Start PulumiCodeChooser -->
    ```python
    import pulumi
    import pulumi_aws as aws

    example = aws.msk.get_broker_nodes(cluster_arn=example_aws_msk_cluster["arn"])
    ```
    <!--End PulumiCodeChooser -->


    :param str cluster_arn: ARN of the cluster the nodes belong to.
    """
    __args__ = dict()
    __args__['clusterArn'] = cluster_arn
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('aws:msk/getBrokerNodes:getBrokerNodes', __args__, opts=opts, typ=GetBrokerNodesResult).value

    return AwaitableGetBrokerNodesResult(
        cluster_arn=pulumi.get(__ret__, 'cluster_arn'),
        id=pulumi.get(__ret__, 'id'),
        node_info_lists=pulumi.get(__ret__, 'node_info_lists'))


@_utilities.lift_output_func(get_broker_nodes)
def get_broker_nodes_output(cluster_arn: Optional[pulumi.Input[str]] = None,
                            opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetBrokerNodesResult]:
    """
    Get information on an Amazon MSK Broker Nodes.

    ## Example Usage

    <!--Start PulumiCodeChooser -->
    ```python
    import pulumi
    import pulumi_aws as aws

    example = aws.msk.get_broker_nodes(cluster_arn=example_aws_msk_cluster["arn"])
    ```
    <!--End PulumiCodeChooser -->


    :param str cluster_arn: ARN of the cluster the nodes belong to.
    """
    ...

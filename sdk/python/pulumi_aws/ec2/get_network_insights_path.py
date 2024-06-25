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
from ._inputs import *

__all__ = [
    'GetNetworkInsightsPathResult',
    'AwaitableGetNetworkInsightsPathResult',
    'get_network_insights_path',
    'get_network_insights_path_output',
]

@pulumi.output_type
class GetNetworkInsightsPathResult:
    """
    A collection of values returned by getNetworkInsightsPath.
    """
    def __init__(__self__, arn=None, destination=None, destination_arn=None, destination_ip=None, destination_port=None, filters=None, id=None, network_insights_path_id=None, protocol=None, source=None, source_arn=None, source_ip=None, tags=None):
        if arn and not isinstance(arn, str):
            raise TypeError("Expected argument 'arn' to be a str")
        pulumi.set(__self__, "arn", arn)
        if destination and not isinstance(destination, str):
            raise TypeError("Expected argument 'destination' to be a str")
        pulumi.set(__self__, "destination", destination)
        if destination_arn and not isinstance(destination_arn, str):
            raise TypeError("Expected argument 'destination_arn' to be a str")
        pulumi.set(__self__, "destination_arn", destination_arn)
        if destination_ip and not isinstance(destination_ip, str):
            raise TypeError("Expected argument 'destination_ip' to be a str")
        pulumi.set(__self__, "destination_ip", destination_ip)
        if destination_port and not isinstance(destination_port, int):
            raise TypeError("Expected argument 'destination_port' to be a int")
        pulumi.set(__self__, "destination_port", destination_port)
        if filters and not isinstance(filters, list):
            raise TypeError("Expected argument 'filters' to be a list")
        pulumi.set(__self__, "filters", filters)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if network_insights_path_id and not isinstance(network_insights_path_id, str):
            raise TypeError("Expected argument 'network_insights_path_id' to be a str")
        pulumi.set(__self__, "network_insights_path_id", network_insights_path_id)
        if protocol and not isinstance(protocol, str):
            raise TypeError("Expected argument 'protocol' to be a str")
        pulumi.set(__self__, "protocol", protocol)
        if source and not isinstance(source, str):
            raise TypeError("Expected argument 'source' to be a str")
        pulumi.set(__self__, "source", source)
        if source_arn and not isinstance(source_arn, str):
            raise TypeError("Expected argument 'source_arn' to be a str")
        pulumi.set(__self__, "source_arn", source_arn)
        if source_ip and not isinstance(source_ip, str):
            raise TypeError("Expected argument 'source_ip' to be a str")
        pulumi.set(__self__, "source_ip", source_ip)
        if tags and not isinstance(tags, dict):
            raise TypeError("Expected argument 'tags' to be a dict")
        pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter
    def arn(self) -> str:
        """
        ARN of the selected Network Insights Path.
        """
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter
    def destination(self) -> str:
        """
        AWS resource that is the destination of the path.
        """
        return pulumi.get(self, "destination")

    @property
    @pulumi.getter(name="destinationArn")
    def destination_arn(self) -> str:
        """
        ARN of the destination.
        """
        return pulumi.get(self, "destination_arn")

    @property
    @pulumi.getter(name="destinationIp")
    def destination_ip(self) -> str:
        """
        IP address of the AWS resource that is the destination of the path.
        """
        return pulumi.get(self, "destination_ip")

    @property
    @pulumi.getter(name="destinationPort")
    def destination_port(self) -> int:
        """
        Destination port.
        """
        return pulumi.get(self, "destination_port")

    @property
    @pulumi.getter
    def filters(self) -> Optional[Sequence['outputs.GetNetworkInsightsPathFilterResult']]:
        return pulumi.get(self, "filters")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="networkInsightsPathId")
    def network_insights_path_id(self) -> str:
        return pulumi.get(self, "network_insights_path_id")

    @property
    @pulumi.getter
    def protocol(self) -> str:
        """
        Protocol.
        """
        return pulumi.get(self, "protocol")

    @property
    @pulumi.getter
    def source(self) -> str:
        """
        AWS resource that is the source of the path.
        """
        return pulumi.get(self, "source")

    @property
    @pulumi.getter(name="sourceArn")
    def source_arn(self) -> str:
        """
        ARN of the source.
        """
        return pulumi.get(self, "source_arn")

    @property
    @pulumi.getter(name="sourceIp")
    def source_ip(self) -> str:
        """
        IP address of the AWS resource that is the source of the path.
        """
        return pulumi.get(self, "source_ip")

    @property
    @pulumi.getter
    def tags(self) -> Mapping[str, str]:
        """
        Map of tags assigned to the resource.
        """
        return pulumi.get(self, "tags")


class AwaitableGetNetworkInsightsPathResult(GetNetworkInsightsPathResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetNetworkInsightsPathResult(
            arn=self.arn,
            destination=self.destination,
            destination_arn=self.destination_arn,
            destination_ip=self.destination_ip,
            destination_port=self.destination_port,
            filters=self.filters,
            id=self.id,
            network_insights_path_id=self.network_insights_path_id,
            protocol=self.protocol,
            source=self.source,
            source_arn=self.source_arn,
            source_ip=self.source_ip,
            tags=self.tags)


def get_network_insights_path(filters: Optional[Sequence[Union['GetNetworkInsightsPathFilterArgs', 'GetNetworkInsightsPathFilterArgsDict']]] = None,
                              network_insights_path_id: Optional[str] = None,
                              tags: Optional[Mapping[str, str]] = None,
                              opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetNetworkInsightsPathResult:
    """
    `ec2.NetworkInsightsPath` provides details about a specific Network Insights Path.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_aws as aws

    example = aws.ec2.get_network_insights_path(network_insights_path_id=example_aws_ec2_network_insights_path["id"])
    ```


    :param Sequence[Union['GetNetworkInsightsPathFilterArgs', 'GetNetworkInsightsPathFilterArgsDict']] filters: Configuration block(s) for filtering. Detailed below.
    :param str network_insights_path_id: ID of the Network Insights Path to select.
    :param Mapping[str, str] tags: Map of tags assigned to the resource.
    """
    __args__ = dict()
    __args__['filters'] = filters
    __args__['networkInsightsPathId'] = network_insights_path_id
    __args__['tags'] = tags
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('aws:ec2/getNetworkInsightsPath:getNetworkInsightsPath', __args__, opts=opts, typ=GetNetworkInsightsPathResult).value

    return AwaitableGetNetworkInsightsPathResult(
        arn=pulumi.get(__ret__, 'arn'),
        destination=pulumi.get(__ret__, 'destination'),
        destination_arn=pulumi.get(__ret__, 'destination_arn'),
        destination_ip=pulumi.get(__ret__, 'destination_ip'),
        destination_port=pulumi.get(__ret__, 'destination_port'),
        filters=pulumi.get(__ret__, 'filters'),
        id=pulumi.get(__ret__, 'id'),
        network_insights_path_id=pulumi.get(__ret__, 'network_insights_path_id'),
        protocol=pulumi.get(__ret__, 'protocol'),
        source=pulumi.get(__ret__, 'source'),
        source_arn=pulumi.get(__ret__, 'source_arn'),
        source_ip=pulumi.get(__ret__, 'source_ip'),
        tags=pulumi.get(__ret__, 'tags'))


@_utilities.lift_output_func(get_network_insights_path)
def get_network_insights_path_output(filters: Optional[pulumi.Input[Optional[Sequence[Union['GetNetworkInsightsPathFilterArgs', 'GetNetworkInsightsPathFilterArgsDict']]]]] = None,
                                     network_insights_path_id: Optional[pulumi.Input[Optional[str]]] = None,
                                     tags: Optional[pulumi.Input[Optional[Mapping[str, str]]]] = None,
                                     opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetNetworkInsightsPathResult]:
    """
    `ec2.NetworkInsightsPath` provides details about a specific Network Insights Path.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_aws as aws

    example = aws.ec2.get_network_insights_path(network_insights_path_id=example_aws_ec2_network_insights_path["id"])
    ```


    :param Sequence[Union['GetNetworkInsightsPathFilterArgs', 'GetNetworkInsightsPathFilterArgsDict']] filters: Configuration block(s) for filtering. Detailed below.
    :param str network_insights_path_id: ID of the Network Insights Path to select.
    :param Mapping[str, str] tags: Map of tags assigned to the resource.
    """
    ...

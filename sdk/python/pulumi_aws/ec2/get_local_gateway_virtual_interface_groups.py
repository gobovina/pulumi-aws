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
    'GetLocalGatewayVirtualInterfaceGroupsResult',
    'AwaitableGetLocalGatewayVirtualInterfaceGroupsResult',
    'get_local_gateway_virtual_interface_groups',
    'get_local_gateway_virtual_interface_groups_output',
]

@pulumi.output_type
class GetLocalGatewayVirtualInterfaceGroupsResult:
    """
    A collection of values returned by getLocalGatewayVirtualInterfaceGroups.
    """
    def __init__(__self__, filters=None, id=None, ids=None, local_gateway_virtual_interface_ids=None, tags=None):
        if filters and not isinstance(filters, list):
            raise TypeError("Expected argument 'filters' to be a list")
        pulumi.set(__self__, "filters", filters)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ids and not isinstance(ids, list):
            raise TypeError("Expected argument 'ids' to be a list")
        pulumi.set(__self__, "ids", ids)
        if local_gateway_virtual_interface_ids and not isinstance(local_gateway_virtual_interface_ids, list):
            raise TypeError("Expected argument 'local_gateway_virtual_interface_ids' to be a list")
        pulumi.set(__self__, "local_gateway_virtual_interface_ids", local_gateway_virtual_interface_ids)
        if tags and not isinstance(tags, dict):
            raise TypeError("Expected argument 'tags' to be a dict")
        pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter
    def filters(self) -> Optional[Sequence['outputs.GetLocalGatewayVirtualInterfaceGroupsFilterResult']]:
        return pulumi.get(self, "filters")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def ids(self) -> Sequence[str]:
        """
        Set of EC2 Local Gateway Virtual Interface Group identifiers.
        """
        return pulumi.get(self, "ids")

    @property
    @pulumi.getter(name="localGatewayVirtualInterfaceIds")
    def local_gateway_virtual_interface_ids(self) -> Sequence[str]:
        """
        Set of EC2 Local Gateway Virtual Interface identifiers.
        """
        return pulumi.get(self, "local_gateway_virtual_interface_ids")

    @property
    @pulumi.getter
    def tags(self) -> Mapping[str, str]:
        return pulumi.get(self, "tags")


class AwaitableGetLocalGatewayVirtualInterfaceGroupsResult(GetLocalGatewayVirtualInterfaceGroupsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetLocalGatewayVirtualInterfaceGroupsResult(
            filters=self.filters,
            id=self.id,
            ids=self.ids,
            local_gateway_virtual_interface_ids=self.local_gateway_virtual_interface_ids,
            tags=self.tags)


def get_local_gateway_virtual_interface_groups(filters: Optional[Sequence[Union['GetLocalGatewayVirtualInterfaceGroupsFilterArgs', 'GetLocalGatewayVirtualInterfaceGroupsFilterArgsDict']]] = None,
                                               tags: Optional[Mapping[str, str]] = None,
                                               opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetLocalGatewayVirtualInterfaceGroupsResult:
    """
    Provides details about multiple EC2 Local Gateway Virtual Interface Groups, such as identifiers. More information can be found in the [Outposts User Guide](https://docs.aws.amazon.com/outposts/latest/userguide/outposts-networking-components.html#routing).

    ## Example Usage

    ```python
    import pulumi
    import pulumi_aws as aws

    all = aws.ec2.get_local_gateway_virtual_interface_groups()
    ```


    :param Sequence[Union['GetLocalGatewayVirtualInterfaceGroupsFilterArgs', 'GetLocalGatewayVirtualInterfaceGroupsFilterArgsDict']] filters: One or more configuration blocks containing name-values filters. See the [EC2 API Reference](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeLocalGatewayVirtualInterfaceGroups.html) for supported filters. Detailed below.
    :param Mapping[str, str] tags: Key-value map of resource tags, each pair of which must exactly match a pair on the desired local gateway route table.
    """
    __args__ = dict()
    __args__['filters'] = filters
    __args__['tags'] = tags
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('aws:ec2/getLocalGatewayVirtualInterfaceGroups:getLocalGatewayVirtualInterfaceGroups', __args__, opts=opts, typ=GetLocalGatewayVirtualInterfaceGroupsResult).value

    return AwaitableGetLocalGatewayVirtualInterfaceGroupsResult(
        filters=pulumi.get(__ret__, 'filters'),
        id=pulumi.get(__ret__, 'id'),
        ids=pulumi.get(__ret__, 'ids'),
        local_gateway_virtual_interface_ids=pulumi.get(__ret__, 'local_gateway_virtual_interface_ids'),
        tags=pulumi.get(__ret__, 'tags'))


@_utilities.lift_output_func(get_local_gateway_virtual_interface_groups)
def get_local_gateway_virtual_interface_groups_output(filters: Optional[pulumi.Input[Optional[Sequence[Union['GetLocalGatewayVirtualInterfaceGroupsFilterArgs', 'GetLocalGatewayVirtualInterfaceGroupsFilterArgsDict']]]]] = None,
                                                      tags: Optional[pulumi.Input[Optional[Mapping[str, str]]]] = None,
                                                      opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetLocalGatewayVirtualInterfaceGroupsResult]:
    """
    Provides details about multiple EC2 Local Gateway Virtual Interface Groups, such as identifiers. More information can be found in the [Outposts User Guide](https://docs.aws.amazon.com/outposts/latest/userguide/outposts-networking-components.html#routing).

    ## Example Usage

    ```python
    import pulumi
    import pulumi_aws as aws

    all = aws.ec2.get_local_gateway_virtual_interface_groups()
    ```


    :param Sequence[Union['GetLocalGatewayVirtualInterfaceGroupsFilterArgs', 'GetLocalGatewayVirtualInterfaceGroupsFilterArgsDict']] filters: One or more configuration blocks containing name-values filters. See the [EC2 API Reference](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeLocalGatewayVirtualInterfaceGroups.html) for supported filters. Detailed below.
    :param Mapping[str, str] tags: Key-value map of resource tags, each pair of which must exactly match a pair on the desired local gateway route table.
    """
    ...

# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities
from . import outputs
from ._inputs import *

__all__ = [
    'GetPrefixListResult',
    'AwaitableGetPrefixListResult',
    'get_prefix_list',
    'get_prefix_list_output',
]

@pulumi.output_type
class GetPrefixListResult:
    """
    A collection of values returned by getPrefixList.
    """
    def __init__(__self__, cidr_blocks=None, filters=None, id=None, name=None, prefix_list_id=None):
        if cidr_blocks and not isinstance(cidr_blocks, list):
            raise TypeError("Expected argument 'cidr_blocks' to be a list")
        pulumi.set(__self__, "cidr_blocks", cidr_blocks)
        if filters and not isinstance(filters, list):
            raise TypeError("Expected argument 'filters' to be a list")
        pulumi.set(__self__, "filters", filters)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if prefix_list_id and not isinstance(prefix_list_id, str):
            raise TypeError("Expected argument 'prefix_list_id' to be a str")
        pulumi.set(__self__, "prefix_list_id", prefix_list_id)

    @property
    @pulumi.getter(name="cidrBlocks")
    def cidr_blocks(self) -> Sequence[str]:
        """
        The list of CIDR blocks for the AWS service associated with the prefix list.
        """
        return pulumi.get(self, "cidr_blocks")

    @property
    @pulumi.getter
    def filters(self) -> Optional[Sequence['outputs.GetPrefixListFilterResult']]:
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
    def name(self) -> str:
        """
        The name of the selected prefix list.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="prefixListId")
    def prefix_list_id(self) -> Optional[str]:
        return pulumi.get(self, "prefix_list_id")


class AwaitableGetPrefixListResult(GetPrefixListResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetPrefixListResult(
            cidr_blocks=self.cidr_blocks,
            filters=self.filters,
            id=self.id,
            name=self.name,
            prefix_list_id=self.prefix_list_id)


def get_prefix_list(filters: Optional[Sequence[pulumi.InputType['GetPrefixListFilterArgs']]] = None,
                    name: Optional[str] = None,
                    prefix_list_id: Optional[str] = None,
                    opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetPrefixListResult:
    """
    Use this data source to access information about an existing resource.

    :param Sequence[pulumi.InputType['GetPrefixListFilterArgs']] filters: Configuration block(s) for filtering. Detailed below.
    :param str name: The name of the filter field. Valid values can be found in the [EC2 DescribePrefixLists API Reference](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribePrefixLists.html).
    :param str prefix_list_id: The ID of the prefix list to select.
    """
    __args__ = dict()
    __args__['filters'] = filters
    __args__['name'] = name
    __args__['prefixListId'] = prefix_list_id
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = _utilities.get_version()
    __ret__ = pulumi.runtime.invoke('aws:ec2/getPrefixList:getPrefixList', __args__, opts=opts, typ=GetPrefixListResult).value

    return AwaitableGetPrefixListResult(
        cidr_blocks=__ret__.cidr_blocks,
        filters=__ret__.filters,
        id=__ret__.id,
        name=__ret__.name,
        prefix_list_id=__ret__.prefix_list_id)


@_utilities.lift_output_func(get_prefix_list)
def get_prefix_list_output(filters: Optional[pulumi.Input[Optional[Sequence[pulumi.InputType['GetPrefixListFilterArgs']]]]] = None,
                           name: Optional[pulumi.Input[Optional[str]]] = None,
                           prefix_list_id: Optional[pulumi.Input[Optional[str]]] = None,
                           opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetPrefixListResult]:
    """
    Use this data source to access information about an existing resource.

    :param Sequence[pulumi.InputType['GetPrefixListFilterArgs']] filters: Configuration block(s) for filtering. Detailed below.
    :param str name: The name of the filter field. Valid values can be found in the [EC2 DescribePrefixLists API Reference](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribePrefixLists.html).
    :param str prefix_list_id: The ID of the prefix list to select.
    """
    ...

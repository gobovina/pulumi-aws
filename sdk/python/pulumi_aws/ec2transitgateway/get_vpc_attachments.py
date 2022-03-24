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
    'GetVpcAttachmentsResult',
    'AwaitableGetVpcAttachmentsResult',
    'get_vpc_attachments',
    'get_vpc_attachments_output',
]

@pulumi.output_type
class GetVpcAttachmentsResult:
    """
    A collection of values returned by getVpcAttachments.
    """
    def __init__(__self__, filters=None, id=None, ids=None):
        if filters and not isinstance(filters, list):
            raise TypeError("Expected argument 'filters' to be a list")
        pulumi.set(__self__, "filters", filters)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ids and not isinstance(ids, list):
            raise TypeError("Expected argument 'ids' to be a list")
        pulumi.set(__self__, "ids", ids)

    @property
    @pulumi.getter
    def filters(self) -> Optional[Sequence['outputs.GetVpcAttachmentsFilterResult']]:
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
        return pulumi.get(self, "ids")


class AwaitableGetVpcAttachmentsResult(GetVpcAttachmentsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetVpcAttachmentsResult(
            filters=self.filters,
            id=self.id,
            ids=self.ids)


def get_vpc_attachments(filters: Optional[Sequence[pulumi.InputType['GetVpcAttachmentsFilterArgs']]] = None,
                        opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetVpcAttachmentsResult:
    """
    Get information on EC2 Transit Gateway VPC Attachments.

    ## Example Usage


    :param Sequence[pulumi.InputType['GetVpcAttachmentsFilterArgs']] filters: One or more configuration blocks containing name-values filters. Detailed below.
    """
    __args__ = dict()
    __args__['filters'] = filters
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = _utilities.get_version()
    __ret__ = pulumi.runtime.invoke('aws:ec2transitgateway/getVpcAttachments:getVpcAttachments', __args__, opts=opts, typ=GetVpcAttachmentsResult).value

    return AwaitableGetVpcAttachmentsResult(
        filters=__ret__.filters,
        id=__ret__.id,
        ids=__ret__.ids)


@_utilities.lift_output_func(get_vpc_attachments)
def get_vpc_attachments_output(filters: Optional[pulumi.Input[Optional[Sequence[pulumi.InputType['GetVpcAttachmentsFilterArgs']]]]] = None,
                               opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetVpcAttachmentsResult]:
    """
    Get information on EC2 Transit Gateway VPC Attachments.

    ## Example Usage


    :param Sequence[pulumi.InputType['GetVpcAttachmentsFilterArgs']] filters: One or more configuration blocks containing name-values filters. Detailed below.
    """
    ...

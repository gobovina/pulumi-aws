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
from ._inputs import *

__all__ = [
    'GetInternetGatewayResult',
    'AwaitableGetInternetGatewayResult',
    'get_internet_gateway',
    'get_internet_gateway_output',
]

@pulumi.output_type
class GetInternetGatewayResult:
    """
    A collection of values returned by getInternetGateway.
    """
    def __init__(__self__, arn=None, attachments=None, filters=None, id=None, internet_gateway_id=None, owner_id=None, tags=None):
        if arn and not isinstance(arn, str):
            raise TypeError("Expected argument 'arn' to be a str")
        pulumi.set(__self__, "arn", arn)
        if attachments and not isinstance(attachments, list):
            raise TypeError("Expected argument 'attachments' to be a list")
        pulumi.set(__self__, "attachments", attachments)
        if filters and not isinstance(filters, list):
            raise TypeError("Expected argument 'filters' to be a list")
        pulumi.set(__self__, "filters", filters)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if internet_gateway_id and not isinstance(internet_gateway_id, str):
            raise TypeError("Expected argument 'internet_gateway_id' to be a str")
        pulumi.set(__self__, "internet_gateway_id", internet_gateway_id)
        if owner_id and not isinstance(owner_id, str):
            raise TypeError("Expected argument 'owner_id' to be a str")
        pulumi.set(__self__, "owner_id", owner_id)
        if tags and not isinstance(tags, dict):
            raise TypeError("Expected argument 'tags' to be a dict")
        pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter
    def arn(self) -> str:
        """
        ARN of the Internet Gateway.
        """
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter
    def attachments(self) -> Sequence['outputs.GetInternetGatewayAttachmentResult']:
        return pulumi.get(self, "attachments")

    @property
    @pulumi.getter
    def filters(self) -> Optional[Sequence['outputs.GetInternetGatewayFilterResult']]:
        return pulumi.get(self, "filters")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="internetGatewayId")
    def internet_gateway_id(self) -> str:
        return pulumi.get(self, "internet_gateway_id")

    @property
    @pulumi.getter(name="ownerId")
    def owner_id(self) -> str:
        """
        ID of the AWS account that owns the internet gateway.
        """
        return pulumi.get(self, "owner_id")

    @property
    @pulumi.getter
    def tags(self) -> Mapping[str, str]:
        return pulumi.get(self, "tags")


class AwaitableGetInternetGatewayResult(GetInternetGatewayResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetInternetGatewayResult(
            arn=self.arn,
            attachments=self.attachments,
            filters=self.filters,
            id=self.id,
            internet_gateway_id=self.internet_gateway_id,
            owner_id=self.owner_id,
            tags=self.tags)


def get_internet_gateway(filters: Optional[Sequence[pulumi.InputType['GetInternetGatewayFilterArgs']]] = None,
                         internet_gateway_id: Optional[str] = None,
                         tags: Optional[Mapping[str, str]] = None,
                         opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetInternetGatewayResult:
    """
    `ec2.InternetGateway` provides details about a specific Internet Gateway.

    ## Example Usage

    <!--Start PulumiCodeChooser -->
    ```python
    import pulumi
    import pulumi_aws as aws

    config = pulumi.Config()
    vpc_id = config.require_object("vpcId")
    default = aws.ec2.get_internet_gateway(filters=[aws.ec2.GetInternetGatewayFilterArgs(
        name="attachment.vpc-id",
        values=[vpc_id],
    )])
    ```
    <!--End PulumiCodeChooser -->


    :param Sequence[pulumi.InputType['GetInternetGatewayFilterArgs']] filters: Custom filter block as described below.
           
           More complex filters can be expressed using one or more `filter` sub-blocks,
           which take the following arguments:
    :param str internet_gateway_id: ID of the specific Internet Gateway to retrieve.
    :param Mapping[str, str] tags: Map of tags, each pair of which must exactly match
           a pair on the desired Internet Gateway.
    """
    __args__ = dict()
    __args__['filters'] = filters
    __args__['internetGatewayId'] = internet_gateway_id
    __args__['tags'] = tags
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('aws:ec2/getInternetGateway:getInternetGateway', __args__, opts=opts, typ=GetInternetGatewayResult).value

    return AwaitableGetInternetGatewayResult(
        arn=pulumi.get(__ret__, 'arn'),
        attachments=pulumi.get(__ret__, 'attachments'),
        filters=pulumi.get(__ret__, 'filters'),
        id=pulumi.get(__ret__, 'id'),
        internet_gateway_id=pulumi.get(__ret__, 'internet_gateway_id'),
        owner_id=pulumi.get(__ret__, 'owner_id'),
        tags=pulumi.get(__ret__, 'tags'))


@_utilities.lift_output_func(get_internet_gateway)
def get_internet_gateway_output(filters: Optional[pulumi.Input[Optional[Sequence[pulumi.InputType['GetInternetGatewayFilterArgs']]]]] = None,
                                internet_gateway_id: Optional[pulumi.Input[Optional[str]]] = None,
                                tags: Optional[pulumi.Input[Optional[Mapping[str, str]]]] = None,
                                opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetInternetGatewayResult]:
    """
    `ec2.InternetGateway` provides details about a specific Internet Gateway.

    ## Example Usage

    <!--Start PulumiCodeChooser -->
    ```python
    import pulumi
    import pulumi_aws as aws

    config = pulumi.Config()
    vpc_id = config.require_object("vpcId")
    default = aws.ec2.get_internet_gateway(filters=[aws.ec2.GetInternetGatewayFilterArgs(
        name="attachment.vpc-id",
        values=[vpc_id],
    )])
    ```
    <!--End PulumiCodeChooser -->


    :param Sequence[pulumi.InputType['GetInternetGatewayFilterArgs']] filters: Custom filter block as described below.
           
           More complex filters can be expressed using one or more `filter` sub-blocks,
           which take the following arguments:
    :param str internet_gateway_id: ID of the specific Internet Gateway to retrieve.
    :param Mapping[str, str] tags: Map of tags, each pair of which must exactly match
           a pair on the desired Internet Gateway.
    """
    ...

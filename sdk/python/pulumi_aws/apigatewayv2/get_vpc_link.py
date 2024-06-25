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

__all__ = [
    'GetVpcLinkResult',
    'AwaitableGetVpcLinkResult',
    'get_vpc_link',
    'get_vpc_link_output',
]

@pulumi.output_type
class GetVpcLinkResult:
    """
    A collection of values returned by getVpcLink.
    """
    def __init__(__self__, arn=None, id=None, name=None, security_group_ids=None, subnet_ids=None, tags=None, vpc_link_id=None):
        if arn and not isinstance(arn, str):
            raise TypeError("Expected argument 'arn' to be a str")
        pulumi.set(__self__, "arn", arn)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if security_group_ids and not isinstance(security_group_ids, list):
            raise TypeError("Expected argument 'security_group_ids' to be a list")
        pulumi.set(__self__, "security_group_ids", security_group_ids)
        if subnet_ids and not isinstance(subnet_ids, list):
            raise TypeError("Expected argument 'subnet_ids' to be a list")
        pulumi.set(__self__, "subnet_ids", subnet_ids)
        if tags and not isinstance(tags, dict):
            raise TypeError("Expected argument 'tags' to be a dict")
        pulumi.set(__self__, "tags", tags)
        if vpc_link_id and not isinstance(vpc_link_id, str):
            raise TypeError("Expected argument 'vpc_link_id' to be a str")
        pulumi.set(__self__, "vpc_link_id", vpc_link_id)

    @property
    @pulumi.getter
    def arn(self) -> str:
        """
        ARN of the VPC Link.
        """
        return pulumi.get(self, "arn")

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
        VPC Link Name.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="securityGroupIds")
    def security_group_ids(self) -> Sequence[str]:
        """
        List of security groups associated with the VPC Link.
        """
        return pulumi.get(self, "security_group_ids")

    @property
    @pulumi.getter(name="subnetIds")
    def subnet_ids(self) -> Sequence[str]:
        """
        List of subnets attached to the VPC Link.
        """
        return pulumi.get(self, "subnet_ids")

    @property
    @pulumi.getter
    def tags(self) -> Mapping[str, str]:
        """
        VPC Link Tags.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter(name="vpcLinkId")
    def vpc_link_id(self) -> str:
        return pulumi.get(self, "vpc_link_id")


class AwaitableGetVpcLinkResult(GetVpcLinkResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetVpcLinkResult(
            arn=self.arn,
            id=self.id,
            name=self.name,
            security_group_ids=self.security_group_ids,
            subnet_ids=self.subnet_ids,
            tags=self.tags,
            vpc_link_id=self.vpc_link_id)


def get_vpc_link(tags: Optional[Mapping[str, str]] = None,
                 vpc_link_id: Optional[str] = None,
                 opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetVpcLinkResult:
    """
    Data source for managing an AWS API Gateway V2 VPC Link.

    ## Example Usage

    ### Basic Usage

    ```python
    import pulumi
    import pulumi_aws as aws

    example = aws.apigatewayv2.get_vpc_link(vpc_link_id="example")
    ```


    :param Mapping[str, str] tags: VPC Link Tags.
    :param str vpc_link_id: VPC Link ID
    """
    __args__ = dict()
    __args__['tags'] = tags
    __args__['vpcLinkId'] = vpc_link_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('aws:apigatewayv2/getVpcLink:getVpcLink', __args__, opts=opts, typ=GetVpcLinkResult).value

    return AwaitableGetVpcLinkResult(
        arn=pulumi.get(__ret__, 'arn'),
        id=pulumi.get(__ret__, 'id'),
        name=pulumi.get(__ret__, 'name'),
        security_group_ids=pulumi.get(__ret__, 'security_group_ids'),
        subnet_ids=pulumi.get(__ret__, 'subnet_ids'),
        tags=pulumi.get(__ret__, 'tags'),
        vpc_link_id=pulumi.get(__ret__, 'vpc_link_id'))


@_utilities.lift_output_func(get_vpc_link)
def get_vpc_link_output(tags: Optional[pulumi.Input[Optional[Mapping[str, str]]]] = None,
                        vpc_link_id: Optional[pulumi.Input[str]] = None,
                        opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetVpcLinkResult]:
    """
    Data source for managing an AWS API Gateway V2 VPC Link.

    ## Example Usage

    ### Basic Usage

    ```python
    import pulumi
    import pulumi_aws as aws

    example = aws.apigatewayv2.get_vpc_link(vpc_link_id="example")
    ```


    :param Mapping[str, str] tags: VPC Link Tags.
    :param str vpc_link_id: VPC Link ID
    """
    ...

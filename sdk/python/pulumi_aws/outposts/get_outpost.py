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
    'GetOutpostResult',
    'AwaitableGetOutpostResult',
    'get_outpost',
    'get_outpost_output',
]

@pulumi.output_type
class GetOutpostResult:
    """
    A collection of values returned by getOutpost.
    """
    def __init__(__self__, arn=None, availability_zone=None, availability_zone_id=None, description=None, id=None, lifecycle_status=None, name=None, owner_id=None, site_arn=None, site_id=None, supported_hardware_type=None, tags=None):
        if arn and not isinstance(arn, str):
            raise TypeError("Expected argument 'arn' to be a str")
        pulumi.set(__self__, "arn", arn)
        if availability_zone and not isinstance(availability_zone, str):
            raise TypeError("Expected argument 'availability_zone' to be a str")
        pulumi.set(__self__, "availability_zone", availability_zone)
        if availability_zone_id and not isinstance(availability_zone_id, str):
            raise TypeError("Expected argument 'availability_zone_id' to be a str")
        pulumi.set(__self__, "availability_zone_id", availability_zone_id)
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if lifecycle_status and not isinstance(lifecycle_status, str):
            raise TypeError("Expected argument 'lifecycle_status' to be a str")
        pulumi.set(__self__, "lifecycle_status", lifecycle_status)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if owner_id and not isinstance(owner_id, str):
            raise TypeError("Expected argument 'owner_id' to be a str")
        pulumi.set(__self__, "owner_id", owner_id)
        if site_arn and not isinstance(site_arn, str):
            raise TypeError("Expected argument 'site_arn' to be a str")
        pulumi.set(__self__, "site_arn", site_arn)
        if site_id and not isinstance(site_id, str):
            raise TypeError("Expected argument 'site_id' to be a str")
        pulumi.set(__self__, "site_id", site_id)
        if supported_hardware_type and not isinstance(supported_hardware_type, str):
            raise TypeError("Expected argument 'supported_hardware_type' to be a str")
        pulumi.set(__self__, "supported_hardware_type", supported_hardware_type)
        if tags and not isinstance(tags, dict):
            raise TypeError("Expected argument 'tags' to be a dict")
        pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter
    def arn(self) -> str:
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter(name="availabilityZone")
    def availability_zone(self) -> str:
        """
        Availability Zone name.
        """
        return pulumi.get(self, "availability_zone")

    @property
    @pulumi.getter(name="availabilityZoneId")
    def availability_zone_id(self) -> str:
        """
        Availability Zone identifier.
        """
        return pulumi.get(self, "availability_zone_id")

    @property
    @pulumi.getter
    def description(self) -> str:
        """
        The description of the Outpost.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def id(self) -> str:
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="lifecycleStatus")
    def lifecycle_status(self) -> str:
        """
        The life cycle status.
        """
        return pulumi.get(self, "lifecycle_status")

    @property
    @pulumi.getter
    def name(self) -> str:
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="ownerId")
    def owner_id(self) -> Optional[str]:
        return pulumi.get(self, "owner_id")

    @property
    @pulumi.getter(name="siteArn")
    def site_arn(self) -> str:
        """
        The Amazon Resource Name (ARN) of the site.
        """
        return pulumi.get(self, "site_arn")

    @property
    @pulumi.getter(name="siteId")
    def site_id(self) -> str:
        """
        The ID of the site.
        """
        return pulumi.get(self, "site_id")

    @property
    @pulumi.getter(name="supportedHardwareType")
    def supported_hardware_type(self) -> str:
        """
        The hardware type.
        """
        return pulumi.get(self, "supported_hardware_type")

    @property
    @pulumi.getter
    def tags(self) -> Mapping[str, str]:
        """
        The Outpost tags.
        """
        return pulumi.get(self, "tags")


class AwaitableGetOutpostResult(GetOutpostResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetOutpostResult(
            arn=self.arn,
            availability_zone=self.availability_zone,
            availability_zone_id=self.availability_zone_id,
            description=self.description,
            id=self.id,
            lifecycle_status=self.lifecycle_status,
            name=self.name,
            owner_id=self.owner_id,
            site_arn=self.site_arn,
            site_id=self.site_id,
            supported_hardware_type=self.supported_hardware_type,
            tags=self.tags)


def get_outpost(arn: Optional[str] = None,
                id: Optional[str] = None,
                name: Optional[str] = None,
                owner_id: Optional[str] = None,
                tags: Optional[Mapping[str, str]] = None,
                opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetOutpostResult:
    """
    Provides details about an Outposts Outpost.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_aws as aws

    example = aws.outposts.get_outpost(name="example")
    ```


    :param str arn: ARN.
    :param str id: Identifier of the Outpost.
    :param str name: Name of the Outpost.
    :param str owner_id: AWS Account identifier of the Outpost owner.
    :param Mapping[str, str] tags: The Outpost tags.
    """
    __args__ = dict()
    __args__['arn'] = arn
    __args__['id'] = id
    __args__['name'] = name
    __args__['ownerId'] = owner_id
    __args__['tags'] = tags
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('aws:outposts/getOutpost:getOutpost', __args__, opts=opts, typ=GetOutpostResult).value

    return AwaitableGetOutpostResult(
        arn=pulumi.get(__ret__, 'arn'),
        availability_zone=pulumi.get(__ret__, 'availability_zone'),
        availability_zone_id=pulumi.get(__ret__, 'availability_zone_id'),
        description=pulumi.get(__ret__, 'description'),
        id=pulumi.get(__ret__, 'id'),
        lifecycle_status=pulumi.get(__ret__, 'lifecycle_status'),
        name=pulumi.get(__ret__, 'name'),
        owner_id=pulumi.get(__ret__, 'owner_id'),
        site_arn=pulumi.get(__ret__, 'site_arn'),
        site_id=pulumi.get(__ret__, 'site_id'),
        supported_hardware_type=pulumi.get(__ret__, 'supported_hardware_type'),
        tags=pulumi.get(__ret__, 'tags'))


@_utilities.lift_output_func(get_outpost)
def get_outpost_output(arn: Optional[pulumi.Input[Optional[str]]] = None,
                       id: Optional[pulumi.Input[Optional[str]]] = None,
                       name: Optional[pulumi.Input[Optional[str]]] = None,
                       owner_id: Optional[pulumi.Input[Optional[str]]] = None,
                       tags: Optional[pulumi.Input[Optional[Mapping[str, str]]]] = None,
                       opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetOutpostResult]:
    """
    Provides details about an Outposts Outpost.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_aws as aws

    example = aws.outposts.get_outpost(name="example")
    ```


    :param str arn: ARN.
    :param str id: Identifier of the Outpost.
    :param str name: Name of the Outpost.
    :param str owner_id: AWS Account identifier of the Outpost owner.
    :param Mapping[str, str] tags: The Outpost tags.
    """
    ...

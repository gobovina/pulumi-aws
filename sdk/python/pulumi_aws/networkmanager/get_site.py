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
    'GetSiteResult',
    'AwaitableGetSiteResult',
    'get_site',
    'get_site_output',
]

@pulumi.output_type
class GetSiteResult:
    """
    A collection of values returned by getSite.
    """
    def __init__(__self__, arn=None, description=None, global_network_id=None, id=None, locations=None, site_id=None, tags=None):
        if arn and not isinstance(arn, str):
            raise TypeError("Expected argument 'arn' to be a str")
        pulumi.set(__self__, "arn", arn)
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if global_network_id and not isinstance(global_network_id, str):
            raise TypeError("Expected argument 'global_network_id' to be a str")
        pulumi.set(__self__, "global_network_id", global_network_id)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if locations and not isinstance(locations, list):
            raise TypeError("Expected argument 'locations' to be a list")
        pulumi.set(__self__, "locations", locations)
        if site_id and not isinstance(site_id, str):
            raise TypeError("Expected argument 'site_id' to be a str")
        pulumi.set(__self__, "site_id", site_id)
        if tags and not isinstance(tags, dict):
            raise TypeError("Expected argument 'tags' to be a dict")
        pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter
    def arn(self) -> str:
        """
        The ARN of the site.
        """
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter
    def description(self) -> str:
        """
        The description of the site.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="globalNetworkId")
    def global_network_id(self) -> str:
        return pulumi.get(self, "global_network_id")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def locations(self) -> Sequence['outputs.GetSiteLocationResult']:
        """
        The site location as documented below.
        """
        return pulumi.get(self, "locations")

    @property
    @pulumi.getter(name="siteId")
    def site_id(self) -> str:
        return pulumi.get(self, "site_id")

    @property
    @pulumi.getter
    def tags(self) -> Mapping[str, str]:
        """
        Key-value tags for the Site.
        """
        return pulumi.get(self, "tags")


class AwaitableGetSiteResult(GetSiteResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetSiteResult(
            arn=self.arn,
            description=self.description,
            global_network_id=self.global_network_id,
            id=self.id,
            locations=self.locations,
            site_id=self.site_id,
            tags=self.tags)


def get_site(global_network_id: Optional[str] = None,
             site_id: Optional[str] = None,
             tags: Optional[Mapping[str, str]] = None,
             opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetSiteResult:
    """
    Retrieve information about a site.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_aws as aws

    example = aws.networkmanager.get_site(global_network_id=var["global_network_id"],
        site_id=var["site_id"])
    ```


    :param str global_network_id: The ID of the Global Network of the site to retrieve.
    :param str site_id: The id of the specific site to retrieve.
    :param Mapping[str, str] tags: Key-value tags for the Site.
    """
    __args__ = dict()
    __args__['globalNetworkId'] = global_network_id
    __args__['siteId'] = site_id
    __args__['tags'] = tags
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = _utilities.get_version()
    __ret__ = pulumi.runtime.invoke('aws:networkmanager/getSite:getSite', __args__, opts=opts, typ=GetSiteResult).value

    return AwaitableGetSiteResult(
        arn=__ret__.arn,
        description=__ret__.description,
        global_network_id=__ret__.global_network_id,
        id=__ret__.id,
        locations=__ret__.locations,
        site_id=__ret__.site_id,
        tags=__ret__.tags)


@_utilities.lift_output_func(get_site)
def get_site_output(global_network_id: Optional[pulumi.Input[str]] = None,
                    site_id: Optional[pulumi.Input[str]] = None,
                    tags: Optional[pulumi.Input[Optional[Mapping[str, str]]]] = None,
                    opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetSiteResult]:
    """
    Retrieve information about a site.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_aws as aws

    example = aws.networkmanager.get_site(global_network_id=var["global_network_id"],
        site_id=var["site_id"])
    ```


    :param str global_network_id: The ID of the Global Network of the site to retrieve.
    :param str site_id: The id of the specific site to retrieve.
    :param Mapping[str, str] tags: Key-value tags for the Site.
    """
    ...

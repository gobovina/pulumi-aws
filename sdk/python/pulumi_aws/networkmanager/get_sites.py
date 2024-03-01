# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = [
    'GetSitesResult',
    'AwaitableGetSitesResult',
    'get_sites',
    'get_sites_output',
]

@pulumi.output_type
class GetSitesResult:
    """
    A collection of values returned by getSites.
    """
    def __init__(__self__, global_network_id=None, id=None, ids=None, tags=None):
        if global_network_id and not isinstance(global_network_id, str):
            raise TypeError("Expected argument 'global_network_id' to be a str")
        pulumi.set(__self__, "global_network_id", global_network_id)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ids and not isinstance(ids, list):
            raise TypeError("Expected argument 'ids' to be a list")
        pulumi.set(__self__, "ids", ids)
        if tags and not isinstance(tags, dict):
            raise TypeError("Expected argument 'tags' to be a dict")
        pulumi.set(__self__, "tags", tags)

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
    def ids(self) -> Sequence[str]:
        """
        IDs of the sites.
        """
        return pulumi.get(self, "ids")

    @property
    @pulumi.getter
    def tags(self) -> Optional[Mapping[str, str]]:
        return pulumi.get(self, "tags")


class AwaitableGetSitesResult(GetSitesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetSitesResult(
            global_network_id=self.global_network_id,
            id=self.id,
            ids=self.ids,
            tags=self.tags)


def get_sites(global_network_id: Optional[str] = None,
              tags: Optional[Mapping[str, str]] = None,
              opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetSitesResult:
    """
    Retrieve information about sites.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_aws as aws

    example = aws.networkmanager.get_sites(global_network_id=global_network_id,
        tags={
            "Env": "test",
        })
    ```


    :param str global_network_id: ID of the Global Network of the sites to retrieve.
    :param Mapping[str, str] tags: Restricts the list to the sites with these tags.
    """
    __args__ = dict()
    __args__['globalNetworkId'] = global_network_id
    __args__['tags'] = tags
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('aws:networkmanager/getSites:getSites', __args__, opts=opts, typ=GetSitesResult).value

    return AwaitableGetSitesResult(
        global_network_id=pulumi.get(__ret__, 'global_network_id'),
        id=pulumi.get(__ret__, 'id'),
        ids=pulumi.get(__ret__, 'ids'),
        tags=pulumi.get(__ret__, 'tags'))


@_utilities.lift_output_func(get_sites)
def get_sites_output(global_network_id: Optional[pulumi.Input[str]] = None,
                     tags: Optional[pulumi.Input[Optional[Mapping[str, str]]]] = None,
                     opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetSitesResult]:
    """
    Retrieve information about sites.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_aws as aws

    example = aws.networkmanager.get_sites(global_network_id=global_network_id,
        tags={
            "Env": "test",
        })
    ```


    :param str global_network_id: ID of the Global Network of the sites to retrieve.
    :param Mapping[str, str] tags: Restricts the list to the sites with these tags.
    """
    ...

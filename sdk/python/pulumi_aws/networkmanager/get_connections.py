# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = [
    'GetConnectionsResult',
    'AwaitableGetConnectionsResult',
    'get_connections',
    'get_connections_output',
]

@pulumi.output_type
class GetConnectionsResult:
    """
    A collection of values returned by getConnections.
    """
    def __init__(__self__, device_id=None, global_network_id=None, id=None, ids=None, tags=None):
        if device_id and not isinstance(device_id, str):
            raise TypeError("Expected argument 'device_id' to be a str")
        pulumi.set(__self__, "device_id", device_id)
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
    @pulumi.getter(name="deviceId")
    def device_id(self) -> Optional[str]:
        return pulumi.get(self, "device_id")

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
        The IDs of the connections.
        """
        return pulumi.get(self, "ids")

    @property
    @pulumi.getter
    def tags(self) -> Optional[Mapping[str, str]]:
        return pulumi.get(self, "tags")


class AwaitableGetConnectionsResult(GetConnectionsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetConnectionsResult(
            device_id=self.device_id,
            global_network_id=self.global_network_id,
            id=self.id,
            ids=self.ids,
            tags=self.tags)


def get_connections(device_id: Optional[str] = None,
                    global_network_id: Optional[str] = None,
                    tags: Optional[Mapping[str, str]] = None,
                    opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetConnectionsResult:
    """
    Retrieve information about connections.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_aws as aws

    example = aws.networkmanager.get_connections(global_network_id=var["global_network_id"],
        tags={
            "Env": "test",
        })
    ```


    :param str device_id: The ID of the device of the connections to retrieve.
    :param str global_network_id: The ID of the Global Network of the connections to retrieve.
    :param Mapping[str, str] tags: Restricts the list to the connections with these tags.
    """
    __args__ = dict()
    __args__['deviceId'] = device_id
    __args__['globalNetworkId'] = global_network_id
    __args__['tags'] = tags
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = _utilities.get_version()
    __ret__ = pulumi.runtime.invoke('aws:networkmanager/getConnections:getConnections', __args__, opts=opts, typ=GetConnectionsResult).value

    return AwaitableGetConnectionsResult(
        device_id=__ret__.device_id,
        global_network_id=__ret__.global_network_id,
        id=__ret__.id,
        ids=__ret__.ids,
        tags=__ret__.tags)


@_utilities.lift_output_func(get_connections)
def get_connections_output(device_id: Optional[pulumi.Input[Optional[str]]] = None,
                           global_network_id: Optional[pulumi.Input[str]] = None,
                           tags: Optional[pulumi.Input[Optional[Mapping[str, str]]]] = None,
                           opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetConnectionsResult]:
    """
    Retrieve information about connections.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_aws as aws

    example = aws.networkmanager.get_connections(global_network_id=var["global_network_id"],
        tags={
            "Env": "test",
        })
    ```


    :param str device_id: The ID of the device of the connections to retrieve.
    :param str global_network_id: The ID of the Global Network of the connections to retrieve.
    :param Mapping[str, str] tags: Restricts the list to the connections with these tags.
    """
    ...

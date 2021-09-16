# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = [
    'GetPermissionSetResult',
    'AwaitableGetPermissionSetResult',
    'get_permission_set',
    'get_permission_set_output',
]

@pulumi.output_type
class GetPermissionSetResult:
    """
    A collection of values returned by getPermissionSet.
    """
    def __init__(__self__, arn=None, created_date=None, description=None, id=None, instance_arn=None, name=None, relay_state=None, session_duration=None, tags=None):
        if arn and not isinstance(arn, str):
            raise TypeError("Expected argument 'arn' to be a str")
        pulumi.set(__self__, "arn", arn)
        if created_date and not isinstance(created_date, str):
            raise TypeError("Expected argument 'created_date' to be a str")
        pulumi.set(__self__, "created_date", created_date)
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if instance_arn and not isinstance(instance_arn, str):
            raise TypeError("Expected argument 'instance_arn' to be a str")
        pulumi.set(__self__, "instance_arn", instance_arn)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if relay_state and not isinstance(relay_state, str):
            raise TypeError("Expected argument 'relay_state' to be a str")
        pulumi.set(__self__, "relay_state", relay_state)
        if session_duration and not isinstance(session_duration, str):
            raise TypeError("Expected argument 'session_duration' to be a str")
        pulumi.set(__self__, "session_duration", session_duration)
        if tags and not isinstance(tags, dict):
            raise TypeError("Expected argument 'tags' to be a dict")
        pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter
    def arn(self) -> str:
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter(name="createdDate")
    def created_date(self) -> str:
        return pulumi.get(self, "created_date")

    @property
    @pulumi.getter
    def description(self) -> str:
        """
        The description of the Permission Set.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="instanceArn")
    def instance_arn(self) -> str:
        return pulumi.get(self, "instance_arn")

    @property
    @pulumi.getter
    def name(self) -> str:
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="relayState")
    def relay_state(self) -> str:
        """
        The relay state URL used to redirect users within the application during the federation authentication process.
        """
        return pulumi.get(self, "relay_state")

    @property
    @pulumi.getter(name="sessionDuration")
    def session_duration(self) -> str:
        """
        The length of time that the application user sessions are valid in the ISO-8601 standard.
        """
        return pulumi.get(self, "session_duration")

    @property
    @pulumi.getter
    def tags(self) -> Mapping[str, str]:
        """
        Key-value map of resource tags.
        """
        return pulumi.get(self, "tags")


class AwaitableGetPermissionSetResult(GetPermissionSetResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetPermissionSetResult(
            arn=self.arn,
            created_date=self.created_date,
            description=self.description,
            id=self.id,
            instance_arn=self.instance_arn,
            name=self.name,
            relay_state=self.relay_state,
            session_duration=self.session_duration,
            tags=self.tags)


def get_permission_set(arn: Optional[str] = None,
                       instance_arn: Optional[str] = None,
                       name: Optional[str] = None,
                       tags: Optional[Mapping[str, str]] = None,
                       opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetPermissionSetResult:
    """
    Use this data source to get a Single Sign-On (SSO) Permission Set.


    :param str arn: The Amazon Resource Name (ARN) of the permission set.
    :param str instance_arn: The Amazon Resource Name (ARN) of the SSO Instance associated with the permission set.
    :param str name: The name of the SSO Permission Set.
    :param Mapping[str, str] tags: Key-value map of resource tags.
    """
    __args__ = dict()
    __args__['arn'] = arn
    __args__['instanceArn'] = instance_arn
    __args__['name'] = name
    __args__['tags'] = tags
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = _utilities.get_version()
    __ret__ = pulumi.runtime.invoke('aws:ssoadmin/getPermissionSet:getPermissionSet', __args__, opts=opts, typ=GetPermissionSetResult).value

    return AwaitableGetPermissionSetResult(
        arn=__ret__.arn,
        created_date=__ret__.created_date,
        description=__ret__.description,
        id=__ret__.id,
        instance_arn=__ret__.instance_arn,
        name=__ret__.name,
        relay_state=__ret__.relay_state,
        session_duration=__ret__.session_duration,
        tags=__ret__.tags)


@_utilities.lift_output_func(get_permission_set)
def get_permission_set_output(arn: Optional[pulumi.Input[Optional[str]]] = None,
                              instance_arn: Optional[pulumi.Input[str]] = None,
                              name: Optional[pulumi.Input[Optional[str]]] = None,
                              tags: Optional[pulumi.Input[Optional[Mapping[str, str]]]] = None,
                              opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetPermissionSetResult]:
    """
    Use this data source to get a Single Sign-On (SSO) Permission Set.


    :param str arn: The Amazon Resource Name (ARN) of the permission set.
    :param str instance_arn: The Amazon Resource Name (ARN) of the SSO Instance associated with the permission set.
    :param str name: The name of the SSO Permission Set.
    :param Mapping[str, str] tags: Key-value map of resource tags.
    """
    ...

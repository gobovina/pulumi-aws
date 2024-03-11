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

__all__ = [
    'GetUserResult',
    'AwaitableGetUserResult',
    'get_user',
    'get_user_output',
]

@pulumi.output_type
class GetUserResult:
    """
    A collection of values returned by getUser.
    """
    def __init__(__self__, access_string=None, arn=None, authentication_modes=None, id=None, minimum_engine_version=None, tags=None, user_name=None):
        if access_string and not isinstance(access_string, str):
            raise TypeError("Expected argument 'access_string' to be a str")
        pulumi.set(__self__, "access_string", access_string)
        if arn and not isinstance(arn, str):
            raise TypeError("Expected argument 'arn' to be a str")
        pulumi.set(__self__, "arn", arn)
        if authentication_modes and not isinstance(authentication_modes, list):
            raise TypeError("Expected argument 'authentication_modes' to be a list")
        pulumi.set(__self__, "authentication_modes", authentication_modes)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if minimum_engine_version and not isinstance(minimum_engine_version, str):
            raise TypeError("Expected argument 'minimum_engine_version' to be a str")
        pulumi.set(__self__, "minimum_engine_version", minimum_engine_version)
        if tags and not isinstance(tags, dict):
            raise TypeError("Expected argument 'tags' to be a dict")
        pulumi.set(__self__, "tags", tags)
        if user_name and not isinstance(user_name, str):
            raise TypeError("Expected argument 'user_name' to be a str")
        pulumi.set(__self__, "user_name", user_name)

    @property
    @pulumi.getter(name="accessString")
    def access_string(self) -> str:
        """
        Access permissions string used for this user.
        """
        return pulumi.get(self, "access_string")

    @property
    @pulumi.getter
    def arn(self) -> str:
        """
        ARN of the user.
        """
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter(name="authenticationModes")
    def authentication_modes(self) -> Sequence['outputs.GetUserAuthenticationModeResult']:
        """
        Denotes the user's authentication properties.
        """
        return pulumi.get(self, "authentication_modes")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="minimumEngineVersion")
    def minimum_engine_version(self) -> str:
        """
        The minimum engine version supported for the user.
        """
        return pulumi.get(self, "minimum_engine_version")

    @property
    @pulumi.getter
    def tags(self) -> Mapping[str, str]:
        """
        Map of tags assigned to the subnet group.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter(name="userName")
    def user_name(self) -> str:
        return pulumi.get(self, "user_name")


class AwaitableGetUserResult(GetUserResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetUserResult(
            access_string=self.access_string,
            arn=self.arn,
            authentication_modes=self.authentication_modes,
            id=self.id,
            minimum_engine_version=self.minimum_engine_version,
            tags=self.tags,
            user_name=self.user_name)


def get_user(tags: Optional[Mapping[str, str]] = None,
             user_name: Optional[str] = None,
             opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetUserResult:
    """
    Provides information about a MemoryDB User.

    ## Example Usage

    <!--Start PulumiCodeChooser -->
    ```python
    import pulumi
    import pulumi_aws as aws

    example = aws.memorydb.get_user(user_name="my-user")
    ```
    <!--End PulumiCodeChooser -->


    :param Mapping[str, str] tags: Map of tags assigned to the subnet group.
    :param str user_name: Name of the user.
    """
    __args__ = dict()
    __args__['tags'] = tags
    __args__['userName'] = user_name
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('aws:memorydb/getUser:getUser', __args__, opts=opts, typ=GetUserResult).value

    return AwaitableGetUserResult(
        access_string=pulumi.get(__ret__, 'access_string'),
        arn=pulumi.get(__ret__, 'arn'),
        authentication_modes=pulumi.get(__ret__, 'authentication_modes'),
        id=pulumi.get(__ret__, 'id'),
        minimum_engine_version=pulumi.get(__ret__, 'minimum_engine_version'),
        tags=pulumi.get(__ret__, 'tags'),
        user_name=pulumi.get(__ret__, 'user_name'))


@_utilities.lift_output_func(get_user)
def get_user_output(tags: Optional[pulumi.Input[Optional[Mapping[str, str]]]] = None,
                    user_name: Optional[pulumi.Input[str]] = None,
                    opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetUserResult]:
    """
    Provides information about a MemoryDB User.

    ## Example Usage

    <!--Start PulumiCodeChooser -->
    ```python
    import pulumi
    import pulumi_aws as aws

    example = aws.memorydb.get_user(user_name="my-user")
    ```
    <!--End PulumiCodeChooser -->


    :param Mapping[str, str] tags: Map of tags assigned to the subnet group.
    :param str user_name: Name of the user.
    """
    ...

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
    'GetUserGroupResult',
    'AwaitableGetUserGroupResult',
    'get_user_group',
    'get_user_group_output',
]

@pulumi.output_type
class GetUserGroupResult:
    """
    A collection of values returned by getUserGroup.
    """
    def __init__(__self__, description=None, id=None, name=None, precedence=None, role_arn=None, user_pool_id=None):
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if precedence and not isinstance(precedence, int):
            raise TypeError("Expected argument 'precedence' to be a int")
        pulumi.set(__self__, "precedence", precedence)
        if role_arn and not isinstance(role_arn, str):
            raise TypeError("Expected argument 'role_arn' to be a str")
        pulumi.set(__self__, "role_arn", role_arn)
        if user_pool_id and not isinstance(user_pool_id, str):
            raise TypeError("Expected argument 'user_pool_id' to be a str")
        pulumi.set(__self__, "user_pool_id", user_pool_id)

    @property
    @pulumi.getter
    def description(self) -> str:
        """
        Description of the user group.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        A comma-delimited string concatenating `name` and `user_pool_id`.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def name(self) -> str:
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def precedence(self) -> int:
        """
        Precedence of the user group.
        """
        return pulumi.get(self, "precedence")

    @property
    @pulumi.getter(name="roleArn")
    def role_arn(self) -> str:
        """
        ARN of the IAM role to be associated with the user group.
        """
        return pulumi.get(self, "role_arn")

    @property
    @pulumi.getter(name="userPoolId")
    def user_pool_id(self) -> str:
        return pulumi.get(self, "user_pool_id")


class AwaitableGetUserGroupResult(GetUserGroupResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetUserGroupResult(
            description=self.description,
            id=self.id,
            name=self.name,
            precedence=self.precedence,
            role_arn=self.role_arn,
            user_pool_id=self.user_pool_id)


def get_user_group(name: Optional[str] = None,
                   user_pool_id: Optional[str] = None,
                   opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetUserGroupResult:
    """
    Data source for managing an AWS Cognito IDP (Identity Provider) User Group.

    ## Example Usage

    ### Basic Usage

    <!--Start PulumiCodeChooser -->
    ```python
    import pulumi
    import pulumi_aws as aws

    example = aws.cognito.get_user_group(user_pool_id="us-west-2_aaaaaaaaa",
        name="example")
    ```
    <!--End PulumiCodeChooser -->


    :param str name: Name of the user group.
    :param str user_pool_id: User pool the client belongs to.
    """
    __args__ = dict()
    __args__['name'] = name
    __args__['userPoolId'] = user_pool_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('aws:cognito/getUserGroup:getUserGroup', __args__, opts=opts, typ=GetUserGroupResult).value

    return AwaitableGetUserGroupResult(
        description=pulumi.get(__ret__, 'description'),
        id=pulumi.get(__ret__, 'id'),
        name=pulumi.get(__ret__, 'name'),
        precedence=pulumi.get(__ret__, 'precedence'),
        role_arn=pulumi.get(__ret__, 'role_arn'),
        user_pool_id=pulumi.get(__ret__, 'user_pool_id'))


@_utilities.lift_output_func(get_user_group)
def get_user_group_output(name: Optional[pulumi.Input[str]] = None,
                          user_pool_id: Optional[pulumi.Input[str]] = None,
                          opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetUserGroupResult]:
    """
    Data source for managing an AWS Cognito IDP (Identity Provider) User Group.

    ## Example Usage

    ### Basic Usage

    <!--Start PulumiCodeChooser -->
    ```python
    import pulumi
    import pulumi_aws as aws

    example = aws.cognito.get_user_group(user_pool_id="us-west-2_aaaaaaaaa",
        name="example")
    ```
    <!--End PulumiCodeChooser -->


    :param str name: Name of the user group.
    :param str user_pool_id: User pool the client belongs to.
    """
    ...

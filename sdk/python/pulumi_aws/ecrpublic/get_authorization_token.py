# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = [
    'GetAuthorizationTokenResult',
    'AwaitableGetAuthorizationTokenResult',
    'get_authorization_token',
]

@pulumi.output_type
class GetAuthorizationTokenResult:
    """
    A collection of values returned by getAuthorizationToken.
    """
    def __init__(__self__, authorization_token=None, expires_at=None, id=None, password=None, user_name=None):
        if authorization_token and not isinstance(authorization_token, str):
            raise TypeError("Expected argument 'authorization_token' to be a str")
        pulumi.set(__self__, "authorization_token", authorization_token)
        if expires_at and not isinstance(expires_at, str):
            raise TypeError("Expected argument 'expires_at' to be a str")
        pulumi.set(__self__, "expires_at", expires_at)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if password and not isinstance(password, str):
            raise TypeError("Expected argument 'password' to be a str")
        pulumi.set(__self__, "password", password)
        if user_name and not isinstance(user_name, str):
            raise TypeError("Expected argument 'user_name' to be a str")
        pulumi.set(__self__, "user_name", user_name)

    @property
    @pulumi.getter(name="authorizationToken")
    def authorization_token(self) -> str:
        """
        Temporary IAM authentication credentials to access the ECR repository encoded in base64 in the form of `user_name:password`.
        """
        return pulumi.get(self, "authorization_token")

    @property
    @pulumi.getter(name="expiresAt")
    def expires_at(self) -> str:
        """
        The time in UTC RFC3339 format when the authorization token expires.
        """
        return pulumi.get(self, "expires_at")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def password(self) -> str:
        """
        Password decoded from the authorization token.
        """
        return pulumi.get(self, "password")

    @property
    @pulumi.getter(name="userName")
    def user_name(self) -> str:
        """
        User name decoded from the authorization token.
        """
        return pulumi.get(self, "user_name")


class AwaitableGetAuthorizationTokenResult(GetAuthorizationTokenResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetAuthorizationTokenResult(
            authorization_token=self.authorization_token,
            expires_at=self.expires_at,
            id=self.id,
            password=self.password,
            user_name=self.user_name)


def get_authorization_token(opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetAuthorizationTokenResult:
    """
    The Public ECR Authorization Token data source allows the authorization token, token expiration date, user name and password to be retrieved for a Public ECR repository.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_aws as aws

    token = aws.ecrpublic.get_authorization_token()
    ```
    """
    __args__ = dict()
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = _utilities.get_version()
    __ret__ = pulumi.runtime.invoke('aws:ecrpublic/getAuthorizationToken:getAuthorizationToken', __args__, opts=opts, typ=GetAuthorizationTokenResult).value

    return AwaitableGetAuthorizationTokenResult(
        authorization_token=__ret__.authorization_token,
        expires_at=__ret__.expires_at,
        id=__ret__.id,
        password=__ret__.password,
        user_name=__ret__.user_name)

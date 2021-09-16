# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = [
    'GetRolesResult',
    'AwaitableGetRolesResult',
    'get_roles',
    'get_roles_output',
]

@pulumi.output_type
class GetRolesResult:
    """
    A collection of values returned by getRoles.
    """
    def __init__(__self__, arns=None, id=None, name_regex=None, names=None, path_prefix=None):
        if arns and not isinstance(arns, list):
            raise TypeError("Expected argument 'arns' to be a list")
        pulumi.set(__self__, "arns", arns)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if name_regex and not isinstance(name_regex, str):
            raise TypeError("Expected argument 'name_regex' to be a str")
        pulumi.set(__self__, "name_regex", name_regex)
        if names and not isinstance(names, list):
            raise TypeError("Expected argument 'names' to be a list")
        pulumi.set(__self__, "names", names)
        if path_prefix and not isinstance(path_prefix, str):
            raise TypeError("Expected argument 'path_prefix' to be a str")
        pulumi.set(__self__, "path_prefix", path_prefix)

    @property
    @pulumi.getter
    def arns(self) -> Sequence[str]:
        """
        Set of ARNs of the matched IAM roles.
        """
        return pulumi.get(self, "arns")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="nameRegex")
    def name_regex(self) -> Optional[str]:
        return pulumi.get(self, "name_regex")

    @property
    @pulumi.getter
    def names(self) -> Sequence[str]:
        """
        Set of Names of the matched IAM roles.
        """
        return pulumi.get(self, "names")

    @property
    @pulumi.getter(name="pathPrefix")
    def path_prefix(self) -> Optional[str]:
        return pulumi.get(self, "path_prefix")


class AwaitableGetRolesResult(GetRolesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetRolesResult(
            arns=self.arns,
            id=self.id,
            name_regex=self.name_regex,
            names=self.names,
            path_prefix=self.path_prefix)


def get_roles(name_regex: Optional[str] = None,
              path_prefix: Optional[str] = None,
              opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetRolesResult:
    """
    Use this data source to get the ARNs and Names of IAM Roles.

    ## Example Usage
    ### All roles in an account

    ```python
    import pulumi
    import pulumi_aws as aws

    roles = aws.iam.get_roles()
    ```
    ### Roles filtered by name regex

    Roles whose role-name contains `project`

    ```python
    import pulumi
    import pulumi_aws as aws

    roles = aws.iam.get_roles(name_regex=".*project.*")
    ```
    ### Roles filtered by path prefix

    ```python
    import pulumi
    import pulumi_aws as aws

    roles = aws.iam.get_roles(path_prefix="/custom-path")
    ```
    ### Roles provisioned by AWS SSO

    Roles in the account filtered by path prefix

    ```python
    import pulumi
    import pulumi_aws as aws

    roles = aws.iam.get_roles(path_prefix="/aws-reserved/sso.amazonaws.com/")
    ```

    Specific role in the account filtered by name regex and path prefix

    ```python
    import pulumi
    import pulumi_aws as aws

    roles = aws.iam.get_roles(name_regex="AWSReservedSSO_permission_set_name_.*",
        path_prefix="/aws-reserved/sso.amazonaws.com/")
    ```


    :param str name_regex: A regex string to apply to the IAM roles list returned by AWS. This allows more advanced filtering not supported from the AWS API.
           This filtering is done locally on what AWS returns, and could have a performance impact if the result is large. It is recommended to combine this with other
           options to narrow down the list AWS returns.
    :param str path_prefix: The path prefix for filtering the results. For example, the prefix `/application_abc/component_xyz/` gets all roles whose path starts with `/application_abc/component_xyz/`. If it is not included, it defaults to a slash (`/`), listing all roles. For more details, check out [list-roles in the AWS CLI reference][1].
    """
    __args__ = dict()
    __args__['nameRegex'] = name_regex
    __args__['pathPrefix'] = path_prefix
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = _utilities.get_version()
    __ret__ = pulumi.runtime.invoke('aws:iam/getRoles:getRoles', __args__, opts=opts, typ=GetRolesResult).value

    return AwaitableGetRolesResult(
        arns=__ret__.arns,
        id=__ret__.id,
        name_regex=__ret__.name_regex,
        names=__ret__.names,
        path_prefix=__ret__.path_prefix)


@_utilities.lift_output_func(get_roles)
def get_roles_output(name_regex: Optional[pulumi.Input[Optional[str]]] = None,
                     path_prefix: Optional[pulumi.Input[Optional[str]]] = None,
                     opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetRolesResult]:
    """
    Use this data source to get the ARNs and Names of IAM Roles.

    ## Example Usage
    ### All roles in an account

    ```python
    import pulumi
    import pulumi_aws as aws

    roles = aws.iam.get_roles()
    ```
    ### Roles filtered by name regex

    Roles whose role-name contains `project`

    ```python
    import pulumi
    import pulumi_aws as aws

    roles = aws.iam.get_roles(name_regex=".*project.*")
    ```
    ### Roles filtered by path prefix

    ```python
    import pulumi
    import pulumi_aws as aws

    roles = aws.iam.get_roles(path_prefix="/custom-path")
    ```
    ### Roles provisioned by AWS SSO

    Roles in the account filtered by path prefix

    ```python
    import pulumi
    import pulumi_aws as aws

    roles = aws.iam.get_roles(path_prefix="/aws-reserved/sso.amazonaws.com/")
    ```

    Specific role in the account filtered by name regex and path prefix

    ```python
    import pulumi
    import pulumi_aws as aws

    roles = aws.iam.get_roles(name_regex="AWSReservedSSO_permission_set_name_.*",
        path_prefix="/aws-reserved/sso.amazonaws.com/")
    ```


    :param str name_regex: A regex string to apply to the IAM roles list returned by AWS. This allows more advanced filtering not supported from the AWS API.
           This filtering is done locally on what AWS returns, and could have a performance impact if the result is large. It is recommended to combine this with other
           options to narrow down the list AWS returns.
    :param str path_prefix: The path prefix for filtering the results. For example, the prefix `/application_abc/component_xyz/` gets all roles whose path starts with `/application_abc/component_xyz/`. If it is not included, it defaults to a slash (`/`), listing all roles. For more details, check out [list-roles in the AWS CLI reference][1].
    """
    ...

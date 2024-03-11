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
    'GetConnectionResult',
    'AwaitableGetConnectionResult',
    'get_connection',
    'get_connection_output',
]

@pulumi.output_type
class GetConnectionResult:
    """
    A collection of values returned by getConnection.
    """
    def __init__(__self__, arn=None, connection_status=None, host_arn=None, id=None, name=None, provider_type=None, tags=None):
        if arn and not isinstance(arn, str):
            raise TypeError("Expected argument 'arn' to be a str")
        pulumi.set(__self__, "arn", arn)
        if connection_status and not isinstance(connection_status, str):
            raise TypeError("Expected argument 'connection_status' to be a str")
        pulumi.set(__self__, "connection_status", connection_status)
        if host_arn and not isinstance(host_arn, str):
            raise TypeError("Expected argument 'host_arn' to be a str")
        pulumi.set(__self__, "host_arn", host_arn)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if provider_type and not isinstance(provider_type, str):
            raise TypeError("Expected argument 'provider_type' to be a str")
        pulumi.set(__self__, "provider_type", provider_type)
        if tags and not isinstance(tags, dict):
            raise TypeError("Expected argument 'tags' to be a dict")
        pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter
    def arn(self) -> str:
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter(name="connectionStatus")
    def connection_status(self) -> str:
        """
        CodeStar Connection status. Possible values are `PENDING`, `AVAILABLE` and `ERROR`.
        """
        return pulumi.get(self, "connection_status")

    @property
    @pulumi.getter(name="hostArn")
    def host_arn(self) -> str:
        """
        ARN of the host associated with the connection.
        """
        return pulumi.get(self, "host_arn")

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
        Name of the CodeStar Connection. The name is unique in the calling AWS account.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="providerType")
    def provider_type(self) -> str:
        """
        Name of the external provider where your third-party code repository is configured. Possible values are `Bitbucket`, `GitHub` and `GitLab`. For connections to GitHub Enterprise Server or GitLab Self-Managed instances, you must create an codestarconnections.Host resource and use `host_arn` instead.
        """
        return pulumi.get(self, "provider_type")

    @property
    @pulumi.getter
    def tags(self) -> Mapping[str, str]:
        """
        Map of key-value resource tags to associate with the resource.
        """
        return pulumi.get(self, "tags")


class AwaitableGetConnectionResult(GetConnectionResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetConnectionResult(
            arn=self.arn,
            connection_status=self.connection_status,
            host_arn=self.host_arn,
            id=self.id,
            name=self.name,
            provider_type=self.provider_type,
            tags=self.tags)


def get_connection(arn: Optional[str] = None,
                   name: Optional[str] = None,
                   tags: Optional[Mapping[str, str]] = None,
                   opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetConnectionResult:
    """
    Provides details about CodeStar Connection.

    ## Example Usage

    ### By ARN

    <!--Start PulumiCodeChooser -->
    ```python
    import pulumi
    import pulumi_aws as aws

    example = aws.codestarconnections.get_connection(arn=example_aws_codestarconnections_connection["arn"])
    ```
    <!--End PulumiCodeChooser -->

    ### By Name

    <!--Start PulumiCodeChooser -->
    ```python
    import pulumi
    import pulumi_aws as aws

    example = aws.codestarconnections.get_connection(name=example_aws_codestarconnections_connection["name"])
    ```
    <!--End PulumiCodeChooser -->


    :param str arn: CodeStar Connection ARN.
    :param str name: CodeStar Connection name.
           
           > **NOTE:** When both `arn` and `name` are specified, `arn` takes precedence.
    :param Mapping[str, str] tags: Map of key-value resource tags to associate with the resource.
    """
    __args__ = dict()
    __args__['arn'] = arn
    __args__['name'] = name
    __args__['tags'] = tags
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('aws:codestarconnections/getConnection:getConnection', __args__, opts=opts, typ=GetConnectionResult).value

    return AwaitableGetConnectionResult(
        arn=pulumi.get(__ret__, 'arn'),
        connection_status=pulumi.get(__ret__, 'connection_status'),
        host_arn=pulumi.get(__ret__, 'host_arn'),
        id=pulumi.get(__ret__, 'id'),
        name=pulumi.get(__ret__, 'name'),
        provider_type=pulumi.get(__ret__, 'provider_type'),
        tags=pulumi.get(__ret__, 'tags'))


@_utilities.lift_output_func(get_connection)
def get_connection_output(arn: Optional[pulumi.Input[Optional[str]]] = None,
                          name: Optional[pulumi.Input[Optional[str]]] = None,
                          tags: Optional[pulumi.Input[Optional[Mapping[str, str]]]] = None,
                          opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetConnectionResult]:
    """
    Provides details about CodeStar Connection.

    ## Example Usage

    ### By ARN

    <!--Start PulumiCodeChooser -->
    ```python
    import pulumi
    import pulumi_aws as aws

    example = aws.codestarconnections.get_connection(arn=example_aws_codestarconnections_connection["arn"])
    ```
    <!--End PulumiCodeChooser -->

    ### By Name

    <!--Start PulumiCodeChooser -->
    ```python
    import pulumi
    import pulumi_aws as aws

    example = aws.codestarconnections.get_connection(name=example_aws_codestarconnections_connection["name"])
    ```
    <!--End PulumiCodeChooser -->


    :param str arn: CodeStar Connection ARN.
    :param str name: CodeStar Connection name.
           
           > **NOTE:** When both `arn` and `name` are specified, `arn` takes precedence.
    :param Mapping[str, str] tags: Map of key-value resource tags to associate with the resource.
    """
    ...

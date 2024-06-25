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
    'GetConfigurationResult',
    'AwaitableGetConfigurationResult',
    'get_configuration',
    'get_configuration_output',
]

@pulumi.output_type
class GetConfigurationResult:
    """
    A collection of values returned by getConfiguration.
    """
    def __init__(__self__, arn=None, description=None, id=None, kafka_versions=None, latest_revision=None, name=None, server_properties=None):
        if arn and not isinstance(arn, str):
            raise TypeError("Expected argument 'arn' to be a str")
        pulumi.set(__self__, "arn", arn)
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if kafka_versions and not isinstance(kafka_versions, list):
            raise TypeError("Expected argument 'kafka_versions' to be a list")
        pulumi.set(__self__, "kafka_versions", kafka_versions)
        if latest_revision and not isinstance(latest_revision, int):
            raise TypeError("Expected argument 'latest_revision' to be a int")
        pulumi.set(__self__, "latest_revision", latest_revision)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if server_properties and not isinstance(server_properties, str):
            raise TypeError("Expected argument 'server_properties' to be a str")
        pulumi.set(__self__, "server_properties", server_properties)

    @property
    @pulumi.getter
    def arn(self) -> str:
        """
        ARN of the configuration.
        """
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter
    def description(self) -> str:
        """
        Description of the configuration.
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
    @pulumi.getter(name="kafkaVersions")
    def kafka_versions(self) -> Sequence[str]:
        """
        List of Apache Kafka versions which can use this configuration.
        """
        return pulumi.get(self, "kafka_versions")

    @property
    @pulumi.getter(name="latestRevision")
    def latest_revision(self) -> int:
        """
        Latest revision of the configuration.
        """
        return pulumi.get(self, "latest_revision")

    @property
    @pulumi.getter
    def name(self) -> str:
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="serverProperties")
    def server_properties(self) -> str:
        """
        Contents of the server.properties file.
        """
        return pulumi.get(self, "server_properties")


class AwaitableGetConfigurationResult(GetConfigurationResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetConfigurationResult(
            arn=self.arn,
            description=self.description,
            id=self.id,
            kafka_versions=self.kafka_versions,
            latest_revision=self.latest_revision,
            name=self.name,
            server_properties=self.server_properties)


def get_configuration(name: Optional[str] = None,
                      opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetConfigurationResult:
    """
    Get information on an Amazon MSK Configuration.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_aws as aws

    example = aws.msk.get_configuration(name="example")
    ```


    :param str name: Name of the configuration.
    """
    __args__ = dict()
    __args__['name'] = name
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('aws:msk/getConfiguration:getConfiguration', __args__, opts=opts, typ=GetConfigurationResult).value

    return AwaitableGetConfigurationResult(
        arn=pulumi.get(__ret__, 'arn'),
        description=pulumi.get(__ret__, 'description'),
        id=pulumi.get(__ret__, 'id'),
        kafka_versions=pulumi.get(__ret__, 'kafka_versions'),
        latest_revision=pulumi.get(__ret__, 'latest_revision'),
        name=pulumi.get(__ret__, 'name'),
        server_properties=pulumi.get(__ret__, 'server_properties'))


@_utilities.lift_output_func(get_configuration)
def get_configuration_output(name: Optional[pulumi.Input[str]] = None,
                             opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetConfigurationResult]:
    """
    Get information on an Amazon MSK Configuration.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_aws as aws

    example = aws.msk.get_configuration(name="example")
    ```


    :param str name: Name of the configuration.
    """
    ...

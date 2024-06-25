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
from . import outputs

__all__ = [
    'GetFrameworkResult',
    'AwaitableGetFrameworkResult',
    'get_framework',
    'get_framework_output',
]

@pulumi.output_type
class GetFrameworkResult:
    """
    A collection of values returned by getFramework.
    """
    def __init__(__self__, arn=None, controls=None, creation_time=None, deployment_status=None, description=None, id=None, name=None, status=None, tags=None):
        if arn and not isinstance(arn, str):
            raise TypeError("Expected argument 'arn' to be a str")
        pulumi.set(__self__, "arn", arn)
        if controls and not isinstance(controls, list):
            raise TypeError("Expected argument 'controls' to be a list")
        pulumi.set(__self__, "controls", controls)
        if creation_time and not isinstance(creation_time, str):
            raise TypeError("Expected argument 'creation_time' to be a str")
        pulumi.set(__self__, "creation_time", creation_time)
        if deployment_status and not isinstance(deployment_status, str):
            raise TypeError("Expected argument 'deployment_status' to be a str")
        pulumi.set(__self__, "deployment_status", deployment_status)
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if status and not isinstance(status, str):
            raise TypeError("Expected argument 'status' to be a str")
        pulumi.set(__self__, "status", status)
        if tags and not isinstance(tags, dict):
            raise TypeError("Expected argument 'tags' to be a dict")
        pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter
    def arn(self) -> str:
        """
        ARN of the backup framework.
        """
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter
    def controls(self) -> Sequence['outputs.GetFrameworkControlResult']:
        """
        One or more control blocks that make up the framework. Each control in the list has a name, input parameters, and scope. Detailed below.
        """
        return pulumi.get(self, "controls")

    @property
    @pulumi.getter(name="creationTime")
    def creation_time(self) -> str:
        """
        Date and time that a framework is created, in Unix format and Coordinated Universal Time (UTC).
        """
        return pulumi.get(self, "creation_time")

    @property
    @pulumi.getter(name="deploymentStatus")
    def deployment_status(self) -> str:
        """
        Deployment status of a framework. The statuses are: `CREATE_IN_PROGRESS` | `UPDATE_IN_PROGRESS` | `DELETE_IN_PROGRESS` | `COMPLETED`| `FAILED`.
        """
        return pulumi.get(self, "deployment_status")

    @property
    @pulumi.getter
    def description(self) -> str:
        """
        Description of the framework.
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
    @pulumi.getter
    def name(self) -> str:
        """
        Name of a parameter, for example, BackupPlanFrequency.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def status(self) -> str:
        """
        Framework consists of one or more controls. Each control governs a resource, such as backup plans, backup selections, backup vaults, or recovery points. You can also turn AWS Config recording on or off for each resource. The statuses are: `ACTIVE`, `PARTIALLY_ACTIVE`, `INACTIVE`, `UNAVAILABLE`. For more information refer to the [AWS documentation for Framework Status](https://docs.aws.amazon.com/aws-backup/latest/devguide/API_DescribeFramework.html#Backup-DescribeFramework-response-FrameworkStatus)
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter
    def tags(self) -> Mapping[str, str]:
        """
        Tag key-value pair applied to those AWS resources that you want to trigger an evaluation for a rule. A maximum of one key-value pair can be provided.
        """
        return pulumi.get(self, "tags")


class AwaitableGetFrameworkResult(GetFrameworkResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetFrameworkResult(
            arn=self.arn,
            controls=self.controls,
            creation_time=self.creation_time,
            deployment_status=self.deployment_status,
            description=self.description,
            id=self.id,
            name=self.name,
            status=self.status,
            tags=self.tags)


def get_framework(name: Optional[str] = None,
                  tags: Optional[Mapping[str, str]] = None,
                  opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetFrameworkResult:
    """
    Use this data source to get information on an existing backup framework.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_aws as aws

    example = aws.backup.get_framework(name="my_example_backup_framework_name")
    ```


    :param str name: Backup framework name.
    :param Mapping[str, str] tags: Tag key-value pair applied to those AWS resources that you want to trigger an evaluation for a rule. A maximum of one key-value pair can be provided.
    """
    __args__ = dict()
    __args__['name'] = name
    __args__['tags'] = tags
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('aws:backup/getFramework:getFramework', __args__, opts=opts, typ=GetFrameworkResult).value

    return AwaitableGetFrameworkResult(
        arn=pulumi.get(__ret__, 'arn'),
        controls=pulumi.get(__ret__, 'controls'),
        creation_time=pulumi.get(__ret__, 'creation_time'),
        deployment_status=pulumi.get(__ret__, 'deployment_status'),
        description=pulumi.get(__ret__, 'description'),
        id=pulumi.get(__ret__, 'id'),
        name=pulumi.get(__ret__, 'name'),
        status=pulumi.get(__ret__, 'status'),
        tags=pulumi.get(__ret__, 'tags'))


@_utilities.lift_output_func(get_framework)
def get_framework_output(name: Optional[pulumi.Input[str]] = None,
                         tags: Optional[pulumi.Input[Optional[Mapping[str, str]]]] = None,
                         opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetFrameworkResult]:
    """
    Use this data source to get information on an existing backup framework.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_aws as aws

    example = aws.backup.get_framework(name="my_example_backup_framework_name")
    ```


    :param str name: Backup framework name.
    :param Mapping[str, str] tags: Tag key-value pair applied to those AWS resources that you want to trigger an evaluation for a rule. A maximum of one key-value pair can be provided.
    """
    ...

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
    'GetLogGroupsResult',
    'AwaitableGetLogGroupsResult',
    'get_log_groups',
    'get_log_groups_output',
]

@pulumi.output_type
class GetLogGroupsResult:
    """
    A collection of values returned by getLogGroups.
    """
    def __init__(__self__, arns=None, id=None, log_group_name_prefix=None, log_group_names=None):
        if arns and not isinstance(arns, list):
            raise TypeError("Expected argument 'arns' to be a list")
        pulumi.set(__self__, "arns", arns)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if log_group_name_prefix and not isinstance(log_group_name_prefix, str):
            raise TypeError("Expected argument 'log_group_name_prefix' to be a str")
        pulumi.set(__self__, "log_group_name_prefix", log_group_name_prefix)
        if log_group_names and not isinstance(log_group_names, list):
            raise TypeError("Expected argument 'log_group_names' to be a list")
        pulumi.set(__self__, "log_group_names", log_group_names)

    @property
    @pulumi.getter
    def arns(self) -> Sequence[str]:
        """
        Set of ARNs of the Cloudwatch log groups
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
    @pulumi.getter(name="logGroupNamePrefix")
    def log_group_name_prefix(self) -> Optional[str]:
        return pulumi.get(self, "log_group_name_prefix")

    @property
    @pulumi.getter(name="logGroupNames")
    def log_group_names(self) -> Sequence[str]:
        """
        Set of names of the Cloudwatch log groups
        """
        return pulumi.get(self, "log_group_names")


class AwaitableGetLogGroupsResult(GetLogGroupsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetLogGroupsResult(
            arns=self.arns,
            id=self.id,
            log_group_name_prefix=self.log_group_name_prefix,
            log_group_names=self.log_group_names)


def get_log_groups(log_group_name_prefix: Optional[str] = None,
                   opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetLogGroupsResult:
    """
    Use this data source to get a list of AWS Cloudwatch Log Groups

    ## Example Usage

    ```python
    import pulumi
    import pulumi_aws as aws

    example = aws.cloudwatch.get_log_groups(log_group_name_prefix="/MyImportantLogs")
    ```


    :param str log_group_name_prefix: Group prefix of the Cloudwatch log groups to list
    """
    __args__ = dict()
    __args__['logGroupNamePrefix'] = log_group_name_prefix
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('aws:cloudwatch/getLogGroups:getLogGroups', __args__, opts=opts, typ=GetLogGroupsResult).value

    return AwaitableGetLogGroupsResult(
        arns=pulumi.get(__ret__, 'arns'),
        id=pulumi.get(__ret__, 'id'),
        log_group_name_prefix=pulumi.get(__ret__, 'log_group_name_prefix'),
        log_group_names=pulumi.get(__ret__, 'log_group_names'))


@_utilities.lift_output_func(get_log_groups)
def get_log_groups_output(log_group_name_prefix: Optional[pulumi.Input[Optional[str]]] = None,
                          opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetLogGroupsResult]:
    """
    Use this data source to get a list of AWS Cloudwatch Log Groups

    ## Example Usage

    ```python
    import pulumi
    import pulumi_aws as aws

    example = aws.cloudwatch.get_log_groups(log_group_name_prefix="/MyImportantLogs")
    ```


    :param str log_group_name_prefix: Group prefix of the Cloudwatch log groups to list
    """
    ...

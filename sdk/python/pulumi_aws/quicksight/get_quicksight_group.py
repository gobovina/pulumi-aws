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
    'GetQuicksightGroupResult',
    'AwaitableGetQuicksightGroupResult',
    'get_quicksight_group',
    'get_quicksight_group_output',
]

@pulumi.output_type
class GetQuicksightGroupResult:
    """
    A collection of values returned by getQuicksightGroup.
    """
    def __init__(__self__, arn=None, aws_account_id=None, description=None, group_name=None, id=None, namespace=None, principal_id=None):
        if arn and not isinstance(arn, str):
            raise TypeError("Expected argument 'arn' to be a str")
        pulumi.set(__self__, "arn", arn)
        if aws_account_id and not isinstance(aws_account_id, str):
            raise TypeError("Expected argument 'aws_account_id' to be a str")
        pulumi.set(__self__, "aws_account_id", aws_account_id)
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if group_name and not isinstance(group_name, str):
            raise TypeError("Expected argument 'group_name' to be a str")
        pulumi.set(__self__, "group_name", group_name)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if namespace and not isinstance(namespace, str):
            raise TypeError("Expected argument 'namespace' to be a str")
        pulumi.set(__self__, "namespace", namespace)
        if principal_id and not isinstance(principal_id, str):
            raise TypeError("Expected argument 'principal_id' to be a str")
        pulumi.set(__self__, "principal_id", principal_id)

    @property
    @pulumi.getter
    def arn(self) -> str:
        """
        The Amazon Resource Name (ARN) for the group.
        """
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter(name="awsAccountId")
    def aws_account_id(self) -> str:
        return pulumi.get(self, "aws_account_id")

    @property
    @pulumi.getter
    def description(self) -> str:
        """
        The group description.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="groupName")
    def group_name(self) -> str:
        return pulumi.get(self, "group_name")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def namespace(self) -> Optional[str]:
        return pulumi.get(self, "namespace")

    @property
    @pulumi.getter(name="principalId")
    def principal_id(self) -> str:
        """
        The principal ID of the group.
        """
        return pulumi.get(self, "principal_id")


class AwaitableGetQuicksightGroupResult(GetQuicksightGroupResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetQuicksightGroupResult(
            arn=self.arn,
            aws_account_id=self.aws_account_id,
            description=self.description,
            group_name=self.group_name,
            id=self.id,
            namespace=self.namespace,
            principal_id=self.principal_id)


def get_quicksight_group(aws_account_id: Optional[str] = None,
                         group_name: Optional[str] = None,
                         namespace: Optional[str] = None,
                         opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetQuicksightGroupResult:
    """
    This data source can be used to fetch information about a specific
    QuickSight group. By using this data source, you can reference QuickSight group
    properties without having to hard code ARNs or unique IDs as input.

    ## Example Usage

    ### Basic Usage

    ```python
    import pulumi
    import pulumi_aws as aws

    example = aws.quicksight.get_quicksight_group(group_name="example")
    ```


    :param str aws_account_id: AWS account ID.
    :param str group_name: The name of the group that you want to match.
           
           The following arguments are optional:
    :param str namespace: QuickSight namespace. Defaults to `default`.
    """
    __args__ = dict()
    __args__['awsAccountId'] = aws_account_id
    __args__['groupName'] = group_name
    __args__['namespace'] = namespace
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('aws:quicksight/getQuicksightGroup:getQuicksightGroup', __args__, opts=opts, typ=GetQuicksightGroupResult).value

    return AwaitableGetQuicksightGroupResult(
        arn=pulumi.get(__ret__, 'arn'),
        aws_account_id=pulumi.get(__ret__, 'aws_account_id'),
        description=pulumi.get(__ret__, 'description'),
        group_name=pulumi.get(__ret__, 'group_name'),
        id=pulumi.get(__ret__, 'id'),
        namespace=pulumi.get(__ret__, 'namespace'),
        principal_id=pulumi.get(__ret__, 'principal_id'))


@_utilities.lift_output_func(get_quicksight_group)
def get_quicksight_group_output(aws_account_id: Optional[pulumi.Input[Optional[str]]] = None,
                                group_name: Optional[pulumi.Input[str]] = None,
                                namespace: Optional[pulumi.Input[Optional[str]]] = None,
                                opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetQuicksightGroupResult]:
    """
    This data source can be used to fetch information about a specific
    QuickSight group. By using this data source, you can reference QuickSight group
    properties without having to hard code ARNs or unique IDs as input.

    ## Example Usage

    ### Basic Usage

    ```python
    import pulumi
    import pulumi_aws as aws

    example = aws.quicksight.get_quicksight_group(group_name="example")
    ```


    :param str aws_account_id: AWS account ID.
    :param str group_name: The name of the group that you want to match.
           
           The following arguments are optional:
    :param str namespace: QuickSight namespace. Defaults to `default`.
    """
    ...

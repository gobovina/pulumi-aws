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
from ._inputs import *

__all__ = [
    'GetPrincipalApplicationAssignmentsResult',
    'AwaitableGetPrincipalApplicationAssignmentsResult',
    'get_principal_application_assignments',
    'get_principal_application_assignments_output',
]

@pulumi.output_type
class GetPrincipalApplicationAssignmentsResult:
    """
    A collection of values returned by getPrincipalApplicationAssignments.
    """
    def __init__(__self__, application_assignments=None, id=None, instance_arn=None, principal_id=None, principal_type=None):
        if application_assignments and not isinstance(application_assignments, list):
            raise TypeError("Expected argument 'application_assignments' to be a list")
        pulumi.set(__self__, "application_assignments", application_assignments)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if instance_arn and not isinstance(instance_arn, str):
            raise TypeError("Expected argument 'instance_arn' to be a str")
        pulumi.set(__self__, "instance_arn", instance_arn)
        if principal_id and not isinstance(principal_id, str):
            raise TypeError("Expected argument 'principal_id' to be a str")
        pulumi.set(__self__, "principal_id", principal_id)
        if principal_type and not isinstance(principal_type, str):
            raise TypeError("Expected argument 'principal_type' to be a str")
        pulumi.set(__self__, "principal_type", principal_type)

    @property
    @pulumi.getter(name="applicationAssignments")
    def application_assignments(self) -> Optional[Sequence['outputs.GetPrincipalApplicationAssignmentsApplicationAssignmentResult']]:
        """
        List of principals assigned to the application. See the `application_assignments` attribute reference below.
        """
        return pulumi.get(self, "application_assignments")

    @property
    @pulumi.getter
    def id(self) -> str:
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="instanceArn")
    def instance_arn(self) -> str:
        return pulumi.get(self, "instance_arn")

    @property
    @pulumi.getter(name="principalId")
    def principal_id(self) -> str:
        """
        An identifier for an object in IAM Identity Center, such as a user or group.
        """
        return pulumi.get(self, "principal_id")

    @property
    @pulumi.getter(name="principalType")
    def principal_type(self) -> str:
        """
        Entity type for which the assignment will be created. Valid values are `USER` or `GROUP`.
        """
        return pulumi.get(self, "principal_type")


class AwaitableGetPrincipalApplicationAssignmentsResult(GetPrincipalApplicationAssignmentsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetPrincipalApplicationAssignmentsResult(
            application_assignments=self.application_assignments,
            id=self.id,
            instance_arn=self.instance_arn,
            principal_id=self.principal_id,
            principal_type=self.principal_type)


def get_principal_application_assignments(application_assignments: Optional[Sequence[Union['GetPrincipalApplicationAssignmentsApplicationAssignmentArgs', 'GetPrincipalApplicationAssignmentsApplicationAssignmentArgsDict']]] = None,
                                          instance_arn: Optional[str] = None,
                                          principal_id: Optional[str] = None,
                                          principal_type: Optional[str] = None,
                                          opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetPrincipalApplicationAssignmentsResult:
    """
    Data source for viewing AWS SSO Admin Principal Application Assignments.

    ## Example Usage

    ### Basic Usage

    ```python
    import pulumi
    import pulumi_aws as aws

    example = aws.ssoadmin.get_principal_application_assignments(instance_arn=test["arns"],
        principal_id=test_aws_identitystore_user["userId"],
        principal_type="USER")
    ```


    :param Sequence[Union['GetPrincipalApplicationAssignmentsApplicationAssignmentArgs', 'GetPrincipalApplicationAssignmentsApplicationAssignmentArgsDict']] application_assignments: List of principals assigned to the application. See the `application_assignments` attribute reference below.
    :param str instance_arn: ARN of the instance of IAM Identity Center.
    :param str principal_id: An identifier for an object in IAM Identity Center, such as a user or group.
    :param str principal_type: Entity type for which the assignment will be created. Valid values are `USER` or `GROUP`.
    """
    __args__ = dict()
    __args__['applicationAssignments'] = application_assignments
    __args__['instanceArn'] = instance_arn
    __args__['principalId'] = principal_id
    __args__['principalType'] = principal_type
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('aws:ssoadmin/getPrincipalApplicationAssignments:getPrincipalApplicationAssignments', __args__, opts=opts, typ=GetPrincipalApplicationAssignmentsResult).value

    return AwaitableGetPrincipalApplicationAssignmentsResult(
        application_assignments=pulumi.get(__ret__, 'application_assignments'),
        id=pulumi.get(__ret__, 'id'),
        instance_arn=pulumi.get(__ret__, 'instance_arn'),
        principal_id=pulumi.get(__ret__, 'principal_id'),
        principal_type=pulumi.get(__ret__, 'principal_type'))


@_utilities.lift_output_func(get_principal_application_assignments)
def get_principal_application_assignments_output(application_assignments: Optional[pulumi.Input[Optional[Sequence[Union['GetPrincipalApplicationAssignmentsApplicationAssignmentArgs', 'GetPrincipalApplicationAssignmentsApplicationAssignmentArgsDict']]]]] = None,
                                                 instance_arn: Optional[pulumi.Input[str]] = None,
                                                 principal_id: Optional[pulumi.Input[str]] = None,
                                                 principal_type: Optional[pulumi.Input[str]] = None,
                                                 opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetPrincipalApplicationAssignmentsResult]:
    """
    Data source for viewing AWS SSO Admin Principal Application Assignments.

    ## Example Usage

    ### Basic Usage

    ```python
    import pulumi
    import pulumi_aws as aws

    example = aws.ssoadmin.get_principal_application_assignments(instance_arn=test["arns"],
        principal_id=test_aws_identitystore_user["userId"],
        principal_type="USER")
    ```


    :param Sequence[Union['GetPrincipalApplicationAssignmentsApplicationAssignmentArgs', 'GetPrincipalApplicationAssignmentsApplicationAssignmentArgsDict']] application_assignments: List of principals assigned to the application. See the `application_assignments` attribute reference below.
    :param str instance_arn: ARN of the instance of IAM Identity Center.
    :param str principal_id: An identifier for an object in IAM Identity Center, such as a user or group.
    :param str principal_type: Entity type for which the assignment will be created. Valid values are `USER` or `GROUP`.
    """
    ...

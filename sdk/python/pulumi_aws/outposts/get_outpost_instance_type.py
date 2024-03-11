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
    'GetOutpostInstanceTypeResult',
    'AwaitableGetOutpostInstanceTypeResult',
    'get_outpost_instance_type',
    'get_outpost_instance_type_output',
]

@pulumi.output_type
class GetOutpostInstanceTypeResult:
    """
    A collection of values returned by getOutpostInstanceType.
    """
    def __init__(__self__, arn=None, id=None, instance_type=None, preferred_instance_types=None):
        if arn and not isinstance(arn, str):
            raise TypeError("Expected argument 'arn' to be a str")
        pulumi.set(__self__, "arn", arn)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if instance_type and not isinstance(instance_type, str):
            raise TypeError("Expected argument 'instance_type' to be a str")
        pulumi.set(__self__, "instance_type", instance_type)
        if preferred_instance_types and not isinstance(preferred_instance_types, list):
            raise TypeError("Expected argument 'preferred_instance_types' to be a list")
        pulumi.set(__self__, "preferred_instance_types", preferred_instance_types)

    @property
    @pulumi.getter
    def arn(self) -> str:
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="instanceType")
    def instance_type(self) -> str:
        return pulumi.get(self, "instance_type")

    @property
    @pulumi.getter(name="preferredInstanceTypes")
    def preferred_instance_types(self) -> Optional[Sequence[str]]:
        return pulumi.get(self, "preferred_instance_types")


class AwaitableGetOutpostInstanceTypeResult(GetOutpostInstanceTypeResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetOutpostInstanceTypeResult(
            arn=self.arn,
            id=self.id,
            instance_type=self.instance_type,
            preferred_instance_types=self.preferred_instance_types)


def get_outpost_instance_type(arn: Optional[str] = None,
                              instance_type: Optional[str] = None,
                              preferred_instance_types: Optional[Sequence[str]] = None,
                              opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetOutpostInstanceTypeResult:
    """
    Information about single Outpost Instance Type.

    ## Example Usage

    <!--Start PulumiCodeChooser -->
    ```python
    import pulumi
    import pulumi_aws as aws

    example = aws.outposts.get_outpost_instance_type(arn=example_aws_outposts_outpost["arn"],
        preferred_instance_types=[
            "m5.large",
            "m5.4xlarge",
        ])
    example_ec2_instance = aws.index.Ec2Instance("example", instance_type=example.instance_type)
    ```
    <!--End PulumiCodeChooser -->


    :param str arn: Outpost ARN.
           
           The following arguments are optional:
    :param str instance_type: Desired instance type. Conflicts with `preferred_instance_types`.
    :param Sequence[str] preferred_instance_types: Ordered list of preferred instance types. The first match in this list will be returned. If no preferred matches are found and the original search returned more than one result, an error is returned. Conflicts with `instance_type`.
    """
    __args__ = dict()
    __args__['arn'] = arn
    __args__['instanceType'] = instance_type
    __args__['preferredInstanceTypes'] = preferred_instance_types
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('aws:outposts/getOutpostInstanceType:getOutpostInstanceType', __args__, opts=opts, typ=GetOutpostInstanceTypeResult).value

    return AwaitableGetOutpostInstanceTypeResult(
        arn=pulumi.get(__ret__, 'arn'),
        id=pulumi.get(__ret__, 'id'),
        instance_type=pulumi.get(__ret__, 'instance_type'),
        preferred_instance_types=pulumi.get(__ret__, 'preferred_instance_types'))


@_utilities.lift_output_func(get_outpost_instance_type)
def get_outpost_instance_type_output(arn: Optional[pulumi.Input[str]] = None,
                                     instance_type: Optional[pulumi.Input[Optional[str]]] = None,
                                     preferred_instance_types: Optional[pulumi.Input[Optional[Sequence[str]]]] = None,
                                     opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetOutpostInstanceTypeResult]:
    """
    Information about single Outpost Instance Type.

    ## Example Usage

    <!--Start PulumiCodeChooser -->
    ```python
    import pulumi
    import pulumi_aws as aws

    example = aws.outposts.get_outpost_instance_type(arn=example_aws_outposts_outpost["arn"],
        preferred_instance_types=[
            "m5.large",
            "m5.4xlarge",
        ])
    example_ec2_instance = aws.index.Ec2Instance("example", instance_type=example.instance_type)
    ```
    <!--End PulumiCodeChooser -->


    :param str arn: Outpost ARN.
           
           The following arguments are optional:
    :param str instance_type: Desired instance type. Conflicts with `preferred_instance_types`.
    :param Sequence[str] preferred_instance_types: Ordered list of preferred instance types. The first match in this list will be returned. If no preferred matches are found and the original search returned more than one result, an error is returned. Conflicts with `instance_type`.
    """
    ...

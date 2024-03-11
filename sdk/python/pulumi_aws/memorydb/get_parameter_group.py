# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities
from . import outputs

__all__ = [
    'GetParameterGroupResult',
    'AwaitableGetParameterGroupResult',
    'get_parameter_group',
    'get_parameter_group_output',
]

@pulumi.output_type
class GetParameterGroupResult:
    """
    A collection of values returned by getParameterGroup.
    """
    def __init__(__self__, arn=None, description=None, family=None, id=None, name=None, parameters=None, tags=None):
        if arn and not isinstance(arn, str):
            raise TypeError("Expected argument 'arn' to be a str")
        pulumi.set(__self__, "arn", arn)
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if family and not isinstance(family, str):
            raise TypeError("Expected argument 'family' to be a str")
        pulumi.set(__self__, "family", family)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if parameters and not isinstance(parameters, list):
            raise TypeError("Expected argument 'parameters' to be a list")
        pulumi.set(__self__, "parameters", parameters)
        if tags and not isinstance(tags, dict):
            raise TypeError("Expected argument 'tags' to be a dict")
        pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter
    def arn(self) -> str:
        """
        ARN of the parameter group.
        """
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter
    def description(self) -> str:
        """
        Description of the parameter group.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def family(self) -> str:
        """
        Engine version that the parameter group can be used with.
        """
        return pulumi.get(self, "family")

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
        Name of the parameter.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def parameters(self) -> Sequence['outputs.GetParameterGroupParameterResult']:
        """
        Set of user-defined MemoryDB parameters applied by the parameter group.
        """
        return pulumi.get(self, "parameters")

    @property
    @pulumi.getter
    def tags(self) -> Mapping[str, str]:
        """
        Map of tags assigned to the parameter group.
        """
        return pulumi.get(self, "tags")


class AwaitableGetParameterGroupResult(GetParameterGroupResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetParameterGroupResult(
            arn=self.arn,
            description=self.description,
            family=self.family,
            id=self.id,
            name=self.name,
            parameters=self.parameters,
            tags=self.tags)


def get_parameter_group(name: Optional[str] = None,
                        tags: Optional[Mapping[str, str]] = None,
                        opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetParameterGroupResult:
    """
    Provides information about a MemoryDB Parameter Group.

    ## Example Usage

    <!--Start PulumiCodeChooser -->
    ```python
    import pulumi
    import pulumi_aws as aws

    example = aws.memorydb.get_parameter_group(name="my-parameter-group")
    ```
    <!--End PulumiCodeChooser -->


    :param str name: Name of the parameter group.
    :param Mapping[str, str] tags: Map of tags assigned to the parameter group.
    """
    __args__ = dict()
    __args__['name'] = name
    __args__['tags'] = tags
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('aws:memorydb/getParameterGroup:getParameterGroup', __args__, opts=opts, typ=GetParameterGroupResult).value

    return AwaitableGetParameterGroupResult(
        arn=pulumi.get(__ret__, 'arn'),
        description=pulumi.get(__ret__, 'description'),
        family=pulumi.get(__ret__, 'family'),
        id=pulumi.get(__ret__, 'id'),
        name=pulumi.get(__ret__, 'name'),
        parameters=pulumi.get(__ret__, 'parameters'),
        tags=pulumi.get(__ret__, 'tags'))


@_utilities.lift_output_func(get_parameter_group)
def get_parameter_group_output(name: Optional[pulumi.Input[str]] = None,
                               tags: Optional[pulumi.Input[Optional[Mapping[str, str]]]] = None,
                               opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetParameterGroupResult]:
    """
    Provides information about a MemoryDB Parameter Group.

    ## Example Usage

    <!--Start PulumiCodeChooser -->
    ```python
    import pulumi
    import pulumi_aws as aws

    example = aws.memorydb.get_parameter_group(name="my-parameter-group")
    ```
    <!--End PulumiCodeChooser -->


    :param str name: Name of the parameter group.
    :param Mapping[str, str] tags: Map of tags assigned to the parameter group.
    """
    ...

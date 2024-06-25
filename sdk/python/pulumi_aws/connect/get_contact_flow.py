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
    'GetContactFlowResult',
    'AwaitableGetContactFlowResult',
    'get_contact_flow',
    'get_contact_flow_output',
]

@pulumi.output_type
class GetContactFlowResult:
    """
    A collection of values returned by getContactFlow.
    """
    def __init__(__self__, arn=None, contact_flow_id=None, content=None, description=None, id=None, instance_id=None, name=None, tags=None, type=None):
        if arn and not isinstance(arn, str):
            raise TypeError("Expected argument 'arn' to be a str")
        pulumi.set(__self__, "arn", arn)
        if contact_flow_id and not isinstance(contact_flow_id, str):
            raise TypeError("Expected argument 'contact_flow_id' to be a str")
        pulumi.set(__self__, "contact_flow_id", contact_flow_id)
        if content and not isinstance(content, str):
            raise TypeError("Expected argument 'content' to be a str")
        pulumi.set(__self__, "content", content)
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if instance_id and not isinstance(instance_id, str):
            raise TypeError("Expected argument 'instance_id' to be a str")
        pulumi.set(__self__, "instance_id", instance_id)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if tags and not isinstance(tags, dict):
            raise TypeError("Expected argument 'tags' to be a dict")
        pulumi.set(__self__, "tags", tags)
        if type and not isinstance(type, str):
            raise TypeError("Expected argument 'type' to be a str")
        pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter
    def arn(self) -> str:
        """
        ARN of the Contact Flow.
        """
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter(name="contactFlowId")
    def contact_flow_id(self) -> str:
        return pulumi.get(self, "contact_flow_id")

    @property
    @pulumi.getter
    def content(self) -> str:
        """
        Logic of the Contact Flow.
        """
        return pulumi.get(self, "content")

    @property
    @pulumi.getter
    def description(self) -> str:
        """
        Description of the Contact Flow.
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
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> str:
        return pulumi.get(self, "instance_id")

    @property
    @pulumi.getter
    def name(self) -> str:
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def tags(self) -> Mapping[str, str]:
        """
        Tags to assign to the Contact Flow.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter
    def type(self) -> Optional[str]:
        """
        Type of Contact Flow.
        """
        return pulumi.get(self, "type")


class AwaitableGetContactFlowResult(GetContactFlowResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetContactFlowResult(
            arn=self.arn,
            contact_flow_id=self.contact_flow_id,
            content=self.content,
            description=self.description,
            id=self.id,
            instance_id=self.instance_id,
            name=self.name,
            tags=self.tags,
            type=self.type)


def get_contact_flow(contact_flow_id: Optional[str] = None,
                     instance_id: Optional[str] = None,
                     name: Optional[str] = None,
                     tags: Optional[Mapping[str, str]] = None,
                     type: Optional[str] = None,
                     opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetContactFlowResult:
    """
    Provides details about a specific Amazon Connect Contact Flow.

    ## Example Usage

    By name

    ```python
    import pulumi
    import pulumi_aws as aws

    test = aws.connect.get_contact_flow(instance_id="aaaaaaaa-bbbb-cccc-dddd-111111111111",
        name="Test")
    ```

    By contact_flow_id

    ```python
    import pulumi
    import pulumi_aws as aws

    test = aws.connect.get_contact_flow(instance_id="aaaaaaaa-bbbb-cccc-dddd-111111111111",
        contact_flow_id="cccccccc-bbbb-cccc-dddd-111111111111")
    ```


    :param str contact_flow_id: Returns information on a specific Contact Flow by contact flow id
    :param str instance_id: Reference to the hosting Amazon Connect Instance
    :param str name: Returns information on a specific Contact Flow by name
    :param Mapping[str, str] tags: Tags to assign to the Contact Flow.
    :param str type: Type of Contact Flow.
    """
    __args__ = dict()
    __args__['contactFlowId'] = contact_flow_id
    __args__['instanceId'] = instance_id
    __args__['name'] = name
    __args__['tags'] = tags
    __args__['type'] = type
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('aws:connect/getContactFlow:getContactFlow', __args__, opts=opts, typ=GetContactFlowResult).value

    return AwaitableGetContactFlowResult(
        arn=pulumi.get(__ret__, 'arn'),
        contact_flow_id=pulumi.get(__ret__, 'contact_flow_id'),
        content=pulumi.get(__ret__, 'content'),
        description=pulumi.get(__ret__, 'description'),
        id=pulumi.get(__ret__, 'id'),
        instance_id=pulumi.get(__ret__, 'instance_id'),
        name=pulumi.get(__ret__, 'name'),
        tags=pulumi.get(__ret__, 'tags'),
        type=pulumi.get(__ret__, 'type'))


@_utilities.lift_output_func(get_contact_flow)
def get_contact_flow_output(contact_flow_id: Optional[pulumi.Input[Optional[str]]] = None,
                            instance_id: Optional[pulumi.Input[str]] = None,
                            name: Optional[pulumi.Input[Optional[str]]] = None,
                            tags: Optional[pulumi.Input[Optional[Mapping[str, str]]]] = None,
                            type: Optional[pulumi.Input[Optional[str]]] = None,
                            opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetContactFlowResult]:
    """
    Provides details about a specific Amazon Connect Contact Flow.

    ## Example Usage

    By name

    ```python
    import pulumi
    import pulumi_aws as aws

    test = aws.connect.get_contact_flow(instance_id="aaaaaaaa-bbbb-cccc-dddd-111111111111",
        name="Test")
    ```

    By contact_flow_id

    ```python
    import pulumi
    import pulumi_aws as aws

    test = aws.connect.get_contact_flow(instance_id="aaaaaaaa-bbbb-cccc-dddd-111111111111",
        contact_flow_id="cccccccc-bbbb-cccc-dddd-111111111111")
    ```


    :param str contact_flow_id: Returns information on a specific Contact Flow by contact flow id
    :param str instance_id: Reference to the hosting Amazon Connect Instance
    :param str name: Returns information on a specific Contact Flow by name
    :param Mapping[str, str] tags: Tags to assign to the Contact Flow.
    :param str type: Type of Contact Flow.
    """
    ...

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
    'GetImageResult',
    'AwaitableGetImageResult',
    'get_image',
    'get_image_output',
]

@pulumi.output_type
class GetImageResult:
    """
    A collection of values returned by getImage.
    """
    def __init__(__self__, description=None, id=None, image_id=None, name=None, operating_system_type=None, required_tenancy=None, state=None):
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if image_id and not isinstance(image_id, str):
            raise TypeError("Expected argument 'image_id' to be a str")
        pulumi.set(__self__, "image_id", image_id)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if operating_system_type and not isinstance(operating_system_type, str):
            raise TypeError("Expected argument 'operating_system_type' to be a str")
        pulumi.set(__self__, "operating_system_type", operating_system_type)
        if required_tenancy and not isinstance(required_tenancy, str):
            raise TypeError("Expected argument 'required_tenancy' to be a str")
        pulumi.set(__self__, "required_tenancy", required_tenancy)
        if state and not isinstance(state, str):
            raise TypeError("Expected argument 'state' to be a str")
        pulumi.set(__self__, "state", state)

    @property
    @pulumi.getter
    def description(self) -> str:
        """
        The description of the image.
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
    @pulumi.getter(name="imageId")
    def image_id(self) -> str:
        return pulumi.get(self, "image_id")

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        The name of the image.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="operatingSystemType")
    def operating_system_type(self) -> str:
        return pulumi.get(self, "operating_system_type")

    @property
    @pulumi.getter(name="requiredTenancy")
    def required_tenancy(self) -> str:
        """
        Specifies whether the image is running on dedicated hardware. When Bring Your Own License (BYOL) is enabled, this value is set to DEDICATED. For more information, see [Bring Your Own Windows Desktop Images](https://docs.aws.amazon.com/workspaces/latest/adminguide/byol-windows-images.html).
        """
        return pulumi.get(self, "required_tenancy")

    @property
    @pulumi.getter
    def state(self) -> str:
        """
        The status of the image.
        """
        return pulumi.get(self, "state")


class AwaitableGetImageResult(GetImageResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetImageResult(
            description=self.description,
            id=self.id,
            image_id=self.image_id,
            name=self.name,
            operating_system_type=self.operating_system_type,
            required_tenancy=self.required_tenancy,
            state=self.state)


def get_image(image_id: Optional[str] = None,
              opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetImageResult:
    """
    Use this data source to get information about a Workspaces image.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_aws as aws

    example = aws.workspaces.get_image(image_id="wsi-ten5h0y19")
    ```


    :param str image_id: ID of the image.
    """
    __args__ = dict()
    __args__['imageId'] = image_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('aws:workspaces/getImage:getImage', __args__, opts=opts, typ=GetImageResult).value

    return AwaitableGetImageResult(
        description=pulumi.get(__ret__, 'description'),
        id=pulumi.get(__ret__, 'id'),
        image_id=pulumi.get(__ret__, 'image_id'),
        name=pulumi.get(__ret__, 'name'),
        operating_system_type=pulumi.get(__ret__, 'operating_system_type'),
        required_tenancy=pulumi.get(__ret__, 'required_tenancy'),
        state=pulumi.get(__ret__, 'state'))


@_utilities.lift_output_func(get_image)
def get_image_output(image_id: Optional[pulumi.Input[str]] = None,
                     opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetImageResult]:
    """
    Use this data source to get information about a Workspaces image.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_aws as aws

    example = aws.workspaces.get_image(image_id="wsi-ten5h0y19")
    ```


    :param str image_id: ID of the image.
    """
    ...

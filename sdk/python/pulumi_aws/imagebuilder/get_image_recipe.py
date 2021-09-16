# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities
from . import outputs

__all__ = [
    'GetImageRecipeResult',
    'AwaitableGetImageRecipeResult',
    'get_image_recipe',
    'get_image_recipe_output',
]

@pulumi.output_type
class GetImageRecipeResult:
    """
    A collection of values returned by getImageRecipe.
    """
    def __init__(__self__, arn=None, block_device_mappings=None, components=None, date_created=None, description=None, id=None, name=None, owner=None, parent_image=None, platform=None, tags=None, version=None, working_directory=None):
        if arn and not isinstance(arn, str):
            raise TypeError("Expected argument 'arn' to be a str")
        pulumi.set(__self__, "arn", arn)
        if block_device_mappings and not isinstance(block_device_mappings, list):
            raise TypeError("Expected argument 'block_device_mappings' to be a list")
        pulumi.set(__self__, "block_device_mappings", block_device_mappings)
        if components and not isinstance(components, list):
            raise TypeError("Expected argument 'components' to be a list")
        pulumi.set(__self__, "components", components)
        if date_created and not isinstance(date_created, str):
            raise TypeError("Expected argument 'date_created' to be a str")
        pulumi.set(__self__, "date_created", date_created)
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if owner and not isinstance(owner, str):
            raise TypeError("Expected argument 'owner' to be a str")
        pulumi.set(__self__, "owner", owner)
        if parent_image and not isinstance(parent_image, str):
            raise TypeError("Expected argument 'parent_image' to be a str")
        pulumi.set(__self__, "parent_image", parent_image)
        if platform and not isinstance(platform, str):
            raise TypeError("Expected argument 'platform' to be a str")
        pulumi.set(__self__, "platform", platform)
        if tags and not isinstance(tags, dict):
            raise TypeError("Expected argument 'tags' to be a dict")
        pulumi.set(__self__, "tags", tags)
        if version and not isinstance(version, str):
            raise TypeError("Expected argument 'version' to be a str")
        pulumi.set(__self__, "version", version)
        if working_directory and not isinstance(working_directory, str):
            raise TypeError("Expected argument 'working_directory' to be a str")
        pulumi.set(__self__, "working_directory", working_directory)

    @property
    @pulumi.getter
    def arn(self) -> str:
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter(name="blockDeviceMappings")
    def block_device_mappings(self) -> Sequence['outputs.GetImageRecipeBlockDeviceMappingResult']:
        """
        Set of objects with block device mappings for the the image recipe.
        """
        return pulumi.get(self, "block_device_mappings")

    @property
    @pulumi.getter
    def components(self) -> Sequence['outputs.GetImageRecipeComponentResult']:
        """
        List of objects with components for the image recipe.
        """
        return pulumi.get(self, "components")

    @property
    @pulumi.getter(name="dateCreated")
    def date_created(self) -> str:
        """
        Date the image recipe was created.
        """
        return pulumi.get(self, "date_created")

    @property
    @pulumi.getter
    def description(self) -> str:
        """
        Description of the image recipe.
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
        Name of the image recipe.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def owner(self) -> str:
        """
        Owner of the image recipe.
        """
        return pulumi.get(self, "owner")

    @property
    @pulumi.getter(name="parentImage")
    def parent_image(self) -> str:
        """
        Platform of the image recipe.
        """
        return pulumi.get(self, "parent_image")

    @property
    @pulumi.getter
    def platform(self) -> str:
        """
        Platform of the image recipe.
        """
        return pulumi.get(self, "platform")

    @property
    @pulumi.getter
    def tags(self) -> Optional[Mapping[str, str]]:
        """
        Key-value map of resource tags for the image recipe.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter
    def version(self) -> str:
        """
        Version of the image recipe.
        """
        return pulumi.get(self, "version")

    @property
    @pulumi.getter(name="workingDirectory")
    def working_directory(self) -> str:
        """
        The working directory used during build and test workflows.
        """
        return pulumi.get(self, "working_directory")


class AwaitableGetImageRecipeResult(GetImageRecipeResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetImageRecipeResult(
            arn=self.arn,
            block_device_mappings=self.block_device_mappings,
            components=self.components,
            date_created=self.date_created,
            description=self.description,
            id=self.id,
            name=self.name,
            owner=self.owner,
            parent_image=self.parent_image,
            platform=self.platform,
            tags=self.tags,
            version=self.version,
            working_directory=self.working_directory)


def get_image_recipe(arn: Optional[str] = None,
                     tags: Optional[Mapping[str, str]] = None,
                     opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetImageRecipeResult:
    """
    Provides details about an Image Builder Image Recipe.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_aws as aws

    example = aws.imagebuilder.get_image_recipe(arn="arn:aws:imagebuilder:us-east-1:aws:image-recipe/example/1.0.0")
    ```


    :param str arn: Amazon Resource Name (ARN) of the image recipe.
    :param Mapping[str, str] tags: Key-value map of resource tags for the image recipe.
    """
    __args__ = dict()
    __args__['arn'] = arn
    __args__['tags'] = tags
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = _utilities.get_version()
    __ret__ = pulumi.runtime.invoke('aws:imagebuilder/getImageRecipe:getImageRecipe', __args__, opts=opts, typ=GetImageRecipeResult).value

    return AwaitableGetImageRecipeResult(
        arn=__ret__.arn,
        block_device_mappings=__ret__.block_device_mappings,
        components=__ret__.components,
        date_created=__ret__.date_created,
        description=__ret__.description,
        id=__ret__.id,
        name=__ret__.name,
        owner=__ret__.owner,
        parent_image=__ret__.parent_image,
        platform=__ret__.platform,
        tags=__ret__.tags,
        version=__ret__.version,
        working_directory=__ret__.working_directory)


@_utilities.lift_output_func(get_image_recipe)
def get_image_recipe_output(arn: Optional[pulumi.Input[str]] = None,
                            tags: Optional[pulumi.Input[Optional[Mapping[str, str]]]] = None,
                            opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetImageRecipeResult]:
    """
    Provides details about an Image Builder Image Recipe.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_aws as aws

    example = aws.imagebuilder.get_image_recipe(arn="arn:aws:imagebuilder:us-east-1:aws:image-recipe/example/1.0.0")
    ```


    :param str arn: Amazon Resource Name (ARN) of the image recipe.
    :param Mapping[str, str] tags: Key-value map of resource tags for the image recipe.
    """
    ...

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
    'GetContainerRecipesResult',
    'AwaitableGetContainerRecipesResult',
    'get_container_recipes',
    'get_container_recipes_output',
]

@pulumi.output_type
class GetContainerRecipesResult:
    """
    A collection of values returned by getContainerRecipes.
    """
    def __init__(__self__, arns=None, filters=None, id=None, names=None, owner=None):
        if arns and not isinstance(arns, list):
            raise TypeError("Expected argument 'arns' to be a list")
        pulumi.set(__self__, "arns", arns)
        if filters and not isinstance(filters, list):
            raise TypeError("Expected argument 'filters' to be a list")
        pulumi.set(__self__, "filters", filters)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if names and not isinstance(names, list):
            raise TypeError("Expected argument 'names' to be a list")
        pulumi.set(__self__, "names", names)
        if owner and not isinstance(owner, str):
            raise TypeError("Expected argument 'owner' to be a str")
        pulumi.set(__self__, "owner", owner)

    @property
    @pulumi.getter
    def arns(self) -> Sequence[str]:
        """
        Set of ARNs of the matched Image Builder Container Recipes.
        """
        return pulumi.get(self, "arns")

    @property
    @pulumi.getter
    def filters(self) -> Optional[Sequence['outputs.GetContainerRecipesFilterResult']]:
        return pulumi.get(self, "filters")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def names(self) -> Sequence[str]:
        """
        Set of names of the matched Image Builder Container Recipes.
        """
        return pulumi.get(self, "names")

    @property
    @pulumi.getter
    def owner(self) -> Optional[str]:
        return pulumi.get(self, "owner")


class AwaitableGetContainerRecipesResult(GetContainerRecipesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetContainerRecipesResult(
            arns=self.arns,
            filters=self.filters,
            id=self.id,
            names=self.names,
            owner=self.owner)


def get_container_recipes(filters: Optional[Sequence[Union['GetContainerRecipesFilterArgs', 'GetContainerRecipesFilterArgsDict']]] = None,
                          owner: Optional[str] = None,
                          opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetContainerRecipesResult:
    """
    Use this data source to get the ARNs and names of Image Builder Container Recipes matching the specified criteria.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_aws as aws

    example = aws.imagebuilder.get_container_recipes(owner="Self",
        filters=[{
            "name": "platform",
            "values": ["Linux"],
        }])
    ```


    :param Sequence[Union['GetContainerRecipesFilterArgs', 'GetContainerRecipesFilterArgsDict']] filters: Configuration block(s) for filtering. Detailed below.
    :param str owner: Owner of the container recipes. Valid values are `Self`, `Shared`, `Amazon` and `ThirdParty`. Defaults to `Self`.
    """
    __args__ = dict()
    __args__['filters'] = filters
    __args__['owner'] = owner
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('aws:imagebuilder/getContainerRecipes:getContainerRecipes', __args__, opts=opts, typ=GetContainerRecipesResult).value

    return AwaitableGetContainerRecipesResult(
        arns=pulumi.get(__ret__, 'arns'),
        filters=pulumi.get(__ret__, 'filters'),
        id=pulumi.get(__ret__, 'id'),
        names=pulumi.get(__ret__, 'names'),
        owner=pulumi.get(__ret__, 'owner'))


@_utilities.lift_output_func(get_container_recipes)
def get_container_recipes_output(filters: Optional[pulumi.Input[Optional[Sequence[Union['GetContainerRecipesFilterArgs', 'GetContainerRecipesFilterArgsDict']]]]] = None,
                                 owner: Optional[pulumi.Input[Optional[str]]] = None,
                                 opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetContainerRecipesResult]:
    """
    Use this data source to get the ARNs and names of Image Builder Container Recipes matching the specified criteria.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_aws as aws

    example = aws.imagebuilder.get_container_recipes(owner="Self",
        filters=[{
            "name": "platform",
            "values": ["Linux"],
        }])
    ```


    :param Sequence[Union['GetContainerRecipesFilterArgs', 'GetContainerRecipesFilterArgsDict']] filters: Configuration block(s) for filtering. Detailed below.
    :param str owner: Owner of the container recipes. Valid values are `Self`, `Shared`, `Amazon` and `ThirdParty`. Defaults to `Self`.
    """
    ...

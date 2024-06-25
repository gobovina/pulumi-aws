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
    'GetImagePipelinesResult',
    'AwaitableGetImagePipelinesResult',
    'get_image_pipelines',
    'get_image_pipelines_output',
]

@pulumi.output_type
class GetImagePipelinesResult:
    """
    A collection of values returned by getImagePipelines.
    """
    def __init__(__self__, arns=None, filters=None, id=None, names=None):
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

    @property
    @pulumi.getter
    def arns(self) -> Sequence[str]:
        """
        Set of ARNs of the matched Image Builder Image Pipelines.
        """
        return pulumi.get(self, "arns")

    @property
    @pulumi.getter
    def filters(self) -> Optional[Sequence['outputs.GetImagePipelinesFilterResult']]:
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
        Set of names of the matched Image Builder Image Pipelines.
        """
        return pulumi.get(self, "names")


class AwaitableGetImagePipelinesResult(GetImagePipelinesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetImagePipelinesResult(
            arns=self.arns,
            filters=self.filters,
            id=self.id,
            names=self.names)


def get_image_pipelines(filters: Optional[Sequence[Union['GetImagePipelinesFilterArgs', 'GetImagePipelinesFilterArgsDict']]] = None,
                        opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetImagePipelinesResult:
    """
    Use this data source to get the ARNs and names of Image Builder Image Pipelines matching the specified criteria.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_aws as aws

    example = aws.imagebuilder.get_image_pipelines(filters=[{
        "name": "name",
        "values": ["example"],
    }])
    ```


    :param Sequence[Union['GetImagePipelinesFilterArgs', 'GetImagePipelinesFilterArgsDict']] filters: Configuration block(s) for filtering. Detailed below.
    """
    __args__ = dict()
    __args__['filters'] = filters
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('aws:imagebuilder/getImagePipelines:getImagePipelines', __args__, opts=opts, typ=GetImagePipelinesResult).value

    return AwaitableGetImagePipelinesResult(
        arns=pulumi.get(__ret__, 'arns'),
        filters=pulumi.get(__ret__, 'filters'),
        id=pulumi.get(__ret__, 'id'),
        names=pulumi.get(__ret__, 'names'))


@_utilities.lift_output_func(get_image_pipelines)
def get_image_pipelines_output(filters: Optional[pulumi.Input[Optional[Sequence[Union['GetImagePipelinesFilterArgs', 'GetImagePipelinesFilterArgsDict']]]]] = None,
                               opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetImagePipelinesResult]:
    """
    Use this data source to get the ARNs and names of Image Builder Image Pipelines matching the specified criteria.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_aws as aws

    example = aws.imagebuilder.get_image_pipelines(filters=[{
        "name": "name",
        "values": ["example"],
    }])
    ```


    :param Sequence[Union['GetImagePipelinesFilterArgs', 'GetImagePipelinesFilterArgsDict']] filters: Configuration block(s) for filtering. Detailed below.
    """
    ...

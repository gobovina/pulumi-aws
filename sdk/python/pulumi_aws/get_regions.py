# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs
from ._inputs import *

__all__ = [
    'GetRegionsResult',
    'AwaitableGetRegionsResult',
    'get_regions',
    'get_regions_output',
]

@pulumi.output_type
class GetRegionsResult:
    """
    A collection of values returned by getRegions.
    """
    def __init__(__self__, all_regions=None, filters=None, id=None, names=None):
        if all_regions and not isinstance(all_regions, bool):
            raise TypeError("Expected argument 'all_regions' to be a bool")
        pulumi.set(__self__, "all_regions", all_regions)
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
    @pulumi.getter(name="allRegions")
    def all_regions(self) -> Optional[bool]:
        return pulumi.get(self, "all_regions")

    @property
    @pulumi.getter
    def filters(self) -> Optional[Sequence['outputs.GetRegionsFilterResult']]:
        return pulumi.get(self, "filters")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        Identifier of the current partition (e.g., `aws` in AWS Commercial, `aws-cn` in AWS China).
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def names(self) -> Sequence[str]:
        """
        Names of regions that meets the criteria.
        """
        return pulumi.get(self, "names")


class AwaitableGetRegionsResult(GetRegionsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetRegionsResult(
            all_regions=self.all_regions,
            filters=self.filters,
            id=self.id,
            names=self.names)


def get_regions(all_regions: Optional[bool] = None,
                filters: Optional[Sequence[pulumi.InputType['GetRegionsFilterArgs']]] = None,
                id: Optional[str] = None,
                opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetRegionsResult:
    """
    Provides information about AWS Regions. Can be used to filter regions i.e., by Opt-In status or only regions enabled for current account. To get details like endpoint and description of each region the data source can be combined with the `get_region` data source.

    ## Example Usage

    Enabled AWS Regions:

    <!--Start PulumiCodeChooser -->
    ```python
    import pulumi
    import pulumi_aws as aws

    current = aws.get_regions()
    ```
    <!--End PulumiCodeChooser -->

    All the regions regardless of the availability

    <!--Start PulumiCodeChooser -->
    ```python
    import pulumi
    import pulumi_aws as aws

    current = aws.get_regions(all_regions=True)
    ```
    <!--End PulumiCodeChooser -->

    To see regions that are filtered by `"not-opted-in"`, the `all_regions` argument needs to be set to `true` or no results will be returned.

    <!--Start PulumiCodeChooser -->
    ```python
    import pulumi
    import pulumi_aws as aws

    current = aws.get_regions(all_regions=True,
        filters=[aws.GetRegionsFilterArgs(
            name="opt-in-status",
            values=["not-opted-in"],
        )])
    ```
    <!--End PulumiCodeChooser -->


    :param bool all_regions: If true the source will query all regions regardless of availability.
    :param Sequence[pulumi.InputType['GetRegionsFilterArgs']] filters: Configuration block(s) to use as filters. Detailed below.
    :param str id: Identifier of the current partition (e.g., `aws` in AWS Commercial, `aws-cn` in AWS China).
    """
    __args__ = dict()
    __args__['allRegions'] = all_regions
    __args__['filters'] = filters
    __args__['id'] = id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('aws:index/getRegions:getRegions', __args__, opts=opts, typ=GetRegionsResult).value

    return AwaitableGetRegionsResult(
        all_regions=pulumi.get(__ret__, 'all_regions'),
        filters=pulumi.get(__ret__, 'filters'),
        id=pulumi.get(__ret__, 'id'),
        names=pulumi.get(__ret__, 'names'))


@_utilities.lift_output_func(get_regions)
def get_regions_output(all_regions: Optional[pulumi.Input[Optional[bool]]] = None,
                       filters: Optional[pulumi.Input[Optional[Sequence[pulumi.InputType['GetRegionsFilterArgs']]]]] = None,
                       id: Optional[pulumi.Input[Optional[str]]] = None,
                       opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetRegionsResult]:
    """
    Provides information about AWS Regions. Can be used to filter regions i.e., by Opt-In status or only regions enabled for current account. To get details like endpoint and description of each region the data source can be combined with the `get_region` data source.

    ## Example Usage

    Enabled AWS Regions:

    <!--Start PulumiCodeChooser -->
    ```python
    import pulumi
    import pulumi_aws as aws

    current = aws.get_regions()
    ```
    <!--End PulumiCodeChooser -->

    All the regions regardless of the availability

    <!--Start PulumiCodeChooser -->
    ```python
    import pulumi
    import pulumi_aws as aws

    current = aws.get_regions(all_regions=True)
    ```
    <!--End PulumiCodeChooser -->

    To see regions that are filtered by `"not-opted-in"`, the `all_regions` argument needs to be set to `true` or no results will be returned.

    <!--Start PulumiCodeChooser -->
    ```python
    import pulumi
    import pulumi_aws as aws

    current = aws.get_regions(all_regions=True,
        filters=[aws.GetRegionsFilterArgs(
            name="opt-in-status",
            values=["not-opted-in"],
        )])
    ```
    <!--End PulumiCodeChooser -->


    :param bool all_regions: If true the source will query all regions regardless of availability.
    :param Sequence[pulumi.InputType['GetRegionsFilterArgs']] filters: Configuration block(s) to use as filters. Detailed below.
    :param str id: Identifier of the current partition (e.g., `aws` in AWS Commercial, `aws-cn` in AWS China).
    """
    ...

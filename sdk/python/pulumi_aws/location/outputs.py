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
    'MapConfiguration',
    'PlaceIndexDataSourceConfiguration',
    'GetMapConfigurationResult',
    'GetPlaceIndexDataSourceConfigurationResult',
]

@pulumi.output_type
class MapConfiguration(dict):
    def __init__(__self__, *,
                 style: str):
        """
        :param str style: Specifies the map style selected from an available data provider. Valid values can be found in the [Location Service CreateMap API Reference](https://docs.aws.amazon.com/location/latest/APIReference/API_CreateMap.html).
        """
        pulumi.set(__self__, "style", style)

    @property
    @pulumi.getter
    def style(self) -> str:
        """
        Specifies the map style selected from an available data provider. Valid values can be found in the [Location Service CreateMap API Reference](https://docs.aws.amazon.com/location/latest/APIReference/API_CreateMap.html).
        """
        return pulumi.get(self, "style")


@pulumi.output_type
class PlaceIndexDataSourceConfiguration(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "intendedUse":
            suggest = "intended_use"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in PlaceIndexDataSourceConfiguration. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        PlaceIndexDataSourceConfiguration.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        PlaceIndexDataSourceConfiguration.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 intended_use: Optional[str] = None):
        """
        :param str intended_use: Specifies how the results of an operation will be stored by the caller. Valid values: `SingleUse`, `Storage`. Default: `SingleUse`.
        """
        if intended_use is not None:
            pulumi.set(__self__, "intended_use", intended_use)

    @property
    @pulumi.getter(name="intendedUse")
    def intended_use(self) -> Optional[str]:
        """
        Specifies how the results of an operation will be stored by the caller. Valid values: `SingleUse`, `Storage`. Default: `SingleUse`.
        """
        return pulumi.get(self, "intended_use")


@pulumi.output_type
class GetMapConfigurationResult(dict):
    def __init__(__self__, *,
                 style: str):
        """
        :param str style: The map style selected from an available data provider.
        """
        pulumi.set(__self__, "style", style)

    @property
    @pulumi.getter
    def style(self) -> str:
        """
        The map style selected from an available data provider.
        """
        return pulumi.get(self, "style")


@pulumi.output_type
class GetPlaceIndexDataSourceConfigurationResult(dict):
    def __init__(__self__, *,
                 intended_use: str):
        pulumi.set(__self__, "intended_use", intended_use)

    @property
    @pulumi.getter(name="intendedUse")
    def intended_use(self) -> str:
        return pulumi.get(self, "intended_use")



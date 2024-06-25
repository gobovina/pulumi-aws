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
    'GetApplicationProvidersResult',
    'AwaitableGetApplicationProvidersResult',
    'get_application_providers',
    'get_application_providers_output',
]

@pulumi.output_type
class GetApplicationProvidersResult:
    """
    A collection of values returned by getApplicationProviders.
    """
    def __init__(__self__, application_providers=None, id=None):
        if application_providers and not isinstance(application_providers, list):
            raise TypeError("Expected argument 'application_providers' to be a list")
        pulumi.set(__self__, "application_providers", application_providers)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)

    @property
    @pulumi.getter(name="applicationProviders")
    def application_providers(self) -> Optional[Sequence['outputs.GetApplicationProvidersApplicationProviderResult']]:
        """
        A list of application providers available in the current region. See `application_providers` below.
        """
        return pulumi.get(self, "application_providers")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        AWS region.
        """
        return pulumi.get(self, "id")


class AwaitableGetApplicationProvidersResult(GetApplicationProvidersResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetApplicationProvidersResult(
            application_providers=self.application_providers,
            id=self.id)


def get_application_providers(application_providers: Optional[Sequence[Union['GetApplicationProvidersApplicationProviderArgs', 'GetApplicationProvidersApplicationProviderArgsDict']]] = None,
                              opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetApplicationProvidersResult:
    """
    Data source for managing AWS SSO Admin Application Providers.

    ## Example Usage

    ### Basic Usage

    ```python
    import pulumi
    import pulumi_aws as aws

    example = aws.ssoadmin.get_application_providers()
    ```


    :param Sequence[Union['GetApplicationProvidersApplicationProviderArgs', 'GetApplicationProvidersApplicationProviderArgsDict']] application_providers: A list of application providers available in the current region. See `application_providers` below.
    """
    __args__ = dict()
    __args__['applicationProviders'] = application_providers
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('aws:ssoadmin/getApplicationProviders:getApplicationProviders', __args__, opts=opts, typ=GetApplicationProvidersResult).value

    return AwaitableGetApplicationProvidersResult(
        application_providers=pulumi.get(__ret__, 'application_providers'),
        id=pulumi.get(__ret__, 'id'))


@_utilities.lift_output_func(get_application_providers)
def get_application_providers_output(application_providers: Optional[pulumi.Input[Optional[Sequence[Union['GetApplicationProvidersApplicationProviderArgs', 'GetApplicationProvidersApplicationProviderArgsDict']]]]] = None,
                                     opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetApplicationProvidersResult]:
    """
    Data source for managing AWS SSO Admin Application Providers.

    ## Example Usage

    ### Basic Usage

    ```python
    import pulumi
    import pulumi_aws as aws

    example = aws.ssoadmin.get_application_providers()
    ```


    :param Sequence[Union['GetApplicationProvidersApplicationProviderArgs', 'GetApplicationProvidersApplicationProviderArgsDict']] application_providers: A list of application providers available in the current region. See `application_providers` below.
    """
    ...

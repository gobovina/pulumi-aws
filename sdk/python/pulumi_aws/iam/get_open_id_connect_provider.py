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
    'GetOpenIdConnectProviderResult',
    'AwaitableGetOpenIdConnectProviderResult',
    'get_open_id_connect_provider',
    'get_open_id_connect_provider_output',
]

@pulumi.output_type
class GetOpenIdConnectProviderResult:
    """
    A collection of values returned by getOpenIdConnectProvider.
    """
    def __init__(__self__, arn=None, client_id_lists=None, id=None, tags=None, thumbprint_lists=None, url=None):
        if arn and not isinstance(arn, str):
            raise TypeError("Expected argument 'arn' to be a str")
        pulumi.set(__self__, "arn", arn)
        if client_id_lists and not isinstance(client_id_lists, list):
            raise TypeError("Expected argument 'client_id_lists' to be a list")
        pulumi.set(__self__, "client_id_lists", client_id_lists)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if tags and not isinstance(tags, dict):
            raise TypeError("Expected argument 'tags' to be a dict")
        pulumi.set(__self__, "tags", tags)
        if thumbprint_lists and not isinstance(thumbprint_lists, list):
            raise TypeError("Expected argument 'thumbprint_lists' to be a list")
        pulumi.set(__self__, "thumbprint_lists", thumbprint_lists)
        if url and not isinstance(url, str):
            raise TypeError("Expected argument 'url' to be a str")
        pulumi.set(__self__, "url", url)

    @property
    @pulumi.getter
    def arn(self) -> str:
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter(name="clientIdLists")
    def client_id_lists(self) -> Sequence[str]:
        """
        List of client IDs (also known as audiences). When a mobile or web app registers with an OpenID Connect provider, they establish a value that identifies the application. (This is the value that's sent as the client_id parameter on OAuth requests.)
        """
        return pulumi.get(self, "client_id_lists")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def tags(self) -> Mapping[str, str]:
        """
        Map of resource tags for the IAM OIDC provider.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter(name="thumbprintLists")
    def thumbprint_lists(self) -> Sequence[str]:
        """
        List of server certificate thumbprints for the OpenID Connect (OIDC) identity provider's server certificate(s).
        """
        return pulumi.get(self, "thumbprint_lists")

    @property
    @pulumi.getter
    def url(self) -> str:
        return pulumi.get(self, "url")


class AwaitableGetOpenIdConnectProviderResult(GetOpenIdConnectProviderResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetOpenIdConnectProviderResult(
            arn=self.arn,
            client_id_lists=self.client_id_lists,
            id=self.id,
            tags=self.tags,
            thumbprint_lists=self.thumbprint_lists,
            url=self.url)


def get_open_id_connect_provider(arn: Optional[str] = None,
                                 tags: Optional[Mapping[str, str]] = None,
                                 url: Optional[str] = None,
                                 opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetOpenIdConnectProviderResult:
    """
    This data source can be used to fetch information about a specific
    IAM OpenID Connect provider. By using this data source, you can retrieve the
    the resource information by either its `arn` or `url`.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_aws as aws

    example = aws.iam.get_open_id_connect_provider(arn="arn:aws:iam::123456789012:oidc-provider/accounts.google.com")
    ```

    ```python
    import pulumi
    import pulumi_aws as aws

    example = aws.iam.get_open_id_connect_provider(url="https://accounts.google.com")
    ```


    :param str arn: ARN of the OpenID Connect provider.
    :param Mapping[str, str] tags: Map of resource tags for the IAM OIDC provider.
    :param str url: URL of the OpenID Connect provider.
    """
    __args__ = dict()
    __args__['arn'] = arn
    __args__['tags'] = tags
    __args__['url'] = url
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('aws:iam/getOpenIdConnectProvider:getOpenIdConnectProvider', __args__, opts=opts, typ=GetOpenIdConnectProviderResult).value

    return AwaitableGetOpenIdConnectProviderResult(
        arn=pulumi.get(__ret__, 'arn'),
        client_id_lists=pulumi.get(__ret__, 'client_id_lists'),
        id=pulumi.get(__ret__, 'id'),
        tags=pulumi.get(__ret__, 'tags'),
        thumbprint_lists=pulumi.get(__ret__, 'thumbprint_lists'),
        url=pulumi.get(__ret__, 'url'))


@_utilities.lift_output_func(get_open_id_connect_provider)
def get_open_id_connect_provider_output(arn: Optional[pulumi.Input[Optional[str]]] = None,
                                        tags: Optional[pulumi.Input[Optional[Mapping[str, str]]]] = None,
                                        url: Optional[pulumi.Input[Optional[str]]] = None,
                                        opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetOpenIdConnectProviderResult]:
    """
    This data source can be used to fetch information about a specific
    IAM OpenID Connect provider. By using this data source, you can retrieve the
    the resource information by either its `arn` or `url`.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_aws as aws

    example = aws.iam.get_open_id_connect_provider(arn="arn:aws:iam::123456789012:oidc-provider/accounts.google.com")
    ```

    ```python
    import pulumi
    import pulumi_aws as aws

    example = aws.iam.get_open_id_connect_provider(url="https://accounts.google.com")
    ```


    :param str arn: ARN of the OpenID Connect provider.
    :param Mapping[str, str] tags: Map of resource tags for the IAM OIDC provider.
    :param str url: URL of the OpenID Connect provider.
    """
    ...

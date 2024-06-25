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
    'ChannelHlsIngestArgs',
    'ChannelHlsIngestArgsDict',
    'ChannelHlsIngestIngestEndpointArgs',
    'ChannelHlsIngestIngestEndpointArgsDict',
]

MYPY = False

if not MYPY:
    class ChannelHlsIngestArgsDict(TypedDict):
        ingest_endpoints: NotRequired[pulumi.Input[Sequence[pulumi.Input['ChannelHlsIngestIngestEndpointArgsDict']]]]
        """
        A list of the ingest endpoints
        """
elif False:
    ChannelHlsIngestArgsDict: TypeAlias = Mapping[str, Any]

@pulumi.input_type
class ChannelHlsIngestArgs:
    def __init__(__self__, *,
                 ingest_endpoints: Optional[pulumi.Input[Sequence[pulumi.Input['ChannelHlsIngestIngestEndpointArgs']]]] = None):
        """
        :param pulumi.Input[Sequence[pulumi.Input['ChannelHlsIngestIngestEndpointArgs']]] ingest_endpoints: A list of the ingest endpoints
        """
        if ingest_endpoints is not None:
            pulumi.set(__self__, "ingest_endpoints", ingest_endpoints)

    @property
    @pulumi.getter(name="ingestEndpoints")
    def ingest_endpoints(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ChannelHlsIngestIngestEndpointArgs']]]]:
        """
        A list of the ingest endpoints
        """
        return pulumi.get(self, "ingest_endpoints")

    @ingest_endpoints.setter
    def ingest_endpoints(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ChannelHlsIngestIngestEndpointArgs']]]]):
        pulumi.set(self, "ingest_endpoints", value)


if not MYPY:
    class ChannelHlsIngestIngestEndpointArgsDict(TypedDict):
        password: NotRequired[pulumi.Input[str]]
        """
        The password
        """
        url: NotRequired[pulumi.Input[str]]
        """
        The URL
        """
        username: NotRequired[pulumi.Input[str]]
        """
        The username
        """
elif False:
    ChannelHlsIngestIngestEndpointArgsDict: TypeAlias = Mapping[str, Any]

@pulumi.input_type
class ChannelHlsIngestIngestEndpointArgs:
    def __init__(__self__, *,
                 password: Optional[pulumi.Input[str]] = None,
                 url: Optional[pulumi.Input[str]] = None,
                 username: Optional[pulumi.Input[str]] = None):
        """
        :param pulumi.Input[str] password: The password
        :param pulumi.Input[str] url: The URL
        :param pulumi.Input[str] username: The username
        """
        if password is not None:
            pulumi.set(__self__, "password", password)
        if url is not None:
            pulumi.set(__self__, "url", url)
        if username is not None:
            pulumi.set(__self__, "username", username)

    @property
    @pulumi.getter
    def password(self) -> Optional[pulumi.Input[str]]:
        """
        The password
        """
        return pulumi.get(self, "password")

    @password.setter
    def password(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "password", value)

    @property
    @pulumi.getter
    def url(self) -> Optional[pulumi.Input[str]]:
        """
        The URL
        """
        return pulumi.get(self, "url")

    @url.setter
    def url(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "url", value)

    @property
    @pulumi.getter
    def username(self) -> Optional[pulumi.Input[str]]:
        """
        The username
        """
        return pulumi.get(self, "username")

    @username.setter
    def username(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "username", value)



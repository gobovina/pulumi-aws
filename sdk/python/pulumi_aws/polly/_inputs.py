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
    'GetVoicesVoiceArgs',
    'GetVoicesVoiceArgsDict',
]

MYPY = False

if not MYPY:
    class GetVoicesVoiceArgsDict(TypedDict):
        additional_language_codes: Sequence[str]
        """
        Additional codes for languages available for the specified voice in addition to its default language.
        """
        gender: str
        """
        Gender of the voice.
        """
        id: str
        """
        Amazon Polly assigned voice ID.
        """
        language_code: str
        """
        Language identification tag for filtering the list of voices returned. If not specified, all available voices are returned.
        """
        language_name: str
        """
        Human readable name of the language in English.
        """
        name: str
        """
        Name of the voice.
        """
        supported_engines: Sequence[str]
        """
        Specifies which engines are supported by a given voice.
        """
elif False:
    GetVoicesVoiceArgsDict: TypeAlias = Mapping[str, Any]

@pulumi.input_type
class GetVoicesVoiceArgs:
    def __init__(__self__, *,
                 additional_language_codes: Sequence[str],
                 gender: str,
                 id: str,
                 language_code: str,
                 language_name: str,
                 name: str,
                 supported_engines: Sequence[str]):
        """
        :param Sequence[str] additional_language_codes: Additional codes for languages available for the specified voice in addition to its default language.
        :param str gender: Gender of the voice.
        :param str id: Amazon Polly assigned voice ID.
        :param str language_code: Language identification tag for filtering the list of voices returned. If not specified, all available voices are returned.
        :param str language_name: Human readable name of the language in English.
        :param str name: Name of the voice.
        :param Sequence[str] supported_engines: Specifies which engines are supported by a given voice.
        """
        pulumi.set(__self__, "additional_language_codes", additional_language_codes)
        pulumi.set(__self__, "gender", gender)
        pulumi.set(__self__, "id", id)
        pulumi.set(__self__, "language_code", language_code)
        pulumi.set(__self__, "language_name", language_name)
        pulumi.set(__self__, "name", name)
        pulumi.set(__self__, "supported_engines", supported_engines)

    @property
    @pulumi.getter(name="additionalLanguageCodes")
    def additional_language_codes(self) -> Sequence[str]:
        """
        Additional codes for languages available for the specified voice in addition to its default language.
        """
        return pulumi.get(self, "additional_language_codes")

    @additional_language_codes.setter
    def additional_language_codes(self, value: Sequence[str]):
        pulumi.set(self, "additional_language_codes", value)

    @property
    @pulumi.getter
    def gender(self) -> str:
        """
        Gender of the voice.
        """
        return pulumi.get(self, "gender")

    @gender.setter
    def gender(self, value: str):
        pulumi.set(self, "gender", value)

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        Amazon Polly assigned voice ID.
        """
        return pulumi.get(self, "id")

    @id.setter
    def id(self, value: str):
        pulumi.set(self, "id", value)

    @property
    @pulumi.getter(name="languageCode")
    def language_code(self) -> str:
        """
        Language identification tag for filtering the list of voices returned. If not specified, all available voices are returned.
        """
        return pulumi.get(self, "language_code")

    @language_code.setter
    def language_code(self, value: str):
        pulumi.set(self, "language_code", value)

    @property
    @pulumi.getter(name="languageName")
    def language_name(self) -> str:
        """
        Human readable name of the language in English.
        """
        return pulumi.get(self, "language_name")

    @language_name.setter
    def language_name(self, value: str):
        pulumi.set(self, "language_name", value)

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        Name of the voice.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: str):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="supportedEngines")
    def supported_engines(self) -> Sequence[str]:
        """
        Specifies which engines are supported by a given voice.
        """
        return pulumi.get(self, "supported_engines")

    @supported_engines.setter
    def supported_engines(self, value: Sequence[str]):
        pulumi.set(self, "supported_engines", value)



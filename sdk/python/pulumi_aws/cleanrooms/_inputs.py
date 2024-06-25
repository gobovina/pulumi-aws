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
    'CollaborationDataEncryptionMetadataArgs',
    'CollaborationDataEncryptionMetadataArgsDict',
    'CollaborationMemberArgs',
    'CollaborationMemberArgsDict',
    'ConfiguredTableTableReferenceArgs',
    'ConfiguredTableTableReferenceArgsDict',
]

MYPY = False

if not MYPY:
    class CollaborationDataEncryptionMetadataArgsDict(TypedDict):
        allow_clear_text: pulumi.Input[bool]
        allow_duplicates: pulumi.Input[bool]
        allow_joins_on_columns_with_different_names: pulumi.Input[bool]
        preserve_nulls: pulumi.Input[bool]
elif False:
    CollaborationDataEncryptionMetadataArgsDict: TypeAlias = Mapping[str, Any]

@pulumi.input_type
class CollaborationDataEncryptionMetadataArgs:
    def __init__(__self__, *,
                 allow_clear_text: pulumi.Input[bool],
                 allow_duplicates: pulumi.Input[bool],
                 allow_joins_on_columns_with_different_names: pulumi.Input[bool],
                 preserve_nulls: pulumi.Input[bool]):
        pulumi.set(__self__, "allow_clear_text", allow_clear_text)
        pulumi.set(__self__, "allow_duplicates", allow_duplicates)
        pulumi.set(__self__, "allow_joins_on_columns_with_different_names", allow_joins_on_columns_with_different_names)
        pulumi.set(__self__, "preserve_nulls", preserve_nulls)

    @property
    @pulumi.getter(name="allowClearText")
    def allow_clear_text(self) -> pulumi.Input[bool]:
        return pulumi.get(self, "allow_clear_text")

    @allow_clear_text.setter
    def allow_clear_text(self, value: pulumi.Input[bool]):
        pulumi.set(self, "allow_clear_text", value)

    @property
    @pulumi.getter(name="allowDuplicates")
    def allow_duplicates(self) -> pulumi.Input[bool]:
        return pulumi.get(self, "allow_duplicates")

    @allow_duplicates.setter
    def allow_duplicates(self, value: pulumi.Input[bool]):
        pulumi.set(self, "allow_duplicates", value)

    @property
    @pulumi.getter(name="allowJoinsOnColumnsWithDifferentNames")
    def allow_joins_on_columns_with_different_names(self) -> pulumi.Input[bool]:
        return pulumi.get(self, "allow_joins_on_columns_with_different_names")

    @allow_joins_on_columns_with_different_names.setter
    def allow_joins_on_columns_with_different_names(self, value: pulumi.Input[bool]):
        pulumi.set(self, "allow_joins_on_columns_with_different_names", value)

    @property
    @pulumi.getter(name="preserveNulls")
    def preserve_nulls(self) -> pulumi.Input[bool]:
        return pulumi.get(self, "preserve_nulls")

    @preserve_nulls.setter
    def preserve_nulls(self, value: pulumi.Input[bool]):
        pulumi.set(self, "preserve_nulls", value)


if not MYPY:
    class CollaborationMemberArgsDict(TypedDict):
        account_id: pulumi.Input[str]
        display_name: pulumi.Input[str]
        member_abilities: pulumi.Input[Sequence[pulumi.Input[str]]]
        status: NotRequired[pulumi.Input[str]]
elif False:
    CollaborationMemberArgsDict: TypeAlias = Mapping[str, Any]

@pulumi.input_type
class CollaborationMemberArgs:
    def __init__(__self__, *,
                 account_id: pulumi.Input[str],
                 display_name: pulumi.Input[str],
                 member_abilities: pulumi.Input[Sequence[pulumi.Input[str]]],
                 status: Optional[pulumi.Input[str]] = None):
        pulumi.set(__self__, "account_id", account_id)
        pulumi.set(__self__, "display_name", display_name)
        pulumi.set(__self__, "member_abilities", member_abilities)
        if status is not None:
            pulumi.set(__self__, "status", status)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> pulumi.Input[str]:
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "account_id", value)

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> pulumi.Input[str]:
        return pulumi.get(self, "display_name")

    @display_name.setter
    def display_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "display_name", value)

    @property
    @pulumi.getter(name="memberAbilities")
    def member_abilities(self) -> pulumi.Input[Sequence[pulumi.Input[str]]]:
        return pulumi.get(self, "member_abilities")

    @member_abilities.setter
    def member_abilities(self, value: pulumi.Input[Sequence[pulumi.Input[str]]]):
        pulumi.set(self, "member_abilities", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status", value)


if not MYPY:
    class ConfiguredTableTableReferenceArgsDict(TypedDict):
        database_name: pulumi.Input[str]
        table_name: pulumi.Input[str]
elif False:
    ConfiguredTableTableReferenceArgsDict: TypeAlias = Mapping[str, Any]

@pulumi.input_type
class ConfiguredTableTableReferenceArgs:
    def __init__(__self__, *,
                 database_name: pulumi.Input[str],
                 table_name: pulumi.Input[str]):
        pulumi.set(__self__, "database_name", database_name)
        pulumi.set(__self__, "table_name", table_name)

    @property
    @pulumi.getter(name="databaseName")
    def database_name(self) -> pulumi.Input[str]:
        return pulumi.get(self, "database_name")

    @database_name.setter
    def database_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "database_name", value)

    @property
    @pulumi.getter(name="tableName")
    def table_name(self) -> pulumi.Input[str]:
        return pulumi.get(self, "table_name")

    @table_name.setter
    def table_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "table_name", value)



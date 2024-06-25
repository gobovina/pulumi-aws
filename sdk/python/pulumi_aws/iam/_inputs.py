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
from ._enums import *

__all__ = [
    'RoleInlinePolicyArgs',
    'RoleInlinePolicyArgsDict',
    'GetPolicyDocumentStatementArgs',
    'GetPolicyDocumentStatementArgsDict',
    'GetPolicyDocumentStatementConditionArgs',
    'GetPolicyDocumentStatementConditionArgsDict',
    'GetPolicyDocumentStatementNotPrincipalArgs',
    'GetPolicyDocumentStatementNotPrincipalArgsDict',
    'GetPolicyDocumentStatementPrincipalArgs',
    'GetPolicyDocumentStatementPrincipalArgsDict',
    'GetPrincipalPolicySimulationContextArgs',
    'GetPrincipalPolicySimulationContextArgsDict',
]

MYPY = False

if not MYPY:
    class RoleInlinePolicyArgsDict(TypedDict):
        name: NotRequired[pulumi.Input[str]]
        """
        Name of the role policy.
        """
        policy: NotRequired[pulumi.Input[str]]
        """
        Policy document as a JSON formatted string.
        """
elif False:
    RoleInlinePolicyArgsDict: TypeAlias = Mapping[str, Any]

@pulumi.input_type
class RoleInlinePolicyArgs:
    def __init__(__self__, *,
                 name: Optional[pulumi.Input[str]] = None,
                 policy: Optional[pulumi.Input[str]] = None):
        """
        :param pulumi.Input[str] name: Name of the role policy.
        :param pulumi.Input[str] policy: Policy document as a JSON formatted string.
        """
        if name is not None:
            pulumi.set(__self__, "name", name)
        if policy is not None:
            pulumi.set(__self__, "policy", policy)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the role policy.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def policy(self) -> Optional[pulumi.Input[str]]:
        """
        Policy document as a JSON formatted string.
        """
        return pulumi.get(self, "policy")

    @policy.setter
    def policy(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "policy", value)


if not MYPY:
    class GetPolicyDocumentStatementArgsDict(TypedDict):
        actions: NotRequired[Sequence[str]]
        """
        List of actions that this statement either allows or denies. For example, `["ec2:RunInstances", "s3:*"]`.
        """
        conditions: NotRequired[Sequence['GetPolicyDocumentStatementConditionArgsDict']]
        """
        Configuration block for a condition. Detailed below.
        """
        effect: NotRequired[str]
        """
        Whether this statement allows or denies the given actions. Valid values are `Allow` and `Deny`. Defaults to `Allow`.
        """
        not_actions: NotRequired[Sequence[str]]
        """
        List of actions that this statement does *not* apply to. Use to apply a policy statement to all actions *except* those listed.
        """
        not_principals: NotRequired[Sequence['GetPolicyDocumentStatementNotPrincipalArgsDict']]
        """
        Like `principals` except these are principals that the statement does *not* apply to.
        """
        not_resources: NotRequired[Sequence[str]]
        """
        List of resource ARNs that this statement does *not* apply to. Use to apply a policy statement to all resources *except* those listed. Conflicts with `resources`.
        """
        principals: NotRequired[Sequence['GetPolicyDocumentStatementPrincipalArgsDict']]
        """
        Configuration block for principals. Detailed below.
        """
        resources: NotRequired[Sequence[str]]
        """
        List of resource ARNs that this statement applies to. This is required by AWS if used for an IAM policy. Conflicts with `not_resources`.
        """
        sid: NotRequired[str]
        """
        Sid (statement ID) is an identifier for a policy statement.
        """
elif False:
    GetPolicyDocumentStatementArgsDict: TypeAlias = Mapping[str, Any]

@pulumi.input_type
class GetPolicyDocumentStatementArgs:
    def __init__(__self__, *,
                 actions: Optional[Sequence[str]] = None,
                 conditions: Optional[Sequence['GetPolicyDocumentStatementConditionArgs']] = None,
                 effect: Optional[str] = None,
                 not_actions: Optional[Sequence[str]] = None,
                 not_principals: Optional[Sequence['GetPolicyDocumentStatementNotPrincipalArgs']] = None,
                 not_resources: Optional[Sequence[str]] = None,
                 principals: Optional[Sequence['GetPolicyDocumentStatementPrincipalArgs']] = None,
                 resources: Optional[Sequence[str]] = None,
                 sid: Optional[str] = None):
        """
        :param Sequence[str] actions: List of actions that this statement either allows or denies. For example, `["ec2:RunInstances", "s3:*"]`.
        :param Sequence['GetPolicyDocumentStatementConditionArgs'] conditions: Configuration block for a condition. Detailed below.
        :param str effect: Whether this statement allows or denies the given actions. Valid values are `Allow` and `Deny`. Defaults to `Allow`.
        :param Sequence[str] not_actions: List of actions that this statement does *not* apply to. Use to apply a policy statement to all actions *except* those listed.
        :param Sequence['GetPolicyDocumentStatementNotPrincipalArgs'] not_principals: Like `principals` except these are principals that the statement does *not* apply to.
        :param Sequence[str] not_resources: List of resource ARNs that this statement does *not* apply to. Use to apply a policy statement to all resources *except* those listed. Conflicts with `resources`.
        :param Sequence['GetPolicyDocumentStatementPrincipalArgs'] principals: Configuration block for principals. Detailed below.
        :param Sequence[str] resources: List of resource ARNs that this statement applies to. This is required by AWS if used for an IAM policy. Conflicts with `not_resources`.
        :param str sid: Sid (statement ID) is an identifier for a policy statement.
        """
        if actions is not None:
            pulumi.set(__self__, "actions", actions)
        if conditions is not None:
            pulumi.set(__self__, "conditions", conditions)
        if effect is not None:
            pulumi.set(__self__, "effect", effect)
        if not_actions is not None:
            pulumi.set(__self__, "not_actions", not_actions)
        if not_principals is not None:
            pulumi.set(__self__, "not_principals", not_principals)
        if not_resources is not None:
            pulumi.set(__self__, "not_resources", not_resources)
        if principals is not None:
            pulumi.set(__self__, "principals", principals)
        if resources is not None:
            pulumi.set(__self__, "resources", resources)
        if sid is not None:
            pulumi.set(__self__, "sid", sid)

    @property
    @pulumi.getter
    def actions(self) -> Optional[Sequence[str]]:
        """
        List of actions that this statement either allows or denies. For example, `["ec2:RunInstances", "s3:*"]`.
        """
        return pulumi.get(self, "actions")

    @actions.setter
    def actions(self, value: Optional[Sequence[str]]):
        pulumi.set(self, "actions", value)

    @property
    @pulumi.getter
    def conditions(self) -> Optional[Sequence['GetPolicyDocumentStatementConditionArgs']]:
        """
        Configuration block for a condition. Detailed below.
        """
        return pulumi.get(self, "conditions")

    @conditions.setter
    def conditions(self, value: Optional[Sequence['GetPolicyDocumentStatementConditionArgs']]):
        pulumi.set(self, "conditions", value)

    @property
    @pulumi.getter
    def effect(self) -> Optional[str]:
        """
        Whether this statement allows or denies the given actions. Valid values are `Allow` and `Deny`. Defaults to `Allow`.
        """
        return pulumi.get(self, "effect")

    @effect.setter
    def effect(self, value: Optional[str]):
        pulumi.set(self, "effect", value)

    @property
    @pulumi.getter(name="notActions")
    def not_actions(self) -> Optional[Sequence[str]]:
        """
        List of actions that this statement does *not* apply to. Use to apply a policy statement to all actions *except* those listed.
        """
        return pulumi.get(self, "not_actions")

    @not_actions.setter
    def not_actions(self, value: Optional[Sequence[str]]):
        pulumi.set(self, "not_actions", value)

    @property
    @pulumi.getter(name="notPrincipals")
    def not_principals(self) -> Optional[Sequence['GetPolicyDocumentStatementNotPrincipalArgs']]:
        """
        Like `principals` except these are principals that the statement does *not* apply to.
        """
        return pulumi.get(self, "not_principals")

    @not_principals.setter
    def not_principals(self, value: Optional[Sequence['GetPolicyDocumentStatementNotPrincipalArgs']]):
        pulumi.set(self, "not_principals", value)

    @property
    @pulumi.getter(name="notResources")
    def not_resources(self) -> Optional[Sequence[str]]:
        """
        List of resource ARNs that this statement does *not* apply to. Use to apply a policy statement to all resources *except* those listed. Conflicts with `resources`.
        """
        return pulumi.get(self, "not_resources")

    @not_resources.setter
    def not_resources(self, value: Optional[Sequence[str]]):
        pulumi.set(self, "not_resources", value)

    @property
    @pulumi.getter
    def principals(self) -> Optional[Sequence['GetPolicyDocumentStatementPrincipalArgs']]:
        """
        Configuration block for principals. Detailed below.
        """
        return pulumi.get(self, "principals")

    @principals.setter
    def principals(self, value: Optional[Sequence['GetPolicyDocumentStatementPrincipalArgs']]):
        pulumi.set(self, "principals", value)

    @property
    @pulumi.getter
    def resources(self) -> Optional[Sequence[str]]:
        """
        List of resource ARNs that this statement applies to. This is required by AWS if used for an IAM policy. Conflicts with `not_resources`.
        """
        return pulumi.get(self, "resources")

    @resources.setter
    def resources(self, value: Optional[Sequence[str]]):
        pulumi.set(self, "resources", value)

    @property
    @pulumi.getter
    def sid(self) -> Optional[str]:
        """
        Sid (statement ID) is an identifier for a policy statement.
        """
        return pulumi.get(self, "sid")

    @sid.setter
    def sid(self, value: Optional[str]):
        pulumi.set(self, "sid", value)


if not MYPY:
    class GetPolicyDocumentStatementConditionArgsDict(TypedDict):
        test: str
        """
        Name of the [IAM condition operator](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_condition_operators.html) to evaluate.
        """
        values: Sequence[str]
        """
        Values to evaluate the condition against. If multiple values are provided, the condition matches if at least one of them applies. That is, AWS evaluates multiple values as though using an "OR" boolean operation.
        """
        variable: str
        """
        Name of a [Context Variable](http://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements.html#AvailableKeys) to apply the condition to. Context variables may either be standard AWS variables starting with `aws:` or service-specific variables prefixed with the service name.
        """
elif False:
    GetPolicyDocumentStatementConditionArgsDict: TypeAlias = Mapping[str, Any]

@pulumi.input_type
class GetPolicyDocumentStatementConditionArgs:
    def __init__(__self__, *,
                 test: str,
                 values: Sequence[str],
                 variable: str):
        """
        :param str test: Name of the [IAM condition operator](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_condition_operators.html) to evaluate.
        :param Sequence[str] values: Values to evaluate the condition against. If multiple values are provided, the condition matches if at least one of them applies. That is, AWS evaluates multiple values as though using an "OR" boolean operation.
        :param str variable: Name of a [Context Variable](http://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements.html#AvailableKeys) to apply the condition to. Context variables may either be standard AWS variables starting with `aws:` or service-specific variables prefixed with the service name.
        """
        pulumi.set(__self__, "test", test)
        pulumi.set(__self__, "values", values)
        pulumi.set(__self__, "variable", variable)

    @property
    @pulumi.getter
    def test(self) -> str:
        """
        Name of the [IAM condition operator](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_condition_operators.html) to evaluate.
        """
        return pulumi.get(self, "test")

    @test.setter
    def test(self, value: str):
        pulumi.set(self, "test", value)

    @property
    @pulumi.getter
    def values(self) -> Sequence[str]:
        """
        Values to evaluate the condition against. If multiple values are provided, the condition matches if at least one of them applies. That is, AWS evaluates multiple values as though using an "OR" boolean operation.
        """
        return pulumi.get(self, "values")

    @values.setter
    def values(self, value: Sequence[str]):
        pulumi.set(self, "values", value)

    @property
    @pulumi.getter
    def variable(self) -> str:
        """
        Name of a [Context Variable](http://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements.html#AvailableKeys) to apply the condition to. Context variables may either be standard AWS variables starting with `aws:` or service-specific variables prefixed with the service name.
        """
        return pulumi.get(self, "variable")

    @variable.setter
    def variable(self, value: str):
        pulumi.set(self, "variable", value)


if not MYPY:
    class GetPolicyDocumentStatementNotPrincipalArgsDict(TypedDict):
        identifiers: Sequence[str]
        type: str
elif False:
    GetPolicyDocumentStatementNotPrincipalArgsDict: TypeAlias = Mapping[str, Any]

@pulumi.input_type
class GetPolicyDocumentStatementNotPrincipalArgs:
    def __init__(__self__, *,
                 identifiers: Sequence[str],
                 type: str):
        pulumi.set(__self__, "identifiers", identifiers)
        pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter
    def identifiers(self) -> Sequence[str]:
        return pulumi.get(self, "identifiers")

    @identifiers.setter
    def identifiers(self, value: Sequence[str]):
        pulumi.set(self, "identifiers", value)

    @property
    @pulumi.getter
    def type(self) -> str:
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: str):
        pulumi.set(self, "type", value)


if not MYPY:
    class GetPolicyDocumentStatementPrincipalArgsDict(TypedDict):
        identifiers: Sequence[str]
        """
        List of identifiers for principals. When `type` is `AWS`, these are IAM principal ARNs, e.g., `arn:aws:iam::12345678901:role/yak-role`.  When `type` is `Service`, these are AWS Service roles, e.g., `lambda.amazonaws.com`. When `type` is `Federated`, these are web identity users or SAML provider ARNs, e.g., `accounts.google.com` or `arn:aws:iam::12345678901:saml-provider/yak-saml-provider`. When `type` is `CanonicalUser`, these are [canonical user IDs](https://docs.aws.amazon.com/general/latest/gr/acct-identifiers.html#FindingCanonicalId), e.g., `79a59df900b949e55d96a1e698fbacedfd6e09d98eacf8f8d5218e7cd47ef2be`.
        """
        type: str
        """
        Type of principal. Valid values include `AWS`, `Service`, `Federated`, `CanonicalUser` and `*`.
        """
elif False:
    GetPolicyDocumentStatementPrincipalArgsDict: TypeAlias = Mapping[str, Any]

@pulumi.input_type
class GetPolicyDocumentStatementPrincipalArgs:
    def __init__(__self__, *,
                 identifiers: Sequence[str],
                 type: str):
        """
        :param Sequence[str] identifiers: List of identifiers for principals. When `type` is `AWS`, these are IAM principal ARNs, e.g., `arn:aws:iam::12345678901:role/yak-role`.  When `type` is `Service`, these are AWS Service roles, e.g., `lambda.amazonaws.com`. When `type` is `Federated`, these are web identity users or SAML provider ARNs, e.g., `accounts.google.com` or `arn:aws:iam::12345678901:saml-provider/yak-saml-provider`. When `type` is `CanonicalUser`, these are [canonical user IDs](https://docs.aws.amazon.com/general/latest/gr/acct-identifiers.html#FindingCanonicalId), e.g., `79a59df900b949e55d96a1e698fbacedfd6e09d98eacf8f8d5218e7cd47ef2be`.
        :param str type: Type of principal. Valid values include `AWS`, `Service`, `Federated`, `CanonicalUser` and `*`.
        """
        pulumi.set(__self__, "identifiers", identifiers)
        pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter
    def identifiers(self) -> Sequence[str]:
        """
        List of identifiers for principals. When `type` is `AWS`, these are IAM principal ARNs, e.g., `arn:aws:iam::12345678901:role/yak-role`.  When `type` is `Service`, these are AWS Service roles, e.g., `lambda.amazonaws.com`. When `type` is `Federated`, these are web identity users or SAML provider ARNs, e.g., `accounts.google.com` or `arn:aws:iam::12345678901:saml-provider/yak-saml-provider`. When `type` is `CanonicalUser`, these are [canonical user IDs](https://docs.aws.amazon.com/general/latest/gr/acct-identifiers.html#FindingCanonicalId), e.g., `79a59df900b949e55d96a1e698fbacedfd6e09d98eacf8f8d5218e7cd47ef2be`.
        """
        return pulumi.get(self, "identifiers")

    @identifiers.setter
    def identifiers(self, value: Sequence[str]):
        pulumi.set(self, "identifiers", value)

    @property
    @pulumi.getter
    def type(self) -> str:
        """
        Type of principal. Valid values include `AWS`, `Service`, `Federated`, `CanonicalUser` and `*`.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: str):
        pulumi.set(self, "type", value)


if not MYPY:
    class GetPrincipalPolicySimulationContextArgsDict(TypedDict):
        key: str
        """
        The context _condition key_ to set.

        If you have policies containing `Condition` elements or using dynamic interpolations then you will need to provide suitable values for each condition key your policies use. See [Actions, resources, and condition keys for AWS services](https://docs.aws.amazon.com/service-authorization/latest/reference/reference_policies_actions-resources-contextkeys.html) to find the various condition keys that are normally provided for real requests to each action of each AWS service.
        """
        type: str
        """
        An IAM value type that determines how the policy simulator will interpret the strings given in `values`.

        For more information, see the `ContextKeyType` field of [`iam.ContextEntry`](https://docs.aws.amazon.com/IAM/latest/APIReference/API_ContextEntry.html) in the underlying API.
        """
        values: Sequence[str]
        """
        A set of one or more values for this context entry.
        """
elif False:
    GetPrincipalPolicySimulationContextArgsDict: TypeAlias = Mapping[str, Any]

@pulumi.input_type
class GetPrincipalPolicySimulationContextArgs:
    def __init__(__self__, *,
                 key: str,
                 type: str,
                 values: Sequence[str]):
        """
        :param str key: The context _condition key_ to set.
               
               If you have policies containing `Condition` elements or using dynamic interpolations then you will need to provide suitable values for each condition key your policies use. See [Actions, resources, and condition keys for AWS services](https://docs.aws.amazon.com/service-authorization/latest/reference/reference_policies_actions-resources-contextkeys.html) to find the various condition keys that are normally provided for real requests to each action of each AWS service.
        :param str type: An IAM value type that determines how the policy simulator will interpret the strings given in `values`.
               
               For more information, see the `ContextKeyType` field of [`iam.ContextEntry`](https://docs.aws.amazon.com/IAM/latest/APIReference/API_ContextEntry.html) in the underlying API.
        :param Sequence[str] values: A set of one or more values for this context entry.
        """
        pulumi.set(__self__, "key", key)
        pulumi.set(__self__, "type", type)
        pulumi.set(__self__, "values", values)

    @property
    @pulumi.getter
    def key(self) -> str:
        """
        The context _condition key_ to set.

        If you have policies containing `Condition` elements or using dynamic interpolations then you will need to provide suitable values for each condition key your policies use. See [Actions, resources, and condition keys for AWS services](https://docs.aws.amazon.com/service-authorization/latest/reference/reference_policies_actions-resources-contextkeys.html) to find the various condition keys that are normally provided for real requests to each action of each AWS service.
        """
        return pulumi.get(self, "key")

    @key.setter
    def key(self, value: str):
        pulumi.set(self, "key", value)

    @property
    @pulumi.getter
    def type(self) -> str:
        """
        An IAM value type that determines how the policy simulator will interpret the strings given in `values`.

        For more information, see the `ContextKeyType` field of [`iam.ContextEntry`](https://docs.aws.amazon.com/IAM/latest/APIReference/API_ContextEntry.html) in the underlying API.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: str):
        pulumi.set(self, "type", value)

    @property
    @pulumi.getter
    def values(self) -> Sequence[str]:
        """
        A set of one or more values for this context entry.
        """
        return pulumi.get(self, "values")

    @values.setter
    def values(self, value: Sequence[str]):
        pulumi.set(self, "values", value)



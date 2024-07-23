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
from ._enums import *

__all__ = [
    'RoleInlinePolicy',
    'GetAccessKeysAccessKeyResult',
    'GetGroupUserResult',
    'GetPolicyDocumentStatementResult',
    'GetPolicyDocumentStatementConditionResult',
    'GetPolicyDocumentStatementNotPrincipalResult',
    'GetPolicyDocumentStatementPrincipalResult',
    'GetPrincipalPolicySimulationContextResult',
    'GetPrincipalPolicySimulationResultResult',
    'GetPrincipalPolicySimulationResultMatchedStatementResult',
    'GetRoleRoleLastUsedResult',
]

@pulumi.output_type
class RoleInlinePolicy(dict):
    def __init__(__self__, *,
                 name: Optional[str] = None,
                 policy: Optional[str] = None):
        """
        :param str name: Name of the role policy.
        :param str policy: Policy document as a JSON formatted string.
        """
        if name is not None:
            pulumi.set(__self__, "name", name)
        if policy is not None:
            pulumi.set(__self__, "policy", policy)

    @property
    @pulumi.getter
    def name(self) -> Optional[str]:
        """
        Name of the role policy.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def policy(self) -> Optional[str]:
        """
        Policy document as a JSON formatted string.
        """
        return pulumi.get(self, "policy")


@pulumi.output_type
class GetAccessKeysAccessKeyResult(dict):
    def __init__(__self__, *,
                 access_key_id: str,
                 create_date: str,
                 status: str):
        """
        :param str access_key_id: Access key ID.
        :param str create_date: Date and time in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) that the access key was created.
        :param str status: Access key status. Possible values are `Active` and `Inactive`.
        """
        pulumi.set(__self__, "access_key_id", access_key_id)
        pulumi.set(__self__, "create_date", create_date)
        pulumi.set(__self__, "status", status)

    @property
    @pulumi.getter(name="accessKeyId")
    def access_key_id(self) -> str:
        """
        Access key ID.
        """
        return pulumi.get(self, "access_key_id")

    @property
    @pulumi.getter(name="createDate")
    def create_date(self) -> str:
        """
        Date and time in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) that the access key was created.
        """
        return pulumi.get(self, "create_date")

    @property
    @pulumi.getter
    def status(self) -> str:
        """
        Access key status. Possible values are `Active` and `Inactive`.
        """
        return pulumi.get(self, "status")


@pulumi.output_type
class GetGroupUserResult(dict):
    def __init__(__self__, *,
                 arn: str,
                 path: str,
                 user_id: str,
                 user_name: str):
        """
        :param str arn: User ARN.
        :param str path: Path to the IAM user.
        :param str user_id: Stable and unique string identifying the IAM user.
        :param str user_name: Name of the IAM user.
        """
        pulumi.set(__self__, "arn", arn)
        pulumi.set(__self__, "path", path)
        pulumi.set(__self__, "user_id", user_id)
        pulumi.set(__self__, "user_name", user_name)

    @property
    @pulumi.getter
    def arn(self) -> str:
        """
        User ARN.
        """
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter
    def path(self) -> str:
        """
        Path to the IAM user.
        """
        return pulumi.get(self, "path")

    @property
    @pulumi.getter(name="userId")
    def user_id(self) -> str:
        """
        Stable and unique string identifying the IAM user.
        """
        return pulumi.get(self, "user_id")

    @property
    @pulumi.getter(name="userName")
    def user_name(self) -> str:
        """
        Name of the IAM user.
        """
        return pulumi.get(self, "user_name")


@pulumi.output_type
class GetPolicyDocumentStatementResult(dict):
    def __init__(__self__, *,
                 actions: Optional[Sequence[str]] = None,
                 conditions: Optional[Sequence['outputs.GetPolicyDocumentStatementConditionResult']] = None,
                 effect: Optional[str] = None,
                 not_actions: Optional[Sequence[str]] = None,
                 not_principals: Optional[Sequence['outputs.GetPolicyDocumentStatementNotPrincipalResult']] = None,
                 not_resources: Optional[Sequence[str]] = None,
                 principals: Optional[Sequence['outputs.GetPolicyDocumentStatementPrincipalResult']] = None,
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

    @property
    @pulumi.getter
    def conditions(self) -> Optional[Sequence['outputs.GetPolicyDocumentStatementConditionResult']]:
        """
        Configuration block for a condition. Detailed below.
        """
        return pulumi.get(self, "conditions")

    @property
    @pulumi.getter
    def effect(self) -> Optional[str]:
        """
        Whether this statement allows or denies the given actions. Valid values are `Allow` and `Deny`. Defaults to `Allow`.
        """
        return pulumi.get(self, "effect")

    @property
    @pulumi.getter(name="notActions")
    def not_actions(self) -> Optional[Sequence[str]]:
        """
        List of actions that this statement does *not* apply to. Use to apply a policy statement to all actions *except* those listed.
        """
        return pulumi.get(self, "not_actions")

    @property
    @pulumi.getter(name="notPrincipals")
    def not_principals(self) -> Optional[Sequence['outputs.GetPolicyDocumentStatementNotPrincipalResult']]:
        """
        Like `principals` except these are principals that the statement does *not* apply to.
        """
        return pulumi.get(self, "not_principals")

    @property
    @pulumi.getter(name="notResources")
    def not_resources(self) -> Optional[Sequence[str]]:
        """
        List of resource ARNs that this statement does *not* apply to. Use to apply a policy statement to all resources *except* those listed. Conflicts with `resources`.
        """
        return pulumi.get(self, "not_resources")

    @property
    @pulumi.getter
    def principals(self) -> Optional[Sequence['outputs.GetPolicyDocumentStatementPrincipalResult']]:
        """
        Configuration block for principals. Detailed below.
        """
        return pulumi.get(self, "principals")

    @property
    @pulumi.getter
    def resources(self) -> Optional[Sequence[str]]:
        """
        List of resource ARNs that this statement applies to. This is required by AWS if used for an IAM policy. Conflicts with `not_resources`.
        """
        return pulumi.get(self, "resources")

    @property
    @pulumi.getter
    def sid(self) -> Optional[str]:
        """
        Sid (statement ID) is an identifier for a policy statement.
        """
        return pulumi.get(self, "sid")


@pulumi.output_type
class GetPolicyDocumentStatementConditionResult(dict):
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

    @property
    @pulumi.getter
    def values(self) -> Sequence[str]:
        """
        Values to evaluate the condition against. If multiple values are provided, the condition matches if at least one of them applies. That is, AWS evaluates multiple values as though using an "OR" boolean operation.
        """
        return pulumi.get(self, "values")

    @property
    @pulumi.getter
    def variable(self) -> str:
        """
        Name of a [Context Variable](http://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements.html#AvailableKeys) to apply the condition to. Context variables may either be standard AWS variables starting with `aws:` or service-specific variables prefixed with the service name.
        """
        return pulumi.get(self, "variable")


@pulumi.output_type
class GetPolicyDocumentStatementNotPrincipalResult(dict):
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

    @property
    @pulumi.getter
    def type(self) -> str:
        """
        Type of principal. Valid values include `AWS`, `Service`, `Federated`, `CanonicalUser` and `*`.
        """
        return pulumi.get(self, "type")


@pulumi.output_type
class GetPolicyDocumentStatementPrincipalResult(dict):
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

    @property
    @pulumi.getter
    def type(self) -> str:
        """
        Type of principal. Valid values include `AWS`, `Service`, `Federated`, `CanonicalUser` and `*`.
        """
        return pulumi.get(self, "type")


@pulumi.output_type
class GetPrincipalPolicySimulationContextResult(dict):
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

    @property
    @pulumi.getter
    def type(self) -> str:
        """
        An IAM value type that determines how the policy simulator will interpret the strings given in `values`.

        For more information, see the `ContextKeyType` field of [`iam.ContextEntry`](https://docs.aws.amazon.com/IAM/latest/APIReference/API_ContextEntry.html) in the underlying API.
        """
        return pulumi.get(self, "type")

    @property
    @pulumi.getter
    def values(self) -> Sequence[str]:
        """
        A set of one or more values for this context entry.
        """
        return pulumi.get(self, "values")


@pulumi.output_type
class GetPrincipalPolicySimulationResultResult(dict):
    def __init__(__self__, *,
                 action_name: str,
                 allowed: bool,
                 decision: str,
                 decision_details: Mapping[str, str],
                 matched_statements: Sequence['outputs.GetPrincipalPolicySimulationResultMatchedStatementResult'],
                 missing_context_keys: Sequence[str],
                 resource_arn: str):
        """
        :param str action_name: The name of the single IAM action used for this particular request.
        :param bool allowed: `true` if `decision` is "allowed", and `false` otherwise.
        :param str decision: The raw decision determined from all of the policies in scope; either "allowed", "explicitDeny", or "implicitDeny".
        :param Mapping[str, str] decision_details: A map of arbitrary metadata entries returned by the policy simulator for this request.
        :param Sequence['GetPrincipalPolicySimulationResultMatchedStatementArgs'] matched_statements: A nested set of objects describing which policies contained statements that were relevant to this simulation request. Each object has attributes `source_policy_id` and `source_policy_type` to identify one of the policies.
        :param Sequence[str] missing_context_keys: A set of context keys (or condition keys) that were needed by some of the policies contributing to this result but not specified using a `context` block in the configuration. Missing or incorrect context keys will typically cause a simulated request to be disallowed.
        :param str resource_arn: ARN of the resource that was used for this particular request. When you specify multiple actions and multiple resource ARNs, that causes a separate policy request for each combination of unique action and resource.
        """
        pulumi.set(__self__, "action_name", action_name)
        pulumi.set(__self__, "allowed", allowed)
        pulumi.set(__self__, "decision", decision)
        pulumi.set(__self__, "decision_details", decision_details)
        pulumi.set(__self__, "matched_statements", matched_statements)
        pulumi.set(__self__, "missing_context_keys", missing_context_keys)
        pulumi.set(__self__, "resource_arn", resource_arn)

    @property
    @pulumi.getter(name="actionName")
    def action_name(self) -> str:
        """
        The name of the single IAM action used for this particular request.
        """
        return pulumi.get(self, "action_name")

    @property
    @pulumi.getter
    def allowed(self) -> bool:
        """
        `true` if `decision` is "allowed", and `false` otherwise.
        """
        return pulumi.get(self, "allowed")

    @property
    @pulumi.getter
    def decision(self) -> str:
        """
        The raw decision determined from all of the policies in scope; either "allowed", "explicitDeny", or "implicitDeny".
        """
        return pulumi.get(self, "decision")

    @property
    @pulumi.getter(name="decisionDetails")
    def decision_details(self) -> Mapping[str, str]:
        """
        A map of arbitrary metadata entries returned by the policy simulator for this request.
        """
        return pulumi.get(self, "decision_details")

    @property
    @pulumi.getter(name="matchedStatements")
    def matched_statements(self) -> Sequence['outputs.GetPrincipalPolicySimulationResultMatchedStatementResult']:
        """
        A nested set of objects describing which policies contained statements that were relevant to this simulation request. Each object has attributes `source_policy_id` and `source_policy_type` to identify one of the policies.
        """
        return pulumi.get(self, "matched_statements")

    @property
    @pulumi.getter(name="missingContextKeys")
    def missing_context_keys(self) -> Sequence[str]:
        """
        A set of context keys (or condition keys) that were needed by some of the policies contributing to this result but not specified using a `context` block in the configuration. Missing or incorrect context keys will typically cause a simulated request to be disallowed.
        """
        return pulumi.get(self, "missing_context_keys")

    @property
    @pulumi.getter(name="resourceArn")
    def resource_arn(self) -> str:
        """
        ARN of the resource that was used for this particular request. When you specify multiple actions and multiple resource ARNs, that causes a separate policy request for each combination of unique action and resource.
        """
        return pulumi.get(self, "resource_arn")


@pulumi.output_type
class GetPrincipalPolicySimulationResultMatchedStatementResult(dict):
    def __init__(__self__, *,
                 source_policy_id: str,
                 source_policy_type: str):
        """
        :param str source_policy_id: Identifier of one of the policies used as input to the simulation.
        :param str source_policy_type: The type of the policy identified in source_policy_id.
        """
        pulumi.set(__self__, "source_policy_id", source_policy_id)
        pulumi.set(__self__, "source_policy_type", source_policy_type)

    @property
    @pulumi.getter(name="sourcePolicyId")
    def source_policy_id(self) -> str:
        """
        Identifier of one of the policies used as input to the simulation.
        """
        return pulumi.get(self, "source_policy_id")

    @property
    @pulumi.getter(name="sourcePolicyType")
    def source_policy_type(self) -> str:
        """
        The type of the policy identified in source_policy_id.
        """
        return pulumi.get(self, "source_policy_type")


@pulumi.output_type
class GetRoleRoleLastUsedResult(dict):
    def __init__(__self__, *,
                 last_used_date: str,
                 region: str):
        """
        :param str last_used_date: The date and time, in RFC 3339 format, that the role was last used.
        :param str region: The name of the AWS Region in which the role was last used.
        """
        pulumi.set(__self__, "last_used_date", last_used_date)
        pulumi.set(__self__, "region", region)

    @property
    @pulumi.getter(name="lastUsedDate")
    def last_used_date(self) -> str:
        """
        The date and time, in RFC 3339 format, that the role was last used.
        """
        return pulumi.get(self, "last_used_date")

    @property
    @pulumi.getter
    def region(self) -> str:
        """
        The name of the AWS Region in which the role was last used.
        """
        return pulumi.get(self, "region")



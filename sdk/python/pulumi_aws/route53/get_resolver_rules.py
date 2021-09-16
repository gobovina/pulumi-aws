# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = [
    'GetResolverRulesResult',
    'AwaitableGetResolverRulesResult',
    'get_resolver_rules',
    'get_resolver_rules_output',
]

@pulumi.output_type
class GetResolverRulesResult:
    """
    A collection of values returned by getResolverRules.
    """
    def __init__(__self__, id=None, owner_id=None, resolver_endpoint_id=None, resolver_rule_ids=None, rule_type=None, share_status=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if owner_id and not isinstance(owner_id, str):
            raise TypeError("Expected argument 'owner_id' to be a str")
        pulumi.set(__self__, "owner_id", owner_id)
        if resolver_endpoint_id and not isinstance(resolver_endpoint_id, str):
            raise TypeError("Expected argument 'resolver_endpoint_id' to be a str")
        pulumi.set(__self__, "resolver_endpoint_id", resolver_endpoint_id)
        if resolver_rule_ids and not isinstance(resolver_rule_ids, list):
            raise TypeError("Expected argument 'resolver_rule_ids' to be a list")
        pulumi.set(__self__, "resolver_rule_ids", resolver_rule_ids)
        if rule_type and not isinstance(rule_type, str):
            raise TypeError("Expected argument 'rule_type' to be a str")
        pulumi.set(__self__, "rule_type", rule_type)
        if share_status and not isinstance(share_status, str):
            raise TypeError("Expected argument 'share_status' to be a str")
        pulumi.set(__self__, "share_status", share_status)

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="ownerId")
    def owner_id(self) -> Optional[str]:
        return pulumi.get(self, "owner_id")

    @property
    @pulumi.getter(name="resolverEndpointId")
    def resolver_endpoint_id(self) -> Optional[str]:
        return pulumi.get(self, "resolver_endpoint_id")

    @property
    @pulumi.getter(name="resolverRuleIds")
    def resolver_rule_ids(self) -> Sequence[str]:
        """
        The IDs of the matched resolver rules.
        """
        return pulumi.get(self, "resolver_rule_ids")

    @property
    @pulumi.getter(name="ruleType")
    def rule_type(self) -> Optional[str]:
        return pulumi.get(self, "rule_type")

    @property
    @pulumi.getter(name="shareStatus")
    def share_status(self) -> Optional[str]:
        return pulumi.get(self, "share_status")


class AwaitableGetResolverRulesResult(GetResolverRulesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetResolverRulesResult(
            id=self.id,
            owner_id=self.owner_id,
            resolver_endpoint_id=self.resolver_endpoint_id,
            resolver_rule_ids=self.resolver_rule_ids,
            rule_type=self.rule_type,
            share_status=self.share_status)


def get_resolver_rules(owner_id: Optional[str] = None,
                       resolver_endpoint_id: Optional[str] = None,
                       rule_type: Optional[str] = None,
                       share_status: Optional[str] = None,
                       opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetResolverRulesResult:
    """
    `route53.get_resolver_rules` provides details about a set of Route53 Resolver rules.

    ## Example Usage

    Retrieving the default resolver rule.

    ```python
    import pulumi
    import pulumi_aws as aws

    example = aws.route53.get_resolver_rules(owner_id="Route 53 Resolver",
        rule_type="RECURSIVE",
        share_status="NOT_SHARED")
    ```

    ```python
    import pulumi
    import pulumi_aws as aws

    example = aws.route53.get_resolver_rules(rule_type="FORWARD",
        share_status="SHARED_WITH_ME")
    ```


    :param str owner_id: When the desired resolver rules are shared with another AWS account, the account ID of the account that the rules are shared with.
    :param str resolver_endpoint_id: The ID of the outbound resolver endpoint for the desired resolver rules.
    :param str rule_type: The rule type of the desired resolver rules. Valid values are `FORWARD`, `SYSTEM` and `RECURSIVE`.
    :param str share_status: Whether the desired resolver rules are shared and, if so, whether the current account is sharing the rules with another account, or another account is sharing the rules with the current account. Valid values are `NOT_SHARED`, `SHARED_BY_ME` or `SHARED_WITH_ME`
    """
    __args__ = dict()
    __args__['ownerId'] = owner_id
    __args__['resolverEndpointId'] = resolver_endpoint_id
    __args__['ruleType'] = rule_type
    __args__['shareStatus'] = share_status
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = _utilities.get_version()
    __ret__ = pulumi.runtime.invoke('aws:route53/getResolverRules:getResolverRules', __args__, opts=opts, typ=GetResolverRulesResult).value

    return AwaitableGetResolverRulesResult(
        id=__ret__.id,
        owner_id=__ret__.owner_id,
        resolver_endpoint_id=__ret__.resolver_endpoint_id,
        resolver_rule_ids=__ret__.resolver_rule_ids,
        rule_type=__ret__.rule_type,
        share_status=__ret__.share_status)


@_utilities.lift_output_func(get_resolver_rules)
def get_resolver_rules_output(owner_id: Optional[pulumi.Input[Optional[str]]] = None,
                              resolver_endpoint_id: Optional[pulumi.Input[Optional[str]]] = None,
                              rule_type: Optional[pulumi.Input[Optional[str]]] = None,
                              share_status: Optional[pulumi.Input[Optional[str]]] = None,
                              opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetResolverRulesResult]:
    """
    `route53.get_resolver_rules` provides details about a set of Route53 Resolver rules.

    ## Example Usage

    Retrieving the default resolver rule.

    ```python
    import pulumi
    import pulumi_aws as aws

    example = aws.route53.get_resolver_rules(owner_id="Route 53 Resolver",
        rule_type="RECURSIVE",
        share_status="NOT_SHARED")
    ```

    ```python
    import pulumi
    import pulumi_aws as aws

    example = aws.route53.get_resolver_rules(rule_type="FORWARD",
        share_status="SHARED_WITH_ME")
    ```


    :param str owner_id: When the desired resolver rules are shared with another AWS account, the account ID of the account that the rules are shared with.
    :param str resolver_endpoint_id: The ID of the outbound resolver endpoint for the desired resolver rules.
    :param str rule_type: The rule type of the desired resolver rules. Valid values are `FORWARD`, `SYSTEM` and `RECURSIVE`.
    :param str share_status: Whether the desired resolver rules are shared and, if so, whether the current account is sharing the rules with another account, or another account is sharing the rules with the current account. Valid values are `NOT_SHARED`, `SHARED_BY_ME` or `SHARED_WITH_ME`
    """
    ...

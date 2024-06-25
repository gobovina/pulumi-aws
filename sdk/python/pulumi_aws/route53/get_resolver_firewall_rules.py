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

__all__ = [
    'GetResolverFirewallRulesResult',
    'AwaitableGetResolverFirewallRulesResult',
    'get_resolver_firewall_rules',
    'get_resolver_firewall_rules_output',
]

@pulumi.output_type
class GetResolverFirewallRulesResult:
    """
    A collection of values returned by getResolverFirewallRules.
    """
    def __init__(__self__, action=None, firewall_rule_group_id=None, firewall_rules=None, id=None, priority=None):
        if action and not isinstance(action, str):
            raise TypeError("Expected argument 'action' to be a str")
        pulumi.set(__self__, "action", action)
        if firewall_rule_group_id and not isinstance(firewall_rule_group_id, str):
            raise TypeError("Expected argument 'firewall_rule_group_id' to be a str")
        pulumi.set(__self__, "firewall_rule_group_id", firewall_rule_group_id)
        if firewall_rules and not isinstance(firewall_rules, list):
            raise TypeError("Expected argument 'firewall_rules' to be a list")
        pulumi.set(__self__, "firewall_rules", firewall_rules)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if priority and not isinstance(priority, int):
            raise TypeError("Expected argument 'priority' to be a int")
        pulumi.set(__self__, "priority", priority)

    @property
    @pulumi.getter
    def action(self) -> Optional[str]:
        return pulumi.get(self, "action")

    @property
    @pulumi.getter(name="firewallRuleGroupId")
    def firewall_rule_group_id(self) -> str:
        return pulumi.get(self, "firewall_rule_group_id")

    @property
    @pulumi.getter(name="firewallRules")
    def firewall_rules(self) -> Sequence['outputs.GetResolverFirewallRulesFirewallRuleResult']:
        """
        List with information about the firewall rules. See details below.
        """
        return pulumi.get(self, "firewall_rules")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def priority(self) -> Optional[int]:
        return pulumi.get(self, "priority")


class AwaitableGetResolverFirewallRulesResult(GetResolverFirewallRulesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetResolverFirewallRulesResult(
            action=self.action,
            firewall_rule_group_id=self.firewall_rule_group_id,
            firewall_rules=self.firewall_rules,
            id=self.id,
            priority=self.priority)


def get_resolver_firewall_rules(action: Optional[str] = None,
                                firewall_rule_group_id: Optional[str] = None,
                                priority: Optional[int] = None,
                                opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetResolverFirewallRulesResult:
    """
    `route53_get_resolver_firewall_rules` Provides details about rules in a specific Route53 Resolver Firewall rule group.

    ## Example Usage

    The following example shows how to get Route53 Resolver Firewall rules based on its associated firewall group id.

    ```python
    import pulumi
    import pulumi_aws as aws

    example = aws.route53.get_resolver_firewall_rules(firewall_rule_group_id=example_aws_route53_resolver_firewall_rule_group["id"])
    ```


    :param str action: The action that DNS Firewall should take on a DNS query when it matches one of the domains in the rule's domain list.
    :param str firewall_rule_group_id: The unique identifier of the firewall rule group that you want to retrieve the rules for.
    :param int priority: The setting that determines the processing order of the rules in a rule group.
    """
    __args__ = dict()
    __args__['action'] = action
    __args__['firewallRuleGroupId'] = firewall_rule_group_id
    __args__['priority'] = priority
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('aws:route53/getResolverFirewallRules:getResolverFirewallRules', __args__, opts=opts, typ=GetResolverFirewallRulesResult).value

    return AwaitableGetResolverFirewallRulesResult(
        action=pulumi.get(__ret__, 'action'),
        firewall_rule_group_id=pulumi.get(__ret__, 'firewall_rule_group_id'),
        firewall_rules=pulumi.get(__ret__, 'firewall_rules'),
        id=pulumi.get(__ret__, 'id'),
        priority=pulumi.get(__ret__, 'priority'))


@_utilities.lift_output_func(get_resolver_firewall_rules)
def get_resolver_firewall_rules_output(action: Optional[pulumi.Input[Optional[str]]] = None,
                                       firewall_rule_group_id: Optional[pulumi.Input[str]] = None,
                                       priority: Optional[pulumi.Input[Optional[int]]] = None,
                                       opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetResolverFirewallRulesResult]:
    """
    `route53_get_resolver_firewall_rules` Provides details about rules in a specific Route53 Resolver Firewall rule group.

    ## Example Usage

    The following example shows how to get Route53 Resolver Firewall rules based on its associated firewall group id.

    ```python
    import pulumi
    import pulumi_aws as aws

    example = aws.route53.get_resolver_firewall_rules(firewall_rule_group_id=example_aws_route53_resolver_firewall_rule_group["id"])
    ```


    :param str action: The action that DNS Firewall should take on a DNS query when it matches one of the domains in the rule's domain list.
    :param str firewall_rule_group_id: The unique identifier of the firewall rule group that you want to retrieve the rules for.
    :param int priority: The setting that determines the processing order of the rules in a rule group.
    """
    ...

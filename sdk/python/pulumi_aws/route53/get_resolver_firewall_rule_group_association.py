# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = [
    'GetResolverFirewallRuleGroupAssociationResult',
    'AwaitableGetResolverFirewallRuleGroupAssociationResult',
    'get_resolver_firewall_rule_group_association',
    'get_resolver_firewall_rule_group_association_output',
]

@pulumi.output_type
class GetResolverFirewallRuleGroupAssociationResult:
    """
    A collection of values returned by getResolverFirewallRuleGroupAssociation.
    """
    def __init__(__self__, arn=None, creation_time=None, creator_request_id=None, firewall_rule_group_association_id=None, firewall_rule_group_id=None, id=None, managed_owner_name=None, modification_time=None, mutation_protection=None, name=None, priority=None, status=None, status_message=None, vpc_id=None):
        if arn and not isinstance(arn, str):
            raise TypeError("Expected argument 'arn' to be a str")
        pulumi.set(__self__, "arn", arn)
        if creation_time and not isinstance(creation_time, str):
            raise TypeError("Expected argument 'creation_time' to be a str")
        pulumi.set(__self__, "creation_time", creation_time)
        if creator_request_id and not isinstance(creator_request_id, str):
            raise TypeError("Expected argument 'creator_request_id' to be a str")
        pulumi.set(__self__, "creator_request_id", creator_request_id)
        if firewall_rule_group_association_id and not isinstance(firewall_rule_group_association_id, str):
            raise TypeError("Expected argument 'firewall_rule_group_association_id' to be a str")
        pulumi.set(__self__, "firewall_rule_group_association_id", firewall_rule_group_association_id)
        if firewall_rule_group_id and not isinstance(firewall_rule_group_id, str):
            raise TypeError("Expected argument 'firewall_rule_group_id' to be a str")
        pulumi.set(__self__, "firewall_rule_group_id", firewall_rule_group_id)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if managed_owner_name and not isinstance(managed_owner_name, str):
            raise TypeError("Expected argument 'managed_owner_name' to be a str")
        pulumi.set(__self__, "managed_owner_name", managed_owner_name)
        if modification_time and not isinstance(modification_time, str):
            raise TypeError("Expected argument 'modification_time' to be a str")
        pulumi.set(__self__, "modification_time", modification_time)
        if mutation_protection and not isinstance(mutation_protection, str):
            raise TypeError("Expected argument 'mutation_protection' to be a str")
        pulumi.set(__self__, "mutation_protection", mutation_protection)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if priority and not isinstance(priority, int):
            raise TypeError("Expected argument 'priority' to be a int")
        pulumi.set(__self__, "priority", priority)
        if status and not isinstance(status, str):
            raise TypeError("Expected argument 'status' to be a str")
        pulumi.set(__self__, "status", status)
        if status_message and not isinstance(status_message, str):
            raise TypeError("Expected argument 'status_message' to be a str")
        pulumi.set(__self__, "status_message", status_message)
        if vpc_id and not isinstance(vpc_id, str):
            raise TypeError("Expected argument 'vpc_id' to be a str")
        pulumi.set(__self__, "vpc_id", vpc_id)

    @property
    @pulumi.getter
    def arn(self) -> str:
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter(name="creationTime")
    def creation_time(self) -> str:
        return pulumi.get(self, "creation_time")

    @property
    @pulumi.getter(name="creatorRequestId")
    def creator_request_id(self) -> str:
        return pulumi.get(self, "creator_request_id")

    @property
    @pulumi.getter(name="firewallRuleGroupAssociationId")
    def firewall_rule_group_association_id(self) -> str:
        return pulumi.get(self, "firewall_rule_group_association_id")

    @property
    @pulumi.getter(name="firewallRuleGroupId")
    def firewall_rule_group_id(self) -> str:
        return pulumi.get(self, "firewall_rule_group_id")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="managedOwnerName")
    def managed_owner_name(self) -> str:
        return pulumi.get(self, "managed_owner_name")

    @property
    @pulumi.getter(name="modificationTime")
    def modification_time(self) -> str:
        return pulumi.get(self, "modification_time")

    @property
    @pulumi.getter(name="mutationProtection")
    def mutation_protection(self) -> str:
        return pulumi.get(self, "mutation_protection")

    @property
    @pulumi.getter
    def name(self) -> str:
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def priority(self) -> int:
        return pulumi.get(self, "priority")

    @property
    @pulumi.getter
    def status(self) -> str:
        return pulumi.get(self, "status")

    @property
    @pulumi.getter(name="statusMessage")
    def status_message(self) -> str:
        return pulumi.get(self, "status_message")

    @property
    @pulumi.getter(name="vpcId")
    def vpc_id(self) -> str:
        return pulumi.get(self, "vpc_id")


class AwaitableGetResolverFirewallRuleGroupAssociationResult(GetResolverFirewallRuleGroupAssociationResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetResolverFirewallRuleGroupAssociationResult(
            arn=self.arn,
            creation_time=self.creation_time,
            creator_request_id=self.creator_request_id,
            firewall_rule_group_association_id=self.firewall_rule_group_association_id,
            firewall_rule_group_id=self.firewall_rule_group_id,
            id=self.id,
            managed_owner_name=self.managed_owner_name,
            modification_time=self.modification_time,
            mutation_protection=self.mutation_protection,
            name=self.name,
            priority=self.priority,
            status=self.status,
            status_message=self.status_message,
            vpc_id=self.vpc_id)


def get_resolver_firewall_rule_group_association(firewall_rule_group_association_id: Optional[str] = None,
                                                 opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetResolverFirewallRuleGroupAssociationResult:
    """
    `route53.ResolverFirewallRuleGroupAssociation` Retrieves the specified firewall rule group association.

    This data source allows to retrieve details about a specific a Route 53 Resolver DNS Firewall rule group association.

    ## Example Usage

    The following example shows how to get a firewall rule group association from its id.

    <!--Start PulumiCodeChooser -->
    ```python
    import pulumi
    import pulumi_aws as aws

    example = aws.route53.get_resolver_firewall_rule_group_association(firewall_rule_group_association_id="rslvr-frgassoc-example")
    ```
    <!--End PulumiCodeChooser -->


    :param str firewall_rule_group_association_id: The identifier for the association.
           
           The following attribute is additionally exported:
    """
    __args__ = dict()
    __args__['firewallRuleGroupAssociationId'] = firewall_rule_group_association_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('aws:route53/getResolverFirewallRuleGroupAssociation:getResolverFirewallRuleGroupAssociation', __args__, opts=opts, typ=GetResolverFirewallRuleGroupAssociationResult).value

    return AwaitableGetResolverFirewallRuleGroupAssociationResult(
        arn=pulumi.get(__ret__, 'arn'),
        creation_time=pulumi.get(__ret__, 'creation_time'),
        creator_request_id=pulumi.get(__ret__, 'creator_request_id'),
        firewall_rule_group_association_id=pulumi.get(__ret__, 'firewall_rule_group_association_id'),
        firewall_rule_group_id=pulumi.get(__ret__, 'firewall_rule_group_id'),
        id=pulumi.get(__ret__, 'id'),
        managed_owner_name=pulumi.get(__ret__, 'managed_owner_name'),
        modification_time=pulumi.get(__ret__, 'modification_time'),
        mutation_protection=pulumi.get(__ret__, 'mutation_protection'),
        name=pulumi.get(__ret__, 'name'),
        priority=pulumi.get(__ret__, 'priority'),
        status=pulumi.get(__ret__, 'status'),
        status_message=pulumi.get(__ret__, 'status_message'),
        vpc_id=pulumi.get(__ret__, 'vpc_id'))


@_utilities.lift_output_func(get_resolver_firewall_rule_group_association)
def get_resolver_firewall_rule_group_association_output(firewall_rule_group_association_id: Optional[pulumi.Input[str]] = None,
                                                        opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetResolverFirewallRuleGroupAssociationResult]:
    """
    `route53.ResolverFirewallRuleGroupAssociation` Retrieves the specified firewall rule group association.

    This data source allows to retrieve details about a specific a Route 53 Resolver DNS Firewall rule group association.

    ## Example Usage

    The following example shows how to get a firewall rule group association from its id.

    <!--Start PulumiCodeChooser -->
    ```python
    import pulumi
    import pulumi_aws as aws

    example = aws.route53.get_resolver_firewall_rule_group_association(firewall_rule_group_association_id="rslvr-frgassoc-example")
    ```
    <!--End PulumiCodeChooser -->


    :param str firewall_rule_group_association_id: The identifier for the association.
           
           The following attribute is additionally exported:
    """
    ...

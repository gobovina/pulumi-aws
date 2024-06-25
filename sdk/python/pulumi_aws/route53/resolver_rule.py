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

__all__ = ['ResolverRuleArgs', 'ResolverRule']

@pulumi.input_type
class ResolverRuleArgs:
    def __init__(__self__, *,
                 domain_name: pulumi.Input[str],
                 rule_type: pulumi.Input[str],
                 name: Optional[pulumi.Input[str]] = None,
                 resolver_endpoint_id: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 target_ips: Optional[pulumi.Input[Sequence[pulumi.Input['ResolverRuleTargetIpArgs']]]] = None):
        """
        The set of arguments for constructing a ResolverRule resource.
        :param pulumi.Input[str] domain_name: DNS queries for this domain name are forwarded to the IP addresses that are specified using `target_ip`.
        :param pulumi.Input[str] rule_type: The rule type. Valid values are `FORWARD`, `SYSTEM` and `RECURSIVE`.
        :param pulumi.Input[str] name: A friendly name that lets you easily find a rule in the Resolver dashboard in the Route 53 console.
        :param pulumi.Input[str] resolver_endpoint_id: The ID of the outbound resolver endpoint that you want to use to route DNS queries to the IP addresses that you specify using `target_ip`.
               This argument should only be specified for `FORWARD` type rules.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Sequence[pulumi.Input['ResolverRuleTargetIpArgs']]] target_ips: Configuration block(s) indicating the IPs that you want Resolver to forward DNS queries to (documented below).
               This argument should only be specified for `FORWARD` type rules.
        """
        pulumi.set(__self__, "domain_name", domain_name)
        pulumi.set(__self__, "rule_type", rule_type)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if resolver_endpoint_id is not None:
            pulumi.set(__self__, "resolver_endpoint_id", resolver_endpoint_id)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if target_ips is not None:
            pulumi.set(__self__, "target_ips", target_ips)

    @property
    @pulumi.getter(name="domainName")
    def domain_name(self) -> pulumi.Input[str]:
        """
        DNS queries for this domain name are forwarded to the IP addresses that are specified using `target_ip`.
        """
        return pulumi.get(self, "domain_name")

    @domain_name.setter
    def domain_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "domain_name", value)

    @property
    @pulumi.getter(name="ruleType")
    def rule_type(self) -> pulumi.Input[str]:
        """
        The rule type. Valid values are `FORWARD`, `SYSTEM` and `RECURSIVE`.
        """
        return pulumi.get(self, "rule_type")

    @rule_type.setter
    def rule_type(self, value: pulumi.Input[str]):
        pulumi.set(self, "rule_type", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        A friendly name that lets you easily find a rule in the Resolver dashboard in the Route 53 console.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="resolverEndpointId")
    def resolver_endpoint_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the outbound resolver endpoint that you want to use to route DNS queries to the IP addresses that you specify using `target_ip`.
        This argument should only be specified for `FORWARD` type rules.
        """
        return pulumi.get(self, "resolver_endpoint_id")

    @resolver_endpoint_id.setter
    def resolver_endpoint_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "resolver_endpoint_id", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)

    @property
    @pulumi.getter(name="targetIps")
    def target_ips(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ResolverRuleTargetIpArgs']]]]:
        """
        Configuration block(s) indicating the IPs that you want Resolver to forward DNS queries to (documented below).
        This argument should only be specified for `FORWARD` type rules.
        """
        return pulumi.get(self, "target_ips")

    @target_ips.setter
    def target_ips(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ResolverRuleTargetIpArgs']]]]):
        pulumi.set(self, "target_ips", value)


@pulumi.input_type
class _ResolverRuleState:
    def __init__(__self__, *,
                 arn: Optional[pulumi.Input[str]] = None,
                 domain_name: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 owner_id: Optional[pulumi.Input[str]] = None,
                 resolver_endpoint_id: Optional[pulumi.Input[str]] = None,
                 rule_type: Optional[pulumi.Input[str]] = None,
                 share_status: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 target_ips: Optional[pulumi.Input[Sequence[pulumi.Input['ResolverRuleTargetIpArgs']]]] = None):
        """
        Input properties used for looking up and filtering ResolverRule resources.
        :param pulumi.Input[str] arn: The ARN (Amazon Resource Name) for the resolver rule.
        :param pulumi.Input[str] domain_name: DNS queries for this domain name are forwarded to the IP addresses that are specified using `target_ip`.
        :param pulumi.Input[str] name: A friendly name that lets you easily find a rule in the Resolver dashboard in the Route 53 console.
        :param pulumi.Input[str] owner_id: When a rule is shared with another AWS account, the account ID of the account that the rule is shared with.
        :param pulumi.Input[str] resolver_endpoint_id: The ID of the outbound resolver endpoint that you want to use to route DNS queries to the IP addresses that you specify using `target_ip`.
               This argument should only be specified for `FORWARD` type rules.
        :param pulumi.Input[str] rule_type: The rule type. Valid values are `FORWARD`, `SYSTEM` and `RECURSIVE`.
        :param pulumi.Input[str] share_status: Whether the rules is shared and, if so, whether the current account is sharing the rule with another account, or another account is sharing the rule with the current account.
               Values are `NOT_SHARED`, `SHARED_BY_ME` or `SHARED_WITH_ME`
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        :param pulumi.Input[Sequence[pulumi.Input['ResolverRuleTargetIpArgs']]] target_ips: Configuration block(s) indicating the IPs that you want Resolver to forward DNS queries to (documented below).
               This argument should only be specified for `FORWARD` type rules.
        """
        if arn is not None:
            pulumi.set(__self__, "arn", arn)
        if domain_name is not None:
            pulumi.set(__self__, "domain_name", domain_name)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if owner_id is not None:
            pulumi.set(__self__, "owner_id", owner_id)
        if resolver_endpoint_id is not None:
            pulumi.set(__self__, "resolver_endpoint_id", resolver_endpoint_id)
        if rule_type is not None:
            pulumi.set(__self__, "rule_type", rule_type)
        if share_status is not None:
            pulumi.set(__self__, "share_status", share_status)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if tags_all is not None:
            warnings.warn("""Please use `tags` instead.""", DeprecationWarning)
            pulumi.log.warn("""tags_all is deprecated: Please use `tags` instead.""")
        if tags_all is not None:
            pulumi.set(__self__, "tags_all", tags_all)
        if target_ips is not None:
            pulumi.set(__self__, "target_ips", target_ips)

    @property
    @pulumi.getter
    def arn(self) -> Optional[pulumi.Input[str]]:
        """
        The ARN (Amazon Resource Name) for the resolver rule.
        """
        return pulumi.get(self, "arn")

    @arn.setter
    def arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "arn", value)

    @property
    @pulumi.getter(name="domainName")
    def domain_name(self) -> Optional[pulumi.Input[str]]:
        """
        DNS queries for this domain name are forwarded to the IP addresses that are specified using `target_ip`.
        """
        return pulumi.get(self, "domain_name")

    @domain_name.setter
    def domain_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "domain_name", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        A friendly name that lets you easily find a rule in the Resolver dashboard in the Route 53 console.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="ownerId")
    def owner_id(self) -> Optional[pulumi.Input[str]]:
        """
        When a rule is shared with another AWS account, the account ID of the account that the rule is shared with.
        """
        return pulumi.get(self, "owner_id")

    @owner_id.setter
    def owner_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "owner_id", value)

    @property
    @pulumi.getter(name="resolverEndpointId")
    def resolver_endpoint_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the outbound resolver endpoint that you want to use to route DNS queries to the IP addresses that you specify using `target_ip`.
        This argument should only be specified for `FORWARD` type rules.
        """
        return pulumi.get(self, "resolver_endpoint_id")

    @resolver_endpoint_id.setter
    def resolver_endpoint_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "resolver_endpoint_id", value)

    @property
    @pulumi.getter(name="ruleType")
    def rule_type(self) -> Optional[pulumi.Input[str]]:
        """
        The rule type. Valid values are `FORWARD`, `SYSTEM` and `RECURSIVE`.
        """
        return pulumi.get(self, "rule_type")

    @rule_type.setter
    def rule_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "rule_type", value)

    @property
    @pulumi.getter(name="shareStatus")
    def share_status(self) -> Optional[pulumi.Input[str]]:
        """
        Whether the rules is shared and, if so, whether the current account is sharing the rule with another account, or another account is sharing the rule with the current account.
        Values are `NOT_SHARED`, `SHARED_BY_ME` or `SHARED_WITH_ME`
        """
        return pulumi.get(self, "share_status")

    @share_status.setter
    def share_status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "share_status", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)

    @property
    @pulumi.getter(name="tagsAll")
    @_utilities.deprecated("""Please use `tags` instead.""")
    def tags_all(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        return pulumi.get(self, "tags_all")

    @tags_all.setter
    def tags_all(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags_all", value)

    @property
    @pulumi.getter(name="targetIps")
    def target_ips(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ResolverRuleTargetIpArgs']]]]:
        """
        Configuration block(s) indicating the IPs that you want Resolver to forward DNS queries to (documented below).
        This argument should only be specified for `FORWARD` type rules.
        """
        return pulumi.get(self, "target_ips")

    @target_ips.setter
    def target_ips(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ResolverRuleTargetIpArgs']]]]):
        pulumi.set(self, "target_ips", value)


class ResolverRule(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 domain_name: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 resolver_endpoint_id: Optional[pulumi.Input[str]] = None,
                 rule_type: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 target_ips: Optional[pulumi.Input[Sequence[pulumi.Input[Union['ResolverRuleTargetIpArgs', 'ResolverRuleTargetIpArgsDict']]]]] = None,
                 __props__=None):
        """
        Provides a Route53 Resolver rule.

        ## Example Usage

        ### System rule

        ```python
        import pulumi
        import pulumi_aws as aws

        sys = aws.route53.ResolverRule("sys",
            domain_name="subdomain.example.com",
            rule_type="SYSTEM")
        ```

        ### Forward rule

        ```python
        import pulumi
        import pulumi_aws as aws

        fwd = aws.route53.ResolverRule("fwd",
            domain_name="example.com",
            name="example",
            rule_type="FORWARD",
            resolver_endpoint_id=foo["id"],
            target_ips=[{
                "ip": "123.45.67.89",
            }],
            tags={
                "Environment": "Prod",
            })
        ```

        ## Import

        Using `pulumi import`, import Route53 Resolver rules using the `id`. For example:

        ```sh
        $ pulumi import aws:route53/resolverRule:ResolverRule sys rslvr-rr-0123456789abcdef0
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] domain_name: DNS queries for this domain name are forwarded to the IP addresses that are specified using `target_ip`.
        :param pulumi.Input[str] name: A friendly name that lets you easily find a rule in the Resolver dashboard in the Route 53 console.
        :param pulumi.Input[str] resolver_endpoint_id: The ID of the outbound resolver endpoint that you want to use to route DNS queries to the IP addresses that you specify using `target_ip`.
               This argument should only be specified for `FORWARD` type rules.
        :param pulumi.Input[str] rule_type: The rule type. Valid values are `FORWARD`, `SYSTEM` and `RECURSIVE`.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Sequence[pulumi.Input[Union['ResolverRuleTargetIpArgs', 'ResolverRuleTargetIpArgsDict']]]] target_ips: Configuration block(s) indicating the IPs that you want Resolver to forward DNS queries to (documented below).
               This argument should only be specified for `FORWARD` type rules.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ResolverRuleArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Route53 Resolver rule.

        ## Example Usage

        ### System rule

        ```python
        import pulumi
        import pulumi_aws as aws

        sys = aws.route53.ResolverRule("sys",
            domain_name="subdomain.example.com",
            rule_type="SYSTEM")
        ```

        ### Forward rule

        ```python
        import pulumi
        import pulumi_aws as aws

        fwd = aws.route53.ResolverRule("fwd",
            domain_name="example.com",
            name="example",
            rule_type="FORWARD",
            resolver_endpoint_id=foo["id"],
            target_ips=[{
                "ip": "123.45.67.89",
            }],
            tags={
                "Environment": "Prod",
            })
        ```

        ## Import

        Using `pulumi import`, import Route53 Resolver rules using the `id`. For example:

        ```sh
        $ pulumi import aws:route53/resolverRule:ResolverRule sys rslvr-rr-0123456789abcdef0
        ```

        :param str resource_name: The name of the resource.
        :param ResolverRuleArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ResolverRuleArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 domain_name: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 resolver_endpoint_id: Optional[pulumi.Input[str]] = None,
                 rule_type: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 target_ips: Optional[pulumi.Input[Sequence[pulumi.Input[Union['ResolverRuleTargetIpArgs', 'ResolverRuleTargetIpArgsDict']]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ResolverRuleArgs.__new__(ResolverRuleArgs)

            if domain_name is None and not opts.urn:
                raise TypeError("Missing required property 'domain_name'")
            __props__.__dict__["domain_name"] = domain_name
            __props__.__dict__["name"] = name
            __props__.__dict__["resolver_endpoint_id"] = resolver_endpoint_id
            if rule_type is None and not opts.urn:
                raise TypeError("Missing required property 'rule_type'")
            __props__.__dict__["rule_type"] = rule_type
            __props__.__dict__["tags"] = tags
            __props__.__dict__["target_ips"] = target_ips
            __props__.__dict__["arn"] = None
            __props__.__dict__["owner_id"] = None
            __props__.__dict__["share_status"] = None
            __props__.__dict__["tags_all"] = None
        super(ResolverRule, __self__).__init__(
            'aws:route53/resolverRule:ResolverRule',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            arn: Optional[pulumi.Input[str]] = None,
            domain_name: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            owner_id: Optional[pulumi.Input[str]] = None,
            resolver_endpoint_id: Optional[pulumi.Input[str]] = None,
            rule_type: Optional[pulumi.Input[str]] = None,
            share_status: Optional[pulumi.Input[str]] = None,
            tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            target_ips: Optional[pulumi.Input[Sequence[pulumi.Input[Union['ResolverRuleTargetIpArgs', 'ResolverRuleTargetIpArgsDict']]]]] = None) -> 'ResolverRule':
        """
        Get an existing ResolverRule resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] arn: The ARN (Amazon Resource Name) for the resolver rule.
        :param pulumi.Input[str] domain_name: DNS queries for this domain name are forwarded to the IP addresses that are specified using `target_ip`.
        :param pulumi.Input[str] name: A friendly name that lets you easily find a rule in the Resolver dashboard in the Route 53 console.
        :param pulumi.Input[str] owner_id: When a rule is shared with another AWS account, the account ID of the account that the rule is shared with.
        :param pulumi.Input[str] resolver_endpoint_id: The ID of the outbound resolver endpoint that you want to use to route DNS queries to the IP addresses that you specify using `target_ip`.
               This argument should only be specified for `FORWARD` type rules.
        :param pulumi.Input[str] rule_type: The rule type. Valid values are `FORWARD`, `SYSTEM` and `RECURSIVE`.
        :param pulumi.Input[str] share_status: Whether the rules is shared and, if so, whether the current account is sharing the rule with another account, or another account is sharing the rule with the current account.
               Values are `NOT_SHARED`, `SHARED_BY_ME` or `SHARED_WITH_ME`
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        :param pulumi.Input[Sequence[pulumi.Input[Union['ResolverRuleTargetIpArgs', 'ResolverRuleTargetIpArgsDict']]]] target_ips: Configuration block(s) indicating the IPs that you want Resolver to forward DNS queries to (documented below).
               This argument should only be specified for `FORWARD` type rules.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ResolverRuleState.__new__(_ResolverRuleState)

        __props__.__dict__["arn"] = arn
        __props__.__dict__["domain_name"] = domain_name
        __props__.__dict__["name"] = name
        __props__.__dict__["owner_id"] = owner_id
        __props__.__dict__["resolver_endpoint_id"] = resolver_endpoint_id
        __props__.__dict__["rule_type"] = rule_type
        __props__.__dict__["share_status"] = share_status
        __props__.__dict__["tags"] = tags
        __props__.__dict__["tags_all"] = tags_all
        __props__.__dict__["target_ips"] = target_ips
        return ResolverRule(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def arn(self) -> pulumi.Output[str]:
        """
        The ARN (Amazon Resource Name) for the resolver rule.
        """
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter(name="domainName")
    def domain_name(self) -> pulumi.Output[str]:
        """
        DNS queries for this domain name are forwarded to the IP addresses that are specified using `target_ip`.
        """
        return pulumi.get(self, "domain_name")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        A friendly name that lets you easily find a rule in the Resolver dashboard in the Route 53 console.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="ownerId")
    def owner_id(self) -> pulumi.Output[str]:
        """
        When a rule is shared with another AWS account, the account ID of the account that the rule is shared with.
        """
        return pulumi.get(self, "owner_id")

    @property
    @pulumi.getter(name="resolverEndpointId")
    def resolver_endpoint_id(self) -> pulumi.Output[Optional[str]]:
        """
        The ID of the outbound resolver endpoint that you want to use to route DNS queries to the IP addresses that you specify using `target_ip`.
        This argument should only be specified for `FORWARD` type rules.
        """
        return pulumi.get(self, "resolver_endpoint_id")

    @property
    @pulumi.getter(name="ruleType")
    def rule_type(self) -> pulumi.Output[str]:
        """
        The rule type. Valid values are `FORWARD`, `SYSTEM` and `RECURSIVE`.
        """
        return pulumi.get(self, "rule_type")

    @property
    @pulumi.getter(name="shareStatus")
    def share_status(self) -> pulumi.Output[str]:
        """
        Whether the rules is shared and, if so, whether the current account is sharing the rule with another account, or another account is sharing the rule with the current account.
        Values are `NOT_SHARED`, `SHARED_BY_ME` or `SHARED_WITH_ME`
        """
        return pulumi.get(self, "share_status")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, str]]]:
        """
        A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter(name="tagsAll")
    @_utilities.deprecated("""Please use `tags` instead.""")
    def tags_all(self) -> pulumi.Output[Mapping[str, str]]:
        """
        A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        return pulumi.get(self, "tags_all")

    @property
    @pulumi.getter(name="targetIps")
    def target_ips(self) -> pulumi.Output[Optional[Sequence['outputs.ResolverRuleTargetIp']]]:
        """
        Configuration block(s) indicating the IPs that you want Resolver to forward DNS queries to (documented below).
        This argument should only be specified for `FORWARD` type rules.
        """
        return pulumi.get(self, "target_ips")


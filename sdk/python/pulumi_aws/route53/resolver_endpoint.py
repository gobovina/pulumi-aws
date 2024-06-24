# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities
from . import outputs
from ._inputs import *

__all__ = ['ResolverEndpointArgs', 'ResolverEndpoint']

@pulumi.input_type
class ResolverEndpointArgs:
    def __init__(__self__, *,
                 direction: pulumi.Input[str],
                 ip_addresses: pulumi.Input[Sequence[pulumi.Input['ResolverEndpointIpAddressArgs']]],
                 security_group_ids: pulumi.Input[Sequence[pulumi.Input[str]]],
                 name: Optional[pulumi.Input[str]] = None,
                 protocols: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 resolver_endpoint_type: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        The set of arguments for constructing a ResolverEndpoint resource.
        :param pulumi.Input[str] direction: The direction of DNS queries to or from the Route 53 Resolver endpoint.
               Valid values are `INBOUND` (resolver forwards DNS queries to the DNS service for a VPC from your network or another VPC)
               or `OUTBOUND` (resolver forwards DNS queries from the DNS service for a VPC to your network or another VPC).
        :param pulumi.Input[Sequence[pulumi.Input['ResolverEndpointIpAddressArgs']]] ip_addresses: The subnets and IP addresses in your VPC that you want DNS queries to pass through on the way from your VPCs
               to your network (for outbound endpoints) or on the way from your network to your VPCs (for inbound endpoints). Described below.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] security_group_ids: The ID of one or more security groups that you want to use to control access to this VPC.
        :param pulumi.Input[str] name: The friendly name of the Route 53 Resolver endpoint.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] protocols: The protocols you want to use for the Route 53 Resolver endpoint. Valid values: `DoH`, `Do53`, `DoH-FIPS`.
        :param pulumi.Input[str] resolver_endpoint_type: The Route 53 Resolver endpoint IP address type. Valid values: `IPV4`, `IPV6`, `DUALSTACK`.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        pulumi.set(__self__, "direction", direction)
        pulumi.set(__self__, "ip_addresses", ip_addresses)
        pulumi.set(__self__, "security_group_ids", security_group_ids)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if protocols is not None:
            pulumi.set(__self__, "protocols", protocols)
        if resolver_endpoint_type is not None:
            pulumi.set(__self__, "resolver_endpoint_type", resolver_endpoint_type)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter
    def direction(self) -> pulumi.Input[str]:
        """
        The direction of DNS queries to or from the Route 53 Resolver endpoint.
        Valid values are `INBOUND` (resolver forwards DNS queries to the DNS service for a VPC from your network or another VPC)
        or `OUTBOUND` (resolver forwards DNS queries from the DNS service for a VPC to your network or another VPC).
        """
        return pulumi.get(self, "direction")

    @direction.setter
    def direction(self, value: pulumi.Input[str]):
        pulumi.set(self, "direction", value)

    @property
    @pulumi.getter(name="ipAddresses")
    def ip_addresses(self) -> pulumi.Input[Sequence[pulumi.Input['ResolverEndpointIpAddressArgs']]]:
        """
        The subnets and IP addresses in your VPC that you want DNS queries to pass through on the way from your VPCs
        to your network (for outbound endpoints) or on the way from your network to your VPCs (for inbound endpoints). Described below.
        """
        return pulumi.get(self, "ip_addresses")

    @ip_addresses.setter
    def ip_addresses(self, value: pulumi.Input[Sequence[pulumi.Input['ResolverEndpointIpAddressArgs']]]):
        pulumi.set(self, "ip_addresses", value)

    @property
    @pulumi.getter(name="securityGroupIds")
    def security_group_ids(self) -> pulumi.Input[Sequence[pulumi.Input[str]]]:
        """
        The ID of one or more security groups that you want to use to control access to this VPC.
        """
        return pulumi.get(self, "security_group_ids")

    @security_group_ids.setter
    def security_group_ids(self, value: pulumi.Input[Sequence[pulumi.Input[str]]]):
        pulumi.set(self, "security_group_ids", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The friendly name of the Route 53 Resolver endpoint.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def protocols(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        The protocols you want to use for the Route 53 Resolver endpoint. Valid values: `DoH`, `Do53`, `DoH-FIPS`.
        """
        return pulumi.get(self, "protocols")

    @protocols.setter
    def protocols(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "protocols", value)

    @property
    @pulumi.getter(name="resolverEndpointType")
    def resolver_endpoint_type(self) -> Optional[pulumi.Input[str]]:
        """
        The Route 53 Resolver endpoint IP address type. Valid values: `IPV4`, `IPV6`, `DUALSTACK`.
        """
        return pulumi.get(self, "resolver_endpoint_type")

    @resolver_endpoint_type.setter
    def resolver_endpoint_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "resolver_endpoint_type", value)

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


@pulumi.input_type
class _ResolverEndpointState:
    def __init__(__self__, *,
                 arn: Optional[pulumi.Input[str]] = None,
                 direction: Optional[pulumi.Input[str]] = None,
                 host_vpc_id: Optional[pulumi.Input[str]] = None,
                 ip_addresses: Optional[pulumi.Input[Sequence[pulumi.Input['ResolverEndpointIpAddressArgs']]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 protocols: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 resolver_endpoint_type: Optional[pulumi.Input[str]] = None,
                 security_group_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        Input properties used for looking up and filtering ResolverEndpoint resources.
        :param pulumi.Input[str] arn: The ARN of the Route 53 Resolver endpoint.
        :param pulumi.Input[str] direction: The direction of DNS queries to or from the Route 53 Resolver endpoint.
               Valid values are `INBOUND` (resolver forwards DNS queries to the DNS service for a VPC from your network or another VPC)
               or `OUTBOUND` (resolver forwards DNS queries from the DNS service for a VPC to your network or another VPC).
        :param pulumi.Input[str] host_vpc_id: The ID of the VPC that you want to create the resolver endpoint in.
        :param pulumi.Input[Sequence[pulumi.Input['ResolverEndpointIpAddressArgs']]] ip_addresses: The subnets and IP addresses in your VPC that you want DNS queries to pass through on the way from your VPCs
               to your network (for outbound endpoints) or on the way from your network to your VPCs (for inbound endpoints). Described below.
        :param pulumi.Input[str] name: The friendly name of the Route 53 Resolver endpoint.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] protocols: The protocols you want to use for the Route 53 Resolver endpoint. Valid values: `DoH`, `Do53`, `DoH-FIPS`.
        :param pulumi.Input[str] resolver_endpoint_type: The Route 53 Resolver endpoint IP address type. Valid values: `IPV4`, `IPV6`, `DUALSTACK`.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] security_group_ids: The ID of one or more security groups that you want to use to control access to this VPC.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        if arn is not None:
            pulumi.set(__self__, "arn", arn)
        if direction is not None:
            pulumi.set(__self__, "direction", direction)
        if host_vpc_id is not None:
            pulumi.set(__self__, "host_vpc_id", host_vpc_id)
        if ip_addresses is not None:
            pulumi.set(__self__, "ip_addresses", ip_addresses)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if protocols is not None:
            pulumi.set(__self__, "protocols", protocols)
        if resolver_endpoint_type is not None:
            pulumi.set(__self__, "resolver_endpoint_type", resolver_endpoint_type)
        if security_group_ids is not None:
            pulumi.set(__self__, "security_group_ids", security_group_ids)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if tags_all is not None:
            warnings.warn("""Please use `tags` instead.""", DeprecationWarning)
            pulumi.log.warn("""tags_all is deprecated: Please use `tags` instead.""")
        if tags_all is not None:
            pulumi.set(__self__, "tags_all", tags_all)

    @property
    @pulumi.getter
    def arn(self) -> Optional[pulumi.Input[str]]:
        """
        The ARN of the Route 53 Resolver endpoint.
        """
        return pulumi.get(self, "arn")

    @arn.setter
    def arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "arn", value)

    @property
    @pulumi.getter
    def direction(self) -> Optional[pulumi.Input[str]]:
        """
        The direction of DNS queries to or from the Route 53 Resolver endpoint.
        Valid values are `INBOUND` (resolver forwards DNS queries to the DNS service for a VPC from your network or another VPC)
        or `OUTBOUND` (resolver forwards DNS queries from the DNS service for a VPC to your network or another VPC).
        """
        return pulumi.get(self, "direction")

    @direction.setter
    def direction(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "direction", value)

    @property
    @pulumi.getter(name="hostVpcId")
    def host_vpc_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the VPC that you want to create the resolver endpoint in.
        """
        return pulumi.get(self, "host_vpc_id")

    @host_vpc_id.setter
    def host_vpc_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "host_vpc_id", value)

    @property
    @pulumi.getter(name="ipAddresses")
    def ip_addresses(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ResolverEndpointIpAddressArgs']]]]:
        """
        The subnets and IP addresses in your VPC that you want DNS queries to pass through on the way from your VPCs
        to your network (for outbound endpoints) or on the way from your network to your VPCs (for inbound endpoints). Described below.
        """
        return pulumi.get(self, "ip_addresses")

    @ip_addresses.setter
    def ip_addresses(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ResolverEndpointIpAddressArgs']]]]):
        pulumi.set(self, "ip_addresses", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The friendly name of the Route 53 Resolver endpoint.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def protocols(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        The protocols you want to use for the Route 53 Resolver endpoint. Valid values: `DoH`, `Do53`, `DoH-FIPS`.
        """
        return pulumi.get(self, "protocols")

    @protocols.setter
    def protocols(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "protocols", value)

    @property
    @pulumi.getter(name="resolverEndpointType")
    def resolver_endpoint_type(self) -> Optional[pulumi.Input[str]]:
        """
        The Route 53 Resolver endpoint IP address type. Valid values: `IPV4`, `IPV6`, `DUALSTACK`.
        """
        return pulumi.get(self, "resolver_endpoint_type")

    @resolver_endpoint_type.setter
    def resolver_endpoint_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "resolver_endpoint_type", value)

    @property
    @pulumi.getter(name="securityGroupIds")
    def security_group_ids(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        The ID of one or more security groups that you want to use to control access to this VPC.
        """
        return pulumi.get(self, "security_group_ids")

    @security_group_ids.setter
    def security_group_ids(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "security_group_ids", value)

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


class ResolverEndpoint(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 direction: Optional[pulumi.Input[str]] = None,
                 ip_addresses: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ResolverEndpointIpAddressArgs']]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 protocols: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 resolver_endpoint_type: Optional[pulumi.Input[str]] = None,
                 security_group_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 __props__=None):
        """
        Provides a Route 53 Resolver endpoint resource.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        foo = aws.route53.ResolverEndpoint("foo",
            name="foo",
            direction="INBOUND",
            security_group_ids=[
                sg1["id"],
                sg2["id"],
            ],
            ip_addresses=[
                aws.route53.ResolverEndpointIpAddressArgs(
                    subnet_id=sn1["id"],
                ),
                aws.route53.ResolverEndpointIpAddressArgs(
                    subnet_id=sn2["id"],
                    ip="10.0.64.4",
                ),
            ],
            protocols=[
                "Do53",
                "DoH",
            ],
            tags={
                "Environment": "Prod",
            })
        ```

        ## Import

        Using `pulumi import`, import  Route 53 Resolver endpoints using the Route 53 Resolver endpoint ID. For example:

        ```sh
        $ pulumi import aws:route53/resolverEndpoint:ResolverEndpoint foo rslvr-in-abcdef01234567890
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] direction: The direction of DNS queries to or from the Route 53 Resolver endpoint.
               Valid values are `INBOUND` (resolver forwards DNS queries to the DNS service for a VPC from your network or another VPC)
               or `OUTBOUND` (resolver forwards DNS queries from the DNS service for a VPC to your network or another VPC).
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ResolverEndpointIpAddressArgs']]]] ip_addresses: The subnets and IP addresses in your VPC that you want DNS queries to pass through on the way from your VPCs
               to your network (for outbound endpoints) or on the way from your network to your VPCs (for inbound endpoints). Described below.
        :param pulumi.Input[str] name: The friendly name of the Route 53 Resolver endpoint.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] protocols: The protocols you want to use for the Route 53 Resolver endpoint. Valid values: `DoH`, `Do53`, `DoH-FIPS`.
        :param pulumi.Input[str] resolver_endpoint_type: The Route 53 Resolver endpoint IP address type. Valid values: `IPV4`, `IPV6`, `DUALSTACK`.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] security_group_ids: The ID of one or more security groups that you want to use to control access to this VPC.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ResolverEndpointArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Route 53 Resolver endpoint resource.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        foo = aws.route53.ResolverEndpoint("foo",
            name="foo",
            direction="INBOUND",
            security_group_ids=[
                sg1["id"],
                sg2["id"],
            ],
            ip_addresses=[
                aws.route53.ResolverEndpointIpAddressArgs(
                    subnet_id=sn1["id"],
                ),
                aws.route53.ResolverEndpointIpAddressArgs(
                    subnet_id=sn2["id"],
                    ip="10.0.64.4",
                ),
            ],
            protocols=[
                "Do53",
                "DoH",
            ],
            tags={
                "Environment": "Prod",
            })
        ```

        ## Import

        Using `pulumi import`, import  Route 53 Resolver endpoints using the Route 53 Resolver endpoint ID. For example:

        ```sh
        $ pulumi import aws:route53/resolverEndpoint:ResolverEndpoint foo rslvr-in-abcdef01234567890
        ```

        :param str resource_name: The name of the resource.
        :param ResolverEndpointArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ResolverEndpointArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 direction: Optional[pulumi.Input[str]] = None,
                 ip_addresses: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ResolverEndpointIpAddressArgs']]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 protocols: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 resolver_endpoint_type: Optional[pulumi.Input[str]] = None,
                 security_group_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ResolverEndpointArgs.__new__(ResolverEndpointArgs)

            if direction is None and not opts.urn:
                raise TypeError("Missing required property 'direction'")
            __props__.__dict__["direction"] = direction
            if ip_addresses is None and not opts.urn:
                raise TypeError("Missing required property 'ip_addresses'")
            __props__.__dict__["ip_addresses"] = ip_addresses
            __props__.__dict__["name"] = name
            __props__.__dict__["protocols"] = protocols
            __props__.__dict__["resolver_endpoint_type"] = resolver_endpoint_type
            if security_group_ids is None and not opts.urn:
                raise TypeError("Missing required property 'security_group_ids'")
            __props__.__dict__["security_group_ids"] = security_group_ids
            __props__.__dict__["tags"] = tags
            __props__.__dict__["arn"] = None
            __props__.__dict__["host_vpc_id"] = None
            __props__.__dict__["tags_all"] = None
        super(ResolverEndpoint, __self__).__init__(
            'aws:route53/resolverEndpoint:ResolverEndpoint',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            arn: Optional[pulumi.Input[str]] = None,
            direction: Optional[pulumi.Input[str]] = None,
            host_vpc_id: Optional[pulumi.Input[str]] = None,
            ip_addresses: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ResolverEndpointIpAddressArgs']]]]] = None,
            name: Optional[pulumi.Input[str]] = None,
            protocols: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            resolver_endpoint_type: Optional[pulumi.Input[str]] = None,
            security_group_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None) -> 'ResolverEndpoint':
        """
        Get an existing ResolverEndpoint resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] arn: The ARN of the Route 53 Resolver endpoint.
        :param pulumi.Input[str] direction: The direction of DNS queries to or from the Route 53 Resolver endpoint.
               Valid values are `INBOUND` (resolver forwards DNS queries to the DNS service for a VPC from your network or another VPC)
               or `OUTBOUND` (resolver forwards DNS queries from the DNS service for a VPC to your network or another VPC).
        :param pulumi.Input[str] host_vpc_id: The ID of the VPC that you want to create the resolver endpoint in.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ResolverEndpointIpAddressArgs']]]] ip_addresses: The subnets and IP addresses in your VPC that you want DNS queries to pass through on the way from your VPCs
               to your network (for outbound endpoints) or on the way from your network to your VPCs (for inbound endpoints). Described below.
        :param pulumi.Input[str] name: The friendly name of the Route 53 Resolver endpoint.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] protocols: The protocols you want to use for the Route 53 Resolver endpoint. Valid values: `DoH`, `Do53`, `DoH-FIPS`.
        :param pulumi.Input[str] resolver_endpoint_type: The Route 53 Resolver endpoint IP address type. Valid values: `IPV4`, `IPV6`, `DUALSTACK`.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] security_group_ids: The ID of one or more security groups that you want to use to control access to this VPC.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ResolverEndpointState.__new__(_ResolverEndpointState)

        __props__.__dict__["arn"] = arn
        __props__.__dict__["direction"] = direction
        __props__.__dict__["host_vpc_id"] = host_vpc_id
        __props__.__dict__["ip_addresses"] = ip_addresses
        __props__.__dict__["name"] = name
        __props__.__dict__["protocols"] = protocols
        __props__.__dict__["resolver_endpoint_type"] = resolver_endpoint_type
        __props__.__dict__["security_group_ids"] = security_group_ids
        __props__.__dict__["tags"] = tags
        __props__.__dict__["tags_all"] = tags_all
        return ResolverEndpoint(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def arn(self) -> pulumi.Output[str]:
        """
        The ARN of the Route 53 Resolver endpoint.
        """
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter
    def direction(self) -> pulumi.Output[str]:
        """
        The direction of DNS queries to or from the Route 53 Resolver endpoint.
        Valid values are `INBOUND` (resolver forwards DNS queries to the DNS service for a VPC from your network or another VPC)
        or `OUTBOUND` (resolver forwards DNS queries from the DNS service for a VPC to your network or another VPC).
        """
        return pulumi.get(self, "direction")

    @property
    @pulumi.getter(name="hostVpcId")
    def host_vpc_id(self) -> pulumi.Output[str]:
        """
        The ID of the VPC that you want to create the resolver endpoint in.
        """
        return pulumi.get(self, "host_vpc_id")

    @property
    @pulumi.getter(name="ipAddresses")
    def ip_addresses(self) -> pulumi.Output[Sequence['outputs.ResolverEndpointIpAddress']]:
        """
        The subnets and IP addresses in your VPC that you want DNS queries to pass through on the way from your VPCs
        to your network (for outbound endpoints) or on the way from your network to your VPCs (for inbound endpoints). Described below.
        """
        return pulumi.get(self, "ip_addresses")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The friendly name of the Route 53 Resolver endpoint.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def protocols(self) -> pulumi.Output[Sequence[str]]:
        """
        The protocols you want to use for the Route 53 Resolver endpoint. Valid values: `DoH`, `Do53`, `DoH-FIPS`.
        """
        return pulumi.get(self, "protocols")

    @property
    @pulumi.getter(name="resolverEndpointType")
    def resolver_endpoint_type(self) -> pulumi.Output[str]:
        """
        The Route 53 Resolver endpoint IP address type. Valid values: `IPV4`, `IPV6`, `DUALSTACK`.
        """
        return pulumi.get(self, "resolver_endpoint_type")

    @property
    @pulumi.getter(name="securityGroupIds")
    def security_group_ids(self) -> pulumi.Output[Sequence[str]]:
        """
        The ID of one or more security groups that you want to use to control access to this VPC.
        """
        return pulumi.get(self, "security_group_ids")

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


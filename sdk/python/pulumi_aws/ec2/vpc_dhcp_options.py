# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['VpcDhcpOptionsArgs', 'VpcDhcpOptions']

@pulumi.input_type
class VpcDhcpOptionsArgs:
    def __init__(__self__, *,
                 domain_name: Optional[pulumi.Input[str]] = None,
                 domain_name_servers: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 netbios_name_servers: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 netbios_node_type: Optional[pulumi.Input[str]] = None,
                 ntp_servers: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        The set of arguments for constructing a VpcDhcpOptions resource.
        :param pulumi.Input[str] domain_name: the suffix domain name to use by default when resolving non Fully Qualified Domain Names. In other words, this is what ends up being the `search` value in the `/etc/resolv.conf` file.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] domain_name_servers: List of name servers to configure in `/etc/resolv.conf`. If you want to use the default AWS nameservers you should set this to `AmazonProvidedDNS`.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] netbios_name_servers: List of NETBIOS name servers.
        :param pulumi.Input[str] netbios_node_type: The NetBIOS node type (1, 2, 4, or 8). AWS recommends to specify 2 since broadcast and multicast are not supported in their network. For more information about these node types, see [RFC 2132](http://www.ietf.org/rfc/rfc2132.txt).
        :param pulumi.Input[Sequence[pulumi.Input[str]]] ntp_servers: List of NTP servers to configure.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A map of tags to assign to the resource.
        """
        if domain_name is not None:
            pulumi.set(__self__, "domain_name", domain_name)
        if domain_name_servers is not None:
            pulumi.set(__self__, "domain_name_servers", domain_name_servers)
        if netbios_name_servers is not None:
            pulumi.set(__self__, "netbios_name_servers", netbios_name_servers)
        if netbios_node_type is not None:
            pulumi.set(__self__, "netbios_node_type", netbios_node_type)
        if ntp_servers is not None:
            pulumi.set(__self__, "ntp_servers", ntp_servers)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter(name="domainName")
    def domain_name(self) -> Optional[pulumi.Input[str]]:
        """
        the suffix domain name to use by default when resolving non Fully Qualified Domain Names. In other words, this is what ends up being the `search` value in the `/etc/resolv.conf` file.
        """
        return pulumi.get(self, "domain_name")

    @domain_name.setter
    def domain_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "domain_name", value)

    @property
    @pulumi.getter(name="domainNameServers")
    def domain_name_servers(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        List of name servers to configure in `/etc/resolv.conf`. If you want to use the default AWS nameservers you should set this to `AmazonProvidedDNS`.
        """
        return pulumi.get(self, "domain_name_servers")

    @domain_name_servers.setter
    def domain_name_servers(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "domain_name_servers", value)

    @property
    @pulumi.getter(name="netbiosNameServers")
    def netbios_name_servers(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        List of NETBIOS name servers.
        """
        return pulumi.get(self, "netbios_name_servers")

    @netbios_name_servers.setter
    def netbios_name_servers(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "netbios_name_servers", value)

    @property
    @pulumi.getter(name="netbiosNodeType")
    def netbios_node_type(self) -> Optional[pulumi.Input[str]]:
        """
        The NetBIOS node type (1, 2, 4, or 8). AWS recommends to specify 2 since broadcast and multicast are not supported in their network. For more information about these node types, see [RFC 2132](http://www.ietf.org/rfc/rfc2132.txt).
        """
        return pulumi.get(self, "netbios_node_type")

    @netbios_node_type.setter
    def netbios_node_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "netbios_node_type", value)

    @property
    @pulumi.getter(name="ntpServers")
    def ntp_servers(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        List of NTP servers to configure.
        """
        return pulumi.get(self, "ntp_servers")

    @ntp_servers.setter
    def ntp_servers(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "ntp_servers", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        A map of tags to assign to the resource.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)


@pulumi.input_type
class _VpcDhcpOptionsState:
    def __init__(__self__, *,
                 arn: Optional[pulumi.Input[str]] = None,
                 domain_name: Optional[pulumi.Input[str]] = None,
                 domain_name_servers: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 netbios_name_servers: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 netbios_node_type: Optional[pulumi.Input[str]] = None,
                 ntp_servers: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 owner_id: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        Input properties used for looking up and filtering VpcDhcpOptions resources.
        :param pulumi.Input[str] arn: The ARN of the DHCP Options Set.
        :param pulumi.Input[str] domain_name: the suffix domain name to use by default when resolving non Fully Qualified Domain Names. In other words, this is what ends up being the `search` value in the `/etc/resolv.conf` file.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] domain_name_servers: List of name servers to configure in `/etc/resolv.conf`. If you want to use the default AWS nameservers you should set this to `AmazonProvidedDNS`.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] netbios_name_servers: List of NETBIOS name servers.
        :param pulumi.Input[str] netbios_node_type: The NetBIOS node type (1, 2, 4, or 8). AWS recommends to specify 2 since broadcast and multicast are not supported in their network. For more information about these node types, see [RFC 2132](http://www.ietf.org/rfc/rfc2132.txt).
        :param pulumi.Input[Sequence[pulumi.Input[str]]] ntp_servers: List of NTP servers to configure.
        :param pulumi.Input[str] owner_id: The ID of the AWS account that owns the DHCP options set.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A map of tags to assign to the resource.
        """
        if arn is not None:
            pulumi.set(__self__, "arn", arn)
        if domain_name is not None:
            pulumi.set(__self__, "domain_name", domain_name)
        if domain_name_servers is not None:
            pulumi.set(__self__, "domain_name_servers", domain_name_servers)
        if netbios_name_servers is not None:
            pulumi.set(__self__, "netbios_name_servers", netbios_name_servers)
        if netbios_node_type is not None:
            pulumi.set(__self__, "netbios_node_type", netbios_node_type)
        if ntp_servers is not None:
            pulumi.set(__self__, "ntp_servers", ntp_servers)
        if owner_id is not None:
            pulumi.set(__self__, "owner_id", owner_id)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter
    def arn(self) -> Optional[pulumi.Input[str]]:
        """
        The ARN of the DHCP Options Set.
        """
        return pulumi.get(self, "arn")

    @arn.setter
    def arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "arn", value)

    @property
    @pulumi.getter(name="domainName")
    def domain_name(self) -> Optional[pulumi.Input[str]]:
        """
        the suffix domain name to use by default when resolving non Fully Qualified Domain Names. In other words, this is what ends up being the `search` value in the `/etc/resolv.conf` file.
        """
        return pulumi.get(self, "domain_name")

    @domain_name.setter
    def domain_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "domain_name", value)

    @property
    @pulumi.getter(name="domainNameServers")
    def domain_name_servers(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        List of name servers to configure in `/etc/resolv.conf`. If you want to use the default AWS nameservers you should set this to `AmazonProvidedDNS`.
        """
        return pulumi.get(self, "domain_name_servers")

    @domain_name_servers.setter
    def domain_name_servers(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "domain_name_servers", value)

    @property
    @pulumi.getter(name="netbiosNameServers")
    def netbios_name_servers(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        List of NETBIOS name servers.
        """
        return pulumi.get(self, "netbios_name_servers")

    @netbios_name_servers.setter
    def netbios_name_servers(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "netbios_name_servers", value)

    @property
    @pulumi.getter(name="netbiosNodeType")
    def netbios_node_type(self) -> Optional[pulumi.Input[str]]:
        """
        The NetBIOS node type (1, 2, 4, or 8). AWS recommends to specify 2 since broadcast and multicast are not supported in their network. For more information about these node types, see [RFC 2132](http://www.ietf.org/rfc/rfc2132.txt).
        """
        return pulumi.get(self, "netbios_node_type")

    @netbios_node_type.setter
    def netbios_node_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "netbios_node_type", value)

    @property
    @pulumi.getter(name="ntpServers")
    def ntp_servers(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        List of NTP servers to configure.
        """
        return pulumi.get(self, "ntp_servers")

    @ntp_servers.setter
    def ntp_servers(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "ntp_servers", value)

    @property
    @pulumi.getter(name="ownerId")
    def owner_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the AWS account that owns the DHCP options set.
        """
        return pulumi.get(self, "owner_id")

    @owner_id.setter
    def owner_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "owner_id", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        A map of tags to assign to the resource.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)


class VpcDhcpOptions(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 domain_name: Optional[pulumi.Input[str]] = None,
                 domain_name_servers: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 netbios_name_servers: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 netbios_node_type: Optional[pulumi.Input[str]] = None,
                 ntp_servers: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 __props__=None):
        """
        Provides a VPC DHCP Options resource.

        ## Example Usage

        Basic usage:

        ```python
        import pulumi
        import pulumi_aws as aws

        dns_resolver = aws.ec2.VpcDhcpOptions("dnsResolver", domain_name_servers=[
            "8.8.8.8",
            "8.8.4.4",
        ])
        ```

        Full usage:

        ```python
        import pulumi
        import pulumi_aws as aws

        foo = aws.ec2.VpcDhcpOptions("foo",
            domain_name="service.consul",
            domain_name_servers=[
                "127.0.0.1",
                "10.0.0.2",
            ],
            netbios_name_servers=["127.0.0.1"],
            netbios_node_type="2",
            ntp_servers=["127.0.0.1"],
            tags={
                "Name": "foo-name",
            })
        ```
        ## Remarks

        * Notice that all arguments are optional but you have to specify at least one argument.
        * `domain_name_servers`, `netbios_name_servers`, `ntp_servers` are limited by AWS to maximum four servers only.
        * To actually use the DHCP Options Set you need to associate it to a VPC using `ec2.VpcDhcpOptionsAssociation`.
        * If you delete a DHCP Options Set, all VPCs using it will be associated to AWS's `default` DHCP Option Set.
        * In most cases unless you're configuring your own DNS you'll want to set `domain_name_servers` to `AmazonProvidedDNS`.

        ## Import

        VPC DHCP Options can be imported using the `dhcp options id`, e.g.

        ```sh
         $ pulumi import aws:ec2/vpcDhcpOptions:VpcDhcpOptions my_options dopt-d9070ebb
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] domain_name: the suffix domain name to use by default when resolving non Fully Qualified Domain Names. In other words, this is what ends up being the `search` value in the `/etc/resolv.conf` file.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] domain_name_servers: List of name servers to configure in `/etc/resolv.conf`. If you want to use the default AWS nameservers you should set this to `AmazonProvidedDNS`.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] netbios_name_servers: List of NETBIOS name servers.
        :param pulumi.Input[str] netbios_node_type: The NetBIOS node type (1, 2, 4, or 8). AWS recommends to specify 2 since broadcast and multicast are not supported in their network. For more information about these node types, see [RFC 2132](http://www.ietf.org/rfc/rfc2132.txt).
        :param pulumi.Input[Sequence[pulumi.Input[str]]] ntp_servers: List of NTP servers to configure.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A map of tags to assign to the resource.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[VpcDhcpOptionsArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a VPC DHCP Options resource.

        ## Example Usage

        Basic usage:

        ```python
        import pulumi
        import pulumi_aws as aws

        dns_resolver = aws.ec2.VpcDhcpOptions("dnsResolver", domain_name_servers=[
            "8.8.8.8",
            "8.8.4.4",
        ])
        ```

        Full usage:

        ```python
        import pulumi
        import pulumi_aws as aws

        foo = aws.ec2.VpcDhcpOptions("foo",
            domain_name="service.consul",
            domain_name_servers=[
                "127.0.0.1",
                "10.0.0.2",
            ],
            netbios_name_servers=["127.0.0.1"],
            netbios_node_type="2",
            ntp_servers=["127.0.0.1"],
            tags={
                "Name": "foo-name",
            })
        ```
        ## Remarks

        * Notice that all arguments are optional but you have to specify at least one argument.
        * `domain_name_servers`, `netbios_name_servers`, `ntp_servers` are limited by AWS to maximum four servers only.
        * To actually use the DHCP Options Set you need to associate it to a VPC using `ec2.VpcDhcpOptionsAssociation`.
        * If you delete a DHCP Options Set, all VPCs using it will be associated to AWS's `default` DHCP Option Set.
        * In most cases unless you're configuring your own DNS you'll want to set `domain_name_servers` to `AmazonProvidedDNS`.

        ## Import

        VPC DHCP Options can be imported using the `dhcp options id`, e.g.

        ```sh
         $ pulumi import aws:ec2/vpcDhcpOptions:VpcDhcpOptions my_options dopt-d9070ebb
        ```

        :param str resource_name: The name of the resource.
        :param VpcDhcpOptionsArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(VpcDhcpOptionsArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 domain_name: Optional[pulumi.Input[str]] = None,
                 domain_name_servers: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 netbios_name_servers: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 netbios_node_type: Optional[pulumi.Input[str]] = None,
                 ntp_servers: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 __props__=None):
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = _utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = VpcDhcpOptionsArgs.__new__(VpcDhcpOptionsArgs)

            __props__.__dict__["domain_name"] = domain_name
            __props__.__dict__["domain_name_servers"] = domain_name_servers
            __props__.__dict__["netbios_name_servers"] = netbios_name_servers
            __props__.__dict__["netbios_node_type"] = netbios_node_type
            __props__.__dict__["ntp_servers"] = ntp_servers
            __props__.__dict__["tags"] = tags
            __props__.__dict__["arn"] = None
            __props__.__dict__["owner_id"] = None
        super(VpcDhcpOptions, __self__).__init__(
            'aws:ec2/vpcDhcpOptions:VpcDhcpOptions',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            arn: Optional[pulumi.Input[str]] = None,
            domain_name: Optional[pulumi.Input[str]] = None,
            domain_name_servers: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            netbios_name_servers: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            netbios_node_type: Optional[pulumi.Input[str]] = None,
            ntp_servers: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            owner_id: Optional[pulumi.Input[str]] = None,
            tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None) -> 'VpcDhcpOptions':
        """
        Get an existing VpcDhcpOptions resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] arn: The ARN of the DHCP Options Set.
        :param pulumi.Input[str] domain_name: the suffix domain name to use by default when resolving non Fully Qualified Domain Names. In other words, this is what ends up being the `search` value in the `/etc/resolv.conf` file.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] domain_name_servers: List of name servers to configure in `/etc/resolv.conf`. If you want to use the default AWS nameservers you should set this to `AmazonProvidedDNS`.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] netbios_name_servers: List of NETBIOS name servers.
        :param pulumi.Input[str] netbios_node_type: The NetBIOS node type (1, 2, 4, or 8). AWS recommends to specify 2 since broadcast and multicast are not supported in their network. For more information about these node types, see [RFC 2132](http://www.ietf.org/rfc/rfc2132.txt).
        :param pulumi.Input[Sequence[pulumi.Input[str]]] ntp_servers: List of NTP servers to configure.
        :param pulumi.Input[str] owner_id: The ID of the AWS account that owns the DHCP options set.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A map of tags to assign to the resource.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _VpcDhcpOptionsState.__new__(_VpcDhcpOptionsState)

        __props__.__dict__["arn"] = arn
        __props__.__dict__["domain_name"] = domain_name
        __props__.__dict__["domain_name_servers"] = domain_name_servers
        __props__.__dict__["netbios_name_servers"] = netbios_name_servers
        __props__.__dict__["netbios_node_type"] = netbios_node_type
        __props__.__dict__["ntp_servers"] = ntp_servers
        __props__.__dict__["owner_id"] = owner_id
        __props__.__dict__["tags"] = tags
        return VpcDhcpOptions(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def arn(self) -> pulumi.Output[str]:
        """
        The ARN of the DHCP Options Set.
        """
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter(name="domainName")
    def domain_name(self) -> pulumi.Output[Optional[str]]:
        """
        the suffix domain name to use by default when resolving non Fully Qualified Domain Names. In other words, this is what ends up being the `search` value in the `/etc/resolv.conf` file.
        """
        return pulumi.get(self, "domain_name")

    @property
    @pulumi.getter(name="domainNameServers")
    def domain_name_servers(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        List of name servers to configure in `/etc/resolv.conf`. If you want to use the default AWS nameservers you should set this to `AmazonProvidedDNS`.
        """
        return pulumi.get(self, "domain_name_servers")

    @property
    @pulumi.getter(name="netbiosNameServers")
    def netbios_name_servers(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        List of NETBIOS name servers.
        """
        return pulumi.get(self, "netbios_name_servers")

    @property
    @pulumi.getter(name="netbiosNodeType")
    def netbios_node_type(self) -> pulumi.Output[Optional[str]]:
        """
        The NetBIOS node type (1, 2, 4, or 8). AWS recommends to specify 2 since broadcast and multicast are not supported in their network. For more information about these node types, see [RFC 2132](http://www.ietf.org/rfc/rfc2132.txt).
        """
        return pulumi.get(self, "netbios_node_type")

    @property
    @pulumi.getter(name="ntpServers")
    def ntp_servers(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        List of NTP servers to configure.
        """
        return pulumi.get(self, "ntp_servers")

    @property
    @pulumi.getter(name="ownerId")
    def owner_id(self) -> pulumi.Output[str]:
        """
        The ID of the AWS account that owns the DHCP options set.
        """
        return pulumi.get(self, "owner_id")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, str]]]:
        """
        A map of tags to assign to the resource.
        """
        return pulumi.get(self, "tags")


# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['DefaultVpcArgs', 'DefaultVpc']

@pulumi.input_type
class DefaultVpcArgs:
    def __init__(__self__, *,
                 assign_generated_ipv6_cidr_block: Optional[pulumi.Input[bool]] = None,
                 enable_dns_hostnames: Optional[pulumi.Input[bool]] = None,
                 enable_dns_support: Optional[pulumi.Input[bool]] = None,
                 enable_network_address_usage_metrics: Optional[pulumi.Input[bool]] = None,
                 force_destroy: Optional[pulumi.Input[bool]] = None,
                 ipv6_cidr_block: Optional[pulumi.Input[str]] = None,
                 ipv6_cidr_block_network_border_group: Optional[pulumi.Input[str]] = None,
                 ipv6_ipam_pool_id: Optional[pulumi.Input[str]] = None,
                 ipv6_netmask_length: Optional[pulumi.Input[int]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        The set of arguments for constructing a DefaultVpc resource.
        :param pulumi.Input[bool] force_destroy: Whether destroying the resource deletes the default VPC. Default: `false`
        """
        if assign_generated_ipv6_cidr_block is not None:
            pulumi.set(__self__, "assign_generated_ipv6_cidr_block", assign_generated_ipv6_cidr_block)
        if enable_dns_hostnames is not None:
            pulumi.set(__self__, "enable_dns_hostnames", enable_dns_hostnames)
        if enable_dns_support is not None:
            pulumi.set(__self__, "enable_dns_support", enable_dns_support)
        if enable_network_address_usage_metrics is not None:
            pulumi.set(__self__, "enable_network_address_usage_metrics", enable_network_address_usage_metrics)
        if force_destroy is not None:
            pulumi.set(__self__, "force_destroy", force_destroy)
        if ipv6_cidr_block is not None:
            pulumi.set(__self__, "ipv6_cidr_block", ipv6_cidr_block)
        if ipv6_cidr_block_network_border_group is not None:
            pulumi.set(__self__, "ipv6_cidr_block_network_border_group", ipv6_cidr_block_network_border_group)
        if ipv6_ipam_pool_id is not None:
            pulumi.set(__self__, "ipv6_ipam_pool_id", ipv6_ipam_pool_id)
        if ipv6_netmask_length is not None:
            pulumi.set(__self__, "ipv6_netmask_length", ipv6_netmask_length)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter(name="assignGeneratedIpv6CidrBlock")
    def assign_generated_ipv6_cidr_block(self) -> Optional[pulumi.Input[bool]]:
        return pulumi.get(self, "assign_generated_ipv6_cidr_block")

    @assign_generated_ipv6_cidr_block.setter
    def assign_generated_ipv6_cidr_block(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "assign_generated_ipv6_cidr_block", value)

    @property
    @pulumi.getter(name="enableDnsHostnames")
    def enable_dns_hostnames(self) -> Optional[pulumi.Input[bool]]:
        return pulumi.get(self, "enable_dns_hostnames")

    @enable_dns_hostnames.setter
    def enable_dns_hostnames(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "enable_dns_hostnames", value)

    @property
    @pulumi.getter(name="enableDnsSupport")
    def enable_dns_support(self) -> Optional[pulumi.Input[bool]]:
        return pulumi.get(self, "enable_dns_support")

    @enable_dns_support.setter
    def enable_dns_support(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "enable_dns_support", value)

    @property
    @pulumi.getter(name="enableNetworkAddressUsageMetrics")
    def enable_network_address_usage_metrics(self) -> Optional[pulumi.Input[bool]]:
        return pulumi.get(self, "enable_network_address_usage_metrics")

    @enable_network_address_usage_metrics.setter
    def enable_network_address_usage_metrics(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "enable_network_address_usage_metrics", value)

    @property
    @pulumi.getter(name="forceDestroy")
    def force_destroy(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether destroying the resource deletes the default VPC. Default: `false`
        """
        return pulumi.get(self, "force_destroy")

    @force_destroy.setter
    def force_destroy(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "force_destroy", value)

    @property
    @pulumi.getter(name="ipv6CidrBlock")
    def ipv6_cidr_block(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "ipv6_cidr_block")

    @ipv6_cidr_block.setter
    def ipv6_cidr_block(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "ipv6_cidr_block", value)

    @property
    @pulumi.getter(name="ipv6CidrBlockNetworkBorderGroup")
    def ipv6_cidr_block_network_border_group(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "ipv6_cidr_block_network_border_group")

    @ipv6_cidr_block_network_border_group.setter
    def ipv6_cidr_block_network_border_group(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "ipv6_cidr_block_network_border_group", value)

    @property
    @pulumi.getter(name="ipv6IpamPoolId")
    def ipv6_ipam_pool_id(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "ipv6_ipam_pool_id")

    @ipv6_ipam_pool_id.setter
    def ipv6_ipam_pool_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "ipv6_ipam_pool_id", value)

    @property
    @pulumi.getter(name="ipv6NetmaskLength")
    def ipv6_netmask_length(self) -> Optional[pulumi.Input[int]]:
        return pulumi.get(self, "ipv6_netmask_length")

    @ipv6_netmask_length.setter
    def ipv6_netmask_length(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "ipv6_netmask_length", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)


@pulumi.input_type
class _DefaultVpcState:
    def __init__(__self__, *,
                 arn: Optional[pulumi.Input[str]] = None,
                 assign_generated_ipv6_cidr_block: Optional[pulumi.Input[bool]] = None,
                 cidr_block: Optional[pulumi.Input[str]] = None,
                 default_network_acl_id: Optional[pulumi.Input[str]] = None,
                 default_route_table_id: Optional[pulumi.Input[str]] = None,
                 default_security_group_id: Optional[pulumi.Input[str]] = None,
                 dhcp_options_id: Optional[pulumi.Input[str]] = None,
                 enable_dns_hostnames: Optional[pulumi.Input[bool]] = None,
                 enable_dns_support: Optional[pulumi.Input[bool]] = None,
                 enable_network_address_usage_metrics: Optional[pulumi.Input[bool]] = None,
                 existing_default_vpc: Optional[pulumi.Input[bool]] = None,
                 force_destroy: Optional[pulumi.Input[bool]] = None,
                 instance_tenancy: Optional[pulumi.Input[str]] = None,
                 ipv6_association_id: Optional[pulumi.Input[str]] = None,
                 ipv6_cidr_block: Optional[pulumi.Input[str]] = None,
                 ipv6_cidr_block_network_border_group: Optional[pulumi.Input[str]] = None,
                 ipv6_ipam_pool_id: Optional[pulumi.Input[str]] = None,
                 ipv6_netmask_length: Optional[pulumi.Input[int]] = None,
                 main_route_table_id: Optional[pulumi.Input[str]] = None,
                 owner_id: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        Input properties used for looking up and filtering DefaultVpc resources.
        :param pulumi.Input[str] cidr_block: The primary IPv4 CIDR block for the VPC
        :param pulumi.Input[bool] force_destroy: Whether destroying the resource deletes the default VPC. Default: `false`
        :param pulumi.Input[str] instance_tenancy: The allowed tenancy of instances launched into the VPC
        """
        if arn is not None:
            pulumi.set(__self__, "arn", arn)
        if assign_generated_ipv6_cidr_block is not None:
            pulumi.set(__self__, "assign_generated_ipv6_cidr_block", assign_generated_ipv6_cidr_block)
        if cidr_block is not None:
            pulumi.set(__self__, "cidr_block", cidr_block)
        if default_network_acl_id is not None:
            pulumi.set(__self__, "default_network_acl_id", default_network_acl_id)
        if default_route_table_id is not None:
            pulumi.set(__self__, "default_route_table_id", default_route_table_id)
        if default_security_group_id is not None:
            pulumi.set(__self__, "default_security_group_id", default_security_group_id)
        if dhcp_options_id is not None:
            pulumi.set(__self__, "dhcp_options_id", dhcp_options_id)
        if enable_dns_hostnames is not None:
            pulumi.set(__self__, "enable_dns_hostnames", enable_dns_hostnames)
        if enable_dns_support is not None:
            pulumi.set(__self__, "enable_dns_support", enable_dns_support)
        if enable_network_address_usage_metrics is not None:
            pulumi.set(__self__, "enable_network_address_usage_metrics", enable_network_address_usage_metrics)
        if existing_default_vpc is not None:
            pulumi.set(__self__, "existing_default_vpc", existing_default_vpc)
        if force_destroy is not None:
            pulumi.set(__self__, "force_destroy", force_destroy)
        if instance_tenancy is not None:
            pulumi.set(__self__, "instance_tenancy", instance_tenancy)
        if ipv6_association_id is not None:
            pulumi.set(__self__, "ipv6_association_id", ipv6_association_id)
        if ipv6_cidr_block is not None:
            pulumi.set(__self__, "ipv6_cidr_block", ipv6_cidr_block)
        if ipv6_cidr_block_network_border_group is not None:
            pulumi.set(__self__, "ipv6_cidr_block_network_border_group", ipv6_cidr_block_network_border_group)
        if ipv6_ipam_pool_id is not None:
            pulumi.set(__self__, "ipv6_ipam_pool_id", ipv6_ipam_pool_id)
        if ipv6_netmask_length is not None:
            pulumi.set(__self__, "ipv6_netmask_length", ipv6_netmask_length)
        if main_route_table_id is not None:
            pulumi.set(__self__, "main_route_table_id", main_route_table_id)
        if owner_id is not None:
            pulumi.set(__self__, "owner_id", owner_id)
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
        return pulumi.get(self, "arn")

    @arn.setter
    def arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "arn", value)

    @property
    @pulumi.getter(name="assignGeneratedIpv6CidrBlock")
    def assign_generated_ipv6_cidr_block(self) -> Optional[pulumi.Input[bool]]:
        return pulumi.get(self, "assign_generated_ipv6_cidr_block")

    @assign_generated_ipv6_cidr_block.setter
    def assign_generated_ipv6_cidr_block(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "assign_generated_ipv6_cidr_block", value)

    @property
    @pulumi.getter(name="cidrBlock")
    def cidr_block(self) -> Optional[pulumi.Input[str]]:
        """
        The primary IPv4 CIDR block for the VPC
        """
        return pulumi.get(self, "cidr_block")

    @cidr_block.setter
    def cidr_block(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "cidr_block", value)

    @property
    @pulumi.getter(name="defaultNetworkAclId")
    def default_network_acl_id(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "default_network_acl_id")

    @default_network_acl_id.setter
    def default_network_acl_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "default_network_acl_id", value)

    @property
    @pulumi.getter(name="defaultRouteTableId")
    def default_route_table_id(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "default_route_table_id")

    @default_route_table_id.setter
    def default_route_table_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "default_route_table_id", value)

    @property
    @pulumi.getter(name="defaultSecurityGroupId")
    def default_security_group_id(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "default_security_group_id")

    @default_security_group_id.setter
    def default_security_group_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "default_security_group_id", value)

    @property
    @pulumi.getter(name="dhcpOptionsId")
    def dhcp_options_id(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "dhcp_options_id")

    @dhcp_options_id.setter
    def dhcp_options_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "dhcp_options_id", value)

    @property
    @pulumi.getter(name="enableDnsHostnames")
    def enable_dns_hostnames(self) -> Optional[pulumi.Input[bool]]:
        return pulumi.get(self, "enable_dns_hostnames")

    @enable_dns_hostnames.setter
    def enable_dns_hostnames(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "enable_dns_hostnames", value)

    @property
    @pulumi.getter(name="enableDnsSupport")
    def enable_dns_support(self) -> Optional[pulumi.Input[bool]]:
        return pulumi.get(self, "enable_dns_support")

    @enable_dns_support.setter
    def enable_dns_support(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "enable_dns_support", value)

    @property
    @pulumi.getter(name="enableNetworkAddressUsageMetrics")
    def enable_network_address_usage_metrics(self) -> Optional[pulumi.Input[bool]]:
        return pulumi.get(self, "enable_network_address_usage_metrics")

    @enable_network_address_usage_metrics.setter
    def enable_network_address_usage_metrics(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "enable_network_address_usage_metrics", value)

    @property
    @pulumi.getter(name="existingDefaultVpc")
    def existing_default_vpc(self) -> Optional[pulumi.Input[bool]]:
        return pulumi.get(self, "existing_default_vpc")

    @existing_default_vpc.setter
    def existing_default_vpc(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "existing_default_vpc", value)

    @property
    @pulumi.getter(name="forceDestroy")
    def force_destroy(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether destroying the resource deletes the default VPC. Default: `false`
        """
        return pulumi.get(self, "force_destroy")

    @force_destroy.setter
    def force_destroy(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "force_destroy", value)

    @property
    @pulumi.getter(name="instanceTenancy")
    def instance_tenancy(self) -> Optional[pulumi.Input[str]]:
        """
        The allowed tenancy of instances launched into the VPC
        """
        return pulumi.get(self, "instance_tenancy")

    @instance_tenancy.setter
    def instance_tenancy(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "instance_tenancy", value)

    @property
    @pulumi.getter(name="ipv6AssociationId")
    def ipv6_association_id(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "ipv6_association_id")

    @ipv6_association_id.setter
    def ipv6_association_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "ipv6_association_id", value)

    @property
    @pulumi.getter(name="ipv6CidrBlock")
    def ipv6_cidr_block(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "ipv6_cidr_block")

    @ipv6_cidr_block.setter
    def ipv6_cidr_block(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "ipv6_cidr_block", value)

    @property
    @pulumi.getter(name="ipv6CidrBlockNetworkBorderGroup")
    def ipv6_cidr_block_network_border_group(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "ipv6_cidr_block_network_border_group")

    @ipv6_cidr_block_network_border_group.setter
    def ipv6_cidr_block_network_border_group(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "ipv6_cidr_block_network_border_group", value)

    @property
    @pulumi.getter(name="ipv6IpamPoolId")
    def ipv6_ipam_pool_id(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "ipv6_ipam_pool_id")

    @ipv6_ipam_pool_id.setter
    def ipv6_ipam_pool_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "ipv6_ipam_pool_id", value)

    @property
    @pulumi.getter(name="ipv6NetmaskLength")
    def ipv6_netmask_length(self) -> Optional[pulumi.Input[int]]:
        return pulumi.get(self, "ipv6_netmask_length")

    @ipv6_netmask_length.setter
    def ipv6_netmask_length(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "ipv6_netmask_length", value)

    @property
    @pulumi.getter(name="mainRouteTableId")
    def main_route_table_id(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "main_route_table_id")

    @main_route_table_id.setter
    def main_route_table_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "main_route_table_id", value)

    @property
    @pulumi.getter(name="ownerId")
    def owner_id(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "owner_id")

    @owner_id.setter
    def owner_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "owner_id", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)

    @property
    @pulumi.getter(name="tagsAll")
    def tags_all(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        warnings.warn("""Please use `tags` instead.""", DeprecationWarning)
        pulumi.log.warn("""tags_all is deprecated: Please use `tags` instead.""")

        return pulumi.get(self, "tags_all")

    @tags_all.setter
    def tags_all(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags_all", value)


class DefaultVpc(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 assign_generated_ipv6_cidr_block: Optional[pulumi.Input[bool]] = None,
                 enable_dns_hostnames: Optional[pulumi.Input[bool]] = None,
                 enable_dns_support: Optional[pulumi.Input[bool]] = None,
                 enable_network_address_usage_metrics: Optional[pulumi.Input[bool]] = None,
                 force_destroy: Optional[pulumi.Input[bool]] = None,
                 ipv6_cidr_block: Optional[pulumi.Input[str]] = None,
                 ipv6_cidr_block_network_border_group: Optional[pulumi.Input[str]] = None,
                 ipv6_ipam_pool_id: Optional[pulumi.Input[str]] = None,
                 ipv6_netmask_length: Optional[pulumi.Input[int]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 __props__=None):
        """
        Provides a resource to manage the [default AWS VPC](http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/default-vpc.html)
        in the current AWS Region.

        If you created your AWS account after 2013-12-04 you have a default VPC in each AWS Region.

        **This is an advanced resource** and has special caveats to be aware of when using it. Please read this document in its entirety before using this resource.

        The `ec2.DefaultVpc` resource behaves differently from normal resources in that if a default VPC exists, this provider does not _create_ this resource, but instead "adopts" it into management.
        If no default VPC exists, the provider creates a new default VPC, which leads to the implicit creation of [other resources](https://docs.aws.amazon.com/vpc/latest/userguide/default-vpc.html#default-vpc-components).
        By default, `pulumi destroy` does not delete the default VPC but does remove the resource from the state.
        Set the `force_destroy` argument to `true` to delete the default VPC.

        ## Example Usage

        Basic usage with tags:

        ```python
        import pulumi
        import pulumi_aws as aws

        default = aws.ec2.DefaultVpc("default", tags={
            "Name": "Default VPC",
        })
        ```

        ## Import

        Using `pulumi import`, import Default VPCs using the VPC `id`. For example:

        ```sh
         $ pulumi import aws:ec2/defaultVpc:DefaultVpc default vpc-a01106c2
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] force_destroy: Whether destroying the resource deletes the default VPC. Default: `false`
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[DefaultVpcArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a resource to manage the [default AWS VPC](http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/default-vpc.html)
        in the current AWS Region.

        If you created your AWS account after 2013-12-04 you have a default VPC in each AWS Region.

        **This is an advanced resource** and has special caveats to be aware of when using it. Please read this document in its entirety before using this resource.

        The `ec2.DefaultVpc` resource behaves differently from normal resources in that if a default VPC exists, this provider does not _create_ this resource, but instead "adopts" it into management.
        If no default VPC exists, the provider creates a new default VPC, which leads to the implicit creation of [other resources](https://docs.aws.amazon.com/vpc/latest/userguide/default-vpc.html#default-vpc-components).
        By default, `pulumi destroy` does not delete the default VPC but does remove the resource from the state.
        Set the `force_destroy` argument to `true` to delete the default VPC.

        ## Example Usage

        Basic usage with tags:

        ```python
        import pulumi
        import pulumi_aws as aws

        default = aws.ec2.DefaultVpc("default", tags={
            "Name": "Default VPC",
        })
        ```

        ## Import

        Using `pulumi import`, import Default VPCs using the VPC `id`. For example:

        ```sh
         $ pulumi import aws:ec2/defaultVpc:DefaultVpc default vpc-a01106c2
        ```

        :param str resource_name: The name of the resource.
        :param DefaultVpcArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(DefaultVpcArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 assign_generated_ipv6_cidr_block: Optional[pulumi.Input[bool]] = None,
                 enable_dns_hostnames: Optional[pulumi.Input[bool]] = None,
                 enable_dns_support: Optional[pulumi.Input[bool]] = None,
                 enable_network_address_usage_metrics: Optional[pulumi.Input[bool]] = None,
                 force_destroy: Optional[pulumi.Input[bool]] = None,
                 ipv6_cidr_block: Optional[pulumi.Input[str]] = None,
                 ipv6_cidr_block_network_border_group: Optional[pulumi.Input[str]] = None,
                 ipv6_ipam_pool_id: Optional[pulumi.Input[str]] = None,
                 ipv6_netmask_length: Optional[pulumi.Input[int]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = DefaultVpcArgs.__new__(DefaultVpcArgs)

            __props__.__dict__["assign_generated_ipv6_cidr_block"] = assign_generated_ipv6_cidr_block
            __props__.__dict__["enable_dns_hostnames"] = enable_dns_hostnames
            __props__.__dict__["enable_dns_support"] = enable_dns_support
            __props__.__dict__["enable_network_address_usage_metrics"] = enable_network_address_usage_metrics
            __props__.__dict__["force_destroy"] = force_destroy
            __props__.__dict__["ipv6_cidr_block"] = ipv6_cidr_block
            __props__.__dict__["ipv6_cidr_block_network_border_group"] = ipv6_cidr_block_network_border_group
            __props__.__dict__["ipv6_ipam_pool_id"] = ipv6_ipam_pool_id
            __props__.__dict__["ipv6_netmask_length"] = ipv6_netmask_length
            __props__.__dict__["tags"] = tags
            __props__.__dict__["arn"] = None
            __props__.__dict__["cidr_block"] = None
            __props__.__dict__["default_network_acl_id"] = None
            __props__.__dict__["default_route_table_id"] = None
            __props__.__dict__["default_security_group_id"] = None
            __props__.__dict__["dhcp_options_id"] = None
            __props__.__dict__["existing_default_vpc"] = None
            __props__.__dict__["instance_tenancy"] = None
            __props__.__dict__["ipv6_association_id"] = None
            __props__.__dict__["main_route_table_id"] = None
            __props__.__dict__["owner_id"] = None
            __props__.__dict__["tags_all"] = None
        super(DefaultVpc, __self__).__init__(
            'aws:ec2/defaultVpc:DefaultVpc',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            arn: Optional[pulumi.Input[str]] = None,
            assign_generated_ipv6_cidr_block: Optional[pulumi.Input[bool]] = None,
            cidr_block: Optional[pulumi.Input[str]] = None,
            default_network_acl_id: Optional[pulumi.Input[str]] = None,
            default_route_table_id: Optional[pulumi.Input[str]] = None,
            default_security_group_id: Optional[pulumi.Input[str]] = None,
            dhcp_options_id: Optional[pulumi.Input[str]] = None,
            enable_dns_hostnames: Optional[pulumi.Input[bool]] = None,
            enable_dns_support: Optional[pulumi.Input[bool]] = None,
            enable_network_address_usage_metrics: Optional[pulumi.Input[bool]] = None,
            existing_default_vpc: Optional[pulumi.Input[bool]] = None,
            force_destroy: Optional[pulumi.Input[bool]] = None,
            instance_tenancy: Optional[pulumi.Input[str]] = None,
            ipv6_association_id: Optional[pulumi.Input[str]] = None,
            ipv6_cidr_block: Optional[pulumi.Input[str]] = None,
            ipv6_cidr_block_network_border_group: Optional[pulumi.Input[str]] = None,
            ipv6_ipam_pool_id: Optional[pulumi.Input[str]] = None,
            ipv6_netmask_length: Optional[pulumi.Input[int]] = None,
            main_route_table_id: Optional[pulumi.Input[str]] = None,
            owner_id: Optional[pulumi.Input[str]] = None,
            tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None) -> 'DefaultVpc':
        """
        Get an existing DefaultVpc resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] cidr_block: The primary IPv4 CIDR block for the VPC
        :param pulumi.Input[bool] force_destroy: Whether destroying the resource deletes the default VPC. Default: `false`
        :param pulumi.Input[str] instance_tenancy: The allowed tenancy of instances launched into the VPC
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _DefaultVpcState.__new__(_DefaultVpcState)

        __props__.__dict__["arn"] = arn
        __props__.__dict__["assign_generated_ipv6_cidr_block"] = assign_generated_ipv6_cidr_block
        __props__.__dict__["cidr_block"] = cidr_block
        __props__.__dict__["default_network_acl_id"] = default_network_acl_id
        __props__.__dict__["default_route_table_id"] = default_route_table_id
        __props__.__dict__["default_security_group_id"] = default_security_group_id
        __props__.__dict__["dhcp_options_id"] = dhcp_options_id
        __props__.__dict__["enable_dns_hostnames"] = enable_dns_hostnames
        __props__.__dict__["enable_dns_support"] = enable_dns_support
        __props__.__dict__["enable_network_address_usage_metrics"] = enable_network_address_usage_metrics
        __props__.__dict__["existing_default_vpc"] = existing_default_vpc
        __props__.__dict__["force_destroy"] = force_destroy
        __props__.__dict__["instance_tenancy"] = instance_tenancy
        __props__.__dict__["ipv6_association_id"] = ipv6_association_id
        __props__.__dict__["ipv6_cidr_block"] = ipv6_cidr_block
        __props__.__dict__["ipv6_cidr_block_network_border_group"] = ipv6_cidr_block_network_border_group
        __props__.__dict__["ipv6_ipam_pool_id"] = ipv6_ipam_pool_id
        __props__.__dict__["ipv6_netmask_length"] = ipv6_netmask_length
        __props__.__dict__["main_route_table_id"] = main_route_table_id
        __props__.__dict__["owner_id"] = owner_id
        __props__.__dict__["tags"] = tags
        __props__.__dict__["tags_all"] = tags_all
        return DefaultVpc(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def arn(self) -> pulumi.Output[str]:
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter(name="assignGeneratedIpv6CidrBlock")
    def assign_generated_ipv6_cidr_block(self) -> pulumi.Output[Optional[bool]]:
        return pulumi.get(self, "assign_generated_ipv6_cidr_block")

    @property
    @pulumi.getter(name="cidrBlock")
    def cidr_block(self) -> pulumi.Output[str]:
        """
        The primary IPv4 CIDR block for the VPC
        """
        return pulumi.get(self, "cidr_block")

    @property
    @pulumi.getter(name="defaultNetworkAclId")
    def default_network_acl_id(self) -> pulumi.Output[str]:
        return pulumi.get(self, "default_network_acl_id")

    @property
    @pulumi.getter(name="defaultRouteTableId")
    def default_route_table_id(self) -> pulumi.Output[str]:
        return pulumi.get(self, "default_route_table_id")

    @property
    @pulumi.getter(name="defaultSecurityGroupId")
    def default_security_group_id(self) -> pulumi.Output[str]:
        return pulumi.get(self, "default_security_group_id")

    @property
    @pulumi.getter(name="dhcpOptionsId")
    def dhcp_options_id(self) -> pulumi.Output[str]:
        return pulumi.get(self, "dhcp_options_id")

    @property
    @pulumi.getter(name="enableDnsHostnames")
    def enable_dns_hostnames(self) -> pulumi.Output[Optional[bool]]:
        return pulumi.get(self, "enable_dns_hostnames")

    @property
    @pulumi.getter(name="enableDnsSupport")
    def enable_dns_support(self) -> pulumi.Output[Optional[bool]]:
        return pulumi.get(self, "enable_dns_support")

    @property
    @pulumi.getter(name="enableNetworkAddressUsageMetrics")
    def enable_network_address_usage_metrics(self) -> pulumi.Output[bool]:
        return pulumi.get(self, "enable_network_address_usage_metrics")

    @property
    @pulumi.getter(name="existingDefaultVpc")
    def existing_default_vpc(self) -> pulumi.Output[bool]:
        return pulumi.get(self, "existing_default_vpc")

    @property
    @pulumi.getter(name="forceDestroy")
    def force_destroy(self) -> pulumi.Output[Optional[bool]]:
        """
        Whether destroying the resource deletes the default VPC. Default: `false`
        """
        return pulumi.get(self, "force_destroy")

    @property
    @pulumi.getter(name="instanceTenancy")
    def instance_tenancy(self) -> pulumi.Output[str]:
        """
        The allowed tenancy of instances launched into the VPC
        """
        return pulumi.get(self, "instance_tenancy")

    @property
    @pulumi.getter(name="ipv6AssociationId")
    def ipv6_association_id(self) -> pulumi.Output[str]:
        return pulumi.get(self, "ipv6_association_id")

    @property
    @pulumi.getter(name="ipv6CidrBlock")
    def ipv6_cidr_block(self) -> pulumi.Output[str]:
        return pulumi.get(self, "ipv6_cidr_block")

    @property
    @pulumi.getter(name="ipv6CidrBlockNetworkBorderGroup")
    def ipv6_cidr_block_network_border_group(self) -> pulumi.Output[str]:
        return pulumi.get(self, "ipv6_cidr_block_network_border_group")

    @property
    @pulumi.getter(name="ipv6IpamPoolId")
    def ipv6_ipam_pool_id(self) -> pulumi.Output[Optional[str]]:
        return pulumi.get(self, "ipv6_ipam_pool_id")

    @property
    @pulumi.getter(name="ipv6NetmaskLength")
    def ipv6_netmask_length(self) -> pulumi.Output[Optional[int]]:
        return pulumi.get(self, "ipv6_netmask_length")

    @property
    @pulumi.getter(name="mainRouteTableId")
    def main_route_table_id(self) -> pulumi.Output[str]:
        return pulumi.get(self, "main_route_table_id")

    @property
    @pulumi.getter(name="ownerId")
    def owner_id(self) -> pulumi.Output[str]:
        return pulumi.get(self, "owner_id")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, str]]]:
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter(name="tagsAll")
    def tags_all(self) -> pulumi.Output[Mapping[str, str]]:
        warnings.warn("""Please use `tags` instead.""", DeprecationWarning)
        pulumi.log.warn("""tags_all is deprecated: Please use `tags` instead.""")

        return pulumi.get(self, "tags_all")


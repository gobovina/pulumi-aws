# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['MulticastDomainArgs', 'MulticastDomain']

@pulumi.input_type
class MulticastDomainArgs:
    def __init__(__self__, *,
                 transit_gateway_id: pulumi.Input[str],
                 auto_accept_shared_associations: Optional[pulumi.Input[str]] = None,
                 igmpv2_support: Optional[pulumi.Input[str]] = None,
                 static_sources_support: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        The set of arguments for constructing a MulticastDomain resource.
        :param pulumi.Input[str] transit_gateway_id: EC2 Transit Gateway identifier. The EC2 Transit Gateway must have `multicast_support` enabled.
        :param pulumi.Input[str] auto_accept_shared_associations: Whether to automatically accept cross-account subnet associations that are associated with the EC2 Transit Gateway Multicast Domain. Valid values: `disable`, `enable`. Default value: `disable`.
        :param pulumi.Input[str] igmpv2_support: Whether to enable Internet Group Management Protocol (IGMP) version 2 for the EC2 Transit Gateway Multicast Domain. Valid values: `disable`, `enable`. Default value: `disable`.
        :param pulumi.Input[str] static_sources_support: Whether to enable support for statically configuring multicast group sources for the EC2 Transit Gateway Multicast Domain. Valid values: `disable`, `enable`. Default value: `disable`.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value tags for the EC2 Transit Gateway Multicast Domain. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        pulumi.set(__self__, "transit_gateway_id", transit_gateway_id)
        if auto_accept_shared_associations is not None:
            pulumi.set(__self__, "auto_accept_shared_associations", auto_accept_shared_associations)
        if igmpv2_support is not None:
            pulumi.set(__self__, "igmpv2_support", igmpv2_support)
        if static_sources_support is not None:
            pulumi.set(__self__, "static_sources_support", static_sources_support)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter(name="transitGatewayId")
    def transit_gateway_id(self) -> pulumi.Input[str]:
        """
        EC2 Transit Gateway identifier. The EC2 Transit Gateway must have `multicast_support` enabled.
        """
        return pulumi.get(self, "transit_gateway_id")

    @transit_gateway_id.setter
    def transit_gateway_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "transit_gateway_id", value)

    @property
    @pulumi.getter(name="autoAcceptSharedAssociations")
    def auto_accept_shared_associations(self) -> Optional[pulumi.Input[str]]:
        """
        Whether to automatically accept cross-account subnet associations that are associated with the EC2 Transit Gateway Multicast Domain. Valid values: `disable`, `enable`. Default value: `disable`.
        """
        return pulumi.get(self, "auto_accept_shared_associations")

    @auto_accept_shared_associations.setter
    def auto_accept_shared_associations(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "auto_accept_shared_associations", value)

    @property
    @pulumi.getter(name="igmpv2Support")
    def igmpv2_support(self) -> Optional[pulumi.Input[str]]:
        """
        Whether to enable Internet Group Management Protocol (IGMP) version 2 for the EC2 Transit Gateway Multicast Domain. Valid values: `disable`, `enable`. Default value: `disable`.
        """
        return pulumi.get(self, "igmpv2_support")

    @igmpv2_support.setter
    def igmpv2_support(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "igmpv2_support", value)

    @property
    @pulumi.getter(name="staticSourcesSupport")
    def static_sources_support(self) -> Optional[pulumi.Input[str]]:
        """
        Whether to enable support for statically configuring multicast group sources for the EC2 Transit Gateway Multicast Domain. Valid values: `disable`, `enable`. Default value: `disable`.
        """
        return pulumi.get(self, "static_sources_support")

    @static_sources_support.setter
    def static_sources_support(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "static_sources_support", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Key-value tags for the EC2 Transit Gateway Multicast Domain. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)


@pulumi.input_type
class _MulticastDomainState:
    def __init__(__self__, *,
                 arn: Optional[pulumi.Input[str]] = None,
                 auto_accept_shared_associations: Optional[pulumi.Input[str]] = None,
                 igmpv2_support: Optional[pulumi.Input[str]] = None,
                 owner_id: Optional[pulumi.Input[str]] = None,
                 static_sources_support: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 transit_gateway_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering MulticastDomain resources.
        :param pulumi.Input[str] arn: EC2 Transit Gateway Multicast Domain Amazon Resource Name (ARN).
        :param pulumi.Input[str] auto_accept_shared_associations: Whether to automatically accept cross-account subnet associations that are associated with the EC2 Transit Gateway Multicast Domain. Valid values: `disable`, `enable`. Default value: `disable`.
        :param pulumi.Input[str] igmpv2_support: Whether to enable Internet Group Management Protocol (IGMP) version 2 for the EC2 Transit Gateway Multicast Domain. Valid values: `disable`, `enable`. Default value: `disable`.
        :param pulumi.Input[str] owner_id: Identifier of the AWS account that owns the EC2 Transit Gateway Multicast Domain.
        :param pulumi.Input[str] static_sources_support: Whether to enable support for statically configuring multicast group sources for the EC2 Transit Gateway Multicast Domain. Valid values: `disable`, `enable`. Default value: `disable`.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value tags for the EC2 Transit Gateway Multicast Domain. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        :param pulumi.Input[str] transit_gateway_id: EC2 Transit Gateway identifier. The EC2 Transit Gateway must have `multicast_support` enabled.
        """
        if arn is not None:
            pulumi.set(__self__, "arn", arn)
        if auto_accept_shared_associations is not None:
            pulumi.set(__self__, "auto_accept_shared_associations", auto_accept_shared_associations)
        if igmpv2_support is not None:
            pulumi.set(__self__, "igmpv2_support", igmpv2_support)
        if owner_id is not None:
            pulumi.set(__self__, "owner_id", owner_id)
        if static_sources_support is not None:
            pulumi.set(__self__, "static_sources_support", static_sources_support)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if tags_all is not None:
            warnings.warn("""Please use `tags` instead.""", DeprecationWarning)
            pulumi.log.warn("""tags_all is deprecated: Please use `tags` instead.""")
        if tags_all is not None:
            pulumi.set(__self__, "tags_all", tags_all)
        if transit_gateway_id is not None:
            pulumi.set(__self__, "transit_gateway_id", transit_gateway_id)

    @property
    @pulumi.getter
    def arn(self) -> Optional[pulumi.Input[str]]:
        """
        EC2 Transit Gateway Multicast Domain Amazon Resource Name (ARN).
        """
        return pulumi.get(self, "arn")

    @arn.setter
    def arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "arn", value)

    @property
    @pulumi.getter(name="autoAcceptSharedAssociations")
    def auto_accept_shared_associations(self) -> Optional[pulumi.Input[str]]:
        """
        Whether to automatically accept cross-account subnet associations that are associated with the EC2 Transit Gateway Multicast Domain. Valid values: `disable`, `enable`. Default value: `disable`.
        """
        return pulumi.get(self, "auto_accept_shared_associations")

    @auto_accept_shared_associations.setter
    def auto_accept_shared_associations(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "auto_accept_shared_associations", value)

    @property
    @pulumi.getter(name="igmpv2Support")
    def igmpv2_support(self) -> Optional[pulumi.Input[str]]:
        """
        Whether to enable Internet Group Management Protocol (IGMP) version 2 for the EC2 Transit Gateway Multicast Domain. Valid values: `disable`, `enable`. Default value: `disable`.
        """
        return pulumi.get(self, "igmpv2_support")

    @igmpv2_support.setter
    def igmpv2_support(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "igmpv2_support", value)

    @property
    @pulumi.getter(name="ownerId")
    def owner_id(self) -> Optional[pulumi.Input[str]]:
        """
        Identifier of the AWS account that owns the EC2 Transit Gateway Multicast Domain.
        """
        return pulumi.get(self, "owner_id")

    @owner_id.setter
    def owner_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "owner_id", value)

    @property
    @pulumi.getter(name="staticSourcesSupport")
    def static_sources_support(self) -> Optional[pulumi.Input[str]]:
        """
        Whether to enable support for statically configuring multicast group sources for the EC2 Transit Gateway Multicast Domain. Valid values: `disable`, `enable`. Default value: `disable`.
        """
        return pulumi.get(self, "static_sources_support")

    @static_sources_support.setter
    def static_sources_support(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "static_sources_support", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Key-value tags for the EC2 Transit Gateway Multicast Domain. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
    @pulumi.getter(name="transitGatewayId")
    def transit_gateway_id(self) -> Optional[pulumi.Input[str]]:
        """
        EC2 Transit Gateway identifier. The EC2 Transit Gateway must have `multicast_support` enabled.
        """
        return pulumi.get(self, "transit_gateway_id")

    @transit_gateway_id.setter
    def transit_gateway_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "transit_gateway_id", value)


class MulticastDomain(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 auto_accept_shared_associations: Optional[pulumi.Input[str]] = None,
                 igmpv2_support: Optional[pulumi.Input[str]] = None,
                 static_sources_support: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 transit_gateway_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Manages an EC2 Transit Gateway Multicast Domain.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        available = aws.get_availability_zones(state="available")
        amazon_linux = aws.ec2.get_ami(most_recent=True,
            owners=["amazon"],
            filters=[
                aws.ec2.GetAmiFilterArgs(
                    name="name",
                    values=["amzn-ami-hvm-*-x86_64-gp2"],
                ),
                aws.ec2.GetAmiFilterArgs(
                    name="owner-alias",
                    values=["amazon"],
                ),
            ])
        vpc1 = aws.ec2.Vpc("vpc1", cidr_block="10.0.0.0/16")
        vpc2 = aws.ec2.Vpc("vpc2", cidr_block="10.1.0.0/16")
        subnet1 = aws.ec2.Subnet("subnet1",
            vpc_id=vpc1.id,
            cidr_block="10.0.1.0/24",
            availability_zone=available.names[0])
        subnet2 = aws.ec2.Subnet("subnet2",
            vpc_id=vpc1.id,
            cidr_block="10.0.2.0/24",
            availability_zone=available.names[1])
        subnet3 = aws.ec2.Subnet("subnet3",
            vpc_id=vpc2.id,
            cidr_block="10.1.1.0/24",
            availability_zone=available.names[0])
        instance1 = aws.ec2.Instance("instance1",
            ami=amazon_linux.id,
            instance_type=aws.ec2.InstanceType.T2_MICRO,
            subnet_id=subnet1.id)
        instance2 = aws.ec2.Instance("instance2",
            ami=amazon_linux.id,
            instance_type=aws.ec2.InstanceType.T2_MICRO,
            subnet_id=subnet2.id)
        instance3 = aws.ec2.Instance("instance3",
            ami=amazon_linux.id,
            instance_type=aws.ec2.InstanceType.T2_MICRO,
            subnet_id=subnet3.id)
        tgw = aws.ec2transitgateway.TransitGateway("tgw", multicast_support="enable")
        attachment1 = aws.ec2transitgateway.VpcAttachment("attachment1",
            subnet_ids=[
                subnet1.id,
                subnet2.id,
            ],
            transit_gateway_id=tgw.id,
            vpc_id=vpc1.id)
        attachment2 = aws.ec2transitgateway.VpcAttachment("attachment2",
            subnet_ids=[subnet3.id],
            transit_gateway_id=tgw.id,
            vpc_id=vpc2.id)
        domain = aws.ec2transitgateway.MulticastDomain("domain",
            transit_gateway_id=tgw.id,
            static_sources_support="enable",
            tags={
                "Name": "Transit_Gateway_Multicast_Domain_Example",
            })
        association3 = aws.ec2transitgateway.MulticastDomainAssociation("association3",
            subnet_id=subnet3.id,
            transit_gateway_attachment_id=attachment2.id,
            transit_gateway_multicast_domain_id=domain.id)
        source = aws.ec2transitgateway.MulticastGroupSource("source",
            group_ip_address="224.0.0.1",
            network_interface_id=instance3.primary_network_interface_id,
            transit_gateway_multicast_domain_id=association3.transit_gateway_multicast_domain_id)
        association1 = aws.ec2transitgateway.MulticastDomainAssociation("association1",
            subnet_id=subnet1.id,
            transit_gateway_attachment_id=attachment1.id,
            transit_gateway_multicast_domain_id=domain.id)
        association2 = aws.ec2transitgateway.MulticastDomainAssociation("association2",
            subnet_id=subnet2.id,
            transit_gateway_attachment_id=attachment2.id,
            transit_gateway_multicast_domain_id=domain.id)
        member1 = aws.ec2transitgateway.MulticastGroupMember("member1",
            group_ip_address="224.0.0.1",
            network_interface_id=instance1.primary_network_interface_id,
            transit_gateway_multicast_domain_id=association1.transit_gateway_multicast_domain_id)
        member2 = aws.ec2transitgateway.MulticastGroupMember("member2",
            group_ip_address="224.0.0.1",
            network_interface_id=instance2.primary_network_interface_id,
            transit_gateway_multicast_domain_id=association1.transit_gateway_multicast_domain_id)
        ```

        ## Import

        Using `pulumi import`, import `aws_ec2_transit_gateway_multicast_domain` using the EC2 Transit Gateway Multicast Domain identifier. For example:

        ```sh
        $ pulumi import aws:ec2transitgateway/multicastDomain:MulticastDomain example tgw-mcast-domain-12345
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] auto_accept_shared_associations: Whether to automatically accept cross-account subnet associations that are associated with the EC2 Transit Gateway Multicast Domain. Valid values: `disable`, `enable`. Default value: `disable`.
        :param pulumi.Input[str] igmpv2_support: Whether to enable Internet Group Management Protocol (IGMP) version 2 for the EC2 Transit Gateway Multicast Domain. Valid values: `disable`, `enable`. Default value: `disable`.
        :param pulumi.Input[str] static_sources_support: Whether to enable support for statically configuring multicast group sources for the EC2 Transit Gateway Multicast Domain. Valid values: `disable`, `enable`. Default value: `disable`.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value tags for the EC2 Transit Gateway Multicast Domain. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[str] transit_gateway_id: EC2 Transit Gateway identifier. The EC2 Transit Gateway must have `multicast_support` enabled.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: MulticastDomainArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages an EC2 Transit Gateway Multicast Domain.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        available = aws.get_availability_zones(state="available")
        amazon_linux = aws.ec2.get_ami(most_recent=True,
            owners=["amazon"],
            filters=[
                aws.ec2.GetAmiFilterArgs(
                    name="name",
                    values=["amzn-ami-hvm-*-x86_64-gp2"],
                ),
                aws.ec2.GetAmiFilterArgs(
                    name="owner-alias",
                    values=["amazon"],
                ),
            ])
        vpc1 = aws.ec2.Vpc("vpc1", cidr_block="10.0.0.0/16")
        vpc2 = aws.ec2.Vpc("vpc2", cidr_block="10.1.0.0/16")
        subnet1 = aws.ec2.Subnet("subnet1",
            vpc_id=vpc1.id,
            cidr_block="10.0.1.0/24",
            availability_zone=available.names[0])
        subnet2 = aws.ec2.Subnet("subnet2",
            vpc_id=vpc1.id,
            cidr_block="10.0.2.0/24",
            availability_zone=available.names[1])
        subnet3 = aws.ec2.Subnet("subnet3",
            vpc_id=vpc2.id,
            cidr_block="10.1.1.0/24",
            availability_zone=available.names[0])
        instance1 = aws.ec2.Instance("instance1",
            ami=amazon_linux.id,
            instance_type=aws.ec2.InstanceType.T2_MICRO,
            subnet_id=subnet1.id)
        instance2 = aws.ec2.Instance("instance2",
            ami=amazon_linux.id,
            instance_type=aws.ec2.InstanceType.T2_MICRO,
            subnet_id=subnet2.id)
        instance3 = aws.ec2.Instance("instance3",
            ami=amazon_linux.id,
            instance_type=aws.ec2.InstanceType.T2_MICRO,
            subnet_id=subnet3.id)
        tgw = aws.ec2transitgateway.TransitGateway("tgw", multicast_support="enable")
        attachment1 = aws.ec2transitgateway.VpcAttachment("attachment1",
            subnet_ids=[
                subnet1.id,
                subnet2.id,
            ],
            transit_gateway_id=tgw.id,
            vpc_id=vpc1.id)
        attachment2 = aws.ec2transitgateway.VpcAttachment("attachment2",
            subnet_ids=[subnet3.id],
            transit_gateway_id=tgw.id,
            vpc_id=vpc2.id)
        domain = aws.ec2transitgateway.MulticastDomain("domain",
            transit_gateway_id=tgw.id,
            static_sources_support="enable",
            tags={
                "Name": "Transit_Gateway_Multicast_Domain_Example",
            })
        association3 = aws.ec2transitgateway.MulticastDomainAssociation("association3",
            subnet_id=subnet3.id,
            transit_gateway_attachment_id=attachment2.id,
            transit_gateway_multicast_domain_id=domain.id)
        source = aws.ec2transitgateway.MulticastGroupSource("source",
            group_ip_address="224.0.0.1",
            network_interface_id=instance3.primary_network_interface_id,
            transit_gateway_multicast_domain_id=association3.transit_gateway_multicast_domain_id)
        association1 = aws.ec2transitgateway.MulticastDomainAssociation("association1",
            subnet_id=subnet1.id,
            transit_gateway_attachment_id=attachment1.id,
            transit_gateway_multicast_domain_id=domain.id)
        association2 = aws.ec2transitgateway.MulticastDomainAssociation("association2",
            subnet_id=subnet2.id,
            transit_gateway_attachment_id=attachment2.id,
            transit_gateway_multicast_domain_id=domain.id)
        member1 = aws.ec2transitgateway.MulticastGroupMember("member1",
            group_ip_address="224.0.0.1",
            network_interface_id=instance1.primary_network_interface_id,
            transit_gateway_multicast_domain_id=association1.transit_gateway_multicast_domain_id)
        member2 = aws.ec2transitgateway.MulticastGroupMember("member2",
            group_ip_address="224.0.0.1",
            network_interface_id=instance2.primary_network_interface_id,
            transit_gateway_multicast_domain_id=association1.transit_gateway_multicast_domain_id)
        ```

        ## Import

        Using `pulumi import`, import `aws_ec2_transit_gateway_multicast_domain` using the EC2 Transit Gateway Multicast Domain identifier. For example:

        ```sh
        $ pulumi import aws:ec2transitgateway/multicastDomain:MulticastDomain example tgw-mcast-domain-12345
        ```

        :param str resource_name: The name of the resource.
        :param MulticastDomainArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(MulticastDomainArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 auto_accept_shared_associations: Optional[pulumi.Input[str]] = None,
                 igmpv2_support: Optional[pulumi.Input[str]] = None,
                 static_sources_support: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 transit_gateway_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = MulticastDomainArgs.__new__(MulticastDomainArgs)

            __props__.__dict__["auto_accept_shared_associations"] = auto_accept_shared_associations
            __props__.__dict__["igmpv2_support"] = igmpv2_support
            __props__.__dict__["static_sources_support"] = static_sources_support
            __props__.__dict__["tags"] = tags
            if transit_gateway_id is None and not opts.urn:
                raise TypeError("Missing required property 'transit_gateway_id'")
            __props__.__dict__["transit_gateway_id"] = transit_gateway_id
            __props__.__dict__["arn"] = None
            __props__.__dict__["owner_id"] = None
            __props__.__dict__["tags_all"] = None
        super(MulticastDomain, __self__).__init__(
            'aws:ec2transitgateway/multicastDomain:MulticastDomain',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            arn: Optional[pulumi.Input[str]] = None,
            auto_accept_shared_associations: Optional[pulumi.Input[str]] = None,
            igmpv2_support: Optional[pulumi.Input[str]] = None,
            owner_id: Optional[pulumi.Input[str]] = None,
            static_sources_support: Optional[pulumi.Input[str]] = None,
            tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            transit_gateway_id: Optional[pulumi.Input[str]] = None) -> 'MulticastDomain':
        """
        Get an existing MulticastDomain resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] arn: EC2 Transit Gateway Multicast Domain Amazon Resource Name (ARN).
        :param pulumi.Input[str] auto_accept_shared_associations: Whether to automatically accept cross-account subnet associations that are associated with the EC2 Transit Gateway Multicast Domain. Valid values: `disable`, `enable`. Default value: `disable`.
        :param pulumi.Input[str] igmpv2_support: Whether to enable Internet Group Management Protocol (IGMP) version 2 for the EC2 Transit Gateway Multicast Domain. Valid values: `disable`, `enable`. Default value: `disable`.
        :param pulumi.Input[str] owner_id: Identifier of the AWS account that owns the EC2 Transit Gateway Multicast Domain.
        :param pulumi.Input[str] static_sources_support: Whether to enable support for statically configuring multicast group sources for the EC2 Transit Gateway Multicast Domain. Valid values: `disable`, `enable`. Default value: `disable`.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value tags for the EC2 Transit Gateway Multicast Domain. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        :param pulumi.Input[str] transit_gateway_id: EC2 Transit Gateway identifier. The EC2 Transit Gateway must have `multicast_support` enabled.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _MulticastDomainState.__new__(_MulticastDomainState)

        __props__.__dict__["arn"] = arn
        __props__.__dict__["auto_accept_shared_associations"] = auto_accept_shared_associations
        __props__.__dict__["igmpv2_support"] = igmpv2_support
        __props__.__dict__["owner_id"] = owner_id
        __props__.__dict__["static_sources_support"] = static_sources_support
        __props__.__dict__["tags"] = tags
        __props__.__dict__["tags_all"] = tags_all
        __props__.__dict__["transit_gateway_id"] = transit_gateway_id
        return MulticastDomain(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def arn(self) -> pulumi.Output[str]:
        """
        EC2 Transit Gateway Multicast Domain Amazon Resource Name (ARN).
        """
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter(name="autoAcceptSharedAssociations")
    def auto_accept_shared_associations(self) -> pulumi.Output[Optional[str]]:
        """
        Whether to automatically accept cross-account subnet associations that are associated with the EC2 Transit Gateway Multicast Domain. Valid values: `disable`, `enable`. Default value: `disable`.
        """
        return pulumi.get(self, "auto_accept_shared_associations")

    @property
    @pulumi.getter(name="igmpv2Support")
    def igmpv2_support(self) -> pulumi.Output[Optional[str]]:
        """
        Whether to enable Internet Group Management Protocol (IGMP) version 2 for the EC2 Transit Gateway Multicast Domain. Valid values: `disable`, `enable`. Default value: `disable`.
        """
        return pulumi.get(self, "igmpv2_support")

    @property
    @pulumi.getter(name="ownerId")
    def owner_id(self) -> pulumi.Output[str]:
        """
        Identifier of the AWS account that owns the EC2 Transit Gateway Multicast Domain.
        """
        return pulumi.get(self, "owner_id")

    @property
    @pulumi.getter(name="staticSourcesSupport")
    def static_sources_support(self) -> pulumi.Output[Optional[str]]:
        """
        Whether to enable support for statically configuring multicast group sources for the EC2 Transit Gateway Multicast Domain. Valid values: `disable`, `enable`. Default value: `disable`.
        """
        return pulumi.get(self, "static_sources_support")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, str]]]:
        """
        Key-value tags for the EC2 Transit Gateway Multicast Domain. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
    @pulumi.getter(name="transitGatewayId")
    def transit_gateway_id(self) -> pulumi.Output[str]:
        """
        EC2 Transit Gateway identifier. The EC2 Transit Gateway must have `multicast_support` enabled.
        """
        return pulumi.get(self, "transit_gateway_id")


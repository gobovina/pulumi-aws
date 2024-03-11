# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['MulticastDomainAssociationArgs', 'MulticastDomainAssociation']

@pulumi.input_type
class MulticastDomainAssociationArgs:
    def __init__(__self__, *,
                 subnet_id: pulumi.Input[str],
                 transit_gateway_attachment_id: pulumi.Input[str],
                 transit_gateway_multicast_domain_id: pulumi.Input[str]):
        """
        The set of arguments for constructing a MulticastDomainAssociation resource.
        :param pulumi.Input[str] subnet_id: The ID of the subnet to associate with the transit gateway multicast domain.
        :param pulumi.Input[str] transit_gateway_attachment_id: The ID of the transit gateway attachment.
        :param pulumi.Input[str] transit_gateway_multicast_domain_id: The ID of the transit gateway multicast domain.
        """
        pulumi.set(__self__, "subnet_id", subnet_id)
        pulumi.set(__self__, "transit_gateway_attachment_id", transit_gateway_attachment_id)
        pulumi.set(__self__, "transit_gateway_multicast_domain_id", transit_gateway_multicast_domain_id)

    @property
    @pulumi.getter(name="subnetId")
    def subnet_id(self) -> pulumi.Input[str]:
        """
        The ID of the subnet to associate with the transit gateway multicast domain.
        """
        return pulumi.get(self, "subnet_id")

    @subnet_id.setter
    def subnet_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "subnet_id", value)

    @property
    @pulumi.getter(name="transitGatewayAttachmentId")
    def transit_gateway_attachment_id(self) -> pulumi.Input[str]:
        """
        The ID of the transit gateway attachment.
        """
        return pulumi.get(self, "transit_gateway_attachment_id")

    @transit_gateway_attachment_id.setter
    def transit_gateway_attachment_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "transit_gateway_attachment_id", value)

    @property
    @pulumi.getter(name="transitGatewayMulticastDomainId")
    def transit_gateway_multicast_domain_id(self) -> pulumi.Input[str]:
        """
        The ID of the transit gateway multicast domain.
        """
        return pulumi.get(self, "transit_gateway_multicast_domain_id")

    @transit_gateway_multicast_domain_id.setter
    def transit_gateway_multicast_domain_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "transit_gateway_multicast_domain_id", value)


@pulumi.input_type
class _MulticastDomainAssociationState:
    def __init__(__self__, *,
                 subnet_id: Optional[pulumi.Input[str]] = None,
                 transit_gateway_attachment_id: Optional[pulumi.Input[str]] = None,
                 transit_gateway_multicast_domain_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering MulticastDomainAssociation resources.
        :param pulumi.Input[str] subnet_id: The ID of the subnet to associate with the transit gateway multicast domain.
        :param pulumi.Input[str] transit_gateway_attachment_id: The ID of the transit gateway attachment.
        :param pulumi.Input[str] transit_gateway_multicast_domain_id: The ID of the transit gateway multicast domain.
        """
        if subnet_id is not None:
            pulumi.set(__self__, "subnet_id", subnet_id)
        if transit_gateway_attachment_id is not None:
            pulumi.set(__self__, "transit_gateway_attachment_id", transit_gateway_attachment_id)
        if transit_gateway_multicast_domain_id is not None:
            pulumi.set(__self__, "transit_gateway_multicast_domain_id", transit_gateway_multicast_domain_id)

    @property
    @pulumi.getter(name="subnetId")
    def subnet_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the subnet to associate with the transit gateway multicast domain.
        """
        return pulumi.get(self, "subnet_id")

    @subnet_id.setter
    def subnet_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "subnet_id", value)

    @property
    @pulumi.getter(name="transitGatewayAttachmentId")
    def transit_gateway_attachment_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the transit gateway attachment.
        """
        return pulumi.get(self, "transit_gateway_attachment_id")

    @transit_gateway_attachment_id.setter
    def transit_gateway_attachment_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "transit_gateway_attachment_id", value)

    @property
    @pulumi.getter(name="transitGatewayMulticastDomainId")
    def transit_gateway_multicast_domain_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the transit gateway multicast domain.
        """
        return pulumi.get(self, "transit_gateway_multicast_domain_id")

    @transit_gateway_multicast_domain_id.setter
    def transit_gateway_multicast_domain_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "transit_gateway_multicast_domain_id", value)


class MulticastDomainAssociation(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 subnet_id: Optional[pulumi.Input[str]] = None,
                 transit_gateway_attachment_id: Optional[pulumi.Input[str]] = None,
                 transit_gateway_multicast_domain_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Associates the specified subnet and transit gateway attachment with the specified transit gateway multicast domain.

        ## Example Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.ec2transitgateway.TransitGateway("example", multicast_support="enable")
        example_vpc_attachment = aws.ec2transitgateway.VpcAttachment("example",
            subnet_ids=[example_aws_subnet["id"]],
            transit_gateway_id=example.id,
            vpc_id=example_aws_vpc["id"])
        example_multicast_domain = aws.ec2transitgateway.MulticastDomain("example", transit_gateway_id=example.id)
        example_multicast_domain_association = aws.ec2transitgateway.MulticastDomainAssociation("example",
            subnet_id=example_aws_subnet["id"],
            transit_gateway_attachment_id=example_vpc_attachment.id,
            transit_gateway_multicast_domain_id=example_multicast_domain.id)
        ```
        <!--End PulumiCodeChooser -->

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] subnet_id: The ID of the subnet to associate with the transit gateway multicast domain.
        :param pulumi.Input[str] transit_gateway_attachment_id: The ID of the transit gateway attachment.
        :param pulumi.Input[str] transit_gateway_multicast_domain_id: The ID of the transit gateway multicast domain.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: MulticastDomainAssociationArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Associates the specified subnet and transit gateway attachment with the specified transit gateway multicast domain.

        ## Example Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.ec2transitgateway.TransitGateway("example", multicast_support="enable")
        example_vpc_attachment = aws.ec2transitgateway.VpcAttachment("example",
            subnet_ids=[example_aws_subnet["id"]],
            transit_gateway_id=example.id,
            vpc_id=example_aws_vpc["id"])
        example_multicast_domain = aws.ec2transitgateway.MulticastDomain("example", transit_gateway_id=example.id)
        example_multicast_domain_association = aws.ec2transitgateway.MulticastDomainAssociation("example",
            subnet_id=example_aws_subnet["id"],
            transit_gateway_attachment_id=example_vpc_attachment.id,
            transit_gateway_multicast_domain_id=example_multicast_domain.id)
        ```
        <!--End PulumiCodeChooser -->

        :param str resource_name: The name of the resource.
        :param MulticastDomainAssociationArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(MulticastDomainAssociationArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 subnet_id: Optional[pulumi.Input[str]] = None,
                 transit_gateway_attachment_id: Optional[pulumi.Input[str]] = None,
                 transit_gateway_multicast_domain_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = MulticastDomainAssociationArgs.__new__(MulticastDomainAssociationArgs)

            if subnet_id is None and not opts.urn:
                raise TypeError("Missing required property 'subnet_id'")
            __props__.__dict__["subnet_id"] = subnet_id
            if transit_gateway_attachment_id is None and not opts.urn:
                raise TypeError("Missing required property 'transit_gateway_attachment_id'")
            __props__.__dict__["transit_gateway_attachment_id"] = transit_gateway_attachment_id
            if transit_gateway_multicast_domain_id is None and not opts.urn:
                raise TypeError("Missing required property 'transit_gateway_multicast_domain_id'")
            __props__.__dict__["transit_gateway_multicast_domain_id"] = transit_gateway_multicast_domain_id
        super(MulticastDomainAssociation, __self__).__init__(
            'aws:ec2transitgateway/multicastDomainAssociation:MulticastDomainAssociation',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            subnet_id: Optional[pulumi.Input[str]] = None,
            transit_gateway_attachment_id: Optional[pulumi.Input[str]] = None,
            transit_gateway_multicast_domain_id: Optional[pulumi.Input[str]] = None) -> 'MulticastDomainAssociation':
        """
        Get an existing MulticastDomainAssociation resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] subnet_id: The ID of the subnet to associate with the transit gateway multicast domain.
        :param pulumi.Input[str] transit_gateway_attachment_id: The ID of the transit gateway attachment.
        :param pulumi.Input[str] transit_gateway_multicast_domain_id: The ID of the transit gateway multicast domain.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _MulticastDomainAssociationState.__new__(_MulticastDomainAssociationState)

        __props__.__dict__["subnet_id"] = subnet_id
        __props__.__dict__["transit_gateway_attachment_id"] = transit_gateway_attachment_id
        __props__.__dict__["transit_gateway_multicast_domain_id"] = transit_gateway_multicast_domain_id
        return MulticastDomainAssociation(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="subnetId")
    def subnet_id(self) -> pulumi.Output[str]:
        """
        The ID of the subnet to associate with the transit gateway multicast domain.
        """
        return pulumi.get(self, "subnet_id")

    @property
    @pulumi.getter(name="transitGatewayAttachmentId")
    def transit_gateway_attachment_id(self) -> pulumi.Output[str]:
        """
        The ID of the transit gateway attachment.
        """
        return pulumi.get(self, "transit_gateway_attachment_id")

    @property
    @pulumi.getter(name="transitGatewayMulticastDomainId")
    def transit_gateway_multicast_domain_id(self) -> pulumi.Output[str]:
        """
        The ID of the transit gateway multicast domain.
        """
        return pulumi.get(self, "transit_gateway_multicast_domain_id")


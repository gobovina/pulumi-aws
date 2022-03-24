# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['MulticastGroupMemberArgs', 'MulticastGroupMember']

@pulumi.input_type
class MulticastGroupMemberArgs:
    def __init__(__self__, *,
                 group_ip_address: pulumi.Input[str],
                 network_interface_id: pulumi.Input[str],
                 transit_gateway_multicast_domain_id: pulumi.Input[str]):
        """
        The set of arguments for constructing a MulticastGroupMember resource.
        :param pulumi.Input[str] group_ip_address: The IP address assigned to the transit gateway multicast group.
        :param pulumi.Input[str] network_interface_id: The group members' network interface ID to register with the transit gateway multicast group.
        :param pulumi.Input[str] transit_gateway_multicast_domain_id: The ID of the transit gateway multicast domain.
        """
        pulumi.set(__self__, "group_ip_address", group_ip_address)
        pulumi.set(__self__, "network_interface_id", network_interface_id)
        pulumi.set(__self__, "transit_gateway_multicast_domain_id", transit_gateway_multicast_domain_id)

    @property
    @pulumi.getter(name="groupIpAddress")
    def group_ip_address(self) -> pulumi.Input[str]:
        """
        The IP address assigned to the transit gateway multicast group.
        """
        return pulumi.get(self, "group_ip_address")

    @group_ip_address.setter
    def group_ip_address(self, value: pulumi.Input[str]):
        pulumi.set(self, "group_ip_address", value)

    @property
    @pulumi.getter(name="networkInterfaceId")
    def network_interface_id(self) -> pulumi.Input[str]:
        """
        The group members' network interface ID to register with the transit gateway multicast group.
        """
        return pulumi.get(self, "network_interface_id")

    @network_interface_id.setter
    def network_interface_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "network_interface_id", value)

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
class _MulticastGroupMemberState:
    def __init__(__self__, *,
                 group_ip_address: Optional[pulumi.Input[str]] = None,
                 network_interface_id: Optional[pulumi.Input[str]] = None,
                 transit_gateway_multicast_domain_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering MulticastGroupMember resources.
        :param pulumi.Input[str] group_ip_address: The IP address assigned to the transit gateway multicast group.
        :param pulumi.Input[str] network_interface_id: The group members' network interface ID to register with the transit gateway multicast group.
        :param pulumi.Input[str] transit_gateway_multicast_domain_id: The ID of the transit gateway multicast domain.
        """
        if group_ip_address is not None:
            pulumi.set(__self__, "group_ip_address", group_ip_address)
        if network_interface_id is not None:
            pulumi.set(__self__, "network_interface_id", network_interface_id)
        if transit_gateway_multicast_domain_id is not None:
            pulumi.set(__self__, "transit_gateway_multicast_domain_id", transit_gateway_multicast_domain_id)

    @property
    @pulumi.getter(name="groupIpAddress")
    def group_ip_address(self) -> Optional[pulumi.Input[str]]:
        """
        The IP address assigned to the transit gateway multicast group.
        """
        return pulumi.get(self, "group_ip_address")

    @group_ip_address.setter
    def group_ip_address(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "group_ip_address", value)

    @property
    @pulumi.getter(name="networkInterfaceId")
    def network_interface_id(self) -> Optional[pulumi.Input[str]]:
        """
        The group members' network interface ID to register with the transit gateway multicast group.
        """
        return pulumi.get(self, "network_interface_id")

    @network_interface_id.setter
    def network_interface_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "network_interface_id", value)

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


class MulticastGroupMember(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 group_ip_address: Optional[pulumi.Input[str]] = None,
                 network_interface_id: Optional[pulumi.Input[str]] = None,
                 transit_gateway_multicast_domain_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Registers members (network interfaces) with the transit gateway multicast group.
        A member is a network interface associated with a supported EC2 instance that receives multicast traffic.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.ec2transitgateway.MulticastGroupMember("example",
            group_ip_address="224.0.0.1",
            network_interface_id=aws_network_interface["example"]["id"],
            transit_gateway_multicast_domain_id=aws_ec2_transit_gateway_multicast_domain["example"]["id"])
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] group_ip_address: The IP address assigned to the transit gateway multicast group.
        :param pulumi.Input[str] network_interface_id: The group members' network interface ID to register with the transit gateway multicast group.
        :param pulumi.Input[str] transit_gateway_multicast_domain_id: The ID of the transit gateway multicast domain.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: MulticastGroupMemberArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Registers members (network interfaces) with the transit gateway multicast group.
        A member is a network interface associated with a supported EC2 instance that receives multicast traffic.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.ec2transitgateway.MulticastGroupMember("example",
            group_ip_address="224.0.0.1",
            network_interface_id=aws_network_interface["example"]["id"],
            transit_gateway_multicast_domain_id=aws_ec2_transit_gateway_multicast_domain["example"]["id"])
        ```

        :param str resource_name: The name of the resource.
        :param MulticastGroupMemberArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(MulticastGroupMemberArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 group_ip_address: Optional[pulumi.Input[str]] = None,
                 network_interface_id: Optional[pulumi.Input[str]] = None,
                 transit_gateway_multicast_domain_id: Optional[pulumi.Input[str]] = None,
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
            __props__ = MulticastGroupMemberArgs.__new__(MulticastGroupMemberArgs)

            if group_ip_address is None and not opts.urn:
                raise TypeError("Missing required property 'group_ip_address'")
            __props__.__dict__["group_ip_address"] = group_ip_address
            if network_interface_id is None and not opts.urn:
                raise TypeError("Missing required property 'network_interface_id'")
            __props__.__dict__["network_interface_id"] = network_interface_id
            if transit_gateway_multicast_domain_id is None and not opts.urn:
                raise TypeError("Missing required property 'transit_gateway_multicast_domain_id'")
            __props__.__dict__["transit_gateway_multicast_domain_id"] = transit_gateway_multicast_domain_id
        super(MulticastGroupMember, __self__).__init__(
            'aws:ec2transitgateway/multicastGroupMember:MulticastGroupMember',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            group_ip_address: Optional[pulumi.Input[str]] = None,
            network_interface_id: Optional[pulumi.Input[str]] = None,
            transit_gateway_multicast_domain_id: Optional[pulumi.Input[str]] = None) -> 'MulticastGroupMember':
        """
        Get an existing MulticastGroupMember resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] group_ip_address: The IP address assigned to the transit gateway multicast group.
        :param pulumi.Input[str] network_interface_id: The group members' network interface ID to register with the transit gateway multicast group.
        :param pulumi.Input[str] transit_gateway_multicast_domain_id: The ID of the transit gateway multicast domain.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _MulticastGroupMemberState.__new__(_MulticastGroupMemberState)

        __props__.__dict__["group_ip_address"] = group_ip_address
        __props__.__dict__["network_interface_id"] = network_interface_id
        __props__.__dict__["transit_gateway_multicast_domain_id"] = transit_gateway_multicast_domain_id
        return MulticastGroupMember(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="groupIpAddress")
    def group_ip_address(self) -> pulumi.Output[str]:
        """
        The IP address assigned to the transit gateway multicast group.
        """
        return pulumi.get(self, "group_ip_address")

    @property
    @pulumi.getter(name="networkInterfaceId")
    def network_interface_id(self) -> pulumi.Output[str]:
        """
        The group members' network interface ID to register with the transit gateway multicast group.
        """
        return pulumi.get(self, "network_interface_id")

    @property
    @pulumi.getter(name="transitGatewayMulticastDomainId")
    def transit_gateway_multicast_domain_id(self) -> pulumi.Output[str]:
        """
        The ID of the transit gateway multicast domain.
        """
        return pulumi.get(self, "transit_gateway_multicast_domain_id")


# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['LocalGatewayRouteArgs', 'LocalGatewayRoute']

@pulumi.input_type
class LocalGatewayRouteArgs:
    def __init__(__self__, *,
                 destination_cidr_block: pulumi.Input[str],
                 local_gateway_route_table_id: pulumi.Input[str],
                 local_gateway_virtual_interface_group_id: pulumi.Input[str]):
        """
        The set of arguments for constructing a LocalGatewayRoute resource.
        :param pulumi.Input[str] destination_cidr_block: IPv4 CIDR range used for destination matches. Routing decisions are based on the most specific match.
        :param pulumi.Input[str] local_gateway_route_table_id: Identifier of EC2 Local Gateway Route Table.
        :param pulumi.Input[str] local_gateway_virtual_interface_group_id: Identifier of EC2 Local Gateway Virtual Interface Group.
        """
        pulumi.set(__self__, "destination_cidr_block", destination_cidr_block)
        pulumi.set(__self__, "local_gateway_route_table_id", local_gateway_route_table_id)
        pulumi.set(__self__, "local_gateway_virtual_interface_group_id", local_gateway_virtual_interface_group_id)

    @property
    @pulumi.getter(name="destinationCidrBlock")
    def destination_cidr_block(self) -> pulumi.Input[str]:
        """
        IPv4 CIDR range used for destination matches. Routing decisions are based on the most specific match.
        """
        return pulumi.get(self, "destination_cidr_block")

    @destination_cidr_block.setter
    def destination_cidr_block(self, value: pulumi.Input[str]):
        pulumi.set(self, "destination_cidr_block", value)

    @property
    @pulumi.getter(name="localGatewayRouteTableId")
    def local_gateway_route_table_id(self) -> pulumi.Input[str]:
        """
        Identifier of EC2 Local Gateway Route Table.
        """
        return pulumi.get(self, "local_gateway_route_table_id")

    @local_gateway_route_table_id.setter
    def local_gateway_route_table_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "local_gateway_route_table_id", value)

    @property
    @pulumi.getter(name="localGatewayVirtualInterfaceGroupId")
    def local_gateway_virtual_interface_group_id(self) -> pulumi.Input[str]:
        """
        Identifier of EC2 Local Gateway Virtual Interface Group.
        """
        return pulumi.get(self, "local_gateway_virtual_interface_group_id")

    @local_gateway_virtual_interface_group_id.setter
    def local_gateway_virtual_interface_group_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "local_gateway_virtual_interface_group_id", value)


@pulumi.input_type
class _LocalGatewayRouteState:
    def __init__(__self__, *,
                 destination_cidr_block: Optional[pulumi.Input[str]] = None,
                 local_gateway_route_table_id: Optional[pulumi.Input[str]] = None,
                 local_gateway_virtual_interface_group_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering LocalGatewayRoute resources.
        :param pulumi.Input[str] destination_cidr_block: IPv4 CIDR range used for destination matches. Routing decisions are based on the most specific match.
        :param pulumi.Input[str] local_gateway_route_table_id: Identifier of EC2 Local Gateway Route Table.
        :param pulumi.Input[str] local_gateway_virtual_interface_group_id: Identifier of EC2 Local Gateway Virtual Interface Group.
        """
        if destination_cidr_block is not None:
            pulumi.set(__self__, "destination_cidr_block", destination_cidr_block)
        if local_gateway_route_table_id is not None:
            pulumi.set(__self__, "local_gateway_route_table_id", local_gateway_route_table_id)
        if local_gateway_virtual_interface_group_id is not None:
            pulumi.set(__self__, "local_gateway_virtual_interface_group_id", local_gateway_virtual_interface_group_id)

    @property
    @pulumi.getter(name="destinationCidrBlock")
    def destination_cidr_block(self) -> Optional[pulumi.Input[str]]:
        """
        IPv4 CIDR range used for destination matches. Routing decisions are based on the most specific match.
        """
        return pulumi.get(self, "destination_cidr_block")

    @destination_cidr_block.setter
    def destination_cidr_block(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "destination_cidr_block", value)

    @property
    @pulumi.getter(name="localGatewayRouteTableId")
    def local_gateway_route_table_id(self) -> Optional[pulumi.Input[str]]:
        """
        Identifier of EC2 Local Gateway Route Table.
        """
        return pulumi.get(self, "local_gateway_route_table_id")

    @local_gateway_route_table_id.setter
    def local_gateway_route_table_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "local_gateway_route_table_id", value)

    @property
    @pulumi.getter(name="localGatewayVirtualInterfaceGroupId")
    def local_gateway_virtual_interface_group_id(self) -> Optional[pulumi.Input[str]]:
        """
        Identifier of EC2 Local Gateway Virtual Interface Group.
        """
        return pulumi.get(self, "local_gateway_virtual_interface_group_id")

    @local_gateway_virtual_interface_group_id.setter
    def local_gateway_virtual_interface_group_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "local_gateway_virtual_interface_group_id", value)


class LocalGatewayRoute(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 destination_cidr_block: Optional[pulumi.Input[str]] = None,
                 local_gateway_route_table_id: Optional[pulumi.Input[str]] = None,
                 local_gateway_virtual_interface_group_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Manages an EC2 Local Gateway Route. More information can be found in the [Outposts User Guide](https://docs.aws.amazon.com/outposts/latest/userguide/outposts-networking-components.html#routing).

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.ec2.LocalGatewayRoute("example",
            destination_cidr_block="172.16.0.0/16",
            local_gateway_route_table_id=example_aws_ec2_local_gateway_route_table["id"],
            local_gateway_virtual_interface_group_id=example_aws_ec2_local_gateway_virtual_interface_group["id"])
        ```

        ## Import

        Using `pulumi import`, import `aws_ec2_local_gateway_route` using the EC2 Local Gateway Route Table identifier and destination CIDR block separated by underscores (`_`). For example:

        ```sh
         $ pulumi import aws:ec2/localGatewayRoute:LocalGatewayRoute example lgw-rtb-12345678_172.16.0.0/16
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] destination_cidr_block: IPv4 CIDR range used for destination matches. Routing decisions are based on the most specific match.
        :param pulumi.Input[str] local_gateway_route_table_id: Identifier of EC2 Local Gateway Route Table.
        :param pulumi.Input[str] local_gateway_virtual_interface_group_id: Identifier of EC2 Local Gateway Virtual Interface Group.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: LocalGatewayRouteArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages an EC2 Local Gateway Route. More information can be found in the [Outposts User Guide](https://docs.aws.amazon.com/outposts/latest/userguide/outposts-networking-components.html#routing).

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.ec2.LocalGatewayRoute("example",
            destination_cidr_block="172.16.0.0/16",
            local_gateway_route_table_id=example_aws_ec2_local_gateway_route_table["id"],
            local_gateway_virtual_interface_group_id=example_aws_ec2_local_gateway_virtual_interface_group["id"])
        ```

        ## Import

        Using `pulumi import`, import `aws_ec2_local_gateway_route` using the EC2 Local Gateway Route Table identifier and destination CIDR block separated by underscores (`_`). For example:

        ```sh
         $ pulumi import aws:ec2/localGatewayRoute:LocalGatewayRoute example lgw-rtb-12345678_172.16.0.0/16
        ```

        :param str resource_name: The name of the resource.
        :param LocalGatewayRouteArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(LocalGatewayRouteArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 destination_cidr_block: Optional[pulumi.Input[str]] = None,
                 local_gateway_route_table_id: Optional[pulumi.Input[str]] = None,
                 local_gateway_virtual_interface_group_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = LocalGatewayRouteArgs.__new__(LocalGatewayRouteArgs)

            if destination_cidr_block is None and not opts.urn:
                raise TypeError("Missing required property 'destination_cidr_block'")
            __props__.__dict__["destination_cidr_block"] = destination_cidr_block
            if local_gateway_route_table_id is None and not opts.urn:
                raise TypeError("Missing required property 'local_gateway_route_table_id'")
            __props__.__dict__["local_gateway_route_table_id"] = local_gateway_route_table_id
            if local_gateway_virtual_interface_group_id is None and not opts.urn:
                raise TypeError("Missing required property 'local_gateway_virtual_interface_group_id'")
            __props__.__dict__["local_gateway_virtual_interface_group_id"] = local_gateway_virtual_interface_group_id
        super(LocalGatewayRoute, __self__).__init__(
            'aws:ec2/localGatewayRoute:LocalGatewayRoute',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            destination_cidr_block: Optional[pulumi.Input[str]] = None,
            local_gateway_route_table_id: Optional[pulumi.Input[str]] = None,
            local_gateway_virtual_interface_group_id: Optional[pulumi.Input[str]] = None) -> 'LocalGatewayRoute':
        """
        Get an existing LocalGatewayRoute resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] destination_cidr_block: IPv4 CIDR range used for destination matches. Routing decisions are based on the most specific match.
        :param pulumi.Input[str] local_gateway_route_table_id: Identifier of EC2 Local Gateway Route Table.
        :param pulumi.Input[str] local_gateway_virtual_interface_group_id: Identifier of EC2 Local Gateway Virtual Interface Group.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _LocalGatewayRouteState.__new__(_LocalGatewayRouteState)

        __props__.__dict__["destination_cidr_block"] = destination_cidr_block
        __props__.__dict__["local_gateway_route_table_id"] = local_gateway_route_table_id
        __props__.__dict__["local_gateway_virtual_interface_group_id"] = local_gateway_virtual_interface_group_id
        return LocalGatewayRoute(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="destinationCidrBlock")
    def destination_cidr_block(self) -> pulumi.Output[str]:
        """
        IPv4 CIDR range used for destination matches. Routing decisions are based on the most specific match.
        """
        return pulumi.get(self, "destination_cidr_block")

    @property
    @pulumi.getter(name="localGatewayRouteTableId")
    def local_gateway_route_table_id(self) -> pulumi.Output[str]:
        """
        Identifier of EC2 Local Gateway Route Table.
        """
        return pulumi.get(self, "local_gateway_route_table_id")

    @property
    @pulumi.getter(name="localGatewayVirtualInterfaceGroupId")
    def local_gateway_virtual_interface_group_id(self) -> pulumi.Output[str]:
        """
        Identifier of EC2 Local Gateway Virtual Interface Group.
        """
        return pulumi.get(self, "local_gateway_virtual_interface_group_id")


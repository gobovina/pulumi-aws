# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['RouteArgs', 'Route']

@pulumi.input_type
class RouteArgs:
    def __init__(__self__, *,
                 destination_cidr_block: pulumi.Input[str],
                 transit_gateway_route_table_id: pulumi.Input[str],
                 blackhole: Optional[pulumi.Input[bool]] = None,
                 transit_gateway_attachment_id: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a Route resource.
        :param pulumi.Input[str] destination_cidr_block: IPv4 or IPv6 RFC1924 CIDR used for destination matches. Routing decisions are based on the most specific match.
        :param pulumi.Input[str] transit_gateway_route_table_id: Identifier of EC2 Transit Gateway Route Table.
        :param pulumi.Input[bool] blackhole: Indicates whether to drop traffic that matches this route (default to `false`).
        :param pulumi.Input[str] transit_gateway_attachment_id: Identifier of EC2 Transit Gateway Attachment (required if `blackhole` is set to false).
        """
        pulumi.set(__self__, "destination_cidr_block", destination_cidr_block)
        pulumi.set(__self__, "transit_gateway_route_table_id", transit_gateway_route_table_id)
        if blackhole is not None:
            pulumi.set(__self__, "blackhole", blackhole)
        if transit_gateway_attachment_id is not None:
            pulumi.set(__self__, "transit_gateway_attachment_id", transit_gateway_attachment_id)

    @property
    @pulumi.getter(name="destinationCidrBlock")
    def destination_cidr_block(self) -> pulumi.Input[str]:
        """
        IPv4 or IPv6 RFC1924 CIDR used for destination matches. Routing decisions are based on the most specific match.
        """
        return pulumi.get(self, "destination_cidr_block")

    @destination_cidr_block.setter
    def destination_cidr_block(self, value: pulumi.Input[str]):
        pulumi.set(self, "destination_cidr_block", value)

    @property
    @pulumi.getter(name="transitGatewayRouteTableId")
    def transit_gateway_route_table_id(self) -> pulumi.Input[str]:
        """
        Identifier of EC2 Transit Gateway Route Table.
        """
        return pulumi.get(self, "transit_gateway_route_table_id")

    @transit_gateway_route_table_id.setter
    def transit_gateway_route_table_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "transit_gateway_route_table_id", value)

    @property
    @pulumi.getter
    def blackhole(self) -> Optional[pulumi.Input[bool]]:
        """
        Indicates whether to drop traffic that matches this route (default to `false`).
        """
        return pulumi.get(self, "blackhole")

    @blackhole.setter
    def blackhole(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "blackhole", value)

    @property
    @pulumi.getter(name="transitGatewayAttachmentId")
    def transit_gateway_attachment_id(self) -> Optional[pulumi.Input[str]]:
        """
        Identifier of EC2 Transit Gateway Attachment (required if `blackhole` is set to false).
        """
        return pulumi.get(self, "transit_gateway_attachment_id")

    @transit_gateway_attachment_id.setter
    def transit_gateway_attachment_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "transit_gateway_attachment_id", value)


@pulumi.input_type
class _RouteState:
    def __init__(__self__, *,
                 blackhole: Optional[pulumi.Input[bool]] = None,
                 destination_cidr_block: Optional[pulumi.Input[str]] = None,
                 transit_gateway_attachment_id: Optional[pulumi.Input[str]] = None,
                 transit_gateway_route_table_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering Route resources.
        :param pulumi.Input[bool] blackhole: Indicates whether to drop traffic that matches this route (default to `false`).
        :param pulumi.Input[str] destination_cidr_block: IPv4 or IPv6 RFC1924 CIDR used for destination matches. Routing decisions are based on the most specific match.
        :param pulumi.Input[str] transit_gateway_attachment_id: Identifier of EC2 Transit Gateway Attachment (required if `blackhole` is set to false).
        :param pulumi.Input[str] transit_gateway_route_table_id: Identifier of EC2 Transit Gateway Route Table.
        """
        if blackhole is not None:
            pulumi.set(__self__, "blackhole", blackhole)
        if destination_cidr_block is not None:
            pulumi.set(__self__, "destination_cidr_block", destination_cidr_block)
        if transit_gateway_attachment_id is not None:
            pulumi.set(__self__, "transit_gateway_attachment_id", transit_gateway_attachment_id)
        if transit_gateway_route_table_id is not None:
            pulumi.set(__self__, "transit_gateway_route_table_id", transit_gateway_route_table_id)

    @property
    @pulumi.getter
    def blackhole(self) -> Optional[pulumi.Input[bool]]:
        """
        Indicates whether to drop traffic that matches this route (default to `false`).
        """
        return pulumi.get(self, "blackhole")

    @blackhole.setter
    def blackhole(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "blackhole", value)

    @property
    @pulumi.getter(name="destinationCidrBlock")
    def destination_cidr_block(self) -> Optional[pulumi.Input[str]]:
        """
        IPv4 or IPv6 RFC1924 CIDR used for destination matches. Routing decisions are based on the most specific match.
        """
        return pulumi.get(self, "destination_cidr_block")

    @destination_cidr_block.setter
    def destination_cidr_block(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "destination_cidr_block", value)

    @property
    @pulumi.getter(name="transitGatewayAttachmentId")
    def transit_gateway_attachment_id(self) -> Optional[pulumi.Input[str]]:
        """
        Identifier of EC2 Transit Gateway Attachment (required if `blackhole` is set to false).
        """
        return pulumi.get(self, "transit_gateway_attachment_id")

    @transit_gateway_attachment_id.setter
    def transit_gateway_attachment_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "transit_gateway_attachment_id", value)

    @property
    @pulumi.getter(name="transitGatewayRouteTableId")
    def transit_gateway_route_table_id(self) -> Optional[pulumi.Input[str]]:
        """
        Identifier of EC2 Transit Gateway Route Table.
        """
        return pulumi.get(self, "transit_gateway_route_table_id")

    @transit_gateway_route_table_id.setter
    def transit_gateway_route_table_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "transit_gateway_route_table_id", value)


class Route(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 blackhole: Optional[pulumi.Input[bool]] = None,
                 destination_cidr_block: Optional[pulumi.Input[str]] = None,
                 transit_gateway_attachment_id: Optional[pulumi.Input[str]] = None,
                 transit_gateway_route_table_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Manages an EC2 Transit Gateway Route.

        ## Example Usage
        ### Standard usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.ec2transitgateway.Route("example",
            destination_cidr_block="0.0.0.0/0",
            transit_gateway_attachment_id=example_aws_ec2_transit_gateway_vpc_attachment["id"],
            transit_gateway_route_table_id=example_aws_ec2_transit_gateway["associationDefaultRouteTableId"])
        ```
        ### Blackhole route

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.ec2transitgateway.Route("example",
            destination_cidr_block="0.0.0.0/0",
            blackhole=True,
            transit_gateway_route_table_id=example_aws_ec2_transit_gateway["associationDefaultRouteTableId"])
        ```

        ## Import

        Using `pulumi import`, import `aws_ec2_transit_gateway_route` using the EC2 Transit Gateway Route Table, an underscore, and the destination. For example:

        ```sh
         $ pulumi import aws:ec2transitgateway/route:Route example tgw-rtb-12345678_0.0.0.0/0
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] blackhole: Indicates whether to drop traffic that matches this route (default to `false`).
        :param pulumi.Input[str] destination_cidr_block: IPv4 or IPv6 RFC1924 CIDR used for destination matches. Routing decisions are based on the most specific match.
        :param pulumi.Input[str] transit_gateway_attachment_id: Identifier of EC2 Transit Gateway Attachment (required if `blackhole` is set to false).
        :param pulumi.Input[str] transit_gateway_route_table_id: Identifier of EC2 Transit Gateway Route Table.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: RouteArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages an EC2 Transit Gateway Route.

        ## Example Usage
        ### Standard usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.ec2transitgateway.Route("example",
            destination_cidr_block="0.0.0.0/0",
            transit_gateway_attachment_id=example_aws_ec2_transit_gateway_vpc_attachment["id"],
            transit_gateway_route_table_id=example_aws_ec2_transit_gateway["associationDefaultRouteTableId"])
        ```
        ### Blackhole route

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.ec2transitgateway.Route("example",
            destination_cidr_block="0.0.0.0/0",
            blackhole=True,
            transit_gateway_route_table_id=example_aws_ec2_transit_gateway["associationDefaultRouteTableId"])
        ```

        ## Import

        Using `pulumi import`, import `aws_ec2_transit_gateway_route` using the EC2 Transit Gateway Route Table, an underscore, and the destination. For example:

        ```sh
         $ pulumi import aws:ec2transitgateway/route:Route example tgw-rtb-12345678_0.0.0.0/0
        ```

        :param str resource_name: The name of the resource.
        :param RouteArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(RouteArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 blackhole: Optional[pulumi.Input[bool]] = None,
                 destination_cidr_block: Optional[pulumi.Input[str]] = None,
                 transit_gateway_attachment_id: Optional[pulumi.Input[str]] = None,
                 transit_gateway_route_table_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = RouteArgs.__new__(RouteArgs)

            __props__.__dict__["blackhole"] = blackhole
            if destination_cidr_block is None and not opts.urn:
                raise TypeError("Missing required property 'destination_cidr_block'")
            __props__.__dict__["destination_cidr_block"] = destination_cidr_block
            __props__.__dict__["transit_gateway_attachment_id"] = transit_gateway_attachment_id
            if transit_gateway_route_table_id is None and not opts.urn:
                raise TypeError("Missing required property 'transit_gateway_route_table_id'")
            __props__.__dict__["transit_gateway_route_table_id"] = transit_gateway_route_table_id
        super(Route, __self__).__init__(
            'aws:ec2transitgateway/route:Route',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            blackhole: Optional[pulumi.Input[bool]] = None,
            destination_cidr_block: Optional[pulumi.Input[str]] = None,
            transit_gateway_attachment_id: Optional[pulumi.Input[str]] = None,
            transit_gateway_route_table_id: Optional[pulumi.Input[str]] = None) -> 'Route':
        """
        Get an existing Route resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] blackhole: Indicates whether to drop traffic that matches this route (default to `false`).
        :param pulumi.Input[str] destination_cidr_block: IPv4 or IPv6 RFC1924 CIDR used for destination matches. Routing decisions are based on the most specific match.
        :param pulumi.Input[str] transit_gateway_attachment_id: Identifier of EC2 Transit Gateway Attachment (required if `blackhole` is set to false).
        :param pulumi.Input[str] transit_gateway_route_table_id: Identifier of EC2 Transit Gateway Route Table.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _RouteState.__new__(_RouteState)

        __props__.__dict__["blackhole"] = blackhole
        __props__.__dict__["destination_cidr_block"] = destination_cidr_block
        __props__.__dict__["transit_gateway_attachment_id"] = transit_gateway_attachment_id
        __props__.__dict__["transit_gateway_route_table_id"] = transit_gateway_route_table_id
        return Route(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def blackhole(self) -> pulumi.Output[Optional[bool]]:
        """
        Indicates whether to drop traffic that matches this route (default to `false`).
        """
        return pulumi.get(self, "blackhole")

    @property
    @pulumi.getter(name="destinationCidrBlock")
    def destination_cidr_block(self) -> pulumi.Output[str]:
        """
        IPv4 or IPv6 RFC1924 CIDR used for destination matches. Routing decisions are based on the most specific match.
        """
        return pulumi.get(self, "destination_cidr_block")

    @property
    @pulumi.getter(name="transitGatewayAttachmentId")
    def transit_gateway_attachment_id(self) -> pulumi.Output[Optional[str]]:
        """
        Identifier of EC2 Transit Gateway Attachment (required if `blackhole` is set to false).
        """
        return pulumi.get(self, "transit_gateway_attachment_id")

    @property
    @pulumi.getter(name="transitGatewayRouteTableId")
    def transit_gateway_route_table_id(self) -> pulumi.Output[str]:
        """
        Identifier of EC2 Transit Gateway Route Table.
        """
        return pulumi.get(self, "transit_gateway_route_table_id")


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

__all__ = ['VpnGatewayRoutePropagationArgs', 'VpnGatewayRoutePropagation']

@pulumi.input_type
class VpnGatewayRoutePropagationArgs:
    def __init__(__self__, *,
                 route_table_id: pulumi.Input[str],
                 vpn_gateway_id: pulumi.Input[str]):
        """
        The set of arguments for constructing a VpnGatewayRoutePropagation resource.
        :param pulumi.Input[str] route_table_id: The id of the `ec2.RouteTable` to propagate routes into.
        :param pulumi.Input[str] vpn_gateway_id: The id of the `ec2.VpnGateway` to propagate routes from.
        """
        pulumi.set(__self__, "route_table_id", route_table_id)
        pulumi.set(__self__, "vpn_gateway_id", vpn_gateway_id)

    @property
    @pulumi.getter(name="routeTableId")
    def route_table_id(self) -> pulumi.Input[str]:
        """
        The id of the `ec2.RouteTable` to propagate routes into.
        """
        return pulumi.get(self, "route_table_id")

    @route_table_id.setter
    def route_table_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "route_table_id", value)

    @property
    @pulumi.getter(name="vpnGatewayId")
    def vpn_gateway_id(self) -> pulumi.Input[str]:
        """
        The id of the `ec2.VpnGateway` to propagate routes from.
        """
        return pulumi.get(self, "vpn_gateway_id")

    @vpn_gateway_id.setter
    def vpn_gateway_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "vpn_gateway_id", value)


@pulumi.input_type
class _VpnGatewayRoutePropagationState:
    def __init__(__self__, *,
                 route_table_id: Optional[pulumi.Input[str]] = None,
                 vpn_gateway_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering VpnGatewayRoutePropagation resources.
        :param pulumi.Input[str] route_table_id: The id of the `ec2.RouteTable` to propagate routes into.
        :param pulumi.Input[str] vpn_gateway_id: The id of the `ec2.VpnGateway` to propagate routes from.
        """
        if route_table_id is not None:
            pulumi.set(__self__, "route_table_id", route_table_id)
        if vpn_gateway_id is not None:
            pulumi.set(__self__, "vpn_gateway_id", vpn_gateway_id)

    @property
    @pulumi.getter(name="routeTableId")
    def route_table_id(self) -> Optional[pulumi.Input[str]]:
        """
        The id of the `ec2.RouteTable` to propagate routes into.
        """
        return pulumi.get(self, "route_table_id")

    @route_table_id.setter
    def route_table_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "route_table_id", value)

    @property
    @pulumi.getter(name="vpnGatewayId")
    def vpn_gateway_id(self) -> Optional[pulumi.Input[str]]:
        """
        The id of the `ec2.VpnGateway` to propagate routes from.
        """
        return pulumi.get(self, "vpn_gateway_id")

    @vpn_gateway_id.setter
    def vpn_gateway_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "vpn_gateway_id", value)


class VpnGatewayRoutePropagation(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 route_table_id: Optional[pulumi.Input[str]] = None,
                 vpn_gateway_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Requests automatic route propagation between a VPN gateway and a route table.

        > **Note:** This resource should not be used with a route table that has
        the `propagating_vgws` argument set. If that argument is set, any route
        propagation not explicitly listed in its value will be removed.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.ec2.VpnGatewayRoutePropagation("example",
            vpn_gateway_id=example_aws_vpn_gateway["id"],
            route_table_id=example_aws_route_table["id"])
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] route_table_id: The id of the `ec2.RouteTable` to propagate routes into.
        :param pulumi.Input[str] vpn_gateway_id: The id of the `ec2.VpnGateway` to propagate routes from.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: VpnGatewayRoutePropagationArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Requests automatic route propagation between a VPN gateway and a route table.

        > **Note:** This resource should not be used with a route table that has
        the `propagating_vgws` argument set. If that argument is set, any route
        propagation not explicitly listed in its value will be removed.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.ec2.VpnGatewayRoutePropagation("example",
            vpn_gateway_id=example_aws_vpn_gateway["id"],
            route_table_id=example_aws_route_table["id"])
        ```

        :param str resource_name: The name of the resource.
        :param VpnGatewayRoutePropagationArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(VpnGatewayRoutePropagationArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 route_table_id: Optional[pulumi.Input[str]] = None,
                 vpn_gateway_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = VpnGatewayRoutePropagationArgs.__new__(VpnGatewayRoutePropagationArgs)

            if route_table_id is None and not opts.urn:
                raise TypeError("Missing required property 'route_table_id'")
            __props__.__dict__["route_table_id"] = route_table_id
            if vpn_gateway_id is None and not opts.urn:
                raise TypeError("Missing required property 'vpn_gateway_id'")
            __props__.__dict__["vpn_gateway_id"] = vpn_gateway_id
        super(VpnGatewayRoutePropagation, __self__).__init__(
            'aws:ec2/vpnGatewayRoutePropagation:VpnGatewayRoutePropagation',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            route_table_id: Optional[pulumi.Input[str]] = None,
            vpn_gateway_id: Optional[pulumi.Input[str]] = None) -> 'VpnGatewayRoutePropagation':
        """
        Get an existing VpnGatewayRoutePropagation resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] route_table_id: The id of the `ec2.RouteTable` to propagate routes into.
        :param pulumi.Input[str] vpn_gateway_id: The id of the `ec2.VpnGateway` to propagate routes from.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _VpnGatewayRoutePropagationState.__new__(_VpnGatewayRoutePropagationState)

        __props__.__dict__["route_table_id"] = route_table_id
        __props__.__dict__["vpn_gateway_id"] = vpn_gateway_id
        return VpnGatewayRoutePropagation(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="routeTableId")
    def route_table_id(self) -> pulumi.Output[str]:
        """
        The id of the `ec2.RouteTable` to propagate routes into.
        """
        return pulumi.get(self, "route_table_id")

    @property
    @pulumi.getter(name="vpnGatewayId")
    def vpn_gateway_id(self) -> pulumi.Output[str]:
        """
        The id of the `ec2.VpnGateway` to propagate routes from.
        """
        return pulumi.get(self, "vpn_gateway_id")


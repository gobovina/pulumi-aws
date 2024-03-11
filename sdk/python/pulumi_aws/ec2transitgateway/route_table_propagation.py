# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['RouteTablePropagationArgs', 'RouteTablePropagation']

@pulumi.input_type
class RouteTablePropagationArgs:
    def __init__(__self__, *,
                 transit_gateway_attachment_id: pulumi.Input[str],
                 transit_gateway_route_table_id: pulumi.Input[str]):
        """
        The set of arguments for constructing a RouteTablePropagation resource.
        :param pulumi.Input[str] transit_gateway_attachment_id: Identifier of EC2 Transit Gateway Attachment.
        :param pulumi.Input[str] transit_gateway_route_table_id: Identifier of EC2 Transit Gateway Route Table.
        """
        pulumi.set(__self__, "transit_gateway_attachment_id", transit_gateway_attachment_id)
        pulumi.set(__self__, "transit_gateway_route_table_id", transit_gateway_route_table_id)

    @property
    @pulumi.getter(name="transitGatewayAttachmentId")
    def transit_gateway_attachment_id(self) -> pulumi.Input[str]:
        """
        Identifier of EC2 Transit Gateway Attachment.
        """
        return pulumi.get(self, "transit_gateway_attachment_id")

    @transit_gateway_attachment_id.setter
    def transit_gateway_attachment_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "transit_gateway_attachment_id", value)

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


@pulumi.input_type
class _RouteTablePropagationState:
    def __init__(__self__, *,
                 resource_id: Optional[pulumi.Input[str]] = None,
                 resource_type: Optional[pulumi.Input[str]] = None,
                 transit_gateway_attachment_id: Optional[pulumi.Input[str]] = None,
                 transit_gateway_route_table_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering RouteTablePropagation resources.
        :param pulumi.Input[str] resource_id: Identifier of the resource
        :param pulumi.Input[str] resource_type: Type of the resource
        :param pulumi.Input[str] transit_gateway_attachment_id: Identifier of EC2 Transit Gateway Attachment.
        :param pulumi.Input[str] transit_gateway_route_table_id: Identifier of EC2 Transit Gateway Route Table.
        """
        if resource_id is not None:
            pulumi.set(__self__, "resource_id", resource_id)
        if resource_type is not None:
            pulumi.set(__self__, "resource_type", resource_type)
        if transit_gateway_attachment_id is not None:
            pulumi.set(__self__, "transit_gateway_attachment_id", transit_gateway_attachment_id)
        if transit_gateway_route_table_id is not None:
            pulumi.set(__self__, "transit_gateway_route_table_id", transit_gateway_route_table_id)

    @property
    @pulumi.getter(name="resourceId")
    def resource_id(self) -> Optional[pulumi.Input[str]]:
        """
        Identifier of the resource
        """
        return pulumi.get(self, "resource_id")

    @resource_id.setter
    def resource_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "resource_id", value)

    @property
    @pulumi.getter(name="resourceType")
    def resource_type(self) -> Optional[pulumi.Input[str]]:
        """
        Type of the resource
        """
        return pulumi.get(self, "resource_type")

    @resource_type.setter
    def resource_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "resource_type", value)

    @property
    @pulumi.getter(name="transitGatewayAttachmentId")
    def transit_gateway_attachment_id(self) -> Optional[pulumi.Input[str]]:
        """
        Identifier of EC2 Transit Gateway Attachment.
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


class RouteTablePropagation(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 transit_gateway_attachment_id: Optional[pulumi.Input[str]] = None,
                 transit_gateway_route_table_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Manages an EC2 Transit Gateway Route Table propagation.

        ## Example Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.ec2transitgateway.RouteTablePropagation("example",
            transit_gateway_attachment_id=example_aws_ec2_transit_gateway_vpc_attachment["id"],
            transit_gateway_route_table_id=example_aws_ec2_transit_gateway_route_table["id"])
        ```
        <!--End PulumiCodeChooser -->

        ## Import

        Using `pulumi import`, import `aws_ec2_transit_gateway_route_table_propagation` using the EC2 Transit Gateway Route Table identifier, an underscore, and the EC2 Transit Gateway Attachment identifier. For example:

        ```sh
        $ pulumi import aws:ec2transitgateway/routeTablePropagation:RouteTablePropagation example tgw-rtb-12345678_tgw-attach-87654321
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] transit_gateway_attachment_id: Identifier of EC2 Transit Gateway Attachment.
        :param pulumi.Input[str] transit_gateway_route_table_id: Identifier of EC2 Transit Gateway Route Table.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: RouteTablePropagationArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages an EC2 Transit Gateway Route Table propagation.

        ## Example Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.ec2transitgateway.RouteTablePropagation("example",
            transit_gateway_attachment_id=example_aws_ec2_transit_gateway_vpc_attachment["id"],
            transit_gateway_route_table_id=example_aws_ec2_transit_gateway_route_table["id"])
        ```
        <!--End PulumiCodeChooser -->

        ## Import

        Using `pulumi import`, import `aws_ec2_transit_gateway_route_table_propagation` using the EC2 Transit Gateway Route Table identifier, an underscore, and the EC2 Transit Gateway Attachment identifier. For example:

        ```sh
        $ pulumi import aws:ec2transitgateway/routeTablePropagation:RouteTablePropagation example tgw-rtb-12345678_tgw-attach-87654321
        ```

        :param str resource_name: The name of the resource.
        :param RouteTablePropagationArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(RouteTablePropagationArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 transit_gateway_attachment_id: Optional[pulumi.Input[str]] = None,
                 transit_gateway_route_table_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = RouteTablePropagationArgs.__new__(RouteTablePropagationArgs)

            if transit_gateway_attachment_id is None and not opts.urn:
                raise TypeError("Missing required property 'transit_gateway_attachment_id'")
            __props__.__dict__["transit_gateway_attachment_id"] = transit_gateway_attachment_id
            if transit_gateway_route_table_id is None and not opts.urn:
                raise TypeError("Missing required property 'transit_gateway_route_table_id'")
            __props__.__dict__["transit_gateway_route_table_id"] = transit_gateway_route_table_id
            __props__.__dict__["resource_id"] = None
            __props__.__dict__["resource_type"] = None
        super(RouteTablePropagation, __self__).__init__(
            'aws:ec2transitgateway/routeTablePropagation:RouteTablePropagation',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            resource_id: Optional[pulumi.Input[str]] = None,
            resource_type: Optional[pulumi.Input[str]] = None,
            transit_gateway_attachment_id: Optional[pulumi.Input[str]] = None,
            transit_gateway_route_table_id: Optional[pulumi.Input[str]] = None) -> 'RouteTablePropagation':
        """
        Get an existing RouteTablePropagation resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] resource_id: Identifier of the resource
        :param pulumi.Input[str] resource_type: Type of the resource
        :param pulumi.Input[str] transit_gateway_attachment_id: Identifier of EC2 Transit Gateway Attachment.
        :param pulumi.Input[str] transit_gateway_route_table_id: Identifier of EC2 Transit Gateway Route Table.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _RouteTablePropagationState.__new__(_RouteTablePropagationState)

        __props__.__dict__["resource_id"] = resource_id
        __props__.__dict__["resource_type"] = resource_type
        __props__.__dict__["transit_gateway_attachment_id"] = transit_gateway_attachment_id
        __props__.__dict__["transit_gateway_route_table_id"] = transit_gateway_route_table_id
        return RouteTablePropagation(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="resourceId")
    def resource_id(self) -> pulumi.Output[str]:
        """
        Identifier of the resource
        """
        return pulumi.get(self, "resource_id")

    @property
    @pulumi.getter(name="resourceType")
    def resource_type(self) -> pulumi.Output[str]:
        """
        Type of the resource
        """
        return pulumi.get(self, "resource_type")

    @property
    @pulumi.getter(name="transitGatewayAttachmentId")
    def transit_gateway_attachment_id(self) -> pulumi.Output[str]:
        """
        Identifier of EC2 Transit Gateway Attachment.
        """
        return pulumi.get(self, "transit_gateway_attachment_id")

    @property
    @pulumi.getter(name="transitGatewayRouteTableId")
    def transit_gateway_route_table_id(self) -> pulumi.Output[str]:
        """
        Identifier of EC2 Transit Gateway Route Table.
        """
        return pulumi.get(self, "transit_gateway_route_table_id")


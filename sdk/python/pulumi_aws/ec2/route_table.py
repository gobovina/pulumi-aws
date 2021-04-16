# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities
from . import outputs
from ._inputs import *

__all__ = ['RouteTableArgs', 'RouteTable']

@pulumi.input_type
class RouteTableArgs:
    def __init__(__self__, *,
                 vpc_id: pulumi.Input[str],
                 propagating_vgws: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 routes: Optional[pulumi.Input[Sequence[pulumi.Input['RouteTableRouteArgs']]]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        The set of arguments for constructing a RouteTable resource.
        :param pulumi.Input[str] vpc_id: The VPC ID.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] propagating_vgws: A list of virtual gateways for propagation.
        :param pulumi.Input[Sequence[pulumi.Input['RouteTableRouteArgs']]] routes: A list of route objects. Their keys are documented below.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A map of tags to assign to the resource.
        """
        pulumi.set(__self__, "vpc_id", vpc_id)
        if propagating_vgws is not None:
            pulumi.set(__self__, "propagating_vgws", propagating_vgws)
        if routes is not None:
            pulumi.set(__self__, "routes", routes)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter(name="vpcId")
    def vpc_id(self) -> pulumi.Input[str]:
        """
        The VPC ID.
        """
        return pulumi.get(self, "vpc_id")

    @vpc_id.setter
    def vpc_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "vpc_id", value)

    @property
    @pulumi.getter(name="propagatingVgws")
    def propagating_vgws(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        A list of virtual gateways for propagation.
        """
        return pulumi.get(self, "propagating_vgws")

    @propagating_vgws.setter
    def propagating_vgws(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "propagating_vgws", value)

    @property
    @pulumi.getter
    def routes(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['RouteTableRouteArgs']]]]:
        """
        A list of route objects. Their keys are documented below.
        """
        return pulumi.get(self, "routes")

    @routes.setter
    def routes(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['RouteTableRouteArgs']]]]):
        pulumi.set(self, "routes", value)

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
class _RouteTableState:
    def __init__(__self__, *,
                 arn: Optional[pulumi.Input[str]] = None,
                 owner_id: Optional[pulumi.Input[str]] = None,
                 propagating_vgws: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 routes: Optional[pulumi.Input[Sequence[pulumi.Input['RouteTableRouteArgs']]]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 vpc_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering RouteTable resources.
        :param pulumi.Input[str] arn: The ARN of the route table.
        :param pulumi.Input[str] owner_id: The ID of the AWS account that owns the route table.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] propagating_vgws: A list of virtual gateways for propagation.
        :param pulumi.Input[Sequence[pulumi.Input['RouteTableRouteArgs']]] routes: A list of route objects. Their keys are documented below.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A map of tags to assign to the resource.
        :param pulumi.Input[str] vpc_id: The VPC ID.
        """
        if arn is not None:
            pulumi.set(__self__, "arn", arn)
        if owner_id is not None:
            pulumi.set(__self__, "owner_id", owner_id)
        if propagating_vgws is not None:
            pulumi.set(__self__, "propagating_vgws", propagating_vgws)
        if routes is not None:
            pulumi.set(__self__, "routes", routes)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if vpc_id is not None:
            pulumi.set(__self__, "vpc_id", vpc_id)

    @property
    @pulumi.getter
    def arn(self) -> Optional[pulumi.Input[str]]:
        """
        The ARN of the route table.
        """
        return pulumi.get(self, "arn")

    @arn.setter
    def arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "arn", value)

    @property
    @pulumi.getter(name="ownerId")
    def owner_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the AWS account that owns the route table.
        """
        return pulumi.get(self, "owner_id")

    @owner_id.setter
    def owner_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "owner_id", value)

    @property
    @pulumi.getter(name="propagatingVgws")
    def propagating_vgws(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        A list of virtual gateways for propagation.
        """
        return pulumi.get(self, "propagating_vgws")

    @propagating_vgws.setter
    def propagating_vgws(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "propagating_vgws", value)

    @property
    @pulumi.getter
    def routes(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['RouteTableRouteArgs']]]]:
        """
        A list of route objects. Their keys are documented below.
        """
        return pulumi.get(self, "routes")

    @routes.setter
    def routes(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['RouteTableRouteArgs']]]]):
        pulumi.set(self, "routes", value)

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

    @property
    @pulumi.getter(name="vpcId")
    def vpc_id(self) -> Optional[pulumi.Input[str]]:
        """
        The VPC ID.
        """
        return pulumi.get(self, "vpc_id")

    @vpc_id.setter
    def vpc_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "vpc_id", value)


class RouteTable(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 propagating_vgws: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 routes: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['RouteTableRouteArgs']]]]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 vpc_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a resource to create a VPC routing table.

        > **NOTE on Route Tables and Routes:** This provider currently
        provides both a standalone Route resource and a Route Table resource with routes
        defined in-line. At this time you cannot use a Route Table with in-line routes
        in conjunction with any Route resources. Doing so will cause
        a conflict of rule settings and will overwrite rules.

        > **NOTE on `gateway_id` and `nat_gateway_id`:** The AWS API is very forgiving with these two
        attributes and the `ec2.RouteTable` resource can be created with a NAT ID specified as a Gateway ID attribute.
        This _will_ lead to a permanent diff between your configuration and statefile, as the API returns the correct
        parameters in the returned route table. If you're experiencing constant diffs in your `ec2.RouteTable` resources,
        the first thing to check is whether or not you're specifying a NAT ID instead of a Gateway ID, or vice-versa.

        > **NOTE on `propagating_vgws` and the `ec2.VpnGatewayRoutePropagation` resource:**
        If the `propagating_vgws` argument is present, it's not supported to _also_
        define route propagations using `ec2.VpnGatewayRoutePropagation`, since
        this resource will delete any propagating gateways not explicitly listed in
        `propagating_vgws`. Omit this argument when defining route propagation using
        the separate resource.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.ec2.RouteTable("example",
            vpc_id=aws_vpc["example"]["id"],
            routes=[
                aws.ec2.RouteTableRouteArgs(
                    cidr_block="10.0.1.0/24",
                    gateway_id=aws_internet_gateway["example"]["id"],
                ),
                aws.ec2.RouteTableRouteArgs(
                    ipv6_cidr_block="::/0",
                    egress_only_gateway_id=aws_egress_only_internet_gateway["example"]["id"],
                ),
            ],
            tags={
                "Name": "example",
            })
        ```

        To subsequently remove all managed routes:

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.ec2.RouteTable("example",
            vpc_id=aws_vpc["example"]["id"],
            routes=[],
            tags={
                "Name": "example",
            })
        ```

        ## Import

        Route Tables can be imported using the route table `id`. For example, to import route table `rtb-4e616f6d69`, use this command

        ```sh
         $ pulumi import aws:ec2/routeTable:RouteTable public_rt rtb-4e616f6d69
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] propagating_vgws: A list of virtual gateways for propagation.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['RouteTableRouteArgs']]]] routes: A list of route objects. Their keys are documented below.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A map of tags to assign to the resource.
        :param pulumi.Input[str] vpc_id: The VPC ID.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: RouteTableArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a resource to create a VPC routing table.

        > **NOTE on Route Tables and Routes:** This provider currently
        provides both a standalone Route resource and a Route Table resource with routes
        defined in-line. At this time you cannot use a Route Table with in-line routes
        in conjunction with any Route resources. Doing so will cause
        a conflict of rule settings and will overwrite rules.

        > **NOTE on `gateway_id` and `nat_gateway_id`:** The AWS API is very forgiving with these two
        attributes and the `ec2.RouteTable` resource can be created with a NAT ID specified as a Gateway ID attribute.
        This _will_ lead to a permanent diff between your configuration and statefile, as the API returns the correct
        parameters in the returned route table. If you're experiencing constant diffs in your `ec2.RouteTable` resources,
        the first thing to check is whether or not you're specifying a NAT ID instead of a Gateway ID, or vice-versa.

        > **NOTE on `propagating_vgws` and the `ec2.VpnGatewayRoutePropagation` resource:**
        If the `propagating_vgws` argument is present, it's not supported to _also_
        define route propagations using `ec2.VpnGatewayRoutePropagation`, since
        this resource will delete any propagating gateways not explicitly listed in
        `propagating_vgws`. Omit this argument when defining route propagation using
        the separate resource.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.ec2.RouteTable("example",
            vpc_id=aws_vpc["example"]["id"],
            routes=[
                aws.ec2.RouteTableRouteArgs(
                    cidr_block="10.0.1.0/24",
                    gateway_id=aws_internet_gateway["example"]["id"],
                ),
                aws.ec2.RouteTableRouteArgs(
                    ipv6_cidr_block="::/0",
                    egress_only_gateway_id=aws_egress_only_internet_gateway["example"]["id"],
                ),
            ],
            tags={
                "Name": "example",
            })
        ```

        To subsequently remove all managed routes:

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.ec2.RouteTable("example",
            vpc_id=aws_vpc["example"]["id"],
            routes=[],
            tags={
                "Name": "example",
            })
        ```

        ## Import

        Route Tables can be imported using the route table `id`. For example, to import route table `rtb-4e616f6d69`, use this command

        ```sh
         $ pulumi import aws:ec2/routeTable:RouteTable public_rt rtb-4e616f6d69
        ```

        :param str resource_name: The name of the resource.
        :param RouteTableArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(RouteTableArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 propagating_vgws: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 routes: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['RouteTableRouteArgs']]]]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 vpc_id: Optional[pulumi.Input[str]] = None,
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
            __props__ = RouteTableArgs.__new__(RouteTableArgs)

            __props__.__dict__["propagating_vgws"] = propagating_vgws
            __props__.__dict__["routes"] = routes
            __props__.__dict__["tags"] = tags
            if vpc_id is None and not opts.urn:
                raise TypeError("Missing required property 'vpc_id'")
            __props__.__dict__["vpc_id"] = vpc_id
            __props__.__dict__["arn"] = None
            __props__.__dict__["owner_id"] = None
        super(RouteTable, __self__).__init__(
            'aws:ec2/routeTable:RouteTable',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            arn: Optional[pulumi.Input[str]] = None,
            owner_id: Optional[pulumi.Input[str]] = None,
            propagating_vgws: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            routes: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['RouteTableRouteArgs']]]]] = None,
            tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            vpc_id: Optional[pulumi.Input[str]] = None) -> 'RouteTable':
        """
        Get an existing RouteTable resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] arn: The ARN of the route table.
        :param pulumi.Input[str] owner_id: The ID of the AWS account that owns the route table.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] propagating_vgws: A list of virtual gateways for propagation.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['RouteTableRouteArgs']]]] routes: A list of route objects. Their keys are documented below.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A map of tags to assign to the resource.
        :param pulumi.Input[str] vpc_id: The VPC ID.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _RouteTableState.__new__(_RouteTableState)

        __props__.__dict__["arn"] = arn
        __props__.__dict__["owner_id"] = owner_id
        __props__.__dict__["propagating_vgws"] = propagating_vgws
        __props__.__dict__["routes"] = routes
        __props__.__dict__["tags"] = tags
        __props__.__dict__["vpc_id"] = vpc_id
        return RouteTable(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def arn(self) -> pulumi.Output[str]:
        """
        The ARN of the route table.
        """
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter(name="ownerId")
    def owner_id(self) -> pulumi.Output[str]:
        """
        The ID of the AWS account that owns the route table.
        """
        return pulumi.get(self, "owner_id")

    @property
    @pulumi.getter(name="propagatingVgws")
    def propagating_vgws(self) -> pulumi.Output[Sequence[str]]:
        """
        A list of virtual gateways for propagation.
        """
        return pulumi.get(self, "propagating_vgws")

    @property
    @pulumi.getter
    def routes(self) -> pulumi.Output[Sequence['outputs.RouteTableRoute']]:
        """
        A list of route objects. Their keys are documented below.
        """
        return pulumi.get(self, "routes")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, str]]]:
        """
        A map of tags to assign to the resource.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter(name="vpcId")
    def vpc_id(self) -> pulumi.Output[str]:
        """
        The VPC ID.
        """
        return pulumi.get(self, "vpc_id")


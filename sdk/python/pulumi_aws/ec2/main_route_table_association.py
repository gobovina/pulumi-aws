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

__all__ = ['MainRouteTableAssociationArgs', 'MainRouteTableAssociation']

@pulumi.input_type
class MainRouteTableAssociationArgs:
    def __init__(__self__, *,
                 route_table_id: pulumi.Input[str],
                 vpc_id: pulumi.Input[str]):
        """
        The set of arguments for constructing a MainRouteTableAssociation resource.
        :param pulumi.Input[str] route_table_id: The ID of the Route Table to set as the new
               main route table for the target VPC
        :param pulumi.Input[str] vpc_id: The ID of the VPC whose main route table should be set
        """
        pulumi.set(__self__, "route_table_id", route_table_id)
        pulumi.set(__self__, "vpc_id", vpc_id)

    @property
    @pulumi.getter(name="routeTableId")
    def route_table_id(self) -> pulumi.Input[str]:
        """
        The ID of the Route Table to set as the new
        main route table for the target VPC
        """
        return pulumi.get(self, "route_table_id")

    @route_table_id.setter
    def route_table_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "route_table_id", value)

    @property
    @pulumi.getter(name="vpcId")
    def vpc_id(self) -> pulumi.Input[str]:
        """
        The ID of the VPC whose main route table should be set
        """
        return pulumi.get(self, "vpc_id")

    @vpc_id.setter
    def vpc_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "vpc_id", value)


@pulumi.input_type
class _MainRouteTableAssociationState:
    def __init__(__self__, *,
                 original_route_table_id: Optional[pulumi.Input[str]] = None,
                 route_table_id: Optional[pulumi.Input[str]] = None,
                 vpc_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering MainRouteTableAssociation resources.
        :param pulumi.Input[str] original_route_table_id: Used internally, see **Notes** below
        :param pulumi.Input[str] route_table_id: The ID of the Route Table to set as the new
               main route table for the target VPC
        :param pulumi.Input[str] vpc_id: The ID of the VPC whose main route table should be set
        """
        if original_route_table_id is not None:
            pulumi.set(__self__, "original_route_table_id", original_route_table_id)
        if route_table_id is not None:
            pulumi.set(__self__, "route_table_id", route_table_id)
        if vpc_id is not None:
            pulumi.set(__self__, "vpc_id", vpc_id)

    @property
    @pulumi.getter(name="originalRouteTableId")
    def original_route_table_id(self) -> Optional[pulumi.Input[str]]:
        """
        Used internally, see **Notes** below
        """
        return pulumi.get(self, "original_route_table_id")

    @original_route_table_id.setter
    def original_route_table_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "original_route_table_id", value)

    @property
    @pulumi.getter(name="routeTableId")
    def route_table_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the Route Table to set as the new
        main route table for the target VPC
        """
        return pulumi.get(self, "route_table_id")

    @route_table_id.setter
    def route_table_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "route_table_id", value)

    @property
    @pulumi.getter(name="vpcId")
    def vpc_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the VPC whose main route table should be set
        """
        return pulumi.get(self, "vpc_id")

    @vpc_id.setter
    def vpc_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "vpc_id", value)


class MainRouteTableAssociation(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 route_table_id: Optional[pulumi.Input[str]] = None,
                 vpc_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a resource for managing the main routing table of a VPC.

        > **NOTE:** **Do not** use both `ec2.DefaultRouteTable` to manage a default route table **and** `ec2.MainRouteTableAssociation` with the same VPC due to possible route conflicts. See ec2.DefaultRouteTable documentation for more details.
        For more information, see the Amazon VPC User Guide on [Route Tables][aws-route-tables]. For information about managing normal route tables in Pulumi, see [`ec2.RouteTable`][tf-route-tables].

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        a = aws.ec2.MainRouteTableAssociation("a",
            vpc_id=foo["id"],
            route_table_id=bar["id"])
        ```

        ## Notes

        On VPC creation, the AWS API always creates an initial Main Route Table. This
        resource records the ID of that Route Table under `original_route_table_id`.
        The "Delete" action for a `main_route_table_association` consists of resetting
        this original table as the Main Route Table for the VPC. You'll see this
        additional Route Table in the AWS console; it must remain intact in order for
        the `main_route_table_association` delete to work properly.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] route_table_id: The ID of the Route Table to set as the new
               main route table for the target VPC
        :param pulumi.Input[str] vpc_id: The ID of the VPC whose main route table should be set
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: MainRouteTableAssociationArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a resource for managing the main routing table of a VPC.

        > **NOTE:** **Do not** use both `ec2.DefaultRouteTable` to manage a default route table **and** `ec2.MainRouteTableAssociation` with the same VPC due to possible route conflicts. See ec2.DefaultRouteTable documentation for more details.
        For more information, see the Amazon VPC User Guide on [Route Tables][aws-route-tables]. For information about managing normal route tables in Pulumi, see [`ec2.RouteTable`][tf-route-tables].

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        a = aws.ec2.MainRouteTableAssociation("a",
            vpc_id=foo["id"],
            route_table_id=bar["id"])
        ```

        ## Notes

        On VPC creation, the AWS API always creates an initial Main Route Table. This
        resource records the ID of that Route Table under `original_route_table_id`.
        The "Delete" action for a `main_route_table_association` consists of resetting
        this original table as the Main Route Table for the VPC. You'll see this
        additional Route Table in the AWS console; it must remain intact in order for
        the `main_route_table_association` delete to work properly.

        :param str resource_name: The name of the resource.
        :param MainRouteTableAssociationArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(MainRouteTableAssociationArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 route_table_id: Optional[pulumi.Input[str]] = None,
                 vpc_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = MainRouteTableAssociationArgs.__new__(MainRouteTableAssociationArgs)

            if route_table_id is None and not opts.urn:
                raise TypeError("Missing required property 'route_table_id'")
            __props__.__dict__["route_table_id"] = route_table_id
            if vpc_id is None and not opts.urn:
                raise TypeError("Missing required property 'vpc_id'")
            __props__.__dict__["vpc_id"] = vpc_id
            __props__.__dict__["original_route_table_id"] = None
        super(MainRouteTableAssociation, __self__).__init__(
            'aws:ec2/mainRouteTableAssociation:MainRouteTableAssociation',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            original_route_table_id: Optional[pulumi.Input[str]] = None,
            route_table_id: Optional[pulumi.Input[str]] = None,
            vpc_id: Optional[pulumi.Input[str]] = None) -> 'MainRouteTableAssociation':
        """
        Get an existing MainRouteTableAssociation resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] original_route_table_id: Used internally, see **Notes** below
        :param pulumi.Input[str] route_table_id: The ID of the Route Table to set as the new
               main route table for the target VPC
        :param pulumi.Input[str] vpc_id: The ID of the VPC whose main route table should be set
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _MainRouteTableAssociationState.__new__(_MainRouteTableAssociationState)

        __props__.__dict__["original_route_table_id"] = original_route_table_id
        __props__.__dict__["route_table_id"] = route_table_id
        __props__.__dict__["vpc_id"] = vpc_id
        return MainRouteTableAssociation(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="originalRouteTableId")
    def original_route_table_id(self) -> pulumi.Output[str]:
        """
        Used internally, see **Notes** below
        """
        return pulumi.get(self, "original_route_table_id")

    @property
    @pulumi.getter(name="routeTableId")
    def route_table_id(self) -> pulumi.Output[str]:
        """
        The ID of the Route Table to set as the new
        main route table for the target VPC
        """
        return pulumi.get(self, "route_table_id")

    @property
    @pulumi.getter(name="vpcId")
    def vpc_id(self) -> pulumi.Output[str]:
        """
        The ID of the VPC whose main route table should be set
        """
        return pulumi.get(self, "vpc_id")


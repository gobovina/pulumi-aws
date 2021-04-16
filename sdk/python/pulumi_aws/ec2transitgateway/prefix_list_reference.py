# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['PrefixListReferenceArgs', 'PrefixListReference']

@pulumi.input_type
class PrefixListReferenceArgs:
    def __init__(__self__, *,
                 prefix_list_id: pulumi.Input[str],
                 transit_gateway_route_table_id: pulumi.Input[str],
                 blackhole: Optional[pulumi.Input[bool]] = None,
                 transit_gateway_attachment_id: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a PrefixListReference resource.
        :param pulumi.Input[str] prefix_list_id: Identifier of EC2 Prefix List.
        :param pulumi.Input[str] transit_gateway_route_table_id: Identifier of EC2 Transit Gateway Route Table.
        :param pulumi.Input[bool] blackhole: Indicates whether to drop traffic that matches the Prefix List. Defaults to `false`.
        :param pulumi.Input[str] transit_gateway_attachment_id: Identifier of EC2 Transit Gateway Attachment.
        """
        pulumi.set(__self__, "prefix_list_id", prefix_list_id)
        pulumi.set(__self__, "transit_gateway_route_table_id", transit_gateway_route_table_id)
        if blackhole is not None:
            pulumi.set(__self__, "blackhole", blackhole)
        if transit_gateway_attachment_id is not None:
            pulumi.set(__self__, "transit_gateway_attachment_id", transit_gateway_attachment_id)

    @property
    @pulumi.getter(name="prefixListId")
    def prefix_list_id(self) -> pulumi.Input[str]:
        """
        Identifier of EC2 Prefix List.
        """
        return pulumi.get(self, "prefix_list_id")

    @prefix_list_id.setter
    def prefix_list_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "prefix_list_id", value)

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
        Indicates whether to drop traffic that matches the Prefix List. Defaults to `false`.
        """
        return pulumi.get(self, "blackhole")

    @blackhole.setter
    def blackhole(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "blackhole", value)

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


@pulumi.input_type
class _PrefixListReferenceState:
    def __init__(__self__, *,
                 blackhole: Optional[pulumi.Input[bool]] = None,
                 prefix_list_id: Optional[pulumi.Input[str]] = None,
                 prefix_list_owner_id: Optional[pulumi.Input[str]] = None,
                 transit_gateway_attachment_id: Optional[pulumi.Input[str]] = None,
                 transit_gateway_route_table_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering PrefixListReference resources.
        :param pulumi.Input[bool] blackhole: Indicates whether to drop traffic that matches the Prefix List. Defaults to `false`.
        :param pulumi.Input[str] prefix_list_id: Identifier of EC2 Prefix List.
        :param pulumi.Input[str] transit_gateway_attachment_id: Identifier of EC2 Transit Gateway Attachment.
        :param pulumi.Input[str] transit_gateway_route_table_id: Identifier of EC2 Transit Gateway Route Table.
        """
        if blackhole is not None:
            pulumi.set(__self__, "blackhole", blackhole)
        if prefix_list_id is not None:
            pulumi.set(__self__, "prefix_list_id", prefix_list_id)
        if prefix_list_owner_id is not None:
            pulumi.set(__self__, "prefix_list_owner_id", prefix_list_owner_id)
        if transit_gateway_attachment_id is not None:
            pulumi.set(__self__, "transit_gateway_attachment_id", transit_gateway_attachment_id)
        if transit_gateway_route_table_id is not None:
            pulumi.set(__self__, "transit_gateway_route_table_id", transit_gateway_route_table_id)

    @property
    @pulumi.getter
    def blackhole(self) -> Optional[pulumi.Input[bool]]:
        """
        Indicates whether to drop traffic that matches the Prefix List. Defaults to `false`.
        """
        return pulumi.get(self, "blackhole")

    @blackhole.setter
    def blackhole(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "blackhole", value)

    @property
    @pulumi.getter(name="prefixListId")
    def prefix_list_id(self) -> Optional[pulumi.Input[str]]:
        """
        Identifier of EC2 Prefix List.
        """
        return pulumi.get(self, "prefix_list_id")

    @prefix_list_id.setter
    def prefix_list_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "prefix_list_id", value)

    @property
    @pulumi.getter(name="prefixListOwnerId")
    def prefix_list_owner_id(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "prefix_list_owner_id")

    @prefix_list_owner_id.setter
    def prefix_list_owner_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "prefix_list_owner_id", value)

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


class PrefixListReference(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 blackhole: Optional[pulumi.Input[bool]] = None,
                 prefix_list_id: Optional[pulumi.Input[str]] = None,
                 transit_gateway_attachment_id: Optional[pulumi.Input[str]] = None,
                 transit_gateway_route_table_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Manages an EC2 Transit Gateway Prefix List Reference.

        ## Example Usage
        ### Attachment Routing

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.ec2transitgateway.PrefixListReference("example",
            prefix_list_id=aws_ec2_managed_prefix_list["example"]["id"],
            transit_gateway_attachment_id=aws_ec2_transit_gateway_vpc_attachment["example"]["id"],
            transit_gateway_route_table_id=aws_ec2_transit_gateway["example"]["association_default_route_table_id"])
        ```
        ### Blackhole Routing

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.ec2transitgateway.PrefixListReference("example",
            blackhole=True,
            prefix_list_id=aws_ec2_managed_prefix_list["example"]["id"],
            transit_gateway_route_table_id=aws_ec2_transit_gateway["example"]["association_default_route_table_id"])
        ```

        ## Import

        `aws_ec2_transit_gateway_prefix_list_reference` can be imported by using the EC2 Transit Gateway Route Table identifier and EC2 Prefix List identifier, separated by an underscore (`_`), e.g. console

        ```sh
         $ pulumi import aws:ec2transitgateway/prefixListReference:PrefixListReference example tgw-rtb-12345678_pl-12345678
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] blackhole: Indicates whether to drop traffic that matches the Prefix List. Defaults to `false`.
        :param pulumi.Input[str] prefix_list_id: Identifier of EC2 Prefix List.
        :param pulumi.Input[str] transit_gateway_attachment_id: Identifier of EC2 Transit Gateway Attachment.
        :param pulumi.Input[str] transit_gateway_route_table_id: Identifier of EC2 Transit Gateway Route Table.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: PrefixListReferenceArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages an EC2 Transit Gateway Prefix List Reference.

        ## Example Usage
        ### Attachment Routing

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.ec2transitgateway.PrefixListReference("example",
            prefix_list_id=aws_ec2_managed_prefix_list["example"]["id"],
            transit_gateway_attachment_id=aws_ec2_transit_gateway_vpc_attachment["example"]["id"],
            transit_gateway_route_table_id=aws_ec2_transit_gateway["example"]["association_default_route_table_id"])
        ```
        ### Blackhole Routing

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.ec2transitgateway.PrefixListReference("example",
            blackhole=True,
            prefix_list_id=aws_ec2_managed_prefix_list["example"]["id"],
            transit_gateway_route_table_id=aws_ec2_transit_gateway["example"]["association_default_route_table_id"])
        ```

        ## Import

        `aws_ec2_transit_gateway_prefix_list_reference` can be imported by using the EC2 Transit Gateway Route Table identifier and EC2 Prefix List identifier, separated by an underscore (`_`), e.g. console

        ```sh
         $ pulumi import aws:ec2transitgateway/prefixListReference:PrefixListReference example tgw-rtb-12345678_pl-12345678
        ```

        :param str resource_name: The name of the resource.
        :param PrefixListReferenceArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(PrefixListReferenceArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 blackhole: Optional[pulumi.Input[bool]] = None,
                 prefix_list_id: Optional[pulumi.Input[str]] = None,
                 transit_gateway_attachment_id: Optional[pulumi.Input[str]] = None,
                 transit_gateway_route_table_id: Optional[pulumi.Input[str]] = None,
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
            __props__ = PrefixListReferenceArgs.__new__(PrefixListReferenceArgs)

            __props__.__dict__["blackhole"] = blackhole
            if prefix_list_id is None and not opts.urn:
                raise TypeError("Missing required property 'prefix_list_id'")
            __props__.__dict__["prefix_list_id"] = prefix_list_id
            __props__.__dict__["transit_gateway_attachment_id"] = transit_gateway_attachment_id
            if transit_gateway_route_table_id is None and not opts.urn:
                raise TypeError("Missing required property 'transit_gateway_route_table_id'")
            __props__.__dict__["transit_gateway_route_table_id"] = transit_gateway_route_table_id
            __props__.__dict__["prefix_list_owner_id"] = None
        super(PrefixListReference, __self__).__init__(
            'aws:ec2transitgateway/prefixListReference:PrefixListReference',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            blackhole: Optional[pulumi.Input[bool]] = None,
            prefix_list_id: Optional[pulumi.Input[str]] = None,
            prefix_list_owner_id: Optional[pulumi.Input[str]] = None,
            transit_gateway_attachment_id: Optional[pulumi.Input[str]] = None,
            transit_gateway_route_table_id: Optional[pulumi.Input[str]] = None) -> 'PrefixListReference':
        """
        Get an existing PrefixListReference resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] blackhole: Indicates whether to drop traffic that matches the Prefix List. Defaults to `false`.
        :param pulumi.Input[str] prefix_list_id: Identifier of EC2 Prefix List.
        :param pulumi.Input[str] transit_gateway_attachment_id: Identifier of EC2 Transit Gateway Attachment.
        :param pulumi.Input[str] transit_gateway_route_table_id: Identifier of EC2 Transit Gateway Route Table.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _PrefixListReferenceState.__new__(_PrefixListReferenceState)

        __props__.__dict__["blackhole"] = blackhole
        __props__.__dict__["prefix_list_id"] = prefix_list_id
        __props__.__dict__["prefix_list_owner_id"] = prefix_list_owner_id
        __props__.__dict__["transit_gateway_attachment_id"] = transit_gateway_attachment_id
        __props__.__dict__["transit_gateway_route_table_id"] = transit_gateway_route_table_id
        return PrefixListReference(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def blackhole(self) -> pulumi.Output[Optional[bool]]:
        """
        Indicates whether to drop traffic that matches the Prefix List. Defaults to `false`.
        """
        return pulumi.get(self, "blackhole")

    @property
    @pulumi.getter(name="prefixListId")
    def prefix_list_id(self) -> pulumi.Output[str]:
        """
        Identifier of EC2 Prefix List.
        """
        return pulumi.get(self, "prefix_list_id")

    @property
    @pulumi.getter(name="prefixListOwnerId")
    def prefix_list_owner_id(self) -> pulumi.Output[str]:
        return pulumi.get(self, "prefix_list_owner_id")

    @property
    @pulumi.getter(name="transitGatewayAttachmentId")
    def transit_gateway_attachment_id(self) -> pulumi.Output[Optional[str]]:
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


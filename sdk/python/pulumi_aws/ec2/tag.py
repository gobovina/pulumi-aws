# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['TagArgs', 'Tag']

@pulumi.input_type
class TagArgs:
    def __init__(__self__, *,
                 key: pulumi.Input[str],
                 resource_id: pulumi.Input[str],
                 value: pulumi.Input[str]):
        """
        The set of arguments for constructing a Tag resource.
        :param pulumi.Input[str] key: The tag name.
        :param pulumi.Input[str] resource_id: The ID of the EC2 resource to manage the tag for.
        :param pulumi.Input[str] value: The value of the tag.
        """
        pulumi.set(__self__, "key", key)
        pulumi.set(__self__, "resource_id", resource_id)
        pulumi.set(__self__, "value", value)

    @property
    @pulumi.getter
    def key(self) -> pulumi.Input[str]:
        """
        The tag name.
        """
        return pulumi.get(self, "key")

    @key.setter
    def key(self, value: pulumi.Input[str]):
        pulumi.set(self, "key", value)

    @property
    @pulumi.getter(name="resourceId")
    def resource_id(self) -> pulumi.Input[str]:
        """
        The ID of the EC2 resource to manage the tag for.
        """
        return pulumi.get(self, "resource_id")

    @resource_id.setter
    def resource_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "resource_id", value)

    @property
    @pulumi.getter
    def value(self) -> pulumi.Input[str]:
        """
        The value of the tag.
        """
        return pulumi.get(self, "value")

    @value.setter
    def value(self, value: pulumi.Input[str]):
        pulumi.set(self, "value", value)


@pulumi.input_type
class _TagState:
    def __init__(__self__, *,
                 key: Optional[pulumi.Input[str]] = None,
                 resource_id: Optional[pulumi.Input[str]] = None,
                 value: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering Tag resources.
        :param pulumi.Input[str] key: The tag name.
        :param pulumi.Input[str] resource_id: The ID of the EC2 resource to manage the tag for.
        :param pulumi.Input[str] value: The value of the tag.
        """
        if key is not None:
            pulumi.set(__self__, "key", key)
        if resource_id is not None:
            pulumi.set(__self__, "resource_id", resource_id)
        if value is not None:
            pulumi.set(__self__, "value", value)

    @property
    @pulumi.getter
    def key(self) -> Optional[pulumi.Input[str]]:
        """
        The tag name.
        """
        return pulumi.get(self, "key")

    @key.setter
    def key(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "key", value)

    @property
    @pulumi.getter(name="resourceId")
    def resource_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the EC2 resource to manage the tag for.
        """
        return pulumi.get(self, "resource_id")

    @resource_id.setter
    def resource_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "resource_id", value)

    @property
    @pulumi.getter
    def value(self) -> Optional[pulumi.Input[str]]:
        """
        The value of the tag.
        """
        return pulumi.get(self, "value")

    @value.setter
    def value(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "value", value)


class Tag(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 key: Optional[pulumi.Input[str]] = None,
                 resource_id: Optional[pulumi.Input[str]] = None,
                 value: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Manages an individual EC2 resource tag. This resource should only be used in cases where EC2 resources are created outside the provider (e.g. AMIs), being shared via Resource Access Manager (RAM), or implicitly created by other means (e.g. Transit Gateway VPN Attachments).

        > **NOTE:** This tagging resource should not be combined with the providers resource for managing the parent resource. For example, using `ec2.Vpc` and `ec2.Tag` to manage tags of the same VPC will cause a perpetual difference where the `ec2.Vpc` resource will try to remove the tag being added by the `ec2.Tag` resource.

        ## Example Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.ec2transitgateway.TransitGateway("example")
        example_customer_gateway = aws.ec2.CustomerGateway("example",
            bgp_asn="65000",
            ip_address="172.0.0.1",
            type="ipsec.1")
        example_vpn_connection = aws.ec2.VpnConnection("example",
            customer_gateway_id=example_customer_gateway.id,
            transit_gateway_id=example.id,
            type=example_customer_gateway.type)
        example_tag = aws.ec2.Tag("example",
            resource_id=example_vpn_connection.transit_gateway_attachment_id,
            key="Name",
            value="Hello World")
        ```
        <!--End PulumiCodeChooser -->

        ## Import

        Using `pulumi import`, import `aws_ec2_tag` using the EC2 resource identifier and key, separated by a comma (`,`). For example:

        ```sh
        $ pulumi import aws:ec2/tag:Tag example tgw-attach-1234567890abcdef,Name
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] key: The tag name.
        :param pulumi.Input[str] resource_id: The ID of the EC2 resource to manage the tag for.
        :param pulumi.Input[str] value: The value of the tag.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: TagArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages an individual EC2 resource tag. This resource should only be used in cases where EC2 resources are created outside the provider (e.g. AMIs), being shared via Resource Access Manager (RAM), or implicitly created by other means (e.g. Transit Gateway VPN Attachments).

        > **NOTE:** This tagging resource should not be combined with the providers resource for managing the parent resource. For example, using `ec2.Vpc` and `ec2.Tag` to manage tags of the same VPC will cause a perpetual difference where the `ec2.Vpc` resource will try to remove the tag being added by the `ec2.Tag` resource.

        ## Example Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.ec2transitgateway.TransitGateway("example")
        example_customer_gateway = aws.ec2.CustomerGateway("example",
            bgp_asn="65000",
            ip_address="172.0.0.1",
            type="ipsec.1")
        example_vpn_connection = aws.ec2.VpnConnection("example",
            customer_gateway_id=example_customer_gateway.id,
            transit_gateway_id=example.id,
            type=example_customer_gateway.type)
        example_tag = aws.ec2.Tag("example",
            resource_id=example_vpn_connection.transit_gateway_attachment_id,
            key="Name",
            value="Hello World")
        ```
        <!--End PulumiCodeChooser -->

        ## Import

        Using `pulumi import`, import `aws_ec2_tag` using the EC2 resource identifier and key, separated by a comma (`,`). For example:

        ```sh
        $ pulumi import aws:ec2/tag:Tag example tgw-attach-1234567890abcdef,Name
        ```

        :param str resource_name: The name of the resource.
        :param TagArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(TagArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 key: Optional[pulumi.Input[str]] = None,
                 resource_id: Optional[pulumi.Input[str]] = None,
                 value: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = TagArgs.__new__(TagArgs)

            if key is None and not opts.urn:
                raise TypeError("Missing required property 'key'")
            __props__.__dict__["key"] = key
            if resource_id is None and not opts.urn:
                raise TypeError("Missing required property 'resource_id'")
            __props__.__dict__["resource_id"] = resource_id
            if value is None and not opts.urn:
                raise TypeError("Missing required property 'value'")
            __props__.__dict__["value"] = value
        super(Tag, __self__).__init__(
            'aws:ec2/tag:Tag',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            key: Optional[pulumi.Input[str]] = None,
            resource_id: Optional[pulumi.Input[str]] = None,
            value: Optional[pulumi.Input[str]] = None) -> 'Tag':
        """
        Get an existing Tag resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] key: The tag name.
        :param pulumi.Input[str] resource_id: The ID of the EC2 resource to manage the tag for.
        :param pulumi.Input[str] value: The value of the tag.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _TagState.__new__(_TagState)

        __props__.__dict__["key"] = key
        __props__.__dict__["resource_id"] = resource_id
        __props__.__dict__["value"] = value
        return Tag(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def key(self) -> pulumi.Output[str]:
        """
        The tag name.
        """
        return pulumi.get(self, "key")

    @property
    @pulumi.getter(name="resourceId")
    def resource_id(self) -> pulumi.Output[str]:
        """
        The ID of the EC2 resource to manage the tag for.
        """
        return pulumi.get(self, "resource_id")

    @property
    @pulumi.getter
    def value(self) -> pulumi.Output[str]:
        """
        The value of the tag.
        """
        return pulumi.get(self, "value")


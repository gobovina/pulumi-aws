# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['InternetGatewayAttachmentArgs', 'InternetGatewayAttachment']

@pulumi.input_type
class InternetGatewayAttachmentArgs:
    def __init__(__self__, *,
                 internet_gateway_id: pulumi.Input[str],
                 vpc_id: pulumi.Input[str]):
        """
        The set of arguments for constructing a InternetGatewayAttachment resource.
        :param pulumi.Input[str] internet_gateway_id: The ID of the internet gateway.
        :param pulumi.Input[str] vpc_id: The ID of the VPC.
        """
        pulumi.set(__self__, "internet_gateway_id", internet_gateway_id)
        pulumi.set(__self__, "vpc_id", vpc_id)

    @property
    @pulumi.getter(name="internetGatewayId")
    def internet_gateway_id(self) -> pulumi.Input[str]:
        """
        The ID of the internet gateway.
        """
        return pulumi.get(self, "internet_gateway_id")

    @internet_gateway_id.setter
    def internet_gateway_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "internet_gateway_id", value)

    @property
    @pulumi.getter(name="vpcId")
    def vpc_id(self) -> pulumi.Input[str]:
        """
        The ID of the VPC.
        """
        return pulumi.get(self, "vpc_id")

    @vpc_id.setter
    def vpc_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "vpc_id", value)


@pulumi.input_type
class _InternetGatewayAttachmentState:
    def __init__(__self__, *,
                 internet_gateway_id: Optional[pulumi.Input[str]] = None,
                 vpc_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering InternetGatewayAttachment resources.
        :param pulumi.Input[str] internet_gateway_id: The ID of the internet gateway.
        :param pulumi.Input[str] vpc_id: The ID of the VPC.
        """
        if internet_gateway_id is not None:
            pulumi.set(__self__, "internet_gateway_id", internet_gateway_id)
        if vpc_id is not None:
            pulumi.set(__self__, "vpc_id", vpc_id)

    @property
    @pulumi.getter(name="internetGatewayId")
    def internet_gateway_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the internet gateway.
        """
        return pulumi.get(self, "internet_gateway_id")

    @internet_gateway_id.setter
    def internet_gateway_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "internet_gateway_id", value)

    @property
    @pulumi.getter(name="vpcId")
    def vpc_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the VPC.
        """
        return pulumi.get(self, "vpc_id")

    @vpc_id.setter
    def vpc_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "vpc_id", value)


class InternetGatewayAttachment(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 internet_gateway_id: Optional[pulumi.Input[str]] = None,
                 vpc_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a resource to create a VPC Internet Gateway Attachment.

        ## Example Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_aws as aws

        example_vpc = aws.ec2.Vpc("example", cidr_block="10.1.0.0/16")
        example_internet_gateway = aws.ec2.InternetGateway("example")
        example = aws.ec2.InternetGatewayAttachment("example",
            internet_gateway_id=example_internet_gateway.id,
            vpc_id=example_vpc.id)
        ```
        <!--End PulumiCodeChooser -->

        ## Import

        Using `pulumi import`, import Internet Gateway Attachments using the `id`. For example:

        ```sh
        $ pulumi import aws:ec2/internetGatewayAttachment:InternetGatewayAttachment example igw-c0a643a9:vpc-123456
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] internet_gateway_id: The ID of the internet gateway.
        :param pulumi.Input[str] vpc_id: The ID of the VPC.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: InternetGatewayAttachmentArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a resource to create a VPC Internet Gateway Attachment.

        ## Example Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_aws as aws

        example_vpc = aws.ec2.Vpc("example", cidr_block="10.1.0.0/16")
        example_internet_gateway = aws.ec2.InternetGateway("example")
        example = aws.ec2.InternetGatewayAttachment("example",
            internet_gateway_id=example_internet_gateway.id,
            vpc_id=example_vpc.id)
        ```
        <!--End PulumiCodeChooser -->

        ## Import

        Using `pulumi import`, import Internet Gateway Attachments using the `id`. For example:

        ```sh
        $ pulumi import aws:ec2/internetGatewayAttachment:InternetGatewayAttachment example igw-c0a643a9:vpc-123456
        ```

        :param str resource_name: The name of the resource.
        :param InternetGatewayAttachmentArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(InternetGatewayAttachmentArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 internet_gateway_id: Optional[pulumi.Input[str]] = None,
                 vpc_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = InternetGatewayAttachmentArgs.__new__(InternetGatewayAttachmentArgs)

            if internet_gateway_id is None and not opts.urn:
                raise TypeError("Missing required property 'internet_gateway_id'")
            __props__.__dict__["internet_gateway_id"] = internet_gateway_id
            if vpc_id is None and not opts.urn:
                raise TypeError("Missing required property 'vpc_id'")
            __props__.__dict__["vpc_id"] = vpc_id
        super(InternetGatewayAttachment, __self__).__init__(
            'aws:ec2/internetGatewayAttachment:InternetGatewayAttachment',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            internet_gateway_id: Optional[pulumi.Input[str]] = None,
            vpc_id: Optional[pulumi.Input[str]] = None) -> 'InternetGatewayAttachment':
        """
        Get an existing InternetGatewayAttachment resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] internet_gateway_id: The ID of the internet gateway.
        :param pulumi.Input[str] vpc_id: The ID of the VPC.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _InternetGatewayAttachmentState.__new__(_InternetGatewayAttachmentState)

        __props__.__dict__["internet_gateway_id"] = internet_gateway_id
        __props__.__dict__["vpc_id"] = vpc_id
        return InternetGatewayAttachment(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="internetGatewayId")
    def internet_gateway_id(self) -> pulumi.Output[str]:
        """
        The ID of the internet gateway.
        """
        return pulumi.get(self, "internet_gateway_id")

    @property
    @pulumi.getter(name="vpcId")
    def vpc_id(self) -> pulumi.Output[str]:
        """
        The ID of the VPC.
        """
        return pulumi.get(self, "vpc_id")


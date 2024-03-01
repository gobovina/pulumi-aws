# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities
from . import outputs
from ._inputs import *

__all__ = ['ContactChannelArgs', 'ContactChannel']

@pulumi.input_type
class ContactChannelArgs:
    def __init__(__self__, *,
                 contact_id: pulumi.Input[str],
                 delivery_address: pulumi.Input['ContactChannelDeliveryAddressArgs'],
                 type: pulumi.Input[str],
                 name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a ContactChannel resource.
        :param pulumi.Input[str] contact_id: Amazon Resource Name (ARN) of the AWS SSM Contact that the contact channel belongs to.
        :param pulumi.Input['ContactChannelDeliveryAddressArgs'] delivery_address: Block that contains contact engagement details. See details below.
        :param pulumi.Input[str] type: Type of the contact channel. One of `SMS`, `VOICE` or `EMAIL`.
        :param pulumi.Input[str] name: Name of the contact channel. Must be between 1 and 255 characters, and may contain alphanumerics, underscores (`_`), hyphens (`-`), periods (`.`), and spaces.
        """
        pulumi.set(__self__, "contact_id", contact_id)
        pulumi.set(__self__, "delivery_address", delivery_address)
        pulumi.set(__self__, "type", type)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter(name="contactId")
    def contact_id(self) -> pulumi.Input[str]:
        """
        Amazon Resource Name (ARN) of the AWS SSM Contact that the contact channel belongs to.
        """
        return pulumi.get(self, "contact_id")

    @contact_id.setter
    def contact_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "contact_id", value)

    @property
    @pulumi.getter(name="deliveryAddress")
    def delivery_address(self) -> pulumi.Input['ContactChannelDeliveryAddressArgs']:
        """
        Block that contains contact engagement details. See details below.
        """
        return pulumi.get(self, "delivery_address")

    @delivery_address.setter
    def delivery_address(self, value: pulumi.Input['ContactChannelDeliveryAddressArgs']):
        pulumi.set(self, "delivery_address", value)

    @property
    @pulumi.getter
    def type(self) -> pulumi.Input[str]:
        """
        Type of the contact channel. One of `SMS`, `VOICE` or `EMAIL`.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: pulumi.Input[str]):
        pulumi.set(self, "type", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the contact channel. Must be between 1 and 255 characters, and may contain alphanumerics, underscores (`_`), hyphens (`-`), periods (`.`), and spaces.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _ContactChannelState:
    def __init__(__self__, *,
                 activation_status: Optional[pulumi.Input[str]] = None,
                 arn: Optional[pulumi.Input[str]] = None,
                 contact_id: Optional[pulumi.Input[str]] = None,
                 delivery_address: Optional[pulumi.Input['ContactChannelDeliveryAddressArgs']] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering ContactChannel resources.
        :param pulumi.Input[str] activation_status: Whether the contact channel is activated. The contact channel must be activated to use it to engage the contact. One of `ACTIVATED` or `NOT_ACTIVATED`.
        :param pulumi.Input[str] arn: Amazon Resource Name (ARN) of the contact channel.
        :param pulumi.Input[str] contact_id: Amazon Resource Name (ARN) of the AWS SSM Contact that the contact channel belongs to.
        :param pulumi.Input['ContactChannelDeliveryAddressArgs'] delivery_address: Block that contains contact engagement details. See details below.
        :param pulumi.Input[str] name: Name of the contact channel. Must be between 1 and 255 characters, and may contain alphanumerics, underscores (`_`), hyphens (`-`), periods (`.`), and spaces.
        :param pulumi.Input[str] type: Type of the contact channel. One of `SMS`, `VOICE` or `EMAIL`.
        """
        if activation_status is not None:
            pulumi.set(__self__, "activation_status", activation_status)
        if arn is not None:
            pulumi.set(__self__, "arn", arn)
        if contact_id is not None:
            pulumi.set(__self__, "contact_id", contact_id)
        if delivery_address is not None:
            pulumi.set(__self__, "delivery_address", delivery_address)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if type is not None:
            pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter(name="activationStatus")
    def activation_status(self) -> Optional[pulumi.Input[str]]:
        """
        Whether the contact channel is activated. The contact channel must be activated to use it to engage the contact. One of `ACTIVATED` or `NOT_ACTIVATED`.
        """
        return pulumi.get(self, "activation_status")

    @activation_status.setter
    def activation_status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "activation_status", value)

    @property
    @pulumi.getter
    def arn(self) -> Optional[pulumi.Input[str]]:
        """
        Amazon Resource Name (ARN) of the contact channel.
        """
        return pulumi.get(self, "arn")

    @arn.setter
    def arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "arn", value)

    @property
    @pulumi.getter(name="contactId")
    def contact_id(self) -> Optional[pulumi.Input[str]]:
        """
        Amazon Resource Name (ARN) of the AWS SSM Contact that the contact channel belongs to.
        """
        return pulumi.get(self, "contact_id")

    @contact_id.setter
    def contact_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "contact_id", value)

    @property
    @pulumi.getter(name="deliveryAddress")
    def delivery_address(self) -> Optional[pulumi.Input['ContactChannelDeliveryAddressArgs']]:
        """
        Block that contains contact engagement details. See details below.
        """
        return pulumi.get(self, "delivery_address")

    @delivery_address.setter
    def delivery_address(self, value: Optional[pulumi.Input['ContactChannelDeliveryAddressArgs']]):
        pulumi.set(self, "delivery_address", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the contact channel. Must be between 1 and 255 characters, and may contain alphanumerics, underscores (`_`), hyphens (`-`), periods (`.`), and spaces.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[str]]:
        """
        Type of the contact channel. One of `SMS`, `VOICE` or `EMAIL`.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "type", value)


class ContactChannel(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 contact_id: Optional[pulumi.Input[str]] = None,
                 delivery_address: Optional[pulumi.Input[pulumi.InputType['ContactChannelDeliveryAddressArgs']]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Resource for managing an AWS SSM Contacts Contact Channel.

        ## Example Usage
        ### Basic Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.ssmcontacts.ContactChannel("example",
            contact_id="arn:aws:ssm-contacts:us-west-2:123456789012:contact/contactalias",
            delivery_address=aws.ssmcontacts.ContactChannelDeliveryAddressArgs(
                simple_address="email@example.com",
            ),
            name="Example contact channel",
            type="EMAIL")
        ```
        ### Usage with SSM Contact

        ```python
        import pulumi
        import pulumi_aws as aws

        example_contact = aws.ssmcontacts.Contact("example_contact",
            alias="example_contact",
            type="PERSONAL")
        example = aws.ssmcontacts.ContactChannel("example",
            contact_id=example_contact.arn,
            delivery_address=aws.ssmcontacts.ContactChannelDeliveryAddressArgs(
                simple_address="email@example.com",
            ),
            name="Example contact channel",
            type="EMAIL")
        ```

        ## Import

        Using `pulumi import`, import SSM Contact Channel using the `ARN`. For example:

        ```sh
         $ pulumi import aws:ssmcontacts/contactChannel:ContactChannel example arn:aws:ssm-contacts:us-west-2:123456789012:contact-channel/example
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] contact_id: Amazon Resource Name (ARN) of the AWS SSM Contact that the contact channel belongs to.
        :param pulumi.Input[pulumi.InputType['ContactChannelDeliveryAddressArgs']] delivery_address: Block that contains contact engagement details. See details below.
        :param pulumi.Input[str] name: Name of the contact channel. Must be between 1 and 255 characters, and may contain alphanumerics, underscores (`_`), hyphens (`-`), periods (`.`), and spaces.
        :param pulumi.Input[str] type: Type of the contact channel. One of `SMS`, `VOICE` or `EMAIL`.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ContactChannelArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Resource for managing an AWS SSM Contacts Contact Channel.

        ## Example Usage
        ### Basic Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.ssmcontacts.ContactChannel("example",
            contact_id="arn:aws:ssm-contacts:us-west-2:123456789012:contact/contactalias",
            delivery_address=aws.ssmcontacts.ContactChannelDeliveryAddressArgs(
                simple_address="email@example.com",
            ),
            name="Example contact channel",
            type="EMAIL")
        ```
        ### Usage with SSM Contact

        ```python
        import pulumi
        import pulumi_aws as aws

        example_contact = aws.ssmcontacts.Contact("example_contact",
            alias="example_contact",
            type="PERSONAL")
        example = aws.ssmcontacts.ContactChannel("example",
            contact_id=example_contact.arn,
            delivery_address=aws.ssmcontacts.ContactChannelDeliveryAddressArgs(
                simple_address="email@example.com",
            ),
            name="Example contact channel",
            type="EMAIL")
        ```

        ## Import

        Using `pulumi import`, import SSM Contact Channel using the `ARN`. For example:

        ```sh
         $ pulumi import aws:ssmcontacts/contactChannel:ContactChannel example arn:aws:ssm-contacts:us-west-2:123456789012:contact-channel/example
        ```

        :param str resource_name: The name of the resource.
        :param ContactChannelArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ContactChannelArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 contact_id: Optional[pulumi.Input[str]] = None,
                 delivery_address: Optional[pulumi.Input[pulumi.InputType['ContactChannelDeliveryAddressArgs']]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ContactChannelArgs.__new__(ContactChannelArgs)

            if contact_id is None and not opts.urn:
                raise TypeError("Missing required property 'contact_id'")
            __props__.__dict__["contact_id"] = contact_id
            if delivery_address is None and not opts.urn:
                raise TypeError("Missing required property 'delivery_address'")
            __props__.__dict__["delivery_address"] = delivery_address
            __props__.__dict__["name"] = name
            if type is None and not opts.urn:
                raise TypeError("Missing required property 'type'")
            __props__.__dict__["type"] = type
            __props__.__dict__["activation_status"] = None
            __props__.__dict__["arn"] = None
        super(ContactChannel, __self__).__init__(
            'aws:ssmcontacts/contactChannel:ContactChannel',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            activation_status: Optional[pulumi.Input[str]] = None,
            arn: Optional[pulumi.Input[str]] = None,
            contact_id: Optional[pulumi.Input[str]] = None,
            delivery_address: Optional[pulumi.Input[pulumi.InputType['ContactChannelDeliveryAddressArgs']]] = None,
            name: Optional[pulumi.Input[str]] = None,
            type: Optional[pulumi.Input[str]] = None) -> 'ContactChannel':
        """
        Get an existing ContactChannel resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] activation_status: Whether the contact channel is activated. The contact channel must be activated to use it to engage the contact. One of `ACTIVATED` or `NOT_ACTIVATED`.
        :param pulumi.Input[str] arn: Amazon Resource Name (ARN) of the contact channel.
        :param pulumi.Input[str] contact_id: Amazon Resource Name (ARN) of the AWS SSM Contact that the contact channel belongs to.
        :param pulumi.Input[pulumi.InputType['ContactChannelDeliveryAddressArgs']] delivery_address: Block that contains contact engagement details. See details below.
        :param pulumi.Input[str] name: Name of the contact channel. Must be between 1 and 255 characters, and may contain alphanumerics, underscores (`_`), hyphens (`-`), periods (`.`), and spaces.
        :param pulumi.Input[str] type: Type of the contact channel. One of `SMS`, `VOICE` or `EMAIL`.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ContactChannelState.__new__(_ContactChannelState)

        __props__.__dict__["activation_status"] = activation_status
        __props__.__dict__["arn"] = arn
        __props__.__dict__["contact_id"] = contact_id
        __props__.__dict__["delivery_address"] = delivery_address
        __props__.__dict__["name"] = name
        __props__.__dict__["type"] = type
        return ContactChannel(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="activationStatus")
    def activation_status(self) -> pulumi.Output[str]:
        """
        Whether the contact channel is activated. The contact channel must be activated to use it to engage the contact. One of `ACTIVATED` or `NOT_ACTIVATED`.
        """
        return pulumi.get(self, "activation_status")

    @property
    @pulumi.getter
    def arn(self) -> pulumi.Output[str]:
        """
        Amazon Resource Name (ARN) of the contact channel.
        """
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter(name="contactId")
    def contact_id(self) -> pulumi.Output[str]:
        """
        Amazon Resource Name (ARN) of the AWS SSM Contact that the contact channel belongs to.
        """
        return pulumi.get(self, "contact_id")

    @property
    @pulumi.getter(name="deliveryAddress")
    def delivery_address(self) -> pulumi.Output['outputs.ContactChannelDeliveryAddress']:
        """
        Block that contains contact engagement details. See details below.
        """
        return pulumi.get(self, "delivery_address")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Name of the contact channel. Must be between 1 and 255 characters, and may contain alphanumerics, underscores (`_`), hyphens (`-`), periods (`.`), and spaces.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def type(self) -> pulumi.Output[str]:
        """
        Type of the contact channel. One of `SMS`, `VOICE` or `EMAIL`.
        """
        return pulumi.get(self, "type")


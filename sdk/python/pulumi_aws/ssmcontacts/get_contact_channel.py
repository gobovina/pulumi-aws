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
from . import outputs

__all__ = [
    'GetContactChannelResult',
    'AwaitableGetContactChannelResult',
    'get_contact_channel',
    'get_contact_channel_output',
]

@pulumi.output_type
class GetContactChannelResult:
    """
    A collection of values returned by getContactChannel.
    """
    def __init__(__self__, activation_status=None, arn=None, contact_id=None, delivery_addresses=None, id=None, name=None, type=None):
        if activation_status and not isinstance(activation_status, str):
            raise TypeError("Expected argument 'activation_status' to be a str")
        pulumi.set(__self__, "activation_status", activation_status)
        if arn and not isinstance(arn, str):
            raise TypeError("Expected argument 'arn' to be a str")
        pulumi.set(__self__, "arn", arn)
        if contact_id and not isinstance(contact_id, str):
            raise TypeError("Expected argument 'contact_id' to be a str")
        pulumi.set(__self__, "contact_id", contact_id)
        if delivery_addresses and not isinstance(delivery_addresses, list):
            raise TypeError("Expected argument 'delivery_addresses' to be a list")
        pulumi.set(__self__, "delivery_addresses", delivery_addresses)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if type and not isinstance(type, str):
            raise TypeError("Expected argument 'type' to be a str")
        pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter(name="activationStatus")
    def activation_status(self) -> str:
        """
        Whether the contact channel is activated.
        """
        return pulumi.get(self, "activation_status")

    @property
    @pulumi.getter
    def arn(self) -> str:
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter(name="contactId")
    def contact_id(self) -> str:
        """
        Amazon Resource Name (ARN) of the AWS SSM Contact that the contact channel belongs to.
        """
        return pulumi.get(self, "contact_id")

    @property
    @pulumi.getter(name="deliveryAddresses")
    def delivery_addresses(self) -> Sequence['outputs.GetContactChannelDeliveryAddressResult']:
        """
        Details used to engage the contact channel.
        """
        return pulumi.get(self, "delivery_addresses")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        Name of the contact channel.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def type(self) -> str:
        """
        Type of the contact channel.
        """
        return pulumi.get(self, "type")


class AwaitableGetContactChannelResult(GetContactChannelResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetContactChannelResult(
            activation_status=self.activation_status,
            arn=self.arn,
            contact_id=self.contact_id,
            delivery_addresses=self.delivery_addresses,
            id=self.id,
            name=self.name,
            type=self.type)


def get_contact_channel(arn: Optional[str] = None,
                        opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetContactChannelResult:
    """
    Data source for managing an AWS SSM Contacts Contact Channel.

    ## Example Usage

    ### Basic Usage

    ```python
    import pulumi
    import pulumi_aws as aws

    example = aws.ssmcontacts.get_contact_channel(arn="arn:aws:ssm-contacts:us-west-2:123456789012:contact-channel/example")
    ```


    :param str arn: Amazon Resource Name (ARN) of the contact channel.
    """
    __args__ = dict()
    __args__['arn'] = arn
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('aws:ssmcontacts/getContactChannel:getContactChannel', __args__, opts=opts, typ=GetContactChannelResult).value

    return AwaitableGetContactChannelResult(
        activation_status=pulumi.get(__ret__, 'activation_status'),
        arn=pulumi.get(__ret__, 'arn'),
        contact_id=pulumi.get(__ret__, 'contact_id'),
        delivery_addresses=pulumi.get(__ret__, 'delivery_addresses'),
        id=pulumi.get(__ret__, 'id'),
        name=pulumi.get(__ret__, 'name'),
        type=pulumi.get(__ret__, 'type'))


@_utilities.lift_output_func(get_contact_channel)
def get_contact_channel_output(arn: Optional[pulumi.Input[str]] = None,
                               opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetContactChannelResult]:
    """
    Data source for managing an AWS SSM Contacts Contact Channel.

    ## Example Usage

    ### Basic Usage

    ```python
    import pulumi
    import pulumi_aws as aws

    example = aws.ssmcontacts.get_contact_channel(arn="arn:aws:ssm-contacts:us-west-2:123456789012:contact-channel/example")
    ```


    :param str arn: Amazon Resource Name (ARN) of the contact channel.
    """
    ...

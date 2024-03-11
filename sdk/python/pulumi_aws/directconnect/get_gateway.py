# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = [
    'GetGatewayResult',
    'AwaitableGetGatewayResult',
    'get_gateway',
    'get_gateway_output',
]

@pulumi.output_type
class GetGatewayResult:
    """
    A collection of values returned by getGateway.
    """
    def __init__(__self__, amazon_side_asn=None, id=None, name=None, owner_account_id=None):
        if amazon_side_asn and not isinstance(amazon_side_asn, str):
            raise TypeError("Expected argument 'amazon_side_asn' to be a str")
        pulumi.set(__self__, "amazon_side_asn", amazon_side_asn)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if owner_account_id and not isinstance(owner_account_id, str):
            raise TypeError("Expected argument 'owner_account_id' to be a str")
        pulumi.set(__self__, "owner_account_id", owner_account_id)

    @property
    @pulumi.getter(name="amazonSideAsn")
    def amazon_side_asn(self) -> str:
        """
        ASN on the Amazon side of the connection.
        """
        return pulumi.get(self, "amazon_side_asn")

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
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="ownerAccountId")
    def owner_account_id(self) -> str:
        """
        AWS Account ID of the gateway.
        """
        return pulumi.get(self, "owner_account_id")


class AwaitableGetGatewayResult(GetGatewayResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetGatewayResult(
            amazon_side_asn=self.amazon_side_asn,
            id=self.id,
            name=self.name,
            owner_account_id=self.owner_account_id)


def get_gateway(name: Optional[str] = None,
                opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetGatewayResult:
    """
    Retrieve information about a Direct Connect Gateway.

    ## Example Usage

    <!--Start PulumiCodeChooser -->
    ```python
    import pulumi
    import pulumi_aws as aws

    example = aws.directconnect.get_gateway(name="example")
    ```
    <!--End PulumiCodeChooser -->


    :param str name: Name of the gateway to retrieve.
    """
    __args__ = dict()
    __args__['name'] = name
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('aws:directconnect/getGateway:getGateway', __args__, opts=opts, typ=GetGatewayResult).value

    return AwaitableGetGatewayResult(
        amazon_side_asn=pulumi.get(__ret__, 'amazon_side_asn'),
        id=pulumi.get(__ret__, 'id'),
        name=pulumi.get(__ret__, 'name'),
        owner_account_id=pulumi.get(__ret__, 'owner_account_id'))


@_utilities.lift_output_func(get_gateway)
def get_gateway_output(name: Optional[pulumi.Input[str]] = None,
                       opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetGatewayResult]:
    """
    Retrieve information about a Direct Connect Gateway.

    ## Example Usage

    <!--Start PulumiCodeChooser -->
    ```python
    import pulumi
    import pulumi_aws as aws

    example = aws.directconnect.get_gateway(name="example")
    ```
    <!--End PulumiCodeChooser -->


    :param str name: Name of the gateway to retrieve.
    """
    ...

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

__all__ = [
    'GetDelegationSetResult',
    'AwaitableGetDelegationSetResult',
    'get_delegation_set',
    'get_delegation_set_output',
]

@pulumi.output_type
class GetDelegationSetResult:
    """
    A collection of values returned by getDelegationSet.
    """
    def __init__(__self__, arn=None, caller_reference=None, id=None, name_servers=None):
        if arn and not isinstance(arn, str):
            raise TypeError("Expected argument 'arn' to be a str")
        pulumi.set(__self__, "arn", arn)
        if caller_reference and not isinstance(caller_reference, str):
            raise TypeError("Expected argument 'caller_reference' to be a str")
        pulumi.set(__self__, "caller_reference", caller_reference)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if name_servers and not isinstance(name_servers, list):
            raise TypeError("Expected argument 'name_servers' to be a list")
        pulumi.set(__self__, "name_servers", name_servers)

    @property
    @pulumi.getter
    def arn(self) -> str:
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter(name="callerReference")
    def caller_reference(self) -> str:
        return pulumi.get(self, "caller_reference")

    @property
    @pulumi.getter
    def id(self) -> str:
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="nameServers")
    def name_servers(self) -> Sequence[str]:
        return pulumi.get(self, "name_servers")


class AwaitableGetDelegationSetResult(GetDelegationSetResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetDelegationSetResult(
            arn=self.arn,
            caller_reference=self.caller_reference,
            id=self.id,
            name_servers=self.name_servers)


def get_delegation_set(id: Optional[str] = None,
                       opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetDelegationSetResult:
    """
    `route53.DelegationSet` provides details about a specific Route 53 Delegation Set.

    This data source allows to find a list of name servers associated with a specific delegation set.

    ## Example Usage

    The following example shows how to get a delegation set from its id.

    ```python
    import pulumi
    import pulumi_aws as aws

    dset = aws.route53.get_delegation_set(id="MQWGHCBFAKEID")
    ```


    :param str id: Delegation set ID.
           
           The following attribute is additionally exported:
    """
    __args__ = dict()
    __args__['id'] = id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('aws:route53/getDelegationSet:getDelegationSet', __args__, opts=opts, typ=GetDelegationSetResult).value

    return AwaitableGetDelegationSetResult(
        arn=pulumi.get(__ret__, 'arn'),
        caller_reference=pulumi.get(__ret__, 'caller_reference'),
        id=pulumi.get(__ret__, 'id'),
        name_servers=pulumi.get(__ret__, 'name_servers'))


@_utilities.lift_output_func(get_delegation_set)
def get_delegation_set_output(id: Optional[pulumi.Input[str]] = None,
                              opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetDelegationSetResult]:
    """
    `route53.DelegationSet` provides details about a specific Route 53 Delegation Set.

    This data source allows to find a list of name servers associated with a specific delegation set.

    ## Example Usage

    The following example shows how to get a delegation set from its id.

    ```python
    import pulumi
    import pulumi_aws as aws

    dset = aws.route53.get_delegation_set(id="MQWGHCBFAKEID")
    ```


    :param str id: Delegation set ID.
           
           The following attribute is additionally exported:
    """
    ...

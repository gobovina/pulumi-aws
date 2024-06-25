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
    'GetFirewallPolicyResult',
    'AwaitableGetFirewallPolicyResult',
    'get_firewall_policy',
    'get_firewall_policy_output',
]

@pulumi.output_type
class GetFirewallPolicyResult:
    """
    A collection of values returned by getFirewallPolicy.
    """
    def __init__(__self__, arn=None, description=None, firewall_policies=None, id=None, name=None, tags=None, update_token=None):
        if arn and not isinstance(arn, str):
            raise TypeError("Expected argument 'arn' to be a str")
        pulumi.set(__self__, "arn", arn)
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if firewall_policies and not isinstance(firewall_policies, list):
            raise TypeError("Expected argument 'firewall_policies' to be a list")
        pulumi.set(__self__, "firewall_policies", firewall_policies)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if tags and not isinstance(tags, dict):
            raise TypeError("Expected argument 'tags' to be a dict")
        pulumi.set(__self__, "tags", tags)
        if update_token and not isinstance(update_token, str):
            raise TypeError("Expected argument 'update_token' to be a str")
        pulumi.set(__self__, "update_token", update_token)

    @property
    @pulumi.getter
    def arn(self) -> Optional[str]:
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter
    def description(self) -> str:
        """
        Description of the firewall policy.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="firewallPolicies")
    def firewall_policies(self) -> Sequence['outputs.GetFirewallPolicyFirewallPolicyResult']:
        """
        The [policy][2] for the specified firewall policy.
        """
        return pulumi.get(self, "firewall_policies")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def name(self) -> Optional[str]:
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def tags(self) -> Mapping[str, str]:
        """
        Key-value tags for the firewall policy.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter(name="updateToken")
    def update_token(self) -> str:
        """
        Token used for optimistic locking.
        """
        return pulumi.get(self, "update_token")


class AwaitableGetFirewallPolicyResult(GetFirewallPolicyResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetFirewallPolicyResult(
            arn=self.arn,
            description=self.description,
            firewall_policies=self.firewall_policies,
            id=self.id,
            name=self.name,
            tags=self.tags,
            update_token=self.update_token)


def get_firewall_policy(arn: Optional[str] = None,
                        name: Optional[str] = None,
                        tags: Optional[Mapping[str, str]] = None,
                        opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetFirewallPolicyResult:
    """
    Retrieve information about a firewall policy.

    ## Example Usage

    ### Find firewall policy by name

    ```python
    import pulumi
    import pulumi_aws as aws

    example = aws.networkfirewall.get_firewall_policy(name=firewall_policy_name)
    ```

    ### Find firewall policy by ARN

    ```python
    import pulumi
    import pulumi_aws as aws

    example = aws.networkfirewall.get_firewall_policy(arn=firewall_policy_arn)
    ```

    ### Find firewall policy by name and ARN

    ```python
    import pulumi
    import pulumi_aws as aws

    example = aws.networkfirewall.get_firewall_policy(arn=firewall_policy_arn,
        name=firewall_policy_name)
    ```

    AWS Network Firewall does not allow multiple firewall policies with the same name to be created in an account. It is possible, however, to have multiple firewall policies available in a single account with identical `name` values but distinct `arn` values, e.g. firewall policies shared via a [Resource Access Manager (RAM) share][1]. In that case specifying `arn`, or `name` and `arn`, is recommended.

    > **Note:** If there are multiple firewall policies in an account with the same `name`, and `arn` is not specified, the default behavior will return the firewall policy with `name` that was created in the account.


    :param str arn: ARN of the firewall policy.
    :param str name: Descriptive name of the firewall policy.
    :param Mapping[str, str] tags: Key-value tags for the firewall policy.
    """
    __args__ = dict()
    __args__['arn'] = arn
    __args__['name'] = name
    __args__['tags'] = tags
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('aws:networkfirewall/getFirewallPolicy:getFirewallPolicy', __args__, opts=opts, typ=GetFirewallPolicyResult).value

    return AwaitableGetFirewallPolicyResult(
        arn=pulumi.get(__ret__, 'arn'),
        description=pulumi.get(__ret__, 'description'),
        firewall_policies=pulumi.get(__ret__, 'firewall_policies'),
        id=pulumi.get(__ret__, 'id'),
        name=pulumi.get(__ret__, 'name'),
        tags=pulumi.get(__ret__, 'tags'),
        update_token=pulumi.get(__ret__, 'update_token'))


@_utilities.lift_output_func(get_firewall_policy)
def get_firewall_policy_output(arn: Optional[pulumi.Input[Optional[str]]] = None,
                               name: Optional[pulumi.Input[Optional[str]]] = None,
                               tags: Optional[pulumi.Input[Optional[Mapping[str, str]]]] = None,
                               opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetFirewallPolicyResult]:
    """
    Retrieve information about a firewall policy.

    ## Example Usage

    ### Find firewall policy by name

    ```python
    import pulumi
    import pulumi_aws as aws

    example = aws.networkfirewall.get_firewall_policy(name=firewall_policy_name)
    ```

    ### Find firewall policy by ARN

    ```python
    import pulumi
    import pulumi_aws as aws

    example = aws.networkfirewall.get_firewall_policy(arn=firewall_policy_arn)
    ```

    ### Find firewall policy by name and ARN

    ```python
    import pulumi
    import pulumi_aws as aws

    example = aws.networkfirewall.get_firewall_policy(arn=firewall_policy_arn,
        name=firewall_policy_name)
    ```

    AWS Network Firewall does not allow multiple firewall policies with the same name to be created in an account. It is possible, however, to have multiple firewall policies available in a single account with identical `name` values but distinct `arn` values, e.g. firewall policies shared via a [Resource Access Manager (RAM) share][1]. In that case specifying `arn`, or `name` and `arn`, is recommended.

    > **Note:** If there are multiple firewall policies in an account with the same `name`, and `arn` is not specified, the default behavior will return the firewall policy with `name` that was created in the account.


    :param str arn: ARN of the firewall policy.
    :param str name: Descriptive name of the firewall policy.
    :param Mapping[str, str] tags: Key-value tags for the firewall policy.
    """
    ...

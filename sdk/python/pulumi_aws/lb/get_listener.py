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
    'GetListenerResult',
    'AwaitableGetListenerResult',
    'get_listener',
    'get_listener_output',
]

@pulumi.output_type
class GetListenerResult:
    """
    A collection of values returned by getListener.
    """
    def __init__(__self__, alpn_policy=None, arn=None, certificate_arn=None, default_actions=None, id=None, load_balancer_arn=None, mutual_authentications=None, port=None, protocol=None, ssl_policy=None, tags=None):
        if alpn_policy and not isinstance(alpn_policy, str):
            raise TypeError("Expected argument 'alpn_policy' to be a str")
        pulumi.set(__self__, "alpn_policy", alpn_policy)
        if arn and not isinstance(arn, str):
            raise TypeError("Expected argument 'arn' to be a str")
        pulumi.set(__self__, "arn", arn)
        if certificate_arn and not isinstance(certificate_arn, str):
            raise TypeError("Expected argument 'certificate_arn' to be a str")
        pulumi.set(__self__, "certificate_arn", certificate_arn)
        if default_actions and not isinstance(default_actions, list):
            raise TypeError("Expected argument 'default_actions' to be a list")
        pulumi.set(__self__, "default_actions", default_actions)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if load_balancer_arn and not isinstance(load_balancer_arn, str):
            raise TypeError("Expected argument 'load_balancer_arn' to be a str")
        pulumi.set(__self__, "load_balancer_arn", load_balancer_arn)
        if mutual_authentications and not isinstance(mutual_authentications, list):
            raise TypeError("Expected argument 'mutual_authentications' to be a list")
        pulumi.set(__self__, "mutual_authentications", mutual_authentications)
        if port and not isinstance(port, int):
            raise TypeError("Expected argument 'port' to be a int")
        pulumi.set(__self__, "port", port)
        if protocol and not isinstance(protocol, str):
            raise TypeError("Expected argument 'protocol' to be a str")
        pulumi.set(__self__, "protocol", protocol)
        if ssl_policy and not isinstance(ssl_policy, str):
            raise TypeError("Expected argument 'ssl_policy' to be a str")
        pulumi.set(__self__, "ssl_policy", ssl_policy)
        if tags and not isinstance(tags, dict):
            raise TypeError("Expected argument 'tags' to be a dict")
        pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter(name="alpnPolicy")
    def alpn_policy(self) -> str:
        return pulumi.get(self, "alpn_policy")

    @property
    @pulumi.getter
    def arn(self) -> str:
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter(name="certificateArn")
    def certificate_arn(self) -> str:
        return pulumi.get(self, "certificate_arn")

    @property
    @pulumi.getter(name="defaultActions")
    def default_actions(self) -> Sequence['outputs.GetListenerDefaultActionResult']:
        return pulumi.get(self, "default_actions")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="loadBalancerArn")
    def load_balancer_arn(self) -> str:
        return pulumi.get(self, "load_balancer_arn")

    @property
    @pulumi.getter(name="mutualAuthentications")
    def mutual_authentications(self) -> Sequence['outputs.GetListenerMutualAuthenticationResult']:
        return pulumi.get(self, "mutual_authentications")

    @property
    @pulumi.getter
    def port(self) -> int:
        return pulumi.get(self, "port")

    @property
    @pulumi.getter
    def protocol(self) -> str:
        return pulumi.get(self, "protocol")

    @property
    @pulumi.getter(name="sslPolicy")
    def ssl_policy(self) -> str:
        return pulumi.get(self, "ssl_policy")

    @property
    @pulumi.getter
    def tags(self) -> Mapping[str, str]:
        return pulumi.get(self, "tags")


class AwaitableGetListenerResult(GetListenerResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetListenerResult(
            alpn_policy=self.alpn_policy,
            arn=self.arn,
            certificate_arn=self.certificate_arn,
            default_actions=self.default_actions,
            id=self.id,
            load_balancer_arn=self.load_balancer_arn,
            mutual_authentications=self.mutual_authentications,
            port=self.port,
            protocol=self.protocol,
            ssl_policy=self.ssl_policy,
            tags=self.tags)


def get_listener(arn: Optional[str] = None,
                 load_balancer_arn: Optional[str] = None,
                 port: Optional[int] = None,
                 tags: Optional[Mapping[str, str]] = None,
                 opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetListenerResult:
    """
    > **Note:** `alb.Listener` is known as `lb.Listener`. The functionality is identical.

    Provides information about a Load Balancer Listener.

    This data source can prove useful when a module accepts an LB Listener as an input variable and needs to know the LB it is attached to, or other information specific to the listener in question.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_aws as aws

    config = pulumi.Config()
    listener_arn = config.require("listenerArn")
    listener = aws.lb.get_listener(arn=listener_arn)
    # get listener from load_balancer_arn and port
    selected = aws.lb.get_load_balancer(name="default-public")
    selected443 = aws.lb.get_listener(load_balancer_arn=selected.arn,
        port=443)
    ```


    :param str arn: ARN of the listener. Required if `load_balancer_arn` and `port` is not set.
    :param str load_balancer_arn: ARN of the load balancer. Required if `arn` is not set.
    :param int port: Port of the listener. Required if `arn` is not set.
    """
    __args__ = dict()
    __args__['arn'] = arn
    __args__['loadBalancerArn'] = load_balancer_arn
    __args__['port'] = port
    __args__['tags'] = tags
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('aws:lb/getListener:getListener', __args__, opts=opts, typ=GetListenerResult).value

    return AwaitableGetListenerResult(
        alpn_policy=pulumi.get(__ret__, 'alpn_policy'),
        arn=pulumi.get(__ret__, 'arn'),
        certificate_arn=pulumi.get(__ret__, 'certificate_arn'),
        default_actions=pulumi.get(__ret__, 'default_actions'),
        id=pulumi.get(__ret__, 'id'),
        load_balancer_arn=pulumi.get(__ret__, 'load_balancer_arn'),
        mutual_authentications=pulumi.get(__ret__, 'mutual_authentications'),
        port=pulumi.get(__ret__, 'port'),
        protocol=pulumi.get(__ret__, 'protocol'),
        ssl_policy=pulumi.get(__ret__, 'ssl_policy'),
        tags=pulumi.get(__ret__, 'tags'))


@_utilities.lift_output_func(get_listener)
def get_listener_output(arn: Optional[pulumi.Input[Optional[str]]] = None,
                        load_balancer_arn: Optional[pulumi.Input[Optional[str]]] = None,
                        port: Optional[pulumi.Input[Optional[int]]] = None,
                        tags: Optional[pulumi.Input[Optional[Mapping[str, str]]]] = None,
                        opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetListenerResult]:
    """
    > **Note:** `alb.Listener` is known as `lb.Listener`. The functionality is identical.

    Provides information about a Load Balancer Listener.

    This data source can prove useful when a module accepts an LB Listener as an input variable and needs to know the LB it is attached to, or other information specific to the listener in question.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_aws as aws

    config = pulumi.Config()
    listener_arn = config.require("listenerArn")
    listener = aws.lb.get_listener(arn=listener_arn)
    # get listener from load_balancer_arn and port
    selected = aws.lb.get_load_balancer(name="default-public")
    selected443 = aws.lb.get_listener(load_balancer_arn=selected.arn,
        port=443)
    ```


    :param str arn: ARN of the listener. Required if `load_balancer_arn` and `port` is not set.
    :param str load_balancer_arn: ARN of the load balancer. Required if `arn` is not set.
    :param int port: Port of the listener. Required if `arn` is not set.
    """
    ...

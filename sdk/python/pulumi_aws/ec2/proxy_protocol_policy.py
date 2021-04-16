# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['ProxyProtocolPolicyArgs', 'ProxyProtocolPolicy']

@pulumi.input_type
class ProxyProtocolPolicyArgs:
    def __init__(__self__, *,
                 instance_ports: pulumi.Input[Sequence[pulumi.Input[str]]],
                 load_balancer: pulumi.Input[str]):
        """
        The set of arguments for constructing a ProxyProtocolPolicy resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] instance_ports: List of instance ports to which the policy
               should be applied. This can be specified if the protocol is SSL or TCP.
        :param pulumi.Input[str] load_balancer: The load balancer to which the policy
               should be attached.
        """
        pulumi.set(__self__, "instance_ports", instance_ports)
        pulumi.set(__self__, "load_balancer", load_balancer)

    @property
    @pulumi.getter(name="instancePorts")
    def instance_ports(self) -> pulumi.Input[Sequence[pulumi.Input[str]]]:
        """
        List of instance ports to which the policy
        should be applied. This can be specified if the protocol is SSL or TCP.
        """
        return pulumi.get(self, "instance_ports")

    @instance_ports.setter
    def instance_ports(self, value: pulumi.Input[Sequence[pulumi.Input[str]]]):
        pulumi.set(self, "instance_ports", value)

    @property
    @pulumi.getter(name="loadBalancer")
    def load_balancer(self) -> pulumi.Input[str]:
        """
        The load balancer to which the policy
        should be attached.
        """
        return pulumi.get(self, "load_balancer")

    @load_balancer.setter
    def load_balancer(self, value: pulumi.Input[str]):
        pulumi.set(self, "load_balancer", value)


@pulumi.input_type
class _ProxyProtocolPolicyState:
    def __init__(__self__, *,
                 instance_ports: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 load_balancer: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering ProxyProtocolPolicy resources.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] instance_ports: List of instance ports to which the policy
               should be applied. This can be specified if the protocol is SSL or TCP.
        :param pulumi.Input[str] load_balancer: The load balancer to which the policy
               should be attached.
        """
        if instance_ports is not None:
            pulumi.set(__self__, "instance_ports", instance_ports)
        if load_balancer is not None:
            pulumi.set(__self__, "load_balancer", load_balancer)

    @property
    @pulumi.getter(name="instancePorts")
    def instance_ports(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        List of instance ports to which the policy
        should be applied. This can be specified if the protocol is SSL or TCP.
        """
        return pulumi.get(self, "instance_ports")

    @instance_ports.setter
    def instance_ports(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "instance_ports", value)

    @property
    @pulumi.getter(name="loadBalancer")
    def load_balancer(self) -> Optional[pulumi.Input[str]]:
        """
        The load balancer to which the policy
        should be attached.
        """
        return pulumi.get(self, "load_balancer")

    @load_balancer.setter
    def load_balancer(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "load_balancer", value)


class ProxyProtocolPolicy(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 instance_ports: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 load_balancer: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a proxy protocol policy, which allows an ELB to carry a client connection information to a backend.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        lb = aws.elb.LoadBalancer("lb",
            availability_zones=["us-east-1a"],
            listeners=[
                aws.elb.LoadBalancerListenerArgs(
                    instance_port=25,
                    instance_protocol="tcp",
                    lb_port=25,
                    lb_protocol="tcp",
                ),
                aws.elb.LoadBalancerListenerArgs(
                    instance_port=587,
                    instance_protocol="tcp",
                    lb_port=587,
                    lb_protocol="tcp",
                ),
            ])
        smtp = aws.ec2.ProxyProtocolPolicy("smtp",
            load_balancer=lb.name,
            instance_ports=[
                "25",
                "587",
            ])
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] instance_ports: List of instance ports to which the policy
               should be applied. This can be specified if the protocol is SSL or TCP.
        :param pulumi.Input[str] load_balancer: The load balancer to which the policy
               should be attached.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ProxyProtocolPolicyArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a proxy protocol policy, which allows an ELB to carry a client connection information to a backend.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        lb = aws.elb.LoadBalancer("lb",
            availability_zones=["us-east-1a"],
            listeners=[
                aws.elb.LoadBalancerListenerArgs(
                    instance_port=25,
                    instance_protocol="tcp",
                    lb_port=25,
                    lb_protocol="tcp",
                ),
                aws.elb.LoadBalancerListenerArgs(
                    instance_port=587,
                    instance_protocol="tcp",
                    lb_port=587,
                    lb_protocol="tcp",
                ),
            ])
        smtp = aws.ec2.ProxyProtocolPolicy("smtp",
            load_balancer=lb.name,
            instance_ports=[
                "25",
                "587",
            ])
        ```

        :param str resource_name: The name of the resource.
        :param ProxyProtocolPolicyArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ProxyProtocolPolicyArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 instance_ports: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 load_balancer: Optional[pulumi.Input[str]] = None,
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
            __props__ = ProxyProtocolPolicyArgs.__new__(ProxyProtocolPolicyArgs)

            if instance_ports is None and not opts.urn:
                raise TypeError("Missing required property 'instance_ports'")
            __props__.__dict__["instance_ports"] = instance_ports
            if load_balancer is None and not opts.urn:
                raise TypeError("Missing required property 'load_balancer'")
            __props__.__dict__["load_balancer"] = load_balancer
        super(ProxyProtocolPolicy, __self__).__init__(
            'aws:ec2/proxyProtocolPolicy:ProxyProtocolPolicy',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            instance_ports: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            load_balancer: Optional[pulumi.Input[str]] = None) -> 'ProxyProtocolPolicy':
        """
        Get an existing ProxyProtocolPolicy resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] instance_ports: List of instance ports to which the policy
               should be applied. This can be specified if the protocol is SSL or TCP.
        :param pulumi.Input[str] load_balancer: The load balancer to which the policy
               should be attached.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ProxyProtocolPolicyState.__new__(_ProxyProtocolPolicyState)

        __props__.__dict__["instance_ports"] = instance_ports
        __props__.__dict__["load_balancer"] = load_balancer
        return ProxyProtocolPolicy(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="instancePorts")
    def instance_ports(self) -> pulumi.Output[Sequence[str]]:
        """
        List of instance ports to which the policy
        should be applied. This can be specified if the protocol is SSL or TCP.
        """
        return pulumi.get(self, "instance_ports")

    @property
    @pulumi.getter(name="loadBalancer")
    def load_balancer(self) -> pulumi.Output[str]:
        """
        The load balancer to which the policy
        should be attached.
        """
        return pulumi.get(self, "load_balancer")


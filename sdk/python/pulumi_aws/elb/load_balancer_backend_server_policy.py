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

__all__ = ['LoadBalancerBackendServerPolicyArgs', 'LoadBalancerBackendServerPolicy']

@pulumi.input_type
class LoadBalancerBackendServerPolicyArgs:
    def __init__(__self__, *,
                 instance_port: pulumi.Input[int],
                 load_balancer_name: pulumi.Input[str],
                 policy_names: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None):
        """
        The set of arguments for constructing a LoadBalancerBackendServerPolicy resource.
        :param pulumi.Input[int] instance_port: The instance port to apply the policy to.
        :param pulumi.Input[str] load_balancer_name: The load balancer to attach the policy to.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] policy_names: List of Policy Names to apply to the backend server.
        """
        pulumi.set(__self__, "instance_port", instance_port)
        pulumi.set(__self__, "load_balancer_name", load_balancer_name)
        if policy_names is not None:
            pulumi.set(__self__, "policy_names", policy_names)

    @property
    @pulumi.getter(name="instancePort")
    def instance_port(self) -> pulumi.Input[int]:
        """
        The instance port to apply the policy to.
        """
        return pulumi.get(self, "instance_port")

    @instance_port.setter
    def instance_port(self, value: pulumi.Input[int]):
        pulumi.set(self, "instance_port", value)

    @property
    @pulumi.getter(name="loadBalancerName")
    def load_balancer_name(self) -> pulumi.Input[str]:
        """
        The load balancer to attach the policy to.
        """
        return pulumi.get(self, "load_balancer_name")

    @load_balancer_name.setter
    def load_balancer_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "load_balancer_name", value)

    @property
    @pulumi.getter(name="policyNames")
    def policy_names(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        List of Policy Names to apply to the backend server.
        """
        return pulumi.get(self, "policy_names")

    @policy_names.setter
    def policy_names(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "policy_names", value)


@pulumi.input_type
class _LoadBalancerBackendServerPolicyState:
    def __init__(__self__, *,
                 instance_port: Optional[pulumi.Input[int]] = None,
                 load_balancer_name: Optional[pulumi.Input[str]] = None,
                 policy_names: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None):
        """
        Input properties used for looking up and filtering LoadBalancerBackendServerPolicy resources.
        :param pulumi.Input[int] instance_port: The instance port to apply the policy to.
        :param pulumi.Input[str] load_balancer_name: The load balancer to attach the policy to.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] policy_names: List of Policy Names to apply to the backend server.
        """
        if instance_port is not None:
            pulumi.set(__self__, "instance_port", instance_port)
        if load_balancer_name is not None:
            pulumi.set(__self__, "load_balancer_name", load_balancer_name)
        if policy_names is not None:
            pulumi.set(__self__, "policy_names", policy_names)

    @property
    @pulumi.getter(name="instancePort")
    def instance_port(self) -> Optional[pulumi.Input[int]]:
        """
        The instance port to apply the policy to.
        """
        return pulumi.get(self, "instance_port")

    @instance_port.setter
    def instance_port(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "instance_port", value)

    @property
    @pulumi.getter(name="loadBalancerName")
    def load_balancer_name(self) -> Optional[pulumi.Input[str]]:
        """
        The load balancer to attach the policy to.
        """
        return pulumi.get(self, "load_balancer_name")

    @load_balancer_name.setter
    def load_balancer_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "load_balancer_name", value)

    @property
    @pulumi.getter(name="policyNames")
    def policy_names(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        List of Policy Names to apply to the backend server.
        """
        return pulumi.get(self, "policy_names")

    @policy_names.setter
    def policy_names(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "policy_names", value)


class LoadBalancerBackendServerPolicy(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 instance_port: Optional[pulumi.Input[int]] = None,
                 load_balancer_name: Optional[pulumi.Input[str]] = None,
                 policy_names: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 __props__=None):
        """
        Attaches a load balancer policy to an ELB backend server.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws
        import pulumi_std as std

        wu_tang = aws.elb.LoadBalancer("wu-tang",
            name="wu-tang",
            availability_zones=["us-east-1a"],
            listeners=[{
                "instancePort": 443,
                "instanceProtocol": "http",
                "lbPort": 443,
                "lbProtocol": "https",
                "sslCertificateId": "arn:aws:iam::000000000000:server-certificate/wu-tang.net",
            }],
            tags={
                "Name": "wu-tang",
            })
        wu_tang_ca_pubkey_policy = aws.elb.LoadBalancerPolicy("wu-tang-ca-pubkey-policy",
            load_balancer_name=wu_tang.name,
            policy_name="wu-tang-ca-pubkey-policy",
            policy_type_name="PublicKeyPolicyType",
            policy_attributes=[{
                "name": "PublicKey",
                "value": std.file(input="wu-tang-pubkey").result,
            }])
        wu_tang_root_ca_backend_auth_policy = aws.elb.LoadBalancerPolicy("wu-tang-root-ca-backend-auth-policy",
            load_balancer_name=wu_tang.name,
            policy_name="wu-tang-root-ca-backend-auth-policy",
            policy_type_name="BackendServerAuthenticationPolicyType",
            policy_attributes=[{
                "name": "PublicKeyPolicyName",
                "value": wu_tang_root_ca_pubkey_policy["policyName"],
            }])
        wu_tang_backend_auth_policies_443 = aws.elb.LoadBalancerBackendServerPolicy("wu-tang-backend-auth-policies-443",
            load_balancer_name=wu_tang.name,
            instance_port=443,
            policy_names=[wu_tang_root_ca_backend_auth_policy.policy_name])
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[int] instance_port: The instance port to apply the policy to.
        :param pulumi.Input[str] load_balancer_name: The load balancer to attach the policy to.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] policy_names: List of Policy Names to apply to the backend server.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: LoadBalancerBackendServerPolicyArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Attaches a load balancer policy to an ELB backend server.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws
        import pulumi_std as std

        wu_tang = aws.elb.LoadBalancer("wu-tang",
            name="wu-tang",
            availability_zones=["us-east-1a"],
            listeners=[{
                "instancePort": 443,
                "instanceProtocol": "http",
                "lbPort": 443,
                "lbProtocol": "https",
                "sslCertificateId": "arn:aws:iam::000000000000:server-certificate/wu-tang.net",
            }],
            tags={
                "Name": "wu-tang",
            })
        wu_tang_ca_pubkey_policy = aws.elb.LoadBalancerPolicy("wu-tang-ca-pubkey-policy",
            load_balancer_name=wu_tang.name,
            policy_name="wu-tang-ca-pubkey-policy",
            policy_type_name="PublicKeyPolicyType",
            policy_attributes=[{
                "name": "PublicKey",
                "value": std.file(input="wu-tang-pubkey").result,
            }])
        wu_tang_root_ca_backend_auth_policy = aws.elb.LoadBalancerPolicy("wu-tang-root-ca-backend-auth-policy",
            load_balancer_name=wu_tang.name,
            policy_name="wu-tang-root-ca-backend-auth-policy",
            policy_type_name="BackendServerAuthenticationPolicyType",
            policy_attributes=[{
                "name": "PublicKeyPolicyName",
                "value": wu_tang_root_ca_pubkey_policy["policyName"],
            }])
        wu_tang_backend_auth_policies_443 = aws.elb.LoadBalancerBackendServerPolicy("wu-tang-backend-auth-policies-443",
            load_balancer_name=wu_tang.name,
            instance_port=443,
            policy_names=[wu_tang_root_ca_backend_auth_policy.policy_name])
        ```

        :param str resource_name: The name of the resource.
        :param LoadBalancerBackendServerPolicyArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(LoadBalancerBackendServerPolicyArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 instance_port: Optional[pulumi.Input[int]] = None,
                 load_balancer_name: Optional[pulumi.Input[str]] = None,
                 policy_names: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = LoadBalancerBackendServerPolicyArgs.__new__(LoadBalancerBackendServerPolicyArgs)

            if instance_port is None and not opts.urn:
                raise TypeError("Missing required property 'instance_port'")
            __props__.__dict__["instance_port"] = instance_port
            if load_balancer_name is None and not opts.urn:
                raise TypeError("Missing required property 'load_balancer_name'")
            __props__.__dict__["load_balancer_name"] = load_balancer_name
            __props__.__dict__["policy_names"] = policy_names
        alias_opts = pulumi.ResourceOptions(aliases=[pulumi.Alias(type_="aws:elasticloadbalancing/loadBalancerBackendServerPolicy:LoadBalancerBackendServerPolicy")])
        opts = pulumi.ResourceOptions.merge(opts, alias_opts)
        super(LoadBalancerBackendServerPolicy, __self__).__init__(
            'aws:elb/loadBalancerBackendServerPolicy:LoadBalancerBackendServerPolicy',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            instance_port: Optional[pulumi.Input[int]] = None,
            load_balancer_name: Optional[pulumi.Input[str]] = None,
            policy_names: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None) -> 'LoadBalancerBackendServerPolicy':
        """
        Get an existing LoadBalancerBackendServerPolicy resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[int] instance_port: The instance port to apply the policy to.
        :param pulumi.Input[str] load_balancer_name: The load balancer to attach the policy to.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] policy_names: List of Policy Names to apply to the backend server.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _LoadBalancerBackendServerPolicyState.__new__(_LoadBalancerBackendServerPolicyState)

        __props__.__dict__["instance_port"] = instance_port
        __props__.__dict__["load_balancer_name"] = load_balancer_name
        __props__.__dict__["policy_names"] = policy_names
        return LoadBalancerBackendServerPolicy(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="instancePort")
    def instance_port(self) -> pulumi.Output[int]:
        """
        The instance port to apply the policy to.
        """
        return pulumi.get(self, "instance_port")

    @property
    @pulumi.getter(name="loadBalancerName")
    def load_balancer_name(self) -> pulumi.Output[str]:
        """
        The load balancer to attach the policy to.
        """
        return pulumi.get(self, "load_balancer_name")

    @property
    @pulumi.getter(name="policyNames")
    def policy_names(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        List of Policy Names to apply to the backend server.
        """
        return pulumi.get(self, "policy_names")


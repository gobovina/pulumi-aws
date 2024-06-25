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
from ._inputs import *

__all__ = ['IpSetArgs', 'IpSet']

@pulumi.input_type
class IpSetArgs:
    def __init__(__self__, *,
                 ip_set_descriptors: Optional[pulumi.Input[Sequence[pulumi.Input['IpSetIpSetDescriptorArgs']]]] = None,
                 name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a IpSet resource.
        :param pulumi.Input[Sequence[pulumi.Input['IpSetIpSetDescriptorArgs']]] ip_set_descriptors: One or more pairs specifying the IP address type (IPV4 or IPV6) and the IP address range (in CIDR format) from which web requests originate.
        :param pulumi.Input[str] name: The name or description of the IPSet.
        """
        if ip_set_descriptors is not None:
            pulumi.set(__self__, "ip_set_descriptors", ip_set_descriptors)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter(name="ipSetDescriptors")
    def ip_set_descriptors(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['IpSetIpSetDescriptorArgs']]]]:
        """
        One or more pairs specifying the IP address type (IPV4 or IPV6) and the IP address range (in CIDR format) from which web requests originate.
        """
        return pulumi.get(self, "ip_set_descriptors")

    @ip_set_descriptors.setter
    def ip_set_descriptors(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['IpSetIpSetDescriptorArgs']]]]):
        pulumi.set(self, "ip_set_descriptors", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name or description of the IPSet.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _IpSetState:
    def __init__(__self__, *,
                 arn: Optional[pulumi.Input[str]] = None,
                 ip_set_descriptors: Optional[pulumi.Input[Sequence[pulumi.Input['IpSetIpSetDescriptorArgs']]]] = None,
                 name: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering IpSet resources.
        :param pulumi.Input[str] arn: The ARN of the WAF IPSet.
        :param pulumi.Input[Sequence[pulumi.Input['IpSetIpSetDescriptorArgs']]] ip_set_descriptors: One or more pairs specifying the IP address type (IPV4 or IPV6) and the IP address range (in CIDR format) from which web requests originate.
        :param pulumi.Input[str] name: The name or description of the IPSet.
        """
        if arn is not None:
            pulumi.set(__self__, "arn", arn)
        if ip_set_descriptors is not None:
            pulumi.set(__self__, "ip_set_descriptors", ip_set_descriptors)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter
    def arn(self) -> Optional[pulumi.Input[str]]:
        """
        The ARN of the WAF IPSet.
        """
        return pulumi.get(self, "arn")

    @arn.setter
    def arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "arn", value)

    @property
    @pulumi.getter(name="ipSetDescriptors")
    def ip_set_descriptors(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['IpSetIpSetDescriptorArgs']]]]:
        """
        One or more pairs specifying the IP address type (IPV4 or IPV6) and the IP address range (in CIDR format) from which web requests originate.
        """
        return pulumi.get(self, "ip_set_descriptors")

    @ip_set_descriptors.setter
    def ip_set_descriptors(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['IpSetIpSetDescriptorArgs']]]]):
        pulumi.set(self, "ip_set_descriptors", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name or description of the IPSet.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)


class IpSet(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 ip_set_descriptors: Optional[pulumi.Input[Sequence[pulumi.Input[Union['IpSetIpSetDescriptorArgs', 'IpSetIpSetDescriptorArgsDict']]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a WAF IPSet Resource

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        ipset = aws.waf.IpSet("ipset",
            name="tfIPSet",
            ip_set_descriptors=[
                {
                    "type": "IPV4",
                    "value": "192.0.7.0/24",
                },
                {
                    "type": "IPV4",
                    "value": "10.16.16.0/16",
                },
            ])
        ```

        ## Import

        Using `pulumi import`, import WAF IPSets using their ID. For example:

        ```sh
        $ pulumi import aws:waf/ipSet:IpSet example a1b2c3d4-d5f6-7777-8888-9999aaaabbbbcccc
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[Union['IpSetIpSetDescriptorArgs', 'IpSetIpSetDescriptorArgsDict']]]] ip_set_descriptors: One or more pairs specifying the IP address type (IPV4 or IPV6) and the IP address range (in CIDR format) from which web requests originate.
        :param pulumi.Input[str] name: The name or description of the IPSet.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[IpSetArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a WAF IPSet Resource

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        ipset = aws.waf.IpSet("ipset",
            name="tfIPSet",
            ip_set_descriptors=[
                {
                    "type": "IPV4",
                    "value": "192.0.7.0/24",
                },
                {
                    "type": "IPV4",
                    "value": "10.16.16.0/16",
                },
            ])
        ```

        ## Import

        Using `pulumi import`, import WAF IPSets using their ID. For example:

        ```sh
        $ pulumi import aws:waf/ipSet:IpSet example a1b2c3d4-d5f6-7777-8888-9999aaaabbbbcccc
        ```

        :param str resource_name: The name of the resource.
        :param IpSetArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(IpSetArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 ip_set_descriptors: Optional[pulumi.Input[Sequence[pulumi.Input[Union['IpSetIpSetDescriptorArgs', 'IpSetIpSetDescriptorArgsDict']]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = IpSetArgs.__new__(IpSetArgs)

            __props__.__dict__["ip_set_descriptors"] = ip_set_descriptors
            __props__.__dict__["name"] = name
            __props__.__dict__["arn"] = None
        super(IpSet, __self__).__init__(
            'aws:waf/ipSet:IpSet',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            arn: Optional[pulumi.Input[str]] = None,
            ip_set_descriptors: Optional[pulumi.Input[Sequence[pulumi.Input[Union['IpSetIpSetDescriptorArgs', 'IpSetIpSetDescriptorArgsDict']]]]] = None,
            name: Optional[pulumi.Input[str]] = None) -> 'IpSet':
        """
        Get an existing IpSet resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] arn: The ARN of the WAF IPSet.
        :param pulumi.Input[Sequence[pulumi.Input[Union['IpSetIpSetDescriptorArgs', 'IpSetIpSetDescriptorArgsDict']]]] ip_set_descriptors: One or more pairs specifying the IP address type (IPV4 or IPV6) and the IP address range (in CIDR format) from which web requests originate.
        :param pulumi.Input[str] name: The name or description of the IPSet.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _IpSetState.__new__(_IpSetState)

        __props__.__dict__["arn"] = arn
        __props__.__dict__["ip_set_descriptors"] = ip_set_descriptors
        __props__.__dict__["name"] = name
        return IpSet(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def arn(self) -> pulumi.Output[str]:
        """
        The ARN of the WAF IPSet.
        """
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter(name="ipSetDescriptors")
    def ip_set_descriptors(self) -> pulumi.Output[Optional[Sequence['outputs.IpSetIpSetDescriptor']]]:
        """
        One or more pairs specifying the IP address type (IPV4 or IPV6) and the IP address range (in CIDR format) from which web requests originate.
        """
        return pulumi.get(self, "ip_set_descriptors")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name or description of the IPSet.
        """
        return pulumi.get(self, "name")


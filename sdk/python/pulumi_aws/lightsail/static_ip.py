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

__all__ = ['StaticIpArgs', 'StaticIp']

@pulumi.input_type
class StaticIpArgs:
    def __init__(__self__, *,
                 name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a StaticIp resource.
        :param pulumi.Input[str] name: The name for the allocated static IP
        """
        if name is not None:
            pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name for the allocated static IP
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _StaticIpState:
    def __init__(__self__, *,
                 arn: Optional[pulumi.Input[str]] = None,
                 ip_address: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 support_code: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering StaticIp resources.
        :param pulumi.Input[str] arn: The ARN of the Lightsail static IP
        :param pulumi.Input[str] ip_address: The allocated static IP address
        :param pulumi.Input[str] name: The name for the allocated static IP
        :param pulumi.Input[str] support_code: The support code.
        """
        if arn is not None:
            pulumi.set(__self__, "arn", arn)
        if ip_address is not None:
            pulumi.set(__self__, "ip_address", ip_address)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if support_code is not None:
            pulumi.set(__self__, "support_code", support_code)

    @property
    @pulumi.getter
    def arn(self) -> Optional[pulumi.Input[str]]:
        """
        The ARN of the Lightsail static IP
        """
        return pulumi.get(self, "arn")

    @arn.setter
    def arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "arn", value)

    @property
    @pulumi.getter(name="ipAddress")
    def ip_address(self) -> Optional[pulumi.Input[str]]:
        """
        The allocated static IP address
        """
        return pulumi.get(self, "ip_address")

    @ip_address.setter
    def ip_address(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "ip_address", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name for the allocated static IP
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="supportCode")
    def support_code(self) -> Optional[pulumi.Input[str]]:
        """
        The support code.
        """
        return pulumi.get(self, "support_code")

    @support_code.setter
    def support_code(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "support_code", value)


class StaticIp(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Allocates a static IP address.

        > **Note:** Lightsail is currently only supported in a limited number of AWS Regions, please see ["Regions and Availability Zones in Amazon Lightsail"](https://lightsail.aws.amazon.com/ls/docs/overview/article/understanding-regions-and-availability-zones-in-amazon-lightsail) for more details

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        test = aws.lightsail.StaticIp("test", name="example")
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] name: The name for the allocated static IP
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[StaticIpArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Allocates a static IP address.

        > **Note:** Lightsail is currently only supported in a limited number of AWS Regions, please see ["Regions and Availability Zones in Amazon Lightsail"](https://lightsail.aws.amazon.com/ls/docs/overview/article/understanding-regions-and-availability-zones-in-amazon-lightsail) for more details

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        test = aws.lightsail.StaticIp("test", name="example")
        ```

        :param str resource_name: The name of the resource.
        :param StaticIpArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(StaticIpArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = StaticIpArgs.__new__(StaticIpArgs)

            __props__.__dict__["name"] = name
            __props__.__dict__["arn"] = None
            __props__.__dict__["ip_address"] = None
            __props__.__dict__["support_code"] = None
        super(StaticIp, __self__).__init__(
            'aws:lightsail/staticIp:StaticIp',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            arn: Optional[pulumi.Input[str]] = None,
            ip_address: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            support_code: Optional[pulumi.Input[str]] = None) -> 'StaticIp':
        """
        Get an existing StaticIp resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] arn: The ARN of the Lightsail static IP
        :param pulumi.Input[str] ip_address: The allocated static IP address
        :param pulumi.Input[str] name: The name for the allocated static IP
        :param pulumi.Input[str] support_code: The support code.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _StaticIpState.__new__(_StaticIpState)

        __props__.__dict__["arn"] = arn
        __props__.__dict__["ip_address"] = ip_address
        __props__.__dict__["name"] = name
        __props__.__dict__["support_code"] = support_code
        return StaticIp(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def arn(self) -> pulumi.Output[str]:
        """
        The ARN of the Lightsail static IP
        """
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter(name="ipAddress")
    def ip_address(self) -> pulumi.Output[str]:
        """
        The allocated static IP address
        """
        return pulumi.get(self, "ip_address")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name for the allocated static IP
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="supportCode")
    def support_code(self) -> pulumi.Output[str]:
        """
        The support code.
        """
        return pulumi.get(self, "support_code")


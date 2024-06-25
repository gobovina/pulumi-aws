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

__all__ = ['SerialConsoleAccessArgs', 'SerialConsoleAccess']

@pulumi.input_type
class SerialConsoleAccessArgs:
    def __init__(__self__, *,
                 enabled: Optional[pulumi.Input[bool]] = None):
        """
        The set of arguments for constructing a SerialConsoleAccess resource.
        :param pulumi.Input[bool] enabled: Whether or not serial console access is enabled. Valid values are `true` or `false`. Defaults to `true`.
        """
        if enabled is not None:
            pulumi.set(__self__, "enabled", enabled)

    @property
    @pulumi.getter
    def enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether or not serial console access is enabled. Valid values are `true` or `false`. Defaults to `true`.
        """
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "enabled", value)


@pulumi.input_type
class _SerialConsoleAccessState:
    def __init__(__self__, *,
                 enabled: Optional[pulumi.Input[bool]] = None):
        """
        Input properties used for looking up and filtering SerialConsoleAccess resources.
        :param pulumi.Input[bool] enabled: Whether or not serial console access is enabled. Valid values are `true` or `false`. Defaults to `true`.
        """
        if enabled is not None:
            pulumi.set(__self__, "enabled", enabled)

    @property
    @pulumi.getter
    def enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether or not serial console access is enabled. Valid values are `true` or `false`. Defaults to `true`.
        """
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "enabled", value)


class SerialConsoleAccess(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 __props__=None):
        """
        Provides a resource to manage whether serial console access is enabled for your AWS account in the current AWS region.

        > **NOTE:** Removing this resource disables serial console access.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.ec2.SerialConsoleAccess("example", enabled=True)
        ```

        ## Import

        Using `pulumi import`, import serial console access state. For example:

        ```sh
        $ pulumi import aws:ec2/serialConsoleAccess:SerialConsoleAccess example default
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] enabled: Whether or not serial console access is enabled. Valid values are `true` or `false`. Defaults to `true`.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[SerialConsoleAccessArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a resource to manage whether serial console access is enabled for your AWS account in the current AWS region.

        > **NOTE:** Removing this resource disables serial console access.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.ec2.SerialConsoleAccess("example", enabled=True)
        ```

        ## Import

        Using `pulumi import`, import serial console access state. For example:

        ```sh
        $ pulumi import aws:ec2/serialConsoleAccess:SerialConsoleAccess example default
        ```

        :param str resource_name: The name of the resource.
        :param SerialConsoleAccessArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(SerialConsoleAccessArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = SerialConsoleAccessArgs.__new__(SerialConsoleAccessArgs)

            __props__.__dict__["enabled"] = enabled
        super(SerialConsoleAccess, __self__).__init__(
            'aws:ec2/serialConsoleAccess:SerialConsoleAccess',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            enabled: Optional[pulumi.Input[bool]] = None) -> 'SerialConsoleAccess':
        """
        Get an existing SerialConsoleAccess resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] enabled: Whether or not serial console access is enabled. Valid values are `true` or `false`. Defaults to `true`.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _SerialConsoleAccessState.__new__(_SerialConsoleAccessState)

        __props__.__dict__["enabled"] = enabled
        return SerialConsoleAccess(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def enabled(self) -> pulumi.Output[Optional[bool]]:
        """
        Whether or not serial console access is enabled. Valid values are `true` or `false`. Defaults to `true`.
        """
        return pulumi.get(self, "enabled")


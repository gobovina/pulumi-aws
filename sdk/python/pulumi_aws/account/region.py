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

__all__ = ['RegionArgs', 'Region']

@pulumi.input_type
class RegionArgs:
    def __init__(__self__, *,
                 enabled: pulumi.Input[bool],
                 region_name: pulumi.Input[str],
                 account_id: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a Region resource.
        :param pulumi.Input[bool] enabled: Whether the region is enabled.
        :param pulumi.Input[str] region_name: The region name to manage.
        :param pulumi.Input[str] account_id: The ID of the target account when managing member accounts. Will manage current user's account by default if omitted. To use this parameter, the caller must be an identity in the organization's management account or a delegated administrator account. The specified account ID must also be a member account in the same organization. The organization must have all features enabled, and the organization must have trusted access enabled for the Account Management service, and optionally a delegated admin account assigned.
        """
        pulumi.set(__self__, "enabled", enabled)
        pulumi.set(__self__, "region_name", region_name)
        if account_id is not None:
            pulumi.set(__self__, "account_id", account_id)

    @property
    @pulumi.getter
    def enabled(self) -> pulumi.Input[bool]:
        """
        Whether the region is enabled.
        """
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: pulumi.Input[bool]):
        pulumi.set(self, "enabled", value)

    @property
    @pulumi.getter(name="regionName")
    def region_name(self) -> pulumi.Input[str]:
        """
        The region name to manage.
        """
        return pulumi.get(self, "region_name")

    @region_name.setter
    def region_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "region_name", value)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the target account when managing member accounts. Will manage current user's account by default if omitted. To use this parameter, the caller must be an identity in the organization's management account or a delegated administrator account. The specified account ID must also be a member account in the same organization. The organization must have all features enabled, and the organization must have trusted access enabled for the Account Management service, and optionally a delegated admin account assigned.
        """
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "account_id", value)


@pulumi.input_type
class _RegionState:
    def __init__(__self__, *,
                 account_id: Optional[pulumi.Input[str]] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 opt_status: Optional[pulumi.Input[str]] = None,
                 region_name: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering Region resources.
        :param pulumi.Input[str] account_id: The ID of the target account when managing member accounts. Will manage current user's account by default if omitted. To use this parameter, the caller must be an identity in the organization's management account or a delegated administrator account. The specified account ID must also be a member account in the same organization. The organization must have all features enabled, and the organization must have trusted access enabled for the Account Management service, and optionally a delegated admin account assigned.
        :param pulumi.Input[bool] enabled: Whether the region is enabled.
        :param pulumi.Input[str] opt_status: The region opt status.
        :param pulumi.Input[str] region_name: The region name to manage.
        """
        if account_id is not None:
            pulumi.set(__self__, "account_id", account_id)
        if enabled is not None:
            pulumi.set(__self__, "enabled", enabled)
        if opt_status is not None:
            pulumi.set(__self__, "opt_status", opt_status)
        if region_name is not None:
            pulumi.set(__self__, "region_name", region_name)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the target account when managing member accounts. Will manage current user's account by default if omitted. To use this parameter, the caller must be an identity in the organization's management account or a delegated administrator account. The specified account ID must also be a member account in the same organization. The organization must have all features enabled, and the organization must have trusted access enabled for the Account Management service, and optionally a delegated admin account assigned.
        """
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "account_id", value)

    @property
    @pulumi.getter
    def enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether the region is enabled.
        """
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "enabled", value)

    @property
    @pulumi.getter(name="optStatus")
    def opt_status(self) -> Optional[pulumi.Input[str]]:
        """
        The region opt status.
        """
        return pulumi.get(self, "opt_status")

    @opt_status.setter
    def opt_status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "opt_status", value)

    @property
    @pulumi.getter(name="regionName")
    def region_name(self) -> Optional[pulumi.Input[str]]:
        """
        The region name to manage.
        """
        return pulumi.get(self, "region_name")

    @region_name.setter
    def region_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "region_name", value)


class Region(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[str]] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 region_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Enable (Opt-In) or Disable (Opt-Out) a particular Region for an AWS account.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.account.Region("example",
            region_name="ap-southeast-3",
            enabled=True)
        ```

        ## Import

        Using `pulumi import`. For example:

        ```sh
        $ pulumi import aws:account/region:Region example ap-southeast-3
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] account_id: The ID of the target account when managing member accounts. Will manage current user's account by default if omitted. To use this parameter, the caller must be an identity in the organization's management account or a delegated administrator account. The specified account ID must also be a member account in the same organization. The organization must have all features enabled, and the organization must have trusted access enabled for the Account Management service, and optionally a delegated admin account assigned.
        :param pulumi.Input[bool] enabled: Whether the region is enabled.
        :param pulumi.Input[str] region_name: The region name to manage.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: RegionArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Enable (Opt-In) or Disable (Opt-Out) a particular Region for an AWS account.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.account.Region("example",
            region_name="ap-southeast-3",
            enabled=True)
        ```

        ## Import

        Using `pulumi import`. For example:

        ```sh
        $ pulumi import aws:account/region:Region example ap-southeast-3
        ```

        :param str resource_name: The name of the resource.
        :param RegionArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(RegionArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[str]] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 region_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = RegionArgs.__new__(RegionArgs)

            __props__.__dict__["account_id"] = account_id
            if enabled is None and not opts.urn:
                raise TypeError("Missing required property 'enabled'")
            __props__.__dict__["enabled"] = enabled
            if region_name is None and not opts.urn:
                raise TypeError("Missing required property 'region_name'")
            __props__.__dict__["region_name"] = region_name
            __props__.__dict__["opt_status"] = None
        super(Region, __self__).__init__(
            'aws:account/region:Region',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            account_id: Optional[pulumi.Input[str]] = None,
            enabled: Optional[pulumi.Input[bool]] = None,
            opt_status: Optional[pulumi.Input[str]] = None,
            region_name: Optional[pulumi.Input[str]] = None) -> 'Region':
        """
        Get an existing Region resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] account_id: The ID of the target account when managing member accounts. Will manage current user's account by default if omitted. To use this parameter, the caller must be an identity in the organization's management account or a delegated administrator account. The specified account ID must also be a member account in the same organization. The organization must have all features enabled, and the organization must have trusted access enabled for the Account Management service, and optionally a delegated admin account assigned.
        :param pulumi.Input[bool] enabled: Whether the region is enabled.
        :param pulumi.Input[str] opt_status: The region opt status.
        :param pulumi.Input[str] region_name: The region name to manage.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _RegionState.__new__(_RegionState)

        __props__.__dict__["account_id"] = account_id
        __props__.__dict__["enabled"] = enabled
        __props__.__dict__["opt_status"] = opt_status
        __props__.__dict__["region_name"] = region_name
        return Region(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> pulumi.Output[Optional[str]]:
        """
        The ID of the target account when managing member accounts. Will manage current user's account by default if omitted. To use this parameter, the caller must be an identity in the organization's management account or a delegated administrator account. The specified account ID must also be a member account in the same organization. The organization must have all features enabled, and the organization must have trusted access enabled for the Account Management service, and optionally a delegated admin account assigned.
        """
        return pulumi.get(self, "account_id")

    @property
    @pulumi.getter
    def enabled(self) -> pulumi.Output[bool]:
        """
        Whether the region is enabled.
        """
        return pulumi.get(self, "enabled")

    @property
    @pulumi.getter(name="optStatus")
    def opt_status(self) -> pulumi.Output[str]:
        """
        The region opt status.
        """
        return pulumi.get(self, "opt_status")

    @property
    @pulumi.getter(name="regionName")
    def region_name(self) -> pulumi.Output[str]:
        """
        The region name to manage.
        """
        return pulumi.get(self, "region_name")


# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['AccountSettingDefaultArgs', 'AccountSettingDefault']

@pulumi.input_type
class AccountSettingDefaultArgs:
    def __init__(__self__, *,
                 value: pulumi.Input[str],
                 name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a AccountSettingDefault resource.
        :param pulumi.Input[str] value: State of the setting.
        :param pulumi.Input[str] name: Name of the account setting to set.
        """
        pulumi.set(__self__, "value", value)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter
    def value(self) -> pulumi.Input[str]:
        """
        State of the setting.
        """
        return pulumi.get(self, "value")

    @value.setter
    def value(self, value: pulumi.Input[str]):
        pulumi.set(self, "value", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the account setting to set.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _AccountSettingDefaultState:
    def __init__(__self__, *,
                 name: Optional[pulumi.Input[str]] = None,
                 principal_arn: Optional[pulumi.Input[str]] = None,
                 value: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering AccountSettingDefault resources.
        :param pulumi.Input[str] name: Name of the account setting to set.
        :param pulumi.Input[str] value: State of the setting.
        """
        if name is not None:
            pulumi.set(__self__, "name", name)
        if principal_arn is not None:
            pulumi.set(__self__, "principal_arn", principal_arn)
        if value is not None:
            pulumi.set(__self__, "value", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the account setting to set.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="principalArn")
    def principal_arn(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "principal_arn")

    @principal_arn.setter
    def principal_arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "principal_arn", value)

    @property
    @pulumi.getter
    def value(self) -> Optional[pulumi.Input[str]]:
        """
        State of the setting.
        """
        return pulumi.get(self, "value")

    @value.setter
    def value(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "value", value)


class AccountSettingDefault(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 value: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides an ECS default account setting for a specific ECS Resource name within a specific region. More information can be found on the [ECS Developer Guide](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-account-settings.html).

        > **NOTE:** The AWS API does not delete this resource. When you run `destroy`, the provider will attempt to disable the setting.

        > **NOTE:** Your AWS account may not support disabling `containerInstanceLongArnFormat`, `serviceLongArnFormat`, and `taskLongArnFormat`. If your account does not support disabling these, "destroying" this resource will not disable the setting nor cause a provider error. However, the AWS Provider will log an AWS error: `InvalidParameterException: You can no longer disable Long Arn settings`.

        ## Example Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_aws as aws

        test = aws.ecs.AccountSettingDefault("test",
            name="taskLongArnFormat",
            value="enabled")
        ```
        <!--End PulumiCodeChooser -->

        ## Import

        Using `pulumi import`, import ECS Account Setting defaults using the `name`. For example:

        ```sh
        $ pulumi import aws:ecs/accountSettingDefault:AccountSettingDefault example taskLongArnFormat
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] name: Name of the account setting to set.
        :param pulumi.Input[str] value: State of the setting.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: AccountSettingDefaultArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides an ECS default account setting for a specific ECS Resource name within a specific region. More information can be found on the [ECS Developer Guide](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-account-settings.html).

        > **NOTE:** The AWS API does not delete this resource. When you run `destroy`, the provider will attempt to disable the setting.

        > **NOTE:** Your AWS account may not support disabling `containerInstanceLongArnFormat`, `serviceLongArnFormat`, and `taskLongArnFormat`. If your account does not support disabling these, "destroying" this resource will not disable the setting nor cause a provider error. However, the AWS Provider will log an AWS error: `InvalidParameterException: You can no longer disable Long Arn settings`.

        ## Example Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_aws as aws

        test = aws.ecs.AccountSettingDefault("test",
            name="taskLongArnFormat",
            value="enabled")
        ```
        <!--End PulumiCodeChooser -->

        ## Import

        Using `pulumi import`, import ECS Account Setting defaults using the `name`. For example:

        ```sh
        $ pulumi import aws:ecs/accountSettingDefault:AccountSettingDefault example taskLongArnFormat
        ```

        :param str resource_name: The name of the resource.
        :param AccountSettingDefaultArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(AccountSettingDefaultArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 value: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = AccountSettingDefaultArgs.__new__(AccountSettingDefaultArgs)

            __props__.__dict__["name"] = name
            if value is None and not opts.urn:
                raise TypeError("Missing required property 'value'")
            __props__.__dict__["value"] = value
            __props__.__dict__["principal_arn"] = None
        super(AccountSettingDefault, __self__).__init__(
            'aws:ecs/accountSettingDefault:AccountSettingDefault',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            name: Optional[pulumi.Input[str]] = None,
            principal_arn: Optional[pulumi.Input[str]] = None,
            value: Optional[pulumi.Input[str]] = None) -> 'AccountSettingDefault':
        """
        Get an existing AccountSettingDefault resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] name: Name of the account setting to set.
        :param pulumi.Input[str] value: State of the setting.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _AccountSettingDefaultState.__new__(_AccountSettingDefaultState)

        __props__.__dict__["name"] = name
        __props__.__dict__["principal_arn"] = principal_arn
        __props__.__dict__["value"] = value
        return AccountSettingDefault(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Name of the account setting to set.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="principalArn")
    def principal_arn(self) -> pulumi.Output[str]:
        return pulumi.get(self, "principal_arn")

    @property
    @pulumi.getter
    def value(self) -> pulumi.Output[str]:
        """
        State of the setting.
        """
        return pulumi.get(self, "value")


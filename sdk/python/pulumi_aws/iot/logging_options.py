# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['LoggingOptionsArgs', 'LoggingOptions']

@pulumi.input_type
class LoggingOptionsArgs:
    def __init__(__self__, *,
                 default_log_level: pulumi.Input[str],
                 role_arn: pulumi.Input[str],
                 disable_all_logs: Optional[pulumi.Input[bool]] = None):
        """
        The set of arguments for constructing a LoggingOptions resource.
        :param pulumi.Input[str] default_log_level: The default logging level. Valid Values: `"DEBUG"`, `"INFO"`, `"ERROR"`, `"WARN"`, `"DISABLED"`.
        :param pulumi.Input[str] role_arn: The ARN of the role that allows IoT to write to Cloudwatch logs.
        :param pulumi.Input[bool] disable_all_logs: If `true` all logs are disabled. The default is `false`.
        """
        pulumi.set(__self__, "default_log_level", default_log_level)
        pulumi.set(__self__, "role_arn", role_arn)
        if disable_all_logs is not None:
            pulumi.set(__self__, "disable_all_logs", disable_all_logs)

    @property
    @pulumi.getter(name="defaultLogLevel")
    def default_log_level(self) -> pulumi.Input[str]:
        """
        The default logging level. Valid Values: `"DEBUG"`, `"INFO"`, `"ERROR"`, `"WARN"`, `"DISABLED"`.
        """
        return pulumi.get(self, "default_log_level")

    @default_log_level.setter
    def default_log_level(self, value: pulumi.Input[str]):
        pulumi.set(self, "default_log_level", value)

    @property
    @pulumi.getter(name="roleArn")
    def role_arn(self) -> pulumi.Input[str]:
        """
        The ARN of the role that allows IoT to write to Cloudwatch logs.
        """
        return pulumi.get(self, "role_arn")

    @role_arn.setter
    def role_arn(self, value: pulumi.Input[str]):
        pulumi.set(self, "role_arn", value)

    @property
    @pulumi.getter(name="disableAllLogs")
    def disable_all_logs(self) -> Optional[pulumi.Input[bool]]:
        """
        If `true` all logs are disabled. The default is `false`.
        """
        return pulumi.get(self, "disable_all_logs")

    @disable_all_logs.setter
    def disable_all_logs(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "disable_all_logs", value)


@pulumi.input_type
class _LoggingOptionsState:
    def __init__(__self__, *,
                 default_log_level: Optional[pulumi.Input[str]] = None,
                 disable_all_logs: Optional[pulumi.Input[bool]] = None,
                 role_arn: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering LoggingOptions resources.
        :param pulumi.Input[str] default_log_level: The default logging level. Valid Values: `"DEBUG"`, `"INFO"`, `"ERROR"`, `"WARN"`, `"DISABLED"`.
        :param pulumi.Input[bool] disable_all_logs: If `true` all logs are disabled. The default is `false`.
        :param pulumi.Input[str] role_arn: The ARN of the role that allows IoT to write to Cloudwatch logs.
        """
        if default_log_level is not None:
            pulumi.set(__self__, "default_log_level", default_log_level)
        if disable_all_logs is not None:
            pulumi.set(__self__, "disable_all_logs", disable_all_logs)
        if role_arn is not None:
            pulumi.set(__self__, "role_arn", role_arn)

    @property
    @pulumi.getter(name="defaultLogLevel")
    def default_log_level(self) -> Optional[pulumi.Input[str]]:
        """
        The default logging level. Valid Values: `"DEBUG"`, `"INFO"`, `"ERROR"`, `"WARN"`, `"DISABLED"`.
        """
        return pulumi.get(self, "default_log_level")

    @default_log_level.setter
    def default_log_level(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "default_log_level", value)

    @property
    @pulumi.getter(name="disableAllLogs")
    def disable_all_logs(self) -> Optional[pulumi.Input[bool]]:
        """
        If `true` all logs are disabled. The default is `false`.
        """
        return pulumi.get(self, "disable_all_logs")

    @disable_all_logs.setter
    def disable_all_logs(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "disable_all_logs", value)

    @property
    @pulumi.getter(name="roleArn")
    def role_arn(self) -> Optional[pulumi.Input[str]]:
        """
        The ARN of the role that allows IoT to write to Cloudwatch logs.
        """
        return pulumi.get(self, "role_arn")

    @role_arn.setter
    def role_arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "role_arn", value)


class LoggingOptions(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 default_log_level: Optional[pulumi.Input[str]] = None,
                 disable_all_logs: Optional[pulumi.Input[bool]] = None,
                 role_arn: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a resource to manage [default logging options](https://docs.aws.amazon.com/iot/latest/developerguide/configure-logging.html#configure-logging-console).

        ## Example Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.iot.LoggingOptions("example",
            default_log_level="WARN",
            role_arn=example_aws_iam_role["arn"])
        ```
        <!--End PulumiCodeChooser -->

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] default_log_level: The default logging level. Valid Values: `"DEBUG"`, `"INFO"`, `"ERROR"`, `"WARN"`, `"DISABLED"`.
        :param pulumi.Input[bool] disable_all_logs: If `true` all logs are disabled. The default is `false`.
        :param pulumi.Input[str] role_arn: The ARN of the role that allows IoT to write to Cloudwatch logs.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: LoggingOptionsArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a resource to manage [default logging options](https://docs.aws.amazon.com/iot/latest/developerguide/configure-logging.html#configure-logging-console).

        ## Example Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.iot.LoggingOptions("example",
            default_log_level="WARN",
            role_arn=example_aws_iam_role["arn"])
        ```
        <!--End PulumiCodeChooser -->

        :param str resource_name: The name of the resource.
        :param LoggingOptionsArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(LoggingOptionsArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 default_log_level: Optional[pulumi.Input[str]] = None,
                 disable_all_logs: Optional[pulumi.Input[bool]] = None,
                 role_arn: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = LoggingOptionsArgs.__new__(LoggingOptionsArgs)

            if default_log_level is None and not opts.urn:
                raise TypeError("Missing required property 'default_log_level'")
            __props__.__dict__["default_log_level"] = default_log_level
            __props__.__dict__["disable_all_logs"] = disable_all_logs
            if role_arn is None and not opts.urn:
                raise TypeError("Missing required property 'role_arn'")
            __props__.__dict__["role_arn"] = role_arn
        super(LoggingOptions, __self__).__init__(
            'aws:iot/loggingOptions:LoggingOptions',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            default_log_level: Optional[pulumi.Input[str]] = None,
            disable_all_logs: Optional[pulumi.Input[bool]] = None,
            role_arn: Optional[pulumi.Input[str]] = None) -> 'LoggingOptions':
        """
        Get an existing LoggingOptions resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] default_log_level: The default logging level. Valid Values: `"DEBUG"`, `"INFO"`, `"ERROR"`, `"WARN"`, `"DISABLED"`.
        :param pulumi.Input[bool] disable_all_logs: If `true` all logs are disabled. The default is `false`.
        :param pulumi.Input[str] role_arn: The ARN of the role that allows IoT to write to Cloudwatch logs.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _LoggingOptionsState.__new__(_LoggingOptionsState)

        __props__.__dict__["default_log_level"] = default_log_level
        __props__.__dict__["disable_all_logs"] = disable_all_logs
        __props__.__dict__["role_arn"] = role_arn
        return LoggingOptions(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="defaultLogLevel")
    def default_log_level(self) -> pulumi.Output[str]:
        """
        The default logging level. Valid Values: `"DEBUG"`, `"INFO"`, `"ERROR"`, `"WARN"`, `"DISABLED"`.
        """
        return pulumi.get(self, "default_log_level")

    @property
    @pulumi.getter(name="disableAllLogs")
    def disable_all_logs(self) -> pulumi.Output[Optional[bool]]:
        """
        If `true` all logs are disabled. The default is `false`.
        """
        return pulumi.get(self, "disable_all_logs")

    @property
    @pulumi.getter(name="roleArn")
    def role_arn(self) -> pulumi.Output[str]:
        """
        The ARN of the role that allows IoT to write to Cloudwatch logs.
        """
        return pulumi.get(self, "role_arn")


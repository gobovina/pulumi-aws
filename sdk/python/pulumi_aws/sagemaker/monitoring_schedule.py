# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities
from . import outputs
from ._inputs import *

__all__ = ['MonitoringScheduleArgs', 'MonitoringSchedule']

@pulumi.input_type
class MonitoringScheduleArgs:
    def __init__(__self__, *,
                 monitoring_schedule_config: pulumi.Input['MonitoringScheduleMonitoringScheduleConfigArgs'],
                 name: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        The set of arguments for constructing a MonitoringSchedule resource.
        :param pulumi.Input['MonitoringScheduleMonitoringScheduleConfigArgs'] monitoring_schedule_config: The configuration object that specifies the monitoring schedule and defines the monitoring job. Fields are documented below.
        :param pulumi.Input[str] name: The name of the monitoring schedule. The name must be unique within an AWS Region within an AWS account. If omitted, the provider will assign a random, unique name.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A mapping of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        pulumi.set(__self__, "monitoring_schedule_config", monitoring_schedule_config)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter(name="monitoringScheduleConfig")
    def monitoring_schedule_config(self) -> pulumi.Input['MonitoringScheduleMonitoringScheduleConfigArgs']:
        """
        The configuration object that specifies the monitoring schedule and defines the monitoring job. Fields are documented below.
        """
        return pulumi.get(self, "monitoring_schedule_config")

    @monitoring_schedule_config.setter
    def monitoring_schedule_config(self, value: pulumi.Input['MonitoringScheduleMonitoringScheduleConfigArgs']):
        pulumi.set(self, "monitoring_schedule_config", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the monitoring schedule. The name must be unique within an AWS Region within an AWS account. If omitted, the provider will assign a random, unique name.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        A mapping of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)


@pulumi.input_type
class _MonitoringScheduleState:
    def __init__(__self__, *,
                 arn: Optional[pulumi.Input[str]] = None,
                 monitoring_schedule_config: Optional[pulumi.Input['MonitoringScheduleMonitoringScheduleConfigArgs']] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        Input properties used for looking up and filtering MonitoringSchedule resources.
        :param pulumi.Input[str] arn: The Amazon Resource Name (ARN) assigned by AWS to this monitoring schedule.
        :param pulumi.Input['MonitoringScheduleMonitoringScheduleConfigArgs'] monitoring_schedule_config: The configuration object that specifies the monitoring schedule and defines the monitoring job. Fields are documented below.
        :param pulumi.Input[str] name: The name of the monitoring schedule. The name must be unique within an AWS Region within an AWS account. If omitted, the provider will assign a random, unique name.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A mapping of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        if arn is not None:
            pulumi.set(__self__, "arn", arn)
        if monitoring_schedule_config is not None:
            pulumi.set(__self__, "monitoring_schedule_config", monitoring_schedule_config)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if tags_all is not None:
            pulumi.set(__self__, "tags_all", tags_all)

    @property
    @pulumi.getter
    def arn(self) -> Optional[pulumi.Input[str]]:
        """
        The Amazon Resource Name (ARN) assigned by AWS to this monitoring schedule.
        """
        return pulumi.get(self, "arn")

    @arn.setter
    def arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "arn", value)

    @property
    @pulumi.getter(name="monitoringScheduleConfig")
    def monitoring_schedule_config(self) -> Optional[pulumi.Input['MonitoringScheduleMonitoringScheduleConfigArgs']]:
        """
        The configuration object that specifies the monitoring schedule and defines the monitoring job. Fields are documented below.
        """
        return pulumi.get(self, "monitoring_schedule_config")

    @monitoring_schedule_config.setter
    def monitoring_schedule_config(self, value: Optional[pulumi.Input['MonitoringScheduleMonitoringScheduleConfigArgs']]):
        pulumi.set(self, "monitoring_schedule_config", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the monitoring schedule. The name must be unique within an AWS Region within an AWS account. If omitted, the provider will assign a random, unique name.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        A mapping of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)

    @property
    @pulumi.getter(name="tagsAll")
    def tags_all(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        return pulumi.get(self, "tags_all")

    @tags_all.setter
    def tags_all(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags_all", value)


class MonitoringSchedule(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 monitoring_schedule_config: Optional[pulumi.Input[pulumi.InputType['MonitoringScheduleMonitoringScheduleConfigArgs']]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 __props__=None):
        """
        Provides a SageMaker monitoring schedule resource.

        ## Example Usage

        Basic usage:

        ```python
        import pulumi
        import pulumi_aws as aws

        test = aws.sagemaker.MonitoringSchedule("test", monitoring_schedule_config=aws.sagemaker.MonitoringScheduleMonitoringScheduleConfigArgs(
            monitoring_job_definition_name=aws_sagemaker_data_quality_job_definition["test"]["name"],
            monitoring_type="DataQuality",
        ))
        ```

        ## Import

        Using `pulumi import`, import monitoring schedules using the `name`. For example:

        ```sh
         $ pulumi import aws:sagemaker/monitoringSchedule:MonitoringSchedule test_monitoring_schedule monitoring-schedule-foo
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[pulumi.InputType['MonitoringScheduleMonitoringScheduleConfigArgs']] monitoring_schedule_config: The configuration object that specifies the monitoring schedule and defines the monitoring job. Fields are documented below.
        :param pulumi.Input[str] name: The name of the monitoring schedule. The name must be unique within an AWS Region within an AWS account. If omitted, the provider will assign a random, unique name.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A mapping of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: MonitoringScheduleArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a SageMaker monitoring schedule resource.

        ## Example Usage

        Basic usage:

        ```python
        import pulumi
        import pulumi_aws as aws

        test = aws.sagemaker.MonitoringSchedule("test", monitoring_schedule_config=aws.sagemaker.MonitoringScheduleMonitoringScheduleConfigArgs(
            monitoring_job_definition_name=aws_sagemaker_data_quality_job_definition["test"]["name"],
            monitoring_type="DataQuality",
        ))
        ```

        ## Import

        Using `pulumi import`, import monitoring schedules using the `name`. For example:

        ```sh
         $ pulumi import aws:sagemaker/monitoringSchedule:MonitoringSchedule test_monitoring_schedule monitoring-schedule-foo
        ```

        :param str resource_name: The name of the resource.
        :param MonitoringScheduleArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(MonitoringScheduleArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 monitoring_schedule_config: Optional[pulumi.Input[pulumi.InputType['MonitoringScheduleMonitoringScheduleConfigArgs']]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = MonitoringScheduleArgs.__new__(MonitoringScheduleArgs)

            if monitoring_schedule_config is None and not opts.urn:
                raise TypeError("Missing required property 'monitoring_schedule_config'")
            __props__.__dict__["monitoring_schedule_config"] = monitoring_schedule_config
            __props__.__dict__["name"] = name
            __props__.__dict__["tags"] = tags
            __props__.__dict__["arn"] = None
            __props__.__dict__["tags_all"] = None
        super(MonitoringSchedule, __self__).__init__(
            'aws:sagemaker/monitoringSchedule:MonitoringSchedule',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            arn: Optional[pulumi.Input[str]] = None,
            monitoring_schedule_config: Optional[pulumi.Input[pulumi.InputType['MonitoringScheduleMonitoringScheduleConfigArgs']]] = None,
            name: Optional[pulumi.Input[str]] = None,
            tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None) -> 'MonitoringSchedule':
        """
        Get an existing MonitoringSchedule resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] arn: The Amazon Resource Name (ARN) assigned by AWS to this monitoring schedule.
        :param pulumi.Input[pulumi.InputType['MonitoringScheduleMonitoringScheduleConfigArgs']] monitoring_schedule_config: The configuration object that specifies the monitoring schedule and defines the monitoring job. Fields are documented below.
        :param pulumi.Input[str] name: The name of the monitoring schedule. The name must be unique within an AWS Region within an AWS account. If omitted, the provider will assign a random, unique name.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A mapping of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _MonitoringScheduleState.__new__(_MonitoringScheduleState)

        __props__.__dict__["arn"] = arn
        __props__.__dict__["monitoring_schedule_config"] = monitoring_schedule_config
        __props__.__dict__["name"] = name
        __props__.__dict__["tags"] = tags
        __props__.__dict__["tags_all"] = tags_all
        return MonitoringSchedule(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def arn(self) -> pulumi.Output[str]:
        """
        The Amazon Resource Name (ARN) assigned by AWS to this monitoring schedule.
        """
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter(name="monitoringScheduleConfig")
    def monitoring_schedule_config(self) -> pulumi.Output['outputs.MonitoringScheduleMonitoringScheduleConfig']:
        """
        The configuration object that specifies the monitoring schedule and defines the monitoring job. Fields are documented below.
        """
        return pulumi.get(self, "monitoring_schedule_config")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name of the monitoring schedule. The name must be unique within an AWS Region within an AWS account. If omitted, the provider will assign a random, unique name.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, str]]]:
        """
        A mapping of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter(name="tagsAll")
    def tags_all(self) -> pulumi.Output[Mapping[str, str]]:
        """
        A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        return pulumi.get(self, "tags_all")


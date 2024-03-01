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

__all__ = ['ScheduledActionArgs', 'ScheduledAction']

@pulumi.input_type
class ScheduledActionArgs:
    def __init__(__self__, *,
                 resource_id: pulumi.Input[str],
                 scalable_dimension: pulumi.Input[str],
                 scalable_target_action: pulumi.Input['ScheduledActionScalableTargetActionArgs'],
                 schedule: pulumi.Input[str],
                 service_namespace: pulumi.Input[str],
                 end_time: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 start_time: Optional[pulumi.Input[str]] = None,
                 timezone: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a ScheduledAction resource.
        :param pulumi.Input[str] resource_id: Identifier of the resource associated with the scheduled action. Documentation can be found in the `ResourceId` parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/application/APIReference/API_PutScheduledAction.html)
        :param pulumi.Input[str] scalable_dimension: Scalable dimension. Documentation can be found in the `ScalableDimension` parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/application/APIReference/API_PutScheduledAction.html) Example: ecs:service:DesiredCount
        :param pulumi.Input['ScheduledActionScalableTargetActionArgs'] scalable_target_action: New minimum and maximum capacity. You can set both values or just one. See below
        :param pulumi.Input[str] schedule: Schedule for this action. The following formats are supported: At expressions - at(yyyy-mm-ddThh:mm:ss), Rate expressions - rate(valueunit), Cron expressions - cron(fields). Times for at expressions and cron expressions are evaluated using the time zone configured in `timezone`. Documentation can be found in the `Timezone` parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/application/APIReference/API_PutScheduledAction.html)
        :param pulumi.Input[str] service_namespace: Namespace of the AWS service. Documentation can be found in the `ServiceNamespace` parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/application/APIReference/API_PutScheduledAction.html) Example: ecs
        :param pulumi.Input[str] end_time: Date and time for the scheduled action to end in RFC 3339 format. The timezone is not affected by the setting of `timezone`.
        :param pulumi.Input[str] name: Name of the scheduled action.
        :param pulumi.Input[str] start_time: Date and time for the scheduled action to start in RFC 3339 format. The timezone is not affected by the setting of `timezone`.
        :param pulumi.Input[str] timezone: Time zone used when setting a scheduled action by using an at or cron expression. Does not affect timezone for `start_time` and `end_time`. Valid values are the [canonical names of the IANA time zones supported by Joda-Time](https://www.joda.org/joda-time/timezones.html), such as `Etc/GMT+9` or `Pacific/Tahiti`. Default is `UTC`.
        """
        pulumi.set(__self__, "resource_id", resource_id)
        pulumi.set(__self__, "scalable_dimension", scalable_dimension)
        pulumi.set(__self__, "scalable_target_action", scalable_target_action)
        pulumi.set(__self__, "schedule", schedule)
        pulumi.set(__self__, "service_namespace", service_namespace)
        if end_time is not None:
            pulumi.set(__self__, "end_time", end_time)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if start_time is not None:
            pulumi.set(__self__, "start_time", start_time)
        if timezone is not None:
            pulumi.set(__self__, "timezone", timezone)

    @property
    @pulumi.getter(name="resourceId")
    def resource_id(self) -> pulumi.Input[str]:
        """
        Identifier of the resource associated with the scheduled action. Documentation can be found in the `ResourceId` parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/application/APIReference/API_PutScheduledAction.html)
        """
        return pulumi.get(self, "resource_id")

    @resource_id.setter
    def resource_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "resource_id", value)

    @property
    @pulumi.getter(name="scalableDimension")
    def scalable_dimension(self) -> pulumi.Input[str]:
        """
        Scalable dimension. Documentation can be found in the `ScalableDimension` parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/application/APIReference/API_PutScheduledAction.html) Example: ecs:service:DesiredCount
        """
        return pulumi.get(self, "scalable_dimension")

    @scalable_dimension.setter
    def scalable_dimension(self, value: pulumi.Input[str]):
        pulumi.set(self, "scalable_dimension", value)

    @property
    @pulumi.getter(name="scalableTargetAction")
    def scalable_target_action(self) -> pulumi.Input['ScheduledActionScalableTargetActionArgs']:
        """
        New minimum and maximum capacity. You can set both values or just one. See below
        """
        return pulumi.get(self, "scalable_target_action")

    @scalable_target_action.setter
    def scalable_target_action(self, value: pulumi.Input['ScheduledActionScalableTargetActionArgs']):
        pulumi.set(self, "scalable_target_action", value)

    @property
    @pulumi.getter
    def schedule(self) -> pulumi.Input[str]:
        """
        Schedule for this action. The following formats are supported: At expressions - at(yyyy-mm-ddThh:mm:ss), Rate expressions - rate(valueunit), Cron expressions - cron(fields). Times for at expressions and cron expressions are evaluated using the time zone configured in `timezone`. Documentation can be found in the `Timezone` parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/application/APIReference/API_PutScheduledAction.html)
        """
        return pulumi.get(self, "schedule")

    @schedule.setter
    def schedule(self, value: pulumi.Input[str]):
        pulumi.set(self, "schedule", value)

    @property
    @pulumi.getter(name="serviceNamespace")
    def service_namespace(self) -> pulumi.Input[str]:
        """
        Namespace of the AWS service. Documentation can be found in the `ServiceNamespace` parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/application/APIReference/API_PutScheduledAction.html) Example: ecs
        """
        return pulumi.get(self, "service_namespace")

    @service_namespace.setter
    def service_namespace(self, value: pulumi.Input[str]):
        pulumi.set(self, "service_namespace", value)

    @property
    @pulumi.getter(name="endTime")
    def end_time(self) -> Optional[pulumi.Input[str]]:
        """
        Date and time for the scheduled action to end in RFC 3339 format. The timezone is not affected by the setting of `timezone`.
        """
        return pulumi.get(self, "end_time")

    @end_time.setter
    def end_time(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "end_time", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the scheduled action.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="startTime")
    def start_time(self) -> Optional[pulumi.Input[str]]:
        """
        Date and time for the scheduled action to start in RFC 3339 format. The timezone is not affected by the setting of `timezone`.
        """
        return pulumi.get(self, "start_time")

    @start_time.setter
    def start_time(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "start_time", value)

    @property
    @pulumi.getter
    def timezone(self) -> Optional[pulumi.Input[str]]:
        """
        Time zone used when setting a scheduled action by using an at or cron expression. Does not affect timezone for `start_time` and `end_time`. Valid values are the [canonical names of the IANA time zones supported by Joda-Time](https://www.joda.org/joda-time/timezones.html), such as `Etc/GMT+9` or `Pacific/Tahiti`. Default is `UTC`.
        """
        return pulumi.get(self, "timezone")

    @timezone.setter
    def timezone(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "timezone", value)


@pulumi.input_type
class _ScheduledActionState:
    def __init__(__self__, *,
                 arn: Optional[pulumi.Input[str]] = None,
                 end_time: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 resource_id: Optional[pulumi.Input[str]] = None,
                 scalable_dimension: Optional[pulumi.Input[str]] = None,
                 scalable_target_action: Optional[pulumi.Input['ScheduledActionScalableTargetActionArgs']] = None,
                 schedule: Optional[pulumi.Input[str]] = None,
                 service_namespace: Optional[pulumi.Input[str]] = None,
                 start_time: Optional[pulumi.Input[str]] = None,
                 timezone: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering ScheduledAction resources.
        :param pulumi.Input[str] arn: ARN of the scheduled action.
        :param pulumi.Input[str] end_time: Date and time for the scheduled action to end in RFC 3339 format. The timezone is not affected by the setting of `timezone`.
        :param pulumi.Input[str] name: Name of the scheduled action.
        :param pulumi.Input[str] resource_id: Identifier of the resource associated with the scheduled action. Documentation can be found in the `ResourceId` parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/application/APIReference/API_PutScheduledAction.html)
        :param pulumi.Input[str] scalable_dimension: Scalable dimension. Documentation can be found in the `ScalableDimension` parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/application/APIReference/API_PutScheduledAction.html) Example: ecs:service:DesiredCount
        :param pulumi.Input['ScheduledActionScalableTargetActionArgs'] scalable_target_action: New minimum and maximum capacity. You can set both values or just one. See below
        :param pulumi.Input[str] schedule: Schedule for this action. The following formats are supported: At expressions - at(yyyy-mm-ddThh:mm:ss), Rate expressions - rate(valueunit), Cron expressions - cron(fields). Times for at expressions and cron expressions are evaluated using the time zone configured in `timezone`. Documentation can be found in the `Timezone` parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/application/APIReference/API_PutScheduledAction.html)
        :param pulumi.Input[str] service_namespace: Namespace of the AWS service. Documentation can be found in the `ServiceNamespace` parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/application/APIReference/API_PutScheduledAction.html) Example: ecs
        :param pulumi.Input[str] start_time: Date and time for the scheduled action to start in RFC 3339 format. The timezone is not affected by the setting of `timezone`.
        :param pulumi.Input[str] timezone: Time zone used when setting a scheduled action by using an at or cron expression. Does not affect timezone for `start_time` and `end_time`. Valid values are the [canonical names of the IANA time zones supported by Joda-Time](https://www.joda.org/joda-time/timezones.html), such as `Etc/GMT+9` or `Pacific/Tahiti`. Default is `UTC`.
        """
        if arn is not None:
            pulumi.set(__self__, "arn", arn)
        if end_time is not None:
            pulumi.set(__self__, "end_time", end_time)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if resource_id is not None:
            pulumi.set(__self__, "resource_id", resource_id)
        if scalable_dimension is not None:
            pulumi.set(__self__, "scalable_dimension", scalable_dimension)
        if scalable_target_action is not None:
            pulumi.set(__self__, "scalable_target_action", scalable_target_action)
        if schedule is not None:
            pulumi.set(__self__, "schedule", schedule)
        if service_namespace is not None:
            pulumi.set(__self__, "service_namespace", service_namespace)
        if start_time is not None:
            pulumi.set(__self__, "start_time", start_time)
        if timezone is not None:
            pulumi.set(__self__, "timezone", timezone)

    @property
    @pulumi.getter
    def arn(self) -> Optional[pulumi.Input[str]]:
        """
        ARN of the scheduled action.
        """
        return pulumi.get(self, "arn")

    @arn.setter
    def arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "arn", value)

    @property
    @pulumi.getter(name="endTime")
    def end_time(self) -> Optional[pulumi.Input[str]]:
        """
        Date and time for the scheduled action to end in RFC 3339 format. The timezone is not affected by the setting of `timezone`.
        """
        return pulumi.get(self, "end_time")

    @end_time.setter
    def end_time(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "end_time", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the scheduled action.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="resourceId")
    def resource_id(self) -> Optional[pulumi.Input[str]]:
        """
        Identifier of the resource associated with the scheduled action. Documentation can be found in the `ResourceId` parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/application/APIReference/API_PutScheduledAction.html)
        """
        return pulumi.get(self, "resource_id")

    @resource_id.setter
    def resource_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "resource_id", value)

    @property
    @pulumi.getter(name="scalableDimension")
    def scalable_dimension(self) -> Optional[pulumi.Input[str]]:
        """
        Scalable dimension. Documentation can be found in the `ScalableDimension` parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/application/APIReference/API_PutScheduledAction.html) Example: ecs:service:DesiredCount
        """
        return pulumi.get(self, "scalable_dimension")

    @scalable_dimension.setter
    def scalable_dimension(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "scalable_dimension", value)

    @property
    @pulumi.getter(name="scalableTargetAction")
    def scalable_target_action(self) -> Optional[pulumi.Input['ScheduledActionScalableTargetActionArgs']]:
        """
        New minimum and maximum capacity. You can set both values or just one. See below
        """
        return pulumi.get(self, "scalable_target_action")

    @scalable_target_action.setter
    def scalable_target_action(self, value: Optional[pulumi.Input['ScheduledActionScalableTargetActionArgs']]):
        pulumi.set(self, "scalable_target_action", value)

    @property
    @pulumi.getter
    def schedule(self) -> Optional[pulumi.Input[str]]:
        """
        Schedule for this action. The following formats are supported: At expressions - at(yyyy-mm-ddThh:mm:ss), Rate expressions - rate(valueunit), Cron expressions - cron(fields). Times for at expressions and cron expressions are evaluated using the time zone configured in `timezone`. Documentation can be found in the `Timezone` parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/application/APIReference/API_PutScheduledAction.html)
        """
        return pulumi.get(self, "schedule")

    @schedule.setter
    def schedule(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "schedule", value)

    @property
    @pulumi.getter(name="serviceNamespace")
    def service_namespace(self) -> Optional[pulumi.Input[str]]:
        """
        Namespace of the AWS service. Documentation can be found in the `ServiceNamespace` parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/application/APIReference/API_PutScheduledAction.html) Example: ecs
        """
        return pulumi.get(self, "service_namespace")

    @service_namespace.setter
    def service_namespace(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "service_namespace", value)

    @property
    @pulumi.getter(name="startTime")
    def start_time(self) -> Optional[pulumi.Input[str]]:
        """
        Date and time for the scheduled action to start in RFC 3339 format. The timezone is not affected by the setting of `timezone`.
        """
        return pulumi.get(self, "start_time")

    @start_time.setter
    def start_time(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "start_time", value)

    @property
    @pulumi.getter
    def timezone(self) -> Optional[pulumi.Input[str]]:
        """
        Time zone used when setting a scheduled action by using an at or cron expression. Does not affect timezone for `start_time` and `end_time`. Valid values are the [canonical names of the IANA time zones supported by Joda-Time](https://www.joda.org/joda-time/timezones.html), such as `Etc/GMT+9` or `Pacific/Tahiti`. Default is `UTC`.
        """
        return pulumi.get(self, "timezone")

    @timezone.setter
    def timezone(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "timezone", value)


class ScheduledAction(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 end_time: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 resource_id: Optional[pulumi.Input[str]] = None,
                 scalable_dimension: Optional[pulumi.Input[str]] = None,
                 scalable_target_action: Optional[pulumi.Input[pulumi.InputType['ScheduledActionScalableTargetActionArgs']]] = None,
                 schedule: Optional[pulumi.Input[str]] = None,
                 service_namespace: Optional[pulumi.Input[str]] = None,
                 start_time: Optional[pulumi.Input[str]] = None,
                 timezone: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides an Application AutoScaling ScheduledAction resource.

        ## Example Usage
        ### DynamoDB Table Autoscaling

        ```python
        import pulumi
        import pulumi_aws as aws

        dynamodb = aws.appautoscaling.Target("dynamodb",
            max_capacity=100,
            min_capacity=5,
            resource_id="table/tableName",
            scalable_dimension="dynamodb:table:ReadCapacityUnits",
            service_namespace="dynamodb")
        dynamodb_scheduled_action = aws.appautoscaling.ScheduledAction("dynamodb",
            name="dynamodb",
            service_namespace=dynamodb.service_namespace,
            resource_id=dynamodb.resource_id,
            scalable_dimension=dynamodb.scalable_dimension,
            schedule="at(2006-01-02T15:04:05)",
            scalable_target_action=aws.appautoscaling.ScheduledActionScalableTargetActionArgs(
                min_capacity=1,
                max_capacity=200,
            ))
        ```
        ### ECS Service Autoscaling

        ```python
        import pulumi
        import pulumi_aws as aws

        ecs = aws.appautoscaling.Target("ecs",
            max_capacity=4,
            min_capacity=1,
            resource_id="service/clusterName/serviceName",
            scalable_dimension="ecs:service:DesiredCount",
            service_namespace="ecs")
        ecs_scheduled_action = aws.appautoscaling.ScheduledAction("ecs",
            name="ecs",
            service_namespace=ecs.service_namespace,
            resource_id=ecs.resource_id,
            scalable_dimension=ecs.scalable_dimension,
            schedule="at(2006-01-02T15:04:05)",
            scalable_target_action=aws.appautoscaling.ScheduledActionScalableTargetActionArgs(
                min_capacity=1,
                max_capacity=10,
            ))
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] end_time: Date and time for the scheduled action to end in RFC 3339 format. The timezone is not affected by the setting of `timezone`.
        :param pulumi.Input[str] name: Name of the scheduled action.
        :param pulumi.Input[str] resource_id: Identifier of the resource associated with the scheduled action. Documentation can be found in the `ResourceId` parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/application/APIReference/API_PutScheduledAction.html)
        :param pulumi.Input[str] scalable_dimension: Scalable dimension. Documentation can be found in the `ScalableDimension` parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/application/APIReference/API_PutScheduledAction.html) Example: ecs:service:DesiredCount
        :param pulumi.Input[pulumi.InputType['ScheduledActionScalableTargetActionArgs']] scalable_target_action: New minimum and maximum capacity. You can set both values or just one. See below
        :param pulumi.Input[str] schedule: Schedule for this action. The following formats are supported: At expressions - at(yyyy-mm-ddThh:mm:ss), Rate expressions - rate(valueunit), Cron expressions - cron(fields). Times for at expressions and cron expressions are evaluated using the time zone configured in `timezone`. Documentation can be found in the `Timezone` parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/application/APIReference/API_PutScheduledAction.html)
        :param pulumi.Input[str] service_namespace: Namespace of the AWS service. Documentation can be found in the `ServiceNamespace` parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/application/APIReference/API_PutScheduledAction.html) Example: ecs
        :param pulumi.Input[str] start_time: Date and time for the scheduled action to start in RFC 3339 format. The timezone is not affected by the setting of `timezone`.
        :param pulumi.Input[str] timezone: Time zone used when setting a scheduled action by using an at or cron expression. Does not affect timezone for `start_time` and `end_time`. Valid values are the [canonical names of the IANA time zones supported by Joda-Time](https://www.joda.org/joda-time/timezones.html), such as `Etc/GMT+9` or `Pacific/Tahiti`. Default is `UTC`.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ScheduledActionArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides an Application AutoScaling ScheduledAction resource.

        ## Example Usage
        ### DynamoDB Table Autoscaling

        ```python
        import pulumi
        import pulumi_aws as aws

        dynamodb = aws.appautoscaling.Target("dynamodb",
            max_capacity=100,
            min_capacity=5,
            resource_id="table/tableName",
            scalable_dimension="dynamodb:table:ReadCapacityUnits",
            service_namespace="dynamodb")
        dynamodb_scheduled_action = aws.appautoscaling.ScheduledAction("dynamodb",
            name="dynamodb",
            service_namespace=dynamodb.service_namespace,
            resource_id=dynamodb.resource_id,
            scalable_dimension=dynamodb.scalable_dimension,
            schedule="at(2006-01-02T15:04:05)",
            scalable_target_action=aws.appautoscaling.ScheduledActionScalableTargetActionArgs(
                min_capacity=1,
                max_capacity=200,
            ))
        ```
        ### ECS Service Autoscaling

        ```python
        import pulumi
        import pulumi_aws as aws

        ecs = aws.appautoscaling.Target("ecs",
            max_capacity=4,
            min_capacity=1,
            resource_id="service/clusterName/serviceName",
            scalable_dimension="ecs:service:DesiredCount",
            service_namespace="ecs")
        ecs_scheduled_action = aws.appautoscaling.ScheduledAction("ecs",
            name="ecs",
            service_namespace=ecs.service_namespace,
            resource_id=ecs.resource_id,
            scalable_dimension=ecs.scalable_dimension,
            schedule="at(2006-01-02T15:04:05)",
            scalable_target_action=aws.appautoscaling.ScheduledActionScalableTargetActionArgs(
                min_capacity=1,
                max_capacity=10,
            ))
        ```

        :param str resource_name: The name of the resource.
        :param ScheduledActionArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ScheduledActionArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 end_time: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 resource_id: Optional[pulumi.Input[str]] = None,
                 scalable_dimension: Optional[pulumi.Input[str]] = None,
                 scalable_target_action: Optional[pulumi.Input[pulumi.InputType['ScheduledActionScalableTargetActionArgs']]] = None,
                 schedule: Optional[pulumi.Input[str]] = None,
                 service_namespace: Optional[pulumi.Input[str]] = None,
                 start_time: Optional[pulumi.Input[str]] = None,
                 timezone: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ScheduledActionArgs.__new__(ScheduledActionArgs)

            __props__.__dict__["end_time"] = end_time
            __props__.__dict__["name"] = name
            if resource_id is None and not opts.urn:
                raise TypeError("Missing required property 'resource_id'")
            __props__.__dict__["resource_id"] = resource_id
            if scalable_dimension is None and not opts.urn:
                raise TypeError("Missing required property 'scalable_dimension'")
            __props__.__dict__["scalable_dimension"] = scalable_dimension
            if scalable_target_action is None and not opts.urn:
                raise TypeError("Missing required property 'scalable_target_action'")
            __props__.__dict__["scalable_target_action"] = scalable_target_action
            if schedule is None and not opts.urn:
                raise TypeError("Missing required property 'schedule'")
            __props__.__dict__["schedule"] = schedule
            if service_namespace is None and not opts.urn:
                raise TypeError("Missing required property 'service_namespace'")
            __props__.__dict__["service_namespace"] = service_namespace
            __props__.__dict__["start_time"] = start_time
            __props__.__dict__["timezone"] = timezone
            __props__.__dict__["arn"] = None
        super(ScheduledAction, __self__).__init__(
            'aws:appautoscaling/scheduledAction:ScheduledAction',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            arn: Optional[pulumi.Input[str]] = None,
            end_time: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            resource_id: Optional[pulumi.Input[str]] = None,
            scalable_dimension: Optional[pulumi.Input[str]] = None,
            scalable_target_action: Optional[pulumi.Input[pulumi.InputType['ScheduledActionScalableTargetActionArgs']]] = None,
            schedule: Optional[pulumi.Input[str]] = None,
            service_namespace: Optional[pulumi.Input[str]] = None,
            start_time: Optional[pulumi.Input[str]] = None,
            timezone: Optional[pulumi.Input[str]] = None) -> 'ScheduledAction':
        """
        Get an existing ScheduledAction resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] arn: ARN of the scheduled action.
        :param pulumi.Input[str] end_time: Date and time for the scheduled action to end in RFC 3339 format. The timezone is not affected by the setting of `timezone`.
        :param pulumi.Input[str] name: Name of the scheduled action.
        :param pulumi.Input[str] resource_id: Identifier of the resource associated with the scheduled action. Documentation can be found in the `ResourceId` parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/application/APIReference/API_PutScheduledAction.html)
        :param pulumi.Input[str] scalable_dimension: Scalable dimension. Documentation can be found in the `ScalableDimension` parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/application/APIReference/API_PutScheduledAction.html) Example: ecs:service:DesiredCount
        :param pulumi.Input[pulumi.InputType['ScheduledActionScalableTargetActionArgs']] scalable_target_action: New minimum and maximum capacity. You can set both values or just one. See below
        :param pulumi.Input[str] schedule: Schedule for this action. The following formats are supported: At expressions - at(yyyy-mm-ddThh:mm:ss), Rate expressions - rate(valueunit), Cron expressions - cron(fields). Times for at expressions and cron expressions are evaluated using the time zone configured in `timezone`. Documentation can be found in the `Timezone` parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/application/APIReference/API_PutScheduledAction.html)
        :param pulumi.Input[str] service_namespace: Namespace of the AWS service. Documentation can be found in the `ServiceNamespace` parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/application/APIReference/API_PutScheduledAction.html) Example: ecs
        :param pulumi.Input[str] start_time: Date and time for the scheduled action to start in RFC 3339 format. The timezone is not affected by the setting of `timezone`.
        :param pulumi.Input[str] timezone: Time zone used when setting a scheduled action by using an at or cron expression. Does not affect timezone for `start_time` and `end_time`. Valid values are the [canonical names of the IANA time zones supported by Joda-Time](https://www.joda.org/joda-time/timezones.html), such as `Etc/GMT+9` or `Pacific/Tahiti`. Default is `UTC`.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ScheduledActionState.__new__(_ScheduledActionState)

        __props__.__dict__["arn"] = arn
        __props__.__dict__["end_time"] = end_time
        __props__.__dict__["name"] = name
        __props__.__dict__["resource_id"] = resource_id
        __props__.__dict__["scalable_dimension"] = scalable_dimension
        __props__.__dict__["scalable_target_action"] = scalable_target_action
        __props__.__dict__["schedule"] = schedule
        __props__.__dict__["service_namespace"] = service_namespace
        __props__.__dict__["start_time"] = start_time
        __props__.__dict__["timezone"] = timezone
        return ScheduledAction(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def arn(self) -> pulumi.Output[str]:
        """
        ARN of the scheduled action.
        """
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter(name="endTime")
    def end_time(self) -> pulumi.Output[Optional[str]]:
        """
        Date and time for the scheduled action to end in RFC 3339 format. The timezone is not affected by the setting of `timezone`.
        """
        return pulumi.get(self, "end_time")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Name of the scheduled action.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="resourceId")
    def resource_id(self) -> pulumi.Output[str]:
        """
        Identifier of the resource associated with the scheduled action. Documentation can be found in the `ResourceId` parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/application/APIReference/API_PutScheduledAction.html)
        """
        return pulumi.get(self, "resource_id")

    @property
    @pulumi.getter(name="scalableDimension")
    def scalable_dimension(self) -> pulumi.Output[str]:
        """
        Scalable dimension. Documentation can be found in the `ScalableDimension` parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/application/APIReference/API_PutScheduledAction.html) Example: ecs:service:DesiredCount
        """
        return pulumi.get(self, "scalable_dimension")

    @property
    @pulumi.getter(name="scalableTargetAction")
    def scalable_target_action(self) -> pulumi.Output['outputs.ScheduledActionScalableTargetAction']:
        """
        New minimum and maximum capacity. You can set both values or just one. See below
        """
        return pulumi.get(self, "scalable_target_action")

    @property
    @pulumi.getter
    def schedule(self) -> pulumi.Output[str]:
        """
        Schedule for this action. The following formats are supported: At expressions - at(yyyy-mm-ddThh:mm:ss), Rate expressions - rate(valueunit), Cron expressions - cron(fields). Times for at expressions and cron expressions are evaluated using the time zone configured in `timezone`. Documentation can be found in the `Timezone` parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/application/APIReference/API_PutScheduledAction.html)
        """
        return pulumi.get(self, "schedule")

    @property
    @pulumi.getter(name="serviceNamespace")
    def service_namespace(self) -> pulumi.Output[str]:
        """
        Namespace of the AWS service. Documentation can be found in the `ServiceNamespace` parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/application/APIReference/API_PutScheduledAction.html) Example: ecs
        """
        return pulumi.get(self, "service_namespace")

    @property
    @pulumi.getter(name="startTime")
    def start_time(self) -> pulumi.Output[Optional[str]]:
        """
        Date and time for the scheduled action to start in RFC 3339 format. The timezone is not affected by the setting of `timezone`.
        """
        return pulumi.get(self, "start_time")

    @property
    @pulumi.getter
    def timezone(self) -> pulumi.Output[Optional[str]]:
        """
        Time zone used when setting a scheduled action by using an at or cron expression. Does not affect timezone for `start_time` and `end_time`. Valid values are the [canonical names of the IANA time zones supported by Joda-Time](https://www.joda.org/joda-time/timezones.html), such as `Etc/GMT+9` or `Pacific/Tahiti`. Default is `UTC`.
        """
        return pulumi.get(self, "timezone")


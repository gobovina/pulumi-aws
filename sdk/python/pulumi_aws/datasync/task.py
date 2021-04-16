# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities
from . import outputs
from ._inputs import *

__all__ = ['TaskArgs', 'Task']

@pulumi.input_type
class TaskArgs:
    def __init__(__self__, *,
                 destination_location_arn: pulumi.Input[str],
                 source_location_arn: pulumi.Input[str],
                 cloudwatch_log_group_arn: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 options: Optional[pulumi.Input['TaskOptionsArgs']] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        The set of arguments for constructing a Task resource.
        :param pulumi.Input[str] destination_location_arn: Amazon Resource Name (ARN) of destination DataSync Location.
        :param pulumi.Input[str] source_location_arn: Amazon Resource Name (ARN) of source DataSync Location.
        :param pulumi.Input[str] cloudwatch_log_group_arn: Amazon Resource Name (ARN) of the CloudWatch Log Group that is used to monitor and log events in the sync task.
        :param pulumi.Input[str] name: Name of the DataSync Task.
        :param pulumi.Input['TaskOptionsArgs'] options: Configuration block containing option that controls the default behavior when you start an execution of this DataSync Task. For each individual task execution, you can override these options by specifying an overriding configuration in those executions.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value pairs of resource tags to assign to the DataSync Task.
        """
        pulumi.set(__self__, "destination_location_arn", destination_location_arn)
        pulumi.set(__self__, "source_location_arn", source_location_arn)
        if cloudwatch_log_group_arn is not None:
            pulumi.set(__self__, "cloudwatch_log_group_arn", cloudwatch_log_group_arn)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if options is not None:
            pulumi.set(__self__, "options", options)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter(name="destinationLocationArn")
    def destination_location_arn(self) -> pulumi.Input[str]:
        """
        Amazon Resource Name (ARN) of destination DataSync Location.
        """
        return pulumi.get(self, "destination_location_arn")

    @destination_location_arn.setter
    def destination_location_arn(self, value: pulumi.Input[str]):
        pulumi.set(self, "destination_location_arn", value)

    @property
    @pulumi.getter(name="sourceLocationArn")
    def source_location_arn(self) -> pulumi.Input[str]:
        """
        Amazon Resource Name (ARN) of source DataSync Location.
        """
        return pulumi.get(self, "source_location_arn")

    @source_location_arn.setter
    def source_location_arn(self, value: pulumi.Input[str]):
        pulumi.set(self, "source_location_arn", value)

    @property
    @pulumi.getter(name="cloudwatchLogGroupArn")
    def cloudwatch_log_group_arn(self) -> Optional[pulumi.Input[str]]:
        """
        Amazon Resource Name (ARN) of the CloudWatch Log Group that is used to monitor and log events in the sync task.
        """
        return pulumi.get(self, "cloudwatch_log_group_arn")

    @cloudwatch_log_group_arn.setter
    def cloudwatch_log_group_arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "cloudwatch_log_group_arn", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the DataSync Task.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def options(self) -> Optional[pulumi.Input['TaskOptionsArgs']]:
        """
        Configuration block containing option that controls the default behavior when you start an execution of this DataSync Task. For each individual task execution, you can override these options by specifying an overriding configuration in those executions.
        """
        return pulumi.get(self, "options")

    @options.setter
    def options(self, value: Optional[pulumi.Input['TaskOptionsArgs']]):
        pulumi.set(self, "options", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Key-value pairs of resource tags to assign to the DataSync Task.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)


@pulumi.input_type
class _TaskState:
    def __init__(__self__, *,
                 arn: Optional[pulumi.Input[str]] = None,
                 cloudwatch_log_group_arn: Optional[pulumi.Input[str]] = None,
                 destination_location_arn: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 options: Optional[pulumi.Input['TaskOptionsArgs']] = None,
                 source_location_arn: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        Input properties used for looking up and filtering Task resources.
        :param pulumi.Input[str] arn: Amazon Resource Name (ARN) of the DataSync Task.
        :param pulumi.Input[str] cloudwatch_log_group_arn: Amazon Resource Name (ARN) of the CloudWatch Log Group that is used to monitor and log events in the sync task.
        :param pulumi.Input[str] destination_location_arn: Amazon Resource Name (ARN) of destination DataSync Location.
        :param pulumi.Input[str] name: Name of the DataSync Task.
        :param pulumi.Input['TaskOptionsArgs'] options: Configuration block containing option that controls the default behavior when you start an execution of this DataSync Task. For each individual task execution, you can override these options by specifying an overriding configuration in those executions.
        :param pulumi.Input[str] source_location_arn: Amazon Resource Name (ARN) of source DataSync Location.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value pairs of resource tags to assign to the DataSync Task.
        """
        if arn is not None:
            pulumi.set(__self__, "arn", arn)
        if cloudwatch_log_group_arn is not None:
            pulumi.set(__self__, "cloudwatch_log_group_arn", cloudwatch_log_group_arn)
        if destination_location_arn is not None:
            pulumi.set(__self__, "destination_location_arn", destination_location_arn)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if options is not None:
            pulumi.set(__self__, "options", options)
        if source_location_arn is not None:
            pulumi.set(__self__, "source_location_arn", source_location_arn)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter
    def arn(self) -> Optional[pulumi.Input[str]]:
        """
        Amazon Resource Name (ARN) of the DataSync Task.
        """
        return pulumi.get(self, "arn")

    @arn.setter
    def arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "arn", value)

    @property
    @pulumi.getter(name="cloudwatchLogGroupArn")
    def cloudwatch_log_group_arn(self) -> Optional[pulumi.Input[str]]:
        """
        Amazon Resource Name (ARN) of the CloudWatch Log Group that is used to monitor and log events in the sync task.
        """
        return pulumi.get(self, "cloudwatch_log_group_arn")

    @cloudwatch_log_group_arn.setter
    def cloudwatch_log_group_arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "cloudwatch_log_group_arn", value)

    @property
    @pulumi.getter(name="destinationLocationArn")
    def destination_location_arn(self) -> Optional[pulumi.Input[str]]:
        """
        Amazon Resource Name (ARN) of destination DataSync Location.
        """
        return pulumi.get(self, "destination_location_arn")

    @destination_location_arn.setter
    def destination_location_arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "destination_location_arn", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the DataSync Task.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def options(self) -> Optional[pulumi.Input['TaskOptionsArgs']]:
        """
        Configuration block containing option that controls the default behavior when you start an execution of this DataSync Task. For each individual task execution, you can override these options by specifying an overriding configuration in those executions.
        """
        return pulumi.get(self, "options")

    @options.setter
    def options(self, value: Optional[pulumi.Input['TaskOptionsArgs']]):
        pulumi.set(self, "options", value)

    @property
    @pulumi.getter(name="sourceLocationArn")
    def source_location_arn(self) -> Optional[pulumi.Input[str]]:
        """
        Amazon Resource Name (ARN) of source DataSync Location.
        """
        return pulumi.get(self, "source_location_arn")

    @source_location_arn.setter
    def source_location_arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "source_location_arn", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Key-value pairs of resource tags to assign to the DataSync Task.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)


class Task(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 cloudwatch_log_group_arn: Optional[pulumi.Input[str]] = None,
                 destination_location_arn: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 options: Optional[pulumi.Input[pulumi.InputType['TaskOptionsArgs']]] = None,
                 source_location_arn: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 __props__=None):
        """
        Manages an AWS DataSync Task, which represents a configuration for synchronization. Starting an execution of these DataSync Tasks (actually synchronizing files) is performed outside of this resource.

        ## Import

        `aws_datasync_task` can be imported by using the DataSync Task Amazon Resource Name (ARN), e.g.

        ```sh
         $ pulumi import aws:datasync/task:Task example arn:aws:datasync:us-east-1:123456789012:task/task-12345678901234567
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] cloudwatch_log_group_arn: Amazon Resource Name (ARN) of the CloudWatch Log Group that is used to monitor and log events in the sync task.
        :param pulumi.Input[str] destination_location_arn: Amazon Resource Name (ARN) of destination DataSync Location.
        :param pulumi.Input[str] name: Name of the DataSync Task.
        :param pulumi.Input[pulumi.InputType['TaskOptionsArgs']] options: Configuration block containing option that controls the default behavior when you start an execution of this DataSync Task. For each individual task execution, you can override these options by specifying an overriding configuration in those executions.
        :param pulumi.Input[str] source_location_arn: Amazon Resource Name (ARN) of source DataSync Location.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value pairs of resource tags to assign to the DataSync Task.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: TaskArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages an AWS DataSync Task, which represents a configuration for synchronization. Starting an execution of these DataSync Tasks (actually synchronizing files) is performed outside of this resource.

        ## Import

        `aws_datasync_task` can be imported by using the DataSync Task Amazon Resource Name (ARN), e.g.

        ```sh
         $ pulumi import aws:datasync/task:Task example arn:aws:datasync:us-east-1:123456789012:task/task-12345678901234567
        ```

        :param str resource_name: The name of the resource.
        :param TaskArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(TaskArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 cloudwatch_log_group_arn: Optional[pulumi.Input[str]] = None,
                 destination_location_arn: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 options: Optional[pulumi.Input[pulumi.InputType['TaskOptionsArgs']]] = None,
                 source_location_arn: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
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
            __props__ = TaskArgs.__new__(TaskArgs)

            __props__.__dict__["cloudwatch_log_group_arn"] = cloudwatch_log_group_arn
            if destination_location_arn is None and not opts.urn:
                raise TypeError("Missing required property 'destination_location_arn'")
            __props__.__dict__["destination_location_arn"] = destination_location_arn
            __props__.__dict__["name"] = name
            __props__.__dict__["options"] = options
            if source_location_arn is None and not opts.urn:
                raise TypeError("Missing required property 'source_location_arn'")
            __props__.__dict__["source_location_arn"] = source_location_arn
            __props__.__dict__["tags"] = tags
            __props__.__dict__["arn"] = None
        super(Task, __self__).__init__(
            'aws:datasync/task:Task',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            arn: Optional[pulumi.Input[str]] = None,
            cloudwatch_log_group_arn: Optional[pulumi.Input[str]] = None,
            destination_location_arn: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            options: Optional[pulumi.Input[pulumi.InputType['TaskOptionsArgs']]] = None,
            source_location_arn: Optional[pulumi.Input[str]] = None,
            tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None) -> 'Task':
        """
        Get an existing Task resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] arn: Amazon Resource Name (ARN) of the DataSync Task.
        :param pulumi.Input[str] cloudwatch_log_group_arn: Amazon Resource Name (ARN) of the CloudWatch Log Group that is used to monitor and log events in the sync task.
        :param pulumi.Input[str] destination_location_arn: Amazon Resource Name (ARN) of destination DataSync Location.
        :param pulumi.Input[str] name: Name of the DataSync Task.
        :param pulumi.Input[pulumi.InputType['TaskOptionsArgs']] options: Configuration block containing option that controls the default behavior when you start an execution of this DataSync Task. For each individual task execution, you can override these options by specifying an overriding configuration in those executions.
        :param pulumi.Input[str] source_location_arn: Amazon Resource Name (ARN) of source DataSync Location.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value pairs of resource tags to assign to the DataSync Task.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _TaskState.__new__(_TaskState)

        __props__.__dict__["arn"] = arn
        __props__.__dict__["cloudwatch_log_group_arn"] = cloudwatch_log_group_arn
        __props__.__dict__["destination_location_arn"] = destination_location_arn
        __props__.__dict__["name"] = name
        __props__.__dict__["options"] = options
        __props__.__dict__["source_location_arn"] = source_location_arn
        __props__.__dict__["tags"] = tags
        return Task(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def arn(self) -> pulumi.Output[str]:
        """
        Amazon Resource Name (ARN) of the DataSync Task.
        """
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter(name="cloudwatchLogGroupArn")
    def cloudwatch_log_group_arn(self) -> pulumi.Output[Optional[str]]:
        """
        Amazon Resource Name (ARN) of the CloudWatch Log Group that is used to monitor and log events in the sync task.
        """
        return pulumi.get(self, "cloudwatch_log_group_arn")

    @property
    @pulumi.getter(name="destinationLocationArn")
    def destination_location_arn(self) -> pulumi.Output[str]:
        """
        Amazon Resource Name (ARN) of destination DataSync Location.
        """
        return pulumi.get(self, "destination_location_arn")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Name of the DataSync Task.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def options(self) -> pulumi.Output[Optional['outputs.TaskOptions']]:
        """
        Configuration block containing option that controls the default behavior when you start an execution of this DataSync Task. For each individual task execution, you can override these options by specifying an overriding configuration in those executions.
        """
        return pulumi.get(self, "options")

    @property
    @pulumi.getter(name="sourceLocationArn")
    def source_location_arn(self) -> pulumi.Output[str]:
        """
        Amazon Resource Name (ARN) of source DataSync Location.
        """
        return pulumi.get(self, "source_location_arn")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, str]]]:
        """
        Key-value pairs of resource tags to assign to the DataSync Task.
        """
        return pulumi.get(self, "tags")


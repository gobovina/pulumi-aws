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

__all__ = ['HoursOfOperationArgs', 'HoursOfOperation']

@pulumi.input_type
class HoursOfOperationArgs:
    def __init__(__self__, *,
                 configs: pulumi.Input[Sequence[pulumi.Input['HoursOfOperationConfigArgs']]],
                 instance_id: pulumi.Input[str],
                 time_zone: pulumi.Input[str],
                 description: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        The set of arguments for constructing a HoursOfOperation resource.
        :param pulumi.Input[Sequence[pulumi.Input['HoursOfOperationConfigArgs']]] configs: One or more config blocks which define the configuration information for the hours of operation: day, start time, and end time . Config blocks are documented below.
        :param pulumi.Input[str] instance_id: Specifies the identifier of the hosting Amazon Connect Instance.
        :param pulumi.Input[str] time_zone: Specifies the time zone of the Hours of Operation.
        :param pulumi.Input[str] description: Specifies the description of the Hours of Operation.
        :param pulumi.Input[str] name: Specifies the name of the Hours of Operation.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Tags to apply to the Hours of Operation. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        pulumi.set(__self__, "configs", configs)
        pulumi.set(__self__, "instance_id", instance_id)
        pulumi.set(__self__, "time_zone", time_zone)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter
    def configs(self) -> pulumi.Input[Sequence[pulumi.Input['HoursOfOperationConfigArgs']]]:
        """
        One or more config blocks which define the configuration information for the hours of operation: day, start time, and end time . Config blocks are documented below.
        """
        return pulumi.get(self, "configs")

    @configs.setter
    def configs(self, value: pulumi.Input[Sequence[pulumi.Input['HoursOfOperationConfigArgs']]]):
        pulumi.set(self, "configs", value)

    @property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> pulumi.Input[str]:
        """
        Specifies the identifier of the hosting Amazon Connect Instance.
        """
        return pulumi.get(self, "instance_id")

    @instance_id.setter
    def instance_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "instance_id", value)

    @property
    @pulumi.getter(name="timeZone")
    def time_zone(self) -> pulumi.Input[str]:
        """
        Specifies the time zone of the Hours of Operation.
        """
        return pulumi.get(self, "time_zone")

    @time_zone.setter
    def time_zone(self, value: pulumi.Input[str]):
        pulumi.set(self, "time_zone", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the description of the Hours of Operation.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the name of the Hours of Operation.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Tags to apply to the Hours of Operation. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)


@pulumi.input_type
class _HoursOfOperationState:
    def __init__(__self__, *,
                 arn: Optional[pulumi.Input[str]] = None,
                 configs: Optional[pulumi.Input[Sequence[pulumi.Input['HoursOfOperationConfigArgs']]]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 hours_of_operation_id: Optional[pulumi.Input[str]] = None,
                 instance_id: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 time_zone: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering HoursOfOperation resources.
        :param pulumi.Input[str] arn: The Amazon Resource Name (ARN) of the Hours of Operation.
        :param pulumi.Input[Sequence[pulumi.Input['HoursOfOperationConfigArgs']]] configs: One or more config blocks which define the configuration information for the hours of operation: day, start time, and end time . Config blocks are documented below.
        :param pulumi.Input[str] description: Specifies the description of the Hours of Operation.
        :param pulumi.Input[str] hours_of_operation_id: The identifier for the hours of operation.
        :param pulumi.Input[str] instance_id: Specifies the identifier of the hosting Amazon Connect Instance.
        :param pulumi.Input[str] name: Specifies the name of the Hours of Operation.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Tags to apply to the Hours of Operation. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        :param pulumi.Input[str] time_zone: Specifies the time zone of the Hours of Operation.
        """
        if arn is not None:
            pulumi.set(__self__, "arn", arn)
        if configs is not None:
            pulumi.set(__self__, "configs", configs)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if hours_of_operation_id is not None:
            pulumi.set(__self__, "hours_of_operation_id", hours_of_operation_id)
        if instance_id is not None:
            pulumi.set(__self__, "instance_id", instance_id)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if tags_all is not None:
            warnings.warn("""Please use `tags` instead.""", DeprecationWarning)
            pulumi.log.warn("""tags_all is deprecated: Please use `tags` instead.""")
        if tags_all is not None:
            pulumi.set(__self__, "tags_all", tags_all)
        if time_zone is not None:
            pulumi.set(__self__, "time_zone", time_zone)

    @property
    @pulumi.getter
    def arn(self) -> Optional[pulumi.Input[str]]:
        """
        The Amazon Resource Name (ARN) of the Hours of Operation.
        """
        return pulumi.get(self, "arn")

    @arn.setter
    def arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "arn", value)

    @property
    @pulumi.getter
    def configs(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['HoursOfOperationConfigArgs']]]]:
        """
        One or more config blocks which define the configuration information for the hours of operation: day, start time, and end time . Config blocks are documented below.
        """
        return pulumi.get(self, "configs")

    @configs.setter
    def configs(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['HoursOfOperationConfigArgs']]]]):
        pulumi.set(self, "configs", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the description of the Hours of Operation.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="hoursOfOperationId")
    def hours_of_operation_id(self) -> Optional[pulumi.Input[str]]:
        """
        The identifier for the hours of operation.
        """
        return pulumi.get(self, "hours_of_operation_id")

    @hours_of_operation_id.setter
    def hours_of_operation_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "hours_of_operation_id", value)

    @property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the identifier of the hosting Amazon Connect Instance.
        """
        return pulumi.get(self, "instance_id")

    @instance_id.setter
    def instance_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "instance_id", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the name of the Hours of Operation.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Tags to apply to the Hours of Operation. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
        warnings.warn("""Please use `tags` instead.""", DeprecationWarning)
        pulumi.log.warn("""tags_all is deprecated: Please use `tags` instead.""")

        return pulumi.get(self, "tags_all")

    @tags_all.setter
    def tags_all(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags_all", value)

    @property
    @pulumi.getter(name="timeZone")
    def time_zone(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the time zone of the Hours of Operation.
        """
        return pulumi.get(self, "time_zone")

    @time_zone.setter
    def time_zone(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "time_zone", value)


class HoursOfOperation(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 configs: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['HoursOfOperationConfigArgs']]]]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 instance_id: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 time_zone: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides an Amazon Connect Hours of Operation resource. For more information see
        [Amazon Connect: Getting Started](https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-get-started.html)

        ## Example Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_aws as aws

        test = aws.connect.HoursOfOperation("test",
            instance_id="aaaaaaaa-bbbb-cccc-dddd-111111111111",
            name="Office Hours",
            description="Monday office hours",
            time_zone="EST",
            configs=[
                aws.connect.HoursOfOperationConfigArgs(
                    day="MONDAY",
                    end_time=aws.connect.HoursOfOperationConfigEndTimeArgs(
                        hours=23,
                        minutes=8,
                    ),
                    start_time=aws.connect.HoursOfOperationConfigStartTimeArgs(
                        hours=8,
                        minutes=0,
                    ),
                ),
                aws.connect.HoursOfOperationConfigArgs(
                    day="TUESDAY",
                    end_time=aws.connect.HoursOfOperationConfigEndTimeArgs(
                        hours=21,
                        minutes=0,
                    ),
                    start_time=aws.connect.HoursOfOperationConfigStartTimeArgs(
                        hours=9,
                        minutes=0,
                    ),
                ),
            ],
            tags={
                "Name": "Example Hours of Operation",
            })
        ```
        <!--End PulumiCodeChooser -->

        ## Import

        Using `pulumi import`, import Amazon Connect Hours of Operations using the `instance_id` and `hours_of_operation_id` separated by a colon (`:`). For example:

        ```sh
        $ pulumi import aws:connect/hoursOfOperation:HoursOfOperation example f1288a1f-6193-445a-b47e-af739b2:c1d4e5f6-1b3c-1b3c-1b3c-c1d4e5f6c1d4e5
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['HoursOfOperationConfigArgs']]]] configs: One or more config blocks which define the configuration information for the hours of operation: day, start time, and end time . Config blocks are documented below.
        :param pulumi.Input[str] description: Specifies the description of the Hours of Operation.
        :param pulumi.Input[str] instance_id: Specifies the identifier of the hosting Amazon Connect Instance.
        :param pulumi.Input[str] name: Specifies the name of the Hours of Operation.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Tags to apply to the Hours of Operation. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[str] time_zone: Specifies the time zone of the Hours of Operation.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: HoursOfOperationArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides an Amazon Connect Hours of Operation resource. For more information see
        [Amazon Connect: Getting Started](https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-get-started.html)

        ## Example Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_aws as aws

        test = aws.connect.HoursOfOperation("test",
            instance_id="aaaaaaaa-bbbb-cccc-dddd-111111111111",
            name="Office Hours",
            description="Monday office hours",
            time_zone="EST",
            configs=[
                aws.connect.HoursOfOperationConfigArgs(
                    day="MONDAY",
                    end_time=aws.connect.HoursOfOperationConfigEndTimeArgs(
                        hours=23,
                        minutes=8,
                    ),
                    start_time=aws.connect.HoursOfOperationConfigStartTimeArgs(
                        hours=8,
                        minutes=0,
                    ),
                ),
                aws.connect.HoursOfOperationConfigArgs(
                    day="TUESDAY",
                    end_time=aws.connect.HoursOfOperationConfigEndTimeArgs(
                        hours=21,
                        minutes=0,
                    ),
                    start_time=aws.connect.HoursOfOperationConfigStartTimeArgs(
                        hours=9,
                        minutes=0,
                    ),
                ),
            ],
            tags={
                "Name": "Example Hours of Operation",
            })
        ```
        <!--End PulumiCodeChooser -->

        ## Import

        Using `pulumi import`, import Amazon Connect Hours of Operations using the `instance_id` and `hours_of_operation_id` separated by a colon (`:`). For example:

        ```sh
        $ pulumi import aws:connect/hoursOfOperation:HoursOfOperation example f1288a1f-6193-445a-b47e-af739b2:c1d4e5f6-1b3c-1b3c-1b3c-c1d4e5f6c1d4e5
        ```

        :param str resource_name: The name of the resource.
        :param HoursOfOperationArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(HoursOfOperationArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 configs: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['HoursOfOperationConfigArgs']]]]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 instance_id: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 time_zone: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = HoursOfOperationArgs.__new__(HoursOfOperationArgs)

            if configs is None and not opts.urn:
                raise TypeError("Missing required property 'configs'")
            __props__.__dict__["configs"] = configs
            __props__.__dict__["description"] = description
            if instance_id is None and not opts.urn:
                raise TypeError("Missing required property 'instance_id'")
            __props__.__dict__["instance_id"] = instance_id
            __props__.__dict__["name"] = name
            __props__.__dict__["tags"] = tags
            if time_zone is None and not opts.urn:
                raise TypeError("Missing required property 'time_zone'")
            __props__.__dict__["time_zone"] = time_zone
            __props__.__dict__["arn"] = None
            __props__.__dict__["hours_of_operation_id"] = None
            __props__.__dict__["tags_all"] = None
        super(HoursOfOperation, __self__).__init__(
            'aws:connect/hoursOfOperation:HoursOfOperation',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            arn: Optional[pulumi.Input[str]] = None,
            configs: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['HoursOfOperationConfigArgs']]]]] = None,
            description: Optional[pulumi.Input[str]] = None,
            hours_of_operation_id: Optional[pulumi.Input[str]] = None,
            instance_id: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            time_zone: Optional[pulumi.Input[str]] = None) -> 'HoursOfOperation':
        """
        Get an existing HoursOfOperation resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] arn: The Amazon Resource Name (ARN) of the Hours of Operation.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['HoursOfOperationConfigArgs']]]] configs: One or more config blocks which define the configuration information for the hours of operation: day, start time, and end time . Config blocks are documented below.
        :param pulumi.Input[str] description: Specifies the description of the Hours of Operation.
        :param pulumi.Input[str] hours_of_operation_id: The identifier for the hours of operation.
        :param pulumi.Input[str] instance_id: Specifies the identifier of the hosting Amazon Connect Instance.
        :param pulumi.Input[str] name: Specifies the name of the Hours of Operation.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Tags to apply to the Hours of Operation. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        :param pulumi.Input[str] time_zone: Specifies the time zone of the Hours of Operation.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _HoursOfOperationState.__new__(_HoursOfOperationState)

        __props__.__dict__["arn"] = arn
        __props__.__dict__["configs"] = configs
        __props__.__dict__["description"] = description
        __props__.__dict__["hours_of_operation_id"] = hours_of_operation_id
        __props__.__dict__["instance_id"] = instance_id
        __props__.__dict__["name"] = name
        __props__.__dict__["tags"] = tags
        __props__.__dict__["tags_all"] = tags_all
        __props__.__dict__["time_zone"] = time_zone
        return HoursOfOperation(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def arn(self) -> pulumi.Output[str]:
        """
        The Amazon Resource Name (ARN) of the Hours of Operation.
        """
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter
    def configs(self) -> pulumi.Output[Sequence['outputs.HoursOfOperationConfig']]:
        """
        One or more config blocks which define the configuration information for the hours of operation: day, start time, and end time . Config blocks are documented below.
        """
        return pulumi.get(self, "configs")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        Specifies the description of the Hours of Operation.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="hoursOfOperationId")
    def hours_of_operation_id(self) -> pulumi.Output[str]:
        """
        The identifier for the hours of operation.
        """
        return pulumi.get(self, "hours_of_operation_id")

    @property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> pulumi.Output[str]:
        """
        Specifies the identifier of the hosting Amazon Connect Instance.
        """
        return pulumi.get(self, "instance_id")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Specifies the name of the Hours of Operation.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, str]]]:
        """
        Tags to apply to the Hours of Operation. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter(name="tagsAll")
    def tags_all(self) -> pulumi.Output[Mapping[str, str]]:
        """
        A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        warnings.warn("""Please use `tags` instead.""", DeprecationWarning)
        pulumi.log.warn("""tags_all is deprecated: Please use `tags` instead.""")

        return pulumi.get(self, "tags_all")

    @property
    @pulumi.getter(name="timeZone")
    def time_zone(self) -> pulumi.Output[str]:
        """
        Specifies the time zone of the Hours of Operation.
        """
        return pulumi.get(self, "time_zone")


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

__all__ = ['EventIntegrationArgs', 'EventIntegration']

@pulumi.input_type
class EventIntegrationArgs:
    def __init__(__self__, *,
                 event_filter: pulumi.Input['EventIntegrationEventFilterArgs'],
                 eventbridge_bus: pulumi.Input[str],
                 description: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        The set of arguments for constructing a EventIntegration resource.
        :param pulumi.Input['EventIntegrationEventFilterArgs'] event_filter: Block that defines the configuration information for the event filter. The Event Filter block is documented below.
        :param pulumi.Input[str] eventbridge_bus: EventBridge bus.
        :param pulumi.Input[str] description: Description of the Event Integration.
        :param pulumi.Input[str] name: Name of the Event Integration.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Tags to apply to the Event Integration. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        pulumi.set(__self__, "event_filter", event_filter)
        pulumi.set(__self__, "eventbridge_bus", eventbridge_bus)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter(name="eventFilter")
    def event_filter(self) -> pulumi.Input['EventIntegrationEventFilterArgs']:
        """
        Block that defines the configuration information for the event filter. The Event Filter block is documented below.
        """
        return pulumi.get(self, "event_filter")

    @event_filter.setter
    def event_filter(self, value: pulumi.Input['EventIntegrationEventFilterArgs']):
        pulumi.set(self, "event_filter", value)

    @property
    @pulumi.getter(name="eventbridgeBus")
    def eventbridge_bus(self) -> pulumi.Input[str]:
        """
        EventBridge bus.
        """
        return pulumi.get(self, "eventbridge_bus")

    @eventbridge_bus.setter
    def eventbridge_bus(self, value: pulumi.Input[str]):
        pulumi.set(self, "eventbridge_bus", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Description of the Event Integration.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the Event Integration.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Tags to apply to the Event Integration. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)


@pulumi.input_type
class _EventIntegrationState:
    def __init__(__self__, *,
                 arn: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 event_filter: Optional[pulumi.Input['EventIntegrationEventFilterArgs']] = None,
                 eventbridge_bus: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        Input properties used for looking up and filtering EventIntegration resources.
        :param pulumi.Input[str] arn: ARN of the Event Integration.
        :param pulumi.Input[str] description: Description of the Event Integration.
        :param pulumi.Input['EventIntegrationEventFilterArgs'] event_filter: Block that defines the configuration information for the event filter. The Event Filter block is documented below.
        :param pulumi.Input[str] eventbridge_bus: EventBridge bus.
        :param pulumi.Input[str] name: Name of the Event Integration.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Tags to apply to the Event Integration. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        if arn is not None:
            pulumi.set(__self__, "arn", arn)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if event_filter is not None:
            pulumi.set(__self__, "event_filter", event_filter)
        if eventbridge_bus is not None:
            pulumi.set(__self__, "eventbridge_bus", eventbridge_bus)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if tags_all is not None:
            warnings.warn("""Please use `tags` instead.""", DeprecationWarning)
            pulumi.log.warn("""tags_all is deprecated: Please use `tags` instead.""")
        if tags_all is not None:
            pulumi.set(__self__, "tags_all", tags_all)

    @property
    @pulumi.getter
    def arn(self) -> Optional[pulumi.Input[str]]:
        """
        ARN of the Event Integration.
        """
        return pulumi.get(self, "arn")

    @arn.setter
    def arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "arn", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Description of the Event Integration.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="eventFilter")
    def event_filter(self) -> Optional[pulumi.Input['EventIntegrationEventFilterArgs']]:
        """
        Block that defines the configuration information for the event filter. The Event Filter block is documented below.
        """
        return pulumi.get(self, "event_filter")

    @event_filter.setter
    def event_filter(self, value: Optional[pulumi.Input['EventIntegrationEventFilterArgs']]):
        pulumi.set(self, "event_filter", value)

    @property
    @pulumi.getter(name="eventbridgeBus")
    def eventbridge_bus(self) -> Optional[pulumi.Input[str]]:
        """
        EventBridge bus.
        """
        return pulumi.get(self, "eventbridge_bus")

    @eventbridge_bus.setter
    def eventbridge_bus(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "eventbridge_bus", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the Event Integration.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Tags to apply to the Event Integration. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)

    @property
    @pulumi.getter(name="tagsAll")
    def tags_all(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        warnings.warn("""Please use `tags` instead.""", DeprecationWarning)
        pulumi.log.warn("""tags_all is deprecated: Please use `tags` instead.""")

        return pulumi.get(self, "tags_all")

    @tags_all.setter
    def tags_all(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags_all", value)


class EventIntegration(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 event_filter: Optional[pulumi.Input[pulumi.InputType['EventIntegrationEventFilterArgs']]] = None,
                 eventbridge_bus: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 __props__=None):
        """
        Provides an Amazon AppIntegrations Event Integration resource.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.appconfig.EventIntegration("example",
            description="Example Description",
            event_filter=aws.appconfig.EventIntegrationEventFilterArgs(
                source="aws.partner/examplepartner.com",
            ),
            eventbridge_bus="default",
            tags={
                "Name": "Example Event Integration",
            })
        ```

        ## Import

        Using `pulumi import`, import Amazon AppIntegrations Event Integrations using the `name`. For example:

        ```sh
         $ pulumi import aws:appconfig/eventIntegration:EventIntegration example example-name
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: Description of the Event Integration.
        :param pulumi.Input[pulumi.InputType['EventIntegrationEventFilterArgs']] event_filter: Block that defines the configuration information for the event filter. The Event Filter block is documented below.
        :param pulumi.Input[str] eventbridge_bus: EventBridge bus.
        :param pulumi.Input[str] name: Name of the Event Integration.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Tags to apply to the Event Integration. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: EventIntegrationArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides an Amazon AppIntegrations Event Integration resource.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.appconfig.EventIntegration("example",
            description="Example Description",
            event_filter=aws.appconfig.EventIntegrationEventFilterArgs(
                source="aws.partner/examplepartner.com",
            ),
            eventbridge_bus="default",
            tags={
                "Name": "Example Event Integration",
            })
        ```

        ## Import

        Using `pulumi import`, import Amazon AppIntegrations Event Integrations using the `name`. For example:

        ```sh
         $ pulumi import aws:appconfig/eventIntegration:EventIntegration example example-name
        ```

        :param str resource_name: The name of the resource.
        :param EventIntegrationArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(EventIntegrationArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 event_filter: Optional[pulumi.Input[pulumi.InputType['EventIntegrationEventFilterArgs']]] = None,
                 eventbridge_bus: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = EventIntegrationArgs.__new__(EventIntegrationArgs)

            __props__.__dict__["description"] = description
            if event_filter is None and not opts.urn:
                raise TypeError("Missing required property 'event_filter'")
            __props__.__dict__["event_filter"] = event_filter
            if eventbridge_bus is None and not opts.urn:
                raise TypeError("Missing required property 'eventbridge_bus'")
            __props__.__dict__["eventbridge_bus"] = eventbridge_bus
            __props__.__dict__["name"] = name
            __props__.__dict__["tags"] = tags
            __props__.__dict__["arn"] = None
            __props__.__dict__["tags_all"] = None
        super(EventIntegration, __self__).__init__(
            'aws:appconfig/eventIntegration:EventIntegration',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            arn: Optional[pulumi.Input[str]] = None,
            description: Optional[pulumi.Input[str]] = None,
            event_filter: Optional[pulumi.Input[pulumi.InputType['EventIntegrationEventFilterArgs']]] = None,
            eventbridge_bus: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None) -> 'EventIntegration':
        """
        Get an existing EventIntegration resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] arn: ARN of the Event Integration.
        :param pulumi.Input[str] description: Description of the Event Integration.
        :param pulumi.Input[pulumi.InputType['EventIntegrationEventFilterArgs']] event_filter: Block that defines the configuration information for the event filter. The Event Filter block is documented below.
        :param pulumi.Input[str] eventbridge_bus: EventBridge bus.
        :param pulumi.Input[str] name: Name of the Event Integration.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Tags to apply to the Event Integration. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _EventIntegrationState.__new__(_EventIntegrationState)

        __props__.__dict__["arn"] = arn
        __props__.__dict__["description"] = description
        __props__.__dict__["event_filter"] = event_filter
        __props__.__dict__["eventbridge_bus"] = eventbridge_bus
        __props__.__dict__["name"] = name
        __props__.__dict__["tags"] = tags
        __props__.__dict__["tags_all"] = tags_all
        return EventIntegration(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def arn(self) -> pulumi.Output[str]:
        """
        ARN of the Event Integration.
        """
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        Description of the Event Integration.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="eventFilter")
    def event_filter(self) -> pulumi.Output['outputs.EventIntegrationEventFilter']:
        """
        Block that defines the configuration information for the event filter. The Event Filter block is documented below.
        """
        return pulumi.get(self, "event_filter")

    @property
    @pulumi.getter(name="eventbridgeBus")
    def eventbridge_bus(self) -> pulumi.Output[str]:
        """
        EventBridge bus.
        """
        return pulumi.get(self, "eventbridge_bus")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Name of the Event Integration.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, str]]]:
        """
        Tags to apply to the Event Integration. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter(name="tagsAll")
    def tags_all(self) -> pulumi.Output[Mapping[str, str]]:
        """
        Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        warnings.warn("""Please use `tags` instead.""", DeprecationWarning)
        pulumi.log.warn("""tags_all is deprecated: Please use `tags` instead.""")

        return pulumi.get(self, "tags_all")


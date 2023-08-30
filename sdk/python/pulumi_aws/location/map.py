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

__all__ = ['MapArgs', 'Map']

@pulumi.input_type
class MapArgs:
    def __init__(__self__, *,
                 configuration: pulumi.Input['MapConfigurationArgs'],
                 map_name: pulumi.Input[str],
                 description: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        The set of arguments for constructing a Map resource.
        :param pulumi.Input['MapConfigurationArgs'] configuration: Configuration block with the map style selected from an available data provider. Detailed below.
        :param pulumi.Input[str] map_name: The name for the map resource.
               
               The following arguments are optional:
        :param pulumi.Input[str] description: An optional description for the map resource.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value tags for the map. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        pulumi.set(__self__, "configuration", configuration)
        pulumi.set(__self__, "map_name", map_name)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter
    def configuration(self) -> pulumi.Input['MapConfigurationArgs']:
        """
        Configuration block with the map style selected from an available data provider. Detailed below.
        """
        return pulumi.get(self, "configuration")

    @configuration.setter
    def configuration(self, value: pulumi.Input['MapConfigurationArgs']):
        pulumi.set(self, "configuration", value)

    @property
    @pulumi.getter(name="mapName")
    def map_name(self) -> pulumi.Input[str]:
        """
        The name for the map resource.

        The following arguments are optional:
        """
        return pulumi.get(self, "map_name")

    @map_name.setter
    def map_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "map_name", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        An optional description for the map resource.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Key-value tags for the map. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)


@pulumi.input_type
class _MapState:
    def __init__(__self__, *,
                 configuration: Optional[pulumi.Input['MapConfigurationArgs']] = None,
                 create_time: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 map_arn: Optional[pulumi.Input[str]] = None,
                 map_name: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 update_time: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering Map resources.
        :param pulumi.Input['MapConfigurationArgs'] configuration: Configuration block with the map style selected from an available data provider. Detailed below.
        :param pulumi.Input[str] create_time: The timestamp for when the map resource was created in ISO 8601 format.
        :param pulumi.Input[str] description: An optional description for the map resource.
        :param pulumi.Input[str] map_arn: The Amazon Resource Name (ARN) for the map resource. Used to specify a resource across all AWS.
        :param pulumi.Input[str] map_name: The name for the map resource.
               
               The following arguments are optional:
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value tags for the map. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        :param pulumi.Input[str] update_time: The timestamp for when the map resource was last updated in ISO 8601 format.
        """
        if configuration is not None:
            pulumi.set(__self__, "configuration", configuration)
        if create_time is not None:
            pulumi.set(__self__, "create_time", create_time)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if map_arn is not None:
            pulumi.set(__self__, "map_arn", map_arn)
        if map_name is not None:
            pulumi.set(__self__, "map_name", map_name)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if tags_all is not None:
            pulumi.set(__self__, "tags_all", tags_all)
        if update_time is not None:
            pulumi.set(__self__, "update_time", update_time)

    @property
    @pulumi.getter
    def configuration(self) -> Optional[pulumi.Input['MapConfigurationArgs']]:
        """
        Configuration block with the map style selected from an available data provider. Detailed below.
        """
        return pulumi.get(self, "configuration")

    @configuration.setter
    def configuration(self, value: Optional[pulumi.Input['MapConfigurationArgs']]):
        pulumi.set(self, "configuration", value)

    @property
    @pulumi.getter(name="createTime")
    def create_time(self) -> Optional[pulumi.Input[str]]:
        """
        The timestamp for when the map resource was created in ISO 8601 format.
        """
        return pulumi.get(self, "create_time")

    @create_time.setter
    def create_time(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "create_time", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        An optional description for the map resource.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="mapArn")
    def map_arn(self) -> Optional[pulumi.Input[str]]:
        """
        The Amazon Resource Name (ARN) for the map resource. Used to specify a resource across all AWS.
        """
        return pulumi.get(self, "map_arn")

    @map_arn.setter
    def map_arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "map_arn", value)

    @property
    @pulumi.getter(name="mapName")
    def map_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name for the map resource.

        The following arguments are optional:
        """
        return pulumi.get(self, "map_name")

    @map_name.setter
    def map_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "map_name", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Key-value tags for the map. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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

    @property
    @pulumi.getter(name="updateTime")
    def update_time(self) -> Optional[pulumi.Input[str]]:
        """
        The timestamp for when the map resource was last updated in ISO 8601 format.
        """
        return pulumi.get(self, "update_time")

    @update_time.setter
    def update_time(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "update_time", value)


class Map(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 configuration: Optional[pulumi.Input[pulumi.InputType['MapConfigurationArgs']]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 map_name: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 __props__=None):
        """
        Provides a Location Service Map.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.location.Map("example",
            configuration=aws.location.MapConfigurationArgs(
                style="VectorHereBerlin",
            ),
            map_name="example")
        ```

        ## Import

        Using `pulumi import`, import `aws_location_map` resources using the map name. For example:

        ```sh
         $ pulumi import aws:location/map:Map example example
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[pulumi.InputType['MapConfigurationArgs']] configuration: Configuration block with the map style selected from an available data provider. Detailed below.
        :param pulumi.Input[str] description: An optional description for the map resource.
        :param pulumi.Input[str] map_name: The name for the map resource.
               
               The following arguments are optional:
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value tags for the map. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: MapArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Location Service Map.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.location.Map("example",
            configuration=aws.location.MapConfigurationArgs(
                style="VectorHereBerlin",
            ),
            map_name="example")
        ```

        ## Import

        Using `pulumi import`, import `aws_location_map` resources using the map name. For example:

        ```sh
         $ pulumi import aws:location/map:Map example example
        ```

        :param str resource_name: The name of the resource.
        :param MapArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(MapArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 configuration: Optional[pulumi.Input[pulumi.InputType['MapConfigurationArgs']]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 map_name: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = MapArgs.__new__(MapArgs)

            if configuration is None and not opts.urn:
                raise TypeError("Missing required property 'configuration'")
            __props__.__dict__["configuration"] = configuration
            __props__.__dict__["description"] = description
            if map_name is None and not opts.urn:
                raise TypeError("Missing required property 'map_name'")
            __props__.__dict__["map_name"] = map_name
            __props__.__dict__["tags"] = tags
            __props__.__dict__["create_time"] = None
            __props__.__dict__["map_arn"] = None
            __props__.__dict__["tags_all"] = None
            __props__.__dict__["update_time"] = None
        super(Map, __self__).__init__(
            'aws:location/map:Map',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            configuration: Optional[pulumi.Input[pulumi.InputType['MapConfigurationArgs']]] = None,
            create_time: Optional[pulumi.Input[str]] = None,
            description: Optional[pulumi.Input[str]] = None,
            map_arn: Optional[pulumi.Input[str]] = None,
            map_name: Optional[pulumi.Input[str]] = None,
            tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            update_time: Optional[pulumi.Input[str]] = None) -> 'Map':
        """
        Get an existing Map resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[pulumi.InputType['MapConfigurationArgs']] configuration: Configuration block with the map style selected from an available data provider. Detailed below.
        :param pulumi.Input[str] create_time: The timestamp for when the map resource was created in ISO 8601 format.
        :param pulumi.Input[str] description: An optional description for the map resource.
        :param pulumi.Input[str] map_arn: The Amazon Resource Name (ARN) for the map resource. Used to specify a resource across all AWS.
        :param pulumi.Input[str] map_name: The name for the map resource.
               
               The following arguments are optional:
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value tags for the map. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        :param pulumi.Input[str] update_time: The timestamp for when the map resource was last updated in ISO 8601 format.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _MapState.__new__(_MapState)

        __props__.__dict__["configuration"] = configuration
        __props__.__dict__["create_time"] = create_time
        __props__.__dict__["description"] = description
        __props__.__dict__["map_arn"] = map_arn
        __props__.__dict__["map_name"] = map_name
        __props__.__dict__["tags"] = tags
        __props__.__dict__["tags_all"] = tags_all
        __props__.__dict__["update_time"] = update_time
        return Map(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def configuration(self) -> pulumi.Output['outputs.MapConfiguration']:
        """
        Configuration block with the map style selected from an available data provider. Detailed below.
        """
        return pulumi.get(self, "configuration")

    @property
    @pulumi.getter(name="createTime")
    def create_time(self) -> pulumi.Output[str]:
        """
        The timestamp for when the map resource was created in ISO 8601 format.
        """
        return pulumi.get(self, "create_time")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        An optional description for the map resource.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="mapArn")
    def map_arn(self) -> pulumi.Output[str]:
        """
        The Amazon Resource Name (ARN) for the map resource. Used to specify a resource across all AWS.
        """
        return pulumi.get(self, "map_arn")

    @property
    @pulumi.getter(name="mapName")
    def map_name(self) -> pulumi.Output[str]:
        """
        The name for the map resource.

        The following arguments are optional:
        """
        return pulumi.get(self, "map_name")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, str]]]:
        """
        Key-value tags for the map. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter(name="tagsAll")
    def tags_all(self) -> pulumi.Output[Mapping[str, str]]:
        """
        A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        return pulumi.get(self, "tags_all")

    @property
    @pulumi.getter(name="updateTime")
    def update_time(self) -> pulumi.Output[str]:
        """
        The timestamp for when the map resource was last updated in ISO 8601 format.
        """
        return pulumi.get(self, "update_time")


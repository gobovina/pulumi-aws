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

__all__ = ['MultiplexArgs', 'Multiplex']

@pulumi.input_type
class MultiplexArgs:
    def __init__(__self__, *,
                 availability_zones: pulumi.Input[Sequence[pulumi.Input[str]]],
                 multiplex_settings: Optional[pulumi.Input['MultiplexMultiplexSettingsArgs']] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 start_multiplex: Optional[pulumi.Input[bool]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        The set of arguments for constructing a Multiplex resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] availability_zones: A list of availability zones. You must specify exactly two.
        :param pulumi.Input['MultiplexMultiplexSettingsArgs'] multiplex_settings: Multiplex settings. See Multiplex Settings for more details.
        :param pulumi.Input[str] name: name of Multiplex.
               
               The following arguments are optional:
        :param pulumi.Input[bool] start_multiplex: Whether to start the Multiplex. Defaults to `false`.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A map of tags to assign to the Multiplex. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        pulumi.set(__self__, "availability_zones", availability_zones)
        if multiplex_settings is not None:
            pulumi.set(__self__, "multiplex_settings", multiplex_settings)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if start_multiplex is not None:
            pulumi.set(__self__, "start_multiplex", start_multiplex)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter(name="availabilityZones")
    def availability_zones(self) -> pulumi.Input[Sequence[pulumi.Input[str]]]:
        """
        A list of availability zones. You must specify exactly two.
        """
        return pulumi.get(self, "availability_zones")

    @availability_zones.setter
    def availability_zones(self, value: pulumi.Input[Sequence[pulumi.Input[str]]]):
        pulumi.set(self, "availability_zones", value)

    @property
    @pulumi.getter(name="multiplexSettings")
    def multiplex_settings(self) -> Optional[pulumi.Input['MultiplexMultiplexSettingsArgs']]:
        """
        Multiplex settings. See Multiplex Settings for more details.
        """
        return pulumi.get(self, "multiplex_settings")

    @multiplex_settings.setter
    def multiplex_settings(self, value: Optional[pulumi.Input['MultiplexMultiplexSettingsArgs']]):
        pulumi.set(self, "multiplex_settings", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        name of Multiplex.

        The following arguments are optional:
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="startMultiplex")
    def start_multiplex(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether to start the Multiplex. Defaults to `false`.
        """
        return pulumi.get(self, "start_multiplex")

    @start_multiplex.setter
    def start_multiplex(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "start_multiplex", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        A map of tags to assign to the Multiplex. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)


@pulumi.input_type
class _MultiplexState:
    def __init__(__self__, *,
                 arn: Optional[pulumi.Input[str]] = None,
                 availability_zones: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 multiplex_settings: Optional[pulumi.Input['MultiplexMultiplexSettingsArgs']] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 start_multiplex: Optional[pulumi.Input[bool]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        Input properties used for looking up and filtering Multiplex resources.
        :param pulumi.Input[str] arn: ARN of the Multiplex.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] availability_zones: A list of availability zones. You must specify exactly two.
        :param pulumi.Input['MultiplexMultiplexSettingsArgs'] multiplex_settings: Multiplex settings. See Multiplex Settings for more details.
        :param pulumi.Input[str] name: name of Multiplex.
               
               The following arguments are optional:
        :param pulumi.Input[bool] start_multiplex: Whether to start the Multiplex. Defaults to `false`.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A map of tags to assign to the Multiplex. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        if arn is not None:
            pulumi.set(__self__, "arn", arn)
        if availability_zones is not None:
            pulumi.set(__self__, "availability_zones", availability_zones)
        if multiplex_settings is not None:
            pulumi.set(__self__, "multiplex_settings", multiplex_settings)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if start_multiplex is not None:
            pulumi.set(__self__, "start_multiplex", start_multiplex)
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
        ARN of the Multiplex.
        """
        return pulumi.get(self, "arn")

    @arn.setter
    def arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "arn", value)

    @property
    @pulumi.getter(name="availabilityZones")
    def availability_zones(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        A list of availability zones. You must specify exactly two.
        """
        return pulumi.get(self, "availability_zones")

    @availability_zones.setter
    def availability_zones(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "availability_zones", value)

    @property
    @pulumi.getter(name="multiplexSettings")
    def multiplex_settings(self) -> Optional[pulumi.Input['MultiplexMultiplexSettingsArgs']]:
        """
        Multiplex settings. See Multiplex Settings for more details.
        """
        return pulumi.get(self, "multiplex_settings")

    @multiplex_settings.setter
    def multiplex_settings(self, value: Optional[pulumi.Input['MultiplexMultiplexSettingsArgs']]):
        pulumi.set(self, "multiplex_settings", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        name of Multiplex.

        The following arguments are optional:
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="startMultiplex")
    def start_multiplex(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether to start the Multiplex. Defaults to `false`.
        """
        return pulumi.get(self, "start_multiplex")

    @start_multiplex.setter
    def start_multiplex(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "start_multiplex", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        A map of tags to assign to the Multiplex. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)

    @property
    @pulumi.getter(name="tagsAll")
    def tags_all(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        warnings.warn("""Please use `tags` instead.""", DeprecationWarning)
        pulumi.log.warn("""tags_all is deprecated: Please use `tags` instead.""")

        return pulumi.get(self, "tags_all")

    @tags_all.setter
    def tags_all(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags_all", value)


class Multiplex(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 availability_zones: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 multiplex_settings: Optional[pulumi.Input[pulumi.InputType['MultiplexMultiplexSettingsArgs']]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 start_multiplex: Optional[pulumi.Input[bool]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 __props__=None):
        """
        Resource for managing an AWS MediaLive Multiplex.

        ## Example Usage
        ### Basic Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        available = aws.get_availability_zones(state="available")
        example = aws.medialive.Multiplex("example",
            name="example-multiplex-changed",
            availability_zones=[
                available.names[0],
                available.names[1],
            ],
            multiplex_settings=aws.medialive.MultiplexMultiplexSettingsArgs(
                transport_stream_bitrate=1000000,
                transport_stream_id=1,
                transport_stream_reserved_bitrate=1,
                maximum_video_buffer_delay_milliseconds=1000,
            ),
            start_multiplex=True,
            tags={
                "tag1": "value1",
            })
        ```

        ## Import

        Using `pulumi import`, import MediaLive Multiplex using the `id`. For example:

        ```sh
         $ pulumi import aws:medialive/multiplex:Multiplex example 12345678
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] availability_zones: A list of availability zones. You must specify exactly two.
        :param pulumi.Input[pulumi.InputType['MultiplexMultiplexSettingsArgs']] multiplex_settings: Multiplex settings. See Multiplex Settings for more details.
        :param pulumi.Input[str] name: name of Multiplex.
               
               The following arguments are optional:
        :param pulumi.Input[bool] start_multiplex: Whether to start the Multiplex. Defaults to `false`.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A map of tags to assign to the Multiplex. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: MultiplexArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Resource for managing an AWS MediaLive Multiplex.

        ## Example Usage
        ### Basic Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        available = aws.get_availability_zones(state="available")
        example = aws.medialive.Multiplex("example",
            name="example-multiplex-changed",
            availability_zones=[
                available.names[0],
                available.names[1],
            ],
            multiplex_settings=aws.medialive.MultiplexMultiplexSettingsArgs(
                transport_stream_bitrate=1000000,
                transport_stream_id=1,
                transport_stream_reserved_bitrate=1,
                maximum_video_buffer_delay_milliseconds=1000,
            ),
            start_multiplex=True,
            tags={
                "tag1": "value1",
            })
        ```

        ## Import

        Using `pulumi import`, import MediaLive Multiplex using the `id`. For example:

        ```sh
         $ pulumi import aws:medialive/multiplex:Multiplex example 12345678
        ```

        :param str resource_name: The name of the resource.
        :param MultiplexArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(MultiplexArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 availability_zones: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 multiplex_settings: Optional[pulumi.Input[pulumi.InputType['MultiplexMultiplexSettingsArgs']]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 start_multiplex: Optional[pulumi.Input[bool]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = MultiplexArgs.__new__(MultiplexArgs)

            if availability_zones is None and not opts.urn:
                raise TypeError("Missing required property 'availability_zones'")
            __props__.__dict__["availability_zones"] = availability_zones
            __props__.__dict__["multiplex_settings"] = multiplex_settings
            __props__.__dict__["name"] = name
            __props__.__dict__["start_multiplex"] = start_multiplex
            __props__.__dict__["tags"] = tags
            __props__.__dict__["arn"] = None
            __props__.__dict__["tags_all"] = None
        super(Multiplex, __self__).__init__(
            'aws:medialive/multiplex:Multiplex',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            arn: Optional[pulumi.Input[str]] = None,
            availability_zones: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            multiplex_settings: Optional[pulumi.Input[pulumi.InputType['MultiplexMultiplexSettingsArgs']]] = None,
            name: Optional[pulumi.Input[str]] = None,
            start_multiplex: Optional[pulumi.Input[bool]] = None,
            tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None) -> 'Multiplex':
        """
        Get an existing Multiplex resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] arn: ARN of the Multiplex.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] availability_zones: A list of availability zones. You must specify exactly two.
        :param pulumi.Input[pulumi.InputType['MultiplexMultiplexSettingsArgs']] multiplex_settings: Multiplex settings. See Multiplex Settings for more details.
        :param pulumi.Input[str] name: name of Multiplex.
               
               The following arguments are optional:
        :param pulumi.Input[bool] start_multiplex: Whether to start the Multiplex. Defaults to `false`.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A map of tags to assign to the Multiplex. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _MultiplexState.__new__(_MultiplexState)

        __props__.__dict__["arn"] = arn
        __props__.__dict__["availability_zones"] = availability_zones
        __props__.__dict__["multiplex_settings"] = multiplex_settings
        __props__.__dict__["name"] = name
        __props__.__dict__["start_multiplex"] = start_multiplex
        __props__.__dict__["tags"] = tags
        __props__.__dict__["tags_all"] = tags_all
        return Multiplex(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def arn(self) -> pulumi.Output[str]:
        """
        ARN of the Multiplex.
        """
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter(name="availabilityZones")
    def availability_zones(self) -> pulumi.Output[Sequence[str]]:
        """
        A list of availability zones. You must specify exactly two.
        """
        return pulumi.get(self, "availability_zones")

    @property
    @pulumi.getter(name="multiplexSettings")
    def multiplex_settings(self) -> pulumi.Output[Optional['outputs.MultiplexMultiplexSettings']]:
        """
        Multiplex settings. See Multiplex Settings for more details.
        """
        return pulumi.get(self, "multiplex_settings")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        name of Multiplex.

        The following arguments are optional:
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="startMultiplex")
    def start_multiplex(self) -> pulumi.Output[Optional[bool]]:
        """
        Whether to start the Multiplex. Defaults to `false`.
        """
        return pulumi.get(self, "start_multiplex")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, str]]]:
        """
        A map of tags to assign to the Multiplex. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter(name="tagsAll")
    def tags_all(self) -> pulumi.Output[Mapping[str, str]]:
        warnings.warn("""Please use `tags` instead.""", DeprecationWarning)
        pulumi.log.warn("""tags_all is deprecated: Please use `tags` instead.""")

        return pulumi.get(self, "tags_all")


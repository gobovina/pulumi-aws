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

__all__ = ['IndexingConfigurationArgs', 'IndexingConfiguration']

@pulumi.input_type
class IndexingConfigurationArgs:
    def __init__(__self__, *,
                 thing_group_indexing_configuration: Optional[pulumi.Input['IndexingConfigurationThingGroupIndexingConfigurationArgs']] = None,
                 thing_indexing_configuration: Optional[pulumi.Input['IndexingConfigurationThingIndexingConfigurationArgs']] = None):
        """
        The set of arguments for constructing a IndexingConfiguration resource.
        :param pulumi.Input['IndexingConfigurationThingGroupIndexingConfigurationArgs'] thing_group_indexing_configuration: Thing group indexing configuration. See below.
        :param pulumi.Input['IndexingConfigurationThingIndexingConfigurationArgs'] thing_indexing_configuration: Thing indexing configuration. See below.
        """
        if thing_group_indexing_configuration is not None:
            pulumi.set(__self__, "thing_group_indexing_configuration", thing_group_indexing_configuration)
        if thing_indexing_configuration is not None:
            pulumi.set(__self__, "thing_indexing_configuration", thing_indexing_configuration)

    @property
    @pulumi.getter(name="thingGroupIndexingConfiguration")
    def thing_group_indexing_configuration(self) -> Optional[pulumi.Input['IndexingConfigurationThingGroupIndexingConfigurationArgs']]:
        """
        Thing group indexing configuration. See below.
        """
        return pulumi.get(self, "thing_group_indexing_configuration")

    @thing_group_indexing_configuration.setter
    def thing_group_indexing_configuration(self, value: Optional[pulumi.Input['IndexingConfigurationThingGroupIndexingConfigurationArgs']]):
        pulumi.set(self, "thing_group_indexing_configuration", value)

    @property
    @pulumi.getter(name="thingIndexingConfiguration")
    def thing_indexing_configuration(self) -> Optional[pulumi.Input['IndexingConfigurationThingIndexingConfigurationArgs']]:
        """
        Thing indexing configuration. See below.
        """
        return pulumi.get(self, "thing_indexing_configuration")

    @thing_indexing_configuration.setter
    def thing_indexing_configuration(self, value: Optional[pulumi.Input['IndexingConfigurationThingIndexingConfigurationArgs']]):
        pulumi.set(self, "thing_indexing_configuration", value)


@pulumi.input_type
class _IndexingConfigurationState:
    def __init__(__self__, *,
                 thing_group_indexing_configuration: Optional[pulumi.Input['IndexingConfigurationThingGroupIndexingConfigurationArgs']] = None,
                 thing_indexing_configuration: Optional[pulumi.Input['IndexingConfigurationThingIndexingConfigurationArgs']] = None):
        """
        Input properties used for looking up and filtering IndexingConfiguration resources.
        :param pulumi.Input['IndexingConfigurationThingGroupIndexingConfigurationArgs'] thing_group_indexing_configuration: Thing group indexing configuration. See below.
        :param pulumi.Input['IndexingConfigurationThingIndexingConfigurationArgs'] thing_indexing_configuration: Thing indexing configuration. See below.
        """
        if thing_group_indexing_configuration is not None:
            pulumi.set(__self__, "thing_group_indexing_configuration", thing_group_indexing_configuration)
        if thing_indexing_configuration is not None:
            pulumi.set(__self__, "thing_indexing_configuration", thing_indexing_configuration)

    @property
    @pulumi.getter(name="thingGroupIndexingConfiguration")
    def thing_group_indexing_configuration(self) -> Optional[pulumi.Input['IndexingConfigurationThingGroupIndexingConfigurationArgs']]:
        """
        Thing group indexing configuration. See below.
        """
        return pulumi.get(self, "thing_group_indexing_configuration")

    @thing_group_indexing_configuration.setter
    def thing_group_indexing_configuration(self, value: Optional[pulumi.Input['IndexingConfigurationThingGroupIndexingConfigurationArgs']]):
        pulumi.set(self, "thing_group_indexing_configuration", value)

    @property
    @pulumi.getter(name="thingIndexingConfiguration")
    def thing_indexing_configuration(self) -> Optional[pulumi.Input['IndexingConfigurationThingIndexingConfigurationArgs']]:
        """
        Thing indexing configuration. See below.
        """
        return pulumi.get(self, "thing_indexing_configuration")

    @thing_indexing_configuration.setter
    def thing_indexing_configuration(self, value: Optional[pulumi.Input['IndexingConfigurationThingIndexingConfigurationArgs']]):
        pulumi.set(self, "thing_indexing_configuration", value)


class IndexingConfiguration(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 thing_group_indexing_configuration: Optional[pulumi.Input[pulumi.InputType['IndexingConfigurationThingGroupIndexingConfigurationArgs']]] = None,
                 thing_indexing_configuration: Optional[pulumi.Input[pulumi.InputType['IndexingConfigurationThingIndexingConfigurationArgs']]] = None,
                 __props__=None):
        """
        Managing [IoT Thing indexing](https://docs.aws.amazon.com/iot/latest/developerguide/managing-index.html).

        ## Example Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.iot.IndexingConfiguration("example", thing_indexing_configuration=aws.iot.IndexingConfigurationThingIndexingConfigurationArgs(
            thing_indexing_mode="REGISTRY_AND_SHADOW",
            thing_connectivity_indexing_mode="STATUS",
            device_defender_indexing_mode="VIOLATIONS",
            named_shadow_indexing_mode="ON",
            filter=aws.iot.IndexingConfigurationThingIndexingConfigurationFilterArgs(
                named_shadow_names=["thing1shadow"],
            ),
            custom_fields=[
                aws.iot.IndexingConfigurationThingIndexingConfigurationCustomFieldArgs(
                    name="shadow.desired.power",
                    type="Boolean",
                ),
                aws.iot.IndexingConfigurationThingIndexingConfigurationCustomFieldArgs(
                    name="attributes.version",
                    type="Number",
                ),
                aws.iot.IndexingConfigurationThingIndexingConfigurationCustomFieldArgs(
                    name="shadow.name.thing1shadow.desired.DefaultDesired",
                    type="String",
                ),
                aws.iot.IndexingConfigurationThingIndexingConfigurationCustomFieldArgs(
                    name="deviceDefender.securityProfile1.NUMBER_VALUE_BEHAVIOR.lastViolationValue.number",
                    type="Number",
                ),
            ],
        ))
        ```
        <!--End PulumiCodeChooser -->

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[pulumi.InputType['IndexingConfigurationThingGroupIndexingConfigurationArgs']] thing_group_indexing_configuration: Thing group indexing configuration. See below.
        :param pulumi.Input[pulumi.InputType['IndexingConfigurationThingIndexingConfigurationArgs']] thing_indexing_configuration: Thing indexing configuration. See below.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[IndexingConfigurationArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Managing [IoT Thing indexing](https://docs.aws.amazon.com/iot/latest/developerguide/managing-index.html).

        ## Example Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.iot.IndexingConfiguration("example", thing_indexing_configuration=aws.iot.IndexingConfigurationThingIndexingConfigurationArgs(
            thing_indexing_mode="REGISTRY_AND_SHADOW",
            thing_connectivity_indexing_mode="STATUS",
            device_defender_indexing_mode="VIOLATIONS",
            named_shadow_indexing_mode="ON",
            filter=aws.iot.IndexingConfigurationThingIndexingConfigurationFilterArgs(
                named_shadow_names=["thing1shadow"],
            ),
            custom_fields=[
                aws.iot.IndexingConfigurationThingIndexingConfigurationCustomFieldArgs(
                    name="shadow.desired.power",
                    type="Boolean",
                ),
                aws.iot.IndexingConfigurationThingIndexingConfigurationCustomFieldArgs(
                    name="attributes.version",
                    type="Number",
                ),
                aws.iot.IndexingConfigurationThingIndexingConfigurationCustomFieldArgs(
                    name="shadow.name.thing1shadow.desired.DefaultDesired",
                    type="String",
                ),
                aws.iot.IndexingConfigurationThingIndexingConfigurationCustomFieldArgs(
                    name="deviceDefender.securityProfile1.NUMBER_VALUE_BEHAVIOR.lastViolationValue.number",
                    type="Number",
                ),
            ],
        ))
        ```
        <!--End PulumiCodeChooser -->

        :param str resource_name: The name of the resource.
        :param IndexingConfigurationArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(IndexingConfigurationArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 thing_group_indexing_configuration: Optional[pulumi.Input[pulumi.InputType['IndexingConfigurationThingGroupIndexingConfigurationArgs']]] = None,
                 thing_indexing_configuration: Optional[pulumi.Input[pulumi.InputType['IndexingConfigurationThingIndexingConfigurationArgs']]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = IndexingConfigurationArgs.__new__(IndexingConfigurationArgs)

            __props__.__dict__["thing_group_indexing_configuration"] = thing_group_indexing_configuration
            __props__.__dict__["thing_indexing_configuration"] = thing_indexing_configuration
        super(IndexingConfiguration, __self__).__init__(
            'aws:iot/indexingConfiguration:IndexingConfiguration',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            thing_group_indexing_configuration: Optional[pulumi.Input[pulumi.InputType['IndexingConfigurationThingGroupIndexingConfigurationArgs']]] = None,
            thing_indexing_configuration: Optional[pulumi.Input[pulumi.InputType['IndexingConfigurationThingIndexingConfigurationArgs']]] = None) -> 'IndexingConfiguration':
        """
        Get an existing IndexingConfiguration resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[pulumi.InputType['IndexingConfigurationThingGroupIndexingConfigurationArgs']] thing_group_indexing_configuration: Thing group indexing configuration. See below.
        :param pulumi.Input[pulumi.InputType['IndexingConfigurationThingIndexingConfigurationArgs']] thing_indexing_configuration: Thing indexing configuration. See below.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _IndexingConfigurationState.__new__(_IndexingConfigurationState)

        __props__.__dict__["thing_group_indexing_configuration"] = thing_group_indexing_configuration
        __props__.__dict__["thing_indexing_configuration"] = thing_indexing_configuration
        return IndexingConfiguration(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="thingGroupIndexingConfiguration")
    def thing_group_indexing_configuration(self) -> pulumi.Output['outputs.IndexingConfigurationThingGroupIndexingConfiguration']:
        """
        Thing group indexing configuration. See below.
        """
        return pulumi.get(self, "thing_group_indexing_configuration")

    @property
    @pulumi.getter(name="thingIndexingConfiguration")
    def thing_indexing_configuration(self) -> pulumi.Output['outputs.IndexingConfigurationThingIndexingConfiguration']:
        """
        Thing indexing configuration. See below.
        """
        return pulumi.get(self, "thing_indexing_configuration")


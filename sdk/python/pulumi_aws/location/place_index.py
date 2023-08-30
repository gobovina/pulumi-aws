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

__all__ = ['PlaceIndexArgs', 'PlaceIndex']

@pulumi.input_type
class PlaceIndexArgs:
    def __init__(__self__, *,
                 data_source: pulumi.Input[str],
                 index_name: pulumi.Input[str],
                 data_source_configuration: Optional[pulumi.Input['PlaceIndexDataSourceConfigurationArgs']] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        The set of arguments for constructing a PlaceIndex resource.
        :param pulumi.Input[str] data_source: Specifies the geospatial data provider for the new place index.
        :param pulumi.Input[str] index_name: The name of the place index resource.
               
               The following arguments are optional:
        :param pulumi.Input['PlaceIndexDataSourceConfigurationArgs'] data_source_configuration: Configuration block with the data storage option chosen for requesting Places. Detailed below.
        :param pulumi.Input[str] description: The optional description for the place index resource.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value tags for the place index. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        pulumi.set(__self__, "data_source", data_source)
        pulumi.set(__self__, "index_name", index_name)
        if data_source_configuration is not None:
            pulumi.set(__self__, "data_source_configuration", data_source_configuration)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter(name="dataSource")
    def data_source(self) -> pulumi.Input[str]:
        """
        Specifies the geospatial data provider for the new place index.
        """
        return pulumi.get(self, "data_source")

    @data_source.setter
    def data_source(self, value: pulumi.Input[str]):
        pulumi.set(self, "data_source", value)

    @property
    @pulumi.getter(name="indexName")
    def index_name(self) -> pulumi.Input[str]:
        """
        The name of the place index resource.

        The following arguments are optional:
        """
        return pulumi.get(self, "index_name")

    @index_name.setter
    def index_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "index_name", value)

    @property
    @pulumi.getter(name="dataSourceConfiguration")
    def data_source_configuration(self) -> Optional[pulumi.Input['PlaceIndexDataSourceConfigurationArgs']]:
        """
        Configuration block with the data storage option chosen for requesting Places. Detailed below.
        """
        return pulumi.get(self, "data_source_configuration")

    @data_source_configuration.setter
    def data_source_configuration(self, value: Optional[pulumi.Input['PlaceIndexDataSourceConfigurationArgs']]):
        pulumi.set(self, "data_source_configuration", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        The optional description for the place index resource.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Key-value tags for the place index. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)


@pulumi.input_type
class _PlaceIndexState:
    def __init__(__self__, *,
                 create_time: Optional[pulumi.Input[str]] = None,
                 data_source: Optional[pulumi.Input[str]] = None,
                 data_source_configuration: Optional[pulumi.Input['PlaceIndexDataSourceConfigurationArgs']] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 index_arn: Optional[pulumi.Input[str]] = None,
                 index_name: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 update_time: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering PlaceIndex resources.
        :param pulumi.Input[str] create_time: The timestamp for when the place index resource was created in ISO 8601 format.
        :param pulumi.Input[str] data_source: Specifies the geospatial data provider for the new place index.
        :param pulumi.Input['PlaceIndexDataSourceConfigurationArgs'] data_source_configuration: Configuration block with the data storage option chosen for requesting Places. Detailed below.
        :param pulumi.Input[str] description: The optional description for the place index resource.
        :param pulumi.Input[str] index_arn: The Amazon Resource Name (ARN) for the place index resource. Used to specify a resource across AWS.
        :param pulumi.Input[str] index_name: The name of the place index resource.
               
               The following arguments are optional:
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value tags for the place index. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        :param pulumi.Input[str] update_time: The timestamp for when the place index resource was last update in ISO 8601.
        """
        if create_time is not None:
            pulumi.set(__self__, "create_time", create_time)
        if data_source is not None:
            pulumi.set(__self__, "data_source", data_source)
        if data_source_configuration is not None:
            pulumi.set(__self__, "data_source_configuration", data_source_configuration)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if index_arn is not None:
            pulumi.set(__self__, "index_arn", index_arn)
        if index_name is not None:
            pulumi.set(__self__, "index_name", index_name)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if tags_all is not None:
            pulumi.set(__self__, "tags_all", tags_all)
        if update_time is not None:
            pulumi.set(__self__, "update_time", update_time)

    @property
    @pulumi.getter(name="createTime")
    def create_time(self) -> Optional[pulumi.Input[str]]:
        """
        The timestamp for when the place index resource was created in ISO 8601 format.
        """
        return pulumi.get(self, "create_time")

    @create_time.setter
    def create_time(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "create_time", value)

    @property
    @pulumi.getter(name="dataSource")
    def data_source(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the geospatial data provider for the new place index.
        """
        return pulumi.get(self, "data_source")

    @data_source.setter
    def data_source(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "data_source", value)

    @property
    @pulumi.getter(name="dataSourceConfiguration")
    def data_source_configuration(self) -> Optional[pulumi.Input['PlaceIndexDataSourceConfigurationArgs']]:
        """
        Configuration block with the data storage option chosen for requesting Places. Detailed below.
        """
        return pulumi.get(self, "data_source_configuration")

    @data_source_configuration.setter
    def data_source_configuration(self, value: Optional[pulumi.Input['PlaceIndexDataSourceConfigurationArgs']]):
        pulumi.set(self, "data_source_configuration", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        The optional description for the place index resource.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="indexArn")
    def index_arn(self) -> Optional[pulumi.Input[str]]:
        """
        The Amazon Resource Name (ARN) for the place index resource. Used to specify a resource across AWS.
        """
        return pulumi.get(self, "index_arn")

    @index_arn.setter
    def index_arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "index_arn", value)

    @property
    @pulumi.getter(name="indexName")
    def index_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the place index resource.

        The following arguments are optional:
        """
        return pulumi.get(self, "index_name")

    @index_name.setter
    def index_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "index_name", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Key-value tags for the place index. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
        The timestamp for when the place index resource was last update in ISO 8601.
        """
        return pulumi.get(self, "update_time")

    @update_time.setter
    def update_time(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "update_time", value)


class PlaceIndex(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 data_source: Optional[pulumi.Input[str]] = None,
                 data_source_configuration: Optional[pulumi.Input[pulumi.InputType['PlaceIndexDataSourceConfigurationArgs']]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 index_name: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 __props__=None):
        """
        Provides a Location Service Place Index.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.location.PlaceIndex("example",
            data_source="Here",
            index_name="example")
        ```

        ## Import

        Using `pulumi import`, import `aws_location_place_index` resources using the place index name. For example:

        ```sh
         $ pulumi import aws:location/placeIndex:PlaceIndex example example
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] data_source: Specifies the geospatial data provider for the new place index.
        :param pulumi.Input[pulumi.InputType['PlaceIndexDataSourceConfigurationArgs']] data_source_configuration: Configuration block with the data storage option chosen for requesting Places. Detailed below.
        :param pulumi.Input[str] description: The optional description for the place index resource.
        :param pulumi.Input[str] index_name: The name of the place index resource.
               
               The following arguments are optional:
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value tags for the place index. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: PlaceIndexArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Location Service Place Index.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.location.PlaceIndex("example",
            data_source="Here",
            index_name="example")
        ```

        ## Import

        Using `pulumi import`, import `aws_location_place_index` resources using the place index name. For example:

        ```sh
         $ pulumi import aws:location/placeIndex:PlaceIndex example example
        ```

        :param str resource_name: The name of the resource.
        :param PlaceIndexArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(PlaceIndexArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 data_source: Optional[pulumi.Input[str]] = None,
                 data_source_configuration: Optional[pulumi.Input[pulumi.InputType['PlaceIndexDataSourceConfigurationArgs']]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 index_name: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = PlaceIndexArgs.__new__(PlaceIndexArgs)

            if data_source is None and not opts.urn:
                raise TypeError("Missing required property 'data_source'")
            __props__.__dict__["data_source"] = data_source
            __props__.__dict__["data_source_configuration"] = data_source_configuration
            __props__.__dict__["description"] = description
            if index_name is None and not opts.urn:
                raise TypeError("Missing required property 'index_name'")
            __props__.__dict__["index_name"] = index_name
            __props__.__dict__["tags"] = tags
            __props__.__dict__["create_time"] = None
            __props__.__dict__["index_arn"] = None
            __props__.__dict__["tags_all"] = None
            __props__.__dict__["update_time"] = None
        super(PlaceIndex, __self__).__init__(
            'aws:location/placeIndex:PlaceIndex',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            create_time: Optional[pulumi.Input[str]] = None,
            data_source: Optional[pulumi.Input[str]] = None,
            data_source_configuration: Optional[pulumi.Input[pulumi.InputType['PlaceIndexDataSourceConfigurationArgs']]] = None,
            description: Optional[pulumi.Input[str]] = None,
            index_arn: Optional[pulumi.Input[str]] = None,
            index_name: Optional[pulumi.Input[str]] = None,
            tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            update_time: Optional[pulumi.Input[str]] = None) -> 'PlaceIndex':
        """
        Get an existing PlaceIndex resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] create_time: The timestamp for when the place index resource was created in ISO 8601 format.
        :param pulumi.Input[str] data_source: Specifies the geospatial data provider for the new place index.
        :param pulumi.Input[pulumi.InputType['PlaceIndexDataSourceConfigurationArgs']] data_source_configuration: Configuration block with the data storage option chosen for requesting Places. Detailed below.
        :param pulumi.Input[str] description: The optional description for the place index resource.
        :param pulumi.Input[str] index_arn: The Amazon Resource Name (ARN) for the place index resource. Used to specify a resource across AWS.
        :param pulumi.Input[str] index_name: The name of the place index resource.
               
               The following arguments are optional:
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value tags for the place index. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        :param pulumi.Input[str] update_time: The timestamp for when the place index resource was last update in ISO 8601.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _PlaceIndexState.__new__(_PlaceIndexState)

        __props__.__dict__["create_time"] = create_time
        __props__.__dict__["data_source"] = data_source
        __props__.__dict__["data_source_configuration"] = data_source_configuration
        __props__.__dict__["description"] = description
        __props__.__dict__["index_arn"] = index_arn
        __props__.__dict__["index_name"] = index_name
        __props__.__dict__["tags"] = tags
        __props__.__dict__["tags_all"] = tags_all
        __props__.__dict__["update_time"] = update_time
        return PlaceIndex(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="createTime")
    def create_time(self) -> pulumi.Output[str]:
        """
        The timestamp for when the place index resource was created in ISO 8601 format.
        """
        return pulumi.get(self, "create_time")

    @property
    @pulumi.getter(name="dataSource")
    def data_source(self) -> pulumi.Output[str]:
        """
        Specifies the geospatial data provider for the new place index.
        """
        return pulumi.get(self, "data_source")

    @property
    @pulumi.getter(name="dataSourceConfiguration")
    def data_source_configuration(self) -> pulumi.Output['outputs.PlaceIndexDataSourceConfiguration']:
        """
        Configuration block with the data storage option chosen for requesting Places. Detailed below.
        """
        return pulumi.get(self, "data_source_configuration")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        The optional description for the place index resource.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="indexArn")
    def index_arn(self) -> pulumi.Output[str]:
        """
        The Amazon Resource Name (ARN) for the place index resource. Used to specify a resource across AWS.
        """
        return pulumi.get(self, "index_arn")

    @property
    @pulumi.getter(name="indexName")
    def index_name(self) -> pulumi.Output[str]:
        """
        The name of the place index resource.

        The following arguments are optional:
        """
        return pulumi.get(self, "index_name")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, str]]]:
        """
        Key-value tags for the place index. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
        The timestamp for when the place index resource was last update in ISO 8601.
        """
        return pulumi.get(self, "update_time")


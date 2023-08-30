# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['DataSetArgs', 'DataSet']

@pulumi.input_type
class DataSetArgs:
    def __init__(__self__, *,
                 asset_type: pulumi.Input[str],
                 description: pulumi.Input[str],
                 name: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        The set of arguments for constructing a DataSet resource.
        :param pulumi.Input[str] asset_type: The type of asset that is added to a data set. Valid values are: `S3_SNAPSHOT`, `REDSHIFT_DATA_SHARE`, and `API_GATEWAY_API`.
        :param pulumi.Input[str] description: A description for the data set.
        :param pulumi.Input[str] name: The name of the data set.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        pulumi.set(__self__, "asset_type", asset_type)
        pulumi.set(__self__, "description", description)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter(name="assetType")
    def asset_type(self) -> pulumi.Input[str]:
        """
        The type of asset that is added to a data set. Valid values are: `S3_SNAPSHOT`, `REDSHIFT_DATA_SHARE`, and `API_GATEWAY_API`.
        """
        return pulumi.get(self, "asset_type")

    @asset_type.setter
    def asset_type(self, value: pulumi.Input[str]):
        pulumi.set(self, "asset_type", value)

    @property
    @pulumi.getter
    def description(self) -> pulumi.Input[str]:
        """
        A description for the data set.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: pulumi.Input[str]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the data set.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)


@pulumi.input_type
class _DataSetState:
    def __init__(__self__, *,
                 arn: Optional[pulumi.Input[str]] = None,
                 asset_type: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        Input properties used for looking up and filtering DataSet resources.
        :param pulumi.Input[str] arn: The Amazon Resource Name of this data set.
        :param pulumi.Input[str] asset_type: The type of asset that is added to a data set. Valid values are: `S3_SNAPSHOT`, `REDSHIFT_DATA_SHARE`, and `API_GATEWAY_API`.
        :param pulumi.Input[str] description: A description for the data set.
        :param pulumi.Input[str] name: The name of the data set.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        if arn is not None:
            pulumi.set(__self__, "arn", arn)
        if asset_type is not None:
            pulumi.set(__self__, "asset_type", asset_type)
        if description is not None:
            pulumi.set(__self__, "description", description)
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
        The Amazon Resource Name of this data set.
        """
        return pulumi.get(self, "arn")

    @arn.setter
    def arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "arn", value)

    @property
    @pulumi.getter(name="assetType")
    def asset_type(self) -> Optional[pulumi.Input[str]]:
        """
        The type of asset that is added to a data set. Valid values are: `S3_SNAPSHOT`, `REDSHIFT_DATA_SHARE`, and `API_GATEWAY_API`.
        """
        return pulumi.get(self, "asset_type")

    @asset_type.setter
    def asset_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "asset_type", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        A description for the data set.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the data set.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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


class DataSet(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 asset_type: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 __props__=None):
        """
        Provides a resource to manage AWS Data Exchange DataSets.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.dataexchange.DataSet("example",
            asset_type="S3_SNAPSHOT",
            description="example")
        ```

        ## Import

        Using `pulumi import`, import DataExchange DataSets using their ARN. For example:

        ```sh
         $ pulumi import aws:dataexchange/dataSet:DataSet example arn:aws:dataexchange:us-west-2:123456789012:data-sets/4fa784c7-ccb4-4dbf-ba4f-02198320daa1
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] asset_type: The type of asset that is added to a data set. Valid values are: `S3_SNAPSHOT`, `REDSHIFT_DATA_SHARE`, and `API_GATEWAY_API`.
        :param pulumi.Input[str] description: A description for the data set.
        :param pulumi.Input[str] name: The name of the data set.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: DataSetArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a resource to manage AWS Data Exchange DataSets.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.dataexchange.DataSet("example",
            asset_type="S3_SNAPSHOT",
            description="example")
        ```

        ## Import

        Using `pulumi import`, import DataExchange DataSets using their ARN. For example:

        ```sh
         $ pulumi import aws:dataexchange/dataSet:DataSet example arn:aws:dataexchange:us-west-2:123456789012:data-sets/4fa784c7-ccb4-4dbf-ba4f-02198320daa1
        ```

        :param str resource_name: The name of the resource.
        :param DataSetArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(DataSetArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 asset_type: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = DataSetArgs.__new__(DataSetArgs)

            if asset_type is None and not opts.urn:
                raise TypeError("Missing required property 'asset_type'")
            __props__.__dict__["asset_type"] = asset_type
            if description is None and not opts.urn:
                raise TypeError("Missing required property 'description'")
            __props__.__dict__["description"] = description
            __props__.__dict__["name"] = name
            __props__.__dict__["tags"] = tags
            __props__.__dict__["arn"] = None
            __props__.__dict__["tags_all"] = None
        super(DataSet, __self__).__init__(
            'aws:dataexchange/dataSet:DataSet',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            arn: Optional[pulumi.Input[str]] = None,
            asset_type: Optional[pulumi.Input[str]] = None,
            description: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None) -> 'DataSet':
        """
        Get an existing DataSet resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] arn: The Amazon Resource Name of this data set.
        :param pulumi.Input[str] asset_type: The type of asset that is added to a data set. Valid values are: `S3_SNAPSHOT`, `REDSHIFT_DATA_SHARE`, and `API_GATEWAY_API`.
        :param pulumi.Input[str] description: A description for the data set.
        :param pulumi.Input[str] name: The name of the data set.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _DataSetState.__new__(_DataSetState)

        __props__.__dict__["arn"] = arn
        __props__.__dict__["asset_type"] = asset_type
        __props__.__dict__["description"] = description
        __props__.__dict__["name"] = name
        __props__.__dict__["tags"] = tags
        __props__.__dict__["tags_all"] = tags_all
        return DataSet(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def arn(self) -> pulumi.Output[str]:
        """
        The Amazon Resource Name of this data set.
        """
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter(name="assetType")
    def asset_type(self) -> pulumi.Output[str]:
        """
        The type of asset that is added to a data set. Valid values are: `S3_SNAPSHOT`, `REDSHIFT_DATA_SHARE`, and `API_GATEWAY_API`.
        """
        return pulumi.get(self, "asset_type")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[str]:
        """
        A description for the data set.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name of the data set.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, str]]]:
        """
        A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter(name="tagsAll")
    def tags_all(self) -> pulumi.Output[Mapping[str, str]]:
        """
        A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        return pulumi.get(self, "tags_all")


# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import sys
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
if sys.version_info >= (3, 11):
    from typing import NotRequired, TypedDict, TypeAlias
else:
    from typing_extensions import NotRequired, TypedDict, TypeAlias
from .. import _utilities

__all__ = ['DataCatalogArgs', 'DataCatalog']

@pulumi.input_type
class DataCatalogArgs:
    def __init__(__self__, *,
                 description: pulumi.Input[str],
                 parameters: pulumi.Input[Mapping[str, pulumi.Input[str]]],
                 type: pulumi.Input[str],
                 name: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        The set of arguments for constructing a DataCatalog resource.
        :param pulumi.Input[str] description: Description of the data catalog.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] parameters: Key value pairs that specifies the Lambda function or functions to use for the data catalog. The mapping used depends on the catalog type.
        :param pulumi.Input[str] type: Type of data catalog: `LAMBDA` for a federated catalog, `GLUE` for AWS Glue Catalog, or `HIVE` for an external hive metastore.
        :param pulumi.Input[str] name: Name of the data catalog. The catalog name must be unique for the AWS account and can use a maximum of 128 alphanumeric, underscore, at sign, or hyphen characters.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        pulumi.set(__self__, "description", description)
        pulumi.set(__self__, "parameters", parameters)
        pulumi.set(__self__, "type", type)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter
    def description(self) -> pulumi.Input[str]:
        """
        Description of the data catalog.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: pulumi.Input[str]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def parameters(self) -> pulumi.Input[Mapping[str, pulumi.Input[str]]]:
        """
        Key value pairs that specifies the Lambda function or functions to use for the data catalog. The mapping used depends on the catalog type.
        """
        return pulumi.get(self, "parameters")

    @parameters.setter
    def parameters(self, value: pulumi.Input[Mapping[str, pulumi.Input[str]]]):
        pulumi.set(self, "parameters", value)

    @property
    @pulumi.getter
    def type(self) -> pulumi.Input[str]:
        """
        Type of data catalog: `LAMBDA` for a federated catalog, `GLUE` for AWS Glue Catalog, or `HIVE` for an external hive metastore.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: pulumi.Input[str]):
        pulumi.set(self, "type", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the data catalog. The catalog name must be unique for the AWS account and can use a maximum of 128 alphanumeric, underscore, at sign, or hyphen characters.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)


@pulumi.input_type
class _DataCatalogState:
    def __init__(__self__, *,
                 arn: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 parameters: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 type: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering DataCatalog resources.
        :param pulumi.Input[str] arn: ARN of the data catalog.
        :param pulumi.Input[str] description: Description of the data catalog.
        :param pulumi.Input[str] name: Name of the data catalog. The catalog name must be unique for the AWS account and can use a maximum of 128 alphanumeric, underscore, at sign, or hyphen characters.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] parameters: Key value pairs that specifies the Lambda function or functions to use for the data catalog. The mapping used depends on the catalog type.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        :param pulumi.Input[str] type: Type of data catalog: `LAMBDA` for a federated catalog, `GLUE` for AWS Glue Catalog, or `HIVE` for an external hive metastore.
        """
        if arn is not None:
            pulumi.set(__self__, "arn", arn)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if parameters is not None:
            pulumi.set(__self__, "parameters", parameters)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if tags_all is not None:
            warnings.warn("""Please use `tags` instead.""", DeprecationWarning)
            pulumi.log.warn("""tags_all is deprecated: Please use `tags` instead.""")
        if tags_all is not None:
            pulumi.set(__self__, "tags_all", tags_all)
        if type is not None:
            pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter
    def arn(self) -> Optional[pulumi.Input[str]]:
        """
        ARN of the data catalog.
        """
        return pulumi.get(self, "arn")

    @arn.setter
    def arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "arn", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Description of the data catalog.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the data catalog. The catalog name must be unique for the AWS account and can use a maximum of 128 alphanumeric, underscore, at sign, or hyphen characters.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def parameters(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Key value pairs that specifies the Lambda function or functions to use for the data catalog. The mapping used depends on the catalog type.
        """
        return pulumi.get(self, "parameters")

    @parameters.setter
    def parameters(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "parameters", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)

    @property
    @pulumi.getter(name="tagsAll")
    @_utilities.deprecated("""Please use `tags` instead.""")
    def tags_all(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        return pulumi.get(self, "tags_all")

    @tags_all.setter
    def tags_all(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags_all", value)

    @property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[str]]:
        """
        Type of data catalog: `LAMBDA` for a federated catalog, `GLUE` for AWS Glue Catalog, or `HIVE` for an external hive metastore.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "type", value)


class DataCatalog(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 parameters: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides an Athena data catalog.

        More information about Athena and Athena data catalogs can be found in the [Athena User Guide](https://docs.aws.amazon.com/athena/latest/ug/what-is.html).

        > **Tip:** for a more detailed explanation on the usage of `parameters`, see the [DataCatalog API documentation](https://docs.aws.amazon.com/athena/latest/APIReference/API_DataCatalog.html)

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.athena.DataCatalog("example",
            name="athena-data-catalog",
            description="Example Athena data catalog",
            type="LAMBDA",
            parameters={
                "function": "arn:aws:lambda:eu-central-1:123456789012:function:not-important-lambda-function",
            },
            tags={
                "Name": "example-athena-data-catalog",
            })
        ```

        ### Hive based Data Catalog

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.athena.DataCatalog("example",
            name="hive-data-catalog",
            description="Hive based Data Catalog",
            type="HIVE",
            parameters={
                "metadata-function": "arn:aws:lambda:eu-central-1:123456789012:function:not-important-lambda-function",
            })
        ```

        ### Glue based Data Catalog

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.athena.DataCatalog("example",
            name="glue-data-catalog",
            description="Glue based Data Catalog",
            type="GLUE",
            parameters={
                "catalog-id": "123456789012",
            })
        ```

        ### Lambda based Data Catalog

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.athena.DataCatalog("example",
            name="lambda-data-catalog",
            description="Lambda based Data Catalog",
            type="LAMBDA",
            parameters={
                "metadata-function": "arn:aws:lambda:eu-central-1:123456789012:function:not-important-lambda-function-1",
                "record-function": "arn:aws:lambda:eu-central-1:123456789012:function:not-important-lambda-function-2",
            })
        ```

        ## Import

        Using `pulumi import`, import data catalogs using their `name`. For example:

        ```sh
        $ pulumi import aws:athena/dataCatalog:DataCatalog example example-data-catalog
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: Description of the data catalog.
        :param pulumi.Input[str] name: Name of the data catalog. The catalog name must be unique for the AWS account and can use a maximum of 128 alphanumeric, underscore, at sign, or hyphen characters.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] parameters: Key value pairs that specifies the Lambda function or functions to use for the data catalog. The mapping used depends on the catalog type.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[str] type: Type of data catalog: `LAMBDA` for a federated catalog, `GLUE` for AWS Glue Catalog, or `HIVE` for an external hive metastore.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: DataCatalogArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides an Athena data catalog.

        More information about Athena and Athena data catalogs can be found in the [Athena User Guide](https://docs.aws.amazon.com/athena/latest/ug/what-is.html).

        > **Tip:** for a more detailed explanation on the usage of `parameters`, see the [DataCatalog API documentation](https://docs.aws.amazon.com/athena/latest/APIReference/API_DataCatalog.html)

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.athena.DataCatalog("example",
            name="athena-data-catalog",
            description="Example Athena data catalog",
            type="LAMBDA",
            parameters={
                "function": "arn:aws:lambda:eu-central-1:123456789012:function:not-important-lambda-function",
            },
            tags={
                "Name": "example-athena-data-catalog",
            })
        ```

        ### Hive based Data Catalog

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.athena.DataCatalog("example",
            name="hive-data-catalog",
            description="Hive based Data Catalog",
            type="HIVE",
            parameters={
                "metadata-function": "arn:aws:lambda:eu-central-1:123456789012:function:not-important-lambda-function",
            })
        ```

        ### Glue based Data Catalog

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.athena.DataCatalog("example",
            name="glue-data-catalog",
            description="Glue based Data Catalog",
            type="GLUE",
            parameters={
                "catalog-id": "123456789012",
            })
        ```

        ### Lambda based Data Catalog

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.athena.DataCatalog("example",
            name="lambda-data-catalog",
            description="Lambda based Data Catalog",
            type="LAMBDA",
            parameters={
                "metadata-function": "arn:aws:lambda:eu-central-1:123456789012:function:not-important-lambda-function-1",
                "record-function": "arn:aws:lambda:eu-central-1:123456789012:function:not-important-lambda-function-2",
            })
        ```

        ## Import

        Using `pulumi import`, import data catalogs using their `name`. For example:

        ```sh
        $ pulumi import aws:athena/dataCatalog:DataCatalog example example-data-catalog
        ```

        :param str resource_name: The name of the resource.
        :param DataCatalogArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(DataCatalogArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 parameters: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = DataCatalogArgs.__new__(DataCatalogArgs)

            if description is None and not opts.urn:
                raise TypeError("Missing required property 'description'")
            __props__.__dict__["description"] = description
            __props__.__dict__["name"] = name
            if parameters is None and not opts.urn:
                raise TypeError("Missing required property 'parameters'")
            __props__.__dict__["parameters"] = parameters
            __props__.__dict__["tags"] = tags
            if type is None and not opts.urn:
                raise TypeError("Missing required property 'type'")
            __props__.__dict__["type"] = type
            __props__.__dict__["arn"] = None
            __props__.__dict__["tags_all"] = None
        super(DataCatalog, __self__).__init__(
            'aws:athena/dataCatalog:DataCatalog',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            arn: Optional[pulumi.Input[str]] = None,
            description: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            parameters: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            type: Optional[pulumi.Input[str]] = None) -> 'DataCatalog':
        """
        Get an existing DataCatalog resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] arn: ARN of the data catalog.
        :param pulumi.Input[str] description: Description of the data catalog.
        :param pulumi.Input[str] name: Name of the data catalog. The catalog name must be unique for the AWS account and can use a maximum of 128 alphanumeric, underscore, at sign, or hyphen characters.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] parameters: Key value pairs that specifies the Lambda function or functions to use for the data catalog. The mapping used depends on the catalog type.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        :param pulumi.Input[str] type: Type of data catalog: `LAMBDA` for a federated catalog, `GLUE` for AWS Glue Catalog, or `HIVE` for an external hive metastore.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _DataCatalogState.__new__(_DataCatalogState)

        __props__.__dict__["arn"] = arn
        __props__.__dict__["description"] = description
        __props__.__dict__["name"] = name
        __props__.__dict__["parameters"] = parameters
        __props__.__dict__["tags"] = tags
        __props__.__dict__["tags_all"] = tags_all
        __props__.__dict__["type"] = type
        return DataCatalog(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def arn(self) -> pulumi.Output[str]:
        """
        ARN of the data catalog.
        """
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[str]:
        """
        Description of the data catalog.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Name of the data catalog. The catalog name must be unique for the AWS account and can use a maximum of 128 alphanumeric, underscore, at sign, or hyphen characters.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def parameters(self) -> pulumi.Output[Mapping[str, str]]:
        """
        Key value pairs that specifies the Lambda function or functions to use for the data catalog. The mapping used depends on the catalog type.
        """
        return pulumi.get(self, "parameters")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, str]]]:
        """
        Map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter(name="tagsAll")
    @_utilities.deprecated("""Please use `tags` instead.""")
    def tags_all(self) -> pulumi.Output[Mapping[str, str]]:
        """
        Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        return pulumi.get(self, "tags_all")

    @property
    @pulumi.getter
    def type(self) -> pulumi.Output[str]:
        """
        Type of data catalog: `LAMBDA` for a federated catalog, `GLUE` for AWS Glue Catalog, or `HIVE` for an external hive metastore.
        """
        return pulumi.get(self, "type")


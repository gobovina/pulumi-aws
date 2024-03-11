# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['SchemaArgs', 'Schema']

@pulumi.input_type
class SchemaArgs:
    def __init__(__self__, *,
                 content: pulumi.Input[str],
                 registry_name: pulumi.Input[str],
                 type: pulumi.Input[str],
                 description: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        The set of arguments for constructing a Schema resource.
        :param pulumi.Input[str] content: The schema specification. Must be a valid Open API 3.0 spec.
        :param pulumi.Input[str] registry_name: The name of the registry in which this schema belongs.
        :param pulumi.Input[str] type: The type of the schema. Valid values: `OpenApi3` or `JSONSchemaDraft4`.
        :param pulumi.Input[str] description: The description of the schema. Maximum of 256 characters.
        :param pulumi.Input[str] name: The name of the schema. Maximum of 385 characters consisting of lower case letters, upper case letters, ., -, _, @.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        pulumi.set(__self__, "content", content)
        pulumi.set(__self__, "registry_name", registry_name)
        pulumi.set(__self__, "type", type)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter
    def content(self) -> pulumi.Input[str]:
        """
        The schema specification. Must be a valid Open API 3.0 spec.
        """
        return pulumi.get(self, "content")

    @content.setter
    def content(self, value: pulumi.Input[str]):
        pulumi.set(self, "content", value)

    @property
    @pulumi.getter(name="registryName")
    def registry_name(self) -> pulumi.Input[str]:
        """
        The name of the registry in which this schema belongs.
        """
        return pulumi.get(self, "registry_name")

    @registry_name.setter
    def registry_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "registry_name", value)

    @property
    @pulumi.getter
    def type(self) -> pulumi.Input[str]:
        """
        The type of the schema. Valid values: `OpenApi3` or `JSONSchemaDraft4`.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: pulumi.Input[str]):
        pulumi.set(self, "type", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        The description of the schema. Maximum of 256 characters.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the schema. Maximum of 385 characters consisting of lower case letters, upper case letters, ., -, _, @.
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
class _SchemaState:
    def __init__(__self__, *,
                 arn: Optional[pulumi.Input[str]] = None,
                 content: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 last_modified: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 registry_name: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 version: Optional[pulumi.Input[str]] = None,
                 version_created_date: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering Schema resources.
        :param pulumi.Input[str] arn: The Amazon Resource Name (ARN) of the discoverer.
        :param pulumi.Input[str] content: The schema specification. Must be a valid Open API 3.0 spec.
        :param pulumi.Input[str] description: The description of the schema. Maximum of 256 characters.
        :param pulumi.Input[str] last_modified: The last modified date of the schema.
        :param pulumi.Input[str] name: The name of the schema. Maximum of 385 characters consisting of lower case letters, upper case letters, ., -, _, @.
        :param pulumi.Input[str] registry_name: The name of the registry in which this schema belongs.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        :param pulumi.Input[str] type: The type of the schema. Valid values: `OpenApi3` or `JSONSchemaDraft4`.
        :param pulumi.Input[str] version: The version of the schema.
        :param pulumi.Input[str] version_created_date: The created date of the version of the schema.
        """
        if arn is not None:
            pulumi.set(__self__, "arn", arn)
        if content is not None:
            pulumi.set(__self__, "content", content)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if last_modified is not None:
            pulumi.set(__self__, "last_modified", last_modified)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if registry_name is not None:
            pulumi.set(__self__, "registry_name", registry_name)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if tags_all is not None:
            warnings.warn("""Please use `tags` instead.""", DeprecationWarning)
            pulumi.log.warn("""tags_all is deprecated: Please use `tags` instead.""")
        if tags_all is not None:
            pulumi.set(__self__, "tags_all", tags_all)
        if type is not None:
            pulumi.set(__self__, "type", type)
        if version is not None:
            pulumi.set(__self__, "version", version)
        if version_created_date is not None:
            pulumi.set(__self__, "version_created_date", version_created_date)

    @property
    @pulumi.getter
    def arn(self) -> Optional[pulumi.Input[str]]:
        """
        The Amazon Resource Name (ARN) of the discoverer.
        """
        return pulumi.get(self, "arn")

    @arn.setter
    def arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "arn", value)

    @property
    @pulumi.getter
    def content(self) -> Optional[pulumi.Input[str]]:
        """
        The schema specification. Must be a valid Open API 3.0 spec.
        """
        return pulumi.get(self, "content")

    @content.setter
    def content(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "content", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        The description of the schema. Maximum of 256 characters.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="lastModified")
    def last_modified(self) -> Optional[pulumi.Input[str]]:
        """
        The last modified date of the schema.
        """
        return pulumi.get(self, "last_modified")

    @last_modified.setter
    def last_modified(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "last_modified", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the schema. Maximum of 385 characters consisting of lower case letters, upper case letters, ., -, _, @.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="registryName")
    def registry_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the registry in which this schema belongs.
        """
        return pulumi.get(self, "registry_name")

    @registry_name.setter
    def registry_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "registry_name", value)

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
        warnings.warn("""Please use `tags` instead.""", DeprecationWarning)
        pulumi.log.warn("""tags_all is deprecated: Please use `tags` instead.""")

        return pulumi.get(self, "tags_all")

    @tags_all.setter
    def tags_all(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags_all", value)

    @property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[str]]:
        """
        The type of the schema. Valid values: `OpenApi3` or `JSONSchemaDraft4`.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "type", value)

    @property
    @pulumi.getter
    def version(self) -> Optional[pulumi.Input[str]]:
        """
        The version of the schema.
        """
        return pulumi.get(self, "version")

    @version.setter
    def version(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "version", value)

    @property
    @pulumi.getter(name="versionCreatedDate")
    def version_created_date(self) -> Optional[pulumi.Input[str]]:
        """
        The created date of the version of the schema.
        """
        return pulumi.get(self, "version_created_date")

    @version_created_date.setter
    def version_created_date(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "version_created_date", value)


class Schema(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 content: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 registry_name: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides an EventBridge Schema resource.

        > **Note:** EventBridge was formerly known as CloudWatch Events. The functionality is identical.

        ## Example Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import json
        import pulumi_aws as aws

        test = aws.schemas.Registry("test", name="my_own_registry")
        test_schema = aws.schemas.Schema("test",
            name="my_schema",
            registry_name=test.name,
            type="OpenApi3",
            description="The schema definition for my event",
            content=json.dumps({
                "openapi": "3.0.0",
                "info": {
                    "version": "1.0.0",
                    "title": "Event",
                },
                "paths": {},
                "components": {
                    "schemas": {
                        "Event": {
                            "type": "object",
                            "properties": {
                                "name": {
                                    "type": "string",
                                },
                            },
                        },
                    },
                },
            }))
        ```
        <!--End PulumiCodeChooser -->

        ## Import

        Using `pulumi import`, import EventBridge schema using the `name` and `registry_name`. For example:

        ```sh
        $ pulumi import aws:schemas/schema:Schema test name/registry
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] content: The schema specification. Must be a valid Open API 3.0 spec.
        :param pulumi.Input[str] description: The description of the schema. Maximum of 256 characters.
        :param pulumi.Input[str] name: The name of the schema. Maximum of 385 characters consisting of lower case letters, upper case letters, ., -, _, @.
        :param pulumi.Input[str] registry_name: The name of the registry in which this schema belongs.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[str] type: The type of the schema. Valid values: `OpenApi3` or `JSONSchemaDraft4`.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: SchemaArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides an EventBridge Schema resource.

        > **Note:** EventBridge was formerly known as CloudWatch Events. The functionality is identical.

        ## Example Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import json
        import pulumi_aws as aws

        test = aws.schemas.Registry("test", name="my_own_registry")
        test_schema = aws.schemas.Schema("test",
            name="my_schema",
            registry_name=test.name,
            type="OpenApi3",
            description="The schema definition for my event",
            content=json.dumps({
                "openapi": "3.0.0",
                "info": {
                    "version": "1.0.0",
                    "title": "Event",
                },
                "paths": {},
                "components": {
                    "schemas": {
                        "Event": {
                            "type": "object",
                            "properties": {
                                "name": {
                                    "type": "string",
                                },
                            },
                        },
                    },
                },
            }))
        ```
        <!--End PulumiCodeChooser -->

        ## Import

        Using `pulumi import`, import EventBridge schema using the `name` and `registry_name`. For example:

        ```sh
        $ pulumi import aws:schemas/schema:Schema test name/registry
        ```

        :param str resource_name: The name of the resource.
        :param SchemaArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(SchemaArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 content: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 registry_name: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = SchemaArgs.__new__(SchemaArgs)

            if content is None and not opts.urn:
                raise TypeError("Missing required property 'content'")
            __props__.__dict__["content"] = content
            __props__.__dict__["description"] = description
            __props__.__dict__["name"] = name
            if registry_name is None and not opts.urn:
                raise TypeError("Missing required property 'registry_name'")
            __props__.__dict__["registry_name"] = registry_name
            __props__.__dict__["tags"] = tags
            if type is None and not opts.urn:
                raise TypeError("Missing required property 'type'")
            __props__.__dict__["type"] = type
            __props__.__dict__["arn"] = None
            __props__.__dict__["last_modified"] = None
            __props__.__dict__["tags_all"] = None
            __props__.__dict__["version"] = None
            __props__.__dict__["version_created_date"] = None
        super(Schema, __self__).__init__(
            'aws:schemas/schema:Schema',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            arn: Optional[pulumi.Input[str]] = None,
            content: Optional[pulumi.Input[str]] = None,
            description: Optional[pulumi.Input[str]] = None,
            last_modified: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            registry_name: Optional[pulumi.Input[str]] = None,
            tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            type: Optional[pulumi.Input[str]] = None,
            version: Optional[pulumi.Input[str]] = None,
            version_created_date: Optional[pulumi.Input[str]] = None) -> 'Schema':
        """
        Get an existing Schema resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] arn: The Amazon Resource Name (ARN) of the discoverer.
        :param pulumi.Input[str] content: The schema specification. Must be a valid Open API 3.0 spec.
        :param pulumi.Input[str] description: The description of the schema. Maximum of 256 characters.
        :param pulumi.Input[str] last_modified: The last modified date of the schema.
        :param pulumi.Input[str] name: The name of the schema. Maximum of 385 characters consisting of lower case letters, upper case letters, ., -, _, @.
        :param pulumi.Input[str] registry_name: The name of the registry in which this schema belongs.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        :param pulumi.Input[str] type: The type of the schema. Valid values: `OpenApi3` or `JSONSchemaDraft4`.
        :param pulumi.Input[str] version: The version of the schema.
        :param pulumi.Input[str] version_created_date: The created date of the version of the schema.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _SchemaState.__new__(_SchemaState)

        __props__.__dict__["arn"] = arn
        __props__.__dict__["content"] = content
        __props__.__dict__["description"] = description
        __props__.__dict__["last_modified"] = last_modified
        __props__.__dict__["name"] = name
        __props__.__dict__["registry_name"] = registry_name
        __props__.__dict__["tags"] = tags
        __props__.__dict__["tags_all"] = tags_all
        __props__.__dict__["type"] = type
        __props__.__dict__["version"] = version
        __props__.__dict__["version_created_date"] = version_created_date
        return Schema(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def arn(self) -> pulumi.Output[str]:
        """
        The Amazon Resource Name (ARN) of the discoverer.
        """
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter
    def content(self) -> pulumi.Output[str]:
        """
        The schema specification. Must be a valid Open API 3.0 spec.
        """
        return pulumi.get(self, "content")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        The description of the schema. Maximum of 256 characters.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="lastModified")
    def last_modified(self) -> pulumi.Output[str]:
        """
        The last modified date of the schema.
        """
        return pulumi.get(self, "last_modified")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name of the schema. Maximum of 385 characters consisting of lower case letters, upper case letters, ., -, _, @.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="registryName")
    def registry_name(self) -> pulumi.Output[str]:
        """
        The name of the registry in which this schema belongs.
        """
        return pulumi.get(self, "registry_name")

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
        warnings.warn("""Please use `tags` instead.""", DeprecationWarning)
        pulumi.log.warn("""tags_all is deprecated: Please use `tags` instead.""")

        return pulumi.get(self, "tags_all")

    @property
    @pulumi.getter
    def type(self) -> pulumi.Output[str]:
        """
        The type of the schema. Valid values: `OpenApi3` or `JSONSchemaDraft4`.
        """
        return pulumi.get(self, "type")

    @property
    @pulumi.getter
    def version(self) -> pulumi.Output[str]:
        """
        The version of the schema.
        """
        return pulumi.get(self, "version")

    @property
    @pulumi.getter(name="versionCreatedDate")
    def version_created_date(self) -> pulumi.Output[str]:
        """
        The created date of the version of the schema.
        """
        return pulumi.get(self, "version_created_date")


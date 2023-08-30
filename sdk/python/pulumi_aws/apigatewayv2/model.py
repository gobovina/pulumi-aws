# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['ModelArgs', 'Model']

@pulumi.input_type
class ModelArgs:
    def __init__(__self__, *,
                 api_id: pulumi.Input[str],
                 content_type: pulumi.Input[str],
                 schema: pulumi.Input[str],
                 description: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a Model resource.
        :param pulumi.Input[str] api_id: API identifier.
        :param pulumi.Input[str] content_type: The content-type for the model, for example, `application/json`. Must be between 1 and 256 characters in length.
        :param pulumi.Input[str] schema: Schema for the model. This should be a [JSON schema draft 4](https://tools.ietf.org/html/draft-zyp-json-schema-04) model. Must be less than or equal to 32768 characters in length.
        :param pulumi.Input[str] description: Description of the model. Must be between 1 and 128 characters in length.
        :param pulumi.Input[str] name: Name of the model. Must be alphanumeric. Must be between 1 and 128 characters in length.
        """
        pulumi.set(__self__, "api_id", api_id)
        pulumi.set(__self__, "content_type", content_type)
        pulumi.set(__self__, "schema", schema)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter(name="apiId")
    def api_id(self) -> pulumi.Input[str]:
        """
        API identifier.
        """
        return pulumi.get(self, "api_id")

    @api_id.setter
    def api_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "api_id", value)

    @property
    @pulumi.getter(name="contentType")
    def content_type(self) -> pulumi.Input[str]:
        """
        The content-type for the model, for example, `application/json`. Must be between 1 and 256 characters in length.
        """
        return pulumi.get(self, "content_type")

    @content_type.setter
    def content_type(self, value: pulumi.Input[str]):
        pulumi.set(self, "content_type", value)

    @property
    @pulumi.getter
    def schema(self) -> pulumi.Input[str]:
        """
        Schema for the model. This should be a [JSON schema draft 4](https://tools.ietf.org/html/draft-zyp-json-schema-04) model. Must be less than or equal to 32768 characters in length.
        """
        return pulumi.get(self, "schema")

    @schema.setter
    def schema(self, value: pulumi.Input[str]):
        pulumi.set(self, "schema", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Description of the model. Must be between 1 and 128 characters in length.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the model. Must be alphanumeric. Must be between 1 and 128 characters in length.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _ModelState:
    def __init__(__self__, *,
                 api_id: Optional[pulumi.Input[str]] = None,
                 content_type: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 schema: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering Model resources.
        :param pulumi.Input[str] api_id: API identifier.
        :param pulumi.Input[str] content_type: The content-type for the model, for example, `application/json`. Must be between 1 and 256 characters in length.
        :param pulumi.Input[str] description: Description of the model. Must be between 1 and 128 characters in length.
        :param pulumi.Input[str] name: Name of the model. Must be alphanumeric. Must be between 1 and 128 characters in length.
        :param pulumi.Input[str] schema: Schema for the model. This should be a [JSON schema draft 4](https://tools.ietf.org/html/draft-zyp-json-schema-04) model. Must be less than or equal to 32768 characters in length.
        """
        if api_id is not None:
            pulumi.set(__self__, "api_id", api_id)
        if content_type is not None:
            pulumi.set(__self__, "content_type", content_type)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if schema is not None:
            pulumi.set(__self__, "schema", schema)

    @property
    @pulumi.getter(name="apiId")
    def api_id(self) -> Optional[pulumi.Input[str]]:
        """
        API identifier.
        """
        return pulumi.get(self, "api_id")

    @api_id.setter
    def api_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "api_id", value)

    @property
    @pulumi.getter(name="contentType")
    def content_type(self) -> Optional[pulumi.Input[str]]:
        """
        The content-type for the model, for example, `application/json`. Must be between 1 and 256 characters in length.
        """
        return pulumi.get(self, "content_type")

    @content_type.setter
    def content_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "content_type", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Description of the model. Must be between 1 and 128 characters in length.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the model. Must be alphanumeric. Must be between 1 and 128 characters in length.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def schema(self) -> Optional[pulumi.Input[str]]:
        """
        Schema for the model. This should be a [JSON schema draft 4](https://tools.ietf.org/html/draft-zyp-json-schema-04) model. Must be less than or equal to 32768 characters in length.
        """
        return pulumi.get(self, "schema")

    @schema.setter
    def schema(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "schema", value)


class Model(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 api_id: Optional[pulumi.Input[str]] = None,
                 content_type: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 schema: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Manages an Amazon API Gateway Version 2 [model](https://docs.aws.amazon.com/apigateway/latest/developerguide/models-mappings.html#models-mappings-models).

        ## Example Usage
        ### Basic

        ```python
        import pulumi
        import json
        import pulumi_aws as aws

        example = aws.apigatewayv2.Model("example",
            api_id=aws_apigatewayv2_api["example"]["id"],
            content_type="application/json",
            schema=json.dumps({
                "$schema": "http://json-schema.org/draft-04/schema#",
                "title": "ExampleModel",
                "type": "object",
                "properties": {
                    "id": {
                        "type": "string",
                    },
                },
            }))
        ```

        ## Import

        Using `pulumi import`, import `aws_apigatewayv2_model` using the API identifier and model identifier. For example:

        ```sh
         $ pulumi import aws:apigatewayv2/model:Model example aabbccddee/1122334
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] api_id: API identifier.
        :param pulumi.Input[str] content_type: The content-type for the model, for example, `application/json`. Must be between 1 and 256 characters in length.
        :param pulumi.Input[str] description: Description of the model. Must be between 1 and 128 characters in length.
        :param pulumi.Input[str] name: Name of the model. Must be alphanumeric. Must be between 1 and 128 characters in length.
        :param pulumi.Input[str] schema: Schema for the model. This should be a [JSON schema draft 4](https://tools.ietf.org/html/draft-zyp-json-schema-04) model. Must be less than or equal to 32768 characters in length.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ModelArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages an Amazon API Gateway Version 2 [model](https://docs.aws.amazon.com/apigateway/latest/developerguide/models-mappings.html#models-mappings-models).

        ## Example Usage
        ### Basic

        ```python
        import pulumi
        import json
        import pulumi_aws as aws

        example = aws.apigatewayv2.Model("example",
            api_id=aws_apigatewayv2_api["example"]["id"],
            content_type="application/json",
            schema=json.dumps({
                "$schema": "http://json-schema.org/draft-04/schema#",
                "title": "ExampleModel",
                "type": "object",
                "properties": {
                    "id": {
                        "type": "string",
                    },
                },
            }))
        ```

        ## Import

        Using `pulumi import`, import `aws_apigatewayv2_model` using the API identifier and model identifier. For example:

        ```sh
         $ pulumi import aws:apigatewayv2/model:Model example aabbccddee/1122334
        ```

        :param str resource_name: The name of the resource.
        :param ModelArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ModelArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 api_id: Optional[pulumi.Input[str]] = None,
                 content_type: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 schema: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ModelArgs.__new__(ModelArgs)

            if api_id is None and not opts.urn:
                raise TypeError("Missing required property 'api_id'")
            __props__.__dict__["api_id"] = api_id
            if content_type is None and not opts.urn:
                raise TypeError("Missing required property 'content_type'")
            __props__.__dict__["content_type"] = content_type
            __props__.__dict__["description"] = description
            __props__.__dict__["name"] = name
            if schema is None and not opts.urn:
                raise TypeError("Missing required property 'schema'")
            __props__.__dict__["schema"] = schema
        super(Model, __self__).__init__(
            'aws:apigatewayv2/model:Model',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            api_id: Optional[pulumi.Input[str]] = None,
            content_type: Optional[pulumi.Input[str]] = None,
            description: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            schema: Optional[pulumi.Input[str]] = None) -> 'Model':
        """
        Get an existing Model resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] api_id: API identifier.
        :param pulumi.Input[str] content_type: The content-type for the model, for example, `application/json`. Must be between 1 and 256 characters in length.
        :param pulumi.Input[str] description: Description of the model. Must be between 1 and 128 characters in length.
        :param pulumi.Input[str] name: Name of the model. Must be alphanumeric. Must be between 1 and 128 characters in length.
        :param pulumi.Input[str] schema: Schema for the model. This should be a [JSON schema draft 4](https://tools.ietf.org/html/draft-zyp-json-schema-04) model. Must be less than or equal to 32768 characters in length.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ModelState.__new__(_ModelState)

        __props__.__dict__["api_id"] = api_id
        __props__.__dict__["content_type"] = content_type
        __props__.__dict__["description"] = description
        __props__.__dict__["name"] = name
        __props__.__dict__["schema"] = schema
        return Model(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="apiId")
    def api_id(self) -> pulumi.Output[str]:
        """
        API identifier.
        """
        return pulumi.get(self, "api_id")

    @property
    @pulumi.getter(name="contentType")
    def content_type(self) -> pulumi.Output[str]:
        """
        The content-type for the model, for example, `application/json`. Must be between 1 and 256 characters in length.
        """
        return pulumi.get(self, "content_type")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        Description of the model. Must be between 1 and 128 characters in length.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Name of the model. Must be alphanumeric. Must be between 1 and 128 characters in length.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def schema(self) -> pulumi.Output[str]:
        """
        Schema for the model. This should be a [JSON schema draft 4](https://tools.ietf.org/html/draft-zyp-json-schema-04) model. Must be less than or equal to 32768 characters in length.
        """
        return pulumi.get(self, "schema")


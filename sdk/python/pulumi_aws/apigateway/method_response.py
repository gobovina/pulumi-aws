# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['MethodResponseArgs', 'MethodResponse']

@pulumi.input_type
class MethodResponseArgs:
    def __init__(__self__, *,
                 http_method: pulumi.Input[str],
                 resource_id: pulumi.Input[str],
                 rest_api: pulumi.Input[str],
                 status_code: pulumi.Input[str],
                 response_models: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 response_parameters: Optional[pulumi.Input[Mapping[str, pulumi.Input[bool]]]] = None):
        """
        The set of arguments for constructing a MethodResponse resource.
        :param pulumi.Input[str] http_method: The HTTP verb of the method resource (`GET`, `POST`, `PUT`, `DELETE`, `HEAD`, `OPTIONS`, `ANY`).
        :param pulumi.Input[str] resource_id: The Resource identifier for the method resource.
        :param pulumi.Input[str] rest_api: The string identifier of the associated REST API.
        :param pulumi.Input[str] status_code: The method response's status code.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] response_models: A map specifying the model resources used for the response's content type. Response models are represented as a key/value map, with a content type as the key and a Model name as the value.
        :param pulumi.Input[Mapping[str, pulumi.Input[bool]]] response_parameters: A map specifying required or optional response parameters that API Gateway can send back to the caller. A key defines a method response header name and the associated value is a boolean flag indicating whether the method response parameter is required. The method response header names must match the pattern of `method.response.header.{name}`, where `name` is a valid and unique header name.
               
               The response parameter names defined here are available in the integration response to be mapped from an integration response header expressed in `integration.response.header.{name}`, a static value enclosed within a pair of single quotes (e.g., '`application/json'`), or a JSON expression from the back-end response payload in the form of `integration.response.body.{JSON-expression}`, where `JSON-expression` is a valid JSON expression without the `$` prefix.)
        """
        pulumi.set(__self__, "http_method", http_method)
        pulumi.set(__self__, "resource_id", resource_id)
        pulumi.set(__self__, "rest_api", rest_api)
        pulumi.set(__self__, "status_code", status_code)
        if response_models is not None:
            pulumi.set(__self__, "response_models", response_models)
        if response_parameters is not None:
            pulumi.set(__self__, "response_parameters", response_parameters)

    @property
    @pulumi.getter(name="httpMethod")
    def http_method(self) -> pulumi.Input[str]:
        """
        The HTTP verb of the method resource (`GET`, `POST`, `PUT`, `DELETE`, `HEAD`, `OPTIONS`, `ANY`).
        """
        return pulumi.get(self, "http_method")

    @http_method.setter
    def http_method(self, value: pulumi.Input[str]):
        pulumi.set(self, "http_method", value)

    @property
    @pulumi.getter(name="resourceId")
    def resource_id(self) -> pulumi.Input[str]:
        """
        The Resource identifier for the method resource.
        """
        return pulumi.get(self, "resource_id")

    @resource_id.setter
    def resource_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "resource_id", value)

    @property
    @pulumi.getter(name="restApi")
    def rest_api(self) -> pulumi.Input[str]:
        """
        The string identifier of the associated REST API.
        """
        return pulumi.get(self, "rest_api")

    @rest_api.setter
    def rest_api(self, value: pulumi.Input[str]):
        pulumi.set(self, "rest_api", value)

    @property
    @pulumi.getter(name="statusCode")
    def status_code(self) -> pulumi.Input[str]:
        """
        The method response's status code.
        """
        return pulumi.get(self, "status_code")

    @status_code.setter
    def status_code(self, value: pulumi.Input[str]):
        pulumi.set(self, "status_code", value)

    @property
    @pulumi.getter(name="responseModels")
    def response_models(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        A map specifying the model resources used for the response's content type. Response models are represented as a key/value map, with a content type as the key and a Model name as the value.
        """
        return pulumi.get(self, "response_models")

    @response_models.setter
    def response_models(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "response_models", value)

    @property
    @pulumi.getter(name="responseParameters")
    def response_parameters(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[bool]]]]:
        """
        A map specifying required or optional response parameters that API Gateway can send back to the caller. A key defines a method response header name and the associated value is a boolean flag indicating whether the method response parameter is required. The method response header names must match the pattern of `method.response.header.{name}`, where `name` is a valid and unique header name.

        The response parameter names defined here are available in the integration response to be mapped from an integration response header expressed in `integration.response.header.{name}`, a static value enclosed within a pair of single quotes (e.g., '`application/json'`), or a JSON expression from the back-end response payload in the form of `integration.response.body.{JSON-expression}`, where `JSON-expression` is a valid JSON expression without the `$` prefix.)
        """
        return pulumi.get(self, "response_parameters")

    @response_parameters.setter
    def response_parameters(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[bool]]]]):
        pulumi.set(self, "response_parameters", value)


@pulumi.input_type
class _MethodResponseState:
    def __init__(__self__, *,
                 http_method: Optional[pulumi.Input[str]] = None,
                 resource_id: Optional[pulumi.Input[str]] = None,
                 response_models: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 response_parameters: Optional[pulumi.Input[Mapping[str, pulumi.Input[bool]]]] = None,
                 rest_api: Optional[pulumi.Input[str]] = None,
                 status_code: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering MethodResponse resources.
        :param pulumi.Input[str] http_method: The HTTP verb of the method resource (`GET`, `POST`, `PUT`, `DELETE`, `HEAD`, `OPTIONS`, `ANY`).
        :param pulumi.Input[str] resource_id: The Resource identifier for the method resource.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] response_models: A map specifying the model resources used for the response's content type. Response models are represented as a key/value map, with a content type as the key and a Model name as the value.
        :param pulumi.Input[Mapping[str, pulumi.Input[bool]]] response_parameters: A map specifying required or optional response parameters that API Gateway can send back to the caller. A key defines a method response header name and the associated value is a boolean flag indicating whether the method response parameter is required. The method response header names must match the pattern of `method.response.header.{name}`, where `name` is a valid and unique header name.
               
               The response parameter names defined here are available in the integration response to be mapped from an integration response header expressed in `integration.response.header.{name}`, a static value enclosed within a pair of single quotes (e.g., '`application/json'`), or a JSON expression from the back-end response payload in the form of `integration.response.body.{JSON-expression}`, where `JSON-expression` is a valid JSON expression without the `$` prefix.)
        :param pulumi.Input[str] rest_api: The string identifier of the associated REST API.
        :param pulumi.Input[str] status_code: The method response's status code.
        """
        if http_method is not None:
            pulumi.set(__self__, "http_method", http_method)
        if resource_id is not None:
            pulumi.set(__self__, "resource_id", resource_id)
        if response_models is not None:
            pulumi.set(__self__, "response_models", response_models)
        if response_parameters is not None:
            pulumi.set(__self__, "response_parameters", response_parameters)
        if rest_api is not None:
            pulumi.set(__self__, "rest_api", rest_api)
        if status_code is not None:
            pulumi.set(__self__, "status_code", status_code)

    @property
    @pulumi.getter(name="httpMethod")
    def http_method(self) -> Optional[pulumi.Input[str]]:
        """
        The HTTP verb of the method resource (`GET`, `POST`, `PUT`, `DELETE`, `HEAD`, `OPTIONS`, `ANY`).
        """
        return pulumi.get(self, "http_method")

    @http_method.setter
    def http_method(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "http_method", value)

    @property
    @pulumi.getter(name="resourceId")
    def resource_id(self) -> Optional[pulumi.Input[str]]:
        """
        The Resource identifier for the method resource.
        """
        return pulumi.get(self, "resource_id")

    @resource_id.setter
    def resource_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "resource_id", value)

    @property
    @pulumi.getter(name="responseModels")
    def response_models(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        A map specifying the model resources used for the response's content type. Response models are represented as a key/value map, with a content type as the key and a Model name as the value.
        """
        return pulumi.get(self, "response_models")

    @response_models.setter
    def response_models(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "response_models", value)

    @property
    @pulumi.getter(name="responseParameters")
    def response_parameters(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[bool]]]]:
        """
        A map specifying required or optional response parameters that API Gateway can send back to the caller. A key defines a method response header name and the associated value is a boolean flag indicating whether the method response parameter is required. The method response header names must match the pattern of `method.response.header.{name}`, where `name` is a valid and unique header name.

        The response parameter names defined here are available in the integration response to be mapped from an integration response header expressed in `integration.response.header.{name}`, a static value enclosed within a pair of single quotes (e.g., '`application/json'`), or a JSON expression from the back-end response payload in the form of `integration.response.body.{JSON-expression}`, where `JSON-expression` is a valid JSON expression without the `$` prefix.)
        """
        return pulumi.get(self, "response_parameters")

    @response_parameters.setter
    def response_parameters(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[bool]]]]):
        pulumi.set(self, "response_parameters", value)

    @property
    @pulumi.getter(name="restApi")
    def rest_api(self) -> Optional[pulumi.Input[str]]:
        """
        The string identifier of the associated REST API.
        """
        return pulumi.get(self, "rest_api")

    @rest_api.setter
    def rest_api(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "rest_api", value)

    @property
    @pulumi.getter(name="statusCode")
    def status_code(self) -> Optional[pulumi.Input[str]]:
        """
        The method response's status code.
        """
        return pulumi.get(self, "status_code")

    @status_code.setter
    def status_code(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status_code", value)


class MethodResponse(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 http_method: Optional[pulumi.Input[str]] = None,
                 resource_id: Optional[pulumi.Input[str]] = None,
                 response_models: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 response_parameters: Optional[pulumi.Input[Mapping[str, pulumi.Input[bool]]]] = None,
                 rest_api: Optional[pulumi.Input[str]] = None,
                 status_code: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides an HTTP Method Response for an API Gateway Resource. More information about API Gateway method responses can be found in the [Amazon API Gateway Developer Guide](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-method-settings-method-response.html).

        ## Example Usage

        ### Basic Response

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_aws as aws

        my_demo_api = aws.apigateway.RestApi("MyDemoAPI",
            name="MyDemoAPI",
            description="This is my API for demonstration purposes")
        my_demo_resource = aws.apigateway.Resource("MyDemoResource",
            rest_api=my_demo_api.id,
            parent_id=my_demo_api.root_resource_id,
            path_part="mydemoresource")
        my_demo_method = aws.apigateway.Method("MyDemoMethod",
            rest_api=my_demo_api.id,
            resource_id=my_demo_resource.id,
            http_method="GET",
            authorization="NONE")
        my_demo_integration = aws.apigateway.Integration("MyDemoIntegration",
            rest_api=my_demo_api.id,
            resource_id=my_demo_resource.id,
            http_method=my_demo_method.http_method,
            type="MOCK")
        response200 = aws.apigateway.MethodResponse("response_200",
            rest_api=my_demo_api.id,
            resource_id=my_demo_resource.id,
            http_method=my_demo_method.http_method,
            status_code="200")
        ```
        <!--End PulumiCodeChooser -->

        ### Response with Custom Header and Model

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import json
        import pulumi_aws as aws

        my_demo_api = aws.apigateway.RestApi("MyDemoAPI",
            name="MyDemoAPI",
            description="This is my API for demonstration purposes")
        my_demo_resource = aws.apigateway.Resource("MyDemoResource",
            rest_api=my_demo_api.id,
            parent_id=my_demo_api.root_resource_id,
            path_part="mydemoresource")
        my_demo_method = aws.apigateway.Method("MyDemoMethod",
            rest_api=my_demo_api.id,
            resource_id=my_demo_resource.id,
            http_method="GET",
            authorization="NONE")
        my_demo_integration = aws.apigateway.Integration("MyDemoIntegration",
            rest_api=my_demo_api.id,
            resource_id=my_demo_resource.id,
            http_method=my_demo_method.http_method,
            type="MOCK")
        my_demo_response_model = aws.apigateway.Model("MyDemoResponseModel",
            rest_api=my_demo_api.id,
            name="MyDemoResponseModel",
            description="API response for MyDemoMethod",
            content_type="application/json",
            schema=json.dumps({
                "$schema": "http://json-schema.org/draft-04/schema#",
                "title": "MyDemoResponse",
                "type": "object",
                "properties": {
                    "message": {
                        "type": "string",
                    },
                },
            }))
        response200 = aws.apigateway.MethodResponse("response_200",
            rest_api=my_demo_api.id,
            resource_id=my_demo_resource.id,
            http_method=my_demo_method.http_method,
            status_code="200",
            response_models={
                "application-json": "MyDemoResponseModel",
            },
            response_parameters={
                "method.response.header.Content-Type": False,
                "method-response-header.X-My-Demo-Header": False,
            })
        ```
        <!--End PulumiCodeChooser -->

        ## Import

        Using `pulumi import`, import `aws_api_gateway_method_response` using `REST-API-ID/RESOURCE-ID/HTTP-METHOD/STATUS-CODE`. For example:

        ```sh
        $ pulumi import aws:apigateway/methodResponse:MethodResponse example 12345abcde/67890fghij/GET/200
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] http_method: The HTTP verb of the method resource (`GET`, `POST`, `PUT`, `DELETE`, `HEAD`, `OPTIONS`, `ANY`).
        :param pulumi.Input[str] resource_id: The Resource identifier for the method resource.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] response_models: A map specifying the model resources used for the response's content type. Response models are represented as a key/value map, with a content type as the key and a Model name as the value.
        :param pulumi.Input[Mapping[str, pulumi.Input[bool]]] response_parameters: A map specifying required or optional response parameters that API Gateway can send back to the caller. A key defines a method response header name and the associated value is a boolean flag indicating whether the method response parameter is required. The method response header names must match the pattern of `method.response.header.{name}`, where `name` is a valid and unique header name.
               
               The response parameter names defined here are available in the integration response to be mapped from an integration response header expressed in `integration.response.header.{name}`, a static value enclosed within a pair of single quotes (e.g., '`application/json'`), or a JSON expression from the back-end response payload in the form of `integration.response.body.{JSON-expression}`, where `JSON-expression` is a valid JSON expression without the `$` prefix.)
        :param pulumi.Input[str] rest_api: The string identifier of the associated REST API.
        :param pulumi.Input[str] status_code: The method response's status code.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: MethodResponseArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides an HTTP Method Response for an API Gateway Resource. More information about API Gateway method responses can be found in the [Amazon API Gateway Developer Guide](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-method-settings-method-response.html).

        ## Example Usage

        ### Basic Response

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_aws as aws

        my_demo_api = aws.apigateway.RestApi("MyDemoAPI",
            name="MyDemoAPI",
            description="This is my API for demonstration purposes")
        my_demo_resource = aws.apigateway.Resource("MyDemoResource",
            rest_api=my_demo_api.id,
            parent_id=my_demo_api.root_resource_id,
            path_part="mydemoresource")
        my_demo_method = aws.apigateway.Method("MyDemoMethod",
            rest_api=my_demo_api.id,
            resource_id=my_demo_resource.id,
            http_method="GET",
            authorization="NONE")
        my_demo_integration = aws.apigateway.Integration("MyDemoIntegration",
            rest_api=my_demo_api.id,
            resource_id=my_demo_resource.id,
            http_method=my_demo_method.http_method,
            type="MOCK")
        response200 = aws.apigateway.MethodResponse("response_200",
            rest_api=my_demo_api.id,
            resource_id=my_demo_resource.id,
            http_method=my_demo_method.http_method,
            status_code="200")
        ```
        <!--End PulumiCodeChooser -->

        ### Response with Custom Header and Model

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import json
        import pulumi_aws as aws

        my_demo_api = aws.apigateway.RestApi("MyDemoAPI",
            name="MyDemoAPI",
            description="This is my API for demonstration purposes")
        my_demo_resource = aws.apigateway.Resource("MyDemoResource",
            rest_api=my_demo_api.id,
            parent_id=my_demo_api.root_resource_id,
            path_part="mydemoresource")
        my_demo_method = aws.apigateway.Method("MyDemoMethod",
            rest_api=my_demo_api.id,
            resource_id=my_demo_resource.id,
            http_method="GET",
            authorization="NONE")
        my_demo_integration = aws.apigateway.Integration("MyDemoIntegration",
            rest_api=my_demo_api.id,
            resource_id=my_demo_resource.id,
            http_method=my_demo_method.http_method,
            type="MOCK")
        my_demo_response_model = aws.apigateway.Model("MyDemoResponseModel",
            rest_api=my_demo_api.id,
            name="MyDemoResponseModel",
            description="API response for MyDemoMethod",
            content_type="application/json",
            schema=json.dumps({
                "$schema": "http://json-schema.org/draft-04/schema#",
                "title": "MyDemoResponse",
                "type": "object",
                "properties": {
                    "message": {
                        "type": "string",
                    },
                },
            }))
        response200 = aws.apigateway.MethodResponse("response_200",
            rest_api=my_demo_api.id,
            resource_id=my_demo_resource.id,
            http_method=my_demo_method.http_method,
            status_code="200",
            response_models={
                "application-json": "MyDemoResponseModel",
            },
            response_parameters={
                "method.response.header.Content-Type": False,
                "method-response-header.X-My-Demo-Header": False,
            })
        ```
        <!--End PulumiCodeChooser -->

        ## Import

        Using `pulumi import`, import `aws_api_gateway_method_response` using `REST-API-ID/RESOURCE-ID/HTTP-METHOD/STATUS-CODE`. For example:

        ```sh
        $ pulumi import aws:apigateway/methodResponse:MethodResponse example 12345abcde/67890fghij/GET/200
        ```

        :param str resource_name: The name of the resource.
        :param MethodResponseArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(MethodResponseArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 http_method: Optional[pulumi.Input[str]] = None,
                 resource_id: Optional[pulumi.Input[str]] = None,
                 response_models: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 response_parameters: Optional[pulumi.Input[Mapping[str, pulumi.Input[bool]]]] = None,
                 rest_api: Optional[pulumi.Input[str]] = None,
                 status_code: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = MethodResponseArgs.__new__(MethodResponseArgs)

            if http_method is None and not opts.urn:
                raise TypeError("Missing required property 'http_method'")
            __props__.__dict__["http_method"] = http_method
            if resource_id is None and not opts.urn:
                raise TypeError("Missing required property 'resource_id'")
            __props__.__dict__["resource_id"] = resource_id
            __props__.__dict__["response_models"] = response_models
            __props__.__dict__["response_parameters"] = response_parameters
            if rest_api is None and not opts.urn:
                raise TypeError("Missing required property 'rest_api'")
            __props__.__dict__["rest_api"] = rest_api
            if status_code is None and not opts.urn:
                raise TypeError("Missing required property 'status_code'")
            __props__.__dict__["status_code"] = status_code
        super(MethodResponse, __self__).__init__(
            'aws:apigateway/methodResponse:MethodResponse',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            http_method: Optional[pulumi.Input[str]] = None,
            resource_id: Optional[pulumi.Input[str]] = None,
            response_models: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            response_parameters: Optional[pulumi.Input[Mapping[str, pulumi.Input[bool]]]] = None,
            rest_api: Optional[pulumi.Input[str]] = None,
            status_code: Optional[pulumi.Input[str]] = None) -> 'MethodResponse':
        """
        Get an existing MethodResponse resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] http_method: The HTTP verb of the method resource (`GET`, `POST`, `PUT`, `DELETE`, `HEAD`, `OPTIONS`, `ANY`).
        :param pulumi.Input[str] resource_id: The Resource identifier for the method resource.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] response_models: A map specifying the model resources used for the response's content type. Response models are represented as a key/value map, with a content type as the key and a Model name as the value.
        :param pulumi.Input[Mapping[str, pulumi.Input[bool]]] response_parameters: A map specifying required or optional response parameters that API Gateway can send back to the caller. A key defines a method response header name and the associated value is a boolean flag indicating whether the method response parameter is required. The method response header names must match the pattern of `method.response.header.{name}`, where `name` is a valid and unique header name.
               
               The response parameter names defined here are available in the integration response to be mapped from an integration response header expressed in `integration.response.header.{name}`, a static value enclosed within a pair of single quotes (e.g., '`application/json'`), or a JSON expression from the back-end response payload in the form of `integration.response.body.{JSON-expression}`, where `JSON-expression` is a valid JSON expression without the `$` prefix.)
        :param pulumi.Input[str] rest_api: The string identifier of the associated REST API.
        :param pulumi.Input[str] status_code: The method response's status code.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _MethodResponseState.__new__(_MethodResponseState)

        __props__.__dict__["http_method"] = http_method
        __props__.__dict__["resource_id"] = resource_id
        __props__.__dict__["response_models"] = response_models
        __props__.__dict__["response_parameters"] = response_parameters
        __props__.__dict__["rest_api"] = rest_api
        __props__.__dict__["status_code"] = status_code
        return MethodResponse(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="httpMethod")
    def http_method(self) -> pulumi.Output[str]:
        """
        The HTTP verb of the method resource (`GET`, `POST`, `PUT`, `DELETE`, `HEAD`, `OPTIONS`, `ANY`).
        """
        return pulumi.get(self, "http_method")

    @property
    @pulumi.getter(name="resourceId")
    def resource_id(self) -> pulumi.Output[str]:
        """
        The Resource identifier for the method resource.
        """
        return pulumi.get(self, "resource_id")

    @property
    @pulumi.getter(name="responseModels")
    def response_models(self) -> pulumi.Output[Optional[Mapping[str, str]]]:
        """
        A map specifying the model resources used for the response's content type. Response models are represented as a key/value map, with a content type as the key and a Model name as the value.
        """
        return pulumi.get(self, "response_models")

    @property
    @pulumi.getter(name="responseParameters")
    def response_parameters(self) -> pulumi.Output[Optional[Mapping[str, bool]]]:
        """
        A map specifying required or optional response parameters that API Gateway can send back to the caller. A key defines a method response header name and the associated value is a boolean flag indicating whether the method response parameter is required. The method response header names must match the pattern of `method.response.header.{name}`, where `name` is a valid and unique header name.

        The response parameter names defined here are available in the integration response to be mapped from an integration response header expressed in `integration.response.header.{name}`, a static value enclosed within a pair of single quotes (e.g., '`application/json'`), or a JSON expression from the back-end response payload in the form of `integration.response.body.{JSON-expression}`, where `JSON-expression` is a valid JSON expression without the `$` prefix.)
        """
        return pulumi.get(self, "response_parameters")

    @property
    @pulumi.getter(name="restApi")
    def rest_api(self) -> pulumi.Output[str]:
        """
        The string identifier of the associated REST API.
        """
        return pulumi.get(self, "rest_api")

    @property
    @pulumi.getter(name="statusCode")
    def status_code(self) -> pulumi.Output[str]:
        """
        The method response's status code.
        """
        return pulumi.get(self, "status_code")


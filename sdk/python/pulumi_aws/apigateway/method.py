# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['MethodArgs', 'Method']

@pulumi.input_type
class MethodArgs:
    def __init__(__self__, *,
                 authorization: pulumi.Input[str],
                 http_method: pulumi.Input[str],
                 resource_id: pulumi.Input[str],
                 rest_api: pulumi.Input[str],
                 api_key_required: Optional[pulumi.Input[bool]] = None,
                 authorization_scopes: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 authorizer_id: Optional[pulumi.Input[str]] = None,
                 operation_name: Optional[pulumi.Input[str]] = None,
                 request_models: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 request_parameters: Optional[pulumi.Input[Mapping[str, pulumi.Input[bool]]]] = None,
                 request_validator_id: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a Method resource.
        :param pulumi.Input[str] authorization: Type of authorization used for the method (`NONE`, `CUSTOM`, `AWS_IAM`, `COGNITO_USER_POOLS`)
        :param pulumi.Input[str] http_method: HTTP Method (`GET`, `POST`, `PUT`, `DELETE`, `HEAD`, `OPTIONS`, `ANY`)
        :param pulumi.Input[str] resource_id: API resource ID
        :param pulumi.Input[str] rest_api: ID of the associated REST API
        :param pulumi.Input[bool] api_key_required: Specify if the method requires an API key
        :param pulumi.Input[Sequence[pulumi.Input[str]]] authorization_scopes: Authorization scopes used when the authorization is `COGNITO_USER_POOLS`
        :param pulumi.Input[str] authorizer_id: Authorizer id to be used when the authorization is `CUSTOM` or `COGNITO_USER_POOLS`
        :param pulumi.Input[str] operation_name: Function name that will be given to the method when generating an SDK through API Gateway. If omitted, API Gateway will generate a function name based on the resource path and HTTP verb.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] request_models: Map of the API models used for the request's content type
               where key is the content type (e.g., `application/json`)
               and value is either `Error`, `Empty` (built-in models) or `apigateway.Model`'s `name`.
        :param pulumi.Input[Mapping[str, pulumi.Input[bool]]] request_parameters: Map of request parameters (from the path, query string and headers) that should be passed to the integration. The boolean value indicates whether the parameter is required (`true`) or optional (`false`).
               For example: `request_parameters = {"method.request.header.X-Some-Header" = true "method.request.querystring.some-query-param" = true}` would define that the header `X-Some-Header` and the query string `some-query-param` must be provided in the request.
        :param pulumi.Input[str] request_validator_id: ID of a `apigateway.RequestValidator`
        """
        pulumi.set(__self__, "authorization", authorization)
        pulumi.set(__self__, "http_method", http_method)
        pulumi.set(__self__, "resource_id", resource_id)
        pulumi.set(__self__, "rest_api", rest_api)
        if api_key_required is not None:
            pulumi.set(__self__, "api_key_required", api_key_required)
        if authorization_scopes is not None:
            pulumi.set(__self__, "authorization_scopes", authorization_scopes)
        if authorizer_id is not None:
            pulumi.set(__self__, "authorizer_id", authorizer_id)
        if operation_name is not None:
            pulumi.set(__self__, "operation_name", operation_name)
        if request_models is not None:
            pulumi.set(__self__, "request_models", request_models)
        if request_parameters is not None:
            pulumi.set(__self__, "request_parameters", request_parameters)
        if request_validator_id is not None:
            pulumi.set(__self__, "request_validator_id", request_validator_id)

    @property
    @pulumi.getter
    def authorization(self) -> pulumi.Input[str]:
        """
        Type of authorization used for the method (`NONE`, `CUSTOM`, `AWS_IAM`, `COGNITO_USER_POOLS`)
        """
        return pulumi.get(self, "authorization")

    @authorization.setter
    def authorization(self, value: pulumi.Input[str]):
        pulumi.set(self, "authorization", value)

    @property
    @pulumi.getter(name="httpMethod")
    def http_method(self) -> pulumi.Input[str]:
        """
        HTTP Method (`GET`, `POST`, `PUT`, `DELETE`, `HEAD`, `OPTIONS`, `ANY`)
        """
        return pulumi.get(self, "http_method")

    @http_method.setter
    def http_method(self, value: pulumi.Input[str]):
        pulumi.set(self, "http_method", value)

    @property
    @pulumi.getter(name="resourceId")
    def resource_id(self) -> pulumi.Input[str]:
        """
        API resource ID
        """
        return pulumi.get(self, "resource_id")

    @resource_id.setter
    def resource_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "resource_id", value)

    @property
    @pulumi.getter(name="restApi")
    def rest_api(self) -> pulumi.Input[str]:
        """
        ID of the associated REST API
        """
        return pulumi.get(self, "rest_api")

    @rest_api.setter
    def rest_api(self, value: pulumi.Input[str]):
        pulumi.set(self, "rest_api", value)

    @property
    @pulumi.getter(name="apiKeyRequired")
    def api_key_required(self) -> Optional[pulumi.Input[bool]]:
        """
        Specify if the method requires an API key
        """
        return pulumi.get(self, "api_key_required")

    @api_key_required.setter
    def api_key_required(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "api_key_required", value)

    @property
    @pulumi.getter(name="authorizationScopes")
    def authorization_scopes(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        Authorization scopes used when the authorization is `COGNITO_USER_POOLS`
        """
        return pulumi.get(self, "authorization_scopes")

    @authorization_scopes.setter
    def authorization_scopes(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "authorization_scopes", value)

    @property
    @pulumi.getter(name="authorizerId")
    def authorizer_id(self) -> Optional[pulumi.Input[str]]:
        """
        Authorizer id to be used when the authorization is `CUSTOM` or `COGNITO_USER_POOLS`
        """
        return pulumi.get(self, "authorizer_id")

    @authorizer_id.setter
    def authorizer_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "authorizer_id", value)

    @property
    @pulumi.getter(name="operationName")
    def operation_name(self) -> Optional[pulumi.Input[str]]:
        """
        Function name that will be given to the method when generating an SDK through API Gateway. If omitted, API Gateway will generate a function name based on the resource path and HTTP verb.
        """
        return pulumi.get(self, "operation_name")

    @operation_name.setter
    def operation_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "operation_name", value)

    @property
    @pulumi.getter(name="requestModels")
    def request_models(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Map of the API models used for the request's content type
        where key is the content type (e.g., `application/json`)
        and value is either `Error`, `Empty` (built-in models) or `apigateway.Model`'s `name`.
        """
        return pulumi.get(self, "request_models")

    @request_models.setter
    def request_models(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "request_models", value)

    @property
    @pulumi.getter(name="requestParameters")
    def request_parameters(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[bool]]]]:
        """
        Map of request parameters (from the path, query string and headers) that should be passed to the integration. The boolean value indicates whether the parameter is required (`true`) or optional (`false`).
        For example: `request_parameters = {"method.request.header.X-Some-Header" = true "method.request.querystring.some-query-param" = true}` would define that the header `X-Some-Header` and the query string `some-query-param` must be provided in the request.
        """
        return pulumi.get(self, "request_parameters")

    @request_parameters.setter
    def request_parameters(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[bool]]]]):
        pulumi.set(self, "request_parameters", value)

    @property
    @pulumi.getter(name="requestValidatorId")
    def request_validator_id(self) -> Optional[pulumi.Input[str]]:
        """
        ID of a `apigateway.RequestValidator`
        """
        return pulumi.get(self, "request_validator_id")

    @request_validator_id.setter
    def request_validator_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "request_validator_id", value)


@pulumi.input_type
class _MethodState:
    def __init__(__self__, *,
                 api_key_required: Optional[pulumi.Input[bool]] = None,
                 authorization: Optional[pulumi.Input[str]] = None,
                 authorization_scopes: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 authorizer_id: Optional[pulumi.Input[str]] = None,
                 http_method: Optional[pulumi.Input[str]] = None,
                 operation_name: Optional[pulumi.Input[str]] = None,
                 request_models: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 request_parameters: Optional[pulumi.Input[Mapping[str, pulumi.Input[bool]]]] = None,
                 request_validator_id: Optional[pulumi.Input[str]] = None,
                 resource_id: Optional[pulumi.Input[str]] = None,
                 rest_api: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering Method resources.
        :param pulumi.Input[bool] api_key_required: Specify if the method requires an API key
        :param pulumi.Input[str] authorization: Type of authorization used for the method (`NONE`, `CUSTOM`, `AWS_IAM`, `COGNITO_USER_POOLS`)
        :param pulumi.Input[Sequence[pulumi.Input[str]]] authorization_scopes: Authorization scopes used when the authorization is `COGNITO_USER_POOLS`
        :param pulumi.Input[str] authorizer_id: Authorizer id to be used when the authorization is `CUSTOM` or `COGNITO_USER_POOLS`
        :param pulumi.Input[str] http_method: HTTP Method (`GET`, `POST`, `PUT`, `DELETE`, `HEAD`, `OPTIONS`, `ANY`)
        :param pulumi.Input[str] operation_name: Function name that will be given to the method when generating an SDK through API Gateway. If omitted, API Gateway will generate a function name based on the resource path and HTTP verb.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] request_models: Map of the API models used for the request's content type
               where key is the content type (e.g., `application/json`)
               and value is either `Error`, `Empty` (built-in models) or `apigateway.Model`'s `name`.
        :param pulumi.Input[Mapping[str, pulumi.Input[bool]]] request_parameters: Map of request parameters (from the path, query string and headers) that should be passed to the integration. The boolean value indicates whether the parameter is required (`true`) or optional (`false`).
               For example: `request_parameters = {"method.request.header.X-Some-Header" = true "method.request.querystring.some-query-param" = true}` would define that the header `X-Some-Header` and the query string `some-query-param` must be provided in the request.
        :param pulumi.Input[str] request_validator_id: ID of a `apigateway.RequestValidator`
        :param pulumi.Input[str] resource_id: API resource ID
        :param pulumi.Input[str] rest_api: ID of the associated REST API
        """
        if api_key_required is not None:
            pulumi.set(__self__, "api_key_required", api_key_required)
        if authorization is not None:
            pulumi.set(__self__, "authorization", authorization)
        if authorization_scopes is not None:
            pulumi.set(__self__, "authorization_scopes", authorization_scopes)
        if authorizer_id is not None:
            pulumi.set(__self__, "authorizer_id", authorizer_id)
        if http_method is not None:
            pulumi.set(__self__, "http_method", http_method)
        if operation_name is not None:
            pulumi.set(__self__, "operation_name", operation_name)
        if request_models is not None:
            pulumi.set(__self__, "request_models", request_models)
        if request_parameters is not None:
            pulumi.set(__self__, "request_parameters", request_parameters)
        if request_validator_id is not None:
            pulumi.set(__self__, "request_validator_id", request_validator_id)
        if resource_id is not None:
            pulumi.set(__self__, "resource_id", resource_id)
        if rest_api is not None:
            pulumi.set(__self__, "rest_api", rest_api)

    @property
    @pulumi.getter(name="apiKeyRequired")
    def api_key_required(self) -> Optional[pulumi.Input[bool]]:
        """
        Specify if the method requires an API key
        """
        return pulumi.get(self, "api_key_required")

    @api_key_required.setter
    def api_key_required(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "api_key_required", value)

    @property
    @pulumi.getter
    def authorization(self) -> Optional[pulumi.Input[str]]:
        """
        Type of authorization used for the method (`NONE`, `CUSTOM`, `AWS_IAM`, `COGNITO_USER_POOLS`)
        """
        return pulumi.get(self, "authorization")

    @authorization.setter
    def authorization(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "authorization", value)

    @property
    @pulumi.getter(name="authorizationScopes")
    def authorization_scopes(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        Authorization scopes used when the authorization is `COGNITO_USER_POOLS`
        """
        return pulumi.get(self, "authorization_scopes")

    @authorization_scopes.setter
    def authorization_scopes(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "authorization_scopes", value)

    @property
    @pulumi.getter(name="authorizerId")
    def authorizer_id(self) -> Optional[pulumi.Input[str]]:
        """
        Authorizer id to be used when the authorization is `CUSTOM` or `COGNITO_USER_POOLS`
        """
        return pulumi.get(self, "authorizer_id")

    @authorizer_id.setter
    def authorizer_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "authorizer_id", value)

    @property
    @pulumi.getter(name="httpMethod")
    def http_method(self) -> Optional[pulumi.Input[str]]:
        """
        HTTP Method (`GET`, `POST`, `PUT`, `DELETE`, `HEAD`, `OPTIONS`, `ANY`)
        """
        return pulumi.get(self, "http_method")

    @http_method.setter
    def http_method(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "http_method", value)

    @property
    @pulumi.getter(name="operationName")
    def operation_name(self) -> Optional[pulumi.Input[str]]:
        """
        Function name that will be given to the method when generating an SDK through API Gateway. If omitted, API Gateway will generate a function name based on the resource path and HTTP verb.
        """
        return pulumi.get(self, "operation_name")

    @operation_name.setter
    def operation_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "operation_name", value)

    @property
    @pulumi.getter(name="requestModels")
    def request_models(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Map of the API models used for the request's content type
        where key is the content type (e.g., `application/json`)
        and value is either `Error`, `Empty` (built-in models) or `apigateway.Model`'s `name`.
        """
        return pulumi.get(self, "request_models")

    @request_models.setter
    def request_models(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "request_models", value)

    @property
    @pulumi.getter(name="requestParameters")
    def request_parameters(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[bool]]]]:
        """
        Map of request parameters (from the path, query string and headers) that should be passed to the integration. The boolean value indicates whether the parameter is required (`true`) or optional (`false`).
        For example: `request_parameters = {"method.request.header.X-Some-Header" = true "method.request.querystring.some-query-param" = true}` would define that the header `X-Some-Header` and the query string `some-query-param` must be provided in the request.
        """
        return pulumi.get(self, "request_parameters")

    @request_parameters.setter
    def request_parameters(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[bool]]]]):
        pulumi.set(self, "request_parameters", value)

    @property
    @pulumi.getter(name="requestValidatorId")
    def request_validator_id(self) -> Optional[pulumi.Input[str]]:
        """
        ID of a `apigateway.RequestValidator`
        """
        return pulumi.get(self, "request_validator_id")

    @request_validator_id.setter
    def request_validator_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "request_validator_id", value)

    @property
    @pulumi.getter(name="resourceId")
    def resource_id(self) -> Optional[pulumi.Input[str]]:
        """
        API resource ID
        """
        return pulumi.get(self, "resource_id")

    @resource_id.setter
    def resource_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "resource_id", value)

    @property
    @pulumi.getter(name="restApi")
    def rest_api(self) -> Optional[pulumi.Input[str]]:
        """
        ID of the associated REST API
        """
        return pulumi.get(self, "rest_api")

    @rest_api.setter
    def rest_api(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "rest_api", value)


class Method(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 api_key_required: Optional[pulumi.Input[bool]] = None,
                 authorization: Optional[pulumi.Input[str]] = None,
                 authorization_scopes: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 authorizer_id: Optional[pulumi.Input[str]] = None,
                 http_method: Optional[pulumi.Input[str]] = None,
                 operation_name: Optional[pulumi.Input[str]] = None,
                 request_models: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 request_parameters: Optional[pulumi.Input[Mapping[str, pulumi.Input[bool]]]] = None,
                 request_validator_id: Optional[pulumi.Input[str]] = None,
                 resource_id: Optional[pulumi.Input[str]] = None,
                 rest_api: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a HTTP Method for an API Gateway Resource.

        ## Example Usage

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
        ```
        ## Usage with Cognito User Pool Authorizer

        ```python
        import pulumi
        import pulumi_aws as aws

        config = pulumi.Config()
        cognito_user_pool_name = config.require_object("cognitoUserPoolName")
        this = aws.cognito.get_user_pools(name=cognito_user_pool_name)
        this_rest_api = aws.apigateway.RestApi("this", name="with-authorizer")
        this_resource = aws.apigateway.Resource("this",
            rest_api=this_rest_api.id,
            parent_id=this_rest_api.root_resource_id,
            path_part="{proxy+}")
        this_authorizer = aws.apigateway.Authorizer("this",
            name="CognitoUserPoolAuthorizer",
            type="COGNITO_USER_POOLS",
            rest_api=this_rest_api.id,
            provider_arns=this.arns)
        any = aws.apigateway.Method("any",
            rest_api=this_rest_api.id,
            resource_id=this_resource.id,
            http_method="ANY",
            authorization="COGNITO_USER_POOLS",
            authorizer_id=this_authorizer.id,
            request_parameters={
                "method.request.path.proxy": True,
            })
        ```

        ## Import

        Using `pulumi import`, import `aws_api_gateway_method` using `REST-API-ID/RESOURCE-ID/HTTP-METHOD`. For example:

        ```sh
         $ pulumi import aws:apigateway/method:Method example 12345abcde/67890fghij/GET
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] api_key_required: Specify if the method requires an API key
        :param pulumi.Input[str] authorization: Type of authorization used for the method (`NONE`, `CUSTOM`, `AWS_IAM`, `COGNITO_USER_POOLS`)
        :param pulumi.Input[Sequence[pulumi.Input[str]]] authorization_scopes: Authorization scopes used when the authorization is `COGNITO_USER_POOLS`
        :param pulumi.Input[str] authorizer_id: Authorizer id to be used when the authorization is `CUSTOM` or `COGNITO_USER_POOLS`
        :param pulumi.Input[str] http_method: HTTP Method (`GET`, `POST`, `PUT`, `DELETE`, `HEAD`, `OPTIONS`, `ANY`)
        :param pulumi.Input[str] operation_name: Function name that will be given to the method when generating an SDK through API Gateway. If omitted, API Gateway will generate a function name based on the resource path and HTTP verb.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] request_models: Map of the API models used for the request's content type
               where key is the content type (e.g., `application/json`)
               and value is either `Error`, `Empty` (built-in models) or `apigateway.Model`'s `name`.
        :param pulumi.Input[Mapping[str, pulumi.Input[bool]]] request_parameters: Map of request parameters (from the path, query string and headers) that should be passed to the integration. The boolean value indicates whether the parameter is required (`true`) or optional (`false`).
               For example: `request_parameters = {"method.request.header.X-Some-Header" = true "method.request.querystring.some-query-param" = true}` would define that the header `X-Some-Header` and the query string `some-query-param` must be provided in the request.
        :param pulumi.Input[str] request_validator_id: ID of a `apigateway.RequestValidator`
        :param pulumi.Input[str] resource_id: API resource ID
        :param pulumi.Input[str] rest_api: ID of the associated REST API
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: MethodArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a HTTP Method for an API Gateway Resource.

        ## Example Usage

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
        ```
        ## Usage with Cognito User Pool Authorizer

        ```python
        import pulumi
        import pulumi_aws as aws

        config = pulumi.Config()
        cognito_user_pool_name = config.require_object("cognitoUserPoolName")
        this = aws.cognito.get_user_pools(name=cognito_user_pool_name)
        this_rest_api = aws.apigateway.RestApi("this", name="with-authorizer")
        this_resource = aws.apigateway.Resource("this",
            rest_api=this_rest_api.id,
            parent_id=this_rest_api.root_resource_id,
            path_part="{proxy+}")
        this_authorizer = aws.apigateway.Authorizer("this",
            name="CognitoUserPoolAuthorizer",
            type="COGNITO_USER_POOLS",
            rest_api=this_rest_api.id,
            provider_arns=this.arns)
        any = aws.apigateway.Method("any",
            rest_api=this_rest_api.id,
            resource_id=this_resource.id,
            http_method="ANY",
            authorization="COGNITO_USER_POOLS",
            authorizer_id=this_authorizer.id,
            request_parameters={
                "method.request.path.proxy": True,
            })
        ```

        ## Import

        Using `pulumi import`, import `aws_api_gateway_method` using `REST-API-ID/RESOURCE-ID/HTTP-METHOD`. For example:

        ```sh
         $ pulumi import aws:apigateway/method:Method example 12345abcde/67890fghij/GET
        ```

        :param str resource_name: The name of the resource.
        :param MethodArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(MethodArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 api_key_required: Optional[pulumi.Input[bool]] = None,
                 authorization: Optional[pulumi.Input[str]] = None,
                 authorization_scopes: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 authorizer_id: Optional[pulumi.Input[str]] = None,
                 http_method: Optional[pulumi.Input[str]] = None,
                 operation_name: Optional[pulumi.Input[str]] = None,
                 request_models: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 request_parameters: Optional[pulumi.Input[Mapping[str, pulumi.Input[bool]]]] = None,
                 request_validator_id: Optional[pulumi.Input[str]] = None,
                 resource_id: Optional[pulumi.Input[str]] = None,
                 rest_api: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = MethodArgs.__new__(MethodArgs)

            __props__.__dict__["api_key_required"] = api_key_required
            if authorization is None and not opts.urn:
                raise TypeError("Missing required property 'authorization'")
            __props__.__dict__["authorization"] = authorization
            __props__.__dict__["authorization_scopes"] = authorization_scopes
            __props__.__dict__["authorizer_id"] = authorizer_id
            if http_method is None and not opts.urn:
                raise TypeError("Missing required property 'http_method'")
            __props__.__dict__["http_method"] = http_method
            __props__.__dict__["operation_name"] = operation_name
            __props__.__dict__["request_models"] = request_models
            __props__.__dict__["request_parameters"] = request_parameters
            __props__.__dict__["request_validator_id"] = request_validator_id
            if resource_id is None and not opts.urn:
                raise TypeError("Missing required property 'resource_id'")
            __props__.__dict__["resource_id"] = resource_id
            if rest_api is None and not opts.urn:
                raise TypeError("Missing required property 'rest_api'")
            __props__.__dict__["rest_api"] = rest_api
        super(Method, __self__).__init__(
            'aws:apigateway/method:Method',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            api_key_required: Optional[pulumi.Input[bool]] = None,
            authorization: Optional[pulumi.Input[str]] = None,
            authorization_scopes: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            authorizer_id: Optional[pulumi.Input[str]] = None,
            http_method: Optional[pulumi.Input[str]] = None,
            operation_name: Optional[pulumi.Input[str]] = None,
            request_models: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            request_parameters: Optional[pulumi.Input[Mapping[str, pulumi.Input[bool]]]] = None,
            request_validator_id: Optional[pulumi.Input[str]] = None,
            resource_id: Optional[pulumi.Input[str]] = None,
            rest_api: Optional[pulumi.Input[str]] = None) -> 'Method':
        """
        Get an existing Method resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] api_key_required: Specify if the method requires an API key
        :param pulumi.Input[str] authorization: Type of authorization used for the method (`NONE`, `CUSTOM`, `AWS_IAM`, `COGNITO_USER_POOLS`)
        :param pulumi.Input[Sequence[pulumi.Input[str]]] authorization_scopes: Authorization scopes used when the authorization is `COGNITO_USER_POOLS`
        :param pulumi.Input[str] authorizer_id: Authorizer id to be used when the authorization is `CUSTOM` or `COGNITO_USER_POOLS`
        :param pulumi.Input[str] http_method: HTTP Method (`GET`, `POST`, `PUT`, `DELETE`, `HEAD`, `OPTIONS`, `ANY`)
        :param pulumi.Input[str] operation_name: Function name that will be given to the method when generating an SDK through API Gateway. If omitted, API Gateway will generate a function name based on the resource path and HTTP verb.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] request_models: Map of the API models used for the request's content type
               where key is the content type (e.g., `application/json`)
               and value is either `Error`, `Empty` (built-in models) or `apigateway.Model`'s `name`.
        :param pulumi.Input[Mapping[str, pulumi.Input[bool]]] request_parameters: Map of request parameters (from the path, query string and headers) that should be passed to the integration. The boolean value indicates whether the parameter is required (`true`) or optional (`false`).
               For example: `request_parameters = {"method.request.header.X-Some-Header" = true "method.request.querystring.some-query-param" = true}` would define that the header `X-Some-Header` and the query string `some-query-param` must be provided in the request.
        :param pulumi.Input[str] request_validator_id: ID of a `apigateway.RequestValidator`
        :param pulumi.Input[str] resource_id: API resource ID
        :param pulumi.Input[str] rest_api: ID of the associated REST API
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _MethodState.__new__(_MethodState)

        __props__.__dict__["api_key_required"] = api_key_required
        __props__.__dict__["authorization"] = authorization
        __props__.__dict__["authorization_scopes"] = authorization_scopes
        __props__.__dict__["authorizer_id"] = authorizer_id
        __props__.__dict__["http_method"] = http_method
        __props__.__dict__["operation_name"] = operation_name
        __props__.__dict__["request_models"] = request_models
        __props__.__dict__["request_parameters"] = request_parameters
        __props__.__dict__["request_validator_id"] = request_validator_id
        __props__.__dict__["resource_id"] = resource_id
        __props__.__dict__["rest_api"] = rest_api
        return Method(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="apiKeyRequired")
    def api_key_required(self) -> pulumi.Output[Optional[bool]]:
        """
        Specify if the method requires an API key
        """
        return pulumi.get(self, "api_key_required")

    @property
    @pulumi.getter
    def authorization(self) -> pulumi.Output[str]:
        """
        Type of authorization used for the method (`NONE`, `CUSTOM`, `AWS_IAM`, `COGNITO_USER_POOLS`)
        """
        return pulumi.get(self, "authorization")

    @property
    @pulumi.getter(name="authorizationScopes")
    def authorization_scopes(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        Authorization scopes used when the authorization is `COGNITO_USER_POOLS`
        """
        return pulumi.get(self, "authorization_scopes")

    @property
    @pulumi.getter(name="authorizerId")
    def authorizer_id(self) -> pulumi.Output[Optional[str]]:
        """
        Authorizer id to be used when the authorization is `CUSTOM` or `COGNITO_USER_POOLS`
        """
        return pulumi.get(self, "authorizer_id")

    @property
    @pulumi.getter(name="httpMethod")
    def http_method(self) -> pulumi.Output[str]:
        """
        HTTP Method (`GET`, `POST`, `PUT`, `DELETE`, `HEAD`, `OPTIONS`, `ANY`)
        """
        return pulumi.get(self, "http_method")

    @property
    @pulumi.getter(name="operationName")
    def operation_name(self) -> pulumi.Output[Optional[str]]:
        """
        Function name that will be given to the method when generating an SDK through API Gateway. If omitted, API Gateway will generate a function name based on the resource path and HTTP verb.
        """
        return pulumi.get(self, "operation_name")

    @property
    @pulumi.getter(name="requestModels")
    def request_models(self) -> pulumi.Output[Optional[Mapping[str, str]]]:
        """
        Map of the API models used for the request's content type
        where key is the content type (e.g., `application/json`)
        and value is either `Error`, `Empty` (built-in models) or `apigateway.Model`'s `name`.
        """
        return pulumi.get(self, "request_models")

    @property
    @pulumi.getter(name="requestParameters")
    def request_parameters(self) -> pulumi.Output[Optional[Mapping[str, bool]]]:
        """
        Map of request parameters (from the path, query string and headers) that should be passed to the integration. The boolean value indicates whether the parameter is required (`true`) or optional (`false`).
        For example: `request_parameters = {"method.request.header.X-Some-Header" = true "method.request.querystring.some-query-param" = true}` would define that the header `X-Some-Header` and the query string `some-query-param` must be provided in the request.
        """
        return pulumi.get(self, "request_parameters")

    @property
    @pulumi.getter(name="requestValidatorId")
    def request_validator_id(self) -> pulumi.Output[Optional[str]]:
        """
        ID of a `apigateway.RequestValidator`
        """
        return pulumi.get(self, "request_validator_id")

    @property
    @pulumi.getter(name="resourceId")
    def resource_id(self) -> pulumi.Output[str]:
        """
        API resource ID
        """
        return pulumi.get(self, "resource_id")

    @property
    @pulumi.getter(name="restApi")
    def rest_api(self) -> pulumi.Output[str]:
        """
        ID of the associated REST API
        """
        return pulumi.get(self, "rest_api")


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

__all__ = ['RouteResponseArgs', 'RouteResponse']

@pulumi.input_type
class RouteResponseArgs:
    def __init__(__self__, *,
                 api_id: pulumi.Input[str],
                 route_id: pulumi.Input[str],
                 route_response_key: pulumi.Input[str],
                 model_selection_expression: Optional[pulumi.Input[str]] = None,
                 response_models: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        The set of arguments for constructing a RouteResponse resource.
        :param pulumi.Input[str] api_id: API identifier.
        :param pulumi.Input[str] route_id: Identifier of the `apigatewayv2.Route`.
        :param pulumi.Input[str] route_response_key: Route response key.
        :param pulumi.Input[str] model_selection_expression: The [model selection expression](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-model-selection-expressions) for the route response.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] response_models: Response models for the route response.
        """
        pulumi.set(__self__, "api_id", api_id)
        pulumi.set(__self__, "route_id", route_id)
        pulumi.set(__self__, "route_response_key", route_response_key)
        if model_selection_expression is not None:
            pulumi.set(__self__, "model_selection_expression", model_selection_expression)
        if response_models is not None:
            pulumi.set(__self__, "response_models", response_models)

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
    @pulumi.getter(name="routeId")
    def route_id(self) -> pulumi.Input[str]:
        """
        Identifier of the `apigatewayv2.Route`.
        """
        return pulumi.get(self, "route_id")

    @route_id.setter
    def route_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "route_id", value)

    @property
    @pulumi.getter(name="routeResponseKey")
    def route_response_key(self) -> pulumi.Input[str]:
        """
        Route response key.
        """
        return pulumi.get(self, "route_response_key")

    @route_response_key.setter
    def route_response_key(self, value: pulumi.Input[str]):
        pulumi.set(self, "route_response_key", value)

    @property
    @pulumi.getter(name="modelSelectionExpression")
    def model_selection_expression(self) -> Optional[pulumi.Input[str]]:
        """
        The [model selection expression](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-model-selection-expressions) for the route response.
        """
        return pulumi.get(self, "model_selection_expression")

    @model_selection_expression.setter
    def model_selection_expression(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "model_selection_expression", value)

    @property
    @pulumi.getter(name="responseModels")
    def response_models(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Response models for the route response.
        """
        return pulumi.get(self, "response_models")

    @response_models.setter
    def response_models(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "response_models", value)


@pulumi.input_type
class _RouteResponseState:
    def __init__(__self__, *,
                 api_id: Optional[pulumi.Input[str]] = None,
                 model_selection_expression: Optional[pulumi.Input[str]] = None,
                 response_models: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 route_id: Optional[pulumi.Input[str]] = None,
                 route_response_key: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering RouteResponse resources.
        :param pulumi.Input[str] api_id: API identifier.
        :param pulumi.Input[str] model_selection_expression: The [model selection expression](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-model-selection-expressions) for the route response.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] response_models: Response models for the route response.
        :param pulumi.Input[str] route_id: Identifier of the `apigatewayv2.Route`.
        :param pulumi.Input[str] route_response_key: Route response key.
        """
        if api_id is not None:
            pulumi.set(__self__, "api_id", api_id)
        if model_selection_expression is not None:
            pulumi.set(__self__, "model_selection_expression", model_selection_expression)
        if response_models is not None:
            pulumi.set(__self__, "response_models", response_models)
        if route_id is not None:
            pulumi.set(__self__, "route_id", route_id)
        if route_response_key is not None:
            pulumi.set(__self__, "route_response_key", route_response_key)

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
    @pulumi.getter(name="modelSelectionExpression")
    def model_selection_expression(self) -> Optional[pulumi.Input[str]]:
        """
        The [model selection expression](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-model-selection-expressions) for the route response.
        """
        return pulumi.get(self, "model_selection_expression")

    @model_selection_expression.setter
    def model_selection_expression(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "model_selection_expression", value)

    @property
    @pulumi.getter(name="responseModels")
    def response_models(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Response models for the route response.
        """
        return pulumi.get(self, "response_models")

    @response_models.setter
    def response_models(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "response_models", value)

    @property
    @pulumi.getter(name="routeId")
    def route_id(self) -> Optional[pulumi.Input[str]]:
        """
        Identifier of the `apigatewayv2.Route`.
        """
        return pulumi.get(self, "route_id")

    @route_id.setter
    def route_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "route_id", value)

    @property
    @pulumi.getter(name="routeResponseKey")
    def route_response_key(self) -> Optional[pulumi.Input[str]]:
        """
        Route response key.
        """
        return pulumi.get(self, "route_response_key")

    @route_response_key.setter
    def route_response_key(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "route_response_key", value)


class RouteResponse(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 api_id: Optional[pulumi.Input[str]] = None,
                 model_selection_expression: Optional[pulumi.Input[str]] = None,
                 response_models: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 route_id: Optional[pulumi.Input[str]] = None,
                 route_response_key: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Manages an Amazon API Gateway Version 2 route response.
        More information can be found in the [Amazon API Gateway Developer Guide](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api.html).

        ## Example Usage

        ### Basic

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.apigatewayv2.RouteResponse("example",
            api_id=example_aws_apigatewayv2_api["id"],
            route_id=example_aws_apigatewayv2_route["id"],
            route_response_key="$default")
        ```

        ## Enabling Two-Way Communication

        For websocket routes that require two-way communication enabled, an `apigatewayv2.RouteResponse` needs to be added to the route with `route_response_key = "$default"`. More information available  is available in [Amazon API Gateway Developer Guide](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api.html).

        You can only define the $default route response for WebSocket APIs. You can use an integration response to manipulate the response from a backend service. For more information, see [Overview of integration responses](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-integration-responses.html#apigateway-websocket-api-integration-response-overview).

        ## Import

        Using `pulumi import`, import `aws_apigatewayv2_route_response` using the API identifier, route identifier and route response identifier. For example:

        ```sh
        $ pulumi import aws:apigatewayv2/routeResponse:RouteResponse example aabbccddee/1122334/998877
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] api_id: API identifier.
        :param pulumi.Input[str] model_selection_expression: The [model selection expression](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-model-selection-expressions) for the route response.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] response_models: Response models for the route response.
        :param pulumi.Input[str] route_id: Identifier of the `apigatewayv2.Route`.
        :param pulumi.Input[str] route_response_key: Route response key.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: RouteResponseArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages an Amazon API Gateway Version 2 route response.
        More information can be found in the [Amazon API Gateway Developer Guide](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api.html).

        ## Example Usage

        ### Basic

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.apigatewayv2.RouteResponse("example",
            api_id=example_aws_apigatewayv2_api["id"],
            route_id=example_aws_apigatewayv2_route["id"],
            route_response_key="$default")
        ```

        ## Enabling Two-Way Communication

        For websocket routes that require two-way communication enabled, an `apigatewayv2.RouteResponse` needs to be added to the route with `route_response_key = "$default"`. More information available  is available in [Amazon API Gateway Developer Guide](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api.html).

        You can only define the $default route response for WebSocket APIs. You can use an integration response to manipulate the response from a backend service. For more information, see [Overview of integration responses](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-integration-responses.html#apigateway-websocket-api-integration-response-overview).

        ## Import

        Using `pulumi import`, import `aws_apigatewayv2_route_response` using the API identifier, route identifier and route response identifier. For example:

        ```sh
        $ pulumi import aws:apigatewayv2/routeResponse:RouteResponse example aabbccddee/1122334/998877
        ```

        :param str resource_name: The name of the resource.
        :param RouteResponseArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(RouteResponseArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 api_id: Optional[pulumi.Input[str]] = None,
                 model_selection_expression: Optional[pulumi.Input[str]] = None,
                 response_models: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 route_id: Optional[pulumi.Input[str]] = None,
                 route_response_key: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = RouteResponseArgs.__new__(RouteResponseArgs)

            if api_id is None and not opts.urn:
                raise TypeError("Missing required property 'api_id'")
            __props__.__dict__["api_id"] = api_id
            __props__.__dict__["model_selection_expression"] = model_selection_expression
            __props__.__dict__["response_models"] = response_models
            if route_id is None and not opts.urn:
                raise TypeError("Missing required property 'route_id'")
            __props__.__dict__["route_id"] = route_id
            if route_response_key is None and not opts.urn:
                raise TypeError("Missing required property 'route_response_key'")
            __props__.__dict__["route_response_key"] = route_response_key
        super(RouteResponse, __self__).__init__(
            'aws:apigatewayv2/routeResponse:RouteResponse',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            api_id: Optional[pulumi.Input[str]] = None,
            model_selection_expression: Optional[pulumi.Input[str]] = None,
            response_models: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            route_id: Optional[pulumi.Input[str]] = None,
            route_response_key: Optional[pulumi.Input[str]] = None) -> 'RouteResponse':
        """
        Get an existing RouteResponse resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] api_id: API identifier.
        :param pulumi.Input[str] model_selection_expression: The [model selection expression](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-model-selection-expressions) for the route response.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] response_models: Response models for the route response.
        :param pulumi.Input[str] route_id: Identifier of the `apigatewayv2.Route`.
        :param pulumi.Input[str] route_response_key: Route response key.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _RouteResponseState.__new__(_RouteResponseState)

        __props__.__dict__["api_id"] = api_id
        __props__.__dict__["model_selection_expression"] = model_selection_expression
        __props__.__dict__["response_models"] = response_models
        __props__.__dict__["route_id"] = route_id
        __props__.__dict__["route_response_key"] = route_response_key
        return RouteResponse(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="apiId")
    def api_id(self) -> pulumi.Output[str]:
        """
        API identifier.
        """
        return pulumi.get(self, "api_id")

    @property
    @pulumi.getter(name="modelSelectionExpression")
    def model_selection_expression(self) -> pulumi.Output[Optional[str]]:
        """
        The [model selection expression](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-model-selection-expressions) for the route response.
        """
        return pulumi.get(self, "model_selection_expression")

    @property
    @pulumi.getter(name="responseModels")
    def response_models(self) -> pulumi.Output[Optional[Mapping[str, str]]]:
        """
        Response models for the route response.
        """
        return pulumi.get(self, "response_models")

    @property
    @pulumi.getter(name="routeId")
    def route_id(self) -> pulumi.Output[str]:
        """
        Identifier of the `apigatewayv2.Route`.
        """
        return pulumi.get(self, "route_id")

    @property
    @pulumi.getter(name="routeResponseKey")
    def route_response_key(self) -> pulumi.Output[str]:
        """
        Route response key.
        """
        return pulumi.get(self, "route_response_key")


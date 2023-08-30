// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Manages an Amazon API Gateway Version 2 route.
 * More information can be found in the [Amazon API Gateway Developer Guide](https://docs.aws.amazon.com/apigateway/latest/developerguide/welcome.html) for [WebSocket](https://docs.aws.amazon.com/apigateway/latest/developerguide/websocket-api-develop-routes.html) and [HTTP](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-develop-routes.html) APIs.
 *
 * ## Example Usage
 * ### Basic
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const exampleApi = new aws.apigatewayv2.Api("exampleApi", {
 *     protocolType: "WEBSOCKET",
 *     routeSelectionExpression: "$request.body.action",
 * });
 * const exampleRoute = new aws.apigatewayv2.Route("exampleRoute", {
 *     apiId: exampleApi.id,
 *     routeKey: "$default",
 * });
 * ```
 * ### HTTP Proxy Integration
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const exampleApi = new aws.apigatewayv2.Api("exampleApi", {protocolType: "HTTP"});
 * const exampleIntegration = new aws.apigatewayv2.Integration("exampleIntegration", {
 *     apiId: exampleApi.id,
 *     integrationType: "HTTP_PROXY",
 *     integrationMethod: "ANY",
 *     integrationUri: "https://example.com/{proxy}",
 * });
 * const exampleRoute = new aws.apigatewayv2.Route("exampleRoute", {
 *     apiId: exampleApi.id,
 *     routeKey: "ANY /example/{proxy+}",
 *     target: pulumi.interpolate`integrations/${exampleIntegration.id}`,
 * });
 * ```
 *
 * ## Import
 *
 * Using `pulumi import`, import `aws_apigatewayv2_route` using the API identifier and route identifier. For example:
 *
 * ```sh
 *  $ pulumi import aws:apigatewayv2/route:Route example aabbccddee/1122334
 * ```
 *  -> __Note:__ The API Gateway managed route created as part of [_quick_create_](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-basic-concept.html#apigateway-definition-quick-create) cannot be imported.
 */
export class Route extends pulumi.CustomResource {
    /**
     * Get an existing Route resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: RouteState, opts?: pulumi.CustomResourceOptions): Route {
        return new Route(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:apigatewayv2/route:Route';

    /**
     * Returns true if the given object is an instance of Route.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Route {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Route.__pulumiType;
    }

    /**
     * API identifier.
     */
    public readonly apiId!: pulumi.Output<string>;
    /**
     * Boolean whether an API key is required for the route. Defaults to `false`. Supported only for WebSocket APIs.
     */
    public readonly apiKeyRequired!: pulumi.Output<boolean | undefined>;
    /**
     * Authorization scopes supported by this route. The scopes are used with a JWT authorizer to authorize the method invocation.
     */
    public readonly authorizationScopes!: pulumi.Output<string[] | undefined>;
    /**
     * Authorization type for the route.
     * For WebSocket APIs, valid values are `NONE` for open access, `AWS_IAM` for using AWS IAM permissions, and `CUSTOM` for using a Lambda authorizer.
     * For HTTP APIs, valid values are `NONE` for open access, `JWT` for using JSON Web Tokens, `AWS_IAM` for using AWS IAM permissions, and `CUSTOM` for using a Lambda authorizer.
     * Defaults to `NONE`.
     */
    public readonly authorizationType!: pulumi.Output<string | undefined>;
    /**
     * Identifier of the `aws.apigatewayv2.Authorizer` resource to be associated with this route.
     */
    public readonly authorizerId!: pulumi.Output<string | undefined>;
    /**
     * The [model selection expression](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-model-selection-expressions) for the route. Supported only for WebSocket APIs.
     */
    public readonly modelSelectionExpression!: pulumi.Output<string | undefined>;
    /**
     * Operation name for the route. Must be between 1 and 64 characters in length.
     */
    public readonly operationName!: pulumi.Output<string | undefined>;
    /**
     * Request models for the route. Supported only for WebSocket APIs.
     */
    public readonly requestModels!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * Request parameters for the route. Supported only for WebSocket APIs.
     */
    public readonly requestParameters!: pulumi.Output<outputs.apigatewayv2.RouteRequestParameter[] | undefined>;
    /**
     * Route key for the route. For HTTP APIs, the route key can be either `$default`, or a combination of an HTTP method and resource path, for example, `GET /pets`.
     */
    public readonly routeKey!: pulumi.Output<string>;
    /**
     * The [route response selection expression](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-route-response-selection-expressions) for the route. Supported only for WebSocket APIs.
     */
    public readonly routeResponseSelectionExpression!: pulumi.Output<string | undefined>;
    /**
     * Target for the route, of the form `integrations/`*`IntegrationID`*, where *`IntegrationID`* is the identifier of an `aws.apigatewayv2.Integration` resource.
     */
    public readonly target!: pulumi.Output<string | undefined>;

    /**
     * Create a Route resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: RouteArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: RouteArgs | RouteState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as RouteState | undefined;
            resourceInputs["apiId"] = state ? state.apiId : undefined;
            resourceInputs["apiKeyRequired"] = state ? state.apiKeyRequired : undefined;
            resourceInputs["authorizationScopes"] = state ? state.authorizationScopes : undefined;
            resourceInputs["authorizationType"] = state ? state.authorizationType : undefined;
            resourceInputs["authorizerId"] = state ? state.authorizerId : undefined;
            resourceInputs["modelSelectionExpression"] = state ? state.modelSelectionExpression : undefined;
            resourceInputs["operationName"] = state ? state.operationName : undefined;
            resourceInputs["requestModels"] = state ? state.requestModels : undefined;
            resourceInputs["requestParameters"] = state ? state.requestParameters : undefined;
            resourceInputs["routeKey"] = state ? state.routeKey : undefined;
            resourceInputs["routeResponseSelectionExpression"] = state ? state.routeResponseSelectionExpression : undefined;
            resourceInputs["target"] = state ? state.target : undefined;
        } else {
            const args = argsOrState as RouteArgs | undefined;
            if ((!args || args.apiId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'apiId'");
            }
            if ((!args || args.routeKey === undefined) && !opts.urn) {
                throw new Error("Missing required property 'routeKey'");
            }
            resourceInputs["apiId"] = args ? args.apiId : undefined;
            resourceInputs["apiKeyRequired"] = args ? args.apiKeyRequired : undefined;
            resourceInputs["authorizationScopes"] = args ? args.authorizationScopes : undefined;
            resourceInputs["authorizationType"] = args ? args.authorizationType : undefined;
            resourceInputs["authorizerId"] = args ? args.authorizerId : undefined;
            resourceInputs["modelSelectionExpression"] = args ? args.modelSelectionExpression : undefined;
            resourceInputs["operationName"] = args ? args.operationName : undefined;
            resourceInputs["requestModels"] = args ? args.requestModels : undefined;
            resourceInputs["requestParameters"] = args ? args.requestParameters : undefined;
            resourceInputs["routeKey"] = args ? args.routeKey : undefined;
            resourceInputs["routeResponseSelectionExpression"] = args ? args.routeResponseSelectionExpression : undefined;
            resourceInputs["target"] = args ? args.target : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Route.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Route resources.
 */
export interface RouteState {
    /**
     * API identifier.
     */
    apiId?: pulumi.Input<string>;
    /**
     * Boolean whether an API key is required for the route. Defaults to `false`. Supported only for WebSocket APIs.
     */
    apiKeyRequired?: pulumi.Input<boolean>;
    /**
     * Authorization scopes supported by this route. The scopes are used with a JWT authorizer to authorize the method invocation.
     */
    authorizationScopes?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Authorization type for the route.
     * For WebSocket APIs, valid values are `NONE` for open access, `AWS_IAM` for using AWS IAM permissions, and `CUSTOM` for using a Lambda authorizer.
     * For HTTP APIs, valid values are `NONE` for open access, `JWT` for using JSON Web Tokens, `AWS_IAM` for using AWS IAM permissions, and `CUSTOM` for using a Lambda authorizer.
     * Defaults to `NONE`.
     */
    authorizationType?: pulumi.Input<string>;
    /**
     * Identifier of the `aws.apigatewayv2.Authorizer` resource to be associated with this route.
     */
    authorizerId?: pulumi.Input<string>;
    /**
     * The [model selection expression](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-model-selection-expressions) for the route. Supported only for WebSocket APIs.
     */
    modelSelectionExpression?: pulumi.Input<string>;
    /**
     * Operation name for the route. Must be between 1 and 64 characters in length.
     */
    operationName?: pulumi.Input<string>;
    /**
     * Request models for the route. Supported only for WebSocket APIs.
     */
    requestModels?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Request parameters for the route. Supported only for WebSocket APIs.
     */
    requestParameters?: pulumi.Input<pulumi.Input<inputs.apigatewayv2.RouteRequestParameter>[]>;
    /**
     * Route key for the route. For HTTP APIs, the route key can be either `$default`, or a combination of an HTTP method and resource path, for example, `GET /pets`.
     */
    routeKey?: pulumi.Input<string>;
    /**
     * The [route response selection expression](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-route-response-selection-expressions) for the route. Supported only for WebSocket APIs.
     */
    routeResponseSelectionExpression?: pulumi.Input<string>;
    /**
     * Target for the route, of the form `integrations/`*`IntegrationID`*, where *`IntegrationID`* is the identifier of an `aws.apigatewayv2.Integration` resource.
     */
    target?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Route resource.
 */
export interface RouteArgs {
    /**
     * API identifier.
     */
    apiId: pulumi.Input<string>;
    /**
     * Boolean whether an API key is required for the route. Defaults to `false`. Supported only for WebSocket APIs.
     */
    apiKeyRequired?: pulumi.Input<boolean>;
    /**
     * Authorization scopes supported by this route. The scopes are used with a JWT authorizer to authorize the method invocation.
     */
    authorizationScopes?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Authorization type for the route.
     * For WebSocket APIs, valid values are `NONE` for open access, `AWS_IAM` for using AWS IAM permissions, and `CUSTOM` for using a Lambda authorizer.
     * For HTTP APIs, valid values are `NONE` for open access, `JWT` for using JSON Web Tokens, `AWS_IAM` for using AWS IAM permissions, and `CUSTOM` for using a Lambda authorizer.
     * Defaults to `NONE`.
     */
    authorizationType?: pulumi.Input<string>;
    /**
     * Identifier of the `aws.apigatewayv2.Authorizer` resource to be associated with this route.
     */
    authorizerId?: pulumi.Input<string>;
    /**
     * The [model selection expression](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-model-selection-expressions) for the route. Supported only for WebSocket APIs.
     */
    modelSelectionExpression?: pulumi.Input<string>;
    /**
     * Operation name for the route. Must be between 1 and 64 characters in length.
     */
    operationName?: pulumi.Input<string>;
    /**
     * Request models for the route. Supported only for WebSocket APIs.
     */
    requestModels?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Request parameters for the route. Supported only for WebSocket APIs.
     */
    requestParameters?: pulumi.Input<pulumi.Input<inputs.apigatewayv2.RouteRequestParameter>[]>;
    /**
     * Route key for the route. For HTTP APIs, the route key can be either `$default`, or a combination of an HTTP method and resource path, for example, `GET /pets`.
     */
    routeKey: pulumi.Input<string>;
    /**
     * The [route response selection expression](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-route-response-selection-expressions) for the route. Supported only for WebSocket APIs.
     */
    routeResponseSelectionExpression?: pulumi.Input<string>;
    /**
     * Target for the route, of the form `integrations/`*`IntegrationID`*, where *`IntegrationID`* is the identifier of an `aws.apigatewayv2.Integration` resource.
     */
    target?: pulumi.Input<string>;
}

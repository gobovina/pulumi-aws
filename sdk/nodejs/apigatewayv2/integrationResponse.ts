// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Manages an Amazon API Gateway Version 2 integration response.
 * More information can be found in the [Amazon API Gateway Developer Guide](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api.html).
 *
 * ## Example Usage
 * ### Basic
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.apigatewayv2.IntegrationResponse("example", {
 *     apiId: exampleAwsApigatewayv2Api.id,
 *     integrationId: exampleAwsApigatewayv2Integration.id,
 *     integrationResponseKey: "/200/",
 * });
 * ```
 *
 * ## Import
 *
 * Using `pulumi import`, import `aws_apigatewayv2_integration_response` using the API identifier, integration identifier and integration response identifier. For example:
 *
 * ```sh
 *  $ pulumi import aws:apigatewayv2/integrationResponse:IntegrationResponse example aabbccddee/1122334/998877
 * ```
 */
export class IntegrationResponse extends pulumi.CustomResource {
    /**
     * Get an existing IntegrationResponse resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: IntegrationResponseState, opts?: pulumi.CustomResourceOptions): IntegrationResponse {
        return new IntegrationResponse(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:apigatewayv2/integrationResponse:IntegrationResponse';

    /**
     * Returns true if the given object is an instance of IntegrationResponse.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is IntegrationResponse {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === IntegrationResponse.__pulumiType;
    }

    /**
     * API identifier.
     */
    public readonly apiId!: pulumi.Output<string>;
    /**
     * How to handle response payload content type conversions. Valid values: `CONVERT_TO_BINARY`, `CONVERT_TO_TEXT`.
     */
    public readonly contentHandlingStrategy!: pulumi.Output<string | undefined>;
    /**
     * Identifier of the `aws.apigatewayv2.Integration`.
     */
    public readonly integrationId!: pulumi.Output<string>;
    /**
     * Integration response key.
     */
    public readonly integrationResponseKey!: pulumi.Output<string>;
    /**
     * Map of Velocity templates that are applied on the request payload based on the value of the Content-Type header sent by the client.
     */
    public readonly responseTemplates!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * The [template selection expression](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-template-selection-expressions) for the integration response.
     */
    public readonly templateSelectionExpression!: pulumi.Output<string | undefined>;

    /**
     * Create a IntegrationResponse resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: IntegrationResponseArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: IntegrationResponseArgs | IntegrationResponseState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as IntegrationResponseState | undefined;
            resourceInputs["apiId"] = state ? state.apiId : undefined;
            resourceInputs["contentHandlingStrategy"] = state ? state.contentHandlingStrategy : undefined;
            resourceInputs["integrationId"] = state ? state.integrationId : undefined;
            resourceInputs["integrationResponseKey"] = state ? state.integrationResponseKey : undefined;
            resourceInputs["responseTemplates"] = state ? state.responseTemplates : undefined;
            resourceInputs["templateSelectionExpression"] = state ? state.templateSelectionExpression : undefined;
        } else {
            const args = argsOrState as IntegrationResponseArgs | undefined;
            if ((!args || args.apiId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'apiId'");
            }
            if ((!args || args.integrationId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'integrationId'");
            }
            if ((!args || args.integrationResponseKey === undefined) && !opts.urn) {
                throw new Error("Missing required property 'integrationResponseKey'");
            }
            resourceInputs["apiId"] = args ? args.apiId : undefined;
            resourceInputs["contentHandlingStrategy"] = args ? args.contentHandlingStrategy : undefined;
            resourceInputs["integrationId"] = args ? args.integrationId : undefined;
            resourceInputs["integrationResponseKey"] = args ? args.integrationResponseKey : undefined;
            resourceInputs["responseTemplates"] = args ? args.responseTemplates : undefined;
            resourceInputs["templateSelectionExpression"] = args ? args.templateSelectionExpression : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(IntegrationResponse.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering IntegrationResponse resources.
 */
export interface IntegrationResponseState {
    /**
     * API identifier.
     */
    apiId?: pulumi.Input<string>;
    /**
     * How to handle response payload content type conversions. Valid values: `CONVERT_TO_BINARY`, `CONVERT_TO_TEXT`.
     */
    contentHandlingStrategy?: pulumi.Input<string>;
    /**
     * Identifier of the `aws.apigatewayv2.Integration`.
     */
    integrationId?: pulumi.Input<string>;
    /**
     * Integration response key.
     */
    integrationResponseKey?: pulumi.Input<string>;
    /**
     * Map of Velocity templates that are applied on the request payload based on the value of the Content-Type header sent by the client.
     */
    responseTemplates?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The [template selection expression](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-template-selection-expressions) for the integration response.
     */
    templateSelectionExpression?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a IntegrationResponse resource.
 */
export interface IntegrationResponseArgs {
    /**
     * API identifier.
     */
    apiId: pulumi.Input<string>;
    /**
     * How to handle response payload content type conversions. Valid values: `CONVERT_TO_BINARY`, `CONVERT_TO_TEXT`.
     */
    contentHandlingStrategy?: pulumi.Input<string>;
    /**
     * Identifier of the `aws.apigatewayv2.Integration`.
     */
    integrationId: pulumi.Input<string>;
    /**
     * Integration response key.
     */
    integrationResponseKey: pulumi.Input<string>;
    /**
     * Map of Velocity templates that are applied on the request payload based on the value of the Content-Type header sent by the client.
     */
    responseTemplates?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The [template selection expression](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-template-selection-expressions) for the integration response.
     */
    templateSelectionExpression?: pulumi.Input<string>;
}

// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

import {Deployment, RestApi} from "./index";

/**
 * Manages an API Gateway Stage. A stage is a named reference to a deployment, which can be done via the `aws.apigateway.Deployment` resource. Stages can be optionally managed further with the `aws.apigateway.BasePathMapping` resource, `aws.apigateway.DomainName` resource, and `awsApiMethodSettings` resource. For more information, see the [API Gateway Developer Guide](https://docs.aws.amazon.com/apigateway/latest/developerguide/set-up-stages.html).
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 * import * as crypto from "crypto";
 *
 * const exampleRestApi = new aws.apigateway.RestApi("exampleRestApi", {body: JSON.stringify({
 *     openapi: "3.0.1",
 *     info: {
 *         title: "example",
 *         version: "1.0",
 *     },
 *     paths: {
 *         "/path1": {
 *             get: {
 *                 "x-amazon-apigateway-integration": {
 *                     httpMethod: "GET",
 *                     payloadFormatVersion: "1.0",
 *                     type: "HTTP_PROXY",
 *                     uri: "https://ip-ranges.amazonaws.com/ip-ranges.json",
 *                 },
 *             },
 *         },
 *     },
 * })});
 * const exampleDeployment = new aws.apigateway.Deployment("exampleDeployment", {
 *     restApi: exampleRestApi.id,
 *     triggers: {
 *         redeployment: exampleRestApi.body.apply(body => JSON.stringify(body)).apply(toJSON => crypto.createHash('sha1').update(toJSON).digest('hex')),
 *     },
 * });
 * const exampleStage = new aws.apigateway.Stage("exampleStage", {
 *     deployment: exampleDeployment.id,
 *     restApi: exampleRestApi.id,
 *     stageName: "example",
 * });
 * const exampleMethodSettings = new aws.apigateway.MethodSettings("exampleMethodSettings", {
 *     restApi: exampleRestApi.id,
 *     stageName: exampleStage.stageName,
 *     methodPath: "*&#47;*",
 *     settings: {
 *         metricsEnabled: true,
 *         loggingLevel: "INFO",
 *     },
 * });
 * ```
 * ### Managing the API Logging CloudWatch Log Group
 *
 * API Gateway provides the ability to [enable CloudWatch API logging](https://docs.aws.amazon.com/apigateway/latest/developerguide/set-up-logging.html). To manage the CloudWatch Log Group when this feature is enabled, the `aws.cloudwatch.LogGroup` resource can be used where the name matches the API Gateway naming convention. If the CloudWatch Log Group previously exists, import the `aws.cloudwatch.LogGroup` resource into Pulumi as a one time operation. You can recreate the environment without import.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const config = new pulumi.Config();
 * const stageName = config.get("stageName") || "example";
 * const exampleRestApi = new aws.apigateway.RestApi("exampleRestApi", {});
 * // ... other configuration ...
 * const exampleLogGroup = new aws.cloudwatch.LogGroup("exampleLogGroup", {retentionInDays: 7});
 * // ... potentially other configuration ...
 * const exampleStage = new aws.apigateway.Stage("exampleStage", {stageName: stageName}, {
 *     dependsOn: [exampleLogGroup],
 * });
 * // ... other configuration ...
 * ```
 *
 * ## Import
 *
 * Using `pulumi import`, import `aws_api_gateway_stage` using `REST-API-ID/STAGE-NAME`. For example:
 *
 * ```sh
 *  $ pulumi import aws:apigateway/stage:Stage example 12345abcde/example
 * ```
 */
export class Stage extends pulumi.CustomResource {
    /**
     * Get an existing Stage resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: StageState, opts?: pulumi.CustomResourceOptions): Stage {
        return new Stage(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:apigateway/stage:Stage';

    /**
     * Returns true if the given object is an instance of Stage.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Stage {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Stage.__pulumiType;
    }

    /**
     * Enables access logs for the API stage. See Access Log Settings below.
     */
    public readonly accessLogSettings!: pulumi.Output<outputs.apigateway.StageAccessLogSettings | undefined>;
    /**
     * ARN
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * Whether a cache cluster is enabled for the stage
     */
    public readonly cacheClusterEnabled!: pulumi.Output<boolean | undefined>;
    /**
     * Size of the cache cluster for the stage, if enabled. Allowed values include `0.5`, `1.6`, `6.1`, `13.5`, `28.4`, `58.2`, `118` and `237`.
     */
    public readonly cacheClusterSize!: pulumi.Output<string | undefined>;
    /**
     * Configuration settings of a canary deployment. See Canary Settings below.
     */
    public readonly canarySettings!: pulumi.Output<outputs.apigateway.StageCanarySettings | undefined>;
    /**
     * Identifier of a client certificate for the stage.
     */
    public readonly clientCertificateId!: pulumi.Output<string | undefined>;
    /**
     * ID of the deployment that the stage points to
     */
    public readonly deployment!: pulumi.Output<string>;
    /**
     * Description of the stage.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Version of the associated API documentation
     */
    public readonly documentationVersion!: pulumi.Output<string | undefined>;
    /**
     * Execution ARN to be used in `lambdaPermission`'s `sourceArn`
     * when allowing API Gateway to invoke a Lambda function,
     * e.g., `arn:aws:execute-api:eu-west-2:123456789012:z4675bid1j/prod`
     */
    public /*out*/ readonly executionArn!: pulumi.Output<string>;
    /**
     * URL to invoke the API pointing to the stage,
     * e.g., `https://z4675bid1j.execute-api.eu-west-2.amazonaws.com/prod`
     */
    public /*out*/ readonly invokeUrl!: pulumi.Output<string>;
    /**
     * ID of the associated REST API
     */
    public readonly restApi!: pulumi.Output<string>;
    /**
     * Name of the stage
     */
    public readonly stageName!: pulumi.Output<string>;
    /**
     * Map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     *
     * @deprecated Please use `tags` instead.
     */
    public /*out*/ readonly tagsAll!: pulumi.Output<{[key: string]: string}>;
    /**
     * Map that defines the stage variables
     */
    public readonly variables!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * ARN of the WebAcl associated with the Stage.
     */
    public /*out*/ readonly webAclArn!: pulumi.Output<string>;
    /**
     * Whether active tracing with X-ray is enabled. Defaults to `false`.
     */
    public readonly xrayTracingEnabled!: pulumi.Output<boolean | undefined>;

    /**
     * Create a Stage resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: StageArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: StageArgs | StageState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as StageState | undefined;
            resourceInputs["accessLogSettings"] = state ? state.accessLogSettings : undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["cacheClusterEnabled"] = state ? state.cacheClusterEnabled : undefined;
            resourceInputs["cacheClusterSize"] = state ? state.cacheClusterSize : undefined;
            resourceInputs["canarySettings"] = state ? state.canarySettings : undefined;
            resourceInputs["clientCertificateId"] = state ? state.clientCertificateId : undefined;
            resourceInputs["deployment"] = state ? state.deployment : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["documentationVersion"] = state ? state.documentationVersion : undefined;
            resourceInputs["executionArn"] = state ? state.executionArn : undefined;
            resourceInputs["invokeUrl"] = state ? state.invokeUrl : undefined;
            resourceInputs["restApi"] = state ? state.restApi : undefined;
            resourceInputs["stageName"] = state ? state.stageName : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tagsAll"] = state ? state.tagsAll : undefined;
            resourceInputs["variables"] = state ? state.variables : undefined;
            resourceInputs["webAclArn"] = state ? state.webAclArn : undefined;
            resourceInputs["xrayTracingEnabled"] = state ? state.xrayTracingEnabled : undefined;
        } else {
            const args = argsOrState as StageArgs | undefined;
            if ((!args || args.deployment === undefined) && !opts.urn) {
                throw new Error("Missing required property 'deployment'");
            }
            if ((!args || args.restApi === undefined) && !opts.urn) {
                throw new Error("Missing required property 'restApi'");
            }
            if ((!args || args.stageName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'stageName'");
            }
            resourceInputs["accessLogSettings"] = args ? args.accessLogSettings : undefined;
            resourceInputs["cacheClusterEnabled"] = args ? args.cacheClusterEnabled : undefined;
            resourceInputs["cacheClusterSize"] = args ? args.cacheClusterSize : undefined;
            resourceInputs["canarySettings"] = args ? args.canarySettings : undefined;
            resourceInputs["clientCertificateId"] = args ? args.clientCertificateId : undefined;
            resourceInputs["deployment"] = args ? args.deployment : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["documentationVersion"] = args ? args.documentationVersion : undefined;
            resourceInputs["restApi"] = args ? args.restApi : undefined;
            resourceInputs["stageName"] = args ? args.stageName : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["variables"] = args ? args.variables : undefined;
            resourceInputs["xrayTracingEnabled"] = args ? args.xrayTracingEnabled : undefined;
            resourceInputs["arn"] = undefined /*out*/;
            resourceInputs["executionArn"] = undefined /*out*/;
            resourceInputs["invokeUrl"] = undefined /*out*/;
            resourceInputs["tagsAll"] = undefined /*out*/;
            resourceInputs["webAclArn"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Stage.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Stage resources.
 */
export interface StageState {
    /**
     * Enables access logs for the API stage. See Access Log Settings below.
     */
    accessLogSettings?: pulumi.Input<inputs.apigateway.StageAccessLogSettings>;
    /**
     * ARN
     */
    arn?: pulumi.Input<string>;
    /**
     * Whether a cache cluster is enabled for the stage
     */
    cacheClusterEnabled?: pulumi.Input<boolean>;
    /**
     * Size of the cache cluster for the stage, if enabled. Allowed values include `0.5`, `1.6`, `6.1`, `13.5`, `28.4`, `58.2`, `118` and `237`.
     */
    cacheClusterSize?: pulumi.Input<string>;
    /**
     * Configuration settings of a canary deployment. See Canary Settings below.
     */
    canarySettings?: pulumi.Input<inputs.apigateway.StageCanarySettings>;
    /**
     * Identifier of a client certificate for the stage.
     */
    clientCertificateId?: pulumi.Input<string>;
    /**
     * ID of the deployment that the stage points to
     */
    deployment?: pulumi.Input<string | Deployment>;
    /**
     * Description of the stage.
     */
    description?: pulumi.Input<string>;
    /**
     * Version of the associated API documentation
     */
    documentationVersion?: pulumi.Input<string>;
    /**
     * Execution ARN to be used in `lambdaPermission`'s `sourceArn`
     * when allowing API Gateway to invoke a Lambda function,
     * e.g., `arn:aws:execute-api:eu-west-2:123456789012:z4675bid1j/prod`
     */
    executionArn?: pulumi.Input<string>;
    /**
     * URL to invoke the API pointing to the stage,
     * e.g., `https://z4675bid1j.execute-api.eu-west-2.amazonaws.com/prod`
     */
    invokeUrl?: pulumi.Input<string>;
    /**
     * ID of the associated REST API
     */
    restApi?: pulumi.Input<string | RestApi>;
    /**
     * Name of the stage
     */
    stageName?: pulumi.Input<string>;
    /**
     * Map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     *
     * @deprecated Please use `tags` instead.
     */
    tagsAll?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Map that defines the stage variables
     */
    variables?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * ARN of the WebAcl associated with the Stage.
     */
    webAclArn?: pulumi.Input<string>;
    /**
     * Whether active tracing with X-ray is enabled. Defaults to `false`.
     */
    xrayTracingEnabled?: pulumi.Input<boolean>;
}

/**
 * The set of arguments for constructing a Stage resource.
 */
export interface StageArgs {
    /**
     * Enables access logs for the API stage. See Access Log Settings below.
     */
    accessLogSettings?: pulumi.Input<inputs.apigateway.StageAccessLogSettings>;
    /**
     * Whether a cache cluster is enabled for the stage
     */
    cacheClusterEnabled?: pulumi.Input<boolean>;
    /**
     * Size of the cache cluster for the stage, if enabled. Allowed values include `0.5`, `1.6`, `6.1`, `13.5`, `28.4`, `58.2`, `118` and `237`.
     */
    cacheClusterSize?: pulumi.Input<string>;
    /**
     * Configuration settings of a canary deployment. See Canary Settings below.
     */
    canarySettings?: pulumi.Input<inputs.apigateway.StageCanarySettings>;
    /**
     * Identifier of a client certificate for the stage.
     */
    clientCertificateId?: pulumi.Input<string>;
    /**
     * ID of the deployment that the stage points to
     */
    deployment: pulumi.Input<string | Deployment>;
    /**
     * Description of the stage.
     */
    description?: pulumi.Input<string>;
    /**
     * Version of the associated API documentation
     */
    documentationVersion?: pulumi.Input<string>;
    /**
     * ID of the associated REST API
     */
    restApi: pulumi.Input<string | RestApi>;
    /**
     * Name of the stage
     */
    stageName: pulumi.Input<string>;
    /**
     * Map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Map that defines the stage variables
     */
    variables?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Whether active tracing with X-ray is enabled. Defaults to `false`.
     */
    xrayTracingEnabled?: pulumi.Input<boolean>;
}

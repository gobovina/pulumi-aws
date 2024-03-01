// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Provides an API Gateway Usage Plan.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 * import * as std from "@pulumi/std";
 *
 * const example = new aws.apigateway.RestApi("example", {
 *     body: JSON.stringify({
 *         openapi: "3.0.1",
 *         info: {
 *             title: "example",
 *             version: "1.0",
 *         },
 *         paths: {
 *             "/path1": {
 *                 get: {
 *                     "x-amazon-apigateway-integration": {
 *                         httpMethod: "GET",
 *                         payloadFormatVersion: "1.0",
 *                         type: "HTTP_PROXY",
 *                         uri: "https://ip-ranges.amazonaws.com/ip-ranges.json",
 *                     },
 *                 },
 *             },
 *         },
 *     }),
 *     name: "example",
 * });
 * const exampleDeployment = new aws.apigateway.Deployment("example", {
 *     restApi: example.id,
 *     triggers: {
 *         redeployment: std.sha1Output({
 *             input: pulumi.jsonStringify(example.body),
 *         }).apply(invoke => invoke.result),
 *     },
 * });
 * const development = new aws.apigateway.Stage("development", {
 *     deployment: exampleDeployment.id,
 *     restApi: example.id,
 *     stageName: "development",
 * });
 * const production = new aws.apigateway.Stage("production", {
 *     deployment: exampleDeployment.id,
 *     restApi: example.id,
 *     stageName: "production",
 * });
 * const exampleUsagePlan = new aws.apigateway.UsagePlan("example", {
 *     name: "my-usage-plan",
 *     description: "my description",
 *     productCode: "MYCODE",
 *     apiStages: [
 *         {
 *             apiId: example.id,
 *             stage: development.stageName,
 *         },
 *         {
 *             apiId: example.id,
 *             stage: production.stageName,
 *         },
 *     ],
 *     quotaSettings: {
 *         limit: 20,
 *         offset: 2,
 *         period: "WEEK",
 *     },
 *     throttleSettings: {
 *         burstLimit: 5,
 *         rateLimit: 10,
 *     },
 * });
 * ```
 *
 * ## Import
 *
 * Using `pulumi import`, import AWS API Gateway Usage Plan using the `id`. For example:
 *
 * ```sh
 *  $ pulumi import aws:apigateway/usagePlan:UsagePlan myusageplan <usage_plan_id>
 * ```
 */
export class UsagePlan extends pulumi.CustomResource {
    /**
     * Get an existing UsagePlan resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: UsagePlanState, opts?: pulumi.CustomResourceOptions): UsagePlan {
        return new UsagePlan(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:apigateway/usagePlan:UsagePlan';

    /**
     * Returns true if the given object is an instance of UsagePlan.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is UsagePlan {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === UsagePlan.__pulumiType;
    }

    /**
     * Associated API stages of the usage plan.
     */
    public readonly apiStages!: pulumi.Output<outputs.apigateway.UsagePlanApiStage[] | undefined>;
    /**
     * ARN
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * Description of a usage plan.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Name of the usage plan.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * AWS Marketplace product identifier to associate with the usage plan as a SaaS product on AWS Marketplace.
     */
    public readonly productCode!: pulumi.Output<string | undefined>;
    /**
     * The quota settings of the usage plan.
     */
    public readonly quotaSettings!: pulumi.Output<outputs.apigateway.UsagePlanQuotaSettings | undefined>;
    /**
     * Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     *
     * @deprecated Please use `tags` instead.
     */
    public /*out*/ readonly tagsAll!: pulumi.Output<{[key: string]: string}>;
    /**
     * The throttling limits of the usage plan.
     */
    public readonly throttleSettings!: pulumi.Output<outputs.apigateway.UsagePlanThrottleSettings | undefined>;

    /**
     * Create a UsagePlan resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: UsagePlanArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: UsagePlanArgs | UsagePlanState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as UsagePlanState | undefined;
            resourceInputs["apiStages"] = state ? state.apiStages : undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["productCode"] = state ? state.productCode : undefined;
            resourceInputs["quotaSettings"] = state ? state.quotaSettings : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tagsAll"] = state ? state.tagsAll : undefined;
            resourceInputs["throttleSettings"] = state ? state.throttleSettings : undefined;
        } else {
            const args = argsOrState as UsagePlanArgs | undefined;
            resourceInputs["apiStages"] = args ? args.apiStages : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["productCode"] = args ? args.productCode : undefined;
            resourceInputs["quotaSettings"] = args ? args.quotaSettings : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["throttleSettings"] = args ? args.throttleSettings : undefined;
            resourceInputs["arn"] = undefined /*out*/;
            resourceInputs["tagsAll"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(UsagePlan.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering UsagePlan resources.
 */
export interface UsagePlanState {
    /**
     * Associated API stages of the usage plan.
     */
    apiStages?: pulumi.Input<pulumi.Input<inputs.apigateway.UsagePlanApiStage>[]>;
    /**
     * ARN
     */
    arn?: pulumi.Input<string>;
    /**
     * Description of a usage plan.
     */
    description?: pulumi.Input<string>;
    /**
     * Name of the usage plan.
     */
    name?: pulumi.Input<string>;
    /**
     * AWS Marketplace product identifier to associate with the usage plan as a SaaS product on AWS Marketplace.
     */
    productCode?: pulumi.Input<string>;
    /**
     * The quota settings of the usage plan.
     */
    quotaSettings?: pulumi.Input<inputs.apigateway.UsagePlanQuotaSettings>;
    /**
     * Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     *
     * @deprecated Please use `tags` instead.
     */
    tagsAll?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The throttling limits of the usage plan.
     */
    throttleSettings?: pulumi.Input<inputs.apigateway.UsagePlanThrottleSettings>;
}

/**
 * The set of arguments for constructing a UsagePlan resource.
 */
export interface UsagePlanArgs {
    /**
     * Associated API stages of the usage plan.
     */
    apiStages?: pulumi.Input<pulumi.Input<inputs.apigateway.UsagePlanApiStage>[]>;
    /**
     * Description of a usage plan.
     */
    description?: pulumi.Input<string>;
    /**
     * Name of the usage plan.
     */
    name?: pulumi.Input<string>;
    /**
     * AWS Marketplace product identifier to associate with the usage plan as a SaaS product on AWS Marketplace.
     */
    productCode?: pulumi.Input<string>;
    /**
     * The quota settings of the usage plan.
     */
    quotaSettings?: pulumi.Input<inputs.apigateway.UsagePlanQuotaSettings>;
    /**
     * Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The throttling limits of the usage plan.
     */
    throttleSettings?: pulumi.Input<inputs.apigateway.UsagePlanThrottleSettings>;
}

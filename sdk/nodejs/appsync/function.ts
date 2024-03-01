// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Provides an AppSync Function.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.appsync.GraphQLApi("example", {
 *     authenticationType: "API_KEY",
 *     name: "example",
 *     schema: `type Mutation {
 *   putPost(id: ID!, title: String!): Post
 * }
 *
 * type Post {
 *   id: ID!
 *   title: String!
 * }
 *
 * type Query {
 *   singlePost(id: ID!): Post
 * }
 *
 * schema {
 *   query: Query
 *   mutation: Mutation
 * }
 * `,
 * });
 * const exampleDataSource = new aws.appsync.DataSource("example", {
 *     apiId: example.id,
 *     name: "example",
 *     type: "HTTP",
 *     httpConfig: {
 *         endpoint: "http://example.com",
 *     },
 * });
 * const exampleFunction = new aws.appsync.Function("example", {
 *     apiId: example.id,
 *     dataSource: exampleDataSource.name,
 *     name: "example",
 *     requestMappingTemplate: `{
 *     "version": "2018-05-29",
 *     "method": "GET",
 *     "resourcePath": "/",
 *     "params":{
 *         "headers": $utils.http.copyheaders($ctx.request.headers)
 *     }
 * }
 * `,
 *     responseMappingTemplate: `#if($ctx.result.statusCode == 200)
 *     $ctx.result.body
 * #else
 *     $utils.appendError($ctx.result.body, $ctx.result.statusCode)
 * #end
 * `,
 * });
 * ```
 * ### With Code
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 * import * as std from "@pulumi/std";
 *
 * const example = new aws.appsync.Function("example", {
 *     apiId: exampleAwsAppsyncGraphqlApi.id,
 *     dataSource: exampleAwsAppsyncDatasource.name,
 *     name: "example",
 *     code: std.file({
 *         input: "some-code-dir",
 *     }).then(invoke => invoke.result),
 *     runtime: {
 *         name: "APPSYNC_JS",
 *         runtimeVersion: "1.0.0",
 *     },
 * });
 * ```
 *
 * ## Import
 *
 * Using `pulumi import`, import `aws_appsync_function` using the AppSync API ID and Function ID separated by `-`. For example:
 *
 * ```sh
 *  $ pulumi import aws:appsync/function:Function example xxxxx-yyyyy
 * ```
 */
export class Function extends pulumi.CustomResource {
    /**
     * Get an existing Function resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: FunctionState, opts?: pulumi.CustomResourceOptions): Function {
        return new Function(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:appsync/function:Function';

    /**
     * Returns true if the given object is an instance of Function.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Function {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Function.__pulumiType;
    }

    /**
     * ID of the associated AppSync API.
     */
    public readonly apiId!: pulumi.Output<string>;
    /**
     * ARN of the Function object.
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * The function code that contains the request and response functions. When code is used, the runtime is required. The runtime value must be APPSYNC_JS.
     */
    public readonly code!: pulumi.Output<string | undefined>;
    /**
     * Function data source name.
     */
    public readonly dataSource!: pulumi.Output<string>;
    /**
     * Function description.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Unique ID representing the Function object.
     */
    public /*out*/ readonly functionId!: pulumi.Output<string>;
    /**
     * Version of the request mapping template. Currently the supported value is `2018-05-29`. Does not apply when specifying `code`.
     */
    public readonly functionVersion!: pulumi.Output<string>;
    /**
     * Maximum batching size for a resolver. Valid values are between `0` and `2000`.
     */
    public readonly maxBatchSize!: pulumi.Output<number | undefined>;
    /**
     * Function name. The function name does not have to be unique.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Function request mapping template. Functions support only the 2018-05-29 version of the request mapping template.
     */
    public readonly requestMappingTemplate!: pulumi.Output<string | undefined>;
    /**
     * Function response mapping template.
     */
    public readonly responseMappingTemplate!: pulumi.Output<string | undefined>;
    /**
     * Describes a runtime used by an AWS AppSync pipeline resolver or AWS AppSync function. Specifies the name and version of the runtime to use. Note that if a runtime is specified, code must also be specified. See Runtime.
     */
    public readonly runtime!: pulumi.Output<outputs.appsync.FunctionRuntime | undefined>;
    /**
     * Describes a Sync configuration for a resolver. See Sync Config.
     */
    public readonly syncConfig!: pulumi.Output<outputs.appsync.FunctionSyncConfig | undefined>;

    /**
     * Create a Function resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: FunctionArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: FunctionArgs | FunctionState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as FunctionState | undefined;
            resourceInputs["apiId"] = state ? state.apiId : undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["code"] = state ? state.code : undefined;
            resourceInputs["dataSource"] = state ? state.dataSource : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["functionId"] = state ? state.functionId : undefined;
            resourceInputs["functionVersion"] = state ? state.functionVersion : undefined;
            resourceInputs["maxBatchSize"] = state ? state.maxBatchSize : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["requestMappingTemplate"] = state ? state.requestMappingTemplate : undefined;
            resourceInputs["responseMappingTemplate"] = state ? state.responseMappingTemplate : undefined;
            resourceInputs["runtime"] = state ? state.runtime : undefined;
            resourceInputs["syncConfig"] = state ? state.syncConfig : undefined;
        } else {
            const args = argsOrState as FunctionArgs | undefined;
            if ((!args || args.apiId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'apiId'");
            }
            if ((!args || args.dataSource === undefined) && !opts.urn) {
                throw new Error("Missing required property 'dataSource'");
            }
            resourceInputs["apiId"] = args ? args.apiId : undefined;
            resourceInputs["code"] = args ? args.code : undefined;
            resourceInputs["dataSource"] = args ? args.dataSource : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["functionVersion"] = args ? args.functionVersion : undefined;
            resourceInputs["maxBatchSize"] = args ? args.maxBatchSize : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["requestMappingTemplate"] = args ? args.requestMappingTemplate : undefined;
            resourceInputs["responseMappingTemplate"] = args ? args.responseMappingTemplate : undefined;
            resourceInputs["runtime"] = args ? args.runtime : undefined;
            resourceInputs["syncConfig"] = args ? args.syncConfig : undefined;
            resourceInputs["arn"] = undefined /*out*/;
            resourceInputs["functionId"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Function.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Function resources.
 */
export interface FunctionState {
    /**
     * ID of the associated AppSync API.
     */
    apiId?: pulumi.Input<string>;
    /**
     * ARN of the Function object.
     */
    arn?: pulumi.Input<string>;
    /**
     * The function code that contains the request and response functions. When code is used, the runtime is required. The runtime value must be APPSYNC_JS.
     */
    code?: pulumi.Input<string>;
    /**
     * Function data source name.
     */
    dataSource?: pulumi.Input<string>;
    /**
     * Function description.
     */
    description?: pulumi.Input<string>;
    /**
     * Unique ID representing the Function object.
     */
    functionId?: pulumi.Input<string>;
    /**
     * Version of the request mapping template. Currently the supported value is `2018-05-29`. Does not apply when specifying `code`.
     */
    functionVersion?: pulumi.Input<string>;
    /**
     * Maximum batching size for a resolver. Valid values are between `0` and `2000`.
     */
    maxBatchSize?: pulumi.Input<number>;
    /**
     * Function name. The function name does not have to be unique.
     */
    name?: pulumi.Input<string>;
    /**
     * Function request mapping template. Functions support only the 2018-05-29 version of the request mapping template.
     */
    requestMappingTemplate?: pulumi.Input<string>;
    /**
     * Function response mapping template.
     */
    responseMappingTemplate?: pulumi.Input<string>;
    /**
     * Describes a runtime used by an AWS AppSync pipeline resolver or AWS AppSync function. Specifies the name and version of the runtime to use. Note that if a runtime is specified, code must also be specified. See Runtime.
     */
    runtime?: pulumi.Input<inputs.appsync.FunctionRuntime>;
    /**
     * Describes a Sync configuration for a resolver. See Sync Config.
     */
    syncConfig?: pulumi.Input<inputs.appsync.FunctionSyncConfig>;
}

/**
 * The set of arguments for constructing a Function resource.
 */
export interface FunctionArgs {
    /**
     * ID of the associated AppSync API.
     */
    apiId: pulumi.Input<string>;
    /**
     * The function code that contains the request and response functions. When code is used, the runtime is required. The runtime value must be APPSYNC_JS.
     */
    code?: pulumi.Input<string>;
    /**
     * Function data source name.
     */
    dataSource: pulumi.Input<string>;
    /**
     * Function description.
     */
    description?: pulumi.Input<string>;
    /**
     * Version of the request mapping template. Currently the supported value is `2018-05-29`. Does not apply when specifying `code`.
     */
    functionVersion?: pulumi.Input<string>;
    /**
     * Maximum batching size for a resolver. Valid values are between `0` and `2000`.
     */
    maxBatchSize?: pulumi.Input<number>;
    /**
     * Function name. The function name does not have to be unique.
     */
    name?: pulumi.Input<string>;
    /**
     * Function request mapping template. Functions support only the 2018-05-29 version of the request mapping template.
     */
    requestMappingTemplate?: pulumi.Input<string>;
    /**
     * Function response mapping template.
     */
    responseMappingTemplate?: pulumi.Input<string>;
    /**
     * Describes a runtime used by an AWS AppSync pipeline resolver or AWS AppSync function. Specifies the name and version of the runtime to use. Note that if a runtime is specified, code must also be specified. See Runtime.
     */
    runtime?: pulumi.Input<inputs.appsync.FunctionRuntime>;
    /**
     * Describes a Sync configuration for a resolver. See Sync Config.
     */
    syncConfig?: pulumi.Input<inputs.appsync.FunctionSyncConfig>;
}

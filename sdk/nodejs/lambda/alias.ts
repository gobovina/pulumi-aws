// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Creates a Lambda function alias. Creates an alias that points to the specified Lambda function version.
 *
 * For information about Lambda and how to use it, see [What is AWS Lambda?](http://docs.aws.amazon.com/lambda/latest/dg/welcome.html)
 * For information about function aliases, see [CreateAlias](http://docs.aws.amazon.com/lambda/latest/dg/API_CreateAlias.html) and [AliasRoutingConfiguration](https://docs.aws.amazon.com/lambda/latest/dg/API_AliasRoutingConfiguration.html) in the API docs.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const testLambdaAlias = new aws.lambda.Alias("test_lambda_alias", {
 *     name: "my_alias",
 *     description: "a sample description",
 *     functionName: lambdaFunctionTest.arn,
 *     functionVersion: "1",
 *     routingConfig: {
 *         additionalVersionWeights: {
 *             "2": 0.5,
 *         },
 *     },
 * });
 * ```
 *
 * ## Import
 *
 * Using `pulumi import`, import Lambda Function Aliases using the `function_name/alias`. For example:
 *
 * ```sh
 *  $ pulumi import aws:lambda/alias:Alias test_lambda_alias my_test_lambda_function/my_alias
 * ```
 */
export class Alias extends pulumi.CustomResource {
    /**
     * Get an existing Alias resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AliasState, opts?: pulumi.CustomResourceOptions): Alias {
        return new Alias(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:lambda/alias:Alias';

    /**
     * Returns true if the given object is an instance of Alias.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Alias {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Alias.__pulumiType;
    }

    /**
     * The Amazon Resource Name (ARN) identifying your Lambda function alias.
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * Description of the alias.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Lambda Function name or ARN.
     */
    public readonly functionName!: pulumi.Output<string>;
    /**
     * Lambda function version for which you are creating the alias. Pattern: `(\$LATEST|[0-9]+)`.
     */
    public readonly functionVersion!: pulumi.Output<string>;
    /**
     * The ARN to be used for invoking Lambda Function from API Gateway - to be used in `aws.apigateway.Integration`'s `uri`
     */
    public /*out*/ readonly invokeArn!: pulumi.Output<string>;
    /**
     * Name for the alias you are creating. Pattern: `(?!^[0-9]+$)([a-zA-Z0-9-_]+)`
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The Lambda alias' route configuration settings. Fields documented below
     */
    public readonly routingConfig!: pulumi.Output<outputs.lambda.AliasRoutingConfig | undefined>;

    /**
     * Create a Alias resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: AliasArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AliasArgs | AliasState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as AliasState | undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["functionName"] = state ? state.functionName : undefined;
            resourceInputs["functionVersion"] = state ? state.functionVersion : undefined;
            resourceInputs["invokeArn"] = state ? state.invokeArn : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["routingConfig"] = state ? state.routingConfig : undefined;
        } else {
            const args = argsOrState as AliasArgs | undefined;
            if ((!args || args.functionName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'functionName'");
            }
            if ((!args || args.functionVersion === undefined) && !opts.urn) {
                throw new Error("Missing required property 'functionVersion'");
            }
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["functionName"] = args ? args.functionName : undefined;
            resourceInputs["functionVersion"] = args ? args.functionVersion : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["routingConfig"] = args ? args.routingConfig : undefined;
            resourceInputs["arn"] = undefined /*out*/;
            resourceInputs["invokeArn"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Alias.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Alias resources.
 */
export interface AliasState {
    /**
     * The Amazon Resource Name (ARN) identifying your Lambda function alias.
     */
    arn?: pulumi.Input<string>;
    /**
     * Description of the alias.
     */
    description?: pulumi.Input<string>;
    /**
     * Lambda Function name or ARN.
     */
    functionName?: pulumi.Input<string>;
    /**
     * Lambda function version for which you are creating the alias. Pattern: `(\$LATEST|[0-9]+)`.
     */
    functionVersion?: pulumi.Input<string>;
    /**
     * The ARN to be used for invoking Lambda Function from API Gateway - to be used in `aws.apigateway.Integration`'s `uri`
     */
    invokeArn?: pulumi.Input<string>;
    /**
     * Name for the alias you are creating. Pattern: `(?!^[0-9]+$)([a-zA-Z0-9-_]+)`
     */
    name?: pulumi.Input<string>;
    /**
     * The Lambda alias' route configuration settings. Fields documented below
     */
    routingConfig?: pulumi.Input<inputs.lambda.AliasRoutingConfig>;
}

/**
 * The set of arguments for constructing a Alias resource.
 */
export interface AliasArgs {
    /**
     * Description of the alias.
     */
    description?: pulumi.Input<string>;
    /**
     * Lambda Function name or ARN.
     */
    functionName: pulumi.Input<string>;
    /**
     * Lambda function version for which you are creating the alias. Pattern: `(\$LATEST|[0-9]+)`.
     */
    functionVersion: pulumi.Input<string>;
    /**
     * Name for the alias you are creating. Pattern: `(?!^[0-9]+$)([a-zA-Z0-9-_]+)`
     */
    name?: pulumi.Input<string>;
    /**
     * The Lambda alias' route configuration settings. Fields documented below
     */
    routingConfig?: pulumi.Input<inputs.lambda.AliasRoutingConfig>;
}

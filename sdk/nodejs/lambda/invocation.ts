// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Use this resource to invoke a lambda function. The lambda function is invoked with the [RequestResponse](https://docs.aws.amazon.com/lambda/latest/dg/API_Invoke.html#API_Invoke_RequestSyntax) invocation type.
 *
 * > **NOTE:** By default this resource _only_ invokes the function when the arguments call for a create or replace. In other words, after an initial invocation on _apply_, if the arguments do not change, a subsequent _apply_ does not invoke the function again. To dynamically invoke the function, see the `triggers` example below. To always invoke a function on each _apply_, see the `aws.lambda.Invocation` data source. To invoke the lambda function when the Pulumi resource is updated and deleted, see the CRUD Lifecycle Scope example below.
 *
 * > **NOTE:** If you get a `KMSAccessDeniedException: Lambda was unable to decrypt the environment variables because KMS access was denied` error when invoking an `aws.lambda.Function` with environment variables, the IAM role associated with the function may have been deleted and recreated _after_ the function was created. You can fix the problem two ways: 1) updating the function's role to another role and then updating it back again to the recreated role, or 2) by using Pulumi to `taint` the function and `apply` your configuration again to recreate the function. (When you create a function, Lambda grants permissions on the KMS key to the function's IAM role. If the IAM role is recreated, the grant is no longer valid. Changing the function's role or recreating the function causes Lambda to update the grant.)
 *
 * ## Example Usage
 *
 * ### Dynamic Invocation Example Using Triggers
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 * import * as std from "@pulumi/std";
 *
 * const example = new aws.lambda.Invocation("example", {
 *     functionName: lambdaFunctionTest.functionName,
 *     triggers: {
 *         redeployment: std.sha1({
 *             input: JSON.stringify([exampleAwsLambdaFunction.environment]),
 *         }).then(invoke => invoke.result),
 *     },
 *     input: JSON.stringify({
 *         key1: "value1",
 *         key2: "value2",
 *     }),
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ### CRUD Lifecycle Scope
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.lambda.Invocation("example", {
 *     functionName: lambdaFunctionTest.functionName,
 *     input: JSON.stringify({
 *         key1: "value1",
 *         key2: "value2",
 *     }),
 *     lifecycleScope: "CRUD",
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * > **NOTE:** `lifecycleScope = "CRUD"` will inject a key `tf` in the input event to pass lifecycle information! This allows the lambda function to handle different lifecycle transitions uniquely.  If you need to use a key `tf` in your own input JSON, the default key name can be overridden with the `pulumiKey` argument.
 *
 * The key `tf` gets added with subkeys:
 *
 * * `action` - Action Pulumi performs on the resource. Values are `create`, `update`, or `delete`.
 * * `prevInput` - Input JSON payload from the previous invocation. This can be used to handle update and delete events.
 *
 * When the resource from the example above is created, the Lambda will get following JSON payload:
 *
 * If the input value of `key1` changes to "valueB", then the lambda will be invoked again with the following JSON payload:
 *
 * When the invocation resource is removed, the final invocation will have the following JSON payload:
 */
export class Invocation extends pulumi.CustomResource {
    /**
     * Get an existing Invocation resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: InvocationState, opts?: pulumi.CustomResourceOptions): Invocation {
        return new Invocation(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:lambda/invocation:Invocation';

    /**
     * Returns true if the given object is an instance of Invocation.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Invocation {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Invocation.__pulumiType;
    }

    /**
     * Name of the lambda function.
     */
    public readonly functionName!: pulumi.Output<string>;
    /**
     * JSON payload to the lambda function.
     *
     * The following arguments are optional:
     */
    public readonly input!: pulumi.Output<string>;
    /**
     * Lifecycle scope of the resource to manage. Valid values are `CREATE_ONLY` and `CRUD`. Defaults to `CREATE_ONLY`. `CREATE_ONLY` will invoke the function only on creation or replacement. `CRUD` will invoke the function on each lifecycle event, and augment the input JSON payload with additional lifecycle information.
     */
    public readonly lifecycleScope!: pulumi.Output<string | undefined>;
    /**
     * Qualifier (i.e., version) of the lambda function. Defaults to `$LATEST`.
     */
    public readonly qualifier!: pulumi.Output<string | undefined>;
    /**
     * String result of the lambda function invocation.
     */
    public /*out*/ readonly result!: pulumi.Output<string>;
    public readonly terraformKey!: pulumi.Output<string | undefined>;
    /**
     * Map of arbitrary keys and values that, when changed, will trigger a re-invocation.
     */
    public readonly triggers!: pulumi.Output<{[key: string]: string} | undefined>;

    /**
     * Create a Invocation resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: InvocationArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: InvocationArgs | InvocationState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as InvocationState | undefined;
            resourceInputs["functionName"] = state ? state.functionName : undefined;
            resourceInputs["input"] = state ? state.input : undefined;
            resourceInputs["lifecycleScope"] = state ? state.lifecycleScope : undefined;
            resourceInputs["qualifier"] = state ? state.qualifier : undefined;
            resourceInputs["result"] = state ? state.result : undefined;
            resourceInputs["terraformKey"] = state ? state.terraformKey : undefined;
            resourceInputs["triggers"] = state ? state.triggers : undefined;
        } else {
            const args = argsOrState as InvocationArgs | undefined;
            if ((!args || args.functionName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'functionName'");
            }
            if ((!args || args.input === undefined) && !opts.urn) {
                throw new Error("Missing required property 'input'");
            }
            resourceInputs["functionName"] = args ? args.functionName : undefined;
            resourceInputs["input"] = args ? args.input : undefined;
            resourceInputs["lifecycleScope"] = args ? args.lifecycleScope : undefined;
            resourceInputs["qualifier"] = args ? args.qualifier : undefined;
            resourceInputs["terraformKey"] = args ? args.terraformKey : undefined;
            resourceInputs["triggers"] = args ? args.triggers : undefined;
            resourceInputs["result"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Invocation.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Invocation resources.
 */
export interface InvocationState {
    /**
     * Name of the lambda function.
     */
    functionName?: pulumi.Input<string>;
    /**
     * JSON payload to the lambda function.
     *
     * The following arguments are optional:
     */
    input?: pulumi.Input<string>;
    /**
     * Lifecycle scope of the resource to manage. Valid values are `CREATE_ONLY` and `CRUD`. Defaults to `CREATE_ONLY`. `CREATE_ONLY` will invoke the function only on creation or replacement. `CRUD` will invoke the function on each lifecycle event, and augment the input JSON payload with additional lifecycle information.
     */
    lifecycleScope?: pulumi.Input<string>;
    /**
     * Qualifier (i.e., version) of the lambda function. Defaults to `$LATEST`.
     */
    qualifier?: pulumi.Input<string>;
    /**
     * String result of the lambda function invocation.
     */
    result?: pulumi.Input<string>;
    terraformKey?: pulumi.Input<string>;
    /**
     * Map of arbitrary keys and values that, when changed, will trigger a re-invocation.
     */
    triggers?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}

/**
 * The set of arguments for constructing a Invocation resource.
 */
export interface InvocationArgs {
    /**
     * Name of the lambda function.
     */
    functionName: pulumi.Input<string>;
    /**
     * JSON payload to the lambda function.
     *
     * The following arguments are optional:
     */
    input: pulumi.Input<string>;
    /**
     * Lifecycle scope of the resource to manage. Valid values are `CREATE_ONLY` and `CRUD`. Defaults to `CREATE_ONLY`. `CREATE_ONLY` will invoke the function only on creation or replacement. `CRUD` will invoke the function on each lifecycle event, and augment the input JSON payload with additional lifecycle information.
     */
    lifecycleScope?: pulumi.Input<string>;
    /**
     * Qualifier (i.e., version) of the lambda function. Defaults to `$LATEST`.
     */
    qualifier?: pulumi.Input<string>;
    terraformKey?: pulumi.Input<string>;
    /**
     * Map of arbitrary keys and values that, when changed, will trigger a re-invocation.
     */
    triggers?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}

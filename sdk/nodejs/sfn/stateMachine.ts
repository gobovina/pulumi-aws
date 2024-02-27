// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Provides a Step Function State Machine resource
 *
 * ## Example Usage
 * ### Basic (Standard Workflow)
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * // ...
 * const sfnStateMachine = new aws.sfn.StateMachine("sfnStateMachine", {
 *     roleArn: aws_iam_role.iam_for_sfn.arn,
 *     definition: `{
 *   "Comment": "A Hello World example of the Amazon States Language using an AWS Lambda Function",
 *   "StartAt": "HelloWorld",
 *   "States": {
 *     "HelloWorld": {
 *       "Type": "Task",
 *       "Resource": "${aws_lambda_function.lambda.arn}",
 *       "End": true
 *     }
 *   }
 * }
 * `,
 * });
 * ```
 * ### Basic (Express Workflow)
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * // ...
 * const sfnStateMachine = new aws.sfn.StateMachine("sfnStateMachine", {
 *     roleArn: aws_iam_role.iam_for_sfn.arn,
 *     type: "EXPRESS",
 *     definition: `{
 *   "Comment": "A Hello World example of the Amazon States Language using an AWS Lambda Function",
 *   "StartAt": "HelloWorld",
 *   "States": {
 *     "HelloWorld": {
 *       "Type": "Task",
 *       "Resource": "${aws_lambda_function.lambda.arn}",
 *       "End": true
 *     }
 *   }
 * }
 * `,
 * });
 * ```
 * ### Publish (Publish SFN version)
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * // ...
 * const sfnStateMachine = new aws.sfn.StateMachine("sfnStateMachine", {
 *     roleArn: aws_iam_role.iam_for_sfn.arn,
 *     publish: true,
 *     type: "EXPRESS",
 *     definition: `{
 *   "Comment": "A Hello World example of the Amazon States Language using an AWS Lambda Function",
 *   "StartAt": "HelloWorld",
 *   "States": {
 *     "HelloWorld": {
 *       "Type": "Task",
 *       "Resource": "${aws_lambda_function.lambda.arn}",
 *       "End": true
 *     }
 *   }
 * }
 * `,
 * });
 * ```
 * ### Logging
 *
 * > *NOTE:* See the [AWS Step Functions Developer Guide](https://docs.aws.amazon.com/step-functions/latest/dg/welcome.html) for more information about enabling Step Function logging.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * // ...
 * const sfnStateMachine = new aws.sfn.StateMachine("sfnStateMachine", {
 *     roleArn: aws_iam_role.iam_for_sfn.arn,
 *     definition: `{
 *   "Comment": "A Hello World example of the Amazon States Language using an AWS Lambda Function",
 *   "StartAt": "HelloWorld",
 *   "States": {
 *     "HelloWorld": {
 *       "Type": "Task",
 *       "Resource": "${aws_lambda_function.lambda.arn}",
 *       "End": true
 *     }
 *   }
 * }
 * `,
 *     loggingConfiguration: {
 *         logDestination: `${aws_cloudwatch_log_group.log_group_for_sfn.arn}:*`,
 *         includeExecutionData: true,
 *         level: "ERROR",
 *     },
 * });
 * ```
 *
 * ## Import
 *
 * Using `pulumi import`, import State Machines using the `arn`. For example:
 *
 * ```sh
 *  $ pulumi import aws:sfn/stateMachine:StateMachine foo arn:aws:states:eu-west-1:123456789098:stateMachine:bar
 * ```
 */
export class StateMachine extends pulumi.CustomResource {
    /**
     * Get an existing StateMachine resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: StateMachineState, opts?: pulumi.CustomResourceOptions): StateMachine {
        return new StateMachine(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:sfn/stateMachine:StateMachine';

    /**
     * Returns true if the given object is an instance of StateMachine.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is StateMachine {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === StateMachine.__pulumiType;
    }

    /**
     * The ARN of the state machine.
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * The date the state machine was created.
     */
    public /*out*/ readonly creationDate!: pulumi.Output<string>;
    /**
     * The [Amazon States Language](https://docs.aws.amazon.com/step-functions/latest/dg/concepts-amazon-states-language.html) definition of the state machine.
     */
    public readonly definition!: pulumi.Output<string>;
    public /*out*/ readonly description!: pulumi.Output<string>;
    /**
     * Defines what execution history events are logged and where they are logged. The `loggingConfiguration` parameter is only valid when `type` is set to `EXPRESS`. Defaults to `OFF`. For more information see [Logging Express Workflows](https://docs.aws.amazon.com/step-functions/latest/dg/cw-logs.html) and [Log Levels](https://docs.aws.amazon.com/step-functions/latest/dg/cloudwatch-log-level.html) in the AWS Step Functions User Guide.
     */
    public readonly loggingConfiguration!: pulumi.Output<outputs.sfn.StateMachineLoggingConfiguration>;
    /**
     * The name of the state machine. The name should only contain `0`-`9`, `A`-`Z`, `a`-`z`, `-` and `_`. If omitted, the provider will assign a random, unique name.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
     */
    public readonly namePrefix!: pulumi.Output<string>;
    /**
     * Set to true to publish a version of the state machine during creation. Default: false.
     */
    public readonly publish!: pulumi.Output<boolean | undefined>;
    public /*out*/ readonly revisionId!: pulumi.Output<string>;
    /**
     * The Amazon Resource Name (ARN) of the IAM role to use for this state machine.
     */
    public readonly roleArn!: pulumi.Output<string>;
    public /*out*/ readonly stateMachineVersionArn!: pulumi.Output<string>;
    /**
     * The current status of the state machine. Either `ACTIVE` or `DELETING`.
     */
    public /*out*/ readonly status!: pulumi.Output<string>;
    /**
     * Key-value map of resource tags. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     *
     * @deprecated Please use `tags` instead.
     */
    public /*out*/ readonly tagsAll!: pulumi.Output<{[key: string]: string}>;
    /**
     * Selects whether AWS X-Ray tracing is enabled.
     */
    public readonly tracingConfiguration!: pulumi.Output<outputs.sfn.StateMachineTracingConfiguration>;
    /**
     * Determines whether a Standard or Express state machine is created. The default is `STANDARD`. You cannot update the type of a state machine once it has been created. Valid values: `STANDARD`, `EXPRESS`.
     */
    public readonly type!: pulumi.Output<string | undefined>;
    public /*out*/ readonly versionDescription!: pulumi.Output<string>;

    /**
     * Create a StateMachine resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: StateMachineArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: StateMachineArgs | StateMachineState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as StateMachineState | undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["creationDate"] = state ? state.creationDate : undefined;
            resourceInputs["definition"] = state ? state.definition : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["loggingConfiguration"] = state ? state.loggingConfiguration : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["namePrefix"] = state ? state.namePrefix : undefined;
            resourceInputs["publish"] = state ? state.publish : undefined;
            resourceInputs["revisionId"] = state ? state.revisionId : undefined;
            resourceInputs["roleArn"] = state ? state.roleArn : undefined;
            resourceInputs["stateMachineVersionArn"] = state ? state.stateMachineVersionArn : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tagsAll"] = state ? state.tagsAll : undefined;
            resourceInputs["tracingConfiguration"] = state ? state.tracingConfiguration : undefined;
            resourceInputs["type"] = state ? state.type : undefined;
            resourceInputs["versionDescription"] = state ? state.versionDescription : undefined;
        } else {
            const args = argsOrState as StateMachineArgs | undefined;
            if ((!args || args.definition === undefined) && !opts.urn) {
                throw new Error("Missing required property 'definition'");
            }
            if ((!args || args.roleArn === undefined) && !opts.urn) {
                throw new Error("Missing required property 'roleArn'");
            }
            resourceInputs["definition"] = args ? args.definition : undefined;
            resourceInputs["loggingConfiguration"] = args ? args.loggingConfiguration : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["namePrefix"] = args ? args.namePrefix : undefined;
            resourceInputs["publish"] = args ? args.publish : undefined;
            resourceInputs["roleArn"] = args ? args.roleArn : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["tracingConfiguration"] = args ? args.tracingConfiguration : undefined;
            resourceInputs["type"] = args ? args.type : undefined;
            resourceInputs["arn"] = undefined /*out*/;
            resourceInputs["creationDate"] = undefined /*out*/;
            resourceInputs["description"] = undefined /*out*/;
            resourceInputs["revisionId"] = undefined /*out*/;
            resourceInputs["stateMachineVersionArn"] = undefined /*out*/;
            resourceInputs["status"] = undefined /*out*/;
            resourceInputs["tagsAll"] = undefined /*out*/;
            resourceInputs["versionDescription"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(StateMachine.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering StateMachine resources.
 */
export interface StateMachineState {
    /**
     * The ARN of the state machine.
     */
    arn?: pulumi.Input<string>;
    /**
     * The date the state machine was created.
     */
    creationDate?: pulumi.Input<string>;
    /**
     * The [Amazon States Language](https://docs.aws.amazon.com/step-functions/latest/dg/concepts-amazon-states-language.html) definition of the state machine.
     */
    definition?: pulumi.Input<string>;
    description?: pulumi.Input<string>;
    /**
     * Defines what execution history events are logged and where they are logged. The `loggingConfiguration` parameter is only valid when `type` is set to `EXPRESS`. Defaults to `OFF`. For more information see [Logging Express Workflows](https://docs.aws.amazon.com/step-functions/latest/dg/cw-logs.html) and [Log Levels](https://docs.aws.amazon.com/step-functions/latest/dg/cloudwatch-log-level.html) in the AWS Step Functions User Guide.
     */
    loggingConfiguration?: pulumi.Input<inputs.sfn.StateMachineLoggingConfiguration>;
    /**
     * The name of the state machine. The name should only contain `0`-`9`, `A`-`Z`, `a`-`z`, `-` and `_`. If omitted, the provider will assign a random, unique name.
     */
    name?: pulumi.Input<string>;
    /**
     * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
     */
    namePrefix?: pulumi.Input<string>;
    /**
     * Set to true to publish a version of the state machine during creation. Default: false.
     */
    publish?: pulumi.Input<boolean>;
    revisionId?: pulumi.Input<string>;
    /**
     * The Amazon Resource Name (ARN) of the IAM role to use for this state machine.
     */
    roleArn?: pulumi.Input<string>;
    stateMachineVersionArn?: pulumi.Input<string>;
    /**
     * The current status of the state machine. Either `ACTIVE` or `DELETING`.
     */
    status?: pulumi.Input<string>;
    /**
     * Key-value map of resource tags. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     *
     * @deprecated Please use `tags` instead.
     */
    tagsAll?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Selects whether AWS X-Ray tracing is enabled.
     */
    tracingConfiguration?: pulumi.Input<inputs.sfn.StateMachineTracingConfiguration>;
    /**
     * Determines whether a Standard or Express state machine is created. The default is `STANDARD`. You cannot update the type of a state machine once it has been created. Valid values: `STANDARD`, `EXPRESS`.
     */
    type?: pulumi.Input<string>;
    versionDescription?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a StateMachine resource.
 */
export interface StateMachineArgs {
    /**
     * The [Amazon States Language](https://docs.aws.amazon.com/step-functions/latest/dg/concepts-amazon-states-language.html) definition of the state machine.
     */
    definition: pulumi.Input<string>;
    /**
     * Defines what execution history events are logged and where they are logged. The `loggingConfiguration` parameter is only valid when `type` is set to `EXPRESS`. Defaults to `OFF`. For more information see [Logging Express Workflows](https://docs.aws.amazon.com/step-functions/latest/dg/cw-logs.html) and [Log Levels](https://docs.aws.amazon.com/step-functions/latest/dg/cloudwatch-log-level.html) in the AWS Step Functions User Guide.
     */
    loggingConfiguration?: pulumi.Input<inputs.sfn.StateMachineLoggingConfiguration>;
    /**
     * The name of the state machine. The name should only contain `0`-`9`, `A`-`Z`, `a`-`z`, `-` and `_`. If omitted, the provider will assign a random, unique name.
     */
    name?: pulumi.Input<string>;
    /**
     * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
     */
    namePrefix?: pulumi.Input<string>;
    /**
     * Set to true to publish a version of the state machine during creation. Default: false.
     */
    publish?: pulumi.Input<boolean>;
    /**
     * The Amazon Resource Name (ARN) of the IAM role to use for this state machine.
     */
    roleArn: pulumi.Input<string>;
    /**
     * Key-value map of resource tags. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Selects whether AWS X-Ray tracing is enabled.
     */
    tracingConfiguration?: pulumi.Input<inputs.sfn.StateMachineTracingConfiguration>;
    /**
     * Determines whether a Standard or Express state machine is created. The default is `STANDARD`. You cannot update the type of a state machine once it has been created. Valid values: `STANDARD`, `EXPRESS`.
     */
    type?: pulumi.Input<string>;
}

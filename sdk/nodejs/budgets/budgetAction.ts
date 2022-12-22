// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Provides a budget action resource. Budget actions are cost savings controls that run either automatically on your behalf or by using a workflow approval process.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const examplePolicy = new aws.iam.Policy("examplePolicy", {
 *     description: "My example policy",
 *     policy: `{
 *   "Version": "2012-10-17",
 *   "Statement": [
 *     {
 *       "Action": [
 *         "ec2:Describe*"
 *       ],
 *       "Effect": "Allow",
 *       "Resource": "*"
 *     }
 *   ]
 * }
 * `,
 * });
 * const current = aws.getPartition({});
 * const exampleRole = new aws.iam.Role("exampleRole", {assumeRolePolicy: current.then(current => `{
 *   "Version": "2012-10-17",
 *   "Statement": [
 *     {
 *       "Effect": "Allow",
 *       "Principal": {
 *         "Service": [
 *           "budgets.${current.dnsSuffix}"
 *         ]
 *       },
 *       "Action": [
 *         "sts:AssumeRole"
 *       ]
 *     }
 *   ]
 * }
 * `)});
 * const exampleBudget = new aws.budgets.Budget("exampleBudget", {
 *     budgetType: "USAGE",
 *     limitAmount: "10.0",
 *     limitUnit: "dollars",
 *     timePeriodStart: "2006-01-02_15:04",
 *     timeUnit: "MONTHLY",
 * });
 * const exampleBudgetAction = new aws.budgets.BudgetAction("exampleBudgetAction", {
 *     budgetName: exampleBudget.name,
 *     actionType: "APPLY_IAM_POLICY",
 *     approvalModel: "AUTOMATIC",
 *     notificationType: "ACTUAL",
 *     executionRoleArn: exampleRole.arn,
 *     actionThreshold: {
 *         actionThresholdType: "ABSOLUTE_VALUE",
 *         actionThresholdValue: 100,
 *     },
 *     definition: {
 *         iamActionDefinition: {
 *             policyArn: examplePolicy.arn,
 *             roles: [exampleRole.name],
 *         },
 *     },
 *     subscribers: [{
 *         address: "example@example.example",
 *         subscriptionType: "EMAIL",
 *     }],
 * });
 * ```
 *
 * ## Import
 *
 * Budgets can be imported using `AccountID:ActionID:BudgetName`, e.g.,
 *
 * ```sh
 *  $ pulumi import aws:budgets/budgetAction:BudgetAction myBudget 123456789012:some-id:myBudget`
 * ```
 */
export class BudgetAction extends pulumi.CustomResource {
    /**
     * Get an existing BudgetAction resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: BudgetActionState, opts?: pulumi.CustomResourceOptions): BudgetAction {
        return new BudgetAction(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:budgets/budgetAction:BudgetAction';

    /**
     * Returns true if the given object is an instance of BudgetAction.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is BudgetAction {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === BudgetAction.__pulumiType;
    }

    /**
     * The ID of the target account for budget. Will use current user's accountId by default if omitted.
     */
    public readonly accountId!: pulumi.Output<string>;
    /**
     * The id of the budget action.
     */
    public /*out*/ readonly actionId!: pulumi.Output<string>;
    /**
     * The trigger threshold of the action. See Action Threshold.
     */
    public readonly actionThreshold!: pulumi.Output<outputs.budgets.BudgetActionActionThreshold>;
    /**
     * The type of action. This defines the type of tasks that can be carried out by this action. This field also determines the format for definition. Valid values are `APPLY_IAM_POLICY`, `APPLY_SCP_POLICY`, and `RUN_SSM_DOCUMENTS`.
     */
    public readonly actionType!: pulumi.Output<string>;
    /**
     * This specifies if the action needs manual or automatic approval. Valid values are `AUTOMATIC` and `MANUAL`.
     */
    public readonly approvalModel!: pulumi.Output<string>;
    /**
     * The ARN of the budget action.
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * The name of a budget.
     */
    public readonly budgetName!: pulumi.Output<string>;
    /**
     * Specifies all of the type-specific parameters. See Definition.
     */
    public readonly definition!: pulumi.Output<outputs.budgets.BudgetActionDefinition>;
    /**
     * The role passed for action execution and reversion. Roles and actions must be in the same account.
     */
    public readonly executionRoleArn!: pulumi.Output<string>;
    /**
     * The type of a notification. Valid values are `ACTUAL` or `FORECASTED`.
     */
    public readonly notificationType!: pulumi.Output<string>;
    /**
     * The status of the budget action.
     */
    public /*out*/ readonly status!: pulumi.Output<string>;
    /**
     * A list of subscribers. See Subscriber.
     */
    public readonly subscribers!: pulumi.Output<outputs.budgets.BudgetActionSubscriber[]>;

    /**
     * Create a BudgetAction resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: BudgetActionArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: BudgetActionArgs | BudgetActionState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as BudgetActionState | undefined;
            resourceInputs["accountId"] = state ? state.accountId : undefined;
            resourceInputs["actionId"] = state ? state.actionId : undefined;
            resourceInputs["actionThreshold"] = state ? state.actionThreshold : undefined;
            resourceInputs["actionType"] = state ? state.actionType : undefined;
            resourceInputs["approvalModel"] = state ? state.approvalModel : undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["budgetName"] = state ? state.budgetName : undefined;
            resourceInputs["definition"] = state ? state.definition : undefined;
            resourceInputs["executionRoleArn"] = state ? state.executionRoleArn : undefined;
            resourceInputs["notificationType"] = state ? state.notificationType : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
            resourceInputs["subscribers"] = state ? state.subscribers : undefined;
        } else {
            const args = argsOrState as BudgetActionArgs | undefined;
            if ((!args || args.actionThreshold === undefined) && !opts.urn) {
                throw new Error("Missing required property 'actionThreshold'");
            }
            if ((!args || args.actionType === undefined) && !opts.urn) {
                throw new Error("Missing required property 'actionType'");
            }
            if ((!args || args.approvalModel === undefined) && !opts.urn) {
                throw new Error("Missing required property 'approvalModel'");
            }
            if ((!args || args.budgetName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'budgetName'");
            }
            if ((!args || args.definition === undefined) && !opts.urn) {
                throw new Error("Missing required property 'definition'");
            }
            if ((!args || args.executionRoleArn === undefined) && !opts.urn) {
                throw new Error("Missing required property 'executionRoleArn'");
            }
            if ((!args || args.notificationType === undefined) && !opts.urn) {
                throw new Error("Missing required property 'notificationType'");
            }
            if ((!args || args.subscribers === undefined) && !opts.urn) {
                throw new Error("Missing required property 'subscribers'");
            }
            resourceInputs["accountId"] = args ? args.accountId : undefined;
            resourceInputs["actionThreshold"] = args ? args.actionThreshold : undefined;
            resourceInputs["actionType"] = args ? args.actionType : undefined;
            resourceInputs["approvalModel"] = args ? args.approvalModel : undefined;
            resourceInputs["budgetName"] = args ? args.budgetName : undefined;
            resourceInputs["definition"] = args ? args.definition : undefined;
            resourceInputs["executionRoleArn"] = args ? args.executionRoleArn : undefined;
            resourceInputs["notificationType"] = args ? args.notificationType : undefined;
            resourceInputs["subscribers"] = args ? args.subscribers : undefined;
            resourceInputs["actionId"] = undefined /*out*/;
            resourceInputs["arn"] = undefined /*out*/;
            resourceInputs["status"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(BudgetAction.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering BudgetAction resources.
 */
export interface BudgetActionState {
    /**
     * The ID of the target account for budget. Will use current user's accountId by default if omitted.
     */
    accountId?: pulumi.Input<string>;
    /**
     * The id of the budget action.
     */
    actionId?: pulumi.Input<string>;
    /**
     * The trigger threshold of the action. See Action Threshold.
     */
    actionThreshold?: pulumi.Input<inputs.budgets.BudgetActionActionThreshold>;
    /**
     * The type of action. This defines the type of tasks that can be carried out by this action. This field also determines the format for definition. Valid values are `APPLY_IAM_POLICY`, `APPLY_SCP_POLICY`, and `RUN_SSM_DOCUMENTS`.
     */
    actionType?: pulumi.Input<string>;
    /**
     * This specifies if the action needs manual or automatic approval. Valid values are `AUTOMATIC` and `MANUAL`.
     */
    approvalModel?: pulumi.Input<string>;
    /**
     * The ARN of the budget action.
     */
    arn?: pulumi.Input<string>;
    /**
     * The name of a budget.
     */
    budgetName?: pulumi.Input<string>;
    /**
     * Specifies all of the type-specific parameters. See Definition.
     */
    definition?: pulumi.Input<inputs.budgets.BudgetActionDefinition>;
    /**
     * The role passed for action execution and reversion. Roles and actions must be in the same account.
     */
    executionRoleArn?: pulumi.Input<string>;
    /**
     * The type of a notification. Valid values are `ACTUAL` or `FORECASTED`.
     */
    notificationType?: pulumi.Input<string>;
    /**
     * The status of the budget action.
     */
    status?: pulumi.Input<string>;
    /**
     * A list of subscribers. See Subscriber.
     */
    subscribers?: pulumi.Input<pulumi.Input<inputs.budgets.BudgetActionSubscriber>[]>;
}

/**
 * The set of arguments for constructing a BudgetAction resource.
 */
export interface BudgetActionArgs {
    /**
     * The ID of the target account for budget. Will use current user's accountId by default if omitted.
     */
    accountId?: pulumi.Input<string>;
    /**
     * The trigger threshold of the action. See Action Threshold.
     */
    actionThreshold: pulumi.Input<inputs.budgets.BudgetActionActionThreshold>;
    /**
     * The type of action. This defines the type of tasks that can be carried out by this action. This field also determines the format for definition. Valid values are `APPLY_IAM_POLICY`, `APPLY_SCP_POLICY`, and `RUN_SSM_DOCUMENTS`.
     */
    actionType: pulumi.Input<string>;
    /**
     * This specifies if the action needs manual or automatic approval. Valid values are `AUTOMATIC` and `MANUAL`.
     */
    approvalModel: pulumi.Input<string>;
    /**
     * The name of a budget.
     */
    budgetName: pulumi.Input<string>;
    /**
     * Specifies all of the type-specific parameters. See Definition.
     */
    definition: pulumi.Input<inputs.budgets.BudgetActionDefinition>;
    /**
     * The role passed for action execution and reversion. Roles and actions must be in the same account.
     */
    executionRoleArn: pulumi.Input<string>;
    /**
     * The type of a notification. Valid values are `ACTUAL` or `FORECASTED`.
     */
    notificationType: pulumi.Input<string>;
    /**
     * A list of subscribers. See Subscriber.
     */
    subscribers: pulumi.Input<pulumi.Input<inputs.budgets.BudgetActionSubscriber>[]>;
}

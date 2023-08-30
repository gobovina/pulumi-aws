// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Provides a budgets budget resource. Budgets use the cost visualisation provided by Cost Explorer to show you the status of your budgets, to provide forecasts of your estimated costs, and to track your AWS usage, including your free tier usage.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const ec2 = new aws.budgets.Budget("ec2", {
 *     budgetType: "COST",
 *     costFilters: [{
 *         name: "Service",
 *         values: ["Amazon Elastic Compute Cloud - Compute"],
 *     }],
 *     limitAmount: "1200",
 *     limitUnit: "USD",
 *     notifications: [{
 *         comparisonOperator: "GREATER_THAN",
 *         notificationType: "FORECASTED",
 *         subscriberEmailAddresses: ["test@example.com"],
 *         threshold: 100,
 *         thresholdType: "PERCENTAGE",
 *     }],
 *     timePeriodEnd: "2087-06-15_00:00",
 *     timePeriodStart: "2017-07-01_00:00",
 *     timeUnit: "MONTHLY",
 * });
 * ```
 *
 * Create a budget for *$100*.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const cost = new aws.budgets.Budget("cost", {
 *     budgetType: "COST",
 *     limitAmount: "100",
 *     limitUnit: "USD",
 * });
 * ```
 *
 * Create a budget with planned budget limits.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const cost = new aws.budgets.Budget("cost", {plannedLimits: [
 *     {
 *         amount: "100",
 *         startTime: "2017-07-01_00:00",
 *         unit: "USD",
 *     },
 *     {
 *         amount: "200",
 *         startTime: "2017-08-01_00:00",
 *         unit: "USD",
 *     },
 * ]});
 * ```
 *
 * Create a budget for s3 with a limit of *3 GB* of storage.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const s3 = new aws.budgets.Budget("s3", {
 *     budgetType: "USAGE",
 *     limitAmount: "3",
 *     limitUnit: "GB",
 * });
 * ```
 *
 * Create a Savings Plan Utilization Budget
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const savingsPlanUtilization = new aws.budgets.Budget("savingsPlanUtilization", {
 *     budgetType: "SAVINGS_PLANS_UTILIZATION",
 *     costTypes: {
 *         includeCredit: false,
 *         includeDiscount: false,
 *         includeOtherSubscription: false,
 *         includeRecurring: false,
 *         includeRefund: false,
 *         includeSubscription: true,
 *         includeSupport: false,
 *         includeTax: false,
 *         includeUpfront: false,
 *         useBlended: false,
 *     },
 *     limitAmount: "100.0",
 *     limitUnit: "PERCENTAGE",
 * });
 * ```
 *
 * Create a RI Utilization Budget
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const riUtilization = new aws.budgets.Budget("riUtilization", {
 *     budgetType: "RI_UTILIZATION",
 *     costFilters: [{
 *         name: "Service",
 *         values: ["Amazon Relational Database Service"],
 *     }],
 *     costTypes: {
 *         includeCredit: false,
 *         includeDiscount: false,
 *         includeOtherSubscription: false,
 *         includeRecurring: false,
 *         includeRefund: false,
 *         includeSubscription: true,
 *         includeSupport: false,
 *         includeTax: false,
 *         includeUpfront: false,
 *         useBlended: false,
 *     },
 *     limitAmount: "100.0",
 *     limitUnit: "PERCENTAGE",
 * });
 * ```
 *
 * Create a Cost Filter using Resource Tags
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const cost = new aws.budgets.Budget("cost", {costFilters: [{
 *     name: "TagKeyValue",
 *     values: ["TagKey$TagValue"],
 * }]});
 * ```
 *
 * Create a costFilter using resource tags, obtaining the tag value from a variable
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const cost = new aws.budgets.Budget("cost", {costFilters: [{
 *     name: "TagKeyValue",
 *     values: ["TagKey${var.TagValue}"],
 * }]});
 * ```
 *
 * ## Import
 *
 * Using `pulumi import`, import budgets using `AccountID:ActionID:BudgetName`. For example:
 *
 * ```sh
 *  $ pulumi import aws:budgets/budget:Budget myBudget 123456789012:myBudget
 * ```
 */
export class Budget extends pulumi.CustomResource {
    /**
     * Get an existing Budget resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: BudgetState, opts?: pulumi.CustomResourceOptions): Budget {
        return new Budget(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:budgets/budget:Budget';

    /**
     * Returns true if the given object is an instance of Budget.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Budget {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Budget.__pulumiType;
    }

    /**
     * The ID of the target account for budget. Will use current user's accountId by default if omitted.
     */
    public readonly accountId!: pulumi.Output<string>;
    /**
     * The ARN of the budget.
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * Object containing [AutoAdjustData] which determines the budget amount for an auto-adjusting budget.
     */
    public readonly autoAdjustData!: pulumi.Output<outputs.budgets.BudgetAutoAdjustData | undefined>;
    /**
     * Whether this budget tracks monetary cost or usage.
     */
    public readonly budgetType!: pulumi.Output<string>;
    /**
     * A list of CostFilter name/values pair to apply to budget.
     */
    public readonly costFilters!: pulumi.Output<outputs.budgets.BudgetCostFilter[]>;
    /**
     * Object containing CostTypes The types of cost included in a budget, such as tax and subscriptions.
     */
    public readonly costTypes!: pulumi.Output<outputs.budgets.BudgetCostTypes>;
    /**
     * The amount of cost or usage being measured for a budget.
     */
    public readonly limitAmount!: pulumi.Output<string>;
    /**
     * The unit of measurement used for the budget forecast, actual spend, or budget threshold, such as dollars or GB. See [Spend](http://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/data-type-spend.html) documentation.
     */
    public readonly limitUnit!: pulumi.Output<string>;
    /**
     * The name of a budget. Unique within accounts.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The prefix of the name of a budget. Unique within accounts.
     */
    public readonly namePrefix!: pulumi.Output<string>;
    /**
     * Object containing Budget Notifications. Can be used multiple times to define more than one budget notification.
     */
    public readonly notifications!: pulumi.Output<outputs.budgets.BudgetNotification[] | undefined>;
    /**
     * Object containing Planned Budget Limits. Can be used multiple times to plan more than one budget limit. See [PlannedBudgetLimits](https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_budgets_Budget.html#awscostmanagement-Type-budgets_Budget-PlannedBudgetLimits) documentation.
     */
    public readonly plannedLimits!: pulumi.Output<outputs.budgets.BudgetPlannedLimit[] | undefined>;
    /**
     * The end of the time period covered by the budget. There are no restrictions on the end date. Format: `2017-01-01_12:00`.
     */
    public readonly timePeriodEnd!: pulumi.Output<string | undefined>;
    /**
     * The start of the time period covered by the budget. If you don't specify a start date, AWS defaults to the start of your chosen time period. The start date must come before the end date. Format: `2017-01-01_12:00`.
     */
    public readonly timePeriodStart!: pulumi.Output<string>;
    /**
     * The length of time until a budget resets the actual and forecasted spend. Valid values: `MONTHLY`, `QUARTERLY`, `ANNUALLY`, and `DAILY`.
     */
    public readonly timeUnit!: pulumi.Output<string>;

    /**
     * Create a Budget resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: BudgetArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: BudgetArgs | BudgetState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as BudgetState | undefined;
            resourceInputs["accountId"] = state ? state.accountId : undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["autoAdjustData"] = state ? state.autoAdjustData : undefined;
            resourceInputs["budgetType"] = state ? state.budgetType : undefined;
            resourceInputs["costFilters"] = state ? state.costFilters : undefined;
            resourceInputs["costTypes"] = state ? state.costTypes : undefined;
            resourceInputs["limitAmount"] = state ? state.limitAmount : undefined;
            resourceInputs["limitUnit"] = state ? state.limitUnit : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["namePrefix"] = state ? state.namePrefix : undefined;
            resourceInputs["notifications"] = state ? state.notifications : undefined;
            resourceInputs["plannedLimits"] = state ? state.plannedLimits : undefined;
            resourceInputs["timePeriodEnd"] = state ? state.timePeriodEnd : undefined;
            resourceInputs["timePeriodStart"] = state ? state.timePeriodStart : undefined;
            resourceInputs["timeUnit"] = state ? state.timeUnit : undefined;
        } else {
            const args = argsOrState as BudgetArgs | undefined;
            if ((!args || args.budgetType === undefined) && !opts.urn) {
                throw new Error("Missing required property 'budgetType'");
            }
            if ((!args || args.timeUnit === undefined) && !opts.urn) {
                throw new Error("Missing required property 'timeUnit'");
            }
            resourceInputs["accountId"] = args ? args.accountId : undefined;
            resourceInputs["autoAdjustData"] = args ? args.autoAdjustData : undefined;
            resourceInputs["budgetType"] = args ? args.budgetType : undefined;
            resourceInputs["costFilters"] = args ? args.costFilters : undefined;
            resourceInputs["costTypes"] = args ? args.costTypes : undefined;
            resourceInputs["limitAmount"] = args ? args.limitAmount : undefined;
            resourceInputs["limitUnit"] = args ? args.limitUnit : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["namePrefix"] = args ? args.namePrefix : undefined;
            resourceInputs["notifications"] = args ? args.notifications : undefined;
            resourceInputs["plannedLimits"] = args ? args.plannedLimits : undefined;
            resourceInputs["timePeriodEnd"] = args ? args.timePeriodEnd : undefined;
            resourceInputs["timePeriodStart"] = args ? args.timePeriodStart : undefined;
            resourceInputs["timeUnit"] = args ? args.timeUnit : undefined;
            resourceInputs["arn"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Budget.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Budget resources.
 */
export interface BudgetState {
    /**
     * The ID of the target account for budget. Will use current user's accountId by default if omitted.
     */
    accountId?: pulumi.Input<string>;
    /**
     * The ARN of the budget.
     */
    arn?: pulumi.Input<string>;
    /**
     * Object containing [AutoAdjustData] which determines the budget amount for an auto-adjusting budget.
     */
    autoAdjustData?: pulumi.Input<inputs.budgets.BudgetAutoAdjustData>;
    /**
     * Whether this budget tracks monetary cost or usage.
     */
    budgetType?: pulumi.Input<string>;
    /**
     * A list of CostFilter name/values pair to apply to budget.
     */
    costFilters?: pulumi.Input<pulumi.Input<inputs.budgets.BudgetCostFilter>[]>;
    /**
     * Object containing CostTypes The types of cost included in a budget, such as tax and subscriptions.
     */
    costTypes?: pulumi.Input<inputs.budgets.BudgetCostTypes>;
    /**
     * The amount of cost or usage being measured for a budget.
     */
    limitAmount?: pulumi.Input<string>;
    /**
     * The unit of measurement used for the budget forecast, actual spend, or budget threshold, such as dollars or GB. See [Spend](http://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/data-type-spend.html) documentation.
     */
    limitUnit?: pulumi.Input<string>;
    /**
     * The name of a budget. Unique within accounts.
     */
    name?: pulumi.Input<string>;
    /**
     * The prefix of the name of a budget. Unique within accounts.
     */
    namePrefix?: pulumi.Input<string>;
    /**
     * Object containing Budget Notifications. Can be used multiple times to define more than one budget notification.
     */
    notifications?: pulumi.Input<pulumi.Input<inputs.budgets.BudgetNotification>[]>;
    /**
     * Object containing Planned Budget Limits. Can be used multiple times to plan more than one budget limit. See [PlannedBudgetLimits](https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_budgets_Budget.html#awscostmanagement-Type-budgets_Budget-PlannedBudgetLimits) documentation.
     */
    plannedLimits?: pulumi.Input<pulumi.Input<inputs.budgets.BudgetPlannedLimit>[]>;
    /**
     * The end of the time period covered by the budget. There are no restrictions on the end date. Format: `2017-01-01_12:00`.
     */
    timePeriodEnd?: pulumi.Input<string>;
    /**
     * The start of the time period covered by the budget. If you don't specify a start date, AWS defaults to the start of your chosen time period. The start date must come before the end date. Format: `2017-01-01_12:00`.
     */
    timePeriodStart?: pulumi.Input<string>;
    /**
     * The length of time until a budget resets the actual and forecasted spend. Valid values: `MONTHLY`, `QUARTERLY`, `ANNUALLY`, and `DAILY`.
     */
    timeUnit?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Budget resource.
 */
export interface BudgetArgs {
    /**
     * The ID of the target account for budget. Will use current user's accountId by default if omitted.
     */
    accountId?: pulumi.Input<string>;
    /**
     * Object containing [AutoAdjustData] which determines the budget amount for an auto-adjusting budget.
     */
    autoAdjustData?: pulumi.Input<inputs.budgets.BudgetAutoAdjustData>;
    /**
     * Whether this budget tracks monetary cost or usage.
     */
    budgetType: pulumi.Input<string>;
    /**
     * A list of CostFilter name/values pair to apply to budget.
     */
    costFilters?: pulumi.Input<pulumi.Input<inputs.budgets.BudgetCostFilter>[]>;
    /**
     * Object containing CostTypes The types of cost included in a budget, such as tax and subscriptions.
     */
    costTypes?: pulumi.Input<inputs.budgets.BudgetCostTypes>;
    /**
     * The amount of cost or usage being measured for a budget.
     */
    limitAmount?: pulumi.Input<string>;
    /**
     * The unit of measurement used for the budget forecast, actual spend, or budget threshold, such as dollars or GB. See [Spend](http://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/data-type-spend.html) documentation.
     */
    limitUnit?: pulumi.Input<string>;
    /**
     * The name of a budget. Unique within accounts.
     */
    name?: pulumi.Input<string>;
    /**
     * The prefix of the name of a budget. Unique within accounts.
     */
    namePrefix?: pulumi.Input<string>;
    /**
     * Object containing Budget Notifications. Can be used multiple times to define more than one budget notification.
     */
    notifications?: pulumi.Input<pulumi.Input<inputs.budgets.BudgetNotification>[]>;
    /**
     * Object containing Planned Budget Limits. Can be used multiple times to plan more than one budget limit. See [PlannedBudgetLimits](https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_budgets_Budget.html#awscostmanagement-Type-budgets_Budget-PlannedBudgetLimits) documentation.
     */
    plannedLimits?: pulumi.Input<pulumi.Input<inputs.budgets.BudgetPlannedLimit>[]>;
    /**
     * The end of the time period covered by the budget. There are no restrictions on the end date. Format: `2017-01-01_12:00`.
     */
    timePeriodEnd?: pulumi.Input<string>;
    /**
     * The start of the time period covered by the budget. If you don't specify a start date, AWS defaults to the start of your chosen time period. The start date must come before the end date. Format: `2017-01-01_12:00`.
     */
    timePeriodStart?: pulumi.Input<string>;
    /**
     * The length of time until a budget resets the actual and forecasted spend. Valid values: `MONTHLY`, `QUARTERLY`, `ANNUALLY`, and `DAILY`.
     */
    timeUnit: pulumi.Input<string>;
}

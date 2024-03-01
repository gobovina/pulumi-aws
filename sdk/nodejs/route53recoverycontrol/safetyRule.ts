// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Provides an AWS Route 53 Recovery Control Config Safety Rule
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.route53recoverycontrol.SafetyRule("example", {
 *     assertedControls: [exampleAwsRoute53recoverycontrolconfigRoutingControl.arn],
 *     controlPanelArn: "arn:aws:route53-recovery-control::313517334327:controlpanel/abd5fbfc052d4844a082dbf400f61da8",
 *     name: "daisyguttridge",
 *     waitPeriodMs: 5000,
 *     ruleConfig: {
 *         inverted: false,
 *         threshold: 1,
 *         type: "ATLEAST",
 *     },
 * });
 * ```
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.route53recoverycontrol.SafetyRule("example", {
 *     name: "i_o",
 *     controlPanelArn: "arn:aws:route53-recovery-control::313517334327:controlpanel/abd5fbfc052d4844a082dbf400f61da8",
 *     waitPeriodMs: 5000,
 *     gatingControls: [exampleAwsRoute53recoverycontrolconfigRoutingControl.arn],
 *     targetControls: [exampleAwsRoute53recoverycontrolconfigRoutingControl.arn],
 *     ruleConfig: {
 *         inverted: false,
 *         threshold: 1,
 *         type: "ATLEAST",
 *     },
 * });
 * ```
 *
 * ## Import
 *
 * Using `pulumi import`, import Route53 Recovery Control Config Safety Rule using the safety rule ARN. For example:
 *
 * ```sh
 *  $ pulumi import aws:route53recoverycontrol/safetyRule:SafetyRule myrule arn:aws:route53-recovery-control::313517334327:controlpanel/1bfba17df8684f5dab0467b71424f7e8/safetyrule/3bacc77003364c0f
 * ```
 */
export class SafetyRule extends pulumi.CustomResource {
    /**
     * Get an existing SafetyRule resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SafetyRuleState, opts?: pulumi.CustomResourceOptions): SafetyRule {
        return new SafetyRule(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:route53recoverycontrol/safetyRule:SafetyRule';

    /**
     * Returns true if the given object is an instance of SafetyRule.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is SafetyRule {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === SafetyRule.__pulumiType;
    }

    /**
     * ARN of the safety rule.
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * Routing controls that are part of transactions that are evaluated to determine if a request to change a routing control state is allowed.
     */
    public readonly assertedControls!: pulumi.Output<string[] | undefined>;
    /**
     * ARN of the control panel in which this safety rule will reside.
     */
    public readonly controlPanelArn!: pulumi.Output<string>;
    /**
     * Gating controls for the new gating rule. That is, routing controls that are evaluated by the rule configuration that you specify.
     */
    public readonly gatingControls!: pulumi.Output<string[] | undefined>;
    /**
     * Name describing the safety rule.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Configuration block for safety rule criteria. See below.
     */
    public readonly ruleConfig!: pulumi.Output<outputs.route53recoverycontrol.SafetyRuleRuleConfig>;
    /**
     * Status of the safety rule. `PENDING` when it is being created/updated, `PENDING_DELETION` when it is being deleted, and `DEPLOYED` otherwise.
     */
    public /*out*/ readonly status!: pulumi.Output<string>;
    /**
     * Routing controls that can only be set or unset if the specified `ruleConfig` evaluates to true for the specified `gatingControls`.
     */
    public readonly targetControls!: pulumi.Output<string[] | undefined>;
    /**
     * Evaluation period, in milliseconds (ms), during which any request against the target routing controls will fail.
     *
     * The following arguments are optional:
     */
    public readonly waitPeriodMs!: pulumi.Output<number>;

    /**
     * Create a SafetyRule resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: SafetyRuleArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: SafetyRuleArgs | SafetyRuleState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as SafetyRuleState | undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["assertedControls"] = state ? state.assertedControls : undefined;
            resourceInputs["controlPanelArn"] = state ? state.controlPanelArn : undefined;
            resourceInputs["gatingControls"] = state ? state.gatingControls : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["ruleConfig"] = state ? state.ruleConfig : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
            resourceInputs["targetControls"] = state ? state.targetControls : undefined;
            resourceInputs["waitPeriodMs"] = state ? state.waitPeriodMs : undefined;
        } else {
            const args = argsOrState as SafetyRuleArgs | undefined;
            if ((!args || args.controlPanelArn === undefined) && !opts.urn) {
                throw new Error("Missing required property 'controlPanelArn'");
            }
            if ((!args || args.ruleConfig === undefined) && !opts.urn) {
                throw new Error("Missing required property 'ruleConfig'");
            }
            if ((!args || args.waitPeriodMs === undefined) && !opts.urn) {
                throw new Error("Missing required property 'waitPeriodMs'");
            }
            resourceInputs["assertedControls"] = args ? args.assertedControls : undefined;
            resourceInputs["controlPanelArn"] = args ? args.controlPanelArn : undefined;
            resourceInputs["gatingControls"] = args ? args.gatingControls : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["ruleConfig"] = args ? args.ruleConfig : undefined;
            resourceInputs["targetControls"] = args ? args.targetControls : undefined;
            resourceInputs["waitPeriodMs"] = args ? args.waitPeriodMs : undefined;
            resourceInputs["arn"] = undefined /*out*/;
            resourceInputs["status"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(SafetyRule.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering SafetyRule resources.
 */
export interface SafetyRuleState {
    /**
     * ARN of the safety rule.
     */
    arn?: pulumi.Input<string>;
    /**
     * Routing controls that are part of transactions that are evaluated to determine if a request to change a routing control state is allowed.
     */
    assertedControls?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * ARN of the control panel in which this safety rule will reside.
     */
    controlPanelArn?: pulumi.Input<string>;
    /**
     * Gating controls for the new gating rule. That is, routing controls that are evaluated by the rule configuration that you specify.
     */
    gatingControls?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Name describing the safety rule.
     */
    name?: pulumi.Input<string>;
    /**
     * Configuration block for safety rule criteria. See below.
     */
    ruleConfig?: pulumi.Input<inputs.route53recoverycontrol.SafetyRuleRuleConfig>;
    /**
     * Status of the safety rule. `PENDING` when it is being created/updated, `PENDING_DELETION` when it is being deleted, and `DEPLOYED` otherwise.
     */
    status?: pulumi.Input<string>;
    /**
     * Routing controls that can only be set or unset if the specified `ruleConfig` evaluates to true for the specified `gatingControls`.
     */
    targetControls?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Evaluation period, in milliseconds (ms), during which any request against the target routing controls will fail.
     *
     * The following arguments are optional:
     */
    waitPeriodMs?: pulumi.Input<number>;
}

/**
 * The set of arguments for constructing a SafetyRule resource.
 */
export interface SafetyRuleArgs {
    /**
     * Routing controls that are part of transactions that are evaluated to determine if a request to change a routing control state is allowed.
     */
    assertedControls?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * ARN of the control panel in which this safety rule will reside.
     */
    controlPanelArn: pulumi.Input<string>;
    /**
     * Gating controls for the new gating rule. That is, routing controls that are evaluated by the rule configuration that you specify.
     */
    gatingControls?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Name describing the safety rule.
     */
    name?: pulumi.Input<string>;
    /**
     * Configuration block for safety rule criteria. See below.
     */
    ruleConfig: pulumi.Input<inputs.route53recoverycontrol.SafetyRuleRuleConfig>;
    /**
     * Routing controls that can only be set or unset if the specified `ruleConfig` evaluates to true for the specified `gatingControls`.
     */
    targetControls?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Evaluation period, in milliseconds (ms), during which any request against the target routing controls will fail.
     *
     * The following arguments are optional:
     */
    waitPeriodMs: pulumi.Input<number>;
}

// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Provides an AWS Config Remediation Configuration.
 *
 * > **Note:** Config Remediation Configuration requires an existing Config Rule to be present.
 *
 * ## Example Usage
 *
 * AWS managed rules can be used by setting the source owner to `AWS` and the source identifier to the name of the managed rule. More information about AWS managed rules can be found in the [AWS Config Developer Guide](https://docs.aws.amazon.com/config/latest/developerguide/evaluate-config_use-managed-rules.html).
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const _this = new aws.cfg.Rule("this", {
 *     name: "example",
 *     source: {
 *         owner: "AWS",
 *         sourceIdentifier: "S3_BUCKET_VERSIONING_ENABLED",
 *     },
 * });
 * const thisRemediationConfiguration = new aws.cfg.RemediationConfiguration("this", {
 *     configRuleName: _this.name,
 *     resourceType: "AWS::S3::Bucket",
 *     targetType: "SSM_DOCUMENT",
 *     targetId: "AWS-EnableS3BucketEncryption",
 *     targetVersion: "1",
 *     parameters: [
 *         {
 *             name: "AutomationAssumeRole",
 *             staticValue: "arn:aws:iam::875924563244:role/security_config",
 *         },
 *         {
 *             name: "BucketName",
 *             resourceValue: "RESOURCE_ID",
 *         },
 *         {
 *             name: "SSEAlgorithm",
 *             staticValue: "AES256",
 *         },
 *     ],
 *     automatic: true,
 *     maximumAutomaticAttempts: 10,
 *     retryAttemptSeconds: 600,
 *     executionControls: {
 *         ssmControls: {
 *             concurrentExecutionRatePercentage: 25,
 *             errorPercentage: 20,
 *         },
 *     },
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ## Import
 *
 * Using `pulumi import`, import Remediation Configurations using the name config_rule_name. For example:
 *
 * ```sh
 * $ pulumi import aws:cfg/remediationConfiguration:RemediationConfiguration this example
 * ```
 */
export class RemediationConfiguration extends pulumi.CustomResource {
    /**
     * Get an existing RemediationConfiguration resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: RemediationConfigurationState, opts?: pulumi.CustomResourceOptions): RemediationConfiguration {
        return new RemediationConfiguration(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:cfg/remediationConfiguration:RemediationConfiguration';

    /**
     * Returns true if the given object is an instance of RemediationConfiguration.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is RemediationConfiguration {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === RemediationConfiguration.__pulumiType;
    }

    /**
     * ARN of the Config Remediation Configuration.
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * Remediation is triggered automatically if `true`.
     */
    public readonly automatic!: pulumi.Output<boolean | undefined>;
    /**
     * Name of the AWS Config rule.
     */
    public readonly configRuleName!: pulumi.Output<string>;
    /**
     * Configuration block for execution controls. See below.
     */
    public readonly executionControls!: pulumi.Output<outputs.cfg.RemediationConfigurationExecutionControls | undefined>;
    /**
     * Maximum number of failed attempts for auto-remediation. If you do not select a number, the default is 5.
     */
    public readonly maximumAutomaticAttempts!: pulumi.Output<number | undefined>;
    /**
     * Can be specified multiple times for each parameter. Each parameter block supports arguments below.
     */
    public readonly parameters!: pulumi.Output<outputs.cfg.RemediationConfigurationParameter[] | undefined>;
    /**
     * Type of resource.
     */
    public readonly resourceType!: pulumi.Output<string | undefined>;
    /**
     * Maximum time in seconds that AWS Config runs auto-remediation. If you do not select a number, the default is 60 seconds.
     */
    public readonly retryAttemptSeconds!: pulumi.Output<number | undefined>;
    /**
     * Target ID is the name of the public document.
     */
    public readonly targetId!: pulumi.Output<string>;
    /**
     * Type of the target. Target executes remediation. For example, SSM document.
     *
     * The following arguments are optional:
     */
    public readonly targetType!: pulumi.Output<string>;
    /**
     * Version of the target. For example, version of the SSM document
     */
    public readonly targetVersion!: pulumi.Output<string | undefined>;

    /**
     * Create a RemediationConfiguration resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: RemediationConfigurationArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: RemediationConfigurationArgs | RemediationConfigurationState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as RemediationConfigurationState | undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["automatic"] = state ? state.automatic : undefined;
            resourceInputs["configRuleName"] = state ? state.configRuleName : undefined;
            resourceInputs["executionControls"] = state ? state.executionControls : undefined;
            resourceInputs["maximumAutomaticAttempts"] = state ? state.maximumAutomaticAttempts : undefined;
            resourceInputs["parameters"] = state ? state.parameters : undefined;
            resourceInputs["resourceType"] = state ? state.resourceType : undefined;
            resourceInputs["retryAttemptSeconds"] = state ? state.retryAttemptSeconds : undefined;
            resourceInputs["targetId"] = state ? state.targetId : undefined;
            resourceInputs["targetType"] = state ? state.targetType : undefined;
            resourceInputs["targetVersion"] = state ? state.targetVersion : undefined;
        } else {
            const args = argsOrState as RemediationConfigurationArgs | undefined;
            if ((!args || args.configRuleName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'configRuleName'");
            }
            if ((!args || args.targetId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'targetId'");
            }
            if ((!args || args.targetType === undefined) && !opts.urn) {
                throw new Error("Missing required property 'targetType'");
            }
            resourceInputs["automatic"] = args ? args.automatic : undefined;
            resourceInputs["configRuleName"] = args ? args.configRuleName : undefined;
            resourceInputs["executionControls"] = args ? args.executionControls : undefined;
            resourceInputs["maximumAutomaticAttempts"] = args ? args.maximumAutomaticAttempts : undefined;
            resourceInputs["parameters"] = args ? args.parameters : undefined;
            resourceInputs["resourceType"] = args ? args.resourceType : undefined;
            resourceInputs["retryAttemptSeconds"] = args ? args.retryAttemptSeconds : undefined;
            resourceInputs["targetId"] = args ? args.targetId : undefined;
            resourceInputs["targetType"] = args ? args.targetType : undefined;
            resourceInputs["targetVersion"] = args ? args.targetVersion : undefined;
            resourceInputs["arn"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(RemediationConfiguration.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering RemediationConfiguration resources.
 */
export interface RemediationConfigurationState {
    /**
     * ARN of the Config Remediation Configuration.
     */
    arn?: pulumi.Input<string>;
    /**
     * Remediation is triggered automatically if `true`.
     */
    automatic?: pulumi.Input<boolean>;
    /**
     * Name of the AWS Config rule.
     */
    configRuleName?: pulumi.Input<string>;
    /**
     * Configuration block for execution controls. See below.
     */
    executionControls?: pulumi.Input<inputs.cfg.RemediationConfigurationExecutionControls>;
    /**
     * Maximum number of failed attempts for auto-remediation. If you do not select a number, the default is 5.
     */
    maximumAutomaticAttempts?: pulumi.Input<number>;
    /**
     * Can be specified multiple times for each parameter. Each parameter block supports arguments below.
     */
    parameters?: pulumi.Input<pulumi.Input<inputs.cfg.RemediationConfigurationParameter>[]>;
    /**
     * Type of resource.
     */
    resourceType?: pulumi.Input<string>;
    /**
     * Maximum time in seconds that AWS Config runs auto-remediation. If you do not select a number, the default is 60 seconds.
     */
    retryAttemptSeconds?: pulumi.Input<number>;
    /**
     * Target ID is the name of the public document.
     */
    targetId?: pulumi.Input<string>;
    /**
     * Type of the target. Target executes remediation. For example, SSM document.
     *
     * The following arguments are optional:
     */
    targetType?: pulumi.Input<string>;
    /**
     * Version of the target. For example, version of the SSM document
     */
    targetVersion?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a RemediationConfiguration resource.
 */
export interface RemediationConfigurationArgs {
    /**
     * Remediation is triggered automatically if `true`.
     */
    automatic?: pulumi.Input<boolean>;
    /**
     * Name of the AWS Config rule.
     */
    configRuleName: pulumi.Input<string>;
    /**
     * Configuration block for execution controls. See below.
     */
    executionControls?: pulumi.Input<inputs.cfg.RemediationConfigurationExecutionControls>;
    /**
     * Maximum number of failed attempts for auto-remediation. If you do not select a number, the default is 5.
     */
    maximumAutomaticAttempts?: pulumi.Input<number>;
    /**
     * Can be specified multiple times for each parameter. Each parameter block supports arguments below.
     */
    parameters?: pulumi.Input<pulumi.Input<inputs.cfg.RemediationConfigurationParameter>[]>;
    /**
     * Type of resource.
     */
    resourceType?: pulumi.Input<string>;
    /**
     * Maximum time in seconds that AWS Config runs auto-remediation. If you do not select a number, the default is 60 seconds.
     */
    retryAttemptSeconds?: pulumi.Input<number>;
    /**
     * Target ID is the name of the public document.
     */
    targetId: pulumi.Input<string>;
    /**
     * Type of the target. Target executes remediation. For example, SSM document.
     *
     * The following arguments are optional:
     */
    targetType: pulumi.Input<string>;
    /**
     * Version of the target. For example, version of the SSM document
     */
    targetVersion?: pulumi.Input<string>;
}

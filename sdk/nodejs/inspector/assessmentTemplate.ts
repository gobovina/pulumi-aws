// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Provides an Inspector Classic Assessment Template
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.inspector.AssessmentTemplate("example", {
 *     targetArn: aws_inspector_assessment_target.example.arn,
 *     duration: 3600,
 *     rulesPackageArns: [
 *         "arn:aws:inspector:us-west-2:758058086616:rulespackage/0-9hgA516p",
 *         "arn:aws:inspector:us-west-2:758058086616:rulespackage/0-H5hpSawc",
 *         "arn:aws:inspector:us-west-2:758058086616:rulespackage/0-JJOtZiqQ",
 *         "arn:aws:inspector:us-west-2:758058086616:rulespackage/0-vg5GGHSD",
 *     ],
 *     eventSubscriptions: [{
 *         event: "ASSESSMENT_RUN_COMPLETED",
 *         topicArn: aws_sns_topic.example.arn,
 *     }],
 * });
 * ```
 *
 * ## Import
 *
 * Using `pulumi import`, import `aws_inspector_assessment_template` using the template assessment ARN. For example:
 *
 * ```sh
 *  $ pulumi import aws:inspector/assessmentTemplate:AssessmentTemplate example arn:aws:inspector:us-west-2:123456789012:target/0-9IaAzhGR/template/0-WEcjR8CH
 * ```
 */
export class AssessmentTemplate extends pulumi.CustomResource {
    /**
     * Get an existing AssessmentTemplate resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AssessmentTemplateState, opts?: pulumi.CustomResourceOptions): AssessmentTemplate {
        return new AssessmentTemplate(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:inspector/assessmentTemplate:AssessmentTemplate';

    /**
     * Returns true if the given object is an instance of AssessmentTemplate.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is AssessmentTemplate {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === AssessmentTemplate.__pulumiType;
    }

    /**
     * The template assessment ARN.
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * The duration of the inspector run.
     */
    public readonly duration!: pulumi.Output<number>;
    /**
     * A block that enables sending notifications about a specified assessment template event to a designated SNS topic. See Event Subscriptions for details.
     */
    public readonly eventSubscriptions!: pulumi.Output<outputs.inspector.AssessmentTemplateEventSubscription[] | undefined>;
    /**
     * The name of the assessment template.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The rules to be used during the run.
     */
    public readonly rulesPackageArns!: pulumi.Output<string[]>;
    /**
     * Key-value map of tags for the Inspector assessment template. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     */
    public /*out*/ readonly tagsAll!: pulumi.Output<{[key: string]: string}>;
    /**
     * The assessment target ARN to attach the template to.
     */
    public readonly targetArn!: pulumi.Output<string>;

    /**
     * Create a AssessmentTemplate resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: AssessmentTemplateArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AssessmentTemplateArgs | AssessmentTemplateState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as AssessmentTemplateState | undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["duration"] = state ? state.duration : undefined;
            resourceInputs["eventSubscriptions"] = state ? state.eventSubscriptions : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["rulesPackageArns"] = state ? state.rulesPackageArns : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tagsAll"] = state ? state.tagsAll : undefined;
            resourceInputs["targetArn"] = state ? state.targetArn : undefined;
        } else {
            const args = argsOrState as AssessmentTemplateArgs | undefined;
            if ((!args || args.duration === undefined) && !opts.urn) {
                throw new Error("Missing required property 'duration'");
            }
            if ((!args || args.rulesPackageArns === undefined) && !opts.urn) {
                throw new Error("Missing required property 'rulesPackageArns'");
            }
            if ((!args || args.targetArn === undefined) && !opts.urn) {
                throw new Error("Missing required property 'targetArn'");
            }
            resourceInputs["duration"] = args ? args.duration : undefined;
            resourceInputs["eventSubscriptions"] = args ? args.eventSubscriptions : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["rulesPackageArns"] = args ? args.rulesPackageArns : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["targetArn"] = args ? args.targetArn : undefined;
            resourceInputs["arn"] = undefined /*out*/;
            resourceInputs["tagsAll"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(AssessmentTemplate.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering AssessmentTemplate resources.
 */
export interface AssessmentTemplateState {
    /**
     * The template assessment ARN.
     */
    arn?: pulumi.Input<string>;
    /**
     * The duration of the inspector run.
     */
    duration?: pulumi.Input<number>;
    /**
     * A block that enables sending notifications about a specified assessment template event to a designated SNS topic. See Event Subscriptions for details.
     */
    eventSubscriptions?: pulumi.Input<pulumi.Input<inputs.inspector.AssessmentTemplateEventSubscription>[]>;
    /**
     * The name of the assessment template.
     */
    name?: pulumi.Input<string>;
    /**
     * The rules to be used during the run.
     */
    rulesPackageArns?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Key-value map of tags for the Inspector assessment template. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     */
    tagsAll?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The assessment target ARN to attach the template to.
     */
    targetArn?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a AssessmentTemplate resource.
 */
export interface AssessmentTemplateArgs {
    /**
     * The duration of the inspector run.
     */
    duration: pulumi.Input<number>;
    /**
     * A block that enables sending notifications about a specified assessment template event to a designated SNS topic. See Event Subscriptions for details.
     */
    eventSubscriptions?: pulumi.Input<pulumi.Input<inputs.inspector.AssessmentTemplateEventSubscription>[]>;
    /**
     * The name of the assessment template.
     */
    name?: pulumi.Input<string>;
    /**
     * The rules to be used during the run.
     */
    rulesPackageArns: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Key-value map of tags for the Inspector assessment template. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The assessment target ARN to attach the template to.
     */
    targetArn: pulumi.Input<string>;
}

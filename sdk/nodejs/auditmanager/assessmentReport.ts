// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Resource for managing an AWS Audit Manager Assessment Report.
 *
 * ## Example Usage
 * ### Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const test = new aws.auditmanager.AssessmentReport("test", {assessmentId: aws_auditmanager_assessment.test.id});
 * ```
 *
 * ## Import
 *
 * Using `pulumi import`, import Audit Manager Assessment Reports using the assessment report `id`. For example:
 *
 * ```sh
 *  $ pulumi import aws:auditmanager/assessmentReport:AssessmentReport example abc123-de45
 * ```
 */
export class AssessmentReport extends pulumi.CustomResource {
    /**
     * Get an existing AssessmentReport resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AssessmentReportState, opts?: pulumi.CustomResourceOptions): AssessmentReport {
        return new AssessmentReport(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:auditmanager/assessmentReport:AssessmentReport';

    /**
     * Returns true if the given object is an instance of AssessmentReport.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is AssessmentReport {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === AssessmentReport.__pulumiType;
    }

    /**
     * Unique identifier of the assessment to create the report from.
     *
     * The following arguments are optional:
     */
    public readonly assessmentId!: pulumi.Output<string>;
    /**
     * Name of the user who created the assessment report.
     */
    public /*out*/ readonly author!: pulumi.Output<string>;
    /**
     * Description of the assessment report.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Name of the assessment report.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Current status of the specified assessment report. Valid values are `COMPLETE`, `IN_PROGRESS`, and `FAILED`.
     */
    public /*out*/ readonly status!: pulumi.Output<string>;

    /**
     * Create a AssessmentReport resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: AssessmentReportArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AssessmentReportArgs | AssessmentReportState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as AssessmentReportState | undefined;
            resourceInputs["assessmentId"] = state ? state.assessmentId : undefined;
            resourceInputs["author"] = state ? state.author : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
        } else {
            const args = argsOrState as AssessmentReportArgs | undefined;
            if ((!args || args.assessmentId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'assessmentId'");
            }
            resourceInputs["assessmentId"] = args ? args.assessmentId : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["author"] = undefined /*out*/;
            resourceInputs["status"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(AssessmentReport.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering AssessmentReport resources.
 */
export interface AssessmentReportState {
    /**
     * Unique identifier of the assessment to create the report from.
     *
     * The following arguments are optional:
     */
    assessmentId?: pulumi.Input<string>;
    /**
     * Name of the user who created the assessment report.
     */
    author?: pulumi.Input<string>;
    /**
     * Description of the assessment report.
     */
    description?: pulumi.Input<string>;
    /**
     * Name of the assessment report.
     */
    name?: pulumi.Input<string>;
    /**
     * Current status of the specified assessment report. Valid values are `COMPLETE`, `IN_PROGRESS`, and `FAILED`.
     */
    status?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a AssessmentReport resource.
 */
export interface AssessmentReportArgs {
    /**
     * Unique identifier of the assessment to create the report from.
     *
     * The following arguments are optional:
     */
    assessmentId: pulumi.Input<string>;
    /**
     * Description of the assessment report.
     */
    description?: pulumi.Input<string>;
    /**
     * Name of the assessment report.
     */
    name?: pulumi.Input<string>;
}

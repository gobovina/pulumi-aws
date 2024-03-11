// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * The Amazon Inspector Classic Rules Packages data source allows access to the list of AWS
 * Inspector Rules Packages which can be used by Amazon Inspector Classic within the region
 * configured in the provider.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * // Declare the data source
 * const rules = aws.inspector.getRulesPackages({});
 * // e.g., Use in aws_inspector_assessment_template
 * const group = new aws.inspector.ResourceGroup("group", {tags: {
 *     test: "test",
 * }});
 * const assessment = new aws.inspector.AssessmentTarget("assessment", {
 *     name: "test",
 *     resourceGroupArn: group.arn,
 * });
 * const assessmentAssessmentTemplate = new aws.inspector.AssessmentTemplate("assessment", {
 *     name: "Test",
 *     targetArn: assessment.arn,
 *     duration: 60,
 *     rulesPackageArns: rules.then(rules => rules.arns),
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getRulesPackages(opts?: pulumi.InvokeOptions): Promise<GetRulesPackagesResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("aws:inspector/getRulesPackages:getRulesPackages", {
    }, opts);
}

/**
 * A collection of values returned by getRulesPackages.
 */
export interface GetRulesPackagesResult {
    /**
     * List of the Amazon Inspector Classic Rules Packages arns available in the AWS region.
     */
    readonly arns: string[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
}
/**
 * The Amazon Inspector Classic Rules Packages data source allows access to the list of AWS
 * Inspector Rules Packages which can be used by Amazon Inspector Classic within the region
 * configured in the provider.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * // Declare the data source
 * const rules = aws.inspector.getRulesPackages({});
 * // e.g., Use in aws_inspector_assessment_template
 * const group = new aws.inspector.ResourceGroup("group", {tags: {
 *     test: "test",
 * }});
 * const assessment = new aws.inspector.AssessmentTarget("assessment", {
 *     name: "test",
 *     resourceGroupArn: group.arn,
 * });
 * const assessmentAssessmentTemplate = new aws.inspector.AssessmentTemplate("assessment", {
 *     name: "Test",
 *     targetArn: assessment.arn,
 *     duration: 60,
 *     rulesPackageArns: rules.then(rules => rules.arns),
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getRulesPackagesOutput(opts?: pulumi.InvokeOptions): pulumi.Output<GetRulesPackagesResult> {
    return pulumi.output(getRulesPackages(opts))
}

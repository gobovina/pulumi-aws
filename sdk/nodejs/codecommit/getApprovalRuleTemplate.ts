// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides details about a specific CodeCommit Approval Rule Template.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = aws.codecommit.getApprovalRuleTemplate({
 *     name: "MyExampleApprovalRuleTemplate",
 * });
 * ```
 */
export function getApprovalRuleTemplate(args: GetApprovalRuleTemplateArgs, opts?: pulumi.InvokeOptions): Promise<GetApprovalRuleTemplateResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("aws:codecommit/getApprovalRuleTemplate:getApprovalRuleTemplate", {
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getApprovalRuleTemplate.
 */
export interface GetApprovalRuleTemplateArgs {
    /**
     * Name for the approval rule template. This needs to be less than 100 characters.
     */
    name: string;
}

/**
 * A collection of values returned by getApprovalRuleTemplate.
 */
export interface GetApprovalRuleTemplateResult {
    /**
     * The ID of the approval rule template.
     */
    readonly approvalRuleTemplateId: string;
    /**
     * Content of the approval rule template.
     */
    readonly content: string;
    /**
     * Date the approval rule template was created, in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8).
     */
    readonly creationDate: string;
    /**
     * Description of the approval rule template.
     */
    readonly description: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Date the approval rule template was most recently changed, in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8).
     */
    readonly lastModifiedDate: string;
    /**
     * ARN of the user who made the most recent changes to the approval rule template.
     */
    readonly lastModifiedUser: string;
    readonly name: string;
    /**
     * SHA-256 hash signature for the content of the approval rule template.
     */
    readonly ruleContentSha256: string;
}
/**
 * Provides details about a specific CodeCommit Approval Rule Template.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = aws.codecommit.getApprovalRuleTemplate({
 *     name: "MyExampleApprovalRuleTemplate",
 * });
 * ```
 */
export function getApprovalRuleTemplateOutput(args: GetApprovalRuleTemplateOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetApprovalRuleTemplateResult> {
    return pulumi.output(args).apply((a: any) => getApprovalRuleTemplate(a, opts))
}

/**
 * A collection of arguments for invoking getApprovalRuleTemplate.
 */
export interface GetApprovalRuleTemplateOutputArgs {
    /**
     * Name for the approval rule template. This needs to be less than 100 characters.
     */
    name: pulumi.Input<string>;
}

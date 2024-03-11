// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * `aws.wafregional.Rule` Retrieves a WAF Regional Rule Resource Id.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = aws.wafregional.getRule({
 *     name: "tfWAFRegionalRule",
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getRule(args: GetRuleArgs, opts?: pulumi.InvokeOptions): Promise<GetRuleResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("aws:wafregional/getRule:getRule", {
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getRule.
 */
export interface GetRuleArgs {
    /**
     * Name of the WAF Regional rule.
     */
    name: string;
}

/**
 * A collection of values returned by getRule.
 */
export interface GetRuleResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly name: string;
}
/**
 * `aws.wafregional.Rule` Retrieves a WAF Regional Rule Resource Id.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = aws.wafregional.getRule({
 *     name: "tfWAFRegionalRule",
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getRuleOutput(args: GetRuleOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetRuleResult> {
    return pulumi.output(args).apply((a: any) => getRule(a, opts))
}

/**
 * A collection of arguments for invoking getRule.
 */
export interface GetRuleOutputArgs {
    /**
     * Name of the WAF Regional rule.
     */
    name: pulumi.Input<string>;
}

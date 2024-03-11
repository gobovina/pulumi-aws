// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * `aws.waf.RateBasedRule` Retrieves a WAF Rate Based Rule Resource Id.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = aws.waf.getRateBasedRule({
 *     name: "tfWAFRateBasedRule",
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getRateBasedRule(args: GetRateBasedRuleArgs, opts?: pulumi.InvokeOptions): Promise<GetRateBasedRuleResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("aws:waf/getRateBasedRule:getRateBasedRule", {
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getRateBasedRule.
 */
export interface GetRateBasedRuleArgs {
    /**
     * Name of the WAF rate based rule.
     */
    name: string;
}

/**
 * A collection of values returned by getRateBasedRule.
 */
export interface GetRateBasedRuleResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly name: string;
}
/**
 * `aws.waf.RateBasedRule` Retrieves a WAF Rate Based Rule Resource Id.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = aws.waf.getRateBasedRule({
 *     name: "tfWAFRateBasedRule",
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getRateBasedRuleOutput(args: GetRateBasedRuleOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetRateBasedRuleResult> {
    return pulumi.output(args).apply((a: any) => getRateBasedRule(a, opts))
}

/**
 * A collection of arguments for invoking getRateBasedRule.
 */
export interface GetRateBasedRuleOutputArgs {
    /**
     * Name of the WAF rate based rule.
     */
    name: pulumi.Input<string>;
}

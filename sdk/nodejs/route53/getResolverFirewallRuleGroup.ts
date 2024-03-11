// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * `aws.route53.ResolverFirewallRuleGroup` Retrieves the specified firewall rule group.
 *
 * This data source allows to retrieve details about a specific a Route 53 Resolver DNS Firewall rule group.
 *
 * ## Example Usage
 *
 * The following example shows how to get a firewall rule group from its ID.
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = aws.route53.getResolverFirewallRuleGroup({
 *     firewallRuleGroupId: "rslvr-frg-example",
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getResolverFirewallRuleGroup(args: GetResolverFirewallRuleGroupArgs, opts?: pulumi.InvokeOptions): Promise<GetResolverFirewallRuleGroupResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("aws:route53/getResolverFirewallRuleGroup:getResolverFirewallRuleGroup", {
        "firewallRuleGroupId": args.firewallRuleGroupId,
    }, opts);
}

/**
 * A collection of arguments for invoking getResolverFirewallRuleGroup.
 */
export interface GetResolverFirewallRuleGroupArgs {
    /**
     * The ID of the rule group.
     *
     * The following attribute is additionally exported:
     */
    firewallRuleGroupId: string;
}

/**
 * A collection of values returned by getResolverFirewallRuleGroup.
 */
export interface GetResolverFirewallRuleGroupResult {
    readonly arn: string;
    readonly creationTime: string;
    readonly creatorRequestId: string;
    readonly firewallRuleGroupId: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly modificationTime: string;
    readonly name: string;
    readonly ownerId: string;
    readonly ruleCount: number;
    readonly shareStatus: string;
    readonly status: string;
    readonly statusMessage: string;
}
/**
 * `aws.route53.ResolverFirewallRuleGroup` Retrieves the specified firewall rule group.
 *
 * This data source allows to retrieve details about a specific a Route 53 Resolver DNS Firewall rule group.
 *
 * ## Example Usage
 *
 * The following example shows how to get a firewall rule group from its ID.
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = aws.route53.getResolverFirewallRuleGroup({
 *     firewallRuleGroupId: "rslvr-frg-example",
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getResolverFirewallRuleGroupOutput(args: GetResolverFirewallRuleGroupOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetResolverFirewallRuleGroupResult> {
    return pulumi.output(args).apply((a: any) => getResolverFirewallRuleGroup(a, opts))
}

/**
 * A collection of arguments for invoking getResolverFirewallRuleGroup.
 */
export interface GetResolverFirewallRuleGroupOutputArgs {
    /**
     * The ID of the rule group.
     *
     * The following attribute is additionally exported:
     */
    firewallRuleGroupId: pulumi.Input<string>;
}

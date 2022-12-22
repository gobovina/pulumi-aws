// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * `aws.route53.getResolverRules` provides details about a set of Route53 Resolver rules.
 *
 * ## Example Usage
 * ### Retrieving the default resolver rule
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = aws.route53.getResolverRules({
 *     ownerId: "Route 53 Resolver",
 *     ruleType: "RECURSIVE",
 *     shareStatus: "NOT_SHARED",
 * });
 * ```
 * ### Retrieving forward rules shared with me
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = aws.route53.getResolverRules({
 *     ruleType: "FORWARD",
 *     shareStatus: "SHARED_WITH_ME",
 * });
 * ```
 * ### Retrieving rules by name regex
 *
 * Resolver rules whose name contains `abc`.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = aws.route53.getResolverRules({
 *     nameRegex: ".*abc.*",
 * });
 * ```
 */
export function getResolverRules(args?: GetResolverRulesArgs, opts?: pulumi.InvokeOptions): Promise<GetResolverRulesResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("aws:route53/getResolverRules:getResolverRules", {
        "nameRegex": args.nameRegex,
        "ownerId": args.ownerId,
        "resolverEndpointId": args.resolverEndpointId,
        "ruleType": args.ruleType,
        "shareStatus": args.shareStatus,
    }, opts);
}

/**
 * A collection of arguments for invoking getResolverRules.
 */
export interface GetResolverRulesArgs {
    /**
     * Regex string to filter resolver rule names.
     * The filtering is done locally, so could have a performance impact if the result is large.
     * This argument should be used along with other arguments to limit the number of results returned.
     */
    nameRegex?: string;
    /**
     * When the desired resolver rules are shared with another AWS account, the account ID of the account that the rules are shared with.
     */
    ownerId?: string;
    /**
     * ID of the outbound resolver endpoint for the desired resolver rules.
     */
    resolverEndpointId?: string;
    /**
     * Rule type of the desired resolver rules. Valid values are `FORWARD`, `SYSTEM` and `RECURSIVE`.
     */
    ruleType?: string;
    /**
     * Whether the desired resolver rules are shared and, if so, whether the current account is sharing the rules with another account, or another account is sharing the rules with the current account. Valid values are `NOT_SHARED`, `SHARED_BY_ME` or `SHARED_WITH_ME`
     */
    shareStatus?: string;
}

/**
 * A collection of values returned by getResolverRules.
 */
export interface GetResolverRulesResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly nameRegex?: string;
    readonly ownerId?: string;
    readonly resolverEndpointId?: string;
    /**
     * IDs of the matched resolver rules.
     */
    readonly resolverRuleIds: string[];
    readonly ruleType?: string;
    readonly shareStatus?: string;
}
/**
 * `aws.route53.getResolverRules` provides details about a set of Route53 Resolver rules.
 *
 * ## Example Usage
 * ### Retrieving the default resolver rule
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = aws.route53.getResolverRules({
 *     ownerId: "Route 53 Resolver",
 *     ruleType: "RECURSIVE",
 *     shareStatus: "NOT_SHARED",
 * });
 * ```
 * ### Retrieving forward rules shared with me
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = aws.route53.getResolverRules({
 *     ruleType: "FORWARD",
 *     shareStatus: "SHARED_WITH_ME",
 * });
 * ```
 * ### Retrieving rules by name regex
 *
 * Resolver rules whose name contains `abc`.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = aws.route53.getResolverRules({
 *     nameRegex: ".*abc.*",
 * });
 * ```
 */
export function getResolverRulesOutput(args?: GetResolverRulesOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetResolverRulesResult> {
    return pulumi.output(args).apply((a: any) => getResolverRules(a, opts))
}

/**
 * A collection of arguments for invoking getResolverRules.
 */
export interface GetResolverRulesOutputArgs {
    /**
     * Regex string to filter resolver rule names.
     * The filtering is done locally, so could have a performance impact if the result is large.
     * This argument should be used along with other arguments to limit the number of results returned.
     */
    nameRegex?: pulumi.Input<string>;
    /**
     * When the desired resolver rules are shared with another AWS account, the account ID of the account that the rules are shared with.
     */
    ownerId?: pulumi.Input<string>;
    /**
     * ID of the outbound resolver endpoint for the desired resolver rules.
     */
    resolverEndpointId?: pulumi.Input<string>;
    /**
     * Rule type of the desired resolver rules. Valid values are `FORWARD`, `SYSTEM` and `RECURSIVE`.
     */
    ruleType?: pulumi.Input<string>;
    /**
     * Whether the desired resolver rules are shared and, if so, whether the current account is sharing the rules with another account, or another account is sharing the rules with the current account. Valid values are `NOT_SHARED`, `SHARED_BY_ME` or `SHARED_WITH_ME`
     */
    shareStatus?: pulumi.Input<string>;
}

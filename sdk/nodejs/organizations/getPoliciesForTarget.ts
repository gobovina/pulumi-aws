// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Data source for managing an AWS Organizations Policies For Target.
 *
 * ## Example Usage
 * ### Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * function notImplemented(message: string) {
 *     throw new Error(message);
 * }
 *
 * const example = aws.organizations.getOrganization({});
 * const exampleGetPoliciesForTarget = example.then(example => aws.organizations.getPoliciesForTarget({
 *     targetId: example.roots?.[0]?.id,
 *     filter: "SERVICE_CONTROL_POLICY",
 * }));
 * const exampleGetPolicy = .reduce((__obj, [, ]) => ({ ...__obj, [__key]: aws.organizations.getPolicy({
 *     policyId: __value,
 * }) }));
 * ```
 */
export function getPoliciesForTarget(args: GetPoliciesForTargetArgs, opts?: pulumi.InvokeOptions): Promise<GetPoliciesForTargetResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("aws:organizations/getPoliciesForTarget:getPoliciesForTarget", {
        "filter": args.filter,
        "targetId": args.targetId,
    }, opts);
}

/**
 * A collection of arguments for invoking getPoliciesForTarget.
 */
export interface GetPoliciesForTargetArgs {
    /**
     * Must supply one of the 4 different policy filters for a target (SERVICE_CONTROL_POLICY | TAG_POLICY | BACKUP_POLICY | AISERVICES_OPT_OUT_POLICY)
     */
    filter: string;
    /**
     * The root (string that begins with "r-" followed by 4-32 lowercase letters or digits), account (12 digit string), or Organizational Unit (string starting with "ou-" followed by 4-32 lowercase letters or digits. This string is followed by a second "-" dash and from 8-32 additional lowercase letters or digits.)
     */
    targetId: string;
}

/**
 * A collection of values returned by getPoliciesForTarget.
 */
export interface GetPoliciesForTargetResult {
    readonly filter: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * List of all the policy ids found.
     */
    readonly ids: string[];
    readonly targetId: string;
}
/**
 * Data source for managing an AWS Organizations Policies For Target.
 *
 * ## Example Usage
 * ### Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * function notImplemented(message: string) {
 *     throw new Error(message);
 * }
 *
 * const example = aws.organizations.getOrganization({});
 * const exampleGetPoliciesForTarget = example.then(example => aws.organizations.getPoliciesForTarget({
 *     targetId: example.roots?.[0]?.id,
 *     filter: "SERVICE_CONTROL_POLICY",
 * }));
 * const exampleGetPolicy = .reduce((__obj, [, ]) => ({ ...__obj, [__key]: aws.organizations.getPolicy({
 *     policyId: __value,
 * }) }));
 * ```
 */
export function getPoliciesForTargetOutput(args: GetPoliciesForTargetOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetPoliciesForTargetResult> {
    return pulumi.output(args).apply((a: any) => getPoliciesForTarget(a, opts))
}

/**
 * A collection of arguments for invoking getPoliciesForTarget.
 */
export interface GetPoliciesForTargetOutputArgs {
    /**
     * Must supply one of the 4 different policy filters for a target (SERVICE_CONTROL_POLICY | TAG_POLICY | BACKUP_POLICY | AISERVICES_OPT_OUT_POLICY)
     */
    filter: pulumi.Input<string>;
    /**
     * The root (string that begins with "r-" followed by 4-32 lowercase letters or digits), account (12 digit string), or Organizational Unit (string starting with "ou-" followed by 4-32 lowercase letters or digits. This string is followed by a second "-" dash and from 8-32 additional lowercase letters or digits.)
     */
    targetId: pulumi.Input<string>;
}

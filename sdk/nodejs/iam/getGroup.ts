// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * This data source can be used to fetch information about a specific
 * IAM group. By using this data source, you can reference IAM group
 * properties without having to hard code ARNs as input.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = aws.iam.getGroup({
 *     groupName: "an_example_group_name",
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getGroup(args: GetGroupArgs, opts?: pulumi.InvokeOptions): Promise<GetGroupResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("aws:iam/getGroup:getGroup", {
        "groupName": args.groupName,
    }, opts);
}

/**
 * A collection of arguments for invoking getGroup.
 */
export interface GetGroupArgs {
    /**
     * Friendly IAM group name to match.
     */
    groupName: string;
}

/**
 * A collection of values returned by getGroup.
 */
export interface GetGroupResult {
    /**
     * User ARN.
     */
    readonly arn: string;
    /**
     * Stable and unique string identifying the group.
     */
    readonly groupId: string;
    readonly groupName: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Path to the IAM user.
     */
    readonly path: string;
    /**
     * List of objects containing group member information. See below.
     */
    readonly users: outputs.iam.GetGroupUser[];
}
/**
 * This data source can be used to fetch information about a specific
 * IAM group. By using this data source, you can reference IAM group
 * properties without having to hard code ARNs as input.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = aws.iam.getGroup({
 *     groupName: "an_example_group_name",
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getGroupOutput(args: GetGroupOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetGroupResult> {
    return pulumi.output(args).apply((a: any) => getGroup(a, opts))
}

/**
 * A collection of arguments for invoking getGroup.
 */
export interface GetGroupOutputArgs {
    /**
     * Friendly IAM group name to match.
     */
    groupName: pulumi.Input<string>;
}

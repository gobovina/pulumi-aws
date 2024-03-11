// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * This data source can be used to fetch information about a specific
 * QuickSight group. By using this data source, you can reference QuickSight group
 * properties without having to hard code ARNs or unique IDs as input.
 *
 * ## Example Usage
 *
 * ### Basic Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = aws.quicksight.getQuicksightGroup({
 *     groupName: "example",
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getQuicksightGroup(args: GetQuicksightGroupArgs, opts?: pulumi.InvokeOptions): Promise<GetQuicksightGroupResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("aws:quicksight/getQuicksightGroup:getQuicksightGroup", {
        "awsAccountId": args.awsAccountId,
        "groupName": args.groupName,
        "namespace": args.namespace,
    }, opts);
}

/**
 * A collection of arguments for invoking getQuicksightGroup.
 */
export interface GetQuicksightGroupArgs {
    /**
     * AWS account ID.
     */
    awsAccountId?: string;
    /**
     * The name of the group that you want to match.
     *
     * The following arguments are optional:
     */
    groupName: string;
    /**
     * QuickSight namespace. Defaults to `default`.
     */
    namespace?: string;
}

/**
 * A collection of values returned by getQuicksightGroup.
 */
export interface GetQuicksightGroupResult {
    /**
     * The Amazon Resource Name (ARN) for the group.
     */
    readonly arn: string;
    readonly awsAccountId: string;
    /**
     * The group description.
     */
    readonly description: string;
    readonly groupName: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly namespace?: string;
    /**
     * The principal ID of the group.
     */
    readonly principalId: string;
}
/**
 * This data source can be used to fetch information about a specific
 * QuickSight group. By using this data source, you can reference QuickSight group
 * properties without having to hard code ARNs or unique IDs as input.
 *
 * ## Example Usage
 *
 * ### Basic Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = aws.quicksight.getQuicksightGroup({
 *     groupName: "example",
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getQuicksightGroupOutput(args: GetQuicksightGroupOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetQuicksightGroupResult> {
    return pulumi.output(args).apply((a: any) => getQuicksightGroup(a, opts))
}

/**
 * A collection of arguments for invoking getQuicksightGroup.
 */
export interface GetQuicksightGroupOutputArgs {
    /**
     * AWS account ID.
     */
    awsAccountId?: pulumi.Input<string>;
    /**
     * The name of the group that you want to match.
     *
     * The following arguments are optional:
     */
    groupName: pulumi.Input<string>;
    /**
     * QuickSight namespace. Defaults to `default`.
     */
    namespace?: pulumi.Input<string>;
}

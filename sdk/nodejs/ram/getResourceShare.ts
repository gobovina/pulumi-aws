// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * `aws.ram.ResourceShare` Retrieve information about a RAM Resource Share.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = aws.ram.getResourceShare({
 *     name: "example",
 *     resourceOwner: "SELF",
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ## Search by filters
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const tagFilter = aws.ram.getResourceShare({
 *     name: "MyResourceName",
 *     resourceOwner: "SELF",
 *     filters: [{
 *         name: "NameOfTag",
 *         values: ["exampleNameTagValue"],
 *     }],
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getResourceShare(args: GetResourceShareArgs, opts?: pulumi.InvokeOptions): Promise<GetResourceShareResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("aws:ram/getResourceShare:getResourceShare", {
        "filters": args.filters,
        "name": args.name,
        "resourceOwner": args.resourceOwner,
        "resourceShareStatus": args.resourceShareStatus,
        "tags": args.tags,
    }, opts);
}

/**
 * A collection of arguments for invoking getResourceShare.
 */
export interface GetResourceShareArgs {
    /**
     * Filter used to scope the list e.g., by tags. See [related docs] (https://docs.aws.amazon.com/ram/latest/APIReference/API_TagFilter.html).
     */
    filters?: inputs.ram.GetResourceShareFilter[];
    /**
     * Name of the tag key to filter on.
     */
    name: string;
    /**
     * Owner of the resource share. Valid values are `SELF` or `OTHER-ACCOUNTS`.
     */
    resourceOwner: string;
    /**
     * Specifies that you want to retrieve details of only those resource shares that have this status. Valid values are `PENDING`, `ACTIVE`, `FAILED`, `DELETING`, and `DELETED`.
     */
    resourceShareStatus?: string;
    /**
     * Tags attached to the resource share.
     */
    tags?: {[key: string]: string};
}

/**
 * A collection of values returned by getResourceShare.
 */
export interface GetResourceShareResult {
    /**
     * ARN of the resource share.
     */
    readonly arn: string;
    readonly filters?: outputs.ram.GetResourceShareFilter[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly name: string;
    /**
     * ID of the AWS account that owns the resource share.
     */
    readonly owningAccountId: string;
    /**
     * A list of resource ARNs associated with the resource share.
     */
    readonly resourceArns: string[];
    readonly resourceOwner: string;
    readonly resourceShareStatus?: string;
    /**
     * Status of the resource share.
     */
    readonly status: string;
    /**
     * Tags attached to the resource share.
     */
    readonly tags: {[key: string]: string};
}
/**
 * `aws.ram.ResourceShare` Retrieve information about a RAM Resource Share.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = aws.ram.getResourceShare({
 *     name: "example",
 *     resourceOwner: "SELF",
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ## Search by filters
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const tagFilter = aws.ram.getResourceShare({
 *     name: "MyResourceName",
 *     resourceOwner: "SELF",
 *     filters: [{
 *         name: "NameOfTag",
 *         values: ["exampleNameTagValue"],
 *     }],
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getResourceShareOutput(args: GetResourceShareOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetResourceShareResult> {
    return pulumi.output(args).apply((a: any) => getResourceShare(a, opts))
}

/**
 * A collection of arguments for invoking getResourceShare.
 */
export interface GetResourceShareOutputArgs {
    /**
     * Filter used to scope the list e.g., by tags. See [related docs] (https://docs.aws.amazon.com/ram/latest/APIReference/API_TagFilter.html).
     */
    filters?: pulumi.Input<pulumi.Input<inputs.ram.GetResourceShareFilterArgs>[]>;
    /**
     * Name of the tag key to filter on.
     */
    name: pulumi.Input<string>;
    /**
     * Owner of the resource share. Valid values are `SELF` or `OTHER-ACCOUNTS`.
     */
    resourceOwner: pulumi.Input<string>;
    /**
     * Specifies that you want to retrieve details of only those resource shares that have this status. Valid values are `PENDING`, `ACTIVE`, `FAILED`, `DELETING`, and `DELETED`.
     */
    resourceShareStatus?: pulumi.Input<string>;
    /**
     * Tags attached to the resource share.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}

// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * The Autoscaling Groups data source allows access to the list of AWS
 * ASGs within a specific region. This will allow you to pass a list of AutoScaling Groups to other resources.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const groups = aws.autoscaling.getAmiIds({
 *     filters: [
 *         {
 *             name: "tag:Team",
 *             values: ["Pets"],
 *         },
 *         {
 *             name: "tag-key",
 *             values: ["Environment"],
 *         },
 *     ],
 * });
 * const slackNotifications = new aws.autoscaling.Notification("slack_notifications", {
 *     groupNames: groups.then(groups => groups.names),
 *     notifications: [
 *         "autoscaling:EC2_INSTANCE_LAUNCH",
 *         "autoscaling:EC2_INSTANCE_TERMINATE",
 *         "autoscaling:EC2_INSTANCE_LAUNCH_ERROR",
 *         "autoscaling:EC2_INSTANCE_TERMINATE_ERROR",
 *     ],
 *     topicArn: "TOPIC ARN",
 * });
 * ```
 */
export function getAmiIds(args?: GetAmiIdsArgs, opts?: pulumi.InvokeOptions): Promise<GetAmiIdsResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("aws:autoscaling/getAmiIds:getAmiIds", {
        "filters": args.filters,
        "names": args.names,
    }, opts);
}

/**
 * A collection of arguments for invoking getAmiIds.
 */
export interface GetAmiIdsArgs {
    /**
     * Filter used to scope the list e.g., by tags. See [related docs](http://docs.aws.amazon.com/AutoScaling/latest/APIReference/API_Filter.html).
     */
    filters?: inputs.autoscaling.GetAmiIdsFilter[];
    /**
     * List of autoscaling group names
     */
    names?: string[];
}

/**
 * A collection of values returned by getAmiIds.
 */
export interface GetAmiIdsResult {
    /**
     * List of the Autoscaling Groups Arns in the current region.
     */
    readonly arns: string[];
    readonly filters?: outputs.autoscaling.GetAmiIdsFilter[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * List of the Autoscaling Groups in the current region.
     */
    readonly names: string[];
}
/**
 * The Autoscaling Groups data source allows access to the list of AWS
 * ASGs within a specific region. This will allow you to pass a list of AutoScaling Groups to other resources.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const groups = aws.autoscaling.getAmiIds({
 *     filters: [
 *         {
 *             name: "tag:Team",
 *             values: ["Pets"],
 *         },
 *         {
 *             name: "tag-key",
 *             values: ["Environment"],
 *         },
 *     ],
 * });
 * const slackNotifications = new aws.autoscaling.Notification("slack_notifications", {
 *     groupNames: groups.then(groups => groups.names),
 *     notifications: [
 *         "autoscaling:EC2_INSTANCE_LAUNCH",
 *         "autoscaling:EC2_INSTANCE_TERMINATE",
 *         "autoscaling:EC2_INSTANCE_LAUNCH_ERROR",
 *         "autoscaling:EC2_INSTANCE_TERMINATE_ERROR",
 *     ],
 *     topicArn: "TOPIC ARN",
 * });
 * ```
 */
export function getAmiIdsOutput(args?: GetAmiIdsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetAmiIdsResult> {
    return pulumi.output(args).apply((a: any) => getAmiIds(a, opts))
}

/**
 * A collection of arguments for invoking getAmiIds.
 */
export interface GetAmiIdsOutputArgs {
    /**
     * Filter used to scope the list e.g., by tags. See [related docs](http://docs.aws.amazon.com/AutoScaling/latest/APIReference/API_Filter.html).
     */
    filters?: pulumi.Input<pulumi.Input<inputs.autoscaling.GetAmiIdsFilterArgs>[]>;
    /**
     * List of autoscaling group names
     */
    names?: pulumi.Input<pulumi.Input<string>[]>;
}

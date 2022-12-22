// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Use this data source to get the ARN and URL of queue in AWS Simple Queue Service (SQS).
 * By using this data source, you can reference SQS queues without having to hardcode
 * the ARNs as input.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = aws.sqs.getQueue({
 *     name: "queue",
 * });
 * ```
 */
export function getQueue(args: GetQueueArgs, opts?: pulumi.InvokeOptions): Promise<GetQueueResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("aws:sqs/getQueue:getQueue", {
        "name": args.name,
        "tags": args.tags,
    }, opts);
}

/**
 * A collection of arguments for invoking getQueue.
 */
export interface GetQueueArgs {
    /**
     * Name of the queue to match.
     */
    name: string;
    /**
     * Map of tags for the resource.
     */
    tags?: {[key: string]: string};
}

/**
 * A collection of values returned by getQueue.
 */
export interface GetQueueResult {
    /**
     * ARN of the queue.
     */
    readonly arn: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly name: string;
    /**
     * Map of tags for the resource.
     */
    readonly tags: {[key: string]: string};
    /**
     * URL of the queue.
     */
    readonly url: string;
}
/**
 * Use this data source to get the ARN and URL of queue in AWS Simple Queue Service (SQS).
 * By using this data source, you can reference SQS queues without having to hardcode
 * the ARNs as input.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = aws.sqs.getQueue({
 *     name: "queue",
 * });
 * ```
 */
export function getQueueOutput(args: GetQueueOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetQueueResult> {
    return pulumi.output(args).apply((a: any) => getQueue(a, opts))
}

/**
 * A collection of arguments for invoking getQueue.
 */
export interface GetQueueOutputArgs {
    /**
     * Name of the queue to match.
     */
    name: pulumi.Input<string>;
    /**
     * Map of tags for the resource.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}

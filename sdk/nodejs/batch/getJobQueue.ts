// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * The Batch Job Queue data source allows access to details of a specific
 * job queue within AWS Batch.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const test-queue = aws.batch.getJobQueue({
 *     name: "tf-test-batch-job-queue",
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getJobQueue(args: GetJobQueueArgs, opts?: pulumi.InvokeOptions): Promise<GetJobQueueResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("aws:batch/getJobQueue:getJobQueue", {
        "name": args.name,
        "tags": args.tags,
    }, opts);
}

/**
 * A collection of arguments for invoking getJobQueue.
 */
export interface GetJobQueueArgs {
    /**
     * Name of the job queue.
     */
    name: string;
    /**
     * Key-value map of resource tags
     */
    tags?: {[key: string]: string};
}

/**
 * A collection of values returned by getJobQueue.
 */
export interface GetJobQueueResult {
    /**
     * ARN of the job queue.
     */
    readonly arn: string;
    /**
     * The compute environments that are attached to the job queue and the order in
     * which job placement is preferred. Compute environments are selected for job placement in ascending order.
     * * `compute_environment_order.#.order` - The order of the compute environment.
     * * `compute_environment_order.#.compute_environment` - The ARN of the compute environment.
     */
    readonly computeEnvironmentOrders: outputs.batch.GetJobQueueComputeEnvironmentOrder[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly name: string;
    /**
     * Priority of the job queue. Job queues with a higher priority are evaluated first when
     * associated with the same compute environment.
     */
    readonly priority: number;
    /**
     * The ARN of the fair share scheduling policy. If this attribute has a value, the job queue uses a fair share scheduling policy. If this attribute does not have a value, the job queue uses a first in, first out (FIFO) scheduling policy.
     */
    readonly schedulingPolicyArn: string;
    /**
     * Describes the ability of the queue to accept new jobs (for example, `ENABLED` or `DISABLED`).
     */
    readonly state: string;
    /**
     * Current status of the job queue (for example, `CREATING` or `VALID`).
     */
    readonly status: string;
    /**
     * Short, human-readable string to provide additional details about the current status
     * of the job queue.
     */
    readonly statusReason: string;
    /**
     * Key-value map of resource tags
     */
    readonly tags: {[key: string]: string};
}
/**
 * The Batch Job Queue data source allows access to details of a specific
 * job queue within AWS Batch.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const test-queue = aws.batch.getJobQueue({
 *     name: "tf-test-batch-job-queue",
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getJobQueueOutput(args: GetJobQueueOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetJobQueueResult> {
    return pulumi.output(args).apply((a: any) => getJobQueue(a, opts))
}

/**
 * A collection of arguments for invoking getJobQueue.
 */
export interface GetJobQueueOutputArgs {
    /**
     * Name of the job queue.
     */
    name: pulumi.Input<string>;
    /**
     * Key-value map of resource tags
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}

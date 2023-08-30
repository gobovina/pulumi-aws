// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a Batch Job Queue resource.
 *
 * ## Example Usage
 * ### Basic Job Queue
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const testQueue = new aws.batch.JobQueue("testQueue", {
 *     state: "ENABLED",
 *     priority: 1,
 *     computeEnvironments: [
 *         aws_batch_compute_environment.test_environment_1.arn,
 *         aws_batch_compute_environment.test_environment_2.arn,
 *     ],
 * });
 * ```
 * ### Job Queue with a fair share scheduling policy
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const exampleSchedulingPolicy = new aws.batch.SchedulingPolicy("exampleSchedulingPolicy", {fairSharePolicy: {
 *     computeReservation: 1,
 *     shareDecaySeconds: 3600,
 *     shareDistributions: [{
 *         shareIdentifier: "A1*",
 *         weightFactor: 0.1,
 *     }],
 * }});
 * const exampleJobQueue = new aws.batch.JobQueue("exampleJobQueue", {
 *     schedulingPolicyArn: exampleSchedulingPolicy.arn,
 *     state: "ENABLED",
 *     priority: 1,
 *     computeEnvironments: [
 *         aws_batch_compute_environment.test_environment_1.arn,
 *         aws_batch_compute_environment.test_environment_2.arn,
 *     ],
 * });
 * ```
 *
 * ## Import
 *
 * Using `pulumi import`, import Batch Job Queue using the `arn`. For example:
 *
 * ```sh
 *  $ pulumi import aws:batch/jobQueue:JobQueue test_queue arn:aws:batch:us-east-1:123456789012:job-queue/sample
 * ```
 */
export class JobQueue extends pulumi.CustomResource {
    /**
     * Get an existing JobQueue resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: JobQueueState, opts?: pulumi.CustomResourceOptions): JobQueue {
        return new JobQueue(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:batch/jobQueue:JobQueue';

    /**
     * Returns true if the given object is an instance of JobQueue.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is JobQueue {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === JobQueue.__pulumiType;
    }

    /**
     * The Amazon Resource Name of the job queue.
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * Specifies the set of compute environments
     * mapped to a job queue and their order.  The position of the compute environments
     * in the list will dictate the order.
     */
    public readonly computeEnvironments!: pulumi.Output<string[]>;
    /**
     * Specifies the name of the job queue.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The priority of the job queue. Job queues with a higher priority
     * are evaluated first when associated with the same compute environment.
     */
    public readonly priority!: pulumi.Output<number>;
    /**
     * The ARN of the fair share scheduling policy. If this parameter is specified, the job queue uses a fair share scheduling policy. If this parameter isn't specified, the job queue uses a first in, first out (FIFO) scheduling policy. After a job queue is created, you can replace but can't remove the fair share scheduling policy.
     */
    public readonly schedulingPolicyArn!: pulumi.Output<string | undefined>;
    /**
     * The state of the job queue. Must be one of: `ENABLED` or `DISABLED`
     */
    public readonly state!: pulumi.Output<string>;
    /**
     * Key-value map of resource tags. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     */
    public /*out*/ readonly tagsAll!: pulumi.Output<{[key: string]: string}>;

    /**
     * Create a JobQueue resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: JobQueueArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: JobQueueArgs | JobQueueState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as JobQueueState | undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["computeEnvironments"] = state ? state.computeEnvironments : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["priority"] = state ? state.priority : undefined;
            resourceInputs["schedulingPolicyArn"] = state ? state.schedulingPolicyArn : undefined;
            resourceInputs["state"] = state ? state.state : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tagsAll"] = state ? state.tagsAll : undefined;
        } else {
            const args = argsOrState as JobQueueArgs | undefined;
            if ((!args || args.computeEnvironments === undefined) && !opts.urn) {
                throw new Error("Missing required property 'computeEnvironments'");
            }
            if ((!args || args.priority === undefined) && !opts.urn) {
                throw new Error("Missing required property 'priority'");
            }
            if ((!args || args.state === undefined) && !opts.urn) {
                throw new Error("Missing required property 'state'");
            }
            resourceInputs["computeEnvironments"] = args ? args.computeEnvironments : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["priority"] = args ? args.priority : undefined;
            resourceInputs["schedulingPolicyArn"] = args ? args.schedulingPolicyArn : undefined;
            resourceInputs["state"] = args ? args.state : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["arn"] = undefined /*out*/;
            resourceInputs["tagsAll"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(JobQueue.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering JobQueue resources.
 */
export interface JobQueueState {
    /**
     * The Amazon Resource Name of the job queue.
     */
    arn?: pulumi.Input<string>;
    /**
     * Specifies the set of compute environments
     * mapped to a job queue and their order.  The position of the compute environments
     * in the list will dictate the order.
     */
    computeEnvironments?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Specifies the name of the job queue.
     */
    name?: pulumi.Input<string>;
    /**
     * The priority of the job queue. Job queues with a higher priority
     * are evaluated first when associated with the same compute environment.
     */
    priority?: pulumi.Input<number>;
    /**
     * The ARN of the fair share scheduling policy. If this parameter is specified, the job queue uses a fair share scheduling policy. If this parameter isn't specified, the job queue uses a first in, first out (FIFO) scheduling policy. After a job queue is created, you can replace but can't remove the fair share scheduling policy.
     */
    schedulingPolicyArn?: pulumi.Input<string>;
    /**
     * The state of the job queue. Must be one of: `ENABLED` or `DISABLED`
     */
    state?: pulumi.Input<string>;
    /**
     * Key-value map of resource tags. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     */
    tagsAll?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}

/**
 * The set of arguments for constructing a JobQueue resource.
 */
export interface JobQueueArgs {
    /**
     * Specifies the set of compute environments
     * mapped to a job queue and their order.  The position of the compute environments
     * in the list will dictate the order.
     */
    computeEnvironments: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Specifies the name of the job queue.
     */
    name?: pulumi.Input<string>;
    /**
     * The priority of the job queue. Job queues with a higher priority
     * are evaluated first when associated with the same compute environment.
     */
    priority: pulumi.Input<number>;
    /**
     * The ARN of the fair share scheduling policy. If this parameter is specified, the job queue uses a fair share scheduling policy. If this parameter isn't specified, the job queue uses a first in, first out (FIFO) scheduling policy. After a job queue is created, you can replace but can't remove the fair share scheduling policy.
     */
    schedulingPolicyArn?: pulumi.Input<string>;
    /**
     * The state of the job queue. Must be one of: `ENABLED` or `DISABLED`
     */
    state: pulumi.Input<string>;
    /**
     * Key-value map of resource tags. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}

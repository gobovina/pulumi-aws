// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

import {ARN} from "..";

/**
 * Manages an AWS DataSync Task, which represents a configuration for synchronization. Starting an execution of these DataSync Tasks (actually synchronizing files) is performed outside of this resource.
 *
 * ## Example Usage
 * ### With Scheduling
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.datasync.Task("example", {
 *     destinationLocationArn: aws_datasync_location_s3.destination.arn,
 *     sourceLocationArn: aws_datasync_location_nfs.source.arn,
 *     schedule: {
 *         scheduleExpression: "cron(0 12 ? * SUN,WED *)",
 *     },
 * });
 * ```
 * ### With Filtering
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.datasync.Task("example", {
 *     destinationLocationArn: aws_datasync_location_s3.destination.arn,
 *     sourceLocationArn: aws_datasync_location_nfs.source.arn,
 *     excludes: {
 *         filterType: "SIMPLE_PATTERN",
 *         value: "/folder1|/folder2",
 *     },
 *     includes: {
 *         filterType: "SIMPLE_PATTERN",
 *         value: "/folder1|/folder2",
 *     },
 * });
 * ```
 *
 * ## Import
 *
 * Using `pulumi import`, import `aws_datasync_task` using the DataSync Task Amazon Resource Name (ARN). For example:
 *
 * ```sh
 *  $ pulumi import aws:datasync/task:Task example arn:aws:datasync:us-east-1:123456789012:task/task-12345678901234567
 * ```
 */
export class Task extends pulumi.CustomResource {
    /**
     * Get an existing Task resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: TaskState, opts?: pulumi.CustomResourceOptions): Task {
        return new Task(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:datasync/task:Task';

    /**
     * Returns true if the given object is an instance of Task.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Task {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Task.__pulumiType;
    }

    /**
     * Amazon Resource Name (ARN) of the DataSync Task.
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * Amazon Resource Name (ARN) of the CloudWatch Log Group that is used to monitor and log events in the sync task.
     */
    public readonly cloudwatchLogGroupArn!: pulumi.Output<ARN | undefined>;
    /**
     * Amazon Resource Name (ARN) of destination DataSync Location.
     */
    public readonly destinationLocationArn!: pulumi.Output<ARN>;
    /**
     * Filter rules that determines which files to exclude from a task.
     */
    public readonly excludes!: pulumi.Output<outputs.datasync.TaskExcludes | undefined>;
    /**
     * Filter rules that determines which files to include in a task.
     */
    public readonly includes!: pulumi.Output<outputs.datasync.TaskIncludes | undefined>;
    /**
     * Name of the DataSync Task.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Configuration block containing option that controls the default behavior when you start an execution of this DataSync Task. For each individual task execution, you can override these options by specifying an overriding configuration in those executions.
     */
    public readonly options!: pulumi.Output<outputs.datasync.TaskOptions | undefined>;
    /**
     * Specifies a schedule used to periodically transfer files from a source to a destination location.
     */
    public readonly schedule!: pulumi.Output<outputs.datasync.TaskSchedule | undefined>;
    /**
     * Amazon Resource Name (ARN) of source DataSync Location.
     */
    public readonly sourceLocationArn!: pulumi.Output<ARN>;
    /**
     * Key-value pairs of resource tags to assign to the DataSync Task. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     */
    public /*out*/ readonly tagsAll!: pulumi.Output<{[key: string]: string}>;

    /**
     * Create a Task resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: TaskArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: TaskArgs | TaskState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as TaskState | undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["cloudwatchLogGroupArn"] = state ? state.cloudwatchLogGroupArn : undefined;
            resourceInputs["destinationLocationArn"] = state ? state.destinationLocationArn : undefined;
            resourceInputs["excludes"] = state ? state.excludes : undefined;
            resourceInputs["includes"] = state ? state.includes : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["options"] = state ? state.options : undefined;
            resourceInputs["schedule"] = state ? state.schedule : undefined;
            resourceInputs["sourceLocationArn"] = state ? state.sourceLocationArn : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tagsAll"] = state ? state.tagsAll : undefined;
        } else {
            const args = argsOrState as TaskArgs | undefined;
            if ((!args || args.destinationLocationArn === undefined) && !opts.urn) {
                throw new Error("Missing required property 'destinationLocationArn'");
            }
            if ((!args || args.sourceLocationArn === undefined) && !opts.urn) {
                throw new Error("Missing required property 'sourceLocationArn'");
            }
            resourceInputs["cloudwatchLogGroupArn"] = args ? args.cloudwatchLogGroupArn : undefined;
            resourceInputs["destinationLocationArn"] = args ? args.destinationLocationArn : undefined;
            resourceInputs["excludes"] = args ? args.excludes : undefined;
            resourceInputs["includes"] = args ? args.includes : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["options"] = args ? args.options : undefined;
            resourceInputs["schedule"] = args ? args.schedule : undefined;
            resourceInputs["sourceLocationArn"] = args ? args.sourceLocationArn : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["arn"] = undefined /*out*/;
            resourceInputs["tagsAll"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Task.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Task resources.
 */
export interface TaskState {
    /**
     * Amazon Resource Name (ARN) of the DataSync Task.
     */
    arn?: pulumi.Input<string>;
    /**
     * Amazon Resource Name (ARN) of the CloudWatch Log Group that is used to monitor and log events in the sync task.
     */
    cloudwatchLogGroupArn?: pulumi.Input<ARN>;
    /**
     * Amazon Resource Name (ARN) of destination DataSync Location.
     */
    destinationLocationArn?: pulumi.Input<ARN>;
    /**
     * Filter rules that determines which files to exclude from a task.
     */
    excludes?: pulumi.Input<inputs.datasync.TaskExcludes>;
    /**
     * Filter rules that determines which files to include in a task.
     */
    includes?: pulumi.Input<inputs.datasync.TaskIncludes>;
    /**
     * Name of the DataSync Task.
     */
    name?: pulumi.Input<string>;
    /**
     * Configuration block containing option that controls the default behavior when you start an execution of this DataSync Task. For each individual task execution, you can override these options by specifying an overriding configuration in those executions.
     */
    options?: pulumi.Input<inputs.datasync.TaskOptions>;
    /**
     * Specifies a schedule used to periodically transfer files from a source to a destination location.
     */
    schedule?: pulumi.Input<inputs.datasync.TaskSchedule>;
    /**
     * Amazon Resource Name (ARN) of source DataSync Location.
     */
    sourceLocationArn?: pulumi.Input<ARN>;
    /**
     * Key-value pairs of resource tags to assign to the DataSync Task. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     */
    tagsAll?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}

/**
 * The set of arguments for constructing a Task resource.
 */
export interface TaskArgs {
    /**
     * Amazon Resource Name (ARN) of the CloudWatch Log Group that is used to monitor and log events in the sync task.
     */
    cloudwatchLogGroupArn?: pulumi.Input<ARN>;
    /**
     * Amazon Resource Name (ARN) of destination DataSync Location.
     */
    destinationLocationArn: pulumi.Input<ARN>;
    /**
     * Filter rules that determines which files to exclude from a task.
     */
    excludes?: pulumi.Input<inputs.datasync.TaskExcludes>;
    /**
     * Filter rules that determines which files to include in a task.
     */
    includes?: pulumi.Input<inputs.datasync.TaskIncludes>;
    /**
     * Name of the DataSync Task.
     */
    name?: pulumi.Input<string>;
    /**
     * Configuration block containing option that controls the default behavior when you start an execution of this DataSync Task. For each individual task execution, you can override these options by specifying an overriding configuration in those executions.
     */
    options?: pulumi.Input<inputs.datasync.TaskOptions>;
    /**
     * Specifies a schedule used to periodically transfer files from a source to a destination location.
     */
    schedule?: pulumi.Input<inputs.datasync.TaskSchedule>;
    /**
     * Amazon Resource Name (ARN) of source DataSync Location.
     */
    sourceLocationArn: pulumi.Input<ARN>;
    /**
     * Key-value pairs of resource tags to assign to the DataSync Task. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}

// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Data source for managing an AWS ECS (Elastic Container) Task Execution. This data source calls the [RunTask](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_RunTask.html) API, allowing execution of one-time tasks that don't fit a standard resource lifecycle. See the feature request issue for additional context.
 *
 * > **NOTE on preview operations:** This data source calls the `RunTask` API on every read operation, which means new task(s) may be created from a `pulumi preview` command if all attributes are known. Placing this functionality behind a data source is an intentional trade off to enable use cases requiring a one-time task execution without relying on provisioners. Caution should be taken to ensure the data source is only executed once, or that the resulting tasks can safely run in parallel.
 *
 * ## Example Usage
 * ### Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = aws.ecs.getTaskExecution({
 *     cluster: exampleAwsEcsCluster.id,
 *     taskDefinition: exampleAwsEcsTaskDefinition.arn,
 *     desiredCount: 1,
 *     launchType: "FARGATE",
 *     networkConfiguration: {
 *         subnets: exampleAwsSubnet.map(__item => __item.id),
 *         securityGroups: [exampleAwsSecurityGroup.id],
 *         assignPublicIp: false,
 *     },
 * });
 * ```
 */
export function getTaskExecution(args: GetTaskExecutionArgs, opts?: pulumi.InvokeOptions): Promise<GetTaskExecutionResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("aws:ecs/getTaskExecution:getTaskExecution", {
        "capacityProviderStrategies": args.capacityProviderStrategies,
        "clientToken": args.clientToken,
        "cluster": args.cluster,
        "desiredCount": args.desiredCount,
        "enableEcsManagedTags": args.enableEcsManagedTags,
        "enableExecuteCommand": args.enableExecuteCommand,
        "group": args.group,
        "launchType": args.launchType,
        "networkConfiguration": args.networkConfiguration,
        "overrides": args.overrides,
        "placementConstraints": args.placementConstraints,
        "placementStrategies": args.placementStrategies,
        "platformVersion": args.platformVersion,
        "propagateTags": args.propagateTags,
        "referenceId": args.referenceId,
        "startedBy": args.startedBy,
        "tags": args.tags,
        "taskDefinition": args.taskDefinition,
    }, opts);
}

/**
 * A collection of arguments for invoking getTaskExecution.
 */
export interface GetTaskExecutionArgs {
    /**
     * Set of capacity provider strategies to use for the cluster. See below.
     */
    capacityProviderStrategies?: inputs.ecs.GetTaskExecutionCapacityProviderStrategy[];
    /**
     * An identifier that you provide to ensure the idempotency of the request. It must be unique and is case sensitive. Up to 64 characters are allowed. The valid characters are characters in the range of 33-126, inclusive. For more information, see [Ensuring idempotency](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/ECS_Idempotency.html).
     */
    clientToken?: string;
    /**
     * Short name or full Amazon Resource Name (ARN) of the cluster to run the task on.
     */
    cluster: string;
    /**
     * Number of instantiations of the specified task to place on your cluster. You can specify up to 10 tasks for each call.
     */
    desiredCount?: number;
    /**
     * Specifies whether to enable Amazon ECS managed tags for the tasks within the service.
     */
    enableEcsManagedTags?: boolean;
    /**
     * Specifies whether to enable Amazon ECS Exec for the tasks within the service.
     */
    enableExecuteCommand?: boolean;
    /**
     * Name of the task group to associate with the task. The default value is the family name of the task definition.
     */
    group?: string;
    /**
     * Launch type on which to run your service. Valid values are `EC2`, `FARGATE`, and `EXTERNAL`.
     */
    launchType?: string;
    /**
     * Network configuration for the service. This parameter is required for task definitions that use the `awsvpc` network mode to receive their own Elastic Network Interface, and it is not supported for other network modes. See below.
     */
    networkConfiguration?: inputs.ecs.GetTaskExecutionNetworkConfiguration;
    /**
     * A list of container overrides that specify the name of a container in the specified task definition and the overrides it should receive.
     */
    overrides?: inputs.ecs.GetTaskExecutionOverrides;
    /**
     * An array of placement constraint objects to use for the task. You can specify up to 10 constraints for each task. See below.
     */
    placementConstraints?: inputs.ecs.GetTaskExecutionPlacementConstraint[];
    /**
     * The placement strategy objects to use for the task. You can specify a maximum of 5 strategy rules for each task. See below.
     */
    placementStrategies?: inputs.ecs.GetTaskExecutionPlacementStrategy[];
    /**
     * The platform version the task uses. A platform version is only specified for tasks hosted on Fargate. If one isn't specified, the `LATEST` platform version is used.
     */
    platformVersion?: string;
    /**
     * Specifies whether to propagate the tags from the task definition to the task. If no value is specified, the tags aren't propagated. An error will be received if you specify the `SERVICE` option when running a task. Valid values are `TASK_DEFINITION` or `NONE`.
     */
    propagateTags?: string;
    /**
     * The reference ID to use for the task.
     */
    referenceId?: string;
    /**
     * An optional tag specified when a task is started.
     */
    startedBy?: string;
    /**
     * Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: {[key: string]: string};
    /**
     * The `family` and `revision` (`family:revision`) or full ARN of the task definition to run. If a revision isn't specified, the latest `ACTIVE` revision is used.
     *
     * The following arguments are optional:
     */
    taskDefinition: string;
}

/**
 * A collection of values returned by getTaskExecution.
 */
export interface GetTaskExecutionResult {
    readonly capacityProviderStrategies?: outputs.ecs.GetTaskExecutionCapacityProviderStrategy[];
    readonly clientToken?: string;
    readonly cluster: string;
    readonly desiredCount?: number;
    readonly enableEcsManagedTags?: boolean;
    readonly enableExecuteCommand?: boolean;
    readonly group?: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly launchType?: string;
    readonly networkConfiguration?: outputs.ecs.GetTaskExecutionNetworkConfiguration;
    readonly overrides?: outputs.ecs.GetTaskExecutionOverrides;
    readonly placementConstraints?: outputs.ecs.GetTaskExecutionPlacementConstraint[];
    readonly placementStrategies?: outputs.ecs.GetTaskExecutionPlacementStrategy[];
    readonly platformVersion?: string;
    readonly propagateTags?: string;
    readonly referenceId?: string;
    readonly startedBy?: string;
    readonly tags?: {[key: string]: string};
    /**
     * A list of the provisioned task ARNs.
     */
    readonly taskArns: string[];
    readonly taskDefinition: string;
}
/**
 * Data source for managing an AWS ECS (Elastic Container) Task Execution. This data source calls the [RunTask](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_RunTask.html) API, allowing execution of one-time tasks that don't fit a standard resource lifecycle. See the feature request issue for additional context.
 *
 * > **NOTE on preview operations:** This data source calls the `RunTask` API on every read operation, which means new task(s) may be created from a `pulumi preview` command if all attributes are known. Placing this functionality behind a data source is an intentional trade off to enable use cases requiring a one-time task execution without relying on provisioners. Caution should be taken to ensure the data source is only executed once, or that the resulting tasks can safely run in parallel.
 *
 * ## Example Usage
 * ### Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = aws.ecs.getTaskExecution({
 *     cluster: exampleAwsEcsCluster.id,
 *     taskDefinition: exampleAwsEcsTaskDefinition.arn,
 *     desiredCount: 1,
 *     launchType: "FARGATE",
 *     networkConfiguration: {
 *         subnets: exampleAwsSubnet.map(__item => __item.id),
 *         securityGroups: [exampleAwsSecurityGroup.id],
 *         assignPublicIp: false,
 *     },
 * });
 * ```
 */
export function getTaskExecutionOutput(args: GetTaskExecutionOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetTaskExecutionResult> {
    return pulumi.output(args).apply((a: any) => getTaskExecution(a, opts))
}

/**
 * A collection of arguments for invoking getTaskExecution.
 */
export interface GetTaskExecutionOutputArgs {
    /**
     * Set of capacity provider strategies to use for the cluster. See below.
     */
    capacityProviderStrategies?: pulumi.Input<pulumi.Input<inputs.ecs.GetTaskExecutionCapacityProviderStrategyArgs>[]>;
    /**
     * An identifier that you provide to ensure the idempotency of the request. It must be unique and is case sensitive. Up to 64 characters are allowed. The valid characters are characters in the range of 33-126, inclusive. For more information, see [Ensuring idempotency](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/ECS_Idempotency.html).
     */
    clientToken?: pulumi.Input<string>;
    /**
     * Short name or full Amazon Resource Name (ARN) of the cluster to run the task on.
     */
    cluster: pulumi.Input<string>;
    /**
     * Number of instantiations of the specified task to place on your cluster. You can specify up to 10 tasks for each call.
     */
    desiredCount?: pulumi.Input<number>;
    /**
     * Specifies whether to enable Amazon ECS managed tags for the tasks within the service.
     */
    enableEcsManagedTags?: pulumi.Input<boolean>;
    /**
     * Specifies whether to enable Amazon ECS Exec for the tasks within the service.
     */
    enableExecuteCommand?: pulumi.Input<boolean>;
    /**
     * Name of the task group to associate with the task. The default value is the family name of the task definition.
     */
    group?: pulumi.Input<string>;
    /**
     * Launch type on which to run your service. Valid values are `EC2`, `FARGATE`, and `EXTERNAL`.
     */
    launchType?: pulumi.Input<string>;
    /**
     * Network configuration for the service. This parameter is required for task definitions that use the `awsvpc` network mode to receive their own Elastic Network Interface, and it is not supported for other network modes. See below.
     */
    networkConfiguration?: pulumi.Input<inputs.ecs.GetTaskExecutionNetworkConfigurationArgs>;
    /**
     * A list of container overrides that specify the name of a container in the specified task definition and the overrides it should receive.
     */
    overrides?: pulumi.Input<inputs.ecs.GetTaskExecutionOverridesArgs>;
    /**
     * An array of placement constraint objects to use for the task. You can specify up to 10 constraints for each task. See below.
     */
    placementConstraints?: pulumi.Input<pulumi.Input<inputs.ecs.GetTaskExecutionPlacementConstraintArgs>[]>;
    /**
     * The placement strategy objects to use for the task. You can specify a maximum of 5 strategy rules for each task. See below.
     */
    placementStrategies?: pulumi.Input<pulumi.Input<inputs.ecs.GetTaskExecutionPlacementStrategyArgs>[]>;
    /**
     * The platform version the task uses. A platform version is only specified for tasks hosted on Fargate. If one isn't specified, the `LATEST` platform version is used.
     */
    platformVersion?: pulumi.Input<string>;
    /**
     * Specifies whether to propagate the tags from the task definition to the task. If no value is specified, the tags aren't propagated. An error will be received if you specify the `SERVICE` option when running a task. Valid values are `TASK_DEFINITION` or `NONE`.
     */
    propagateTags?: pulumi.Input<string>;
    /**
     * The reference ID to use for the task.
     */
    referenceId?: pulumi.Input<string>;
    /**
     * An optional tag specified when a task is started.
     */
    startedBy?: pulumi.Input<string>;
    /**
     * Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The `family` and `revision` (`family:revision`) or full ARN of the task definition to run. If a revision isn't specified, the latest `ACTIVE` revision is used.
     *
     * The following arguments are optional:
     */
    taskDefinition: pulumi.Input<string>;
}

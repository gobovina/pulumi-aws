// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * > **Note:** To prevent a race condition during service deletion, make sure to set `dependsOn` to the related `aws.iam.RolePolicy`; otherwise, the policy may be destroyed too soon and the ECS service will then get stuck in the `DRAINING` state.
 *
 * Provides an ECS service - effectively a task that is expected to run until an error occurs or a user terminates it (typically a webserver or a database).
 *
 * See [ECS Services section in AWS developer guide](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs_services.html).
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const mongo = new aws.ecs.Service("mongo", {
 *     cluster: aws_ecs_cluster.foo.id,
 *     taskDefinition: aws_ecs_task_definition.mongo.arn,
 *     desiredCount: 3,
 *     iamRole: aws_iam_role.foo.arn,
 *     orderedPlacementStrategies: [{
 *         type: "binpack",
 *         field: "cpu",
 *     }],
 *     loadBalancers: [{
 *         targetGroupArn: aws_lb_target_group.foo.arn,
 *         containerName: "mongo",
 *         containerPort: 8080,
 *     }],
 *     placementConstraints: [{
 *         type: "memberOf",
 *         expression: "attribute:ecs.availability-zone in [us-west-2a, us-west-2b]",
 *     }],
 * }, {
 *     dependsOn: [aws_iam_role_policy.foo],
 * });
 * ```
 * ### Ignoring Changes to Desired Count
 *
 * You can use [`ignoreChanges`](https://www.pulumi.com/docs/intro/concepts/programming-model/#ignorechanges) to create an ECS service with an initial count of running instances, then ignore any changes to that count caused externally (e.g. Application Autoscaling).
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * // ... other configurations ...
 * const example = new aws.ecs.Service("example", {desiredCount: 2});
 * ```
 * ### Daemon Scheduling Strategy
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const bar = new aws.ecs.Service("bar", {
 *     cluster: aws_ecs_cluster.foo.id,
 *     taskDefinition: aws_ecs_task_definition.bar.arn,
 *     schedulingStrategy: "DAEMON",
 * });
 * ```
 * ### CloudWatch Deployment Alarms
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.ecs.Service("example", {
 *     cluster: aws_ecs_cluster.example.id,
 *     alarms: {
 *         enable: true,
 *         rollback: true,
 *         alarmNames: [aws_cloudwatch_metric_alarm.example.alarm_name],
 *     },
 * });
 * ```
 * ### External Deployment Controller
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.ecs.Service("example", {
 *     cluster: aws_ecs_cluster.example.id,
 *     deploymentController: {
 *         type: "EXTERNAL",
 *     },
 * });
 * ```
 *
 * ## Import
 *
 * Using `pulumi import`, import ECS services using the `name` together with ecs cluster `name`. For example:
 *
 * ```sh
 *  $ pulumi import aws:ecs/service:Service imported cluster-name/service-name
 * ```
 */
export class Service extends pulumi.CustomResource {
    /**
     * Get an existing Service resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ServiceState, opts?: pulumi.CustomResourceOptions): Service {
        return new Service(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:ecs/service:Service';

    /**
     * Returns true if the given object is an instance of Service.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Service {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Service.__pulumiType;
    }

    /**
     * Information about the CloudWatch alarms. See below.
     */
    public readonly alarms!: pulumi.Output<outputs.ecs.ServiceAlarms | undefined>;
    /**
     * Capacity provider strategies to use for the service. Can be one or more. These can be updated without destroying and recreating the service only if `forceNewDeployment = true` and not changing from 0 `capacityProviderStrategy` blocks to greater than 0, or vice versa. See below.
     */
    public readonly capacityProviderStrategies!: pulumi.Output<outputs.ecs.ServiceCapacityProviderStrategy[] | undefined>;
    /**
     * ARN of an ECS cluster.
     */
    public readonly cluster!: pulumi.Output<string>;
    /**
     * Configuration block for deployment circuit breaker. See below.
     */
    public readonly deploymentCircuitBreaker!: pulumi.Output<outputs.ecs.ServiceDeploymentCircuitBreaker | undefined>;
    /**
     * Configuration block for deployment controller configuration. See below.
     */
    public readonly deploymentController!: pulumi.Output<outputs.ecs.ServiceDeploymentController | undefined>;
    /**
     * Upper limit (as a percentage of the service's desiredCount) of the number of running tasks that can be running in a service during a deployment. Not valid when using the `DAEMON` scheduling strategy.
     */
    public readonly deploymentMaximumPercent!: pulumi.Output<number | undefined>;
    /**
     * Lower limit (as a percentage of the service's desiredCount) of the number of running tasks that must remain running and healthy in a service during a deployment.
     */
    public readonly deploymentMinimumHealthyPercent!: pulumi.Output<number | undefined>;
    /**
     * Number of instances of the task definition to place and keep running. Defaults to 0. Do not specify if using the `DAEMON` scheduling strategy.
     */
    public readonly desiredCount!: pulumi.Output<number | undefined>;
    /**
     * Specifies whether to enable Amazon ECS managed tags for the tasks within the service.
     */
    public readonly enableEcsManagedTags!: pulumi.Output<boolean | undefined>;
    /**
     * Specifies whether to enable Amazon ECS Exec for the tasks within the service.
     */
    public readonly enableExecuteCommand!: pulumi.Output<boolean | undefined>;
    /**
     * Enable to force a new task deployment of the service. This can be used to update tasks to use a newer Docker image with same image/tag combination (e.g., `myimage:latest`), roll Fargate tasks onto a newer platform version, or immediately deploy `orderedPlacementStrategy` and `placementConstraints` updates.
     */
    public readonly forceNewDeployment!: pulumi.Output<boolean | undefined>;
    /**
     * Seconds to ignore failing load balancer health checks on newly instantiated tasks to prevent premature shutdown, up to 2147483647. Only valid for services configured to use load balancers.
     */
    public readonly healthCheckGracePeriodSeconds!: pulumi.Output<number | undefined>;
    /**
     * ARN of the IAM role that allows Amazon ECS to make calls to your load balancer on your behalf. This parameter is required if you are using a load balancer with your service, but only if your task definition does not use the `awsvpc` network mode. If using `awsvpc` network mode, do not specify this role. If your account has already created the Amazon ECS service-linked role, that role is used by default for your service unless you specify a role here.
     */
    public readonly iamRole!: pulumi.Output<string>;
    /**
     * Launch type on which to run your service. The valid values are `EC2`, `FARGATE`, and `EXTERNAL`. Defaults to `EC2`.
     */
    public readonly launchType!: pulumi.Output<string>;
    /**
     * Configuration block for load balancers. See below.
     */
    public readonly loadBalancers!: pulumi.Output<outputs.ecs.ServiceLoadBalancer[] | undefined>;
    /**
     * Name of the service (up to 255 letters, numbers, hyphens, and underscores)
     *
     * The following arguments are optional:
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Network configuration for the service. This parameter is required for task definitions that use the `awsvpc` network mode to receive their own Elastic Network Interface, and it is not supported for other network modes. See below.
     */
    public readonly networkConfiguration!: pulumi.Output<outputs.ecs.ServiceNetworkConfiguration | undefined>;
    /**
     * Service level strategy rules that are taken into consideration during task placement. List from top to bottom in order of precedence. Updates to this configuration will take effect next task deployment unless `forceNewDeployment` is enabled. The maximum number of `orderedPlacementStrategy` blocks is `5`. See below.
     */
    public readonly orderedPlacementStrategies!: pulumi.Output<outputs.ecs.ServiceOrderedPlacementStrategy[] | undefined>;
    /**
     * Rules that are taken into consideration during task placement. Updates to this configuration will take effect next task deployment unless `forceNewDeployment` is enabled. Maximum number of `placementConstraints` is `10`. See below.
     */
    public readonly placementConstraints!: pulumi.Output<outputs.ecs.ServicePlacementConstraint[] | undefined>;
    /**
     * Platform version on which to run your service. Only applicable for `launchType` set to `FARGATE`. Defaults to `LATEST`. More information about Fargate platform versions can be found in the [AWS ECS User Guide](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html).
     */
    public readonly platformVersion!: pulumi.Output<string>;
    /**
     * Specifies whether to propagate the tags from the task definition or the service to the tasks. The valid values are `SERVICE` and `TASK_DEFINITION`.
     */
    public readonly propagateTags!: pulumi.Output<string | undefined>;
    /**
     * Scheduling strategy to use for the service. The valid values are `REPLICA` and `DAEMON`. Defaults to `REPLICA`. Note that [*Tasks using the Fargate launch type or the `CODE_DEPLOY` or `EXTERNAL` deployment controller types don't support the `DAEMON` scheduling strategy*](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_CreateService.html).
     */
    public readonly schedulingStrategy!: pulumi.Output<string | undefined>;
    /**
     * The ECS Service Connect configuration for this service to discover and connect to services, and be discovered by, and connected from, other services within a namespace. See below.
     */
    public readonly serviceConnectConfiguration!: pulumi.Output<outputs.ecs.ServiceServiceConnectConfiguration | undefined>;
    /**
     * Service discovery registries for the service. The maximum number of `serviceRegistries` blocks is `1`. See below.
     */
    public readonly serviceRegistries!: pulumi.Output<outputs.ecs.ServiceServiceRegistries | undefined>;
    /**
     * Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     */
    public /*out*/ readonly tagsAll!: pulumi.Output<{[key: string]: string}>;
    /**
     * Family and revision (`family:revision`) or full ARN of the task definition that you want to run in your service. Required unless using the `EXTERNAL` deployment controller. If a revision is not specified, the latest `ACTIVE` revision is used.
     */
    public readonly taskDefinition!: pulumi.Output<string | undefined>;
    /**
     * Map of arbitrary keys and values that, when changed, will trigger an in-place update (redeployment). Useful with `timestamp()`. See example above.
     */
    public readonly triggers!: pulumi.Output<{[key: string]: string}>;
    /**
     * If `true`, this provider will wait for the service to reach a steady state (like [`aws ecs wait services-stable`](https://docs.aws.amazon.com/cli/latest/reference/ecs/wait/services-stable.html)) before continuing. Default `false`.
     */
    public readonly waitForSteadyState!: pulumi.Output<boolean | undefined>;

    /**
     * Create a Service resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: ServiceArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ServiceArgs | ServiceState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ServiceState | undefined;
            resourceInputs["alarms"] = state ? state.alarms : undefined;
            resourceInputs["capacityProviderStrategies"] = state ? state.capacityProviderStrategies : undefined;
            resourceInputs["cluster"] = state ? state.cluster : undefined;
            resourceInputs["deploymentCircuitBreaker"] = state ? state.deploymentCircuitBreaker : undefined;
            resourceInputs["deploymentController"] = state ? state.deploymentController : undefined;
            resourceInputs["deploymentMaximumPercent"] = state ? state.deploymentMaximumPercent : undefined;
            resourceInputs["deploymentMinimumHealthyPercent"] = state ? state.deploymentMinimumHealthyPercent : undefined;
            resourceInputs["desiredCount"] = state ? state.desiredCount : undefined;
            resourceInputs["enableEcsManagedTags"] = state ? state.enableEcsManagedTags : undefined;
            resourceInputs["enableExecuteCommand"] = state ? state.enableExecuteCommand : undefined;
            resourceInputs["forceNewDeployment"] = state ? state.forceNewDeployment : undefined;
            resourceInputs["healthCheckGracePeriodSeconds"] = state ? state.healthCheckGracePeriodSeconds : undefined;
            resourceInputs["iamRole"] = state ? state.iamRole : undefined;
            resourceInputs["launchType"] = state ? state.launchType : undefined;
            resourceInputs["loadBalancers"] = state ? state.loadBalancers : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["networkConfiguration"] = state ? state.networkConfiguration : undefined;
            resourceInputs["orderedPlacementStrategies"] = state ? state.orderedPlacementStrategies : undefined;
            resourceInputs["placementConstraints"] = state ? state.placementConstraints : undefined;
            resourceInputs["platformVersion"] = state ? state.platformVersion : undefined;
            resourceInputs["propagateTags"] = state ? state.propagateTags : undefined;
            resourceInputs["schedulingStrategy"] = state ? state.schedulingStrategy : undefined;
            resourceInputs["serviceConnectConfiguration"] = state ? state.serviceConnectConfiguration : undefined;
            resourceInputs["serviceRegistries"] = state ? state.serviceRegistries : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tagsAll"] = state ? state.tagsAll : undefined;
            resourceInputs["taskDefinition"] = state ? state.taskDefinition : undefined;
            resourceInputs["triggers"] = state ? state.triggers : undefined;
            resourceInputs["waitForSteadyState"] = state ? state.waitForSteadyState : undefined;
        } else {
            const args = argsOrState as ServiceArgs | undefined;
            resourceInputs["alarms"] = args ? args.alarms : undefined;
            resourceInputs["capacityProviderStrategies"] = args ? args.capacityProviderStrategies : undefined;
            resourceInputs["cluster"] = args ? args.cluster : undefined;
            resourceInputs["deploymentCircuitBreaker"] = args ? args.deploymentCircuitBreaker : undefined;
            resourceInputs["deploymentController"] = args ? args.deploymentController : undefined;
            resourceInputs["deploymentMaximumPercent"] = args ? args.deploymentMaximumPercent : undefined;
            resourceInputs["deploymentMinimumHealthyPercent"] = args ? args.deploymentMinimumHealthyPercent : undefined;
            resourceInputs["desiredCount"] = args ? args.desiredCount : undefined;
            resourceInputs["enableEcsManagedTags"] = args ? args.enableEcsManagedTags : undefined;
            resourceInputs["enableExecuteCommand"] = args ? args.enableExecuteCommand : undefined;
            resourceInputs["forceNewDeployment"] = args ? args.forceNewDeployment : undefined;
            resourceInputs["healthCheckGracePeriodSeconds"] = args ? args.healthCheckGracePeriodSeconds : undefined;
            resourceInputs["iamRole"] = args ? args.iamRole : undefined;
            resourceInputs["launchType"] = args ? args.launchType : undefined;
            resourceInputs["loadBalancers"] = args ? args.loadBalancers : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["networkConfiguration"] = args ? args.networkConfiguration : undefined;
            resourceInputs["orderedPlacementStrategies"] = args ? args.orderedPlacementStrategies : undefined;
            resourceInputs["placementConstraints"] = args ? args.placementConstraints : undefined;
            resourceInputs["platformVersion"] = args ? args.platformVersion : undefined;
            resourceInputs["propagateTags"] = args ? args.propagateTags : undefined;
            resourceInputs["schedulingStrategy"] = args ? args.schedulingStrategy : undefined;
            resourceInputs["serviceConnectConfiguration"] = args ? args.serviceConnectConfiguration : undefined;
            resourceInputs["serviceRegistries"] = args ? args.serviceRegistries : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["taskDefinition"] = args ? args.taskDefinition : undefined;
            resourceInputs["triggers"] = args ? args.triggers : undefined;
            resourceInputs["waitForSteadyState"] = args ? args.waitForSteadyState : undefined;
            resourceInputs["tagsAll"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Service.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Service resources.
 */
export interface ServiceState {
    /**
     * Information about the CloudWatch alarms. See below.
     */
    alarms?: pulumi.Input<inputs.ecs.ServiceAlarms>;
    /**
     * Capacity provider strategies to use for the service. Can be one or more. These can be updated without destroying and recreating the service only if `forceNewDeployment = true` and not changing from 0 `capacityProviderStrategy` blocks to greater than 0, or vice versa. See below.
     */
    capacityProviderStrategies?: pulumi.Input<pulumi.Input<inputs.ecs.ServiceCapacityProviderStrategy>[]>;
    /**
     * ARN of an ECS cluster.
     */
    cluster?: pulumi.Input<string>;
    /**
     * Configuration block for deployment circuit breaker. See below.
     */
    deploymentCircuitBreaker?: pulumi.Input<inputs.ecs.ServiceDeploymentCircuitBreaker>;
    /**
     * Configuration block for deployment controller configuration. See below.
     */
    deploymentController?: pulumi.Input<inputs.ecs.ServiceDeploymentController>;
    /**
     * Upper limit (as a percentage of the service's desiredCount) of the number of running tasks that can be running in a service during a deployment. Not valid when using the `DAEMON` scheduling strategy.
     */
    deploymentMaximumPercent?: pulumi.Input<number>;
    /**
     * Lower limit (as a percentage of the service's desiredCount) of the number of running tasks that must remain running and healthy in a service during a deployment.
     */
    deploymentMinimumHealthyPercent?: pulumi.Input<number>;
    /**
     * Number of instances of the task definition to place and keep running. Defaults to 0. Do not specify if using the `DAEMON` scheduling strategy.
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
     * Enable to force a new task deployment of the service. This can be used to update tasks to use a newer Docker image with same image/tag combination (e.g., `myimage:latest`), roll Fargate tasks onto a newer platform version, or immediately deploy `orderedPlacementStrategy` and `placementConstraints` updates.
     */
    forceNewDeployment?: pulumi.Input<boolean>;
    /**
     * Seconds to ignore failing load balancer health checks on newly instantiated tasks to prevent premature shutdown, up to 2147483647. Only valid for services configured to use load balancers.
     */
    healthCheckGracePeriodSeconds?: pulumi.Input<number>;
    /**
     * ARN of the IAM role that allows Amazon ECS to make calls to your load balancer on your behalf. This parameter is required if you are using a load balancer with your service, but only if your task definition does not use the `awsvpc` network mode. If using `awsvpc` network mode, do not specify this role. If your account has already created the Amazon ECS service-linked role, that role is used by default for your service unless you specify a role here.
     */
    iamRole?: pulumi.Input<string>;
    /**
     * Launch type on which to run your service. The valid values are `EC2`, `FARGATE`, and `EXTERNAL`. Defaults to `EC2`.
     */
    launchType?: pulumi.Input<string>;
    /**
     * Configuration block for load balancers. See below.
     */
    loadBalancers?: pulumi.Input<pulumi.Input<inputs.ecs.ServiceLoadBalancer>[]>;
    /**
     * Name of the service (up to 255 letters, numbers, hyphens, and underscores)
     *
     * The following arguments are optional:
     */
    name?: pulumi.Input<string>;
    /**
     * Network configuration for the service. This parameter is required for task definitions that use the `awsvpc` network mode to receive their own Elastic Network Interface, and it is not supported for other network modes. See below.
     */
    networkConfiguration?: pulumi.Input<inputs.ecs.ServiceNetworkConfiguration>;
    /**
     * Service level strategy rules that are taken into consideration during task placement. List from top to bottom in order of precedence. Updates to this configuration will take effect next task deployment unless `forceNewDeployment` is enabled. The maximum number of `orderedPlacementStrategy` blocks is `5`. See below.
     */
    orderedPlacementStrategies?: pulumi.Input<pulumi.Input<inputs.ecs.ServiceOrderedPlacementStrategy>[]>;
    /**
     * Rules that are taken into consideration during task placement. Updates to this configuration will take effect next task deployment unless `forceNewDeployment` is enabled. Maximum number of `placementConstraints` is `10`. See below.
     */
    placementConstraints?: pulumi.Input<pulumi.Input<inputs.ecs.ServicePlacementConstraint>[]>;
    /**
     * Platform version on which to run your service. Only applicable for `launchType` set to `FARGATE`. Defaults to `LATEST`. More information about Fargate platform versions can be found in the [AWS ECS User Guide](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html).
     */
    platformVersion?: pulumi.Input<string>;
    /**
     * Specifies whether to propagate the tags from the task definition or the service to the tasks. The valid values are `SERVICE` and `TASK_DEFINITION`.
     */
    propagateTags?: pulumi.Input<string>;
    /**
     * Scheduling strategy to use for the service. The valid values are `REPLICA` and `DAEMON`. Defaults to `REPLICA`. Note that [*Tasks using the Fargate launch type or the `CODE_DEPLOY` or `EXTERNAL` deployment controller types don't support the `DAEMON` scheduling strategy*](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_CreateService.html).
     */
    schedulingStrategy?: pulumi.Input<string>;
    /**
     * The ECS Service Connect configuration for this service to discover and connect to services, and be discovered by, and connected from, other services within a namespace. See below.
     */
    serviceConnectConfiguration?: pulumi.Input<inputs.ecs.ServiceServiceConnectConfiguration>;
    /**
     * Service discovery registries for the service. The maximum number of `serviceRegistries` blocks is `1`. See below.
     */
    serviceRegistries?: pulumi.Input<inputs.ecs.ServiceServiceRegistries>;
    /**
     * Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     */
    tagsAll?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Family and revision (`family:revision`) or full ARN of the task definition that you want to run in your service. Required unless using the `EXTERNAL` deployment controller. If a revision is not specified, the latest `ACTIVE` revision is used.
     */
    taskDefinition?: pulumi.Input<string>;
    /**
     * Map of arbitrary keys and values that, when changed, will trigger an in-place update (redeployment). Useful with `timestamp()`. See example above.
     */
    triggers?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * If `true`, this provider will wait for the service to reach a steady state (like [`aws ecs wait services-stable`](https://docs.aws.amazon.com/cli/latest/reference/ecs/wait/services-stable.html)) before continuing. Default `false`.
     */
    waitForSteadyState?: pulumi.Input<boolean>;
}

/**
 * The set of arguments for constructing a Service resource.
 */
export interface ServiceArgs {
    /**
     * Information about the CloudWatch alarms. See below.
     */
    alarms?: pulumi.Input<inputs.ecs.ServiceAlarms>;
    /**
     * Capacity provider strategies to use for the service. Can be one or more. These can be updated without destroying and recreating the service only if `forceNewDeployment = true` and not changing from 0 `capacityProviderStrategy` blocks to greater than 0, or vice versa. See below.
     */
    capacityProviderStrategies?: pulumi.Input<pulumi.Input<inputs.ecs.ServiceCapacityProviderStrategy>[]>;
    /**
     * ARN of an ECS cluster.
     */
    cluster?: pulumi.Input<string>;
    /**
     * Configuration block for deployment circuit breaker. See below.
     */
    deploymentCircuitBreaker?: pulumi.Input<inputs.ecs.ServiceDeploymentCircuitBreaker>;
    /**
     * Configuration block for deployment controller configuration. See below.
     */
    deploymentController?: pulumi.Input<inputs.ecs.ServiceDeploymentController>;
    /**
     * Upper limit (as a percentage of the service's desiredCount) of the number of running tasks that can be running in a service during a deployment. Not valid when using the `DAEMON` scheduling strategy.
     */
    deploymentMaximumPercent?: pulumi.Input<number>;
    /**
     * Lower limit (as a percentage of the service's desiredCount) of the number of running tasks that must remain running and healthy in a service during a deployment.
     */
    deploymentMinimumHealthyPercent?: pulumi.Input<number>;
    /**
     * Number of instances of the task definition to place and keep running. Defaults to 0. Do not specify if using the `DAEMON` scheduling strategy.
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
     * Enable to force a new task deployment of the service. This can be used to update tasks to use a newer Docker image with same image/tag combination (e.g., `myimage:latest`), roll Fargate tasks onto a newer platform version, or immediately deploy `orderedPlacementStrategy` and `placementConstraints` updates.
     */
    forceNewDeployment?: pulumi.Input<boolean>;
    /**
     * Seconds to ignore failing load balancer health checks on newly instantiated tasks to prevent premature shutdown, up to 2147483647. Only valid for services configured to use load balancers.
     */
    healthCheckGracePeriodSeconds?: pulumi.Input<number>;
    /**
     * ARN of the IAM role that allows Amazon ECS to make calls to your load balancer on your behalf. This parameter is required if you are using a load balancer with your service, but only if your task definition does not use the `awsvpc` network mode. If using `awsvpc` network mode, do not specify this role. If your account has already created the Amazon ECS service-linked role, that role is used by default for your service unless you specify a role here.
     */
    iamRole?: pulumi.Input<string>;
    /**
     * Launch type on which to run your service. The valid values are `EC2`, `FARGATE`, and `EXTERNAL`. Defaults to `EC2`.
     */
    launchType?: pulumi.Input<string>;
    /**
     * Configuration block for load balancers. See below.
     */
    loadBalancers?: pulumi.Input<pulumi.Input<inputs.ecs.ServiceLoadBalancer>[]>;
    /**
     * Name of the service (up to 255 letters, numbers, hyphens, and underscores)
     *
     * The following arguments are optional:
     */
    name?: pulumi.Input<string>;
    /**
     * Network configuration for the service. This parameter is required for task definitions that use the `awsvpc` network mode to receive their own Elastic Network Interface, and it is not supported for other network modes. See below.
     */
    networkConfiguration?: pulumi.Input<inputs.ecs.ServiceNetworkConfiguration>;
    /**
     * Service level strategy rules that are taken into consideration during task placement. List from top to bottom in order of precedence. Updates to this configuration will take effect next task deployment unless `forceNewDeployment` is enabled. The maximum number of `orderedPlacementStrategy` blocks is `5`. See below.
     */
    orderedPlacementStrategies?: pulumi.Input<pulumi.Input<inputs.ecs.ServiceOrderedPlacementStrategy>[]>;
    /**
     * Rules that are taken into consideration during task placement. Updates to this configuration will take effect next task deployment unless `forceNewDeployment` is enabled. Maximum number of `placementConstraints` is `10`. See below.
     */
    placementConstraints?: pulumi.Input<pulumi.Input<inputs.ecs.ServicePlacementConstraint>[]>;
    /**
     * Platform version on which to run your service. Only applicable for `launchType` set to `FARGATE`. Defaults to `LATEST`. More information about Fargate platform versions can be found in the [AWS ECS User Guide](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html).
     */
    platformVersion?: pulumi.Input<string>;
    /**
     * Specifies whether to propagate the tags from the task definition or the service to the tasks. The valid values are `SERVICE` and `TASK_DEFINITION`.
     */
    propagateTags?: pulumi.Input<string>;
    /**
     * Scheduling strategy to use for the service. The valid values are `REPLICA` and `DAEMON`. Defaults to `REPLICA`. Note that [*Tasks using the Fargate launch type or the `CODE_DEPLOY` or `EXTERNAL` deployment controller types don't support the `DAEMON` scheduling strategy*](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_CreateService.html).
     */
    schedulingStrategy?: pulumi.Input<string>;
    /**
     * The ECS Service Connect configuration for this service to discover and connect to services, and be discovered by, and connected from, other services within a namespace. See below.
     */
    serviceConnectConfiguration?: pulumi.Input<inputs.ecs.ServiceServiceConnectConfiguration>;
    /**
     * Service discovery registries for the service. The maximum number of `serviceRegistries` blocks is `1`. See below.
     */
    serviceRegistries?: pulumi.Input<inputs.ecs.ServiceServiceRegistries>;
    /**
     * Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Family and revision (`family:revision`) or full ARN of the task definition that you want to run in your service. Required unless using the `EXTERNAL` deployment controller. If a revision is not specified, the latest `ACTIVE` revision is used.
     */
    taskDefinition?: pulumi.Input<string>;
    /**
     * Map of arbitrary keys and values that, when changed, will trigger an in-place update (redeployment). Useful with `timestamp()`. See example above.
     */
    triggers?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * If `true`, this provider will wait for the service to reach a steady state (like [`aws ecs wait services-stable`](https://docs.aws.amazon.com/cli/latest/reference/ecs/wait/services-stable.html)) before continuing. Default `false`.
     */
    waitForSteadyState?: pulumi.Input<boolean>;
}

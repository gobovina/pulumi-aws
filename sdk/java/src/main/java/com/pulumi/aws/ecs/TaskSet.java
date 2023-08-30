// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ecs;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.ecs.TaskSetArgs;
import com.pulumi.aws.ecs.inputs.TaskSetState;
import com.pulumi.aws.ecs.outputs.TaskSetCapacityProviderStrategy;
import com.pulumi.aws.ecs.outputs.TaskSetLoadBalancer;
import com.pulumi.aws.ecs.outputs.TaskSetNetworkConfiguration;
import com.pulumi.aws.ecs.outputs.TaskSetScale;
import com.pulumi.aws.ecs.outputs.TaskSetServiceRegistries;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides an ECS task set - effectively a task that is expected to run until an error occurs or a user terminates it (typically a webserver or a database).
 * 
 * See [ECS Task Set section in AWS developer guide](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/deployment-type-external.html).
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.ecs.TaskSet;
 * import com.pulumi.aws.ecs.TaskSetArgs;
 * import com.pulumi.aws.ecs.inputs.TaskSetLoadBalancerArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var example = new TaskSet(&#34;example&#34;, TaskSetArgs.builder()        
 *             .service(aws_ecs_service.example().id())
 *             .cluster(aws_ecs_cluster.example().id())
 *             .taskDefinition(aws_ecs_task_definition.example().arn())
 *             .loadBalancers(TaskSetLoadBalancerArgs.builder()
 *                 .targetGroupArn(aws_lb_target_group.example().arn())
 *                 .containerName(&#34;mongo&#34;)
 *                 .containerPort(8080)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Ignoring Changes to Scale
 * 
 * You can utilize the generic resource lifecycle configuration block with `ignore_changes` to create an ECS service with an initial count of running instances, then ignore any changes to that count caused externally (e.g. Application Autoscaling).
 * 
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.ecs.TaskSet;
 * import com.pulumi.aws.ecs.TaskSetArgs;
 * import com.pulumi.aws.ecs.inputs.TaskSetScaleArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var example = new TaskSet(&#34;example&#34;, TaskSetArgs.builder()        
 *             .lifecycle(%!v(PANIC=Format method: runtime error: invalid memory address or nil pointer dereference))
 *             .scale(TaskSetScaleArgs.builder()
 *                 .value(50)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import ECS Task Sets using the `task_set_id`, `service`, and `cluster` separated by commas (`,`). For example:
 * 
 * ```sh
 *  $ pulumi import aws:ecs/taskSet:TaskSet example ecs-svc/7177320696926227436,arn:aws:ecs:us-west-2:123456789101:service/example/example-1234567890,arn:aws:ecs:us-west-2:123456789101:cluster/example
 * ```
 * 
 */
@ResourceType(type="aws:ecs/taskSet:TaskSet")
public class TaskSet extends com.pulumi.resources.CustomResource {
    /**
     * The Amazon Resource Name (ARN) that identifies the task set.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) that identifies the task set.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The capacity provider strategy to use for the service. Can be one or more.  Defined below.
     * 
     */
    @Export(name="capacityProviderStrategies", refs={List.class,TaskSetCapacityProviderStrategy.class}, tree="[0,1]")
    private Output</* @Nullable */ List<TaskSetCapacityProviderStrategy>> capacityProviderStrategies;

    /**
     * @return The capacity provider strategy to use for the service. Can be one or more.  Defined below.
     * 
     */
    public Output<Optional<List<TaskSetCapacityProviderStrategy>>> capacityProviderStrategies() {
        return Codegen.optional(this.capacityProviderStrategies);
    }
    /**
     * The short name or ARN of the cluster that hosts the service to create the task set in.
     * 
     */
    @Export(name="cluster", refs={String.class}, tree="[0]")
    private Output<String> cluster;

    /**
     * @return The short name or ARN of the cluster that hosts the service to create the task set in.
     * 
     */
    public Output<String> cluster() {
        return this.cluster;
    }
    /**
     * The external ID associated with the task set.
     * 
     */
    @Export(name="externalId", refs={String.class}, tree="[0]")
    private Output<String> externalId;

    /**
     * @return The external ID associated with the task set.
     * 
     */
    public Output<String> externalId() {
        return this.externalId;
    }
    /**
     * Whether to allow deleting the task set without waiting for scaling down to 0. You can force a task set to delete even if it&#39;s in the process of scaling a resource. Normally, the provider drains all the tasks before deleting the task set. This bypasses that behavior and potentially leaves resources dangling.
     * 
     */
    @Export(name="forceDelete", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> forceDelete;

    /**
     * @return Whether to allow deleting the task set without waiting for scaling down to 0. You can force a task set to delete even if it&#39;s in the process of scaling a resource. Normally, the provider drains all the tasks before deleting the task set. This bypasses that behavior and potentially leaves resources dangling.
     * 
     */
    public Output<Optional<Boolean>> forceDelete() {
        return Codegen.optional(this.forceDelete);
    }
    /**
     * The launch type on which to run your service. The valid values are `EC2`, `FARGATE`, and `EXTERNAL`. Defaults to `EC2`.
     * 
     */
    @Export(name="launchType", refs={String.class}, tree="[0]")
    private Output<String> launchType;

    /**
     * @return The launch type on which to run your service. The valid values are `EC2`, `FARGATE`, and `EXTERNAL`. Defaults to `EC2`.
     * 
     */
    public Output<String> launchType() {
        return this.launchType;
    }
    /**
     * Details on load balancers that are used with a task set. Detailed below.
     * 
     */
    @Export(name="loadBalancers", refs={List.class,TaskSetLoadBalancer.class}, tree="[0,1]")
    private Output</* @Nullable */ List<TaskSetLoadBalancer>> loadBalancers;

    /**
     * @return Details on load balancers that are used with a task set. Detailed below.
     * 
     */
    public Output<Optional<List<TaskSetLoadBalancer>>> loadBalancers() {
        return Codegen.optional(this.loadBalancers);
    }
    /**
     * The network configuration for the service. This parameter is required for task definitions that use the `awsvpc` network mode to receive their own Elastic Network Interface, and it is not supported for other network modes. Detailed below.
     * 
     */
    @Export(name="networkConfiguration", refs={TaskSetNetworkConfiguration.class}, tree="[0]")
    private Output</* @Nullable */ TaskSetNetworkConfiguration> networkConfiguration;

    /**
     * @return The network configuration for the service. This parameter is required for task definitions that use the `awsvpc` network mode to receive their own Elastic Network Interface, and it is not supported for other network modes. Detailed below.
     * 
     */
    public Output<Optional<TaskSetNetworkConfiguration>> networkConfiguration() {
        return Codegen.optional(this.networkConfiguration);
    }
    /**
     * The platform version on which to run your service. Only applicable for `launch_type` set to `FARGATE`. Defaults to `LATEST`. More information about Fargate platform versions can be found in the [AWS ECS User Guide](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html).
     * 
     */
    @Export(name="platformVersion", refs={String.class}, tree="[0]")
    private Output<String> platformVersion;

    /**
     * @return The platform version on which to run your service. Only applicable for `launch_type` set to `FARGATE`. Defaults to `LATEST`. More information about Fargate platform versions can be found in the [AWS ECS User Guide](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html).
     * 
     */
    public Output<String> platformVersion() {
        return this.platformVersion;
    }
    /**
     * A floating-point percentage of the desired number of tasks to place and keep running in the task set. Detailed below.
     * 
     */
    @Export(name="scale", refs={TaskSetScale.class}, tree="[0]")
    private Output<TaskSetScale> scale;

    /**
     * @return A floating-point percentage of the desired number of tasks to place and keep running in the task set. Detailed below.
     * 
     */
    public Output<TaskSetScale> scale() {
        return this.scale;
    }
    /**
     * The short name or ARN of the ECS service.
     * 
     */
    @Export(name="service", refs={String.class}, tree="[0]")
    private Output<String> service;

    /**
     * @return The short name or ARN of the ECS service.
     * 
     */
    public Output<String> service() {
        return this.service;
    }
    /**
     * The service discovery registries for the service. The maximum number of `service_registries` blocks is `1`. Detailed below.
     * 
     */
    @Export(name="serviceRegistries", refs={TaskSetServiceRegistries.class}, tree="[0]")
    private Output</* @Nullable */ TaskSetServiceRegistries> serviceRegistries;

    /**
     * @return The service discovery registries for the service. The maximum number of `service_registries` blocks is `1`. Detailed below.
     * 
     */
    public Output<Optional<TaskSetServiceRegistries>> serviceRegistries() {
        return Codegen.optional(this.serviceRegistries);
    }
    /**
     * The stability status. This indicates whether the task set has reached a steady state.
     * 
     */
    @Export(name="stabilityStatus", refs={String.class}, tree="[0]")
    private Output<String> stabilityStatus;

    /**
     * @return The stability status. This indicates whether the task set has reached a steady state.
     * 
     */
    public Output<String> stabilityStatus() {
        return this.stabilityStatus;
    }
    /**
     * The status of the task set.
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return The status of the task set.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * A map of tags to assign to the file system. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level. If you have set `copy_tags_to_backups` to true, and you specify one or more tags, no existing file system tags are copied from the file system to the backup.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the file system. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level. If you have set `copy_tags_to_backups` to true, and you specify one or more tags, no existing file system tags are copied from the file system to the backup.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @Export(name="tagsAll", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }
    /**
     * The family and revision (`family:revision`) or full ARN of the task definition that you want to run in your service.
     * 
     * The following arguments are optional:
     * 
     */
    @Export(name="taskDefinition", refs={String.class}, tree="[0]")
    private Output<String> taskDefinition;

    /**
     * @return The family and revision (`family:revision`) or full ARN of the task definition that you want to run in your service.
     * 
     * The following arguments are optional:
     * 
     */
    public Output<String> taskDefinition() {
        return this.taskDefinition;
    }
    /**
     * The ID of the task set.
     * 
     */
    @Export(name="taskSetId", refs={String.class}, tree="[0]")
    private Output<String> taskSetId;

    /**
     * @return The ID of the task set.
     * 
     */
    public Output<String> taskSetId() {
        return this.taskSetId;
    }
    /**
     * Whether the provider should wait until the task set has reached `STEADY_STATE`.
     * 
     */
    @Export(name="waitUntilStable", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> waitUntilStable;

    /**
     * @return Whether the provider should wait until the task set has reached `STEADY_STATE`.
     * 
     */
    public Output<Optional<Boolean>> waitUntilStable() {
        return Codegen.optional(this.waitUntilStable);
    }
    /**
     * Wait timeout for task set to reach `STEADY_STATE`. Valid time units include `ns`, `us` (or `µs`), `ms`, `s`, `m`, and `h`. Default `10m`.
     * 
     */
    @Export(name="waitUntilStableTimeout", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> waitUntilStableTimeout;

    /**
     * @return Wait timeout for task set to reach `STEADY_STATE`. Valid time units include `ns`, `us` (or `µs`), `ms`, `s`, `m`, and `h`. Default `10m`.
     * 
     */
    public Output<Optional<String>> waitUntilStableTimeout() {
        return Codegen.optional(this.waitUntilStableTimeout);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public TaskSet(String name) {
        this(name, TaskSetArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public TaskSet(String name, TaskSetArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TaskSet(String name, TaskSetArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ecs/taskSet:TaskSet", name, args == null ? TaskSetArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private TaskSet(String name, Output<String> id, @Nullable TaskSetState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ecs/taskSet:TaskSet", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static TaskSet get(String name, Output<String> id, @Nullable TaskSetState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new TaskSet(name, id, state, options);
    }
}

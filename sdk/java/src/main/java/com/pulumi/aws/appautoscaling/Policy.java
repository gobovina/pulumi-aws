// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appautoscaling;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.appautoscaling.PolicyArgs;
import com.pulumi.aws.appautoscaling.inputs.PolicyState;
import com.pulumi.aws.appautoscaling.outputs.PolicyStepScalingPolicyConfiguration;
import com.pulumi.aws.appautoscaling.outputs.PolicyTargetTrackingScalingPolicyConfiguration;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides an Application AutoScaling Policy resource.
 * 
 * ## Example Usage
 * 
 * ### DynamoDB Table Autoscaling
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.appautoscaling.Target;
 * import com.pulumi.aws.appautoscaling.TargetArgs;
 * import com.pulumi.aws.appautoscaling.Policy;
 * import com.pulumi.aws.appautoscaling.PolicyArgs;
 * import com.pulumi.aws.appautoscaling.inputs.PolicyTargetTrackingScalingPolicyConfigurationArgs;
 * import com.pulumi.aws.appautoscaling.inputs.PolicyTargetTrackingScalingPolicyConfigurationPredefinedMetricSpecificationArgs;
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
 *         var dynamodbTableReadTarget = new Target(&#34;dynamodbTableReadTarget&#34;, TargetArgs.builder()        
 *             .maxCapacity(100)
 *             .minCapacity(5)
 *             .resourceId(&#34;table/tableName&#34;)
 *             .scalableDimension(&#34;dynamodb:table:ReadCapacityUnits&#34;)
 *             .serviceNamespace(&#34;dynamodb&#34;)
 *             .build());
 * 
 *         var dynamodbTableReadPolicy = new Policy(&#34;dynamodbTableReadPolicy&#34;, PolicyArgs.builder()        
 *             .name(dynamodbTableReadTarget.resourceId().applyValue(resourceId -&gt; String.format(&#34;DynamoDBReadCapacityUtilization:%s&#34;, resourceId)))
 *             .policyType(&#34;TargetTrackingScaling&#34;)
 *             .resourceId(dynamodbTableReadTarget.resourceId())
 *             .scalableDimension(dynamodbTableReadTarget.scalableDimension())
 *             .serviceNamespace(dynamodbTableReadTarget.serviceNamespace())
 *             .targetTrackingScalingPolicyConfiguration(PolicyTargetTrackingScalingPolicyConfigurationArgs.builder()
 *                 .predefinedMetricSpecification(PolicyTargetTrackingScalingPolicyConfigurationPredefinedMetricSpecificationArgs.builder()
 *                     .predefinedMetricType(&#34;DynamoDBReadCapacityUtilization&#34;)
 *                     .build())
 *                 .targetValue(70)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### ECS Service Autoscaling
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### Preserve desired count when updating an autoscaled ECS Service
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.ecs.Service;
 * import com.pulumi.aws.ecs.ServiceArgs;
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
 *         var ecsService = new Service(&#34;ecsService&#34;, ServiceArgs.builder()        
 *             .name(&#34;serviceName&#34;)
 *             .cluster(&#34;clusterName&#34;)
 *             .taskDefinition(&#34;taskDefinitionFamily:1&#34;)
 *             .desiredCount(2)
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### Aurora Read Replica Autoscaling
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.appautoscaling.Target;
 * import com.pulumi.aws.appautoscaling.TargetArgs;
 * import com.pulumi.aws.appautoscaling.Policy;
 * import com.pulumi.aws.appautoscaling.PolicyArgs;
 * import com.pulumi.aws.appautoscaling.inputs.PolicyTargetTrackingScalingPolicyConfigurationArgs;
 * import com.pulumi.aws.appautoscaling.inputs.PolicyTargetTrackingScalingPolicyConfigurationPredefinedMetricSpecificationArgs;
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
 *         var replicas = new Target(&#34;replicas&#34;, TargetArgs.builder()        
 *             .serviceNamespace(&#34;rds&#34;)
 *             .scalableDimension(&#34;rds:cluster:ReadReplicaCount&#34;)
 *             .resourceId(String.format(&#34;cluster:%s&#34;, example.id()))
 *             .minCapacity(1)
 *             .maxCapacity(15)
 *             .build());
 * 
 *         var replicasPolicy = new Policy(&#34;replicasPolicy&#34;, PolicyArgs.builder()        
 *             .name(&#34;cpu-auto-scaling&#34;)
 *             .serviceNamespace(replicas.serviceNamespace())
 *             .scalableDimension(replicas.scalableDimension())
 *             .resourceId(replicas.resourceId())
 *             .policyType(&#34;TargetTrackingScaling&#34;)
 *             .targetTrackingScalingPolicyConfiguration(PolicyTargetTrackingScalingPolicyConfigurationArgs.builder()
 *                 .predefinedMetricSpecification(PolicyTargetTrackingScalingPolicyConfigurationPredefinedMetricSpecificationArgs.builder()
 *                     .predefinedMetricType(&#34;RDSReaderAverageCPUUtilization&#34;)
 *                     .build())
 *                 .targetValue(75)
 *                 .scaleInCooldown(300)
 *                 .scaleOutCooldown(300)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### Create target tracking scaling policy using metric math
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.appautoscaling.Target;
 * import com.pulumi.aws.appautoscaling.TargetArgs;
 * import com.pulumi.aws.appautoscaling.Policy;
 * import com.pulumi.aws.appautoscaling.PolicyArgs;
 * import com.pulumi.aws.appautoscaling.inputs.PolicyTargetTrackingScalingPolicyConfigurationArgs;
 * import com.pulumi.aws.appautoscaling.inputs.PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationArgs;
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
 *         var ecsTarget = new Target(&#34;ecsTarget&#34;, TargetArgs.builder()        
 *             .maxCapacity(4)
 *             .minCapacity(1)
 *             .resourceId(&#34;service/clusterName/serviceName&#34;)
 *             .scalableDimension(&#34;ecs:service:DesiredCount&#34;)
 *             .serviceNamespace(&#34;ecs&#34;)
 *             .build());
 * 
 *         var example = new Policy(&#34;example&#34;, PolicyArgs.builder()        
 *             .name(&#34;foo&#34;)
 *             .policyType(&#34;TargetTrackingScaling&#34;)
 *             .resourceId(ecsTarget.resourceId())
 *             .scalableDimension(ecsTarget.scalableDimension())
 *             .serviceNamespace(ecsTarget.serviceNamespace())
 *             .targetTrackingScalingPolicyConfiguration(PolicyTargetTrackingScalingPolicyConfigurationArgs.builder()
 *                 .targetValue(100)
 *                 .customizedMetricSpecification(PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationArgs.builder()
 *                     .metrics(                    
 *                         PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationMetricArgs.builder()
 *                             .label(&#34;Get the queue size (the number of messages waiting to be processed)&#34;)
 *                             .id(&#34;m1&#34;)
 *                             .metricStat(PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationMetricMetricStatArgs.builder()
 *                                 .metric(PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationMetricMetricStatMetricArgs.builder()
 *                                     .metricName(&#34;ApproximateNumberOfMessagesVisible&#34;)
 *                                     .namespace(&#34;AWS/SQS&#34;)
 *                                     .dimensions(PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationMetricMetricStatMetricDimensionArgs.builder()
 *                                         .name(&#34;QueueName&#34;)
 *                                         .value(&#34;my-queue&#34;)
 *                                         .build())
 *                                     .build())
 *                                 .stat(&#34;Sum&#34;)
 *                                 .build())
 *                             .returnData(false)
 *                             .build(),
 *                         PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationMetricArgs.builder()
 *                             .label(&#34;Get the ECS running task count (the number of currently running tasks)&#34;)
 *                             .id(&#34;m2&#34;)
 *                             .metricStat(PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationMetricMetricStatArgs.builder()
 *                                 .metric(PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationMetricMetricStatMetricArgs.builder()
 *                                     .metricName(&#34;RunningTaskCount&#34;)
 *                                     .namespace(&#34;ECS/ContainerInsights&#34;)
 *                                     .dimensions(                                    
 *                                         PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationMetricMetricStatMetricDimensionArgs.builder()
 *                                             .name(&#34;ClusterName&#34;)
 *                                             .value(&#34;default&#34;)
 *                                             .build(),
 *                                         PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationMetricMetricStatMetricDimensionArgs.builder()
 *                                             .name(&#34;ServiceName&#34;)
 *                                             .value(&#34;web-app&#34;)
 *                                             .build())
 *                                     .build())
 *                                 .stat(&#34;Average&#34;)
 *                                 .build())
 *                             .returnData(false)
 *                             .build(),
 *                         PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationMetricArgs.builder()
 *                             .label(&#34;Calculate the backlog per instance&#34;)
 *                             .id(&#34;e1&#34;)
 *                             .expression(&#34;m1 / m2&#34;)
 *                             .returnData(true)
 *                             .build())
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### MSK / Kafka Autoscaling
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.appautoscaling.Target;
 * import com.pulumi.aws.appautoscaling.TargetArgs;
 * import com.pulumi.aws.appautoscaling.Policy;
 * import com.pulumi.aws.appautoscaling.PolicyArgs;
 * import com.pulumi.aws.appautoscaling.inputs.PolicyTargetTrackingScalingPolicyConfigurationArgs;
 * import com.pulumi.aws.appautoscaling.inputs.PolicyTargetTrackingScalingPolicyConfigurationPredefinedMetricSpecificationArgs;
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
 *         var mskTarget = new Target(&#34;mskTarget&#34;, TargetArgs.builder()        
 *             .serviceNamespace(&#34;kafka&#34;)
 *             .scalableDimension(&#34;kafka:broker-storage:VolumeSize&#34;)
 *             .resourceId(example.arn())
 *             .minCapacity(1)
 *             .maxCapacity(8)
 *             .build());
 * 
 *         var targets = new Policy(&#34;targets&#34;, PolicyArgs.builder()        
 *             .name(&#34;storage-size-auto-scaling&#34;)
 *             .serviceNamespace(mskTarget.serviceNamespace())
 *             .scalableDimension(mskTarget.scalableDimension())
 *             .resourceId(mskTarget.resourceId())
 *             .policyType(&#34;TargetTrackingScaling&#34;)
 *             .targetTrackingScalingPolicyConfiguration(PolicyTargetTrackingScalingPolicyConfigurationArgs.builder()
 *                 .predefinedMetricSpecification(PolicyTargetTrackingScalingPolicyConfigurationPredefinedMetricSpecificationArgs.builder()
 *                     .predefinedMetricType(&#34;KafkaBrokerStorageUtilization&#34;)
 *                     .build())
 *                 .targetValue(55)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Using `pulumi import`, import Application AutoScaling Policy using the `service-namespace` , `resource-id`, `scalable-dimension` and `policy-name` separated by `/`. For example:
 * 
 * ```sh
 * $ pulumi import aws:appautoscaling/policy:Policy test-policy service-namespace/resource-id/scalable-dimension/policy-name
 * ```
 * 
 */
@ResourceType(type="aws:appautoscaling/policy:Policy")
public class Policy extends com.pulumi.resources.CustomResource {
    /**
     * List of CloudWatch alarm ARNs associated with the scaling policy.
     * 
     */
    @Export(name="alarmArns", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> alarmArns;

    /**
     * @return List of CloudWatch alarm ARNs associated with the scaling policy.
     * 
     */
    public Output<List<String>> alarmArns() {
        return this.alarmArns;
    }
    /**
     * ARN assigned by AWS to the scaling policy.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return ARN assigned by AWS to the scaling policy.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * Name of the policy. Must be between 1 and 255 characters in length.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of the policy. Must be between 1 and 255 characters in length.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Policy type. Valid values are `StepScaling` and `TargetTrackingScaling`. Defaults to `StepScaling`. Certain services only support only one policy type. For more information see the [Target Tracking Scaling Policies](https://docs.aws.amazon.com/autoscaling/application/userguide/application-auto-scaling-target-tracking.html) and [Step Scaling Policies](https://docs.aws.amazon.com/autoscaling/application/userguide/application-auto-scaling-step-scaling-policies.html) documentation.
     * 
     */
    @Export(name="policyType", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> policyType;

    /**
     * @return Policy type. Valid values are `StepScaling` and `TargetTrackingScaling`. Defaults to `StepScaling`. Certain services only support only one policy type. For more information see the [Target Tracking Scaling Policies](https://docs.aws.amazon.com/autoscaling/application/userguide/application-auto-scaling-target-tracking.html) and [Step Scaling Policies](https://docs.aws.amazon.com/autoscaling/application/userguide/application-auto-scaling-step-scaling-policies.html) documentation.
     * 
     */
    public Output<Optional<String>> policyType() {
        return Codegen.optional(this.policyType);
    }
    /**
     * Resource type and unique identifier string for the resource associated with the scaling policy. Documentation can be found in the `ResourceId` parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/application/APIReference/API_RegisterScalableTarget.html)
     * 
     */
    @Export(name="resourceId", refs={String.class}, tree="[0]")
    private Output<String> resourceId;

    /**
     * @return Resource type and unique identifier string for the resource associated with the scaling policy. Documentation can be found in the `ResourceId` parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/application/APIReference/API_RegisterScalableTarget.html)
     * 
     */
    public Output<String> resourceId() {
        return this.resourceId;
    }
    /**
     * Scalable dimension of the scalable target. Documentation can be found in the `ScalableDimension` parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/application/APIReference/API_RegisterScalableTarget.html)
     * 
     */
    @Export(name="scalableDimension", refs={String.class}, tree="[0]")
    private Output<String> scalableDimension;

    /**
     * @return Scalable dimension of the scalable target. Documentation can be found in the `ScalableDimension` parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/application/APIReference/API_RegisterScalableTarget.html)
     * 
     */
    public Output<String> scalableDimension() {
        return this.scalableDimension;
    }
    /**
     * AWS service namespace of the scalable target. Documentation can be found in the `ServiceNamespace` parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/application/APIReference/API_RegisterScalableTarget.html)
     * 
     */
    @Export(name="serviceNamespace", refs={String.class}, tree="[0]")
    private Output<String> serviceNamespace;

    /**
     * @return AWS service namespace of the scalable target. Documentation can be found in the `ServiceNamespace` parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/application/APIReference/API_RegisterScalableTarget.html)
     * 
     */
    public Output<String> serviceNamespace() {
        return this.serviceNamespace;
    }
    /**
     * Step scaling policy configuration, requires `policy_type = &#34;StepScaling&#34;` (default). See supported fields below.
     * 
     */
    @Export(name="stepScalingPolicyConfiguration", refs={PolicyStepScalingPolicyConfiguration.class}, tree="[0]")
    private Output</* @Nullable */ PolicyStepScalingPolicyConfiguration> stepScalingPolicyConfiguration;

    /**
     * @return Step scaling policy configuration, requires `policy_type = &#34;StepScaling&#34;` (default). See supported fields below.
     * 
     */
    public Output<Optional<PolicyStepScalingPolicyConfiguration>> stepScalingPolicyConfiguration() {
        return Codegen.optional(this.stepScalingPolicyConfiguration);
    }
    /**
     * Target tracking policy, requires `policy_type = &#34;TargetTrackingScaling&#34;`. See supported fields below.
     * 
     */
    @Export(name="targetTrackingScalingPolicyConfiguration", refs={PolicyTargetTrackingScalingPolicyConfiguration.class}, tree="[0]")
    private Output</* @Nullable */ PolicyTargetTrackingScalingPolicyConfiguration> targetTrackingScalingPolicyConfiguration;

    /**
     * @return Target tracking policy, requires `policy_type = &#34;TargetTrackingScaling&#34;`. See supported fields below.
     * 
     */
    public Output<Optional<PolicyTargetTrackingScalingPolicyConfiguration>> targetTrackingScalingPolicyConfiguration() {
        return Codegen.optional(this.targetTrackingScalingPolicyConfiguration);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Policy(String name) {
        this(name, PolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Policy(String name, PolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Policy(String name, PolicyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:appautoscaling/policy:Policy", name, args == null ? PolicyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Policy(String name, Output<String> id, @Nullable PolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:appautoscaling/policy:Policy", name, state, makeResourceOptions(options, id));
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
    public static Policy get(String name, Output<String> id, @Nullable PolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Policy(name, id, state, options);
    }
}

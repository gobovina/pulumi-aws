// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.lb;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.lb.TargetGroupArgs;
import com.pulumi.aws.lb.inputs.TargetGroupState;
import com.pulumi.aws.lb.outputs.TargetGroupHealthCheck;
import com.pulumi.aws.lb.outputs.TargetGroupStickiness;
import com.pulumi.aws.lb.outputs.TargetGroupTargetFailover;
import com.pulumi.aws.lb.outputs.TargetGroupTargetHealthState;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Target Group resource for use with Load Balancer resources.
 * 
 * &gt; **Note:** `aws.alb.TargetGroup` is known as `aws.lb.TargetGroup`. The functionality is identical.
 * 
 * ## Example Usage
 * ### Instance Target Group
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.ec2.Vpc;
 * import com.pulumi.aws.ec2.VpcArgs;
 * import com.pulumi.aws.lb.TargetGroup;
 * import com.pulumi.aws.lb.TargetGroupArgs;
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
 *         var main = new Vpc(&#34;main&#34;, VpcArgs.builder()        
 *             .cidrBlock(&#34;10.0.0.0/16&#34;)
 *             .build());
 * 
 *         var test = new TargetGroup(&#34;test&#34;, TargetGroupArgs.builder()        
 *             .port(80)
 *             .protocol(&#34;HTTP&#34;)
 *             .vpcId(main.id())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### IP Target Group
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.ec2.Vpc;
 * import com.pulumi.aws.ec2.VpcArgs;
 * import com.pulumi.aws.lb.TargetGroup;
 * import com.pulumi.aws.lb.TargetGroupArgs;
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
 *         var main = new Vpc(&#34;main&#34;, VpcArgs.builder()        
 *             .cidrBlock(&#34;10.0.0.0/16&#34;)
 *             .build());
 * 
 *         var ip_example = new TargetGroup(&#34;ip-example&#34;, TargetGroupArgs.builder()        
 *             .port(80)
 *             .protocol(&#34;HTTP&#34;)
 *             .targetType(&#34;ip&#34;)
 *             .vpcId(main.id())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Lambda Target Group
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.lb.TargetGroup;
 * import com.pulumi.aws.lb.TargetGroupArgs;
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
 *         var lambda_example = new TargetGroup(&#34;lambda-example&#34;, TargetGroupArgs.builder()        
 *             .targetType(&#34;lambda&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### ALB Target Group
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.lb.TargetGroup;
 * import com.pulumi.aws.lb.TargetGroupArgs;
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
 *         var alb_example = new TargetGroup(&#34;alb-example&#34;, TargetGroupArgs.builder()        
 *             .targetType(&#34;alb&#34;)
 *             .port(80)
 *             .protocol(&#34;TCP&#34;)
 *             .vpcId(aws_vpc.main().id())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Target group with unhealthy connection termination disabled
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.lb.TargetGroup;
 * import com.pulumi.aws.lb.TargetGroupArgs;
 * import com.pulumi.aws.lb.inputs.TargetGroupTargetHealthStateArgs;
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
 *         var tcp_example = new TargetGroup(&#34;tcp-example&#34;, TargetGroupArgs.builder()        
 *             .port(25)
 *             .protocol(&#34;TCP&#34;)
 *             .vpcId(aws_vpc.main().id())
 *             .targetHealthStates(TargetGroupTargetHealthStateArgs.builder()
 *                 .enableUnhealthyConnectionTermination(false)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import Target Groups using their ARN. For example:
 * 
 * ```sh
 *  $ pulumi import aws:lb/targetGroup:TargetGroup app_front_end arn:aws:elasticloadbalancing:us-west-2:187416307283:targetgroup/app-front-end/20cfe21448b66314
 * ```
 * 
 */
@ResourceType(type="aws:lb/targetGroup:TargetGroup")
public class TargetGroup extends com.pulumi.resources.CustomResource {
    /**
     * ARN of the Target Group (matches `id`).
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return ARN of the Target Group (matches `id`).
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * ARN suffix for use with CloudWatch Metrics.
     * 
     */
    @Export(name="arnSuffix", refs={String.class}, tree="[0]")
    private Output<String> arnSuffix;

    /**
     * @return ARN suffix for use with CloudWatch Metrics.
     * 
     */
    public Output<String> arnSuffix() {
        return this.arnSuffix;
    }
    /**
     * Whether to terminate connections at the end of the deregistration timeout on Network Load Balancers. See [doc](https://docs.aws.amazon.com/elasticloadbalancing/latest/network/load-balancer-target-groups.html#deregistration-delay) for more information. Default is `false`.
     * 
     */
    @Export(name="connectionTermination", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> connectionTermination;

    /**
     * @return Whether to terminate connections at the end of the deregistration timeout on Network Load Balancers. See [doc](https://docs.aws.amazon.com/elasticloadbalancing/latest/network/load-balancer-target-groups.html#deregistration-delay) for more information. Default is `false`.
     * 
     */
    public Output<Boolean> connectionTermination() {
        return this.connectionTermination;
    }
    /**
     * Amount time for Elastic Load Balancing to wait before changing the state of a deregistering target from draining to unused. The range is 0-3600 seconds. The default value is 300 seconds.
     * 
     */
    @Export(name="deregistrationDelay", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> deregistrationDelay;

    /**
     * @return Amount time for Elastic Load Balancing to wait before changing the state of a deregistering target from draining to unused. The range is 0-3600 seconds. The default value is 300 seconds.
     * 
     */
    public Output<Optional<Integer>> deregistrationDelay() {
        return Codegen.optional(this.deregistrationDelay);
    }
    /**
     * Health Check configuration block. Detailed below.
     * 
     */
    @Export(name="healthCheck", refs={TargetGroupHealthCheck.class}, tree="[0]")
    private Output<TargetGroupHealthCheck> healthCheck;

    /**
     * @return Health Check configuration block. Detailed below.
     * 
     */
    public Output<TargetGroupHealthCheck> healthCheck() {
        return this.healthCheck;
    }
    /**
     * The type of IP addresses used by the target group, only supported when target type is set to `ip`. Possible values are `ipv4` or `ipv6`.
     * 
     */
    @Export(name="ipAddressType", refs={String.class}, tree="[0]")
    private Output<String> ipAddressType;

    /**
     * @return The type of IP addresses used by the target group, only supported when target type is set to `ip`. Possible values are `ipv4` or `ipv6`.
     * 
     */
    public Output<String> ipAddressType() {
        return this.ipAddressType;
    }
    /**
     * Whether the request and response headers exchanged between the load balancer and the Lambda function include arrays of values or strings. Only applies when `target_type` is `lambda`. Default is `false`.
     * 
     */
    @Export(name="lambdaMultiValueHeadersEnabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> lambdaMultiValueHeadersEnabled;

    /**
     * @return Whether the request and response headers exchanged between the load balancer and the Lambda function include arrays of values or strings. Only applies when `target_type` is `lambda`. Default is `false`.
     * 
     */
    public Output<Optional<Boolean>> lambdaMultiValueHeadersEnabled() {
        return Codegen.optional(this.lambdaMultiValueHeadersEnabled);
    }
    /**
     * Determines how the load balancer selects targets when routing requests. Only applicable for Application Load Balancer Target Groups. The value is `round_robin`, `least_outstanding_requests`, or `weighted_random`. The default is `round_robin`.
     * 
     */
    @Export(name="loadBalancingAlgorithmType", refs={String.class}, tree="[0]")
    private Output<String> loadBalancingAlgorithmType;

    /**
     * @return Determines how the load balancer selects targets when routing requests. Only applicable for Application Load Balancer Target Groups. The value is `round_robin`, `least_outstanding_requests`, or `weighted_random`. The default is `round_robin`.
     * 
     */
    public Output<String> loadBalancingAlgorithmType() {
        return this.loadBalancingAlgorithmType;
    }
    /**
     * Determines whether to enable target anomaly mitigation.  Target anomaly mitigation is only supported by the `weighted_random` load balancing algorithm type.  See [doc](https://docs.aws.amazon.com/elasticloadbalancing/latest/application/load-balancer-target-groups.html#automatic-target-weights) for more information.  The value is `&#34;on&#34;` or `&#34;off&#34;`. The default is `&#34;off&#34;`.
     * 
     */
    @Export(name="loadBalancingAnomalyMitigation", refs={String.class}, tree="[0]")
    private Output<String> loadBalancingAnomalyMitigation;

    /**
     * @return Determines whether to enable target anomaly mitigation.  Target anomaly mitigation is only supported by the `weighted_random` load balancing algorithm type.  See [doc](https://docs.aws.amazon.com/elasticloadbalancing/latest/application/load-balancer-target-groups.html#automatic-target-weights) for more information.  The value is `&#34;on&#34;` or `&#34;off&#34;`. The default is `&#34;off&#34;`.
     * 
     */
    public Output<String> loadBalancingAnomalyMitigation() {
        return this.loadBalancingAnomalyMitigation;
    }
    /**
     * Indicates whether cross zone load balancing is enabled. The value is `&#34;true&#34;`, `&#34;false&#34;` or `&#34;use_load_balancer_configuration&#34;`. The default is `&#34;use_load_balancer_configuration&#34;`.
     * 
     */
    @Export(name="loadBalancingCrossZoneEnabled", refs={String.class}, tree="[0]")
    private Output<String> loadBalancingCrossZoneEnabled;

    /**
     * @return Indicates whether cross zone load balancing is enabled. The value is `&#34;true&#34;`, `&#34;false&#34;` or `&#34;use_load_balancer_configuration&#34;`. The default is `&#34;use_load_balancer_configuration&#34;`.
     * 
     */
    public Output<String> loadBalancingCrossZoneEnabled() {
        return this.loadBalancingCrossZoneEnabled;
    }
    /**
     * Name of the target group. If omitted, this provider will assign a random, unique name. This name must be unique per region per account, can have a maximum of 32 characters, must contain only alphanumeric characters or hyphens, and must not begin or end with a hyphen.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of the target group. If omitted, this provider will assign a random, unique name. This name must be unique per region per account, can have a maximum of 32 characters, must contain only alphanumeric characters or hyphens, and must not begin or end with a hyphen.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Creates a unique name beginning with the specified prefix. Conflicts with `name`. Cannot be longer than 6 characters.
     * 
     */
    @Export(name="namePrefix", refs={String.class}, tree="[0]")
    private Output<String> namePrefix;

    /**
     * @return Creates a unique name beginning with the specified prefix. Conflicts with `name`. Cannot be longer than 6 characters.
     * 
     */
    public Output<String> namePrefix() {
        return this.namePrefix;
    }
    /**
     * Port on which targets receive traffic, unless overridden when registering a specific target. Required when `target_type` is `instance`, `ip` or `alb`. Does not apply when `target_type` is `lambda`.
     * 
     */
    @Export(name="port", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> port;

    /**
     * @return Port on which targets receive traffic, unless overridden when registering a specific target. Required when `target_type` is `instance`, `ip` or `alb`. Does not apply when `target_type` is `lambda`.
     * 
     */
    public Output<Optional<Integer>> port() {
        return Codegen.optional(this.port);
    }
    /**
     * Whether client IP preservation is enabled. See [doc](https://docs.aws.amazon.com/elasticloadbalancing/latest/network/load-balancer-target-groups.html#client-ip-preservation) for more information.
     * 
     */
    @Export(name="preserveClientIp", refs={String.class}, tree="[0]")
    private Output<String> preserveClientIp;

    /**
     * @return Whether client IP preservation is enabled. See [doc](https://docs.aws.amazon.com/elasticloadbalancing/latest/network/load-balancer-target-groups.html#client-ip-preservation) for more information.
     * 
     */
    public Output<String> preserveClientIp() {
        return this.preserveClientIp;
    }
    /**
     * Protocol to use for routing traffic to the targets.
     * Should be one of `GENEVE`, `HTTP`, `HTTPS`, `TCP`, `TCP_UDP`, `TLS`, or `UDP`.
     * Required when `target_type` is `instance`, `ip`, or `alb`.
     * Does not apply when `target_type` is `lambda`.
     * 
     */
    @Export(name="protocol", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> protocol;

    /**
     * @return Protocol to use for routing traffic to the targets.
     * Should be one of `GENEVE`, `HTTP`, `HTTPS`, `TCP`, `TCP_UDP`, `TLS`, or `UDP`.
     * Required when `target_type` is `instance`, `ip`, or `alb`.
     * Does not apply when `target_type` is `lambda`.
     * 
     */
    public Output<Optional<String>> protocol() {
        return Codegen.optional(this.protocol);
    }
    /**
     * Only applicable when `protocol` is `HTTP` or `HTTPS`. The protocol version. Specify `GRPC` to send requests to targets using gRPC. Specify `HTTP2` to send requests to targets using HTTP/2. The default is `HTTP1`, which sends requests to targets using HTTP/1.1
     * 
     */
    @Export(name="protocolVersion", refs={String.class}, tree="[0]")
    private Output<String> protocolVersion;

    /**
     * @return Only applicable when `protocol` is `HTTP` or `HTTPS`. The protocol version. Specify `GRPC` to send requests to targets using gRPC. Specify `HTTP2` to send requests to targets using HTTP/2. The default is `HTTP1`, which sends requests to targets using HTTP/1.1
     * 
     */
    public Output<String> protocolVersion() {
        return this.protocolVersion;
    }
    /**
     * Whether to enable support for proxy protocol v2 on Network Load Balancers. See [doc](https://docs.aws.amazon.com/elasticloadbalancing/latest/network/load-balancer-target-groups.html#proxy-protocol) for more information. Default is `false`.
     * 
     */
    @Export(name="proxyProtocolV2", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> proxyProtocolV2;

    /**
     * @return Whether to enable support for proxy protocol v2 on Network Load Balancers. See [doc](https://docs.aws.amazon.com/elasticloadbalancing/latest/network/load-balancer-target-groups.html#proxy-protocol) for more information. Default is `false`.
     * 
     */
    public Output<Optional<Boolean>> proxyProtocolV2() {
        return Codegen.optional(this.proxyProtocolV2);
    }
    /**
     * Amount time for targets to warm up before the load balancer sends them a full share of requests. The range is 30-900 seconds or 0 to disable. The default value is 0 seconds.
     * 
     */
    @Export(name="slowStart", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> slowStart;

    /**
     * @return Amount time for targets to warm up before the load balancer sends them a full share of requests. The range is 30-900 seconds or 0 to disable. The default value is 0 seconds.
     * 
     */
    public Output<Optional<Integer>> slowStart() {
        return Codegen.optional(this.slowStart);
    }
    /**
     * Stickiness configuration block. Detailed below.
     * 
     */
    @Export(name="stickiness", refs={TargetGroupStickiness.class}, tree="[0]")
    private Output<TargetGroupStickiness> stickiness;

    /**
     * @return Stickiness configuration block. Detailed below.
     * 
     */
    public Output<TargetGroupStickiness> stickiness() {
        return this.stickiness;
    }
    /**
     * Map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     * @deprecated
     * Please use `tags` instead.
     * 
     */
    @Deprecated /* Please use `tags` instead. */
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
     * Target failover block. Only applicable for Gateway Load Balancer target groups. See target_failover for more information.
     * 
     */
    @Export(name="targetFailovers", refs={List.class,TargetGroupTargetFailover.class}, tree="[0,1]")
    private Output<List<TargetGroupTargetFailover>> targetFailovers;

    /**
     * @return Target failover block. Only applicable for Gateway Load Balancer target groups. See target_failover for more information.
     * 
     */
    public Output<List<TargetGroupTargetFailover>> targetFailovers() {
        return this.targetFailovers;
    }
    /**
     * Target health state block. Only applicable for Network Load Balancer target groups when `protocol` is `TCP` or `TLS`. See target_health_state for more information.
     * 
     */
    @Export(name="targetHealthStates", refs={List.class,TargetGroupTargetHealthState.class}, tree="[0,1]")
    private Output<List<TargetGroupTargetHealthState>> targetHealthStates;

    /**
     * @return Target health state block. Only applicable for Network Load Balancer target groups when `protocol` is `TCP` or `TLS`. See target_health_state for more information.
     * 
     */
    public Output<List<TargetGroupTargetHealthState>> targetHealthStates() {
        return this.targetHealthStates;
    }
    /**
     * Type of target that you must specify when registering targets with this target group.
     * See [doc](https://docs.aws.amazon.com/elasticloadbalancing/latest/APIReference/API_CreateTargetGroup.html) for supported values.
     * The default is `instance`.
     * 
     * Note that you can&#39;t specify targets for a target group using both instance IDs and IP addresses.
     * 
     * If the target type is `ip`, specify IP addresses from the subnets of the virtual private cloud (VPC) for the target group, the RFC 1918 range (10.0.0.0/8, 172.16.0.0/12, and 192.168.0.0/16), and the RFC 6598 range (100.64.0.0/10). You can&#39;t specify publicly routable IP addresses.
     * 
     * Network Load Balancers do not support the `lambda` target type.
     * 
     * Application Load Balancers do not support the `alb` target type.
     * 
     */
    @Export(name="targetType", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> targetType;

    /**
     * @return Type of target that you must specify when registering targets with this target group.
     * See [doc](https://docs.aws.amazon.com/elasticloadbalancing/latest/APIReference/API_CreateTargetGroup.html) for supported values.
     * The default is `instance`.
     * 
     * Note that you can&#39;t specify targets for a target group using both instance IDs and IP addresses.
     * 
     * If the target type is `ip`, specify IP addresses from the subnets of the virtual private cloud (VPC) for the target group, the RFC 1918 range (10.0.0.0/8, 172.16.0.0/12, and 192.168.0.0/16), and the RFC 6598 range (100.64.0.0/10). You can&#39;t specify publicly routable IP addresses.
     * 
     * Network Load Balancers do not support the `lambda` target type.
     * 
     * Application Load Balancers do not support the `alb` target type.
     * 
     */
    public Output<Optional<String>> targetType() {
        return Codegen.optional(this.targetType);
    }
    /**
     * Identifier of the VPC in which to create the target group. Required when `target_type` is `instance`, `ip` or `alb`. Does not apply when `target_type` is `lambda`.
     * 
     */
    @Export(name="vpcId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> vpcId;

    /**
     * @return Identifier of the VPC in which to create the target group. Required when `target_type` is `instance`, `ip` or `alb`. Does not apply when `target_type` is `lambda`.
     * 
     */
    public Output<Optional<String>> vpcId() {
        return Codegen.optional(this.vpcId);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public TargetGroup(String name) {
        this(name, TargetGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public TargetGroup(String name, @Nullable TargetGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TargetGroup(String name, @Nullable TargetGroupArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:lb/targetGroup:TargetGroup", name, args == null ? TargetGroupArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private TargetGroup(String name, Output<String> id, @Nullable TargetGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:lb/targetGroup:TargetGroup", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("aws:elasticloadbalancingv2/targetGroup:TargetGroup").build())
            ))
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
    public static TargetGroup get(String name, Output<String> id, @Nullable TargetGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new TargetGroup(name, id, state, options);
    }
}

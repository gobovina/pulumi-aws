// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudwatch;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.cloudwatch.EventEndpointArgs;
import com.pulumi.aws.cloudwatch.inputs.EventEndpointState;
import com.pulumi.aws.cloudwatch.outputs.EventEndpointEventBus;
import com.pulumi.aws.cloudwatch.outputs.EventEndpointReplicationConfig;
import com.pulumi.aws.cloudwatch.outputs.EventEndpointRoutingConfig;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a resource to create an EventBridge Global Endpoint.
 * 
 * &gt; **Note:** EventBridge was formerly known as CloudWatch Events. The functionality is identical.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.cloudwatch.EventEndpoint;
 * import com.pulumi.aws.cloudwatch.EventEndpointArgs;
 * import com.pulumi.aws.cloudwatch.inputs.EventEndpointEventBusArgs;
 * import com.pulumi.aws.cloudwatch.inputs.EventEndpointReplicationConfigArgs;
 * import com.pulumi.aws.cloudwatch.inputs.EventEndpointRoutingConfigArgs;
 * import com.pulumi.aws.cloudwatch.inputs.EventEndpointRoutingConfigFailoverConfigArgs;
 * import com.pulumi.aws.cloudwatch.inputs.EventEndpointRoutingConfigFailoverConfigPrimaryArgs;
 * import com.pulumi.aws.cloudwatch.inputs.EventEndpointRoutingConfigFailoverConfigSecondaryArgs;
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
 *         var this_ = new EventEndpoint(&#34;this&#34;, EventEndpointArgs.builder()        
 *             .roleArn(aws_iam_role.replication().arn())
 *             .eventBuses(            
 *                 EventEndpointEventBusArgs.builder()
 *                     .eventBusArn(aws_cloudwatch_event_bus.primary().arn())
 *                     .build(),
 *                 EventEndpointEventBusArgs.builder()
 *                     .eventBusArn(aws_cloudwatch_event_bus.secondary().arn())
 *                     .build())
 *             .replicationConfig(EventEndpointReplicationConfigArgs.builder()
 *                 .state(&#34;DISABLED&#34;)
 *                 .build())
 *             .routingConfig(EventEndpointRoutingConfigArgs.builder()
 *                 .failoverConfig(EventEndpointRoutingConfigFailoverConfigArgs.builder()
 *                     .primary(EventEndpointRoutingConfigFailoverConfigPrimaryArgs.builder()
 *                         .healthCheck(aws_route53_health_check.primary().arn())
 *                         .build())
 *                     .secondary(EventEndpointRoutingConfigFailoverConfigSecondaryArgs.builder()
 *                         .route(&#34;us-east-2&#34;)
 *                         .build())
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import EventBridge Global Endpoints using the `name`. For example:
 * 
 * ```sh
 *  $ pulumi import aws:cloudwatch/eventEndpoint:EventEndpoint imported_endpoint example-endpoint
 * ```
 * 
 */
@ResourceType(type="aws:cloudwatch/eventEndpoint:EventEndpoint")
public class EventEndpoint extends com.pulumi.resources.CustomResource {
    /**
     * The ARN of the endpoint that was created.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return The ARN of the endpoint that was created.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * A description of the global endpoint.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return A description of the global endpoint.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The URL of the endpoint that was created.
     * 
     */
    @Export(name="endpointUrl", refs={String.class}, tree="[0]")
    private Output<String> endpointUrl;

    /**
     * @return The URL of the endpoint that was created.
     * 
     */
    public Output<String> endpointUrl() {
        return this.endpointUrl;
    }
    /**
     * The event buses to use. The names of the event buses must be identical in each Region. Exactly two event buses are required. Documented below.
     * 
     */
    @Export(name="eventBuses", refs={List.class,EventEndpointEventBus.class}, tree="[0,1]")
    private Output<List<EventEndpointEventBus>> eventBuses;

    /**
     * @return The event buses to use. The names of the event buses must be identical in each Region. Exactly two event buses are required. Documented below.
     * 
     */
    public Output<List<EventEndpointEventBus>> eventBuses() {
        return this.eventBuses;
    }
    /**
     * The name of the global endpoint.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the global endpoint.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Parameters used for replication. Documented below.
     * 
     */
    @Export(name="replicationConfig", refs={EventEndpointReplicationConfig.class}, tree="[0]")
    private Output</* @Nullable */ EventEndpointReplicationConfig> replicationConfig;

    /**
     * @return Parameters used for replication. Documented below.
     * 
     */
    public Output<Optional<EventEndpointReplicationConfig>> replicationConfig() {
        return Codegen.optional(this.replicationConfig);
    }
    /**
     * The ARN of the IAM role used for replication between event buses.
     * 
     */
    @Export(name="roleArn", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> roleArn;

    /**
     * @return The ARN of the IAM role used for replication between event buses.
     * 
     */
    public Output<Optional<String>> roleArn() {
        return Codegen.optional(this.roleArn);
    }
    /**
     * Parameters used for routing, including the health check and secondary Region. Documented below.
     * 
     */
    @Export(name="routingConfig", refs={EventEndpointRoutingConfig.class}, tree="[0]")
    private Output<EventEndpointRoutingConfig> routingConfig;

    /**
     * @return Parameters used for routing, including the health check and secondary Region. Documented below.
     * 
     */
    public Output<EventEndpointRoutingConfig> routingConfig() {
        return this.routingConfig;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public EventEndpoint(String name) {
        this(name, EventEndpointArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public EventEndpoint(String name, EventEndpointArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public EventEndpoint(String name, EventEndpointArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:cloudwatch/eventEndpoint:EventEndpoint", name, args == null ? EventEndpointArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private EventEndpoint(String name, Output<String> id, @Nullable EventEndpointState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:cloudwatch/eventEndpoint:EventEndpoint", name, state, makeResourceOptions(options, id));
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
    public static EventEndpoint get(String name, Output<String> id, @Nullable EventEndpointState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new EventEndpoint(name, id, state, options);
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.redshift;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.redshift.EventSubscriptionArgs;
import com.pulumi.aws.redshift.inputs.EventSubscriptionState;
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
 * Provides a Redshift event subscription resource.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.redshift.Cluster;
 * import com.pulumi.aws.redshift.ClusterArgs;
 * import com.pulumi.aws.sns.Topic;
 * import com.pulumi.aws.redshift.EventSubscription;
 * import com.pulumi.aws.redshift.EventSubscriptionArgs;
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
 *         var defaultCluster = new Cluster(&#34;defaultCluster&#34;, ClusterArgs.builder()        
 *             .clusterIdentifier(&#34;default&#34;)
 *             .databaseName(&#34;default&#34;)
 *             .build());
 * 
 *         var defaultTopic = new Topic(&#34;defaultTopic&#34;);
 * 
 *         var defaultEventSubscription = new EventSubscription(&#34;defaultEventSubscription&#34;, EventSubscriptionArgs.builder()        
 *             .snsTopicArn(defaultTopic.arn())
 *             .sourceType(&#34;cluster&#34;)
 *             .sourceIds(defaultCluster.id())
 *             .severity(&#34;INFO&#34;)
 *             .eventCategories(            
 *                 &#34;configuration&#34;,
 *                 &#34;management&#34;,
 *                 &#34;monitoring&#34;,
 *                 &#34;security&#34;)
 *             .tags(Map.of(&#34;Name&#34;, &#34;default&#34;))
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import Redshift Event Subscriptions using the `name`. For example:
 * 
 * ```sh
 *  $ pulumi import aws:redshift/eventSubscription:EventSubscription default redshift-event-sub
 * ```
 * 
 */
@ResourceType(type="aws:redshift/eventSubscription:EventSubscription")
public class EventSubscription extends com.pulumi.resources.CustomResource {
    /**
     * Amazon Resource Name (ARN) of the Redshift event notification subscription
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return Amazon Resource Name (ARN) of the Redshift event notification subscription
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The AWS customer account associated with the Redshift event notification subscription
     * 
     */
    @Export(name="customerAwsId", refs={String.class}, tree="[0]")
    private Output<String> customerAwsId;

    /**
     * @return The AWS customer account associated with the Redshift event notification subscription
     * 
     */
    public Output<String> customerAwsId() {
        return this.customerAwsId;
    }
    /**
     * A boolean flag to enable/disable the subscription. Defaults to `true`.
     * 
     */
    @Export(name="enabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> enabled;

    /**
     * @return A boolean flag to enable/disable the subscription. Defaults to `true`.
     * 
     */
    public Output<Optional<Boolean>> enabled() {
        return Codegen.optional(this.enabled);
    }
    /**
     * A list of event categories for a SourceType that you want to subscribe to. See https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-event-notifications.html or run `aws redshift describe-event-categories`.
     * 
     */
    @Export(name="eventCategories", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> eventCategories;

    /**
     * @return A list of event categories for a SourceType that you want to subscribe to. See https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-event-notifications.html or run `aws redshift describe-event-categories`.
     * 
     */
    public Output<Optional<List<String>>> eventCategories() {
        return Codegen.optional(this.eventCategories);
    }
    /**
     * The name of the Redshift event subscription.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the Redshift event subscription.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The event severity to be published by the notification subscription. Valid options are `INFO` or `ERROR`. Default value of `INFO`.
     * 
     */
    @Export(name="severity", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> severity;

    /**
     * @return The event severity to be published by the notification subscription. Valid options are `INFO` or `ERROR`. Default value of `INFO`.
     * 
     */
    public Output<Optional<String>> severity() {
        return Codegen.optional(this.severity);
    }
    /**
     * The ARN of the SNS topic to send events to.
     * 
     */
    @Export(name="snsTopicArn", refs={String.class}, tree="[0]")
    private Output<String> snsTopicArn;

    /**
     * @return The ARN of the SNS topic to send events to.
     * 
     */
    public Output<String> snsTopicArn() {
        return this.snsTopicArn;
    }
    /**
     * A list of identifiers of the event sources for which events will be returned. If not specified, then all sources are included in the response. If specified, a `source_type` must also be specified.
     * 
     */
    @Export(name="sourceIds", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> sourceIds;

    /**
     * @return A list of identifiers of the event sources for which events will be returned. If not specified, then all sources are included in the response. If specified, a `source_type` must also be specified.
     * 
     */
    public Output<Optional<List<String>>> sourceIds() {
        return Codegen.optional(this.sourceIds);
    }
    /**
     * The type of source that will be generating the events. Valid options are `cluster`, `cluster-parameter-group`, `cluster-security-group`, `cluster-snapshot`, or `scheduled-action`. If not set, all sources will be subscribed to.
     * 
     */
    @Export(name="sourceType", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> sourceType;

    /**
     * @return The type of source that will be generating the events. Valid options are `cluster`, `cluster-parameter-group`, `cluster-security-group`, `cluster-snapshot`, or `scheduled-action`. If not set, all sources will be subscribed to.
     * 
     */
    public Output<Optional<String>> sourceType() {
        return Codegen.optional(this.sourceType);
    }
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    public Output<String> status() {
        return this.status;
    }
    /**
     * A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public EventSubscription(String name) {
        this(name, EventSubscriptionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public EventSubscription(String name, EventSubscriptionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public EventSubscription(String name, EventSubscriptionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:redshift/eventSubscription:EventSubscription", name, args == null ? EventSubscriptionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private EventSubscription(String name, Output<String> id, @Nullable EventSubscriptionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:redshift/eventSubscription:EventSubscription", name, state, makeResourceOptions(options, id));
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
    public static EventSubscription get(String name, Output<String> id, @Nullable EventSubscriptionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new EventSubscription(name, id, state, options);
    }
}

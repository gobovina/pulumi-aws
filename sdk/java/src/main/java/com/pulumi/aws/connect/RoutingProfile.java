// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.connect;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.connect.RoutingProfileArgs;
import com.pulumi.aws.connect.inputs.RoutingProfileState;
import com.pulumi.aws.connect.outputs.RoutingProfileMediaConcurrency;
import com.pulumi.aws.connect.outputs.RoutingProfileQueueConfig;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides an Amazon Connect Routing Profile resource. For more information see
 * [Amazon Connect: Getting Started](https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-get-started.html)
 * 
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.connect.RoutingProfile;
 * import com.pulumi.aws.connect.RoutingProfileArgs;
 * import com.pulumi.aws.connect.inputs.RoutingProfileMediaConcurrencyArgs;
 * import com.pulumi.aws.connect.inputs.RoutingProfileQueueConfigArgs;
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
 *         var example = new RoutingProfile("example", RoutingProfileArgs.builder()
 *             .instanceId("aaaaaaaa-bbbb-cccc-dddd-111111111111")
 *             .name("example")
 *             .defaultOutboundQueueId("12345678-1234-1234-1234-123456789012")
 *             .description("example description")
 *             .mediaConcurrencies(RoutingProfileMediaConcurrencyArgs.builder()
 *                 .channel("VOICE")
 *                 .concurrency(1)
 *                 .build())
 *             .queueConfigs(RoutingProfileQueueConfigArgs.builder()
 *                 .channel("VOICE")
 *                 .delay(2)
 *                 .priority(1)
 *                 .queueId("12345678-1234-1234-1234-123456789012")
 *                 .build())
 *             .tags(Map.of("Name", "Example Routing Profile"))
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Using `pulumi import`, import Amazon Connect Routing Profiles using the `instance_id` and `routing_profile_id` separated by a colon (`:`). For example:
 * 
 * ```sh
 * $ pulumi import aws:connect/routingProfile:RoutingProfile example f1288a1f-6193-445a-b47e-af739b2:c1d4e5f6-1b3c-1b3c-1b3c-c1d4e5f6c1d4e5
 * ```
 * 
 */
@ResourceType(type="aws:connect/routingProfile:RoutingProfile")
public class RoutingProfile extends com.pulumi.resources.CustomResource {
    /**
     * The Amazon Resource Name (ARN) of the Routing Profile.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) of the Routing Profile.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * Specifies the default outbound queue for the Routing Profile.
     * 
     */
    @Export(name="defaultOutboundQueueId", refs={String.class}, tree="[0]")
    private Output<String> defaultOutboundQueueId;

    /**
     * @return Specifies the default outbound queue for the Routing Profile.
     * 
     */
    public Output<String> defaultOutboundQueueId() {
        return this.defaultOutboundQueueId;
    }
    /**
     * Specifies the description of the Routing Profile.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output<String> description;

    /**
     * @return Specifies the description of the Routing Profile.
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    /**
     * Specifies the identifier of the hosting Amazon Connect Instance.
     * 
     */
    @Export(name="instanceId", refs={String.class}, tree="[0]")
    private Output<String> instanceId;

    /**
     * @return Specifies the identifier of the hosting Amazon Connect Instance.
     * 
     */
    public Output<String> instanceId() {
        return this.instanceId;
    }
    /**
     * One or more `media_concurrencies` blocks that specify the channels that agents can handle in the Contact Control Panel (CCP) for this Routing Profile. The `media_concurrencies` block is documented below.
     * 
     */
    @Export(name="mediaConcurrencies", refs={List.class,RoutingProfileMediaConcurrency.class}, tree="[0,1]")
    private Output<List<RoutingProfileMediaConcurrency>> mediaConcurrencies;

    /**
     * @return One or more `media_concurrencies` blocks that specify the channels that agents can handle in the Contact Control Panel (CCP) for this Routing Profile. The `media_concurrencies` block is documented below.
     * 
     */
    public Output<List<RoutingProfileMediaConcurrency>> mediaConcurrencies() {
        return this.mediaConcurrencies;
    }
    /**
     * Specifies the name of the Routing Profile.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Specifies the name of the Routing Profile.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * One or more `queue_configs` blocks that specify the inbound queues associated with the routing profile. If no queue is added, the agent only can make outbound calls. The `queue_configs` block is documented below.
     * 
     */
    @Export(name="queueConfigs", refs={List.class,RoutingProfileQueueConfig.class}, tree="[0,1]")
    private Output</* @Nullable */ List<RoutingProfileQueueConfig>> queueConfigs;

    /**
     * @return One or more `queue_configs` blocks that specify the inbound queues associated with the routing profile. If no queue is added, the agent only can make outbound calls. The `queue_configs` block is documented below.
     * 
     */
    public Output<Optional<List<RoutingProfileQueueConfig>>> queueConfigs() {
        return Codegen.optional(this.queueConfigs);
    }
    /**
     * The identifier for the Routing Profile.
     * 
     */
    @Export(name="routingProfileId", refs={String.class}, tree="[0]")
    private Output<String> routingProfileId;

    /**
     * @return The identifier for the Routing Profile.
     * 
     */
    public Output<String> routingProfileId() {
        return this.routingProfileId;
    }
    /**
     * Tags to apply to the Routing Profile. If configured with a provider
     * `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Tags to apply to the Routing Profile. If configured with a provider
     * `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
    public RoutingProfile(String name) {
        this(name, RoutingProfileArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RoutingProfile(String name, RoutingProfileArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RoutingProfile(String name, RoutingProfileArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:connect/routingProfile:RoutingProfile", name, args == null ? RoutingProfileArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private RoutingProfile(String name, Output<String> id, @Nullable RoutingProfileState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:connect/routingProfile:RoutingProfile", name, state, makeResourceOptions(options, id));
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
    public static RoutingProfile get(String name, Output<String> id, @Nullable RoutingProfileState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new RoutingProfile(name, id, state, options);
    }
}

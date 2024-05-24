// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.mediapackage;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.mediapackage.ChannelArgs;
import com.pulumi.aws.mediapackage.inputs.ChannelState;
import com.pulumi.aws.mediapackage.outputs.ChannelHlsIngest;
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
 * Provides an AWS Elemental MediaPackage Channel.
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
 * import com.pulumi.aws.mediapackage.Channel;
 * import com.pulumi.aws.mediapackage.ChannelArgs;
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
 *         var kittens = new Channel("kittens", ChannelArgs.builder()
 *             .channelId("kitten-channel")
 *             .description("A channel dedicated to amusing videos of kittens.")
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
 * Using `pulumi import`, import Media Package Channels using the channel ID. For example:
 * 
 * ```sh
 * $ pulumi import aws:mediapackage/channel:Channel kittens kittens-channel
 * ```
 * 
 */
@ResourceType(type="aws:mediapackage/channel:Channel")
public class Channel extends com.pulumi.resources.CustomResource {
    /**
     * The ARN of the channel
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return The ARN of the channel
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * A unique identifier describing the channel
     * 
     */
    @Export(name="channelId", refs={String.class}, tree="[0]")
    private Output<String> channelId;

    /**
     * @return A unique identifier describing the channel
     * 
     */
    public Output<String> channelId() {
        return this.channelId;
    }
    /**
     * A description of the channel
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output<String> description;

    /**
     * @return A description of the channel
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    /**
     * A single item list of HLS ingest information
     * 
     */
    @Export(name="hlsIngests", refs={List.class,ChannelHlsIngest.class}, tree="[0,1]")
    private Output<List<ChannelHlsIngest>> hlsIngests;

    /**
     * @return A single item list of HLS ingest information
     * 
     */
    public Output<List<ChannelHlsIngest>> hlsIngests() {
        return this.hlsIngests;
    }
    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
    public Channel(String name) {
        this(name, ChannelArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Channel(String name, ChannelArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Channel(String name, ChannelArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:mediapackage/channel:Channel", name, args == null ? ChannelArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Channel(String name, Output<String> id, @Nullable ChannelState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:mediapackage/channel:Channel", name, state, makeResourceOptions(options, id));
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
    public static Channel get(String name, Output<String> id, @Nullable ChannelState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Channel(name, id, state, options);
    }
}

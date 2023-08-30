// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.devicefarm;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.devicefarm.NetworkProfileArgs;
import com.pulumi.aws.devicefarm.inputs.NetworkProfileState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a resource to manage AWS Device Farm Network Profiles.
 * ∂
 * &gt; **NOTE:** AWS currently has limited regional support for Device Farm (e.g., `us-west-2`). See [AWS Device Farm endpoints and quotas](https://docs.aws.amazon.com/general/latest/gr/devicefarm.html) for information on supported regions.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.devicefarm.Project;
 * import com.pulumi.aws.devicefarm.NetworkProfile;
 * import com.pulumi.aws.devicefarm.NetworkProfileArgs;
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
 *         var exampleProject = new Project(&#34;exampleProject&#34;);
 * 
 *         var exampleNetworkProfile = new NetworkProfile(&#34;exampleNetworkProfile&#34;, NetworkProfileArgs.builder()        
 *             .projectArn(exampleProject.arn())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import DeviceFarm Network Profiles using their ARN. For example:
 * 
 * ```sh
 *  $ pulumi import aws:devicefarm/networkProfile:NetworkProfile example arn:aws:devicefarm:us-west-2:123456789012:networkprofile:4fa784c7-ccb4-4dbf-ba4f-02198320daa1
 * ```
 * 
 */
@ResourceType(type="aws:devicefarm/networkProfile:NetworkProfile")
public class NetworkProfile extends com.pulumi.resources.CustomResource {
    /**
     * The Amazon Resource Name of this network profile.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name of this network profile.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The description of the network profile.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the network profile.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The data throughput rate in bits per second, as an integer from `0` to `104857600`. Default value is `104857600`.
     * 
     */
    @Export(name="downlinkBandwidthBits", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> downlinkBandwidthBits;

    /**
     * @return The data throughput rate in bits per second, as an integer from `0` to `104857600`. Default value is `104857600`.
     * 
     */
    public Output<Optional<Integer>> downlinkBandwidthBits() {
        return Codegen.optional(this.downlinkBandwidthBits);
    }
    /**
     * Delay time for all packets to destination in milliseconds as an integer from `0` to `2000`.
     * 
     */
    @Export(name="downlinkDelayMs", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> downlinkDelayMs;

    /**
     * @return Delay time for all packets to destination in milliseconds as an integer from `0` to `2000`.
     * 
     */
    public Output<Optional<Integer>> downlinkDelayMs() {
        return Codegen.optional(this.downlinkDelayMs);
    }
    /**
     * Time variation in the delay of received packets in milliseconds as an integer from `0` to `2000`.
     * 
     */
    @Export(name="downlinkJitterMs", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> downlinkJitterMs;

    /**
     * @return Time variation in the delay of received packets in milliseconds as an integer from `0` to `2000`.
     * 
     */
    public Output<Optional<Integer>> downlinkJitterMs() {
        return Codegen.optional(this.downlinkJitterMs);
    }
    /**
     * Proportion of received packets that fail to arrive from `0` to `100` percent.
     * 
     */
    @Export(name="downlinkLossPercent", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> downlinkLossPercent;

    /**
     * @return Proportion of received packets that fail to arrive from `0` to `100` percent.
     * 
     */
    public Output<Optional<Integer>> downlinkLossPercent() {
        return Codegen.optional(this.downlinkLossPercent);
    }
    /**
     * The name for the network profile.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name for the network profile.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The ARN of the project for the network profile.
     * 
     */
    @Export(name="projectArn", refs={String.class}, tree="[0]")
    private Output<String> projectArn;

    /**
     * @return The ARN of the project for the network profile.
     * 
     */
    public Output<String> projectArn() {
        return this.projectArn;
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
     * The type of network profile to create. Valid values are listed are `PRIVATE` and `CURATED`.
     * 
     */
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> type;

    /**
     * @return The type of network profile to create. Valid values are listed are `PRIVATE` and `CURATED`.
     * 
     */
    public Output<Optional<String>> type() {
        return Codegen.optional(this.type);
    }
    /**
     * The data throughput rate in bits per second, as an integer from `0` to `104857600`. Default value is `104857600`.
     * 
     */
    @Export(name="uplinkBandwidthBits", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> uplinkBandwidthBits;

    /**
     * @return The data throughput rate in bits per second, as an integer from `0` to `104857600`. Default value is `104857600`.
     * 
     */
    public Output<Optional<Integer>> uplinkBandwidthBits() {
        return Codegen.optional(this.uplinkBandwidthBits);
    }
    /**
     * Delay time for all packets to destination in milliseconds as an integer from `0` to `2000`.
     * 
     */
    @Export(name="uplinkDelayMs", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> uplinkDelayMs;

    /**
     * @return Delay time for all packets to destination in milliseconds as an integer from `0` to `2000`.
     * 
     */
    public Output<Optional<Integer>> uplinkDelayMs() {
        return Codegen.optional(this.uplinkDelayMs);
    }
    /**
     * Time variation in the delay of received packets in milliseconds as an integer from `0` to `2000`.
     * 
     */
    @Export(name="uplinkJitterMs", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> uplinkJitterMs;

    /**
     * @return Time variation in the delay of received packets in milliseconds as an integer from `0` to `2000`.
     * 
     */
    public Output<Optional<Integer>> uplinkJitterMs() {
        return Codegen.optional(this.uplinkJitterMs);
    }
    /**
     * Proportion of received packets that fail to arrive from `0` to `100` percent.
     * 
     */
    @Export(name="uplinkLossPercent", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> uplinkLossPercent;

    /**
     * @return Proportion of received packets that fail to arrive from `0` to `100` percent.
     * 
     */
    public Output<Optional<Integer>> uplinkLossPercent() {
        return Codegen.optional(this.uplinkLossPercent);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public NetworkProfile(String name) {
        this(name, NetworkProfileArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public NetworkProfile(String name, NetworkProfileArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public NetworkProfile(String name, NetworkProfileArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:devicefarm/networkProfile:NetworkProfile", name, args == null ? NetworkProfileArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private NetworkProfile(String name, Output<String> id, @Nullable NetworkProfileState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:devicefarm/networkProfile:NetworkProfile", name, state, makeResourceOptions(options, id));
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
    public static NetworkProfile get(String name, Output<String> id, @Nullable NetworkProfileState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new NetworkProfile(name, id, state, options);
    }
}

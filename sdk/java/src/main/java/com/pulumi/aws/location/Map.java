// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.location;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.location.MapArgs;
import com.pulumi.aws.location.inputs.MapState;
import com.pulumi.aws.location.outputs.MapConfiguration;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Location Service Map.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.location.Map;
 * import com.pulumi.aws.location.MapArgs;
 * import com.pulumi.aws.location.inputs.MapConfigurationArgs;
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
 *         var example = new Map(&#34;example&#34;, MapArgs.builder()        
 *             .configuration(MapConfigurationArgs.builder()
 *                 .style(&#34;VectorHereBerlin&#34;)
 *                 .build())
 *             .mapName(&#34;example&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import `aws_location_map` resources using the map name. For example:
 * 
 * ```sh
 *  $ pulumi import aws:location/map:Map example example
 * ```
 * 
 */
@ResourceType(type="aws:location/map:Map")
public class Map extends com.pulumi.resources.CustomResource {
    /**
     * Configuration block with the map style selected from an available data provider. Detailed below.
     * 
     */
    @Export(name="configuration", refs={MapConfiguration.class}, tree="[0]")
    private Output<MapConfiguration> configuration;

    /**
     * @return Configuration block with the map style selected from an available data provider. Detailed below.
     * 
     */
    public Output<MapConfiguration> configuration() {
        return this.configuration;
    }
    /**
     * The timestamp for when the map resource was created in ISO 8601 format.
     * 
     */
    @Export(name="createTime", refs={String.class}, tree="[0]")
    private Output<String> createTime;

    /**
     * @return The timestamp for when the map resource was created in ISO 8601 format.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * An optional description for the map resource.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return An optional description for the map resource.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The Amazon Resource Name (ARN) for the map resource. Used to specify a resource across all AWS.
     * 
     */
    @Export(name="mapArn", refs={String.class}, tree="[0]")
    private Output<String> mapArn;

    /**
     * @return The Amazon Resource Name (ARN) for the map resource. Used to specify a resource across all AWS.
     * 
     */
    public Output<String> mapArn() {
        return this.mapArn;
    }
    /**
     * The name for the map resource.
     * 
     * The following arguments are optional:
     * 
     */
    @Export(name="mapName", refs={String.class}, tree="[0]")
    private Output<String> mapName;

    /**
     * @return The name for the map resource.
     * 
     * The following arguments are optional:
     * 
     */
    public Output<String> mapName() {
        return this.mapName;
    }
    /**
     * Key-value tags for the map. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={java.util.Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ java.util.Map<String,String>> tags;

    /**
     * @return Key-value tags for the map. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output<Optional<java.util.Map<String,String>>> tags() {
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
    @Export(name="tagsAll", refs={java.util.Map.class,String.class}, tree="[0,1,1]")
    private Output<java.util.Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Output<java.util.Map<String,String>> tagsAll() {
        return this.tagsAll;
    }
    /**
     * The timestamp for when the map resource was last updated in ISO 8601 format.
     * 
     */
    @Export(name="updateTime", refs={String.class}, tree="[0]")
    private Output<String> updateTime;

    /**
     * @return The timestamp for when the map resource was last updated in ISO 8601 format.
     * 
     */
    public Output<String> updateTime() {
        return this.updateTime;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Map(String name) {
        this(name, MapArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Map(String name, MapArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Map(String name, MapArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:location/map:Map", name, args == null ? MapArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Map(String name, Output<String> id, @Nullable MapState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:location/map:Map", name, state, makeResourceOptions(options, id));
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
    public static Map get(String name, Output<String> id, @Nullable MapState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Map(name, id, state, options);
    }
}

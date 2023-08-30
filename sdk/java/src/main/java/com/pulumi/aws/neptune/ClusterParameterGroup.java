// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.neptune;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.neptune.ClusterParameterGroupArgs;
import com.pulumi.aws.neptune.inputs.ClusterParameterGroupState;
import com.pulumi.aws.neptune.outputs.ClusterParameterGroupParameter;
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
 * Manages a Neptune Cluster Parameter Group
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.neptune.ClusterParameterGroup;
 * import com.pulumi.aws.neptune.ClusterParameterGroupArgs;
 * import com.pulumi.aws.neptune.inputs.ClusterParameterGroupParameterArgs;
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
 *         var example = new ClusterParameterGroup(&#34;example&#34;, ClusterParameterGroupArgs.builder()        
 *             .description(&#34;neptune cluster parameter group&#34;)
 *             .family(&#34;neptune1&#34;)
 *             .parameters(ClusterParameterGroupParameterArgs.builder()
 *                 .name(&#34;neptune_enable_audit_log&#34;)
 *                 .value(1)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import Neptune Cluster Parameter Groups using the `name`. For example:
 * 
 * ```sh
 *  $ pulumi import aws:neptune/clusterParameterGroup:ClusterParameterGroup cluster_pg production-pg-1
 * ```
 * 
 */
@ResourceType(type="aws:neptune/clusterParameterGroup:ClusterParameterGroup")
public class ClusterParameterGroup extends com.pulumi.resources.CustomResource {
    /**
     * The ARN of the neptune cluster parameter group.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return The ARN of the neptune cluster parameter group.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The description of the neptune cluster parameter group. Defaults to &#34;Managed by Pulumi&#34;.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the neptune cluster parameter group. Defaults to &#34;Managed by Pulumi&#34;.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The family of the neptune cluster parameter group.
     * 
     */
    @Export(name="family", refs={String.class}, tree="[0]")
    private Output<String> family;

    /**
     * @return The family of the neptune cluster parameter group.
     * 
     */
    public Output<String> family() {
        return this.family;
    }
    /**
     * The name of the neptune parameter.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the neptune parameter.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
     * 
     */
    @Export(name="namePrefix", refs={String.class}, tree="[0]")
    private Output<String> namePrefix;

    /**
     * @return Creates a unique name beginning with the specified prefix. Conflicts with `name`.
     * 
     */
    public Output<String> namePrefix() {
        return this.namePrefix;
    }
    /**
     * A list of neptune parameters to apply.
     * 
     */
    @Export(name="parameters", refs={List.class,ClusterParameterGroupParameter.class}, tree="[0,1]")
    private Output</* @Nullable */ List<ClusterParameterGroupParameter>> parameters;

    /**
     * @return A list of neptune parameters to apply.
     * 
     */
    public Output<Optional<List<ClusterParameterGroupParameter>>> parameters() {
        return Codegen.optional(this.parameters);
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
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ClusterParameterGroup(String name) {
        this(name, ClusterParameterGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ClusterParameterGroup(String name, ClusterParameterGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ClusterParameterGroup(String name, ClusterParameterGroupArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:neptune/clusterParameterGroup:ClusterParameterGroup", name, args == null ? ClusterParameterGroupArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ClusterParameterGroup(String name, Output<String> id, @Nullable ClusterParameterGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:neptune/clusterParameterGroup:ClusterParameterGroup", name, state, makeResourceOptions(options, id));
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
    public static ClusterParameterGroup get(String name, Output<String> id, @Nullable ClusterParameterGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ClusterParameterGroup(name, id, state, options);
    }
}

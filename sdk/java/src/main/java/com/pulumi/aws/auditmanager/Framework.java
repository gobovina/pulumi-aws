// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.auditmanager;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.auditmanager.FrameworkArgs;
import com.pulumi.aws.auditmanager.inputs.FrameworkState;
import com.pulumi.aws.auditmanager.outputs.FrameworkControlSet;
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
 * Resource for managing an AWS Audit Manager Framework.
 * 
 * ## Example Usage
 * ### Basic Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.auditmanager.Framework;
 * import com.pulumi.aws.auditmanager.FrameworkArgs;
 * import com.pulumi.aws.auditmanager.inputs.FrameworkControlSetArgs;
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
 *         var test = new Framework(&#34;test&#34;, FrameworkArgs.builder()        
 *             .controlSets(FrameworkControlSetArgs.builder()
 *                 .name(&#34;example&#34;)
 *                 .controls(FrameworkControlSetControlArgs.builder()
 *                     .id(aws_auditmanager_control.test().id())
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
 * Using `pulumi import`, import Audit Manager Framework using the framework `id`. For example:
 * 
 * ```sh
 *  $ pulumi import aws:auditmanager/framework:Framework example abc123-de45
 * ```
 * 
 */
@ResourceType(type="aws:auditmanager/framework:Framework")
public class Framework extends com.pulumi.resources.CustomResource {
    /**
     * Amazon Resource Name (ARN) of the framework.
     * * `control_sets[*].id` - Unique identifier for the framework control set.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return Amazon Resource Name (ARN) of the framework.
     * * `control_sets[*].id` - Unique identifier for the framework control set.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * Compliance type that the new custom framework supports, such as `CIS` or `HIPAA`.
     * 
     */
    @Export(name="complianceType", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> complianceType;

    /**
     * @return Compliance type that the new custom framework supports, such as `CIS` or `HIPAA`.
     * 
     */
    public Output<Optional<String>> complianceType() {
        return Codegen.optional(this.complianceType);
    }
    /**
     * Control sets that are associated with the framework. See `control_sets` below.
     * 
     * The following arguments are optional:
     * 
     */
    @Export(name="controlSets", refs={List.class,FrameworkControlSet.class}, tree="[0,1]")
    private Output</* @Nullable */ List<FrameworkControlSet>> controlSets;

    /**
     * @return Control sets that are associated with the framework. See `control_sets` below.
     * 
     * The following arguments are optional:
     * 
     */
    public Output<Optional<List<FrameworkControlSet>>> controlSets() {
        return Codegen.optional(this.controlSets);
    }
    /**
     * Description of the framework.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return Description of the framework.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Framework type, such as a custom framework or a standard framework.
     * 
     */
    @Export(name="frameworkType", refs={String.class}, tree="[0]")
    private Output<String> frameworkType;

    /**
     * @return Framework type, such as a custom framework or a standard framework.
     * 
     */
    public Output<String> frameworkType() {
        return this.frameworkType;
    }
    /**
     * Name of the framework.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of the framework.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * A map of tags to assign to the framework. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the framework. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * @deprecated
     * Please use `tags` instead.
     * 
     */
    @Deprecated /* Please use `tags` instead. */
    @Export(name="tagsAll", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Framework(String name) {
        this(name, FrameworkArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Framework(String name, @Nullable FrameworkArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Framework(String name, @Nullable FrameworkArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:auditmanager/framework:Framework", name, args == null ? FrameworkArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Framework(String name, Output<String> id, @Nullable FrameworkState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:auditmanager/framework:Framework", name, state, makeResourceOptions(options, id));
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
    public static Framework get(String name, Output<String> id, @Nullable FrameworkState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Framework(name, id, state, options);
    }
}

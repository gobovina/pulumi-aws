// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.workspaces;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.workspaces.IpGroupArgs;
import com.pulumi.aws.workspaces.inputs.IpGroupState;
import com.pulumi.aws.workspaces.outputs.IpGroupRule;
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
 * Provides an IP access control group in AWS WorkSpaces Service
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.workspaces.IpGroup;
 * import com.pulumi.aws.workspaces.IpGroupArgs;
 * import com.pulumi.aws.workspaces.inputs.IpGroupRuleArgs;
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
 *         var contractors = new IpGroup(&#34;contractors&#34;, IpGroupArgs.builder()        
 *             .description(&#34;Contractors IP access control group&#34;)
 *             .rules(            
 *                 IpGroupRuleArgs.builder()
 *                     .description(&#34;NY&#34;)
 *                     .source(&#34;150.24.14.0/24&#34;)
 *                     .build(),
 *                 IpGroupRuleArgs.builder()
 *                     .description(&#34;LA&#34;)
 *                     .source(&#34;125.191.14.85/32&#34;)
 *                     .build(),
 *                 IpGroupRuleArgs.builder()
 *                     .description(&#34;STL&#34;)
 *                     .source(&#34;44.98.100.0/24&#34;)
 *                     .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import WorkSpaces IP groups using their GroupID. For example:
 * 
 * ```sh
 *  $ pulumi import aws:workspaces/ipGroup:IpGroup example wsipg-488lrtl3k
 * ```
 * 
 */
@ResourceType(type="aws:workspaces/ipGroup:IpGroup")
public class IpGroup extends com.pulumi.resources.CustomResource {
    /**
     * The description of the IP group.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the IP group.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The name of the IP group.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the IP group.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * One or more pairs specifying the IP group rule (in CIDR format) from which web requests originate.
     * 
     */
    @Export(name="rules", refs={List.class,IpGroupRule.class}, tree="[0,1]")
    private Output</* @Nullable */ List<IpGroupRule>> rules;

    /**
     * @return One or more pairs specifying the IP group rule (in CIDR format) from which web requests originate.
     * 
     */
    public Output<Optional<List<IpGroupRule>>> rules() {
        return Codegen.optional(this.rules);
    }
    /**
     * A map of tags assigned to the WorkSpaces directory. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags assigned to the WorkSpaces directory. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
    public IpGroup(String name) {
        this(name, IpGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public IpGroup(String name, @Nullable IpGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public IpGroup(String name, @Nullable IpGroupArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:workspaces/ipGroup:IpGroup", name, args == null ? IpGroupArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private IpGroup(String name, Output<String> id, @Nullable IpGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:workspaces/ipGroup:IpGroup", name, state, makeResourceOptions(options, id));
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
    public static IpGroup get(String name, Output<String> id, @Nullable IpGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new IpGroup(name, id, state, options);
    }
}

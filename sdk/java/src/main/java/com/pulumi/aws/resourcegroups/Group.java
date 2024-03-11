// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.resourcegroups;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.resourcegroups.GroupArgs;
import com.pulumi.aws.resourcegroups.inputs.GroupState;
import com.pulumi.aws.resourcegroups.outputs.GroupConfiguration;
import com.pulumi.aws.resourcegroups.outputs.GroupResourceQuery;
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
 * Provides a Resource Group.
 * 
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.resourcegroups.Group;
 * import com.pulumi.aws.resourcegroups.GroupArgs;
 * import com.pulumi.aws.resourcegroups.inputs.GroupResourceQueryArgs;
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
 *         var test = new Group(&#34;test&#34;, GroupArgs.builder()        
 *             .name(&#34;test-group&#34;)
 *             .resourceQuery(GroupResourceQueryArgs.builder()
 *                 .query(&#34;&#34;&#34;
 * {
 *   &#34;ResourceTypeFilters&#34;: [
 *     &#34;AWS::EC2::Instance&#34;
 *   ],
 *   &#34;TagFilters&#34;: [
 *     {
 *       &#34;Key&#34;: &#34;Stage&#34;,
 *       &#34;Values&#34;: [&#34;Test&#34;]
 *     }
 *   ]
 * }
 *                 &#34;&#34;&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Using `pulumi import`, import resource groups using the `name`. For example:
 * 
 * ```sh
 * $ pulumi import aws:resourcegroups/group:Group foo resource-group-name
 * ```
 * 
 */
@ResourceType(type="aws:resourcegroups/group:Group")
public class Group extends com.pulumi.resources.CustomResource {
    /**
     * The ARN assigned by AWS for this resource group.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return The ARN assigned by AWS for this resource group.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * A configuration associates the resource group with an AWS service and specifies how the service can interact with the resources in the group. See below for details.
     * 
     */
    @Export(name="configurations", refs={List.class,GroupConfiguration.class}, tree="[0,1]")
    private Output</* @Nullable */ List<GroupConfiguration>> configurations;

    /**
     * @return A configuration associates the resource group with an AWS service and specifies how the service can interact with the resources in the group. See below for details.
     * 
     */
    public Output<Optional<List<GroupConfiguration>>> configurations() {
        return Codegen.optional(this.configurations);
    }
    /**
     * A description of the resource group.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return A description of the resource group.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The resource group&#39;s name. A resource group name can have a maximum of 127 characters, including letters, numbers, hyphens, dots, and underscores. The name cannot start with `AWS` or `aws`.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The resource group&#39;s name. A resource group name can have a maximum of 127 characters, including letters, numbers, hyphens, dots, and underscores. The name cannot start with `AWS` or `aws`.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * A `resource_query` block. Resource queries are documented below.
     * 
     */
    @Export(name="resourceQuery", refs={GroupResourceQuery.class}, tree="[0]")
    private Output</* @Nullable */ GroupResourceQuery> resourceQuery;

    /**
     * @return A `resource_query` block. Resource queries are documented below.
     * 
     */
    public Output<Optional<GroupResourceQuery>> resourceQuery() {
        return Codegen.optional(this.resourceQuery);
    }
    /**
     * Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
    public Group(String name) {
        this(name, GroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Group(String name, @Nullable GroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Group(String name, @Nullable GroupArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:resourcegroups/group:Group", name, args == null ? GroupArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Group(String name, Output<String> id, @Nullable GroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:resourcegroups/group:Group", name, state, makeResourceOptions(options, id));
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
    public static Group get(String name, Output<String> id, @Nullable GroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Group(name, id, state, options);
    }
}

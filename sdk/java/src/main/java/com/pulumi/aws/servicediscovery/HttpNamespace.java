// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.servicediscovery;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.servicediscovery.HttpNamespaceArgs;
import com.pulumi.aws.servicediscovery.inputs.HttpNamespaceState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.servicediscovery.HttpNamespace;
 * import com.pulumi.aws.servicediscovery.HttpNamespaceArgs;
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
 *         var example = new HttpNamespace(&#34;example&#34;, HttpNamespaceArgs.builder()        
 *             .name(&#34;development&#34;)
 *             .description(&#34;example&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import Service Discovery HTTP Namespace using the namespace ID. For example:
 * 
 * ```sh
 *  $ pulumi import aws:servicediscovery/httpNamespace:HttpNamespace example ns-1234567890
 * ```
 * 
 */
@ResourceType(type="aws:servicediscovery/httpNamespace:HttpNamespace")
public class HttpNamespace extends com.pulumi.resources.CustomResource {
    /**
     * The ARN that Amazon Route 53 assigns to the namespace when you create it.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return The ARN that Amazon Route 53 assigns to the namespace when you create it.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The description that you specify for the namespace when you create it.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return The description that you specify for the namespace when you create it.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The name of an HTTP namespace.
     * 
     */
    @Export(name="httpName", refs={String.class}, tree="[0]")
    private Output<String> httpName;

    /**
     * @return The name of an HTTP namespace.
     * 
     */
    public Output<String> httpName() {
        return this.httpName;
    }
    /**
     * The name of the http namespace.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the http namespace.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * A map of tags to assign to the namespace. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the namespace. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
    public HttpNamespace(String name) {
        this(name, HttpNamespaceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public HttpNamespace(String name, @Nullable HttpNamespaceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public HttpNamespace(String name, @Nullable HttpNamespaceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:servicediscovery/httpNamespace:HttpNamespace", name, args == null ? HttpNamespaceArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private HttpNamespace(String name, Output<String> id, @Nullable HttpNamespaceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:servicediscovery/httpNamespace:HttpNamespace", name, state, makeResourceOptions(options, id));
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
    public static HttpNamespace get(String name, Output<String> id, @Nullable HttpNamespaceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new HttpNamespace(name, id, state, options);
    }
}

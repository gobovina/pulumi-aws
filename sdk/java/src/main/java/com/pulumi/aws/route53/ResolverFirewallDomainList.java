// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.route53;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.route53.ResolverFirewallDomainListArgs;
import com.pulumi.aws.route53.inputs.ResolverFirewallDomainListState;
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
 * Provides a Route 53 Resolver DNS Firewall domain list resource.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.route53.ResolverFirewallDomainList;
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
 *         var example = new ResolverFirewallDomainList(&#34;example&#34;);
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * In TODO v1.5.0 and later, use an `import` block to import
 * 
 * Route 53 Resolver DNS Firewall domain lists using the Route 53 Resolver DNS Firewall domain list ID. For exampleterraform import {
 * 
 *  to = aws_route53_resolver_firewall_domain_list.example
 * 
 *  id = &#34;rslvr-fdl-0123456789abcdef&#34; } Using `TODO import`, import
 * 
 * Route 53 Resolver DNS Firewall domain lists using the Route 53 Resolver DNS Firewall domain list ID. For exampleconsole % TODO import aws_route53_resolver_firewall_domain_list.example rslvr-fdl-0123456789abcdef
 * 
 */
@ResourceType(type="aws:route53/resolverFirewallDomainList:ResolverFirewallDomainList")
public class ResolverFirewallDomainList extends com.pulumi.resources.CustomResource {
    /**
     * The ARN (Amazon Resource Name) of the domain list.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return The ARN (Amazon Resource Name) of the domain list.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * A array of domains for the firewall domain list.
     * 
     */
    @Export(name="domains", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> domains;

    /**
     * @return A array of domains for the firewall domain list.
     * 
     */
    public Output<Optional<List<String>>> domains() {
        return Codegen.optional(this.domains);
    }
    /**
     * A name that lets you identify the domain list, to manage and use it.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return A name that lets you identify the domain list, to manage and use it.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * A map of tags to assign to the resource. f configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. f configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
    public ResolverFirewallDomainList(String name) {
        this(name, ResolverFirewallDomainListArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ResolverFirewallDomainList(String name, @Nullable ResolverFirewallDomainListArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ResolverFirewallDomainList(String name, @Nullable ResolverFirewallDomainListArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:route53/resolverFirewallDomainList:ResolverFirewallDomainList", name, args == null ? ResolverFirewallDomainListArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ResolverFirewallDomainList(String name, Output<String> id, @Nullable ResolverFirewallDomainListState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:route53/resolverFirewallDomainList:ResolverFirewallDomainList", name, state, makeResourceOptions(options, id));
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
    public static ResolverFirewallDomainList get(String name, Output<String> id, @Nullable ResolverFirewallDomainListState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ResolverFirewallDomainList(name, id, state, options);
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.route53;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.route53.ResolverFirewallRuleGroupArgs;
import com.pulumi.aws.route53.inputs.ResolverFirewallRuleGroupState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Route 53 Resolver DNS Firewall rule group resource.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.route53.ResolverFirewallRuleGroup;
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
 *         var example = new ResolverFirewallRuleGroup(&#34;example&#34;);
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * In TODO v1.5.0 and later, use an `import` block to import
 * 
 * Route 53 Resolver DNS Firewall rule groups using the Route 53 Resolver DNS Firewall rule group ID. For exampleterraform import {
 * 
 *  to = aws_route53_resolver_firewall_rule_group.example
 * 
 *  id = &#34;rslvr-frg-0123456789abcdef&#34; } Using `TODO import`, import
 * 
 * Route 53 Resolver DNS Firewall rule groups using the Route 53 Resolver DNS Firewall rule group ID. For exampleconsole % TODO import aws_route53_resolver_firewall_rule_group.example rslvr-frg-0123456789abcdef
 * 
 */
@ResourceType(type="aws:route53/resolverFirewallRuleGroup:ResolverFirewallRuleGroup")
public class ResolverFirewallRuleGroup extends com.pulumi.resources.CustomResource {
    /**
     * The ARN (Amazon Resource Name) of the rule group.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return The ARN (Amazon Resource Name) of the rule group.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * A name that lets you identify the rule group, to manage and use it.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return A name that lets you identify the rule group, to manage and use it.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The AWS account ID for the account that created the rule group. When a rule group is shared with your account, this is the account that has shared the rule group with you.
     * 
     */
    @Export(name="ownerId", refs={String.class}, tree="[0]")
    private Output<String> ownerId;

    /**
     * @return The AWS account ID for the account that created the rule group. When a rule group is shared with your account, this is the account that has shared the rule group with you.
     * 
     */
    public Output<String> ownerId() {
        return this.ownerId;
    }
    /**
     * Whether the rule group is shared with other AWS accounts, or was shared with the current account by another AWS account. Sharing is configured through AWS Resource Access Manager (AWS RAM). Valid values: `NOT_SHARED`, `SHARED_BY_ME`, `SHARED_WITH_ME`
     * 
     */
    @Export(name="shareStatus", refs={String.class}, tree="[0]")
    private Output<String> shareStatus;

    /**
     * @return Whether the rule group is shared with other AWS accounts, or was shared with the current account by another AWS account. Sharing is configured through AWS Resource Access Manager (AWS RAM). Valid values: `NOT_SHARED`, `SHARED_BY_ME`, `SHARED_WITH_ME`
     * 
     */
    public Output<String> shareStatus() {
        return this.shareStatus;
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
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ResolverFirewallRuleGroup(String name) {
        this(name, ResolverFirewallRuleGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ResolverFirewallRuleGroup(String name, @Nullable ResolverFirewallRuleGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ResolverFirewallRuleGroup(String name, @Nullable ResolverFirewallRuleGroupArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:route53/resolverFirewallRuleGroup:ResolverFirewallRuleGroup", name, args == null ? ResolverFirewallRuleGroupArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ResolverFirewallRuleGroup(String name, Output<String> id, @Nullable ResolverFirewallRuleGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:route53/resolverFirewallRuleGroup:ResolverFirewallRuleGroup", name, state, makeResourceOptions(options, id));
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
    public static ResolverFirewallRuleGroup get(String name, Output<String> id, @Nullable ResolverFirewallRuleGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ResolverFirewallRuleGroup(name, id, state, options);
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.route53;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.route53.ResolverRuleArgs;
import com.pulumi.aws.route53.inputs.ResolverRuleState;
import com.pulumi.aws.route53.outputs.ResolverRuleTargetIp;
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
 * Provides a Route53 Resolver rule.
 * 
 * ## Example Usage
 * ### System rule
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.route53.ResolverRule;
 * import com.pulumi.aws.route53.ResolverRuleArgs;
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
 *         var sys = new ResolverRule(&#34;sys&#34;, ResolverRuleArgs.builder()        
 *             .domainName(&#34;subdomain.example.com&#34;)
 *             .ruleType(&#34;SYSTEM&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Forward rule
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.route53.ResolverRule;
 * import com.pulumi.aws.route53.ResolverRuleArgs;
 * import com.pulumi.aws.route53.inputs.ResolverRuleTargetIpArgs;
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
 *         var fwd = new ResolverRule(&#34;fwd&#34;, ResolverRuleArgs.builder()        
 *             .domainName(&#34;example.com&#34;)
 *             .ruleType(&#34;FORWARD&#34;)
 *             .resolverEndpointId(aws_route53_resolver_endpoint.foo().id())
 *             .targetIps(ResolverRuleTargetIpArgs.builder()
 *                 .ip(&#34;123.45.67.89&#34;)
 *                 .build())
 *             .tags(Map.of(&#34;Environment&#34;, &#34;Prod&#34;))
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import Route53 Resolver rules using the `id`. For example:
 * 
 * ```sh
 *  $ pulumi import aws:route53/resolverRule:ResolverRule sys rslvr-rr-0123456789abcdef0
 * ```
 * 
 */
@ResourceType(type="aws:route53/resolverRule:ResolverRule")
public class ResolverRule extends com.pulumi.resources.CustomResource {
    /**
     * The ARN (Amazon Resource Name) for the resolver rule.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return The ARN (Amazon Resource Name) for the resolver rule.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * DNS queries for this domain name are forwarded to the IP addresses that are specified using `target_ip`.
     * 
     */
    @Export(name="domainName", refs={String.class}, tree="[0]")
    private Output<String> domainName;

    /**
     * @return DNS queries for this domain name are forwarded to the IP addresses that are specified using `target_ip`.
     * 
     */
    public Output<String> domainName() {
        return this.domainName;
    }
    /**
     * A friendly name that lets you easily find a rule in the Resolver dashboard in the Route 53 console.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return A friendly name that lets you easily find a rule in the Resolver dashboard in the Route 53 console.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * When a rule is shared with another AWS account, the account ID of the account that the rule is shared with.
     * 
     */
    @Export(name="ownerId", refs={String.class}, tree="[0]")
    private Output<String> ownerId;

    /**
     * @return When a rule is shared with another AWS account, the account ID of the account that the rule is shared with.
     * 
     */
    public Output<String> ownerId() {
        return this.ownerId;
    }
    /**
     * The ID of the outbound resolver endpoint that you want to use to route DNS queries to the IP addresses that you specify using `target_ip`.
     * This argument should only be specified for `FORWARD` type rules.
     * 
     */
    @Export(name="resolverEndpointId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> resolverEndpointId;

    /**
     * @return The ID of the outbound resolver endpoint that you want to use to route DNS queries to the IP addresses that you specify using `target_ip`.
     * This argument should only be specified for `FORWARD` type rules.
     * 
     */
    public Output<Optional<String>> resolverEndpointId() {
        return Codegen.optional(this.resolverEndpointId);
    }
    /**
     * The rule type. Valid values are `FORWARD`, `SYSTEM` and `RECURSIVE`.
     * 
     */
    @Export(name="ruleType", refs={String.class}, tree="[0]")
    private Output<String> ruleType;

    /**
     * @return The rule type. Valid values are `FORWARD`, `SYSTEM` and `RECURSIVE`.
     * 
     */
    public Output<String> ruleType() {
        return this.ruleType;
    }
    /**
     * Whether the rules is shared and, if so, whether the current account is sharing the rule with another account, or another account is sharing the rule with the current account.
     * Values are `NOT_SHARED`, `SHARED_BY_ME` or `SHARED_WITH_ME`
     * 
     */
    @Export(name="shareStatus", refs={String.class}, tree="[0]")
    private Output<String> shareStatus;

    /**
     * @return Whether the rules is shared and, if so, whether the current account is sharing the rule with another account, or another account is sharing the rule with the current account.
     * Values are `NOT_SHARED`, `SHARED_BY_ME` or `SHARED_WITH_ME`
     * 
     */
    public Output<String> shareStatus() {
        return this.shareStatus;
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
     * Configuration block(s) indicating the IPs that you want Resolver to forward DNS queries to (documented below).
     * This argument should only be specified for `FORWARD` type rules.
     * 
     */
    @Export(name="targetIps", refs={List.class,ResolverRuleTargetIp.class}, tree="[0,1]")
    private Output</* @Nullable */ List<ResolverRuleTargetIp>> targetIps;

    /**
     * @return Configuration block(s) indicating the IPs that you want Resolver to forward DNS queries to (documented below).
     * This argument should only be specified for `FORWARD` type rules.
     * 
     */
    public Output<Optional<List<ResolverRuleTargetIp>>> targetIps() {
        return Codegen.optional(this.targetIps);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ResolverRule(String name) {
        this(name, ResolverRuleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ResolverRule(String name, ResolverRuleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ResolverRule(String name, ResolverRuleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:route53/resolverRule:ResolverRule", name, args == null ? ResolverRuleArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ResolverRule(String name, Output<String> id, @Nullable ResolverRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:route53/resolverRule:ResolverRule", name, state, makeResourceOptions(options, id));
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
    public static ResolverRule get(String name, Output<String> id, @Nullable ResolverRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ResolverRule(name, id, state, options);
    }
}

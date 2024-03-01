// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafregional;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.wafregional.RateBasedRuleArgs;
import com.pulumi.aws.wafregional.inputs.RateBasedRuleState;
import com.pulumi.aws.wafregional.outputs.RateBasedRulePredicate;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a WAF Rate Based Rule Resource
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.wafregional.IpSet;
 * import com.pulumi.aws.wafregional.IpSetArgs;
 * import com.pulumi.aws.wafregional.inputs.IpSetIpSetDescriptorArgs;
 * import com.pulumi.aws.wafregional.RateBasedRule;
 * import com.pulumi.aws.wafregional.RateBasedRuleArgs;
 * import com.pulumi.aws.wafregional.inputs.RateBasedRulePredicateArgs;
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
 *         var ipset = new IpSet(&#34;ipset&#34;, IpSetArgs.builder()        
 *             .name(&#34;tfIPSet&#34;)
 *             .ipSetDescriptors(IpSetIpSetDescriptorArgs.builder()
 *                 .type(&#34;IPV4&#34;)
 *                 .value(&#34;192.0.7.0/24&#34;)
 *                 .build())
 *             .build());
 * 
 *         var wafrule = new RateBasedRule(&#34;wafrule&#34;, RateBasedRuleArgs.builder()        
 *             .name(&#34;tfWAFRule&#34;)
 *             .metricName(&#34;tfWAFRule&#34;)
 *             .rateKey(&#34;IP&#34;)
 *             .rateLimit(100)
 *             .predicates(RateBasedRulePredicateArgs.builder()
 *                 .dataId(ipset.id())
 *                 .negated(false)
 *                 .type(&#34;IPMatch&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import WAF Regional Rate Based Rule using the id. For example:
 * 
 * ```sh
 *  $ pulumi import aws:wafregional/rateBasedRule:RateBasedRule wafrule a1b2c3d4-d5f6-7777-8888-9999aaaabbbbcccc
 * ```
 * 
 */
@ResourceType(type="aws:wafregional/rateBasedRule:RateBasedRule")
public class RateBasedRule extends com.pulumi.resources.CustomResource {
    /**
     * The ARN of the WAF Regional Rate Based Rule.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return The ARN of the WAF Regional Rate Based Rule.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The name or description for the Amazon CloudWatch metric of this rule.
     * 
     */
    @Export(name="metricName", refs={String.class}, tree="[0]")
    private Output<String> metricName;

    /**
     * @return The name or description for the Amazon CloudWatch metric of this rule.
     * 
     */
    public Output<String> metricName() {
        return this.metricName;
    }
    /**
     * The name or description of the rule.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name or description of the rule.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The objects to include in a rule (documented below).
     * 
     */
    @Export(name="predicates", refs={List.class,RateBasedRulePredicate.class}, tree="[0,1]")
    private Output</* @Nullable */ List<RateBasedRulePredicate>> predicates;

    /**
     * @return The objects to include in a rule (documented below).
     * 
     */
    public Output<Optional<List<RateBasedRulePredicate>>> predicates() {
        return Codegen.optional(this.predicates);
    }
    /**
     * Valid value is IP.
     * 
     */
    @Export(name="rateKey", refs={String.class}, tree="[0]")
    private Output<String> rateKey;

    /**
     * @return Valid value is IP.
     * 
     */
    public Output<String> rateKey() {
        return this.rateKey;
    }
    /**
     * The maximum number of requests, which have an identical value in the field specified by the RateKey, allowed in a five-minute period. Minimum value is 100.
     * 
     */
    @Export(name="rateLimit", refs={Integer.class}, tree="[0]")
    private Output<Integer> rateLimit;

    /**
     * @return The maximum number of requests, which have an identical value in the field specified by the RateKey, allowed in a five-minute period. Minimum value is 100.
     * 
     */
    public Output<Integer> rateLimit() {
        return this.rateLimit;
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
    public RateBasedRule(String name) {
        this(name, RateBasedRuleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RateBasedRule(String name, RateBasedRuleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RateBasedRule(String name, RateBasedRuleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:wafregional/rateBasedRule:RateBasedRule", name, args == null ? RateBasedRuleArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private RateBasedRule(String name, Output<String> id, @Nullable RateBasedRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:wafregional/rateBasedRule:RateBasedRule", name, state, makeResourceOptions(options, id));
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
    public static RateBasedRule get(String name, Output<String> id, @Nullable RateBasedRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new RateBasedRule(name, id, state, options);
    }
}

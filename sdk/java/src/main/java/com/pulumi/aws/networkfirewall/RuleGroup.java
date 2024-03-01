// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.networkfirewall;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.networkfirewall.RuleGroupArgs;
import com.pulumi.aws.networkfirewall.inputs.RuleGroupState;
import com.pulumi.aws.networkfirewall.outputs.RuleGroupEncryptionConfiguration;
import com.pulumi.aws.networkfirewall.outputs.RuleGroupRuleGroup;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides an AWS Network Firewall Rule Group Resource
 * 
 * ## Example Usage
 * ### Stateful Inspection for denying access to a domain
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.networkfirewall.RuleGroup;
 * import com.pulumi.aws.networkfirewall.RuleGroupArgs;
 * import com.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupArgs;
 * import com.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupRulesSourceArgs;
 * import com.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupRulesSourceRulesSourceListArgs;
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
 *         var example = new RuleGroup(&#34;example&#34;, RuleGroupArgs.builder()        
 *             .capacity(100)
 *             .name(&#34;example&#34;)
 *             .type(&#34;STATEFUL&#34;)
 *             .ruleGroup(RuleGroupRuleGroupArgs.builder()
 *                 .rulesSource(RuleGroupRuleGroupRulesSourceArgs.builder()
 *                     .rulesSourceList(RuleGroupRuleGroupRulesSourceRulesSourceListArgs.builder()
 *                         .generatedRulesType(&#34;DENYLIST&#34;)
 *                         .targetTypes(&#34;HTTP_HOST&#34;)
 *                         .targets(&#34;test.example.com&#34;)
 *                         .build())
 *                     .build())
 *                 .build())
 *             .tags(Map.ofEntries(
 *                 Map.entry(&#34;Tag1&#34;, &#34;Value1&#34;),
 *                 Map.entry(&#34;Tag2&#34;, &#34;Value2&#34;)
 *             ))
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Stateful Inspection for blocking packets from going to an intended destination
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.networkfirewall.RuleGroup;
 * import com.pulumi.aws.networkfirewall.RuleGroupArgs;
 * import com.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupArgs;
 * import com.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupRulesSourceArgs;
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
 *         var example = new RuleGroup(&#34;example&#34;, RuleGroupArgs.builder()        
 *             .capacity(100)
 *             .name(&#34;example&#34;)
 *             .type(&#34;STATEFUL&#34;)
 *             .ruleGroup(RuleGroupRuleGroupArgs.builder()
 *                 .rulesSource(RuleGroupRuleGroupRulesSourceArgs.builder()
 *                     .statefulRules(RuleGroupRuleGroupRulesSourceStatefulRuleArgs.builder()
 *                         .action(&#34;DROP&#34;)
 *                         .header(RuleGroupRuleGroupRulesSourceStatefulRuleHeaderArgs.builder()
 *                             .destination(&#34;124.1.1.24/32&#34;)
 *                             .destinationPort(53)
 *                             .direction(&#34;ANY&#34;)
 *                             .protocol(&#34;TCP&#34;)
 *                             .source(&#34;1.2.3.4/32&#34;)
 *                             .sourcePort(53)
 *                             .build())
 *                         .ruleOptions(RuleGroupRuleGroupRulesSourceStatefulRuleRuleOptionArgs.builder()
 *                             .keyword(&#34;sid&#34;)
 *                             .settings(&#34;1&#34;)
 *                             .build())
 *                         .build())
 *                     .build())
 *                 .build())
 *             .tags(Map.ofEntries(
 *                 Map.entry(&#34;Tag1&#34;, &#34;Value1&#34;),
 *                 Map.entry(&#34;Tag2&#34;, &#34;Value2&#34;)
 *             ))
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Stateful Inspection from rules specifications defined in Suricata flat format
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.networkfirewall.RuleGroup;
 * import com.pulumi.aws.networkfirewall.RuleGroupArgs;
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
 *         var example = new RuleGroup(&#34;example&#34;, RuleGroupArgs.builder()        
 *             .capacity(100)
 *             .name(&#34;example&#34;)
 *             .type(&#34;STATEFUL&#34;)
 *             .rules(StdFunctions.file(FileArgs.builder()
 *                 .input(&#34;example.rules&#34;)
 *                 .build()).result())
 *             .tags(Map.ofEntries(
 *                 Map.entry(&#34;Tag1&#34;, &#34;Value1&#34;),
 *                 Map.entry(&#34;Tag2&#34;, &#34;Value2&#34;)
 *             ))
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Stateful Inspection from rule group specifications using rule variables and Suricata format rules
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.networkfirewall.RuleGroup;
 * import com.pulumi.aws.networkfirewall.RuleGroupArgs;
 * import com.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupArgs;
 * import com.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupRuleVariablesArgs;
 * import com.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupRulesSourceArgs;
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
 *         var example = new RuleGroup(&#34;example&#34;, RuleGroupArgs.builder()        
 *             .capacity(100)
 *             .name(&#34;example&#34;)
 *             .type(&#34;STATEFUL&#34;)
 *             .ruleGroup(RuleGroupRuleGroupArgs.builder()
 *                 .ruleVariables(RuleGroupRuleGroupRuleVariablesArgs.builder()
 *                     .ipSets(                    
 *                         RuleGroupRuleGroupRuleVariablesIpSetArgs.builder()
 *                             .key(&#34;WEBSERVERS_HOSTS&#34;)
 *                             .ipSet(RuleGroupRuleGroupRuleVariablesIpSetIpSetArgs.builder()
 *                                 .definitions(                                
 *                                     &#34;10.0.0.0/16&#34;,
 *                                     &#34;10.0.1.0/24&#34;,
 *                                     &#34;192.168.0.0/16&#34;)
 *                                 .build())
 *                             .build(),
 *                         RuleGroupRuleGroupRuleVariablesIpSetArgs.builder()
 *                             .key(&#34;EXTERNAL_HOST&#34;)
 *                             .ipSet(RuleGroupRuleGroupRuleVariablesIpSetIpSetArgs.builder()
 *                                 .definitions(&#34;1.2.3.4/32&#34;)
 *                                 .build())
 *                             .build())
 *                     .portSets(RuleGroupRuleGroupRuleVariablesPortSetArgs.builder()
 *                         .key(&#34;HTTP_PORTS&#34;)
 *                         .portSet(RuleGroupRuleGroupRuleVariablesPortSetPortSetArgs.builder()
 *                             .definitions(                            
 *                                 &#34;443&#34;,
 *                                 &#34;80&#34;)
 *                             .build())
 *                         .build())
 *                     .build())
 *                 .rulesSource(RuleGroupRuleGroupRulesSourceArgs.builder()
 *                     .rulesString(StdFunctions.file(FileArgs.builder()
 *                         .input(&#34;suricata_rules_file&#34;)
 *                         .build()).result())
 *                     .build())
 *                 .build())
 *             .tags(Map.ofEntries(
 *                 Map.entry(&#34;Tag1&#34;, &#34;Value1&#34;),
 *                 Map.entry(&#34;Tag2&#34;, &#34;Value2&#34;)
 *             ))
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Stateless Inspection with a Custom Action
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.networkfirewall.RuleGroup;
 * import com.pulumi.aws.networkfirewall.RuleGroupArgs;
 * import com.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupArgs;
 * import com.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupRulesSourceArgs;
 * import com.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsArgs;
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
 *         var example = new RuleGroup(&#34;example&#34;, RuleGroupArgs.builder()        
 *             .description(&#34;Stateless Rate Limiting Rule&#34;)
 *             .capacity(100)
 *             .name(&#34;example&#34;)
 *             .type(&#34;STATELESS&#34;)
 *             .ruleGroup(RuleGroupRuleGroupArgs.builder()
 *                 .rulesSource(RuleGroupRuleGroupRulesSourceArgs.builder()
 *                     .statelessRulesAndCustomActions(RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsArgs.builder()
 *                         .customActions(RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsCustomActionArgs.builder()
 *                             .actionDefinition(RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsCustomActionActionDefinitionArgs.builder()
 *                                 .publishMetricAction(RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsCustomActionActionDefinitionPublishMetricActionArgs.builder()
 *                                     .dimensions(RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsCustomActionActionDefinitionPublishMetricActionDimensionArgs.builder()
 *                                         .value(&#34;2&#34;)
 *                                         .build())
 *                                     .build())
 *                                 .build())
 *                             .actionName(&#34;ExampleMetricsAction&#34;)
 *                             .build())
 *                         .statelessRules(RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleArgs.builder()
 *                             .priority(1)
 *                             .ruleDefinition(RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionArgs.builder()
 *                                 .actions(                                
 *                                     &#34;aws:pass&#34;,
 *                                     &#34;ExampleMetricsAction&#34;)
 *                                 .matchAttributes(RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesArgs.builder()
 *                                     .sources(RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesSourceArgs.builder()
 *                                         .addressDefinition(&#34;1.2.3.4/32&#34;)
 *                                         .build())
 *                                     .sourcePorts(RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesSourcePortArgs.builder()
 *                                         .fromPort(443)
 *                                         .toPort(443)
 *                                         .build())
 *                                     .destinations(RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesDestinationArgs.builder()
 *                                         .addressDefinition(&#34;124.1.1.5/32&#34;)
 *                                         .build())
 *                                     .destinationPorts(RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesDestinationPortArgs.builder()
 *                                         .fromPort(443)
 *                                         .toPort(443)
 *                                         .build())
 *                                     .protocols(6)
 *                                     .tcpFlags(RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesTcpFlagArgs.builder()
 *                                         .flags(&#34;SYN&#34;)
 *                                         .masks(                                        
 *                                             &#34;SYN&#34;,
 *                                             &#34;ACK&#34;)
 *                                         .build())
 *                                     .build())
 *                                 .build())
 *                             .build())
 *                         .build())
 *                     .build())
 *                 .build())
 *             .tags(Map.ofEntries(
 *                 Map.entry(&#34;Tag1&#34;, &#34;Value1&#34;),
 *                 Map.entry(&#34;Tag2&#34;, &#34;Value2&#34;)
 *             ))
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### IP Set References to the Rule Group
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.networkfirewall.RuleGroup;
 * import com.pulumi.aws.networkfirewall.RuleGroupArgs;
 * import com.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupArgs;
 * import com.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupRulesSourceArgs;
 * import com.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupRulesSourceRulesSourceListArgs;
 * import com.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupReferenceSetsArgs;
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
 *         var example = new RuleGroup(&#34;example&#34;, RuleGroupArgs.builder()        
 *             .capacity(100)
 *             .name(&#34;example&#34;)
 *             .type(&#34;STATEFUL&#34;)
 *             .ruleGroup(RuleGroupRuleGroupArgs.builder()
 *                 .rulesSource(RuleGroupRuleGroupRulesSourceArgs.builder()
 *                     .rulesSourceList(RuleGroupRuleGroupRulesSourceRulesSourceListArgs.builder()
 *                         .generatedRulesType(&#34;DENYLIST&#34;)
 *                         .targetTypes(&#34;HTTP_HOST&#34;)
 *                         .targets(&#34;test.example.com&#34;)
 *                         .build())
 *                     .build())
 *                 .referenceSets(RuleGroupRuleGroupReferenceSetsArgs.builder()
 *                     .ipSetReferences(RuleGroupRuleGroupReferenceSetsIpSetReferenceArgs.builder()
 *                         .key(&#34;example&#34;)
 *                         .ipSetReferences(RuleGroupRuleGroupReferenceSetsIpSetReferenceIpSetReferenceArgs.builder()
 *                             .referenceArn(this_.arn())
 *                             .build())
 *                         .build())
 *                     .build())
 *                 .build())
 *             .tags(Map.ofEntries(
 *                 Map.entry(&#34;Tag1&#34;, &#34;Value1&#34;),
 *                 Map.entry(&#34;Tag2&#34;, &#34;Value2&#34;)
 *             ))
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import Network Firewall Rule Groups using their `arn`. For example:
 * 
 * ```sh
 *  $ pulumi import aws:networkfirewall/ruleGroup:RuleGroup example arn:aws:network-firewall:us-west-1:123456789012:stateful-rulegroup/example
 * ```
 * 
 */
@ResourceType(type="aws:networkfirewall/ruleGroup:RuleGroup")
public class RuleGroup extends com.pulumi.resources.CustomResource {
    /**
     * The Amazon Resource Name (ARN) that identifies the rule group.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) that identifies the rule group.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The maximum number of operating resources that this rule group can use. For a stateless rule group, the capacity required is the sum of the capacity requirements of the individual rules. For a stateful rule group, the minimum capacity required is the number of individual rules.
     * 
     */
    @Export(name="capacity", refs={Integer.class}, tree="[0]")
    private Output<Integer> capacity;

    /**
     * @return The maximum number of operating resources that this rule group can use. For a stateless rule group, the capacity required is the sum of the capacity requirements of the individual rules. For a stateful rule group, the minimum capacity required is the number of individual rules.
     * 
     */
    public Output<Integer> capacity() {
        return this.capacity;
    }
    /**
     * A friendly description of the rule group.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return A friendly description of the rule group.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * KMS encryption configuration settings. See Encryption Configuration below for details.
     * 
     */
    @Export(name="encryptionConfiguration", refs={RuleGroupEncryptionConfiguration.class}, tree="[0]")
    private Output</* @Nullable */ RuleGroupEncryptionConfiguration> encryptionConfiguration;

    /**
     * @return KMS encryption configuration settings. See Encryption Configuration below for details.
     * 
     */
    public Output<Optional<RuleGroupEncryptionConfiguration>> encryptionConfiguration() {
        return Codegen.optional(this.encryptionConfiguration);
    }
    /**
     * A friendly name of the rule group.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return A friendly name of the rule group.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * A configuration block that defines the rule group rules. Required unless `rules` is specified. See Rule Group below for details.
     * 
     */
    @Export(name="ruleGroup", refs={RuleGroupRuleGroup.class}, tree="[0]")
    private Output<RuleGroupRuleGroup> ruleGroup;

    /**
     * @return A configuration block that defines the rule group rules. Required unless `rules` is specified. See Rule Group below for details.
     * 
     */
    public Output<RuleGroupRuleGroup> ruleGroup() {
        return this.ruleGroup;
    }
    /**
     * The stateful rule group rules specifications in Suricata file format, with one rule per line. Use this to import your existing Suricata compatible rule groups. Required unless `rule_group` is specified.
     * 
     */
    @Export(name="rules", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> rules;

    /**
     * @return The stateful rule group rules specifications in Suricata file format, with one rule per line. Use this to import your existing Suricata compatible rule groups. Required unless `rule_group` is specified.
     * 
     */
    public Output<Optional<String>> rules() {
        return Codegen.optional(this.rules);
    }
    /**
     * A map of key:value pairs to associate with the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of key:value pairs to associate with the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
     * Whether the rule group is stateless (containing stateless rules) or stateful (containing stateful rules). Valid values include: `STATEFUL` or `STATELESS`.
     * 
     */
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output<String> type;

    /**
     * @return Whether the rule group is stateless (containing stateless rules) or stateful (containing stateful rules). Valid values include: `STATEFUL` or `STATELESS`.
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * A string token used when updating the rule group.
     * 
     */
    @Export(name="updateToken", refs={String.class}, tree="[0]")
    private Output<String> updateToken;

    /**
     * @return A string token used when updating the rule group.
     * 
     */
    public Output<String> updateToken() {
        return this.updateToken;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RuleGroup(String name) {
        this(name, RuleGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RuleGroup(String name, RuleGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RuleGroup(String name, RuleGroupArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:networkfirewall/ruleGroup:RuleGroup", name, args == null ? RuleGroupArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private RuleGroup(String name, Output<String> id, @Nullable RuleGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:networkfirewall/ruleGroup:RuleGroup", name, state, makeResourceOptions(options, id));
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
    public static RuleGroup get(String name, Output<String> id, @Nullable RuleGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new RuleGroup(name, id, state, options);
    }
}

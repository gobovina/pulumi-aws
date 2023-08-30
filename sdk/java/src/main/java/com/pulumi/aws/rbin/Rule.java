// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.rbin;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.rbin.RuleArgs;
import com.pulumi.aws.rbin.inputs.RuleState;
import com.pulumi.aws.rbin.outputs.RuleLockConfiguration;
import com.pulumi.aws.rbin.outputs.RuleResourceTag;
import com.pulumi.aws.rbin.outputs.RuleRetentionPeriod;
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
 * Resource for managing an AWS RBin Rule.
 * 
 * ## Example Usage
 * ### Basic Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.rbin.Rule;
 * import com.pulumi.aws.rbin.RuleArgs;
 * import com.pulumi.aws.rbin.inputs.RuleResourceTagArgs;
 * import com.pulumi.aws.rbin.inputs.RuleRetentionPeriodArgs;
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
 *         var example = new Rule(&#34;example&#34;, RuleArgs.builder()        
 *             .description(&#34;example_rule&#34;)
 *             .resourceTags(RuleResourceTagArgs.builder()
 *                 .resourceTagKey(&#34;tag_key&#34;)
 *                 .resourceTagValue(&#34;tag_value&#34;)
 *                 .build())
 *             .resourceType(&#34;EBS_SNAPSHOT&#34;)
 *             .retentionPeriod(RuleRetentionPeriodArgs.builder()
 *                 .retentionPeriodUnit(&#34;DAYS&#34;)
 *                 .retentionPeriodValue(10)
 *                 .build())
 *             .tags(Map.of(&#34;test_tag_key&#34;, &#34;test_tag_value&#34;))
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import RBin Rule using the `id`. For example:
 * 
 * ```sh
 *  $ pulumi import aws:rbin/rule:Rule example examplerule
 * ```
 * 
 */
@ResourceType(type="aws:rbin/rule:Rule")
public class Rule extends com.pulumi.resources.CustomResource {
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The retention rule description.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output<String> description;

    /**
     * @return The retention rule description.
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    /**
     * Information about the retention rule lock configuration. See `lock_configuration` below.
     * 
     */
    @Export(name="lockConfiguration", refs={RuleLockConfiguration.class}, tree="[0]")
    private Output</* @Nullable */ RuleLockConfiguration> lockConfiguration;

    /**
     * @return Information about the retention rule lock configuration. See `lock_configuration` below.
     * 
     */
    public Output<Optional<RuleLockConfiguration>> lockConfiguration() {
        return Codegen.optional(this.lockConfiguration);
    }
    /**
     * (Timestamp) The date and time at which the unlock delay is set to expire. Only returned for retention rules that have been unlocked and that are still within the unlock delay period.
     * 
     */
    @Export(name="lockEndTime", refs={String.class}, tree="[0]")
    private Output<String> lockEndTime;

    /**
     * @return (Timestamp) The date and time at which the unlock delay is set to expire. Only returned for retention rules that have been unlocked and that are still within the unlock delay period.
     * 
     */
    public Output<String> lockEndTime() {
        return this.lockEndTime;
    }
    /**
     * (Optional) The lock state of the retention rules to list. Only retention rules with the specified lock state are returned. Valid values are `locked`, `pending_unlock`, `unlocked`.
     * 
     */
    @Export(name="lockState", refs={String.class}, tree="[0]")
    private Output<String> lockState;

    /**
     * @return (Optional) The lock state of the retention rules to list. Only retention rules with the specified lock state are returned. Valid values are `locked`, `pending_unlock`, `unlocked`.
     * 
     */
    public Output<String> lockState() {
        return this.lockState;
    }
    /**
     * Specifies the resource tags to use to identify resources that are to be retained by a tag-level retention rule. See `resource_tags` below.
     * 
     */
    @Export(name="resourceTags", refs={List.class,RuleResourceTag.class}, tree="[0,1]")
    private Output<List<RuleResourceTag>> resourceTags;

    /**
     * @return Specifies the resource tags to use to identify resources that are to be retained by a tag-level retention rule. See `resource_tags` below.
     * 
     */
    public Output<List<RuleResourceTag>> resourceTags() {
        return this.resourceTags;
    }
    /**
     * The resource type to be retained by the retention rule. Valid values are `EBS_SNAPSHOT` and `EC2_IMAGE`.
     * 
     */
    @Export(name="resourceType", refs={String.class}, tree="[0]")
    private Output<String> resourceType;

    /**
     * @return The resource type to be retained by the retention rule. Valid values are `EBS_SNAPSHOT` and `EC2_IMAGE`.
     * 
     */
    public Output<String> resourceType() {
        return this.resourceType;
    }
    /**
     * Information about the retention period for which the retention rule is to retain resources. See `retention_period` below.
     * 
     * The following arguments are optional:
     * 
     */
    @Export(name="retentionPeriod", refs={RuleRetentionPeriod.class}, tree="[0]")
    private Output<RuleRetentionPeriod> retentionPeriod;

    /**
     * @return Information about the retention period for which the retention rule is to retain resources. See `retention_period` below.
     * 
     * The following arguments are optional:
     * 
     */
    public Output<RuleRetentionPeriod> retentionPeriod() {
        return this.retentionPeriod;
    }
    /**
     * (String) The state of the retention rule. Only retention rules that are in the `available` state retain resources. Valid values include `pending` and `available`.
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return (String) The state of the retention rule. Only retention rules that are in the `available` state retain resources. Valid values include `pending` and `available`.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    @Export(name="tagsAll", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Rule(String name) {
        this(name, RuleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Rule(String name, RuleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Rule(String name, RuleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:rbin/rule:Rule", name, args == null ? RuleArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Rule(String name, Output<String> id, @Nullable RuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:rbin/rule:Rule", name, state, makeResourceOptions(options, id));
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
    public static Rule get(String name, Output<String> id, @Nullable RuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Rule(name, id, state, options);
    }
}

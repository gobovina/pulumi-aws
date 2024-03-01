// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.backup;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.backup.PlanArgs;
import com.pulumi.aws.backup.inputs.PlanState;
import com.pulumi.aws.backup.outputs.PlanAdvancedBackupSetting;
import com.pulumi.aws.backup.outputs.PlanRule;
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
 * Provides an AWS Backup plan resource.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.backup.Plan;
 * import com.pulumi.aws.backup.PlanArgs;
 * import com.pulumi.aws.backup.inputs.PlanRuleArgs;
 * import com.pulumi.aws.backup.inputs.PlanRuleLifecycleArgs;
 * import com.pulumi.aws.backup.inputs.PlanAdvancedBackupSettingArgs;
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
 *         var example = new Plan(&#34;example&#34;, PlanArgs.builder()        
 *             .name(&#34;my_example_backup_plan&#34;)
 *             .rules(PlanRuleArgs.builder()
 *                 .ruleName(&#34;my_example_backup_rule&#34;)
 *                 .targetVaultName(test.name())
 *                 .schedule(&#34;cron(0 12 * * ? *)&#34;)
 *                 .lifecycle(PlanRuleLifecycleArgs.builder()
 *                     .deleteAfter(14)
 *                     .build())
 *                 .build())
 *             .advancedBackupSettings(PlanAdvancedBackupSettingArgs.builder()
 *                 .backupOptions(Map.of(&#34;WindowsVSS&#34;, &#34;enabled&#34;))
 *                 .resourceType(&#34;EC2&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import Backup Plan using the `id`. For example:
 * 
 * ```sh
 *  $ pulumi import aws:backup/plan:Plan test &lt;id&gt;
 * ```
 * 
 */
@ResourceType(type="aws:backup/plan:Plan")
public class Plan extends com.pulumi.resources.CustomResource {
    /**
     * An object that specifies backup options for each resource type.
     * 
     */
    @Export(name="advancedBackupSettings", refs={List.class,PlanAdvancedBackupSetting.class}, tree="[0,1]")
    private Output</* @Nullable */ List<PlanAdvancedBackupSetting>> advancedBackupSettings;

    /**
     * @return An object that specifies backup options for each resource type.
     * 
     */
    public Output<Optional<List<PlanAdvancedBackupSetting>>> advancedBackupSettings() {
        return Codegen.optional(this.advancedBackupSettings);
    }
    /**
     * The ARN of the backup plan.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return The ARN of the backup plan.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The display name of a backup plan.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The display name of a backup plan.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * A rule object that specifies a scheduled task that is used to back up a selection of resources.
     * 
     */
    @Export(name="rules", refs={List.class,PlanRule.class}, tree="[0,1]")
    private Output<List<PlanRule>> rules;

    /**
     * @return A rule object that specifies a scheduled task that is used to back up a selection of resources.
     * 
     */
    public Output<List<PlanRule>> rules() {
        return this.rules;
    }
    /**
     * Metadata that you can assign to help organize the plans you create. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Metadata that you can assign to help organize the plans you create. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
     * Unique, randomly generated, Unicode, UTF-8 encoded string that serves as the version ID of the backup plan.
     * 
     */
    @Export(name="version", refs={String.class}, tree="[0]")
    private Output<String> version;

    /**
     * @return Unique, randomly generated, Unicode, UTF-8 encoded string that serves as the version ID of the backup plan.
     * 
     */
    public Output<String> version() {
        return this.version;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Plan(String name) {
        this(name, PlanArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Plan(String name, PlanArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Plan(String name, PlanArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:backup/plan:Plan", name, args == null ? PlanArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Plan(String name, Output<String> id, @Nullable PlanState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:backup/plan:Plan", name, state, makeResourceOptions(options, id));
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
    public static Plan get(String name, Output<String> id, @Nullable PlanState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Plan(name, id, state, options);
    }
}

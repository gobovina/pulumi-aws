// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.redshift;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.redshift.SnapshotScheduleArgs;
import com.pulumi.aws.redshift.inputs.SnapshotScheduleState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.redshift.SnapshotSchedule;
 * import com.pulumi.aws.redshift.SnapshotScheduleArgs;
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
 *         var default_ = new SnapshotSchedule("default", SnapshotScheduleArgs.builder()
 *             .identifier("tf-redshift-snapshot-schedule")
 *             .definitions("rate(12 hours)")
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Using `pulumi import`, import Redshift Snapshot Schedule using the `identifier`. For example:
 * 
 * ```sh
 * $ pulumi import aws:redshift/snapshotSchedule:SnapshotSchedule default tf-redshift-snapshot-schedule
 * ```
 * 
 */
@ResourceType(type="aws:redshift/snapshotSchedule:SnapshotSchedule")
public class SnapshotSchedule extends com.pulumi.resources.CustomResource {
    /**
     * Amazon Resource Name (ARN) of the Redshift Snapshot Schedule.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return Amazon Resource Name (ARN) of the Redshift Snapshot Schedule.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The definition of the snapshot schedule. The definition is made up of schedule expressions, for example `cron(30 12 *)` or `rate(12 hours)`.
     * 
     */
    @Export(name="definitions", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> definitions;

    /**
     * @return The definition of the snapshot schedule. The definition is made up of schedule expressions, for example `cron(30 12 *)` or `rate(12 hours)`.
     * 
     */
    public Output<List<String>> definitions() {
        return this.definitions;
    }
    /**
     * The description of the snapshot schedule.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the snapshot schedule.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Whether to destroy all associated clusters with this snapshot schedule on deletion. Must be enabled and applied before attempting deletion.
     * 
     */
    @Export(name="forceDestroy", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> forceDestroy;

    /**
     * @return Whether to destroy all associated clusters with this snapshot schedule on deletion. Must be enabled and applied before attempting deletion.
     * 
     */
    public Output<Optional<Boolean>> forceDestroy() {
        return Codegen.optional(this.forceDestroy);
    }
    /**
     * The snapshot schedule identifier. If omitted, this provider will assign a random, unique identifier.
     * 
     */
    @Export(name="identifier", refs={String.class}, tree="[0]")
    private Output<String> identifier;

    /**
     * @return The snapshot schedule identifier. If omitted, this provider will assign a random, unique identifier.
     * 
     */
    public Output<String> identifier() {
        return this.identifier;
    }
    /**
     * Creates a unique
     * identifier beginning with the specified prefix. Conflicts with `identifier`.
     * 
     */
    @Export(name="identifierPrefix", refs={String.class}, tree="[0]")
    private Output<String> identifierPrefix;

    /**
     * @return Creates a unique
     * identifier beginning with the specified prefix. Conflicts with `identifier`.
     * 
     */
    public Output<String> identifierPrefix() {
        return this.identifierPrefix;
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
    public SnapshotSchedule(String name) {
        this(name, SnapshotScheduleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SnapshotSchedule(String name, SnapshotScheduleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SnapshotSchedule(String name, SnapshotScheduleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:redshift/snapshotSchedule:SnapshotSchedule", name, args == null ? SnapshotScheduleArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private SnapshotSchedule(String name, Output<String> id, @Nullable SnapshotScheduleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:redshift/snapshotSchedule:SnapshotSchedule", name, state, makeResourceOptions(options, id));
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
    public static SnapshotSchedule get(String name, Output<String> id, @Nullable SnapshotScheduleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SnapshotSchedule(name, id, state, options);
    }
}

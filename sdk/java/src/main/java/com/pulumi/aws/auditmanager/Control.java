// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.auditmanager;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.auditmanager.ControlArgs;
import com.pulumi.aws.auditmanager.inputs.ControlState;
import com.pulumi.aws.auditmanager.outputs.ControlControlMappingSource;
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
 * Resource for managing an AWS Audit Manager Control.
 * 
 * ## Example Usage
 * 
 * ### Basic Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.auditmanager.Control;
 * import com.pulumi.aws.auditmanager.ControlArgs;
 * import com.pulumi.aws.auditmanager.inputs.ControlControlMappingSourceArgs;
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
 *         var example = new Control("example", ControlArgs.builder()
 *             .name("example")
 *             .controlMappingSources(ControlControlMappingSourceArgs.builder()
 *                 .sourceName("example")
 *                 .sourceSetUpOption("Procedural_Controls_Mapping")
 *                 .sourceType("MANUAL")
 *                 .build())
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
 * Using `pulumi import`, import an Audit Manager Control using the `id`. For example:
 * 
 * ```sh
 * $ pulumi import aws:auditmanager/control:Control example abc123-de45
 * ```
 * 
 */
@ResourceType(type="aws:auditmanager/control:Control")
public class Control extends com.pulumi.resources.CustomResource {
    /**
     * Recommended actions to carry out if the control isn&#39;t fulfilled.
     * 
     */
    @Export(name="actionPlanInstructions", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> actionPlanInstructions;

    /**
     * @return Recommended actions to carry out if the control isn&#39;t fulfilled.
     * 
     */
    public Output<Optional<String>> actionPlanInstructions() {
        return Codegen.optional(this.actionPlanInstructions);
    }
    /**
     * Title of the action plan for remediating the control.
     * 
     */
    @Export(name="actionPlanTitle", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> actionPlanTitle;

    /**
     * @return Title of the action plan for remediating the control.
     * 
     */
    public Output<Optional<String>> actionPlanTitle() {
        return Codegen.optional(this.actionPlanTitle);
    }
    /**
     * Amazon Resource Name (ARN) of the control.
     * * `control_mapping_sources.*.source_id` - Unique identifier for the source.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return Amazon Resource Name (ARN) of the control.
     * * `control_mapping_sources.*.source_id` - Unique identifier for the source.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * Data mapping sources. See `control_mapping_sources` below.
     * 
     * The following arguments are optional:
     * 
     */
    @Export(name="controlMappingSources", refs={List.class,ControlControlMappingSource.class}, tree="[0,1]")
    private Output</* @Nullable */ List<ControlControlMappingSource>> controlMappingSources;

    /**
     * @return Data mapping sources. See `control_mapping_sources` below.
     * 
     * The following arguments are optional:
     * 
     */
    public Output<Optional<List<ControlControlMappingSource>>> controlMappingSources() {
        return Codegen.optional(this.controlMappingSources);
    }
    /**
     * Description of the control.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return Description of the control.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Name of the control.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of the control.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * A map of tags to assign to the control. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the control. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * @deprecated
     * Please use `tags` instead.
     * 
     */
    @Deprecated /* Please use `tags` instead. */
    @Export(name="tagsAll", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }
    /**
     * Steps to follow to determine if the control is satisfied.
     * 
     */
    @Export(name="testingInformation", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> testingInformation;

    /**
     * @return Steps to follow to determine if the control is satisfied.
     * 
     */
    public Output<Optional<String>> testingInformation() {
        return Codegen.optional(this.testingInformation);
    }
    /**
     * Type of control, such as a custom control or a standard control.
     * 
     */
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output<String> type;

    /**
     * @return Type of control, such as a custom control or a standard control.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Control(String name) {
        this(name, ControlArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Control(String name, @Nullable ControlArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Control(String name, @Nullable ControlArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:auditmanager/control:Control", name, args == null ? ControlArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Control(String name, Output<String> id, @Nullable ControlState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:auditmanager/control:Control", name, state, makeResourceOptions(options, id));
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
    public static Control get(String name, Output<String> id, @Nullable ControlState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Control(name, id, state, options);
    }
}

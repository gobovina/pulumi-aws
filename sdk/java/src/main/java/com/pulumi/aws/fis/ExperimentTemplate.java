// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.fis;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.fis.ExperimentTemplateArgs;
import com.pulumi.aws.fis.inputs.ExperimentTemplateState;
import com.pulumi.aws.fis.outputs.ExperimentTemplateAction;
import com.pulumi.aws.fis.outputs.ExperimentTemplateLogConfiguration;
import com.pulumi.aws.fis.outputs.ExperimentTemplateStopCondition;
import com.pulumi.aws.fis.outputs.ExperimentTemplateTarget;
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
 * Provides an FIS Experiment Template, which can be used to run an experiment.
 * An experiment template contains one or more actions to run on specified targets during an experiment.
 * It also contains the stop conditions that prevent the experiment from going out of bounds.
 * See [Amazon Fault Injection Simulator](https://docs.aws.amazon.com/fis/index.html)
 * for more information.
 * 
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.fis.ExperimentTemplate;
 * import com.pulumi.aws.fis.ExperimentTemplateArgs;
 * import com.pulumi.aws.fis.inputs.ExperimentTemplateStopConditionArgs;
 * import com.pulumi.aws.fis.inputs.ExperimentTemplateActionArgs;
 * import com.pulumi.aws.fis.inputs.ExperimentTemplateActionTargetArgs;
 * import com.pulumi.aws.fis.inputs.ExperimentTemplateTargetArgs;
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
 *         var example = new ExperimentTemplate(&#34;example&#34;, ExperimentTemplateArgs.builder()        
 *             .description(&#34;example&#34;)
 *             .roleArn(exampleAwsIamRole.arn())
 *             .stopConditions(ExperimentTemplateStopConditionArgs.builder()
 *                 .source(&#34;none&#34;)
 *                 .build())
 *             .actions(ExperimentTemplateActionArgs.builder()
 *                 .name(&#34;example-action&#34;)
 *                 .actionId(&#34;aws:ec2:terminate-instances&#34;)
 *                 .target(ExperimentTemplateActionTargetArgs.builder()
 *                     .key(&#34;Instances&#34;)
 *                     .value(&#34;example-target&#34;)
 *                     .build())
 *                 .build())
 *             .targets(ExperimentTemplateTargetArgs.builder()
 *                 .name(&#34;example-target&#34;)
 *                 .resourceType(&#34;aws:ec2:instance&#34;)
 *                 .selectionMode(&#34;COUNT(1)&#34;)
 *                 .resourceTags(ExperimentTemplateTargetResourceTagArgs.builder()
 *                     .key(&#34;env&#34;)
 *                     .value(&#34;example&#34;)
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Using `pulumi import`, import FIS Experiment Templates using the `id`. For example:
 * 
 * ```sh
 * $ pulumi import aws:fis/experimentTemplate:ExperimentTemplate template EXT123AbCdEfGhIjK
 * ```
 * 
 */
@ResourceType(type="aws:fis/experimentTemplate:ExperimentTemplate")
public class ExperimentTemplate extends com.pulumi.resources.CustomResource {
    /**
     * Action to be performed during an experiment. See below.
     * 
     */
    @Export(name="actions", refs={List.class,ExperimentTemplateAction.class}, tree="[0,1]")
    private Output<List<ExperimentTemplateAction>> actions;

    /**
     * @return Action to be performed during an experiment. See below.
     * 
     */
    public Output<List<ExperimentTemplateAction>> actions() {
        return this.actions;
    }
    /**
     * Description for the experiment template.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output<String> description;

    /**
     * @return Description for the experiment template.
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    /**
     * The configuration for experiment logging. See below.
     * 
     */
    @Export(name="logConfiguration", refs={ExperimentTemplateLogConfiguration.class}, tree="[0]")
    private Output</* @Nullable */ ExperimentTemplateLogConfiguration> logConfiguration;

    /**
     * @return The configuration for experiment logging. See below.
     * 
     */
    public Output<Optional<ExperimentTemplateLogConfiguration>> logConfiguration() {
        return Codegen.optional(this.logConfiguration);
    }
    /**
     * ARN of an IAM role that grants the AWS FIS service permission to perform service actions on your behalf.
     * 
     */
    @Export(name="roleArn", refs={String.class}, tree="[0]")
    private Output<String> roleArn;

    /**
     * @return ARN of an IAM role that grants the AWS FIS service permission to perform service actions on your behalf.
     * 
     */
    public Output<String> roleArn() {
        return this.roleArn;
    }
    /**
     * When an ongoing experiment should be stopped. See below.
     * 
     * The following arguments are optional:
     * 
     */
    @Export(name="stopConditions", refs={List.class,ExperimentTemplateStopCondition.class}, tree="[0,1]")
    private Output<List<ExperimentTemplateStopCondition>> stopConditions;

    /**
     * @return When an ongoing experiment should be stopped. See below.
     * 
     * The following arguments are optional:
     * 
     */
    public Output<List<ExperimentTemplateStopCondition>> stopConditions() {
        return this.stopConditions;
    }
    /**
     * Key-value mapping of tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Key-value mapping of tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
     * Target of an action. See below.
     * 
     */
    @Export(name="targets", refs={List.class,ExperimentTemplateTarget.class}, tree="[0,1]")
    private Output</* @Nullable */ List<ExperimentTemplateTarget>> targets;

    /**
     * @return Target of an action. See below.
     * 
     */
    public Output<Optional<List<ExperimentTemplateTarget>>> targets() {
        return Codegen.optional(this.targets);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ExperimentTemplate(String name) {
        this(name, ExperimentTemplateArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ExperimentTemplate(String name, ExperimentTemplateArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ExperimentTemplate(String name, ExperimentTemplateArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:fis/experimentTemplate:ExperimentTemplate", name, args == null ? ExperimentTemplateArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ExperimentTemplate(String name, Output<String> id, @Nullable ExperimentTemplateState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:fis/experimentTemplate:ExperimentTemplate", name, state, makeResourceOptions(options, id));
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
    public static ExperimentTemplate get(String name, Output<String> id, @Nullable ExperimentTemplateState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ExperimentTemplate(name, id, state, options);
    }
}

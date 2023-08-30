// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.sagemaker;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.sagemaker.FlowDefinitionArgs;
import com.pulumi.aws.sagemaker.inputs.FlowDefinitionState;
import com.pulumi.aws.sagemaker.outputs.FlowDefinitionHumanLoopActivationConfig;
import com.pulumi.aws.sagemaker.outputs.FlowDefinitionHumanLoopConfig;
import com.pulumi.aws.sagemaker.outputs.FlowDefinitionHumanLoopRequestSource;
import com.pulumi.aws.sagemaker.outputs.FlowDefinitionOutputConfig;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a SageMaker Flow Definition resource.
 * 
 * ## Example Usage
 * ### Basic Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.sagemaker.FlowDefinition;
 * import com.pulumi.aws.sagemaker.FlowDefinitionArgs;
 * import com.pulumi.aws.sagemaker.inputs.FlowDefinitionHumanLoopConfigArgs;
 * import com.pulumi.aws.sagemaker.inputs.FlowDefinitionOutputConfigArgs;
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
 *         var example = new FlowDefinition(&#34;example&#34;, FlowDefinitionArgs.builder()        
 *             .flowDefinitionName(&#34;example&#34;)
 *             .roleArn(aws_iam_role.example().arn())
 *             .humanLoopConfig(FlowDefinitionHumanLoopConfigArgs.builder()
 *                 .humanTaskUiArn(aws_sagemaker_human_task_ui.example().arn())
 *                 .taskAvailabilityLifetimeInSeconds(1)
 *                 .taskCount(1)
 *                 .taskDescription(&#34;example&#34;)
 *                 .taskTitle(&#34;example&#34;)
 *                 .workteamArn(aws_sagemaker_workteam.example().arn())
 *                 .build())
 *             .outputConfig(FlowDefinitionOutputConfigArgs.builder()
 *                 .s3OutputPath(String.format(&#34;s3://%s/&#34;, aws_s3_bucket.example().bucket()))
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Public Workteam Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.sagemaker.FlowDefinition;
 * import com.pulumi.aws.sagemaker.FlowDefinitionArgs;
 * import com.pulumi.aws.sagemaker.inputs.FlowDefinitionHumanLoopConfigArgs;
 * import com.pulumi.aws.sagemaker.inputs.FlowDefinitionHumanLoopConfigPublicWorkforceTaskPriceArgs;
 * import com.pulumi.aws.sagemaker.inputs.FlowDefinitionHumanLoopConfigPublicWorkforceTaskPriceAmountInUsdArgs;
 * import com.pulumi.aws.sagemaker.inputs.FlowDefinitionOutputConfigArgs;
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
 *         var example = new FlowDefinition(&#34;example&#34;, FlowDefinitionArgs.builder()        
 *             .flowDefinitionName(&#34;example&#34;)
 *             .roleArn(aws_iam_role.example().arn())
 *             .humanLoopConfig(FlowDefinitionHumanLoopConfigArgs.builder()
 *                 .humanTaskUiArn(aws_sagemaker_human_task_ui.example().arn())
 *                 .taskAvailabilityLifetimeInSeconds(1)
 *                 .taskCount(1)
 *                 .taskDescription(&#34;example&#34;)
 *                 .taskTitle(&#34;example&#34;)
 *                 .workteamArn(String.format(&#34;arn:aws:sagemaker:%s:394669845002:workteam/public-crowd/default&#34;, data.aws_region().current().name()))
 *                 .publicWorkforceTaskPrice(FlowDefinitionHumanLoopConfigPublicWorkforceTaskPriceArgs.builder()
 *                     .amountInUsd(FlowDefinitionHumanLoopConfigPublicWorkforceTaskPriceAmountInUsdArgs.builder()
 *                         .cents(1)
 *                         .tenthFractionsOfACent(2)
 *                         .build())
 *                     .build())
 *                 .build())
 *             .outputConfig(FlowDefinitionOutputConfigArgs.builder()
 *                 .s3OutputPath(String.format(&#34;s3://%s/&#34;, aws_s3_bucket.example().bucket()))
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Human Loop Activation Config Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.sagemaker.FlowDefinition;
 * import com.pulumi.aws.sagemaker.FlowDefinitionArgs;
 * import com.pulumi.aws.sagemaker.inputs.FlowDefinitionHumanLoopConfigArgs;
 * import com.pulumi.aws.sagemaker.inputs.FlowDefinitionHumanLoopRequestSourceArgs;
 * import com.pulumi.aws.sagemaker.inputs.FlowDefinitionHumanLoopActivationConfigArgs;
 * import com.pulumi.aws.sagemaker.inputs.FlowDefinitionHumanLoopActivationConfigHumanLoopActivationConditionsConfigArgs;
 * import com.pulumi.aws.sagemaker.inputs.FlowDefinitionOutputConfigArgs;
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
 *         var example = new FlowDefinition(&#34;example&#34;, FlowDefinitionArgs.builder()        
 *             .flowDefinitionName(&#34;example&#34;)
 *             .roleArn(aws_iam_role.example().arn())
 *             .humanLoopConfig(FlowDefinitionHumanLoopConfigArgs.builder()
 *                 .humanTaskUiArn(aws_sagemaker_human_task_ui.example().arn())
 *                 .taskAvailabilityLifetimeInSeconds(1)
 *                 .taskCount(1)
 *                 .taskDescription(&#34;example&#34;)
 *                 .taskTitle(&#34;example&#34;)
 *                 .workteamArn(aws_sagemaker_workteam.example().arn())
 *                 .build())
 *             .humanLoopRequestSource(FlowDefinitionHumanLoopRequestSourceArgs.builder()
 *                 .awsManagedHumanLoopRequestSource(&#34;AWS/Textract/AnalyzeDocument/Forms/V1&#34;)
 *                 .build())
 *             .humanLoopActivationConfig(FlowDefinitionHumanLoopActivationConfigArgs.builder()
 *                 .humanLoopActivationConditionsConfig(FlowDefinitionHumanLoopActivationConfigHumanLoopActivationConditionsConfigArgs.builder()
 *                     .humanLoopActivationConditions(&#34;&#34;&#34;
 *         {
 * 			&#34;Conditions&#34;: [
 * 			  {
 * 				&#34;ConditionType&#34;: &#34;Sampling&#34;,
 * 				&#34;ConditionParameters&#34;: {
 * 				  &#34;RandomSamplingPercentage&#34;: 5
 * 				}
 * 			  }
 * 			]
 * 		}
 *                     &#34;&#34;&#34;)
 *                     .build())
 *                 .build())
 *             .outputConfig(FlowDefinitionOutputConfigArgs.builder()
 *                 .s3OutputPath(String.format(&#34;s3://%s/&#34;, aws_s3_bucket.example().bucket()))
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import SageMaker Flow Definitions using the `flow_definition_name`. For example:
 * 
 * ```sh
 *  $ pulumi import aws:sagemaker/flowDefinition:FlowDefinition example example
 * ```
 * 
 */
@ResourceType(type="aws:sagemaker/flowDefinition:FlowDefinition")
public class FlowDefinition extends com.pulumi.resources.CustomResource {
    /**
     * The Amazon Resource Name (ARN) assigned by AWS to this Flow Definition.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) assigned by AWS to this Flow Definition.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The name of your flow definition.
     * 
     */
    @Export(name="flowDefinitionName", refs={String.class}, tree="[0]")
    private Output<String> flowDefinitionName;

    /**
     * @return The name of your flow definition.
     * 
     */
    public Output<String> flowDefinitionName() {
        return this.flowDefinitionName;
    }
    /**
     * An object containing information about the events that trigger a human workflow. See Human Loop Activation Config details below.
     * 
     */
    @Export(name="humanLoopActivationConfig", refs={FlowDefinitionHumanLoopActivationConfig.class}, tree="[0]")
    private Output</* @Nullable */ FlowDefinitionHumanLoopActivationConfig> humanLoopActivationConfig;

    /**
     * @return An object containing information about the events that trigger a human workflow. See Human Loop Activation Config details below.
     * 
     */
    public Output<Optional<FlowDefinitionHumanLoopActivationConfig>> humanLoopActivationConfig() {
        return Codegen.optional(this.humanLoopActivationConfig);
    }
    /**
     * An object containing information about the tasks the human reviewers will perform. See Human Loop Config details below.
     * 
     */
    @Export(name="humanLoopConfig", refs={FlowDefinitionHumanLoopConfig.class}, tree="[0]")
    private Output<FlowDefinitionHumanLoopConfig> humanLoopConfig;

    /**
     * @return An object containing information about the tasks the human reviewers will perform. See Human Loop Config details below.
     * 
     */
    public Output<FlowDefinitionHumanLoopConfig> humanLoopConfig() {
        return this.humanLoopConfig;
    }
    /**
     * Container for configuring the source of human task requests. Use to specify if Amazon Rekognition or Amazon Textract is used as an integration source. See Human Loop Request Source details below.
     * 
     */
    @Export(name="humanLoopRequestSource", refs={FlowDefinitionHumanLoopRequestSource.class}, tree="[0]")
    private Output</* @Nullable */ FlowDefinitionHumanLoopRequestSource> humanLoopRequestSource;

    /**
     * @return Container for configuring the source of human task requests. Use to specify if Amazon Rekognition or Amazon Textract is used as an integration source. See Human Loop Request Source details below.
     * 
     */
    public Output<Optional<FlowDefinitionHumanLoopRequestSource>> humanLoopRequestSource() {
        return Codegen.optional(this.humanLoopRequestSource);
    }
    /**
     * An object containing information about where the human review results will be uploaded. See Output Config details below.
     * 
     */
    @Export(name="outputConfig", refs={FlowDefinitionOutputConfig.class}, tree="[0]")
    private Output<FlowDefinitionOutputConfig> outputConfig;

    /**
     * @return An object containing information about where the human review results will be uploaded. See Output Config details below.
     * 
     */
    public Output<FlowDefinitionOutputConfig> outputConfig() {
        return this.outputConfig;
    }
    /**
     * The Amazon Resource Name (ARN) of the role needed to call other services on your behalf.
     * 
     */
    @Export(name="roleArn", refs={String.class}, tree="[0]")
    private Output<String> roleArn;

    /**
     * @return The Amazon Resource Name (ARN) of the role needed to call other services on your behalf.
     * 
     */
    public Output<String> roleArn() {
        return this.roleArn;
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
    public FlowDefinition(String name) {
        this(name, FlowDefinitionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public FlowDefinition(String name, FlowDefinitionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public FlowDefinition(String name, FlowDefinitionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:sagemaker/flowDefinition:FlowDefinition", name, args == null ? FlowDefinitionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private FlowDefinition(String name, Output<String> id, @Nullable FlowDefinitionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:sagemaker/flowDefinition:FlowDefinition", name, state, makeResourceOptions(options, id));
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
    public static FlowDefinition get(String name, Output<String> id, @Nullable FlowDefinitionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new FlowDefinition(name, id, state, options);
    }
}

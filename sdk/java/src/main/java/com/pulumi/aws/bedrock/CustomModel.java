// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.bedrock;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.bedrock.CustomModelArgs;
import com.pulumi.aws.bedrock.inputs.CustomModelState;
import com.pulumi.aws.bedrock.outputs.CustomModelOutputDataConfig;
import com.pulumi.aws.bedrock.outputs.CustomModelTimeouts;
import com.pulumi.aws.bedrock.outputs.CustomModelTrainingDataConfig;
import com.pulumi.aws.bedrock.outputs.CustomModelTrainingMetric;
import com.pulumi.aws.bedrock.outputs.CustomModelValidationDataConfig;
import com.pulumi.aws.bedrock.outputs.CustomModelValidationMetric;
import com.pulumi.aws.bedrock.outputs.CustomModelVpcConfig;
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
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.bedrockfoundation.BedrockfoundationFunctions;
 * import com.pulumi.aws.bedrockfoundation.inputs.GetModelArgs;
 * import com.pulumi.aws.bedrock.CustomModel;
 * import com.pulumi.aws.bedrock.CustomModelArgs;
 * import com.pulumi.aws.bedrock.inputs.CustomModelOutputDataConfigArgs;
 * import com.pulumi.aws.bedrock.inputs.CustomModelTrainingDataConfigArgs;
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
 *         final var example = BedrockfoundationFunctions.getModel(GetModelArgs.builder()
 *             .modelId(&#34;amazon.titan-text-express-v1&#34;)
 *             .build());
 * 
 *         var exampleCustomModel = new CustomModel(&#34;exampleCustomModel&#34;, CustomModelArgs.builder()        
 *             .customModelName(&#34;example-model&#34;)
 *             .jobName(&#34;example-job-1&#34;)
 *             .baseModelIdentifier(example.applyValue(getModelResult -&gt; getModelResult.modelArn()))
 *             .roleArn(exampleAwsIamRole.arn())
 *             .hyperparameters(Map.ofEntries(
 *                 Map.entry(&#34;epochCount&#34;, &#34;1&#34;),
 *                 Map.entry(&#34;batchSize&#34;, &#34;1&#34;),
 *                 Map.entry(&#34;learningRate&#34;, &#34;0.005&#34;),
 *                 Map.entry(&#34;learningRateWarmupSteps&#34;, &#34;0&#34;)
 *             ))
 *             .outputDataConfig(CustomModelOutputDataConfigArgs.builder()
 *                 .s3Uri(String.format(&#34;s3://%s/data/&#34;, output.id()))
 *                 .build())
 *             .trainingDataConfig(CustomModelTrainingDataConfigArgs.builder()
 *                 .s3Uri(String.format(&#34;s3://%s/data/train.jsonl&#34;, training.id()))
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import Bedrock custom model using the `job_arn`. For example:
 * 
 * ```sh
 *  $ pulumi import aws:bedrock/customModel:CustomModel example arn:aws:bedrock:us-west-2:123456789012:model-customization-job/amazon.titan-text-express-v1:0:8k/1y5n57gh5y2e
 * ```
 * 
 */
@ResourceType(type="aws:bedrock/customModel:CustomModel")
public class CustomModel extends com.pulumi.resources.CustomResource {
    /**
     * The Amazon Resource Name (ARN) of the base model.
     * 
     */
    @Export(name="baseModelIdentifier", refs={String.class}, tree="[0]")
    private Output<String> baseModelIdentifier;

    /**
     * @return The Amazon Resource Name (ARN) of the base model.
     * 
     */
    public Output<String> baseModelIdentifier() {
        return this.baseModelIdentifier;
    }
    /**
     * The ARN of the output model.
     * 
     */
    @Export(name="customModelArn", refs={String.class}, tree="[0]")
    private Output<String> customModelArn;

    /**
     * @return The ARN of the output model.
     * 
     */
    public Output<String> customModelArn() {
        return this.customModelArn;
    }
    /**
     * The custom model is encrypted at rest using this key. Specify the key ARN.
     * 
     */
    @Export(name="customModelKmsKeyId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> customModelKmsKeyId;

    /**
     * @return The custom model is encrypted at rest using this key. Specify the key ARN.
     * 
     */
    public Output<Optional<String>> customModelKmsKeyId() {
        return Codegen.optional(this.customModelKmsKeyId);
    }
    /**
     * Name for the custom model.
     * 
     */
    @Export(name="customModelName", refs={String.class}, tree="[0]")
    private Output<String> customModelName;

    /**
     * @return Name for the custom model.
     * 
     */
    public Output<String> customModelName() {
        return this.customModelName;
    }
    /**
     * The customization type. Valid values: `FINE_TUNING`, `CONTINUED_PRE_TRAINING`.
     * 
     */
    @Export(name="customizationType", refs={String.class}, tree="[0]")
    private Output<String> customizationType;

    /**
     * @return The customization type. Valid values: `FINE_TUNING`, `CONTINUED_PRE_TRAINING`.
     * 
     */
    public Output<String> customizationType() {
        return this.customizationType;
    }
    /**
     * [Parameters](https://docs.aws.amazon.com/bedrock/latest/userguide/custom-models-hp.html) related to tuning the model.
     * 
     */
    @Export(name="hyperparameters", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output<Map<String,String>> hyperparameters;

    /**
     * @return [Parameters](https://docs.aws.amazon.com/bedrock/latest/userguide/custom-models-hp.html) related to tuning the model.
     * 
     */
    public Output<Map<String,String>> hyperparameters() {
        return this.hyperparameters;
    }
    /**
     * The ARN of the customization job.
     * 
     */
    @Export(name="jobArn", refs={String.class}, tree="[0]")
    private Output<String> jobArn;

    /**
     * @return The ARN of the customization job.
     * 
     */
    public Output<String> jobArn() {
        return this.jobArn;
    }
    /**
     * A name for the customization job.
     * 
     */
    @Export(name="jobName", refs={String.class}, tree="[0]")
    private Output<String> jobName;

    /**
     * @return A name for the customization job.
     * 
     */
    public Output<String> jobName() {
        return this.jobName;
    }
    /**
     * The status of the customization job. A successful job transitions from `InProgress` to `Completed` when the output model is ready to use.
     * 
     */
    @Export(name="jobStatus", refs={String.class}, tree="[0]")
    private Output<String> jobStatus;

    /**
     * @return The status of the customization job. A successful job transitions from `InProgress` to `Completed` when the output model is ready to use.
     * 
     */
    public Output<String> jobStatus() {
        return this.jobStatus;
    }
    /**
     * S3 location for the output data.
     * 
     */
    @Export(name="outputDataConfig", refs={CustomModelOutputDataConfig.class}, tree="[0]")
    private Output</* @Nullable */ CustomModelOutputDataConfig> outputDataConfig;

    /**
     * @return S3 location for the output data.
     * 
     */
    public Output<Optional<CustomModelOutputDataConfig>> outputDataConfig() {
        return Codegen.optional(this.outputDataConfig);
    }
    /**
     * The Amazon Resource Name (ARN) of an IAM role that Bedrock can assume to perform tasks on your behalf.
     * 
     */
    @Export(name="roleArn", refs={String.class}, tree="[0]")
    private Output<String> roleArn;

    /**
     * @return The Amazon Resource Name (ARN) of an IAM role that Bedrock can assume to perform tasks on your behalf.
     * 
     */
    public Output<String> roleArn() {
        return this.roleArn;
    }
    /**
     * A map of tags to assign to the customization job and custom model. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the customization job and custom model. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     * @deprecated
     * Please use `tags` instead.
     * 
     */
    @Deprecated /* Please use `tags` instead. */
    @Export(name="tagsAll", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output<Map<String,String>> tagsAll;

    /**
     * @return Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }
    @Export(name="timeouts", refs={CustomModelTimeouts.class}, tree="[0]")
    private Output</* @Nullable */ CustomModelTimeouts> timeouts;

    public Output<Optional<CustomModelTimeouts>> timeouts() {
        return Codegen.optional(this.timeouts);
    }
    /**
     * Information about the training dataset.
     * 
     */
    @Export(name="trainingDataConfig", refs={CustomModelTrainingDataConfig.class}, tree="[0]")
    private Output</* @Nullable */ CustomModelTrainingDataConfig> trainingDataConfig;

    /**
     * @return Information about the training dataset.
     * 
     */
    public Output<Optional<CustomModelTrainingDataConfig>> trainingDataConfig() {
        return Codegen.optional(this.trainingDataConfig);
    }
    /**
     * Metrics associated with the customization job.
     * 
     */
    @Export(name="trainingMetrics", refs={List.class,CustomModelTrainingMetric.class}, tree="[0,1]")
    private Output<List<CustomModelTrainingMetric>> trainingMetrics;

    /**
     * @return Metrics associated with the customization job.
     * 
     */
    public Output<List<CustomModelTrainingMetric>> trainingMetrics() {
        return this.trainingMetrics;
    }
    /**
     * Information about the validation dataset.
     * 
     */
    @Export(name="validationDataConfig", refs={CustomModelValidationDataConfig.class}, tree="[0]")
    private Output</* @Nullable */ CustomModelValidationDataConfig> validationDataConfig;

    /**
     * @return Information about the validation dataset.
     * 
     */
    public Output<Optional<CustomModelValidationDataConfig>> validationDataConfig() {
        return Codegen.optional(this.validationDataConfig);
    }
    /**
     * The loss metric for each validator that you provided.
     * 
     */
    @Export(name="validationMetrics", refs={List.class,CustomModelValidationMetric.class}, tree="[0,1]")
    private Output<List<CustomModelValidationMetric>> validationMetrics;

    /**
     * @return The loss metric for each validator that you provided.
     * 
     */
    public Output<List<CustomModelValidationMetric>> validationMetrics() {
        return this.validationMetrics;
    }
    /**
     * Configuration parameters for the private Virtual Private Cloud (VPC) that contains the resources you are using for this job.
     * 
     */
    @Export(name="vpcConfig", refs={CustomModelVpcConfig.class}, tree="[0]")
    private Output</* @Nullable */ CustomModelVpcConfig> vpcConfig;

    /**
     * @return Configuration parameters for the private Virtual Private Cloud (VPC) that contains the resources you are using for this job.
     * 
     */
    public Output<Optional<CustomModelVpcConfig>> vpcConfig() {
        return Codegen.optional(this.vpcConfig);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CustomModel(String name) {
        this(name, CustomModelArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CustomModel(String name, CustomModelArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CustomModel(String name, CustomModelArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:bedrock/customModel:CustomModel", name, args == null ? CustomModelArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private CustomModel(String name, Output<String> id, @Nullable CustomModelState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:bedrock/customModel:CustomModel", name, state, makeResourceOptions(options, id));
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
    public static CustomModel get(String name, Output<String> id, @Nullable CustomModelState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new CustomModel(name, id, state, options);
    }
}

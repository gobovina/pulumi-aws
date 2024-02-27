// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.sagemaker;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.sagemaker.PipelineArgs;
import com.pulumi.aws.sagemaker.inputs.PipelineState;
import com.pulumi.aws.sagemaker.outputs.PipelineParallelismConfiguration;
import com.pulumi.aws.sagemaker.outputs.PipelinePipelineDefinitionS3Location;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a SageMaker Pipeline resource.
 * 
 * ## Example Usage
 * ### Basic usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.sagemaker.Pipeline;
 * import com.pulumi.aws.sagemaker.PipelineArgs;
 * import static com.pulumi.codegen.internal.Serialization.*;
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
 *         var example = new Pipeline(&#34;example&#34;, PipelineArgs.builder()        
 *             .pipelineName(&#34;example&#34;)
 *             .pipelineDisplayName(&#34;example&#34;)
 *             .roleArn(aws_iam_role.example().arn())
 *             .pipelineDefinition(serializeJson(
 *                 jsonObject(
 *                     jsonProperty(&#34;Version&#34;, &#34;2020-12-01&#34;),
 *                     jsonProperty(&#34;Steps&#34;, jsonArray(jsonObject(
 *                         jsonProperty(&#34;Name&#34;, &#34;Test&#34;),
 *                         jsonProperty(&#34;Type&#34;, &#34;Fail&#34;),
 *                         jsonProperty(&#34;Arguments&#34;, jsonObject(
 *                             jsonProperty(&#34;ErrorMessage&#34;, &#34;test&#34;)
 *                         ))
 *                     )))
 *                 )))
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import pipelines using the `pipeline_name`. For example:
 * 
 * ```sh
 *  $ pulumi import aws:sagemaker/pipeline:Pipeline test_pipeline pipeline
 * ```
 * 
 */
@ResourceType(type="aws:sagemaker/pipeline:Pipeline")
public class Pipeline extends com.pulumi.resources.CustomResource {
    /**
     * The Amazon Resource Name (ARN) assigned by AWS to this Pipeline.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) assigned by AWS to this Pipeline.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * This is the configuration that controls the parallelism of the pipeline. If specified, it applies to all runs of this pipeline by default. see Parallelism Configuration details below.
     * 
     */
    @Export(name="parallelismConfiguration", refs={PipelineParallelismConfiguration.class}, tree="[0]")
    private Output</* @Nullable */ PipelineParallelismConfiguration> parallelismConfiguration;

    /**
     * @return This is the configuration that controls the parallelism of the pipeline. If specified, it applies to all runs of this pipeline by default. see Parallelism Configuration details below.
     * 
     */
    public Output<Optional<PipelineParallelismConfiguration>> parallelismConfiguration() {
        return Codegen.optional(this.parallelismConfiguration);
    }
    /**
     * The [JSON pipeline definition](https://aws-sagemaker-mlops.github.io/sagemaker-model-building-pipeline-definition-JSON-schema/) of the pipeline.
     * 
     */
    @Export(name="pipelineDefinition", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> pipelineDefinition;

    /**
     * @return The [JSON pipeline definition](https://aws-sagemaker-mlops.github.io/sagemaker-model-building-pipeline-definition-JSON-schema/) of the pipeline.
     * 
     */
    public Output<Optional<String>> pipelineDefinition() {
        return Codegen.optional(this.pipelineDefinition);
    }
    /**
     * The location of the pipeline definition stored in Amazon S3. If specified, SageMaker will retrieve the pipeline definition from this location. see Pipeline Definition S3 Location details below.
     * 
     */
    @Export(name="pipelineDefinitionS3Location", refs={PipelinePipelineDefinitionS3Location.class}, tree="[0]")
    private Output</* @Nullable */ PipelinePipelineDefinitionS3Location> pipelineDefinitionS3Location;

    /**
     * @return The location of the pipeline definition stored in Amazon S3. If specified, SageMaker will retrieve the pipeline definition from this location. see Pipeline Definition S3 Location details below.
     * 
     */
    public Output<Optional<PipelinePipelineDefinitionS3Location>> pipelineDefinitionS3Location() {
        return Codegen.optional(this.pipelineDefinitionS3Location);
    }
    /**
     * A description of the pipeline.
     * 
     */
    @Export(name="pipelineDescription", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> pipelineDescription;

    /**
     * @return A description of the pipeline.
     * 
     */
    public Output<Optional<String>> pipelineDescription() {
        return Codegen.optional(this.pipelineDescription);
    }
    /**
     * The display name of the pipeline.
     * 
     */
    @Export(name="pipelineDisplayName", refs={String.class}, tree="[0]")
    private Output<String> pipelineDisplayName;

    /**
     * @return The display name of the pipeline.
     * 
     */
    public Output<String> pipelineDisplayName() {
        return this.pipelineDisplayName;
    }
    /**
     * The name of the pipeline.
     * 
     */
    @Export(name="pipelineName", refs={String.class}, tree="[0]")
    private Output<String> pipelineName;

    /**
     * @return The name of the pipeline.
     * 
     */
    public Output<String> pipelineName() {
        return this.pipelineName;
    }
    /**
     * The name of the Pipeline (must be unique).
     * 
     */
    @Export(name="roleArn", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> roleArn;

    /**
     * @return The name of the Pipeline (must be unique).
     * 
     */
    public Output<Optional<String>> roleArn() {
        return Codegen.optional(this.roleArn);
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
    public Pipeline(String name) {
        this(name, PipelineArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Pipeline(String name, PipelineArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Pipeline(String name, PipelineArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:sagemaker/pipeline:Pipeline", name, args == null ? PipelineArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Pipeline(String name, Output<String> id, @Nullable PipelineState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:sagemaker/pipeline:Pipeline", name, state, makeResourceOptions(options, id));
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
    public static Pipeline get(String name, Output<String> id, @Nullable PipelineState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Pipeline(name, id, state, options);
    }
}

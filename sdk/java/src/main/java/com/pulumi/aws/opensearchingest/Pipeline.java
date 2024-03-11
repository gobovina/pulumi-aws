// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.opensearchingest;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.opensearchingest.PipelineArgs;
import com.pulumi.aws.opensearchingest.inputs.PipelineState;
import com.pulumi.aws.opensearchingest.outputs.PipelineBufferOptions;
import com.pulumi.aws.opensearchingest.outputs.PipelineEncryptionAtRestOptions;
import com.pulumi.aws.opensearchingest.outputs.PipelineLogPublishingOptions;
import com.pulumi.aws.opensearchingest.outputs.PipelineTimeouts;
import com.pulumi.aws.opensearchingest.outputs.PipelineVpcOptions;
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
 * Resource for managing an AWS OpenSearch Ingestion Pipeline.
 * 
 * ## Example Usage
 * 
 * ### Basic Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.AwsFunctions;
 * import com.pulumi.aws.inputs.GetRegionArgs;
 * import com.pulumi.aws.iam.Role;
 * import com.pulumi.aws.iam.RoleArgs;
 * import com.pulumi.aws.opensearchingest.Pipeline;
 * import com.pulumi.aws.opensearchingest.PipelineArgs;
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
 *         final var current = AwsFunctions.getRegion();
 * 
 *         var example = new Role(&#34;example&#34;, RoleArgs.builder()        
 *             .assumeRolePolicy(serializeJson(
 *                 jsonObject(
 *                     jsonProperty(&#34;version&#34;, &#34;2012-10-17&#34;),
 *                     jsonProperty(&#34;statement&#34;, jsonArray(jsonObject(
 *                         jsonProperty(&#34;action&#34;, &#34;sts:AssumeRole&#34;),
 *                         jsonProperty(&#34;effect&#34;, &#34;Allow&#34;),
 *                         jsonProperty(&#34;sid&#34;, &#34;&#34;),
 *                         jsonProperty(&#34;principal&#34;, jsonObject(
 *                             jsonProperty(&#34;service&#34;, &#34;osis-pipelines.amazonaws.com&#34;)
 *                         ))
 *                     )))
 *                 )))
 *             .build());
 * 
 *         var examplePipeline = new Pipeline(&#34;examplePipeline&#34;, PipelineArgs.builder()        
 *             .pipelineName(&#34;example&#34;)
 *             .pipelineConfigurationBody(example.arn().applyValue(arn -&gt; &#34;&#34;&#34;
 * version: &#34;2&#34;
 * example-pipeline:
 *   source:
 *     http:
 *       path: &#34;/example&#34;
 *   sink:
 *     - s3:
 *         aws:
 *           sts_role_arn: &#34;%s&#34;
 *           region: &#34;%s&#34;
 *         bucket: &#34;example&#34;
 *         threshold:
 *           event_collect_timeout: &#34;60s&#34;
 *         codec:
 *           ndjson:
 * &#34;, arn,current.applyValue(getRegionResult -&gt; getRegionResult.name()))))
 *             .maxUnits(1)
 *             .minUnits(1)
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### Using file function
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.opensearchingest.Pipeline;
 * import com.pulumi.aws.opensearchingest.PipelineArgs;
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
 *             .pipelineConfigurationBody(StdFunctions.file(FileArgs.builder()
 *                 .input(&#34;example.yaml&#34;)
 *                 .build()).result())
 *             .maxUnits(1)
 *             .minUnits(1)
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Using `pulumi import`, import OpenSearch Ingestion Pipeline using the `id`. For example:
 * 
 * ```sh
 * $ pulumi import aws:opensearchingest/pipeline:Pipeline example example
 * ```
 * 
 */
@ResourceType(type="aws:opensearchingest/pipeline:Pipeline")
public class Pipeline extends com.pulumi.resources.CustomResource {
    /**
     * Key-value pairs to configure persistent buffering for the pipeline. See `buffer_options` below.
     * 
     */
    @Export(name="bufferOptions", refs={PipelineBufferOptions.class}, tree="[0]")
    private Output</* @Nullable */ PipelineBufferOptions> bufferOptions;

    /**
     * @return Key-value pairs to configure persistent buffering for the pipeline. See `buffer_options` below.
     * 
     */
    public Output<Optional<PipelineBufferOptions>> bufferOptions() {
        return Codegen.optional(this.bufferOptions);
    }
    /**
     * Key-value pairs to configure encryption for data that is written to a persistent buffer. See `encryption_at_rest_options` below.
     * 
     */
    @Export(name="encryptionAtRestOptions", refs={PipelineEncryptionAtRestOptions.class}, tree="[0]")
    private Output</* @Nullable */ PipelineEncryptionAtRestOptions> encryptionAtRestOptions;

    /**
     * @return Key-value pairs to configure encryption for data that is written to a persistent buffer. See `encryption_at_rest_options` below.
     * 
     */
    public Output<Optional<PipelineEncryptionAtRestOptions>> encryptionAtRestOptions() {
        return Codegen.optional(this.encryptionAtRestOptions);
    }
    /**
     * The list of ingestion endpoints for the pipeline, which you can send data to.
     * 
     */
    @Export(name="ingestEndpointUrls", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> ingestEndpointUrls;

    /**
     * @return The list of ingestion endpoints for the pipeline, which you can send data to.
     * 
     */
    public Output<List<String>> ingestEndpointUrls() {
        return this.ingestEndpointUrls;
    }
    /**
     * Key-value pairs to configure log publishing. See `log_publishing_options` below.
     * 
     */
    @Export(name="logPublishingOptions", refs={PipelineLogPublishingOptions.class}, tree="[0]")
    private Output</* @Nullable */ PipelineLogPublishingOptions> logPublishingOptions;

    /**
     * @return Key-value pairs to configure log publishing. See `log_publishing_options` below.
     * 
     */
    public Output<Optional<PipelineLogPublishingOptions>> logPublishingOptions() {
        return Codegen.optional(this.logPublishingOptions);
    }
    /**
     * The maximum pipeline capacity, in Ingestion Compute Units (ICUs).
     * 
     */
    @Export(name="maxUnits", refs={Integer.class}, tree="[0]")
    private Output<Integer> maxUnits;

    /**
     * @return The maximum pipeline capacity, in Ingestion Compute Units (ICUs).
     * 
     */
    public Output<Integer> maxUnits() {
        return this.maxUnits;
    }
    /**
     * The minimum pipeline capacity, in Ingestion Compute Units (ICUs).
     * 
     */
    @Export(name="minUnits", refs={Integer.class}, tree="[0]")
    private Output<Integer> minUnits;

    /**
     * @return The minimum pipeline capacity, in Ingestion Compute Units (ICUs).
     * 
     */
    public Output<Integer> minUnits() {
        return this.minUnits;
    }
    /**
     * Amazon Resource Name (ARN) of the pipeline.
     * 
     */
    @Export(name="pipelineArn", refs={String.class}, tree="[0]")
    private Output<String> pipelineArn;

    /**
     * @return Amazon Resource Name (ARN) of the pipeline.
     * 
     */
    public Output<String> pipelineArn() {
        return this.pipelineArn;
    }
    /**
     * The pipeline configuration in YAML format. This argument accepts the pipeline configuration as a string or within a .yaml file. If you provide the configuration as a string, each new line must be escaped with \n.
     * 
     */
    @Export(name="pipelineConfigurationBody", refs={String.class}, tree="[0]")
    private Output<String> pipelineConfigurationBody;

    /**
     * @return The pipeline configuration in YAML format. This argument accepts the pipeline configuration as a string or within a .yaml file. If you provide the configuration as a string, each new line must be escaped with \n.
     * 
     */
    public Output<String> pipelineConfigurationBody() {
        return this.pipelineConfigurationBody;
    }
    /**
     * The name of the OpenSearch Ingestion pipeline to create. Pipeline names are unique across the pipelines owned by an account within an AWS Region.
     * 
     * The following arguments are optional:
     * 
     */
    @Export(name="pipelineName", refs={String.class}, tree="[0]")
    private Output<String> pipelineName;

    /**
     * @return The name of the OpenSearch Ingestion pipeline to create. Pipeline names are unique across the pipelines owned by an account within an AWS Region.
     * 
     * The following arguments are optional:
     * 
     */
    public Output<String> pipelineName() {
        return this.pipelineName;
    }
    /**
     * A map of tags to assign to the pipeline. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the pipeline. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
    @Export(name="timeouts", refs={PipelineTimeouts.class}, tree="[0]")
    private Output</* @Nullable */ PipelineTimeouts> timeouts;

    public Output<Optional<PipelineTimeouts>> timeouts() {
        return Codegen.optional(this.timeouts);
    }
    /**
     * Container for the values required to configure VPC access for the pipeline. If you don&#39;t specify these values, OpenSearch Ingestion creates the pipeline with a public endpoint. See `vpc_options` below.
     * 
     */
    @Export(name="vpcOptions", refs={PipelineVpcOptions.class}, tree="[0]")
    private Output</* @Nullable */ PipelineVpcOptions> vpcOptions;

    /**
     * @return Container for the values required to configure VPC access for the pipeline. If you don&#39;t specify these values, OpenSearch Ingestion creates the pipeline with a public endpoint. See `vpc_options` below.
     * 
     */
    public Output<Optional<PipelineVpcOptions>> vpcOptions() {
        return Codegen.optional(this.vpcOptions);
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
        super("aws:opensearchingest/pipeline:Pipeline", name, args == null ? PipelineArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Pipeline(String name, Output<String> id, @Nullable PipelineState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:opensearchingest/pipeline:Pipeline", name, state, makeResourceOptions(options, id));
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

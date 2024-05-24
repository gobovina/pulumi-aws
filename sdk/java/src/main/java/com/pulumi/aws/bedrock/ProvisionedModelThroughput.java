// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.bedrock;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.bedrock.ProvisionedModelThroughputArgs;
import com.pulumi.aws.bedrock.inputs.ProvisionedModelThroughputState;
import com.pulumi.aws.bedrock.outputs.ProvisionedModelThroughputTimeouts;
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
 * Manages [Provisioned Throughput](https://docs.aws.amazon.com/bedrock/latest/userguide/prov-throughput.html) for an Amazon Bedrock model.
 * 
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
 * import com.pulumi.aws.bedrock.ProvisionedModelThroughput;
 * import com.pulumi.aws.bedrock.ProvisionedModelThroughputArgs;
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
 *         var example = new ProvisionedModelThroughput("example", ProvisionedModelThroughputArgs.builder()
 *             .provisionedModelName("example-model")
 *             .modelArn("arn:aws:bedrock:us-east-1::foundation-model/anthropic.claude-v2")
 *             .commitmentDuration("SixMonths")
 *             .modelUnits(1)
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
 * Using `pulumi import`, import Provisioned Throughput using the `provisioned_model_arn`. For example:
 * 
 * ```sh
 * $ pulumi import aws:bedrock/provisionedModelThroughput:ProvisionedModelThroughput example arn:aws:bedrock:us-west-2:123456789012:provisioned-model/1y5n57gh5y2e
 * ```
 * 
 */
@ResourceType(type="aws:bedrock/provisionedModelThroughput:ProvisionedModelThroughput")
public class ProvisionedModelThroughput extends com.pulumi.resources.CustomResource {
    /**
     * Commitment duration requested for the Provisioned Throughput. For custom models, you can purchase on-demand Provisioned Throughput by omitting this argument. Valid values: `OneMonth`, `SixMonths`.
     * 
     */
    @Export(name="commitmentDuration", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> commitmentDuration;

    /**
     * @return Commitment duration requested for the Provisioned Throughput. For custom models, you can purchase on-demand Provisioned Throughput by omitting this argument. Valid values: `OneMonth`, `SixMonths`.
     * 
     */
    public Output<Optional<String>> commitmentDuration() {
        return Codegen.optional(this.commitmentDuration);
    }
    /**
     * ARN of the model to associate with this Provisioned Throughput.
     * 
     */
    @Export(name="modelArn", refs={String.class}, tree="[0]")
    private Output<String> modelArn;

    /**
     * @return ARN of the model to associate with this Provisioned Throughput.
     * 
     */
    public Output<String> modelArn() {
        return this.modelArn;
    }
    /**
     * Number of model units to allocate. A model unit delivers a specific throughput level for the specified model.
     * 
     */
    @Export(name="modelUnits", refs={Integer.class}, tree="[0]")
    private Output<Integer> modelUnits;

    /**
     * @return Number of model units to allocate. A model unit delivers a specific throughput level for the specified model.
     * 
     */
    public Output<Integer> modelUnits() {
        return this.modelUnits;
    }
    /**
     * The ARN of the Provisioned Throughput.
     * 
     */
    @Export(name="provisionedModelArn", refs={String.class}, tree="[0]")
    private Output<String> provisionedModelArn;

    /**
     * @return The ARN of the Provisioned Throughput.
     * 
     */
    public Output<String> provisionedModelArn() {
        return this.provisionedModelArn;
    }
    /**
     * Unique name for this Provisioned Throughput.
     * 
     */
    @Export(name="provisionedModelName", refs={String.class}, tree="[0]")
    private Output<String> provisionedModelName;

    /**
     * @return Unique name for this Provisioned Throughput.
     * 
     */
    public Output<String> provisionedModelName() {
        return this.provisionedModelName;
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
    @Export(name="timeouts", refs={ProvisionedModelThroughputTimeouts.class}, tree="[0]")
    private Output</* @Nullable */ ProvisionedModelThroughputTimeouts> timeouts;

    public Output<Optional<ProvisionedModelThroughputTimeouts>> timeouts() {
        return Codegen.optional(this.timeouts);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ProvisionedModelThroughput(String name) {
        this(name, ProvisionedModelThroughputArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ProvisionedModelThroughput(String name, ProvisionedModelThroughputArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ProvisionedModelThroughput(String name, ProvisionedModelThroughputArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:bedrock/provisionedModelThroughput:ProvisionedModelThroughput", name, args == null ? ProvisionedModelThroughputArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ProvisionedModelThroughput(String name, Output<String> id, @Nullable ProvisionedModelThroughputState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:bedrock/provisionedModelThroughput:ProvisionedModelThroughput", name, state, makeResourceOptions(options, id));
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
    public static ProvisionedModelThroughput get(String name, Output<String> id, @Nullable ProvisionedModelThroughputState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ProvisionedModelThroughput(name, id, state, options);
    }
}

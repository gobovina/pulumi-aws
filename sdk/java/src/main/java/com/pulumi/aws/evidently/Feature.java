// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.evidently;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.evidently.FeatureArgs;
import com.pulumi.aws.evidently.inputs.FeatureState;
import com.pulumi.aws.evidently.outputs.FeatureEvaluationRule;
import com.pulumi.aws.evidently.outputs.FeatureVariation;
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
 * Provides a CloudWatch Evidently Feature resource.
 * 
 * ## Example Usage
 * 
 * ### Basic
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.evidently.Feature;
 * import com.pulumi.aws.evidently.FeatureArgs;
 * import com.pulumi.aws.evidently.inputs.FeatureVariationArgs;
 * import com.pulumi.aws.evidently.inputs.FeatureVariationValueArgs;
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
 *         var example = new Feature("example", FeatureArgs.builder()
 *             .name("example")
 *             .project(exampleAwsEvidentlyProject.name())
 *             .description("example description")
 *             .variations(FeatureVariationArgs.builder()
 *                 .name("Variation1")
 *                 .value(FeatureVariationValueArgs.builder()
 *                     .stringValue("example")
 *                     .build())
 *                 .build())
 *             .tags(Map.of("Key1", "example Feature"))
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### With default variation
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.evidently.Feature;
 * import com.pulumi.aws.evidently.FeatureArgs;
 * import com.pulumi.aws.evidently.inputs.FeatureVariationArgs;
 * import com.pulumi.aws.evidently.inputs.FeatureVariationValueArgs;
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
 *         var example = new Feature("example", FeatureArgs.builder()
 *             .name("example")
 *             .project(exampleAwsEvidentlyProject.name())
 *             .defaultVariation("Variation2")
 *             .variations(            
 *                 FeatureVariationArgs.builder()
 *                     .name("Variation1")
 *                     .value(FeatureVariationValueArgs.builder()
 *                         .stringValue("exampleval1")
 *                         .build())
 *                     .build(),
 *                 FeatureVariationArgs.builder()
 *                     .name("Variation2")
 *                     .value(FeatureVariationValueArgs.builder()
 *                         .stringValue("exampleval2")
 *                         .build())
 *                     .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### With entity overrides
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.evidently.Feature;
 * import com.pulumi.aws.evidently.FeatureArgs;
 * import com.pulumi.aws.evidently.inputs.FeatureVariationArgs;
 * import com.pulumi.aws.evidently.inputs.FeatureVariationValueArgs;
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
 *         var example = new Feature("example", FeatureArgs.builder()
 *             .name("example")
 *             .project(exampleAwsEvidentlyProject.name())
 *             .entityOverrides(Map.of("test1", "Variation1"))
 *             .variations(            
 *                 FeatureVariationArgs.builder()
 *                     .name("Variation1")
 *                     .value(FeatureVariationValueArgs.builder()
 *                         .stringValue("exampleval1")
 *                         .build())
 *                     .build(),
 *                 FeatureVariationArgs.builder()
 *                     .name("Variation2")
 *                     .value(FeatureVariationValueArgs.builder()
 *                         .stringValue("exampleval2")
 *                         .build())
 *                     .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### With evaluation strategy
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.evidently.Feature;
 * import com.pulumi.aws.evidently.FeatureArgs;
 * import com.pulumi.aws.evidently.inputs.FeatureVariationArgs;
 * import com.pulumi.aws.evidently.inputs.FeatureVariationValueArgs;
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
 *         var example = new Feature("example", FeatureArgs.builder()
 *             .name("example")
 *             .project(exampleAwsEvidentlyProject.name())
 *             .evaluationStrategy("ALL_RULES")
 *             .entityOverrides(Map.of("test1", "Variation1"))
 *             .variations(FeatureVariationArgs.builder()
 *                 .name("Variation1")
 *                 .value(FeatureVariationValueArgs.builder()
 *                     .stringValue("exampleval1")
 *                     .build())
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
 * Using `pulumi import`, import CloudWatch Evidently Feature using the feature `name` and `name` or `arn` of the hosting CloudWatch Evidently Project separated by a `:`. For example:
 * 
 * ```sh
 * $ pulumi import aws:evidently/feature:Feature example exampleFeatureName:arn:aws:evidently:us-east-1:123456789012:project/example
 * ```
 * 
 */
@ResourceType(type="aws:evidently/feature:Feature")
public class Feature extends com.pulumi.resources.CustomResource {
    /**
     * The ARN of the feature.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return The ARN of the feature.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The date and time that the feature is created.
     * 
     */
    @Export(name="createdTime", refs={String.class}, tree="[0]")
    private Output<String> createdTime;

    /**
     * @return The date and time that the feature is created.
     * 
     */
    public Output<String> createdTime() {
        return this.createdTime;
    }
    /**
     * The name of the variation to use as the default variation. The default variation is served to users who are not allocated to any ongoing launches or experiments of this feature. This variation must also be listed in the `variations` structure. If you omit `default_variation`, the first variation listed in the `variations` structure is used as the default variation.
     * 
     */
    @Export(name="defaultVariation", refs={String.class}, tree="[0]")
    private Output<String> defaultVariation;

    /**
     * @return The name of the variation to use as the default variation. The default variation is served to users who are not allocated to any ongoing launches or experiments of this feature. This variation must also be listed in the `variations` structure. If you omit `default_variation`, the first variation listed in the `variations` structure is used as the default variation.
     * 
     */
    public Output<String> defaultVariation() {
        return this.defaultVariation;
    }
    /**
     * Specifies the description of the feature.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return Specifies the description of the feature.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Specify users that should always be served a specific variation of a feature. Each user is specified by a key-value pair . For each key, specify a user by entering their user ID, account ID, or some other identifier. For the value, specify the name of the variation that they are to be served.
     * 
     */
    @Export(name="entityOverrides", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> entityOverrides;

    /**
     * @return Specify users that should always be served a specific variation of a feature. Each user is specified by a key-value pair . For each key, specify a user by entering their user ID, account ID, or some other identifier. For the value, specify the name of the variation that they are to be served.
     * 
     */
    public Output<Optional<Map<String,String>>> entityOverrides() {
        return Codegen.optional(this.entityOverrides);
    }
    /**
     * One or more blocks that define the evaluation rules for the feature. Detailed below
     * 
     */
    @Export(name="evaluationRules", refs={List.class,FeatureEvaluationRule.class}, tree="[0,1]")
    private Output<List<FeatureEvaluationRule>> evaluationRules;

    /**
     * @return One or more blocks that define the evaluation rules for the feature. Detailed below
     * 
     */
    public Output<List<FeatureEvaluationRule>> evaluationRules() {
        return this.evaluationRules;
    }
    /**
     * Specify `ALL_RULES` to activate the traffic allocation specified by any ongoing launches or experiments. Specify `DEFAULT_VARIATION` to serve the default variation to all users instead.
     * 
     */
    @Export(name="evaluationStrategy", refs={String.class}, tree="[0]")
    private Output<String> evaluationStrategy;

    /**
     * @return Specify `ALL_RULES` to activate the traffic allocation specified by any ongoing launches or experiments. Specify `DEFAULT_VARIATION` to serve the default variation to all users instead.
     * 
     */
    public Output<String> evaluationStrategy() {
        return this.evaluationStrategy;
    }
    /**
     * The date and time that the feature was most recently updated.
     * 
     */
    @Export(name="lastUpdatedTime", refs={String.class}, tree="[0]")
    private Output<String> lastUpdatedTime;

    /**
     * @return The date and time that the feature was most recently updated.
     * 
     */
    public Output<String> lastUpdatedTime() {
        return this.lastUpdatedTime;
    }
    /**
     * The name for the new feature. Minimum length of `1`. Maximum length of `127`.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name for the new feature. Minimum length of `1`. Maximum length of `127`.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The name or ARN of the project that is to contain the new feature.
     * 
     */
    @Export(name="project", refs={String.class}, tree="[0]")
    private Output<String> project;

    /**
     * @return The name or ARN of the project that is to contain the new feature.
     * 
     */
    public Output<String> project() {
        return this.project;
    }
    /**
     * The current state of the feature. Valid values are `AVAILABLE` and `UPDATING`.
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return The current state of the feature. Valid values are `AVAILABLE` and `UPDATING`.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * Tags to apply to the feature. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Tags to apply to the feature. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
     * Defines the type of value used to define the different feature variations. Valid Values: `STRING`, `LONG`, `DOUBLE`, `BOOLEAN`.
     * 
     */
    @Export(name="valueType", refs={String.class}, tree="[0]")
    private Output<String> valueType;

    /**
     * @return Defines the type of value used to define the different feature variations. Valid Values: `STRING`, `LONG`, `DOUBLE`, `BOOLEAN`.
     * 
     */
    public Output<String> valueType() {
        return this.valueType;
    }
    /**
     * One or more blocks that contain the configuration of the feature&#39;s different variations. Detailed below
     * 
     */
    @Export(name="variations", refs={List.class,FeatureVariation.class}, tree="[0,1]")
    private Output<List<FeatureVariation>> variations;

    /**
     * @return One or more blocks that contain the configuration of the feature&#39;s different variations. Detailed below
     * 
     */
    public Output<List<FeatureVariation>> variations() {
        return this.variations;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Feature(String name) {
        this(name, FeatureArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Feature(String name, FeatureArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Feature(String name, FeatureArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:evidently/feature:Feature", name, args == null ? FeatureArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Feature(String name, Output<String> id, @Nullable FeatureState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:evidently/feature:Feature", name, state, makeResourceOptions(options, id));
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
    public static Feature get(String name, Output<String> id, @Nullable FeatureState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Feature(name, id, state, options);
    }
}

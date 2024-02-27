// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.imagebuilder;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.imagebuilder.ImagePipelineArgs;
import com.pulumi.aws.imagebuilder.inputs.ImagePipelineState;
import com.pulumi.aws.imagebuilder.outputs.ImagePipelineImageScanningConfiguration;
import com.pulumi.aws.imagebuilder.outputs.ImagePipelineImageTestsConfiguration;
import com.pulumi.aws.imagebuilder.outputs.ImagePipelineSchedule;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages an Image Builder Image Pipeline.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.imagebuilder.ImagePipeline;
 * import com.pulumi.aws.imagebuilder.ImagePipelineArgs;
 * import com.pulumi.aws.imagebuilder.inputs.ImagePipelineScheduleArgs;
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
 *         var example = new ImagePipeline(&#34;example&#34;, ImagePipelineArgs.builder()        
 *             .imageRecipeArn(aws_imagebuilder_image_recipe.example().arn())
 *             .infrastructureConfigurationArn(aws_imagebuilder_infrastructure_configuration.example().arn())
 *             .schedule(ImagePipelineScheduleArgs.builder()
 *                 .scheduleExpression(&#34;cron(0 0 * * ? *)&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import `aws_imagebuilder_image_pipeline` resources using the Amazon Resource Name (ARN). For example:
 * 
 * ```sh
 *  $ pulumi import aws:imagebuilder/imagePipeline:ImagePipeline example arn:aws:imagebuilder:us-east-1:123456789012:image-pipeline/example
 * ```
 * 
 */
@ResourceType(type="aws:imagebuilder/imagePipeline:ImagePipeline")
public class ImagePipeline extends com.pulumi.resources.CustomResource {
    /**
     * Amazon Resource Name (ARN) of the image pipeline.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return Amazon Resource Name (ARN) of the image pipeline.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * Amazon Resource Name (ARN) of the container recipe.
     * 
     */
    @Export(name="containerRecipeArn", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> containerRecipeArn;

    /**
     * @return Amazon Resource Name (ARN) of the container recipe.
     * 
     */
    public Output<Optional<String>> containerRecipeArn() {
        return Codegen.optional(this.containerRecipeArn);
    }
    /**
     * Date the image pipeline was created.
     * 
     */
    @Export(name="dateCreated", refs={String.class}, tree="[0]")
    private Output<String> dateCreated;

    /**
     * @return Date the image pipeline was created.
     * 
     */
    public Output<String> dateCreated() {
        return this.dateCreated;
    }
    /**
     * Date the image pipeline was last run.
     * 
     */
    @Export(name="dateLastRun", refs={String.class}, tree="[0]")
    private Output<String> dateLastRun;

    /**
     * @return Date the image pipeline was last run.
     * 
     */
    public Output<String> dateLastRun() {
        return this.dateLastRun;
    }
    /**
     * Date the image pipeline will run next.
     * 
     */
    @Export(name="dateNextRun", refs={String.class}, tree="[0]")
    private Output<String> dateNextRun;

    /**
     * @return Date the image pipeline will run next.
     * 
     */
    public Output<String> dateNextRun() {
        return this.dateNextRun;
    }
    /**
     * Date the image pipeline was updated.
     * 
     */
    @Export(name="dateUpdated", refs={String.class}, tree="[0]")
    private Output<String> dateUpdated;

    /**
     * @return Date the image pipeline was updated.
     * 
     */
    public Output<String> dateUpdated() {
        return this.dateUpdated;
    }
    /**
     * Description of the image pipeline.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return Description of the image pipeline.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Amazon Resource Name (ARN) of the Image Builder Distribution Configuration.
     * 
     */
    @Export(name="distributionConfigurationArn", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> distributionConfigurationArn;

    /**
     * @return Amazon Resource Name (ARN) of the Image Builder Distribution Configuration.
     * 
     */
    public Output<Optional<String>> distributionConfigurationArn() {
        return Codegen.optional(this.distributionConfigurationArn);
    }
    /**
     * Whether additional information about the image being created is collected. Defaults to `true`.
     * 
     */
    @Export(name="enhancedImageMetadataEnabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> enhancedImageMetadataEnabled;

    /**
     * @return Whether additional information about the image being created is collected. Defaults to `true`.
     * 
     */
    public Output<Optional<Boolean>> enhancedImageMetadataEnabled() {
        return Codegen.optional(this.enhancedImageMetadataEnabled);
    }
    /**
     * Amazon Resource Name (ARN) of the image recipe.
     * 
     */
    @Export(name="imageRecipeArn", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> imageRecipeArn;

    /**
     * @return Amazon Resource Name (ARN) of the image recipe.
     * 
     */
    public Output<Optional<String>> imageRecipeArn() {
        return Codegen.optional(this.imageRecipeArn);
    }
    /**
     * Configuration block with image scanning configuration. Detailed below.
     * 
     */
    @Export(name="imageScanningConfiguration", refs={ImagePipelineImageScanningConfiguration.class}, tree="[0]")
    private Output<ImagePipelineImageScanningConfiguration> imageScanningConfiguration;

    /**
     * @return Configuration block with image scanning configuration. Detailed below.
     * 
     */
    public Output<ImagePipelineImageScanningConfiguration> imageScanningConfiguration() {
        return this.imageScanningConfiguration;
    }
    /**
     * Configuration block with image tests configuration. Detailed below.
     * 
     */
    @Export(name="imageTestsConfiguration", refs={ImagePipelineImageTestsConfiguration.class}, tree="[0]")
    private Output<ImagePipelineImageTestsConfiguration> imageTestsConfiguration;

    /**
     * @return Configuration block with image tests configuration. Detailed below.
     * 
     */
    public Output<ImagePipelineImageTestsConfiguration> imageTestsConfiguration() {
        return this.imageTestsConfiguration;
    }
    /**
     * Amazon Resource Name (ARN) of the Image Builder Infrastructure Configuration.
     * 
     */
    @Export(name="infrastructureConfigurationArn", refs={String.class}, tree="[0]")
    private Output<String> infrastructureConfigurationArn;

    /**
     * @return Amazon Resource Name (ARN) of the Image Builder Infrastructure Configuration.
     * 
     */
    public Output<String> infrastructureConfigurationArn() {
        return this.infrastructureConfigurationArn;
    }
    /**
     * Name of the image pipeline.
     * 
     * The following arguments are optional:
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of the image pipeline.
     * 
     * The following arguments are optional:
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Platform of the image pipeline.
     * 
     */
    @Export(name="platform", refs={String.class}, tree="[0]")
    private Output<String> platform;

    /**
     * @return Platform of the image pipeline.
     * 
     */
    public Output<String> platform() {
        return this.platform;
    }
    /**
     * Configuration block with schedule settings. Detailed below.
     * 
     */
    @Export(name="schedule", refs={ImagePipelineSchedule.class}, tree="[0]")
    private Output</* @Nullable */ ImagePipelineSchedule> schedule;

    /**
     * @return Configuration block with schedule settings. Detailed below.
     * 
     */
    public Output<Optional<ImagePipelineSchedule>> schedule() {
        return Codegen.optional(this.schedule);
    }
    /**
     * Status of the image pipeline. Valid values are `DISABLED` and `ENABLED`. Defaults to `ENABLED`.
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> status;

    /**
     * @return Status of the image pipeline. Valid values are `DISABLED` and `ENABLED`. Defaults to `ENABLED`.
     * 
     */
    public Output<Optional<String>> status() {
        return Codegen.optional(this.status);
    }
    /**
     * Key-value map of resource tags for the image pipeline. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Key-value map of resource tags for the image pipeline. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
    public ImagePipeline(String name) {
        this(name, ImagePipelineArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ImagePipeline(String name, ImagePipelineArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ImagePipeline(String name, ImagePipelineArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:imagebuilder/imagePipeline:ImagePipeline", name, args == null ? ImagePipelineArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ImagePipeline(String name, Output<String> id, @Nullable ImagePipelineState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:imagebuilder/imagePipeline:ImagePipeline", name, state, makeResourceOptions(options, id));
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
    public static ImagePipeline get(String name, Output<String> id, @Nullable ImagePipelineState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ImagePipeline(name, id, state, options);
    }
}

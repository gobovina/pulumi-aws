// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.imagebuilder;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.imagebuilder.ImageArgs;
import com.pulumi.aws.imagebuilder.inputs.ImageState;
import com.pulumi.aws.imagebuilder.outputs.ImageImageScanningConfiguration;
import com.pulumi.aws.imagebuilder.outputs.ImageImageTestsConfiguration;
import com.pulumi.aws.imagebuilder.outputs.ImageOutputResource;
import com.pulumi.aws.imagebuilder.outputs.ImageWorkflow;
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
 * Manages an Image Builder Image.
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
 * import com.pulumi.aws.imagebuilder.Image;
 * import com.pulumi.aws.imagebuilder.ImageArgs;
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
 *         var example = new Image("example", ImageArgs.builder()
 *             .distributionConfigurationArn(exampleAwsImagebuilderDistributionConfiguration.arn())
 *             .imageRecipeArn(exampleAwsImagebuilderImageRecipe.arn())
 *             .infrastructureConfigurationArn(exampleAwsImagebuilderInfrastructureConfiguration.arn())
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
 * Using `pulumi import`, import `aws_imagebuilder_image` resources using the Amazon Resource Name (ARN). For example:
 * 
 * ```sh
 * $ pulumi import aws:imagebuilder/image:Image example arn:aws:imagebuilder:us-east-1:123456789012:image/example/1.0.0/1
 * ```
 * 
 */
@ResourceType(type="aws:imagebuilder/image:Image")
public class Image extends com.pulumi.resources.CustomResource {
    /**
     * Amazon Resource Name (ARN) of the image.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return Amazon Resource Name (ARN) of the image.
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
     * Date the image was created.
     * 
     */
    @Export(name="dateCreated", refs={String.class}, tree="[0]")
    private Output<String> dateCreated;

    /**
     * @return Date the image was created.
     * 
     */
    public Output<String> dateCreated() {
        return this.dateCreated;
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
     * Amazon Resource Name (ARN) of the service-linked role to be used by Image Builder to [execute workflows](https://docs.aws.amazon.com/imagebuilder/latest/userguide/manage-image-workflows.html).
     * 
     */
    @Export(name="executionRole", refs={String.class}, tree="[0]")
    private Output<String> executionRole;

    /**
     * @return Amazon Resource Name (ARN) of the service-linked role to be used by Image Builder to [execute workflows](https://docs.aws.amazon.com/imagebuilder/latest/userguide/manage-image-workflows.html).
     * 
     */
    public Output<String> executionRole() {
        return this.executionRole;
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
    @Export(name="imageScanningConfiguration", refs={ImageImageScanningConfiguration.class}, tree="[0]")
    private Output<ImageImageScanningConfiguration> imageScanningConfiguration;

    /**
     * @return Configuration block with image scanning configuration. Detailed below.
     * 
     */
    public Output<ImageImageScanningConfiguration> imageScanningConfiguration() {
        return this.imageScanningConfiguration;
    }
    /**
     * Configuration block with image tests configuration. Detailed below.
     * 
     */
    @Export(name="imageTestsConfiguration", refs={ImageImageTestsConfiguration.class}, tree="[0]")
    private Output<ImageImageTestsConfiguration> imageTestsConfiguration;

    /**
     * @return Configuration block with image tests configuration. Detailed below.
     * 
     */
    public Output<ImageImageTestsConfiguration> imageTestsConfiguration() {
        return this.imageTestsConfiguration;
    }
    /**
     * Amazon Resource Name (ARN) of the Image Builder Infrastructure Configuration.
     * 
     * The following arguments are optional:
     * 
     */
    @Export(name="infrastructureConfigurationArn", refs={String.class}, tree="[0]")
    private Output<String> infrastructureConfigurationArn;

    /**
     * @return Amazon Resource Name (ARN) of the Image Builder Infrastructure Configuration.
     * 
     * The following arguments are optional:
     * 
     */
    public Output<String> infrastructureConfigurationArn() {
        return this.infrastructureConfigurationArn;
    }
    /**
     * Name of the AMI.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of the AMI.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Operating System version of the image.
     * 
     */
    @Export(name="osVersion", refs={String.class}, tree="[0]")
    private Output<String> osVersion;

    /**
     * @return Operating System version of the image.
     * 
     */
    public Output<String> osVersion() {
        return this.osVersion;
    }
    /**
     * List of objects with resources created by the image.
     * 
     */
    @Export(name="outputResources", refs={List.class,ImageOutputResource.class}, tree="[0,1]")
    private Output<List<ImageOutputResource>> outputResources;

    /**
     * @return List of objects with resources created by the image.
     * 
     */
    public Output<List<ImageOutputResource>> outputResources() {
        return this.outputResources;
    }
    /**
     * Platform of the image.
     * 
     */
    @Export(name="platform", refs={String.class}, tree="[0]")
    private Output<String> platform;

    /**
     * @return Platform of the image.
     * 
     */
    public Output<String> platform() {
        return this.platform;
    }
    /**
     * Key-value map of resource tags for the Image Builder Image. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Key-value map of resource tags for the Image Builder Image. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
     * Version of the image.
     * 
     */
    @Export(name="version", refs={String.class}, tree="[0]")
    private Output<String> version;

    /**
     * @return Version of the image.
     * 
     */
    public Output<String> version() {
        return this.version;
    }
    /**
     * Configuration block with the workflow configuration. Detailed below.
     * 
     */
    @Export(name="workflows", refs={List.class,ImageWorkflow.class}, tree="[0,1]")
    private Output<List<ImageWorkflow>> workflows;

    /**
     * @return Configuration block with the workflow configuration. Detailed below.
     * 
     */
    public Output<List<ImageWorkflow>> workflows() {
        return this.workflows;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Image(String name) {
        this(name, ImageArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Image(String name, ImageArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Image(String name, ImageArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:imagebuilder/image:Image", name, args == null ? ImageArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Image(String name, Output<String> id, @Nullable ImageState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:imagebuilder/image:Image", name, state, makeResourceOptions(options, id));
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
    public static Image get(String name, Output<String> id, @Nullable ImageState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Image(name, id, state, options);
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.imagebuilder;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.imagebuilder.DistributionConfigurationArgs;
import com.pulumi.aws.imagebuilder.inputs.DistributionConfigurationState;
import com.pulumi.aws.imagebuilder.outputs.DistributionConfigurationDistribution;
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
 * Manages an Image Builder Distribution Configuration.
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
 * import com.pulumi.aws.imagebuilder.DistributionConfiguration;
 * import com.pulumi.aws.imagebuilder.DistributionConfigurationArgs;
 * import com.pulumi.aws.imagebuilder.inputs.DistributionConfigurationDistributionArgs;
 * import com.pulumi.aws.imagebuilder.inputs.DistributionConfigurationDistributionAmiDistributionConfigurationArgs;
 * import com.pulumi.aws.imagebuilder.inputs.DistributionConfigurationDistributionAmiDistributionConfigurationLaunchPermissionArgs;
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
 *         var example = new DistributionConfiguration("example", DistributionConfigurationArgs.builder()
 *             .name("example")
 *             .distributions(DistributionConfigurationDistributionArgs.builder()
 *                 .amiDistributionConfiguration(DistributionConfigurationDistributionAmiDistributionConfigurationArgs.builder()
 *                     .amiTags(Map.of("CostCenter", "IT"))
 *                     .name("example-{{ imagebuilder:buildDate }}")
 *                     .launchPermission(DistributionConfigurationDistributionAmiDistributionConfigurationLaunchPermissionArgs.builder()
 *                         .userIds("123456789012")
 *                         .build())
 *                     .build())
 *                 .launchTemplateConfigurations(DistributionConfigurationDistributionLaunchTemplateConfigurationArgs.builder()
 *                     .launchTemplateId("lt-0aaa1bcde2ff3456")
 *                     .build())
 *                 .region("us-east-1")
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
 * Using `pulumi import`, import `aws_imagebuilder_distribution_configurations` resources using the Amazon Resource Name (ARN). For example:
 * 
 * ```sh
 * $ pulumi import aws:imagebuilder/distributionConfiguration:DistributionConfiguration example arn:aws:imagebuilder:us-east-1:123456789012:distribution-configuration/example
 * ```
 * 
 */
@ResourceType(type="aws:imagebuilder/distributionConfiguration:DistributionConfiguration")
public class DistributionConfiguration extends com.pulumi.resources.CustomResource {
    /**
     * (Required) Amazon Resource Name (ARN) of the distribution configuration.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return (Required) Amazon Resource Name (ARN) of the distribution configuration.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * Date the distribution configuration was created.
     * 
     */
    @Export(name="dateCreated", refs={String.class}, tree="[0]")
    private Output<String> dateCreated;

    /**
     * @return Date the distribution configuration was created.
     * 
     */
    public Output<String> dateCreated() {
        return this.dateCreated;
    }
    /**
     * Date the distribution configuration was updated.
     * 
     */
    @Export(name="dateUpdated", refs={String.class}, tree="[0]")
    private Output<String> dateUpdated;

    /**
     * @return Date the distribution configuration was updated.
     * 
     */
    public Output<String> dateUpdated() {
        return this.dateUpdated;
    }
    /**
     * Description of the distribution configuration.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return Description of the distribution configuration.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * One or more configuration blocks with distribution settings. Detailed below.
     * 
     * The following arguments are optional:
     * 
     */
    @Export(name="distributions", refs={List.class,DistributionConfigurationDistribution.class}, tree="[0,1]")
    private Output<List<DistributionConfigurationDistribution>> distributions;

    /**
     * @return One or more configuration blocks with distribution settings. Detailed below.
     * 
     * The following arguments are optional:
     * 
     */
    public Output<List<DistributionConfigurationDistribution>> distributions() {
        return this.distributions;
    }
    /**
     * Name of the distribution configuration.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of the distribution configuration.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Key-value map of resource tags for the distribution configuration. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Key-value map of resource tags for the distribution configuration. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
    public DistributionConfiguration(String name) {
        this(name, DistributionConfigurationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DistributionConfiguration(String name, DistributionConfigurationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DistributionConfiguration(String name, DistributionConfigurationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:imagebuilder/distributionConfiguration:DistributionConfiguration", name, args == null ? DistributionConfigurationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DistributionConfiguration(String name, Output<String> id, @Nullable DistributionConfigurationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:imagebuilder/distributionConfiguration:DistributionConfiguration", name, state, makeResourceOptions(options, id));
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
    public static DistributionConfiguration get(String name, Output<String> id, @Nullable DistributionConfigurationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DistributionConfiguration(name, id, state, options);
    }
}

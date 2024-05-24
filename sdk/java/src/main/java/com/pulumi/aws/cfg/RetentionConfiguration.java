// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cfg;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.cfg.RetentionConfigurationArgs;
import com.pulumi.aws.cfg.inputs.RetentionConfigurationState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a resource to manage the AWS Config retention configuration.
 * The retention configuration defines the number of days that AWS Config stores historical information.
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
 * import com.pulumi.aws.cfg.RetentionConfiguration;
 * import com.pulumi.aws.cfg.RetentionConfigurationArgs;
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
 *         var example = new RetentionConfiguration("example", RetentionConfigurationArgs.builder()
 *             .retentionPeriodInDays(90)
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
 * Using `pulumi import`, import the AWS Config retention configuration using the `name`. For example:
 * 
 * ```sh
 * $ pulumi import aws:cfg/retentionConfiguration:RetentionConfiguration example default
 * ```
 * 
 */
@ResourceType(type="aws:cfg/retentionConfiguration:RetentionConfiguration")
public class RetentionConfiguration extends com.pulumi.resources.CustomResource {
    /**
     * The name of the retention configuration object. The object is always named **default**.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the retention configuration object. The object is always named **default**.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The number of days AWS Config stores historical information.
     * 
     */
    @Export(name="retentionPeriodInDays", refs={Integer.class}, tree="[0]")
    private Output<Integer> retentionPeriodInDays;

    /**
     * @return The number of days AWS Config stores historical information.
     * 
     */
    public Output<Integer> retentionPeriodInDays() {
        return this.retentionPeriodInDays;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RetentionConfiguration(String name) {
        this(name, RetentionConfigurationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RetentionConfiguration(String name, RetentionConfigurationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RetentionConfiguration(String name, RetentionConfigurationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:cfg/retentionConfiguration:RetentionConfiguration", name, args == null ? RetentionConfigurationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private RetentionConfiguration(String name, Output<String> id, @Nullable RetentionConfigurationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:cfg/retentionConfiguration:RetentionConfiguration", name, state, makeResourceOptions(options, id));
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
    public static RetentionConfiguration get(String name, Output<String> id, @Nullable RetentionConfigurationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new RetentionConfiguration(name, id, state, options);
    }
}

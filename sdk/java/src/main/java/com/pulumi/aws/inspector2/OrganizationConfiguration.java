// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.inspector2;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.inspector2.OrganizationConfigurationArgs;
import com.pulumi.aws.inspector2.inputs.OrganizationConfigurationState;
import com.pulumi.aws.inspector2.outputs.OrganizationConfigurationAutoEnable;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import javax.annotation.Nullable;

/**
 * Resource for managing an Amazon Inspector Organization Configuration.
 * 
 * &gt; **NOTE:** In order for this resource to work, the account you use must be an Inspector Delegated Admin Account.
 * 
 * &gt; **NOTE:** When this resource is deleted, EC2, ECR, Lambda, and Lambda code scans will no longer be automatically enabled for new members of your Amazon Inspector organization.
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
 * import com.pulumi.aws.inspector2.OrganizationConfiguration;
 * import com.pulumi.aws.inspector2.OrganizationConfigurationArgs;
 * import com.pulumi.aws.inspector2.inputs.OrganizationConfigurationAutoEnableArgs;
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
 *         var example = new OrganizationConfiguration(&#34;example&#34;, OrganizationConfigurationArgs.builder()        
 *             .autoEnable(OrganizationConfigurationAutoEnableArgs.builder()
 *                 .ec2(true)
 *                 .ecr(false)
 *                 .lambda(true)
 *                 .lambdaCode(true)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 */
@ResourceType(type="aws:inspector2/organizationConfiguration:OrganizationConfiguration")
public class OrganizationConfiguration extends com.pulumi.resources.CustomResource {
    /**
     * Configuration block for auto enabling. See below.
     * 
     */
    @Export(name="autoEnable", refs={OrganizationConfigurationAutoEnable.class}, tree="[0]")
    private Output<OrganizationConfigurationAutoEnable> autoEnable;

    /**
     * @return Configuration block for auto enabling. See below.
     * 
     */
    public Output<OrganizationConfigurationAutoEnable> autoEnable() {
        return this.autoEnable;
    }
    /**
     * Whether your configuration reached the max account limit.
     * 
     */
    @Export(name="maxAccountLimitReached", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> maxAccountLimitReached;

    /**
     * @return Whether your configuration reached the max account limit.
     * 
     */
    public Output<Boolean> maxAccountLimitReached() {
        return this.maxAccountLimitReached;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public OrganizationConfiguration(String name) {
        this(name, OrganizationConfigurationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public OrganizationConfiguration(String name, OrganizationConfigurationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public OrganizationConfiguration(String name, OrganizationConfigurationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:inspector2/organizationConfiguration:OrganizationConfiguration", name, args == null ? OrganizationConfigurationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private OrganizationConfiguration(String name, Output<String> id, @Nullable OrganizationConfigurationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:inspector2/organizationConfiguration:OrganizationConfiguration", name, state, makeResourceOptions(options, id));
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
    public static OrganizationConfiguration get(String name, Output<String> id, @Nullable OrganizationConfigurationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new OrganizationConfiguration(name, id, state, options);
    }
}

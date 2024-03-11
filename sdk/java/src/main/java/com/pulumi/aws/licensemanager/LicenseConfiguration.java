// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.licensemanager;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.licensemanager.LicenseConfigurationArgs;
import com.pulumi.aws.licensemanager.inputs.LicenseConfigurationState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a License Manager license configuration resource.
 * 
 * &gt; **Note:** Removing the `license_count` attribute is not supported by the License Manager API.
 * 
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.licensemanager.LicenseConfiguration;
 * import com.pulumi.aws.licensemanager.LicenseConfigurationArgs;
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
 *         var example = new LicenseConfiguration(&#34;example&#34;, LicenseConfigurationArgs.builder()        
 *             .name(&#34;Example&#34;)
 *             .description(&#34;Example&#34;)
 *             .licenseCount(10)
 *             .licenseCountHardLimit(true)
 *             .licenseCountingType(&#34;Socket&#34;)
 *             .licenseRules(&#34;#minimumSockets=2&#34;)
 *             .tags(Map.of(&#34;foo&#34;, &#34;barr&#34;))
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Rules
 * 
 * License rules should be in the format of `#RuleType=RuleValue`. Supported rule types:
 * 
 * * `minimumVcpus` - Resource must have minimum vCPU count in order to use the license. Default: 1
 * * `maximumVcpus` - Resource must have maximum vCPU count in order to use the license. Default: unbounded, limit: 10000
 * * `minimumCores` - Resource must have minimum core count in order to use the license. Default: 1
 * * `maximumCores` - Resource must have maximum core count in order to use the license. Default: unbounded, limit: 10000
 * * `minimumSockets` - Resource must have minimum socket count in order to use the license. Default: 1
 * * `maximumSockets` - Resource must have maximum socket count in order to use the license. Default: unbounded, limit: 10000
 * * `allowedTenancy` - Defines where the license can be used. If set, restricts license usage to selected tenancies. Specify a comma delimited list of `EC2-Default`, `EC2-DedicatedHost`, `EC2-DedicatedInstance`
 * 
 * ## Import
 * 
 * Using `pulumi import`, import license configurations using the `id`. For example:
 * 
 * ```sh
 * $ pulumi import aws:licensemanager/licenseConfiguration:LicenseConfiguration example arn:aws:license-manager:eu-west-1:123456789012:license-configuration:lic-0123456789abcdef0123456789abcdef
 * ```
 * 
 */
@ResourceType(type="aws:licensemanager/licenseConfiguration:LicenseConfiguration")
public class LicenseConfiguration extends com.pulumi.resources.CustomResource {
    /**
     * The license configuration ARN.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return The license configuration ARN.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * Description of the license configuration.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return Description of the license configuration.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Number of licenses managed by the license configuration.
     * 
     */
    @Export(name="licenseCount", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> licenseCount;

    /**
     * @return Number of licenses managed by the license configuration.
     * 
     */
    public Output<Optional<Integer>> licenseCount() {
        return Codegen.optional(this.licenseCount);
    }
    /**
     * Sets the number of available licenses as a hard limit.
     * 
     */
    @Export(name="licenseCountHardLimit", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> licenseCountHardLimit;

    /**
     * @return Sets the number of available licenses as a hard limit.
     * 
     */
    public Output<Optional<Boolean>> licenseCountHardLimit() {
        return Codegen.optional(this.licenseCountHardLimit);
    }
    /**
     * Dimension to use to track license inventory. Specify either `vCPU`, `Instance`, `Core` or `Socket`.
     * 
     */
    @Export(name="licenseCountingType", refs={String.class}, tree="[0]")
    private Output<String> licenseCountingType;

    /**
     * @return Dimension to use to track license inventory. Specify either `vCPU`, `Instance`, `Core` or `Socket`.
     * 
     */
    public Output<String> licenseCountingType() {
        return this.licenseCountingType;
    }
    /**
     * Array of configured License Manager rules.
     * 
     */
    @Export(name="licenseRules", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> licenseRules;

    /**
     * @return Array of configured License Manager rules.
     * 
     */
    public Output<Optional<List<String>>> licenseRules() {
        return Codegen.optional(this.licenseRules);
    }
    /**
     * Name of the license configuration.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of the license configuration.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Account ID of the owner of the license configuration.
     * 
     */
    @Export(name="ownerAccountId", refs={String.class}, tree="[0]")
    private Output<String> ownerAccountId;

    /**
     * @return Account ID of the owner of the license configuration.
     * 
     */
    public Output<String> ownerAccountId() {
        return this.ownerAccountId;
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
    public LicenseConfiguration(String name) {
        this(name, LicenseConfigurationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public LicenseConfiguration(String name, LicenseConfigurationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public LicenseConfiguration(String name, LicenseConfigurationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:licensemanager/licenseConfiguration:LicenseConfiguration", name, args == null ? LicenseConfigurationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private LicenseConfiguration(String name, Output<String> id, @Nullable LicenseConfigurationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:licensemanager/licenseConfiguration:LicenseConfiguration", name, state, makeResourceOptions(options, id));
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
    public static LicenseConfiguration get(String name, Output<String> id, @Nullable LicenseConfigurationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new LicenseConfiguration(name, id, state, options);
    }
}

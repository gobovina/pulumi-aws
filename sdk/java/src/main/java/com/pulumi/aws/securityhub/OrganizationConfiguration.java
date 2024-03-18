// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.securityhub;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.securityhub.OrganizationConfigurationArgs;
import com.pulumi.aws.securityhub.inputs.OrganizationConfigurationState;
import com.pulumi.aws.securityhub.outputs.OrganizationConfigurationOrganizationConfiguration;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Manages the Security Hub Organization Configuration.
 * 
 * &gt; **NOTE:** This resource requires an `aws.securityhub.OrganizationAdminAccount` to be configured (not necessarily with Pulumi). More information about managing Security Hub in an organization can be found in the [Managing administrator and member accounts](https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-accounts.html) documentation.
 * 
 * &gt; **NOTE:** In order to set the `configuration_type` to `CENTRAL`, the delegated admin must be a member account of the organization and not the management account. Central configuration also requires an `aws.securityhub.FindingAggregator` to be configured.
 * 
 * &gt; **NOTE:** This is an advanced AWS resource. Pulumi will automatically assume management of the Security Hub Organization Configuration without import and perform no actions on removal from the Pulumi program.
 * 
 * &gt; **NOTE:** Deleting this resource resets security hub to a local organization configuration with auto enable false.
 * 
 * ## Example Usage
 * 
 * ### Local Configuration
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.organizations.Organization;
 * import com.pulumi.aws.organizations.OrganizationArgs;
 * import com.pulumi.aws.securityhub.OrganizationAdminAccount;
 * import com.pulumi.aws.securityhub.OrganizationAdminAccountArgs;
 * import com.pulumi.aws.securityhub.OrganizationConfiguration;
 * import com.pulumi.aws.securityhub.OrganizationConfigurationArgs;
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
 *         var example = new Organization(&#34;example&#34;, OrganizationArgs.builder()        
 *             .awsServiceAccessPrincipals(&#34;securityhub.amazonaws.com&#34;)
 *             .featureSet(&#34;ALL&#34;)
 *             .build());
 * 
 *         var exampleOrganizationAdminAccount = new OrganizationAdminAccount(&#34;exampleOrganizationAdminAccount&#34;, OrganizationAdminAccountArgs.builder()        
 *             .adminAccountId(&#34;123456789012&#34;)
 *             .build());
 * 
 *         var exampleOrganizationConfiguration = new OrganizationConfiguration(&#34;exampleOrganizationConfiguration&#34;, OrganizationConfigurationArgs.builder()        
 *             .autoEnable(true)
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### Central Configuration
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.securityhub.OrganizationAdminAccount;
 * import com.pulumi.aws.securityhub.OrganizationAdminAccountArgs;
 * import com.pulumi.aws.securityhub.FindingAggregator;
 * import com.pulumi.aws.securityhub.FindingAggregatorArgs;
 * import com.pulumi.aws.securityhub.OrganizationConfiguration;
 * import com.pulumi.aws.securityhub.OrganizationConfigurationArgs;
 * import com.pulumi.aws.securityhub.inputs.OrganizationConfigurationOrganizationConfigurationArgs;
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
 *         var example = new OrganizationAdminAccount(&#34;example&#34;, OrganizationAdminAccountArgs.builder()        
 *             .adminAccountId(&#34;123456789012&#34;)
 *             .build());
 * 
 *         var exampleFindingAggregator = new FindingAggregator(&#34;exampleFindingAggregator&#34;, FindingAggregatorArgs.builder()        
 *             .linkingMode(&#34;ALL_REGIONS&#34;)
 *             .build());
 * 
 *         var exampleOrganizationConfiguration = new OrganizationConfiguration(&#34;exampleOrganizationConfiguration&#34;, OrganizationConfigurationArgs.builder()        
 *             .autoEnable(false)
 *             .autoEnableStandards(&#34;NONE&#34;)
 *             .organizationConfiguration(OrganizationConfigurationOrganizationConfigurationArgs.builder()
 *                 .configurationType(&#34;CENTRAL&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Using `pulumi import`, import an existing Security Hub enabled account using the AWS account ID. For example:
 * 
 * ```sh
 * $ pulumi import aws:securityhub/organizationConfiguration:OrganizationConfiguration example 123456789012
 * ```
 * 
 */
@ResourceType(type="aws:securityhub/organizationConfiguration:OrganizationConfiguration")
public class OrganizationConfiguration extends com.pulumi.resources.CustomResource {
    /**
     * Whether to automatically enable Security Hub for new accounts in the organization.
     * 
     */
    @Export(name="autoEnable", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> autoEnable;

    /**
     * @return Whether to automatically enable Security Hub for new accounts in the organization.
     * 
     */
    public Output<Boolean> autoEnable() {
        return this.autoEnable;
    }
    /**
     * Whether to automatically enable Security Hub default standards for new member accounts in the organization. By default, this parameter is equal to `DEFAULT`, and new member accounts are automatically enabled with default Security Hub standards. To opt out of enabling default standards for new member accounts, set this parameter equal to `NONE`.
     * 
     */
    @Export(name="autoEnableStandards", refs={String.class}, tree="[0]")
    private Output<String> autoEnableStandards;

    /**
     * @return Whether to automatically enable Security Hub default standards for new member accounts in the organization. By default, this parameter is equal to `DEFAULT`, and new member accounts are automatically enabled with default Security Hub standards. To opt out of enabling default standards for new member accounts, set this parameter equal to `NONE`.
     * 
     */
    public Output<String> autoEnableStandards() {
        return this.autoEnableStandards;
    }
    /**
     * Provides information about the way an organization is configured in Security Hub.
     * 
     */
    @Export(name="organizationConfiguration", refs={OrganizationConfigurationOrganizationConfiguration.class}, tree="[0]")
    private Output<OrganizationConfigurationOrganizationConfiguration> organizationConfiguration;

    /**
     * @return Provides information about the way an organization is configured in Security Hub.
     * 
     */
    public Output<OrganizationConfigurationOrganizationConfiguration> organizationConfiguration() {
        return this.organizationConfiguration;
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
        super("aws:securityhub/organizationConfiguration:OrganizationConfiguration", name, args == null ? OrganizationConfigurationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private OrganizationConfiguration(String name, Output<String> id, @Nullable OrganizationConfigurationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:securityhub/organizationConfiguration:OrganizationConfiguration", name, state, makeResourceOptions(options, id));
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

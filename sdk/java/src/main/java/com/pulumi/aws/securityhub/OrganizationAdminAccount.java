// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.securityhub;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.securityhub.OrganizationAdminAccountArgs;
import com.pulumi.aws.securityhub.inputs.OrganizationAdminAccountState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Manages a Security Hub administrator account for an organization. The AWS account utilizing this resource must be an Organizations primary account. More information about Organizations support in Security Hub can be found in the [Security Hub User Guide](https://docs.aws.amazon.com/securityhub/latest/userguide/designate-orgs-admin-account.html).
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.organizations.Organization;
 * import com.pulumi.aws.organizations.OrganizationArgs;
 * import com.pulumi.aws.securityhub.Account;
 * import com.pulumi.aws.securityhub.OrganizationAdminAccount;
 * import com.pulumi.aws.securityhub.OrganizationAdminAccountArgs;
 * import com.pulumi.aws.securityhub.OrganizationConfiguration;
 * import com.pulumi.aws.securityhub.OrganizationConfigurationArgs;
 * import com.pulumi.resources.CustomResourceOptions;
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
 *         var exampleOrganization = new Organization(&#34;exampleOrganization&#34;, OrganizationArgs.builder()        
 *             .awsServiceAccessPrincipals(&#34;securityhub.amazonaws.com&#34;)
 *             .featureSet(&#34;ALL&#34;)
 *             .build());
 * 
 *         var exampleAccount = new Account(&#34;exampleAccount&#34;);
 * 
 *         var exampleOrganizationAdminAccount = new OrganizationAdminAccount(&#34;exampleOrganizationAdminAccount&#34;, OrganizationAdminAccountArgs.builder()        
 *             .adminAccountId(&#34;123456789012&#34;)
 *             .build(), CustomResourceOptions.builder()
 *                 .dependsOn(exampleOrganization)
 *                 .build());
 * 
 *         var exampleOrganizationConfiguration = new OrganizationConfiguration(&#34;exampleOrganizationConfiguration&#34;, OrganizationConfigurationArgs.builder()        
 *             .autoEnable(true)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import Security Hub Organization Admin Accounts using the AWS account ID. For example:
 * 
 * ```sh
 *  $ pulumi import aws:securityhub/organizationAdminAccount:OrganizationAdminAccount example 123456789012
 * ```
 * 
 */
@ResourceType(type="aws:securityhub/organizationAdminAccount:OrganizationAdminAccount")
public class OrganizationAdminAccount extends com.pulumi.resources.CustomResource {
    /**
     * The AWS account identifier of the account to designate as the Security Hub administrator account.
     * 
     */
    @Export(name="adminAccountId", refs={String.class}, tree="[0]")
    private Output<String> adminAccountId;

    /**
     * @return The AWS account identifier of the account to designate as the Security Hub administrator account.
     * 
     */
    public Output<String> adminAccountId() {
        return this.adminAccountId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public OrganizationAdminAccount(String name) {
        this(name, OrganizationAdminAccountArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public OrganizationAdminAccount(String name, OrganizationAdminAccountArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public OrganizationAdminAccount(String name, OrganizationAdminAccountArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:securityhub/organizationAdminAccount:OrganizationAdminAccount", name, args == null ? OrganizationAdminAccountArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private OrganizationAdminAccount(String name, Output<String> id, @Nullable OrganizationAdminAccountState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:securityhub/organizationAdminAccount:OrganizationAdminAccount", name, state, makeResourceOptions(options, id));
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
    public static OrganizationAdminAccount get(String name, Output<String> id, @Nullable OrganizationAdminAccountState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new OrganizationAdminAccount(name, id, state, options);
    }
}

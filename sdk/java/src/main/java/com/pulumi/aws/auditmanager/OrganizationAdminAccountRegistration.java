// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.auditmanager;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.auditmanager.OrganizationAdminAccountRegistrationArgs;
import com.pulumi.aws.auditmanager.inputs.OrganizationAdminAccountRegistrationState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Resource for managing AWS Audit Manager Organization Admin Account Registration.
 * 
 * ## Example Usage
 * ### Basic Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.auditmanager.OrganizationAdminAccountRegistration;
 * import com.pulumi.aws.auditmanager.OrganizationAdminAccountRegistrationArgs;
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
 *         var example = new OrganizationAdminAccountRegistration(&#34;example&#34;, OrganizationAdminAccountRegistrationArgs.builder()        
 *             .adminAccountId(&#34;012345678901&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import Audit Manager Organization Admin Account Registration using the `id`. For example:
 * 
 * ```sh
 *  $ pulumi import aws:auditmanager/organizationAdminAccountRegistration:OrganizationAdminAccountRegistration example 012345678901
 * ```
 * 
 */
@ResourceType(type="aws:auditmanager/organizationAdminAccountRegistration:OrganizationAdminAccountRegistration")
public class OrganizationAdminAccountRegistration extends com.pulumi.resources.CustomResource {
    /**
     * Identifier for the organization administrator account.
     * 
     */
    @Export(name="adminAccountId", refs={String.class}, tree="[0]")
    private Output<String> adminAccountId;

    /**
     * @return Identifier for the organization administrator account.
     * 
     */
    public Output<String> adminAccountId() {
        return this.adminAccountId;
    }
    /**
     * Identifier for the organization.
     * 
     */
    @Export(name="organizationId", refs={String.class}, tree="[0]")
    private Output<String> organizationId;

    /**
     * @return Identifier for the organization.
     * 
     */
    public Output<String> organizationId() {
        return this.organizationId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public OrganizationAdminAccountRegistration(String name) {
        this(name, OrganizationAdminAccountRegistrationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public OrganizationAdminAccountRegistration(String name, OrganizationAdminAccountRegistrationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public OrganizationAdminAccountRegistration(String name, OrganizationAdminAccountRegistrationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:auditmanager/organizationAdminAccountRegistration:OrganizationAdminAccountRegistration", name, args == null ? OrganizationAdminAccountRegistrationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private OrganizationAdminAccountRegistration(String name, Output<String> id, @Nullable OrganizationAdminAccountRegistrationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:auditmanager/organizationAdminAccountRegistration:OrganizationAdminAccountRegistration", name, state, makeResourceOptions(options, id));
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
    public static OrganizationAdminAccountRegistration get(String name, Output<String> id, @Nullable OrganizationAdminAccountRegistrationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new OrganizationAdminAccountRegistration(name, id, state, options);
    }
}

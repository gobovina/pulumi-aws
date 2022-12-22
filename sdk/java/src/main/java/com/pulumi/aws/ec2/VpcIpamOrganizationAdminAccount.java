// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.ec2.VpcIpamOrganizationAdminAccountArgs;
import com.pulumi.aws.ec2.inputs.VpcIpamOrganizationAdminAccountState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Enables the IPAM Service and promotes a delegated administrator.
 * 
 * ## Example Usage
 * 
 * Basic usage:
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.AwsFunctions;
 * import com.pulumi.aws.ec2.VpcIpamOrganizationAdminAccount;
 * import com.pulumi.aws.ec2.VpcIpamOrganizationAdminAccountArgs;
 * import com.pulumi.aws.Provider;
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
 *         final var delegated = AwsFunctions.getCallerIdentity();
 * 
 *         var example = new VpcIpamOrganizationAdminAccount(&#34;example&#34;, VpcIpamOrganizationAdminAccountArgs.builder()        
 *             .delegatedAdminAccountId(delegated.applyValue(getCallerIdentityResult -&gt; getCallerIdentityResult.accountId()))
 *             .build());
 * 
 *         var ipamDelegateAccount = new Provider(&#34;ipamDelegateAccount&#34;);
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * IPAMs can be imported using the `delegate account id`, e.g.
 * 
 * ```sh
 *  $ pulumi import aws:ec2/vpcIpamOrganizationAdminAccount:VpcIpamOrganizationAdminAccount example 12345678901
 * ```
 * 
 */
@ResourceType(type="aws:ec2/vpcIpamOrganizationAdminAccount:VpcIpamOrganizationAdminAccount")
public class VpcIpamOrganizationAdminAccount extends com.pulumi.resources.CustomResource {
    /**
     * The Organizations ARN for the delegate account.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return The Organizations ARN for the delegate account.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    @Export(name="delegatedAdminAccountId", refs={String.class}, tree="[0]")
    private Output<String> delegatedAdminAccountId;

    public Output<String> delegatedAdminAccountId() {
        return this.delegatedAdminAccountId;
    }
    /**
     * The Organizations email for the delegate account.
     * 
     */
    @Export(name="email", refs={String.class}, tree="[0]")
    private Output<String> email;

    /**
     * @return The Organizations email for the delegate account.
     * 
     */
    public Output<String> email() {
        return this.email;
    }
    /**
     * The Organizations name for the delegate account.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The Organizations name for the delegate account.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The AWS service principal.
     * 
     */
    @Export(name="servicePrincipal", refs={String.class}, tree="[0]")
    private Output<String> servicePrincipal;

    /**
     * @return The AWS service principal.
     * 
     */
    public Output<String> servicePrincipal() {
        return this.servicePrincipal;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public VpcIpamOrganizationAdminAccount(String name) {
        this(name, VpcIpamOrganizationAdminAccountArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public VpcIpamOrganizationAdminAccount(String name, VpcIpamOrganizationAdminAccountArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public VpcIpamOrganizationAdminAccount(String name, VpcIpamOrganizationAdminAccountArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/vpcIpamOrganizationAdminAccount:VpcIpamOrganizationAdminAccount", name, args == null ? VpcIpamOrganizationAdminAccountArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private VpcIpamOrganizationAdminAccount(String name, Output<String> id, @Nullable VpcIpamOrganizationAdminAccountState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/vpcIpamOrganizationAdminAccount:VpcIpamOrganizationAdminAccount", name, state, makeResourceOptions(options, id));
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
    public static VpcIpamOrganizationAdminAccount get(String name, Output<String> id, @Nullable VpcIpamOrganizationAdminAccountState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new VpcIpamOrganizationAdminAccount(name, id, state, options);
    }
}

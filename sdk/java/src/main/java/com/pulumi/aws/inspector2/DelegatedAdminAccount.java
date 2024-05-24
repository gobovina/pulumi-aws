// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.inspector2;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.inspector2.DelegatedAdminAccountArgs;
import com.pulumi.aws.inspector2.inputs.DelegatedAdminAccountState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Resource for managing an Amazon Inspector Delegated Admin Account.
 * 
 * ## Example Usage
 * 
 * ### Basic Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.AwsFunctions;
 * import com.pulumi.aws.inputs.GetCallerIdentityArgs;
 * import com.pulumi.aws.inspector2.DelegatedAdminAccount;
 * import com.pulumi.aws.inspector2.DelegatedAdminAccountArgs;
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
 *         final var current = AwsFunctions.getCallerIdentity();
 * 
 *         var example = new DelegatedAdminAccount("example", DelegatedAdminAccountArgs.builder()
 *             .accountId(current.applyValue(getCallerIdentityResult -> getCallerIdentityResult.accountId()))
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
 * Using `pulumi import`, import Inspector Delegated Admin Account using the `account_id`. For example:
 * 
 * ```sh
 * $ pulumi import aws:inspector2/delegatedAdminAccount:DelegatedAdminAccount example 012345678901
 * ```
 * 
 */
@ResourceType(type="aws:inspector2/delegatedAdminAccount:DelegatedAdminAccount")
public class DelegatedAdminAccount extends com.pulumi.resources.CustomResource {
    /**
     * Account to enable as delegated admin account.
     * 
     */
    @Export(name="accountId", refs={String.class}, tree="[0]")
    private Output<String> accountId;

    /**
     * @return Account to enable as delegated admin account.
     * 
     */
    public Output<String> accountId() {
        return this.accountId;
    }
    /**
     * Status of this delegated admin account.
     * 
     */
    @Export(name="relationshipStatus", refs={String.class}, tree="[0]")
    private Output<String> relationshipStatus;

    /**
     * @return Status of this delegated admin account.
     * 
     */
    public Output<String> relationshipStatus() {
        return this.relationshipStatus;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DelegatedAdminAccount(String name) {
        this(name, DelegatedAdminAccountArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DelegatedAdminAccount(String name, DelegatedAdminAccountArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DelegatedAdminAccount(String name, DelegatedAdminAccountArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:inspector2/delegatedAdminAccount:DelegatedAdminAccount", name, args == null ? DelegatedAdminAccountArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DelegatedAdminAccount(String name, Output<String> id, @Nullable DelegatedAdminAccountState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:inspector2/delegatedAdminAccount:DelegatedAdminAccount", name, state, makeResourceOptions(options, id));
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
    public static DelegatedAdminAccount get(String name, Output<String> id, @Nullable DelegatedAdminAccountState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DelegatedAdminAccount(name, id, state, options);
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.sesv2;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.sesv2.AccountVdmAttributesArgs;
import com.pulumi.aws.sesv2.inputs.AccountVdmAttributesState;
import com.pulumi.aws.sesv2.outputs.AccountVdmAttributesDashboardAttributes;
import com.pulumi.aws.sesv2.outputs.AccountVdmAttributesGuardianAttributes;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Resource for managing an AWS SESv2 (Simple Email V2) Account VDM Attributes.
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
 * import com.pulumi.aws.sesv2.AccountVdmAttributes;
 * import com.pulumi.aws.sesv2.AccountVdmAttributesArgs;
 * import com.pulumi.aws.sesv2.inputs.AccountVdmAttributesDashboardAttributesArgs;
 * import com.pulumi.aws.sesv2.inputs.AccountVdmAttributesGuardianAttributesArgs;
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
 *         var example = new AccountVdmAttributes("example", AccountVdmAttributesArgs.builder()
 *             .vdmEnabled("ENABLED")
 *             .dashboardAttributes(AccountVdmAttributesDashboardAttributesArgs.builder()
 *                 .engagementMetrics("ENABLED")
 *                 .build())
 *             .guardianAttributes(AccountVdmAttributesGuardianAttributesArgs.builder()
 *                 .optimizedSharedDelivery("ENABLED")
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
 * Using `pulumi import`, import SESv2 (Simple Email V2) Account VDM Attributes using the word `ses-account-vdm-attributes`. For example:
 * 
 * ```sh
 * $ pulumi import aws:sesv2/accountVdmAttributes:AccountVdmAttributes example ses-account-vdm-attributes
 * ```
 * 
 */
@ResourceType(type="aws:sesv2/accountVdmAttributes:AccountVdmAttributes")
public class AccountVdmAttributes extends com.pulumi.resources.CustomResource {
    /**
     * Specifies additional settings for your VDM configuration as applicable to the Dashboard.
     * 
     */
    @Export(name="dashboardAttributes", refs={AccountVdmAttributesDashboardAttributes.class}, tree="[0]")
    private Output<AccountVdmAttributesDashboardAttributes> dashboardAttributes;

    /**
     * @return Specifies additional settings for your VDM configuration as applicable to the Dashboard.
     * 
     */
    public Output<AccountVdmAttributesDashboardAttributes> dashboardAttributes() {
        return this.dashboardAttributes;
    }
    /**
     * Specifies additional settings for your VDM configuration as applicable to the Guardian.
     * 
     */
    @Export(name="guardianAttributes", refs={AccountVdmAttributesGuardianAttributes.class}, tree="[0]")
    private Output<AccountVdmAttributesGuardianAttributes> guardianAttributes;

    /**
     * @return Specifies additional settings for your VDM configuration as applicable to the Guardian.
     * 
     */
    public Output<AccountVdmAttributesGuardianAttributes> guardianAttributes() {
        return this.guardianAttributes;
    }
    /**
     * Specifies the status of your VDM configuration. Valid values: `ENABLED`, `DISABLED`.
     * 
     * The following arguments are optional:
     * 
     */
    @Export(name="vdmEnabled", refs={String.class}, tree="[0]")
    private Output<String> vdmEnabled;

    /**
     * @return Specifies the status of your VDM configuration. Valid values: `ENABLED`, `DISABLED`.
     * 
     * The following arguments are optional:
     * 
     */
    public Output<String> vdmEnabled() {
        return this.vdmEnabled;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AccountVdmAttributes(String name) {
        this(name, AccountVdmAttributesArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AccountVdmAttributes(String name, AccountVdmAttributesArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AccountVdmAttributes(String name, AccountVdmAttributesArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:sesv2/accountVdmAttributes:AccountVdmAttributes", name, args == null ? AccountVdmAttributesArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private AccountVdmAttributes(String name, Output<String> id, @Nullable AccountVdmAttributesState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:sesv2/accountVdmAttributes:AccountVdmAttributes", name, state, makeResourceOptions(options, id));
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
    public static AccountVdmAttributes get(String name, Output<String> id, @Nullable AccountVdmAttributesState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AccountVdmAttributes(name, id, state, options);
    }
}

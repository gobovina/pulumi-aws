// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.verifiedpermissions;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.verifiedpermissions.PolicyStoreArgs;
import com.pulumi.aws.verifiedpermissions.inputs.PolicyStoreState;
import com.pulumi.aws.verifiedpermissions.outputs.PolicyStoreValidationSettings;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
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
 * import com.pulumi.aws.verifiedpermissions.PolicyStore;
 * import com.pulumi.aws.verifiedpermissions.PolicyStoreArgs;
 * import com.pulumi.aws.verifiedpermissions.inputs.PolicyStoreValidationSettingsArgs;
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
 *         var example = new PolicyStore(&#34;example&#34;, PolicyStoreArgs.builder()        
 *             .validationSettings(PolicyStoreValidationSettingsArgs.builder()
 *                 .mode(&#34;STRICT&#34;)
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
 * Using `pulumi import`, import Verified Permissions Policy Store using the `policy_store_id`. For example:
 * 
 * console
 * 
 *  %!p(MISSING)ulumi import aws_verifiedpermissions_policy_store.example DxQg2j8xvXJQ1tQCYNWj9T
 * 
 */
@ResourceType(type="aws:verifiedpermissions/policyStore:PolicyStore")
public class PolicyStore extends com.pulumi.resources.CustomResource {
    /**
     * The ARN of the Policy Store.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return The ARN of the Policy Store.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * A description of the Policy Store.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return A description of the Policy Store.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The ID of the Policy Store.
     * 
     */
    @Export(name="policyStoreId", refs={String.class}, tree="[0]")
    private Output<String> policyStoreId;

    /**
     * @return The ID of the Policy Store.
     * 
     */
    public Output<String> policyStoreId() {
        return this.policyStoreId;
    }
    /**
     * Validation settings for the policy store.
     * 
     */
    @Export(name="validationSettings", refs={PolicyStoreValidationSettings.class}, tree="[0]")
    private Output</* @Nullable */ PolicyStoreValidationSettings> validationSettings;

    /**
     * @return Validation settings for the policy store.
     * 
     */
    public Output<Optional<PolicyStoreValidationSettings>> validationSettings() {
        return Codegen.optional(this.validationSettings);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public PolicyStore(String name) {
        this(name, PolicyStoreArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PolicyStore(String name, @Nullable PolicyStoreArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PolicyStore(String name, @Nullable PolicyStoreArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:verifiedpermissions/policyStore:PolicyStore", name, args == null ? PolicyStoreArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private PolicyStore(String name, Output<String> id, @Nullable PolicyStoreState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:verifiedpermissions/policyStore:PolicyStore", name, state, makeResourceOptions(options, id));
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
    public static PolicyStore get(String name, Output<String> id, @Nullable PolicyStoreState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new PolicyStore(name, id, state, options);
    }
}

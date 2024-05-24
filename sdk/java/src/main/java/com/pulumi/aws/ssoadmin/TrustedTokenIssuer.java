// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ssoadmin;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.ssoadmin.TrustedTokenIssuerArgs;
import com.pulumi.aws.ssoadmin.inputs.TrustedTokenIssuerState;
import com.pulumi.aws.ssoadmin.outputs.TrustedTokenIssuerTrustedTokenIssuerConfiguration;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Resource for managing an AWS SSO Admin Trusted Token Issuer.
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
 * import com.pulumi.aws.ssoadmin.SsoadminFunctions;
 * import com.pulumi.aws.ssoadmin.TrustedTokenIssuer;
 * import com.pulumi.aws.ssoadmin.TrustedTokenIssuerArgs;
 * import com.pulumi.aws.ssoadmin.inputs.TrustedTokenIssuerTrustedTokenIssuerConfigurationArgs;
 * import com.pulumi.aws.ssoadmin.inputs.TrustedTokenIssuerTrustedTokenIssuerConfigurationOidcJwtConfigurationArgs;
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
 *         final var example = SsoadminFunctions.getInstances();
 * 
 *         var exampleTrustedTokenIssuer = new TrustedTokenIssuer("exampleTrustedTokenIssuer", TrustedTokenIssuerArgs.builder()
 *             .name("example")
 *             .instanceArn(example.applyValue(getInstancesResult -> getInstancesResult.arns()[0]))
 *             .trustedTokenIssuerType("OIDC_JWT")
 *             .trustedTokenIssuerConfiguration(TrustedTokenIssuerTrustedTokenIssuerConfigurationArgs.builder()
 *                 .oidcJwtConfiguration(TrustedTokenIssuerTrustedTokenIssuerConfigurationOidcJwtConfigurationArgs.builder()
 *                     .claimAttributePath("email")
 *                     .identityStoreAttributePath("emails.value")
 *                     .issuerUrl("https://example.com")
 *                     .jwksRetrievalOption("OPEN_ID_DISCOVERY")
 *                     .build())
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
 * Using `pulumi import`, import SSO Admin Trusted Token Issuer using the `id`. For example:
 * 
 * ```sh
 * $ pulumi import aws:ssoadmin/trustedTokenIssuer:TrustedTokenIssuer example arn:aws:sso::012345678901:trustedTokenIssuer/ssoins-lu1ye3gew4mbc7ju/tti-2657c556-9707-11ee-b9d1-0242ac120002
 * ```
 * 
 */
@ResourceType(type="aws:ssoadmin/trustedTokenIssuer:TrustedTokenIssuer")
public class TrustedTokenIssuer extends com.pulumi.resources.CustomResource {
    /**
     * ARN of the trusted token issuer.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return ARN of the trusted token issuer.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * A unique, case-sensitive ID that you provide to ensure the idempotency of the request. AWS generates a random value when not provided.
     * 
     */
    @Export(name="clientToken", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> clientToken;

    /**
     * @return A unique, case-sensitive ID that you provide to ensure the idempotency of the request. AWS generates a random value when not provided.
     * 
     */
    public Output<Optional<String>> clientToken() {
        return Codegen.optional(this.clientToken);
    }
    /**
     * ARN of the instance of IAM Identity Center.
     * 
     */
    @Export(name="instanceArn", refs={String.class}, tree="[0]")
    private Output<String> instanceArn;

    /**
     * @return ARN of the instance of IAM Identity Center.
     * 
     */
    public Output<String> instanceArn() {
        return this.instanceArn;
    }
    /**
     * Name of the trusted token issuer.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of the trusted token issuer.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     * @deprecated
     * Please use `tags` instead.
     * 
     */
    @Deprecated /* Please use `tags` instead. */
    @Export(name="tagsAll", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output<Map<String,String>> tagsAll;

    /**
     * @return Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }
    /**
     * A block that specifies settings that apply to the trusted token issuer, these change depending on the type you specify in `trusted_token_issuer_type`. Documented below.
     * 
     */
    @Export(name="trustedTokenIssuerConfiguration", refs={TrustedTokenIssuerTrustedTokenIssuerConfiguration.class}, tree="[0]")
    private Output</* @Nullable */ TrustedTokenIssuerTrustedTokenIssuerConfiguration> trustedTokenIssuerConfiguration;

    /**
     * @return A block that specifies settings that apply to the trusted token issuer, these change depending on the type you specify in `trusted_token_issuer_type`. Documented below.
     * 
     */
    public Output<Optional<TrustedTokenIssuerTrustedTokenIssuerConfiguration>> trustedTokenIssuerConfiguration() {
        return Codegen.optional(this.trustedTokenIssuerConfiguration);
    }
    /**
     * Specifies the type of the trusted token issuer. Valid values are `OIDC_JWT`
     * 
     * The following arguments are optional:
     * 
     */
    @Export(name="trustedTokenIssuerType", refs={String.class}, tree="[0]")
    private Output<String> trustedTokenIssuerType;

    /**
     * @return Specifies the type of the trusted token issuer. Valid values are `OIDC_JWT`
     * 
     * The following arguments are optional:
     * 
     */
    public Output<String> trustedTokenIssuerType() {
        return this.trustedTokenIssuerType;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public TrustedTokenIssuer(String name) {
        this(name, TrustedTokenIssuerArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public TrustedTokenIssuer(String name, TrustedTokenIssuerArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TrustedTokenIssuer(String name, TrustedTokenIssuerArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ssoadmin/trustedTokenIssuer:TrustedTokenIssuer", name, args == null ? TrustedTokenIssuerArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private TrustedTokenIssuer(String name, Output<String> id, @Nullable TrustedTokenIssuerState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ssoadmin/trustedTokenIssuer:TrustedTokenIssuer", name, state, makeResourceOptions(options, id));
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
    public static TrustedTokenIssuer get(String name, Output<String> id, @Nullable TrustedTokenIssuerState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new TrustedTokenIssuer(name, id, state, options);
    }
}

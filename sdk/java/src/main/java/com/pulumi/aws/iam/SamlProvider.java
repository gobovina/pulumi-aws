// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.iam;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.iam.SamlProviderArgs;
import com.pulumi.aws.iam.inputs.SamlProviderState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides an IAM SAML provider.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.iam.SamlProvider;
 * import com.pulumi.aws.iam.SamlProviderArgs;
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
 *         var default_ = new SamlProvider(&#34;default&#34;, SamlProviderArgs.builder()        
 *             .samlMetadataDocument(Files.readString(Paths.get(&#34;saml-metadata.xml&#34;)))
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import IAM SAML Providers using the `arn`. For example:
 * 
 * ```sh
 *  $ pulumi import aws:iam/samlProvider:SamlProvider default arn:aws:iam::123456789012:saml-provider/SAMLADFS
 * ```
 * 
 */
@ResourceType(type="aws:iam/samlProvider:SamlProvider")
public class SamlProvider extends com.pulumi.resources.CustomResource {
    /**
     * The ARN assigned by AWS for this provider.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return The ARN assigned by AWS for this provider.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The name of the provider to create.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the provider to create.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * An XML document generated by an identity provider that supports SAML 2.0.
     * 
     */
    @Export(name="samlMetadataDocument", refs={String.class}, tree="[0]")
    private Output<String> samlMetadataDocument;

    /**
     * @return An XML document generated by an identity provider that supports SAML 2.0.
     * 
     */
    public Output<String> samlMetadataDocument() {
        return this.samlMetadataDocument;
    }
    /**
     * Map of resource tags for the IAM SAML provider. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Map of resource tags for the IAM SAML provider. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
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
     * The expiration date and time for the SAML provider in RFC1123 format, e.g., `Mon, 02 Jan 2006 15:04:05 MST`.
     * 
     */
    @Export(name="validUntil", refs={String.class}, tree="[0]")
    private Output<String> validUntil;

    /**
     * @return The expiration date and time for the SAML provider in RFC1123 format, e.g., `Mon, 02 Jan 2006 15:04:05 MST`.
     * 
     */
    public Output<String> validUntil() {
        return this.validUntil;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SamlProvider(String name) {
        this(name, SamlProviderArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SamlProvider(String name, SamlProviderArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SamlProvider(String name, SamlProviderArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:iam/samlProvider:SamlProvider", name, args == null ? SamlProviderArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private SamlProvider(String name, Output<String> id, @Nullable SamlProviderState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:iam/samlProvider:SamlProvider", name, state, makeResourceOptions(options, id));
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
    public static SamlProvider get(String name, Output<String> id, @Nullable SamlProviderState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SamlProvider(name, id, state, options);
    }
}

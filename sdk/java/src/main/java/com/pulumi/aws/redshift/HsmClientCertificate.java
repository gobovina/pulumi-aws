// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.redshift;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.redshift.HsmClientCertificateArgs;
import com.pulumi.aws.redshift.inputs.HsmClientCertificateState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Creates an HSM client certificate that an Amazon Redshift cluster will use to connect to the client&#39;s HSM in order to store and retrieve the keys used to encrypt the cluster databases.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.redshift.HsmClientCertificate;
 * import com.pulumi.aws.redshift.HsmClientCertificateArgs;
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
 *         var example = new HsmClientCertificate(&#34;example&#34;, HsmClientCertificateArgs.builder()        
 *             .hsmClientCertificateIdentifier(&#34;example&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import Redshift HSM Client Certificates using `hsm_client_certificate_identifier`. For example:
 * 
 * ```sh
 *  $ pulumi import aws:redshift/hsmClientCertificate:HsmClientCertificate test example
 * ```
 * 
 */
@ResourceType(type="aws:redshift/hsmClientCertificate:HsmClientCertificate")
public class HsmClientCertificate extends com.pulumi.resources.CustomResource {
    /**
     * Amazon Resource Name (ARN) of the Hsm Client Certificate.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return Amazon Resource Name (ARN) of the Hsm Client Certificate.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The identifier of the HSM client certificate.
     * 
     */
    @Export(name="hsmClientCertificateIdentifier", refs={String.class}, tree="[0]")
    private Output<String> hsmClientCertificateIdentifier;

    /**
     * @return The identifier of the HSM client certificate.
     * 
     */
    public Output<String> hsmClientCertificateIdentifier() {
        return this.hsmClientCertificateIdentifier;
    }
    /**
     * The public key that the Amazon Redshift cluster will use to connect to the HSM. You must register the public key in the HSM.
     * 
     */
    @Export(name="hsmClientCertificatePublicKey", refs={String.class}, tree="[0]")
    private Output<String> hsmClientCertificatePublicKey;

    /**
     * @return The public key that the Amazon Redshift cluster will use to connect to the HSM. You must register the public key in the HSM.
     * 
     */
    public Output<String> hsmClientCertificatePublicKey() {
        return this.hsmClientCertificatePublicKey;
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
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public HsmClientCertificate(String name) {
        this(name, HsmClientCertificateArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public HsmClientCertificate(String name, HsmClientCertificateArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public HsmClientCertificate(String name, HsmClientCertificateArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:redshift/hsmClientCertificate:HsmClientCertificate", name, args == null ? HsmClientCertificateArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private HsmClientCertificate(String name, Output<String> id, @Nullable HsmClientCertificateState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:redshift/hsmClientCertificate:HsmClientCertificate", name, state, makeResourceOptions(options, id));
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
    public static HsmClientCertificate get(String name, Output<String> id, @Nullable HsmClientCertificateState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new HsmClientCertificate(name, id, state, options);
    }
}

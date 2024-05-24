// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.iam;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.iam.SigningCertificateArgs;
import com.pulumi.aws.iam.inputs.SigningCertificateState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides an IAM Signing Certificate resource to upload Signing Certificates.
 * 
 * &gt; **Note:** All arguments including the certificate body will be stored in the raw state as plain-text.
 * ## Example Usage
 * 
 * **Using certs on file:**
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.iam.SigningCertificate;
 * import com.pulumi.aws.iam.SigningCertificateArgs;
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
 *         var testCert = new SigningCertificate("testCert", SigningCertificateArgs.builder()
 *             .username("some_test_cert")
 *             .certificateBody(StdFunctions.file(FileArgs.builder()
 *                 .input("self-ca-cert.pem")
 *                 .build()).result())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * **Example with cert in-line:**
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.iam.SigningCertificate;
 * import com.pulumi.aws.iam.SigningCertificateArgs;
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
 *         var testCertAlt = new SigningCertificate("testCertAlt", SigningCertificateArgs.builder()
 *             .username("some_test_cert")
 *             .certificateBody("""
 * -----BEGIN CERTIFICATE-----
 * [......] # cert contents
 * -----END CERTIFICATE-----
 *             """)
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
 * Using `pulumi import`, import IAM Signing Certificates using the `id`. For example:
 * 
 * ```sh
 * $ pulumi import aws:iam/signingCertificate:SigningCertificate certificate IDIDIDIDID:user-name
 * ```
 * 
 */
@ResourceType(type="aws:iam/signingCertificate:SigningCertificate")
public class SigningCertificate extends com.pulumi.resources.CustomResource {
    /**
     * The contents of the signing certificate in PEM-encoded format.
     * 
     */
    @Export(name="certificateBody", refs={String.class}, tree="[0]")
    private Output<String> certificateBody;

    /**
     * @return The contents of the signing certificate in PEM-encoded format.
     * 
     */
    public Output<String> certificateBody() {
        return this.certificateBody;
    }
    /**
     * The ID for the signing certificate.
     * 
     */
    @Export(name="certificateId", refs={String.class}, tree="[0]")
    private Output<String> certificateId;

    /**
     * @return The ID for the signing certificate.
     * 
     */
    public Output<String> certificateId() {
        return this.certificateId;
    }
    /**
     * The status you want to assign to the certificate. `Active` means that the certificate can be used for programmatic calls to Amazon Web Services `Inactive` means that the certificate cannot be used.
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> status;

    /**
     * @return The status you want to assign to the certificate. `Active` means that the certificate can be used for programmatic calls to Amazon Web Services `Inactive` means that the certificate cannot be used.
     * 
     */
    public Output<Optional<String>> status() {
        return Codegen.optional(this.status);
    }
    /**
     * The name of the user the signing certificate is for.
     * 
     */
    @Export(name="userName", refs={String.class}, tree="[0]")
    private Output<String> userName;

    /**
     * @return The name of the user the signing certificate is for.
     * 
     */
    public Output<String> userName() {
        return this.userName;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SigningCertificate(String name) {
        this(name, SigningCertificateArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SigningCertificate(String name, SigningCertificateArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SigningCertificate(String name, SigningCertificateArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:iam/signingCertificate:SigningCertificate", name, args == null ? SigningCertificateArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private SigningCertificate(String name, Output<String> id, @Nullable SigningCertificateState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:iam/signingCertificate:SigningCertificate", name, state, makeResourceOptions(options, id));
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
    public static SigningCertificate get(String name, Output<String> id, @Nullable SigningCertificateState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SigningCertificate(name, id, state, options);
    }
}

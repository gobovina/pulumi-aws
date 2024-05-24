// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.iam;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.iam.ServerCertificateArgs;
import com.pulumi.aws.iam.inputs.ServerCertificateState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides an IAM Server Certificate resource to upload Server Certificates.
 * Certs uploaded to IAM can easily work with other AWS services such as:
 * 
 * - AWS Elastic Beanstalk
 * - Elastic Load Balancing
 * - CloudFront
 * - AWS OpsWorks
 * 
 * For information about server certificates in IAM, see [Managing Server
 * Certificates][2] in AWS Documentation.
 * 
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
 * import com.pulumi.aws.iam.ServerCertificate;
 * import com.pulumi.aws.iam.ServerCertificateArgs;
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
 *         var testCert = new ServerCertificate("testCert", ServerCertificateArgs.builder()
 *             .name("some_test_cert")
 *             .certificateBody(StdFunctions.file(FileArgs.builder()
 *                 .input("self-ca-cert.pem")
 *                 .build()).result())
 *             .privateKey(StdFunctions.file(FileArgs.builder()
 *                 .input("test-key.pem")
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
 * import com.pulumi.aws.iam.ServerCertificate;
 * import com.pulumi.aws.iam.ServerCertificateArgs;
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
 *         var testCertAlt = new ServerCertificate("testCertAlt", ServerCertificateArgs.builder()
 *             .name("alt_test_cert")
 *             .certificateBody("""
 * -----BEGIN CERTIFICATE-----
 * [......] # cert contents
 * -----END CERTIFICATE-----
 *             """)
 *             .privateKey("""
 * -----BEGIN RSA PRIVATE KEY-----
 * [......] # cert contents
 * -----END RSA PRIVATE KEY-----
 *             """)
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * **Use in combination with an AWS ELB resource:**
 * 
 * Some properties of an IAM Server Certificates cannot be updated while they are
 * in use. In order for the provider to effectively manage a Certificate in this situation, it is
 * recommended you utilize the `name_prefix` attribute and enable the
 * `create_before_destroy`. This will allow this provider
 * to create a new, updated `aws.iam.ServerCertificate` resource and replace it in
 * dependant resources before attempting to destroy the old version.
 * 
 * ## Import
 * 
 * Using `pulumi import`, import IAM Server Certificates using the `name`. For example:
 * 
 * ```sh
 * $ pulumi import aws:iam/serverCertificate:ServerCertificate certificate example.com-certificate-until-2018
 * ```
 * 
 */
@ResourceType(type="aws:iam/serverCertificate:ServerCertificate")
public class ServerCertificate extends com.pulumi.resources.CustomResource {
    /**
     * The Amazon Resource Name (ARN) specifying the server certificate.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) specifying the server certificate.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The contents of the public key certificate in
     * PEM-encoded format.
     * 
     */
    @Export(name="certificateBody", refs={String.class}, tree="[0]")
    private Output<String> certificateBody;

    /**
     * @return The contents of the public key certificate in
     * PEM-encoded format.
     * 
     */
    public Output<String> certificateBody() {
        return this.certificateBody;
    }
    /**
     * The contents of the certificate chain.
     * This is typically a concatenation of the PEM-encoded public key certificates
     * of the chain.
     * 
     */
    @Export(name="certificateChain", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> certificateChain;

    /**
     * @return The contents of the certificate chain.
     * This is typically a concatenation of the PEM-encoded public key certificates
     * of the chain.
     * 
     */
    public Output<Optional<String>> certificateChain() {
        return Codegen.optional(this.certificateChain);
    }
    /**
     * Date and time in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) on which the certificate is set to expire.
     * 
     */
    @Export(name="expiration", refs={String.class}, tree="[0]")
    private Output<String> expiration;

    /**
     * @return Date and time in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) on which the certificate is set to expire.
     * 
     */
    public Output<String> expiration() {
        return this.expiration;
    }
    /**
     * The name of the Server Certificate. Do not include the
     * path in this value. If omitted, the provider will assign a random, unique name.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the Server Certificate. Do not include the
     * path in this value. If omitted, the provider will assign a random, unique name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Creates a unique name beginning with the specified
     * prefix. Conflicts with `name`.
     * 
     */
    @Export(name="namePrefix", refs={String.class}, tree="[0]")
    private Output<String> namePrefix;

    /**
     * @return Creates a unique name beginning with the specified
     * prefix. Conflicts with `name`.
     * 
     */
    public Output<String> namePrefix() {
        return this.namePrefix;
    }
    /**
     * The IAM path for the server certificate.  If it is not
     * included, it defaults to a slash (/). If this certificate is for use with
     * AWS CloudFront, the path must be in format `/cloudfront/your_path_here`.
     * See [IAM Identifiers](https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html) for more details on IAM Paths.
     * 
     */
    @Export(name="path", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> path;

    /**
     * @return The IAM path for the server certificate.  If it is not
     * included, it defaults to a slash (/). If this certificate is for use with
     * AWS CloudFront, the path must be in format `/cloudfront/your_path_here`.
     * See [IAM Identifiers](https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html) for more details on IAM Paths.
     * 
     */
    public Output<Optional<String>> path() {
        return Codegen.optional(this.path);
    }
    /**
     * The contents of the private key in PEM-encoded format.
     * 
     */
    @Export(name="privateKey", refs={String.class}, tree="[0]")
    private Output<String> privateKey;

    /**
     * @return The contents of the private key in PEM-encoded format.
     * 
     */
    public Output<String> privateKey() {
        return this.privateKey;
    }
    /**
     * Map of resource tags for the server certificate. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     * &gt; **NOTE:** AWS performs behind-the-scenes modifications to some certificate files if they do not adhere to a specific format. These modifications will result in this provider forever believing that it needs to update the resources since the local and AWS file contents will not match after theses modifications occur. In order to prevent this from happening you must ensure that all your PEM-encoded files use UNIX line-breaks and that `certificate_body` contains only one certificate. All other certificates should go in `certificate_chain`. It is common for some Certificate Authorities to issue certificate files that have DOS line-breaks and that are actually multiple certificates concatenated together in order to form a full certificate chain.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Map of resource tags for the server certificate. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     * &gt; **NOTE:** AWS performs behind-the-scenes modifications to some certificate files if they do not adhere to a specific format. These modifications will result in this provider forever believing that it needs to update the resources since the local and AWS file contents will not match after theses modifications occur. In order to prevent this from happening you must ensure that all your PEM-encoded files use UNIX line-breaks and that `certificate_body` contains only one certificate. All other certificates should go in `certificate_chain`. It is common for some Certificate Authorities to issue certificate files that have DOS line-breaks and that are actually multiple certificates concatenated together in order to form a full certificate chain.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     * @deprecated
     * Please use `tags` instead.
     * 
     */
    @Deprecated /* Please use `tags` instead. */
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
     * Date and time in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) when the server certificate was uploaded.
     * 
     */
    @Export(name="uploadDate", refs={String.class}, tree="[0]")
    private Output<String> uploadDate;

    /**
     * @return Date and time in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) when the server certificate was uploaded.
     * 
     */
    public Output<String> uploadDate() {
        return this.uploadDate;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ServerCertificate(String name) {
        this(name, ServerCertificateArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ServerCertificate(String name, ServerCertificateArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ServerCertificate(String name, ServerCertificateArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:iam/serverCertificate:ServerCertificate", name, args == null ? ServerCertificateArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ServerCertificate(String name, Output<String> id, @Nullable ServerCertificateState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:iam/serverCertificate:ServerCertificate", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "privateKey"
            ))
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
    public static ServerCertificate get(String name, Output<String> id, @Nullable ServerCertificateState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ServerCertificate(name, id, state, options);
    }
}

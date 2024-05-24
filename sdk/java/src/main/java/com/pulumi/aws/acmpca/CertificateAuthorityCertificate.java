// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.acmpca;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.acmpca.CertificateAuthorityCertificateArgs;
import com.pulumi.aws.acmpca.inputs.CertificateAuthorityCertificateState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Associates a certificate with an AWS Certificate Manager Private Certificate Authority (ACM PCA Certificate Authority). An ACM PCA Certificate Authority is unable to issue certificates until it has a certificate associated with it. A root level ACM PCA Certificate Authority is able to self-sign its own root certificate.
 * 
 * ## Example Usage
 * 
 * ### Self-Signed Root Certificate Authority Certificate
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.acmpca.CertificateAuthority;
 * import com.pulumi.aws.acmpca.CertificateAuthorityArgs;
 * import com.pulumi.aws.acmpca.inputs.CertificateAuthorityCertificateAuthorityConfigurationArgs;
 * import com.pulumi.aws.acmpca.inputs.CertificateAuthorityCertificateAuthorityConfigurationSubjectArgs;
 * import com.pulumi.aws.AwsFunctions;
 * import com.pulumi.aws.inputs.GetPartitionArgs;
 * import com.pulumi.aws.acmpca.Certificate;
 * import com.pulumi.aws.acmpca.CertificateArgs;
 * import com.pulumi.aws.acmpca.inputs.CertificateValidityArgs;
 * import com.pulumi.aws.acmpca.CertificateAuthorityCertificate;
 * import com.pulumi.aws.acmpca.CertificateAuthorityCertificateArgs;
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
 *         var exampleCertificateAuthority = new CertificateAuthority("exampleCertificateAuthority", CertificateAuthorityArgs.builder()
 *             .type("ROOT")
 *             .certificateAuthorityConfiguration(CertificateAuthorityCertificateAuthorityConfigurationArgs.builder()
 *                 .keyAlgorithm("RSA_4096")
 *                 .signingAlgorithm("SHA512WITHRSA")
 *                 .subject(CertificateAuthorityCertificateAuthorityConfigurationSubjectArgs.builder()
 *                     .commonName("example.com")
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *         final var current = AwsFunctions.getPartition();
 * 
 *         var exampleCertificate = new Certificate("exampleCertificate", CertificateArgs.builder()
 *             .certificateAuthorityArn(exampleCertificateAuthority.arn())
 *             .certificateSigningRequest(exampleCertificateAuthority.certificateSigningRequest())
 *             .signingAlgorithm("SHA512WITHRSA")
 *             .templateArn(String.format("arn:%s:acm-pca:::template/RootCACertificate/V1", current.applyValue(getPartitionResult -> getPartitionResult.partition())))
 *             .validity(CertificateValidityArgs.builder()
 *                 .type("YEARS")
 *                 .value(1)
 *                 .build())
 *             .build());
 * 
 *         var example = new CertificateAuthorityCertificate("example", CertificateAuthorityCertificateArgs.builder()
 *             .certificateAuthorityArn(exampleCertificateAuthority.arn())
 *             .certificate(exampleCertificate.certificate())
 *             .certificateChain(exampleCertificate.certificateChain())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### Certificate for Subordinate Certificate Authority
 * 
 * Note that the certificate for the subordinate certificate authority must be issued by the root certificate authority using a signing request from the subordinate certificate authority.
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.acmpca.CertificateAuthority;
 * import com.pulumi.aws.acmpca.CertificateAuthorityArgs;
 * import com.pulumi.aws.acmpca.inputs.CertificateAuthorityCertificateAuthorityConfigurationArgs;
 * import com.pulumi.aws.acmpca.inputs.CertificateAuthorityCertificateAuthorityConfigurationSubjectArgs;
 * import com.pulumi.aws.AwsFunctions;
 * import com.pulumi.aws.inputs.GetPartitionArgs;
 * import com.pulumi.aws.acmpca.Certificate;
 * import com.pulumi.aws.acmpca.CertificateArgs;
 * import com.pulumi.aws.acmpca.inputs.CertificateValidityArgs;
 * import com.pulumi.aws.acmpca.CertificateAuthorityCertificate;
 * import com.pulumi.aws.acmpca.CertificateAuthorityCertificateArgs;
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
 *         var subordinateCertificateAuthority = new CertificateAuthority("subordinateCertificateAuthority", CertificateAuthorityArgs.builder()
 *             .type("SUBORDINATE")
 *             .certificateAuthorityConfiguration(CertificateAuthorityCertificateAuthorityConfigurationArgs.builder()
 *                 .keyAlgorithm("RSA_2048")
 *                 .signingAlgorithm("SHA512WITHRSA")
 *                 .subject(CertificateAuthorityCertificateAuthorityConfigurationSubjectArgs.builder()
 *                     .commonName("sub.example.com")
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *         var root = new CertificateAuthority("root");
 * 
 *         final var current = AwsFunctions.getPartition();
 * 
 *         var subordinateCertificate = new Certificate("subordinateCertificate", CertificateArgs.builder()
 *             .certificateAuthorityArn(root.arn())
 *             .certificateSigningRequest(subordinateCertificateAuthority.certificateSigningRequest())
 *             .signingAlgorithm("SHA512WITHRSA")
 *             .templateArn(String.format("arn:%s:acm-pca:::template/SubordinateCACertificate_PathLen0/V1", current.applyValue(getPartitionResult -> getPartitionResult.partition())))
 *             .validity(CertificateValidityArgs.builder()
 *                 .type("YEARS")
 *                 .value(1)
 *                 .build())
 *             .build());
 * 
 *         var subordinate = new CertificateAuthorityCertificate("subordinate", CertificateAuthorityCertificateArgs.builder()
 *             .certificateAuthorityArn(subordinateCertificateAuthority.arn())
 *             .certificate(subordinateCertificate.certificate())
 *             .certificateChain(subordinateCertificate.certificateChain())
 *             .build());
 * 
 *         var rootCertificateAuthorityCertificate = new CertificateAuthorityCertificate("rootCertificateAuthorityCertificate");
 * 
 *         var rootCertificate = new Certificate("rootCertificate");
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 */
@ResourceType(type="aws:acmpca/certificateAuthorityCertificate:CertificateAuthorityCertificate")
public class CertificateAuthorityCertificate extends com.pulumi.resources.CustomResource {
    /**
     * PEM-encoded certificate for the Certificate Authority.
     * 
     */
    @Export(name="certificate", refs={String.class}, tree="[0]")
    private Output<String> certificate;

    /**
     * @return PEM-encoded certificate for the Certificate Authority.
     * 
     */
    public Output<String> certificate() {
        return this.certificate;
    }
    /**
     * ARN of the Certificate Authority.
     * 
     */
    @Export(name="certificateAuthorityArn", refs={String.class}, tree="[0]")
    private Output<String> certificateAuthorityArn;

    /**
     * @return ARN of the Certificate Authority.
     * 
     */
    public Output<String> certificateAuthorityArn() {
        return this.certificateAuthorityArn;
    }
    /**
     * PEM-encoded certificate chain that includes any intermediate certificates and chains up to root CA. Required for subordinate Certificate Authorities. Not allowed for root Certificate Authorities.
     * 
     */
    @Export(name="certificateChain", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> certificateChain;

    /**
     * @return PEM-encoded certificate chain that includes any intermediate certificates and chains up to root CA. Required for subordinate Certificate Authorities. Not allowed for root Certificate Authorities.
     * 
     */
    public Output<Optional<String>> certificateChain() {
        return Codegen.optional(this.certificateChain);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CertificateAuthorityCertificate(String name) {
        this(name, CertificateAuthorityCertificateArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CertificateAuthorityCertificate(String name, CertificateAuthorityCertificateArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CertificateAuthorityCertificate(String name, CertificateAuthorityCertificateArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:acmpca/certificateAuthorityCertificate:CertificateAuthorityCertificate", name, args == null ? CertificateAuthorityCertificateArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private CertificateAuthorityCertificate(String name, Output<String> id, @Nullable CertificateAuthorityCertificateState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:acmpca/certificateAuthorityCertificate:CertificateAuthorityCertificate", name, state, makeResourceOptions(options, id));
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
    public static CertificateAuthorityCertificate get(String name, Output<String> id, @Nullable CertificateAuthorityCertificateState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new CertificateAuthorityCertificate(name, id, state, options);
    }
}

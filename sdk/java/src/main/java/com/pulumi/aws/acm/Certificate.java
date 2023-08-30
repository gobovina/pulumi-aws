// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.acm;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.acm.CertificateArgs;
import com.pulumi.aws.acm.inputs.CertificateState;
import com.pulumi.aws.acm.outputs.CertificateDomainValidationOption;
import com.pulumi.aws.acm.outputs.CertificateOptions;
import com.pulumi.aws.acm.outputs.CertificateRenewalSummary;
import com.pulumi.aws.acm.outputs.CertificateValidationOption;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * The ACM certificate resource allows requesting and management of certificates
 * from the Amazon Certificate Manager.
 * 
 * ACM certificates can be created in three ways:
 * Amazon-issued, where AWS provides the certificate authority and automatically manages renewal;
 * imported certificates, issued by another certificate authority;
 * and private certificates, issued using an ACM Private Certificate Authority.
 * 
 * ## Amazon-Issued Certificates
 * 
 * For Amazon-issued certificates, this resource deals with requesting certificates and managing their attributes and life-cycle.
 * This resource does not deal with validation of a certificate but can provide inputs
 * for other resources implementing the validation.
 * It does not wait for a certificate to be issued.
 * Use a `aws.acm.CertificateValidation` resource for this.
 * 
 * Most commonly, this resource is used together with `aws.route53.Record` and
 * `aws.acm.CertificateValidation` to request a DNS validated certificate,
 * deploy the required validation records and wait for validation to complete.
 * 
 * Domain validation through email is also supported but should be avoided as it requires a manual step outside of this provider.
 * 
 * ## Certificates Imported from Other Certificate Authority
 * 
 * Imported certificates can be used to make certificates created with an external certificate authority available for AWS services.
 * 
 * As they are not managed by AWS, imported certificates are not eligible for automatic renewal.
 * New certificate materials can be supplied to an existing imported certificate to update it in place.
 * 
 * ## Private Certificates
 * 
 * Private certificates are issued by an ACM Private Cerificate Authority, which can be created using the resource type `aws.acmpca.CertificateAuthority`.
 * 
 * Private certificates created using this resource are eligible for managed renewal if they have been exported or associated with another AWS service.
 * See [managed renewal documentation](https://docs.aws.amazon.com/acm/latest/userguide/managed-renewal.html) for more information.
 * By default, a certificate is valid for 395 days and the managed renewal process will start 60 days before expiration.
 * To renew the certificate earlier than 60 days before expiration, configure `early_renewal_duration`.
 * 
 * ## Example Usage
 * ### Create Certificate
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.acm.Certificate;
 * import com.pulumi.aws.acm.CertificateArgs;
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
 *         var cert = new Certificate(&#34;cert&#34;, CertificateArgs.builder()        
 *             .domainName(&#34;example.com&#34;)
 *             .tags(Map.of(&#34;Environment&#34;, &#34;test&#34;))
 *             .validationMethod(&#34;DNS&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Custom Domain Validation Options
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.acm.Certificate;
 * import com.pulumi.aws.acm.CertificateArgs;
 * import com.pulumi.aws.acm.inputs.CertificateValidationOptionArgs;
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
 *         var cert = new Certificate(&#34;cert&#34;, CertificateArgs.builder()        
 *             .domainName(&#34;testing.example.com&#34;)
 *             .validationMethod(&#34;EMAIL&#34;)
 *             .validationOptions(CertificateValidationOptionArgs.builder()
 *                 .domainName(&#34;testing.example.com&#34;)
 *                 .validationDomain(&#34;example.com&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Existing Certificate Body Import
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.tls.PrivateKey;
 * import com.pulumi.tls.PrivateKeyArgs;
 * import com.pulumi.tls.SelfSignedCert;
 * import com.pulumi.tls.SelfSignedCertArgs;
 * import com.pulumi.tls.inputs.SelfSignedCertSubjectArgs;
 * import com.pulumi.aws.acm.Certificate;
 * import com.pulumi.aws.acm.CertificateArgs;
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
 *         var examplePrivateKey = new PrivateKey(&#34;examplePrivateKey&#34;, PrivateKeyArgs.builder()        
 *             .algorithm(&#34;RSA&#34;)
 *             .build());
 * 
 *         var exampleSelfSignedCert = new SelfSignedCert(&#34;exampleSelfSignedCert&#34;, SelfSignedCertArgs.builder()        
 *             .keyAlgorithm(&#34;RSA&#34;)
 *             .privateKeyPem(examplePrivateKey.privateKeyPem())
 *             .subject(SelfSignedCertSubjectArgs.builder()
 *                 .commonName(&#34;example.com&#34;)
 *                 .organization(&#34;ACME Examples, Inc&#34;)
 *                 .build())
 *             .validityPeriodHours(12)
 *             .allowedUses(            
 *                 &#34;key_encipherment&#34;,
 *                 &#34;digital_signature&#34;,
 *                 &#34;server_auth&#34;)
 *             .build());
 * 
 *         var cert = new Certificate(&#34;cert&#34;, CertificateArgs.builder()        
 *             .privateKey(examplePrivateKey.privateKeyPem())
 *             .certificateBody(exampleSelfSignedCert.certPem())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import certificates using their ARN. For example:
 * 
 * ```sh
 *  $ pulumi import aws:acm/certificate:Certificate cert arn:aws:acm:eu-central-1:123456789012:certificate/7e7a28d2-163f-4b8f-b9cd-822f96c08d6a
 * ```
 * 
 */
@ResourceType(type="aws:acm/certificate:Certificate")
public class Certificate extends com.pulumi.resources.CustomResource {
    /**
     * ARN of the certificate
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return ARN of the certificate
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * ARN of an ACM PCA
     * 
     */
    @Export(name="certificateAuthorityArn", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> certificateAuthorityArn;

    /**
     * @return ARN of an ACM PCA
     * 
     */
    public Output<Optional<String>> certificateAuthorityArn() {
        return Codegen.optional(this.certificateAuthorityArn);
    }
    /**
     * Certificate&#39;s PEM-formatted public key
     * 
     */
    @Export(name="certificateBody", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> certificateBody;

    /**
     * @return Certificate&#39;s PEM-formatted public key
     * 
     */
    public Output<Optional<String>> certificateBody() {
        return Codegen.optional(this.certificateBody);
    }
    /**
     * Certificate&#39;s PEM-formatted chain
     * * Creating a private CA issued certificate
     * 
     */
    @Export(name="certificateChain", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> certificateChain;

    /**
     * @return Certificate&#39;s PEM-formatted chain
     * * Creating a private CA issued certificate
     * 
     */
    public Output<Optional<String>> certificateChain() {
        return Codegen.optional(this.certificateChain);
    }
    /**
     * Fully qualified domain name (FQDN) in the certificate.
     * 
     */
    @Export(name="domainName", refs={String.class}, tree="[0]")
    private Output<String> domainName;

    /**
     * @return Fully qualified domain name (FQDN) in the certificate.
     * 
     */
    public Output<String> domainName() {
        return this.domainName;
    }
    /**
     * Set of domain validation objects which can be used to complete certificate validation.
     * Can have more than one element, e.g., if SANs are defined.
     * Only set if `DNS`-validation was used.
     * 
     */
    @Export(name="domainValidationOptions", refs={List.class,CertificateDomainValidationOption.class}, tree="[0,1]")
    private Output<List<CertificateDomainValidationOption>> domainValidationOptions;

    /**
     * @return Set of domain validation objects which can be used to complete certificate validation.
     * Can have more than one element, e.g., if SANs are defined.
     * Only set if `DNS`-validation was used.
     * 
     */
    public Output<List<CertificateDomainValidationOption>> domainValidationOptions() {
        return this.domainValidationOptions;
    }
    /**
     * Amount of time to start automatic renewal process before expiration.
     * Has no effect if less than 60 days.
     * Represented by either
     * a subset of [RFC 3339 duration](https://www.rfc-editor.org/rfc/rfc3339) supporting years, months, and days (e.g., `P90D`),
     * or a string such as `2160h`.
     * 
     */
    @Export(name="earlyRenewalDuration", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> earlyRenewalDuration;

    /**
     * @return Amount of time to start automatic renewal process before expiration.
     * Has no effect if less than 60 days.
     * Represented by either
     * a subset of [RFC 3339 duration](https://www.rfc-editor.org/rfc/rfc3339) supporting years, months, and days (e.g., `P90D`),
     * or a string such as `2160h`.
     * 
     */
    public Output<Optional<String>> earlyRenewalDuration() {
        return Codegen.optional(this.earlyRenewalDuration);
    }
    /**
     * Specifies the algorithm of the public and private key pair that your Amazon issued certificate uses to encrypt data. See [ACM Certificate characteristics](https://docs.aws.amazon.com/acm/latest/userguide/acm-certificate.html#algorithms) for more details.
     * 
     */
    @Export(name="keyAlgorithm", refs={String.class}, tree="[0]")
    private Output<String> keyAlgorithm;

    /**
     * @return Specifies the algorithm of the public and private key pair that your Amazon issued certificate uses to encrypt data. See [ACM Certificate characteristics](https://docs.aws.amazon.com/acm/latest/userguide/acm-certificate.html#algorithms) for more details.
     * 
     */
    public Output<String> keyAlgorithm() {
        return this.keyAlgorithm;
    }
    /**
     * Expiration date and time of the certificate.
     * 
     */
    @Export(name="notAfter", refs={String.class}, tree="[0]")
    private Output<String> notAfter;

    /**
     * @return Expiration date and time of the certificate.
     * 
     */
    public Output<String> notAfter() {
        return this.notAfter;
    }
    /**
     * Start of the validity period of the certificate.
     * 
     */
    @Export(name="notBefore", refs={String.class}, tree="[0]")
    private Output<String> notBefore;

    /**
     * @return Start of the validity period of the certificate.
     * 
     */
    public Output<String> notBefore() {
        return this.notBefore;
    }
    /**
     * Configuration block used to set certificate options. Detailed below.
     * 
     */
    @Export(name="options", refs={CertificateOptions.class}, tree="[0]")
    private Output<CertificateOptions> options;

    /**
     * @return Configuration block used to set certificate options. Detailed below.
     * 
     */
    public Output<CertificateOptions> options() {
        return this.options;
    }
    /**
     * `true` if a Private certificate eligible for managed renewal is within the `early_renewal_duration` period.
     * 
     */
    @Export(name="pendingRenewal", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> pendingRenewal;

    /**
     * @return `true` if a Private certificate eligible for managed renewal is within the `early_renewal_duration` period.
     * 
     */
    public Output<Boolean> pendingRenewal() {
        return this.pendingRenewal;
    }
    /**
     * Certificate&#39;s PEM-formatted private key
     * 
     */
    @Export(name="privateKey", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> privateKey;

    /**
     * @return Certificate&#39;s PEM-formatted private key
     * 
     */
    public Output<Optional<String>> privateKey() {
        return Codegen.optional(this.privateKey);
    }
    /**
     * Whether the certificate is eligible for managed renewal.
     * 
     */
    @Export(name="renewalEligibility", refs={String.class}, tree="[0]")
    private Output<String> renewalEligibility;

    /**
     * @return Whether the certificate is eligible for managed renewal.
     * 
     */
    public Output<String> renewalEligibility() {
        return this.renewalEligibility;
    }
    /**
     * Contains information about the status of ACM&#39;s [managed renewal](https://docs.aws.amazon.com/acm/latest/userguide/acm-renewal.html) for the certificate.
     * 
     */
    @Export(name="renewalSummaries", refs={List.class,CertificateRenewalSummary.class}, tree="[0,1]")
    private Output<List<CertificateRenewalSummary>> renewalSummaries;

    /**
     * @return Contains information about the status of ACM&#39;s [managed renewal](https://docs.aws.amazon.com/acm/latest/userguide/acm-renewal.html) for the certificate.
     * 
     */
    public Output<List<CertificateRenewalSummary>> renewalSummaries() {
        return this.renewalSummaries;
    }
    /**
     * Status of the certificate.
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return Status of the certificate.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * Set of domains that should be SANs in the issued certificate.
     * To remove all elements of a previously configured list, set this value equal to an empty list (`[]`)
     * 
     */
    @Export(name="subjectAlternativeNames", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> subjectAlternativeNames;

    /**
     * @return Set of domains that should be SANs in the issued certificate.
     * To remove all elements of a previously configured list, set this value equal to an empty list (`[]`)
     * 
     */
    public Output<List<String>> subjectAlternativeNames() {
        return this.subjectAlternativeNames;
    }
    /**
     * Map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
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
     * Source of the certificate.
     * 
     */
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output<String> type;

    /**
     * @return Source of the certificate.
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * List of addresses that received a validation email. Only set if `EMAIL` validation was used.
     * 
     */
    @Export(name="validationEmails", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> validationEmails;

    /**
     * @return List of addresses that received a validation email. Only set if `EMAIL` validation was used.
     * 
     */
    public Output<List<String>> validationEmails() {
        return this.validationEmails;
    }
    /**
     * Which method to use for validation. `DNS` or `EMAIL` are valid. This parameter must not be set for certificates that were imported into ACM and then into Pulumi.
     * 
     */
    @Export(name="validationMethod", refs={String.class}, tree="[0]")
    private Output<String> validationMethod;

    /**
     * @return Which method to use for validation. `DNS` or `EMAIL` are valid. This parameter must not be set for certificates that were imported into ACM and then into Pulumi.
     * 
     */
    public Output<String> validationMethod() {
        return this.validationMethod;
    }
    /**
     * Configuration block used to specify information about the initial validation of each domain name. Detailed below.
     * * Importing an existing certificate
     * 
     */
    @Export(name="validationOptions", refs={List.class,CertificateValidationOption.class}, tree="[0,1]")
    private Output</* @Nullable */ List<CertificateValidationOption>> validationOptions;

    /**
     * @return Configuration block used to specify information about the initial validation of each domain name. Detailed below.
     * * Importing an existing certificate
     * 
     */
    public Output<Optional<List<CertificateValidationOption>>> validationOptions() {
        return Codegen.optional(this.validationOptions);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Certificate(String name) {
        this(name, CertificateArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Certificate(String name, @Nullable CertificateArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Certificate(String name, @Nullable CertificateArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:acm/certificate:Certificate", name, args == null ? CertificateArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Certificate(String name, Output<String> id, @Nullable CertificateState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:acm/certificate:Certificate", name, state, makeResourceOptions(options, id));
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
    public static Certificate get(String name, Output<String> id, @Nullable CertificateState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Certificate(name, id, state, options);
    }
}

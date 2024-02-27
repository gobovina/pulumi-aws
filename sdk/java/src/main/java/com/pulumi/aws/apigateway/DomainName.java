// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.apigateway;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.apigateway.DomainNameArgs;
import com.pulumi.aws.apigateway.inputs.DomainNameState;
import com.pulumi.aws.apigateway.outputs.DomainNameEndpointConfiguration;
import com.pulumi.aws.apigateway.outputs.DomainNameMutualTlsAuthentication;
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
 * Registers a custom domain name for use with AWS API Gateway. Additional information about this functionality
 * can be found in the [API Gateway Developer Guide](https://docs.aws.amazon.com/apigateway/latest/developerguide/how-to-custom-domains.html).
 * 
 * This resource just establishes ownership of and the TLS settings for
 * a particular domain name. An API can be attached to a particular path
 * under the registered domain name using
 * the `aws.apigateway.BasePathMapping` resource.
 * 
 * API Gateway domains can be defined as either &#39;edge-optimized&#39; or &#39;regional&#39;.  In an edge-optimized configuration,
 * API Gateway internally creates and manages a CloudFront distribution to route requests on the given hostname. In
 * addition to this resource it&#39;s necessary to create a DNS record corresponding to the given domain name which is an alias
 * (either Route53 alias or traditional CNAME) to the Cloudfront domain name exported in the `cloudfront_domain_name`
 * attribute.
 * 
 * In a regional configuration, API Gateway does not create a CloudFront distribution to route requests to the API, though
 * a distribution can be created if needed. In either case, it is necessary to create a DNS record corresponding to the
 * given domain name which is an alias (either Route53 alias or traditional CNAME) to the regional domain name exported in
 * the `regional_domain_name` attribute.
 * 
 * &gt; **Note:** API Gateway requires the use of AWS Certificate Manager (ACM) certificates instead of Identity and Access Management (IAM) certificates in regions that support ACM. Regions that support ACM can be found in the [Regions and Endpoints Documentation](https://docs.aws.amazon.com/general/latest/gr/rande.html#acm_region). To import an existing private key and certificate into ACM or request an ACM certificate, see the `aws.acm.Certificate` resource.
 * 
 * &gt; **Note:** The `aws.apigateway.DomainName` resource expects dependency on the `aws.acm.CertificateValidation` as
 * only verified certificates can be used. This can be made either explicitly by adding the
 * `depends_on = [aws_acm_certificate_validation.cert]` attribute. Or implicitly by referring certificate ARN
 * from the validation resource where it will be available after the resource creation:
 * `regional_certificate_arn = aws_acm_certificate_validation.cert.certificate_arn`.
 * 
 * ## Example Usage
 * ### Edge Optimized (ACM Certificate)
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.apigateway.DomainName;
 * import com.pulumi.aws.apigateway.DomainNameArgs;
 * import com.pulumi.aws.route53.Record;
 * import com.pulumi.aws.route53.RecordArgs;
 * import com.pulumi.aws.route53.inputs.RecordAliasArgs;
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
 *         var exampleDomainName = new DomainName(&#34;exampleDomainName&#34;, DomainNameArgs.builder()        
 *             .certificateArn(aws_acm_certificate_validation.example().certificate_arn())
 *             .domainName(&#34;api.example.com&#34;)
 *             .build());
 * 
 *         var exampleRecord = new Record(&#34;exampleRecord&#34;, RecordArgs.builder()        
 *             .name(exampleDomainName.domainName())
 *             .type(&#34;A&#34;)
 *             .zoneId(aws_route53_zone.example().id())
 *             .aliases(RecordAliasArgs.builder()
 *                 .evaluateTargetHealth(true)
 *                 .name(exampleDomainName.cloudfrontDomainName())
 *                 .zoneId(exampleDomainName.cloudfrontZoneId())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Edge Optimized (IAM Certificate)
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.apigateway.DomainName;
 * import com.pulumi.aws.apigateway.DomainNameArgs;
 * import com.pulumi.aws.route53.Record;
 * import com.pulumi.aws.route53.RecordArgs;
 * import com.pulumi.aws.route53.inputs.RecordAliasArgs;
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
 *         var exampleDomainName = new DomainName(&#34;exampleDomainName&#34;, DomainNameArgs.builder()        
 *             .domainName(&#34;api.example.com&#34;)
 *             .certificateName(&#34;example-api&#34;)
 *             .certificateBody(Files.readString(Paths.get(String.format(&#34;%s/example.com/example.crt&#34;, path.module()))))
 *             .certificateChain(Files.readString(Paths.get(String.format(&#34;%s/example.com/ca.crt&#34;, path.module()))))
 *             .certificatePrivateKey(Files.readString(Paths.get(String.format(&#34;%s/example.com/example.key&#34;, path.module()))))
 *             .build());
 * 
 *         var exampleRecord = new Record(&#34;exampleRecord&#34;, RecordArgs.builder()        
 *             .zoneId(aws_route53_zone.example().id())
 *             .name(exampleDomainName.domainName())
 *             .type(&#34;A&#34;)
 *             .aliases(RecordAliasArgs.builder()
 *                 .name(exampleDomainName.cloudfrontDomainName())
 *                 .zoneId(exampleDomainName.cloudfrontZoneId())
 *                 .evaluateTargetHealth(true)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Regional (ACM Certificate)
 * 
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.apigateway.DomainName;
 * import com.pulumi.aws.apigateway.DomainNameArgs;
 * import com.pulumi.aws.apigateway.inputs.DomainNameEndpointConfigurationArgs;
 * import com.pulumi.aws.route53.Record;
 * import com.pulumi.aws.route53.RecordArgs;
 * import com.pulumi.aws.route53.inputs.RecordAliasArgs;
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
 *         var exampleDomainName = new DomainName(&#34;exampleDomainName&#34;, DomainNameArgs.builder()        
 *             .domainName(&#34;api.example.com&#34;)
 *             .regionalCertificateArn(aws_acm_certificate_validation.example().certificate_arn())
 *             .endpointConfiguration(DomainNameEndpointConfigurationArgs.builder()
 *                 .types(&#34;REGIONAL&#34;)
 *                 .build())
 *             .build());
 * 
 *         var exampleRecord = new Record(&#34;exampleRecord&#34;, RecordArgs.builder()        
 *             .name(exampleDomainName.domainName())
 *             .type(&#34;A&#34;)
 *             .zoneId(aws_route53_zone.example().id())
 *             .aliases(RecordAliasArgs.builder()
 *                 .evaluateTargetHealth(true)
 *                 .name(exampleDomainName.regionalDomainName())
 *                 .zoneId(exampleDomainName.regionalZoneId())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Regional (IAM Certificate)
 * 
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.apigateway.DomainName;
 * import com.pulumi.aws.apigateway.DomainNameArgs;
 * import com.pulumi.aws.apigateway.inputs.DomainNameEndpointConfigurationArgs;
 * import com.pulumi.aws.route53.Record;
 * import com.pulumi.aws.route53.RecordArgs;
 * import com.pulumi.aws.route53.inputs.RecordAliasArgs;
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
 *         var exampleDomainName = new DomainName(&#34;exampleDomainName&#34;, DomainNameArgs.builder()        
 *             .certificateBody(Files.readString(Paths.get(String.format(&#34;%s/example.com/example.crt&#34;, path.module()))))
 *             .certificateChain(Files.readString(Paths.get(String.format(&#34;%s/example.com/ca.crt&#34;, path.module()))))
 *             .certificatePrivateKey(Files.readString(Paths.get(String.format(&#34;%s/example.com/example.key&#34;, path.module()))))
 *             .domainName(&#34;api.example.com&#34;)
 *             .regionalCertificateName(&#34;example-api&#34;)
 *             .endpointConfiguration(DomainNameEndpointConfigurationArgs.builder()
 *                 .types(&#34;REGIONAL&#34;)
 *                 .build())
 *             .build());
 * 
 *         var exampleRecord = new Record(&#34;exampleRecord&#34;, RecordArgs.builder()        
 *             .name(exampleDomainName.domainName())
 *             .type(&#34;A&#34;)
 *             .zoneId(aws_route53_zone.example().id())
 *             .aliases(RecordAliasArgs.builder()
 *                 .evaluateTargetHealth(true)
 *                 .name(exampleDomainName.regionalDomainName())
 *                 .zoneId(exampleDomainName.regionalZoneId())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import API Gateway domain names using their `name`. For example:
 * 
 * ```sh
 *  $ pulumi import aws:apigateway/domainName:DomainName example dev.example.com
 * ```
 * 
 */
@ResourceType(type="aws:apigateway/domainName:DomainName")
public class DomainName extends com.pulumi.resources.CustomResource {
    /**
     * ARN of domain name.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return ARN of domain name.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * ARN for an AWS-managed certificate. AWS Certificate Manager is the only supported source. Used when an edge-optimized domain name is desired. Conflicts with `certificate_name`, `certificate_body`, `certificate_chain`, `certificate_private_key`, `regional_certificate_arn`, and `regional_certificate_name`.
     * 
     */
    @Export(name="certificateArn", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> certificateArn;

    /**
     * @return ARN for an AWS-managed certificate. AWS Certificate Manager is the only supported source. Used when an edge-optimized domain name is desired. Conflicts with `certificate_name`, `certificate_body`, `certificate_chain`, `certificate_private_key`, `regional_certificate_arn`, and `regional_certificate_name`.
     * 
     */
    public Output<Optional<String>> certificateArn() {
        return Codegen.optional(this.certificateArn);
    }
    /**
     * Certificate issued for the domain name being registered, in PEM format. Only valid for `EDGE` endpoint configuration type. Conflicts with `certificate_arn`, `regional_certificate_arn`, and `regional_certificate_name`.
     * 
     */
    @Export(name="certificateBody", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> certificateBody;

    /**
     * @return Certificate issued for the domain name being registered, in PEM format. Only valid for `EDGE` endpoint configuration type. Conflicts with `certificate_arn`, `regional_certificate_arn`, and `regional_certificate_name`.
     * 
     */
    public Output<Optional<String>> certificateBody() {
        return Codegen.optional(this.certificateBody);
    }
    /**
     * Certificate for the CA that issued the certificate, along with any intermediate CA certificates required to create an unbroken chain to a certificate trusted by the intended API clients. Only valid for `EDGE` endpoint configuration type. Conflicts with `certificate_arn`, `regional_certificate_arn`, and `regional_certificate_name`.
     * 
     */
    @Export(name="certificateChain", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> certificateChain;

    /**
     * @return Certificate for the CA that issued the certificate, along with any intermediate CA certificates required to create an unbroken chain to a certificate trusted by the intended API clients. Only valid for `EDGE` endpoint configuration type. Conflicts with `certificate_arn`, `regional_certificate_arn`, and `regional_certificate_name`.
     * 
     */
    public Output<Optional<String>> certificateChain() {
        return Codegen.optional(this.certificateChain);
    }
    /**
     * Unique name to use when registering this certificate as an IAM server certificate. Conflicts with `certificate_arn`, `regional_certificate_arn`, and `regional_certificate_name`. Required if `certificate_arn` is not set.
     * 
     */
    @Export(name="certificateName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> certificateName;

    /**
     * @return Unique name to use when registering this certificate as an IAM server certificate. Conflicts with `certificate_arn`, `regional_certificate_arn`, and `regional_certificate_name`. Required if `certificate_arn` is not set.
     * 
     */
    public Output<Optional<String>> certificateName() {
        return Codegen.optional(this.certificateName);
    }
    /**
     * Private key associated with the domain certificate given in `certificate_body`. Only valid for `EDGE` endpoint configuration type. Conflicts with `certificate_arn`, `regional_certificate_arn`, and `regional_certificate_name`.
     * 
     */
    @Export(name="certificatePrivateKey", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> certificatePrivateKey;

    /**
     * @return Private key associated with the domain certificate given in `certificate_body`. Only valid for `EDGE` endpoint configuration type. Conflicts with `certificate_arn`, `regional_certificate_arn`, and `regional_certificate_name`.
     * 
     */
    public Output<Optional<String>> certificatePrivateKey() {
        return Codegen.optional(this.certificatePrivateKey);
    }
    /**
     * Upload date associated with the domain certificate.
     * 
     */
    @Export(name="certificateUploadDate", refs={String.class}, tree="[0]")
    private Output<String> certificateUploadDate;

    /**
     * @return Upload date associated with the domain certificate.
     * 
     */
    public Output<String> certificateUploadDate() {
        return this.certificateUploadDate;
    }
    /**
     * Hostname created by Cloudfront to represent the distribution that implements this domain name mapping.
     * 
     */
    @Export(name="cloudfrontDomainName", refs={String.class}, tree="[0]")
    private Output<String> cloudfrontDomainName;

    /**
     * @return Hostname created by Cloudfront to represent the distribution that implements this domain name mapping.
     * 
     */
    public Output<String> cloudfrontDomainName() {
        return this.cloudfrontDomainName;
    }
    /**
     * For convenience, the hosted zone ID (`Z2FDTNDATAQYW2`) that can be used to create a Route53 alias record for the distribution.
     * 
     */
    @Export(name="cloudfrontZoneId", refs={String.class}, tree="[0]")
    private Output<String> cloudfrontZoneId;

    /**
     * @return For convenience, the hosted zone ID (`Z2FDTNDATAQYW2`) that can be used to create a Route53 alias record for the distribution.
     * 
     */
    public Output<String> cloudfrontZoneId() {
        return this.cloudfrontZoneId;
    }
    /**
     * Fully-qualified domain name to register.
     * 
     */
    @Export(name="domainName", refs={String.class}, tree="[0]")
    private Output<String> domainName;

    /**
     * @return Fully-qualified domain name to register.
     * 
     */
    public Output<String> domainName() {
        return this.domainName;
    }
    /**
     * Configuration block defining API endpoint information including type. See below.
     * 
     */
    @Export(name="endpointConfiguration", refs={DomainNameEndpointConfiguration.class}, tree="[0]")
    private Output<DomainNameEndpointConfiguration> endpointConfiguration;

    /**
     * @return Configuration block defining API endpoint information including type. See below.
     * 
     */
    public Output<DomainNameEndpointConfiguration> endpointConfiguration() {
        return this.endpointConfiguration;
    }
    /**
     * Mutual TLS authentication configuration for the domain name. See below.
     * 
     */
    @Export(name="mutualTlsAuthentication", refs={DomainNameMutualTlsAuthentication.class}, tree="[0]")
    private Output</* @Nullable */ DomainNameMutualTlsAuthentication> mutualTlsAuthentication;

    /**
     * @return Mutual TLS authentication configuration for the domain name. See below.
     * 
     */
    public Output<Optional<DomainNameMutualTlsAuthentication>> mutualTlsAuthentication() {
        return Codegen.optional(this.mutualTlsAuthentication);
    }
    /**
     * ARN of the AWS-issued certificate used to validate custom domain ownership (when `certificate_arn` is issued via an ACM Private CA or `mutual_tls_authentication` is configured with an ACM-imported certificate.)
     * 
     */
    @Export(name="ownershipVerificationCertificateArn", refs={String.class}, tree="[0]")
    private Output<String> ownershipVerificationCertificateArn;

    /**
     * @return ARN of the AWS-issued certificate used to validate custom domain ownership (when `certificate_arn` is issued via an ACM Private CA or `mutual_tls_authentication` is configured with an ACM-imported certificate.)
     * 
     */
    public Output<String> ownershipVerificationCertificateArn() {
        return this.ownershipVerificationCertificateArn;
    }
    /**
     * ARN for an AWS-managed certificate. AWS Certificate Manager is the only supported source. Used when a regional domain name is desired. Conflicts with `certificate_arn`, `certificate_name`, `certificate_body`, `certificate_chain`, and `certificate_private_key`.
     * 
     * When uploading a certificate, the following arguments are supported:
     * 
     */
    @Export(name="regionalCertificateArn", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> regionalCertificateArn;

    /**
     * @return ARN for an AWS-managed certificate. AWS Certificate Manager is the only supported source. Used when a regional domain name is desired. Conflicts with `certificate_arn`, `certificate_name`, `certificate_body`, `certificate_chain`, and `certificate_private_key`.
     * 
     * When uploading a certificate, the following arguments are supported:
     * 
     */
    public Output<Optional<String>> regionalCertificateArn() {
        return Codegen.optional(this.regionalCertificateArn);
    }
    /**
     * User-friendly name of the certificate that will be used by regional endpoint for this domain name. Conflicts with `certificate_arn`, `certificate_name`, `certificate_body`, `certificate_chain`, and `certificate_private_key`.
     * 
     */
    @Export(name="regionalCertificateName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> regionalCertificateName;

    /**
     * @return User-friendly name of the certificate that will be used by regional endpoint for this domain name. Conflicts with `certificate_arn`, `certificate_name`, `certificate_body`, `certificate_chain`, and `certificate_private_key`.
     * 
     */
    public Output<Optional<String>> regionalCertificateName() {
        return Codegen.optional(this.regionalCertificateName);
    }
    /**
     * Hostname for the custom domain&#39;s regional endpoint.
     * 
     */
    @Export(name="regionalDomainName", refs={String.class}, tree="[0]")
    private Output<String> regionalDomainName;

    /**
     * @return Hostname for the custom domain&#39;s regional endpoint.
     * 
     */
    public Output<String> regionalDomainName() {
        return this.regionalDomainName;
    }
    /**
     * Hosted zone ID that can be used to create a Route53 alias record for the regional endpoint.
     * 
     */
    @Export(name="regionalZoneId", refs={String.class}, tree="[0]")
    private Output<String> regionalZoneId;

    /**
     * @return Hosted zone ID that can be used to create a Route53 alias record for the regional endpoint.
     * 
     */
    public Output<String> regionalZoneId() {
        return this.regionalZoneId;
    }
    /**
     * Transport Layer Security (TLS) version + cipher suite for this DomainName. Valid values are `TLS_1_0` and `TLS_1_2`. Must be configured to perform drift detection.
     * 
     */
    @Export(name="securityPolicy", refs={String.class}, tree="[0]")
    private Output<String> securityPolicy;

    /**
     * @return Transport Layer Security (TLS) version + cipher suite for this DomainName. Valid values are `TLS_1_0` and `TLS_1_2`. Must be configured to perform drift detection.
     * 
     */
    public Output<String> securityPolicy() {
        return this.securityPolicy;
    }
    /**
     * Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     * When referencing an AWS-managed certificate, the following arguments are supported:
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     * When referencing an AWS-managed certificate, the following arguments are supported:
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
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DomainName(String name) {
        this(name, DomainNameArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DomainName(String name, DomainNameArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DomainName(String name, DomainNameArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:apigateway/domainName:DomainName", name, args == null ? DomainNameArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DomainName(String name, Output<String> id, @Nullable DomainNameState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:apigateway/domainName:DomainName", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "certificatePrivateKey"
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
    public static DomainName get(String name, Output<String> id, @Nullable DomainNameState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DomainName(name, id, state, options);
    }
}

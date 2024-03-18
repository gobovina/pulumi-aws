// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ecs.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class ServiceServiceConnectConfigurationServiceTlsIssuerCertAuthorityArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceServiceConnectConfigurationServiceTlsIssuerCertAuthorityArgs Empty = new ServiceServiceConnectConfigurationServiceTlsIssuerCertAuthorityArgs();

    /**
     * The ARN of the `aws.acmpca.CertificateAuthority` used to create the TLS Certificates.
     * 
     */
    @Import(name="awsPcaAuthorityArn", required=true)
    private Output<String> awsPcaAuthorityArn;

    /**
     * @return The ARN of the `aws.acmpca.CertificateAuthority` used to create the TLS Certificates.
     * 
     */
    public Output<String> awsPcaAuthorityArn() {
        return this.awsPcaAuthorityArn;
    }

    private ServiceServiceConnectConfigurationServiceTlsIssuerCertAuthorityArgs() {}

    private ServiceServiceConnectConfigurationServiceTlsIssuerCertAuthorityArgs(ServiceServiceConnectConfigurationServiceTlsIssuerCertAuthorityArgs $) {
        this.awsPcaAuthorityArn = $.awsPcaAuthorityArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceServiceConnectConfigurationServiceTlsIssuerCertAuthorityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceServiceConnectConfigurationServiceTlsIssuerCertAuthorityArgs $;

        public Builder() {
            $ = new ServiceServiceConnectConfigurationServiceTlsIssuerCertAuthorityArgs();
        }

        public Builder(ServiceServiceConnectConfigurationServiceTlsIssuerCertAuthorityArgs defaults) {
            $ = new ServiceServiceConnectConfigurationServiceTlsIssuerCertAuthorityArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param awsPcaAuthorityArn The ARN of the `aws.acmpca.CertificateAuthority` used to create the TLS Certificates.
         * 
         * @return builder
         * 
         */
        public Builder awsPcaAuthorityArn(Output<String> awsPcaAuthorityArn) {
            $.awsPcaAuthorityArn = awsPcaAuthorityArn;
            return this;
        }

        /**
         * @param awsPcaAuthorityArn The ARN of the `aws.acmpca.CertificateAuthority` used to create the TLS Certificates.
         * 
         * @return builder
         * 
         */
        public Builder awsPcaAuthorityArn(String awsPcaAuthorityArn) {
            return awsPcaAuthorityArn(Output.of(awsPcaAuthorityArn));
        }

        public ServiceServiceConnectConfigurationServiceTlsIssuerCertAuthorityArgs build() {
            if ($.awsPcaAuthorityArn == null) {
                throw new MissingRequiredPropertyException("ServiceServiceConnectConfigurationServiceTlsIssuerCertAuthorityArgs", "awsPcaAuthorityArn");
            }
            return $;
        }
    }

}

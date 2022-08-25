// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.outputs;

import com.pulumi.aws.appmesh.outputs.VirtualGatewaySpecListenerTlsCertificateAcm;
import com.pulumi.aws.appmesh.outputs.VirtualGatewaySpecListenerTlsCertificateFile;
import com.pulumi.aws.appmesh.outputs.VirtualGatewaySpecListenerTlsCertificateSds;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VirtualGatewaySpecListenerTlsCertificate {
    /**
     * @return An AWS Certificate Manager (ACM) certificate.
     * 
     */
    private @Nullable VirtualGatewaySpecListenerTlsCertificateAcm acm;
    /**
     * @return A local file certificate.
     * 
     */
    private @Nullable VirtualGatewaySpecListenerTlsCertificateFile file;
    /**
     * @return A [Secret Discovery Service](https://www.envoyproxy.io/docs/envoy/latest/configuration/security/secret#secret-discovery-service-sds) certificate.
     * 
     */
    private @Nullable VirtualGatewaySpecListenerTlsCertificateSds sds;

    private VirtualGatewaySpecListenerTlsCertificate() {}
    /**
     * @return An AWS Certificate Manager (ACM) certificate.
     * 
     */
    public Optional<VirtualGatewaySpecListenerTlsCertificateAcm> acm() {
        return Optional.ofNullable(this.acm);
    }
    /**
     * @return A local file certificate.
     * 
     */
    public Optional<VirtualGatewaySpecListenerTlsCertificateFile> file() {
        return Optional.ofNullable(this.file);
    }
    /**
     * @return A [Secret Discovery Service](https://www.envoyproxy.io/docs/envoy/latest/configuration/security/secret#secret-discovery-service-sds) certificate.
     * 
     */
    public Optional<VirtualGatewaySpecListenerTlsCertificateSds> sds() {
        return Optional.ofNullable(this.sds);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualGatewaySpecListenerTlsCertificate defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable VirtualGatewaySpecListenerTlsCertificateAcm acm;
        private @Nullable VirtualGatewaySpecListenerTlsCertificateFile file;
        private @Nullable VirtualGatewaySpecListenerTlsCertificateSds sds;
        public Builder() {}
        public Builder(VirtualGatewaySpecListenerTlsCertificate defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acm = defaults.acm;
    	      this.file = defaults.file;
    	      this.sds = defaults.sds;
        }

        @CustomType.Setter
        public Builder acm(@Nullable VirtualGatewaySpecListenerTlsCertificateAcm acm) {
            this.acm = acm;
            return this;
        }
        @CustomType.Setter
        public Builder file(@Nullable VirtualGatewaySpecListenerTlsCertificateFile file) {
            this.file = file;
            return this;
        }
        @CustomType.Setter
        public Builder sds(@Nullable VirtualGatewaySpecListenerTlsCertificateSds sds) {
            this.sds = sds;
            return this;
        }
        public VirtualGatewaySpecListenerTlsCertificate build() {
            final var o = new VirtualGatewaySpecListenerTlsCertificate();
            o.acm = acm;
            o.file = file;
            o.sds = sds;
            return o;
        }
    }
}

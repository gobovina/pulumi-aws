// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.outputs;

import com.pulumi.aws.appmesh.outputs.VirtualNodeSpecListenerTlsCertificateAcm;
import com.pulumi.aws.appmesh.outputs.VirtualNodeSpecListenerTlsCertificateFile;
import com.pulumi.aws.appmesh.outputs.VirtualNodeSpecListenerTlsCertificateSds;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VirtualNodeSpecListenerTlsCertificate {
    /**
     * @return An AWS Certificate Manager (ACM) certificate.
     * 
     */
    private @Nullable VirtualNodeSpecListenerTlsCertificateAcm acm;
    /**
     * @return A local file certificate.
     * 
     */
    private @Nullable VirtualNodeSpecListenerTlsCertificateFile file;
    /**
     * @return A [Secret Discovery Service](https://www.envoyproxy.io/docs/envoy/latest/configuration/security/secret#secret-discovery-service-sds) certificate.
     * 
     */
    private @Nullable VirtualNodeSpecListenerTlsCertificateSds sds;

    private VirtualNodeSpecListenerTlsCertificate() {}
    /**
     * @return An AWS Certificate Manager (ACM) certificate.
     * 
     */
    public Optional<VirtualNodeSpecListenerTlsCertificateAcm> acm() {
        return Optional.ofNullable(this.acm);
    }
    /**
     * @return A local file certificate.
     * 
     */
    public Optional<VirtualNodeSpecListenerTlsCertificateFile> file() {
        return Optional.ofNullable(this.file);
    }
    /**
     * @return A [Secret Discovery Service](https://www.envoyproxy.io/docs/envoy/latest/configuration/security/secret#secret-discovery-service-sds) certificate.
     * 
     */
    public Optional<VirtualNodeSpecListenerTlsCertificateSds> sds() {
        return Optional.ofNullable(this.sds);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNodeSpecListenerTlsCertificate defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable VirtualNodeSpecListenerTlsCertificateAcm acm;
        private @Nullable VirtualNodeSpecListenerTlsCertificateFile file;
        private @Nullable VirtualNodeSpecListenerTlsCertificateSds sds;
        public Builder() {}
        public Builder(VirtualNodeSpecListenerTlsCertificate defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acm = defaults.acm;
    	      this.file = defaults.file;
    	      this.sds = defaults.sds;
        }

        @CustomType.Setter
        public Builder acm(@Nullable VirtualNodeSpecListenerTlsCertificateAcm acm) {
            this.acm = acm;
            return this;
        }
        @CustomType.Setter
        public Builder file(@Nullable VirtualNodeSpecListenerTlsCertificateFile file) {
            this.file = file;
            return this;
        }
        @CustomType.Setter
        public Builder sds(@Nullable VirtualNodeSpecListenerTlsCertificateSds sds) {
            this.sds = sds;
            return this;
        }
        public VirtualNodeSpecListenerTlsCertificate build() {
            final var o = new VirtualNodeSpecListenerTlsCertificate();
            o.acm = acm;
            o.file = file;
            o.sds = sds;
            return o;
        }
    }
}

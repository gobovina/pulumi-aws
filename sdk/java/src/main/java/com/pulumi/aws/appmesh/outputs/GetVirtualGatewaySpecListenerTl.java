// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.outputs;

import com.pulumi.aws.appmesh.outputs.GetVirtualGatewaySpecListenerTlCertificate;
import com.pulumi.aws.appmesh.outputs.GetVirtualGatewaySpecListenerTlValidation;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetVirtualGatewaySpecListenerTl {
    private List<GetVirtualGatewaySpecListenerTlCertificate> certificates;
    private String mode;
    private List<GetVirtualGatewaySpecListenerTlValidation> validations;

    private GetVirtualGatewaySpecListenerTl() {}
    public List<GetVirtualGatewaySpecListenerTlCertificate> certificates() {
        return this.certificates;
    }
    public String mode() {
        return this.mode;
    }
    public List<GetVirtualGatewaySpecListenerTlValidation> validations() {
        return this.validations;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVirtualGatewaySpecListenerTl defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetVirtualGatewaySpecListenerTlCertificate> certificates;
        private String mode;
        private List<GetVirtualGatewaySpecListenerTlValidation> validations;
        public Builder() {}
        public Builder(GetVirtualGatewaySpecListenerTl defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificates = defaults.certificates;
    	      this.mode = defaults.mode;
    	      this.validations = defaults.validations;
        }

        @CustomType.Setter
        public Builder certificates(List<GetVirtualGatewaySpecListenerTlCertificate> certificates) {
            this.certificates = Objects.requireNonNull(certificates);
            return this;
        }
        public Builder certificates(GetVirtualGatewaySpecListenerTlCertificate... certificates) {
            return certificates(List.of(certificates));
        }
        @CustomType.Setter
        public Builder mode(String mode) {
            this.mode = Objects.requireNonNull(mode);
            return this;
        }
        @CustomType.Setter
        public Builder validations(List<GetVirtualGatewaySpecListenerTlValidation> validations) {
            this.validations = Objects.requireNonNull(validations);
            return this;
        }
        public Builder validations(GetVirtualGatewaySpecListenerTlValidation... validations) {
            return validations(List.of(validations));
        }
        public GetVirtualGatewaySpecListenerTl build() {
            final var o = new GetVirtualGatewaySpecListenerTl();
            o.certificates = certificates;
            o.mode = mode;
            o.validations = validations;
            return o;
        }
    }
}

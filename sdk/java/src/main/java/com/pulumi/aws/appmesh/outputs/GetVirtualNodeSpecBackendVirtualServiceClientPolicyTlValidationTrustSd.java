// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetVirtualNodeSpecBackendVirtualServiceClientPolicyTlValidationTrustSd {
    private String secretName;

    private GetVirtualNodeSpecBackendVirtualServiceClientPolicyTlValidationTrustSd() {}
    public String secretName() {
        return this.secretName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVirtualNodeSpecBackendVirtualServiceClientPolicyTlValidationTrustSd defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String secretName;
        public Builder() {}
        public Builder(GetVirtualNodeSpecBackendVirtualServiceClientPolicyTlValidationTrustSd defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.secretName = defaults.secretName;
        }

        @CustomType.Setter
        public Builder secretName(String secretName) {
            this.secretName = Objects.requireNonNull(secretName);
            return this;
        }
        public GetVirtualNodeSpecBackendVirtualServiceClientPolicyTlValidationTrustSd build() {
            final var o = new GetVirtualNodeSpecBackendVirtualServiceClientPolicyTlValidationTrustSd();
            o.secretName = secretName;
            return o;
        }
    }
}

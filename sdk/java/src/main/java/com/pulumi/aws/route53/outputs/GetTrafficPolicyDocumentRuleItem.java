// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.route53.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetTrafficPolicyDocumentRuleItem {
    /**
     * @return References to an endpoint.
     * 
     */
    private @Nullable String endpointReference;
    /**
     * @return If you want to associate a health check with the endpoint or rule.
     * 
     */
    private @Nullable String healthCheck;

    private GetTrafficPolicyDocumentRuleItem() {}
    /**
     * @return References to an endpoint.
     * 
     */
    public Optional<String> endpointReference() {
        return Optional.ofNullable(this.endpointReference);
    }
    /**
     * @return If you want to associate a health check with the endpoint or rule.
     * 
     */
    public Optional<String> healthCheck() {
        return Optional.ofNullable(this.healthCheck);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTrafficPolicyDocumentRuleItem defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String endpointReference;
        private @Nullable String healthCheck;
        public Builder() {}
        public Builder(GetTrafficPolicyDocumentRuleItem defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpointReference = defaults.endpointReference;
    	      this.healthCheck = defaults.healthCheck;
        }

        @CustomType.Setter
        public Builder endpointReference(@Nullable String endpointReference) {
            this.endpointReference = endpointReference;
            return this;
        }
        @CustomType.Setter
        public Builder healthCheck(@Nullable String healthCheck) {
            this.healthCheck = healthCheck;
            return this;
        }
        public GetTrafficPolicyDocumentRuleItem build() {
            final var o = new GetTrafficPolicyDocumentRuleItem();
            o.endpointReference = endpointReference;
            o.healthCheck = healthCheck;
            return o;
        }
    }
}

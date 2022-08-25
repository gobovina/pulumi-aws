// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationSubjectAlternativeNamesMatch {
    /**
     * @return The values sent must match the specified values exactly.
     * 
     */
    private List<String> exacts;

    private VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationSubjectAlternativeNamesMatch() {}
    /**
     * @return The values sent must match the specified values exactly.
     * 
     */
    public List<String> exacts() {
        return this.exacts;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationSubjectAlternativeNamesMatch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> exacts;
        public Builder() {}
        public Builder(VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationSubjectAlternativeNamesMatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.exacts = defaults.exacts;
        }

        @CustomType.Setter
        public Builder exacts(List<String> exacts) {
            this.exacts = Objects.requireNonNull(exacts);
            return this;
        }
        public Builder exacts(String... exacts) {
            return exacts(List.of(exacts));
        }
        public VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationSubjectAlternativeNamesMatch build() {
            final var o = new VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationSubjectAlternativeNamesMatch();
            o.exacts = exacts;
            return o;
        }
    }
}

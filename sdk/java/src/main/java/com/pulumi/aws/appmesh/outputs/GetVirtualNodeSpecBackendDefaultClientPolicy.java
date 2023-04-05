// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.outputs;

import com.pulumi.aws.appmesh.outputs.GetVirtualNodeSpecBackendDefaultClientPolicyTl;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetVirtualNodeSpecBackendDefaultClientPolicy {
    private List<GetVirtualNodeSpecBackendDefaultClientPolicyTl> tls;

    private GetVirtualNodeSpecBackendDefaultClientPolicy() {}
    public List<GetVirtualNodeSpecBackendDefaultClientPolicyTl> tls() {
        return this.tls;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVirtualNodeSpecBackendDefaultClientPolicy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetVirtualNodeSpecBackendDefaultClientPolicyTl> tls;
        public Builder() {}
        public Builder(GetVirtualNodeSpecBackendDefaultClientPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.tls = defaults.tls;
        }

        @CustomType.Setter
        public Builder tls(List<GetVirtualNodeSpecBackendDefaultClientPolicyTl> tls) {
            this.tls = Objects.requireNonNull(tls);
            return this;
        }
        public Builder tls(GetVirtualNodeSpecBackendDefaultClientPolicyTl... tls) {
            return tls(List.of(tls));
        }
        public GetVirtualNodeSpecBackendDefaultClientPolicy build() {
            final var o = new GetVirtualNodeSpecBackendDefaultClientPolicy();
            o.tls = tls;
            return o;
        }
    }
}

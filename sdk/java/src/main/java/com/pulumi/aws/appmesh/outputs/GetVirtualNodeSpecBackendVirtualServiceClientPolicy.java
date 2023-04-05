// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.outputs;

import com.pulumi.aws.appmesh.outputs.GetVirtualNodeSpecBackendVirtualServiceClientPolicyTl;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetVirtualNodeSpecBackendVirtualServiceClientPolicy {
    private List<GetVirtualNodeSpecBackendVirtualServiceClientPolicyTl> tls;

    private GetVirtualNodeSpecBackendVirtualServiceClientPolicy() {}
    public List<GetVirtualNodeSpecBackendVirtualServiceClientPolicyTl> tls() {
        return this.tls;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVirtualNodeSpecBackendVirtualServiceClientPolicy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetVirtualNodeSpecBackendVirtualServiceClientPolicyTl> tls;
        public Builder() {}
        public Builder(GetVirtualNodeSpecBackendVirtualServiceClientPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.tls = defaults.tls;
        }

        @CustomType.Setter
        public Builder tls(List<GetVirtualNodeSpecBackendVirtualServiceClientPolicyTl> tls) {
            this.tls = Objects.requireNonNull(tls);
            return this;
        }
        public Builder tls(GetVirtualNodeSpecBackendVirtualServiceClientPolicyTl... tls) {
            return tls(List.of(tls));
        }
        public GetVirtualNodeSpecBackendVirtualServiceClientPolicy build() {
            final var o = new GetVirtualNodeSpecBackendVirtualServiceClientPolicy();
            o.tls = tls;
            return o;
        }
    }
}

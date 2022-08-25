// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.outputs;

import com.pulumi.aws.appmesh.outputs.GetVirtualServiceSpecProvider;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetVirtualServiceSpec {
    /**
     * @return The App Mesh object that is acting as the provider for a virtual service.
     * 
     */
    private List<GetVirtualServiceSpecProvider> providers;

    private GetVirtualServiceSpec() {}
    /**
     * @return The App Mesh object that is acting as the provider for a virtual service.
     * 
     */
    public List<GetVirtualServiceSpecProvider> providers() {
        return this.providers;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVirtualServiceSpec defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetVirtualServiceSpecProvider> providers;
        public Builder() {}
        public Builder(GetVirtualServiceSpec defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.providers = defaults.providers;
        }

        @CustomType.Setter
        public Builder providers(List<GetVirtualServiceSpecProvider> providers) {
            this.providers = Objects.requireNonNull(providers);
            return this;
        }
        public Builder providers(GetVirtualServiceSpecProvider... providers) {
            return providers(List.of(providers));
        }
        public GetVirtualServiceSpec build() {
            final var o = new GetVirtualServiceSpec();
            o.providers = providers;
            return o;
        }
    }
}

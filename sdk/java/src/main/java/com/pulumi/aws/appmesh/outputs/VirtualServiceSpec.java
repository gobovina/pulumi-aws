// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.outputs;

import com.pulumi.aws.appmesh.outputs.VirtualServiceSpecProvider;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VirtualServiceSpec {
    /**
     * @return The App Mesh object that is acting as the provider for a virtual service. You can specify a single virtual node or virtual router.
     * 
     */
    private @Nullable VirtualServiceSpecProvider provider;

    private VirtualServiceSpec() {}
    /**
     * @return The App Mesh object that is acting as the provider for a virtual service. You can specify a single virtual node or virtual router.
     * 
     */
    public Optional<VirtualServiceSpecProvider> provider() {
        return Optional.ofNullable(this.provider);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualServiceSpec defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable VirtualServiceSpecProvider provider;
        public Builder() {}
        public Builder(VirtualServiceSpec defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.provider = defaults.provider;
        }

        @CustomType.Setter
        public Builder provider(@Nullable VirtualServiceSpecProvider provider) {
            this.provider = provider;
            return this;
        }
        public VirtualServiceSpec build() {
            final var o = new VirtualServiceSpec();
            o.provider = provider;
            return o;
        }
    }
}

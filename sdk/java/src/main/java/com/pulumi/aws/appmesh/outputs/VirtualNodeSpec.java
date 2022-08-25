// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.outputs;

import com.pulumi.aws.appmesh.outputs.VirtualNodeSpecBackend;
import com.pulumi.aws.appmesh.outputs.VirtualNodeSpecBackendDefaults;
import com.pulumi.aws.appmesh.outputs.VirtualNodeSpecListener;
import com.pulumi.aws.appmesh.outputs.VirtualNodeSpecLogging;
import com.pulumi.aws.appmesh.outputs.VirtualNodeSpecServiceDiscovery;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VirtualNodeSpec {
    /**
     * @return The defaults for backends.
     * 
     */
    private @Nullable VirtualNodeSpecBackendDefaults backendDefaults;
    /**
     * @return The backends to which the virtual node is expected to send outbound traffic.
     * 
     */
    private @Nullable List<VirtualNodeSpecBackend> backends;
    /**
     * @return The listeners from which the virtual node is expected to receive inbound traffic.
     * 
     */
    private @Nullable VirtualNodeSpecListener listener;
    /**
     * @return The inbound and outbound access logging information for the virtual node.
     * 
     */
    private @Nullable VirtualNodeSpecLogging logging;
    /**
     * @return The service discovery information for the virtual node.
     * 
     */
    private @Nullable VirtualNodeSpecServiceDiscovery serviceDiscovery;

    private VirtualNodeSpec() {}
    /**
     * @return The defaults for backends.
     * 
     */
    public Optional<VirtualNodeSpecBackendDefaults> backendDefaults() {
        return Optional.ofNullable(this.backendDefaults);
    }
    /**
     * @return The backends to which the virtual node is expected to send outbound traffic.
     * 
     */
    public List<VirtualNodeSpecBackend> backends() {
        return this.backends == null ? List.of() : this.backends;
    }
    /**
     * @return The listeners from which the virtual node is expected to receive inbound traffic.
     * 
     */
    public Optional<VirtualNodeSpecListener> listener() {
        return Optional.ofNullable(this.listener);
    }
    /**
     * @return The inbound and outbound access logging information for the virtual node.
     * 
     */
    public Optional<VirtualNodeSpecLogging> logging() {
        return Optional.ofNullable(this.logging);
    }
    /**
     * @return The service discovery information for the virtual node.
     * 
     */
    public Optional<VirtualNodeSpecServiceDiscovery> serviceDiscovery() {
        return Optional.ofNullable(this.serviceDiscovery);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNodeSpec defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable VirtualNodeSpecBackendDefaults backendDefaults;
        private @Nullable List<VirtualNodeSpecBackend> backends;
        private @Nullable VirtualNodeSpecListener listener;
        private @Nullable VirtualNodeSpecLogging logging;
        private @Nullable VirtualNodeSpecServiceDiscovery serviceDiscovery;
        public Builder() {}
        public Builder(VirtualNodeSpec defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backendDefaults = defaults.backendDefaults;
    	      this.backends = defaults.backends;
    	      this.listener = defaults.listener;
    	      this.logging = defaults.logging;
    	      this.serviceDiscovery = defaults.serviceDiscovery;
        }

        @CustomType.Setter
        public Builder backendDefaults(@Nullable VirtualNodeSpecBackendDefaults backendDefaults) {
            this.backendDefaults = backendDefaults;
            return this;
        }
        @CustomType.Setter
        public Builder backends(@Nullable List<VirtualNodeSpecBackend> backends) {
            this.backends = backends;
            return this;
        }
        public Builder backends(VirtualNodeSpecBackend... backends) {
            return backends(List.of(backends));
        }
        @CustomType.Setter
        public Builder listener(@Nullable VirtualNodeSpecListener listener) {
            this.listener = listener;
            return this;
        }
        @CustomType.Setter
        public Builder logging(@Nullable VirtualNodeSpecLogging logging) {
            this.logging = logging;
            return this;
        }
        @CustomType.Setter
        public Builder serviceDiscovery(@Nullable VirtualNodeSpecServiceDiscovery serviceDiscovery) {
            this.serviceDiscovery = serviceDiscovery;
            return this;
        }
        public VirtualNodeSpec build() {
            final var o = new VirtualNodeSpec();
            o.backendDefaults = backendDefaults;
            o.backends = backends;
            o.listener = listener;
            o.logging = logging;
            o.serviceDiscovery = serviceDiscovery;
            return o;
        }
    }
}

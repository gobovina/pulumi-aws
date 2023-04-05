// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.outputs;

import com.pulumi.aws.appmesh.outputs.GatewayRouteSpecGrpcRouteActionTargetVirtualService;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GatewayRouteSpecGrpcRouteActionTarget {
    /**
     * @return The port number that corresponds to the target for Virtual Service provider port. This is required when the provider (router or node) of the Virtual Service has multiple listeners.
     * 
     */
    private @Nullable Integer port;
    /**
     * @return Virtual service gateway route target.
     * 
     */
    private GatewayRouteSpecGrpcRouteActionTargetVirtualService virtualService;

    private GatewayRouteSpecGrpcRouteActionTarget() {}
    /**
     * @return The port number that corresponds to the target for Virtual Service provider port. This is required when the provider (router or node) of the Virtual Service has multiple listeners.
     * 
     */
    public Optional<Integer> port() {
        return Optional.ofNullable(this.port);
    }
    /**
     * @return Virtual service gateway route target.
     * 
     */
    public GatewayRouteSpecGrpcRouteActionTargetVirtualService virtualService() {
        return this.virtualService;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GatewayRouteSpecGrpcRouteActionTarget defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer port;
        private GatewayRouteSpecGrpcRouteActionTargetVirtualService virtualService;
        public Builder() {}
        public Builder(GatewayRouteSpecGrpcRouteActionTarget defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.port = defaults.port;
    	      this.virtualService = defaults.virtualService;
        }

        @CustomType.Setter
        public Builder port(@Nullable Integer port) {
            this.port = port;
            return this;
        }
        @CustomType.Setter
        public Builder virtualService(GatewayRouteSpecGrpcRouteActionTargetVirtualService virtualService) {
            this.virtualService = Objects.requireNonNull(virtualService);
            return this;
        }
        public GatewayRouteSpecGrpcRouteActionTarget build() {
            final var o = new GatewayRouteSpecGrpcRouteActionTarget();
            o.port = port;
            o.virtualService = virtualService;
            return o;
        }
    }
}

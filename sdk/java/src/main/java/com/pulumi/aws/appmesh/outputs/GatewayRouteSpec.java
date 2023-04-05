// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.outputs;

import com.pulumi.aws.appmesh.outputs.GatewayRouteSpecGrpcRoute;
import com.pulumi.aws.appmesh.outputs.GatewayRouteSpecHttp2Route;
import com.pulumi.aws.appmesh.outputs.GatewayRouteSpecHttpRoute;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GatewayRouteSpec {
    /**
     * @return Specification of a gRPC gateway route.
     * 
     */
    private @Nullable GatewayRouteSpecGrpcRoute grpcRoute;
    /**
     * @return Specification of an HTTP/2 gateway route.
     * 
     */
    private @Nullable GatewayRouteSpecHttp2Route http2Route;
    /**
     * @return Specification of an HTTP gateway route.
     * 
     */
    private @Nullable GatewayRouteSpecHttpRoute httpRoute;
    /**
     * @return Priority for the gateway route, between `0` and `1000`.
     * 
     */
    private @Nullable Integer priority;

    private GatewayRouteSpec() {}
    /**
     * @return Specification of a gRPC gateway route.
     * 
     */
    public Optional<GatewayRouteSpecGrpcRoute> grpcRoute() {
        return Optional.ofNullable(this.grpcRoute);
    }
    /**
     * @return Specification of an HTTP/2 gateway route.
     * 
     */
    public Optional<GatewayRouteSpecHttp2Route> http2Route() {
        return Optional.ofNullable(this.http2Route);
    }
    /**
     * @return Specification of an HTTP gateway route.
     * 
     */
    public Optional<GatewayRouteSpecHttpRoute> httpRoute() {
        return Optional.ofNullable(this.httpRoute);
    }
    /**
     * @return Priority for the gateway route, between `0` and `1000`.
     * 
     */
    public Optional<Integer> priority() {
        return Optional.ofNullable(this.priority);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GatewayRouteSpec defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable GatewayRouteSpecGrpcRoute grpcRoute;
        private @Nullable GatewayRouteSpecHttp2Route http2Route;
        private @Nullable GatewayRouteSpecHttpRoute httpRoute;
        private @Nullable Integer priority;
        public Builder() {}
        public Builder(GatewayRouteSpec defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.grpcRoute = defaults.grpcRoute;
    	      this.http2Route = defaults.http2Route;
    	      this.httpRoute = defaults.httpRoute;
    	      this.priority = defaults.priority;
        }

        @CustomType.Setter
        public Builder grpcRoute(@Nullable GatewayRouteSpecGrpcRoute grpcRoute) {
            this.grpcRoute = grpcRoute;
            return this;
        }
        @CustomType.Setter
        public Builder http2Route(@Nullable GatewayRouteSpecHttp2Route http2Route) {
            this.http2Route = http2Route;
            return this;
        }
        @CustomType.Setter
        public Builder httpRoute(@Nullable GatewayRouteSpecHttpRoute httpRoute) {
            this.httpRoute = httpRoute;
            return this;
        }
        @CustomType.Setter
        public Builder priority(@Nullable Integer priority) {
            this.priority = priority;
            return this;
        }
        public GatewayRouteSpec build() {
            final var o = new GatewayRouteSpec();
            o.grpcRoute = grpcRoute;
            o.http2Route = http2Route;
            o.httpRoute = httpRoute;
            o.priority = priority;
            return o;
        }
    }
}

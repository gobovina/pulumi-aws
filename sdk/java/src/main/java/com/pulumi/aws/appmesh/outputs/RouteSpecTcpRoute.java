// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.outputs;

import com.pulumi.aws.appmesh.outputs.RouteSpecTcpRouteAction;
import com.pulumi.aws.appmesh.outputs.RouteSpecTcpRouteTimeout;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RouteSpecTcpRoute {
    /**
     * @return The action to take if a match is determined.
     * 
     */
    private RouteSpecTcpRouteAction action;
    /**
     * @return The types of timeouts.
     * 
     */
    private @Nullable RouteSpecTcpRouteTimeout timeout;

    private RouteSpecTcpRoute() {}
    /**
     * @return The action to take if a match is determined.
     * 
     */
    public RouteSpecTcpRouteAction action() {
        return this.action;
    }
    /**
     * @return The types of timeouts.
     * 
     */
    public Optional<RouteSpecTcpRouteTimeout> timeout() {
        return Optional.ofNullable(this.timeout);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouteSpecTcpRoute defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private RouteSpecTcpRouteAction action;
        private @Nullable RouteSpecTcpRouteTimeout timeout;
        public Builder() {}
        public Builder(RouteSpecTcpRoute defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.timeout = defaults.timeout;
        }

        @CustomType.Setter
        public Builder action(RouteSpecTcpRouteAction action) {
            this.action = Objects.requireNonNull(action);
            return this;
        }
        @CustomType.Setter
        public Builder timeout(@Nullable RouteSpecTcpRouteTimeout timeout) {
            this.timeout = timeout;
            return this;
        }
        public RouteSpecTcpRoute build() {
            final var o = new RouteSpecTcpRoute();
            o.action = action;
            o.timeout = timeout;
            return o;
        }
    }
}

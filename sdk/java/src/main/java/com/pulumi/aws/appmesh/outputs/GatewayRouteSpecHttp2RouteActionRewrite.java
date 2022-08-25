// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.outputs;

import com.pulumi.aws.appmesh.outputs.GatewayRouteSpecHttp2RouteActionRewriteHostname;
import com.pulumi.aws.appmesh.outputs.GatewayRouteSpecHttp2RouteActionRewritePrefix;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GatewayRouteSpecHttp2RouteActionRewrite {
    /**
     * @return The host name to rewrite.
     * 
     */
    private @Nullable GatewayRouteSpecHttp2RouteActionRewriteHostname hostname;
    /**
     * @return The specified beginning characters to rewrite.
     * 
     */
    private @Nullable GatewayRouteSpecHttp2RouteActionRewritePrefix prefix;

    private GatewayRouteSpecHttp2RouteActionRewrite() {}
    /**
     * @return The host name to rewrite.
     * 
     */
    public Optional<GatewayRouteSpecHttp2RouteActionRewriteHostname> hostname() {
        return Optional.ofNullable(this.hostname);
    }
    /**
     * @return The specified beginning characters to rewrite.
     * 
     */
    public Optional<GatewayRouteSpecHttp2RouteActionRewritePrefix> prefix() {
        return Optional.ofNullable(this.prefix);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GatewayRouteSpecHttp2RouteActionRewrite defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable GatewayRouteSpecHttp2RouteActionRewriteHostname hostname;
        private @Nullable GatewayRouteSpecHttp2RouteActionRewritePrefix prefix;
        public Builder() {}
        public Builder(GatewayRouteSpecHttp2RouteActionRewrite defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hostname = defaults.hostname;
    	      this.prefix = defaults.prefix;
        }

        @CustomType.Setter
        public Builder hostname(@Nullable GatewayRouteSpecHttp2RouteActionRewriteHostname hostname) {
            this.hostname = hostname;
            return this;
        }
        @CustomType.Setter
        public Builder prefix(@Nullable GatewayRouteSpecHttp2RouteActionRewritePrefix prefix) {
            this.prefix = prefix;
            return this;
        }
        public GatewayRouteSpecHttp2RouteActionRewrite build() {
            final var o = new GatewayRouteSpecHttp2RouteActionRewrite();
            o.hostname = hostname;
            o.prefix = prefix;
            return o;
        }
    }
}

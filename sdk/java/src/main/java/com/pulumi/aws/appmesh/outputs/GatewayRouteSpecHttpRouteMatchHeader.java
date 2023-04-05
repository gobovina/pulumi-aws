// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.outputs;

import com.pulumi.aws.appmesh.outputs.GatewayRouteSpecHttpRouteMatchHeaderMatch;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GatewayRouteSpecHttpRouteMatchHeader {
    /**
     * @return If `true`, the match is on the opposite of the `match` method and value. Default is `false`.
     * 
     */
    private @Nullable Boolean invert;
    /**
     * @return Method and value to match the header value sent with a request. Specify one match method.
     * 
     */
    private @Nullable GatewayRouteSpecHttpRouteMatchHeaderMatch match;
    /**
     * @return Name for the HTTP header in the client request that will be matched on.
     * 
     */
    private String name;

    private GatewayRouteSpecHttpRouteMatchHeader() {}
    /**
     * @return If `true`, the match is on the opposite of the `match` method and value. Default is `false`.
     * 
     */
    public Optional<Boolean> invert() {
        return Optional.ofNullable(this.invert);
    }
    /**
     * @return Method and value to match the header value sent with a request. Specify one match method.
     * 
     */
    public Optional<GatewayRouteSpecHttpRouteMatchHeaderMatch> match() {
        return Optional.ofNullable(this.match);
    }
    /**
     * @return Name for the HTTP header in the client request that will be matched on.
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GatewayRouteSpecHttpRouteMatchHeader defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean invert;
        private @Nullable GatewayRouteSpecHttpRouteMatchHeaderMatch match;
        private String name;
        public Builder() {}
        public Builder(GatewayRouteSpecHttpRouteMatchHeader defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.invert = defaults.invert;
    	      this.match = defaults.match;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder invert(@Nullable Boolean invert) {
            this.invert = invert;
            return this;
        }
        @CustomType.Setter
        public Builder match(@Nullable GatewayRouteSpecHttpRouteMatchHeaderMatch match) {
            this.match = match;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public GatewayRouteSpecHttpRouteMatchHeader build() {
            final var o = new GatewayRouteSpecHttpRouteMatchHeader();
            o.invert = invert;
            o.match = match;
            o.name = name;
            return o;
        }
    }
}

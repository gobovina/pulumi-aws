// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.outputs;

import com.pulumi.aws.appmesh.outputs.GatewayRouteSpecHttpRouteMatchHeader;
import com.pulumi.aws.appmesh.outputs.GatewayRouteSpecHttpRouteMatchHostname;
import com.pulumi.aws.appmesh.outputs.GatewayRouteSpecHttpRouteMatchPath;
import com.pulumi.aws.appmesh.outputs.GatewayRouteSpecHttpRouteMatchQueryParameter;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GatewayRouteSpecHttpRouteMatch {
    /**
     * @return Client request headers to match on.
     * 
     */
    private @Nullable List<GatewayRouteSpecHttpRouteMatchHeader> headers;
    /**
     * @return Host name to rewrite.
     * 
     */
    private @Nullable GatewayRouteSpecHttpRouteMatchHostname hostname;
    /**
     * @return Client request path to match on.
     * 
     */
    private @Nullable GatewayRouteSpecHttpRouteMatchPath path;
    /**
     * @return The port number that corresponds to the target for Virtual Service provider port. This is required when the provider (router or node) of the Virtual Service has multiple listeners.
     * 
     */
    private @Nullable Integer port;
    /**
     * @return Specified beginning characters to rewrite.
     * 
     */
    private @Nullable String prefix;
    /**
     * @return Client request query parameters to match on.
     * 
     */
    private @Nullable List<GatewayRouteSpecHttpRouteMatchQueryParameter> queryParameters;

    private GatewayRouteSpecHttpRouteMatch() {}
    /**
     * @return Client request headers to match on.
     * 
     */
    public List<GatewayRouteSpecHttpRouteMatchHeader> headers() {
        return this.headers == null ? List.of() : this.headers;
    }
    /**
     * @return Host name to rewrite.
     * 
     */
    public Optional<GatewayRouteSpecHttpRouteMatchHostname> hostname() {
        return Optional.ofNullable(this.hostname);
    }
    /**
     * @return Client request path to match on.
     * 
     */
    public Optional<GatewayRouteSpecHttpRouteMatchPath> path() {
        return Optional.ofNullable(this.path);
    }
    /**
     * @return The port number that corresponds to the target for Virtual Service provider port. This is required when the provider (router or node) of the Virtual Service has multiple listeners.
     * 
     */
    public Optional<Integer> port() {
        return Optional.ofNullable(this.port);
    }
    /**
     * @return Specified beginning characters to rewrite.
     * 
     */
    public Optional<String> prefix() {
        return Optional.ofNullable(this.prefix);
    }
    /**
     * @return Client request query parameters to match on.
     * 
     */
    public List<GatewayRouteSpecHttpRouteMatchQueryParameter> queryParameters() {
        return this.queryParameters == null ? List.of() : this.queryParameters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GatewayRouteSpecHttpRouteMatch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<GatewayRouteSpecHttpRouteMatchHeader> headers;
        private @Nullable GatewayRouteSpecHttpRouteMatchHostname hostname;
        private @Nullable GatewayRouteSpecHttpRouteMatchPath path;
        private @Nullable Integer port;
        private @Nullable String prefix;
        private @Nullable List<GatewayRouteSpecHttpRouteMatchQueryParameter> queryParameters;
        public Builder() {}
        public Builder(GatewayRouteSpecHttpRouteMatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.headers = defaults.headers;
    	      this.hostname = defaults.hostname;
    	      this.path = defaults.path;
    	      this.port = defaults.port;
    	      this.prefix = defaults.prefix;
    	      this.queryParameters = defaults.queryParameters;
        }

        @CustomType.Setter
        public Builder headers(@Nullable List<GatewayRouteSpecHttpRouteMatchHeader> headers) {
            this.headers = headers;
            return this;
        }
        public Builder headers(GatewayRouteSpecHttpRouteMatchHeader... headers) {
            return headers(List.of(headers));
        }
        @CustomType.Setter
        public Builder hostname(@Nullable GatewayRouteSpecHttpRouteMatchHostname hostname) {
            this.hostname = hostname;
            return this;
        }
        @CustomType.Setter
        public Builder path(@Nullable GatewayRouteSpecHttpRouteMatchPath path) {
            this.path = path;
            return this;
        }
        @CustomType.Setter
        public Builder port(@Nullable Integer port) {
            this.port = port;
            return this;
        }
        @CustomType.Setter
        public Builder prefix(@Nullable String prefix) {
            this.prefix = prefix;
            return this;
        }
        @CustomType.Setter
        public Builder queryParameters(@Nullable List<GatewayRouteSpecHttpRouteMatchQueryParameter> queryParameters) {
            this.queryParameters = queryParameters;
            return this;
        }
        public Builder queryParameters(GatewayRouteSpecHttpRouteMatchQueryParameter... queryParameters) {
            return queryParameters(List.of(queryParameters));
        }
        public GatewayRouteSpecHttpRouteMatch build() {
            final var o = new GatewayRouteSpecHttpRouteMatch();
            o.headers = headers;
            o.hostname = hostname;
            o.path = path;
            o.port = port;
            o.prefix = prefix;
            o.queryParameters = queryParameters;
            return o;
        }
    }
}

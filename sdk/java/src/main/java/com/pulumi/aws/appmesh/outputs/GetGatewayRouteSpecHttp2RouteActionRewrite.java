// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.outputs;

import com.pulumi.aws.appmesh.outputs.GetGatewayRouteSpecHttp2RouteActionRewriteHostname;
import com.pulumi.aws.appmesh.outputs.GetGatewayRouteSpecHttp2RouteActionRewritePrefix;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetGatewayRouteSpecHttp2RouteActionRewrite {
    private List<GetGatewayRouteSpecHttp2RouteActionRewriteHostname> hostnames;
    private List<GetGatewayRouteSpecHttp2RouteActionRewritePrefix> prefixes;

    private GetGatewayRouteSpecHttp2RouteActionRewrite() {}
    public List<GetGatewayRouteSpecHttp2RouteActionRewriteHostname> hostnames() {
        return this.hostnames;
    }
    public List<GetGatewayRouteSpecHttp2RouteActionRewritePrefix> prefixes() {
        return this.prefixes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGatewayRouteSpecHttp2RouteActionRewrite defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetGatewayRouteSpecHttp2RouteActionRewriteHostname> hostnames;
        private List<GetGatewayRouteSpecHttp2RouteActionRewritePrefix> prefixes;
        public Builder() {}
        public Builder(GetGatewayRouteSpecHttp2RouteActionRewrite defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hostnames = defaults.hostnames;
    	      this.prefixes = defaults.prefixes;
        }

        @CustomType.Setter
        public Builder hostnames(List<GetGatewayRouteSpecHttp2RouteActionRewriteHostname> hostnames) {
            this.hostnames = Objects.requireNonNull(hostnames);
            return this;
        }
        public Builder hostnames(GetGatewayRouteSpecHttp2RouteActionRewriteHostname... hostnames) {
            return hostnames(List.of(hostnames));
        }
        @CustomType.Setter
        public Builder prefixes(List<GetGatewayRouteSpecHttp2RouteActionRewritePrefix> prefixes) {
            this.prefixes = Objects.requireNonNull(prefixes);
            return this;
        }
        public Builder prefixes(GetGatewayRouteSpecHttp2RouteActionRewritePrefix... prefixes) {
            return prefixes(List.of(prefixes));
        }
        public GetGatewayRouteSpecHttp2RouteActionRewrite build() {
            final var o = new GetGatewayRouteSpecHttp2RouteActionRewrite();
            o.hostnames = hostnames;
            o.prefixes = prefixes;
            return o;
        }
    }
}

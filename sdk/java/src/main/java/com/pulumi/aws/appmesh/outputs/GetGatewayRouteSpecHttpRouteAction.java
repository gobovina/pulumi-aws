// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.outputs;

import com.pulumi.aws.appmesh.outputs.GetGatewayRouteSpecHttpRouteActionRewrite;
import com.pulumi.aws.appmesh.outputs.GetGatewayRouteSpecHttpRouteActionTarget;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetGatewayRouteSpecHttpRouteAction {
    private List<GetGatewayRouteSpecHttpRouteActionRewrite> rewrites;
    private List<GetGatewayRouteSpecHttpRouteActionTarget> targets;

    private GetGatewayRouteSpecHttpRouteAction() {}
    public List<GetGatewayRouteSpecHttpRouteActionRewrite> rewrites() {
        return this.rewrites;
    }
    public List<GetGatewayRouteSpecHttpRouteActionTarget> targets() {
        return this.targets;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGatewayRouteSpecHttpRouteAction defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetGatewayRouteSpecHttpRouteActionRewrite> rewrites;
        private List<GetGatewayRouteSpecHttpRouteActionTarget> targets;
        public Builder() {}
        public Builder(GetGatewayRouteSpecHttpRouteAction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.rewrites = defaults.rewrites;
    	      this.targets = defaults.targets;
        }

        @CustomType.Setter
        public Builder rewrites(List<GetGatewayRouteSpecHttpRouteActionRewrite> rewrites) {
            this.rewrites = Objects.requireNonNull(rewrites);
            return this;
        }
        public Builder rewrites(GetGatewayRouteSpecHttpRouteActionRewrite... rewrites) {
            return rewrites(List.of(rewrites));
        }
        @CustomType.Setter
        public Builder targets(List<GetGatewayRouteSpecHttpRouteActionTarget> targets) {
            this.targets = Objects.requireNonNull(targets);
            return this;
        }
        public Builder targets(GetGatewayRouteSpecHttpRouteActionTarget... targets) {
            return targets(List.of(targets));
        }
        public GetGatewayRouteSpecHttpRouteAction build() {
            final var o = new GetGatewayRouteSpecHttpRouteAction();
            o.rewrites = rewrites;
            o.targets = targets;
            return o;
        }
    }
}

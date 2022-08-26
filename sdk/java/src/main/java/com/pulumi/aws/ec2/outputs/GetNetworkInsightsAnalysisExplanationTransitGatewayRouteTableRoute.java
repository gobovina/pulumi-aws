// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetNetworkInsightsAnalysisExplanationTransitGatewayRouteTableRoute {
    private String attachmentId;
    private String destinationCidr;
    private String prefixListId;
    private String resourceId;
    private String resourceType;
    private String routeOrigin;
    private String state;

    private GetNetworkInsightsAnalysisExplanationTransitGatewayRouteTableRoute() {}
    public String attachmentId() {
        return this.attachmentId;
    }
    public String destinationCidr() {
        return this.destinationCidr;
    }
    public String prefixListId() {
        return this.prefixListId;
    }
    public String resourceId() {
        return this.resourceId;
    }
    public String resourceType() {
        return this.resourceType;
    }
    public String routeOrigin() {
        return this.routeOrigin;
    }
    public String state() {
        return this.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNetworkInsightsAnalysisExplanationTransitGatewayRouteTableRoute defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String attachmentId;
        private String destinationCidr;
        private String prefixListId;
        private String resourceId;
        private String resourceType;
        private String routeOrigin;
        private String state;
        public Builder() {}
        public Builder(GetNetworkInsightsAnalysisExplanationTransitGatewayRouteTableRoute defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attachmentId = defaults.attachmentId;
    	      this.destinationCidr = defaults.destinationCidr;
    	      this.prefixListId = defaults.prefixListId;
    	      this.resourceId = defaults.resourceId;
    	      this.resourceType = defaults.resourceType;
    	      this.routeOrigin = defaults.routeOrigin;
    	      this.state = defaults.state;
        }

        @CustomType.Setter
        public Builder attachmentId(String attachmentId) {
            this.attachmentId = Objects.requireNonNull(attachmentId);
            return this;
        }
        @CustomType.Setter
        public Builder destinationCidr(String destinationCidr) {
            this.destinationCidr = Objects.requireNonNull(destinationCidr);
            return this;
        }
        @CustomType.Setter
        public Builder prefixListId(String prefixListId) {
            this.prefixListId = Objects.requireNonNull(prefixListId);
            return this;
        }
        @CustomType.Setter
        public Builder resourceId(String resourceId) {
            this.resourceId = Objects.requireNonNull(resourceId);
            return this;
        }
        @CustomType.Setter
        public Builder resourceType(String resourceType) {
            this.resourceType = Objects.requireNonNull(resourceType);
            return this;
        }
        @CustomType.Setter
        public Builder routeOrigin(String routeOrigin) {
            this.routeOrigin = Objects.requireNonNull(routeOrigin);
            return this;
        }
        @CustomType.Setter
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public GetNetworkInsightsAnalysisExplanationTransitGatewayRouteTableRoute build() {
            final var o = new GetNetworkInsightsAnalysisExplanationTransitGatewayRouteTableRoute();
            o.attachmentId = attachmentId;
            o.destinationCidr = destinationCidr;
            o.prefixListId = prefixListId;
            o.resourceId = resourceId;
            o.resourceType = resourceType;
            o.routeOrigin = routeOrigin;
            o.state = state;
            return o;
        }
    }
}

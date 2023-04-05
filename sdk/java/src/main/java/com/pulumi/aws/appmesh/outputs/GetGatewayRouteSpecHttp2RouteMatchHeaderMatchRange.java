// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class GetGatewayRouteSpecHttp2RouteMatchHeaderMatchRange {
    private Integer end;
    private Integer start;

    private GetGatewayRouteSpecHttp2RouteMatchHeaderMatchRange() {}
    public Integer end() {
        return this.end;
    }
    public Integer start() {
        return this.start;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGatewayRouteSpecHttp2RouteMatchHeaderMatchRange defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer end;
        private Integer start;
        public Builder() {}
        public Builder(GetGatewayRouteSpecHttp2RouteMatchHeaderMatchRange defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.end = defaults.end;
    	      this.start = defaults.start;
        }

        @CustomType.Setter
        public Builder end(Integer end) {
            this.end = Objects.requireNonNull(end);
            return this;
        }
        @CustomType.Setter
        public Builder start(Integer start) {
            this.start = Objects.requireNonNull(start);
            return this;
        }
        public GetGatewayRouteSpecHttp2RouteMatchHeaderMatchRange build() {
            final var o = new GetGatewayRouteSpecHttp2RouteMatchHeaderMatchRange();
            o.end = end;
            o.start = start;
            return o;
        }
    }
}

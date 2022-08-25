// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.outputs;

import com.pulumi.aws.ec2.outputs.GetCoipPoolFilter;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetCoipPoolResult {
    /**
     * @return ARN of the COIP pool
     * 
     */
    private String arn;
    private @Nullable List<GetCoipPoolFilter> filters;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private String localGatewayRouteTableId;
    /**
     * @return Set of CIDR blocks in pool
     * 
     */
    private List<String> poolCidrs;
    private String poolId;
    private Map<String,String> tags;

    private GetCoipPoolResult() {}
    /**
     * @return ARN of the COIP pool
     * 
     */
    public String arn() {
        return this.arn;
    }
    public List<GetCoipPoolFilter> filters() {
        return this.filters == null ? List.of() : this.filters;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String localGatewayRouteTableId() {
        return this.localGatewayRouteTableId;
    }
    /**
     * @return Set of CIDR blocks in pool
     * 
     */
    public List<String> poolCidrs() {
        return this.poolCidrs;
    }
    public String poolId() {
        return this.poolId;
    }
    public Map<String,String> tags() {
        return this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCoipPoolResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String arn;
        private @Nullable List<GetCoipPoolFilter> filters;
        private String id;
        private String localGatewayRouteTableId;
        private List<String> poolCidrs;
        private String poolId;
        private Map<String,String> tags;
        public Builder() {}
        public Builder(GetCoipPoolResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.localGatewayRouteTableId = defaults.localGatewayRouteTableId;
    	      this.poolCidrs = defaults.poolCidrs;
    	      this.poolId = defaults.poolId;
    	      this.tags = defaults.tags;
        }

        @CustomType.Setter
        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        @CustomType.Setter
        public Builder filters(@Nullable List<GetCoipPoolFilter> filters) {
            this.filters = filters;
            return this;
        }
        public Builder filters(GetCoipPoolFilter... filters) {
            return filters(List.of(filters));
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder localGatewayRouteTableId(String localGatewayRouteTableId) {
            this.localGatewayRouteTableId = Objects.requireNonNull(localGatewayRouteTableId);
            return this;
        }
        @CustomType.Setter
        public Builder poolCidrs(List<String> poolCidrs) {
            this.poolCidrs = Objects.requireNonNull(poolCidrs);
            return this;
        }
        public Builder poolCidrs(String... poolCidrs) {
            return poolCidrs(List.of(poolCidrs));
        }
        @CustomType.Setter
        public Builder poolId(String poolId) {
            this.poolId = Objects.requireNonNull(poolId);
            return this;
        }
        @CustomType.Setter
        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public GetCoipPoolResult build() {
            final var o = new GetCoipPoolResult();
            o.arn = arn;
            o.filters = filters;
            o.id = id;
            o.localGatewayRouteTableId = localGatewayRouteTableId;
            o.poolCidrs = poolCidrs;
            o.poolId = poolId;
            o.tags = tags;
            return o;
        }
    }
}

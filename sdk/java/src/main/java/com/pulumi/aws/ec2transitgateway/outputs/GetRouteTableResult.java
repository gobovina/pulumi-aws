// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2transitgateway.outputs;

import com.pulumi.aws.ec2transitgateway.outputs.GetRouteTableFilter;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetRouteTableResult {
    /**
     * @return EC2 Transit Gateway Route Table Amazon Resource Name (ARN).
     * 
     */
    private String arn;
    /**
     * @return Boolean whether this is the default association route table for the EC2 Transit Gateway
     * 
     */
    private Boolean defaultAssociationRouteTable;
    /**
     * @return Boolean whether this is the default propagation route table for the EC2 Transit Gateway
     * 
     */
    private Boolean defaultPropagationRouteTable;
    private @Nullable List<GetRouteTableFilter> filters;
    /**
     * @return EC2 Transit Gateway Route Table identifier
     * 
     */
    private String id;
    /**
     * @return Key-value tags for the EC2 Transit Gateway Route Table
     * 
     */
    private Map<String,String> tags;
    /**
     * @return EC2 Transit Gateway identifier
     * 
     */
    private String transitGatewayId;

    private GetRouteTableResult() {}
    /**
     * @return EC2 Transit Gateway Route Table Amazon Resource Name (ARN).
     * 
     */
    public String arn() {
        return this.arn;
    }
    /**
     * @return Boolean whether this is the default association route table for the EC2 Transit Gateway
     * 
     */
    public Boolean defaultAssociationRouteTable() {
        return this.defaultAssociationRouteTable;
    }
    /**
     * @return Boolean whether this is the default propagation route table for the EC2 Transit Gateway
     * 
     */
    public Boolean defaultPropagationRouteTable() {
        return this.defaultPropagationRouteTable;
    }
    public List<GetRouteTableFilter> filters() {
        return this.filters == null ? List.of() : this.filters;
    }
    /**
     * @return EC2 Transit Gateway Route Table identifier
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Key-value tags for the EC2 Transit Gateway Route Table
     * 
     */
    public Map<String,String> tags() {
        return this.tags;
    }
    /**
     * @return EC2 Transit Gateway identifier
     * 
     */
    public String transitGatewayId() {
        return this.transitGatewayId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRouteTableResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String arn;
        private Boolean defaultAssociationRouteTable;
        private Boolean defaultPropagationRouteTable;
        private @Nullable List<GetRouteTableFilter> filters;
        private String id;
        private Map<String,String> tags;
        private String transitGatewayId;
        public Builder() {}
        public Builder(GetRouteTableResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.defaultAssociationRouteTable = defaults.defaultAssociationRouteTable;
    	      this.defaultPropagationRouteTable = defaults.defaultPropagationRouteTable;
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.tags = defaults.tags;
    	      this.transitGatewayId = defaults.transitGatewayId;
        }

        @CustomType.Setter
        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        @CustomType.Setter
        public Builder defaultAssociationRouteTable(Boolean defaultAssociationRouteTable) {
            this.defaultAssociationRouteTable = Objects.requireNonNull(defaultAssociationRouteTable);
            return this;
        }
        @CustomType.Setter
        public Builder defaultPropagationRouteTable(Boolean defaultPropagationRouteTable) {
            this.defaultPropagationRouteTable = Objects.requireNonNull(defaultPropagationRouteTable);
            return this;
        }
        @CustomType.Setter
        public Builder filters(@Nullable List<GetRouteTableFilter> filters) {
            this.filters = filters;
            return this;
        }
        public Builder filters(GetRouteTableFilter... filters) {
            return filters(List.of(filters));
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        @CustomType.Setter
        public Builder transitGatewayId(String transitGatewayId) {
            this.transitGatewayId = Objects.requireNonNull(transitGatewayId);
            return this;
        }
        public GetRouteTableResult build() {
            final var o = new GetRouteTableResult();
            o.arn = arn;
            o.defaultAssociationRouteTable = defaultAssociationRouteTable;
            o.defaultPropagationRouteTable = defaultPropagationRouteTable;
            o.filters = filters;
            o.id = id;
            o.tags = tags;
            o.transitGatewayId = transitGatewayId;
            return o;
        }
    }
}

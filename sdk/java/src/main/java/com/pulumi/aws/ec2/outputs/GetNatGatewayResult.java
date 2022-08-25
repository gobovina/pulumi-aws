// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.outputs;

import com.pulumi.aws.ec2.outputs.GetNatGatewayFilter;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetNatGatewayResult {
    /**
     * @return The Id of the EIP allocated to the selected Nat Gateway.
     * 
     */
    private String allocationId;
    /**
     * @return The connectivity type of the NAT Gateway.
     * 
     */
    private String connectivityType;
    private @Nullable List<GetNatGatewayFilter> filters;
    private String id;
    /**
     * @return The Id of the ENI allocated to the selected Nat Gateway.
     * 
     */
    private String networkInterfaceId;
    /**
     * @return The private Ip address of the selected Nat Gateway.
     * 
     */
    private String privateIp;
    /**
     * @return The public Ip (EIP) address of the selected Nat Gateway.
     * 
     */
    private String publicIp;
    private String state;
    private String subnetId;
    private Map<String,String> tags;
    private String vpcId;

    private GetNatGatewayResult() {}
    /**
     * @return The Id of the EIP allocated to the selected Nat Gateway.
     * 
     */
    public String allocationId() {
        return this.allocationId;
    }
    /**
     * @return The connectivity type of the NAT Gateway.
     * 
     */
    public String connectivityType() {
        return this.connectivityType;
    }
    public List<GetNatGatewayFilter> filters() {
        return this.filters == null ? List.of() : this.filters;
    }
    public String id() {
        return this.id;
    }
    /**
     * @return The Id of the ENI allocated to the selected Nat Gateway.
     * 
     */
    public String networkInterfaceId() {
        return this.networkInterfaceId;
    }
    /**
     * @return The private Ip address of the selected Nat Gateway.
     * 
     */
    public String privateIp() {
        return this.privateIp;
    }
    /**
     * @return The public Ip (EIP) address of the selected Nat Gateway.
     * 
     */
    public String publicIp() {
        return this.publicIp;
    }
    public String state() {
        return this.state;
    }
    public String subnetId() {
        return this.subnetId;
    }
    public Map<String,String> tags() {
        return this.tags;
    }
    public String vpcId() {
        return this.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNatGatewayResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String allocationId;
        private String connectivityType;
        private @Nullable List<GetNatGatewayFilter> filters;
        private String id;
        private String networkInterfaceId;
        private String privateIp;
        private String publicIp;
        private String state;
        private String subnetId;
        private Map<String,String> tags;
        private String vpcId;
        public Builder() {}
        public Builder(GetNatGatewayResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allocationId = defaults.allocationId;
    	      this.connectivityType = defaults.connectivityType;
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.networkInterfaceId = defaults.networkInterfaceId;
    	      this.privateIp = defaults.privateIp;
    	      this.publicIp = defaults.publicIp;
    	      this.state = defaults.state;
    	      this.subnetId = defaults.subnetId;
    	      this.tags = defaults.tags;
    	      this.vpcId = defaults.vpcId;
        }

        @CustomType.Setter
        public Builder allocationId(String allocationId) {
            this.allocationId = Objects.requireNonNull(allocationId);
            return this;
        }
        @CustomType.Setter
        public Builder connectivityType(String connectivityType) {
            this.connectivityType = Objects.requireNonNull(connectivityType);
            return this;
        }
        @CustomType.Setter
        public Builder filters(@Nullable List<GetNatGatewayFilter> filters) {
            this.filters = filters;
            return this;
        }
        public Builder filters(GetNatGatewayFilter... filters) {
            return filters(List.of(filters));
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder networkInterfaceId(String networkInterfaceId) {
            this.networkInterfaceId = Objects.requireNonNull(networkInterfaceId);
            return this;
        }
        @CustomType.Setter
        public Builder privateIp(String privateIp) {
            this.privateIp = Objects.requireNonNull(privateIp);
            return this;
        }
        @CustomType.Setter
        public Builder publicIp(String publicIp) {
            this.publicIp = Objects.requireNonNull(publicIp);
            return this;
        }
        @CustomType.Setter
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        @CustomType.Setter
        public Builder subnetId(String subnetId) {
            this.subnetId = Objects.requireNonNull(subnetId);
            return this;
        }
        @CustomType.Setter
        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        @CustomType.Setter
        public Builder vpcId(String vpcId) {
            this.vpcId = Objects.requireNonNull(vpcId);
            return this;
        }
        public GetNatGatewayResult build() {
            final var o = new GetNatGatewayResult();
            o.allocationId = allocationId;
            o.connectivityType = connectivityType;
            o.filters = filters;
            o.id = id;
            o.networkInterfaceId = networkInterfaceId;
            o.privateIp = privateIp;
            o.publicIp = publicIp;
            o.state = state;
            o.subnetId = subnetId;
            o.tags = tags;
            o.vpcId = vpcId;
            return o;
        }
    }
}

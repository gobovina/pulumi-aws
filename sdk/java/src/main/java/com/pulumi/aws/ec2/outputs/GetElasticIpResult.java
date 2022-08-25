// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.outputs;

import com.pulumi.aws.ec2.outputs.GetElasticIpFilter;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetElasticIpResult {
    /**
     * @return The ID representing the association of the address with an instance in a VPC.
     * 
     */
    private String associationId;
    /**
     * @return The carrier IP address.
     * 
     */
    private String carrierIp;
    /**
     * @return Customer Owned IP.
     * 
     */
    private String customerOwnedIp;
    /**
     * @return The ID of a Customer Owned IP Pool. For more on customer owned IP addressed check out [Customer-owned IP addresses guide](https://docs.aws.amazon.com/outposts/latest/userguide/outposts-networking-components.html#ip-addressing)
     * 
     */
    private String customerOwnedIpv4Pool;
    /**
     * @return Indicates whether the address is for use in EC2-Classic (standard) or in a VPC (vpc).
     * 
     */
    private String domain;
    private @Nullable List<GetElasticIpFilter> filters;
    /**
     * @return If VPC Elastic IP, the allocation identifier. If EC2-Classic Elastic IP, the public IP address.
     * 
     */
    private String id;
    /**
     * @return The ID of the instance that the address is associated with (if any).
     * 
     */
    private String instanceId;
    /**
     * @return The ID of the network interface.
     * 
     */
    private String networkInterfaceId;
    /**
     * @return The ID of the AWS account that owns the network interface.
     * 
     */
    private String networkInterfaceOwnerId;
    /**
     * @return The Private DNS associated with the Elastic IP address.
     * 
     */
    private String privateDns;
    /**
     * @return The private IP address associated with the Elastic IP address.
     * 
     */
    private String privateIp;
    /**
     * @return Public DNS associated with the Elastic IP address.
     * 
     */
    private String publicDns;
    /**
     * @return Public IP address of Elastic IP.
     * 
     */
    private String publicIp;
    /**
     * @return The ID of an address pool.
     * 
     */
    private String publicIpv4Pool;
    /**
     * @return Key-value map of tags associated with Elastic IP.
     * 
     */
    private Map<String,String> tags;

    private GetElasticIpResult() {}
    /**
     * @return The ID representing the association of the address with an instance in a VPC.
     * 
     */
    public String associationId() {
        return this.associationId;
    }
    /**
     * @return The carrier IP address.
     * 
     */
    public String carrierIp() {
        return this.carrierIp;
    }
    /**
     * @return Customer Owned IP.
     * 
     */
    public String customerOwnedIp() {
        return this.customerOwnedIp;
    }
    /**
     * @return The ID of a Customer Owned IP Pool. For more on customer owned IP addressed check out [Customer-owned IP addresses guide](https://docs.aws.amazon.com/outposts/latest/userguide/outposts-networking-components.html#ip-addressing)
     * 
     */
    public String customerOwnedIpv4Pool() {
        return this.customerOwnedIpv4Pool;
    }
    /**
     * @return Indicates whether the address is for use in EC2-Classic (standard) or in a VPC (vpc).
     * 
     */
    public String domain() {
        return this.domain;
    }
    public List<GetElasticIpFilter> filters() {
        return this.filters == null ? List.of() : this.filters;
    }
    /**
     * @return If VPC Elastic IP, the allocation identifier. If EC2-Classic Elastic IP, the public IP address.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The ID of the instance that the address is associated with (if any).
     * 
     */
    public String instanceId() {
        return this.instanceId;
    }
    /**
     * @return The ID of the network interface.
     * 
     */
    public String networkInterfaceId() {
        return this.networkInterfaceId;
    }
    /**
     * @return The ID of the AWS account that owns the network interface.
     * 
     */
    public String networkInterfaceOwnerId() {
        return this.networkInterfaceOwnerId;
    }
    /**
     * @return The Private DNS associated with the Elastic IP address.
     * 
     */
    public String privateDns() {
        return this.privateDns;
    }
    /**
     * @return The private IP address associated with the Elastic IP address.
     * 
     */
    public String privateIp() {
        return this.privateIp;
    }
    /**
     * @return Public DNS associated with the Elastic IP address.
     * 
     */
    public String publicDns() {
        return this.publicDns;
    }
    /**
     * @return Public IP address of Elastic IP.
     * 
     */
    public String publicIp() {
        return this.publicIp;
    }
    /**
     * @return The ID of an address pool.
     * 
     */
    public String publicIpv4Pool() {
        return this.publicIpv4Pool;
    }
    /**
     * @return Key-value map of tags associated with Elastic IP.
     * 
     */
    public Map<String,String> tags() {
        return this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetElasticIpResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String associationId;
        private String carrierIp;
        private String customerOwnedIp;
        private String customerOwnedIpv4Pool;
        private String domain;
        private @Nullable List<GetElasticIpFilter> filters;
        private String id;
        private String instanceId;
        private String networkInterfaceId;
        private String networkInterfaceOwnerId;
        private String privateDns;
        private String privateIp;
        private String publicDns;
        private String publicIp;
        private String publicIpv4Pool;
        private Map<String,String> tags;
        public Builder() {}
        public Builder(GetElasticIpResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.associationId = defaults.associationId;
    	      this.carrierIp = defaults.carrierIp;
    	      this.customerOwnedIp = defaults.customerOwnedIp;
    	      this.customerOwnedIpv4Pool = defaults.customerOwnedIpv4Pool;
    	      this.domain = defaults.domain;
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.instanceId = defaults.instanceId;
    	      this.networkInterfaceId = defaults.networkInterfaceId;
    	      this.networkInterfaceOwnerId = defaults.networkInterfaceOwnerId;
    	      this.privateDns = defaults.privateDns;
    	      this.privateIp = defaults.privateIp;
    	      this.publicDns = defaults.publicDns;
    	      this.publicIp = defaults.publicIp;
    	      this.publicIpv4Pool = defaults.publicIpv4Pool;
    	      this.tags = defaults.tags;
        }

        @CustomType.Setter
        public Builder associationId(String associationId) {
            this.associationId = Objects.requireNonNull(associationId);
            return this;
        }
        @CustomType.Setter
        public Builder carrierIp(String carrierIp) {
            this.carrierIp = Objects.requireNonNull(carrierIp);
            return this;
        }
        @CustomType.Setter
        public Builder customerOwnedIp(String customerOwnedIp) {
            this.customerOwnedIp = Objects.requireNonNull(customerOwnedIp);
            return this;
        }
        @CustomType.Setter
        public Builder customerOwnedIpv4Pool(String customerOwnedIpv4Pool) {
            this.customerOwnedIpv4Pool = Objects.requireNonNull(customerOwnedIpv4Pool);
            return this;
        }
        @CustomType.Setter
        public Builder domain(String domain) {
            this.domain = Objects.requireNonNull(domain);
            return this;
        }
        @CustomType.Setter
        public Builder filters(@Nullable List<GetElasticIpFilter> filters) {
            this.filters = filters;
            return this;
        }
        public Builder filters(GetElasticIpFilter... filters) {
            return filters(List.of(filters));
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder instanceId(String instanceId) {
            this.instanceId = Objects.requireNonNull(instanceId);
            return this;
        }
        @CustomType.Setter
        public Builder networkInterfaceId(String networkInterfaceId) {
            this.networkInterfaceId = Objects.requireNonNull(networkInterfaceId);
            return this;
        }
        @CustomType.Setter
        public Builder networkInterfaceOwnerId(String networkInterfaceOwnerId) {
            this.networkInterfaceOwnerId = Objects.requireNonNull(networkInterfaceOwnerId);
            return this;
        }
        @CustomType.Setter
        public Builder privateDns(String privateDns) {
            this.privateDns = Objects.requireNonNull(privateDns);
            return this;
        }
        @CustomType.Setter
        public Builder privateIp(String privateIp) {
            this.privateIp = Objects.requireNonNull(privateIp);
            return this;
        }
        @CustomType.Setter
        public Builder publicDns(String publicDns) {
            this.publicDns = Objects.requireNonNull(publicDns);
            return this;
        }
        @CustomType.Setter
        public Builder publicIp(String publicIp) {
            this.publicIp = Objects.requireNonNull(publicIp);
            return this;
        }
        @CustomType.Setter
        public Builder publicIpv4Pool(String publicIpv4Pool) {
            this.publicIpv4Pool = Objects.requireNonNull(publicIpv4Pool);
            return this;
        }
        @CustomType.Setter
        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public GetElasticIpResult build() {
            final var o = new GetElasticIpResult();
            o.associationId = associationId;
            o.carrierIp = carrierIp;
            o.customerOwnedIp = customerOwnedIp;
            o.customerOwnedIpv4Pool = customerOwnedIpv4Pool;
            o.domain = domain;
            o.filters = filters;
            o.id = id;
            o.instanceId = instanceId;
            o.networkInterfaceId = networkInterfaceId;
            o.networkInterfaceOwnerId = networkInterfaceOwnerId;
            o.privateDns = privateDns;
            o.privateIp = privateIp;
            o.publicDns = publicDns;
            o.publicIp = publicIp;
            o.publicIpv4Pool = publicIpv4Pool;
            o.tags = tags;
            return o;
        }
    }
}

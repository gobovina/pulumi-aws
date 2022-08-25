// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.networkfirewall.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetFirewallFirewallStatusSyncStateAttachment {
    /**
     * @return The identifier of the firewall endpoint that AWS Network Firewall has instantiated in the subnet. You use this to identify the firewall endpoint in the VPC route tables, when you redirect the VPC traffic through the endpoint.
     * 
     */
    private String endpointId;
    private String status;
    /**
     * @return The unique identifier for the subnet.
     * 
     */
    private String subnetId;

    private GetFirewallFirewallStatusSyncStateAttachment() {}
    /**
     * @return The identifier of the firewall endpoint that AWS Network Firewall has instantiated in the subnet. You use this to identify the firewall endpoint in the VPC route tables, when you redirect the VPC traffic through the endpoint.
     * 
     */
    public String endpointId() {
        return this.endpointId;
    }
    public String status() {
        return this.status;
    }
    /**
     * @return The unique identifier for the subnet.
     * 
     */
    public String subnetId() {
        return this.subnetId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFirewallFirewallStatusSyncStateAttachment defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String endpointId;
        private String status;
        private String subnetId;
        public Builder() {}
        public Builder(GetFirewallFirewallStatusSyncStateAttachment defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpointId = defaults.endpointId;
    	      this.status = defaults.status;
    	      this.subnetId = defaults.subnetId;
        }

        @CustomType.Setter
        public Builder endpointId(String endpointId) {
            this.endpointId = Objects.requireNonNull(endpointId);
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        @CustomType.Setter
        public Builder subnetId(String subnetId) {
            this.subnetId = Objects.requireNonNull(subnetId);
            return this;
        }
        public GetFirewallFirewallStatusSyncStateAttachment build() {
            final var o = new GetFirewallFirewallStatusSyncStateAttachment();
            o.endpointId = endpointId;
            o.status = status;
            o.subnetId = subnetId;
            return o;
        }
    }
}

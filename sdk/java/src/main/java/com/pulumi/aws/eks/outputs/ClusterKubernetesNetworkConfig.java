// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.eks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterKubernetesNetworkConfig {
    /**
     * @return The IP family used to assign Kubernetes pod and service addresses. Valid values are `ipv4` (default) and `ipv6`. You can only specify an IP family when you create a cluster, changing this value will force a new cluster to be created.
     * 
     */
    private @Nullable String ipFamily;
    /**
     * @return The CIDR block to assign Kubernetes service IP addresses from. If you don&#39;t specify a block, Kubernetes assigns addresses from either the 10.100.0.0/16 or 172.20.0.0/16 CIDR blocks. We recommend that you specify a block that does not overlap with resources in other networks that are peered or connected to your VPC. You can only specify a custom CIDR block when you create a cluster, changing this value will force a new cluster to be created. The block must meet the following requirements:
     * 
     */
    private @Nullable String serviceIpv4Cidr;

    private ClusterKubernetesNetworkConfig() {}
    /**
     * @return The IP family used to assign Kubernetes pod and service addresses. Valid values are `ipv4` (default) and `ipv6`. You can only specify an IP family when you create a cluster, changing this value will force a new cluster to be created.
     * 
     */
    public Optional<String> ipFamily() {
        return Optional.ofNullable(this.ipFamily);
    }
    /**
     * @return The CIDR block to assign Kubernetes service IP addresses from. If you don&#39;t specify a block, Kubernetes assigns addresses from either the 10.100.0.0/16 or 172.20.0.0/16 CIDR blocks. We recommend that you specify a block that does not overlap with resources in other networks that are peered or connected to your VPC. You can only specify a custom CIDR block when you create a cluster, changing this value will force a new cluster to be created. The block must meet the following requirements:
     * 
     */
    public Optional<String> serviceIpv4Cidr() {
        return Optional.ofNullable(this.serviceIpv4Cidr);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterKubernetesNetworkConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String ipFamily;
        private @Nullable String serviceIpv4Cidr;
        public Builder() {}
        public Builder(ClusterKubernetesNetworkConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipFamily = defaults.ipFamily;
    	      this.serviceIpv4Cidr = defaults.serviceIpv4Cidr;
        }

        @CustomType.Setter
        public Builder ipFamily(@Nullable String ipFamily) {
            this.ipFamily = ipFamily;
            return this;
        }
        @CustomType.Setter
        public Builder serviceIpv4Cidr(@Nullable String serviceIpv4Cidr) {
            this.serviceIpv4Cidr = serviceIpv4Cidr;
            return this;
        }
        public ClusterKubernetesNetworkConfig build() {
            final var o = new ClusterKubernetesNetworkConfig();
            o.ipFamily = ipFamily;
            o.serviceIpv4Cidr = serviceIpv4Cidr;
            return o;
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetLaunchTemplateNetworkInterface {
    private String associateCarrierIpAddress;
    private @Nullable Boolean associatePublicIpAddress;
    private @Nullable Boolean deleteOnTermination;
    private String description;
    private Integer deviceIndex;
    private String interfaceType;
    private Integer ipv4AddressCount;
    private List<String> ipv4Addresses;
    private Integer ipv4PrefixCount;
    private List<String> ipv4Prefixes;
    private Integer ipv6AddressCount;
    private List<String> ipv6Addresses;
    private Integer ipv6PrefixCount;
    private List<String> ipv6Prefixes;
    private Integer networkCardIndex;
    private String networkInterfaceId;
    private String privateIpAddress;
    private List<String> securityGroups;
    private String subnetId;

    private GetLaunchTemplateNetworkInterface() {}
    public String associateCarrierIpAddress() {
        return this.associateCarrierIpAddress;
    }
    public Optional<Boolean> associatePublicIpAddress() {
        return Optional.ofNullable(this.associatePublicIpAddress);
    }
    public Optional<Boolean> deleteOnTermination() {
        return Optional.ofNullable(this.deleteOnTermination);
    }
    public String description() {
        return this.description;
    }
    public Integer deviceIndex() {
        return this.deviceIndex;
    }
    public String interfaceType() {
        return this.interfaceType;
    }
    public Integer ipv4AddressCount() {
        return this.ipv4AddressCount;
    }
    public List<String> ipv4Addresses() {
        return this.ipv4Addresses;
    }
    public Integer ipv4PrefixCount() {
        return this.ipv4PrefixCount;
    }
    public List<String> ipv4Prefixes() {
        return this.ipv4Prefixes;
    }
    public Integer ipv6AddressCount() {
        return this.ipv6AddressCount;
    }
    public List<String> ipv6Addresses() {
        return this.ipv6Addresses;
    }
    public Integer ipv6PrefixCount() {
        return this.ipv6PrefixCount;
    }
    public List<String> ipv6Prefixes() {
        return this.ipv6Prefixes;
    }
    public Integer networkCardIndex() {
        return this.networkCardIndex;
    }
    public String networkInterfaceId() {
        return this.networkInterfaceId;
    }
    public String privateIpAddress() {
        return this.privateIpAddress;
    }
    public List<String> securityGroups() {
        return this.securityGroups;
    }
    public String subnetId() {
        return this.subnetId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLaunchTemplateNetworkInterface defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String associateCarrierIpAddress;
        private @Nullable Boolean associatePublicIpAddress;
        private @Nullable Boolean deleteOnTermination;
        private String description;
        private Integer deviceIndex;
        private String interfaceType;
        private Integer ipv4AddressCount;
        private List<String> ipv4Addresses;
        private Integer ipv4PrefixCount;
        private List<String> ipv4Prefixes;
        private Integer ipv6AddressCount;
        private List<String> ipv6Addresses;
        private Integer ipv6PrefixCount;
        private List<String> ipv6Prefixes;
        private Integer networkCardIndex;
        private String networkInterfaceId;
        private String privateIpAddress;
        private List<String> securityGroups;
        private String subnetId;
        public Builder() {}
        public Builder(GetLaunchTemplateNetworkInterface defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.associateCarrierIpAddress = defaults.associateCarrierIpAddress;
    	      this.associatePublicIpAddress = defaults.associatePublicIpAddress;
    	      this.deleteOnTermination = defaults.deleteOnTermination;
    	      this.description = defaults.description;
    	      this.deviceIndex = defaults.deviceIndex;
    	      this.interfaceType = defaults.interfaceType;
    	      this.ipv4AddressCount = defaults.ipv4AddressCount;
    	      this.ipv4Addresses = defaults.ipv4Addresses;
    	      this.ipv4PrefixCount = defaults.ipv4PrefixCount;
    	      this.ipv4Prefixes = defaults.ipv4Prefixes;
    	      this.ipv6AddressCount = defaults.ipv6AddressCount;
    	      this.ipv6Addresses = defaults.ipv6Addresses;
    	      this.ipv6PrefixCount = defaults.ipv6PrefixCount;
    	      this.ipv6Prefixes = defaults.ipv6Prefixes;
    	      this.networkCardIndex = defaults.networkCardIndex;
    	      this.networkInterfaceId = defaults.networkInterfaceId;
    	      this.privateIpAddress = defaults.privateIpAddress;
    	      this.securityGroups = defaults.securityGroups;
    	      this.subnetId = defaults.subnetId;
        }

        @CustomType.Setter
        public Builder associateCarrierIpAddress(String associateCarrierIpAddress) {
            this.associateCarrierIpAddress = Objects.requireNonNull(associateCarrierIpAddress);
            return this;
        }
        @CustomType.Setter
        public Builder associatePublicIpAddress(@Nullable Boolean associatePublicIpAddress) {
            this.associatePublicIpAddress = associatePublicIpAddress;
            return this;
        }
        @CustomType.Setter
        public Builder deleteOnTermination(@Nullable Boolean deleteOnTermination) {
            this.deleteOnTermination = deleteOnTermination;
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        @CustomType.Setter
        public Builder deviceIndex(Integer deviceIndex) {
            this.deviceIndex = Objects.requireNonNull(deviceIndex);
            return this;
        }
        @CustomType.Setter
        public Builder interfaceType(String interfaceType) {
            this.interfaceType = Objects.requireNonNull(interfaceType);
            return this;
        }
        @CustomType.Setter
        public Builder ipv4AddressCount(Integer ipv4AddressCount) {
            this.ipv4AddressCount = Objects.requireNonNull(ipv4AddressCount);
            return this;
        }
        @CustomType.Setter
        public Builder ipv4Addresses(List<String> ipv4Addresses) {
            this.ipv4Addresses = Objects.requireNonNull(ipv4Addresses);
            return this;
        }
        public Builder ipv4Addresses(String... ipv4Addresses) {
            return ipv4Addresses(List.of(ipv4Addresses));
        }
        @CustomType.Setter
        public Builder ipv4PrefixCount(Integer ipv4PrefixCount) {
            this.ipv4PrefixCount = Objects.requireNonNull(ipv4PrefixCount);
            return this;
        }
        @CustomType.Setter
        public Builder ipv4Prefixes(List<String> ipv4Prefixes) {
            this.ipv4Prefixes = Objects.requireNonNull(ipv4Prefixes);
            return this;
        }
        public Builder ipv4Prefixes(String... ipv4Prefixes) {
            return ipv4Prefixes(List.of(ipv4Prefixes));
        }
        @CustomType.Setter
        public Builder ipv6AddressCount(Integer ipv6AddressCount) {
            this.ipv6AddressCount = Objects.requireNonNull(ipv6AddressCount);
            return this;
        }
        @CustomType.Setter
        public Builder ipv6Addresses(List<String> ipv6Addresses) {
            this.ipv6Addresses = Objects.requireNonNull(ipv6Addresses);
            return this;
        }
        public Builder ipv6Addresses(String... ipv6Addresses) {
            return ipv6Addresses(List.of(ipv6Addresses));
        }
        @CustomType.Setter
        public Builder ipv6PrefixCount(Integer ipv6PrefixCount) {
            this.ipv6PrefixCount = Objects.requireNonNull(ipv6PrefixCount);
            return this;
        }
        @CustomType.Setter
        public Builder ipv6Prefixes(List<String> ipv6Prefixes) {
            this.ipv6Prefixes = Objects.requireNonNull(ipv6Prefixes);
            return this;
        }
        public Builder ipv6Prefixes(String... ipv6Prefixes) {
            return ipv6Prefixes(List.of(ipv6Prefixes));
        }
        @CustomType.Setter
        public Builder networkCardIndex(Integer networkCardIndex) {
            this.networkCardIndex = Objects.requireNonNull(networkCardIndex);
            return this;
        }
        @CustomType.Setter
        public Builder networkInterfaceId(String networkInterfaceId) {
            this.networkInterfaceId = Objects.requireNonNull(networkInterfaceId);
            return this;
        }
        @CustomType.Setter
        public Builder privateIpAddress(String privateIpAddress) {
            this.privateIpAddress = Objects.requireNonNull(privateIpAddress);
            return this;
        }
        @CustomType.Setter
        public Builder securityGroups(List<String> securityGroups) {
            this.securityGroups = Objects.requireNonNull(securityGroups);
            return this;
        }
        public Builder securityGroups(String... securityGroups) {
            return securityGroups(List.of(securityGroups));
        }
        @CustomType.Setter
        public Builder subnetId(String subnetId) {
            this.subnetId = Objects.requireNonNull(subnetId);
            return this;
        }
        public GetLaunchTemplateNetworkInterface build() {
            final var o = new GetLaunchTemplateNetworkInterface();
            o.associateCarrierIpAddress = associateCarrierIpAddress;
            o.associatePublicIpAddress = associatePublicIpAddress;
            o.deleteOnTermination = deleteOnTermination;
            o.description = description;
            o.deviceIndex = deviceIndex;
            o.interfaceType = interfaceType;
            o.ipv4AddressCount = ipv4AddressCount;
            o.ipv4Addresses = ipv4Addresses;
            o.ipv4PrefixCount = ipv4PrefixCount;
            o.ipv4Prefixes = ipv4Prefixes;
            o.ipv6AddressCount = ipv6AddressCount;
            o.ipv6Addresses = ipv6Addresses;
            o.ipv6PrefixCount = ipv6PrefixCount;
            o.ipv6Prefixes = ipv6Prefixes;
            o.networkCardIndex = networkCardIndex;
            o.networkInterfaceId = networkInterfaceId;
            o.privateIpAddress = privateIpAddress;
            o.securityGroups = securityGroups;
            o.subnetId = subnetId;
            return o;
        }
    }
}

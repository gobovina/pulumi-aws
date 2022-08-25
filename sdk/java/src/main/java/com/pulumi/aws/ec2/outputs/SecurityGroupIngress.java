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
public final class SecurityGroupIngress {
    /**
     * @return List of CIDR blocks.
     * 
     */
    private @Nullable List<String> cidrBlocks;
    /**
     * @return Description of this egress rule.
     * 
     */
    private @Nullable String description;
    /**
     * @return Start port (or ICMP type number if protocol is `icmp`)
     * 
     */
    private Integer fromPort;
    /**
     * @return List of IPv6 CIDR blocks.
     * 
     */
    private @Nullable List<String> ipv6CidrBlocks;
    /**
     * @return List of Prefix List IDs.
     * 
     */
    private @Nullable List<String> prefixListIds;
    /**
     * @return Protocol. If you select a protocol of `-1` (semantically equivalent to `all`, which is not a valid value here), you must specify a `from_port` and `to_port` equal to 0.  The supported values are defined in the `IpProtocol` argument in the [IpPermission](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_IpPermission.html) API reference. This argument is normalized to a lowercase value.
     * 
     */
    private String protocol;
    /**
     * @return List of security group Group Names if using EC2-Classic, or Group IDs if using a VPC.
     * 
     */
    private @Nullable List<String> securityGroups;
    /**
     * @return Whether the security group itself will be added as a source to this egress rule.
     * 
     */
    private @Nullable Boolean self;
    /**
     * @return End range port (or ICMP code if protocol is `icmp`).
     * 
     */
    private Integer toPort;

    private SecurityGroupIngress() {}
    /**
     * @return List of CIDR blocks.
     * 
     */
    public List<String> cidrBlocks() {
        return this.cidrBlocks == null ? List.of() : this.cidrBlocks;
    }
    /**
     * @return Description of this egress rule.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return Start port (or ICMP type number if protocol is `icmp`)
     * 
     */
    public Integer fromPort() {
        return this.fromPort;
    }
    /**
     * @return List of IPv6 CIDR blocks.
     * 
     */
    public List<String> ipv6CidrBlocks() {
        return this.ipv6CidrBlocks == null ? List.of() : this.ipv6CidrBlocks;
    }
    /**
     * @return List of Prefix List IDs.
     * 
     */
    public List<String> prefixListIds() {
        return this.prefixListIds == null ? List.of() : this.prefixListIds;
    }
    /**
     * @return Protocol. If you select a protocol of `-1` (semantically equivalent to `all`, which is not a valid value here), you must specify a `from_port` and `to_port` equal to 0.  The supported values are defined in the `IpProtocol` argument in the [IpPermission](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_IpPermission.html) API reference. This argument is normalized to a lowercase value.
     * 
     */
    public String protocol() {
        return this.protocol;
    }
    /**
     * @return List of security group Group Names if using EC2-Classic, or Group IDs if using a VPC.
     * 
     */
    public List<String> securityGroups() {
        return this.securityGroups == null ? List.of() : this.securityGroups;
    }
    /**
     * @return Whether the security group itself will be added as a source to this egress rule.
     * 
     */
    public Optional<Boolean> self() {
        return Optional.ofNullable(this.self);
    }
    /**
     * @return End range port (or ICMP code if protocol is `icmp`).
     * 
     */
    public Integer toPort() {
        return this.toPort;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityGroupIngress defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> cidrBlocks;
        private @Nullable String description;
        private Integer fromPort;
        private @Nullable List<String> ipv6CidrBlocks;
        private @Nullable List<String> prefixListIds;
        private String protocol;
        private @Nullable List<String> securityGroups;
        private @Nullable Boolean self;
        private Integer toPort;
        public Builder() {}
        public Builder(SecurityGroupIngress defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cidrBlocks = defaults.cidrBlocks;
    	      this.description = defaults.description;
    	      this.fromPort = defaults.fromPort;
    	      this.ipv6CidrBlocks = defaults.ipv6CidrBlocks;
    	      this.prefixListIds = defaults.prefixListIds;
    	      this.protocol = defaults.protocol;
    	      this.securityGroups = defaults.securityGroups;
    	      this.self = defaults.self;
    	      this.toPort = defaults.toPort;
        }

        @CustomType.Setter
        public Builder cidrBlocks(@Nullable List<String> cidrBlocks) {
            this.cidrBlocks = cidrBlocks;
            return this;
        }
        public Builder cidrBlocks(String... cidrBlocks) {
            return cidrBlocks(List.of(cidrBlocks));
        }
        @CustomType.Setter
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder fromPort(Integer fromPort) {
            this.fromPort = Objects.requireNonNull(fromPort);
            return this;
        }
        @CustomType.Setter
        public Builder ipv6CidrBlocks(@Nullable List<String> ipv6CidrBlocks) {
            this.ipv6CidrBlocks = ipv6CidrBlocks;
            return this;
        }
        public Builder ipv6CidrBlocks(String... ipv6CidrBlocks) {
            return ipv6CidrBlocks(List.of(ipv6CidrBlocks));
        }
        @CustomType.Setter
        public Builder prefixListIds(@Nullable List<String> prefixListIds) {
            this.prefixListIds = prefixListIds;
            return this;
        }
        public Builder prefixListIds(String... prefixListIds) {
            return prefixListIds(List.of(prefixListIds));
        }
        @CustomType.Setter
        public Builder protocol(String protocol) {
            this.protocol = Objects.requireNonNull(protocol);
            return this;
        }
        @CustomType.Setter
        public Builder securityGroups(@Nullable List<String> securityGroups) {
            this.securityGroups = securityGroups;
            return this;
        }
        public Builder securityGroups(String... securityGroups) {
            return securityGroups(List.of(securityGroups));
        }
        @CustomType.Setter
        public Builder self(@Nullable Boolean self) {
            this.self = self;
            return this;
        }
        @CustomType.Setter
        public Builder toPort(Integer toPort) {
            this.toPort = Objects.requireNonNull(toPort);
            return this;
        }
        public SecurityGroupIngress build() {
            final var o = new SecurityGroupIngress();
            o.cidrBlocks = cidrBlocks;
            o.description = description;
            o.fromPort = fromPort;
            o.ipv6CidrBlocks = ipv6CidrBlocks;
            o.prefixListIds = prefixListIds;
            o.protocol = protocol;
            o.securityGroups = securityGroups;
            o.self = self;
            o.toPort = toPort;
            return o;
        }
    }
}

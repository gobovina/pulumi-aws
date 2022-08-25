// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class NetworkAclEgress {
    /**
     * @return The action to take.
     * 
     */
    private String action;
    /**
     * @return The CIDR block to match. This must be a
     * valid network mask.
     * 
     */
    private @Nullable String cidrBlock;
    /**
     * @return The from port to match.
     * 
     */
    private Integer fromPort;
    /**
     * @return The ICMP type code to be used. Default 0.
     * 
     */
    private @Nullable Integer icmpCode;
    /**
     * @return The ICMP type to be used. Default 0.
     * 
     */
    private @Nullable Integer icmpType;
    /**
     * @return The IPv6 CIDR block.
     * 
     */
    private @Nullable String ipv6CidrBlock;
    /**
     * @return The protocol to match. If using the -1 &#39;all&#39;
     * protocol, you must specify a from and to port of 0.
     * 
     */
    private String protocol;
    /**
     * @return The rule number. Used for ordering.
     * 
     */
    private Integer ruleNo;
    /**
     * @return The to port to match.
     * 
     */
    private Integer toPort;

    private NetworkAclEgress() {}
    /**
     * @return The action to take.
     * 
     */
    public String action() {
        return this.action;
    }
    /**
     * @return The CIDR block to match. This must be a
     * valid network mask.
     * 
     */
    public Optional<String> cidrBlock() {
        return Optional.ofNullable(this.cidrBlock);
    }
    /**
     * @return The from port to match.
     * 
     */
    public Integer fromPort() {
        return this.fromPort;
    }
    /**
     * @return The ICMP type code to be used. Default 0.
     * 
     */
    public Optional<Integer> icmpCode() {
        return Optional.ofNullable(this.icmpCode);
    }
    /**
     * @return The ICMP type to be used. Default 0.
     * 
     */
    public Optional<Integer> icmpType() {
        return Optional.ofNullable(this.icmpType);
    }
    /**
     * @return The IPv6 CIDR block.
     * 
     */
    public Optional<String> ipv6CidrBlock() {
        return Optional.ofNullable(this.ipv6CidrBlock);
    }
    /**
     * @return The protocol to match. If using the -1 &#39;all&#39;
     * protocol, you must specify a from and to port of 0.
     * 
     */
    public String protocol() {
        return this.protocol;
    }
    /**
     * @return The rule number. Used for ordering.
     * 
     */
    public Integer ruleNo() {
        return this.ruleNo;
    }
    /**
     * @return The to port to match.
     * 
     */
    public Integer toPort() {
        return this.toPort;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkAclEgress defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String action;
        private @Nullable String cidrBlock;
        private Integer fromPort;
        private @Nullable Integer icmpCode;
        private @Nullable Integer icmpType;
        private @Nullable String ipv6CidrBlock;
        private String protocol;
        private Integer ruleNo;
        private Integer toPort;
        public Builder() {}
        public Builder(NetworkAclEgress defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.cidrBlock = defaults.cidrBlock;
    	      this.fromPort = defaults.fromPort;
    	      this.icmpCode = defaults.icmpCode;
    	      this.icmpType = defaults.icmpType;
    	      this.ipv6CidrBlock = defaults.ipv6CidrBlock;
    	      this.protocol = defaults.protocol;
    	      this.ruleNo = defaults.ruleNo;
    	      this.toPort = defaults.toPort;
        }

        @CustomType.Setter
        public Builder action(String action) {
            this.action = Objects.requireNonNull(action);
            return this;
        }
        @CustomType.Setter
        public Builder cidrBlock(@Nullable String cidrBlock) {
            this.cidrBlock = cidrBlock;
            return this;
        }
        @CustomType.Setter
        public Builder fromPort(Integer fromPort) {
            this.fromPort = Objects.requireNonNull(fromPort);
            return this;
        }
        @CustomType.Setter
        public Builder icmpCode(@Nullable Integer icmpCode) {
            this.icmpCode = icmpCode;
            return this;
        }
        @CustomType.Setter
        public Builder icmpType(@Nullable Integer icmpType) {
            this.icmpType = icmpType;
            return this;
        }
        @CustomType.Setter
        public Builder ipv6CidrBlock(@Nullable String ipv6CidrBlock) {
            this.ipv6CidrBlock = ipv6CidrBlock;
            return this;
        }
        @CustomType.Setter
        public Builder protocol(String protocol) {
            this.protocol = Objects.requireNonNull(protocol);
            return this;
        }
        @CustomType.Setter
        public Builder ruleNo(Integer ruleNo) {
            this.ruleNo = Objects.requireNonNull(ruleNo);
            return this;
        }
        @CustomType.Setter
        public Builder toPort(Integer toPort) {
            this.toPort = Objects.requireNonNull(toPort);
            return this;
        }
        public NetworkAclEgress build() {
            final var o = new NetworkAclEgress();
            o.action = action;
            o.cidrBlock = cidrBlock;
            o.fromPort = fromPort;
            o.icmpCode = icmpCode;
            o.icmpType = icmpType;
            o.ipv6CidrBlock = ipv6CidrBlock;
            o.protocol = protocol;
            o.ruleNo = ruleNo;
            o.toPort = toPort;
            return o;
        }
    }
}

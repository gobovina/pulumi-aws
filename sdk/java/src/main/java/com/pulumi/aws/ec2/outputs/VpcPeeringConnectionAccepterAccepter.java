// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VpcPeeringConnectionAccepterAccepter {
    /**
     * @return Indicates whether a local ClassicLink connection can communicate
     * with the peer VPC over the VPC Peering Connection.
     * 
     * @deprecated
     * With the retirement of EC2-Classic the allow_classic_link_to_remote_vpc attribute has been deprecated and will be removed in a future version.
     * 
     */
    @Deprecated /* With the retirement of EC2-Classic the allow_classic_link_to_remote_vpc attribute has been deprecated and will be removed in a future version. */
    private @Nullable Boolean allowClassicLinkToRemoteVpc;
    /**
     * @return Indicates whether a local VPC can resolve public DNS hostnames to
     * private IP addresses when queried from instances in a peer VPC.
     * 
     */
    private @Nullable Boolean allowRemoteVpcDnsResolution;
    /**
     * @return Indicates whether a local VPC can communicate with a ClassicLink
     * connection in the peer VPC over the VPC Peering Connection.
     * 
     * @deprecated
     * With the retirement of EC2-Classic the allow_vpc_to_remote_classic_link attribute has been deprecated and will be removed in a future version.
     * 
     */
    @Deprecated /* With the retirement of EC2-Classic the allow_vpc_to_remote_classic_link attribute has been deprecated and will be removed in a future version. */
    private @Nullable Boolean allowVpcToRemoteClassicLink;

    private VpcPeeringConnectionAccepterAccepter() {}
    /**
     * @return Indicates whether a local ClassicLink connection can communicate
     * with the peer VPC over the VPC Peering Connection.
     * 
     * @deprecated
     * With the retirement of EC2-Classic the allow_classic_link_to_remote_vpc attribute has been deprecated and will be removed in a future version.
     * 
     */
    @Deprecated /* With the retirement of EC2-Classic the allow_classic_link_to_remote_vpc attribute has been deprecated and will be removed in a future version. */
    public Optional<Boolean> allowClassicLinkToRemoteVpc() {
        return Optional.ofNullable(this.allowClassicLinkToRemoteVpc);
    }
    /**
     * @return Indicates whether a local VPC can resolve public DNS hostnames to
     * private IP addresses when queried from instances in a peer VPC.
     * 
     */
    public Optional<Boolean> allowRemoteVpcDnsResolution() {
        return Optional.ofNullable(this.allowRemoteVpcDnsResolution);
    }
    /**
     * @return Indicates whether a local VPC can communicate with a ClassicLink
     * connection in the peer VPC over the VPC Peering Connection.
     * 
     * @deprecated
     * With the retirement of EC2-Classic the allow_vpc_to_remote_classic_link attribute has been deprecated and will be removed in a future version.
     * 
     */
    @Deprecated /* With the retirement of EC2-Classic the allow_vpc_to_remote_classic_link attribute has been deprecated and will be removed in a future version. */
    public Optional<Boolean> allowVpcToRemoteClassicLink() {
        return Optional.ofNullable(this.allowVpcToRemoteClassicLink);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VpcPeeringConnectionAccepterAccepter defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean allowClassicLinkToRemoteVpc;
        private @Nullable Boolean allowRemoteVpcDnsResolution;
        private @Nullable Boolean allowVpcToRemoteClassicLink;
        public Builder() {}
        public Builder(VpcPeeringConnectionAccepterAccepter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowClassicLinkToRemoteVpc = defaults.allowClassicLinkToRemoteVpc;
    	      this.allowRemoteVpcDnsResolution = defaults.allowRemoteVpcDnsResolution;
    	      this.allowVpcToRemoteClassicLink = defaults.allowVpcToRemoteClassicLink;
        }

        @CustomType.Setter
        public Builder allowClassicLinkToRemoteVpc(@Nullable Boolean allowClassicLinkToRemoteVpc) {
            this.allowClassicLinkToRemoteVpc = allowClassicLinkToRemoteVpc;
            return this;
        }
        @CustomType.Setter
        public Builder allowRemoteVpcDnsResolution(@Nullable Boolean allowRemoteVpcDnsResolution) {
            this.allowRemoteVpcDnsResolution = allowRemoteVpcDnsResolution;
            return this;
        }
        @CustomType.Setter
        public Builder allowVpcToRemoteClassicLink(@Nullable Boolean allowVpcToRemoteClassicLink) {
            this.allowVpcToRemoteClassicLink = allowVpcToRemoteClassicLink;
            return this;
        }
        public VpcPeeringConnectionAccepterAccepter build() {
            final var o = new VpcPeeringConnectionAccepterAccepter();
            o.allowClassicLinkToRemoteVpc = allowClassicLinkToRemoteVpc;
            o.allowRemoteVpcDnsResolution = allowRemoteVpcDnsResolution;
            o.allowVpcToRemoteClassicLink = allowVpcToRemoteClassicLink;
            return o;
        }
    }
}

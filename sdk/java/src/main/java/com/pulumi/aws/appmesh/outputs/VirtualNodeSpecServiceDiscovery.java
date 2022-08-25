// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.outputs;

import com.pulumi.aws.appmesh.outputs.VirtualNodeSpecServiceDiscoveryAwsCloudMap;
import com.pulumi.aws.appmesh.outputs.VirtualNodeSpecServiceDiscoveryDns;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VirtualNodeSpecServiceDiscovery {
    /**
     * @return Specifies any AWS Cloud Map information for the virtual node.
     * 
     */
    private @Nullable VirtualNodeSpecServiceDiscoveryAwsCloudMap awsCloudMap;
    /**
     * @return Specifies the DNS service name for the virtual node.
     * 
     */
    private @Nullable VirtualNodeSpecServiceDiscoveryDns dns;

    private VirtualNodeSpecServiceDiscovery() {}
    /**
     * @return Specifies any AWS Cloud Map information for the virtual node.
     * 
     */
    public Optional<VirtualNodeSpecServiceDiscoveryAwsCloudMap> awsCloudMap() {
        return Optional.ofNullable(this.awsCloudMap);
    }
    /**
     * @return Specifies the DNS service name for the virtual node.
     * 
     */
    public Optional<VirtualNodeSpecServiceDiscoveryDns> dns() {
        return Optional.ofNullable(this.dns);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNodeSpecServiceDiscovery defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable VirtualNodeSpecServiceDiscoveryAwsCloudMap awsCloudMap;
        private @Nullable VirtualNodeSpecServiceDiscoveryDns dns;
        public Builder() {}
        public Builder(VirtualNodeSpecServiceDiscovery defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.awsCloudMap = defaults.awsCloudMap;
    	      this.dns = defaults.dns;
        }

        @CustomType.Setter
        public Builder awsCloudMap(@Nullable VirtualNodeSpecServiceDiscoveryAwsCloudMap awsCloudMap) {
            this.awsCloudMap = awsCloudMap;
            return this;
        }
        @CustomType.Setter
        public Builder dns(@Nullable VirtualNodeSpecServiceDiscoveryDns dns) {
            this.dns = dns;
            return this;
        }
        public VirtualNodeSpecServiceDiscovery build() {
            final var o = new VirtualNodeSpecServiceDiscovery();
            o.awsCloudMap = awsCloudMap;
            o.dns = dns;
            return o;
        }
    }
}

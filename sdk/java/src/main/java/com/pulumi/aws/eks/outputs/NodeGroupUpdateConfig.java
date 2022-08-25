// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.eks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class NodeGroupUpdateConfig {
    /**
     * @return Desired max number of unavailable worker nodes during node group update.
     * 
     */
    private @Nullable Integer maxUnavailable;
    /**
     * @return Desired max percentage of unavailable worker nodes during node group update.
     * 
     */
    private @Nullable Integer maxUnavailablePercentage;

    private NodeGroupUpdateConfig() {}
    /**
     * @return Desired max number of unavailable worker nodes during node group update.
     * 
     */
    public Optional<Integer> maxUnavailable() {
        return Optional.ofNullable(this.maxUnavailable);
    }
    /**
     * @return Desired max percentage of unavailable worker nodes during node group update.
     * 
     */
    public Optional<Integer> maxUnavailablePercentage() {
        return Optional.ofNullable(this.maxUnavailablePercentage);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodeGroupUpdateConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer maxUnavailable;
        private @Nullable Integer maxUnavailablePercentage;
        public Builder() {}
        public Builder(NodeGroupUpdateConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxUnavailable = defaults.maxUnavailable;
    	      this.maxUnavailablePercentage = defaults.maxUnavailablePercentage;
        }

        @CustomType.Setter
        public Builder maxUnavailable(@Nullable Integer maxUnavailable) {
            this.maxUnavailable = maxUnavailable;
            return this;
        }
        @CustomType.Setter
        public Builder maxUnavailablePercentage(@Nullable Integer maxUnavailablePercentage) {
            this.maxUnavailablePercentage = maxUnavailablePercentage;
            return this;
        }
        public NodeGroupUpdateConfig build() {
            final var o = new NodeGroupUpdateConfig();
            o.maxUnavailable = maxUnavailable;
            o.maxUnavailablePercentage = maxUnavailablePercentage;
            return o;
        }
    }
}

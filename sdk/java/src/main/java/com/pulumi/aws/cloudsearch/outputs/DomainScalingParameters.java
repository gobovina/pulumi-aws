// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudsearch.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DomainScalingParameters {
    /**
     * @return The instance type that you want to preconfigure for your domain. See the [AWS documentation](https://docs.aws.amazon.com/cloudsearch/latest/developerguide/API_ScalingParameters.html) for valid values.
     * 
     */
    private @Nullable String desiredInstanceType;
    /**
     * @return The number of partitions you want to preconfigure for your domain. Only valid when you select `search.2xlarge` as the instance type.
     * 
     */
    private @Nullable Integer desiredPartitionCount;
    /**
     * @return The number of replicas you want to preconfigure for each index partition.
     * 
     */
    private @Nullable Integer desiredReplicationCount;

    private DomainScalingParameters() {}
    /**
     * @return The instance type that you want to preconfigure for your domain. See the [AWS documentation](https://docs.aws.amazon.com/cloudsearch/latest/developerguide/API_ScalingParameters.html) for valid values.
     * 
     */
    public Optional<String> desiredInstanceType() {
        return Optional.ofNullable(this.desiredInstanceType);
    }
    /**
     * @return The number of partitions you want to preconfigure for your domain. Only valid when you select `search.2xlarge` as the instance type.
     * 
     */
    public Optional<Integer> desiredPartitionCount() {
        return Optional.ofNullable(this.desiredPartitionCount);
    }
    /**
     * @return The number of replicas you want to preconfigure for each index partition.
     * 
     */
    public Optional<Integer> desiredReplicationCount() {
        return Optional.ofNullable(this.desiredReplicationCount);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainScalingParameters defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String desiredInstanceType;
        private @Nullable Integer desiredPartitionCount;
        private @Nullable Integer desiredReplicationCount;
        public Builder() {}
        public Builder(DomainScalingParameters defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.desiredInstanceType = defaults.desiredInstanceType;
    	      this.desiredPartitionCount = defaults.desiredPartitionCount;
    	      this.desiredReplicationCount = defaults.desiredReplicationCount;
        }

        @CustomType.Setter
        public Builder desiredInstanceType(@Nullable String desiredInstanceType) {
            this.desiredInstanceType = desiredInstanceType;
            return this;
        }
        @CustomType.Setter
        public Builder desiredPartitionCount(@Nullable Integer desiredPartitionCount) {
            this.desiredPartitionCount = desiredPartitionCount;
            return this;
        }
        @CustomType.Setter
        public Builder desiredReplicationCount(@Nullable Integer desiredReplicationCount) {
            this.desiredReplicationCount = desiredReplicationCount;
            return this;
        }
        public DomainScalingParameters build() {
            final var o = new DomainScalingParameters();
            o.desiredInstanceType = desiredInstanceType;
            o.desiredPartitionCount = desiredPartitionCount;
            o.desiredReplicationCount = desiredReplicationCount;
            return o;
        }
    }
}

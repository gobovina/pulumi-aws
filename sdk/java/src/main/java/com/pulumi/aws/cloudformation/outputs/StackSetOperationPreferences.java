// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudformation.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class StackSetOperationPreferences {
    /**
     * @return The number of accounts, per Region, for which this operation can fail before AWS CloudFormation stops the operation in that Region.
     * 
     */
    private @Nullable Integer failureToleranceCount;
    /**
     * @return The percentage of accounts, per Region, for which this stack operation can fail before AWS CloudFormation stops the operation in that Region.
     * 
     */
    private @Nullable Integer failureTolerancePercentage;
    /**
     * @return The maximum number of accounts in which to perform this operation at one time.
     * 
     */
    private @Nullable Integer maxConcurrentCount;
    /**
     * @return The maximum percentage of accounts in which to perform this operation at one time.
     * 
     */
    private @Nullable Integer maxConcurrentPercentage;
    /**
     * @return The concurrency type of deploying StackSets operations in Regions, could be in parallel or one Region at a time.
     * 
     */
    private @Nullable String regionConcurrencyType;
    /**
     * @return The order of the Regions in where you want to perform the stack operation.
     * 
     */
    private @Nullable List<String> regionOrders;

    private StackSetOperationPreferences() {}
    /**
     * @return The number of accounts, per Region, for which this operation can fail before AWS CloudFormation stops the operation in that Region.
     * 
     */
    public Optional<Integer> failureToleranceCount() {
        return Optional.ofNullable(this.failureToleranceCount);
    }
    /**
     * @return The percentage of accounts, per Region, for which this stack operation can fail before AWS CloudFormation stops the operation in that Region.
     * 
     */
    public Optional<Integer> failureTolerancePercentage() {
        return Optional.ofNullable(this.failureTolerancePercentage);
    }
    /**
     * @return The maximum number of accounts in which to perform this operation at one time.
     * 
     */
    public Optional<Integer> maxConcurrentCount() {
        return Optional.ofNullable(this.maxConcurrentCount);
    }
    /**
     * @return The maximum percentage of accounts in which to perform this operation at one time.
     * 
     */
    public Optional<Integer> maxConcurrentPercentage() {
        return Optional.ofNullable(this.maxConcurrentPercentage);
    }
    /**
     * @return The concurrency type of deploying StackSets operations in Regions, could be in parallel or one Region at a time.
     * 
     */
    public Optional<String> regionConcurrencyType() {
        return Optional.ofNullable(this.regionConcurrencyType);
    }
    /**
     * @return The order of the Regions in where you want to perform the stack operation.
     * 
     */
    public List<String> regionOrders() {
        return this.regionOrders == null ? List.of() : this.regionOrders;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StackSetOperationPreferences defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer failureToleranceCount;
        private @Nullable Integer failureTolerancePercentage;
        private @Nullable Integer maxConcurrentCount;
        private @Nullable Integer maxConcurrentPercentage;
        private @Nullable String regionConcurrencyType;
        private @Nullable List<String> regionOrders;
        public Builder() {}
        public Builder(StackSetOperationPreferences defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.failureToleranceCount = defaults.failureToleranceCount;
    	      this.failureTolerancePercentage = defaults.failureTolerancePercentage;
    	      this.maxConcurrentCount = defaults.maxConcurrentCount;
    	      this.maxConcurrentPercentage = defaults.maxConcurrentPercentage;
    	      this.regionConcurrencyType = defaults.regionConcurrencyType;
    	      this.regionOrders = defaults.regionOrders;
        }

        @CustomType.Setter
        public Builder failureToleranceCount(@Nullable Integer failureToleranceCount) {
            this.failureToleranceCount = failureToleranceCount;
            return this;
        }
        @CustomType.Setter
        public Builder failureTolerancePercentage(@Nullable Integer failureTolerancePercentage) {
            this.failureTolerancePercentage = failureTolerancePercentage;
            return this;
        }
        @CustomType.Setter
        public Builder maxConcurrentCount(@Nullable Integer maxConcurrentCount) {
            this.maxConcurrentCount = maxConcurrentCount;
            return this;
        }
        @CustomType.Setter
        public Builder maxConcurrentPercentage(@Nullable Integer maxConcurrentPercentage) {
            this.maxConcurrentPercentage = maxConcurrentPercentage;
            return this;
        }
        @CustomType.Setter
        public Builder regionConcurrencyType(@Nullable String regionConcurrencyType) {
            this.regionConcurrencyType = regionConcurrencyType;
            return this;
        }
        @CustomType.Setter
        public Builder regionOrders(@Nullable List<String> regionOrders) {
            this.regionOrders = regionOrders;
            return this;
        }
        public Builder regionOrders(String... regionOrders) {
            return regionOrders(List.of(regionOrders));
        }
        public StackSetOperationPreferences build() {
            final var o = new StackSetOperationPreferences();
            o.failureToleranceCount = failureToleranceCount;
            o.failureTolerancePercentage = failureTolerancePercentage;
            o.maxConcurrentCount = maxConcurrentCount;
            o.maxConcurrentPercentage = maxConcurrentPercentage;
            o.regionConcurrencyType = regionConcurrencyType;
            o.regionOrders = regionOrders;
            return o;
        }
    }
}

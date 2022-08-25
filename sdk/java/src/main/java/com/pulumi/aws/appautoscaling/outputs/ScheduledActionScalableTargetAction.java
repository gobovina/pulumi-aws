// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appautoscaling.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ScheduledActionScalableTargetAction {
    /**
     * @return The maximum capacity. At least one of `max_capacity` or `min_capacity` must be set.
     * 
     */
    private @Nullable Integer maxCapacity;
    /**
     * @return The minimum capacity. At least one of `min_capacity` or `max_capacity` must be set.
     * 
     */
    private @Nullable Integer minCapacity;

    private ScheduledActionScalableTargetAction() {}
    /**
     * @return The maximum capacity. At least one of `max_capacity` or `min_capacity` must be set.
     * 
     */
    public Optional<Integer> maxCapacity() {
        return Optional.ofNullable(this.maxCapacity);
    }
    /**
     * @return The minimum capacity. At least one of `min_capacity` or `max_capacity` must be set.
     * 
     */
    public Optional<Integer> minCapacity() {
        return Optional.ofNullable(this.minCapacity);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScheduledActionScalableTargetAction defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer maxCapacity;
        private @Nullable Integer minCapacity;
        public Builder() {}
        public Builder(ScheduledActionScalableTargetAction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxCapacity = defaults.maxCapacity;
    	      this.minCapacity = defaults.minCapacity;
        }

        @CustomType.Setter
        public Builder maxCapacity(@Nullable Integer maxCapacity) {
            this.maxCapacity = maxCapacity;
            return this;
        }
        @CustomType.Setter
        public Builder minCapacity(@Nullable Integer minCapacity) {
            this.minCapacity = minCapacity;
            return this;
        }
        public ScheduledActionScalableTargetAction build() {
            final var o = new ScheduledActionScalableTargetAction();
            o.maxCapacity = maxCapacity;
            o.minCapacity = minCapacity;
            return o;
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.autoscaling.outputs;

import com.pulumi.aws.autoscaling.outputs.GroupWarmPoolInstanceReusePolicy;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GroupWarmPool {
    /**
     * @return Indicates whether instances in the Auto Scaling group can be returned to the warm pool on scale in. The default is to terminate instances in the Auto Scaling group when the group scales in.
     * 
     */
    private @Nullable GroupWarmPoolInstanceReusePolicy instanceReusePolicy;
    /**
     * @return Specifies the total maximum number of instances that are allowed to be in the warm pool or in any state except Terminated for the Auto Scaling group.
     * 
     */
    private @Nullable Integer maxGroupPreparedCapacity;
    /**
     * @return Specifies the minimum number of instances to maintain in the warm pool. This helps you to ensure that there is always a certain number of warmed instances available to handle traffic spikes. Defaults to 0 if not specified.
     * 
     */
    private @Nullable Integer minSize;
    /**
     * @return Sets the instance state to transition to after the lifecycle hooks finish. Valid values are: Stopped (default), Running or Hibernated.
     * 
     */
    private @Nullable String poolState;

    private GroupWarmPool() {}
    /**
     * @return Indicates whether instances in the Auto Scaling group can be returned to the warm pool on scale in. The default is to terminate instances in the Auto Scaling group when the group scales in.
     * 
     */
    public Optional<GroupWarmPoolInstanceReusePolicy> instanceReusePolicy() {
        return Optional.ofNullable(this.instanceReusePolicy);
    }
    /**
     * @return Specifies the total maximum number of instances that are allowed to be in the warm pool or in any state except Terminated for the Auto Scaling group.
     * 
     */
    public Optional<Integer> maxGroupPreparedCapacity() {
        return Optional.ofNullable(this.maxGroupPreparedCapacity);
    }
    /**
     * @return Specifies the minimum number of instances to maintain in the warm pool. This helps you to ensure that there is always a certain number of warmed instances available to handle traffic spikes. Defaults to 0 if not specified.
     * 
     */
    public Optional<Integer> minSize() {
        return Optional.ofNullable(this.minSize);
    }
    /**
     * @return Sets the instance state to transition to after the lifecycle hooks finish. Valid values are: Stopped (default), Running or Hibernated.
     * 
     */
    public Optional<String> poolState() {
        return Optional.ofNullable(this.poolState);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GroupWarmPool defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable GroupWarmPoolInstanceReusePolicy instanceReusePolicy;
        private @Nullable Integer maxGroupPreparedCapacity;
        private @Nullable Integer minSize;
        private @Nullable String poolState;
        public Builder() {}
        public Builder(GroupWarmPool defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instanceReusePolicy = defaults.instanceReusePolicy;
    	      this.maxGroupPreparedCapacity = defaults.maxGroupPreparedCapacity;
    	      this.minSize = defaults.minSize;
    	      this.poolState = defaults.poolState;
        }

        @CustomType.Setter
        public Builder instanceReusePolicy(@Nullable GroupWarmPoolInstanceReusePolicy instanceReusePolicy) {
            this.instanceReusePolicy = instanceReusePolicy;
            return this;
        }
        @CustomType.Setter
        public Builder maxGroupPreparedCapacity(@Nullable Integer maxGroupPreparedCapacity) {
            this.maxGroupPreparedCapacity = maxGroupPreparedCapacity;
            return this;
        }
        @CustomType.Setter
        public Builder minSize(@Nullable Integer minSize) {
            this.minSize = minSize;
            return this;
        }
        @CustomType.Setter
        public Builder poolState(@Nullable String poolState) {
            this.poolState = poolState;
            return this;
        }
        public GroupWarmPool build() {
            final var o = new GroupWarmPool();
            o.instanceReusePolicy = instanceReusePolicy;
            o.maxGroupPreparedCapacity = maxGroupPreparedCapacity;
            o.minSize = minSize;
            o.poolState = poolState;
            return o;
        }
    }
}

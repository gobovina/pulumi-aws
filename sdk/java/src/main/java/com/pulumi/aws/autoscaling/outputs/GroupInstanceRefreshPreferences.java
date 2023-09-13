// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.autoscaling.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GroupInstanceRefreshPreferences {
    /**
     * @return Automatically rollback if instance refresh fails. Defaults to `false`. This option may only be set to `true` when specifying a `launch_template` or `mixed_instances_policy`.
     * 
     */
    private @Nullable Boolean autoRollback;
    /**
     * @return Number of seconds to wait after a checkpoint. Defaults to `3600`.
     * 
     */
    private @Nullable String checkpointDelay;
    /**
     * @return List of percentages for each checkpoint. Values must be unique and in ascending order. To replace all instances, the final number must be `100`.
     * 
     */
    private @Nullable List<Integer> checkpointPercentages;
    /**
     * @return Number of seconds until a newly launched instance is configured and ready to use. Default behavior is to use the Auto Scaling Group&#39;s health check grace period.
     * 
     */
    private @Nullable String instanceWarmup;
    /**
     * @return Amount of capacity in the Auto Scaling group that must remain healthy during an instance refresh to allow the operation to continue, as a percentage of the desired capacity of the Auto Scaling group. Defaults to `90`.
     * 
     */
    private @Nullable Integer minHealthyPercentage;
    /**
     * @return Behavior when encountering instances protected from scale in are found. Available behaviors are `Refresh`, `Ignore`, and `Wait`. Default is `Ignore`.
     * 
     */
    private @Nullable String scaleInProtectedInstances;
    /**
     * @return Replace instances that already have your desired configuration. Defaults to `false`.
     * 
     */
    private @Nullable Boolean skipMatching;
    /**
     * @return Behavior when encountering instances in the `Standby` state in are found. Available behaviors are `Terminate`, `Ignore`, and `Wait`. Default is `Ignore`.
     * 
     */
    private @Nullable String standbyInstances;

    private GroupInstanceRefreshPreferences() {}
    /**
     * @return Automatically rollback if instance refresh fails. Defaults to `false`. This option may only be set to `true` when specifying a `launch_template` or `mixed_instances_policy`.
     * 
     */
    public Optional<Boolean> autoRollback() {
        return Optional.ofNullable(this.autoRollback);
    }
    /**
     * @return Number of seconds to wait after a checkpoint. Defaults to `3600`.
     * 
     */
    public Optional<String> checkpointDelay() {
        return Optional.ofNullable(this.checkpointDelay);
    }
    /**
     * @return List of percentages for each checkpoint. Values must be unique and in ascending order. To replace all instances, the final number must be `100`.
     * 
     */
    public List<Integer> checkpointPercentages() {
        return this.checkpointPercentages == null ? List.of() : this.checkpointPercentages;
    }
    /**
     * @return Number of seconds until a newly launched instance is configured and ready to use. Default behavior is to use the Auto Scaling Group&#39;s health check grace period.
     * 
     */
    public Optional<String> instanceWarmup() {
        return Optional.ofNullable(this.instanceWarmup);
    }
    /**
     * @return Amount of capacity in the Auto Scaling group that must remain healthy during an instance refresh to allow the operation to continue, as a percentage of the desired capacity of the Auto Scaling group. Defaults to `90`.
     * 
     */
    public Optional<Integer> minHealthyPercentage() {
        return Optional.ofNullable(this.minHealthyPercentage);
    }
    /**
     * @return Behavior when encountering instances protected from scale in are found. Available behaviors are `Refresh`, `Ignore`, and `Wait`. Default is `Ignore`.
     * 
     */
    public Optional<String> scaleInProtectedInstances() {
        return Optional.ofNullable(this.scaleInProtectedInstances);
    }
    /**
     * @return Replace instances that already have your desired configuration. Defaults to `false`.
     * 
     */
    public Optional<Boolean> skipMatching() {
        return Optional.ofNullable(this.skipMatching);
    }
    /**
     * @return Behavior when encountering instances in the `Standby` state in are found. Available behaviors are `Terminate`, `Ignore`, and `Wait`. Default is `Ignore`.
     * 
     */
    public Optional<String> standbyInstances() {
        return Optional.ofNullable(this.standbyInstances);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GroupInstanceRefreshPreferences defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean autoRollback;
        private @Nullable String checkpointDelay;
        private @Nullable List<Integer> checkpointPercentages;
        private @Nullable String instanceWarmup;
        private @Nullable Integer minHealthyPercentage;
        private @Nullable String scaleInProtectedInstances;
        private @Nullable Boolean skipMatching;
        private @Nullable String standbyInstances;
        public Builder() {}
        public Builder(GroupInstanceRefreshPreferences defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoRollback = defaults.autoRollback;
    	      this.checkpointDelay = defaults.checkpointDelay;
    	      this.checkpointPercentages = defaults.checkpointPercentages;
    	      this.instanceWarmup = defaults.instanceWarmup;
    	      this.minHealthyPercentage = defaults.minHealthyPercentage;
    	      this.scaleInProtectedInstances = defaults.scaleInProtectedInstances;
    	      this.skipMatching = defaults.skipMatching;
    	      this.standbyInstances = defaults.standbyInstances;
        }

        @CustomType.Setter
        public Builder autoRollback(@Nullable Boolean autoRollback) {
            this.autoRollback = autoRollback;
            return this;
        }
        @CustomType.Setter
        public Builder checkpointDelay(@Nullable String checkpointDelay) {
            this.checkpointDelay = checkpointDelay;
            return this;
        }
        @CustomType.Setter
        public Builder checkpointPercentages(@Nullable List<Integer> checkpointPercentages) {
            this.checkpointPercentages = checkpointPercentages;
            return this;
        }
        public Builder checkpointPercentages(Integer... checkpointPercentages) {
            return checkpointPercentages(List.of(checkpointPercentages));
        }
        @CustomType.Setter
        public Builder instanceWarmup(@Nullable String instanceWarmup) {
            this.instanceWarmup = instanceWarmup;
            return this;
        }
        @CustomType.Setter
        public Builder minHealthyPercentage(@Nullable Integer minHealthyPercentage) {
            this.minHealthyPercentage = minHealthyPercentage;
            return this;
        }
        @CustomType.Setter
        public Builder scaleInProtectedInstances(@Nullable String scaleInProtectedInstances) {
            this.scaleInProtectedInstances = scaleInProtectedInstances;
            return this;
        }
        @CustomType.Setter
        public Builder skipMatching(@Nullable Boolean skipMatching) {
            this.skipMatching = skipMatching;
            return this;
        }
        @CustomType.Setter
        public Builder standbyInstances(@Nullable String standbyInstances) {
            this.standbyInstances = standbyInstances;
            return this;
        }
        public GroupInstanceRefreshPreferences build() {
            final var o = new GroupInstanceRefreshPreferences();
            o.autoRollback = autoRollback;
            o.checkpointDelay = checkpointDelay;
            o.checkpointPercentages = checkpointPercentages;
            o.instanceWarmup = instanceWarmup;
            o.minHealthyPercentage = minHealthyPercentage;
            o.scaleInProtectedInstances = scaleInProtectedInstances;
            o.skipMatching = skipMatching;
            o.standbyInstances = standbyInstances;
            return o;
        }
    }
}

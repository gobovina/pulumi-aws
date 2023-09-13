// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.autoscaling.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GroupInstanceRefreshPreferencesArgs extends com.pulumi.resources.ResourceArgs {

    public static final GroupInstanceRefreshPreferencesArgs Empty = new GroupInstanceRefreshPreferencesArgs();

    /**
     * Automatically rollback if instance refresh fails. Defaults to `false`. This option may only be set to `true` when specifying a `launch_template` or `mixed_instances_policy`.
     * 
     */
    @Import(name="autoRollback")
    private @Nullable Output<Boolean> autoRollback;

    /**
     * @return Automatically rollback if instance refresh fails. Defaults to `false`. This option may only be set to `true` when specifying a `launch_template` or `mixed_instances_policy`.
     * 
     */
    public Optional<Output<Boolean>> autoRollback() {
        return Optional.ofNullable(this.autoRollback);
    }

    /**
     * Number of seconds to wait after a checkpoint. Defaults to `3600`.
     * 
     */
    @Import(name="checkpointDelay")
    private @Nullable Output<String> checkpointDelay;

    /**
     * @return Number of seconds to wait after a checkpoint. Defaults to `3600`.
     * 
     */
    public Optional<Output<String>> checkpointDelay() {
        return Optional.ofNullable(this.checkpointDelay);
    }

    /**
     * List of percentages for each checkpoint. Values must be unique and in ascending order. To replace all instances, the final number must be `100`.
     * 
     */
    @Import(name="checkpointPercentages")
    private @Nullable Output<List<Integer>> checkpointPercentages;

    /**
     * @return List of percentages for each checkpoint. Values must be unique and in ascending order. To replace all instances, the final number must be `100`.
     * 
     */
    public Optional<Output<List<Integer>>> checkpointPercentages() {
        return Optional.ofNullable(this.checkpointPercentages);
    }

    /**
     * Number of seconds until a newly launched instance is configured and ready to use. Default behavior is to use the Auto Scaling Group&#39;s health check grace period.
     * 
     */
    @Import(name="instanceWarmup")
    private @Nullable Output<String> instanceWarmup;

    /**
     * @return Number of seconds until a newly launched instance is configured and ready to use. Default behavior is to use the Auto Scaling Group&#39;s health check grace period.
     * 
     */
    public Optional<Output<String>> instanceWarmup() {
        return Optional.ofNullable(this.instanceWarmup);
    }

    /**
     * Amount of capacity in the Auto Scaling group that must remain healthy during an instance refresh to allow the operation to continue, as a percentage of the desired capacity of the Auto Scaling group. Defaults to `90`.
     * 
     */
    @Import(name="minHealthyPercentage")
    private @Nullable Output<Integer> minHealthyPercentage;

    /**
     * @return Amount of capacity in the Auto Scaling group that must remain healthy during an instance refresh to allow the operation to continue, as a percentage of the desired capacity of the Auto Scaling group. Defaults to `90`.
     * 
     */
    public Optional<Output<Integer>> minHealthyPercentage() {
        return Optional.ofNullable(this.minHealthyPercentage);
    }

    /**
     * Behavior when encountering instances protected from scale in are found. Available behaviors are `Refresh`, `Ignore`, and `Wait`. Default is `Ignore`.
     * 
     */
    @Import(name="scaleInProtectedInstances")
    private @Nullable Output<String> scaleInProtectedInstances;

    /**
     * @return Behavior when encountering instances protected from scale in are found. Available behaviors are `Refresh`, `Ignore`, and `Wait`. Default is `Ignore`.
     * 
     */
    public Optional<Output<String>> scaleInProtectedInstances() {
        return Optional.ofNullable(this.scaleInProtectedInstances);
    }

    /**
     * Replace instances that already have your desired configuration. Defaults to `false`.
     * 
     */
    @Import(name="skipMatching")
    private @Nullable Output<Boolean> skipMatching;

    /**
     * @return Replace instances that already have your desired configuration. Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> skipMatching() {
        return Optional.ofNullable(this.skipMatching);
    }

    /**
     * Behavior when encountering instances in the `Standby` state in are found. Available behaviors are `Terminate`, `Ignore`, and `Wait`. Default is `Ignore`.
     * 
     */
    @Import(name="standbyInstances")
    private @Nullable Output<String> standbyInstances;

    /**
     * @return Behavior when encountering instances in the `Standby` state in are found. Available behaviors are `Terminate`, `Ignore`, and `Wait`. Default is `Ignore`.
     * 
     */
    public Optional<Output<String>> standbyInstances() {
        return Optional.ofNullable(this.standbyInstances);
    }

    private GroupInstanceRefreshPreferencesArgs() {}

    private GroupInstanceRefreshPreferencesArgs(GroupInstanceRefreshPreferencesArgs $) {
        this.autoRollback = $.autoRollback;
        this.checkpointDelay = $.checkpointDelay;
        this.checkpointPercentages = $.checkpointPercentages;
        this.instanceWarmup = $.instanceWarmup;
        this.minHealthyPercentage = $.minHealthyPercentage;
        this.scaleInProtectedInstances = $.scaleInProtectedInstances;
        this.skipMatching = $.skipMatching;
        this.standbyInstances = $.standbyInstances;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GroupInstanceRefreshPreferencesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GroupInstanceRefreshPreferencesArgs $;

        public Builder() {
            $ = new GroupInstanceRefreshPreferencesArgs();
        }

        public Builder(GroupInstanceRefreshPreferencesArgs defaults) {
            $ = new GroupInstanceRefreshPreferencesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param autoRollback Automatically rollback if instance refresh fails. Defaults to `false`. This option may only be set to `true` when specifying a `launch_template` or `mixed_instances_policy`.
         * 
         * @return builder
         * 
         */
        public Builder autoRollback(@Nullable Output<Boolean> autoRollback) {
            $.autoRollback = autoRollback;
            return this;
        }

        /**
         * @param autoRollback Automatically rollback if instance refresh fails. Defaults to `false`. This option may only be set to `true` when specifying a `launch_template` or `mixed_instances_policy`.
         * 
         * @return builder
         * 
         */
        public Builder autoRollback(Boolean autoRollback) {
            return autoRollback(Output.of(autoRollback));
        }

        /**
         * @param checkpointDelay Number of seconds to wait after a checkpoint. Defaults to `3600`.
         * 
         * @return builder
         * 
         */
        public Builder checkpointDelay(@Nullable Output<String> checkpointDelay) {
            $.checkpointDelay = checkpointDelay;
            return this;
        }

        /**
         * @param checkpointDelay Number of seconds to wait after a checkpoint. Defaults to `3600`.
         * 
         * @return builder
         * 
         */
        public Builder checkpointDelay(String checkpointDelay) {
            return checkpointDelay(Output.of(checkpointDelay));
        }

        /**
         * @param checkpointPercentages List of percentages for each checkpoint. Values must be unique and in ascending order. To replace all instances, the final number must be `100`.
         * 
         * @return builder
         * 
         */
        public Builder checkpointPercentages(@Nullable Output<List<Integer>> checkpointPercentages) {
            $.checkpointPercentages = checkpointPercentages;
            return this;
        }

        /**
         * @param checkpointPercentages List of percentages for each checkpoint. Values must be unique and in ascending order. To replace all instances, the final number must be `100`.
         * 
         * @return builder
         * 
         */
        public Builder checkpointPercentages(List<Integer> checkpointPercentages) {
            return checkpointPercentages(Output.of(checkpointPercentages));
        }

        /**
         * @param checkpointPercentages List of percentages for each checkpoint. Values must be unique and in ascending order. To replace all instances, the final number must be `100`.
         * 
         * @return builder
         * 
         */
        public Builder checkpointPercentages(Integer... checkpointPercentages) {
            return checkpointPercentages(List.of(checkpointPercentages));
        }

        /**
         * @param instanceWarmup Number of seconds until a newly launched instance is configured and ready to use. Default behavior is to use the Auto Scaling Group&#39;s health check grace period.
         * 
         * @return builder
         * 
         */
        public Builder instanceWarmup(@Nullable Output<String> instanceWarmup) {
            $.instanceWarmup = instanceWarmup;
            return this;
        }

        /**
         * @param instanceWarmup Number of seconds until a newly launched instance is configured and ready to use. Default behavior is to use the Auto Scaling Group&#39;s health check grace period.
         * 
         * @return builder
         * 
         */
        public Builder instanceWarmup(String instanceWarmup) {
            return instanceWarmup(Output.of(instanceWarmup));
        }

        /**
         * @param minHealthyPercentage Amount of capacity in the Auto Scaling group that must remain healthy during an instance refresh to allow the operation to continue, as a percentage of the desired capacity of the Auto Scaling group. Defaults to `90`.
         * 
         * @return builder
         * 
         */
        public Builder minHealthyPercentage(@Nullable Output<Integer> minHealthyPercentage) {
            $.minHealthyPercentage = minHealthyPercentage;
            return this;
        }

        /**
         * @param minHealthyPercentage Amount of capacity in the Auto Scaling group that must remain healthy during an instance refresh to allow the operation to continue, as a percentage of the desired capacity of the Auto Scaling group. Defaults to `90`.
         * 
         * @return builder
         * 
         */
        public Builder minHealthyPercentage(Integer minHealthyPercentage) {
            return minHealthyPercentage(Output.of(minHealthyPercentage));
        }

        /**
         * @param scaleInProtectedInstances Behavior when encountering instances protected from scale in are found. Available behaviors are `Refresh`, `Ignore`, and `Wait`. Default is `Ignore`.
         * 
         * @return builder
         * 
         */
        public Builder scaleInProtectedInstances(@Nullable Output<String> scaleInProtectedInstances) {
            $.scaleInProtectedInstances = scaleInProtectedInstances;
            return this;
        }

        /**
         * @param scaleInProtectedInstances Behavior when encountering instances protected from scale in are found. Available behaviors are `Refresh`, `Ignore`, and `Wait`. Default is `Ignore`.
         * 
         * @return builder
         * 
         */
        public Builder scaleInProtectedInstances(String scaleInProtectedInstances) {
            return scaleInProtectedInstances(Output.of(scaleInProtectedInstances));
        }

        /**
         * @param skipMatching Replace instances that already have your desired configuration. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder skipMatching(@Nullable Output<Boolean> skipMatching) {
            $.skipMatching = skipMatching;
            return this;
        }

        /**
         * @param skipMatching Replace instances that already have your desired configuration. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder skipMatching(Boolean skipMatching) {
            return skipMatching(Output.of(skipMatching));
        }

        /**
         * @param standbyInstances Behavior when encountering instances in the `Standby` state in are found. Available behaviors are `Terminate`, `Ignore`, and `Wait`. Default is `Ignore`.
         * 
         * @return builder
         * 
         */
        public Builder standbyInstances(@Nullable Output<String> standbyInstances) {
            $.standbyInstances = standbyInstances;
            return this;
        }

        /**
         * @param standbyInstances Behavior when encountering instances in the `Standby` state in are found. Available behaviors are `Terminate`, `Ignore`, and `Wait`. Default is `Ignore`.
         * 
         * @return builder
         * 
         */
        public Builder standbyInstances(String standbyInstances) {
            return standbyInstances(Output.of(standbyInstances));
        }

        public GroupInstanceRefreshPreferencesArgs build() {
            return $;
        }
    }

}

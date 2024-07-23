// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.dlm.outputs;

import com.pulumi.aws.dlm.outputs.LifecyclePolicyPolicyDetailsAction;
import com.pulumi.aws.dlm.outputs.LifecyclePolicyPolicyDetailsEventSource;
import com.pulumi.aws.dlm.outputs.LifecyclePolicyPolicyDetailsParameters;
import com.pulumi.aws.dlm.outputs.LifecyclePolicyPolicyDetailsSchedule;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LifecyclePolicyPolicyDetails {
    /**
     * @return The actions to be performed when the event-based policy is triggered. You can specify only one action per policy. This parameter is required for event-based policies only. If you are creating a snapshot or AMI policy, omit this parameter. See the `action` configuration block.
     * 
     */
    private @Nullable LifecyclePolicyPolicyDetailsAction action;
    /**
     * @return The event that triggers the event-based policy. This parameter is required for event-based policies only. If you are creating a snapshot or AMI policy, omit this parameter. See the `event_source` configuration block.
     * 
     */
    private @Nullable LifecyclePolicyPolicyDetailsEventSource eventSource;
    private @Nullable LifecyclePolicyPolicyDetailsParameters parameters;
    /**
     * @return The valid target resource types and actions a policy can manage. Specify `EBS_SNAPSHOT_MANAGEMENT` to create a lifecycle policy that manages the lifecycle of Amazon EBS snapshots. Specify `IMAGE_MANAGEMENT` to create a lifecycle policy that manages the lifecycle of EBS-backed AMIs. Specify `EVENT_BASED_POLICY` to create an event-based policy that performs specific actions when a defined event occurs in your AWS account. Default value is `EBS_SNAPSHOT_MANAGEMENT`.
     * 
     */
    private @Nullable String policyType;
    /**
     * @return The location of the resources to backup. If the source resources are located in an AWS Region, specify `CLOUD`. If the source resources are located on an Outpost in your account, specify `OUTPOST`. If you specify `OUTPOST`, Amazon Data Lifecycle Manager backs up all resources of the specified type with matching target tags across all of the Outposts in your account. Valid values are `CLOUD` and `OUTPOST`.
     * 
     */
    private @Nullable String resourceLocations;
    /**
     * @return A list of resource types that should be targeted by the lifecycle policy. Valid values are `VOLUME` and `INSTANCE`.
     * 
     */
    private @Nullable List<String> resourceTypes;
    /**
     * @return See the `schedule` configuration block.
     * 
     */
    private @Nullable List<LifecyclePolicyPolicyDetailsSchedule> schedules;
    /**
     * @return A map of tag keys and their values. Any resources that match the `resource_types` and are tagged with _any_ of these tags will be targeted.
     * 
     * &gt; Note: You cannot have overlapping lifecycle policies that share the same `target_tags`. Pulumi is unable to detect this at plan time but it will fail during apply.
     * 
     */
    private @Nullable Map<String,String> targetTags;

    private LifecyclePolicyPolicyDetails() {}
    /**
     * @return The actions to be performed when the event-based policy is triggered. You can specify only one action per policy. This parameter is required for event-based policies only. If you are creating a snapshot or AMI policy, omit this parameter. See the `action` configuration block.
     * 
     */
    public Optional<LifecyclePolicyPolicyDetailsAction> action() {
        return Optional.ofNullable(this.action);
    }
    /**
     * @return The event that triggers the event-based policy. This parameter is required for event-based policies only. If you are creating a snapshot or AMI policy, omit this parameter. See the `event_source` configuration block.
     * 
     */
    public Optional<LifecyclePolicyPolicyDetailsEventSource> eventSource() {
        return Optional.ofNullable(this.eventSource);
    }
    public Optional<LifecyclePolicyPolicyDetailsParameters> parameters() {
        return Optional.ofNullable(this.parameters);
    }
    /**
     * @return The valid target resource types and actions a policy can manage. Specify `EBS_SNAPSHOT_MANAGEMENT` to create a lifecycle policy that manages the lifecycle of Amazon EBS snapshots. Specify `IMAGE_MANAGEMENT` to create a lifecycle policy that manages the lifecycle of EBS-backed AMIs. Specify `EVENT_BASED_POLICY` to create an event-based policy that performs specific actions when a defined event occurs in your AWS account. Default value is `EBS_SNAPSHOT_MANAGEMENT`.
     * 
     */
    public Optional<String> policyType() {
        return Optional.ofNullable(this.policyType);
    }
    /**
     * @return The location of the resources to backup. If the source resources are located in an AWS Region, specify `CLOUD`. If the source resources are located on an Outpost in your account, specify `OUTPOST`. If you specify `OUTPOST`, Amazon Data Lifecycle Manager backs up all resources of the specified type with matching target tags across all of the Outposts in your account. Valid values are `CLOUD` and `OUTPOST`.
     * 
     */
    public Optional<String> resourceLocations() {
        return Optional.ofNullable(this.resourceLocations);
    }
    /**
     * @return A list of resource types that should be targeted by the lifecycle policy. Valid values are `VOLUME` and `INSTANCE`.
     * 
     */
    public List<String> resourceTypes() {
        return this.resourceTypes == null ? List.of() : this.resourceTypes;
    }
    /**
     * @return See the `schedule` configuration block.
     * 
     */
    public List<LifecyclePolicyPolicyDetailsSchedule> schedules() {
        return this.schedules == null ? List.of() : this.schedules;
    }
    /**
     * @return A map of tag keys and their values. Any resources that match the `resource_types` and are tagged with _any_ of these tags will be targeted.
     * 
     * &gt; Note: You cannot have overlapping lifecycle policies that share the same `target_tags`. Pulumi is unable to detect this at plan time but it will fail during apply.
     * 
     */
    public Map<String,String> targetTags() {
        return this.targetTags == null ? Map.of() : this.targetTags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LifecyclePolicyPolicyDetails defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable LifecyclePolicyPolicyDetailsAction action;
        private @Nullable LifecyclePolicyPolicyDetailsEventSource eventSource;
        private @Nullable LifecyclePolicyPolicyDetailsParameters parameters;
        private @Nullable String policyType;
        private @Nullable String resourceLocations;
        private @Nullable List<String> resourceTypes;
        private @Nullable List<LifecyclePolicyPolicyDetailsSchedule> schedules;
        private @Nullable Map<String,String> targetTags;
        public Builder() {}
        public Builder(LifecyclePolicyPolicyDetails defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.eventSource = defaults.eventSource;
    	      this.parameters = defaults.parameters;
    	      this.policyType = defaults.policyType;
    	      this.resourceLocations = defaults.resourceLocations;
    	      this.resourceTypes = defaults.resourceTypes;
    	      this.schedules = defaults.schedules;
    	      this.targetTags = defaults.targetTags;
        }

        @CustomType.Setter
        public Builder action(@Nullable LifecyclePolicyPolicyDetailsAction action) {

            this.action = action;
            return this;
        }
        @CustomType.Setter
        public Builder eventSource(@Nullable LifecyclePolicyPolicyDetailsEventSource eventSource) {

            this.eventSource = eventSource;
            return this;
        }
        @CustomType.Setter
        public Builder parameters(@Nullable LifecyclePolicyPolicyDetailsParameters parameters) {

            this.parameters = parameters;
            return this;
        }
        @CustomType.Setter
        public Builder policyType(@Nullable String policyType) {

            this.policyType = policyType;
            return this;
        }
        @CustomType.Setter
        public Builder resourceLocations(@Nullable String resourceLocations) {

            this.resourceLocations = resourceLocations;
            return this;
        }
        @CustomType.Setter
        public Builder resourceTypes(@Nullable List<String> resourceTypes) {

            this.resourceTypes = resourceTypes;
            return this;
        }
        public Builder resourceTypes(String... resourceTypes) {
            return resourceTypes(List.of(resourceTypes));
        }
        @CustomType.Setter
        public Builder schedules(@Nullable List<LifecyclePolicyPolicyDetailsSchedule> schedules) {

            this.schedules = schedules;
            return this;
        }
        public Builder schedules(LifecyclePolicyPolicyDetailsSchedule... schedules) {
            return schedules(List.of(schedules));
        }
        @CustomType.Setter
        public Builder targetTags(@Nullable Map<String,String> targetTags) {

            this.targetTags = targetTags;
            return this;
        }
        public LifecyclePolicyPolicyDetails build() {
            final var _resultValue = new LifecyclePolicyPolicyDetails();
            _resultValue.action = action;
            _resultValue.eventSource = eventSource;
            _resultValue.parameters = parameters;
            _resultValue.policyType = policyType;
            _resultValue.resourceLocations = resourceLocations;
            _resultValue.resourceTypes = resourceTypes;
            _resultValue.schedules = schedules;
            _resultValue.targetTags = targetTags;
            return _resultValue;
        }
    }
}

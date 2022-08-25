// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.outputs;

import com.pulumi.aws.ec2.outputs.SpotFleetRequestLaunchTemplateConfigOverrideInstanceRequirements;
import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SpotFleetRequestLaunchTemplateConfigOverride {
    /**
     * @return The availability zone in which to place the request.
     * 
     */
    private @Nullable String availabilityZone;
    /**
     * @return The instance requirements. See below.
     * 
     */
    private @Nullable SpotFleetRequestLaunchTemplateConfigOverrideInstanceRequirements instanceRequirements;
    /**
     * @return The type of instance to request.
     * 
     */
    private @Nullable String instanceType;
    /**
     * @return The priority for the launch template override. The lower the number, the higher the priority. If no number is set, the launch template override has the lowest priority.
     * 
     */
    private @Nullable Double priority;
    /**
     * @return The maximum spot bid for this override request.
     * 
     */
    private @Nullable String spotPrice;
    /**
     * @return The subnet in which to launch the requested instance.
     * 
     */
    private @Nullable String subnetId;
    /**
     * @return The capacity added to the fleet by a fulfilled request.
     * 
     */
    private @Nullable Double weightedCapacity;

    private SpotFleetRequestLaunchTemplateConfigOverride() {}
    /**
     * @return The availability zone in which to place the request.
     * 
     */
    public Optional<String> availabilityZone() {
        return Optional.ofNullable(this.availabilityZone);
    }
    /**
     * @return The instance requirements. See below.
     * 
     */
    public Optional<SpotFleetRequestLaunchTemplateConfigOverrideInstanceRequirements> instanceRequirements() {
        return Optional.ofNullable(this.instanceRequirements);
    }
    /**
     * @return The type of instance to request.
     * 
     */
    public Optional<String> instanceType() {
        return Optional.ofNullable(this.instanceType);
    }
    /**
     * @return The priority for the launch template override. The lower the number, the higher the priority. If no number is set, the launch template override has the lowest priority.
     * 
     */
    public Optional<Double> priority() {
        return Optional.ofNullable(this.priority);
    }
    /**
     * @return The maximum spot bid for this override request.
     * 
     */
    public Optional<String> spotPrice() {
        return Optional.ofNullable(this.spotPrice);
    }
    /**
     * @return The subnet in which to launch the requested instance.
     * 
     */
    public Optional<String> subnetId() {
        return Optional.ofNullable(this.subnetId);
    }
    /**
     * @return The capacity added to the fleet by a fulfilled request.
     * 
     */
    public Optional<Double> weightedCapacity() {
        return Optional.ofNullable(this.weightedCapacity);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SpotFleetRequestLaunchTemplateConfigOverride defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String availabilityZone;
        private @Nullable SpotFleetRequestLaunchTemplateConfigOverrideInstanceRequirements instanceRequirements;
        private @Nullable String instanceType;
        private @Nullable Double priority;
        private @Nullable String spotPrice;
        private @Nullable String subnetId;
        private @Nullable Double weightedCapacity;
        public Builder() {}
        public Builder(SpotFleetRequestLaunchTemplateConfigOverride defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availabilityZone = defaults.availabilityZone;
    	      this.instanceRequirements = defaults.instanceRequirements;
    	      this.instanceType = defaults.instanceType;
    	      this.priority = defaults.priority;
    	      this.spotPrice = defaults.spotPrice;
    	      this.subnetId = defaults.subnetId;
    	      this.weightedCapacity = defaults.weightedCapacity;
        }

        @CustomType.Setter
        public Builder availabilityZone(@Nullable String availabilityZone) {
            this.availabilityZone = availabilityZone;
            return this;
        }
        @CustomType.Setter
        public Builder instanceRequirements(@Nullable SpotFleetRequestLaunchTemplateConfigOverrideInstanceRequirements instanceRequirements) {
            this.instanceRequirements = instanceRequirements;
            return this;
        }
        @CustomType.Setter
        public Builder instanceType(@Nullable String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        @CustomType.Setter
        public Builder priority(@Nullable Double priority) {
            this.priority = priority;
            return this;
        }
        @CustomType.Setter
        public Builder spotPrice(@Nullable String spotPrice) {
            this.spotPrice = spotPrice;
            return this;
        }
        @CustomType.Setter
        public Builder subnetId(@Nullable String subnetId) {
            this.subnetId = subnetId;
            return this;
        }
        @CustomType.Setter
        public Builder weightedCapacity(@Nullable Double weightedCapacity) {
            this.weightedCapacity = weightedCapacity;
            return this;
        }
        public SpotFleetRequestLaunchTemplateConfigOverride build() {
            final var o = new SpotFleetRequestLaunchTemplateConfigOverride();
            o.availabilityZone = availabilityZone;
            o.instanceRequirements = instanceRequirements;
            o.instanceType = instanceType;
            o.priority = priority;
            o.spotPrice = spotPrice;
            o.subnetId = subnetId;
            o.weightedCapacity = weightedCapacity;
            return o;
        }
    }
}

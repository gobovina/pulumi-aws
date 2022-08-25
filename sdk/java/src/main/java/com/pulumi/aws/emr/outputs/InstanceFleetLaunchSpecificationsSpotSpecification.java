// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.emr.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class InstanceFleetLaunchSpecificationsSpotSpecification {
    /**
     * @return Specifies the strategy to use in launching Spot instance fleets. Currently, the only option is `capacity-optimized` (the default), which launches instances from Spot instance pools with optimal capacity for the number of instances that are launching.
     * 
     */
    private String allocationStrategy;
    /**
     * @return The defined duration for Spot instances (also known as Spot blocks) in minutes. When specified, the Spot instance does not terminate before the defined duration expires, and defined duration pricing for Spot instances applies. Valid values are 60, 120, 180, 240, 300, or 360. The duration period starts as soon as a Spot instance receives its instance ID. At the end of the duration, Amazon EC2 marks the Spot instance for termination and provides a Spot instance termination notice, which gives the instance a two-minute warning before it terminates.
     * 
     */
    private @Nullable Integer blockDurationMinutes;
    /**
     * @return The action to take when TargetSpotCapacity has not been fulfilled when the TimeoutDurationMinutes has expired; that is, when all Spot instances could not be provisioned within the Spot provisioning timeout. Valid values are `TERMINATE_CLUSTER` and `SWITCH_TO_ON_DEMAND`. SWITCH_TO_ON_DEMAND specifies that if no Spot instances are available, On-Demand Instances should be provisioned to fulfill any remaining Spot capacity.
     * 
     */
    private String timeoutAction;
    /**
     * @return The spot provisioning timeout period in minutes. If Spot instances are not provisioned within this time period, the TimeOutAction is taken. Minimum value is 5 and maximum value is 1440. The timeout applies only during initial provisioning, when the cluster is first created.
     * 
     */
    private Integer timeoutDurationMinutes;

    private InstanceFleetLaunchSpecificationsSpotSpecification() {}
    /**
     * @return Specifies the strategy to use in launching Spot instance fleets. Currently, the only option is `capacity-optimized` (the default), which launches instances from Spot instance pools with optimal capacity for the number of instances that are launching.
     * 
     */
    public String allocationStrategy() {
        return this.allocationStrategy;
    }
    /**
     * @return The defined duration for Spot instances (also known as Spot blocks) in minutes. When specified, the Spot instance does not terminate before the defined duration expires, and defined duration pricing for Spot instances applies. Valid values are 60, 120, 180, 240, 300, or 360. The duration period starts as soon as a Spot instance receives its instance ID. At the end of the duration, Amazon EC2 marks the Spot instance for termination and provides a Spot instance termination notice, which gives the instance a two-minute warning before it terminates.
     * 
     */
    public Optional<Integer> blockDurationMinutes() {
        return Optional.ofNullable(this.blockDurationMinutes);
    }
    /**
     * @return The action to take when TargetSpotCapacity has not been fulfilled when the TimeoutDurationMinutes has expired; that is, when all Spot instances could not be provisioned within the Spot provisioning timeout. Valid values are `TERMINATE_CLUSTER` and `SWITCH_TO_ON_DEMAND`. SWITCH_TO_ON_DEMAND specifies that if no Spot instances are available, On-Demand Instances should be provisioned to fulfill any remaining Spot capacity.
     * 
     */
    public String timeoutAction() {
        return this.timeoutAction;
    }
    /**
     * @return The spot provisioning timeout period in minutes. If Spot instances are not provisioned within this time period, the TimeOutAction is taken. Minimum value is 5 and maximum value is 1440. The timeout applies only during initial provisioning, when the cluster is first created.
     * 
     */
    public Integer timeoutDurationMinutes() {
        return this.timeoutDurationMinutes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceFleetLaunchSpecificationsSpotSpecification defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String allocationStrategy;
        private @Nullable Integer blockDurationMinutes;
        private String timeoutAction;
        private Integer timeoutDurationMinutes;
        public Builder() {}
        public Builder(InstanceFleetLaunchSpecificationsSpotSpecification defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allocationStrategy = defaults.allocationStrategy;
    	      this.blockDurationMinutes = defaults.blockDurationMinutes;
    	      this.timeoutAction = defaults.timeoutAction;
    	      this.timeoutDurationMinutes = defaults.timeoutDurationMinutes;
        }

        @CustomType.Setter
        public Builder allocationStrategy(String allocationStrategy) {
            this.allocationStrategy = Objects.requireNonNull(allocationStrategy);
            return this;
        }
        @CustomType.Setter
        public Builder blockDurationMinutes(@Nullable Integer blockDurationMinutes) {
            this.blockDurationMinutes = blockDurationMinutes;
            return this;
        }
        @CustomType.Setter
        public Builder timeoutAction(String timeoutAction) {
            this.timeoutAction = Objects.requireNonNull(timeoutAction);
            return this;
        }
        @CustomType.Setter
        public Builder timeoutDurationMinutes(Integer timeoutDurationMinutes) {
            this.timeoutDurationMinutes = Objects.requireNonNull(timeoutDurationMinutes);
            return this;
        }
        public InstanceFleetLaunchSpecificationsSpotSpecification build() {
            final var o = new InstanceFleetLaunchSpecificationsSpotSpecification();
            o.allocationStrategy = allocationStrategy;
            o.blockDurationMinutes = blockDurationMinutes;
            o.timeoutAction = timeoutAction;
            o.timeoutDurationMinutes = timeoutDurationMinutes;
            return o;
        }
    }
}

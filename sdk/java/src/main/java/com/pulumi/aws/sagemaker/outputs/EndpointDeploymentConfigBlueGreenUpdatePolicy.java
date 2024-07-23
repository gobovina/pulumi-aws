// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.sagemaker.outputs;

import com.pulumi.aws.sagemaker.outputs.EndpointDeploymentConfigBlueGreenUpdatePolicyTrafficRoutingConfiguration;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EndpointDeploymentConfigBlueGreenUpdatePolicy {
    private @Nullable Integer maximumExecutionTimeoutInSeconds;
    /**
     * @return Additional waiting time in seconds after the completion of an endpoint deployment before terminating the old endpoint fleet. Default is `0`. Valid values are between `0` and `3600`.
     * 
     */
    private @Nullable Integer terminationWaitInSeconds;
    /**
     * @return Defines the traffic routing strategy to shift traffic from the old fleet to the new fleet during an endpoint deployment. See Traffic Routing Configuration.
     * 
     */
    private EndpointDeploymentConfigBlueGreenUpdatePolicyTrafficRoutingConfiguration trafficRoutingConfiguration;

    private EndpointDeploymentConfigBlueGreenUpdatePolicy() {}
    public Optional<Integer> maximumExecutionTimeoutInSeconds() {
        return Optional.ofNullable(this.maximumExecutionTimeoutInSeconds);
    }
    /**
     * @return Additional waiting time in seconds after the completion of an endpoint deployment before terminating the old endpoint fleet. Default is `0`. Valid values are between `0` and `3600`.
     * 
     */
    public Optional<Integer> terminationWaitInSeconds() {
        return Optional.ofNullable(this.terminationWaitInSeconds);
    }
    /**
     * @return Defines the traffic routing strategy to shift traffic from the old fleet to the new fleet during an endpoint deployment. See Traffic Routing Configuration.
     * 
     */
    public EndpointDeploymentConfigBlueGreenUpdatePolicyTrafficRoutingConfiguration trafficRoutingConfiguration() {
        return this.trafficRoutingConfiguration;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointDeploymentConfigBlueGreenUpdatePolicy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer maximumExecutionTimeoutInSeconds;
        private @Nullable Integer terminationWaitInSeconds;
        private EndpointDeploymentConfigBlueGreenUpdatePolicyTrafficRoutingConfiguration trafficRoutingConfiguration;
        public Builder() {}
        public Builder(EndpointDeploymentConfigBlueGreenUpdatePolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maximumExecutionTimeoutInSeconds = defaults.maximumExecutionTimeoutInSeconds;
    	      this.terminationWaitInSeconds = defaults.terminationWaitInSeconds;
    	      this.trafficRoutingConfiguration = defaults.trafficRoutingConfiguration;
        }

        @CustomType.Setter
        public Builder maximumExecutionTimeoutInSeconds(@Nullable Integer maximumExecutionTimeoutInSeconds) {

            this.maximumExecutionTimeoutInSeconds = maximumExecutionTimeoutInSeconds;
            return this;
        }
        @CustomType.Setter
        public Builder terminationWaitInSeconds(@Nullable Integer terminationWaitInSeconds) {

            this.terminationWaitInSeconds = terminationWaitInSeconds;
            return this;
        }
        @CustomType.Setter
        public Builder trafficRoutingConfiguration(EndpointDeploymentConfigBlueGreenUpdatePolicyTrafficRoutingConfiguration trafficRoutingConfiguration) {
            if (trafficRoutingConfiguration == null) {
              throw new MissingRequiredPropertyException("EndpointDeploymentConfigBlueGreenUpdatePolicy", "trafficRoutingConfiguration");
            }
            this.trafficRoutingConfiguration = trafficRoutingConfiguration;
            return this;
        }
        public EndpointDeploymentConfigBlueGreenUpdatePolicy build() {
            final var _resultValue = new EndpointDeploymentConfigBlueGreenUpdatePolicy();
            _resultValue.maximumExecutionTimeoutInSeconds = maximumExecutionTimeoutInSeconds;
            _resultValue.terminationWaitInSeconds = terminationWaitInSeconds;
            _resultValue.trafficRoutingConfiguration = trafficRoutingConfiguration;
            return _resultValue;
        }
    }
}

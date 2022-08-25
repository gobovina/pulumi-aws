// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.sagemaker.outputs;

import com.pulumi.aws.sagemaker.outputs.EndpointDeploymentConfigAutoRollbackConfigurationAlarm;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class EndpointDeploymentConfigAutoRollbackConfiguration {
    /**
     * @return List of CloudWatch alarms in your account that are configured to monitor metrics on an endpoint. If any alarms are tripped during a deployment, SageMaker rolls back the deployment. See Alarms.
     * 
     */
    private @Nullable List<EndpointDeploymentConfigAutoRollbackConfigurationAlarm> alarms;

    private EndpointDeploymentConfigAutoRollbackConfiguration() {}
    /**
     * @return List of CloudWatch alarms in your account that are configured to monitor metrics on an endpoint. If any alarms are tripped during a deployment, SageMaker rolls back the deployment. See Alarms.
     * 
     */
    public List<EndpointDeploymentConfigAutoRollbackConfigurationAlarm> alarms() {
        return this.alarms == null ? List.of() : this.alarms;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointDeploymentConfigAutoRollbackConfiguration defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<EndpointDeploymentConfigAutoRollbackConfigurationAlarm> alarms;
        public Builder() {}
        public Builder(EndpointDeploymentConfigAutoRollbackConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alarms = defaults.alarms;
        }

        @CustomType.Setter
        public Builder alarms(@Nullable List<EndpointDeploymentConfigAutoRollbackConfigurationAlarm> alarms) {
            this.alarms = alarms;
            return this;
        }
        public Builder alarms(EndpointDeploymentConfigAutoRollbackConfigurationAlarm... alarms) {
            return alarms(List.of(alarms));
        }
        public EndpointDeploymentConfigAutoRollbackConfiguration build() {
            final var o = new EndpointDeploymentConfigAutoRollbackConfiguration();
            o.alarms = alarms;
            return o;
        }
    }
}

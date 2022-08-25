// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.codedeploy.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DeploymentGroupDeploymentStyle {
    /**
     * @return Indicates whether to route deployment traffic behind a load balancer. Valid Values are `WITH_TRAFFIC_CONTROL` or `WITHOUT_TRAFFIC_CONTROL`. Default is `WITHOUT_TRAFFIC_CONTROL`.
     * 
     */
    private @Nullable String deploymentOption;
    /**
     * @return Indicates whether to run an in-place deployment or a blue/green deployment. Valid Values are `IN_PLACE` or `BLUE_GREEN`. Default is `IN_PLACE`.
     * 
     */
    private @Nullable String deploymentType;

    private DeploymentGroupDeploymentStyle() {}
    /**
     * @return Indicates whether to route deployment traffic behind a load balancer. Valid Values are `WITH_TRAFFIC_CONTROL` or `WITHOUT_TRAFFIC_CONTROL`. Default is `WITHOUT_TRAFFIC_CONTROL`.
     * 
     */
    public Optional<String> deploymentOption() {
        return Optional.ofNullable(this.deploymentOption);
    }
    /**
     * @return Indicates whether to run an in-place deployment or a blue/green deployment. Valid Values are `IN_PLACE` or `BLUE_GREEN`. Default is `IN_PLACE`.
     * 
     */
    public Optional<String> deploymentType() {
        return Optional.ofNullable(this.deploymentType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentGroupDeploymentStyle defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String deploymentOption;
        private @Nullable String deploymentType;
        public Builder() {}
        public Builder(DeploymentGroupDeploymentStyle defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deploymentOption = defaults.deploymentOption;
    	      this.deploymentType = defaults.deploymentType;
        }

        @CustomType.Setter
        public Builder deploymentOption(@Nullable String deploymentOption) {
            this.deploymentOption = deploymentOption;
            return this;
        }
        @CustomType.Setter
        public Builder deploymentType(@Nullable String deploymentType) {
            this.deploymentType = deploymentType;
            return this;
        }
        public DeploymentGroupDeploymentStyle build() {
            final var o = new DeploymentGroupDeploymentStyle();
            o.deploymentOption = deploymentOption;
            o.deploymentType = deploymentType;
            return o;
        }
    }
}

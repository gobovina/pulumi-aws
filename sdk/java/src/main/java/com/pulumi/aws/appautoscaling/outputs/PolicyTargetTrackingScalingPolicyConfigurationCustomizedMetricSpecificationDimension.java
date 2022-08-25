// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appautoscaling.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationDimension {
    /**
     * @return The name of the policy. Must be between 1 and 255 characters in length.
     * 
     */
    private String name;
    /**
     * @return Value of the dimension.
     * 
     */
    private String value;

    private PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationDimension() {}
    /**
     * @return The name of the policy. Must be between 1 and 255 characters in length.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Value of the dimension.
     * 
     */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationDimension defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String name;
        private String value;
        public Builder() {}
        public Builder(PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationDimension defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationDimension build() {
            final var o = new PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationDimension();
            o.name = name;
            o.value = value;
            return o;
        }
    }
}

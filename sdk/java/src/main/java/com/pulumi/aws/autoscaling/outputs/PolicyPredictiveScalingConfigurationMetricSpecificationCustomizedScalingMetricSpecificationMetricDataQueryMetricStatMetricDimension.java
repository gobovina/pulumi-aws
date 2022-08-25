// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.autoscaling.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class PolicyPredictiveScalingConfigurationMetricSpecificationCustomizedScalingMetricSpecificationMetricDataQueryMetricStatMetricDimension {
    /**
     * @return The name of the dimension.
     * 
     */
    private String name;
    /**
     * @return The value of the dimension.
     * 
     */
    private String value;

    private PolicyPredictiveScalingConfigurationMetricSpecificationCustomizedScalingMetricSpecificationMetricDataQueryMetricStatMetricDimension() {}
    /**
     * @return The name of the dimension.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The value of the dimension.
     * 
     */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicyPredictiveScalingConfigurationMetricSpecificationCustomizedScalingMetricSpecificationMetricDataQueryMetricStatMetricDimension defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String name;
        private String value;
        public Builder() {}
        public Builder(PolicyPredictiveScalingConfigurationMetricSpecificationCustomizedScalingMetricSpecificationMetricDataQueryMetricStatMetricDimension defaults) {
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
        public PolicyPredictiveScalingConfigurationMetricSpecificationCustomizedScalingMetricSpecificationMetricDataQueryMetricStatMetricDimension build() {
            final var o = new PolicyPredictiveScalingConfigurationMetricSpecificationCustomizedScalingMetricSpecificationMetricDataQueryMetricStatMetricDimension();
            o.name = name;
            o.value = value;
            return o;
        }
    }
}

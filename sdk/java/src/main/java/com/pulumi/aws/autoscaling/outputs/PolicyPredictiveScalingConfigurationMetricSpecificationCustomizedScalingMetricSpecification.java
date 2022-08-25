// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.autoscaling.outputs;

import com.pulumi.aws.autoscaling.outputs.PolicyPredictiveScalingConfigurationMetricSpecificationCustomizedScalingMetricSpecificationMetricDataQuery;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;

@CustomType
public final class PolicyPredictiveScalingConfigurationMetricSpecificationCustomizedScalingMetricSpecification {
    /**
     * @return A list of up to 10 structures that defines custom capacity metric in predictive scaling policy
     * 
     */
    private List<PolicyPredictiveScalingConfigurationMetricSpecificationCustomizedScalingMetricSpecificationMetricDataQuery> metricDataQueries;

    private PolicyPredictiveScalingConfigurationMetricSpecificationCustomizedScalingMetricSpecification() {}
    /**
     * @return A list of up to 10 structures that defines custom capacity metric in predictive scaling policy
     * 
     */
    public List<PolicyPredictiveScalingConfigurationMetricSpecificationCustomizedScalingMetricSpecificationMetricDataQuery> metricDataQueries() {
        return this.metricDataQueries;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicyPredictiveScalingConfigurationMetricSpecificationCustomizedScalingMetricSpecification defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<PolicyPredictiveScalingConfigurationMetricSpecificationCustomizedScalingMetricSpecificationMetricDataQuery> metricDataQueries;
        public Builder() {}
        public Builder(PolicyPredictiveScalingConfigurationMetricSpecificationCustomizedScalingMetricSpecification defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.metricDataQueries = defaults.metricDataQueries;
        }

        @CustomType.Setter
        public Builder metricDataQueries(List<PolicyPredictiveScalingConfigurationMetricSpecificationCustomizedScalingMetricSpecificationMetricDataQuery> metricDataQueries) {
            this.metricDataQueries = Objects.requireNonNull(metricDataQueries);
            return this;
        }
        public Builder metricDataQueries(PolicyPredictiveScalingConfigurationMetricSpecificationCustomizedScalingMetricSpecificationMetricDataQuery... metricDataQueries) {
            return metricDataQueries(List.of(metricDataQueries));
        }
        public PolicyPredictiveScalingConfigurationMetricSpecificationCustomizedScalingMetricSpecification build() {
            final var o = new PolicyPredictiveScalingConfigurationMetricSpecificationCustomizedScalingMetricSpecification();
            o.metricDataQueries = metricDataQueries;
            return o;
        }
    }
}

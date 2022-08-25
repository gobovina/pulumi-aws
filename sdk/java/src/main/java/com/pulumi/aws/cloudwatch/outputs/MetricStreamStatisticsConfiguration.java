// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudwatch.outputs;

import com.pulumi.aws.cloudwatch.outputs.MetricStreamStatisticsConfigurationIncludeMetric;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class MetricStreamStatisticsConfiguration {
    /**
     * @return The additional statistics to stream for the metrics listed in `include_metrics`.
     * 
     */
    private List<String> additionalStatistics;
    /**
     * @return An array that defines the metrics that are to have additional statistics streamed. See details below.
     * 
     */
    private List<MetricStreamStatisticsConfigurationIncludeMetric> includeMetrics;

    private MetricStreamStatisticsConfiguration() {}
    /**
     * @return The additional statistics to stream for the metrics listed in `include_metrics`.
     * 
     */
    public List<String> additionalStatistics() {
        return this.additionalStatistics;
    }
    /**
     * @return An array that defines the metrics that are to have additional statistics streamed. See details below.
     * 
     */
    public List<MetricStreamStatisticsConfigurationIncludeMetric> includeMetrics() {
        return this.includeMetrics;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetricStreamStatisticsConfiguration defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> additionalStatistics;
        private List<MetricStreamStatisticsConfigurationIncludeMetric> includeMetrics;
        public Builder() {}
        public Builder(MetricStreamStatisticsConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalStatistics = defaults.additionalStatistics;
    	      this.includeMetrics = defaults.includeMetrics;
        }

        @CustomType.Setter
        public Builder additionalStatistics(List<String> additionalStatistics) {
            this.additionalStatistics = Objects.requireNonNull(additionalStatistics);
            return this;
        }
        public Builder additionalStatistics(String... additionalStatistics) {
            return additionalStatistics(List.of(additionalStatistics));
        }
        @CustomType.Setter
        public Builder includeMetrics(List<MetricStreamStatisticsConfigurationIncludeMetric> includeMetrics) {
            this.includeMetrics = Objects.requireNonNull(includeMetrics);
            return this;
        }
        public Builder includeMetrics(MetricStreamStatisticsConfigurationIncludeMetric... includeMetrics) {
            return includeMetrics(List.of(includeMetrics));
        }
        public MetricStreamStatisticsConfiguration build() {
            final var o = new MetricStreamStatisticsConfiguration();
            o.additionalStatistics = additionalStatistics;
            o.includeMetrics = includeMetrics;
            return o;
        }
    }
}

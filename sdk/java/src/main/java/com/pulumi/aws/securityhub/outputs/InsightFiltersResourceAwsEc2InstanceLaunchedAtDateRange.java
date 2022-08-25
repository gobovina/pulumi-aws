// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.securityhub.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class InsightFiltersResourceAwsEc2InstanceLaunchedAtDateRange {
    /**
     * @return A date range unit for the date filter. Valid values: `DAYS`.
     * 
     */
    private String unit;
    /**
     * @return A date range value for the date filter, provided as an Integer.
     * 
     */
    private Integer value;

    private InsightFiltersResourceAwsEc2InstanceLaunchedAtDateRange() {}
    /**
     * @return A date range unit for the date filter. Valid values: `DAYS`.
     * 
     */
    public String unit() {
        return this.unit;
    }
    /**
     * @return A date range value for the date filter, provided as an Integer.
     * 
     */
    public Integer value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InsightFiltersResourceAwsEc2InstanceLaunchedAtDateRange defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String unit;
        private Integer value;
        public Builder() {}
        public Builder(InsightFiltersResourceAwsEc2InstanceLaunchedAtDateRange defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.unit = defaults.unit;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder unit(String unit) {
            this.unit = Objects.requireNonNull(unit);
            return this;
        }
        @CustomType.Setter
        public Builder value(Integer value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public InsightFiltersResourceAwsEc2InstanceLaunchedAtDateRange build() {
            final var o = new InsightFiltersResourceAwsEc2InstanceLaunchedAtDateRange();
            o.unit = unit;
            o.value = value;
            return o;
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.securityhub.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class InsightFiltersFindingProviderFieldsSeverityLabel {
    /**
     * @return The condition to apply to a string value when querying for findings. Valid values include: `EQUALS` and `NOT_EQUALS`.
     * 
     */
    private String comparison;
    /**
     * @return A date range value for the date filter, provided as an Integer.
     * 
     */
    private String value;

    private InsightFiltersFindingProviderFieldsSeverityLabel() {}
    /**
     * @return The condition to apply to a string value when querying for findings. Valid values include: `EQUALS` and `NOT_EQUALS`.
     * 
     */
    public String comparison() {
        return this.comparison;
    }
    /**
     * @return A date range value for the date filter, provided as an Integer.
     * 
     */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InsightFiltersFindingProviderFieldsSeverityLabel defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String comparison;
        private String value;
        public Builder() {}
        public Builder(InsightFiltersFindingProviderFieldsSeverityLabel defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.comparison = defaults.comparison;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder comparison(String comparison) {
            this.comparison = Objects.requireNonNull(comparison);
            return this;
        }
        @CustomType.Setter
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public InsightFiltersFindingProviderFieldsSeverityLabel build() {
            final var o = new InsightFiltersFindingProviderFieldsSeverityLabel();
            o.comparison = comparison;
            o.value = value;
            return o;
        }
    }
}

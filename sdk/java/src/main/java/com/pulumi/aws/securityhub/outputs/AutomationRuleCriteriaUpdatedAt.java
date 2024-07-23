// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.securityhub.outputs;

import com.pulumi.aws.securityhub.outputs.AutomationRuleCriteriaUpdatedAtDateRange;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AutomationRuleCriteriaUpdatedAt {
    /**
     * @return A configuration block of the date range for the date filter. See date_range below for more details.
     * 
     */
    private @Nullable AutomationRuleCriteriaUpdatedAtDateRange dateRange;
    /**
     * @return An end date for the date filter. Required with `start` if `date_range` is not specified.
     * 
     */
    private @Nullable String end;
    /**
     * @return A start date for the date filter. Required with `end` if `date_range` is not specified.
     * 
     */
    private @Nullable String start;

    private AutomationRuleCriteriaUpdatedAt() {}
    /**
     * @return A configuration block of the date range for the date filter. See date_range below for more details.
     * 
     */
    public Optional<AutomationRuleCriteriaUpdatedAtDateRange> dateRange() {
        return Optional.ofNullable(this.dateRange);
    }
    /**
     * @return An end date for the date filter. Required with `start` if `date_range` is not specified.
     * 
     */
    public Optional<String> end() {
        return Optional.ofNullable(this.end);
    }
    /**
     * @return A start date for the date filter. Required with `end` if `date_range` is not specified.
     * 
     */
    public Optional<String> start() {
        return Optional.ofNullable(this.start);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutomationRuleCriteriaUpdatedAt defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable AutomationRuleCriteriaUpdatedAtDateRange dateRange;
        private @Nullable String end;
        private @Nullable String start;
        public Builder() {}
        public Builder(AutomationRuleCriteriaUpdatedAt defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dateRange = defaults.dateRange;
    	      this.end = defaults.end;
    	      this.start = defaults.start;
        }

        @CustomType.Setter
        public Builder dateRange(@Nullable AutomationRuleCriteriaUpdatedAtDateRange dateRange) {

            this.dateRange = dateRange;
            return this;
        }
        @CustomType.Setter
        public Builder end(@Nullable String end) {

            this.end = end;
            return this;
        }
        @CustomType.Setter
        public Builder start(@Nullable String start) {

            this.start = start;
            return this;
        }
        public AutomationRuleCriteriaUpdatedAt build() {
            final var _resultValue = new AutomationRuleCriteriaUpdatedAt();
            _resultValue.dateRange = dateRange;
            _resultValue.end = end;
            _resultValue.start = start;
            return _resultValue;
        }
    }
}

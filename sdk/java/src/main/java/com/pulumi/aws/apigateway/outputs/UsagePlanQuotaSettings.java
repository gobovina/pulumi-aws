// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.apigateway.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class UsagePlanQuotaSettings {
    /**
     * @return Maximum number of requests that can be made in a given time period.
     * 
     */
    private Integer limit;
    /**
     * @return Number of requests subtracted from the given limit in the initial time period.
     * 
     */
    private @Nullable Integer offset;
    /**
     * @return Time period in which the limit applies. Valid values are &#34;DAY&#34;, &#34;WEEK&#34; or &#34;MONTH&#34;.
     * 
     */
    private String period;

    private UsagePlanQuotaSettings() {}
    /**
     * @return Maximum number of requests that can be made in a given time period.
     * 
     */
    public Integer limit() {
        return this.limit;
    }
    /**
     * @return Number of requests subtracted from the given limit in the initial time period.
     * 
     */
    public Optional<Integer> offset() {
        return Optional.ofNullable(this.offset);
    }
    /**
     * @return Time period in which the limit applies. Valid values are &#34;DAY&#34;, &#34;WEEK&#34; or &#34;MONTH&#34;.
     * 
     */
    public String period() {
        return this.period;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UsagePlanQuotaSettings defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer limit;
        private @Nullable Integer offset;
        private String period;
        public Builder() {}
        public Builder(UsagePlanQuotaSettings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.limit = defaults.limit;
    	      this.offset = defaults.offset;
    	      this.period = defaults.period;
        }

        @CustomType.Setter
        public Builder limit(Integer limit) {
            if (limit == null) {
              throw new MissingRequiredPropertyException("UsagePlanQuotaSettings", "limit");
            }
            this.limit = limit;
            return this;
        }
        @CustomType.Setter
        public Builder offset(@Nullable Integer offset) {

            this.offset = offset;
            return this;
        }
        @CustomType.Setter
        public Builder period(String period) {
            if (period == null) {
              throw new MissingRequiredPropertyException("UsagePlanQuotaSettings", "period");
            }
            this.period = period;
            return this;
        }
        public UsagePlanQuotaSettings build() {
            final var _resultValue = new UsagePlanQuotaSettings();
            _resultValue.limit = limit;
            _resultValue.offset = offset;
            _resultValue.period = period;
            return _resultValue;
        }
    }
}

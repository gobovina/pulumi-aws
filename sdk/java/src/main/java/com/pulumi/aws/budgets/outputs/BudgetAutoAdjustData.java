// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.budgets.outputs;

import com.pulumi.aws.budgets.outputs.BudgetAutoAdjustDataHistoricalOptions;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BudgetAutoAdjustData {
    /**
     * @return (Required) - The string that defines whether your budget auto-adjusts based on historical or forecasted data. Valid values: `FORECAST`,`HISTORICAL`
     * 
     */
    private String autoAdjustType;
    /**
     * @return (Optional) - Configuration block of Historical Options. Required for `auto_adjust_type` of `HISTORICAL` Configuration block that defines the historical data that your auto-adjusting budget is based on.
     * 
     */
    private @Nullable BudgetAutoAdjustDataHistoricalOptions historicalOptions;
    /**
     * @return (Optional) - The last time that your budget was auto-adjusted.
     * 
     */
    private @Nullable String lastAutoAdjustTime;

    private BudgetAutoAdjustData() {}
    /**
     * @return (Required) - The string that defines whether your budget auto-adjusts based on historical or forecasted data. Valid values: `FORECAST`,`HISTORICAL`
     * 
     */
    public String autoAdjustType() {
        return this.autoAdjustType;
    }
    /**
     * @return (Optional) - Configuration block of Historical Options. Required for `auto_adjust_type` of `HISTORICAL` Configuration block that defines the historical data that your auto-adjusting budget is based on.
     * 
     */
    public Optional<BudgetAutoAdjustDataHistoricalOptions> historicalOptions() {
        return Optional.ofNullable(this.historicalOptions);
    }
    /**
     * @return (Optional) - The last time that your budget was auto-adjusted.
     * 
     */
    public Optional<String> lastAutoAdjustTime() {
        return Optional.ofNullable(this.lastAutoAdjustTime);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BudgetAutoAdjustData defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String autoAdjustType;
        private @Nullable BudgetAutoAdjustDataHistoricalOptions historicalOptions;
        private @Nullable String lastAutoAdjustTime;
        public Builder() {}
        public Builder(BudgetAutoAdjustData defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoAdjustType = defaults.autoAdjustType;
    	      this.historicalOptions = defaults.historicalOptions;
    	      this.lastAutoAdjustTime = defaults.lastAutoAdjustTime;
        }

        @CustomType.Setter
        public Builder autoAdjustType(String autoAdjustType) {
            if (autoAdjustType == null) {
              throw new MissingRequiredPropertyException("BudgetAutoAdjustData", "autoAdjustType");
            }
            this.autoAdjustType = autoAdjustType;
            return this;
        }
        @CustomType.Setter
        public Builder historicalOptions(@Nullable BudgetAutoAdjustDataHistoricalOptions historicalOptions) {

            this.historicalOptions = historicalOptions;
            return this;
        }
        @CustomType.Setter
        public Builder lastAutoAdjustTime(@Nullable String lastAutoAdjustTime) {

            this.lastAutoAdjustTime = lastAutoAdjustTime;
            return this;
        }
        public BudgetAutoAdjustData build() {
            final var _resultValue = new BudgetAutoAdjustData();
            _resultValue.autoAdjustType = autoAdjustType;
            _resultValue.historicalOptions = historicalOptions;
            _resultValue.lastAutoAdjustTime = lastAutoAdjustTime;
            return _resultValue;
        }
    }
}

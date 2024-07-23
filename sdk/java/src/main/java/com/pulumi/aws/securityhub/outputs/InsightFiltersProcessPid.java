// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.securityhub.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class InsightFiltersProcessPid {
    /**
     * @return The equal-to condition to be applied to a single field when querying for findings, provided as a String.
     * 
     */
    private @Nullable String eq;
    /**
     * @return The greater-than-equal condition to be applied to a single field when querying for findings, provided as a String.
     * 
     */
    private @Nullable String gte;
    /**
     * @return The less-than-equal condition to be applied to a single field when querying for findings, provided as a String.
     * 
     */
    private @Nullable String lte;

    private InsightFiltersProcessPid() {}
    /**
     * @return The equal-to condition to be applied to a single field when querying for findings, provided as a String.
     * 
     */
    public Optional<String> eq() {
        return Optional.ofNullable(this.eq);
    }
    /**
     * @return The greater-than-equal condition to be applied to a single field when querying for findings, provided as a String.
     * 
     */
    public Optional<String> gte() {
        return Optional.ofNullable(this.gte);
    }
    /**
     * @return The less-than-equal condition to be applied to a single field when querying for findings, provided as a String.
     * 
     */
    public Optional<String> lte() {
        return Optional.ofNullable(this.lte);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InsightFiltersProcessPid defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String eq;
        private @Nullable String gte;
        private @Nullable String lte;
        public Builder() {}
        public Builder(InsightFiltersProcessPid defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eq = defaults.eq;
    	      this.gte = defaults.gte;
    	      this.lte = defaults.lte;
        }

        @CustomType.Setter
        public Builder eq(@Nullable String eq) {

            this.eq = eq;
            return this;
        }
        @CustomType.Setter
        public Builder gte(@Nullable String gte) {

            this.gte = gte;
            return this;
        }
        @CustomType.Setter
        public Builder lte(@Nullable String lte) {

            this.lte = lte;
            return this;
        }
        public InsightFiltersProcessPid build() {
            final var _resultValue = new InsightFiltersProcessPid();
            _resultValue.eq = eq;
            _resultValue.gte = gte;
            _resultValue.lte = lte;
            return _resultValue;
        }
    }
}

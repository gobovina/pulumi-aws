// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.securityhub.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AutomationRuleCriteriaConfidence {
    /**
     * @return The equal-to condition to be applied to a single field when querying for findings, provided as a String.
     * 
     */
    private @Nullable Double eq;
    private @Nullable Double gt;
    /**
     * @return The greater-than-equal condition to be applied to a single field when querying for findings, provided as a String.
     * 
     */
    private @Nullable Double gte;
    private @Nullable Double lt;
    /**
     * @return The less-than-equal condition to be applied to a single field when querying for findings, provided as a String.
     * 
     */
    private @Nullable Double lte;

    private AutomationRuleCriteriaConfidence() {}
    /**
     * @return The equal-to condition to be applied to a single field when querying for findings, provided as a String.
     * 
     */
    public Optional<Double> eq() {
        return Optional.ofNullable(this.eq);
    }
    public Optional<Double> gt() {
        return Optional.ofNullable(this.gt);
    }
    /**
     * @return The greater-than-equal condition to be applied to a single field when querying for findings, provided as a String.
     * 
     */
    public Optional<Double> gte() {
        return Optional.ofNullable(this.gte);
    }
    public Optional<Double> lt() {
        return Optional.ofNullable(this.lt);
    }
    /**
     * @return The less-than-equal condition to be applied to a single field when querying for findings, provided as a String.
     * 
     */
    public Optional<Double> lte() {
        return Optional.ofNullable(this.lte);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutomationRuleCriteriaConfidence defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Double eq;
        private @Nullable Double gt;
        private @Nullable Double gte;
        private @Nullable Double lt;
        private @Nullable Double lte;
        public Builder() {}
        public Builder(AutomationRuleCriteriaConfidence defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eq = defaults.eq;
    	      this.gt = defaults.gt;
    	      this.gte = defaults.gte;
    	      this.lt = defaults.lt;
    	      this.lte = defaults.lte;
        }

        @CustomType.Setter
        public Builder eq(@Nullable Double eq) {

            this.eq = eq;
            return this;
        }
        @CustomType.Setter
        public Builder gt(@Nullable Double gt) {

            this.gt = gt;
            return this;
        }
        @CustomType.Setter
        public Builder gte(@Nullable Double gte) {

            this.gte = gte;
            return this;
        }
        @CustomType.Setter
        public Builder lt(@Nullable Double lt) {

            this.lt = lt;
            return this;
        }
        @CustomType.Setter
        public Builder lte(@Nullable Double lte) {

            this.lte = lte;
            return this;
        }
        public AutomationRuleCriteriaConfidence build() {
            final var _resultValue = new AutomationRuleCriteriaConfidence();
            _resultValue.eq = eq;
            _resultValue.gt = gt;
            _resultValue.gte = gte;
            _resultValue.lt = lt;
            _resultValue.lte = lte;
            return _resultValue;
        }
    }
}

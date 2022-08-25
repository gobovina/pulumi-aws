// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.sagemaker.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FlowDefinitionHumanLoopConfigPublicWorkforceTaskPriceAmountInUsd {
    /**
     * @return The fractional portion, in cents, of the amount. Valid value range between `0` and `99`.
     * 
     */
    private @Nullable Integer cents;
    /**
     * @return The whole number of dollars in the amount. Valid value range between `0` and `2`.
     * 
     */
    private @Nullable Integer dollars;
    /**
     * @return Fractions of a cent, in tenths. Valid value range between `0` and `9`.
     * 
     */
    private @Nullable Integer tenthFractionsOfACent;

    private FlowDefinitionHumanLoopConfigPublicWorkforceTaskPriceAmountInUsd() {}
    /**
     * @return The fractional portion, in cents, of the amount. Valid value range between `0` and `99`.
     * 
     */
    public Optional<Integer> cents() {
        return Optional.ofNullable(this.cents);
    }
    /**
     * @return The whole number of dollars in the amount. Valid value range between `0` and `2`.
     * 
     */
    public Optional<Integer> dollars() {
        return Optional.ofNullable(this.dollars);
    }
    /**
     * @return Fractions of a cent, in tenths. Valid value range between `0` and `9`.
     * 
     */
    public Optional<Integer> tenthFractionsOfACent() {
        return Optional.ofNullable(this.tenthFractionsOfACent);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowDefinitionHumanLoopConfigPublicWorkforceTaskPriceAmountInUsd defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer cents;
        private @Nullable Integer dollars;
        private @Nullable Integer tenthFractionsOfACent;
        public Builder() {}
        public Builder(FlowDefinitionHumanLoopConfigPublicWorkforceTaskPriceAmountInUsd defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cents = defaults.cents;
    	      this.dollars = defaults.dollars;
    	      this.tenthFractionsOfACent = defaults.tenthFractionsOfACent;
        }

        @CustomType.Setter
        public Builder cents(@Nullable Integer cents) {
            this.cents = cents;
            return this;
        }
        @CustomType.Setter
        public Builder dollars(@Nullable Integer dollars) {
            this.dollars = dollars;
            return this;
        }
        @CustomType.Setter
        public Builder tenthFractionsOfACent(@Nullable Integer tenthFractionsOfACent) {
            this.tenthFractionsOfACent = tenthFractionsOfACent;
            return this;
        }
        public FlowDefinitionHumanLoopConfigPublicWorkforceTaskPriceAmountInUsd build() {
            final var o = new FlowDefinitionHumanLoopConfigPublicWorkforceTaskPriceAmountInUsd();
            o.cents = cents;
            o.dollars = dollars;
            o.tenthFractionsOfACent = tenthFractionsOfACent;
            return o;
        }
    }
}

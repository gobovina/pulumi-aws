// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appautoscaling.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PolicyStepScalingPolicyConfigurationStepAdjustmentArgs extends com.pulumi.resources.ResourceArgs {

    public static final PolicyStepScalingPolicyConfigurationStepAdjustmentArgs Empty = new PolicyStepScalingPolicyConfigurationStepAdjustmentArgs();

    /**
     * Lower bound for the difference between the alarm threshold and the CloudWatch metric. Without a value, AWS will treat this bound as negative infinity.
     * 
     */
    @Import(name="metricIntervalLowerBound")
    private @Nullable Output<String> metricIntervalLowerBound;

    /**
     * @return Lower bound for the difference between the alarm threshold and the CloudWatch metric. Without a value, AWS will treat this bound as negative infinity.
     * 
     */
    public Optional<Output<String>> metricIntervalLowerBound() {
        return Optional.ofNullable(this.metricIntervalLowerBound);
    }

    /**
     * Upper bound for the difference between the alarm threshold and the CloudWatch metric. Without a value, AWS will treat this bound as infinity. The upper bound must be greater than the lower bound.
     * 
     */
    @Import(name="metricIntervalUpperBound")
    private @Nullable Output<String> metricIntervalUpperBound;

    /**
     * @return Upper bound for the difference between the alarm threshold and the CloudWatch metric. Without a value, AWS will treat this bound as infinity. The upper bound must be greater than the lower bound.
     * 
     */
    public Optional<Output<String>> metricIntervalUpperBound() {
        return Optional.ofNullable(this.metricIntervalUpperBound);
    }

    /**
     * Number of members by which to scale, when the adjustment bounds are breached. A positive value scales up. A negative value scales down.
     * 
     */
    @Import(name="scalingAdjustment", required=true)
    private Output<Integer> scalingAdjustment;

    /**
     * @return Number of members by which to scale, when the adjustment bounds are breached. A positive value scales up. A negative value scales down.
     * 
     */
    public Output<Integer> scalingAdjustment() {
        return this.scalingAdjustment;
    }

    private PolicyStepScalingPolicyConfigurationStepAdjustmentArgs() {}

    private PolicyStepScalingPolicyConfigurationStepAdjustmentArgs(PolicyStepScalingPolicyConfigurationStepAdjustmentArgs $) {
        this.metricIntervalLowerBound = $.metricIntervalLowerBound;
        this.metricIntervalUpperBound = $.metricIntervalUpperBound;
        this.scalingAdjustment = $.scalingAdjustment;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PolicyStepScalingPolicyConfigurationStepAdjustmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PolicyStepScalingPolicyConfigurationStepAdjustmentArgs $;

        public Builder() {
            $ = new PolicyStepScalingPolicyConfigurationStepAdjustmentArgs();
        }

        public Builder(PolicyStepScalingPolicyConfigurationStepAdjustmentArgs defaults) {
            $ = new PolicyStepScalingPolicyConfigurationStepAdjustmentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param metricIntervalLowerBound Lower bound for the difference between the alarm threshold and the CloudWatch metric. Without a value, AWS will treat this bound as negative infinity.
         * 
         * @return builder
         * 
         */
        public Builder metricIntervalLowerBound(@Nullable Output<String> metricIntervalLowerBound) {
            $.metricIntervalLowerBound = metricIntervalLowerBound;
            return this;
        }

        /**
         * @param metricIntervalLowerBound Lower bound for the difference between the alarm threshold and the CloudWatch metric. Without a value, AWS will treat this bound as negative infinity.
         * 
         * @return builder
         * 
         */
        public Builder metricIntervalLowerBound(String metricIntervalLowerBound) {
            return metricIntervalLowerBound(Output.of(metricIntervalLowerBound));
        }

        /**
         * @param metricIntervalUpperBound Upper bound for the difference between the alarm threshold and the CloudWatch metric. Without a value, AWS will treat this bound as infinity. The upper bound must be greater than the lower bound.
         * 
         * @return builder
         * 
         */
        public Builder metricIntervalUpperBound(@Nullable Output<String> metricIntervalUpperBound) {
            $.metricIntervalUpperBound = metricIntervalUpperBound;
            return this;
        }

        /**
         * @param metricIntervalUpperBound Upper bound for the difference between the alarm threshold and the CloudWatch metric. Without a value, AWS will treat this bound as infinity. The upper bound must be greater than the lower bound.
         * 
         * @return builder
         * 
         */
        public Builder metricIntervalUpperBound(String metricIntervalUpperBound) {
            return metricIntervalUpperBound(Output.of(metricIntervalUpperBound));
        }

        /**
         * @param scalingAdjustment Number of members by which to scale, when the adjustment bounds are breached. A positive value scales up. A negative value scales down.
         * 
         * @return builder
         * 
         */
        public Builder scalingAdjustment(Output<Integer> scalingAdjustment) {
            $.scalingAdjustment = scalingAdjustment;
            return this;
        }

        /**
         * @param scalingAdjustment Number of members by which to scale, when the adjustment bounds are breached. A positive value scales up. A negative value scales down.
         * 
         * @return builder
         * 
         */
        public Builder scalingAdjustment(Integer scalingAdjustment) {
            return scalingAdjustment(Output.of(scalingAdjustment));
        }

        public PolicyStepScalingPolicyConfigurationStepAdjustmentArgs build() {
            if ($.scalingAdjustment == null) {
                throw new MissingRequiredPropertyException("PolicyStepScalingPolicyConfigurationStepAdjustmentArgs", "scalingAdjustment");
            }
            return $;
        }
    }

}

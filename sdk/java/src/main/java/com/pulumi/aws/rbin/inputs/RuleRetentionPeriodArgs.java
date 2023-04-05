// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.rbin.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class RuleRetentionPeriodArgs extends com.pulumi.resources.ResourceArgs {

    public static final RuleRetentionPeriodArgs Empty = new RuleRetentionPeriodArgs();

    /**
     * The unit of time in which the retention period is measured. Currently, only DAYS is supported.
     * 
     */
    @Import(name="retentionPeriodUnit", required=true)
    private Output<String> retentionPeriodUnit;

    /**
     * @return The unit of time in which the retention period is measured. Currently, only DAYS is supported.
     * 
     */
    public Output<String> retentionPeriodUnit() {
        return this.retentionPeriodUnit;
    }

    /**
     * The period value for which the retention rule is to retain resources. The period is measured using the unit specified for RetentionPeriodUnit.
     * 
     */
    @Import(name="retentionPeriodValue", required=true)
    private Output<Integer> retentionPeriodValue;

    /**
     * @return The period value for which the retention rule is to retain resources. The period is measured using the unit specified for RetentionPeriodUnit.
     * 
     */
    public Output<Integer> retentionPeriodValue() {
        return this.retentionPeriodValue;
    }

    private RuleRetentionPeriodArgs() {}

    private RuleRetentionPeriodArgs(RuleRetentionPeriodArgs $) {
        this.retentionPeriodUnit = $.retentionPeriodUnit;
        this.retentionPeriodValue = $.retentionPeriodValue;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RuleRetentionPeriodArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RuleRetentionPeriodArgs $;

        public Builder() {
            $ = new RuleRetentionPeriodArgs();
        }

        public Builder(RuleRetentionPeriodArgs defaults) {
            $ = new RuleRetentionPeriodArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param retentionPeriodUnit The unit of time in which the retention period is measured. Currently, only DAYS is supported.
         * 
         * @return builder
         * 
         */
        public Builder retentionPeriodUnit(Output<String> retentionPeriodUnit) {
            $.retentionPeriodUnit = retentionPeriodUnit;
            return this;
        }

        /**
         * @param retentionPeriodUnit The unit of time in which the retention period is measured. Currently, only DAYS is supported.
         * 
         * @return builder
         * 
         */
        public Builder retentionPeriodUnit(String retentionPeriodUnit) {
            return retentionPeriodUnit(Output.of(retentionPeriodUnit));
        }

        /**
         * @param retentionPeriodValue The period value for which the retention rule is to retain resources. The period is measured using the unit specified for RetentionPeriodUnit.
         * 
         * @return builder
         * 
         */
        public Builder retentionPeriodValue(Output<Integer> retentionPeriodValue) {
            $.retentionPeriodValue = retentionPeriodValue;
            return this;
        }

        /**
         * @param retentionPeriodValue The period value for which the retention rule is to retain resources. The period is measured using the unit specified for RetentionPeriodUnit.
         * 
         * @return builder
         * 
         */
        public Builder retentionPeriodValue(Integer retentionPeriodValue) {
            return retentionPeriodValue(Output.of(retentionPeriodValue));
        }

        public RuleRetentionPeriodArgs build() {
            $.retentionPeriodUnit = Objects.requireNonNull($.retentionPeriodUnit, "expected parameter 'retentionPeriodUnit' to be non-null");
            $.retentionPeriodValue = Objects.requireNonNull($.retentionPeriodValue, "expected parameter 'retentionPeriodValue' to be non-null");
            return $;
        }
    }

}

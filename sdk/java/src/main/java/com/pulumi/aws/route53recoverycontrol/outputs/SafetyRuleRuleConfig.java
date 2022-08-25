// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.route53recoverycontrol.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class SafetyRuleRuleConfig {
    /**
     * @return Logical negation of the rule.
     * 
     */
    private Boolean inverted;
    /**
     * @return Number of controls that must be set when you specify an `ATLEAST` type rule.
     * 
     */
    private Integer threshold;
    /**
     * @return Rule type. Valid values are `ATLEAST`, `AND`, and `OR`.
     * 
     */
    private String type;

    private SafetyRuleRuleConfig() {}
    /**
     * @return Logical negation of the rule.
     * 
     */
    public Boolean inverted() {
        return this.inverted;
    }
    /**
     * @return Number of controls that must be set when you specify an `ATLEAST` type rule.
     * 
     */
    public Integer threshold() {
        return this.threshold;
    }
    /**
     * @return Rule type. Valid values are `ATLEAST`, `AND`, and `OR`.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SafetyRuleRuleConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean inverted;
        private Integer threshold;
        private String type;
        public Builder() {}
        public Builder(SafetyRuleRuleConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.inverted = defaults.inverted;
    	      this.threshold = defaults.threshold;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder inverted(Boolean inverted) {
            this.inverted = Objects.requireNonNull(inverted);
            return this;
        }
        @CustomType.Setter
        public Builder threshold(Integer threshold) {
            this.threshold = Objects.requireNonNull(threshold);
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public SafetyRuleRuleConfig build() {
            final var o = new SafetyRuleRuleConfig();
            o.inverted = inverted;
            o.threshold = threshold;
            o.type = type;
            return o;
        }
    }
}

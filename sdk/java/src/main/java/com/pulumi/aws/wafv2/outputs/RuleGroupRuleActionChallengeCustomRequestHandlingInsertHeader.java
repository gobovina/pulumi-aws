// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class RuleGroupRuleActionChallengeCustomRequestHandlingInsertHeader {
    /**
     * @return A friendly name of the rule group.
     * 
     */
    private String name;
    /**
     * @return The value of the custom header.
     * 
     */
    private String value;

    private RuleGroupRuleActionChallengeCustomRequestHandlingInsertHeader() {}
    /**
     * @return A friendly name of the rule group.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The value of the custom header.
     * 
     */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleActionChallengeCustomRequestHandlingInsertHeader defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String name;
        private String value;
        public Builder() {}
        public Builder(RuleGroupRuleActionChallengeCustomRequestHandlingInsertHeader defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("RuleGroupRuleActionChallengeCustomRequestHandlingInsertHeader", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder value(String value) {
            if (value == null) {
              throw new MissingRequiredPropertyException("RuleGroupRuleActionChallengeCustomRequestHandlingInsertHeader", "value");
            }
            this.value = value;
            return this;
        }
        public RuleGroupRuleActionChallengeCustomRequestHandlingInsertHeader build() {
            final var _resultValue = new RuleGroupRuleActionChallengeCustomRequestHandlingInsertHeader();
            _resultValue.name = name;
            _resultValue.value = value;
            return _resultValue;
        }
    }
}

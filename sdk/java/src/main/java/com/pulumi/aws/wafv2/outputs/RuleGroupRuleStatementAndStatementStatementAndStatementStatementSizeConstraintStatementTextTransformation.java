// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class RuleGroupRuleStatementAndStatementStatementAndStatementStatementSizeConstraintStatementTextTransformation {
    /**
     * @return The relative processing order for multiple transformations that are defined for a rule statement. AWS WAF processes all transformations, from lowest priority to highest, before inspecting the transformed content.
     * 
     */
    private Integer priority;
    /**
     * @return The transformation to apply, please refer to the Text Transformation [documentation](https://docs.aws.amazon.com/waf/latest/APIReference/API_TextTransformation.html) for more details.
     * 
     */
    private String type;

    private RuleGroupRuleStatementAndStatementStatementAndStatementStatementSizeConstraintStatementTextTransformation() {}
    /**
     * @return The relative processing order for multiple transformations that are defined for a rule statement. AWS WAF processes all transformations, from lowest priority to highest, before inspecting the transformed content.
     * 
     */
    public Integer priority() {
        return this.priority;
    }
    /**
     * @return The transformation to apply, please refer to the Text Transformation [documentation](https://docs.aws.amazon.com/waf/latest/APIReference/API_TextTransformation.html) for more details.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleStatementAndStatementStatementAndStatementStatementSizeConstraintStatementTextTransformation defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer priority;
        private String type;
        public Builder() {}
        public Builder(RuleGroupRuleStatementAndStatementStatementAndStatementStatementSizeConstraintStatementTextTransformation defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.priority = defaults.priority;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder priority(Integer priority) {
            this.priority = Objects.requireNonNull(priority);
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public RuleGroupRuleStatementAndStatementStatementAndStatementStatementSizeConstraintStatementTextTransformation build() {
            final var o = new RuleGroupRuleStatementAndStatementStatementAndStatementStatementSizeConstraintStatementTextTransformation();
            o.priority = priority;
            o.type = type;
            return o;
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.outputs;

import com.pulumi.aws.wafv2.outputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatch;
import com.pulumi.aws.wafv2.outputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementAndStatementStatementSizeConstraintStatementTextTransformation;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementAndStatementStatementSizeConstraintStatement {
    /**
     * @return Operator to use to compare the request part to the size setting. Valid values include: `EQ`, `NE`, `LE`, `LT`, `GE`, or `GT`.
     * 
     */
    private String comparisonOperator;
    /**
     * @return Part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
     * 
     */
    private @Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatch fieldToMatch;
    /**
     * @return Size, in bytes, to compare to the request part, after any transformations. Valid values are integers between 0 and 21474836480, inclusive.
     * 
     */
    private Integer size;
    /**
     * @return Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. See Text Transformation below for details.
     * 
     */
    private List<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementAndStatementStatementSizeConstraintStatementTextTransformation> textTransformations;

    private WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementAndStatementStatementSizeConstraintStatement() {}
    /**
     * @return Operator to use to compare the request part to the size setting. Valid values include: `EQ`, `NE`, `LE`, `LT`, `GE`, or `GT`.
     * 
     */
    public String comparisonOperator() {
        return this.comparisonOperator;
    }
    /**
     * @return Part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
     * 
     */
    public Optional<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatch> fieldToMatch() {
        return Optional.ofNullable(this.fieldToMatch);
    }
    /**
     * @return Size, in bytes, to compare to the request part, after any transformations. Valid values are integers between 0 and 21474836480, inclusive.
     * 
     */
    public Integer size() {
        return this.size;
    }
    /**
     * @return Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. See Text Transformation below for details.
     * 
     */
    public List<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementAndStatementStatementSizeConstraintStatementTextTransformation> textTransformations() {
        return this.textTransformations;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementAndStatementStatementSizeConstraintStatement defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String comparisonOperator;
        private @Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatch fieldToMatch;
        private Integer size;
        private List<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementAndStatementStatementSizeConstraintStatementTextTransformation> textTransformations;
        public Builder() {}
        public Builder(WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementAndStatementStatementSizeConstraintStatement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.comparisonOperator = defaults.comparisonOperator;
    	      this.fieldToMatch = defaults.fieldToMatch;
    	      this.size = defaults.size;
    	      this.textTransformations = defaults.textTransformations;
        }

        @CustomType.Setter
        public Builder comparisonOperator(String comparisonOperator) {
            this.comparisonOperator = Objects.requireNonNull(comparisonOperator);
            return this;
        }
        @CustomType.Setter
        public Builder fieldToMatch(@Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatch fieldToMatch) {
            this.fieldToMatch = fieldToMatch;
            return this;
        }
        @CustomType.Setter
        public Builder size(Integer size) {
            this.size = Objects.requireNonNull(size);
            return this;
        }
        @CustomType.Setter
        public Builder textTransformations(List<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementAndStatementStatementSizeConstraintStatementTextTransformation> textTransformations) {
            this.textTransformations = Objects.requireNonNull(textTransformations);
            return this;
        }
        public Builder textTransformations(WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementAndStatementStatementSizeConstraintStatementTextTransformation... textTransformations) {
            return textTransformations(List.of(textTransformations));
        }
        public WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementAndStatementStatementSizeConstraintStatement build() {
            final var o = new WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementAndStatementStatementSizeConstraintStatement();
            o.comparisonOperator = comparisonOperator;
            o.fieldToMatch = fieldToMatch;
            o.size = size;
            o.textTransformations = textTransformations;
            return o;
        }
    }
}

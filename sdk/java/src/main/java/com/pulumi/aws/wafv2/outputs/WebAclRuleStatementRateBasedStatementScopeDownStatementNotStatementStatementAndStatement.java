// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.outputs;

import com.pulumi.aws.wafv2.outputs.WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatement;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;

@CustomType
public final class WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatement {
    /**
     * @return Statements to combine with `AND` logic. You can use any statements that can be nested. See Statement above for details.
     * 
     */
    private List<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatement> statements;

    private WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatement() {}
    /**
     * @return Statements to combine with `AND` logic. You can use any statements that can be nested. See Statement above for details.
     * 
     */
    public List<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatement> statements() {
        return this.statements;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatement defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatement> statements;
        public Builder() {}
        public Builder(WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.statements = defaults.statements;
        }

        @CustomType.Setter
        public Builder statements(List<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatement> statements) {
            this.statements = Objects.requireNonNull(statements);
            return this;
        }
        public Builder statements(WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatement... statements) {
            return statements(List.of(statements));
        }
        public WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatement build() {
            final var o = new WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatement();
            o.statements = statements;
            return o;
        }
    }
}

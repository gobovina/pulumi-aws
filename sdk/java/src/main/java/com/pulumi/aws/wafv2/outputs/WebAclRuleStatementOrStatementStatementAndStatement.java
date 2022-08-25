// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.outputs;

import com.pulumi.aws.wafv2.outputs.WebAclRuleStatementOrStatementStatementAndStatementStatement;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;

@CustomType
public final class WebAclRuleStatementOrStatementStatementAndStatement {
    /**
     * @return Statements to combine with `AND` logic. You can use any statements that can be nested. See Statement above for details.
     * 
     */
    private List<WebAclRuleStatementOrStatementStatementAndStatementStatement> statements;

    private WebAclRuleStatementOrStatementStatementAndStatement() {}
    /**
     * @return Statements to combine with `AND` logic. You can use any statements that can be nested. See Statement above for details.
     * 
     */
    public List<WebAclRuleStatementOrStatementStatementAndStatementStatement> statements() {
        return this.statements;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementOrStatementStatementAndStatement defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<WebAclRuleStatementOrStatementStatementAndStatementStatement> statements;
        public Builder() {}
        public Builder(WebAclRuleStatementOrStatementStatementAndStatement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.statements = defaults.statements;
        }

        @CustomType.Setter
        public Builder statements(List<WebAclRuleStatementOrStatementStatementAndStatementStatement> statements) {
            this.statements = Objects.requireNonNull(statements);
            return this;
        }
        public Builder statements(WebAclRuleStatementOrStatementStatementAndStatementStatement... statements) {
            return statements(List.of(statements));
        }
        public WebAclRuleStatementOrStatementStatementAndStatement build() {
            final var o = new WebAclRuleStatementOrStatementStatementAndStatement();
            o.statements = statements;
            return o;
        }
    }
}

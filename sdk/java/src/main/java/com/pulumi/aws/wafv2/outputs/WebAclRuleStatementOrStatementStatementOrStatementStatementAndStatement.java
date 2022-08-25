// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.outputs;

import com.pulumi.aws.wafv2.outputs.WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatement;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;

@CustomType
public final class WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatement {
    /**
     * @return Statements to combine with `AND` logic. You can use any statements that can be nested. See Statement above for details.
     * 
     */
    private List<WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatement> statements;

    private WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatement() {}
    /**
     * @return Statements to combine with `AND` logic. You can use any statements that can be nested. See Statement above for details.
     * 
     */
    public List<WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatement> statements() {
        return this.statements;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatement defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatement> statements;
        public Builder() {}
        public Builder(WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.statements = defaults.statements;
        }

        @CustomType.Setter
        public Builder statements(List<WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatement> statements) {
            this.statements = Objects.requireNonNull(statements);
            return this;
        }
        public Builder statements(WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatement... statements) {
            return statements(List.of(statements));
        }
        public WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatement build() {
            final var o = new WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatement();
            o.statements = statements;
            return o;
        }
    }
}

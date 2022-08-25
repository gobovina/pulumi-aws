// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class WebAclRuleStatementOrStatementStatementAndStatementStatementAndStatementStatementLabelMatchStatement {
    /**
     * @return String to match against.
     * 
     */
    private String key;
    /**
     * @return Specify whether you want to match using the label name or just the namespace. Valid values are `LABEL` or `NAMESPACE`.
     * 
     */
    private String scope;

    private WebAclRuleStatementOrStatementStatementAndStatementStatementAndStatementStatementLabelMatchStatement() {}
    /**
     * @return String to match against.
     * 
     */
    public String key() {
        return this.key;
    }
    /**
     * @return Specify whether you want to match using the label name or just the namespace. Valid values are `LABEL` or `NAMESPACE`.
     * 
     */
    public String scope() {
        return this.scope;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementOrStatementStatementAndStatementStatementAndStatementStatementLabelMatchStatement defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String key;
        private String scope;
        public Builder() {}
        public Builder(WebAclRuleStatementOrStatementStatementAndStatementStatementAndStatementStatementLabelMatchStatement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.scope = defaults.scope;
        }

        @CustomType.Setter
        public Builder key(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }
        @CustomType.Setter
        public Builder scope(String scope) {
            this.scope = Objects.requireNonNull(scope);
            return this;
        }
        public WebAclRuleStatementOrStatementStatementAndStatementStatementAndStatementStatementLabelMatchStatement build() {
            final var o = new WebAclRuleStatementOrStatementStatementAndStatementStatementAndStatementStatementLabelMatchStatement();
            o.key = key;
            o.scope = scope;
            return o;
        }
    }
}

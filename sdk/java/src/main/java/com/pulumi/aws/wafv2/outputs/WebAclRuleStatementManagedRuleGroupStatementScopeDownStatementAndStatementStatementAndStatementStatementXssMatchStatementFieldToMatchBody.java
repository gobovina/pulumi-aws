// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.util.Objects;

@CustomType
public final class WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementAndStatementStatementXssMatchStatementFieldToMatchBody {
    private WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementAndStatementStatementXssMatchStatementFieldToMatchBody() {}

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementAndStatementStatementXssMatchStatementFieldToMatchBody defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        public Builder() {}
        public Builder(WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementAndStatementStatementXssMatchStatementFieldToMatchBody defaults) {
    	      Objects.requireNonNull(defaults);
        }

        public WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementAndStatementStatementXssMatchStatementFieldToMatchBody build() {
            final var o = new WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementAndStatementStatementXssMatchStatementFieldToMatchBody();
            return o;
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.util.Objects;

@CustomType
public final class WebAclRuleStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchMethod {
    private WebAclRuleStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchMethod() {}

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchMethod defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        public Builder() {}
        public Builder(WebAclRuleStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchMethod defaults) {
    	      Objects.requireNonNull(defaults);
        }

        public WebAclRuleStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchMethod build() {
            final var o = new WebAclRuleStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchMethod();
            return o;
        }
    }
}

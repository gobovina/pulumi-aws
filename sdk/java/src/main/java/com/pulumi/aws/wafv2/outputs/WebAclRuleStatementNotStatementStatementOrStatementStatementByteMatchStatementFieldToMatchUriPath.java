// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.util.Objects;

@CustomType
public final class WebAclRuleStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchUriPath {
    private WebAclRuleStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchUriPath() {}

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchUriPath defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        public Builder() {}
        public Builder(WebAclRuleStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchUriPath defaults) {
    	      Objects.requireNonNull(defaults);
        }

        public WebAclRuleStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchUriPath build() {
            final var o = new WebAclRuleStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchUriPath();
            return o;
        }
    }
}

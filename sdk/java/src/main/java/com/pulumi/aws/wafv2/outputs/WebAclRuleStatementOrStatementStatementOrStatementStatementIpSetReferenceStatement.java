// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.outputs;

import com.pulumi.aws.wafv2.outputs.WebAclRuleStatementOrStatementStatementOrStatementStatementIpSetReferenceStatementIpSetForwardedIpConfig;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WebAclRuleStatementOrStatementStatementOrStatementStatementIpSetReferenceStatement {
    /**
     * @return The Amazon Resource Name (ARN) of the IP Set that this statement references.
     * 
     */
    private String arn;
    /**
     * @return Configuration for inspecting IP addresses in an HTTP header that you specify, instead of using the IP address that&#39;s reported by the web request origin. See IPSet Forwarded IP Config below for more details.
     * 
     */
    private @Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementIpSetReferenceStatementIpSetForwardedIpConfig ipSetForwardedIpConfig;

    private WebAclRuleStatementOrStatementStatementOrStatementStatementIpSetReferenceStatement() {}
    /**
     * @return The Amazon Resource Name (ARN) of the IP Set that this statement references.
     * 
     */
    public String arn() {
        return this.arn;
    }
    /**
     * @return Configuration for inspecting IP addresses in an HTTP header that you specify, instead of using the IP address that&#39;s reported by the web request origin. See IPSet Forwarded IP Config below for more details.
     * 
     */
    public Optional<WebAclRuleStatementOrStatementStatementOrStatementStatementIpSetReferenceStatementIpSetForwardedIpConfig> ipSetForwardedIpConfig() {
        return Optional.ofNullable(this.ipSetForwardedIpConfig);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementOrStatementStatementOrStatementStatementIpSetReferenceStatement defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String arn;
        private @Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementIpSetReferenceStatementIpSetForwardedIpConfig ipSetForwardedIpConfig;
        public Builder() {}
        public Builder(WebAclRuleStatementOrStatementStatementOrStatementStatementIpSetReferenceStatement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.ipSetForwardedIpConfig = defaults.ipSetForwardedIpConfig;
        }

        @CustomType.Setter
        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        @CustomType.Setter
        public Builder ipSetForwardedIpConfig(@Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementIpSetReferenceStatementIpSetForwardedIpConfig ipSetForwardedIpConfig) {
            this.ipSetForwardedIpConfig = ipSetForwardedIpConfig;
            return this;
        }
        public WebAclRuleStatementOrStatementStatementOrStatementStatementIpSetReferenceStatement build() {
            final var o = new WebAclRuleStatementOrStatementStatementOrStatementStatementIpSetReferenceStatement();
            o.arn = arn;
            o.ipSetForwardedIpConfig = ipSetForwardedIpConfig;
            return o;
        }
    }
}

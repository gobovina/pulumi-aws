// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementStatementIpSetReferenceStatementIpSetForwardedIpConfig {
    /**
     * @return - Match status to assign to the web request if the request doesn&#39;t have a valid IP address in the specified position. Valid values include: `MATCH` or `NO_MATCH`.
     * 
     */
    private String fallbackBehavior;
    /**
     * @return - Name of the HTTP header to use for the IP address.
     * 
     */
    private String headerName;
    /**
     * @return - Position in the header to search for the IP address. Valid values include: `FIRST`, `LAST`, or `ANY`. If `ANY` is specified and the header contains more than 10 IP addresses, AWS WAFv2 inspects the last 10.
     * 
     */
    private String position;

    private WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementStatementIpSetReferenceStatementIpSetForwardedIpConfig() {}
    /**
     * @return - Match status to assign to the web request if the request doesn&#39;t have a valid IP address in the specified position. Valid values include: `MATCH` or `NO_MATCH`.
     * 
     */
    public String fallbackBehavior() {
        return this.fallbackBehavior;
    }
    /**
     * @return - Name of the HTTP header to use for the IP address.
     * 
     */
    public String headerName() {
        return this.headerName;
    }
    /**
     * @return - Position in the header to search for the IP address. Valid values include: `FIRST`, `LAST`, or `ANY`. If `ANY` is specified and the header contains more than 10 IP addresses, AWS WAFv2 inspects the last 10.
     * 
     */
    public String position() {
        return this.position;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementStatementIpSetReferenceStatementIpSetForwardedIpConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String fallbackBehavior;
        private String headerName;
        private String position;
        public Builder() {}
        public Builder(WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementStatementIpSetReferenceStatementIpSetForwardedIpConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fallbackBehavior = defaults.fallbackBehavior;
    	      this.headerName = defaults.headerName;
    	      this.position = defaults.position;
        }

        @CustomType.Setter
        public Builder fallbackBehavior(String fallbackBehavior) {
            this.fallbackBehavior = Objects.requireNonNull(fallbackBehavior);
            return this;
        }
        @CustomType.Setter
        public Builder headerName(String headerName) {
            this.headerName = Objects.requireNonNull(headerName);
            return this;
        }
        @CustomType.Setter
        public Builder position(String position) {
            this.position = Objects.requireNonNull(position);
            return this;
        }
        public WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementStatementIpSetReferenceStatementIpSetForwardedIpConfig build() {
            final var o = new WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementStatementIpSetReferenceStatementIpSetForwardedIpConfig();
            o.fallbackBehavior = fallbackBehavior;
            o.headerName = headerName;
            o.position = position;
            return o;
        }
    }
}

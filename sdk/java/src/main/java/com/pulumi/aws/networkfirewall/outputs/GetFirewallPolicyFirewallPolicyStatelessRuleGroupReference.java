// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.networkfirewall.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetFirewallPolicyFirewallPolicyStatelessRuleGroupReference {
    private Integer priority;
    private String resourceArn;

    private GetFirewallPolicyFirewallPolicyStatelessRuleGroupReference() {}
    public Integer priority() {
        return this.priority;
    }
    public String resourceArn() {
        return this.resourceArn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFirewallPolicyFirewallPolicyStatelessRuleGroupReference defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer priority;
        private String resourceArn;
        public Builder() {}
        public Builder(GetFirewallPolicyFirewallPolicyStatelessRuleGroupReference defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.priority = defaults.priority;
    	      this.resourceArn = defaults.resourceArn;
        }

        @CustomType.Setter
        public Builder priority(Integer priority) {
            this.priority = Objects.requireNonNull(priority);
            return this;
        }
        @CustomType.Setter
        public Builder resourceArn(String resourceArn) {
            this.resourceArn = Objects.requireNonNull(resourceArn);
            return this;
        }
        public GetFirewallPolicyFirewallPolicyStatelessRuleGroupReference build() {
            final var o = new GetFirewallPolicyFirewallPolicyStatelessRuleGroupReference();
            o.priority = priority;
            o.resourceArn = resourceArn;
            return o;
        }
    }
}

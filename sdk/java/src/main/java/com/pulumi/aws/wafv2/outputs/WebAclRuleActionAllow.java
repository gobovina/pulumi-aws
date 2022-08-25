// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.outputs;

import com.pulumi.aws.wafv2.outputs.WebAclRuleActionAllowCustomRequestHandling;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WebAclRuleActionAllow {
    /**
     * @return Defines custom handling for the web request. See Custom Request Handling below for details.
     * 
     */
    private @Nullable WebAclRuleActionAllowCustomRequestHandling customRequestHandling;

    private WebAclRuleActionAllow() {}
    /**
     * @return Defines custom handling for the web request. See Custom Request Handling below for details.
     * 
     */
    public Optional<WebAclRuleActionAllowCustomRequestHandling> customRequestHandling() {
        return Optional.ofNullable(this.customRequestHandling);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleActionAllow defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable WebAclRuleActionAllowCustomRequestHandling customRequestHandling;
        public Builder() {}
        public Builder(WebAclRuleActionAllow defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customRequestHandling = defaults.customRequestHandling;
        }

        @CustomType.Setter
        public Builder customRequestHandling(@Nullable WebAclRuleActionAllowCustomRequestHandling customRequestHandling) {
            this.customRequestHandling = customRequestHandling;
            return this;
        }
        public WebAclRuleActionAllow build() {
            final var o = new WebAclRuleActionAllow();
            o.customRequestHandling = customRequestHandling;
            return o;
        }
    }
}

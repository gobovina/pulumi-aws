// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.outputs;

import com.pulumi.aws.wafv2.outputs.WebAclRuleStatementRuleGroupReferenceStatementRuleActionOverrideActionToUseAllow;
import com.pulumi.aws.wafv2.outputs.WebAclRuleStatementRuleGroupReferenceStatementRuleActionOverrideActionToUseBlock;
import com.pulumi.aws.wafv2.outputs.WebAclRuleStatementRuleGroupReferenceStatementRuleActionOverrideActionToUseCaptcha;
import com.pulumi.aws.wafv2.outputs.WebAclRuleStatementRuleGroupReferenceStatementRuleActionOverrideActionToUseChallenge;
import com.pulumi.aws.wafv2.outputs.WebAclRuleStatementRuleGroupReferenceStatementRuleActionOverrideActionToUseCount;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WebAclRuleStatementRuleGroupReferenceStatementRuleActionOverrideActionToUse {
    private @Nullable WebAclRuleStatementRuleGroupReferenceStatementRuleActionOverrideActionToUseAllow allow;
    private @Nullable WebAclRuleStatementRuleGroupReferenceStatementRuleActionOverrideActionToUseBlock block;
    /**
     * @return Instructs AWS WAF to run a Captcha check against the web request. See `captcha` below for details.
     * 
     */
    private @Nullable WebAclRuleStatementRuleGroupReferenceStatementRuleActionOverrideActionToUseCaptcha captcha;
    /**
     * @return Instructs AWS WAF to run a check against the request to verify that the request is coming from a legitimate client session. See `challenge` below for details.
     * 
     */
    private @Nullable WebAclRuleStatementRuleGroupReferenceStatementRuleActionOverrideActionToUseChallenge challenge;
    private @Nullable WebAclRuleStatementRuleGroupReferenceStatementRuleActionOverrideActionToUseCount count;

    private WebAclRuleStatementRuleGroupReferenceStatementRuleActionOverrideActionToUse() {}
    public Optional<WebAclRuleStatementRuleGroupReferenceStatementRuleActionOverrideActionToUseAllow> allow() {
        return Optional.ofNullable(this.allow);
    }
    public Optional<WebAclRuleStatementRuleGroupReferenceStatementRuleActionOverrideActionToUseBlock> block() {
        return Optional.ofNullable(this.block);
    }
    /**
     * @return Instructs AWS WAF to run a Captcha check against the web request. See `captcha` below for details.
     * 
     */
    public Optional<WebAclRuleStatementRuleGroupReferenceStatementRuleActionOverrideActionToUseCaptcha> captcha() {
        return Optional.ofNullable(this.captcha);
    }
    /**
     * @return Instructs AWS WAF to run a check against the request to verify that the request is coming from a legitimate client session. See `challenge` below for details.
     * 
     */
    public Optional<WebAclRuleStatementRuleGroupReferenceStatementRuleActionOverrideActionToUseChallenge> challenge() {
        return Optional.ofNullable(this.challenge);
    }
    public Optional<WebAclRuleStatementRuleGroupReferenceStatementRuleActionOverrideActionToUseCount> count() {
        return Optional.ofNullable(this.count);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementRuleGroupReferenceStatementRuleActionOverrideActionToUse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable WebAclRuleStatementRuleGroupReferenceStatementRuleActionOverrideActionToUseAllow allow;
        private @Nullable WebAclRuleStatementRuleGroupReferenceStatementRuleActionOverrideActionToUseBlock block;
        private @Nullable WebAclRuleStatementRuleGroupReferenceStatementRuleActionOverrideActionToUseCaptcha captcha;
        private @Nullable WebAclRuleStatementRuleGroupReferenceStatementRuleActionOverrideActionToUseChallenge challenge;
        private @Nullable WebAclRuleStatementRuleGroupReferenceStatementRuleActionOverrideActionToUseCount count;
        public Builder() {}
        public Builder(WebAclRuleStatementRuleGroupReferenceStatementRuleActionOverrideActionToUse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allow = defaults.allow;
    	      this.block = defaults.block;
    	      this.captcha = defaults.captcha;
    	      this.challenge = defaults.challenge;
    	      this.count = defaults.count;
        }

        @CustomType.Setter
        public Builder allow(@Nullable WebAclRuleStatementRuleGroupReferenceStatementRuleActionOverrideActionToUseAllow allow) {

            this.allow = allow;
            return this;
        }
        @CustomType.Setter
        public Builder block(@Nullable WebAclRuleStatementRuleGroupReferenceStatementRuleActionOverrideActionToUseBlock block) {

            this.block = block;
            return this;
        }
        @CustomType.Setter
        public Builder captcha(@Nullable WebAclRuleStatementRuleGroupReferenceStatementRuleActionOverrideActionToUseCaptcha captcha) {

            this.captcha = captcha;
            return this;
        }
        @CustomType.Setter
        public Builder challenge(@Nullable WebAclRuleStatementRuleGroupReferenceStatementRuleActionOverrideActionToUseChallenge challenge) {

            this.challenge = challenge;
            return this;
        }
        @CustomType.Setter
        public Builder count(@Nullable WebAclRuleStatementRuleGroupReferenceStatementRuleActionOverrideActionToUseCount count) {

            this.count = count;
            return this;
        }
        public WebAclRuleStatementRuleGroupReferenceStatementRuleActionOverrideActionToUse build() {
            final var _resultValue = new WebAclRuleStatementRuleGroupReferenceStatementRuleActionOverrideActionToUse();
            _resultValue.allow = allow;
            _resultValue.block = block;
            _resultValue.captcha = captcha;
            _resultValue.challenge = challenge;
            _resultValue.count = count;
            return _resultValue;
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.outputs;

import com.pulumi.aws.wafv2.outputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementFieldToMatchCookiesMatchPatternAll;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WebAclRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementFieldToMatchCookiesMatchPattern {
    /**
     * @return An empty configuration block that is used for inspecting all headers.
     * 
     */
    private @Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementFieldToMatchCookiesMatchPatternAll all;
    private @Nullable List<String> excludedCookies;
    private @Nullable List<String> includedCookies;

    private WebAclRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementFieldToMatchCookiesMatchPattern() {}
    /**
     * @return An empty configuration block that is used for inspecting all headers.
     * 
     */
    public Optional<WebAclRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementFieldToMatchCookiesMatchPatternAll> all() {
        return Optional.ofNullable(this.all);
    }
    public List<String> excludedCookies() {
        return this.excludedCookies == null ? List.of() : this.excludedCookies;
    }
    public List<String> includedCookies() {
        return this.includedCookies == null ? List.of() : this.includedCookies;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementFieldToMatchCookiesMatchPattern defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementFieldToMatchCookiesMatchPatternAll all;
        private @Nullable List<String> excludedCookies;
        private @Nullable List<String> includedCookies;
        public Builder() {}
        public Builder(WebAclRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementFieldToMatchCookiesMatchPattern defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.all = defaults.all;
    	      this.excludedCookies = defaults.excludedCookies;
    	      this.includedCookies = defaults.includedCookies;
        }

        @CustomType.Setter
        public Builder all(@Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementFieldToMatchCookiesMatchPatternAll all) {

            this.all = all;
            return this;
        }
        @CustomType.Setter
        public Builder excludedCookies(@Nullable List<String> excludedCookies) {

            this.excludedCookies = excludedCookies;
            return this;
        }
        public Builder excludedCookies(String... excludedCookies) {
            return excludedCookies(List.of(excludedCookies));
        }
        @CustomType.Setter
        public Builder includedCookies(@Nullable List<String> includedCookies) {

            this.includedCookies = includedCookies;
            return this;
        }
        public Builder includedCookies(String... includedCookies) {
            return includedCookies(List.of(includedCookies));
        }
        public WebAclRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementFieldToMatchCookiesMatchPattern build() {
            final var _resultValue = new WebAclRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementFieldToMatchCookiesMatchPattern();
            _resultValue.all = all;
            _resultValue.excludedCookies = excludedCookies;
            _resultValue.includedCookies = includedCookies;
            return _resultValue;
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.outputs;

import com.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementNotStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchAllQueryArguments;
import com.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementNotStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchBody;
import com.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementNotStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchMethod;
import com.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementNotStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchQueryString;
import com.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementNotStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchSingleHeader;
import com.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementNotStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchSingleQueryArgument;
import com.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementNotStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchUriPath;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RuleGroupRuleStatementNotStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatch {
    /**
     * @return Inspect all query arguments.
     * 
     */
    private @Nullable RuleGroupRuleStatementNotStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchAllQueryArguments allQueryArguments;
    /**
     * @return Inspect the request body, which immediately follows the request headers.
     * 
     */
    private @Nullable RuleGroupRuleStatementNotStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchBody body;
    /**
     * @return Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
     * 
     */
    private @Nullable RuleGroupRuleStatementNotStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchMethod method;
    /**
     * @return Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
     * 
     */
    private @Nullable RuleGroupRuleStatementNotStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchQueryString queryString;
    /**
     * @return Inspect a single header. See Single Header below for details.
     * 
     */
    private @Nullable RuleGroupRuleStatementNotStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchSingleHeader singleHeader;
    /**
     * @return Inspect a single query argument. See Single Query Argument below for details.
     * 
     */
    private @Nullable RuleGroupRuleStatementNotStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchSingleQueryArgument singleQueryArgument;
    /**
     * @return Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * 
     */
    private @Nullable RuleGroupRuleStatementNotStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchUriPath uriPath;

    private RuleGroupRuleStatementNotStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatch() {}
    /**
     * @return Inspect all query arguments.
     * 
     */
    public Optional<RuleGroupRuleStatementNotStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchAllQueryArguments> allQueryArguments() {
        return Optional.ofNullable(this.allQueryArguments);
    }
    /**
     * @return Inspect the request body, which immediately follows the request headers.
     * 
     */
    public Optional<RuleGroupRuleStatementNotStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchBody> body() {
        return Optional.ofNullable(this.body);
    }
    /**
     * @return Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
     * 
     */
    public Optional<RuleGroupRuleStatementNotStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchMethod> method() {
        return Optional.ofNullable(this.method);
    }
    /**
     * @return Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
     * 
     */
    public Optional<RuleGroupRuleStatementNotStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchQueryString> queryString() {
        return Optional.ofNullable(this.queryString);
    }
    /**
     * @return Inspect a single header. See Single Header below for details.
     * 
     */
    public Optional<RuleGroupRuleStatementNotStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchSingleHeader> singleHeader() {
        return Optional.ofNullable(this.singleHeader);
    }
    /**
     * @return Inspect a single query argument. See Single Query Argument below for details.
     * 
     */
    public Optional<RuleGroupRuleStatementNotStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchSingleQueryArgument> singleQueryArgument() {
        return Optional.ofNullable(this.singleQueryArgument);
    }
    /**
     * @return Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * 
     */
    public Optional<RuleGroupRuleStatementNotStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchUriPath> uriPath() {
        return Optional.ofNullable(this.uriPath);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleStatementNotStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable RuleGroupRuleStatementNotStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchAllQueryArguments allQueryArguments;
        private @Nullable RuleGroupRuleStatementNotStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchBody body;
        private @Nullable RuleGroupRuleStatementNotStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchMethod method;
        private @Nullable RuleGroupRuleStatementNotStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchQueryString queryString;
        private @Nullable RuleGroupRuleStatementNotStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchSingleHeader singleHeader;
        private @Nullable RuleGroupRuleStatementNotStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchSingleQueryArgument singleQueryArgument;
        private @Nullable RuleGroupRuleStatementNotStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchUriPath uriPath;
        public Builder() {}
        public Builder(RuleGroupRuleStatementNotStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allQueryArguments = defaults.allQueryArguments;
    	      this.body = defaults.body;
    	      this.method = defaults.method;
    	      this.queryString = defaults.queryString;
    	      this.singleHeader = defaults.singleHeader;
    	      this.singleQueryArgument = defaults.singleQueryArgument;
    	      this.uriPath = defaults.uriPath;
        }

        @CustomType.Setter
        public Builder allQueryArguments(@Nullable RuleGroupRuleStatementNotStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchAllQueryArguments allQueryArguments) {
            this.allQueryArguments = allQueryArguments;
            return this;
        }
        @CustomType.Setter
        public Builder body(@Nullable RuleGroupRuleStatementNotStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchBody body) {
            this.body = body;
            return this;
        }
        @CustomType.Setter
        public Builder method(@Nullable RuleGroupRuleStatementNotStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchMethod method) {
            this.method = method;
            return this;
        }
        @CustomType.Setter
        public Builder queryString(@Nullable RuleGroupRuleStatementNotStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchQueryString queryString) {
            this.queryString = queryString;
            return this;
        }
        @CustomType.Setter
        public Builder singleHeader(@Nullable RuleGroupRuleStatementNotStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchSingleHeader singleHeader) {
            this.singleHeader = singleHeader;
            return this;
        }
        @CustomType.Setter
        public Builder singleQueryArgument(@Nullable RuleGroupRuleStatementNotStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchSingleQueryArgument singleQueryArgument) {
            this.singleQueryArgument = singleQueryArgument;
            return this;
        }
        @CustomType.Setter
        public Builder uriPath(@Nullable RuleGroupRuleStatementNotStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchUriPath uriPath) {
            this.uriPath = uriPath;
            return this;
        }
        public RuleGroupRuleStatementNotStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatch build() {
            final var o = new RuleGroupRuleStatementNotStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatch();
            o.allQueryArguments = allQueryArguments;
            o.body = body;
            o.method = method;
            o.queryString = queryString;
            o.singleHeader = singleHeader;
            o.singleQueryArgument = singleQueryArgument;
            o.uriPath = uriPath;
            return o;
        }
    }
}

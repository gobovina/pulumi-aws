// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.outputs;

import com.pulumi.aws.wafv2.outputs.WebAclRuleStatementOrStatementStatementAndStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchAllQueryArguments;
import com.pulumi.aws.wafv2.outputs.WebAclRuleStatementOrStatementStatementAndStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchBody;
import com.pulumi.aws.wafv2.outputs.WebAclRuleStatementOrStatementStatementAndStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchMethod;
import com.pulumi.aws.wafv2.outputs.WebAclRuleStatementOrStatementStatementAndStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchQueryString;
import com.pulumi.aws.wafv2.outputs.WebAclRuleStatementOrStatementStatementAndStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchSingleHeader;
import com.pulumi.aws.wafv2.outputs.WebAclRuleStatementOrStatementStatementAndStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchSingleQueryArgument;
import com.pulumi.aws.wafv2.outputs.WebAclRuleStatementOrStatementStatementAndStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchUriPath;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WebAclRuleStatementOrStatementStatementAndStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatch {
    /**
     * @return Inspect all query arguments.
     * 
     */
    private @Nullable WebAclRuleStatementOrStatementStatementAndStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchAllQueryArguments allQueryArguments;
    /**
     * @return Inspect the request body, which immediately follows the request headers.
     * 
     */
    private @Nullable WebAclRuleStatementOrStatementStatementAndStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchBody body;
    /**
     * @return Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
     * 
     */
    private @Nullable WebAclRuleStatementOrStatementStatementAndStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchMethod method;
    /**
     * @return Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
     * 
     */
    private @Nullable WebAclRuleStatementOrStatementStatementAndStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchQueryString queryString;
    /**
     * @return Inspect a single header. See Single Header below for details.
     * 
     */
    private @Nullable WebAclRuleStatementOrStatementStatementAndStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchSingleHeader singleHeader;
    /**
     * @return Inspect a single query argument. See Single Query Argument below for details.
     * 
     */
    private @Nullable WebAclRuleStatementOrStatementStatementAndStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchSingleQueryArgument singleQueryArgument;
    /**
     * @return Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * 
     */
    private @Nullable WebAclRuleStatementOrStatementStatementAndStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchUriPath uriPath;

    private WebAclRuleStatementOrStatementStatementAndStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatch() {}
    /**
     * @return Inspect all query arguments.
     * 
     */
    public Optional<WebAclRuleStatementOrStatementStatementAndStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchAllQueryArguments> allQueryArguments() {
        return Optional.ofNullable(this.allQueryArguments);
    }
    /**
     * @return Inspect the request body, which immediately follows the request headers.
     * 
     */
    public Optional<WebAclRuleStatementOrStatementStatementAndStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchBody> body() {
        return Optional.ofNullable(this.body);
    }
    /**
     * @return Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
     * 
     */
    public Optional<WebAclRuleStatementOrStatementStatementAndStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchMethod> method() {
        return Optional.ofNullable(this.method);
    }
    /**
     * @return Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
     * 
     */
    public Optional<WebAclRuleStatementOrStatementStatementAndStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchQueryString> queryString() {
        return Optional.ofNullable(this.queryString);
    }
    /**
     * @return Inspect a single header. See Single Header below for details.
     * 
     */
    public Optional<WebAclRuleStatementOrStatementStatementAndStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchSingleHeader> singleHeader() {
        return Optional.ofNullable(this.singleHeader);
    }
    /**
     * @return Inspect a single query argument. See Single Query Argument below for details.
     * 
     */
    public Optional<WebAclRuleStatementOrStatementStatementAndStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchSingleQueryArgument> singleQueryArgument() {
        return Optional.ofNullable(this.singleQueryArgument);
    }
    /**
     * @return Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * 
     */
    public Optional<WebAclRuleStatementOrStatementStatementAndStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchUriPath> uriPath() {
        return Optional.ofNullable(this.uriPath);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementOrStatementStatementAndStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable WebAclRuleStatementOrStatementStatementAndStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchAllQueryArguments allQueryArguments;
        private @Nullable WebAclRuleStatementOrStatementStatementAndStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchBody body;
        private @Nullable WebAclRuleStatementOrStatementStatementAndStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchMethod method;
        private @Nullable WebAclRuleStatementOrStatementStatementAndStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchQueryString queryString;
        private @Nullable WebAclRuleStatementOrStatementStatementAndStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchSingleHeader singleHeader;
        private @Nullable WebAclRuleStatementOrStatementStatementAndStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchSingleQueryArgument singleQueryArgument;
        private @Nullable WebAclRuleStatementOrStatementStatementAndStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchUriPath uriPath;
        public Builder() {}
        public Builder(WebAclRuleStatementOrStatementStatementAndStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatch defaults) {
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
        public Builder allQueryArguments(@Nullable WebAclRuleStatementOrStatementStatementAndStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchAllQueryArguments allQueryArguments) {
            this.allQueryArguments = allQueryArguments;
            return this;
        }
        @CustomType.Setter
        public Builder body(@Nullable WebAclRuleStatementOrStatementStatementAndStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchBody body) {
            this.body = body;
            return this;
        }
        @CustomType.Setter
        public Builder method(@Nullable WebAclRuleStatementOrStatementStatementAndStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchMethod method) {
            this.method = method;
            return this;
        }
        @CustomType.Setter
        public Builder queryString(@Nullable WebAclRuleStatementOrStatementStatementAndStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchQueryString queryString) {
            this.queryString = queryString;
            return this;
        }
        @CustomType.Setter
        public Builder singleHeader(@Nullable WebAclRuleStatementOrStatementStatementAndStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchSingleHeader singleHeader) {
            this.singleHeader = singleHeader;
            return this;
        }
        @CustomType.Setter
        public Builder singleQueryArgument(@Nullable WebAclRuleStatementOrStatementStatementAndStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchSingleQueryArgument singleQueryArgument) {
            this.singleQueryArgument = singleQueryArgument;
            return this;
        }
        @CustomType.Setter
        public Builder uriPath(@Nullable WebAclRuleStatementOrStatementStatementAndStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchUriPath uriPath) {
            this.uriPath = uriPath;
            return this;
        }
        public WebAclRuleStatementOrStatementStatementAndStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatch build() {
            final var o = new WebAclRuleStatementOrStatementStatementAndStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatch();
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

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.outputs;

import com.pulumi.aws.wafv2.outputs.WebAclRuleStatementOrStatementStatementAndStatementStatementAndStatement;
import com.pulumi.aws.wafv2.outputs.WebAclRuleStatementOrStatementStatementAndStatementStatementByteMatchStatement;
import com.pulumi.aws.wafv2.outputs.WebAclRuleStatementOrStatementStatementAndStatementStatementGeoMatchStatement;
import com.pulumi.aws.wafv2.outputs.WebAclRuleStatementOrStatementStatementAndStatementStatementIpSetReferenceStatement;
import com.pulumi.aws.wafv2.outputs.WebAclRuleStatementOrStatementStatementAndStatementStatementLabelMatchStatement;
import com.pulumi.aws.wafv2.outputs.WebAclRuleStatementOrStatementStatementAndStatementStatementNotStatement;
import com.pulumi.aws.wafv2.outputs.WebAclRuleStatementOrStatementStatementAndStatementStatementOrStatement;
import com.pulumi.aws.wafv2.outputs.WebAclRuleStatementOrStatementStatementAndStatementStatementRegexPatternSetReferenceStatement;
import com.pulumi.aws.wafv2.outputs.WebAclRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatement;
import com.pulumi.aws.wafv2.outputs.WebAclRuleStatementOrStatementStatementAndStatementStatementSqliMatchStatement;
import com.pulumi.aws.wafv2.outputs.WebAclRuleStatementOrStatementStatementAndStatementStatementXssMatchStatement;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WebAclRuleStatementOrStatementStatementAndStatementStatement {
    /**
     * @return Logical rule statement used to combine other rule statements with AND logic. See AND Statement below for details.
     * 
     */
    private @Nullable WebAclRuleStatementOrStatementStatementAndStatementStatementAndStatement andStatement;
    /**
     * @return Rule statement that defines a string match search for AWS WAF to apply to web requests. See Byte Match Statement below for details.
     * 
     */
    private @Nullable WebAclRuleStatementOrStatementStatementAndStatementStatementByteMatchStatement byteMatchStatement;
    /**
     * @return Rule statement used to identify web requests based on country of origin. See GEO Match Statement below for details.
     * 
     */
    private @Nullable WebAclRuleStatementOrStatementStatementAndStatementStatementGeoMatchStatement geoMatchStatement;
    /**
     * @return Rule statement used to detect web requests coming from particular IP addresses or address ranges. See IP Set Reference Statement below for details.
     * 
     */
    private @Nullable WebAclRuleStatementOrStatementStatementAndStatementStatementIpSetReferenceStatement ipSetReferenceStatement;
    /**
     * @return Rule statement that defines a string match search against labels that have been added to the web request by rules that have already run in the web ACL. See Label Match Statement below for details.
     * 
     */
    private @Nullable WebAclRuleStatementOrStatementStatementAndStatementStatementLabelMatchStatement labelMatchStatement;
    /**
     * @return Logical rule statement used to negate the results of another rule statement. See NOT Statement below for details.
     * 
     */
    private @Nullable WebAclRuleStatementOrStatementStatementAndStatementStatementNotStatement notStatement;
    /**
     * @return Logical rule statement used to combine other rule statements with OR logic. See OR Statement below for details.
     * 
     */
    private @Nullable WebAclRuleStatementOrStatementStatementAndStatementStatementOrStatement orStatement;
    /**
     * @return Rule statement used to search web request components for matches with regular expressions. See Regex Pattern Set Reference Statement below for details.
     * 
     */
    private @Nullable WebAclRuleStatementOrStatementStatementAndStatementStatementRegexPatternSetReferenceStatement regexPatternSetReferenceStatement;
    /**
     * @return Rule statement that compares a number of bytes against the size of a request component, using a comparison operator, such as greater than (&gt;) or less than (&lt;). See Size Constraint Statement below for more details.
     * 
     */
    private @Nullable WebAclRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatement sizeConstraintStatement;
    /**
     * @return An SQL injection match condition identifies the part of web requests, such as the URI or the query string, that you want AWS WAF to inspect. See SQL Injection Match Statement below for details.
     * 
     */
    private @Nullable WebAclRuleStatementOrStatementStatementAndStatementStatementSqliMatchStatement sqliMatchStatement;
    /**
     * @return Rule statement that defines a cross-site scripting (XSS) match search for AWS WAF to apply to web requests. See XSS Match Statement below for details.
     * 
     */
    private @Nullable WebAclRuleStatementOrStatementStatementAndStatementStatementXssMatchStatement xssMatchStatement;

    private WebAclRuleStatementOrStatementStatementAndStatementStatement() {}
    /**
     * @return Logical rule statement used to combine other rule statements with AND logic. See AND Statement below for details.
     * 
     */
    public Optional<WebAclRuleStatementOrStatementStatementAndStatementStatementAndStatement> andStatement() {
        return Optional.ofNullable(this.andStatement);
    }
    /**
     * @return Rule statement that defines a string match search for AWS WAF to apply to web requests. See Byte Match Statement below for details.
     * 
     */
    public Optional<WebAclRuleStatementOrStatementStatementAndStatementStatementByteMatchStatement> byteMatchStatement() {
        return Optional.ofNullable(this.byteMatchStatement);
    }
    /**
     * @return Rule statement used to identify web requests based on country of origin. See GEO Match Statement below for details.
     * 
     */
    public Optional<WebAclRuleStatementOrStatementStatementAndStatementStatementGeoMatchStatement> geoMatchStatement() {
        return Optional.ofNullable(this.geoMatchStatement);
    }
    /**
     * @return Rule statement used to detect web requests coming from particular IP addresses or address ranges. See IP Set Reference Statement below for details.
     * 
     */
    public Optional<WebAclRuleStatementOrStatementStatementAndStatementStatementIpSetReferenceStatement> ipSetReferenceStatement() {
        return Optional.ofNullable(this.ipSetReferenceStatement);
    }
    /**
     * @return Rule statement that defines a string match search against labels that have been added to the web request by rules that have already run in the web ACL. See Label Match Statement below for details.
     * 
     */
    public Optional<WebAclRuleStatementOrStatementStatementAndStatementStatementLabelMatchStatement> labelMatchStatement() {
        return Optional.ofNullable(this.labelMatchStatement);
    }
    /**
     * @return Logical rule statement used to negate the results of another rule statement. See NOT Statement below for details.
     * 
     */
    public Optional<WebAclRuleStatementOrStatementStatementAndStatementStatementNotStatement> notStatement() {
        return Optional.ofNullable(this.notStatement);
    }
    /**
     * @return Logical rule statement used to combine other rule statements with OR logic. See OR Statement below for details.
     * 
     */
    public Optional<WebAclRuleStatementOrStatementStatementAndStatementStatementOrStatement> orStatement() {
        return Optional.ofNullable(this.orStatement);
    }
    /**
     * @return Rule statement used to search web request components for matches with regular expressions. See Regex Pattern Set Reference Statement below for details.
     * 
     */
    public Optional<WebAclRuleStatementOrStatementStatementAndStatementStatementRegexPatternSetReferenceStatement> regexPatternSetReferenceStatement() {
        return Optional.ofNullable(this.regexPatternSetReferenceStatement);
    }
    /**
     * @return Rule statement that compares a number of bytes against the size of a request component, using a comparison operator, such as greater than (&gt;) or less than (&lt;). See Size Constraint Statement below for more details.
     * 
     */
    public Optional<WebAclRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatement> sizeConstraintStatement() {
        return Optional.ofNullable(this.sizeConstraintStatement);
    }
    /**
     * @return An SQL injection match condition identifies the part of web requests, such as the URI or the query string, that you want AWS WAF to inspect. See SQL Injection Match Statement below for details.
     * 
     */
    public Optional<WebAclRuleStatementOrStatementStatementAndStatementStatementSqliMatchStatement> sqliMatchStatement() {
        return Optional.ofNullable(this.sqliMatchStatement);
    }
    /**
     * @return Rule statement that defines a cross-site scripting (XSS) match search for AWS WAF to apply to web requests. See XSS Match Statement below for details.
     * 
     */
    public Optional<WebAclRuleStatementOrStatementStatementAndStatementStatementXssMatchStatement> xssMatchStatement() {
        return Optional.ofNullable(this.xssMatchStatement);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementOrStatementStatementAndStatementStatement defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable WebAclRuleStatementOrStatementStatementAndStatementStatementAndStatement andStatement;
        private @Nullable WebAclRuleStatementOrStatementStatementAndStatementStatementByteMatchStatement byteMatchStatement;
        private @Nullable WebAclRuleStatementOrStatementStatementAndStatementStatementGeoMatchStatement geoMatchStatement;
        private @Nullable WebAclRuleStatementOrStatementStatementAndStatementStatementIpSetReferenceStatement ipSetReferenceStatement;
        private @Nullable WebAclRuleStatementOrStatementStatementAndStatementStatementLabelMatchStatement labelMatchStatement;
        private @Nullable WebAclRuleStatementOrStatementStatementAndStatementStatementNotStatement notStatement;
        private @Nullable WebAclRuleStatementOrStatementStatementAndStatementStatementOrStatement orStatement;
        private @Nullable WebAclRuleStatementOrStatementStatementAndStatementStatementRegexPatternSetReferenceStatement regexPatternSetReferenceStatement;
        private @Nullable WebAclRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatement sizeConstraintStatement;
        private @Nullable WebAclRuleStatementOrStatementStatementAndStatementStatementSqliMatchStatement sqliMatchStatement;
        private @Nullable WebAclRuleStatementOrStatementStatementAndStatementStatementXssMatchStatement xssMatchStatement;
        public Builder() {}
        public Builder(WebAclRuleStatementOrStatementStatementAndStatementStatement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.andStatement = defaults.andStatement;
    	      this.byteMatchStatement = defaults.byteMatchStatement;
    	      this.geoMatchStatement = defaults.geoMatchStatement;
    	      this.ipSetReferenceStatement = defaults.ipSetReferenceStatement;
    	      this.labelMatchStatement = defaults.labelMatchStatement;
    	      this.notStatement = defaults.notStatement;
    	      this.orStatement = defaults.orStatement;
    	      this.regexPatternSetReferenceStatement = defaults.regexPatternSetReferenceStatement;
    	      this.sizeConstraintStatement = defaults.sizeConstraintStatement;
    	      this.sqliMatchStatement = defaults.sqliMatchStatement;
    	      this.xssMatchStatement = defaults.xssMatchStatement;
        }

        @CustomType.Setter
        public Builder andStatement(@Nullable WebAclRuleStatementOrStatementStatementAndStatementStatementAndStatement andStatement) {
            this.andStatement = andStatement;
            return this;
        }
        @CustomType.Setter
        public Builder byteMatchStatement(@Nullable WebAclRuleStatementOrStatementStatementAndStatementStatementByteMatchStatement byteMatchStatement) {
            this.byteMatchStatement = byteMatchStatement;
            return this;
        }
        @CustomType.Setter
        public Builder geoMatchStatement(@Nullable WebAclRuleStatementOrStatementStatementAndStatementStatementGeoMatchStatement geoMatchStatement) {
            this.geoMatchStatement = geoMatchStatement;
            return this;
        }
        @CustomType.Setter
        public Builder ipSetReferenceStatement(@Nullable WebAclRuleStatementOrStatementStatementAndStatementStatementIpSetReferenceStatement ipSetReferenceStatement) {
            this.ipSetReferenceStatement = ipSetReferenceStatement;
            return this;
        }
        @CustomType.Setter
        public Builder labelMatchStatement(@Nullable WebAclRuleStatementOrStatementStatementAndStatementStatementLabelMatchStatement labelMatchStatement) {
            this.labelMatchStatement = labelMatchStatement;
            return this;
        }
        @CustomType.Setter
        public Builder notStatement(@Nullable WebAclRuleStatementOrStatementStatementAndStatementStatementNotStatement notStatement) {
            this.notStatement = notStatement;
            return this;
        }
        @CustomType.Setter
        public Builder orStatement(@Nullable WebAclRuleStatementOrStatementStatementAndStatementStatementOrStatement orStatement) {
            this.orStatement = orStatement;
            return this;
        }
        @CustomType.Setter
        public Builder regexPatternSetReferenceStatement(@Nullable WebAclRuleStatementOrStatementStatementAndStatementStatementRegexPatternSetReferenceStatement regexPatternSetReferenceStatement) {
            this.regexPatternSetReferenceStatement = regexPatternSetReferenceStatement;
            return this;
        }
        @CustomType.Setter
        public Builder sizeConstraintStatement(@Nullable WebAclRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatement sizeConstraintStatement) {
            this.sizeConstraintStatement = sizeConstraintStatement;
            return this;
        }
        @CustomType.Setter
        public Builder sqliMatchStatement(@Nullable WebAclRuleStatementOrStatementStatementAndStatementStatementSqliMatchStatement sqliMatchStatement) {
            this.sqliMatchStatement = sqliMatchStatement;
            return this;
        }
        @CustomType.Setter
        public Builder xssMatchStatement(@Nullable WebAclRuleStatementOrStatementStatementAndStatementStatementXssMatchStatement xssMatchStatement) {
            this.xssMatchStatement = xssMatchStatement;
            return this;
        }
        public WebAclRuleStatementOrStatementStatementAndStatementStatement build() {
            final var o = new WebAclRuleStatementOrStatementStatementAndStatementStatement();
            o.andStatement = andStatement;
            o.byteMatchStatement = byteMatchStatement;
            o.geoMatchStatement = geoMatchStatement;
            o.ipSetReferenceStatement = ipSetReferenceStatement;
            o.labelMatchStatement = labelMatchStatement;
            o.notStatement = notStatement;
            o.orStatement = orStatement;
            o.regexPatternSetReferenceStatement = regexPatternSetReferenceStatement;
            o.sizeConstraintStatement = sizeConstraintStatement;
            o.sqliMatchStatement = sqliMatchStatement;
            o.xssMatchStatement = xssMatchStatement;
            return o;
        }
    }
}

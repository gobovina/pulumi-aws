// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.outputs;

import com.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementAndStatement;
import com.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementByteMatchStatement;
import com.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementGeoMatchStatement;
import com.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementIpSetReferenceStatement;
import com.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementLabelMatchStatement;
import com.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementNotStatement;
import com.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementOrStatement;
import com.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementRegexPatternSetReferenceStatement;
import com.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementSizeConstraintStatement;
import com.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementSqliMatchStatement;
import com.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementXssMatchStatement;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RuleGroupRuleStatement {
    /**
     * @return A logical rule statement used to combine other rule statements with AND logic. See AND Statement below for details.
     * 
     */
    private @Nullable RuleGroupRuleStatementAndStatement andStatement;
    /**
     * @return A rule statement that defines a string match search for AWS WAF to apply to web requests. See Byte Match Statement below for details.
     * 
     */
    private @Nullable RuleGroupRuleStatementByteMatchStatement byteMatchStatement;
    /**
     * @return A rule statement used to identify web requests based on country of origin. See GEO Match Statement below for details.
     * 
     */
    private @Nullable RuleGroupRuleStatementGeoMatchStatement geoMatchStatement;
    /**
     * @return A rule statement used to detect web requests coming from particular IP addresses or address ranges. See IP Set Reference Statement below for details.
     * 
     */
    private @Nullable RuleGroupRuleStatementIpSetReferenceStatement ipSetReferenceStatement;
    /**
     * @return A rule statement that defines a string match search against labels that have been added to the web request by rules that have already run in the web ACL. See Label Match Statement below for details.
     * 
     */
    private @Nullable RuleGroupRuleStatementLabelMatchStatement labelMatchStatement;
    /**
     * @return A logical rule statement used to negate the results of another rule statement. See NOT Statement below for details.
     * 
     */
    private @Nullable RuleGroupRuleStatementNotStatement notStatement;
    /**
     * @return A logical rule statement used to combine other rule statements with OR logic. See OR Statement below for details.
     * 
     */
    private @Nullable RuleGroupRuleStatementOrStatement orStatement;
    /**
     * @return A rule statement used to search web request components for matches with regular expressions. See Regex Pattern Set Reference Statement below for details.
     * 
     */
    private @Nullable RuleGroupRuleStatementRegexPatternSetReferenceStatement regexPatternSetReferenceStatement;
    /**
     * @return A rule statement that compares a number of bytes against the size of a request component, using a comparison operator, such as greater than (&gt;) or less than (&lt;). See Size Constraint Statement below for more details.
     * 
     */
    private @Nullable RuleGroupRuleStatementSizeConstraintStatement sizeConstraintStatement;
    /**
     * @return An SQL injection match condition identifies the part of web requests, such as the URI or the query string, that you want AWS WAF to inspect. See SQL Injection Match Statement below for details.
     * 
     */
    private @Nullable RuleGroupRuleStatementSqliMatchStatement sqliMatchStatement;
    /**
     * @return A rule statement that defines a cross-site scripting (XSS) match search for AWS WAF to apply to web requests. See XSS Match Statement below for details.
     * 
     */
    private @Nullable RuleGroupRuleStatementXssMatchStatement xssMatchStatement;

    private RuleGroupRuleStatement() {}
    /**
     * @return A logical rule statement used to combine other rule statements with AND logic. See AND Statement below for details.
     * 
     */
    public Optional<RuleGroupRuleStatementAndStatement> andStatement() {
        return Optional.ofNullable(this.andStatement);
    }
    /**
     * @return A rule statement that defines a string match search for AWS WAF to apply to web requests. See Byte Match Statement below for details.
     * 
     */
    public Optional<RuleGroupRuleStatementByteMatchStatement> byteMatchStatement() {
        return Optional.ofNullable(this.byteMatchStatement);
    }
    /**
     * @return A rule statement used to identify web requests based on country of origin. See GEO Match Statement below for details.
     * 
     */
    public Optional<RuleGroupRuleStatementGeoMatchStatement> geoMatchStatement() {
        return Optional.ofNullable(this.geoMatchStatement);
    }
    /**
     * @return A rule statement used to detect web requests coming from particular IP addresses or address ranges. See IP Set Reference Statement below for details.
     * 
     */
    public Optional<RuleGroupRuleStatementIpSetReferenceStatement> ipSetReferenceStatement() {
        return Optional.ofNullable(this.ipSetReferenceStatement);
    }
    /**
     * @return A rule statement that defines a string match search against labels that have been added to the web request by rules that have already run in the web ACL. See Label Match Statement below for details.
     * 
     */
    public Optional<RuleGroupRuleStatementLabelMatchStatement> labelMatchStatement() {
        return Optional.ofNullable(this.labelMatchStatement);
    }
    /**
     * @return A logical rule statement used to negate the results of another rule statement. See NOT Statement below for details.
     * 
     */
    public Optional<RuleGroupRuleStatementNotStatement> notStatement() {
        return Optional.ofNullable(this.notStatement);
    }
    /**
     * @return A logical rule statement used to combine other rule statements with OR logic. See OR Statement below for details.
     * 
     */
    public Optional<RuleGroupRuleStatementOrStatement> orStatement() {
        return Optional.ofNullable(this.orStatement);
    }
    /**
     * @return A rule statement used to search web request components for matches with regular expressions. See Regex Pattern Set Reference Statement below for details.
     * 
     */
    public Optional<RuleGroupRuleStatementRegexPatternSetReferenceStatement> regexPatternSetReferenceStatement() {
        return Optional.ofNullable(this.regexPatternSetReferenceStatement);
    }
    /**
     * @return A rule statement that compares a number of bytes against the size of a request component, using a comparison operator, such as greater than (&gt;) or less than (&lt;). See Size Constraint Statement below for more details.
     * 
     */
    public Optional<RuleGroupRuleStatementSizeConstraintStatement> sizeConstraintStatement() {
        return Optional.ofNullable(this.sizeConstraintStatement);
    }
    /**
     * @return An SQL injection match condition identifies the part of web requests, such as the URI or the query string, that you want AWS WAF to inspect. See SQL Injection Match Statement below for details.
     * 
     */
    public Optional<RuleGroupRuleStatementSqliMatchStatement> sqliMatchStatement() {
        return Optional.ofNullable(this.sqliMatchStatement);
    }
    /**
     * @return A rule statement that defines a cross-site scripting (XSS) match search for AWS WAF to apply to web requests. See XSS Match Statement below for details.
     * 
     */
    public Optional<RuleGroupRuleStatementXssMatchStatement> xssMatchStatement() {
        return Optional.ofNullable(this.xssMatchStatement);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleStatement defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable RuleGroupRuleStatementAndStatement andStatement;
        private @Nullable RuleGroupRuleStatementByteMatchStatement byteMatchStatement;
        private @Nullable RuleGroupRuleStatementGeoMatchStatement geoMatchStatement;
        private @Nullable RuleGroupRuleStatementIpSetReferenceStatement ipSetReferenceStatement;
        private @Nullable RuleGroupRuleStatementLabelMatchStatement labelMatchStatement;
        private @Nullable RuleGroupRuleStatementNotStatement notStatement;
        private @Nullable RuleGroupRuleStatementOrStatement orStatement;
        private @Nullable RuleGroupRuleStatementRegexPatternSetReferenceStatement regexPatternSetReferenceStatement;
        private @Nullable RuleGroupRuleStatementSizeConstraintStatement sizeConstraintStatement;
        private @Nullable RuleGroupRuleStatementSqliMatchStatement sqliMatchStatement;
        private @Nullable RuleGroupRuleStatementXssMatchStatement xssMatchStatement;
        public Builder() {}
        public Builder(RuleGroupRuleStatement defaults) {
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
        public Builder andStatement(@Nullable RuleGroupRuleStatementAndStatement andStatement) {
            this.andStatement = andStatement;
            return this;
        }
        @CustomType.Setter
        public Builder byteMatchStatement(@Nullable RuleGroupRuleStatementByteMatchStatement byteMatchStatement) {
            this.byteMatchStatement = byteMatchStatement;
            return this;
        }
        @CustomType.Setter
        public Builder geoMatchStatement(@Nullable RuleGroupRuleStatementGeoMatchStatement geoMatchStatement) {
            this.geoMatchStatement = geoMatchStatement;
            return this;
        }
        @CustomType.Setter
        public Builder ipSetReferenceStatement(@Nullable RuleGroupRuleStatementIpSetReferenceStatement ipSetReferenceStatement) {
            this.ipSetReferenceStatement = ipSetReferenceStatement;
            return this;
        }
        @CustomType.Setter
        public Builder labelMatchStatement(@Nullable RuleGroupRuleStatementLabelMatchStatement labelMatchStatement) {
            this.labelMatchStatement = labelMatchStatement;
            return this;
        }
        @CustomType.Setter
        public Builder notStatement(@Nullable RuleGroupRuleStatementNotStatement notStatement) {
            this.notStatement = notStatement;
            return this;
        }
        @CustomType.Setter
        public Builder orStatement(@Nullable RuleGroupRuleStatementOrStatement orStatement) {
            this.orStatement = orStatement;
            return this;
        }
        @CustomType.Setter
        public Builder regexPatternSetReferenceStatement(@Nullable RuleGroupRuleStatementRegexPatternSetReferenceStatement regexPatternSetReferenceStatement) {
            this.regexPatternSetReferenceStatement = regexPatternSetReferenceStatement;
            return this;
        }
        @CustomType.Setter
        public Builder sizeConstraintStatement(@Nullable RuleGroupRuleStatementSizeConstraintStatement sizeConstraintStatement) {
            this.sizeConstraintStatement = sizeConstraintStatement;
            return this;
        }
        @CustomType.Setter
        public Builder sqliMatchStatement(@Nullable RuleGroupRuleStatementSqliMatchStatement sqliMatchStatement) {
            this.sqliMatchStatement = sqliMatchStatement;
            return this;
        }
        @CustomType.Setter
        public Builder xssMatchStatement(@Nullable RuleGroupRuleStatementXssMatchStatement xssMatchStatement) {
            this.xssMatchStatement = xssMatchStatement;
            return this;
        }
        public RuleGroupRuleStatement build() {
            final var o = new RuleGroupRuleStatement();
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

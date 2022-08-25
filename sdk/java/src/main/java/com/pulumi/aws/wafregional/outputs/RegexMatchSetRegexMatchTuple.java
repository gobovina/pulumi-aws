// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafregional.outputs;

import com.pulumi.aws.wafregional.outputs.RegexMatchSetRegexMatchTupleFieldToMatch;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class RegexMatchSetRegexMatchTuple {
    /**
     * @return The part of a web request that you want to search, such as a specified header or a query string.
     * 
     */
    private RegexMatchSetRegexMatchTupleFieldToMatch fieldToMatch;
    /**
     * @return The ID of a `WAF Regex Pattern Set`.
     * 
     */
    private String regexPatternSetId;
    /**
     * @return Text transformations used to eliminate unusual formatting that attackers use in web requests in an effort to bypass AWS WAF.
     * e.g. `CMD_LINE`, `HTML_ENTITY_DECODE` or `NONE`.
     * See [docs](http://docs.aws.amazon.com/waf/latest/APIReference/API_ByteMatchTuple.html#WAF-Type-ByteMatchTuple-TextTransformation)
     * for all supported values.
     * 
     */
    private String textTransformation;

    private RegexMatchSetRegexMatchTuple() {}
    /**
     * @return The part of a web request that you want to search, such as a specified header or a query string.
     * 
     */
    public RegexMatchSetRegexMatchTupleFieldToMatch fieldToMatch() {
        return this.fieldToMatch;
    }
    /**
     * @return The ID of a `WAF Regex Pattern Set`.
     * 
     */
    public String regexPatternSetId() {
        return this.regexPatternSetId;
    }
    /**
     * @return Text transformations used to eliminate unusual formatting that attackers use in web requests in an effort to bypass AWS WAF.
     * e.g. `CMD_LINE`, `HTML_ENTITY_DECODE` or `NONE`.
     * See [docs](http://docs.aws.amazon.com/waf/latest/APIReference/API_ByteMatchTuple.html#WAF-Type-ByteMatchTuple-TextTransformation)
     * for all supported values.
     * 
     */
    public String textTransformation() {
        return this.textTransformation;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegexMatchSetRegexMatchTuple defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private RegexMatchSetRegexMatchTupleFieldToMatch fieldToMatch;
        private String regexPatternSetId;
        private String textTransformation;
        public Builder() {}
        public Builder(RegexMatchSetRegexMatchTuple defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fieldToMatch = defaults.fieldToMatch;
    	      this.regexPatternSetId = defaults.regexPatternSetId;
    	      this.textTransformation = defaults.textTransformation;
        }

        @CustomType.Setter
        public Builder fieldToMatch(RegexMatchSetRegexMatchTupleFieldToMatch fieldToMatch) {
            this.fieldToMatch = Objects.requireNonNull(fieldToMatch);
            return this;
        }
        @CustomType.Setter
        public Builder regexPatternSetId(String regexPatternSetId) {
            this.regexPatternSetId = Objects.requireNonNull(regexPatternSetId);
            return this;
        }
        @CustomType.Setter
        public Builder textTransformation(String textTransformation) {
            this.textTransformation = Objects.requireNonNull(textTransformation);
            return this;
        }
        public RegexMatchSetRegexMatchTuple build() {
            final var o = new RegexMatchSetRegexMatchTuple();
            o.fieldToMatch = fieldToMatch;
            o.regexPatternSetId = regexPatternSetId;
            o.textTransformation = textTransformation;
            return o;
        }
    }
}

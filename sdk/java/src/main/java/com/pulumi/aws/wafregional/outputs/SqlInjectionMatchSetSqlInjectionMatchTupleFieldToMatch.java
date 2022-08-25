// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafregional.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SqlInjectionMatchSetSqlInjectionMatchTupleFieldToMatch {
    /**
     * @return When `type` is `HEADER`, enter the name of the header that you want to search, e.g., `User-Agent` or `Referer`.
     * If `type` is any other value, omit this field.
     * 
     */
    private @Nullable String data;
    /**
     * @return The part of the web request that you want AWS WAF to search for a specified string.
     * e.g., `HEADER`, `METHOD` or `BODY`.
     * See [docs](https://docs.aws.amazon.com/waf/latest/APIReference/API_regional_FieldToMatch.html)
     * for all supported values.
     * 
     */
    private String type;

    private SqlInjectionMatchSetSqlInjectionMatchTupleFieldToMatch() {}
    /**
     * @return When `type` is `HEADER`, enter the name of the header that you want to search, e.g., `User-Agent` or `Referer`.
     * If `type` is any other value, omit this field.
     * 
     */
    public Optional<String> data() {
        return Optional.ofNullable(this.data);
    }
    /**
     * @return The part of the web request that you want AWS WAF to search for a specified string.
     * e.g., `HEADER`, `METHOD` or `BODY`.
     * See [docs](https://docs.aws.amazon.com/waf/latest/APIReference/API_regional_FieldToMatch.html)
     * for all supported values.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SqlInjectionMatchSetSqlInjectionMatchTupleFieldToMatch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String data;
        private String type;
        public Builder() {}
        public Builder(SqlInjectionMatchSetSqlInjectionMatchTupleFieldToMatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.data = defaults.data;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder data(@Nullable String data) {
            this.data = data;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public SqlInjectionMatchSetSqlInjectionMatchTupleFieldToMatch build() {
            final var o = new SqlInjectionMatchSetSqlInjectionMatchTupleFieldToMatch();
            o.data = data;
            o.type = type;
            return o;
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafregional.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GeoMatchSetGeoMatchConstraint {
    /**
     * @return The type of geographical area you want AWS WAF to search for. Currently Country is the only valid value.
     * 
     */
    private String type;
    /**
     * @return The country that you want AWS WAF to search for.
     * This is the two-letter country code, e.g., `US`, `CA`, `RU`, `CN`, etc.
     * See [docs](https://docs.aws.amazon.com/waf/latest/APIReference/API_GeoMatchConstraint.html) for all supported values.
     * 
     */
    private String value;

    private GeoMatchSetGeoMatchConstraint() {}
    /**
     * @return The type of geographical area you want AWS WAF to search for. Currently Country is the only valid value.
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return The country that you want AWS WAF to search for.
     * This is the two-letter country code, e.g., `US`, `CA`, `RU`, `CN`, etc.
     * See [docs](https://docs.aws.amazon.com/waf/latest/APIReference/API_GeoMatchConstraint.html) for all supported values.
     * 
     */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GeoMatchSetGeoMatchConstraint defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String type;
        private String value;
        public Builder() {}
        public Builder(GeoMatchSetGeoMatchConstraint defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        @CustomType.Setter
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public GeoMatchSetGeoMatchConstraint build() {
            final var o = new GeoMatchSetGeoMatchConstraint();
            o.type = type;
            o.value = value;
            return o;
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.securityhub.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class InsightFiltersResourceTag {
    private String comparison;
    /**
     * @return The key of the map filter. For example, for `ResourceTags`, `Key` identifies the name of the tag. For `UserDefinedFields`, `Key` is the name of the field.
     * 
     */
    private String key;
    private String value;

    private InsightFiltersResourceTag() {}
    public String comparison() {
        return this.comparison;
    }
    /**
     * @return The key of the map filter. For example, for `ResourceTags`, `Key` identifies the name of the tag. For `UserDefinedFields`, `Key` is the name of the field.
     * 
     */
    public String key() {
        return this.key;
    }
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InsightFiltersResourceTag defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String comparison;
        private String key;
        private String value;
        public Builder() {}
        public Builder(InsightFiltersResourceTag defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.comparison = defaults.comparison;
    	      this.key = defaults.key;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder comparison(String comparison) {
            if (comparison == null) {
              throw new MissingRequiredPropertyException("InsightFiltersResourceTag", "comparison");
            }
            this.comparison = comparison;
            return this;
        }
        @CustomType.Setter
        public Builder key(String key) {
            if (key == null) {
              throw new MissingRequiredPropertyException("InsightFiltersResourceTag", "key");
            }
            this.key = key;
            return this;
        }
        @CustomType.Setter
        public Builder value(String value) {
            if (value == null) {
              throw new MissingRequiredPropertyException("InsightFiltersResourceTag", "value");
            }
            this.value = value;
            return this;
        }
        public InsightFiltersResourceTag build() {
            final var _resultValue = new InsightFiltersResourceTag();
            _resultValue.comparison = comparison;
            _resultValue.key = key;
            _resultValue.value = value;
            return _resultValue;
        }
    }
}

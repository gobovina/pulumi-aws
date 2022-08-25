// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.macie2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClassificationJobS3JobDefinitionScopingIncludesAndTagScopeTermTagValue {
    /**
     * @return The tag key.
     * 
     */
    private @Nullable String key;
    /**
     * @return The tag value.
     * 
     */
    private @Nullable String value;

    private ClassificationJobS3JobDefinitionScopingIncludesAndTagScopeTermTagValue() {}
    /**
     * @return The tag key.
     * 
     */
    public Optional<String> key() {
        return Optional.ofNullable(this.key);
    }
    /**
     * @return The tag value.
     * 
     */
    public Optional<String> value() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClassificationJobS3JobDefinitionScopingIncludesAndTagScopeTermTagValue defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String key;
        private @Nullable String value;
        public Builder() {}
        public Builder(ClassificationJobS3JobDefinitionScopingIncludesAndTagScopeTermTagValue defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder key(@Nullable String key) {
            this.key = key;
            return this;
        }
        @CustomType.Setter
        public Builder value(@Nullable String value) {
            this.value = value;
            return this;
        }
        public ClassificationJobS3JobDefinitionScopingIncludesAndTagScopeTermTagValue build() {
            final var o = new ClassificationJobS3JobDefinitionScopingIncludesAndTagScopeTermTagValue();
            o.key = key;
            o.value = value;
            return o;
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cognito.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class UserPoolSchemaStringAttributeConstraints {
    /**
     * @return Maximum length of an attribute value of the string type.
     * 
     */
    private @Nullable String maxLength;
    /**
     * @return Minimum length of an attribute value of the string type.
     * 
     */
    private @Nullable String minLength;

    private UserPoolSchemaStringAttributeConstraints() {}
    /**
     * @return Maximum length of an attribute value of the string type.
     * 
     */
    public Optional<String> maxLength() {
        return Optional.ofNullable(this.maxLength);
    }
    /**
     * @return Minimum length of an attribute value of the string type.
     * 
     */
    public Optional<String> minLength() {
        return Optional.ofNullable(this.minLength);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserPoolSchemaStringAttributeConstraints defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String maxLength;
        private @Nullable String minLength;
        public Builder() {}
        public Builder(UserPoolSchemaStringAttributeConstraints defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxLength = defaults.maxLength;
    	      this.minLength = defaults.minLength;
        }

        @CustomType.Setter
        public Builder maxLength(@Nullable String maxLength) {
            this.maxLength = maxLength;
            return this;
        }
        @CustomType.Setter
        public Builder minLength(@Nullable String minLength) {
            this.minLength = minLength;
            return this;
        }
        public UserPoolSchemaStringAttributeConstraints build() {
            final var o = new UserPoolSchemaStringAttributeConstraints();
            o.maxLength = maxLength;
            o.minLength = minLength;
            return o;
        }
    }
}

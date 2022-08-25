// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudwatch.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EventConnectionAuthParametersOauthOauthHttpParametersQueryString {
    /**
     * @return Specified whether the value is secret.
     * 
     */
    private @Nullable Boolean isValueSecret;
    /**
     * @return Header Name.
     * 
     */
    private @Nullable String key;
    /**
     * @return Header Value. Created and stored in AWS Secrets Manager.
     * 
     */
    private @Nullable String value;

    private EventConnectionAuthParametersOauthOauthHttpParametersQueryString() {}
    /**
     * @return Specified whether the value is secret.
     * 
     */
    public Optional<Boolean> isValueSecret() {
        return Optional.ofNullable(this.isValueSecret);
    }
    /**
     * @return Header Name.
     * 
     */
    public Optional<String> key() {
        return Optional.ofNullable(this.key);
    }
    /**
     * @return Header Value. Created and stored in AWS Secrets Manager.
     * 
     */
    public Optional<String> value() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventConnectionAuthParametersOauthOauthHttpParametersQueryString defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean isValueSecret;
        private @Nullable String key;
        private @Nullable String value;
        public Builder() {}
        public Builder(EventConnectionAuthParametersOauthOauthHttpParametersQueryString defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.isValueSecret = defaults.isValueSecret;
    	      this.key = defaults.key;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder isValueSecret(@Nullable Boolean isValueSecret) {
            this.isValueSecret = isValueSecret;
            return this;
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
        public EventConnectionAuthParametersOauthOauthHttpParametersQueryString build() {
            final var o = new EventConnectionAuthParametersOauthOauthHttpParametersQueryString();
            o.isValueSecret = isValueSecret;
            o.key = key;
            o.value = value;
            return o;
        }
    }
}

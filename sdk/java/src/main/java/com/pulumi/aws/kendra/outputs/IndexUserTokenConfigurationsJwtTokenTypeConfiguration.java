// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kendra.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class IndexUserTokenConfigurationsJwtTokenTypeConfiguration {
    /**
     * @return The regular expression that identifies the claim. Minimum length of 1. Maximum length of 100.
     * 
     */
    private @Nullable String claimRegex;
    /**
     * @return The group attribute field. Minimum length of 1. Maximum length of 100.
     * 
     */
    private @Nullable String groupAttributeField;
    /**
     * @return The issuer of the token. Minimum length of 1. Maximum length of 65.
     * 
     */
    private @Nullable String issuer;
    /**
     * @return The location of the key. Valid values are `URL` or `SECRET_MANAGER`
     * 
     */
    private String keyLocation;
    /**
     * @return The Amazon Resource Name (ARN) of the secret.
     * 
     */
    private @Nullable String secretsManagerArn;
    /**
     * @return The signing key URL. Valid pattern is `^(https?|ftp|file):\/\/([^\s]*)`
     * 
     */
    private @Nullable String url;
    /**
     * @return The user name attribute field. Minimum length of 1. Maximum length of 100.
     * 
     */
    private @Nullable String userNameAttributeField;

    private IndexUserTokenConfigurationsJwtTokenTypeConfiguration() {}
    /**
     * @return The regular expression that identifies the claim. Minimum length of 1. Maximum length of 100.
     * 
     */
    public Optional<String> claimRegex() {
        return Optional.ofNullable(this.claimRegex);
    }
    /**
     * @return The group attribute field. Minimum length of 1. Maximum length of 100.
     * 
     */
    public Optional<String> groupAttributeField() {
        return Optional.ofNullable(this.groupAttributeField);
    }
    /**
     * @return The issuer of the token. Minimum length of 1. Maximum length of 65.
     * 
     */
    public Optional<String> issuer() {
        return Optional.ofNullable(this.issuer);
    }
    /**
     * @return The location of the key. Valid values are `URL` or `SECRET_MANAGER`
     * 
     */
    public String keyLocation() {
        return this.keyLocation;
    }
    /**
     * @return The Amazon Resource Name (ARN) of the secret.
     * 
     */
    public Optional<String> secretsManagerArn() {
        return Optional.ofNullable(this.secretsManagerArn);
    }
    /**
     * @return The signing key URL. Valid pattern is `^(https?|ftp|file):\/\/([^\s]*)`
     * 
     */
    public Optional<String> url() {
        return Optional.ofNullable(this.url);
    }
    /**
     * @return The user name attribute field. Minimum length of 1. Maximum length of 100.
     * 
     */
    public Optional<String> userNameAttributeField() {
        return Optional.ofNullable(this.userNameAttributeField);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IndexUserTokenConfigurationsJwtTokenTypeConfiguration defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String claimRegex;
        private @Nullable String groupAttributeField;
        private @Nullable String issuer;
        private String keyLocation;
        private @Nullable String secretsManagerArn;
        private @Nullable String url;
        private @Nullable String userNameAttributeField;
        public Builder() {}
        public Builder(IndexUserTokenConfigurationsJwtTokenTypeConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.claimRegex = defaults.claimRegex;
    	      this.groupAttributeField = defaults.groupAttributeField;
    	      this.issuer = defaults.issuer;
    	      this.keyLocation = defaults.keyLocation;
    	      this.secretsManagerArn = defaults.secretsManagerArn;
    	      this.url = defaults.url;
    	      this.userNameAttributeField = defaults.userNameAttributeField;
        }

        @CustomType.Setter
        public Builder claimRegex(@Nullable String claimRegex) {
            this.claimRegex = claimRegex;
            return this;
        }
        @CustomType.Setter
        public Builder groupAttributeField(@Nullable String groupAttributeField) {
            this.groupAttributeField = groupAttributeField;
            return this;
        }
        @CustomType.Setter
        public Builder issuer(@Nullable String issuer) {
            this.issuer = issuer;
            return this;
        }
        @CustomType.Setter
        public Builder keyLocation(String keyLocation) {
            this.keyLocation = Objects.requireNonNull(keyLocation);
            return this;
        }
        @CustomType.Setter
        public Builder secretsManagerArn(@Nullable String secretsManagerArn) {
            this.secretsManagerArn = secretsManagerArn;
            return this;
        }
        @CustomType.Setter
        public Builder url(@Nullable String url) {
            this.url = url;
            return this;
        }
        @CustomType.Setter
        public Builder userNameAttributeField(@Nullable String userNameAttributeField) {
            this.userNameAttributeField = userNameAttributeField;
            return this;
        }
        public IndexUserTokenConfigurationsJwtTokenTypeConfiguration build() {
            final var o = new IndexUserTokenConfigurationsJwtTokenTypeConfiguration();
            o.claimRegex = claimRegex;
            o.groupAttributeField = groupAttributeField;
            o.issuer = issuer;
            o.keyLocation = keyLocation;
            o.secretsManagerArn = secretsManagerArn;
            o.url = url;
            o.userNameAttributeField = userNameAttributeField;
            return o;
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cognito.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class IdentityPoolCognitoIdentityProvider {
    /**
     * @return The client ID for the Amazon Cognito Identity User Pool.
     * 
     */
    private @Nullable String clientId;
    /**
     * @return The provider name for an Amazon Cognito Identity User Pool.
     * 
     */
    private @Nullable String providerName;
    /**
     * @return Whether server-side token validation is enabled for the identity provider’s token or not.
     * 
     */
    private @Nullable Boolean serverSideTokenCheck;

    private IdentityPoolCognitoIdentityProvider() {}
    /**
     * @return The client ID for the Amazon Cognito Identity User Pool.
     * 
     */
    public Optional<String> clientId() {
        return Optional.ofNullable(this.clientId);
    }
    /**
     * @return The provider name for an Amazon Cognito Identity User Pool.
     * 
     */
    public Optional<String> providerName() {
        return Optional.ofNullable(this.providerName);
    }
    /**
     * @return Whether server-side token validation is enabled for the identity provider’s token or not.
     * 
     */
    public Optional<Boolean> serverSideTokenCheck() {
        return Optional.ofNullable(this.serverSideTokenCheck);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IdentityPoolCognitoIdentityProvider defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String clientId;
        private @Nullable String providerName;
        private @Nullable Boolean serverSideTokenCheck;
        public Builder() {}
        public Builder(IdentityPoolCognitoIdentityProvider defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientId = defaults.clientId;
    	      this.providerName = defaults.providerName;
    	      this.serverSideTokenCheck = defaults.serverSideTokenCheck;
        }

        @CustomType.Setter
        public Builder clientId(@Nullable String clientId) {
            this.clientId = clientId;
            return this;
        }
        @CustomType.Setter
        public Builder providerName(@Nullable String providerName) {
            this.providerName = providerName;
            return this;
        }
        @CustomType.Setter
        public Builder serverSideTokenCheck(@Nullable Boolean serverSideTokenCheck) {
            this.serverSideTokenCheck = serverSideTokenCheck;
            return this;
        }
        public IdentityPoolCognitoIdentityProvider build() {
            final var o = new IdentityPoolCognitoIdentityProvider();
            o.clientId = clientId;
            o.providerName = providerName;
            o.serverSideTokenCheck = serverSideTokenCheck;
            return o;
        }
    }
}

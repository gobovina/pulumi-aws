// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appflow.outputs;

import com.pulumi.aws.appflow.outputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsSapoDataOauthCredentialsOauthRequest;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsSapoDataOauthCredentials {
    /**
     * @return The credentials used to access protected Zendesk resources.
     * 
     */
    private @Nullable String accessToken;
    /**
     * @return The identifier for the desired client.
     * 
     */
    private String clientId;
    /**
     * @return The client secret used by the OAuth client to authenticate to the authorization server.
     * 
     */
    private String clientSecret;
    /**
     * @return The OAuth requirement needed to request security tokens from the connector endpoint. See OAuth Request for more details.
     * 
     */
    private @Nullable ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsSapoDataOauthCredentialsOauthRequest oauthRequest;
    /**
     * @return The refresh token used to refresh expired access token.
     * 
     */
    private @Nullable String refreshToken;

    private ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsSapoDataOauthCredentials() {}
    /**
     * @return The credentials used to access protected Zendesk resources.
     * 
     */
    public Optional<String> accessToken() {
        return Optional.ofNullable(this.accessToken);
    }
    /**
     * @return The identifier for the desired client.
     * 
     */
    public String clientId() {
        return this.clientId;
    }
    /**
     * @return The client secret used by the OAuth client to authenticate to the authorization server.
     * 
     */
    public String clientSecret() {
        return this.clientSecret;
    }
    /**
     * @return The OAuth requirement needed to request security tokens from the connector endpoint. See OAuth Request for more details.
     * 
     */
    public Optional<ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsSapoDataOauthCredentialsOauthRequest> oauthRequest() {
        return Optional.ofNullable(this.oauthRequest);
    }
    /**
     * @return The refresh token used to refresh expired access token.
     * 
     */
    public Optional<String> refreshToken() {
        return Optional.ofNullable(this.refreshToken);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsSapoDataOauthCredentials defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String accessToken;
        private String clientId;
        private String clientSecret;
        private @Nullable ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsSapoDataOauthCredentialsOauthRequest oauthRequest;
        private @Nullable String refreshToken;
        public Builder() {}
        public Builder(ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsSapoDataOauthCredentials defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessToken = defaults.accessToken;
    	      this.clientId = defaults.clientId;
    	      this.clientSecret = defaults.clientSecret;
    	      this.oauthRequest = defaults.oauthRequest;
    	      this.refreshToken = defaults.refreshToken;
        }

        @CustomType.Setter
        public Builder accessToken(@Nullable String accessToken) {
            this.accessToken = accessToken;
            return this;
        }
        @CustomType.Setter
        public Builder clientId(String clientId) {
            this.clientId = Objects.requireNonNull(clientId);
            return this;
        }
        @CustomType.Setter
        public Builder clientSecret(String clientSecret) {
            this.clientSecret = Objects.requireNonNull(clientSecret);
            return this;
        }
        @CustomType.Setter
        public Builder oauthRequest(@Nullable ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsSapoDataOauthCredentialsOauthRequest oauthRequest) {
            this.oauthRequest = oauthRequest;
            return this;
        }
        @CustomType.Setter
        public Builder refreshToken(@Nullable String refreshToken) {
            this.refreshToken = refreshToken;
            return this;
        }
        public ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsSapoDataOauthCredentials build() {
            final var o = new ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsSapoDataOauthCredentials();
            o.accessToken = accessToken;
            o.clientId = clientId;
            o.clientSecret = clientSecret;
            o.oauthRequest = oauthRequest;
            o.refreshToken = refreshToken;
            return o;
        }
    }
}

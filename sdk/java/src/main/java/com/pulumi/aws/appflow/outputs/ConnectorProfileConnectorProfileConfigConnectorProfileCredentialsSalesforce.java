// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appflow.outputs;

import com.pulumi.aws.appflow.outputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsSalesforceOauthRequest;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsSalesforce {
    /**
     * @return The credentials used to access protected Zendesk resources.
     * 
     */
    private @Nullable String accessToken;
    /**
     * @return The secret manager ARN, which contains the client ID and client secret of the connected app.
     * 
     */
    private @Nullable String clientCredentialsArn;
    /**
     * @return The OAuth requirement needed to request security tokens from the connector endpoint. See OAuth Request for more details.
     * 
     */
    private @Nullable ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsSalesforceOauthRequest oauthRequest;
    /**
     * @return The refresh token used to refresh expired access token.
     * 
     */
    private @Nullable String refreshToken;

    private ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsSalesforce() {}
    /**
     * @return The credentials used to access protected Zendesk resources.
     * 
     */
    public Optional<String> accessToken() {
        return Optional.ofNullable(this.accessToken);
    }
    /**
     * @return The secret manager ARN, which contains the client ID and client secret of the connected app.
     * 
     */
    public Optional<String> clientCredentialsArn() {
        return Optional.ofNullable(this.clientCredentialsArn);
    }
    /**
     * @return The OAuth requirement needed to request security tokens from the connector endpoint. See OAuth Request for more details.
     * 
     */
    public Optional<ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsSalesforceOauthRequest> oauthRequest() {
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

    public static Builder builder(ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsSalesforce defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String accessToken;
        private @Nullable String clientCredentialsArn;
        private @Nullable ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsSalesforceOauthRequest oauthRequest;
        private @Nullable String refreshToken;
        public Builder() {}
        public Builder(ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsSalesforce defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessToken = defaults.accessToken;
    	      this.clientCredentialsArn = defaults.clientCredentialsArn;
    	      this.oauthRequest = defaults.oauthRequest;
    	      this.refreshToken = defaults.refreshToken;
        }

        @CustomType.Setter
        public Builder accessToken(@Nullable String accessToken) {
            this.accessToken = accessToken;
            return this;
        }
        @CustomType.Setter
        public Builder clientCredentialsArn(@Nullable String clientCredentialsArn) {
            this.clientCredentialsArn = clientCredentialsArn;
            return this;
        }
        @CustomType.Setter
        public Builder oauthRequest(@Nullable ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsSalesforceOauthRequest oauthRequest) {
            this.oauthRequest = oauthRequest;
            return this;
        }
        @CustomType.Setter
        public Builder refreshToken(@Nullable String refreshToken) {
            this.refreshToken = refreshToken;
            return this;
        }
        public ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsSalesforce build() {
            final var o = new ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsSalesforce();
            o.accessToken = accessToken;
            o.clientCredentialsArn = clientCredentialsArn;
            o.oauthRequest = oauthRequest;
            o.refreshToken = refreshToken;
            return o;
        }
    }
}

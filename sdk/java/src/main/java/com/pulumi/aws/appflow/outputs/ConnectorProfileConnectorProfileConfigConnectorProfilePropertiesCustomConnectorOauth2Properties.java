// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appflow.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesCustomConnectorOauth2Properties {
    /**
     * @return The OAuth 2.0 grant type used by connector for OAuth 2.0 authentication. One of: `AUTHORIZATION_CODE`, `CLIENT_CREDENTIALS`.
     * 
     */
    private String oauth2GrantType;
    /**
     * @return The token url required to fetch access/refresh tokens using authorization code and also to refresh expired access token using refresh token.
     * 
     */
    private String tokenUrl;
    /**
     * @return Associates your token URL with a map of properties that you define. Use this parameter to provide any additional details that the connector requires to authenticate your request.
     * 
     */
    private @Nullable Map<String,String> tokenUrlCustomProperties;

    private ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesCustomConnectorOauth2Properties() {}
    /**
     * @return The OAuth 2.0 grant type used by connector for OAuth 2.0 authentication. One of: `AUTHORIZATION_CODE`, `CLIENT_CREDENTIALS`.
     * 
     */
    public String oauth2GrantType() {
        return this.oauth2GrantType;
    }
    /**
     * @return The token url required to fetch access/refresh tokens using authorization code and also to refresh expired access token using refresh token.
     * 
     */
    public String tokenUrl() {
        return this.tokenUrl;
    }
    /**
     * @return Associates your token URL with a map of properties that you define. Use this parameter to provide any additional details that the connector requires to authenticate your request.
     * 
     */
    public Map<String,String> tokenUrlCustomProperties() {
        return this.tokenUrlCustomProperties == null ? Map.of() : this.tokenUrlCustomProperties;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesCustomConnectorOauth2Properties defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String oauth2GrantType;
        private String tokenUrl;
        private @Nullable Map<String,String> tokenUrlCustomProperties;
        public Builder() {}
        public Builder(ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesCustomConnectorOauth2Properties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.oauth2GrantType = defaults.oauth2GrantType;
    	      this.tokenUrl = defaults.tokenUrl;
    	      this.tokenUrlCustomProperties = defaults.tokenUrlCustomProperties;
        }

        @CustomType.Setter
        public Builder oauth2GrantType(String oauth2GrantType) {
            this.oauth2GrantType = Objects.requireNonNull(oauth2GrantType);
            return this;
        }
        @CustomType.Setter
        public Builder tokenUrl(String tokenUrl) {
            this.tokenUrl = Objects.requireNonNull(tokenUrl);
            return this;
        }
        @CustomType.Setter
        public Builder tokenUrlCustomProperties(@Nullable Map<String,String> tokenUrlCustomProperties) {
            this.tokenUrlCustomProperties = tokenUrlCustomProperties;
            return this;
        }
        public ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesCustomConnectorOauth2Properties build() {
            final var o = new ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesCustomConnectorOauth2Properties();
            o.oauth2GrantType = oauth2GrantType;
            o.tokenUrl = tokenUrl;
            o.tokenUrlCustomProperties = tokenUrlCustomProperties;
            return o;
        }
    }
}

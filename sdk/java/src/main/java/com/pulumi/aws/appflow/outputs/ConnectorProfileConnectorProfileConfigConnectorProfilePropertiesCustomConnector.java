// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appflow.outputs;

import com.pulumi.aws.appflow.outputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesCustomConnectorOauth2Properties;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesCustomConnector {
    /**
     * @return The OAuth 2.0 properties required for OAuth 2.0 authentication.
     * 
     */
    private @Nullable ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesCustomConnectorOauth2Properties oauth2Properties;
    /**
     * @return A map of properties that are required to create a profile for the custom connector.
     * 
     */
    private @Nullable Map<String,String> profileProperties;

    private ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesCustomConnector() {}
    /**
     * @return The OAuth 2.0 properties required for OAuth 2.0 authentication.
     * 
     */
    public Optional<ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesCustomConnectorOauth2Properties> oauth2Properties() {
        return Optional.ofNullable(this.oauth2Properties);
    }
    /**
     * @return A map of properties that are required to create a profile for the custom connector.
     * 
     */
    public Map<String,String> profileProperties() {
        return this.profileProperties == null ? Map.of() : this.profileProperties;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesCustomConnector defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesCustomConnectorOauth2Properties oauth2Properties;
        private @Nullable Map<String,String> profileProperties;
        public Builder() {}
        public Builder(ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesCustomConnector defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.oauth2Properties = defaults.oauth2Properties;
    	      this.profileProperties = defaults.profileProperties;
        }

        @CustomType.Setter
        public Builder oauth2Properties(@Nullable ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesCustomConnectorOauth2Properties oauth2Properties) {

            this.oauth2Properties = oauth2Properties;
            return this;
        }
        @CustomType.Setter
        public Builder profileProperties(@Nullable Map<String,String> profileProperties) {

            this.profileProperties = profileProperties;
            return this;
        }
        public ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesCustomConnector build() {
            final var _resultValue = new ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesCustomConnector();
            _resultValue.oauth2Properties = oauth2Properties;
            _resultValue.profileProperties = profileProperties;
            return _resultValue;
        }
    }
}

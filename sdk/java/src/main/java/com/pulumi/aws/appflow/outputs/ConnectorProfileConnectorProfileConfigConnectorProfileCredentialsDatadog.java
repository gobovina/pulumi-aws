// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appflow.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsDatadog {
    /**
     * @return A unique alphanumeric identifier used to authenticate a user, developer, or calling program to your API.
     * 
     */
    private String apiKey;
    /**
     * @return Application keys, in conjunction with your API key, give you full access to Datadog’s programmatic API. Application keys are associated with the user account that created them. The application key is used to log all requests made to the API.
     * 
     */
    private String applicationKey;

    private ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsDatadog() {}
    /**
     * @return A unique alphanumeric identifier used to authenticate a user, developer, or calling program to your API.
     * 
     */
    public String apiKey() {
        return this.apiKey;
    }
    /**
     * @return Application keys, in conjunction with your API key, give you full access to Datadog’s programmatic API. Application keys are associated with the user account that created them. The application key is used to log all requests made to the API.
     * 
     */
    public String applicationKey() {
        return this.applicationKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsDatadog defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String apiKey;
        private String applicationKey;
        public Builder() {}
        public Builder(ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsDatadog defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiKey = defaults.apiKey;
    	      this.applicationKey = defaults.applicationKey;
        }

        @CustomType.Setter
        public Builder apiKey(String apiKey) {
            this.apiKey = Objects.requireNonNull(apiKey);
            return this;
        }
        @CustomType.Setter
        public Builder applicationKey(String applicationKey) {
            this.applicationKey = Objects.requireNonNull(applicationKey);
            return this;
        }
        public ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsDatadog build() {
            final var o = new ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsDatadog();
            o.apiKey = apiKey;
            o.applicationKey = applicationKey;
            return o;
        }
    }
}

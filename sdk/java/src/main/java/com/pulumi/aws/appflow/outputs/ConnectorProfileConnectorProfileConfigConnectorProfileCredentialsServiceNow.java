// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appflow.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsServiceNow {
    /**
     * @return The password that corresponds to the user name.
     * 
     */
    private String password;
    /**
     * @return The name of the user.
     * 
     */
    private String username;

    private ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsServiceNow() {}
    /**
     * @return The password that corresponds to the user name.
     * 
     */
    public String password() {
        return this.password;
    }
    /**
     * @return The name of the user.
     * 
     */
    public String username() {
        return this.username;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsServiceNow defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String password;
        private String username;
        public Builder() {}
        public Builder(ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsServiceNow defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.password = defaults.password;
    	      this.username = defaults.username;
        }

        @CustomType.Setter
        public Builder password(String password) {
            this.password = Objects.requireNonNull(password);
            return this;
        }
        @CustomType.Setter
        public Builder username(String username) {
            this.username = Objects.requireNonNull(username);
            return this;
        }
        public ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsServiceNow build() {
            final var o = new ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsServiceNow();
            o.password = password;
            o.username = username;
            return o;
        }
    }
}

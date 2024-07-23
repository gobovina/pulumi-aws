// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appflow.inputs;

import com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsCustomConnectorApiKeyArgs;
import com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsCustomConnectorBasicArgs;
import com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsCustomConnectorCustomArgs;
import com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsCustomConnectorOauth2Args;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsCustomConnectorArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsCustomConnectorArgs Empty = new ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsCustomConnectorArgs();

    @Import(name="apiKey")
    private @Nullable Output<ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsCustomConnectorApiKeyArgs> apiKey;

    public Optional<Output<ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsCustomConnectorApiKeyArgs>> apiKey() {
        return Optional.ofNullable(this.apiKey);
    }

    /**
     * The authentication type that the custom connector uses for authenticating while creating a connector profile. One of: `APIKEY`, `BASIC`, `CUSTOM`, `OAUTH2`.
     * 
     */
    @Import(name="authenticationType", required=true)
    private Output<String> authenticationType;

    /**
     * @return The authentication type that the custom connector uses for authenticating while creating a connector profile. One of: `APIKEY`, `BASIC`, `CUSTOM`, `OAUTH2`.
     * 
     */
    public Output<String> authenticationType() {
        return this.authenticationType;
    }

    /**
     * Basic credentials that are required for the authentication of the user.
     * 
     */
    @Import(name="basic")
    private @Nullable Output<ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsCustomConnectorBasicArgs> basic;

    /**
     * @return Basic credentials that are required for the authentication of the user.
     * 
     */
    public Optional<Output<ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsCustomConnectorBasicArgs>> basic() {
        return Optional.ofNullable(this.basic);
    }

    /**
     * If the connector uses the custom authentication mechanism, this holds the required credentials.
     * 
     */
    @Import(name="custom")
    private @Nullable Output<ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsCustomConnectorCustomArgs> custom;

    /**
     * @return If the connector uses the custom authentication mechanism, this holds the required credentials.
     * 
     */
    public Optional<Output<ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsCustomConnectorCustomArgs>> custom() {
        return Optional.ofNullable(this.custom);
    }

    /**
     * OAuth 2.0 credentials required for the authentication of the user.
     * 
     */
    @Import(name="oauth2")
    private @Nullable Output<ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsCustomConnectorOauth2Args> oauth2;

    /**
     * @return OAuth 2.0 credentials required for the authentication of the user.
     * 
     */
    public Optional<Output<ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsCustomConnectorOauth2Args>> oauth2() {
        return Optional.ofNullable(this.oauth2);
    }

    private ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsCustomConnectorArgs() {}

    private ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsCustomConnectorArgs(ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsCustomConnectorArgs $) {
        this.apiKey = $.apiKey;
        this.authenticationType = $.authenticationType;
        this.basic = $.basic;
        this.custom = $.custom;
        this.oauth2 = $.oauth2;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsCustomConnectorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsCustomConnectorArgs $;

        public Builder() {
            $ = new ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsCustomConnectorArgs();
        }

        public Builder(ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsCustomConnectorArgs defaults) {
            $ = new ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsCustomConnectorArgs(Objects.requireNonNull(defaults));
        }

        public Builder apiKey(@Nullable Output<ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsCustomConnectorApiKeyArgs> apiKey) {
            $.apiKey = apiKey;
            return this;
        }

        public Builder apiKey(ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsCustomConnectorApiKeyArgs apiKey) {
            return apiKey(Output.of(apiKey));
        }

        /**
         * @param authenticationType The authentication type that the custom connector uses for authenticating while creating a connector profile. One of: `APIKEY`, `BASIC`, `CUSTOM`, `OAUTH2`.
         * 
         * @return builder
         * 
         */
        public Builder authenticationType(Output<String> authenticationType) {
            $.authenticationType = authenticationType;
            return this;
        }

        /**
         * @param authenticationType The authentication type that the custom connector uses for authenticating while creating a connector profile. One of: `APIKEY`, `BASIC`, `CUSTOM`, `OAUTH2`.
         * 
         * @return builder
         * 
         */
        public Builder authenticationType(String authenticationType) {
            return authenticationType(Output.of(authenticationType));
        }

        /**
         * @param basic Basic credentials that are required for the authentication of the user.
         * 
         * @return builder
         * 
         */
        public Builder basic(@Nullable Output<ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsCustomConnectorBasicArgs> basic) {
            $.basic = basic;
            return this;
        }

        /**
         * @param basic Basic credentials that are required for the authentication of the user.
         * 
         * @return builder
         * 
         */
        public Builder basic(ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsCustomConnectorBasicArgs basic) {
            return basic(Output.of(basic));
        }

        /**
         * @param custom If the connector uses the custom authentication mechanism, this holds the required credentials.
         * 
         * @return builder
         * 
         */
        public Builder custom(@Nullable Output<ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsCustomConnectorCustomArgs> custom) {
            $.custom = custom;
            return this;
        }

        /**
         * @param custom If the connector uses the custom authentication mechanism, this holds the required credentials.
         * 
         * @return builder
         * 
         */
        public Builder custom(ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsCustomConnectorCustomArgs custom) {
            return custom(Output.of(custom));
        }

        /**
         * @param oauth2 OAuth 2.0 credentials required for the authentication of the user.
         * 
         * @return builder
         * 
         */
        public Builder oauth2(@Nullable Output<ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsCustomConnectorOauth2Args> oauth2) {
            $.oauth2 = oauth2;
            return this;
        }

        /**
         * @param oauth2 OAuth 2.0 credentials required for the authentication of the user.
         * 
         * @return builder
         * 
         */
        public Builder oauth2(ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsCustomConnectorOauth2Args oauth2) {
            return oauth2(Output.of(oauth2));
        }

        public ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsCustomConnectorArgs build() {
            if ($.authenticationType == null) {
                throw new MissingRequiredPropertyException("ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsCustomConnectorArgs", "authenticationType");
            }
            return $;
        }
    }

}

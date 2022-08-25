// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.alb.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ListenerRuleActionAuthenticateOidc {
    /**
     * @return The query parameters to include in the redirect request to the authorization endpoint. Max: 10.
     * 
     */
    private @Nullable Map<String,String> authenticationRequestExtraParams;
    /**
     * @return The authorization endpoint of the IdP.
     * 
     */
    private String authorizationEndpoint;
    /**
     * @return The OAuth 2.0 client identifier.
     * 
     */
    private String clientId;
    /**
     * @return The OAuth 2.0 client secret.
     * 
     */
    private String clientSecret;
    /**
     * @return The OIDC issuer identifier of the IdP.
     * 
     */
    private String issuer;
    /**
     * @return The behavior if the user is not authenticated. Valid values: `deny`, `allow` and `authenticate`
     * 
     */
    private @Nullable String onUnauthenticatedRequest;
    /**
     * @return The set of user claims to be requested from the IdP.
     * 
     */
    private @Nullable String scope;
    /**
     * @return The name of the cookie used to maintain session information.
     * 
     */
    private @Nullable String sessionCookieName;
    /**
     * @return The maximum duration of the authentication session, in seconds.
     * 
     */
    private @Nullable Integer sessionTimeout;
    /**
     * @return The token endpoint of the IdP.
     * 
     */
    private String tokenEndpoint;
    /**
     * @return The user info endpoint of the IdP.
     * 
     */
    private String userInfoEndpoint;

    private ListenerRuleActionAuthenticateOidc() {}
    /**
     * @return The query parameters to include in the redirect request to the authorization endpoint. Max: 10.
     * 
     */
    public Map<String,String> authenticationRequestExtraParams() {
        return this.authenticationRequestExtraParams == null ? Map.of() : this.authenticationRequestExtraParams;
    }
    /**
     * @return The authorization endpoint of the IdP.
     * 
     */
    public String authorizationEndpoint() {
        return this.authorizationEndpoint;
    }
    /**
     * @return The OAuth 2.0 client identifier.
     * 
     */
    public String clientId() {
        return this.clientId;
    }
    /**
     * @return The OAuth 2.0 client secret.
     * 
     */
    public String clientSecret() {
        return this.clientSecret;
    }
    /**
     * @return The OIDC issuer identifier of the IdP.
     * 
     */
    public String issuer() {
        return this.issuer;
    }
    /**
     * @return The behavior if the user is not authenticated. Valid values: `deny`, `allow` and `authenticate`
     * 
     */
    public Optional<String> onUnauthenticatedRequest() {
        return Optional.ofNullable(this.onUnauthenticatedRequest);
    }
    /**
     * @return The set of user claims to be requested from the IdP.
     * 
     */
    public Optional<String> scope() {
        return Optional.ofNullable(this.scope);
    }
    /**
     * @return The name of the cookie used to maintain session information.
     * 
     */
    public Optional<String> sessionCookieName() {
        return Optional.ofNullable(this.sessionCookieName);
    }
    /**
     * @return The maximum duration of the authentication session, in seconds.
     * 
     */
    public Optional<Integer> sessionTimeout() {
        return Optional.ofNullable(this.sessionTimeout);
    }
    /**
     * @return The token endpoint of the IdP.
     * 
     */
    public String tokenEndpoint() {
        return this.tokenEndpoint;
    }
    /**
     * @return The user info endpoint of the IdP.
     * 
     */
    public String userInfoEndpoint() {
        return this.userInfoEndpoint;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListenerRuleActionAuthenticateOidc defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Map<String,String> authenticationRequestExtraParams;
        private String authorizationEndpoint;
        private String clientId;
        private String clientSecret;
        private String issuer;
        private @Nullable String onUnauthenticatedRequest;
        private @Nullable String scope;
        private @Nullable String sessionCookieName;
        private @Nullable Integer sessionTimeout;
        private String tokenEndpoint;
        private String userInfoEndpoint;
        public Builder() {}
        public Builder(ListenerRuleActionAuthenticateOidc defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authenticationRequestExtraParams = defaults.authenticationRequestExtraParams;
    	      this.authorizationEndpoint = defaults.authorizationEndpoint;
    	      this.clientId = defaults.clientId;
    	      this.clientSecret = defaults.clientSecret;
    	      this.issuer = defaults.issuer;
    	      this.onUnauthenticatedRequest = defaults.onUnauthenticatedRequest;
    	      this.scope = defaults.scope;
    	      this.sessionCookieName = defaults.sessionCookieName;
    	      this.sessionTimeout = defaults.sessionTimeout;
    	      this.tokenEndpoint = defaults.tokenEndpoint;
    	      this.userInfoEndpoint = defaults.userInfoEndpoint;
        }

        @CustomType.Setter
        public Builder authenticationRequestExtraParams(@Nullable Map<String,String> authenticationRequestExtraParams) {
            this.authenticationRequestExtraParams = authenticationRequestExtraParams;
            return this;
        }
        @CustomType.Setter
        public Builder authorizationEndpoint(String authorizationEndpoint) {
            this.authorizationEndpoint = Objects.requireNonNull(authorizationEndpoint);
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
        public Builder issuer(String issuer) {
            this.issuer = Objects.requireNonNull(issuer);
            return this;
        }
        @CustomType.Setter
        public Builder onUnauthenticatedRequest(@Nullable String onUnauthenticatedRequest) {
            this.onUnauthenticatedRequest = onUnauthenticatedRequest;
            return this;
        }
        @CustomType.Setter
        public Builder scope(@Nullable String scope) {
            this.scope = scope;
            return this;
        }
        @CustomType.Setter
        public Builder sessionCookieName(@Nullable String sessionCookieName) {
            this.sessionCookieName = sessionCookieName;
            return this;
        }
        @CustomType.Setter
        public Builder sessionTimeout(@Nullable Integer sessionTimeout) {
            this.sessionTimeout = sessionTimeout;
            return this;
        }
        @CustomType.Setter
        public Builder tokenEndpoint(String tokenEndpoint) {
            this.tokenEndpoint = Objects.requireNonNull(tokenEndpoint);
            return this;
        }
        @CustomType.Setter
        public Builder userInfoEndpoint(String userInfoEndpoint) {
            this.userInfoEndpoint = Objects.requireNonNull(userInfoEndpoint);
            return this;
        }
        public ListenerRuleActionAuthenticateOidc build() {
            final var o = new ListenerRuleActionAuthenticateOidc();
            o.authenticationRequestExtraParams = authenticationRequestExtraParams;
            o.authorizationEndpoint = authorizationEndpoint;
            o.clientId = clientId;
            o.clientSecret = clientSecret;
            o.issuer = issuer;
            o.onUnauthenticatedRequest = onUnauthenticatedRequest;
            o.scope = scope;
            o.sessionCookieName = sessionCookieName;
            o.sessionTimeout = sessionTimeout;
            o.tokenEndpoint = tokenEndpoint;
            o.userInfoEndpoint = userInfoEndpoint;
            return o;
        }
    }
}

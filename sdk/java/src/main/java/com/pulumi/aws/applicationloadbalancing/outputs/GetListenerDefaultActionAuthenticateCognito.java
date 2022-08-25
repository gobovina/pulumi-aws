// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.applicationloadbalancing.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetListenerDefaultActionAuthenticateCognito {
    private Map<String,String> authenticationRequestExtraParams;
    private String onUnauthenticatedRequest;
    private String scope;
    private String sessionCookieName;
    private Integer sessionTimeout;
    private String userPoolArn;
    private String userPoolClientId;
    private String userPoolDomain;

    private GetListenerDefaultActionAuthenticateCognito() {}
    public Map<String,String> authenticationRequestExtraParams() {
        return this.authenticationRequestExtraParams;
    }
    public String onUnauthenticatedRequest() {
        return this.onUnauthenticatedRequest;
    }
    public String scope() {
        return this.scope;
    }
    public String sessionCookieName() {
        return this.sessionCookieName;
    }
    public Integer sessionTimeout() {
        return this.sessionTimeout;
    }
    public String userPoolArn() {
        return this.userPoolArn;
    }
    public String userPoolClientId() {
        return this.userPoolClientId;
    }
    public String userPoolDomain() {
        return this.userPoolDomain;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetListenerDefaultActionAuthenticateCognito defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Map<String,String> authenticationRequestExtraParams;
        private String onUnauthenticatedRequest;
        private String scope;
        private String sessionCookieName;
        private Integer sessionTimeout;
        private String userPoolArn;
        private String userPoolClientId;
        private String userPoolDomain;
        public Builder() {}
        public Builder(GetListenerDefaultActionAuthenticateCognito defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authenticationRequestExtraParams = defaults.authenticationRequestExtraParams;
    	      this.onUnauthenticatedRequest = defaults.onUnauthenticatedRequest;
    	      this.scope = defaults.scope;
    	      this.sessionCookieName = defaults.sessionCookieName;
    	      this.sessionTimeout = defaults.sessionTimeout;
    	      this.userPoolArn = defaults.userPoolArn;
    	      this.userPoolClientId = defaults.userPoolClientId;
    	      this.userPoolDomain = defaults.userPoolDomain;
        }

        @CustomType.Setter
        public Builder authenticationRequestExtraParams(Map<String,String> authenticationRequestExtraParams) {
            this.authenticationRequestExtraParams = Objects.requireNonNull(authenticationRequestExtraParams);
            return this;
        }
        @CustomType.Setter
        public Builder onUnauthenticatedRequest(String onUnauthenticatedRequest) {
            this.onUnauthenticatedRequest = Objects.requireNonNull(onUnauthenticatedRequest);
            return this;
        }
        @CustomType.Setter
        public Builder scope(String scope) {
            this.scope = Objects.requireNonNull(scope);
            return this;
        }
        @CustomType.Setter
        public Builder sessionCookieName(String sessionCookieName) {
            this.sessionCookieName = Objects.requireNonNull(sessionCookieName);
            return this;
        }
        @CustomType.Setter
        public Builder sessionTimeout(Integer sessionTimeout) {
            this.sessionTimeout = Objects.requireNonNull(sessionTimeout);
            return this;
        }
        @CustomType.Setter
        public Builder userPoolArn(String userPoolArn) {
            this.userPoolArn = Objects.requireNonNull(userPoolArn);
            return this;
        }
        @CustomType.Setter
        public Builder userPoolClientId(String userPoolClientId) {
            this.userPoolClientId = Objects.requireNonNull(userPoolClientId);
            return this;
        }
        @CustomType.Setter
        public Builder userPoolDomain(String userPoolDomain) {
            this.userPoolDomain = Objects.requireNonNull(userPoolDomain);
            return this;
        }
        public GetListenerDefaultActionAuthenticateCognito build() {
            final var o = new GetListenerDefaultActionAuthenticateCognito();
            o.authenticationRequestExtraParams = authenticationRequestExtraParams;
            o.onUnauthenticatedRequest = onUnauthenticatedRequest;
            o.scope = scope;
            o.sessionCookieName = sessionCookieName;
            o.sessionTimeout = sessionTimeout;
            o.userPoolArn = userPoolArn;
            o.userPoolClientId = userPoolClientId;
            o.userPoolDomain = userPoolDomain;
            return o;
        }
    }
}

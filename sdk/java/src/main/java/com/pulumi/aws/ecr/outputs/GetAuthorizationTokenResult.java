// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ecr.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetAuthorizationTokenResult {
    /**
     * @return Temporary IAM authentication credentials to access the ECR repository encoded in base64 in the form of `user_name:password`.
     * 
     */
    private String authorizationToken;
    /**
     * @return The time in UTC RFC3339 format when the authorization token expires.
     * 
     */
    private String expiresAt;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return Password decoded from the authorization token.
     * 
     */
    private String password;
    /**
     * @return The registry URL to use in the docker login command.
     * 
     */
    private String proxyEndpoint;
    private @Nullable String registryId;
    /**
     * @return User name decoded from the authorization token.
     * 
     */
    private String userName;

    private GetAuthorizationTokenResult() {}
    /**
     * @return Temporary IAM authentication credentials to access the ECR repository encoded in base64 in the form of `user_name:password`.
     * 
     */
    public String authorizationToken() {
        return this.authorizationToken;
    }
    /**
     * @return The time in UTC RFC3339 format when the authorization token expires.
     * 
     */
    public String expiresAt() {
        return this.expiresAt;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Password decoded from the authorization token.
     * 
     */
    public String password() {
        return this.password;
    }
    /**
     * @return The registry URL to use in the docker login command.
     * 
     */
    public String proxyEndpoint() {
        return this.proxyEndpoint;
    }
    public Optional<String> registryId() {
        return Optional.ofNullable(this.registryId);
    }
    /**
     * @return User name decoded from the authorization token.
     * 
     */
    public String userName() {
        return this.userName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAuthorizationTokenResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String authorizationToken;
        private String expiresAt;
        private String id;
        private String password;
        private String proxyEndpoint;
        private @Nullable String registryId;
        private String userName;
        public Builder() {}
        public Builder(GetAuthorizationTokenResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorizationToken = defaults.authorizationToken;
    	      this.expiresAt = defaults.expiresAt;
    	      this.id = defaults.id;
    	      this.password = defaults.password;
    	      this.proxyEndpoint = defaults.proxyEndpoint;
    	      this.registryId = defaults.registryId;
    	      this.userName = defaults.userName;
        }

        @CustomType.Setter
        public Builder authorizationToken(String authorizationToken) {
            this.authorizationToken = Objects.requireNonNull(authorizationToken);
            return this;
        }
        @CustomType.Setter
        public Builder expiresAt(String expiresAt) {
            this.expiresAt = Objects.requireNonNull(expiresAt);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder password(String password) {
            this.password = Objects.requireNonNull(password);
            return this;
        }
        @CustomType.Setter
        public Builder proxyEndpoint(String proxyEndpoint) {
            this.proxyEndpoint = Objects.requireNonNull(proxyEndpoint);
            return this;
        }
        @CustomType.Setter
        public Builder registryId(@Nullable String registryId) {
            this.registryId = registryId;
            return this;
        }
        @CustomType.Setter
        public Builder userName(String userName) {
            this.userName = Objects.requireNonNull(userName);
            return this;
        }
        public GetAuthorizationTokenResult build() {
            final var o = new GetAuthorizationTokenResult();
            o.authorizationToken = authorizationToken;
            o.expiresAt = expiresAt;
            o.id = id;
            o.password = password;
            o.proxyEndpoint = proxyEndpoint;
            o.registryId = registryId;
            o.userName = userName;
            return o;
        }
    }
}

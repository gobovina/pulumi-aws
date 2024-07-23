// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.pipes.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PipeSourceParametersManagedStreamingKafkaParametersCredentials {
    /**
     * @return The ARN of the Secrets Manager secret containing the credentials.
     * 
     */
    private @Nullable String clientCertificateTlsAuth;
    /**
     * @return The ARN of the Secrets Manager secret containing the credentials.
     * 
     */
    private @Nullable String saslScram512Auth;

    private PipeSourceParametersManagedStreamingKafkaParametersCredentials() {}
    /**
     * @return The ARN of the Secrets Manager secret containing the credentials.
     * 
     */
    public Optional<String> clientCertificateTlsAuth() {
        return Optional.ofNullable(this.clientCertificateTlsAuth);
    }
    /**
     * @return The ARN of the Secrets Manager secret containing the credentials.
     * 
     */
    public Optional<String> saslScram512Auth() {
        return Optional.ofNullable(this.saslScram512Auth);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PipeSourceParametersManagedStreamingKafkaParametersCredentials defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String clientCertificateTlsAuth;
        private @Nullable String saslScram512Auth;
        public Builder() {}
        public Builder(PipeSourceParametersManagedStreamingKafkaParametersCredentials defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientCertificateTlsAuth = defaults.clientCertificateTlsAuth;
    	      this.saslScram512Auth = defaults.saslScram512Auth;
        }

        @CustomType.Setter
        public Builder clientCertificateTlsAuth(@Nullable String clientCertificateTlsAuth) {

            this.clientCertificateTlsAuth = clientCertificateTlsAuth;
            return this;
        }
        @CustomType.Setter
        public Builder saslScram512Auth(@Nullable String saslScram512Auth) {

            this.saslScram512Auth = saslScram512Auth;
            return this;
        }
        public PipeSourceParametersManagedStreamingKafkaParametersCredentials build() {
            final var _resultValue = new PipeSourceParametersManagedStreamingKafkaParametersCredentials();
            _resultValue.clientCertificateTlsAuth = clientCertificateTlsAuth;
            _resultValue.saslScram512Auth = saslScram512Auth;
            return _resultValue;
        }
    }
}

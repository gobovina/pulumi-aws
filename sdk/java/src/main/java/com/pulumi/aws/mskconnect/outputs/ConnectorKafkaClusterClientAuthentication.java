// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.mskconnect.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ConnectorKafkaClusterClientAuthentication {
    /**
     * @return The type of client authentication used to connect to the Apache Kafka cluster. Valid values: `IAM`, `NONE`. A value of `NONE` means that no client authentication is used. The default value is `NONE`.
     * 
     */
    private @Nullable String authenticationType;

    private ConnectorKafkaClusterClientAuthentication() {}
    /**
     * @return The type of client authentication used to connect to the Apache Kafka cluster. Valid values: `IAM`, `NONE`. A value of `NONE` means that no client authentication is used. The default value is `NONE`.
     * 
     */
    public Optional<String> authenticationType() {
        return Optional.ofNullable(this.authenticationType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorKafkaClusterClientAuthentication defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String authenticationType;
        public Builder() {}
        public Builder(ConnectorKafkaClusterClientAuthentication defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authenticationType = defaults.authenticationType;
        }

        @CustomType.Setter
        public Builder authenticationType(@Nullable String authenticationType) {
            this.authenticationType = authenticationType;
            return this;
        }
        public ConnectorKafkaClusterClientAuthentication build() {
            final var o = new ConnectorKafkaClusterClientAuthentication();
            o.authenticationType = authenticationType;
            return o;
        }
    }
}

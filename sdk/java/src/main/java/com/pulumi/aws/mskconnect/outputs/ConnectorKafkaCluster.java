// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.mskconnect.outputs;

import com.pulumi.aws.mskconnect.outputs.ConnectorKafkaClusterApacheKafkaCluster;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;

@CustomType
public final class ConnectorKafkaCluster {
    /**
     * @return The Apache Kafka cluster to which the connector is connected.
     * 
     */
    private ConnectorKafkaClusterApacheKafkaCluster apacheKafkaCluster;

    private ConnectorKafkaCluster() {}
    /**
     * @return The Apache Kafka cluster to which the connector is connected.
     * 
     */
    public ConnectorKafkaClusterApacheKafkaCluster apacheKafkaCluster() {
        return this.apacheKafkaCluster;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorKafkaCluster defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private ConnectorKafkaClusterApacheKafkaCluster apacheKafkaCluster;
        public Builder() {}
        public Builder(ConnectorKafkaCluster defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apacheKafkaCluster = defaults.apacheKafkaCluster;
        }

        @CustomType.Setter
        public Builder apacheKafkaCluster(ConnectorKafkaClusterApacheKafkaCluster apacheKafkaCluster) {
            this.apacheKafkaCluster = Objects.requireNonNull(apacheKafkaCluster);
            return this;
        }
        public ConnectorKafkaCluster build() {
            final var o = new ConnectorKafkaCluster();
            o.apacheKafkaCluster = apacheKafkaCluster;
            return o;
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.mskconnect.outputs;

import com.pulumi.aws.mskconnect.outputs.ConnectorCapacityAutoscaling;
import com.pulumi.aws.mskconnect.outputs.ConnectorCapacityProvisionedCapacity;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ConnectorCapacity {
    /**
     * @return Information about the auto scaling parameters for the connector. See below.
     * 
     */
    private @Nullable ConnectorCapacityAutoscaling autoscaling;
    /**
     * @return Details about a fixed capacity allocated to a connector. See below.
     * 
     */
    private @Nullable ConnectorCapacityProvisionedCapacity provisionedCapacity;

    private ConnectorCapacity() {}
    /**
     * @return Information about the auto scaling parameters for the connector. See below.
     * 
     */
    public Optional<ConnectorCapacityAutoscaling> autoscaling() {
        return Optional.ofNullable(this.autoscaling);
    }
    /**
     * @return Details about a fixed capacity allocated to a connector. See below.
     * 
     */
    public Optional<ConnectorCapacityProvisionedCapacity> provisionedCapacity() {
        return Optional.ofNullable(this.provisionedCapacity);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorCapacity defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable ConnectorCapacityAutoscaling autoscaling;
        private @Nullable ConnectorCapacityProvisionedCapacity provisionedCapacity;
        public Builder() {}
        public Builder(ConnectorCapacity defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoscaling = defaults.autoscaling;
    	      this.provisionedCapacity = defaults.provisionedCapacity;
        }

        @CustomType.Setter
        public Builder autoscaling(@Nullable ConnectorCapacityAutoscaling autoscaling) {
            this.autoscaling = autoscaling;
            return this;
        }
        @CustomType.Setter
        public Builder provisionedCapacity(@Nullable ConnectorCapacityProvisionedCapacity provisionedCapacity) {
            this.provisionedCapacity = provisionedCapacity;
            return this;
        }
        public ConnectorCapacity build() {
            final var o = new ConnectorCapacity();
            o.autoscaling = autoscaling;
            o.provisionedCapacity = provisionedCapacity;
            return o;
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.globalaccelerator.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class EndpointGroupPortOverride {
    /**
     * @return The endpoint port that you want a listener port to be mapped to. This is the port on the endpoint, such as the Application Load Balancer or Amazon EC2 instance.
     * 
     */
    private Integer endpointPort;
    /**
     * @return The listener port that you want to map to a specific endpoint port. This is the port that user traffic arrives to the Global Accelerator on.
     * 
     */
    private Integer listenerPort;

    private EndpointGroupPortOverride() {}
    /**
     * @return The endpoint port that you want a listener port to be mapped to. This is the port on the endpoint, such as the Application Load Balancer or Amazon EC2 instance.
     * 
     */
    public Integer endpointPort() {
        return this.endpointPort;
    }
    /**
     * @return The listener port that you want to map to a specific endpoint port. This is the port that user traffic arrives to the Global Accelerator on.
     * 
     */
    public Integer listenerPort() {
        return this.listenerPort;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointGroupPortOverride defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer endpointPort;
        private Integer listenerPort;
        public Builder() {}
        public Builder(EndpointGroupPortOverride defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpointPort = defaults.endpointPort;
    	      this.listenerPort = defaults.listenerPort;
        }

        @CustomType.Setter
        public Builder endpointPort(Integer endpointPort) {
            this.endpointPort = Objects.requireNonNull(endpointPort);
            return this;
        }
        @CustomType.Setter
        public Builder listenerPort(Integer listenerPort) {
            this.listenerPort = Objects.requireNonNull(listenerPort);
            return this;
        }
        public EndpointGroupPortOverride build() {
            final var o = new EndpointGroupPortOverride();
            o.endpointPort = endpointPort;
            o.listenerPort = listenerPort;
            return o;
        }
    }
}

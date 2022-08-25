// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.emrcontainers.outputs;

import com.pulumi.aws.emrcontainers.outputs.VirtualClusterContainerProviderInfo;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class VirtualClusterContainerProvider {
    /**
     * @return The name of the container provider that is running your EMR Containers cluster
     * 
     */
    private String id;
    /**
     * @return Nested list containing information about the configuration of the container provider
     * 
     */
    private VirtualClusterContainerProviderInfo info;
    /**
     * @return The type of the container provider
     * 
     */
    private String type;

    private VirtualClusterContainerProvider() {}
    /**
     * @return The name of the container provider that is running your EMR Containers cluster
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Nested list containing information about the configuration of the container provider
     * 
     */
    public VirtualClusterContainerProviderInfo info() {
        return this.info;
    }
    /**
     * @return The type of the container provider
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualClusterContainerProvider defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private VirtualClusterContainerProviderInfo info;
        private String type;
        public Builder() {}
        public Builder(VirtualClusterContainerProvider defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.info = defaults.info;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder info(VirtualClusterContainerProviderInfo info) {
            this.info = Objects.requireNonNull(info);
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public VirtualClusterContainerProvider build() {
            final var o = new VirtualClusterContainerProvider();
            o.id = id;
            o.info = info;
            o.type = type;
            return o;
        }
    }
}

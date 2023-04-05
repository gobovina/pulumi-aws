// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GatewayRouteSpecGrpcRouteMatchArgs extends com.pulumi.resources.ResourceArgs {

    public static final GatewayRouteSpecGrpcRouteMatchArgs Empty = new GatewayRouteSpecGrpcRouteMatchArgs();

    /**
     * The port number that corresponds to the target for Virtual Service provider port. This is required when the provider (router or node) of the Virtual Service has multiple listeners.
     * 
     */
    @Import(name="port")
    private @Nullable Output<Integer> port;

    /**
     * @return The port number that corresponds to the target for Virtual Service provider port. This is required when the provider (router or node) of the Virtual Service has multiple listeners.
     * 
     */
    public Optional<Output<Integer>> port() {
        return Optional.ofNullable(this.port);
    }

    /**
     * Fully qualified domain name for the service to match from the request.
     * 
     */
    @Import(name="serviceName", required=true)
    private Output<String> serviceName;

    /**
     * @return Fully qualified domain name for the service to match from the request.
     * 
     */
    public Output<String> serviceName() {
        return this.serviceName;
    }

    private GatewayRouteSpecGrpcRouteMatchArgs() {}

    private GatewayRouteSpecGrpcRouteMatchArgs(GatewayRouteSpecGrpcRouteMatchArgs $) {
        this.port = $.port;
        this.serviceName = $.serviceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GatewayRouteSpecGrpcRouteMatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GatewayRouteSpecGrpcRouteMatchArgs $;

        public Builder() {
            $ = new GatewayRouteSpecGrpcRouteMatchArgs();
        }

        public Builder(GatewayRouteSpecGrpcRouteMatchArgs defaults) {
            $ = new GatewayRouteSpecGrpcRouteMatchArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param port The port number that corresponds to the target for Virtual Service provider port. This is required when the provider (router or node) of the Virtual Service has multiple listeners.
         * 
         * @return builder
         * 
         */
        public Builder port(@Nullable Output<Integer> port) {
            $.port = port;
            return this;
        }

        /**
         * @param port The port number that corresponds to the target for Virtual Service provider port. This is required when the provider (router or node) of the Virtual Service has multiple listeners.
         * 
         * @return builder
         * 
         */
        public Builder port(Integer port) {
            return port(Output.of(port));
        }

        /**
         * @param serviceName Fully qualified domain name for the service to match from the request.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(Output<String> serviceName) {
            $.serviceName = serviceName;
            return this;
        }

        /**
         * @param serviceName Fully qualified domain name for the service to match from the request.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(String serviceName) {
            return serviceName(Output.of(serviceName));
        }

        public GatewayRouteSpecGrpcRouteMatchArgs build() {
            $.serviceName = Objects.requireNonNull($.serviceName, "expected parameter 'serviceName' to be non-null");
            return $;
        }
    }

}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.inputs;

import com.pulumi.aws.appmesh.inputs.RouteSpecHttpRouteMatchQueryParameterMatchArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RouteSpecHttpRouteMatchQueryParameterArgs extends com.pulumi.resources.ResourceArgs {

    public static final RouteSpecHttpRouteMatchQueryParameterArgs Empty = new RouteSpecHttpRouteMatchQueryParameterArgs();

    /**
     * Criteria for determining an gRPC request match.
     * 
     */
    @Import(name="match")
    private @Nullable Output<RouteSpecHttpRouteMatchQueryParameterMatchArgs> match;

    /**
     * @return Criteria for determining an gRPC request match.
     * 
     */
    public Optional<Output<RouteSpecHttpRouteMatchQueryParameterMatchArgs>> match() {
        return Optional.ofNullable(this.match);
    }

    /**
     * Name to use for the route. Must be between 1 and 255 characters in length.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Name to use for the route. Must be between 1 and 255 characters in length.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    private RouteSpecHttpRouteMatchQueryParameterArgs() {}

    private RouteSpecHttpRouteMatchQueryParameterArgs(RouteSpecHttpRouteMatchQueryParameterArgs $) {
        this.match = $.match;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RouteSpecHttpRouteMatchQueryParameterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RouteSpecHttpRouteMatchQueryParameterArgs $;

        public Builder() {
            $ = new RouteSpecHttpRouteMatchQueryParameterArgs();
        }

        public Builder(RouteSpecHttpRouteMatchQueryParameterArgs defaults) {
            $ = new RouteSpecHttpRouteMatchQueryParameterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param match Criteria for determining an gRPC request match.
         * 
         * @return builder
         * 
         */
        public Builder match(@Nullable Output<RouteSpecHttpRouteMatchQueryParameterMatchArgs> match) {
            $.match = match;
            return this;
        }

        /**
         * @param match Criteria for determining an gRPC request match.
         * 
         * @return builder
         * 
         */
        public Builder match(RouteSpecHttpRouteMatchQueryParameterMatchArgs match) {
            return match(Output.of(match));
        }

        /**
         * @param name Name to use for the route. Must be between 1 and 255 characters in length.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name to use for the route. Must be between 1 and 255 characters in length.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public RouteSpecHttpRouteMatchQueryParameterArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}

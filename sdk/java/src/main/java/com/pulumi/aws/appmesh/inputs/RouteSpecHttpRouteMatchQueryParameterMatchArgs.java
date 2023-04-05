// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RouteSpecHttpRouteMatchQueryParameterMatchArgs extends com.pulumi.resources.ResourceArgs {

    public static final RouteSpecHttpRouteMatchQueryParameterMatchArgs Empty = new RouteSpecHttpRouteMatchQueryParameterMatchArgs();

    /**
     * The exact path to match on.
     * 
     */
    @Import(name="exact")
    private @Nullable Output<String> exact;

    /**
     * @return The exact path to match on.
     * 
     */
    public Optional<Output<String>> exact() {
        return Optional.ofNullable(this.exact);
    }

    private RouteSpecHttpRouteMatchQueryParameterMatchArgs() {}

    private RouteSpecHttpRouteMatchQueryParameterMatchArgs(RouteSpecHttpRouteMatchQueryParameterMatchArgs $) {
        this.exact = $.exact;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RouteSpecHttpRouteMatchQueryParameterMatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RouteSpecHttpRouteMatchQueryParameterMatchArgs $;

        public Builder() {
            $ = new RouteSpecHttpRouteMatchQueryParameterMatchArgs();
        }

        public Builder(RouteSpecHttpRouteMatchQueryParameterMatchArgs defaults) {
            $ = new RouteSpecHttpRouteMatchQueryParameterMatchArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param exact The exact path to match on.
         * 
         * @return builder
         * 
         */
        public Builder exact(@Nullable Output<String> exact) {
            $.exact = exact;
            return this;
        }

        /**
         * @param exact The exact path to match on.
         * 
         * @return builder
         * 
         */
        public Builder exact(String exact) {
            return exact(Output.of(exact));
        }

        public RouteSpecHttpRouteMatchQueryParameterMatchArgs build() {
            return $;
        }
    }

}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RouteSpecHttpRouteMatchPathArgs extends com.pulumi.resources.ResourceArgs {

    public static final RouteSpecHttpRouteMatchPathArgs Empty = new RouteSpecHttpRouteMatchPathArgs();

    /**
     * Value sent by the client must match the specified value exactly. Must be between 1 and 255 characters in length.
     * 
     */
    @Import(name="exact")
    private @Nullable Output<String> exact;

    /**
     * @return Value sent by the client must match the specified value exactly. Must be between 1 and 255 characters in length.
     * 
     */
    public Optional<Output<String>> exact() {
        return Optional.ofNullable(this.exact);
    }

    /**
     * Value sent by the client must include the specified characters. Must be between 1 and 255 characters in length.
     * 
     */
    @Import(name="regex")
    private @Nullable Output<String> regex;

    /**
     * @return Value sent by the client must include the specified characters. Must be between 1 and 255 characters in length.
     * 
     */
    public Optional<Output<String>> regex() {
        return Optional.ofNullable(this.regex);
    }

    private RouteSpecHttpRouteMatchPathArgs() {}

    private RouteSpecHttpRouteMatchPathArgs(RouteSpecHttpRouteMatchPathArgs $) {
        this.exact = $.exact;
        this.regex = $.regex;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RouteSpecHttpRouteMatchPathArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RouteSpecHttpRouteMatchPathArgs $;

        public Builder() {
            $ = new RouteSpecHttpRouteMatchPathArgs();
        }

        public Builder(RouteSpecHttpRouteMatchPathArgs defaults) {
            $ = new RouteSpecHttpRouteMatchPathArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param exact Value sent by the client must match the specified value exactly. Must be between 1 and 255 characters in length.
         * 
         * @return builder
         * 
         */
        public Builder exact(@Nullable Output<String> exact) {
            $.exact = exact;
            return this;
        }

        /**
         * @param exact Value sent by the client must match the specified value exactly. Must be between 1 and 255 characters in length.
         * 
         * @return builder
         * 
         */
        public Builder exact(String exact) {
            return exact(Output.of(exact));
        }

        /**
         * @param regex Value sent by the client must include the specified characters. Must be between 1 and 255 characters in length.
         * 
         * @return builder
         * 
         */
        public Builder regex(@Nullable Output<String> regex) {
            $.regex = regex;
            return this;
        }

        /**
         * @param regex Value sent by the client must include the specified characters. Must be between 1 and 255 characters in length.
         * 
         * @return builder
         * 
         */
        public Builder regex(String regex) {
            return regex(Output.of(regex));
        }

        public RouteSpecHttpRouteMatchPathArgs build() {
            return $;
        }
    }

}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.inputs;

import com.pulumi.aws.appmesh.inputs.RouteSpecHttp2RouteMatchHeaderMatchRangeArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RouteSpecHttp2RouteMatchHeaderMatchArgs extends com.pulumi.resources.ResourceArgs {

    public static final RouteSpecHttp2RouteMatchHeaderMatchArgs Empty = new RouteSpecHttp2RouteMatchHeaderMatchArgs();

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

    /**
     * Value sent by the client must begin with the specified characters. Must be between 1 and 255 characters in length.
     * This parameter must always start with /, which by itself matches all requests to the virtual router service name.
     * 
     */
    @Import(name="prefix")
    private @Nullable Output<String> prefix;

    /**
     * @return Value sent by the client must begin with the specified characters. Must be between 1 and 255 characters in length.
     * This parameter must always start with /, which by itself matches all requests to the virtual router service name.
     * 
     */
    public Optional<Output<String>> prefix() {
        return Optional.ofNullable(this.prefix);
    }

    /**
     * Object that specifies the range of numbers that the value sent by the client must be included in.
     * 
     */
    @Import(name="range")
    private @Nullable Output<RouteSpecHttp2RouteMatchHeaderMatchRangeArgs> range;

    /**
     * @return Object that specifies the range of numbers that the value sent by the client must be included in.
     * 
     */
    public Optional<Output<RouteSpecHttp2RouteMatchHeaderMatchRangeArgs>> range() {
        return Optional.ofNullable(this.range);
    }

    /**
     * The regex used to match the path.
     * 
     */
    @Import(name="regex")
    private @Nullable Output<String> regex;

    /**
     * @return The regex used to match the path.
     * 
     */
    public Optional<Output<String>> regex() {
        return Optional.ofNullable(this.regex);
    }

    /**
     * Value sent by the client must end with the specified characters. Must be between 1 and 255 characters in length.
     * 
     */
    @Import(name="suffix")
    private @Nullable Output<String> suffix;

    /**
     * @return Value sent by the client must end with the specified characters. Must be between 1 and 255 characters in length.
     * 
     */
    public Optional<Output<String>> suffix() {
        return Optional.ofNullable(this.suffix);
    }

    private RouteSpecHttp2RouteMatchHeaderMatchArgs() {}

    private RouteSpecHttp2RouteMatchHeaderMatchArgs(RouteSpecHttp2RouteMatchHeaderMatchArgs $) {
        this.exact = $.exact;
        this.prefix = $.prefix;
        this.range = $.range;
        this.regex = $.regex;
        this.suffix = $.suffix;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RouteSpecHttp2RouteMatchHeaderMatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RouteSpecHttp2RouteMatchHeaderMatchArgs $;

        public Builder() {
            $ = new RouteSpecHttp2RouteMatchHeaderMatchArgs();
        }

        public Builder(RouteSpecHttp2RouteMatchHeaderMatchArgs defaults) {
            $ = new RouteSpecHttp2RouteMatchHeaderMatchArgs(Objects.requireNonNull(defaults));
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

        /**
         * @param prefix Value sent by the client must begin with the specified characters. Must be between 1 and 255 characters in length.
         * This parameter must always start with /, which by itself matches all requests to the virtual router service name.
         * 
         * @return builder
         * 
         */
        public Builder prefix(@Nullable Output<String> prefix) {
            $.prefix = prefix;
            return this;
        }

        /**
         * @param prefix Value sent by the client must begin with the specified characters. Must be between 1 and 255 characters in length.
         * This parameter must always start with /, which by itself matches all requests to the virtual router service name.
         * 
         * @return builder
         * 
         */
        public Builder prefix(String prefix) {
            return prefix(Output.of(prefix));
        }

        /**
         * @param range Object that specifies the range of numbers that the value sent by the client must be included in.
         * 
         * @return builder
         * 
         */
        public Builder range(@Nullable Output<RouteSpecHttp2RouteMatchHeaderMatchRangeArgs> range) {
            $.range = range;
            return this;
        }

        /**
         * @param range Object that specifies the range of numbers that the value sent by the client must be included in.
         * 
         * @return builder
         * 
         */
        public Builder range(RouteSpecHttp2RouteMatchHeaderMatchRangeArgs range) {
            return range(Output.of(range));
        }

        /**
         * @param regex The regex used to match the path.
         * 
         * @return builder
         * 
         */
        public Builder regex(@Nullable Output<String> regex) {
            $.regex = regex;
            return this;
        }

        /**
         * @param regex The regex used to match the path.
         * 
         * @return builder
         * 
         */
        public Builder regex(String regex) {
            return regex(Output.of(regex));
        }

        /**
         * @param suffix Value sent by the client must end with the specified characters. Must be between 1 and 255 characters in length.
         * 
         * @return builder
         * 
         */
        public Builder suffix(@Nullable Output<String> suffix) {
            $.suffix = suffix;
            return this;
        }

        /**
         * @param suffix Value sent by the client must end with the specified characters. Must be between 1 and 255 characters in length.
         * 
         * @return builder
         * 
         */
        public Builder suffix(String suffix) {
            return suffix(Output.of(suffix));
        }

        public RouteSpecHttp2RouteMatchHeaderMatchArgs build() {
            return $;
        }
    }

}

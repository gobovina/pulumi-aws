// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.outputs;

import com.pulumi.aws.appmesh.outputs.RouteSpecGrpcRouteMatchMetadataMatchRange;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RouteSpecGrpcRouteMatchMetadataMatch {
    /**
     * @return The exact path to match on.
     * 
     */
    private @Nullable String exact;
    /**
     * @return Value sent by the client must begin with the specified characters. Must be between 1 and 255 characters in length.
     * This parameter must always start with /, which by itself matches all requests to the virtual router service name.
     * 
     */
    private @Nullable String prefix;
    /**
     * @return Object that specifies the range of numbers that the value sent by the client must be included in.
     * 
     */
    private @Nullable RouteSpecGrpcRouteMatchMetadataMatchRange range;
    /**
     * @return The regex used to match the path.
     * 
     */
    private @Nullable String regex;
    /**
     * @return Value sent by the client must end with the specified characters. Must be between 1 and 255 characters in length.
     * 
     */
    private @Nullable String suffix;

    private RouteSpecGrpcRouteMatchMetadataMatch() {}
    /**
     * @return The exact path to match on.
     * 
     */
    public Optional<String> exact() {
        return Optional.ofNullable(this.exact);
    }
    /**
     * @return Value sent by the client must begin with the specified characters. Must be between 1 and 255 characters in length.
     * This parameter must always start with /, which by itself matches all requests to the virtual router service name.
     * 
     */
    public Optional<String> prefix() {
        return Optional.ofNullable(this.prefix);
    }
    /**
     * @return Object that specifies the range of numbers that the value sent by the client must be included in.
     * 
     */
    public Optional<RouteSpecGrpcRouteMatchMetadataMatchRange> range() {
        return Optional.ofNullable(this.range);
    }
    /**
     * @return The regex used to match the path.
     * 
     */
    public Optional<String> regex() {
        return Optional.ofNullable(this.regex);
    }
    /**
     * @return Value sent by the client must end with the specified characters. Must be between 1 and 255 characters in length.
     * 
     */
    public Optional<String> suffix() {
        return Optional.ofNullable(this.suffix);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouteSpecGrpcRouteMatchMetadataMatch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String exact;
        private @Nullable String prefix;
        private @Nullable RouteSpecGrpcRouteMatchMetadataMatchRange range;
        private @Nullable String regex;
        private @Nullable String suffix;
        public Builder() {}
        public Builder(RouteSpecGrpcRouteMatchMetadataMatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.exact = defaults.exact;
    	      this.prefix = defaults.prefix;
    	      this.range = defaults.range;
    	      this.regex = defaults.regex;
    	      this.suffix = defaults.suffix;
        }

        @CustomType.Setter
        public Builder exact(@Nullable String exact) {
            this.exact = exact;
            return this;
        }
        @CustomType.Setter
        public Builder prefix(@Nullable String prefix) {
            this.prefix = prefix;
            return this;
        }
        @CustomType.Setter
        public Builder range(@Nullable RouteSpecGrpcRouteMatchMetadataMatchRange range) {
            this.range = range;
            return this;
        }
        @CustomType.Setter
        public Builder regex(@Nullable String regex) {
            this.regex = regex;
            return this;
        }
        @CustomType.Setter
        public Builder suffix(@Nullable String suffix) {
            this.suffix = suffix;
            return this;
        }
        public RouteSpecGrpcRouteMatchMetadataMatch build() {
            final var o = new RouteSpecGrpcRouteMatchMetadataMatch();
            o.exact = exact;
            o.prefix = prefix;
            o.range = range;
            o.regex = regex;
            o.suffix = suffix;
            return o;
        }
    }
}

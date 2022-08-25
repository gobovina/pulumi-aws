// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appstream.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ImageBuilderAccessEndpoint {
    /**
     * @return Type of interface endpoint.
     * 
     */
    private String endpointType;
    /**
     * @return Identifier (ID) of the VPC in which the interface endpoint is used.
     * 
     */
    private @Nullable String vpceId;

    private ImageBuilderAccessEndpoint() {}
    /**
     * @return Type of interface endpoint.
     * 
     */
    public String endpointType() {
        return this.endpointType;
    }
    /**
     * @return Identifier (ID) of the VPC in which the interface endpoint is used.
     * 
     */
    public Optional<String> vpceId() {
        return Optional.ofNullable(this.vpceId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImageBuilderAccessEndpoint defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String endpointType;
        private @Nullable String vpceId;
        public Builder() {}
        public Builder(ImageBuilderAccessEndpoint defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpointType = defaults.endpointType;
    	      this.vpceId = defaults.vpceId;
        }

        @CustomType.Setter
        public Builder endpointType(String endpointType) {
            this.endpointType = Objects.requireNonNull(endpointType);
            return this;
        }
        @CustomType.Setter
        public Builder vpceId(@Nullable String vpceId) {
            this.vpceId = vpceId;
            return this;
        }
        public ImageBuilderAccessEndpoint build() {
            final var o = new ImageBuilderAccessEndpoint();
            o.endpointType = endpointType;
            o.vpceId = vpceId;
            return o;
        }
    }
}

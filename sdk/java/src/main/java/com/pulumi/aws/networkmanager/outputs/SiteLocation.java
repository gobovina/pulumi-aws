// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.networkmanager.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SiteLocation {
    /**
     * @return Address of the location.
     * 
     */
    private @Nullable String address;
    /**
     * @return Latitude of the location.
     * 
     */
    private @Nullable String latitude;
    /**
     * @return Longitude of the location.
     * 
     */
    private @Nullable String longitude;

    private SiteLocation() {}
    /**
     * @return Address of the location.
     * 
     */
    public Optional<String> address() {
        return Optional.ofNullable(this.address);
    }
    /**
     * @return Latitude of the location.
     * 
     */
    public Optional<String> latitude() {
        return Optional.ofNullable(this.latitude);
    }
    /**
     * @return Longitude of the location.
     * 
     */
    public Optional<String> longitude() {
        return Optional.ofNullable(this.longitude);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SiteLocation defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String address;
        private @Nullable String latitude;
        private @Nullable String longitude;
        public Builder() {}
        public Builder(SiteLocation defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address = defaults.address;
    	      this.latitude = defaults.latitude;
    	      this.longitude = defaults.longitude;
        }

        @CustomType.Setter
        public Builder address(@Nullable String address) {
            this.address = address;
            return this;
        }
        @CustomType.Setter
        public Builder latitude(@Nullable String latitude) {
            this.latitude = latitude;
            return this;
        }
        @CustomType.Setter
        public Builder longitude(@Nullable String longitude) {
            this.longitude = longitude;
            return this;
        }
        public SiteLocation build() {
            final var o = new SiteLocation();
            o.address = address;
            o.latitude = latitude;
            o.longitude = longitude;
            return o;
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appstream.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class ImageBuilderVpcConfig {
    /**
     * @return Identifiers of the security groups for the image builder or image builder.
     * 
     */
    private @Nullable List<String> securityGroupIds;
    /**
     * @return Identifiers of the subnets to which a network interface is attached from the image builder instance or image builder instance.
     * 
     */
    private @Nullable List<String> subnetIds;

    private ImageBuilderVpcConfig() {}
    /**
     * @return Identifiers of the security groups for the image builder or image builder.
     * 
     */
    public List<String> securityGroupIds() {
        return this.securityGroupIds == null ? List.of() : this.securityGroupIds;
    }
    /**
     * @return Identifiers of the subnets to which a network interface is attached from the image builder instance or image builder instance.
     * 
     */
    public List<String> subnetIds() {
        return this.subnetIds == null ? List.of() : this.subnetIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImageBuilderVpcConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> securityGroupIds;
        private @Nullable List<String> subnetIds;
        public Builder() {}
        public Builder(ImageBuilderVpcConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.securityGroupIds = defaults.securityGroupIds;
    	      this.subnetIds = defaults.subnetIds;
        }

        @CustomType.Setter
        public Builder securityGroupIds(@Nullable List<String> securityGroupIds) {
            this.securityGroupIds = securityGroupIds;
            return this;
        }
        public Builder securityGroupIds(String... securityGroupIds) {
            return securityGroupIds(List.of(securityGroupIds));
        }
        @CustomType.Setter
        public Builder subnetIds(@Nullable List<String> subnetIds) {
            this.subnetIds = subnetIds;
            return this;
        }
        public Builder subnetIds(String... subnetIds) {
            return subnetIds(List.of(subnetIds));
        }
        public ImageBuilderVpcConfig build() {
            final var o = new ImageBuilderVpcConfig();
            o.securityGroupIds = securityGroupIds;
            o.subnetIds = subnetIds;
            return o;
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LaunchTemplateInstanceRequirementsVcpuCount {
    /**
     * @return Maximum.
     * 
     */
    private @Nullable Integer max;
    /**
     * @return Minimum.
     * 
     */
    private Integer min;

    private LaunchTemplateInstanceRequirementsVcpuCount() {}
    /**
     * @return Maximum.
     * 
     */
    public Optional<Integer> max() {
        return Optional.ofNullable(this.max);
    }
    /**
     * @return Minimum.
     * 
     */
    public Integer min() {
        return this.min;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LaunchTemplateInstanceRequirementsVcpuCount defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer max;
        private Integer min;
        public Builder() {}
        public Builder(LaunchTemplateInstanceRequirementsVcpuCount defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.max = defaults.max;
    	      this.min = defaults.min;
        }

        @CustomType.Setter
        public Builder max(@Nullable Integer max) {
            this.max = max;
            return this;
        }
        @CustomType.Setter
        public Builder min(Integer min) {
            this.min = Objects.requireNonNull(min);
            return this;
        }
        public LaunchTemplateInstanceRequirementsVcpuCount build() {
            final var o = new LaunchTemplateInstanceRequirementsVcpuCount();
            o.max = max;
            o.min = min;
            return o;
        }
    }
}

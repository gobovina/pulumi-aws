// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FleetLaunchTemplateConfigOverrideInstanceRequirementsTotalLocalStorageGb {
    /**
     * @return Maximum.
     * 
     */
    private @Nullable Double max;
    /**
     * @return Minimum.
     * 
     */
    private @Nullable Double min;

    private FleetLaunchTemplateConfigOverrideInstanceRequirementsTotalLocalStorageGb() {}
    /**
     * @return Maximum.
     * 
     */
    public Optional<Double> max() {
        return Optional.ofNullable(this.max);
    }
    /**
     * @return Minimum.
     * 
     */
    public Optional<Double> min() {
        return Optional.ofNullable(this.min);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FleetLaunchTemplateConfigOverrideInstanceRequirementsTotalLocalStorageGb defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Double max;
        private @Nullable Double min;
        public Builder() {}
        public Builder(FleetLaunchTemplateConfigOverrideInstanceRequirementsTotalLocalStorageGb defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.max = defaults.max;
    	      this.min = defaults.min;
        }

        @CustomType.Setter
        public Builder max(@Nullable Double max) {
            this.max = max;
            return this;
        }
        @CustomType.Setter
        public Builder min(@Nullable Double min) {
            this.min = min;
            return this;
        }
        public FleetLaunchTemplateConfigOverrideInstanceRequirementsTotalLocalStorageGb build() {
            final var o = new FleetLaunchTemplateConfigOverrideInstanceRequirementsTotalLocalStorageGb();
            o.max = max;
            o.min = min;
            return o;
        }
    }
}

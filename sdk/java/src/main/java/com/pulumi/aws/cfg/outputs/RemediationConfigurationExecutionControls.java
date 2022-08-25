// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cfg.outputs;

import com.pulumi.aws.cfg.outputs.RemediationConfigurationExecutionControlsSsmControls;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RemediationConfigurationExecutionControls {
    /**
     * @return Configuration block for SSM controls. See below.
     * 
     */
    private @Nullable RemediationConfigurationExecutionControlsSsmControls ssmControls;

    private RemediationConfigurationExecutionControls() {}
    /**
     * @return Configuration block for SSM controls. See below.
     * 
     */
    public Optional<RemediationConfigurationExecutionControlsSsmControls> ssmControls() {
        return Optional.ofNullable(this.ssmControls);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RemediationConfigurationExecutionControls defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable RemediationConfigurationExecutionControlsSsmControls ssmControls;
        public Builder() {}
        public Builder(RemediationConfigurationExecutionControls defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ssmControls = defaults.ssmControls;
        }

        @CustomType.Setter
        public Builder ssmControls(@Nullable RemediationConfigurationExecutionControlsSsmControls ssmControls) {
            this.ssmControls = ssmControls;
            return this;
        }
        public RemediationConfigurationExecutionControls build() {
            final var o = new RemediationConfigurationExecutionControls();
            o.ssmControls = ssmControls;
            return o;
        }
    }
}

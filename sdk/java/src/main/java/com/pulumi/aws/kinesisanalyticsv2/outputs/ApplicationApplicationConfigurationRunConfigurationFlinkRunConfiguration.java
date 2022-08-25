// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kinesisanalyticsv2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ApplicationApplicationConfigurationRunConfigurationFlinkRunConfiguration {
    /**
     * @return When restoring from a snapshot, specifies whether the runtime is allowed to skip a state that cannot be mapped to the new program. Default is `false`.
     * 
     */
    private @Nullable Boolean allowNonRestoredState;

    private ApplicationApplicationConfigurationRunConfigurationFlinkRunConfiguration() {}
    /**
     * @return When restoring from a snapshot, specifies whether the runtime is allowed to skip a state that cannot be mapped to the new program. Default is `false`.
     * 
     */
    public Optional<Boolean> allowNonRestoredState() {
        return Optional.ofNullable(this.allowNonRestoredState);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationApplicationConfigurationRunConfigurationFlinkRunConfiguration defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean allowNonRestoredState;
        public Builder() {}
        public Builder(ApplicationApplicationConfigurationRunConfigurationFlinkRunConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowNonRestoredState = defaults.allowNonRestoredState;
        }

        @CustomType.Setter
        public Builder allowNonRestoredState(@Nullable Boolean allowNonRestoredState) {
            this.allowNonRestoredState = allowNonRestoredState;
            return this;
        }
        public ApplicationApplicationConfigurationRunConfigurationFlinkRunConfiguration build() {
            final var o = new ApplicationApplicationConfigurationRunConfigurationFlinkRunConfiguration();
            o.allowNonRestoredState = allowNonRestoredState;
            return o;
        }
    }
}

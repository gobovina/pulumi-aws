// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.medialive.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ChannelInputAttachmentAutomaticInputFailoverSettingsFailoverConditionFailoverConditionSettingsInputLossSettings {
    /**
     * @return The amount of time (in milliseconds) that no input is detected. After that time, an input failover will occur.
     * 
     */
    private @Nullable Integer inputLossThresholdMsec;

    private ChannelInputAttachmentAutomaticInputFailoverSettingsFailoverConditionFailoverConditionSettingsInputLossSettings() {}
    /**
     * @return The amount of time (in milliseconds) that no input is detected. After that time, an input failover will occur.
     * 
     */
    public Optional<Integer> inputLossThresholdMsec() {
        return Optional.ofNullable(this.inputLossThresholdMsec);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ChannelInputAttachmentAutomaticInputFailoverSettingsFailoverConditionFailoverConditionSettingsInputLossSettings defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer inputLossThresholdMsec;
        public Builder() {}
        public Builder(ChannelInputAttachmentAutomaticInputFailoverSettingsFailoverConditionFailoverConditionSettingsInputLossSettings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.inputLossThresholdMsec = defaults.inputLossThresholdMsec;
        }

        @CustomType.Setter
        public Builder inputLossThresholdMsec(@Nullable Integer inputLossThresholdMsec) {

            this.inputLossThresholdMsec = inputLossThresholdMsec;
            return this;
        }
        public ChannelInputAttachmentAutomaticInputFailoverSettingsFailoverConditionFailoverConditionSettingsInputLossSettings build() {
            final var _resultValue = new ChannelInputAttachmentAutomaticInputFailoverSettingsFailoverConditionFailoverConditionSettingsInputLossSettings();
            _resultValue.inputLossThresholdMsec = inputLossThresholdMsec;
            return _resultValue;
        }
    }
}

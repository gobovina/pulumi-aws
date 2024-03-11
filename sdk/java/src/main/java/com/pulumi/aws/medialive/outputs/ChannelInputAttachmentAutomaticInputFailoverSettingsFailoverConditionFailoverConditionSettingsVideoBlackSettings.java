// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.medialive.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ChannelInputAttachmentAutomaticInputFailoverSettingsFailoverConditionFailoverConditionSettingsVideoBlackSettings {
    /**
     * @return A value used in calculating the threshold below which MediaLive considers a pixel to be &#39;black&#39;. For the input to be considered black, every pixel in a frame must be below this threshold. The threshold is calculated as a percentage (expressed as a decimal) of white. Therefore .1 means 10%!w(MISSING)hite (or 90%!b(MISSING)lack). Note how the formula works for any color depth. For example, if you set this field to 0.1 in 10-bit color depth: (10230.1=102.3), which means a pixel value of 102 or less is &#39;black&#39;. If you set this field to .1 in an 8-bit color depth: (2550.1=25.5), which means a pixel value of 25 or less is &#39;black&#39;. The range is 0.0 to 1.0, with any number of decimal places.
     * 
     */
    private @Nullable Double blackDetectThreshold;
    /**
     * @return The amount of time (in milliseconds) that the active input must be black before automatic input failover occurs.
     * 
     */
    private @Nullable Integer videoBlackThresholdMsec;

    private ChannelInputAttachmentAutomaticInputFailoverSettingsFailoverConditionFailoverConditionSettingsVideoBlackSettings() {}
    /**
     * @return A value used in calculating the threshold below which MediaLive considers a pixel to be &#39;black&#39;. For the input to be considered black, every pixel in a frame must be below this threshold. The threshold is calculated as a percentage (expressed as a decimal) of white. Therefore .1 means 10%!w(MISSING)hite (or 90%!b(MISSING)lack). Note how the formula works for any color depth. For example, if you set this field to 0.1 in 10-bit color depth: (10230.1=102.3), which means a pixel value of 102 or less is &#39;black&#39;. If you set this field to .1 in an 8-bit color depth: (2550.1=25.5), which means a pixel value of 25 or less is &#39;black&#39;. The range is 0.0 to 1.0, with any number of decimal places.
     * 
     */
    public Optional<Double> blackDetectThreshold() {
        return Optional.ofNullable(this.blackDetectThreshold);
    }
    /**
     * @return The amount of time (in milliseconds) that the active input must be black before automatic input failover occurs.
     * 
     */
    public Optional<Integer> videoBlackThresholdMsec() {
        return Optional.ofNullable(this.videoBlackThresholdMsec);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ChannelInputAttachmentAutomaticInputFailoverSettingsFailoverConditionFailoverConditionSettingsVideoBlackSettings defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Double blackDetectThreshold;
        private @Nullable Integer videoBlackThresholdMsec;
        public Builder() {}
        public Builder(ChannelInputAttachmentAutomaticInputFailoverSettingsFailoverConditionFailoverConditionSettingsVideoBlackSettings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.blackDetectThreshold = defaults.blackDetectThreshold;
    	      this.videoBlackThresholdMsec = defaults.videoBlackThresholdMsec;
        }

        @CustomType.Setter
        public Builder blackDetectThreshold(@Nullable Double blackDetectThreshold) {

            this.blackDetectThreshold = blackDetectThreshold;
            return this;
        }
        @CustomType.Setter
        public Builder videoBlackThresholdMsec(@Nullable Integer videoBlackThresholdMsec) {

            this.videoBlackThresholdMsec = videoBlackThresholdMsec;
            return this;
        }
        public ChannelInputAttachmentAutomaticInputFailoverSettingsFailoverConditionFailoverConditionSettingsVideoBlackSettings build() {
            final var _resultValue = new ChannelInputAttachmentAutomaticInputFailoverSettingsFailoverConditionFailoverConditionSettingsVideoBlackSettings();
            _resultValue.blackDetectThreshold = blackDetectThreshold;
            _resultValue.videoBlackThresholdMsec = videoBlackThresholdMsec;
            return _resultValue;
        }
    }
}

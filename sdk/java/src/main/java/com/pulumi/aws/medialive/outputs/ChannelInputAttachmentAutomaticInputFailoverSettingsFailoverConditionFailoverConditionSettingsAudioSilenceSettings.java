// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.medialive.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ChannelInputAttachmentAutomaticInputFailoverSettingsFailoverConditionFailoverConditionSettingsAudioSilenceSettings {
    /**
     * @return The name of the audio selector in the input that MediaLive should monitor to detect silence. Select your most important rendition. If you didn&#39;t create an audio selector in this input, leave blank.
     * 
     */
    private String audioSelectorName;
    /**
     * @return The amount of time (in milliseconds) that the active input must be silent before automatic input failover occurs. Silence is defined as audio loss or audio quieter than -50 dBFS.
     * 
     */
    private @Nullable Integer audioSilenceThresholdMsec;

    private ChannelInputAttachmentAutomaticInputFailoverSettingsFailoverConditionFailoverConditionSettingsAudioSilenceSettings() {}
    /**
     * @return The name of the audio selector in the input that MediaLive should monitor to detect silence. Select your most important rendition. If you didn&#39;t create an audio selector in this input, leave blank.
     * 
     */
    public String audioSelectorName() {
        return this.audioSelectorName;
    }
    /**
     * @return The amount of time (in milliseconds) that the active input must be silent before automatic input failover occurs. Silence is defined as audio loss or audio quieter than -50 dBFS.
     * 
     */
    public Optional<Integer> audioSilenceThresholdMsec() {
        return Optional.ofNullable(this.audioSilenceThresholdMsec);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ChannelInputAttachmentAutomaticInputFailoverSettingsFailoverConditionFailoverConditionSettingsAudioSilenceSettings defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String audioSelectorName;
        private @Nullable Integer audioSilenceThresholdMsec;
        public Builder() {}
        public Builder(ChannelInputAttachmentAutomaticInputFailoverSettingsFailoverConditionFailoverConditionSettingsAudioSilenceSettings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.audioSelectorName = defaults.audioSelectorName;
    	      this.audioSilenceThresholdMsec = defaults.audioSilenceThresholdMsec;
        }

        @CustomType.Setter
        public Builder audioSelectorName(String audioSelectorName) {
            this.audioSelectorName = Objects.requireNonNull(audioSelectorName);
            return this;
        }
        @CustomType.Setter
        public Builder audioSilenceThresholdMsec(@Nullable Integer audioSilenceThresholdMsec) {
            this.audioSilenceThresholdMsec = audioSilenceThresholdMsec;
            return this;
        }
        public ChannelInputAttachmentAutomaticInputFailoverSettingsFailoverConditionFailoverConditionSettingsAudioSilenceSettings build() {
            final var o = new ChannelInputAttachmentAutomaticInputFailoverSettingsFailoverConditionFailoverConditionSettingsAudioSilenceSettings();
            o.audioSelectorName = audioSelectorName;
            o.audioSilenceThresholdMsec = audioSilenceThresholdMsec;
            return o;
        }
    }
}

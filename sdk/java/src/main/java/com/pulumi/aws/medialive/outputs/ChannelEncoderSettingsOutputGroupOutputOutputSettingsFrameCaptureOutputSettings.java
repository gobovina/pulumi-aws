// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.medialive.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ChannelEncoderSettingsOutputGroupOutputOutputSettingsFrameCaptureOutputSettings {
    /**
     * @return String concatenated to the end of the destination filename. Required for multiple outputs of the same type.
     * 
     */
    private @Nullable String nameModifier;

    private ChannelEncoderSettingsOutputGroupOutputOutputSettingsFrameCaptureOutputSettings() {}
    /**
     * @return String concatenated to the end of the destination filename. Required for multiple outputs of the same type.
     * 
     */
    public Optional<String> nameModifier() {
        return Optional.ofNullable(this.nameModifier);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ChannelEncoderSettingsOutputGroupOutputOutputSettingsFrameCaptureOutputSettings defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String nameModifier;
        public Builder() {}
        public Builder(ChannelEncoderSettingsOutputGroupOutputOutputSettingsFrameCaptureOutputSettings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nameModifier = defaults.nameModifier;
        }

        @CustomType.Setter
        public Builder nameModifier(@Nullable String nameModifier) {

            this.nameModifier = nameModifier;
            return this;
        }
        public ChannelEncoderSettingsOutputGroupOutputOutputSettingsFrameCaptureOutputSettings build() {
            final var _resultValue = new ChannelEncoderSettingsOutputGroupOutputOutputSettingsFrameCaptureOutputSettings();
            _resultValue.nameModifier = nameModifier;
            return _resultValue;
        }
    }
}

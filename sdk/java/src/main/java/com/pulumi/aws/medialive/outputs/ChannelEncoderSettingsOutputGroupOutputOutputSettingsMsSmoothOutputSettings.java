// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.medialive.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ChannelEncoderSettingsOutputGroupOutputOutputSettingsMsSmoothOutputSettings {
    private @Nullable String h265PackagingType;
    /**
     * @return String concatenated to the end of the destination filename. Required for multiple outputs of the same type.
     * 
     */
    private @Nullable String nameModifier;

    private ChannelEncoderSettingsOutputGroupOutputOutputSettingsMsSmoothOutputSettings() {}
    public Optional<String> h265PackagingType() {
        return Optional.ofNullable(this.h265PackagingType);
    }
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

    public static Builder builder(ChannelEncoderSettingsOutputGroupOutputOutputSettingsMsSmoothOutputSettings defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String h265PackagingType;
        private @Nullable String nameModifier;
        public Builder() {}
        public Builder(ChannelEncoderSettingsOutputGroupOutputOutputSettingsMsSmoothOutputSettings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.h265PackagingType = defaults.h265PackagingType;
    	      this.nameModifier = defaults.nameModifier;
        }

        @CustomType.Setter
        public Builder h265PackagingType(@Nullable String h265PackagingType) {

            this.h265PackagingType = h265PackagingType;
            return this;
        }
        @CustomType.Setter
        public Builder nameModifier(@Nullable String nameModifier) {

            this.nameModifier = nameModifier;
            return this;
        }
        public ChannelEncoderSettingsOutputGroupOutputOutputSettingsMsSmoothOutputSettings build() {
            final var _resultValue = new ChannelEncoderSettingsOutputGroupOutputOutputSettingsMsSmoothOutputSettings();
            _resultValue.h265PackagingType = h265PackagingType;
            _resultValue.nameModifier = nameModifier;
            return _resultValue;
        }
    }
}

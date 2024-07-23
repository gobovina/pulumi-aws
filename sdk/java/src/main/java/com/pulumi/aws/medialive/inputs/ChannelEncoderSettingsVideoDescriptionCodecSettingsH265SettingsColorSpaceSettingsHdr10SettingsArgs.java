// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.medialive.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ChannelEncoderSettingsVideoDescriptionCodecSettingsH265SettingsColorSpaceSettingsHdr10SettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final ChannelEncoderSettingsVideoDescriptionCodecSettingsH265SettingsColorSpaceSettingsHdr10SettingsArgs Empty = new ChannelEncoderSettingsVideoDescriptionCodecSettingsH265SettingsColorSpaceSettingsHdr10SettingsArgs();

    /**
     * Sets the MaxCLL value for HDR10.
     * 
     */
    @Import(name="maxCll")
    private @Nullable Output<Integer> maxCll;

    /**
     * @return Sets the MaxCLL value for HDR10.
     * 
     */
    public Optional<Output<Integer>> maxCll() {
        return Optional.ofNullable(this.maxCll);
    }

    /**
     * Sets the MaxFALL value for HDR10.
     * 
     */
    @Import(name="maxFall")
    private @Nullable Output<Integer> maxFall;

    /**
     * @return Sets the MaxFALL value for HDR10.
     * 
     */
    public Optional<Output<Integer>> maxFall() {
        return Optional.ofNullable(this.maxFall);
    }

    private ChannelEncoderSettingsVideoDescriptionCodecSettingsH265SettingsColorSpaceSettingsHdr10SettingsArgs() {}

    private ChannelEncoderSettingsVideoDescriptionCodecSettingsH265SettingsColorSpaceSettingsHdr10SettingsArgs(ChannelEncoderSettingsVideoDescriptionCodecSettingsH265SettingsColorSpaceSettingsHdr10SettingsArgs $) {
        this.maxCll = $.maxCll;
        this.maxFall = $.maxFall;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ChannelEncoderSettingsVideoDescriptionCodecSettingsH265SettingsColorSpaceSettingsHdr10SettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ChannelEncoderSettingsVideoDescriptionCodecSettingsH265SettingsColorSpaceSettingsHdr10SettingsArgs $;

        public Builder() {
            $ = new ChannelEncoderSettingsVideoDescriptionCodecSettingsH265SettingsColorSpaceSettingsHdr10SettingsArgs();
        }

        public Builder(ChannelEncoderSettingsVideoDescriptionCodecSettingsH265SettingsColorSpaceSettingsHdr10SettingsArgs defaults) {
            $ = new ChannelEncoderSettingsVideoDescriptionCodecSettingsH265SettingsColorSpaceSettingsHdr10SettingsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param maxCll Sets the MaxCLL value for HDR10.
         * 
         * @return builder
         * 
         */
        public Builder maxCll(@Nullable Output<Integer> maxCll) {
            $.maxCll = maxCll;
            return this;
        }

        /**
         * @param maxCll Sets the MaxCLL value for HDR10.
         * 
         * @return builder
         * 
         */
        public Builder maxCll(Integer maxCll) {
            return maxCll(Output.of(maxCll));
        }

        /**
         * @param maxFall Sets the MaxFALL value for HDR10.
         * 
         * @return builder
         * 
         */
        public Builder maxFall(@Nullable Output<Integer> maxFall) {
            $.maxFall = maxFall;
            return this;
        }

        /**
         * @param maxFall Sets the MaxFALL value for HDR10.
         * 
         * @return builder
         * 
         */
        public Builder maxFall(Integer maxFall) {
            return maxFall(Output.of(maxFall));
        }

        public ChannelEncoderSettingsVideoDescriptionCodecSettingsH265SettingsColorSpaceSettingsHdr10SettingsArgs build() {
            return $;
        }
    }

}

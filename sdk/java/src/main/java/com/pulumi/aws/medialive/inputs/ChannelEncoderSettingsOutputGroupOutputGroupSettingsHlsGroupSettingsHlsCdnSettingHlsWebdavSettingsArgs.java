// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.medialive.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ChannelEncoderSettingsOutputGroupOutputGroupSettingsHlsGroupSettingsHlsCdnSettingHlsWebdavSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final ChannelEncoderSettingsOutputGroupOutputGroupSettingsHlsGroupSettingsHlsCdnSettingHlsWebdavSettingsArgs Empty = new ChannelEncoderSettingsOutputGroupOutputGroupSettingsHlsGroupSettingsHlsCdnSettingHlsWebdavSettingsArgs();

    /**
     * Number of seconds to wait before retrying connection to the flash media server if the connection is lost.
     * 
     */
    @Import(name="connectionRetryInterval")
    private @Nullable Output<Integer> connectionRetryInterval;

    /**
     * @return Number of seconds to wait before retrying connection to the flash media server if the connection is lost.
     * 
     */
    public Optional<Output<Integer>> connectionRetryInterval() {
        return Optional.ofNullable(this.connectionRetryInterval);
    }

    @Import(name="filecacheDuration")
    private @Nullable Output<Integer> filecacheDuration;

    public Optional<Output<Integer>> filecacheDuration() {
        return Optional.ofNullable(this.filecacheDuration);
    }

    @Import(name="httpTransferMode")
    private @Nullable Output<String> httpTransferMode;

    public Optional<Output<String>> httpTransferMode() {
        return Optional.ofNullable(this.httpTransferMode);
    }

    /**
     * Number of retry attempts.
     * 
     */
    @Import(name="numRetries")
    private @Nullable Output<Integer> numRetries;

    /**
     * @return Number of retry attempts.
     * 
     */
    public Optional<Output<Integer>> numRetries() {
        return Optional.ofNullable(this.numRetries);
    }

    /**
     * Number of seconds to wait until a restart is initiated.
     * 
     */
    @Import(name="restartDelay")
    private @Nullable Output<Integer> restartDelay;

    /**
     * @return Number of seconds to wait until a restart is initiated.
     * 
     */
    public Optional<Output<Integer>> restartDelay() {
        return Optional.ofNullable(this.restartDelay);
    }

    private ChannelEncoderSettingsOutputGroupOutputGroupSettingsHlsGroupSettingsHlsCdnSettingHlsWebdavSettingsArgs() {}

    private ChannelEncoderSettingsOutputGroupOutputGroupSettingsHlsGroupSettingsHlsCdnSettingHlsWebdavSettingsArgs(ChannelEncoderSettingsOutputGroupOutputGroupSettingsHlsGroupSettingsHlsCdnSettingHlsWebdavSettingsArgs $) {
        this.connectionRetryInterval = $.connectionRetryInterval;
        this.filecacheDuration = $.filecacheDuration;
        this.httpTransferMode = $.httpTransferMode;
        this.numRetries = $.numRetries;
        this.restartDelay = $.restartDelay;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ChannelEncoderSettingsOutputGroupOutputGroupSettingsHlsGroupSettingsHlsCdnSettingHlsWebdavSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ChannelEncoderSettingsOutputGroupOutputGroupSettingsHlsGroupSettingsHlsCdnSettingHlsWebdavSettingsArgs $;

        public Builder() {
            $ = new ChannelEncoderSettingsOutputGroupOutputGroupSettingsHlsGroupSettingsHlsCdnSettingHlsWebdavSettingsArgs();
        }

        public Builder(ChannelEncoderSettingsOutputGroupOutputGroupSettingsHlsGroupSettingsHlsCdnSettingHlsWebdavSettingsArgs defaults) {
            $ = new ChannelEncoderSettingsOutputGroupOutputGroupSettingsHlsGroupSettingsHlsCdnSettingHlsWebdavSettingsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param connectionRetryInterval Number of seconds to wait before retrying connection to the flash media server if the connection is lost.
         * 
         * @return builder
         * 
         */
        public Builder connectionRetryInterval(@Nullable Output<Integer> connectionRetryInterval) {
            $.connectionRetryInterval = connectionRetryInterval;
            return this;
        }

        /**
         * @param connectionRetryInterval Number of seconds to wait before retrying connection to the flash media server if the connection is lost.
         * 
         * @return builder
         * 
         */
        public Builder connectionRetryInterval(Integer connectionRetryInterval) {
            return connectionRetryInterval(Output.of(connectionRetryInterval));
        }

        public Builder filecacheDuration(@Nullable Output<Integer> filecacheDuration) {
            $.filecacheDuration = filecacheDuration;
            return this;
        }

        public Builder filecacheDuration(Integer filecacheDuration) {
            return filecacheDuration(Output.of(filecacheDuration));
        }

        public Builder httpTransferMode(@Nullable Output<String> httpTransferMode) {
            $.httpTransferMode = httpTransferMode;
            return this;
        }

        public Builder httpTransferMode(String httpTransferMode) {
            return httpTransferMode(Output.of(httpTransferMode));
        }

        /**
         * @param numRetries Number of retry attempts.
         * 
         * @return builder
         * 
         */
        public Builder numRetries(@Nullable Output<Integer> numRetries) {
            $.numRetries = numRetries;
            return this;
        }

        /**
         * @param numRetries Number of retry attempts.
         * 
         * @return builder
         * 
         */
        public Builder numRetries(Integer numRetries) {
            return numRetries(Output.of(numRetries));
        }

        /**
         * @param restartDelay Number of seconds to wait until a restart is initiated.
         * 
         * @return builder
         * 
         */
        public Builder restartDelay(@Nullable Output<Integer> restartDelay) {
            $.restartDelay = restartDelay;
            return this;
        }

        /**
         * @param restartDelay Number of seconds to wait until a restart is initiated.
         * 
         * @return builder
         * 
         */
        public Builder restartDelay(Integer restartDelay) {
            return restartDelay(Output.of(restartDelay));
        }

        public ChannelEncoderSettingsOutputGroupOutputGroupSettingsHlsGroupSettingsHlsCdnSettingHlsWebdavSettingsArgs build() {
            return $;
        }
    }

}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.medialive.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ChannelInputAttachmentAutomaticInputFailoverSettingsFailoverConditionFailoverConditionSettingsInputLossSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final ChannelInputAttachmentAutomaticInputFailoverSettingsFailoverConditionFailoverConditionSettingsInputLossSettingsArgs Empty = new ChannelInputAttachmentAutomaticInputFailoverSettingsFailoverConditionFailoverConditionSettingsInputLossSettingsArgs();

    /**
     * The amount of time (in milliseconds) that no input is detected. After that time, an input failover will occur.
     * 
     */
    @Import(name="inputLossThresholdMsec")
    private @Nullable Output<Integer> inputLossThresholdMsec;

    /**
     * @return The amount of time (in milliseconds) that no input is detected. After that time, an input failover will occur.
     * 
     */
    public Optional<Output<Integer>> inputLossThresholdMsec() {
        return Optional.ofNullable(this.inputLossThresholdMsec);
    }

    private ChannelInputAttachmentAutomaticInputFailoverSettingsFailoverConditionFailoverConditionSettingsInputLossSettingsArgs() {}

    private ChannelInputAttachmentAutomaticInputFailoverSettingsFailoverConditionFailoverConditionSettingsInputLossSettingsArgs(ChannelInputAttachmentAutomaticInputFailoverSettingsFailoverConditionFailoverConditionSettingsInputLossSettingsArgs $) {
        this.inputLossThresholdMsec = $.inputLossThresholdMsec;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ChannelInputAttachmentAutomaticInputFailoverSettingsFailoverConditionFailoverConditionSettingsInputLossSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ChannelInputAttachmentAutomaticInputFailoverSettingsFailoverConditionFailoverConditionSettingsInputLossSettingsArgs $;

        public Builder() {
            $ = new ChannelInputAttachmentAutomaticInputFailoverSettingsFailoverConditionFailoverConditionSettingsInputLossSettingsArgs();
        }

        public Builder(ChannelInputAttachmentAutomaticInputFailoverSettingsFailoverConditionFailoverConditionSettingsInputLossSettingsArgs defaults) {
            $ = new ChannelInputAttachmentAutomaticInputFailoverSettingsFailoverConditionFailoverConditionSettingsInputLossSettingsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param inputLossThresholdMsec The amount of time (in milliseconds) that no input is detected. After that time, an input failover will occur.
         * 
         * @return builder
         * 
         */
        public Builder inputLossThresholdMsec(@Nullable Output<Integer> inputLossThresholdMsec) {
            $.inputLossThresholdMsec = inputLossThresholdMsec;
            return this;
        }

        /**
         * @param inputLossThresholdMsec The amount of time (in milliseconds) that no input is detected. After that time, an input failover will occur.
         * 
         * @return builder
         * 
         */
        public Builder inputLossThresholdMsec(Integer inputLossThresholdMsec) {
            return inputLossThresholdMsec(Output.of(inputLossThresholdMsec));
        }

        public ChannelInputAttachmentAutomaticInputFailoverSettingsFailoverConditionFailoverConditionSettingsInputLossSettingsArgs build() {
            return $;
        }
    }

}

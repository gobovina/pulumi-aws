// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.medialive.inputs;

import com.pulumi.aws.medialive.inputs.ChannelInputAttachmentAutomaticInputFailoverSettingsFailoverConditionFailoverConditionSettingsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ChannelInputAttachmentAutomaticInputFailoverSettingsFailoverConditionArgs extends com.pulumi.resources.ResourceArgs {

    public static final ChannelInputAttachmentAutomaticInputFailoverSettingsFailoverConditionArgs Empty = new ChannelInputAttachmentAutomaticInputFailoverSettingsFailoverConditionArgs();

    /**
     * Failover condition type-specific settings. See Failover Condition Settings for more details.
     * 
     */
    @Import(name="failoverConditionSettings")
    private @Nullable Output<ChannelInputAttachmentAutomaticInputFailoverSettingsFailoverConditionFailoverConditionSettingsArgs> failoverConditionSettings;

    /**
     * @return Failover condition type-specific settings. See Failover Condition Settings for more details.
     * 
     */
    public Optional<Output<ChannelInputAttachmentAutomaticInputFailoverSettingsFailoverConditionFailoverConditionSettingsArgs>> failoverConditionSettings() {
        return Optional.ofNullable(this.failoverConditionSettings);
    }

    private ChannelInputAttachmentAutomaticInputFailoverSettingsFailoverConditionArgs() {}

    private ChannelInputAttachmentAutomaticInputFailoverSettingsFailoverConditionArgs(ChannelInputAttachmentAutomaticInputFailoverSettingsFailoverConditionArgs $) {
        this.failoverConditionSettings = $.failoverConditionSettings;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ChannelInputAttachmentAutomaticInputFailoverSettingsFailoverConditionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ChannelInputAttachmentAutomaticInputFailoverSettingsFailoverConditionArgs $;

        public Builder() {
            $ = new ChannelInputAttachmentAutomaticInputFailoverSettingsFailoverConditionArgs();
        }

        public Builder(ChannelInputAttachmentAutomaticInputFailoverSettingsFailoverConditionArgs defaults) {
            $ = new ChannelInputAttachmentAutomaticInputFailoverSettingsFailoverConditionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param failoverConditionSettings Failover condition type-specific settings. See Failover Condition Settings for more details.
         * 
         * @return builder
         * 
         */
        public Builder failoverConditionSettings(@Nullable Output<ChannelInputAttachmentAutomaticInputFailoverSettingsFailoverConditionFailoverConditionSettingsArgs> failoverConditionSettings) {
            $.failoverConditionSettings = failoverConditionSettings;
            return this;
        }

        /**
         * @param failoverConditionSettings Failover condition type-specific settings. See Failover Condition Settings for more details.
         * 
         * @return builder
         * 
         */
        public Builder failoverConditionSettings(ChannelInputAttachmentAutomaticInputFailoverSettingsFailoverConditionFailoverConditionSettingsArgs failoverConditionSettings) {
            return failoverConditionSettings(Output.of(failoverConditionSettings));
        }

        public ChannelInputAttachmentAutomaticInputFailoverSettingsFailoverConditionArgs build() {
            return $;
        }
    }

}

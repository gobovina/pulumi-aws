// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.MediaLive.Outputs
{

    [OutputType]
    public sealed class ChannelInputAttachmentAutomaticInputFailoverSettingsFailoverConditionFailoverConditionSettings
    {
        /// <summary>
        /// MediaLive will perform a failover if the specified audio selector is silent for the specified period. See Audio Silence Failover Settings for more details.
        /// </summary>
        public readonly Outputs.ChannelInputAttachmentAutomaticInputFailoverSettingsFailoverConditionFailoverConditionSettingsAudioSilenceSettings? AudioSilenceSettings;
        /// <summary>
        /// MediaLive will perform a failover if content is not detected in this input for the specified period. See Input Loss Failover Settings for more details.
        /// </summary>
        public readonly Outputs.ChannelInputAttachmentAutomaticInputFailoverSettingsFailoverConditionFailoverConditionSettingsInputLossSettings? InputLossSettings;
        /// <summary>
        /// MediaLive will perform a failover if content is considered black for the specified period. See Video Black Failover Settings for more details.
        /// </summary>
        public readonly Outputs.ChannelInputAttachmentAutomaticInputFailoverSettingsFailoverConditionFailoverConditionSettingsVideoBlackSettings? VideoBlackSettings;

        [OutputConstructor]
        private ChannelInputAttachmentAutomaticInputFailoverSettingsFailoverConditionFailoverConditionSettings(
            Outputs.ChannelInputAttachmentAutomaticInputFailoverSettingsFailoverConditionFailoverConditionSettingsAudioSilenceSettings? audioSilenceSettings,

            Outputs.ChannelInputAttachmentAutomaticInputFailoverSettingsFailoverConditionFailoverConditionSettingsInputLossSettings? inputLossSettings,

            Outputs.ChannelInputAttachmentAutomaticInputFailoverSettingsFailoverConditionFailoverConditionSettingsVideoBlackSettings? videoBlackSettings)
        {
            AudioSilenceSettings = audioSilenceSettings;
            InputLossSettings = inputLossSettings;
            VideoBlackSettings = videoBlackSettings;
        }
    }
}

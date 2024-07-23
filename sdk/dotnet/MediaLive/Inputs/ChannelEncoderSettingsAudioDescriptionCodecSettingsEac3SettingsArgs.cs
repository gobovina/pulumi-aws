// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.MediaLive.Inputs
{

    public sealed class ChannelEncoderSettingsAudioDescriptionCodecSettingsEac3SettingsArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Sets the attenuation control.
        /// </summary>
        [Input("attenuationControl")]
        public Input<string>? AttenuationControl { get; set; }

        /// <summary>
        /// Average bitrate in bits/second.
        /// </summary>
        [Input("bitrate")]
        public Input<double>? Bitrate { get; set; }

        /// <summary>
        /// Specifies the bitstream mode (bsmod) for the emitted AC-3 stream.
        /// </summary>
        [Input("bitstreamMode")]
        public Input<string>? BitstreamMode { get; set; }

        /// <summary>
        /// Dolby Digital Plus coding mode.
        /// </summary>
        [Input("codingMode")]
        public Input<string>? CodingMode { get; set; }

        [Input("dcFilter")]
        public Input<string>? DcFilter { get; set; }

        [Input("dialnorm")]
        public Input<int>? Dialnorm { get; set; }

        /// <summary>
        /// Sets the Dolby dynamic range compression profile.
        /// </summary>
        [Input("drcLine")]
        public Input<string>? DrcLine { get; set; }

        /// <summary>
        /// Sets the profile for heavy Dolby dynamic range compression.
        /// </summary>
        [Input("drcRf")]
        public Input<string>? DrcRf { get; set; }

        [Input("lfeControl")]
        public Input<string>? LfeControl { get; set; }

        /// <summary>
        /// When set to enabled, applies a 120Hz lowpass filter to the LFE channel prior to encoding.
        /// </summary>
        [Input("lfeFilter")]
        public Input<string>? LfeFilter { get; set; }

        [Input("loRoCenterMixLevel")]
        public Input<double>? LoRoCenterMixLevel { get; set; }

        [Input("loRoSurroundMixLevel")]
        public Input<double>? LoRoSurroundMixLevel { get; set; }

        [Input("ltRtCenterMixLevel")]
        public Input<double>? LtRtCenterMixLevel { get; set; }

        [Input("ltRtSurroundMixLevel")]
        public Input<double>? LtRtSurroundMixLevel { get; set; }

        /// <summary>
        /// Metadata control.
        /// </summary>
        [Input("metadataControl")]
        public Input<string>? MetadataControl { get; set; }

        [Input("passthroughControl")]
        public Input<string>? PassthroughControl { get; set; }

        [Input("phaseControl")]
        public Input<string>? PhaseControl { get; set; }

        [Input("stereoDownmix")]
        public Input<string>? StereoDownmix { get; set; }

        [Input("surroundExMode")]
        public Input<string>? SurroundExMode { get; set; }

        [Input("surroundMode")]
        public Input<string>? SurroundMode { get; set; }

        public ChannelEncoderSettingsAudioDescriptionCodecSettingsEac3SettingsArgs()
        {
        }
        public static new ChannelEncoderSettingsAudioDescriptionCodecSettingsEac3SettingsArgs Empty => new ChannelEncoderSettingsAudioDescriptionCodecSettingsEac3SettingsArgs();
    }
}

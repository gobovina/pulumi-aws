// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.MediaLive.Inputs
{

    public sealed class ChannelEncoderSettingsOutputGroupOutputGroupSettingsHlsGroupSettingsArgs : global::Pulumi.ResourceArgs
    {
        [Input("adMarkers")]
        private InputList<string>? _adMarkers;

        /// <summary>
        /// The ad marker type for this output group.
        /// </summary>
        public InputList<string> AdMarkers
        {
            get => _adMarkers ?? (_adMarkers = new InputList<string>());
            set => _adMarkers = value;
        }

        [Input("baseUrlContent")]
        public Input<string>? BaseUrlContent { get; set; }

        [Input("baseUrlContent1")]
        public Input<string>? BaseUrlContent1 { get; set; }

        [Input("baseUrlManifest")]
        public Input<string>? BaseUrlManifest { get; set; }

        [Input("baseUrlManifest1")]
        public Input<string>? BaseUrlManifest1 { get; set; }

        [Input("captionLanguageMappings")]
        private InputList<Inputs.ChannelEncoderSettingsOutputGroupOutputGroupSettingsHlsGroupSettingsCaptionLanguageMappingArgs>? _captionLanguageMappings;
        public InputList<Inputs.ChannelEncoderSettingsOutputGroupOutputGroupSettingsHlsGroupSettingsCaptionLanguageMappingArgs> CaptionLanguageMappings
        {
            get => _captionLanguageMappings ?? (_captionLanguageMappings = new InputList<Inputs.ChannelEncoderSettingsOutputGroupOutputGroupSettingsHlsGroupSettingsCaptionLanguageMappingArgs>());
            set => _captionLanguageMappings = value;
        }

        [Input("captionLanguageSetting")]
        public Input<string>? CaptionLanguageSetting { get; set; }

        [Input("clientCache")]
        public Input<string>? ClientCache { get; set; }

        [Input("codecSpecification")]
        public Input<string>? CodecSpecification { get; set; }

        [Input("constantIv")]
        public Input<string>? ConstantIv { get; set; }

        [Input("destination", required: true)]
        public Input<Inputs.ChannelEncoderSettingsOutputGroupOutputGroupSettingsHlsGroupSettingsDestinationArgs> Destination { get; set; } = null!;

        [Input("directoryStructure")]
        public Input<string>? DirectoryStructure { get; set; }

        [Input("discontinuityTags")]
        public Input<string>? DiscontinuityTags { get; set; }

        [Input("encryptionType")]
        public Input<string>? EncryptionType { get; set; }

        [Input("hlsCdnSettings")]
        private InputList<Inputs.ChannelEncoderSettingsOutputGroupOutputGroupSettingsHlsGroupSettingsHlsCdnSettingArgs>? _hlsCdnSettings;
        public InputList<Inputs.ChannelEncoderSettingsOutputGroupOutputGroupSettingsHlsGroupSettingsHlsCdnSettingArgs> HlsCdnSettings
        {
            get => _hlsCdnSettings ?? (_hlsCdnSettings = new InputList<Inputs.ChannelEncoderSettingsOutputGroupOutputGroupSettingsHlsGroupSettingsHlsCdnSettingArgs>());
            set => _hlsCdnSettings = value;
        }

        [Input("hlsId3SegmentTagging")]
        public Input<string>? HlsId3SegmentTagging { get; set; }

        [Input("iframeOnlyPlaylists")]
        public Input<string>? IframeOnlyPlaylists { get; set; }

        [Input("incompleteSegmentBehavior")]
        public Input<string>? IncompleteSegmentBehavior { get; set; }

        [Input("indexNSegments")]
        public Input<int>? IndexNSegments { get; set; }

        [Input("inputLossAction")]
        public Input<string>? InputLossAction { get; set; }

        [Input("ivInManifest")]
        public Input<string>? IvInManifest { get; set; }

        [Input("ivSource")]
        public Input<string>? IvSource { get; set; }

        [Input("keepSegments")]
        public Input<int>? KeepSegments { get; set; }

        [Input("keyFormat")]
        public Input<string>? KeyFormat { get; set; }

        [Input("keyFormatVersions")]
        public Input<string>? KeyFormatVersions { get; set; }

        [Input("keyProviderSettings")]
        public Input<Inputs.ChannelEncoderSettingsOutputGroupOutputGroupSettingsHlsGroupSettingsKeyProviderSettingsArgs>? KeyProviderSettings { get; set; }

        [Input("manifestCompression")]
        public Input<string>? ManifestCompression { get; set; }

        [Input("manifestDurationFormat")]
        public Input<string>? ManifestDurationFormat { get; set; }

        [Input("minSegmentLength")]
        public Input<int>? MinSegmentLength { get; set; }

        [Input("mode")]
        public Input<string>? Mode { get; set; }

        [Input("outputSelection")]
        public Input<string>? OutputSelection { get; set; }

        [Input("programDateTime")]
        public Input<string>? ProgramDateTime { get; set; }

        [Input("programDateTimeClock")]
        public Input<string>? ProgramDateTimeClock { get; set; }

        [Input("programDateTimePeriod")]
        public Input<int>? ProgramDateTimePeriod { get; set; }

        [Input("redundantManifest")]
        public Input<string>? RedundantManifest { get; set; }

        [Input("segmentLength")]
        public Input<int>? SegmentLength { get; set; }

        [Input("segmentsPerSubdirectory")]
        public Input<int>? SegmentsPerSubdirectory { get; set; }

        [Input("streamInfResolution")]
        public Input<string>? StreamInfResolution { get; set; }

        /// <summary>
        /// Indicates ID3 frame that has the timecode.
        /// </summary>
        [Input("timedMetadataId3Frame")]
        public Input<string>? TimedMetadataId3Frame { get; set; }

        [Input("timedMetadataId3Period")]
        public Input<int>? TimedMetadataId3Period { get; set; }

        [Input("timestampDeltaMilliseconds")]
        public Input<int>? TimestampDeltaMilliseconds { get; set; }

        [Input("tsFileMode")]
        public Input<string>? TsFileMode { get; set; }

        public ChannelEncoderSettingsOutputGroupOutputGroupSettingsHlsGroupSettingsArgs()
        {
        }
        public static new ChannelEncoderSettingsOutputGroupOutputGroupSettingsHlsGroupSettingsArgs Empty => new ChannelEncoderSettingsOutputGroupOutputGroupSettingsHlsGroupSettingsArgs();
    }
}

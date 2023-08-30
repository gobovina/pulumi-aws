// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.ElasticTranscoder
{
    /// <summary>
    /// Provides an Elastic Transcoder preset resource.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var bar = new Aws.ElasticTranscoder.Preset("bar", new()
    ///     {
    ///         Audio = new Aws.ElasticTranscoder.Inputs.PresetAudioArgs
    ///         {
    ///             AudioPackingMode = "SingleTrack",
    ///             BitRate = "96",
    ///             Channels = "2",
    ///             Codec = "AAC",
    ///             SampleRate = "44100",
    ///         },
    ///         AudioCodecOptions = new Aws.ElasticTranscoder.Inputs.PresetAudioCodecOptionsArgs
    ///         {
    ///             Profile = "AAC-LC",
    ///         },
    ///         Container = "mp4",
    ///         Description = "Sample Preset",
    ///         Thumbnails = new Aws.ElasticTranscoder.Inputs.PresetThumbnailsArgs
    ///         {
    ///             Format = "png",
    ///             Interval = "120",
    ///             MaxHeight = "auto",
    ///             MaxWidth = "auto",
    ///             PaddingPolicy = "Pad",
    ///             SizingPolicy = "Fit",
    ///         },
    ///         Video = new Aws.ElasticTranscoder.Inputs.PresetVideoArgs
    ///         {
    ///             BitRate = "1600",
    ///             Codec = "H.264",
    ///             DisplayAspectRatio = "16:9",
    ///             FixedGop = "false",
    ///             FrameRate = "auto",
    ///             KeyframesMaxDist = "240",
    ///             MaxFrameRate = "60",
    ///             MaxHeight = "auto",
    ///             MaxWidth = "auto",
    ///             PaddingPolicy = "Pad",
    ///             SizingPolicy = "Fit",
    ///         },
    ///         VideoCodecOptions = 
    ///         {
    ///             { "ColorSpaceConversionMode", "None" },
    ///             { "InterlacedMode", "Progressive" },
    ///             { "Level", "2.2" },
    ///             { "MaxReferenceFrames", "3" },
    ///             { "Profile", "main" },
    ///         },
    ///         VideoWatermarks = new[]
    ///         {
    ///             new Aws.ElasticTranscoder.Inputs.PresetVideoWatermarkArgs
    ///             {
    ///                 HorizontalAlign = "Right",
    ///                 HorizontalOffset = "10px",
    ///                 Id = "Test",
    ///                 MaxHeight = "20%",
    ///                 MaxWidth = "20%",
    ///                 Opacity = "55.5",
    ///                 SizingPolicy = "ShrinkToFit",
    ///                 Target = "Content",
    ///                 VerticalAlign = "Bottom",
    ///                 VerticalOffset = "10px",
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import Elastic Transcoder presets using the `id`. For example:
    /// 
    /// ```sh
    ///  $ pulumi import aws:elastictranscoder/preset:Preset basic_preset 1407981661351-cttk8b
    /// ```
    /// </summary>
    [AwsResourceType("aws:elastictranscoder/preset:Preset")]
    public partial class Preset : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Amazon Resource Name (ARN) of the Elastic Transcoder Preset.
        /// </summary>
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

        /// <summary>
        /// Audio parameters object (documented below).
        /// </summary>
        [Output("audio")]
        public Output<Outputs.PresetAudio?> Audio { get; private set; } = null!;

        /// <summary>
        /// Codec options for the audio parameters (documented below)
        /// </summary>
        [Output("audioCodecOptions")]
        public Output<Outputs.PresetAudioCodecOptions> AudioCodecOptions { get; private set; } = null!;

        /// <summary>
        /// The container type for the output file. Valid values are `flac`, `flv`, `fmp4`, `gif`, `mp3`, `mp4`, `mpg`, `mxf`, `oga`, `ogg`, `ts`, and `webm`.
        /// </summary>
        [Output("container")]
        public Output<string> Container { get; private set; } = null!;

        /// <summary>
        /// A description of the preset (maximum 255 characters)
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// The name of the preset. (maximum 40 characters)
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Thumbnail parameters object (documented below)
        /// </summary>
        [Output("thumbnails")]
        public Output<Outputs.PresetThumbnails?> Thumbnails { get; private set; } = null!;

        [Output("type")]
        public Output<string> Type { get; private set; } = null!;

        /// <summary>
        /// Video parameters object (documented below)
        /// </summary>
        [Output("video")]
        public Output<Outputs.PresetVideo?> Video { get; private set; } = null!;

        /// <summary>
        /// Codec options for the video parameters
        /// </summary>
        [Output("videoCodecOptions")]
        public Output<ImmutableDictionary<string, string>?> VideoCodecOptions { get; private set; } = null!;

        /// <summary>
        /// Watermark parameters for the video parameters (documented below)
        /// </summary>
        [Output("videoWatermarks")]
        public Output<ImmutableArray<Outputs.PresetVideoWatermark>> VideoWatermarks { get; private set; } = null!;


        /// <summary>
        /// Create a Preset resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Preset(string name, PresetArgs args, CustomResourceOptions? options = null)
            : base("aws:elastictranscoder/preset:Preset", name, args ?? new PresetArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Preset(string name, Input<string> id, PresetState? state = null, CustomResourceOptions? options = null)
            : base("aws:elastictranscoder/preset:Preset", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing Preset resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Preset Get(string name, Input<string> id, PresetState? state = null, CustomResourceOptions? options = null)
        {
            return new Preset(name, id, state, options);
        }
    }

    public sealed class PresetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Audio parameters object (documented below).
        /// </summary>
        [Input("audio")]
        public Input<Inputs.PresetAudioArgs>? Audio { get; set; }

        /// <summary>
        /// Codec options for the audio parameters (documented below)
        /// </summary>
        [Input("audioCodecOptions")]
        public Input<Inputs.PresetAudioCodecOptionsArgs>? AudioCodecOptions { get; set; }

        /// <summary>
        /// The container type for the output file. Valid values are `flac`, `flv`, `fmp4`, `gif`, `mp3`, `mp4`, `mpg`, `mxf`, `oga`, `ogg`, `ts`, and `webm`.
        /// </summary>
        [Input("container", required: true)]
        public Input<string> Container { get; set; } = null!;

        /// <summary>
        /// A description of the preset (maximum 255 characters)
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The name of the preset. (maximum 40 characters)
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Thumbnail parameters object (documented below)
        /// </summary>
        [Input("thumbnails")]
        public Input<Inputs.PresetThumbnailsArgs>? Thumbnails { get; set; }

        [Input("type")]
        public Input<string>? Type { get; set; }

        /// <summary>
        /// Video parameters object (documented below)
        /// </summary>
        [Input("video")]
        public Input<Inputs.PresetVideoArgs>? Video { get; set; }

        [Input("videoCodecOptions")]
        private InputMap<string>? _videoCodecOptions;

        /// <summary>
        /// Codec options for the video parameters
        /// </summary>
        public InputMap<string> VideoCodecOptions
        {
            get => _videoCodecOptions ?? (_videoCodecOptions = new InputMap<string>());
            set => _videoCodecOptions = value;
        }

        [Input("videoWatermarks")]
        private InputList<Inputs.PresetVideoWatermarkArgs>? _videoWatermarks;

        /// <summary>
        /// Watermark parameters for the video parameters (documented below)
        /// </summary>
        public InputList<Inputs.PresetVideoWatermarkArgs> VideoWatermarks
        {
            get => _videoWatermarks ?? (_videoWatermarks = new InputList<Inputs.PresetVideoWatermarkArgs>());
            set => _videoWatermarks = value;
        }

        public PresetArgs()
        {
        }
        public static new PresetArgs Empty => new PresetArgs();
    }

    public sealed class PresetState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Amazon Resource Name (ARN) of the Elastic Transcoder Preset.
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        /// <summary>
        /// Audio parameters object (documented below).
        /// </summary>
        [Input("audio")]
        public Input<Inputs.PresetAudioGetArgs>? Audio { get; set; }

        /// <summary>
        /// Codec options for the audio parameters (documented below)
        /// </summary>
        [Input("audioCodecOptions")]
        public Input<Inputs.PresetAudioCodecOptionsGetArgs>? AudioCodecOptions { get; set; }

        /// <summary>
        /// The container type for the output file. Valid values are `flac`, `flv`, `fmp4`, `gif`, `mp3`, `mp4`, `mpg`, `mxf`, `oga`, `ogg`, `ts`, and `webm`.
        /// </summary>
        [Input("container")]
        public Input<string>? Container { get; set; }

        /// <summary>
        /// A description of the preset (maximum 255 characters)
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The name of the preset. (maximum 40 characters)
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Thumbnail parameters object (documented below)
        /// </summary>
        [Input("thumbnails")]
        public Input<Inputs.PresetThumbnailsGetArgs>? Thumbnails { get; set; }

        [Input("type")]
        public Input<string>? Type { get; set; }

        /// <summary>
        /// Video parameters object (documented below)
        /// </summary>
        [Input("video")]
        public Input<Inputs.PresetVideoGetArgs>? Video { get; set; }

        [Input("videoCodecOptions")]
        private InputMap<string>? _videoCodecOptions;

        /// <summary>
        /// Codec options for the video parameters
        /// </summary>
        public InputMap<string> VideoCodecOptions
        {
            get => _videoCodecOptions ?? (_videoCodecOptions = new InputMap<string>());
            set => _videoCodecOptions = value;
        }

        [Input("videoWatermarks")]
        private InputList<Inputs.PresetVideoWatermarkGetArgs>? _videoWatermarks;

        /// <summary>
        /// Watermark parameters for the video parameters (documented below)
        /// </summary>
        public InputList<Inputs.PresetVideoWatermarkGetArgs> VideoWatermarks
        {
            get => _videoWatermarks ?? (_videoWatermarks = new InputList<Inputs.PresetVideoWatermarkGetArgs>());
            set => _videoWatermarks = value;
        }

        public PresetState()
        {
        }
        public static new PresetState Empty => new PresetState();
    }
}

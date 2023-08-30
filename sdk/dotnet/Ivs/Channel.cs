// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Ivs
{
    /// <summary>
    /// Resource for managing an AWS IVS (Interactive Video) Channel.
    /// 
    /// ## Example Usage
    /// ### Basic Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Aws.Ivs.Channel("example");
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import IVS (Interactive Video) Channel using the ARN. For example:
    /// 
    /// ```sh
    ///  $ pulumi import aws:ivs/channel:Channel example arn:aws:ivs:us-west-2:326937407773:channel/0Y1lcs4U7jk5
    /// ```
    /// </summary>
    [AwsResourceType("aws:ivs/channel:Channel")]
    public partial class Channel : global::Pulumi.CustomResource
    {
        /// <summary>
        /// ARN of the Channel.
        /// </summary>
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

        /// <summary>
        /// If `true`, channel is private (enabled for playback authorization).
        /// </summary>
        [Output("authorized")]
        public Output<bool> Authorized { get; private set; } = null!;

        /// <summary>
        /// Channel ingest endpoint, part of the definition of an ingest server, used when setting up streaming software.
        /// </summary>
        [Output("ingestEndpoint")]
        public Output<string> IngestEndpoint { get; private set; } = null!;

        /// <summary>
        /// Channel latency mode. Valid values: `NORMAL`, `LOW`.
        /// </summary>
        [Output("latencyMode")]
        public Output<string> LatencyMode { get; private set; } = null!;

        /// <summary>
        /// Channel name.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Channel playback URL.
        /// </summary>
        [Output("playbackUrl")]
        public Output<string> PlaybackUrl { get; private set; } = null!;

        /// <summary>
        /// Recording configuration ARN.
        /// </summary>
        [Output("recordingConfigurationArn")]
        public Output<string> RecordingConfigurationArn { get; private set; } = null!;

        /// <summary>
        /// A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;

        /// <summary>
        /// Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        /// </summary>
        [Output("tagsAll")]
        public Output<ImmutableDictionary<string, string>> TagsAll { get; private set; } = null!;

        /// <summary>
        /// Channel type, which determines the allowable resolution and bitrate. Valid values: `STANDARD`, `BASIC`.
        /// </summary>
        [Output("type")]
        public Output<string> Type { get; private set; } = null!;


        /// <summary>
        /// Create a Channel resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Channel(string name, ChannelArgs? args = null, CustomResourceOptions? options = null)
            : base("aws:ivs/channel:Channel", name, args ?? new ChannelArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Channel(string name, Input<string> id, ChannelState? state = null, CustomResourceOptions? options = null)
            : base("aws:ivs/channel:Channel", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Channel resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Channel Get(string name, Input<string> id, ChannelState? state = null, CustomResourceOptions? options = null)
        {
            return new Channel(name, id, state, options);
        }
    }

    public sealed class ChannelArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// If `true`, channel is private (enabled for playback authorization).
        /// </summary>
        [Input("authorized")]
        public Input<bool>? Authorized { get; set; }

        /// <summary>
        /// Channel latency mode. Valid values: `NORMAL`, `LOW`.
        /// </summary>
        [Input("latencyMode")]
        public Input<string>? LatencyMode { get; set; }

        /// <summary>
        /// Channel name.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Recording configuration ARN.
        /// </summary>
        [Input("recordingConfigurationArn")]
        public Input<string>? RecordingConfigurationArn { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        /// <summary>
        /// Channel type, which determines the allowable resolution and bitrate. Valid values: `STANDARD`, `BASIC`.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public ChannelArgs()
        {
        }
        public static new ChannelArgs Empty => new ChannelArgs();
    }

    public sealed class ChannelState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// ARN of the Channel.
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        /// <summary>
        /// If `true`, channel is private (enabled for playback authorization).
        /// </summary>
        [Input("authorized")]
        public Input<bool>? Authorized { get; set; }

        /// <summary>
        /// Channel ingest endpoint, part of the definition of an ingest server, used when setting up streaming software.
        /// </summary>
        [Input("ingestEndpoint")]
        public Input<string>? IngestEndpoint { get; set; }

        /// <summary>
        /// Channel latency mode. Valid values: `NORMAL`, `LOW`.
        /// </summary>
        [Input("latencyMode")]
        public Input<string>? LatencyMode { get; set; }

        /// <summary>
        /// Channel name.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Channel playback URL.
        /// </summary>
        [Input("playbackUrl")]
        public Input<string>? PlaybackUrl { get; set; }

        /// <summary>
        /// Recording configuration ARN.
        /// </summary>
        [Input("recordingConfigurationArn")]
        public Input<string>? RecordingConfigurationArn { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        [Input("tagsAll")]
        private InputMap<string>? _tagsAll;

        /// <summary>
        /// Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        /// </summary>
        public InputMap<string> TagsAll
        {
            get => _tagsAll ?? (_tagsAll = new InputMap<string>());
            set => _tagsAll = value;
        }

        /// <summary>
        /// Channel type, which determines the allowable resolution and bitrate. Valid values: `STANDARD`, `BASIC`.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public ChannelState()
        {
        }
        public static new ChannelState Empty => new ChannelState();
    }
}

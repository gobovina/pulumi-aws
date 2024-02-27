// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.IvsChat
{
    /// <summary>
    /// Resource for managing an AWS IVS (Interactive Video) Chat Room.
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
    ///     var example = new Aws.IvsChat.Room("example");
    /// 
    /// });
    /// ```
    /// ## Usage with Logging Configuration to S3 Bucket
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var exampleBucketV2 = new Aws.S3.BucketV2("exampleBucketV2", new()
    ///     {
    ///         BucketPrefix = "tf-ivschat-logging-bucket-",
    ///         ForceDestroy = true,
    ///     });
    /// 
    ///     var exampleLoggingConfiguration = new Aws.IvsChat.LoggingConfiguration("exampleLoggingConfiguration", new()
    ///     {
    ///         DestinationConfiguration = new Aws.IvsChat.Inputs.LoggingConfigurationDestinationConfigurationArgs
    ///         {
    ///             S3 = new Aws.IvsChat.Inputs.LoggingConfigurationDestinationConfigurationS3Args
    ///             {
    ///                 BucketName = exampleBucketV2.Id,
    ///             },
    ///         },
    ///     });
    /// 
    ///     var exampleRoom = new Aws.IvsChat.Room("exampleRoom", new()
    ///     {
    ///         LoggingConfigurationIdentifiers = new[]
    ///         {
    ///             exampleLoggingConfiguration.Arn,
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import IVS (Interactive Video) Chat Room using the ARN. For example:
    /// 
    /// ```sh
    ///  $ pulumi import aws:ivschat/room:Room example arn:aws:ivschat:us-west-2:326937407773:room/GoXEXyB4VwHb
    /// ```
    /// </summary>
    [AwsResourceType("aws:ivschat/room:Room")]
    public partial class Room : global::Pulumi.CustomResource
    {
        /// <summary>
        /// ARN of the Room.
        /// </summary>
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

        /// <summary>
        /// List of Logging Configuration
        /// ARNs to attach to the room.
        /// </summary>
        [Output("loggingConfigurationIdentifiers")]
        public Output<ImmutableArray<string>> LoggingConfigurationIdentifiers { get; private set; } = null!;

        /// <summary>
        /// Maximum number of characters in a single
        /// message. Messages are expected to be UTF-8 encoded and this limit applies
        /// specifically to rune/code-point count, not number of bytes.
        /// </summary>
        [Output("maximumMessageLength")]
        public Output<int> MaximumMessageLength { get; private set; } = null!;

        /// <summary>
        /// Maximum number of messages per
        /// second that can be sent to the room (by all clients).
        /// </summary>
        [Output("maximumMessageRatePerSecond")]
        public Output<int> MaximumMessageRatePerSecond { get; private set; } = null!;

        /// <summary>
        /// Configuration information for optional
        /// review of messages.
        /// </summary>
        [Output("messageReviewHandler")]
        public Output<Outputs.RoomMessageReviewHandler?> MessageReviewHandler { get; private set; } = null!;

        /// <summary>
        /// Room name.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

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
        /// Create a Room resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Room(string name, RoomArgs? args = null, CustomResourceOptions? options = null)
            : base("aws:ivschat/room:Room", name, args ?? new RoomArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Room(string name, Input<string> id, RoomState? state = null, CustomResourceOptions? options = null)
            : base("aws:ivschat/room:Room", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Room resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Room Get(string name, Input<string> id, RoomState? state = null, CustomResourceOptions? options = null)
        {
            return new Room(name, id, state, options);
        }
    }

    public sealed class RoomArgs : global::Pulumi.ResourceArgs
    {
        [Input("loggingConfigurationIdentifiers")]
        private InputList<string>? _loggingConfigurationIdentifiers;

        /// <summary>
        /// List of Logging Configuration
        /// ARNs to attach to the room.
        /// </summary>
        public InputList<string> LoggingConfigurationIdentifiers
        {
            get => _loggingConfigurationIdentifiers ?? (_loggingConfigurationIdentifiers = new InputList<string>());
            set => _loggingConfigurationIdentifiers = value;
        }

        /// <summary>
        /// Maximum number of characters in a single
        /// message. Messages are expected to be UTF-8 encoded and this limit applies
        /// specifically to rune/code-point count, not number of bytes.
        /// </summary>
        [Input("maximumMessageLength")]
        public Input<int>? MaximumMessageLength { get; set; }

        /// <summary>
        /// Maximum number of messages per
        /// second that can be sent to the room (by all clients).
        /// </summary>
        [Input("maximumMessageRatePerSecond")]
        public Input<int>? MaximumMessageRatePerSecond { get; set; }

        /// <summary>
        /// Configuration information for optional
        /// review of messages.
        /// </summary>
        [Input("messageReviewHandler")]
        public Input<Inputs.RoomMessageReviewHandlerArgs>? MessageReviewHandler { get; set; }

        /// <summary>
        /// Room name.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

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

        public RoomArgs()
        {
        }
        public static new RoomArgs Empty => new RoomArgs();
    }

    public sealed class RoomState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// ARN of the Room.
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        [Input("loggingConfigurationIdentifiers")]
        private InputList<string>? _loggingConfigurationIdentifiers;

        /// <summary>
        /// List of Logging Configuration
        /// ARNs to attach to the room.
        /// </summary>
        public InputList<string> LoggingConfigurationIdentifiers
        {
            get => _loggingConfigurationIdentifiers ?? (_loggingConfigurationIdentifiers = new InputList<string>());
            set => _loggingConfigurationIdentifiers = value;
        }

        /// <summary>
        /// Maximum number of characters in a single
        /// message. Messages are expected to be UTF-8 encoded and this limit applies
        /// specifically to rune/code-point count, not number of bytes.
        /// </summary>
        [Input("maximumMessageLength")]
        public Input<int>? MaximumMessageLength { get; set; }

        /// <summary>
        /// Maximum number of messages per
        /// second that can be sent to the room (by all clients).
        /// </summary>
        [Input("maximumMessageRatePerSecond")]
        public Input<int>? MaximumMessageRatePerSecond { get; set; }

        /// <summary>
        /// Configuration information for optional
        /// review of messages.
        /// </summary>
        [Input("messageReviewHandler")]
        public Input<Inputs.RoomMessageReviewHandlerGetArgs>? MessageReviewHandler { get; set; }

        /// <summary>
        /// Room name.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

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
        [Obsolete(@"Please use `tags` instead.")]
        public InputMap<string> TagsAll
        {
            get => _tagsAll ?? (_tagsAll = new InputMap<string>());
            set => _tagsAll = value;
        }

        public RoomState()
        {
        }
        public static new RoomState Empty => new RoomState();
    }
}

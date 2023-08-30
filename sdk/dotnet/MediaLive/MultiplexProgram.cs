// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.MediaLive
{
    /// <summary>
    /// Resource for managing an AWS MediaLive MultiplexProgram.
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
    ///     var available = Aws.GetAvailabilityZones.Invoke(new()
    ///     {
    ///         State = "available",
    ///     });
    /// 
    ///     var exampleMultiplex = new Aws.MediaLive.Multiplex("exampleMultiplex", new()
    ///     {
    ///         AvailabilityZones = new[]
    ///         {
    ///             available.Apply(getAvailabilityZonesResult =&gt; getAvailabilityZonesResult.Names[0]),
    ///             available.Apply(getAvailabilityZonesResult =&gt; getAvailabilityZonesResult.Names[1]),
    ///         },
    ///         MultiplexSettings = new Aws.MediaLive.Inputs.MultiplexMultiplexSettingsArgs
    ///         {
    ///             TransportStreamBitrate = 1000000,
    ///             TransportStreamId = 1,
    ///             TransportStreamReservedBitrate = 1,
    ///             MaximumVideoBufferDelayMilliseconds = 1000,
    ///         },
    ///         StartMultiplex = true,
    ///         Tags = 
    ///         {
    ///             { "tag1", "value1" },
    ///         },
    ///     });
    /// 
    ///     var exampleMultiplexProgram = new Aws.MediaLive.MultiplexProgram("exampleMultiplexProgram", new()
    ///     {
    ///         ProgramName = "example_program",
    ///         MultiplexId = exampleMultiplex.Id,
    ///         MultiplexProgramSettings = new Aws.MediaLive.Inputs.MultiplexProgramMultiplexProgramSettingsArgs
    ///         {
    ///             ProgramNumber = 1,
    ///             PreferredChannelPipeline = "CURRENTLY_ACTIVE",
    ///             VideoSettings = new Aws.MediaLive.Inputs.MultiplexProgramMultiplexProgramSettingsVideoSettingsArgs
    ///             {
    ///                 ConstantBitrate = 100000,
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import MediaLive MultiplexProgram using the `id`, or a combination of "`program_name`/`multiplex_id`". For example:
    /// 
    /// ```sh
    ///  $ pulumi import aws:medialive/multiplexProgram:MultiplexProgram example example_program/1234567
    /// ```
    /// </summary>
    [AwsResourceType("aws:medialive/multiplexProgram:MultiplexProgram")]
    public partial class MultiplexProgram : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Multiplex ID.
        /// </summary>
        [Output("multiplexId")]
        public Output<string> MultiplexId { get; private set; } = null!;

        /// <summary>
        /// MultiplexProgram settings. See Multiplex Program Settings for more details.
        /// 
        /// The following arguments are optional:
        /// </summary>
        [Output("multiplexProgramSettings")]
        public Output<Outputs.MultiplexProgramMultiplexProgramSettings?> MultiplexProgramSettings { get; private set; } = null!;

        /// <summary>
        /// Unique program name.
        /// </summary>
        [Output("programName")]
        public Output<string> ProgramName { get; private set; } = null!;


        /// <summary>
        /// Create a MultiplexProgram resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public MultiplexProgram(string name, MultiplexProgramArgs args, CustomResourceOptions? options = null)
            : base("aws:medialive/multiplexProgram:MultiplexProgram", name, args ?? new MultiplexProgramArgs(), MakeResourceOptions(options, ""))
        {
        }

        private MultiplexProgram(string name, Input<string> id, MultiplexProgramState? state = null, CustomResourceOptions? options = null)
            : base("aws:medialive/multiplexProgram:MultiplexProgram", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing MultiplexProgram resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static MultiplexProgram Get(string name, Input<string> id, MultiplexProgramState? state = null, CustomResourceOptions? options = null)
        {
            return new MultiplexProgram(name, id, state, options);
        }
    }

    public sealed class MultiplexProgramArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Multiplex ID.
        /// </summary>
        [Input("multiplexId", required: true)]
        public Input<string> MultiplexId { get; set; } = null!;

        /// <summary>
        /// MultiplexProgram settings. See Multiplex Program Settings for more details.
        /// 
        /// The following arguments are optional:
        /// </summary>
        [Input("multiplexProgramSettings")]
        public Input<Inputs.MultiplexProgramMultiplexProgramSettingsArgs>? MultiplexProgramSettings { get; set; }

        /// <summary>
        /// Unique program name.
        /// </summary>
        [Input("programName", required: true)]
        public Input<string> ProgramName { get; set; } = null!;

        public MultiplexProgramArgs()
        {
        }
        public static new MultiplexProgramArgs Empty => new MultiplexProgramArgs();
    }

    public sealed class MultiplexProgramState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Multiplex ID.
        /// </summary>
        [Input("multiplexId")]
        public Input<string>? MultiplexId { get; set; }

        /// <summary>
        /// MultiplexProgram settings. See Multiplex Program Settings for more details.
        /// 
        /// The following arguments are optional:
        /// </summary>
        [Input("multiplexProgramSettings")]
        public Input<Inputs.MultiplexProgramMultiplexProgramSettingsGetArgs>? MultiplexProgramSettings { get; set; }

        /// <summary>
        /// Unique program name.
        /// </summary>
        [Input("programName")]
        public Input<string>? ProgramName { get; set; }

        public MultiplexProgramState()
        {
        }
        public static new MultiplexProgramState Empty => new MultiplexProgramState();
    }
}

// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Chime
{
    /// <summary>
    /// Enable origination settings to control inbound calling to your SIP infrastructure.
    /// 
    /// ## Example Usage
    /// 
    /// &lt;!--Start PulumiCodeChooser --&gt;
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var @default = new Aws.Chime.VoiceConnector("default", new()
    ///     {
    ///         Name = "test",
    ///         RequireEncryption = true,
    ///     });
    /// 
    ///     var defaultVoiceConnectorOrganization = new Aws.Chime.VoiceConnectorOrganization("default", new()
    ///     {
    ///         Disabled = false,
    ///         VoiceConnectorId = @default.Id,
    ///         Routes = new[]
    ///         {
    ///             new Aws.Chime.Inputs.VoiceConnectorOrganizationRouteArgs
    ///             {
    ///                 Host = "127.0.0.1",
    ///                 Port = 8081,
    ///                 Protocol = "TCP",
    ///                 Priority = 1,
    ///                 Weight = 1,
    ///             },
    ///             new Aws.Chime.Inputs.VoiceConnectorOrganizationRouteArgs
    ///             {
    ///                 Host = "127.0.0.2",
    ///                 Port = 8082,
    ///                 Protocol = "TCP",
    ///                 Priority = 2,
    ///                 Weight = 10,
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import Chime Voice Connector Origination using the `voice_connector_id`. For example:
    /// 
    /// ```sh
    /// $ pulumi import aws:chime/voiceConnectorOrganization:VoiceConnectorOrganization default abcdef1ghij2klmno3pqr4
    /// ```
    /// </summary>
    [AwsResourceType("aws:chime/voiceConnectorOrganization:VoiceConnectorOrganization")]
    public partial class VoiceConnectorOrganization : global::Pulumi.CustomResource
    {
        /// <summary>
        /// When origination settings are disabled, inbound calls are not enabled for your Amazon Chime Voice Connector.
        /// </summary>
        [Output("disabled")]
        public Output<bool?> Disabled { get; private set; } = null!;

        /// <summary>
        /// Set of call distribution properties defined for your SIP hosts. See route below for more details. Minimum of 1. Maximum of 20.
        /// </summary>
        [Output("routes")]
        public Output<ImmutableArray<Outputs.VoiceConnectorOrganizationRoute>> Routes { get; private set; } = null!;

        /// <summary>
        /// The Amazon Chime Voice Connector ID.
        /// </summary>
        [Output("voiceConnectorId")]
        public Output<string> VoiceConnectorId { get; private set; } = null!;


        /// <summary>
        /// Create a VoiceConnectorOrganization resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public VoiceConnectorOrganization(string name, VoiceConnectorOrganizationArgs args, CustomResourceOptions? options = null)
            : base("aws:chime/voiceConnectorOrganization:VoiceConnectorOrganization", name, args ?? new VoiceConnectorOrganizationArgs(), MakeResourceOptions(options, ""))
        {
        }

        private VoiceConnectorOrganization(string name, Input<string> id, VoiceConnectorOrganizationState? state = null, CustomResourceOptions? options = null)
            : base("aws:chime/voiceConnectorOrganization:VoiceConnectorOrganization", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing VoiceConnectorOrganization resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static VoiceConnectorOrganization Get(string name, Input<string> id, VoiceConnectorOrganizationState? state = null, CustomResourceOptions? options = null)
        {
            return new VoiceConnectorOrganization(name, id, state, options);
        }
    }

    public sealed class VoiceConnectorOrganizationArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// When origination settings are disabled, inbound calls are not enabled for your Amazon Chime Voice Connector.
        /// </summary>
        [Input("disabled")]
        public Input<bool>? Disabled { get; set; }

        [Input("routes", required: true)]
        private InputList<Inputs.VoiceConnectorOrganizationRouteArgs>? _routes;

        /// <summary>
        /// Set of call distribution properties defined for your SIP hosts. See route below for more details. Minimum of 1. Maximum of 20.
        /// </summary>
        public InputList<Inputs.VoiceConnectorOrganizationRouteArgs> Routes
        {
            get => _routes ?? (_routes = new InputList<Inputs.VoiceConnectorOrganizationRouteArgs>());
            set => _routes = value;
        }

        /// <summary>
        /// The Amazon Chime Voice Connector ID.
        /// </summary>
        [Input("voiceConnectorId", required: true)]
        public Input<string> VoiceConnectorId { get; set; } = null!;

        public VoiceConnectorOrganizationArgs()
        {
        }
        public static new VoiceConnectorOrganizationArgs Empty => new VoiceConnectorOrganizationArgs();
    }

    public sealed class VoiceConnectorOrganizationState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// When origination settings are disabled, inbound calls are not enabled for your Amazon Chime Voice Connector.
        /// </summary>
        [Input("disabled")]
        public Input<bool>? Disabled { get; set; }

        [Input("routes")]
        private InputList<Inputs.VoiceConnectorOrganizationRouteGetArgs>? _routes;

        /// <summary>
        /// Set of call distribution properties defined for your SIP hosts. See route below for more details. Minimum of 1. Maximum of 20.
        /// </summary>
        public InputList<Inputs.VoiceConnectorOrganizationRouteGetArgs> Routes
        {
            get => _routes ?? (_routes = new InputList<Inputs.VoiceConnectorOrganizationRouteGetArgs>());
            set => _routes = value;
        }

        /// <summary>
        /// The Amazon Chime Voice Connector ID.
        /// </summary>
        [Input("voiceConnectorId")]
        public Input<string>? VoiceConnectorId { get; set; }

        public VoiceConnectorOrganizationState()
        {
        }
        public static new VoiceConnectorOrganizationState Empty => new VoiceConnectorOrganizationState();
    }
}

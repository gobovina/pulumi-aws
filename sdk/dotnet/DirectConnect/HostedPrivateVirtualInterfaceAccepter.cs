// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.DirectConnect
{
    /// <summary>
    /// Provides a resource to manage the accepter's side of a Direct Connect hosted private virtual interface.
    /// This resource accepts ownership of a private virtual interface created by another AWS account.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var accepter = new Aws.Provider("accepter");
    /// 
    ///     // Accepter's credentials.
    ///     var accepterCallerIdentity = Aws.GetCallerIdentity.Invoke();
    /// 
    ///     // Accepter's side of the VIF.
    ///     var vpnGw = new Aws.Ec2.VpnGateway("vpnGw", new()
    ///     {
    ///     }, new CustomResourceOptions
    ///     {
    ///         Provider = aws.Accepter,
    ///     });
    /// 
    ///     // Creator's side of the VIF
    ///     var creator = new Aws.DirectConnect.HostedPrivateVirtualInterface("creator", new()
    ///     {
    ///         ConnectionId = "dxcon-zzzzzzzz",
    ///         OwnerAccountId = accepterCallerIdentity.Apply(getCallerIdentityResult =&gt; getCallerIdentityResult.AccountId),
    ///         Vlan = 4094,
    ///         AddressFamily = "ipv4",
    ///         BgpAsn = 65352,
    ///     }, new CustomResourceOptions
    ///     {
    ///         DependsOn = new[]
    ///         {
    ///             vpnGw,
    ///         },
    ///     });
    /// 
    ///     var accepterHostedPrivateVirtualInterfaceAccepter = new Aws.DirectConnect.HostedPrivateVirtualInterfaceAccepter("accepterHostedPrivateVirtualInterfaceAccepter", new()
    ///     {
    ///         VirtualInterfaceId = creator.Id,
    ///         VpnGatewayId = vpnGw.Id,
    ///         Tags = 
    ///         {
    ///             { "Side", "Accepter" },
    ///         },
    ///     }, new CustomResourceOptions
    ///     {
    ///         Provider = aws.Accepter,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Direct Connect hosted private virtual interfaces can be imported using the `vif id`, e.g.,
    /// 
    /// ```sh
    ///  $ pulumi import aws:directconnect/hostedPrivateVirtualInterfaceAccepter:HostedPrivateVirtualInterfaceAccepter test dxvif-33cc44dd
    /// ```
    /// </summary>
    [AwsResourceType("aws:directconnect/hostedPrivateVirtualInterfaceAccepter:HostedPrivateVirtualInterfaceAccepter")]
    public partial class HostedPrivateVirtualInterfaceAccepter : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The ARN of the virtual interface.
        /// </summary>
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

        /// <summary>
        /// The ID of the Direct Connect gateway to which to connect the virtual interface.
        /// </summary>
        [Output("dxGatewayId")]
        public Output<string?> DxGatewayId { get; private set; } = null!;

        /// <summary>
        /// A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;

        /// <summary>
        /// A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        /// </summary>
        [Output("tagsAll")]
        public Output<ImmutableDictionary<string, string>> TagsAll { get; private set; } = null!;

        /// <summary>
        /// The ID of the Direct Connect virtual interface to accept.
        /// </summary>
        [Output("virtualInterfaceId")]
        public Output<string> VirtualInterfaceId { get; private set; } = null!;

        /// <summary>
        /// The ID of the virtual private gateway to which to connect the virtual interface.
        /// </summary>
        [Output("vpnGatewayId")]
        public Output<string?> VpnGatewayId { get; private set; } = null!;


        /// <summary>
        /// Create a HostedPrivateVirtualInterfaceAccepter resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public HostedPrivateVirtualInterfaceAccepter(string name, HostedPrivateVirtualInterfaceAccepterArgs args, CustomResourceOptions? options = null)
            : base("aws:directconnect/hostedPrivateVirtualInterfaceAccepter:HostedPrivateVirtualInterfaceAccepter", name, args ?? new HostedPrivateVirtualInterfaceAccepterArgs(), MakeResourceOptions(options, ""))
        {
        }

        private HostedPrivateVirtualInterfaceAccepter(string name, Input<string> id, HostedPrivateVirtualInterfaceAccepterState? state = null, CustomResourceOptions? options = null)
            : base("aws:directconnect/hostedPrivateVirtualInterfaceAccepter:HostedPrivateVirtualInterfaceAccepter", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing HostedPrivateVirtualInterfaceAccepter resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static HostedPrivateVirtualInterfaceAccepter Get(string name, Input<string> id, HostedPrivateVirtualInterfaceAccepterState? state = null, CustomResourceOptions? options = null)
        {
            return new HostedPrivateVirtualInterfaceAccepter(name, id, state, options);
        }
    }

    public sealed class HostedPrivateVirtualInterfaceAccepterArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the Direct Connect gateway to which to connect the virtual interface.
        /// </summary>
        [Input("dxGatewayId")]
        public Input<string>? DxGatewayId { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        /// <summary>
        /// The ID of the Direct Connect virtual interface to accept.
        /// </summary>
        [Input("virtualInterfaceId", required: true)]
        public Input<string> VirtualInterfaceId { get; set; } = null!;

        /// <summary>
        /// The ID of the virtual private gateway to which to connect the virtual interface.
        /// </summary>
        [Input("vpnGatewayId")]
        public Input<string>? VpnGatewayId { get; set; }

        public HostedPrivateVirtualInterfaceAccepterArgs()
        {
        }
        public static new HostedPrivateVirtualInterfaceAccepterArgs Empty => new HostedPrivateVirtualInterfaceAccepterArgs();
    }

    public sealed class HostedPrivateVirtualInterfaceAccepterState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ARN of the virtual interface.
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        /// <summary>
        /// The ID of the Direct Connect gateway to which to connect the virtual interface.
        /// </summary>
        [Input("dxGatewayId")]
        public Input<string>? DxGatewayId { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        [Input("tagsAll")]
        private InputMap<string>? _tagsAll;

        /// <summary>
        /// A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        /// </summary>
        public InputMap<string> TagsAll
        {
            get => _tagsAll ?? (_tagsAll = new InputMap<string>());
            set => _tagsAll = value;
        }

        /// <summary>
        /// The ID of the Direct Connect virtual interface to accept.
        /// </summary>
        [Input("virtualInterfaceId")]
        public Input<string>? VirtualInterfaceId { get; set; }

        /// <summary>
        /// The ID of the virtual private gateway to which to connect the virtual interface.
        /// </summary>
        [Input("vpnGatewayId")]
        public Input<string>? VpnGatewayId { get; set; }

        public HostedPrivateVirtualInterfaceAccepterState()
        {
        }
        public static new HostedPrivateVirtualInterfaceAccepterState Empty => new HostedPrivateVirtualInterfaceAccepterState();
    }
}

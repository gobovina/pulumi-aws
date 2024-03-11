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
    /// Provides a Direct Connect transit virtual interface resource.
    /// A transit virtual interface is a VLAN that transports traffic from a Direct Connect gateway to one or more transit gateways.
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
    ///     var example = new Aws.DirectConnect.Gateway("example", new()
    ///     {
    ///         Name = "tf-dxg-example",
    ///         AmazonSideAsn = "64512",
    ///     });
    /// 
    ///     var exampleTransitVirtualInterface = new Aws.DirectConnect.TransitVirtualInterface("example", new()
    ///     {
    ///         ConnectionId = exampleAwsDxConnection.Id,
    ///         DxGatewayId = example.Id,
    ///         Name = "tf-transit-vif-example",
    ///         Vlan = 4094,
    ///         AddressFamily = "ipv4",
    ///         BgpAsn = 65352,
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import Direct Connect transit virtual interfaces using the VIF `id`. For example:
    /// 
    /// ```sh
    /// $ pulumi import aws:directconnect/transitVirtualInterface:TransitVirtualInterface test dxvif-33cc44dd
    /// ```
    /// </summary>
    [AwsResourceType("aws:directconnect/transitVirtualInterface:TransitVirtualInterface")]
    public partial class TransitVirtualInterface : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The address family for the BGP peer. `ipv4 ` or `ipv6`.
        /// </summary>
        [Output("addressFamily")]
        public Output<string> AddressFamily { get; private set; } = null!;

        /// <summary>
        /// The IPv4 CIDR address to use to send traffic to Amazon. Required for IPv4 BGP peers.
        /// </summary>
        [Output("amazonAddress")]
        public Output<string> AmazonAddress { get; private set; } = null!;

        [Output("amazonSideAsn")]
        public Output<string> AmazonSideAsn { get; private set; } = null!;

        /// <summary>
        /// The ARN of the virtual interface.
        /// </summary>
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

        /// <summary>
        /// The Direct Connect endpoint on which the virtual interface terminates.
        /// </summary>
        [Output("awsDevice")]
        public Output<string> AwsDevice { get; private set; } = null!;

        /// <summary>
        /// The autonomous system (AS) number for Border Gateway Protocol (BGP) configuration.
        /// </summary>
        [Output("bgpAsn")]
        public Output<int> BgpAsn { get; private set; } = null!;

        /// <summary>
        /// The authentication key for BGP configuration.
        /// </summary>
        [Output("bgpAuthKey")]
        public Output<string> BgpAuthKey { get; private set; } = null!;

        /// <summary>
        /// The ID of the Direct Connect connection (or LAG) on which to create the virtual interface.
        /// </summary>
        [Output("connectionId")]
        public Output<string> ConnectionId { get; private set; } = null!;

        /// <summary>
        /// The IPv4 CIDR destination address to which Amazon should send traffic. Required for IPv4 BGP peers.
        /// </summary>
        [Output("customerAddress")]
        public Output<string> CustomerAddress { get; private set; } = null!;

        /// <summary>
        /// The ID of the Direct Connect gateway to which to connect the virtual interface.
        /// </summary>
        [Output("dxGatewayId")]
        public Output<string> DxGatewayId { get; private set; } = null!;

        /// <summary>
        /// Indicates whether jumbo frames (8500 MTU) are supported.
        /// </summary>
        [Output("jumboFrameCapable")]
        public Output<bool> JumboFrameCapable { get; private set; } = null!;

        /// <summary>
        /// The maximum transmission unit (MTU) is the size, in bytes, of the largest permissible packet that can be passed over the connection.
        /// The MTU of a virtual transit interface can be either `1500` or `8500` (jumbo frames). Default is `1500`.
        /// </summary>
        [Output("mtu")]
        public Output<int?> Mtu { get; private set; } = null!;

        /// <summary>
        /// The name for the virtual interface.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Indicates whether to enable or disable SiteLink.
        /// </summary>
        [Output("sitelinkEnabled")]
        public Output<bool?> SitelinkEnabled { get; private set; } = null!;

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
        /// The VLAN ID.
        /// </summary>
        [Output("vlan")]
        public Output<int> Vlan { get; private set; } = null!;


        /// <summary>
        /// Create a TransitVirtualInterface resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public TransitVirtualInterface(string name, TransitVirtualInterfaceArgs args, CustomResourceOptions? options = null)
            : base("aws:directconnect/transitVirtualInterface:TransitVirtualInterface", name, args ?? new TransitVirtualInterfaceArgs(), MakeResourceOptions(options, ""))
        {
        }

        private TransitVirtualInterface(string name, Input<string> id, TransitVirtualInterfaceState? state = null, CustomResourceOptions? options = null)
            : base("aws:directconnect/transitVirtualInterface:TransitVirtualInterface", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing TransitVirtualInterface resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static TransitVirtualInterface Get(string name, Input<string> id, TransitVirtualInterfaceState? state = null, CustomResourceOptions? options = null)
        {
            return new TransitVirtualInterface(name, id, state, options);
        }
    }

    public sealed class TransitVirtualInterfaceArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The address family for the BGP peer. `ipv4 ` or `ipv6`.
        /// </summary>
        [Input("addressFamily", required: true)]
        public Input<string> AddressFamily { get; set; } = null!;

        /// <summary>
        /// The IPv4 CIDR address to use to send traffic to Amazon. Required for IPv4 BGP peers.
        /// </summary>
        [Input("amazonAddress")]
        public Input<string>? AmazonAddress { get; set; }

        /// <summary>
        /// The autonomous system (AS) number for Border Gateway Protocol (BGP) configuration.
        /// </summary>
        [Input("bgpAsn", required: true)]
        public Input<int> BgpAsn { get; set; } = null!;

        /// <summary>
        /// The authentication key for BGP configuration.
        /// </summary>
        [Input("bgpAuthKey")]
        public Input<string>? BgpAuthKey { get; set; }

        /// <summary>
        /// The ID of the Direct Connect connection (or LAG) on which to create the virtual interface.
        /// </summary>
        [Input("connectionId", required: true)]
        public Input<string> ConnectionId { get; set; } = null!;

        /// <summary>
        /// The IPv4 CIDR destination address to which Amazon should send traffic. Required for IPv4 BGP peers.
        /// </summary>
        [Input("customerAddress")]
        public Input<string>? CustomerAddress { get; set; }

        /// <summary>
        /// The ID of the Direct Connect gateway to which to connect the virtual interface.
        /// </summary>
        [Input("dxGatewayId", required: true)]
        public Input<string> DxGatewayId { get; set; } = null!;

        /// <summary>
        /// The maximum transmission unit (MTU) is the size, in bytes, of the largest permissible packet that can be passed over the connection.
        /// The MTU of a virtual transit interface can be either `1500` or `8500` (jumbo frames). Default is `1500`.
        /// </summary>
        [Input("mtu")]
        public Input<int>? Mtu { get; set; }

        /// <summary>
        /// The name for the virtual interface.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Indicates whether to enable or disable SiteLink.
        /// </summary>
        [Input("sitelinkEnabled")]
        public Input<bool>? SitelinkEnabled { get; set; }

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
        /// The VLAN ID.
        /// </summary>
        [Input("vlan", required: true)]
        public Input<int> Vlan { get; set; } = null!;

        public TransitVirtualInterfaceArgs()
        {
        }
        public static new TransitVirtualInterfaceArgs Empty => new TransitVirtualInterfaceArgs();
    }

    public sealed class TransitVirtualInterfaceState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The address family for the BGP peer. `ipv4 ` or `ipv6`.
        /// </summary>
        [Input("addressFamily")]
        public Input<string>? AddressFamily { get; set; }

        /// <summary>
        /// The IPv4 CIDR address to use to send traffic to Amazon. Required for IPv4 BGP peers.
        /// </summary>
        [Input("amazonAddress")]
        public Input<string>? AmazonAddress { get; set; }

        [Input("amazonSideAsn")]
        public Input<string>? AmazonSideAsn { get; set; }

        /// <summary>
        /// The ARN of the virtual interface.
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        /// <summary>
        /// The Direct Connect endpoint on which the virtual interface terminates.
        /// </summary>
        [Input("awsDevice")]
        public Input<string>? AwsDevice { get; set; }

        /// <summary>
        /// The autonomous system (AS) number for Border Gateway Protocol (BGP) configuration.
        /// </summary>
        [Input("bgpAsn")]
        public Input<int>? BgpAsn { get; set; }

        /// <summary>
        /// The authentication key for BGP configuration.
        /// </summary>
        [Input("bgpAuthKey")]
        public Input<string>? BgpAuthKey { get; set; }

        /// <summary>
        /// The ID of the Direct Connect connection (or LAG) on which to create the virtual interface.
        /// </summary>
        [Input("connectionId")]
        public Input<string>? ConnectionId { get; set; }

        /// <summary>
        /// The IPv4 CIDR destination address to which Amazon should send traffic. Required for IPv4 BGP peers.
        /// </summary>
        [Input("customerAddress")]
        public Input<string>? CustomerAddress { get; set; }

        /// <summary>
        /// The ID of the Direct Connect gateway to which to connect the virtual interface.
        /// </summary>
        [Input("dxGatewayId")]
        public Input<string>? DxGatewayId { get; set; }

        /// <summary>
        /// Indicates whether jumbo frames (8500 MTU) are supported.
        /// </summary>
        [Input("jumboFrameCapable")]
        public Input<bool>? JumboFrameCapable { get; set; }

        /// <summary>
        /// The maximum transmission unit (MTU) is the size, in bytes, of the largest permissible packet that can be passed over the connection.
        /// The MTU of a virtual transit interface can be either `1500` or `8500` (jumbo frames). Default is `1500`.
        /// </summary>
        [Input("mtu")]
        public Input<int>? Mtu { get; set; }

        /// <summary>
        /// The name for the virtual interface.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Indicates whether to enable or disable SiteLink.
        /// </summary>
        [Input("sitelinkEnabled")]
        public Input<bool>? SitelinkEnabled { get; set; }

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
        [Obsolete(@"Please use `tags` instead.")]
        public InputMap<string> TagsAll
        {
            get => _tagsAll ?? (_tagsAll = new InputMap<string>());
            set => _tagsAll = value;
        }

        /// <summary>
        /// The VLAN ID.
        /// </summary>
        [Input("vlan")]
        public Input<int>? Vlan { get; set; }

        public TransitVirtualInterfaceState()
        {
        }
        public static new TransitVirtualInterfaceState Empty => new TransitVirtualInterfaceState();
    }
}

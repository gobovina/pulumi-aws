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
    /// Provides a resource to manage the accepter's side of a Direct Connect hosted public virtual interface.
    /// This resource accepts ownership of a public virtual interface created by another AWS account.
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
    ///     var accepter = Aws.GetCallerIdentity.Invoke();
    /// 
    ///     // Creator's side of the VIF
    ///     var creator = new Aws.DirectConnect.HostedPublicVirtualInterface("creator", new()
    ///     {
    ///         ConnectionId = "dxcon-zzzzzzzz",
    ///         OwnerAccountId = accepter.Apply(getCallerIdentityResult =&gt; getCallerIdentityResult.AccountId),
    ///         Name = "vif-foo",
    ///         Vlan = 4094,
    ///         AddressFamily = "ipv4",
    ///         BgpAsn = 65352,
    ///         CustomerAddress = "175.45.176.1/30",
    ///         AmazonAddress = "175.45.176.2/30",
    ///         RouteFilterPrefixes = new[]
    ///         {
    ///             "210.52.109.0/24",
    ///             "175.45.176.0/22",
    ///         },
    ///     });
    /// 
    ///     // Accepter's side of the VIF.
    ///     var accepterHostedPublicVirtualInterfaceAccepter = new Aws.DirectConnect.HostedPublicVirtualInterfaceAccepter("accepter", new()
    ///     {
    ///         VirtualInterfaceId = creator.Id,
    ///         Tags = 
    ///         {
    ///             { "Side", "Accepter" },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import Direct Connect hosted public virtual interfaces using the VIF `id`. For example:
    /// 
    /// ```sh
    /// $ pulumi import aws:directconnect/hostedPublicVirtualInterfaceAccepter:HostedPublicVirtualInterfaceAccepter test dxvif-33cc44dd
    /// ```
    /// </summary>
    [AwsResourceType("aws:directconnect/hostedPublicVirtualInterfaceAccepter:HostedPublicVirtualInterfaceAccepter")]
    public partial class HostedPublicVirtualInterfaceAccepter : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The ARN of the virtual interface.
        /// </summary>
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

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
        /// Create a HostedPublicVirtualInterfaceAccepter resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public HostedPublicVirtualInterfaceAccepter(string name, HostedPublicVirtualInterfaceAccepterArgs args, CustomResourceOptions? options = null)
            : base("aws:directconnect/hostedPublicVirtualInterfaceAccepter:HostedPublicVirtualInterfaceAccepter", name, args ?? new HostedPublicVirtualInterfaceAccepterArgs(), MakeResourceOptions(options, ""))
        {
        }

        private HostedPublicVirtualInterfaceAccepter(string name, Input<string> id, HostedPublicVirtualInterfaceAccepterState? state = null, CustomResourceOptions? options = null)
            : base("aws:directconnect/hostedPublicVirtualInterfaceAccepter:HostedPublicVirtualInterfaceAccepter", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing HostedPublicVirtualInterfaceAccepter resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static HostedPublicVirtualInterfaceAccepter Get(string name, Input<string> id, HostedPublicVirtualInterfaceAccepterState? state = null, CustomResourceOptions? options = null)
        {
            return new HostedPublicVirtualInterfaceAccepter(name, id, state, options);
        }
    }

    public sealed class HostedPublicVirtualInterfaceAccepterArgs : global::Pulumi.ResourceArgs
    {
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

        public HostedPublicVirtualInterfaceAccepterArgs()
        {
        }
        public static new HostedPublicVirtualInterfaceAccepterArgs Empty => new HostedPublicVirtualInterfaceAccepterArgs();
    }

    public sealed class HostedPublicVirtualInterfaceAccepterState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ARN of the virtual interface.
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

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
        /// The ID of the Direct Connect virtual interface to accept.
        /// </summary>
        [Input("virtualInterfaceId")]
        public Input<string>? VirtualInterfaceId { get; set; }

        public HostedPublicVirtualInterfaceAccepterState()
        {
        }
        public static new HostedPublicVirtualInterfaceAccepterState Empty => new HostedPublicVirtualInterfaceAccepterState();
    }
}

// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Ec2
{
    public static class GetLocalGatewayVirtualInterface
    {
        /// <summary>
        /// Provides details about an EC2 Local Gateway Virtual Interface. More information can be found in the [Outposts User Guide](https://docs.aws.amazon.com/outposts/latest/userguide/outposts-networking-components.html#routing).
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Aws = Pulumi.Aws;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = .ToDictionary(item =&gt; {
        ///         var __key = item.Key;
        ///         return __key;
        ///     }, item =&gt; {
        ///         var __value = item.Value;
        ///         return Aws.Ec2.GetLocalGatewayVirtualInterface.Invoke(new()
        ///         {
        ///             Id = __value,
        ///         });
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetLocalGatewayVirtualInterfaceResult> InvokeAsync(GetLocalGatewayVirtualInterfaceArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetLocalGatewayVirtualInterfaceResult>("aws:ec2/getLocalGatewayVirtualInterface:getLocalGatewayVirtualInterface", args ?? new GetLocalGatewayVirtualInterfaceArgs(), options.WithDefaults());

        /// <summary>
        /// Provides details about an EC2 Local Gateway Virtual Interface. More information can be found in the [Outposts User Guide](https://docs.aws.amazon.com/outposts/latest/userguide/outposts-networking-components.html#routing).
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Aws = Pulumi.Aws;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = .ToDictionary(item =&gt; {
        ///         var __key = item.Key;
        ///         return __key;
        ///     }, item =&gt; {
        ///         var __value = item.Value;
        ///         return Aws.Ec2.GetLocalGatewayVirtualInterface.Invoke(new()
        ///         {
        ///             Id = __value,
        ///         });
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetLocalGatewayVirtualInterfaceResult> Invoke(GetLocalGatewayVirtualInterfaceInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetLocalGatewayVirtualInterfaceResult>("aws:ec2/getLocalGatewayVirtualInterface:getLocalGatewayVirtualInterface", args ?? new GetLocalGatewayVirtualInterfaceInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetLocalGatewayVirtualInterfaceArgs : global::Pulumi.InvokeArgs
    {
        [Input("filters")]
        private List<Inputs.GetLocalGatewayVirtualInterfaceFilterArgs>? _filters;

        /// <summary>
        /// One or more configuration blocks containing name-values filters. See the [EC2 API Reference](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeLocalGatewayVirtualInterfaces.html) for supported filters. Detailed below.
        /// </summary>
        public List<Inputs.GetLocalGatewayVirtualInterfaceFilterArgs> Filters
        {
            get => _filters ?? (_filters = new List<Inputs.GetLocalGatewayVirtualInterfaceFilterArgs>());
            set => _filters = value;
        }

        /// <summary>
        /// Identifier of EC2 Local Gateway Virtual Interface.
        /// </summary>
        [Input("id")]
        public string? Id { get; set; }

        [Input("tags")]
        private Dictionary<string, string>? _tags;

        /// <summary>
        /// Key-value map of resource tags, each pair of which must exactly match a pair on the desired local gateway route table.
        /// </summary>
        public Dictionary<string, string> Tags
        {
            get => _tags ?? (_tags = new Dictionary<string, string>());
            set => _tags = value;
        }

        public GetLocalGatewayVirtualInterfaceArgs()
        {
        }
        public static new GetLocalGatewayVirtualInterfaceArgs Empty => new GetLocalGatewayVirtualInterfaceArgs();
    }

    public sealed class GetLocalGatewayVirtualInterfaceInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("filters")]
        private InputList<Inputs.GetLocalGatewayVirtualInterfaceFilterInputArgs>? _filters;

        /// <summary>
        /// One or more configuration blocks containing name-values filters. See the [EC2 API Reference](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeLocalGatewayVirtualInterfaces.html) for supported filters. Detailed below.
        /// </summary>
        public InputList<Inputs.GetLocalGatewayVirtualInterfaceFilterInputArgs> Filters
        {
            get => _filters ?? (_filters = new InputList<Inputs.GetLocalGatewayVirtualInterfaceFilterInputArgs>());
            set => _filters = value;
        }

        /// <summary>
        /// Identifier of EC2 Local Gateway Virtual Interface.
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Key-value map of resource tags, each pair of which must exactly match a pair on the desired local gateway route table.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public GetLocalGatewayVirtualInterfaceInvokeArgs()
        {
        }
        public static new GetLocalGatewayVirtualInterfaceInvokeArgs Empty => new GetLocalGatewayVirtualInterfaceInvokeArgs();
    }


    [OutputType]
    public sealed class GetLocalGatewayVirtualInterfaceResult
    {
        public readonly ImmutableArray<Outputs.GetLocalGatewayVirtualInterfaceFilterResult> Filters;
        public readonly string Id;
        /// <summary>
        /// Local address.
        /// </summary>
        public readonly string LocalAddress;
        /// <summary>
        /// Border Gateway Protocol (BGP) Autonomous System Number (ASN) of the EC2 Local Gateway.
        /// </summary>
        public readonly int LocalBgpAsn;
        /// <summary>
        /// Identifier of the EC2 Local Gateway.
        /// </summary>
        public readonly string LocalGatewayId;
        public readonly ImmutableArray<string> LocalGatewayVirtualInterfaceIds;
        /// <summary>
        /// Peer address.
        /// </summary>
        public readonly string PeerAddress;
        /// <summary>
        /// Border Gateway Protocol (BGP) Autonomous System Number (ASN) of the peer.
        /// </summary>
        public readonly int PeerBgpAsn;
        public readonly ImmutableDictionary<string, string> Tags;
        /// <summary>
        /// Virtual Local Area Network.
        /// </summary>
        public readonly int Vlan;

        [OutputConstructor]
        private GetLocalGatewayVirtualInterfaceResult(
            ImmutableArray<Outputs.GetLocalGatewayVirtualInterfaceFilterResult> filters,

            string id,

            string localAddress,

            int localBgpAsn,

            string localGatewayId,

            ImmutableArray<string> localGatewayVirtualInterfaceIds,

            string peerAddress,

            int peerBgpAsn,

            ImmutableDictionary<string, string> tags,

            int vlan)
        {
            Filters = filters;
            Id = id;
            LocalAddress = localAddress;
            LocalBgpAsn = localBgpAsn;
            LocalGatewayId = localGatewayId;
            LocalGatewayVirtualInterfaceIds = localGatewayVirtualInterfaceIds;
            PeerAddress = peerAddress;
            PeerBgpAsn = peerBgpAsn;
            Tags = tags;
            Vlan = vlan;
        }
    }
}

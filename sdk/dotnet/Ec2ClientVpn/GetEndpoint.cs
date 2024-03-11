// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Ec2ClientVpn
{
    public static class GetEndpoint
    {
        /// <summary>
        /// Get information on an EC2 Client VPN endpoint.
        /// 
        /// ## Example Usage
        /// 
        /// ### By Filter
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
        ///     var example = Aws.Ec2ClientVpn.GetEndpoint.Invoke(new()
        ///     {
        ///         Filters = new[]
        ///         {
        ///             new Aws.Ec2ClientVpn.Inputs.GetEndpointFilterInputArgs
        ///             {
        ///                 Name = "tag:Name",
        ///                 Values = new[]
        ///                 {
        ///                     "ExampleVpn",
        ///                 },
        ///             },
        ///         },
        ///     });
        /// 
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// 
        /// ### By Identifier
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
        ///     var example = Aws.Ec2ClientVpn.GetEndpoint.Invoke(new()
        ///     {
        ///         ClientVpnEndpointId = "cvpn-endpoint-083cf50d6eb314f21",
        ///     });
        /// 
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        public static Task<GetEndpointResult> InvokeAsync(GetEndpointArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetEndpointResult>("aws:ec2clientvpn/getEndpoint:getEndpoint", args ?? new GetEndpointArgs(), options.WithDefaults());

        /// <summary>
        /// Get information on an EC2 Client VPN endpoint.
        /// 
        /// ## Example Usage
        /// 
        /// ### By Filter
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
        ///     var example = Aws.Ec2ClientVpn.GetEndpoint.Invoke(new()
        ///     {
        ///         Filters = new[]
        ///         {
        ///             new Aws.Ec2ClientVpn.Inputs.GetEndpointFilterInputArgs
        ///             {
        ///                 Name = "tag:Name",
        ///                 Values = new[]
        ///                 {
        ///                     "ExampleVpn",
        ///                 },
        ///             },
        ///         },
        ///     });
        /// 
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// 
        /// ### By Identifier
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
        ///     var example = Aws.Ec2ClientVpn.GetEndpoint.Invoke(new()
        ///     {
        ///         ClientVpnEndpointId = "cvpn-endpoint-083cf50d6eb314f21",
        ///     });
        /// 
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        public static Output<GetEndpointResult> Invoke(GetEndpointInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetEndpointResult>("aws:ec2clientvpn/getEndpoint:getEndpoint", args ?? new GetEndpointInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetEndpointArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// ID of the Client VPN endpoint.
        /// </summary>
        [Input("clientVpnEndpointId")]
        public string? ClientVpnEndpointId { get; set; }

        [Input("filters")]
        private List<Inputs.GetEndpointFilterArgs>? _filters;

        /// <summary>
        /// One or more configuration blocks containing name-values filters. Detailed below.
        /// </summary>
        public List<Inputs.GetEndpointFilterArgs> Filters
        {
            get => _filters ?? (_filters = new List<Inputs.GetEndpointFilterArgs>());
            set => _filters = value;
        }

        [Input("tags")]
        private Dictionary<string, string>? _tags;

        /// <summary>
        /// Map of tags, each pair of which must exactly match a pair on the desired endpoint.
        /// </summary>
        public Dictionary<string, string> Tags
        {
            get => _tags ?? (_tags = new Dictionary<string, string>());
            set => _tags = value;
        }

        public GetEndpointArgs()
        {
        }
        public static new GetEndpointArgs Empty => new GetEndpointArgs();
    }

    public sealed class GetEndpointInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// ID of the Client VPN endpoint.
        /// </summary>
        [Input("clientVpnEndpointId")]
        public Input<string>? ClientVpnEndpointId { get; set; }

        [Input("filters")]
        private InputList<Inputs.GetEndpointFilterInputArgs>? _filters;

        /// <summary>
        /// One or more configuration blocks containing name-values filters. Detailed below.
        /// </summary>
        public InputList<Inputs.GetEndpointFilterInputArgs> Filters
        {
            get => _filters ?? (_filters = new InputList<Inputs.GetEndpointFilterInputArgs>());
            set => _filters = value;
        }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Map of tags, each pair of which must exactly match a pair on the desired endpoint.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public GetEndpointInvokeArgs()
        {
        }
        public static new GetEndpointInvokeArgs Empty => new GetEndpointInvokeArgs();
    }


    [OutputType]
    public sealed class GetEndpointResult
    {
        /// <summary>
        /// The ARN of the Client VPN endpoint.
        /// </summary>
        public readonly string Arn;
        /// <summary>
        /// Information about the authentication method used by the Client VPN endpoint.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetEndpointAuthenticationOptionResult> AuthenticationOptions;
        /// <summary>
        /// IPv4 address range, in CIDR notation, from which client IP addresses are assigned.
        /// </summary>
        public readonly string ClientCidrBlock;
        /// <summary>
        /// The options for managing connection authorization for new client connections.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetEndpointClientConnectOptionResult> ClientConnectOptions;
        /// <summary>
        /// Options for enabling a customizable text banner that will be displayed on AWS provided clients when a VPN session is established.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetEndpointClientLoginBannerOptionResult> ClientLoginBannerOptions;
        public readonly string ClientVpnEndpointId;
        /// <summary>
        /// Information about the client connection logging options for the Client VPN endpoint.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetEndpointConnectionLogOptionResult> ConnectionLogOptions;
        /// <summary>
        /// Brief description of the endpoint.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// DNS name to be used by clients when connecting to the Client VPN endpoint.
        /// </summary>
        public readonly string DnsName;
        /// <summary>
        /// Information about the DNS servers to be used for DNS resolution.
        /// </summary>
        public readonly ImmutableArray<string> DnsServers;
        public readonly ImmutableArray<Outputs.GetEndpointFilterResult> Filters;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// IDs of the security groups for the target network associated with the Client VPN endpoint.
        /// </summary>
        public readonly ImmutableArray<string> SecurityGroupIds;
        /// <summary>
        /// Whether the self-service portal for the Client VPN endpoint is enabled.
        /// </summary>
        public readonly string SelfServicePortal;
        /// <summary>
        /// The URL of the self-service portal.
        /// </summary>
        public readonly string SelfServicePortalUrl;
        /// <summary>
        /// The ARN of the server certificate.
        /// </summary>
        public readonly string ServerCertificateArn;
        /// <summary>
        /// The maximum VPN session duration time in hours.
        /// </summary>
        public readonly int SessionTimeoutHours;
        /// <summary>
        /// Whether split-tunnel is enabled in the AWS Client VPN endpoint.
        /// </summary>
        public readonly bool SplitTunnel;
        public readonly ImmutableDictionary<string, string> Tags;
        /// <summary>
        /// Transport protocol used by the Client VPN endpoint.
        /// </summary>
        public readonly string TransportProtocol;
        /// <summary>
        /// ID of the VPC associated with the Client VPN endpoint.
        /// </summary>
        public readonly string VpcId;
        /// <summary>
        /// Port number for the Client VPN endpoint.
        /// </summary>
        public readonly int VpnPort;

        [OutputConstructor]
        private GetEndpointResult(
            string arn,

            ImmutableArray<Outputs.GetEndpointAuthenticationOptionResult> authenticationOptions,

            string clientCidrBlock,

            ImmutableArray<Outputs.GetEndpointClientConnectOptionResult> clientConnectOptions,

            ImmutableArray<Outputs.GetEndpointClientLoginBannerOptionResult> clientLoginBannerOptions,

            string clientVpnEndpointId,

            ImmutableArray<Outputs.GetEndpointConnectionLogOptionResult> connectionLogOptions,

            string description,

            string dnsName,

            ImmutableArray<string> dnsServers,

            ImmutableArray<Outputs.GetEndpointFilterResult> filters,

            string id,

            ImmutableArray<string> securityGroupIds,

            string selfServicePortal,

            string selfServicePortalUrl,

            string serverCertificateArn,

            int sessionTimeoutHours,

            bool splitTunnel,

            ImmutableDictionary<string, string> tags,

            string transportProtocol,

            string vpcId,

            int vpnPort)
        {
            Arn = arn;
            AuthenticationOptions = authenticationOptions;
            ClientCidrBlock = clientCidrBlock;
            ClientConnectOptions = clientConnectOptions;
            ClientLoginBannerOptions = clientLoginBannerOptions;
            ClientVpnEndpointId = clientVpnEndpointId;
            ConnectionLogOptions = connectionLogOptions;
            Description = description;
            DnsName = dnsName;
            DnsServers = dnsServers;
            Filters = filters;
            Id = id;
            SecurityGroupIds = securityGroupIds;
            SelfServicePortal = selfServicePortal;
            SelfServicePortalUrl = selfServicePortalUrl;
            ServerCertificateArn = serverCertificateArn;
            SessionTimeoutHours = sessionTimeoutHours;
            SplitTunnel = splitTunnel;
            Tags = tags;
            TransportProtocol = transportProtocol;
            VpcId = vpcId;
            VpnPort = vpnPort;
        }
    }
}

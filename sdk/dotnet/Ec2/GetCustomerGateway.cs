// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Ec2
{
    public static class GetCustomerGateway
    {
        /// <summary>
        /// Get an existing AWS Customer Gateway.
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
        ///     var foo = Aws.Ec2.GetCustomerGateway.Invoke(new()
        ///     {
        ///         Filters = new[]
        ///         {
        ///             new Aws.Ec2.Inputs.GetCustomerGatewayFilterInputArgs
        ///             {
        ///                 Name = "tag:Name",
        ///                 Values = new[]
        ///                 {
        ///                     "foo-prod",
        ///                 },
        ///             },
        ///         },
        ///     });
        /// 
        ///     var main = new Aws.Ec2.VpnGateway("main", new()
        ///     {
        ///         VpcId = mainAwsVpc.Id,
        ///         AmazonSideAsn = "7224",
        ///     });
        /// 
        ///     var transit = new Aws.Ec2.VpnConnection("transit", new()
        ///     {
        ///         VpnGatewayId = main.Id,
        ///         CustomerGatewayId = foo.Apply(getCustomerGatewayResult =&gt; getCustomerGatewayResult.Id),
        ///         Type = foo.Apply(getCustomerGatewayResult =&gt; getCustomerGatewayResult.Type),
        ///         StaticRoutesOnly = false,
        ///     });
        /// 
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        public static Task<GetCustomerGatewayResult> InvokeAsync(GetCustomerGatewayArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetCustomerGatewayResult>("aws:ec2/getCustomerGateway:getCustomerGateway", args ?? new GetCustomerGatewayArgs(), options.WithDefaults());

        /// <summary>
        /// Get an existing AWS Customer Gateway.
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
        ///     var foo = Aws.Ec2.GetCustomerGateway.Invoke(new()
        ///     {
        ///         Filters = new[]
        ///         {
        ///             new Aws.Ec2.Inputs.GetCustomerGatewayFilterInputArgs
        ///             {
        ///                 Name = "tag:Name",
        ///                 Values = new[]
        ///                 {
        ///                     "foo-prod",
        ///                 },
        ///             },
        ///         },
        ///     });
        /// 
        ///     var main = new Aws.Ec2.VpnGateway("main", new()
        ///     {
        ///         VpcId = mainAwsVpc.Id,
        ///         AmazonSideAsn = "7224",
        ///     });
        /// 
        ///     var transit = new Aws.Ec2.VpnConnection("transit", new()
        ///     {
        ///         VpnGatewayId = main.Id,
        ///         CustomerGatewayId = foo.Apply(getCustomerGatewayResult =&gt; getCustomerGatewayResult.Id),
        ///         Type = foo.Apply(getCustomerGatewayResult =&gt; getCustomerGatewayResult.Type),
        ///         StaticRoutesOnly = false,
        ///     });
        /// 
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        public static Output<GetCustomerGatewayResult> Invoke(GetCustomerGatewayInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetCustomerGatewayResult>("aws:ec2/getCustomerGateway:getCustomerGateway", args ?? new GetCustomerGatewayInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetCustomerGatewayArgs : global::Pulumi.InvokeArgs
    {
        [Input("filters")]
        private List<Inputs.GetCustomerGatewayFilterArgs>? _filters;

        /// <summary>
        /// One or more [name-value pairs][dcg-filters] to filter by.
        /// 
        /// [dcg-filters]: https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeCustomerGateways.html
        /// </summary>
        public List<Inputs.GetCustomerGatewayFilterArgs> Filters
        {
            get => _filters ?? (_filters = new List<Inputs.GetCustomerGatewayFilterArgs>());
            set => _filters = value;
        }

        /// <summary>
        /// ID of the gateway.
        /// </summary>
        [Input("id")]
        public string? Id { get; set; }

        [Input("tags")]
        private Dictionary<string, string>? _tags;

        /// <summary>
        /// Map of key-value pairs assigned to the gateway.
        /// </summary>
        public Dictionary<string, string> Tags
        {
            get => _tags ?? (_tags = new Dictionary<string, string>());
            set => _tags = value;
        }

        public GetCustomerGatewayArgs()
        {
        }
        public static new GetCustomerGatewayArgs Empty => new GetCustomerGatewayArgs();
    }

    public sealed class GetCustomerGatewayInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("filters")]
        private InputList<Inputs.GetCustomerGatewayFilterInputArgs>? _filters;

        /// <summary>
        /// One or more [name-value pairs][dcg-filters] to filter by.
        /// 
        /// [dcg-filters]: https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeCustomerGateways.html
        /// </summary>
        public InputList<Inputs.GetCustomerGatewayFilterInputArgs> Filters
        {
            get => _filters ?? (_filters = new InputList<Inputs.GetCustomerGatewayFilterInputArgs>());
            set => _filters = value;
        }

        /// <summary>
        /// ID of the gateway.
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Map of key-value pairs assigned to the gateway.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public GetCustomerGatewayInvokeArgs()
        {
        }
        public static new GetCustomerGatewayInvokeArgs Empty => new GetCustomerGatewayInvokeArgs();
    }


    [OutputType]
    public sealed class GetCustomerGatewayResult
    {
        /// <summary>
        /// ARN of the customer gateway.
        /// </summary>
        public readonly string Arn;
        /// <summary>
        /// Gateway's Border Gateway Protocol (BGP) Autonomous System Number (ASN).
        /// </summary>
        public readonly int BgpAsn;
        /// <summary>
        /// ARN for the customer gateway certificate.
        /// </summary>
        public readonly string CertificateArn;
        /// <summary>
        /// Name for the customer gateway device.
        /// </summary>
        public readonly string DeviceName;
        public readonly ImmutableArray<Outputs.GetCustomerGatewayFilterResult> Filters;
        public readonly string Id;
        /// <summary>
        /// IP address of the gateway's Internet-routable external interface.
        /// </summary>
        public readonly string IpAddress;
        /// <summary>
        /// Map of key-value pairs assigned to the gateway.
        /// </summary>
        public readonly ImmutableDictionary<string, string> Tags;
        /// <summary>
        /// Type of customer gateway. The only type AWS supports at this time is "ipsec.1".
        /// </summary>
        public readonly string Type;

        [OutputConstructor]
        private GetCustomerGatewayResult(
            string arn,

            int bgpAsn,

            string certificateArn,

            string deviceName,

            ImmutableArray<Outputs.GetCustomerGatewayFilterResult> filters,

            string id,

            string ipAddress,

            ImmutableDictionary<string, string> tags,

            string type)
        {
            Arn = arn;
            BgpAsn = bgpAsn;
            CertificateArn = certificateArn;
            DeviceName = deviceName;
            Filters = filters;
            Id = id;
            IpAddress = ipAddress;
            Tags = tags;
            Type = type;
        }
    }
}

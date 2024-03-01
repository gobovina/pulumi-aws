// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Ec2
{
    public static class GetNetworkInsightsPath
    {
        /// <summary>
        /// `aws.ec2.NetworkInsightsPath` provides details about a specific Network Insights Path.
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
        ///     var example = Aws.Ec2.GetNetworkInsightsPath.Invoke(new()
        ///     {
        ///         NetworkInsightsPathId = exampleAwsEc2NetworkInsightsPath.Id,
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetNetworkInsightsPathResult> InvokeAsync(GetNetworkInsightsPathArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetNetworkInsightsPathResult>("aws:ec2/getNetworkInsightsPath:getNetworkInsightsPath", args ?? new GetNetworkInsightsPathArgs(), options.WithDefaults());

        /// <summary>
        /// `aws.ec2.NetworkInsightsPath` provides details about a specific Network Insights Path.
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
        ///     var example = Aws.Ec2.GetNetworkInsightsPath.Invoke(new()
        ///     {
        ///         NetworkInsightsPathId = exampleAwsEc2NetworkInsightsPath.Id,
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetNetworkInsightsPathResult> Invoke(GetNetworkInsightsPathInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetNetworkInsightsPathResult>("aws:ec2/getNetworkInsightsPath:getNetworkInsightsPath", args ?? new GetNetworkInsightsPathInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetNetworkInsightsPathArgs : global::Pulumi.InvokeArgs
    {
        [Input("filters")]
        private List<Inputs.GetNetworkInsightsPathFilterArgs>? _filters;

        /// <summary>
        /// Configuration block(s) for filtering. Detailed below.
        /// </summary>
        public List<Inputs.GetNetworkInsightsPathFilterArgs> Filters
        {
            get => _filters ?? (_filters = new List<Inputs.GetNetworkInsightsPathFilterArgs>());
            set => _filters = value;
        }

        /// <summary>
        /// ID of the Network Insights Path to select.
        /// </summary>
        [Input("networkInsightsPathId")]
        public string? NetworkInsightsPathId { get; set; }

        [Input("tags")]
        private Dictionary<string, string>? _tags;

        /// <summary>
        /// Map of tags assigned to the resource.
        /// </summary>
        public Dictionary<string, string> Tags
        {
            get => _tags ?? (_tags = new Dictionary<string, string>());
            set => _tags = value;
        }

        public GetNetworkInsightsPathArgs()
        {
        }
        public static new GetNetworkInsightsPathArgs Empty => new GetNetworkInsightsPathArgs();
    }

    public sealed class GetNetworkInsightsPathInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("filters")]
        private InputList<Inputs.GetNetworkInsightsPathFilterInputArgs>? _filters;

        /// <summary>
        /// Configuration block(s) for filtering. Detailed below.
        /// </summary>
        public InputList<Inputs.GetNetworkInsightsPathFilterInputArgs> Filters
        {
            get => _filters ?? (_filters = new InputList<Inputs.GetNetworkInsightsPathFilterInputArgs>());
            set => _filters = value;
        }

        /// <summary>
        /// ID of the Network Insights Path to select.
        /// </summary>
        [Input("networkInsightsPathId")]
        public Input<string>? NetworkInsightsPathId { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Map of tags assigned to the resource.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public GetNetworkInsightsPathInvokeArgs()
        {
        }
        public static new GetNetworkInsightsPathInvokeArgs Empty => new GetNetworkInsightsPathInvokeArgs();
    }


    [OutputType]
    public sealed class GetNetworkInsightsPathResult
    {
        /// <summary>
        /// ARN of the selected Network Insights Path.
        /// </summary>
        public readonly string Arn;
        /// <summary>
        /// AWS resource that is the destination of the path.
        /// </summary>
        public readonly string Destination;
        /// <summary>
        /// ARN of the destination.
        /// </summary>
        public readonly string DestinationArn;
        /// <summary>
        /// IP address of the AWS resource that is the destination of the path.
        /// </summary>
        public readonly string DestinationIp;
        /// <summary>
        /// Destination port.
        /// </summary>
        public readonly int DestinationPort;
        public readonly ImmutableArray<Outputs.GetNetworkInsightsPathFilterResult> Filters;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string NetworkInsightsPathId;
        /// <summary>
        /// Protocol.
        /// </summary>
        public readonly string Protocol;
        /// <summary>
        /// AWS resource that is the source of the path.
        /// </summary>
        public readonly string Source;
        /// <summary>
        /// ARN of the source.
        /// </summary>
        public readonly string SourceArn;
        /// <summary>
        /// IP address of the AWS resource that is the source of the path.
        /// </summary>
        public readonly string SourceIp;
        /// <summary>
        /// Map of tags assigned to the resource.
        /// </summary>
        public readonly ImmutableDictionary<string, string> Tags;

        [OutputConstructor]
        private GetNetworkInsightsPathResult(
            string arn,

            string destination,

            string destinationArn,

            string destinationIp,

            int destinationPort,

            ImmutableArray<Outputs.GetNetworkInsightsPathFilterResult> filters,

            string id,

            string networkInsightsPathId,

            string protocol,

            string source,

            string sourceArn,

            string sourceIp,

            ImmutableDictionary<string, string> tags)
        {
            Arn = arn;
            Destination = destination;
            DestinationArn = destinationArn;
            DestinationIp = destinationIp;
            DestinationPort = destinationPort;
            Filters = filters;
            Id = id;
            NetworkInsightsPathId = networkInsightsPathId;
            Protocol = protocol;
            Source = source;
            SourceArn = sourceArn;
            SourceIp = sourceIp;
            Tags = tags;
        }
    }
}

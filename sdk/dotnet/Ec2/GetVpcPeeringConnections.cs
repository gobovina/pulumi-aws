// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Ec2
{
    public static class GetVpcPeeringConnections
    {
        /// <summary>
        /// Use this data source to get IDs of Amazon VPC peering connections
        /// To get more details on each connection, use the data resource aws.ec2.VpcPeeringConnection
        /// 
        /// Note: To use this data source in a count, the resources should exist before trying to access
        /// the data source.
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
        ///     // Declare the data source
        ///     var pcs = Aws.Ec2.GetVpcPeeringConnections.Invoke(new()
        ///     {
        ///         Filters = new[]
        ///         {
        ///             new Aws.Ec2.Inputs.GetVpcPeeringConnectionsFilterInputArgs
        ///             {
        ///                 Name = "requester-vpc-info.vpc-id",
        ///                 Values = new[]
        ///                 {
        ///                     foo.Id,
        ///                 },
        ///             },
        ///         },
        ///     });
        /// 
        ///     // get the details of each resource
        ///     var pc = ;
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetVpcPeeringConnectionsResult> InvokeAsync(GetVpcPeeringConnectionsArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetVpcPeeringConnectionsResult>("aws:ec2/getVpcPeeringConnections:getVpcPeeringConnections", args ?? new GetVpcPeeringConnectionsArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to get IDs of Amazon VPC peering connections
        /// To get more details on each connection, use the data resource aws.ec2.VpcPeeringConnection
        /// 
        /// Note: To use this data source in a count, the resources should exist before trying to access
        /// the data source.
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
        ///     // Declare the data source
        ///     var pcs = Aws.Ec2.GetVpcPeeringConnections.Invoke(new()
        ///     {
        ///         Filters = new[]
        ///         {
        ///             new Aws.Ec2.Inputs.GetVpcPeeringConnectionsFilterInputArgs
        ///             {
        ///                 Name = "requester-vpc-info.vpc-id",
        ///                 Values = new[]
        ///                 {
        ///                     foo.Id,
        ///                 },
        ///             },
        ///         },
        ///     });
        /// 
        ///     // get the details of each resource
        ///     var pc = ;
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetVpcPeeringConnectionsResult> Invoke(GetVpcPeeringConnectionsInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetVpcPeeringConnectionsResult>("aws:ec2/getVpcPeeringConnections:getVpcPeeringConnections", args ?? new GetVpcPeeringConnectionsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetVpcPeeringConnectionsArgs : global::Pulumi.InvokeArgs
    {
        [Input("filters")]
        private List<Inputs.GetVpcPeeringConnectionsFilterArgs>? _filters;

        /// <summary>
        /// Custom filter block as described below.
        /// </summary>
        public List<Inputs.GetVpcPeeringConnectionsFilterArgs> Filters
        {
            get => _filters ?? (_filters = new List<Inputs.GetVpcPeeringConnectionsFilterArgs>());
            set => _filters = value;
        }

        [Input("tags")]
        private Dictionary<string, string>? _tags;

        /// <summary>
        /// Mapping of tags, each pair of which must exactly match
        /// a pair on the desired VPC Peering Connection.
        /// 
        /// More complex filters can be expressed using one or more `filter` sub-blocks,
        /// which take the following arguments:
        /// </summary>
        public Dictionary<string, string> Tags
        {
            get => _tags ?? (_tags = new Dictionary<string, string>());
            set => _tags = value;
        }

        public GetVpcPeeringConnectionsArgs()
        {
        }
        public static new GetVpcPeeringConnectionsArgs Empty => new GetVpcPeeringConnectionsArgs();
    }

    public sealed class GetVpcPeeringConnectionsInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("filters")]
        private InputList<Inputs.GetVpcPeeringConnectionsFilterInputArgs>? _filters;

        /// <summary>
        /// Custom filter block as described below.
        /// </summary>
        public InputList<Inputs.GetVpcPeeringConnectionsFilterInputArgs> Filters
        {
            get => _filters ?? (_filters = new InputList<Inputs.GetVpcPeeringConnectionsFilterInputArgs>());
            set => _filters = value;
        }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Mapping of tags, each pair of which must exactly match
        /// a pair on the desired VPC Peering Connection.
        /// 
        /// More complex filters can be expressed using one or more `filter` sub-blocks,
        /// which take the following arguments:
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public GetVpcPeeringConnectionsInvokeArgs()
        {
        }
        public static new GetVpcPeeringConnectionsInvokeArgs Empty => new GetVpcPeeringConnectionsInvokeArgs();
    }


    [OutputType]
    public sealed class GetVpcPeeringConnectionsResult
    {
        public readonly ImmutableArray<Outputs.GetVpcPeeringConnectionsFilterResult> Filters;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// IDs of the VPC Peering Connections.
        /// </summary>
        public readonly ImmutableArray<string> Ids;
        public readonly ImmutableDictionary<string, string> Tags;

        [OutputConstructor]
        private GetVpcPeeringConnectionsResult(
            ImmutableArray<Outputs.GetVpcPeeringConnectionsFilterResult> filters,

            string id,

            ImmutableArray<string> ids,

            ImmutableDictionary<string, string> tags)
        {
            Filters = filters;
            Id = id;
            Ids = ids;
            Tags = tags;
        }
    }
}

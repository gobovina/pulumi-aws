// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Ec2
{
    public static class GetPublicIpv4Pools
    {
        /// <summary>
        /// Data source for getting information about AWS EC2 Public IPv4 Pools.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
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
        ///     // Returns all public IPv4 pools.
        ///     var example = Aws.Ec2.GetPublicIpv4Pools.Invoke();
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% example %}}
        /// ### Usage with Filter
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Aws = Pulumi.Aws;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Aws.Ec2.GetPublicIpv4Pools.Invoke(new()
        ///     {
        ///         Filters = new[]
        ///         {
        ///             new Aws.Ec2.Inputs.GetPublicIpv4PoolsFilterInputArgs
        ///             {
        ///                 Name = "tag-key",
        ///                 Values = new[]
        ///                 {
        ///                     "ExampleTagKey",
        ///                 },
        ///             },
        ///         },
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetPublicIpv4PoolsResult> InvokeAsync(GetPublicIpv4PoolsArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetPublicIpv4PoolsResult>("aws:ec2/getPublicIpv4Pools:getPublicIpv4Pools", args ?? new GetPublicIpv4PoolsArgs(), options.WithDefaults());

        /// <summary>
        /// Data source for getting information about AWS EC2 Public IPv4 Pools.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
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
        ///     // Returns all public IPv4 pools.
        ///     var example = Aws.Ec2.GetPublicIpv4Pools.Invoke();
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% example %}}
        /// ### Usage with Filter
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Aws = Pulumi.Aws;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Aws.Ec2.GetPublicIpv4Pools.Invoke(new()
        ///     {
        ///         Filters = new[]
        ///         {
        ///             new Aws.Ec2.Inputs.GetPublicIpv4PoolsFilterInputArgs
        ///             {
        ///                 Name = "tag-key",
        ///                 Values = new[]
        ///                 {
        ///                     "ExampleTagKey",
        ///                 },
        ///             },
        ///         },
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetPublicIpv4PoolsResult> Invoke(GetPublicIpv4PoolsInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetPublicIpv4PoolsResult>("aws:ec2/getPublicIpv4Pools:getPublicIpv4Pools", args ?? new GetPublicIpv4PoolsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetPublicIpv4PoolsArgs : global::Pulumi.InvokeArgs
    {
        [Input("filters")]
        private List<Inputs.GetPublicIpv4PoolsFilterArgs>? _filters;

        /// <summary>
        /// Custom filter block as described below.
        /// </summary>
        public List<Inputs.GetPublicIpv4PoolsFilterArgs> Filters
        {
            get => _filters ?? (_filters = new List<Inputs.GetPublicIpv4PoolsFilterArgs>());
            set => _filters = value;
        }

        [Input("tags")]
        private Dictionary<string, string>? _tags;

        /// <summary>
        /// Map of tags, each pair of which must exactly match a pair on the desired pools.
        /// 
        /// More complex filters can be expressed using one or more `filter` sub-blocks,
        /// which take the following arguments:
        /// </summary>
        public Dictionary<string, string> Tags
        {
            get => _tags ?? (_tags = new Dictionary<string, string>());
            set => _tags = value;
        }

        public GetPublicIpv4PoolsArgs()
        {
        }
        public static new GetPublicIpv4PoolsArgs Empty => new GetPublicIpv4PoolsArgs();
    }

    public sealed class GetPublicIpv4PoolsInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("filters")]
        private InputList<Inputs.GetPublicIpv4PoolsFilterInputArgs>? _filters;

        /// <summary>
        /// Custom filter block as described below.
        /// </summary>
        public InputList<Inputs.GetPublicIpv4PoolsFilterInputArgs> Filters
        {
            get => _filters ?? (_filters = new InputList<Inputs.GetPublicIpv4PoolsFilterInputArgs>());
            set => _filters = value;
        }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Map of tags, each pair of which must exactly match a pair on the desired pools.
        /// 
        /// More complex filters can be expressed using one or more `filter` sub-blocks,
        /// which take the following arguments:
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public GetPublicIpv4PoolsInvokeArgs()
        {
        }
        public static new GetPublicIpv4PoolsInvokeArgs Empty => new GetPublicIpv4PoolsInvokeArgs();
    }


    [OutputType]
    public sealed class GetPublicIpv4PoolsResult
    {
        public readonly ImmutableArray<Outputs.GetPublicIpv4PoolsFilterResult> Filters;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// List of all the pool IDs found.
        /// </summary>
        public readonly ImmutableArray<string> PoolIds;
        public readonly ImmutableDictionary<string, string> Tags;

        [OutputConstructor]
        private GetPublicIpv4PoolsResult(
            ImmutableArray<Outputs.GetPublicIpv4PoolsFilterResult> filters,

            string id,

            ImmutableArray<string> poolIds,

            ImmutableDictionary<string, string> tags)
        {
            Filters = filters;
            Id = id;
            PoolIds = poolIds;
            Tags = tags;
        }
    }
}

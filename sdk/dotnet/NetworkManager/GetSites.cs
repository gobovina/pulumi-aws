// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.NetworkManager
{
    public static class GetSites
    {
        /// <summary>
        /// Retrieve information about sites.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using Aws = Pulumi.Aws;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var example = Output.Create(Aws.NetworkManager.GetSites.InvokeAsync(new Aws.NetworkManager.GetSitesArgs
        ///         {
        ///             GlobalNetworkId = @var.Global_network_id,
        ///             Tags = 
        ///             {
        ///                 { "Env", "test" },
        ///             },
        ///         }));
        ///     }
        /// 
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetSitesResult> InvokeAsync(GetSitesArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetSitesResult>("aws:networkmanager/getSites:getSites", args ?? new GetSitesArgs(), options.WithDefaults());

        /// <summary>
        /// Retrieve information about sites.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using Aws = Pulumi.Aws;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var example = Output.Create(Aws.NetworkManager.GetSites.InvokeAsync(new Aws.NetworkManager.GetSitesArgs
        ///         {
        ///             GlobalNetworkId = @var.Global_network_id,
        ///             Tags = 
        ///             {
        ///                 { "Env", "test" },
        ///             },
        ///         }));
        ///     }
        /// 
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetSitesResult> Invoke(GetSitesInvokeArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetSitesResult>("aws:networkmanager/getSites:getSites", args ?? new GetSitesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetSitesArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// The ID of the Global Network of the sites to retrieve.
        /// </summary>
        [Input("globalNetworkId", required: true)]
        public string GlobalNetworkId { get; set; } = null!;

        [Input("tags")]
        private Dictionary<string, string>? _tags;

        /// <summary>
        /// Restricts the list to the sites with these tags.
        /// </summary>
        public Dictionary<string, string> Tags
        {
            get => _tags ?? (_tags = new Dictionary<string, string>());
            set => _tags = value;
        }

        public GetSitesArgs()
        {
        }
    }

    public sealed class GetSitesInvokeArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// The ID of the Global Network of the sites to retrieve.
        /// </summary>
        [Input("globalNetworkId", required: true)]
        public Input<string> GlobalNetworkId { get; set; } = null!;

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Restricts the list to the sites with these tags.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public GetSitesInvokeArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetSitesResult
    {
        public readonly string GlobalNetworkId;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The IDs of the sites.
        /// </summary>
        public readonly ImmutableArray<string> Ids;
        public readonly ImmutableDictionary<string, string>? Tags;

        [OutputConstructor]
        private GetSitesResult(
            string globalNetworkId,

            string id,

            ImmutableArray<string> ids,

            ImmutableDictionary<string, string>? tags)
        {
            GlobalNetworkId = globalNetworkId;
            Id = id;
            Ids = ids;
            Tags = tags;
        }
    }
}

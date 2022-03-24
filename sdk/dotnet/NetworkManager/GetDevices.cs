// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.NetworkManager
{
    public static class GetDevices
    {
        /// <summary>
        /// Retrieve information about devices.
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
        ///         var example = Output.Create(Aws.NetworkManager.GetDevices.InvokeAsync(new Aws.NetworkManager.GetDevicesArgs
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
        public static Task<GetDevicesResult> InvokeAsync(GetDevicesArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetDevicesResult>("aws:networkmanager/getDevices:getDevices", args ?? new GetDevicesArgs(), options.WithDefaults());

        /// <summary>
        /// Retrieve information about devices.
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
        ///         var example = Output.Create(Aws.NetworkManager.GetDevices.InvokeAsync(new Aws.NetworkManager.GetDevicesArgs
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
        public static Output<GetDevicesResult> Invoke(GetDevicesInvokeArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetDevicesResult>("aws:networkmanager/getDevices:getDevices", args ?? new GetDevicesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetDevicesArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// The ID of the Global Network of the devices to retrieve.
        /// </summary>
        [Input("globalNetworkId", required: true)]
        public string GlobalNetworkId { get; set; } = null!;

        /// <summary>
        /// The ID of the site of the devices to retrieve.
        /// </summary>
        [Input("siteId")]
        public string? SiteId { get; set; }

        [Input("tags")]
        private Dictionary<string, string>? _tags;

        /// <summary>
        /// Restricts the list to the devices with these tags.
        /// </summary>
        public Dictionary<string, string> Tags
        {
            get => _tags ?? (_tags = new Dictionary<string, string>());
            set => _tags = value;
        }

        public GetDevicesArgs()
        {
        }
    }

    public sealed class GetDevicesInvokeArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// The ID of the Global Network of the devices to retrieve.
        /// </summary>
        [Input("globalNetworkId", required: true)]
        public Input<string> GlobalNetworkId { get; set; } = null!;

        /// <summary>
        /// The ID of the site of the devices to retrieve.
        /// </summary>
        [Input("siteId")]
        public Input<string>? SiteId { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Restricts the list to the devices with these tags.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public GetDevicesInvokeArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetDevicesResult
    {
        public readonly string GlobalNetworkId;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The IDs of the devices.
        /// </summary>
        public readonly ImmutableArray<string> Ids;
        public readonly string? SiteId;
        public readonly ImmutableDictionary<string, string>? Tags;

        [OutputConstructor]
        private GetDevicesResult(
            string globalNetworkId,

            string id,

            ImmutableArray<string> ids,

            string? siteId,

            ImmutableDictionary<string, string>? tags)
        {
            GlobalNetworkId = globalNetworkId;
            Id = id;
            Ids = ids;
            SiteId = siteId;
            Tags = tags;
        }
    }
}

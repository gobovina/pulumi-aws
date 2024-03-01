// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.DirectConnect
{
    public static class GetRouterConfiguration
    {
        /// <summary>
        /// Data source for retrieving Router Configuration instructions for a given AWS Direct Connect Virtual Interface and Router Type.
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
        ///     var example = Aws.DirectConnect.GetRouterConfiguration.Invoke(new()
        ///     {
        ///         VirtualInterfaceId = "dxvif-abcde123",
        ///         RouterTypeIdentifier = "CiscoSystemsInc-2900SeriesRouters-IOS124",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetRouterConfigurationResult> InvokeAsync(GetRouterConfigurationArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetRouterConfigurationResult>("aws:directconnect/getRouterConfiguration:getRouterConfiguration", args ?? new GetRouterConfigurationArgs(), options.WithDefaults());

        /// <summary>
        /// Data source for retrieving Router Configuration instructions for a given AWS Direct Connect Virtual Interface and Router Type.
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
        ///     var example = Aws.DirectConnect.GetRouterConfiguration.Invoke(new()
        ///     {
        ///         VirtualInterfaceId = "dxvif-abcde123",
        ///         RouterTypeIdentifier = "CiscoSystemsInc-2900SeriesRouters-IOS124",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetRouterConfigurationResult> Invoke(GetRouterConfigurationInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetRouterConfigurationResult>("aws:directconnect/getRouterConfiguration:getRouterConfiguration", args ?? new GetRouterConfigurationInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetRouterConfigurationArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// ID of the Router Type. For example: `CiscoSystemsInc-2900SeriesRouters-IOS124`
        /// 
        /// There is currently no AWS API to retrieve the full list of `router_type_identifier` values. Here is a list of known `RouterType` objects that can be used:
        /// </summary>
        [Input("routerTypeIdentifier", required: true)]
        public string RouterTypeIdentifier { get; set; } = null!;

        /// <summary>
        /// ID of the Direct Connect Virtual Interface
        /// </summary>
        [Input("virtualInterfaceId", required: true)]
        public string VirtualInterfaceId { get; set; } = null!;

        public GetRouterConfigurationArgs()
        {
        }
        public static new GetRouterConfigurationArgs Empty => new GetRouterConfigurationArgs();
    }

    public sealed class GetRouterConfigurationInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// ID of the Router Type. For example: `CiscoSystemsInc-2900SeriesRouters-IOS124`
        /// 
        /// There is currently no AWS API to retrieve the full list of `router_type_identifier` values. Here is a list of known `RouterType` objects that can be used:
        /// </summary>
        [Input("routerTypeIdentifier", required: true)]
        public Input<string> RouterTypeIdentifier { get; set; } = null!;

        /// <summary>
        /// ID of the Direct Connect Virtual Interface
        /// </summary>
        [Input("virtualInterfaceId", required: true)]
        public Input<string> VirtualInterfaceId { get; set; } = null!;

        public GetRouterConfigurationInvokeArgs()
        {
        }
        public static new GetRouterConfigurationInvokeArgs Empty => new GetRouterConfigurationInvokeArgs();
    }


    [OutputType]
    public sealed class GetRouterConfigurationResult
    {
        /// <summary>
        /// Instructions for configuring your router
        /// </summary>
        public readonly string CustomerRouterConfig;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Router type identifier
        /// </summary>
        public readonly string RouterTypeIdentifier;
        /// <summary>
        /// Block of the router type details
        /// </summary>
        public readonly ImmutableArray<Outputs.GetRouterConfigurationRouterResult> Routers;
        public readonly string VirtualInterfaceId;
        public readonly string VirtualInterfaceName;

        [OutputConstructor]
        private GetRouterConfigurationResult(
            string customerRouterConfig,

            string id,

            string routerTypeIdentifier,

            ImmutableArray<Outputs.GetRouterConfigurationRouterResult> routers,

            string virtualInterfaceId,

            string virtualInterfaceName)
        {
            CustomerRouterConfig = customerRouterConfig;
            Id = id;
            RouterTypeIdentifier = routerTypeIdentifier;
            Routers = routers;
            VirtualInterfaceId = virtualInterfaceId;
            VirtualInterfaceName = virtualInterfaceName;
        }
    }
}

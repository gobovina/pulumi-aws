// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.AppMesh.Inputs
{

    public sealed class GatewayRouteSpecHttp2RouteActionTargetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The port number that corresponds to the target for Virtual Service provider port. This is required when the provider (router or node) of the Virtual Service has multiple listeners.
        /// </summary>
        [Input("port")]
        public Input<int>? Port { get; set; }

        /// <summary>
        /// Virtual service gateway route target.
        /// </summary>
        [Input("virtualService", required: true)]
        public Input<Inputs.GatewayRouteSpecHttp2RouteActionTargetVirtualServiceArgs> VirtualService { get; set; } = null!;

        public GatewayRouteSpecHttp2RouteActionTargetArgs()
        {
        }
        public static new GatewayRouteSpecHttp2RouteActionTargetArgs Empty => new GatewayRouteSpecHttp2RouteActionTargetArgs();
    }
}

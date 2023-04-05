// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.AppMesh.Inputs
{

    public sealed class GatewayRouteSpecHttp2RouteMatchQueryParameterMatchArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Header value sent by the client must match the specified value exactly.
        /// </summary>
        [Input("exact")]
        public Input<string>? Exact { get; set; }

        public GatewayRouteSpecHttp2RouteMatchQueryParameterMatchArgs()
        {
        }
        public static new GatewayRouteSpecHttp2RouteMatchQueryParameterMatchArgs Empty => new GatewayRouteSpecHttp2RouteMatchQueryParameterMatchArgs();
    }
}

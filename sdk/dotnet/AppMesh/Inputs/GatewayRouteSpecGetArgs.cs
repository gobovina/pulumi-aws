// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.AppMesh.Inputs
{

    public sealed class GatewayRouteSpecGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specification of a gRPC gateway route.
        /// </summary>
        [Input("grpcRoute")]
        public Input<Inputs.GatewayRouteSpecGrpcRouteGetArgs>? GrpcRoute { get; set; }

        /// <summary>
        /// Specification of an HTTP/2 gateway route.
        /// </summary>
        [Input("http2Route")]
        public Input<Inputs.GatewayRouteSpecHttp2RouteGetArgs>? Http2Route { get; set; }

        /// <summary>
        /// Specification of an HTTP gateway route.
        /// </summary>
        [Input("httpRoute")]
        public Input<Inputs.GatewayRouteSpecHttpRouteGetArgs>? HttpRoute { get; set; }

        /// <summary>
        /// Priority for the gateway route, between `0` and `1000`.
        /// </summary>
        [Input("priority")]
        public Input<int>? Priority { get; set; }

        public GatewayRouteSpecGetArgs()
        {
        }
        public static new GatewayRouteSpecGetArgs Empty => new GatewayRouteSpecGetArgs();
    }
}

// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.AppMesh.Inputs
{

    public sealed class GatewayRouteSpecHttpRouteMatchPathArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The exact path to match on.
        /// </summary>
        [Input("exact")]
        public Input<string>? Exact { get; set; }

        /// <summary>
        /// The regex used to match the path.
        /// </summary>
        [Input("regex")]
        public Input<string>? Regex { get; set; }

        public GatewayRouteSpecHttpRouteMatchPathArgs()
        {
        }
        public static new GatewayRouteSpecHttpRouteMatchPathArgs Empty => new GatewayRouteSpecHttpRouteMatchPathArgs();
    }
}

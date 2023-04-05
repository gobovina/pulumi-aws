// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.AppMesh.Outputs
{

    [OutputType]
    public sealed class GatewayRouteSpecHttpRouteMatchHeader
    {
        /// <summary>
        /// If `true`, the match is on the opposite of the `match` method and value. Default is `false`.
        /// </summary>
        public readonly bool? Invert;
        /// <summary>
        /// Method and value to match the header value sent with a request. Specify one match method.
        /// </summary>
        public readonly Outputs.GatewayRouteSpecHttpRouteMatchHeaderMatch? Match;
        /// <summary>
        /// Name for the HTTP header in the client request that will be matched on.
        /// </summary>
        public readonly string Name;

        [OutputConstructor]
        private GatewayRouteSpecHttpRouteMatchHeader(
            bool? invert,

            Outputs.GatewayRouteSpecHttpRouteMatchHeaderMatch? match,

            string name)
        {
            Invert = invert;
            Match = match;
            Name = name;
        }
    }
}

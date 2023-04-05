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
    public sealed class GatewayRouteSpecHttpRouteMatchQueryParameter
    {
        /// <summary>
        /// The query parameter to match on.
        /// </summary>
        public readonly Outputs.GatewayRouteSpecHttpRouteMatchQueryParameterMatch? Match;
        /// <summary>
        /// Name for the query parameter that will be matched on.
        /// </summary>
        public readonly string Name;

        [OutputConstructor]
        private GatewayRouteSpecHttpRouteMatchQueryParameter(
            Outputs.GatewayRouteSpecHttpRouteMatchQueryParameterMatch? match,

            string name)
        {
            Match = match;
            Name = name;
        }
    }
}

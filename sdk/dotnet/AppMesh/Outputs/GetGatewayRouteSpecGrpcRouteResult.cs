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
    public sealed class GetGatewayRouteSpecGrpcRouteResult
    {
        public readonly ImmutableArray<Outputs.GetGatewayRouteSpecGrpcRouteActionResult> Actions;
        public readonly ImmutableArray<Outputs.GetGatewayRouteSpecGrpcRouteMatchResult> Matches;

        [OutputConstructor]
        private GetGatewayRouteSpecGrpcRouteResult(
            ImmutableArray<Outputs.GetGatewayRouteSpecGrpcRouteActionResult> actions,

            ImmutableArray<Outputs.GetGatewayRouteSpecGrpcRouteMatchResult> matches)
        {
            Actions = actions;
            Matches = matches;
        }
    }
}

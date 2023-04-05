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
    public sealed class GetGatewayRouteSpecHttp2RouteMatchHeaderMatchResult
    {
        public readonly string Exact;
        public readonly string Prefix;
        public readonly ImmutableArray<Outputs.GetGatewayRouteSpecHttp2RouteMatchHeaderMatchRangeResult> Ranges;
        public readonly string Regex;
        public readonly string Suffix;

        [OutputConstructor]
        private GetGatewayRouteSpecHttp2RouteMatchHeaderMatchResult(
            string exact,

            string prefix,

            ImmutableArray<Outputs.GetGatewayRouteSpecHttp2RouteMatchHeaderMatchRangeResult> ranges,

            string regex,

            string suffix)
        {
            Exact = exact;
            Prefix = prefix;
            Ranges = ranges;
            Regex = regex;
            Suffix = suffix;
        }
    }
}

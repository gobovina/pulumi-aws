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
    public sealed class RouteSpecHttp2RouteMatchPath
    {
        /// <summary>
        /// Value sent by the client must match the specified value exactly. Must be between 1 and 255 characters in length.
        /// </summary>
        public readonly string? Exact;
        /// <summary>
        /// Value sent by the client must include the specified characters. Must be between 1 and 255 characters in length.
        /// </summary>
        public readonly string? Regex;

        [OutputConstructor]
        private RouteSpecHttp2RouteMatchPath(
            string? exact,

            string? regex)
        {
            Exact = exact;
            Regex = regex;
        }
    }
}

// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.AppMesh.Inputs
{

    public sealed class RouteSpecHttp2RouteMatchQueryParameterMatchArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The exact path to match on.
        /// </summary>
        [Input("exact")]
        public Input<string>? Exact { get; set; }

        public RouteSpecHttp2RouteMatchQueryParameterMatchArgs()
        {
        }
        public static new RouteSpecHttp2RouteMatchQueryParameterMatchArgs Empty => new RouteSpecHttp2RouteMatchQueryParameterMatchArgs();
    }
}

// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.AppMesh.Inputs
{

    public sealed class RouteSpecHttpRouteMatchHeaderMatchArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The exact path to match on.
        /// </summary>
        [Input("exact")]
        public Input<string>? Exact { get; set; }

        /// <summary>
        /// Value sent by the client must begin with the specified characters. Must be between 1 and 255 characters in length.
        /// This parameter must always start with /, which by itself matches all requests to the virtual router service name.
        /// </summary>
        [Input("prefix")]
        public Input<string>? Prefix { get; set; }

        /// <summary>
        /// Object that specifies the range of numbers that the value sent by the client must be included in.
        /// </summary>
        [Input("range")]
        public Input<Inputs.RouteSpecHttpRouteMatchHeaderMatchRangeArgs>? Range { get; set; }

        /// <summary>
        /// The regex used to match the path.
        /// </summary>
        [Input("regex")]
        public Input<string>? Regex { get; set; }

        /// <summary>
        /// Value sent by the client must end with the specified characters. Must be between 1 and 255 characters in length.
        /// </summary>
        [Input("suffix")]
        public Input<string>? Suffix { get; set; }

        public RouteSpecHttpRouteMatchHeaderMatchArgs()
        {
        }
        public static new RouteSpecHttpRouteMatchHeaderMatchArgs Empty => new RouteSpecHttpRouteMatchHeaderMatchArgs();
    }
}

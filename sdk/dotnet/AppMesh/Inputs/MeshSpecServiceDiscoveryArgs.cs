// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.AppMesh.Inputs
{

    public sealed class MeshSpecServiceDiscoveryArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The IP version to use to control traffic within the mesh. Valid values are `IPv6_PREFERRED`, `IPv4_PREFERRED`, `IPv4_ONLY`, and `IPv6_ONLY`.
        /// </summary>
        [Input("ipPreference")]
        public Input<string>? IpPreference { get; set; }

        public MeshSpecServiceDiscoveryArgs()
        {
        }
        public static new MeshSpecServiceDiscoveryArgs Empty => new MeshSpecServiceDiscoveryArgs();
    }
}

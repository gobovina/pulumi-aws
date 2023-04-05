// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.AppMesh.Inputs
{

    public sealed class VirtualNodeSpecServiceDiscoveryDnsArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// DNS host name for your virtual node.
        /// </summary>
        [Input("hostname", required: true)]
        public Input<string> Hostname { get; set; } = null!;

        /// <summary>
        /// The preferred IP version that this virtual node uses. Valid values: `IPv6_PREFERRED`, `IPv4_PREFERRED`, `IPv4_ONLY`, `IPv6_ONLY`.
        /// </summary>
        [Input("ipPreference")]
        public Input<string>? IpPreference { get; set; }

        /// <summary>
        /// The DNS response type for the virtual node. Valid values: `LOADBALANCER`, `ENDPOINTS`.
        /// </summary>
        [Input("responseType")]
        public Input<string>? ResponseType { get; set; }

        public VirtualNodeSpecServiceDiscoveryDnsArgs()
        {
        }
        public static new VirtualNodeSpecServiceDiscoveryDnsArgs Empty => new VirtualNodeSpecServiceDiscoveryDnsArgs();
    }
}

// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Msk.Inputs
{

    public sealed class ClusterEncryptionInfoEncryptionInTransitArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Encryption setting for data in transit between clients and brokers. Valid values: `TLS`, `TLS_PLAINTEXT`, and `PLAINTEXT`. Default value is `TLS`.
        /// </summary>
        [Input("clientBroker")]
        public Input<string>? ClientBroker { get; set; }

        /// <summary>
        /// Whether data communication among broker nodes is encrypted. Default value: `true`.
        /// </summary>
        [Input("inCluster")]
        public Input<bool>? InCluster { get; set; }

        public ClusterEncryptionInfoEncryptionInTransitArgs()
        {
        }
        public static new ClusterEncryptionInfoEncryptionInTransitArgs Empty => new ClusterEncryptionInfoEncryptionInTransitArgs();
    }
}

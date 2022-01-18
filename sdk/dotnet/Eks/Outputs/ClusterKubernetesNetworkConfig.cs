// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Eks.Outputs
{

    [OutputType]
    public sealed class ClusterKubernetesNetworkConfig
    {
        /// <summary>
        /// The IP family used to assign Kubernetes pod and service addresses. Valid values are `ipv4` (default) and `ipv6`. You can only specify an IP family when you create a cluster, changing this value will force a new cluster to be created.
        /// </summary>
        public readonly string? IpFamily;
        /// <summary>
        /// The CIDR block to assign Kubernetes service IP addresses from. If you don't specify a block, Kubernetes assigns addresses from either the 10.100.0.0/16 or 172.20.0.0/16 CIDR blocks. We recommend that you specify a block that does not overlap with resources in other networks that are peered or connected to your VPC. You can only specify a custom CIDR block when you create a cluster, changing this value will force a new cluster to be created. The block must meet the following requirements:
        /// </summary>
        public readonly string? ServiceIpv4Cidr;

        [OutputConstructor]
        private ClusterKubernetesNetworkConfig(
            string? ipFamily,

            string? serviceIpv4Cidr)
        {
            IpFamily = ipFamily;
            ServiceIpv4Cidr = serviceIpv4Cidr;
        }
    }
}

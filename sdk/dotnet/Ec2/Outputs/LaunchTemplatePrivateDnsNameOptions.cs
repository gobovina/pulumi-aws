// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Ec2.Outputs
{

    [OutputType]
    public sealed class LaunchTemplatePrivateDnsNameOptions
    {
        /// <summary>
        /// Indicates whether to respond to DNS queries for instance hostnames with DNS A records.
        /// </summary>
        public readonly bool? EnableResourceNameDnsARecord;
        /// <summary>
        /// Indicates whether to respond to DNS queries for instance hostnames with DNS AAAA records.
        /// </summary>
        public readonly bool? EnableResourceNameDnsAaaaRecord;
        /// <summary>
        /// The type of hostname for Amazon EC2 instances. For IPv4 only subnets, an instance DNS name must be based on the instance IPv4 address. For IPv6 native subnets, an instance DNS name must be based on the instance ID. For dual-stack subnets, you can specify whether DNS names use the instance IPv4 address or the instance ID. Valid values: `ip-name` and `resource-name`.
        /// </summary>
        public readonly string? HostnameType;

        [OutputConstructor]
        private LaunchTemplatePrivateDnsNameOptions(
            bool? enableResourceNameDnsARecord,

            bool? enableResourceNameDnsAaaaRecord,

            string? hostnameType)
        {
            EnableResourceNameDnsARecord = enableResourceNameDnsARecord;
            EnableResourceNameDnsAaaaRecord = enableResourceNameDnsAaaaRecord;
            HostnameType = hostnameType;
        }
    }
}

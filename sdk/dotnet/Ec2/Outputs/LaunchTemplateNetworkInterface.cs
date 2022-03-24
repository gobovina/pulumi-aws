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
    public sealed class LaunchTemplateNetworkInterface
    {
        /// <summary>
        /// Associate a Carrier IP address with `eth0` for a new network interface. Use this option when you launch an instance in a Wavelength Zone and want to associate a Carrier IP address with the network interface. Boolean value.
        /// </summary>
        public readonly string? AssociateCarrierIpAddress;
        /// <summary>
        /// Associate a public ip address with the network interface.  Boolean value.
        /// </summary>
        public readonly string? AssociatePublicIpAddress;
        /// <summary>
        /// Whether the network interface should be destroyed on instance termination. Defaults to `false` if not set.
        /// </summary>
        public readonly string? DeleteOnTermination;
        /// <summary>
        /// Description of the network interface.
        /// </summary>
        public readonly string? Description;
        /// <summary>
        /// The integer index of the network interface attachment.
        /// </summary>
        public readonly int? DeviceIndex;
        /// <summary>
        /// The type of network interface. To create an Elastic Fabric Adapter (EFA), specify `efa`.
        /// </summary>
        public readonly string? InterfaceType;
        /// <summary>
        /// The number of secondary private IPv4 addresses to assign to a network interface. Conflicts with `ipv4_addresses`
        /// </summary>
        public readonly int? Ipv4AddressCount;
        /// <summary>
        /// One or more private IPv4 addresses to associate. Conflicts with `ipv4_address_count`
        /// </summary>
        public readonly ImmutableArray<string> Ipv4Addresses;
        /// <summary>
        /// The number of IPv4 prefixes to be automatically assigned to the network interface. Conflicts with `ipv4_prefixes`
        /// </summary>
        public readonly int? Ipv4PrefixCount;
        /// <summary>
        /// One or more IPv4 prefixes to be assigned to the network interface. Conflicts with `ipv4_prefix_count`
        /// </summary>
        public readonly ImmutableArray<string> Ipv4Prefixes;
        /// <summary>
        /// The number of IPv6 addresses to assign to a network interface. Conflicts with `ipv6_addresses`
        /// </summary>
        public readonly int? Ipv6AddressCount;
        /// <summary>
        /// One or more specific IPv6 addresses from the IPv6 CIDR block range of your subnet. Conflicts with `ipv6_address_count`
        /// </summary>
        public readonly ImmutableArray<string> Ipv6Addresses;
        /// <summary>
        /// The number of IPv6 prefixes to be automatically assigned to the network interface. Conflicts with `ipv6_prefixes`
        /// </summary>
        public readonly int? Ipv6PrefixCount;
        /// <summary>
        /// One or more IPv6 prefixes to be assigned to the network interface. Conflicts with `ipv6_prefix_count`
        /// </summary>
        public readonly ImmutableArray<string> Ipv6Prefixes;
        /// <summary>
        /// The index of the network card. Some instance types support multiple network cards. The primary network interface must be assigned to network card index 0. The default is network card index 0.
        /// </summary>
        public readonly int? NetworkCardIndex;
        /// <summary>
        /// The ID of the network interface to attach.
        /// </summary>
        public readonly string? NetworkInterfaceId;
        /// <summary>
        /// The primary private IPv4 address.
        /// </summary>
        public readonly string? PrivateIpAddress;
        /// <summary>
        /// A list of security group IDs to associate.
        /// </summary>
        public readonly ImmutableArray<string> SecurityGroups;
        /// <summary>
        /// The VPC Subnet ID to associate.
        /// </summary>
        public readonly string? SubnetId;

        [OutputConstructor]
        private LaunchTemplateNetworkInterface(
            string? associateCarrierIpAddress,

            string? associatePublicIpAddress,

            string? deleteOnTermination,

            string? description,

            int? deviceIndex,

            string? interfaceType,

            int? ipv4AddressCount,

            ImmutableArray<string> ipv4Addresses,

            int? ipv4PrefixCount,

            ImmutableArray<string> ipv4Prefixes,

            int? ipv6AddressCount,

            ImmutableArray<string> ipv6Addresses,

            int? ipv6PrefixCount,

            ImmutableArray<string> ipv6Prefixes,

            int? networkCardIndex,

            string? networkInterfaceId,

            string? privateIpAddress,

            ImmutableArray<string> securityGroups,

            string? subnetId)
        {
            AssociateCarrierIpAddress = associateCarrierIpAddress;
            AssociatePublicIpAddress = associatePublicIpAddress;
            DeleteOnTermination = deleteOnTermination;
            Description = description;
            DeviceIndex = deviceIndex;
            InterfaceType = interfaceType;
            Ipv4AddressCount = ipv4AddressCount;
            Ipv4Addresses = ipv4Addresses;
            Ipv4PrefixCount = ipv4PrefixCount;
            Ipv4Prefixes = ipv4Prefixes;
            Ipv6AddressCount = ipv6AddressCount;
            Ipv6Addresses = ipv6Addresses;
            Ipv6PrefixCount = ipv6PrefixCount;
            Ipv6Prefixes = ipv6Prefixes;
            NetworkCardIndex = networkCardIndex;
            NetworkInterfaceId = networkInterfaceId;
            PrivateIpAddress = privateIpAddress;
            SecurityGroups = securityGroups;
            SubnetId = subnetId;
        }
    }
}

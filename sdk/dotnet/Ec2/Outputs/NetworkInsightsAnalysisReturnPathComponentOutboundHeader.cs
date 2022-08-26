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
    public sealed class NetworkInsightsAnalysisReturnPathComponentOutboundHeader
    {
        public readonly ImmutableArray<string> DestinationAddresses;
        public readonly ImmutableArray<Outputs.NetworkInsightsAnalysisReturnPathComponentOutboundHeaderDestinationPortRange> DestinationPortRanges;
        public readonly string? Protocol;
        public readonly ImmutableArray<string> SourceAddresses;
        public readonly ImmutableArray<Outputs.NetworkInsightsAnalysisReturnPathComponentOutboundHeaderSourcePortRange> SourcePortRanges;

        [OutputConstructor]
        private NetworkInsightsAnalysisReturnPathComponentOutboundHeader(
            ImmutableArray<string> destinationAddresses,

            ImmutableArray<Outputs.NetworkInsightsAnalysisReturnPathComponentOutboundHeaderDestinationPortRange> destinationPortRanges,

            string? protocol,

            ImmutableArray<string> sourceAddresses,

            ImmutableArray<Outputs.NetworkInsightsAnalysisReturnPathComponentOutboundHeaderSourcePortRange> sourcePortRanges)
        {
            DestinationAddresses = destinationAddresses;
            DestinationPortRanges = destinationPortRanges;
            Protocol = protocol;
            SourceAddresses = sourceAddresses;
            SourcePortRanges = sourcePortRanges;
        }
    }
}

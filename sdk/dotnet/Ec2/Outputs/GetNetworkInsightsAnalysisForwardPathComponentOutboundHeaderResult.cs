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
    public sealed class GetNetworkInsightsAnalysisForwardPathComponentOutboundHeaderResult
    {
        public readonly ImmutableArray<string> DestinationAddresses;
        public readonly ImmutableArray<Outputs.GetNetworkInsightsAnalysisForwardPathComponentOutboundHeaderDestinationPortRangeResult> DestinationPortRanges;
        public readonly string Protocol;
        public readonly ImmutableArray<string> SourceAddresses;
        public readonly ImmutableArray<Outputs.GetNetworkInsightsAnalysisForwardPathComponentOutboundHeaderSourcePortRangeResult> SourcePortRanges;

        [OutputConstructor]
        private GetNetworkInsightsAnalysisForwardPathComponentOutboundHeaderResult(
            ImmutableArray<string> destinationAddresses,

            ImmutableArray<Outputs.GetNetworkInsightsAnalysisForwardPathComponentOutboundHeaderDestinationPortRangeResult> destinationPortRanges,

            string protocol,

            ImmutableArray<string> sourceAddresses,

            ImmutableArray<Outputs.GetNetworkInsightsAnalysisForwardPathComponentOutboundHeaderSourcePortRangeResult> sourcePortRanges)
        {
            DestinationAddresses = destinationAddresses;
            DestinationPortRanges = destinationPortRanges;
            Protocol = protocol;
            SourceAddresses = sourceAddresses;
            SourcePortRanges = sourcePortRanges;
        }
    }
}

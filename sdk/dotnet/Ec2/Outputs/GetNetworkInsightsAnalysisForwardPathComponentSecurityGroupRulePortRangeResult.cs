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
    public sealed class GetNetworkInsightsAnalysisForwardPathComponentSecurityGroupRulePortRangeResult
    {
        public readonly int From;
        public readonly int To;

        [OutputConstructor]
        private GetNetworkInsightsAnalysisForwardPathComponentSecurityGroupRulePortRangeResult(
            int from,

            int to)
        {
            From = from;
            To = to;
        }
    }
}

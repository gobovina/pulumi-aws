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
    public sealed class GetNetworkInsightsAnalysisReturnPathComponentSubnetResult
    {
        /// <summary>
        /// ARN of the selected Network Insights Analysis.
        /// </summary>
        public readonly string Arn;
        public readonly string Id;
        /// <summary>
        /// Name of the filter field. Valid values can be found in the EC2 [`DescribeNetworkInsightsAnalyses`](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeNetworkInsightsAnalyses.html) API Reference.
        /// </summary>
        public readonly string Name;

        [OutputConstructor]
        private GetNetworkInsightsAnalysisReturnPathComponentSubnetResult(
            string arn,

            string id,

            string name)
        {
            Arn = arn;
            Id = id;
            Name = name;
        }
    }
}

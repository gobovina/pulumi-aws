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
    public sealed class NetworkInsightsAnalysisReturnPathComponentAttachedTo
    {
        /// <summary>
        /// ARN of the Network Insights Analysis.
        /// </summary>
        public readonly string? Arn;
        /// <summary>
        /// ID of the Network Insights Analysis.
        /// </summary>
        public readonly string? Id;
        public readonly string? Name;

        [OutputConstructor]
        private NetworkInsightsAnalysisReturnPathComponentAttachedTo(
            string? arn,

            string? id,

            string? name)
        {
            Arn = arn;
            Id = id;
            Name = name;
        }
    }
}

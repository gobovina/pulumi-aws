// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Ec2.Inputs
{

    public sealed class NetworkInsightsAnalysisExplanationSecurityGroupArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// ARN of the Network Insights Analysis.
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        /// <summary>
        /// ID of the Network Insights Analysis.
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        [Input("name")]
        public Input<string>? Name { get; set; }

        public NetworkInsightsAnalysisExplanationSecurityGroupArgs()
        {
        }
        public static new NetworkInsightsAnalysisExplanationSecurityGroupArgs Empty => new NetworkInsightsAnalysisExplanationSecurityGroupArgs();
    }
}

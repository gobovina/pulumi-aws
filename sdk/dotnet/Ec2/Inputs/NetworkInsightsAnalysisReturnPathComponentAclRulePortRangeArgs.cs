// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Ec2.Inputs
{

    public sealed class NetworkInsightsAnalysisReturnPathComponentAclRulePortRangeArgs : global::Pulumi.ResourceArgs
    {
        [Input("from")]
        public Input<int>? From { get; set; }

        [Input("to")]
        public Input<int>? To { get; set; }

        public NetworkInsightsAnalysisReturnPathComponentAclRulePortRangeArgs()
        {
        }
        public static new NetworkInsightsAnalysisReturnPathComponentAclRulePortRangeArgs Empty => new NetworkInsightsAnalysisReturnPathComponentAclRulePortRangeArgs();
    }
}

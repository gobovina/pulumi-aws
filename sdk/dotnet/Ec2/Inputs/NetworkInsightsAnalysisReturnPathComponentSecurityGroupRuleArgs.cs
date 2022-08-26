// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Ec2.Inputs
{

    public sealed class NetworkInsightsAnalysisReturnPathComponentSecurityGroupRuleArgs : global::Pulumi.ResourceArgs
    {
        [Input("cidr")]
        public Input<string>? Cidr { get; set; }

        [Input("direction")]
        public Input<string>? Direction { get; set; }

        [Input("portRanges")]
        private InputList<Inputs.NetworkInsightsAnalysisReturnPathComponentSecurityGroupRulePortRangeArgs>? _portRanges;
        public InputList<Inputs.NetworkInsightsAnalysisReturnPathComponentSecurityGroupRulePortRangeArgs> PortRanges
        {
            get => _portRanges ?? (_portRanges = new InputList<Inputs.NetworkInsightsAnalysisReturnPathComponentSecurityGroupRulePortRangeArgs>());
            set => _portRanges = value;
        }

        [Input("prefixListId")]
        public Input<string>? PrefixListId { get; set; }

        [Input("protocol")]
        public Input<string>? Protocol { get; set; }

        [Input("securityGroupId")]
        public Input<string>? SecurityGroupId { get; set; }

        public NetworkInsightsAnalysisReturnPathComponentSecurityGroupRuleArgs()
        {
        }
        public static new NetworkInsightsAnalysisReturnPathComponentSecurityGroupRuleArgs Empty => new NetworkInsightsAnalysisReturnPathComponentSecurityGroupRuleArgs();
    }
}

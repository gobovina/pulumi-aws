// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Ec2.Inputs
{

    public sealed class NetworkInsightsAnalysisExplanationClassicLoadBalancerListenerArgs : global::Pulumi.ResourceArgs
    {
        [Input("instancePort")]
        public Input<int>? InstancePort { get; set; }

        [Input("loadBalancerPort")]
        public Input<int>? LoadBalancerPort { get; set; }

        public NetworkInsightsAnalysisExplanationClassicLoadBalancerListenerArgs()
        {
        }
        public static new NetworkInsightsAnalysisExplanationClassicLoadBalancerListenerArgs Empty => new NetworkInsightsAnalysisExplanationClassicLoadBalancerListenerArgs();
    }
}

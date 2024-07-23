// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Cognito.Inputs
{

    public sealed class RiskConfigurationAccountTakeoverRiskConfigurationActionsLowActionGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("eventAction", required: true)]
        public Input<string> EventAction { get; set; } = null!;

        /// <summary>
        /// Whether to send a notification.
        /// </summary>
        [Input("notify", required: true)]
        public Input<bool> Notify { get; set; } = null!;

        public RiskConfigurationAccountTakeoverRiskConfigurationActionsLowActionGetArgs()
        {
        }
        public static new RiskConfigurationAccountTakeoverRiskConfigurationActionsLowActionGetArgs Empty => new RiskConfigurationAccountTakeoverRiskConfigurationActionsLowActionGetArgs();
    }
}

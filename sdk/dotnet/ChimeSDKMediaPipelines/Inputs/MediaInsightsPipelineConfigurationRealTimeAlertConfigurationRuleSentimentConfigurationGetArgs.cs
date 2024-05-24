// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.ChimeSDKMediaPipelines.Inputs
{

    public sealed class MediaInsightsPipelineConfigurationRealTimeAlertConfigurationRuleSentimentConfigurationGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Rule name.
        /// </summary>
        [Input("ruleName", required: true)]
        public Input<string> RuleName { get; set; } = null!;

        /// <summary>
        /// Sentiment type to match.
        /// </summary>
        [Input("sentimentType", required: true)]
        public Input<string> SentimentType { get; set; } = null!;

        /// <summary>
        /// Analysis interval.
        /// </summary>
        [Input("timePeriod", required: true)]
        public Input<int> TimePeriod { get; set; } = null!;

        public MediaInsightsPipelineConfigurationRealTimeAlertConfigurationRuleSentimentConfigurationGetArgs()
        {
        }
        public static new MediaInsightsPipelineConfigurationRealTimeAlertConfigurationRuleSentimentConfigurationGetArgs Empty => new MediaInsightsPipelineConfigurationRealTimeAlertConfigurationRuleSentimentConfigurationGetArgs();
    }
}

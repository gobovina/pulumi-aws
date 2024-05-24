// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.ChimeSDKMediaPipelines.Outputs
{

    [OutputType]
    public sealed class MediaInsightsPipelineConfigurationRealTimeAlertConfigurationRuleKeywordMatchConfiguration
    {
        /// <summary>
        /// Collection of keywords to match.
        /// </summary>
        public readonly ImmutableArray<string> Keywords;
        /// <summary>
        /// Negate the rule.
        /// </summary>
        public readonly bool? Negate;
        /// <summary>
        /// Rule name.
        /// </summary>
        public readonly string RuleName;

        [OutputConstructor]
        private MediaInsightsPipelineConfigurationRealTimeAlertConfigurationRuleKeywordMatchConfiguration(
            ImmutableArray<string> keywords,

            bool? negate,

            string ruleName)
        {
            Keywords = keywords;
            Negate = negate;
            RuleName = ruleName;
        }
    }
}

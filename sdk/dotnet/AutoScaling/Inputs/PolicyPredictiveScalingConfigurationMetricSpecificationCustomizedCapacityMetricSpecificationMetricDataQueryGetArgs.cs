// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.AutoScaling.Inputs
{

    public sealed class PolicyPredictiveScalingConfigurationMetricSpecificationCustomizedCapacityMetricSpecificationMetricDataQueryGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The math expression used on the returned metric. You must specify either `expression` or `metric_stat`, but not both.
        /// </summary>
        [Input("expression")]
        public Input<string>? Expression { get; set; }

        /// <summary>
        /// A short name for the metric used in predictive scaling policy.
        /// </summary>
        [Input("id", required: true)]
        public Input<string> Id { get; set; } = null!;

        /// <summary>
        /// A human-readable label for this metric or expression.
        /// </summary>
        [Input("label")]
        public Input<string>? Label { get; set; }

        /// <summary>
        /// A structure that defines CloudWatch metric to be used in predictive scaling policy. You must specify either `expression` or `metric_stat`, but not both.
        /// </summary>
        [Input("metricStat")]
        public Input<Inputs.PolicyPredictiveScalingConfigurationMetricSpecificationCustomizedCapacityMetricSpecificationMetricDataQueryMetricStatGetArgs>? MetricStat { get; set; }

        /// <summary>
        /// A boolean that indicates whether to return the timestamps and raw data values of this metric, the default it true
        /// </summary>
        [Input("returnData")]
        public Input<bool>? ReturnData { get; set; }

        public PolicyPredictiveScalingConfigurationMetricSpecificationCustomizedCapacityMetricSpecificationMetricDataQueryGetArgs()
        {
        }
    }
}

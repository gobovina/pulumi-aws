// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.AutoScaling.Outputs
{

    [OutputType]
    public sealed class PolicyPredictiveScalingConfigurationMetricSpecificationCustomizedScalingMetricSpecificationMetricDataQuery
    {
        /// <summary>
        /// The math expression used on the returned metric. You must specify either `expression` or `metric_stat`, but not both.
        /// </summary>
        public readonly string? Expression;
        /// <summary>
        /// A short name for the metric used in predictive scaling policy.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// A human-readable label for this metric or expression.
        /// </summary>
        public readonly string? Label;
        /// <summary>
        /// A structure that defines CloudWatch metric to be used in predictive scaling policy. You must specify either `expression` or `metric_stat`, but not both.
        /// </summary>
        public readonly Outputs.PolicyPredictiveScalingConfigurationMetricSpecificationCustomizedScalingMetricSpecificationMetricDataQueryMetricStat? MetricStat;
        /// <summary>
        /// A boolean that indicates whether to return the timestamps and raw data values of this metric, the default it true
        /// </summary>
        public readonly bool? ReturnData;

        [OutputConstructor]
        private PolicyPredictiveScalingConfigurationMetricSpecificationCustomizedScalingMetricSpecificationMetricDataQuery(
            string? expression,

            string id,

            string? label,

            Outputs.PolicyPredictiveScalingConfigurationMetricSpecificationCustomizedScalingMetricSpecificationMetricDataQueryMetricStat? metricStat,

            bool? returnData)
        {
            Expression = expression;
            Id = id;
            Label = label;
            MetricStat = metricStat;
            ReturnData = returnData;
        }
    }
}

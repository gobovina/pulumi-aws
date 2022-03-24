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
    public sealed class PolicyTargetTrackingConfigurationCustomizedMetricSpecification
    {
        /// <summary>
        /// The dimensions of the metric.
        /// </summary>
        public readonly ImmutableArray<Outputs.PolicyTargetTrackingConfigurationCustomizedMetricSpecificationMetricDimension> MetricDimensions;
        /// <summary>
        /// The name of the metric.
        /// </summary>
        public readonly string MetricName;
        /// <summary>
        /// The namespace of the metric.
        /// </summary>
        public readonly string Namespace;
        /// <summary>
        /// The statistic of the metric.
        /// </summary>
        public readonly string Statistic;
        /// <summary>
        /// The unit of the metrics to return.
        /// </summary>
        public readonly string? Unit;

        [OutputConstructor]
        private PolicyTargetTrackingConfigurationCustomizedMetricSpecification(
            ImmutableArray<Outputs.PolicyTargetTrackingConfigurationCustomizedMetricSpecificationMetricDimension> metricDimensions,

            string metricName,

            string @namespace,

            string statistic,

            string? unit)
        {
            MetricDimensions = metricDimensions;
            MetricName = metricName;
            Namespace = @namespace;
            Statistic = statistic;
            Unit = unit;
        }
    }
}

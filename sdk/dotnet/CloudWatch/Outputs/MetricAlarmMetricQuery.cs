// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.CloudWatch.Outputs
{

    [OutputType]
    public sealed class MetricAlarmMetricQuery
    {
        public readonly string? AccountId;
        /// <summary>
        /// The math expression to be performed on the returned data, if this object is performing a math expression. This expression can use the id of the other metrics to refer to those metrics, and can also use the id of other expressions to use the result of those expressions. For more information about metric math expressions, see Metric Math Syntax and Functions in the [Amazon CloudWatch User Guide](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/using-metric-math.html#metric-math-syntax).
        /// </summary>
        public readonly string? Expression;
        /// <summary>
        /// A short name used to tie this object to the results in the response. If you are performing math expressions on this set of data, this name represents that data and can serve as a variable in the mathematical expression. The valid characters are letters, numbers, and underscore. The first character must be a lowercase letter.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// A human-readable label for this metric or expression. This is especially useful if this is an expression, so that you know what the value represents.
        /// </summary>
        public readonly string? Label;
        /// <summary>
        /// The metric to be returned, along with statistics, period, and units. Use this parameter only if this object is retrieving a metric and not performing a math expression on returned data.
        /// </summary>
        public readonly Outputs.MetricAlarmMetricQueryMetric? Metric;
        /// <summary>
        /// Specify exactly one `metric_query` to be `true` to use that `metric_query` result as the alarm.
        /// </summary>
        public readonly bool? ReturnData;

        [OutputConstructor]
        private MetricAlarmMetricQuery(
            string? accountId,

            string? expression,

            string id,

            string? label,

            Outputs.MetricAlarmMetricQueryMetric? metric,

            bool? returnData)
        {
            AccountId = accountId;
            Expression = expression;
            Id = id;
            Label = label;
            Metric = metric;
            ReturnData = returnData;
        }
    }
}

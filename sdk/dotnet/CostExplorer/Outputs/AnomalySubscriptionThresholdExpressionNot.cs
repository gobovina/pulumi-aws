// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.CostExplorer.Outputs
{

    [OutputType]
    public sealed class AnomalySubscriptionThresholdExpressionNot
    {
        /// <summary>
        /// Configuration block for the filter that's based on  values. See Cost Category below.
        /// </summary>
        public readonly Outputs.AnomalySubscriptionThresholdExpressionNotCostCategory? CostCategory;
        /// <summary>
        /// Configuration block for the specific Dimension to use for.
        /// </summary>
        public readonly Outputs.AnomalySubscriptionThresholdExpressionNotDimension? Dimension;
        /// <summary>
        /// A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        public readonly Outputs.AnomalySubscriptionThresholdExpressionNotTags? Tags;

        [OutputConstructor]
        private AnomalySubscriptionThresholdExpressionNot(
            Outputs.AnomalySubscriptionThresholdExpressionNotCostCategory? costCategory,

            Outputs.AnomalySubscriptionThresholdExpressionNotDimension? dimension,

            Outputs.AnomalySubscriptionThresholdExpressionNotTags? tags)
        {
            CostCategory = costCategory;
            Dimension = dimension;
            Tags = tags;
        }
    }
}

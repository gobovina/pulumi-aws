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
    public sealed class CostCategoryRuleRuleNotNot
    {
        /// <summary>
        /// Configuration block for the filter that's based on `CostCategory` values. See below.
        /// </summary>
        public readonly Outputs.CostCategoryRuleRuleNotNotCostCategory? CostCategory;
        /// <summary>
        /// Configuration block for the specific `Dimension` to use for `Expression`. See below.
        /// </summary>
        public readonly Outputs.CostCategoryRuleRuleNotNotDimension? Dimension;
        /// <summary>
        /// Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        public readonly Outputs.CostCategoryRuleRuleNotNotTags? Tags;

        [OutputConstructor]
        private CostCategoryRuleRuleNotNot(
            Outputs.CostCategoryRuleRuleNotNotCostCategory? costCategory,

            Outputs.CostCategoryRuleRuleNotNotDimension? dimension,

            Outputs.CostCategoryRuleRuleNotNotTags? tags)
        {
            CostCategory = costCategory;
            Dimension = dimension;
            Tags = tags;
        }
    }
}

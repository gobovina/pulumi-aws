// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.CostExplorer.Inputs
{

    public sealed class CostCategoryRuleRuleNotOrGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Configuration block for the filter that's based on `CostCategory` values. See below.
        /// </summary>
        [Input("costCategory")]
        public Input<Inputs.CostCategoryRuleRuleNotOrCostCategoryGetArgs>? CostCategory { get; set; }

        /// <summary>
        /// Configuration block for the specific `Dimension` to use for `Expression`. See below.
        /// </summary>
        [Input("dimension")]
        public Input<Inputs.CostCategoryRuleRuleNotOrDimensionGetArgs>? Dimension { get; set; }

        /// <summary>
        /// Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        [Input("tags")]
        public Input<Inputs.CostCategoryRuleRuleNotOrTagsGetArgs>? Tags { get; set; }

        public CostCategoryRuleRuleNotOrGetArgs()
        {
        }
        public static new CostCategoryRuleRuleNotOrGetArgs Empty => new CostCategoryRuleRuleNotOrGetArgs();
    }
}

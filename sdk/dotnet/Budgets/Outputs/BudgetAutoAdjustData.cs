// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Budgets.Outputs
{

    [OutputType]
    public sealed class BudgetAutoAdjustData
    {
        /// <summary>
        /// (Required) - The string that defines whether your budget auto-adjusts based on historical or forecasted data. Valid values: `FORECAST`,`HISTORICAL`
        /// </summary>
        public readonly string AutoAdjustType;
        /// <summary>
        /// (Optional) - Configuration block of Historical Options. Required for `auto_adjust_type` of `HISTORICAL` Configuration block that defines the historical data that your auto-adjusting budget is based on.
        /// </summary>
        public readonly Outputs.BudgetAutoAdjustDataHistoricalOptions? HistoricalOptions;
        /// <summary>
        /// (Optional) - The last time that your budget was auto-adjusted.
        /// </summary>
        public readonly string? LastAutoAdjustTime;

        [OutputConstructor]
        private BudgetAutoAdjustData(
            string autoAdjustType,

            Outputs.BudgetAutoAdjustDataHistoricalOptions? historicalOptions,

            string? lastAutoAdjustTime)
        {
            AutoAdjustType = autoAdjustType;
            HistoricalOptions = historicalOptions;
            LastAutoAdjustTime = lastAutoAdjustTime;
        }
    }
}

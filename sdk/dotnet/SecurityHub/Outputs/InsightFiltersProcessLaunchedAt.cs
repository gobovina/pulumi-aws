// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.SecurityHub.Outputs
{

    [OutputType]
    public sealed class InsightFiltersProcessLaunchedAt
    {
        /// <summary>
        /// A configuration block of the date range for the date filter. See date_range below for more details.
        /// </summary>
        public readonly Outputs.InsightFiltersProcessLaunchedAtDateRange? DateRange;
        /// <summary>
        /// An end date for the date filter. Required with `start` if `date_range` is not specified.
        /// </summary>
        public readonly string? End;
        /// <summary>
        /// A start date for the date filter. Required with `end` if `date_range` is not specified.
        /// </summary>
        public readonly string? Start;

        [OutputConstructor]
        private InsightFiltersProcessLaunchedAt(
            Outputs.InsightFiltersProcessLaunchedAtDateRange? dateRange,

            string? end,

            string? start)
        {
            DateRange = dateRange;
            End = end;
            Start = start;
        }
    }
}

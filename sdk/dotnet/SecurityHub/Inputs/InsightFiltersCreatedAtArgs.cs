// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.SecurityHub.Inputs
{

    public sealed class InsightFiltersCreatedAtArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A configuration block of the date range for the date filter. See date_range below for more details.
        /// </summary>
        [Input("dateRange")]
        public Input<Inputs.InsightFiltersCreatedAtDateRangeArgs>? DateRange { get; set; }

        /// <summary>
        /// An end date for the date filter. Required with `start` if `date_range` is not specified.
        /// </summary>
        [Input("end")]
        public Input<string>? End { get; set; }

        /// <summary>
        /// A start date for the date filter. Required with `end` if `date_range` is not specified.
        /// </summary>
        [Input("start")]
        public Input<string>? Start { get; set; }

        public InsightFiltersCreatedAtArgs()
        {
        }
        public static new InsightFiltersCreatedAtArgs Empty => new InsightFiltersCreatedAtArgs();
    }
}
